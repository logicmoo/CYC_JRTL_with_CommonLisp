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
import com.cyc.tool.subl.util.SubLTranslatedFile.SubL;

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
//dm import com.cyc.cycjava_1.cycl.at_defns;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_cache;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class fort_types_interface extends SubLTranslatedFile {

  //// Constructor

  private fort_types_interface() {}
  public static final SubLFile me = new fort_types_interface();
  public static final String myName = "com.cyc.cycjava_1.cycl.fort_types_interface";

  //// Definitions

  /** Accessor.  @return booleanp; Whether the (#$isa FORT TYPE):MT relation cached? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 1141) 
  public static final SubLObject fort_has_typeP(SubLObject fort, SubLObject type, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        if ((NIL != forts.fort_p(fort))) {
          {
            SubLObject mt_var = mt;
            {
              SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
              SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
              SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
              SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
              SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
              SubLObject _prev_bind_5 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
              try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(NIL, thread);
                result = sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($const0$isa), fort, type, mt, UNPROVIDED);
              } finally {
                sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_5, thread);
                sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_4, thread);
                sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return result;
      }
    }
  }


  /** is TERM a quantifier? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 22076) 
  public static final SubLObject isa_quantifierP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(v_term))) {
      return quantifier_p(v_term);
    } else {
      return makeBoolean(((NIL != isa.isaP(v_term, $const42$Quantifier, mt, UNPROVIDED))
            || (NIL != at_defns.quiet_sufficient_defns_admitP($const42$Quantifier, v_term, mt))));
    }
  }

  
  @SubL(source = "cycl/fort-types-interface.lisp", position = 1850) 
  public static final SubLObject fort_has_type_in_any_mtP(SubLObject fort, SubLObject type) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym1$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const2$EverythingPSC, thread);
            result = fort_has_typeP(fort, type, UNPROVIDED);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** is FORT a collection in any mt? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 3081) 
  public static final SubLObject collection_in_any_mtP(SubLObject fort) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym1$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const2$EverythingPSC, thread);
            result = fort_has_typeP(fort, $const4$Collection, UNPROVIDED);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** is FORT a collection? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 3341) 
  public static final SubLObject collectionP(SubLObject fort) {
    return collection_in_any_mtP(fort);
  }

  /** is FORT a collection? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 3440) 
  public static final SubLObject collection_p(SubLObject fort) {
    return collection_in_any_mtP(fort);
  }

  public static final class $collection_p$UnaryFunction extends UnaryFunction {
    public $collection_p$UnaryFunction() { super(extractFunctionNamed("COLLECTION-P")); }
    public SubLObject processItem(SubLObject arg1) { return collection_p(arg1); }
  }

  /** is TERM a collection? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 3958) 
  public static final SubLObject isa_collectionP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(v_term))) {
      return collectionP(v_term);
    } else {
      return makeBoolean(((NIL != isa.isaP(v_term, $const4$Collection, mt, UNPROVIDED))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5373"))));
    }
  }

  /** is FORT a predicate in any mt? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 4493) 
  public static final SubLObject predicate_in_any_mtP(SubLObject fort) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym1$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const2$EverythingPSC, thread);
            result = fort_has_typeP(fort, $const6$Predicate, UNPROVIDED);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** is FORT a predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 4692) 
  public static final SubLObject predicateP(SubLObject fort) {
    return predicate_in_any_mtP(fort);
  }

  /** is FORT a predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 4788) 
  public static final SubLObject predicate_p(SubLObject fort) {
    return predicate_in_any_mtP(fort);
  }

  public static final class $predicate_p$UnaryFunction extends UnaryFunction {
    public $predicate_p$UnaryFunction() { super(extractFunctionNamed("PREDICATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return predicate_p(arg1); }
  }

  /** is TERM a predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 4977) 
  public static final SubLObject isa_predicateP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(v_term))) {
      return predicateP(v_term);
    } else {
      return makeBoolean(((NIL != isa.isaP(v_term, $const6$Predicate, mt, UNPROVIDED))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5375"))));
    }
  }

  /** Is FORT in the @xref *forts-typed-function-denotational* */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 5554) 
  public static final SubLObject function_in_any_mtP(SubLObject fort) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym1$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const2$EverythingPSC, thread);
            result = fort_has_typeP(fort, $const5$Function_Denotational, UNPROVIDED);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** is FORT a non-predicate function? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 5806) 
  public static final SubLObject functorP(SubLObject fort) {
    return non_predicate_functionP(fort);
  }

  /** is FORT a non-predicate function? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 6023) 
  public static final SubLObject non_predicate_functionP(SubLObject fort) {
    return function_in_any_mtP(fort);
  }

  /** is FORT a non-predicate function? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 6144) 
  public static final SubLObject functionP(SubLObject fort) {
    return non_predicate_functionP(fort);
  }

  /** @return boolean; t iff FORT is a microtheory in any mt.
   @note Currently (2/00) we assume that microtheories must be defined as such in the *mt-mt*. */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 6752) 
  public static final SubLObject mt_in_any_mtP(SubLObject fort) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject mtP = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym1$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const2$EverythingPSC, thread);
            mtP = fort_has_typeP(fort, $const7$Microtheory, UNPROVIDED);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return mtP;
      }
    }
  }

  /** is FORT a microtheory? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 7065) 
  public static final SubLObject mtP(SubLObject fort) {
    return mt_in_any_mtP(fort);
  }

  /** is TERM a microtheory? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 7243) 
  public static final SubLObject isa_mtP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(v_term))) {
      return mtP(v_term);
    } else if ((NIL != hlmt.hlmt_naut_p(v_term))) {
      return hlmt.hlmtP(v_term);
    } else {
      return makeBoolean(((NIL != isa.isaP(v_term, $const7$Microtheory, UNPROVIDED, UNPROVIDED))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5377"))));
    }
  }

  /** is FORT a relation? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 7819) 
  public static final SubLObject relation_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const11$Relation);
  }

  /** is FORT a sentential relation? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 9308) 
  public static final SubLObject sentential_relation_p(SubLObject fort) {
    return makeBoolean(((NIL != logical_connective_p(fort))
          || (NIL != quantifier_p(fort))));
  }

  /** is FORT a anti symmetric binary predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 9852) 
  public static final SubLObject anti_symmetric_binary_predicate_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const13$AntiSymmetricBinaryPredicate);
  }

  /** is FORT a anti transitive binary predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 10401) 
  public static final SubLObject anti_transitive_binary_predicate_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const14$AntiTransitiveBinaryPredicate);
  }

  /** is FORT a asymmetric binary predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 13054) 
  public static final SubLObject asymmetric_binary_predicate_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const21$AsymmetricBinaryPredicate);
  }

  /** is FORT a bookkeeping predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 13570) 
  public static final SubLObject bookkeeping_predicate_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const22$BookkeepingPredicate);
  }

  /** is FORT a broad microtheory? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 14537) 
  public static final SubLObject broad_microtheory_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const24$BroadMicrotheory);
  }

  /** Return T iff RELATION is a commutative relation. */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 14967) 
  public static final SubLObject commutative_relationP(SubLObject relation) {
    return commutative_relation_p(relation);
  }

  /** is FORT a commutative relation? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 15164) 
  public static final SubLObject commutative_relation_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const29$CommutativeRelation);
  }

  /** is FORT a commutative predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 15594) 
  public static final SubLObject commutative_predicate_p(SubLObject fort) {
    return makeBoolean(((NIL != commutative_relation_p(fort))
           && (NIL != predicate_p(fort))));
  }

  /** is FORT a distributing meta knowledge predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 16141) 
  public static final SubLObject distributing_meta_knowledge_predicate_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const31$DistributingMetaKnowledgePredicat);
  }

  /** is FORT an EL relation? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 16959) 
  public static final SubLObject el_relation_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const32$ELRelation);
  }

  /** is TERM an EL relation? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 17095) 
  public static final SubLObject isa_el_relationP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(v_term))) {
      return el_relation_p(v_term);
    } else {
      return makeBoolean(((NIL != isa.isaP(v_term, $const32$ELRelation, mt, UNPROVIDED))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5395"))));
    }
  }

  /** is FORT a evaluatable function? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 17336) 
  public static final SubLObject evaluatable_function_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const33$EvaluatableFunction);
  }

  /** is FORT a evaluatable predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 17825) 
  public static final SubLObject evaluatable_predicate_p(SubLObject fort, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return fort_has_typeP(fort, $const34$EvaluatablePredicate, mt);
  }

  /** is FORT a irreflexive binary predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 18773) 
  public static final SubLObject irreflexive_binary_predicate_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const36$IrreflexiveBinaryPredicate);
  }

  /** is FORT a logical connective? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 19298) 
  public static final SubLObject logical_connective_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const37$LogicalConnective);
  }

  /** is TERM a logical connective? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 19461) 
  public static final SubLObject isa_logical_connectiveP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(v_term))) {
      return logical_connective_p(v_term);
    } else {
      return makeBoolean(((NIL != isa.isaP(v_term, $const37$LogicalConnective, mt, UNPROVIDED))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5400"))));
    }
  }

  /** is FORT a microtheory designating relation? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 19736) 
  public static final SubLObject microtheory_designating_relation_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const38$MicrotheoryDesignatingRelation);
  }

  /** is FORT a partially commutative relation? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 20297) 
  public static final SubLObject partially_commutative_relation_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const39$PartiallyCommutativeRelation);
  }

  /** is FORT a partially commutative predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 20840) 
  public static final SubLObject partially_commutative_predicate_p(SubLObject fort) {
    return isa.isaP(fort, $const40$PartiallyCommutativePredicate, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
  }

  /** is FORT a quantifier? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 21944) 
  public static final SubLObject quantifier_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const42$Quantifier);
  }

  /** is FORT a reflexive binary predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 22313) 
  public static final SubLObject reflexive_binary_predicate_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const43$ReflexiveBinaryPredicate);
  }

  /** is FORT a reifiable function? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 22820) 
  public static final SubLObject reifiable_function_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const44$ReifiableFunction);
  }

  /** is TERM a reifiable function? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 22983) 
  public static final SubLObject isa_reifiable_functionP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(v_term))) {
      return reifiable_function_p(v_term);
    } else {
      return makeBoolean(((NIL != isa.isaP(v_term, $const44$ReifiableFunction, mt, UNPROVIDED))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5407"))));
    }
  }

  /** is FORT a scoping relation? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 23712) 
  public static final SubLObject scoping_relation_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const46$ScopingRelation);
  }

  public static final class $scoping_relation_p$UnaryFunction extends UnaryFunction {
    public $scoping_relation_p$UnaryFunction() { super(extractFunctionNamed("SCOPING-RELATION-P")); }
    public SubLObject processItem(SubLObject arg1) { return scoping_relation_p(arg1); }
  }

  /** is TERM a scoping relation? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 23868) 
  public static final SubLObject isa_scoping_relationP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(v_term))) {
      return scoping_relation_p(v_term);
    } else {
      return makeBoolean(((NIL != isa.isaP(v_term, $const46$ScopingRelation, mt, UNPROVIDED))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5409"))));
    }
  }

  /** is FORT a sibling disjoint collection? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 24133) 
  public static final SubLObject sibling_disjoint_collection_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const47$SiblingDisjointCollectionType);
  }

  public static final class $sibling_disjoint_collection_p$UnaryFunction extends UnaryFunction {
    public $sibling_disjoint_collection_p$UnaryFunction() { super(extractFunctionNamed("SIBLING-DISJOINT-COLLECTION-P")); }
    public SubLObject processItem(SubLObject arg1) { return sibling_disjoint_collection_p(arg1); }
  }

  /** is FORT a skolem function? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 25011) 
  public static final SubLObject skolem_function_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const48$SkolemFunction);
  }

  /** is FORT a symmetric binary predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 25508) 
  public static final SubLObject symmetric_binary_predicate_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const49$SymmetricBinaryPredicate);
  }

  /** is FORT a transitive binary predicate? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 26015) 
  public static final SubLObject transitive_binary_predicate_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const50$TransitiveBinaryPredicate);
  }

  /** is FORT a variable arity relation? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 26531) 
  public static final SubLObject variable_arity_relation_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const51$VariableArityRelation);
  }

  /** is TERM a variable arity relation? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 26713) 
  public static final SubLObject isa_variable_arity_relationP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(v_term))) {
      return variable_arity_relation_p(v_term);
    } else {
      return makeBoolean(((NIL != isa.isaP(v_term, $const51$VariableArityRelation, mt, UNPROVIDED))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5414"))));
    }
  }

  @SubL(source = "cycl/fort-types-interface.lisp", position = 34950) 
  public static final SubLObject bounded_existential_quantifier_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym1$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const2$EverythingPSC, thread);
            ans = fort_has_typeP(object, $const65$ExistentialQuantifier_Bounded, UNPROVIDED);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  /** is FORT a contextualized evaluatable relation? */
  @SubL(source = "cycl/fort-types-interface.lisp", position = 35165) 
  public static final SubLObject evaluatable_relation_contextualized_p(SubLObject fort) {
    return fort_has_type_in_any_mtP(fort, $const66$EvaluatableRelation_Contextualize);
  }

  @SubL(source = "cycl/fort-types-interface.lisp", position = 36087) 
  private static SubLSymbol $proprietary_constantP_caching_state$ = null;

  public static final SubLObject declare_fort_types_interface_file() {
    declareFunction(myName, "fort_types", "FORT-TYPES", 1, 1, false);
    declareFunction(myName, "fort_has_typeP", "FORT-HAS-TYPE?", 2, 1, false);
    declareFunction(myName, "fort_has_type_in_any_mtP", "FORT-HAS-TYPE-IN-ANY-MT?", 2, 0, false);
    declareFunction(myName, "definitional_fort_type", "DEFINITIONAL-FORT-TYPE", 1, 1, false);
    declareFunction(myName, "select_definitional_type", "SELECT-DEFINITIONAL-TYPE", 1, 0, false);
    declareFunction(myName, "all_forts_of_type", "ALL-FORTS-OF-TYPE", 1, 0, false);
    declareFunction(myName, "genericP", "GENERIC?", 1, 0, false);
    declareFunction(myName, "collection_in_any_mtP", "COLLECTION-IN-ANY-MT?", 1, 0, false);
    declareFunction(myName, "collectionP", "COLLECTION?", 1, 0, false);
    declareFunction(myName, "collection_p", "COLLECTION-P", 1, 0, false); new $collection_p$UnaryFunction();
    declareFunction(myName, "random_collection", "RANDOM-COLLECTION", 0, 0, false);
    declareFunction(myName, "list_of_collections_p", "LIST-OF-COLLECTIONS-P", 1, 0, false);
    declareFunction(myName, "isa_collectionP", "ISA-COLLECTION?", 1, 1, false);
    declareFunction(myName, "isa_collection_in_any_mtP", "ISA-COLLECTION-IN-ANY-MT?", 1, 0, false);
    declareFunction(myName, "predicate_in_any_mtP", "PREDICATE-IN-ANY-MT?", 1, 0, false);
    declareFunction(myName, "predicateP", "PREDICATE?", 1, 0, false);
    declareFunction(myName, "predicate_p", "PREDICATE-P", 1, 0, false); new $predicate_p$UnaryFunction();
    declareFunction(myName, "list_of_predicates_p", "LIST-OF-PREDICATES-P", 1, 0, false);
    declareFunction(myName, "isa_predicateP", "ISA-PREDICATE?", 1, 1, false);
    declareFunction(myName, "list_of_predicatesP", "LIST-OF-PREDICATES?", 1, 0, false);
    declareFunction(myName, "fixed_arity_predicate_p", "FIXED-ARITY-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "variable_arity_predicate_p", "VARIABLE-ARITY-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "function_in_any_mtP", "FUNCTION-IN-ANY-MT?", 1, 0, false);
    declareFunction(myName, "functorP", "FUNCTOR?", 1, 0, false);
    declareFunction(myName, "functor_p", "FUNCTOR-P", 1, 0, false);
    declareFunction(myName, "non_predicate_functionP", "NON-PREDICATE-FUNCTION?", 1, 0, false);
    declareFunction(myName, "functionP", "FUNCTION?", 1, 0, false);
    declareFunction(myName, "isa_functionP", "ISA-FUNCTION?", 1, 1, false);
    declareFunction(myName, "fixed_arity_functor_p", "FIXED-ARITY-FUNCTOR-P", 1, 0, false);
    declareFunction(myName, "variable_arity_functor_p", "VARIABLE-ARITY-FUNCTOR-P", 1, 0, false);
    declareFunction(myName, "mt_in_any_mtP", "MT-IN-ANY-MT?", 1, 0, false);
    declareFunction(myName, "mtP", "MT?", 1, 0, false);
    declareFunction(myName, "microtheory_p", "MICROTHEORY-P", 1, 0, false);
    declareFunction(myName, "isa_mtP", "ISA-MT?", 1, 1, false);
    declareFunction(myName, "random_mt", "RANDOM-MT", 0, 0, false);
    declareFunction(myName, "relation_p", "RELATION-P", 1, 0, false);
    declareFunction(myName, "isa_relationP", "ISA-RELATION?", 1, 1, false);
    declareFunction(myName, "sentential_relation_p", "SENTENTIAL-RELATION-P", 1, 0, false);
    declareFunction(myName, "isa_sentential_relationP", "ISA-SENTENTIAL-RELATION?", 1, 1, false);
    declareFunction(myName, "anti_symmetric_binary_predicate_p", "ANTI-SYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_anti_symmetric_binary_predicateP", "ISA-ANTI-SYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
    declareFunction(myName, "anti_transitive_binary_predicate_p", "ANTI-TRANSITIVE-BINARY-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_anti_transitive_binary_predicateP", "ISA-ANTI-TRANSITIVE-BINARY-PREDICATE?", 1, 1, false);
    declareFunction(myName, "arg_type_binary_predicate_p", "ARG-TYPE-BINARY-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_arg_type_binary_predicateP", "ISA-ARG-TYPE-BINARY-PREDICATE?", 1, 1, false);
    declareFunction(myName, "isa_arg_quoted_isa_binary_predicateP", "ISA-ARG-QUOTED-ISA-BINARY-PREDICATE?", 1, 1, false);
    declareFunction(myName, "isa_arg_format_binary_predicateP", "ISA-ARG-FORMAT-BINARY-PREDICATE?", 1, 1, false);
    declareFunction(myName, "arg_type_ternary_predicate_p", "ARG-TYPE-TERNARY-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_arg_type_ternary_predicateP", "ISA-ARG-TYPE-TERNARY-PREDICATE?", 1, 1, false);
    declareFunction(myName, "isa_arg_quoted_isa_ternary_predicateP", "ISA-ARG-QUOTED-ISA-TERNARY-PREDICATE?", 1, 1, false);
    declareFunction(myName, "isa_arg_format_ternary_predicateP", "ISA-ARG-FORMAT-TERNARY-PREDICATE?", 1, 1, false);
    declareFunction(myName, "asymmetric_binary_predicate_p", "ASYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_asymmetric_binary_predicateP", "ISA-ASYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
    declareFunction(myName, "bookkeeping_predicate_p", "BOOKKEEPING-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_bookkeeping_predicateP", "ISA-BOOKKEEPING-PREDICATE?", 1, 1, false);
    declareFunction(myName, "underspecified_predicate_p", "UNDERSPECIFIED-PREDICATE-P", 1, 1, false);
    declareFunction(myName, "isa_underspecified_predicateP", "ISA-UNDERSPECIFIED-PREDICATE?", 1, 1, false);
    declareFunction(myName, "broad_microtheory_p", "BROAD-MICROTHEORY-P", 1, 0, false);
    declareFunction(myName, "isa_broad_microtheoryP", "ISA-BROAD-MICROTHEORY?", 1, 1, false);
    declareFunction(myName, "commutative_relationP", "COMMUTATIVE-RELATION?", 1, 0, false);
    declareFunction(myName, "commutative_relation_p", "COMMUTATIVE-RELATION-P", 1, 0, false);
    declareFunction(myName, "isa_commutative_relationP", "ISA-COMMUTATIVE-RELATION?", 1, 1, false);
    declareFunction(myName, "commutative_predicate_p", "COMMUTATIVE-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_commutative_predicateP", "ISA-COMMUTATIVE-PREDICATE?", 1, 1, false);
    declareFunction(myName, "distributing_meta_knowledge_predicate_p", "DISTRIBUTING-META-KNOWLEDGE-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_distributing_meta_knowledge_predicateP", "ISA-DISTRIBUTING-META-KNOWLEDGE-PREDICATE?", 1, 1, false);
    declareFunction(myName, "forts_typed_distributing_meta_knowledge_predicate", "FORTS-TYPED-DISTRIBUTING-META-KNOWLEDGE-PREDICATE", 0, 0, false);
    declareFunction(myName, "el_relation_p", "EL-RELATION-P", 1, 0, false);
    declareFunction(myName, "isa_el_relationP", "ISA-EL-RELATION?", 1, 1, false);
    declareFunction(myName, "evaluatable_function_p", "EVALUATABLE-FUNCTION-P", 1, 0, false);
    declareFunction(myName, "isa_evaluatable_functionP", "ISA-EVALUATABLE-FUNCTION?", 1, 1, false);
    declareFunction(myName, "evaluatable_predicate_p", "EVALUATABLE-PREDICATE-P", 1, 1, false);
    declareFunction(myName, "isa_evaluatable_predicateP", "ISA-EVALUATABLE-PREDICATE?", 1, 1, false);
    declareFunction(myName, "existential_quantifier_p", "EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
    declareFunction(myName, "isa_existential_quantifierP", "ISA-EXISTENTIAL-QUANTIFIER?", 1, 1, false);
    declareFunction(myName, "irreflexive_binary_predicate_p", "IRREFLEXIVE-BINARY-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_irreflexive_binary_predicateP", "ISA-IRREFLEXIVE-BINARY-PREDICATE?", 1, 1, false);
    declareFunction(myName, "logical_connective_p", "LOGICAL-CONNECTIVE-P", 1, 0, false);
    declareFunction(myName, "isa_logical_connectiveP", "ISA-LOGICAL-CONNECTIVE?", 1, 1, false);
    declareFunction(myName, "microtheory_designating_relation_p", "MICROTHEORY-DESIGNATING-RELATION-P", 1, 0, false);
    declareFunction(myName, "isa_microtheory_designating_relationP", "ISA-MICROTHEORY-DESIGNATING-RELATION?", 1, 1, false);
    declareFunction(myName, "partially_commutative_relation_p", "PARTIALLY-COMMUTATIVE-RELATION-P", 1, 0, false);
    declareFunction(myName, "isa_partially_commutative_relationP", "ISA-PARTIALLY-COMMUTATIVE-RELATION?", 1, 1, false);
    declareFunction(myName, "partially_commutative_predicate_p", "PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_partially_commutative_predicateP", "ISA-PARTIALLY-COMMUTATIVE-PREDICATE?", 1, 1, false);
    declareFunction(myName, "problem_solving_context_p", "PROBLEM-SOLVING-CONTEXT-P", 1, 0, false);
    declareFunction(myName, "isa_problem_solving_contextP", "ISA-PROBLEM-SOLVING-CONTEXT?", 1, 1, false);
    declareFunction(myName, "quantifier_p", "QUANTIFIER-P", 1, 0, false);
    declareFunction(myName, "isa_quantifierP", "ISA-QUANTIFIER?", 1, 1, false);
    declareFunction(myName, "reflexive_binary_predicate_p", "REFLEXIVE-BINARY-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_reflexive_binary_predicateP", "ISA-REFLEXIVE-BINARY-PREDICATE?", 1, 1, false);
    declareFunction(myName, "reifiable_function_p", "REIFIABLE-FUNCTION-P", 1, 0, false);
    declareFunction(myName, "isa_reifiable_functionP", "ISA-REIFIABLE-FUNCTION?", 1, 1, false);
    declareFunction(myName, "rule_macro_predicate_p", "RULE-MACRO-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_rule_macro_predicateP", "ISA-RULE-MACRO-PREDICATE?", 1, 1, false);
    declareFunction(myName, "scoping_relation_p", "SCOPING-RELATION-P", 1, 0, false); new $scoping_relation_p$UnaryFunction();
    declareFunction(myName, "isa_scoping_relationP", "ISA-SCOPING-RELATION?", 1, 1, false);
    declareFunction(myName, "sibling_disjoint_collection_p", "SIBLING-DISJOINT-COLLECTION-P", 1, 0, false); new $sibling_disjoint_collection_p$UnaryFunction();
    declareFunction(myName, "isa_sibling_disjoint_collectionP", "ISA-SIBLING-DISJOINT-COLLECTION?", 1, 1, false);
    declareFunction(myName, "forts_typed_sibling_disjoint_collection", "FORTS-TYPED-SIBLING-DISJOINT-COLLECTION", 0, 0, false);
    declareFunction(myName, "skolem_functionP", "SKOLEM-FUNCTION?", 1, 1, false);
    declareFunction(myName, "skolem_function_p", "SKOLEM-FUNCTION-P", 1, 0, false);
    declareFunction(myName, "skolem_fort_p", "SKOLEM-FORT-P", 1, 0, false);
    declareFunction(myName, "isa_skolem_functionP", "ISA-SKOLEM-FUNCTION?", 1, 1, false);
    declareFunction(myName, "symmetric_binary_predicate_p", "SYMMETRIC-BINARY-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_symmetric_binary_predicateP", "ISA-SYMMETRIC-BINARY-PREDICATE?", 1, 1, false);
    declareFunction(myName, "transitive_binary_predicate_p", "TRANSITIVE-BINARY-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_transitive_binary_predicateP", "ISA-TRANSITIVE-BINARY-PREDICATE?", 1, 1, false);
    declareFunction(myName, "variable_arity_relation_p", "VARIABLE-ARITY-RELATION-P", 1, 0, false);
    declareFunction(myName, "isa_variable_arity_relationP", "ISA-VARIABLE-ARITY-RELATION?", 1, 1, false);
    declareFunction(myName, "documentation_predicate_p", "DOCUMENTATION-PREDICATE-P", 1, 1, false);
    declareFunction(myName, "isa_documentation_predicateP", "ISA-DOCUMENTATION-PREDICATE?", 1, 1, false);
    declareFunction(myName, "sksi_content_microtheory_p", "SKSI-CONTENT-MICROTHEORY-P", 1, 1, false);
    declareFunction(myName, "isa_sksi_content_microtheoryP", "ISA-SKSI-CONTENT-MICROTHEORY?", 1, 1, false);
    declareFunction(myName, "sksi_external_term_denoting_function_p", "SKSI-EXTERNAL-TERM-DENOTING-FUNCTION-P", 1, 0, false);
    declareFunction(myName, "isa_sksi_external_term_denoting_functionP", "ISA-SKSI-EXTERNAL-TERM-DENOTING-FUNCTION?", 1, 0, false);
    declareFunction(myName, "sksi_supported_comparison_predicate_p", "SKSI-SUPPORTED-COMPARISON-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_sksi_supported_comparison_predicateP", "ISA-SKSI-SUPPORTED-COMPARISON-PREDICATE?", 1, 0, false);
    declareFunction(myName, "sksi_supported_function_p", "SKSI-SUPPORTED-FUNCTION-P", 1, 0, false);
    declareFunction(myName, "isa_sksi_supported_functionP", "ISA-SKSI-SUPPORTED-FUNCTION?", 1, 0, false);
    declareFunction(myName, "csql_comparison_predicate_p", "CSQL-COMPARISON-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "isa_csql_comparison_predicateP", "ISA-CSQL-COMPARISON-PREDICATE?", 1, 0, false);
    declareFunction(myName, "sksi_supported_constant_p", "SKSI-SUPPORTED-CONSTANT-P", 1, 0, false);
    declareFunction(myName, "isa_sksi_supported_constantP", "ISA-SKSI-SUPPORTED-CONSTANT?", 1, 0, false);
    declareFunction(myName, "csql_function_p", "CSQL-FUNCTION-P", 1, 0, false);
    declareFunction(myName, "isa_csql_functionP", "ISA-CSQL-FUNCTION?", 1, 0, false);
    declareFunction(myName, "csql_logical_connective_p", "CSQL-LOGICAL-CONNECTIVE-P", 1, 0, false);
    declareFunction(myName, "isa_csql_logical_connectiveP", "ISA-CSQL-LOGICAL-CONNECTIVE?", 1, 0, false);
    declareFunction(myName, "csql_quantifier_p", "CSQL-QUANTIFIER-P", 1, 0, false);
    declareFunction(myName, "isa_csql_quantifierP", "ISA-CSQL-QUANTIFIER?", 1, 0, false);
    declareFunction(myName, "csql_constant_p", "CSQL-CONSTANT-P", 1, 0, false);
    declareFunction(myName, "isa_csql_constantP", "ISA-CSQL-CONSTANT?", 1, 0, false);
    declareFunction(myName, "nl_definiteness_attributeP", "NL-DEFINITENESS-ATTRIBUTE?", 1, 0, false);
    declareFunction(myName, "nl_quant_attributeP", "NL-QUANT-ATTRIBUTE?", 1, 0, false);
    declareFunction(myName, "bounded_existential_quantifier_p", "BOUNDED-EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
    declareFunction(myName, "evaluatable_relation_contextualized_p", "EVALUATABLE-RELATION-CONTEXTUALIZED-P", 1, 0, false);
    declareFunction(myName, "isa_evaluatable_relation_contextualizedP", "ISA-EVALUATABLE-RELATION-CONTEXTUALIZED?", 1, 1, false);
    declareFunction(myName, "public_constantP", "PUBLIC-CONSTANT?", 1, 0, false);
    declareFunction(myName, "non_public_constantP", "NON-PUBLIC-CONSTANT?", 1, 0, false);
    declareFunction(myName, "clear_proprietary_constantP", "CLEAR-PROPRIETARY-CONSTANT?", 0, 0, false);
    declareFunction(myName, "remove_proprietary_constantP", "REMOVE-PROPRIETARY-CONSTANT?", 1, 0, false);
    declareFunction(myName, "proprietary_constantP_internal", "PROPRIETARY-CONSTANT?-INTERNAL", 1, 0, false);
    declareFunction(myName, "proprietary_constantP", "PROPRIETARY-CONSTANT?", 1, 0, false);
    declareFunction(myName, "city_in_any_mtP_internal", "CITY-IN-ANY-MT?-INTERNAL", 1, 0, false);
    declareFunction(myName, "city_in_any_mtP", "CITY-IN-ANY-MT?", 1, 0, false);
    declareFunction(myName, "geographical_region_in_any_mtP_internal", "GEOGRAPHICAL-REGION-IN-ANY-MT?-INTERNAL", 1, 0, false);
    declareFunction(myName, "geographical_region_in_any_mtP", "GEOGRAPHICAL-REGION-IN-ANY-MT?", 1, 0, false);
    declareFunction(myName, "country_in_any_mtP_internal", "COUNTRY-IN-ANY-MT?-INTERNAL", 1, 0, false);
    declareFunction(myName, "country_in_any_mtP", "COUNTRY-IN-ANY-MT?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_fort_types_interface_file() {
    $proprietary_constantP_caching_state$ = deflexical("*PROPRIETARY-CONSTANT?-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_fort_types_interface_file() {
    // CVS_ID("Id: fort-types-interface.lisp 128434 2009-07-28 22:05:56Z goolsbey ");
    utilities_macros.register_cyc_api_function($sym25$COMMUTATIVE_RELATION_, $list26, $str27$Return_T_iff_RELATION_is_a_commut, NIL, $list28);
    memoization_state.note_globally_cached_function($sym68$PROPRIETARY_CONSTANT_);
    memoization_state.note_memoized_function($sym73$CITY_IN_ANY_MT_);
    memoization_state.note_memoized_function($sym75$GEOGRAPHICAL_REGION_IN_ANY_MT_);
    memoization_state.note_memoized_function($sym77$COUNTRY_IN_ANY_MT_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym1$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const2$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym3$FORT_P = makeSymbol("FORT-P");
  public static final SubLObject $const4$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));
  public static final SubLObject $const5$Function_Denotational = constant_handles.reader_make_constant_shell(makeString("Function-Denotational"));
  public static final SubLObject $const6$Predicate = constant_handles.reader_make_constant_shell(makeString("Predicate"));
  public static final SubLObject $const7$Microtheory = constant_handles.reader_make_constant_shell(makeString("Microtheory"));
  public static final SubLSymbol $sym8$COLLECTION_P = makeSymbol("COLLECTION-P");
  public static final SubLSymbol $sym9$PREDICATE_P = makeSymbol("PREDICATE-P");
  public static final SubLSymbol $sym10$ISA_PREDICATE_ = makeSymbol("ISA-PREDICATE?");
  public static final SubLObject $const11$Relation = constant_handles.reader_make_constant_shell(makeString("Relation"));
  public static final SubLObject $const12$SententialRelation = constant_handles.reader_make_constant_shell(makeString("SententialRelation"));
  public static final SubLObject $const13$AntiSymmetricBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("AntiSymmetricBinaryPredicate"));
  public static final SubLObject $const14$AntiTransitiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("AntiTransitiveBinaryPredicate"));
  public static final SubLObject $const15$ArgTypeBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgTypeBinaryPredicate"));
  public static final SubLObject $const16$ArgQuotedIsaBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgQuotedIsaBinaryPredicate"));
  public static final SubLObject $const17$ArgFormatBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgFormatBinaryPredicate"));
  public static final SubLObject $const18$ArgTypeTernaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgTypeTernaryPredicate"));
  public static final SubLObject $const19$ArgQuotedIsaTernaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgQuotedIsaTernaryPredicate"));
  public static final SubLObject $const20$ArgFormatTernaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgFormatTernaryPredicate"));
  public static final SubLObject $const21$AsymmetricBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("AsymmetricBinaryPredicate"));
  public static final SubLObject $const22$BookkeepingPredicate = constant_handles.reader_make_constant_shell(makeString("BookkeepingPredicate"));
  public static final SubLObject $const23$UnderspecifiedPredicate = constant_handles.reader_make_constant_shell(makeString("UnderspecifiedPredicate"));
  public static final SubLObject $const24$BroadMicrotheory = constant_handles.reader_make_constant_shell(makeString("BroadMicrotheory"));
  public static final SubLSymbol $sym25$COMMUTATIVE_RELATION_ = makeSymbol("COMMUTATIVE-RELATION?");
  public static final SubLList $list26 = list(makeSymbol("RELATION"));
  public static final SubLString $str27$Return_T_iff_RELATION_is_a_commut = makeString("Return T iff RELATION is a commutative relation.");
  public static final SubLList $list28 = list(makeSymbol("BOOLEANP"));
  public static final SubLObject $const29$CommutativeRelation = constant_handles.reader_make_constant_shell(makeString("CommutativeRelation"));
  public static final SubLObject $const30$CommutativePredicate = constant_handles.reader_make_constant_shell(makeString("CommutativePredicate"));
  public static final SubLObject $const31$DistributingMetaKnowledgePredicat = constant_handles.reader_make_constant_shell(makeString("DistributingMetaKnowledgePredicate"));
  public static final SubLObject $const32$ELRelation = constant_handles.reader_make_constant_shell(makeString("ELRelation"));
  public static final SubLObject $const33$EvaluatableFunction = constant_handles.reader_make_constant_shell(makeString("EvaluatableFunction"));
  public static final SubLObject $const34$EvaluatablePredicate = constant_handles.reader_make_constant_shell(makeString("EvaluatablePredicate"));
  public static final SubLObject $const35$ExistentialQuantifier = constant_handles.reader_make_constant_shell(makeString("ExistentialQuantifier"));
  public static final SubLObject $const36$IrreflexiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("IrreflexiveBinaryPredicate"));
  public static final SubLObject $const37$LogicalConnective = constant_handles.reader_make_constant_shell(makeString("LogicalConnective"));
  public static final SubLObject $const38$MicrotheoryDesignatingRelation = constant_handles.reader_make_constant_shell(makeString("MicrotheoryDesignatingRelation"));
  public static final SubLObject $const39$PartiallyCommutativeRelation = constant_handles.reader_make_constant_shell(makeString("PartiallyCommutativeRelation"));
  public static final SubLObject $const40$PartiallyCommutativePredicate = constant_handles.reader_make_constant_shell(makeString("PartiallyCommutativePredicate"));
  public static final SubLObject $const41$ProblemSolvingCntxt = constant_handles.reader_make_constant_shell(makeString("ProblemSolvingCntxt"));
  public static final SubLObject $const42$Quantifier = constant_handles.reader_make_constant_shell(makeString("Quantifier"));
  public static final SubLObject $const43$ReflexiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ReflexiveBinaryPredicate"));
  public static final SubLObject $const44$ReifiableFunction = constant_handles.reader_make_constant_shell(makeString("ReifiableFunction"));
  public static final SubLObject $const45$RuleMacroPredicate = constant_handles.reader_make_constant_shell(makeString("RuleMacroPredicate"));
  public static final SubLObject $const46$ScopingRelation = constant_handles.reader_make_constant_shell(makeString("ScopingRelation"));
  public static final SubLObject $const47$SiblingDisjointCollectionType = constant_handles.reader_make_constant_shell(makeString("SiblingDisjointCollectionType"));
  public static final SubLObject $const48$SkolemFunction = constant_handles.reader_make_constant_shell(makeString("SkolemFunction"));
  public static final SubLObject $const49$SymmetricBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("SymmetricBinaryPredicate"));
  public static final SubLObject $const50$TransitiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("TransitiveBinaryPredicate"));
  public static final SubLObject $const51$VariableArityRelation = constant_handles.reader_make_constant_shell(makeString("VariableArityRelation"));
  public static final SubLObject $const52$DocumentationPredicate = constant_handles.reader_make_constant_shell(makeString("DocumentationPredicate"));
  public static final SubLObject $const53$SKSIContentMicrotheory = constant_handles.reader_make_constant_shell(makeString("SKSIContentMicrotheory"));
  public static final SubLObject $const54$SKSIExternalTermDenotingFunction = constant_handles.reader_make_constant_shell(makeString("SKSIExternalTermDenotingFunction"));
  public static final SubLObject $const55$SKSISupportedComparisonPredicate = constant_handles.reader_make_constant_shell(makeString("SKSISupportedComparisonPredicate"));
  public static final SubLObject $const56$SKSISupportedFunction = constant_handles.reader_make_constant_shell(makeString("SKSISupportedFunction"));
  public static final SubLObject $const57$CSQLComparisonPredicate = constant_handles.reader_make_constant_shell(makeString("CSQLComparisonPredicate"));
  public static final SubLObject $const58$SKSISupportedConstant = constant_handles.reader_make_constant_shell(makeString("SKSISupportedConstant"));
  public static final SubLObject $const59$CSQLFunction = constant_handles.reader_make_constant_shell(makeString("CSQLFunction"));
  public static final SubLObject $const60$CSQLLogicalConnective = constant_handles.reader_make_constant_shell(makeString("CSQLLogicalConnective"));
  public static final SubLObject $const61$CSQLQuantifier = constant_handles.reader_make_constant_shell(makeString("CSQLQuantifier"));
  public static final SubLObject $const62$CSQLConstantFunction = constant_handles.reader_make_constant_shell(makeString("CSQLConstantFunction"));
  public static final SubLObject $const63$NLDefinitenessAttribute = constant_handles.reader_make_constant_shell(makeString("NLDefinitenessAttribute"));
  public static final SubLObject $const64$NLQuantAttribute = constant_handles.reader_make_constant_shell(makeString("NLQuantAttribute"));
  public static final SubLObject $const65$ExistentialQuantifier_Bounded = constant_handles.reader_make_constant_shell(makeString("ExistentialQuantifier-Bounded"));
  public static final SubLObject $const66$EvaluatableRelation_Contextualize = constant_handles.reader_make_constant_shell(makeString("EvaluatableRelation-Contextualized"));
  public static final SubLObject $const67$PublicConstant = constant_handles.reader_make_constant_shell(makeString("PublicConstant"));
  public static final SubLSymbol $sym68$PROPRIETARY_CONSTANT_ = makeSymbol("PROPRIETARY-CONSTANT?");
  public static final SubLObject $const69$ProprietaryConstant = constant_handles.reader_make_constant_shell(makeString("ProprietaryConstant"));
  public static final SubLSymbol $sym70$_PROPRIETARY_CONSTANT__CACHING_STATE_ = makeSymbol("*PROPRIETARY-CONSTANT?-CACHING-STATE*");
  public static final SubLSymbol $sym71$CLEAR_PROPRIETARY_CONSTANT_ = makeSymbol("CLEAR-PROPRIETARY-CONSTANT?");
  public static final SubLSymbol $kw72$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym73$CITY_IN_ANY_MT_ = makeSymbol("CITY-IN-ANY-MT?");
  public static final SubLObject $const74$City = constant_handles.reader_make_constant_shell(makeString("City"));
  public static final SubLSymbol $sym75$GEOGRAPHICAL_REGION_IN_ANY_MT_ = makeSymbol("GEOGRAPHICAL-REGION-IN-ANY-MT?");
  public static final SubLObject $const76$GeographicalRegion = constant_handles.reader_make_constant_shell(makeString("GeographicalRegion"));
  public static final SubLSymbol $sym77$COUNTRY_IN_ANY_MT_ = makeSymbol("COUNTRY-IN-ANY-MT?");
  public static final SubLObject $const78$Country = constant_handles.reader_make_constant_shell(makeString("Country"));

  //// Initializers

  public void declareFunctions() {
    declare_fort_types_interface_file();
  }

  public void initializeVariables() {
    init_fort_types_interface_file();
  }

  public void runTopLevelForms() {
    setup_fort_types_interface_file();
  }

}
