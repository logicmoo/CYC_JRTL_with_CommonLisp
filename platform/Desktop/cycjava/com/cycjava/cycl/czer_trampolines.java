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
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;

public  final class czer_trampolines extends SubLTranslatedFile {

  //// Constructor

  private czer_trampolines() {}
  public static final SubLFile me = new czer_trampolines();
  public static final String myName = "com.cyc.cycjava.cycl.czer_trampolines";

  //// Definitions

  @SubL(source = "cycl/czer-trampolines.lisp", position = 911) 
  public static final SubLObject czer_memoization_state() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return czer_vars.$czer_memoization_state$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/czer-trampolines.lisp", position = 1007) 
  public static final SubLObject within_czer_memoization_stateP() {
    return memoization_state.memoization_state_p(czer_memoization_state());
  }

  @SubL(source = "cycl/czer-trampolines.lisp", position = 1116) 
  public static final SubLObject czer_scoping_formulaP(SubLObject formula) {
    if ((NIL != el_utilities.el_formula_p(formula))) {
      {
        SubLObject relation = cycl_utilities.formula_operator(formula);
        return fort_types_interface.isa_scoping_relationP(relation, UNPROVIDED);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-trampolines.lisp", position = 2463) 
  public static final SubLObject czer_argn_quoted_isa_int_internal(SubLObject relation, SubLObject argnum, SubLObject mt_info) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        if ((NIL != mt_relevance_macros.mt_function_eq(mt_info, $sym3$RELEVANT_MT_IS_EVERYTHING))) {
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind($sym3$RELEVANT_MT_IS_EVERYTHING, thread);
              mt_relevance_macros.$mt$.bind($const4$EverythingPSC, thread);
              result = kb_accessors.argn_quoted_isa_int(relation, argnum, NIL);
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        } else if ((NIL != mt_relevance_macros.mt_function_eq(mt_info, $sym5$RELEVANT_MT_IS_ANY_MT))) {
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind($sym5$RELEVANT_MT_IS_ANY_MT, thread);
              mt_relevance_macros.$mt$.bind($const6$InferencePSC, thread);
              result = kb_accessors.argn_quoted_isa_int(relation, argnum, NIL);
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        } else if ((NIL != hlmt.mt_union_naut_p(mt_info))) {
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind($sym7$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
              mt_relevance_macros.$relevant_mts$.bind(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12313"), thread);
              result = kb_accessors.argn_quoted_isa_int(relation, argnum, NIL);
            } finally {
              mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        } else {
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind($sym8$RELEVANT_MT_IS_GENL_MT, thread);
              mt_relevance_macros.$mt$.bind(mt_info, thread);
              result = kb_accessors.argn_quoted_isa_int(relation, argnum, NIL);
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/czer-trampolines.lisp", position = 2463) 
  public static final SubLObject czer_argn_quoted_isa_int(SubLObject relation, SubLObject argnum, SubLObject mt_info) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return czer_argn_quoted_isa_int_internal(relation, argnum, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym2$CZER_ARGN_QUOTED_ISA_INT, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym2$CZER_ARGN_QUOTED_ISA_INT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym2$CZER_ARGN_QUOTED_ISA_INT, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt_info);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                      cached_args = cached_args.rest();
                      if (((NIL != cached_args)
                           && (NIL == cached_args.rest())
                           && mt_info.equal(cached_args.first()))) {
                        return memoization_state.caching_results(results2);
                      }
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(czer_argn_quoted_isa_int_internal(relation, argnum, mt_info)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(relation, argnum, mt_info));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  public static final SubLObject declare_czer_trampolines_file() {
    declareFunction(myName, "czer_memoization_state", "CZER-MEMOIZATION-STATE", 0, 0, false);
    declareFunction(myName, "within_czer_memoization_stateP", "WITHIN-CZER-MEMOIZATION-STATE?", 0, 0, false);
    declareFunction(myName, "czer_scoping_formulaP", "CZER-SCOPING-FORMULA?", 1, 0, false);
    declareFunction(myName, "czer_scoping_args", "CZER-SCOPING-ARGS", 1, 0, false);
    declareFunction(myName, "czer_scoped_vars", "CZER-SCOPED-VARS", 1, 0, false);
    declareFunction(myName, "czer_argn_quoted_isa_int_internal", "CZER-ARGN-QUOTED-ISA-INT-INTERNAL", 3, 0, false);
    declareFunction(myName, "czer_argn_quoted_isa_int", "CZER-ARGN-QUOTED-ISA-INT", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_czer_trampolines_file() {
    return NIL;
  }

  public static final SubLObject setup_czer_trampolines_file() {
    // CVS_ID("Id: czer-trampolines.lisp 126861 2009-01-20 15:44:40Z pace ");
    memoization_state.note_memoized_function($sym2$CZER_ARGN_QUOTED_ISA_INT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $kw1$REGULARIZE = makeKeyword("REGULARIZE");
  public static final SubLSymbol $sym2$CZER_ARGN_QUOTED_ISA_INT = makeSymbol("CZER-ARGN-QUOTED-ISA-INT");
  public static final SubLSymbol $sym3$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const4$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym5$RELEVANT_MT_IS_ANY_MT = makeSymbol("RELEVANT-MT-IS-ANY-MT");
  public static final SubLObject $const6$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $sym7$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
  public static final SubLSymbol $sym8$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $kw9$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

  //// Initializers

  public void declareFunctions() {
    declare_czer_trampolines_file();
  }

  public void initializeVariables() {
    init_czer_trampolines_file();
  }

  public void runTopLevelForms() {
    setup_czer_trampolines_file();
  }

}
