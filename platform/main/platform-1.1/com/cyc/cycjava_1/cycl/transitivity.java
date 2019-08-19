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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.gt_utilities;
//dm import com.cyc.cycjava_1.cycl.gt_vars;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sksi.sksi_infrastructure.sksi_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class transitivity extends SubLTranslatedFile {

  //// Constructor

  private transitivity() {}
  public static final SubLFile me = new transitivity();
  public static final String myName = "com.cyc.cycjava_1.cycl.transitivity";

  //// Definitions

  /** performs transitivity method <method> using binary transitive predicate <predicate> for designated args
   (see *gt-methods* for legal transitivity methods) */
  @SubL(source = "cycl/transitivity.lisp", position = 1003) 
  public static final SubLObject gtm(SubLObject predicate, SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
    if ((arg1 == UNPROVIDED)) {
      arg1 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if ((arg2 == UNPROVIDED)) {
      arg2 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if ((arg3 == UNPROVIDED)) {
      arg3 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if ((arg4 == UNPROVIDED)) {
      arg4 = utilities_macros.$unprovided$.getGlobalValue();
    }
    if ((arg5 == UNPROVIDED)) {
      arg5 = utilities_macros.$unprovided$.getGlobalValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject mt_var = gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (((NIL != kb_accessors.transitive_predicateP(predicate))
                || (NIL != gt_vars.$gt_handle_non_transitive_predicateP$.getDynamicValue(thread)))) {
              {
                SubLObject gti_function = gt_method_function(method);
                if (gti_function.isFunctionSpec()) {
                  {
                    SubLObject _prev_bind_0_1 = gt_vars.$gt_pred$.currentBinding(thread);
                    SubLObject _prev_bind_1_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                    SubLObject _prev_bind_2_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                    try {
                      gt_vars.$gt_pred$.bind(predicate, thread);
                      gt_vars.$gt_index_arg$.bind(ggt_index_arg(predicate), thread);
                      gt_vars.$gt_gather_arg$.bind(ggt_gather_arg(predicate), thread);
                      if ((NIL != gt_vars.$gt_marking_table$.getDynamicValue(thread))) {
                        result = apply_gti_function(gti_function, arg1, arg2, arg3, arg4, arg5);
                      } else {
                        {
                          SubLObject _prev_bind_0_4 = gt_vars.$gt_marking_table$.currentBinding(thread);
                          try {
                            gt_vars.$gt_marking_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            result = apply_gti_function(gti_function, arg1, arg2, arg3, arg4, arg5);
                            sbhl_marking_vars.free_sbhl_marking_space(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                          } finally {
                            gt_vars.$gt_marking_table$.rebind(_prev_bind_0_4, thread);
                          }
                        }
                      }
                    } finally {
                      gt_vars.$gt_gather_arg$.rebind(_prev_bind_2_3, thread);
                      gt_vars.$gt_index_arg$.rebind(_prev_bind_1_2, thread);
                      gt_vars.$gt_pred$.rebind(_prev_bind_0_1, thread);
                    }
                  }
                }
              }
            } else {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4004");
            }
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/transitivity.lisp", position = 4435) 
  public static final SubLObject apply_gti_function(SubLObject gti_function, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
    if ((NIL != utilities_macros.unprovided_argumentP(arg1))) {
      return Functions.funcall(gti_function);
    } else if ((NIL != utilities_macros.unprovided_argumentP(arg2))) {
      return Functions.funcall(gti_function, arg1);
    } else if ((NIL != utilities_macros.unprovided_argumentP(arg3))) {
      return Functions.funcall(gti_function, arg1, arg2);
    } else if ((NIL != utilities_macros.unprovided_argumentP(arg4))) {
      return Functions.funcall(gti_function, arg1, arg2, arg3);
    } else if ((NIL != utilities_macros.unprovided_argumentP(arg5))) {
      return Functions.funcall(gti_function, arg1, arg2, arg3, arg4);
    } else {
      return Functions.funcall(gti_function, arg1, arg2, arg3, arg4, arg5);
    }
  }

  @SubL(source = "cycl/transitivity.lisp", position = 4996) 
  public static final SubLObject gt_method_function(SubLObject method) {
    {
      SubLObject function = conses_high.second(conses_high.assoc(method, gt_vars.$gt_dispatch_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
      if (function.isFunctionSpec()) {
        return function;
      } else if ((NIL != function)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4005");
      } else {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4006");
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/transitivity.lisp", position = 5658) 
  public static final SubLObject gt_mt_arg(SubLObject method) {
    return Sequences.position($sym15$MT, Sequences.remove($sym16$_OPTIONAL, conses_high.third(conses_high.assoc(method, gt_vars.$gt_dispatch_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/transitivity.lisp", position = 5773) 
  public static final SubLObject gt_mt_arg_value(SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
    if ((arg1 == UNPROVIDED)) {
      arg1 = NIL;
    }
    if ((arg2 == UNPROVIDED)) {
      arg2 = NIL;
    }
    if ((arg3 == UNPROVIDED)) {
      arg3 = NIL;
    }
    if ((arg4 == UNPROVIDED)) {
      arg4 = NIL;
    }
    if ((arg5 == UNPROVIDED)) {
      arg5 = NIL;
    }
    {
      SubLObject mt = NIL;
      SubLObject pcase_var = gt_mt_arg(method);
      if (pcase_var.eql(ZERO_INTEGER)) {
        mt = arg1;
      } else if (pcase_var.eql(ONE_INTEGER)) {
        mt = arg2;
      } else if (pcase_var.eql(TWO_INTEGER)) {
        mt = arg3;
      } else if (pcase_var.eql(THREE_INTEGER)) {
        mt = arg4;
      } else if (pcase_var.eql(FOUR_INTEGER)) {
        mt = arg5;
      }
      if ((NIL != hlmt.hlmt_p(mt))) {
        return mt;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/transitivity.lisp", position = 6769) 
  public static final SubLObject ggt_index_arg(SubLObject predicate) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject fan_out_arg = kb_accessors.fan_out_arg(predicate, UNPROVIDED);
        if ((NIL != fan_out_arg)) {
          return fan_out_arg;
        } else {
          return gt_vars.$gt_index_arg$.getDynamicValue(thread);
        }
      }
    }
  }

  @SubL(source = "cycl/transitivity.lisp", position = 6919) 
  public static final SubLObject ggt_gather_arg(SubLObject predicate) {
    if (ggt_index_arg(predicate).numE(TWO_INTEGER)) {
      return ONE_INTEGER;
    } else {
      return TWO_INTEGER;
    }
  }

  public static final SubLObject declare_transitivity_file() {
    //declareMacro("with_new_gt_space", "WITH-NEW-GT-SPACE");
    declareFunction("gtm", "GTM", 2, 5, false);
    //declareFunction("gtm_in_mt", "GTM-IN-MT", 3, 3, false);
    //declareFunction("gtm_in_all_mts", "GTM-IN-ALL-MTS", 2, 3, false);
    //declareFunction("gti", "GTI", 2, 5, false);
    //declareFunction("gti_predicate", "GTI-PREDICATE", 9, 0, false);
    //declareFunction("gti_accessors", "GTI-ACCESSORS", 7, 0, false);
    declareFunction("apply_gti_function", "APPLY-GTI-FUNCTION", 6, 0, false);
    //declareFunction("reset_gti_state", "RESET-GTI-STATE", 0, 0, false);
    declareFunction("gt_method_function", "GT-METHOD-FUNCTION", 1, 0, false);
    //declareFunction("gt_method_arg_list", "GT-METHOD-ARG-LIST", 1, 0, false);
    //declareFunction("add_mt_default", "ADD-MT-DEFAULT", 2, 0, false);
    declareFunction("gt_mt_arg", "GT-MT-ARG", 1, 0, false);
    declareFunction("gt_mt_arg_value", "GT-MT-ARG-VALUE", 1, 5, false);
    //declareFunction("gt_methodP", "GT-METHOD?", 1, 0, false);
    //declareFunction("gt_moduleP", "GT-MODULE?", 1, 0, false);
    //declareFunction("gt_predicate", "GT-PREDICATE", 1, 0, false);
    //declareFunction("gt_mt", "GT-MT", 1, 0, false);
    //declareFunction("gt_index_arg", "GT-INDEX-ARG", 1, 0, false);
    //declareFunction("gt_gather_arg", "GT-GATHER-ARG", 1, 0, false);
    declareFunction("ggt_index_arg", "GGT-INDEX-ARG", 1, 0, false);
    declareFunction("ggt_gather_arg", "GGT-GATHER-ARG", 1, 0, false);
    //declareFunction("gt_accessors", "GT-ACCESSORS", 1, 0, false);
    //declareFunction("setup_transitivity_module", "SETUP-TRANSITIVITY-MODULE", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_transitivity_file() {
    return NIL;
  }

  public static final SubLObject setup_transitivity_file() {
        return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR = makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE-FOR");
  public static final SubLSymbol $sym1$_GT_MARKING_TABLE_ = makeSymbol("*GT-MARKING-TABLE*");
  public static final SubLString $str2$_s_is_not_a_transitive_predicate = makeString("~s is not a transitive predicate");
  public static final SubLSymbol $sym3$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $sym4$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const5$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $kw6$INVALID_MODULE = makeKeyword("INVALID-MODULE");
  public static final SubLString $str7$_s_is_not_a_valid_transitivity_mo = makeString("~s is not a valid transitivity module.");
  public static final SubLSymbol $kw8$INVALID_METHOD = makeKeyword("INVALID-METHOD");
  public static final SubLString $str9$_s_is_not_a_valid_gt_method_ = makeString("~s is not a valid gt method.");
  public static final SubLList $list10 = list(makeSymbol("PREDICATE"), makeSymbol("INDEX-ARG"), makeSymbol("GATHER-ARG"));
  public static final SubLSymbol $kw11$ASSERTION = makeKeyword("ASSERTION");
  public static final SubLSymbol $kw12$ACCESSORS = makeKeyword("ACCESSORS");
  public static final SubLString $str13$method__s_maps_into_illegal_gt_fu = makeString("method ~s maps into illegal gt function ~s)");
  public static final SubLString $str14$illegal_transitivity_method___s = makeString("illegal transitivity method: ~s");
  public static final SubLSymbol $sym15$MT = makeSymbol("MT");
  public static final SubLSymbol $sym16$_OPTIONAL = makeSymbol("&OPTIONAL");
  public static final SubLSymbol $kw17$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $kw18$MT = makeKeyword("MT");
  public static final SubLSymbol $kw19$INDEX_ARG = makeKeyword("INDEX-ARG");
  public static final SubLSymbol $kw20$GATHER_ARG = makeKeyword("GATHER-ARG");
  public static final SubLString $str21$_s_was_not_a_valid_transitivity_m = makeString("~s was not a valid transitivity-module parameter");

  //// Initializers

  public void declareFunctions() {
    declare_transitivity_file();
  }

  public void initializeVariables() {
    init_transitivity_file();
  }

  public void runTopLevelForms() {
    setup_transitivity_file();
  }

}
