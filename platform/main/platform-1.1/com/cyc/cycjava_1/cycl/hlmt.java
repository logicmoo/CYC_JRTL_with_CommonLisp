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
//dm import com.cyc.cycjava_1.cycl.arity;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_defns;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.hlmt_czer;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class hlmt extends SubLTranslatedFile {

  //// Constructor

  private hlmt() {}
  public static final SubLFile me = new hlmt();
  public static final String myName = "com.cyc.cycjava_1.cycl.hlmt";

  //// Definitions

  /** Whether we allow non-atomic unreified mts. */
  @SubL(source = "cycl/hlmt.lisp", position = 1233) 
  public static SubLSymbol $hlmts_supportedP$ = null;

  /** Whether we allow non-atomic unreified mts. */
  @SubL(source = "cycl/hlmt.lisp", position = 1417) 
  public static final SubLObject hlmts_supportedP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $hlmts_supportedP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/hlmt.lisp", position = 1834) 
  public static final SubLObject disable_hlmts() {
    $hlmts_supportedP$.setDynamicValue(NIL);
    return NIL;
  }

  @SubL(source = "cycl/hlmt.lisp", position = 1916) 
  public static SubLSymbol $default_monad_mt$ = null;

  @SubL(source = "cycl/hlmt.lisp", position = 1995) 
  public static SubLSymbol $default_temporal_mt_time_parameter$ = null;

  @SubL(source = "cycl/hlmt.lisp", position = 2076) 
  public static SubLSymbol $default_atemporal_time_parameter$ = null;

  @SubL(source = "cycl/hlmt.lisp", position = 2155) 
  public static SubLSymbol $default_atemporal_genlmt_time_parameter$ = null;

  @SubL(source = "cycl/hlmt.lisp", position = 2232) 
  public static SubLSymbol $default_atemporal_specmt_time_parameter$ = null;

  @SubL(source = "cycl/hlmt.lisp", position = 2318) 
  public static SubLSymbol $default_mt_time_interval$ = null;

  @SubL(source = "cycl/hlmt.lisp", position = 2390) 
  public static SubLSymbol $default_mt_time_parameter$ = null;

  @SubL(source = "cycl/hlmt.lisp", position = 2462) 
  private static SubLSymbol $mt_space_function$ = null;

  @SubL(source = "cycl/hlmt.lisp", position = 2529) 
  private static SubLSymbol $temporal_dimension_functions$ = null;

  /** The identifiers used to specify different types of slices of mt space. This is an ordered list, and describes the canonical ordering of dimensions */
  @SubL(source = "cycl/hlmt.lisp", position = 2628) 
  private static SubLSymbol $mt_dimension_types$ = null;

  /** The functions which carve out slices of mt space. */
  @SubL(source = "cycl/hlmt.lisp", position = 2885) 
  private static SubLSymbol $mt_dimension_functions$ = null;

  /** The functions which are valid arg0s for a HLMT. */
  @SubL(source = "cycl/hlmt.lisp", position = 3092) 
  private static SubLSymbol $context_space_functions$ = null;

  @SubL(source = "cycl/hlmt.lisp", position = 3251) 
  private static SubLSymbol $anytime_psc$ = null;

  @SubL(source = "cycl/hlmt.lisp", position = 3310) 
  private static SubLSymbol $anytime_during_psc_fn$ = null;

  /** Constants which are part of HLMT syntax and which therefore are not fully indexed, for pragmatic reasons. */
  @SubL(source = "cycl/hlmt.lisp", position = 3376) 
  private static SubLSymbol $unindexed_hlmt_syntax_constants$ = null;

  @SubL(source = "cycl/hlmt.lisp", position = 4526) 
  public static final SubLObject possibly_mt_p(SubLObject object) {
    return possibly_hlmt_p(object);
  }

  @SubL(source = "cycl/hlmt.lisp", position = 4624) 
  public static final SubLObject possibly_hlmt_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.possibly_fo_naut_p(object))
          || (NIL != hlmt_p(object))));
  }

  /** @return booleanp; Whether OBJECT is a fort-p or closed-hlmt-p. */
  @SubL(source = "cycl/hlmt.lisp", position = 4824) 
  public static final SubLObject fort_or_chlmt_p(SubLObject object) {
    return makeBoolean(((NIL != forts.fort_p(object))
          || (NIL != closed_hlmt_p(object))));
  }

  /** Shorthand for @xref closed-hlmt-p. */
  @SubL(source = "cycl/hlmt.lisp", position = 4991) 
  public static final SubLObject chlmt_p(SubLObject object) {
    return closed_hlmt_p(object);
  }

  /** @return boolean; t iff OBJECT is an HLMT, and is closed */
  @SubL(source = "cycl/hlmt.lisp", position = 5095) 
  public static final SubLObject closed_hlmt_p(SubLObject object) {
    return makeBoolean(((NIL != hlmt_p(object))
           && (NIL != variables.cycl_ground_expression_p(object))));
  }

  public static final class $closed_hlmt_p$UnaryFunction extends UnaryFunction {
    public $closed_hlmt_p$UnaryFunction() { super(extractFunctionNamed("CLOSED-HLMT-P")); }
    public SubLObject processItem(SubLObject arg1) { return closed_hlmt_p(arg1); }
  }

  /** @return boolean; t if OBJECT might be an HLMT,
   that is, an HL representation of a microtheory.
   Hence it must be closed.
   @note hlmt? returns true iff OBJECT actually is an HLMT */
  @SubL(source = "cycl/hlmt.lisp", position = 5468) 
  public static final SubLObject hlmt_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return ((NIL != $hlmts_supportedP$.getDynamicValue(thread)) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12284")) : hlmt_p_no_time(object));
    }
  }

  @SubL(source = "cycl/hlmt.lisp", position = 5780) 
  public static final SubLObject hlmt_p_no_time(SubLObject object) {
    return makeBoolean(((NIL != forts.valid_fortP(object))
          || (NIL != mt_union_naut_p(object))));
  }

  @SubL(source = "cycl/hlmt.lisp", position = 6101) 
  public static final SubLObject possibly_hlmt_naut_p(SubLObject object) {
    if ((NIL != el_utilities.possibly_naut_p(object))) {
      {
        SubLObject functor = cycl_utilities.naut_functor(object);
        return makeBoolean(((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12260"))
              || (NIL != mt_union_function_p(functor))
              || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12249"))));
      }
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/hlmt.lisp", position = 6369) 
  public static final SubLObject hlmt_naut_p(SubLObject object) {
    return makeBoolean(((NIL != possibly_hlmt_naut_p(object))
           && ((NIL != mt_space_naut_p(object))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12292"))
            || (NIL != mt_union_naut_p(object))
            || (NIL != anytime_during_psc_fn_naut_p(object)))));
  }

  @SubL(source = "cycl/hlmt.lisp", position = 6613) 
  public static final SubLObject mt_space_naut_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.possibly_naut_p(object))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12303"))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12305"))));
  }

  @SubL(source = "cycl/hlmt.lisp", position = 7187) 
  public static final SubLObject mt_union_naut_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.possibly_naut_p(object))
           && (NIL != mt_union_function_p(cycl_utilities.naut_functor(object)))));
  }

  @SubL(source = "cycl/hlmt.lisp", position = 7319) 
  public static final SubLObject mt_union_function_p(SubLObject object) {
    return Equality.eq(object, $const15$MtUnionFn);
  }

  /** Like @xref hlmt-p but also does fort-types checks that the relevant bits
   have fort-types of microtheories, and arity checks on all the dimensions. */
  @SubL(source = "cycl/hlmt.lisp", position = 7398) 
  public static final SubLObject hlmtP(SubLObject object) {
    return makeBoolean(((NIL != cycl_grammar.cycl_represented_term_p(object))
           && (NIL != hlmtP_int(object))));
  }

  public static final class $hlmtP$UnaryFunction extends UnaryFunction {
    public $hlmtP$UnaryFunction() { super(extractFunctionNamed("HLMT?")); }
    public SubLObject processItem(SubLObject arg1) { return hlmtP(arg1); }
  }

  @SubL(source = "cycl/hlmt.lisp", position = 7681) 
  public static final SubLObject hlmtP_int(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return ((NIL != $hlmts_supportedP$.getDynamicValue(thread)) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12280")) : hlmtP_no_time(object));
    }
  }

  @SubL(source = "cycl/hlmt.lisp", position = 7807) 
  public static final SubLObject hlmtP_no_time(SubLObject object) {
    return makeBoolean(((NIL != hlmt_p(object))
           && ((NIL != monad_mtP(object))
            || (NIL != mt_union_nautP(object)))));
  }

  @SubL(source = "cycl/hlmt.lisp", position = 9096) 
  public static final SubLObject mt_union_nautP(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.possibly_naut_p(object))
           && (NIL != mt_union_function_p(cycl_utilities.naut_functor(object)))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12311"))));
  }

  /** @return booleanp; Whether OBJECT0 is equal to OBJECT1. */
  @SubL(source = "cycl/hlmt.lisp", position = 9460) 
  public static final SubLObject hlmt_equal(SubLObject object0, SubLObject object1) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $hlmts_supportedP$.getDynamicValue(thread))) {
        return Equality.equal(object0, object1);
      } else {
        return Equality.eq(object0, object1);
      }
    }
  }

  public static final class $hlmt_equal$BinaryFunction extends BinaryFunction {
    public $hlmt_equal$BinaryFunction() { super(extractFunctionNamed("HLMT-EQUAL")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return hlmt_equal(arg1, arg2); }
  }

  /** @return booleanp; Whether OBJECT0 is equal to OBJECT1 insofar as all of their dimensions are equal.  What constitutes equality for a given dimension is dependent on that dimension. */
  @SubL(source = "cycl/hlmt.lisp", position = 9704) 
  public static final SubLObject hlmt_equalP(SubLObject object0, SubLObject object1) {
    if ((NIL != hlmt_equal(object0, object1))) {
      return T;
    }
    if (((NIL != monad_mt_p(object0))
         && (NIL != monad_mt_p(object1)))) {
      return NIL;
    }
    return makeBoolean(((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12276"))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12277"))));
  }

  public static final class $mt_union_mts_recursive_int$UnaryFunction extends UnaryFunction {
    public $mt_union_mts_recursive_int$UnaryFunction() { super(extractFunctionNamed("MT-UNION-MTS-RECURSIVE-INT")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12322"); }
  }

  public static final class $single_dimension_mt_dimension$UnaryFunction extends UnaryFunction {
    public $single_dimension_mt_dimension$UnaryFunction() { super(extractFunctionNamed("SINGLE-DIMENSION-MT-DIMENSION")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12341"); }
  }

  /** @return mt-p;  The dimension of HLMT specified by DIM.
   @param DIM mt-dimension-type-p
   @param HLMT hlmt-p */
  @SubL(source = "cycl/hlmt.lisp", position = 14807) 
  public static final SubLObject get_hlmt_dimension(SubLObject dim, SubLObject v_hlmt) {
    {
      SubLObject mt = NIL;
      SubLObject foundP = NIL;
      if ((NIL != monad_mt_p(v_hlmt))) {
        if ((NIL == foundP)) {
          {
            SubLObject dim_var = $kw49$MONAD;
            SubLObject mt_var = v_hlmt;
            if ((dim == dim_var)) {
              mt = mt_var;
              foundP = T;
            }
          }
        }
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12293"))) {
        if ((NIL == foundP)) {
          {
            SubLObject dim_var = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12289");
            SubLObject mt_var = v_hlmt;
            if ((dim == dim_var)) {
              mt = mt_var;
              foundP = T;
            }
          }
        }
      } else if ((NIL != mt_space_naut_p(v_hlmt))) {
        {
          SubLObject args = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29822");
          if ((NIL == foundP)) {
            {
              SubLObject csome_list_var = args;
              SubLObject arg = NIL;
              for (arg = csome_list_var.first(); (!(((NIL != foundP)
                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), arg = csome_list_var.first()) {
                {
                  SubLObject dim_var = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12297");
                  SubLObject mt_var = arg;
                  if ((dim == dim_var)) {
                    mt = mt_var;
                    foundP = T;
                  }
                }
              }
            }
          }
        }
      } else if (((NIL != anytime_psc_p(v_hlmt))
          || (NIL != anytime_during_psc_fn_naut_p(v_hlmt)))) {
        if ((NIL == foundP)) {
          {
            SubLObject dim_var = $kw50$TIME;
            SubLObject mt_var = v_hlmt;
            if ((dim == dim_var)) {
              mt = mt_var;
              foundP = T;
            }
          }
        }
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12255"))) {
        if ((NIL == foundP)) {
          {
            SubLObject dim_var = $kw49$MONAD;
            SubLObject mt_var = v_hlmt;
            if ((dim == dim_var)) {
              mt = mt_var;
              foundP = T;
            }
          }
        }
      } else {
        if ((NIL == foundP)) {
          {
            SubLObject dim_var = $kw51$UNKNOWN;
            SubLObject mt_var = v_hlmt;
            if ((dim == dim_var)) {
              mt = mt_var;
              foundP = T;
            }
          }
        }
      }
      return mt;
    }
  }

  /** Removes default values from HLMT, for more compact storage. @note result is destructible. */
  @SubL(source = "cycl/hlmt.lisp", position = 18485) 
  public static final SubLObject reduce_hlmt(SubLObject v_hlmt, SubLObject minimize_mt_union_mtsP) {
    if ((minimize_mt_union_mtsP == UNPROVIDED)) {
      minimize_mt_union_mtsP = T;
    }
    v_hlmt = transform_mt_union_nauts(v_hlmt, minimize_mt_union_mtsP);
    {
      SubLObject monad = hlmt_monad_mt(v_hlmt);
      if ((NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(monad))) {
        return monad;
      }
      if ((monad == v_hlmt)) {
        return v_hlmt;
      }
    }
    {
      SubLObject substantial_dimensions = NIL;
      if ((NIL != monad_mt_p(v_hlmt))) {
        {
          SubLObject dim = $kw49$MONAD;
          SubLObject val = v_hlmt;
          if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12270"))) {
            substantial_dimensions = cons(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12332"), substantial_dimensions);
          }
        }
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12294"))) {
        {
          SubLObject dim = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12290");
          SubLObject val = v_hlmt;
          if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12271"))) {
            substantial_dimensions = cons(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12333"), substantial_dimensions);
          }
        }
      } else if ((NIL != mt_space_naut_p(v_hlmt))) {
        {
          SubLObject args = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29823");
          SubLObject csome_list_var = args;
          SubLObject arg = NIL;
          for (arg = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), arg = csome_list_var.first()) {
            {
              SubLObject dim = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12298");
              SubLObject val = arg;
              if ((NIL == Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12272"))) {
                substantial_dimensions = cons(Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12334"), substantial_dimensions);
              }
            }
          }
        }
      } else if (((NIL != anytime_psc_p(v_hlmt))
          || (NIL != anytime_during_psc_fn_naut_p(v_hlmt)))) {
        {
          SubLObject dim = $kw50$TIME;
          SubLObject val = v_hlmt;
          if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12273"))) {
            substantial_dimensions = cons(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12335"), substantial_dimensions);
          }
        }
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12258"))) {
        {
          SubLObject dim = $kw49$MONAD;
          SubLObject val = v_hlmt;
          if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12274"))) {
            substantial_dimensions = cons(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12336"), substantial_dimensions);
          }
        }
      } else {
        {
          SubLObject dim = $kw51$UNKNOWN;
          SubLObject val = v_hlmt;
          if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12275"))) {
            substantial_dimensions = cons(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12337"), substantial_dimensions);
          }
        }
      }
      if ((NIL != list_utilities.singletonP(substantial_dimensions))) {
        return substantial_dimensions.first();
      } else if ((NIL != substantial_dimensions)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12323");
      } else {
        return hlmt_monad_mt(v_hlmt);
      }
    }
  }

  @SubL(source = "cycl/hlmt.lisp", position = 19461) 
  public static final SubLObject transform_mt_union_nauts(SubLObject v_hlmt, SubLObject minimize_mt_union_mtsP) {
    if ((NIL != mt_union_naut_p(v_hlmt))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12338");
    } else if (v_hlmt.isCons()) {
      return cons(transform_mt_union_nauts(v_hlmt.first(), minimize_mt_union_mtsP), transform_mt_union_nauts(v_hlmt.rest(), minimize_mt_union_mtsP));
    } else {
      return v_hlmt;
    }
  }

  @SubL(source = "cycl/hlmt.lisp", position = 20394) 
  private static SubLSymbol $reduce_mt_union_hlmt_int_caching_state$ = null;

  @SubL(source = "cycl/hlmt.lisp", position = 22820) 
  public static final SubLObject valid_hlmt_p(SubLObject v_hlmt, SubLObject robust) {
    if ((robust == UNPROVIDED)) {
      robust = NIL;
    }
    if ((NIL != hlmt_p(v_hlmt))) {
      if ((NIL != robust)) {
        {
          SubLObject invalidP = NIL;
          if ((NIL != monad_mt_p(v_hlmt))) {
            if ((NIL == invalidP)) {
              {
                SubLObject dim = $kw49$MONAD;
                SubLObject val = v_hlmt;
                if ((NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12345"))) {
                  invalidP = T;
                }
              }
            }
          } else if ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12295"))) {
            if ((NIL == invalidP)) {
              {
                SubLObject dim = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12291");
                SubLObject val = v_hlmt;
                if ((NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12346"))) {
                  invalidP = T;
                }
              }
            }
          } else if ((NIL != mt_space_naut_p(v_hlmt))) {
            {
              SubLObject args = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29824");
              if ((NIL == invalidP)) {
                {
                  SubLObject csome_list_var = args;
                  SubLObject arg = NIL;
                  for (arg = csome_list_var.first(); (!(((NIL != invalidP)
                        || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), arg = csome_list_var.first()) {
                    {
                      SubLObject dim = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12299");
                      SubLObject val = arg;
                      if ((NIL == Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12347"))) {
                        invalidP = T;
                      }
                    }
                  }
                }
              }
            }
          } else if (((NIL != anytime_psc_p(v_hlmt))
              || (NIL != anytime_during_psc_fn_naut_p(v_hlmt)))) {
            if ((NIL == invalidP)) {
              {
                SubLObject dim = $kw50$TIME;
                SubLObject val = v_hlmt;
                if ((NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12348"))) {
                  invalidP = T;
                }
              }
            }
          } else if ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12259"))) {
            if ((NIL == invalidP)) {
              {
                SubLObject dim = $kw49$MONAD;
                SubLObject val = v_hlmt;
                if ((NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12349"))) {
                  invalidP = T;
                }
              }
            }
          } else {
            if ((NIL == invalidP)) {
              {
                SubLObject dim = $kw51$UNKNOWN;
                SubLObject val = v_hlmt;
                if ((NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12350"))) {
                  invalidP = T;
                }
              }
            }
          }
          return makeBoolean((NIL == invalidP));
        }
      } else {
        return valid_monad_mt_p(hlmt_monad_mt(v_hlmt));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/hlmt.lisp", position = 23644) 
  public static final SubLObject monad_mt_p(SubLObject object) {
    return makeBoolean((((NIL != forts.fort_p(object))
             && (NIL == anytime_psc_p(object)))
          || ((NIL != mt_union_naut_p(object))
             && (NIL != list_utilities.every_in_list($sym33$MONAD_MT_P, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12315"), UNPROVIDED)))));
  }

  public static final class $monad_mt_p$UnaryFunction extends UnaryFunction {
    public $monad_mt_p$UnaryFunction() { super(extractFunctionNamed("MONAD-MT-P")); }
    public SubLObject processItem(SubLObject arg1) { return monad_mt_p(arg1); }
  }

  @SubL(source = "cycl/hlmt.lisp", position = 23852) 
  public static final SubLObject valid_monad_mt_p(SubLObject mt) {
    if ((NIL != mt)) {
      return makeBoolean(((NIL != forts.valid_fortP(mt))
             && (NIL != fort_types_interface.mtP(mt))));
    } else {
      return T;
    }
  }

  @SubL(source = "cycl/hlmt.lisp", position = 24001) 
  public static final SubLObject monad_mtP(SubLObject object) {
    return makeBoolean((((NIL != forts.fort_p(object))
             && (NIL != fort_types_interface.mtP(object)))
          || ((NIL != mt_union_naut_p(object))
             && (NIL != list_utilities.every_in_list($sym61$MONAD_MT_, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12316"), UNPROVIDED)))));
  }

  public static final class $monad_cycl_mtP$UnaryFunction extends UnaryFunction {
    public $monad_cycl_mtP$UnaryFunction() { super(extractFunctionNamed("MONAD-CYCL-MT?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12286"); }
  }

  /** @return monad-mt-p */
  @SubL(source = "cycl/hlmt.lisp", position = 24371) 
  public static final SubLObject hlmt_monad_mt(SubLObject v_hlmt) {
    {
      SubLObject monad_mt = hlmt_monad_mt_without_default(v_hlmt);
      return ((NIL != monad_mt) ? ((SubLObject) monad_mt) : $default_monad_mt$.getGlobalValue());
    }
  }

  /** @return nil or monad-mt-p */
  @SubL(source = "cycl/hlmt.lisp", position = 24560) 
  public static final SubLObject hlmt_monad_mt_without_default(SubLObject v_hlmt) {
    return ((NIL != hlmt_naut_p(v_hlmt)) ? ((SubLObject) get_hlmt_dimension($kw49$MONAD, v_hlmt)) : v_hlmt);
  }

  @SubL(source = "cycl/hlmt.lisp", position = 25151) 
  private static SubLSymbol $temporal_dimension_predicates$ = null;

  @SubL(source = "cycl/hlmt.lisp", position = 26171) 
  public static final SubLObject anytime_psc_p(SubLObject object) {
    return Equality.eq(object, $anytime_psc$.getGlobalValue());
  }

  @SubL(source = "cycl/hlmt.lisp", position = 26340) 
  public static final SubLObject anytime_during_psc_fn_naut_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.possibly_naut_p(object))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12250"))));
  }

  public static final class $temporal_dimension_mt_p$UnaryFunction extends UnaryFunction {
    public $temporal_dimension_mt_p$UnaryFunction() { super(extractFunctionNamed("TEMPORAL-DIMENSION-MT-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12343"); }
  }

  @SubL(source = "cycl/hlmt.lisp", position = 29403) 
  public static final SubLObject hlmt_with_anytime_psc_p(SubLObject v_hlmt) {
    {
      SubLObject time_mt = hlmt_temporal_mt(v_hlmt);
      return makeBoolean(((NIL != anytime_psc_p(time_mt))
            || (NIL != anytime_during_psc_fn_naut_p(time_mt))));
    }
  }

  @SubL(source = "cycl/hlmt.lisp", position = 31684) 
  public static final SubLObject hlmt_temporal_mt(SubLObject v_hlmt) {
    return get_hlmt_dimension($kw50$TIME, v_hlmt);
  }

  public static final SubLObject declare_hlmt_file() {
    declareFunction(myName, "hlmts_supportedP", "HLMTS-SUPPORTED?", 0, 0, false);
    //declareMacro(myName, "with_hlmts", "WITH-HLMTS");
    //declareFunction(myName, "enable_hlmts", "ENABLE-HLMTS", 0, 0, false);
    declareFunction(myName, "disable_hlmts", "DISABLE-HLMTS", 0, 0, false);
    //declareFunction(myName, "unindexed_hlmt_syntax_constants", "UNINDEXED-HLMT-SYNTAX-CONSTANTS", 0, 0, false);
    //declareFunction(myName, "unindexed_hlmt_syntax_constant_p", "UNINDEXED-HLMT-SYNTAX-CONSTANT-P", 1, 0, false);
    //declareFunction(myName, "fully_indexed_hlmt_term_p", "FULLY-INDEXED-HLMT-TERM-P", 1, 0, false);
    //declareFunction(myName, "mt_space_function_p", "MT-SPACE-FUNCTION-P", 1, 0, false);
    declareFunction(myName, "possibly_mt_p", "POSSIBLY-MT-P", 1, 0, false);
    declareFunction(myName, "possibly_hlmt_p", "POSSIBLY-HLMT-P", 1, 0, false);
    declareFunction(myName, "fort_or_chlmt_p", "FORT-OR-CHLMT-P", 1, 0, false);
    declareFunction(myName, "chlmt_p", "CHLMT-P", 1, 0, false);
    declareFunction(myName, "closed_hlmt_p", "CLOSED-HLMT-P", 1, 0, false); new $closed_hlmt_p$UnaryFunction();
    //declareFunction(myName, "closed_possibly_hlmt_p", "CLOSED-POSSIBLY-HLMT-P", 1, 0, false);
    declareFunction(myName, "hlmt_p", "HLMT-P", 1, 0, false);
    declareFunction(myName, "hlmt_p_no_time", "HLMT-P-NO-TIME", 1, 0, false);
    //declareFunction(myName, "hlmt_p_time", "HLMT-P-TIME", 1, 0, false);
    declareFunction(myName, "possibly_hlmt_naut_p", "POSSIBLY-HLMT-NAUT-P", 1, 0, false);
    declareFunction(myName, "hlmt_naut_p", "HLMT-NAUT-P", 1, 0, false);
    declareFunction(myName, "mt_space_naut_p", "MT-SPACE-NAUT-P", 1, 0, false);
    //declareFunction(myName, "mt_space_naut_arglist_p", "MT-SPACE-NAUT-ARGLIST-P", 1, 0, false);
    //declareFunction(myName, "mt_dim_naut_p", "MT-DIM-NAUT-P", 1, 0, false);
    declareFunction(myName, "mt_union_naut_p", "MT-UNION-NAUT-P", 1, 0, false);
    declareFunction(myName, "mt_union_function_p", "MT-UNION-FUNCTION-P", 1, 0, false);
    declareFunction(myName, "hlmtP", "HLMT?", 1, 0, false); new $hlmtP$UnaryFunction();
    declareFunction(myName, "hlmtP_int", "HLMT?-INT", 1, 0, false);
    declareFunction(myName, "hlmtP_no_time", "HLMT?-NO-TIME", 1, 0, false);
    //declareFunction(myName, "hlmtP_time", "HLMT?-TIME", 1, 0, false);
    //declareFunction(myName, "hlmt_nautP", "HLMT-NAUT?", 1, 0, false);
    //declareFunction(myName, "mt_space_mtP", "MT-SPACE-MT?", 1, 0, false);
    //declareFunction(myName, "mt_space_arglistP", "MT-SPACE-ARGLIST?", 1, 0, false);
    //declareFunction(myName, "mt_dim_mtP", "MT-DIM-MT?", 1, 0, false);
    //declareFunction(myName, "mt_dim_arglistP", "MT-DIM-ARGLIST?", 2, 0, false);
    declareFunction(myName, "mt_union_nautP", "MT-UNION-NAUT?", 1, 0, false);
    //declareFunction(myName, "mt_union_arglistP", "MT-UNION-ARGLIST?", 1, 0, false);
    declareFunction(myName, "hlmt_equal", "HLMT-EQUAL", 2, 0, false); new $hlmt_equal$BinaryFunction();
    declareFunction(myName, "hlmt_equalP", "HLMT-EQUAL?", 2, 0, false);
    //declareFunction(myName, "new_hlmt", "NEW-HLMT", 1, 0, false);
    //declareFunction(myName, "copy_hlmt", "COPY-HLMT", 1, 0, false);
    //declareFunction(myName, "new_anytime_during_psc_naut", "NEW-ANYTIME-DURING-PSC-NAUT", 1, 0, false);
    //declareFunction(myName, "anytime_psc", "ANYTIME-PSC", 0, 0, false);
    //declareFunction(myName, "mt_union_mts", "MT-UNION-MTS", 1, 0, false);
    //declareFunction(myName, "mt_union_mts_recursive", "MT-UNION-MTS-RECURSIVE", 1, 0, false);
    //declareFunction(myName, "mt_union_mts_recursive_int", "MT-UNION-MTS-RECURSIVE-INT", 1, 0, false); new $mt_union_mts_recursive_int$UnaryFunction();
    //declareFunction(myName, "union_mt_relevance_contexts", "UNION-MT-RELEVANCE-CONTEXTS", 1, 0, false);
    //declareFunction(myName, "mt_dimension_type_p", "MT-DIMENSION-TYPE-P", 1, 0, false);
    //declareFunction(myName, "mt_dimension_types", "MT-DIMENSION-TYPES", 0, 0, false);
    //declareFunction(myName, "mt_dimension_function_p", "MT-DIMENSION-FUNCTION-P", 1, 0, false);
    //declareFunction(myName, "context_space_function_p", "CONTEXT-SPACE-FUNCTION-P", 1, 0, false);
    //declareFunction(myName, "mt_dimension_predicate_p", "MT-DIMENSION-PREDICATE-P", 1, 0, false);
    //declareMacro(myName, "do_mt_dimensions", "DO-MT-DIMENSIONS");
    //declareFunction(myName, "mt_dimension_of_arg", "MT-DIMENSION-OF-ARG", 1, 0, false);
    //declareFunction(myName, "single_dimension_mt_dimension", "SINGLE-DIMENSION-MT-DIMENSION", 1, 0, false); new $single_dimension_mt_dimension$UnaryFunction();
    //declareFunction(myName, "mt_dim_nat_dimension", "MT-DIM-NAT-DIMENSION", 1, 0, false);
    declareFunction(myName, "get_hlmt_dimension", "GET-HLMT-DIMENSION", 2, 0, false);
    //declareFunction(myName, "hlmt_dimensions", "HLMT-DIMENSIONS", 1, 0, false);
    //declareFunction(myName, "remove_hlmt_dimension", "REMOVE-HLMT-DIMENSION", 2, 0, false);
    //declareFunction(myName, "replace_hlmt_dimension", "REPLACE-HLMT-DIMENSION", 3, 0, false);
    //declareFunction(myName, "replace_monad_dimension", "REPLACE-MONAD-DIMENSION", 2, 0, false);
    //declareFunction(myName, "replace_time_dimension", "REPLACE-TIME-DIMENSION", 2, 1, false);
    //declareFunction(myName, "default_values_for_dimension_p", "DEFAULT-VALUES-FOR-DIMENSION-P", 2, 0, false);
    //declareFunction(myName, "some_interesting_hlmtP", "SOME-INTERESTING-HLMT?", 1, 0, false);
    //declareFunction(myName, "interesting_hlmtP", "INTERESTING-HLMT?", 1, 0, false);
    //declareFunction(myName, "assertion_hlmt", "ASSERTION-HLMT", 1, 0, false);
    //declareFunction(myName, "hlmt_has_dimension_of_valueP", "HLMT-HAS-DIMENSION-OF-VALUE?", 3, 0, false);
    //declareFunction(myName, "augment_hlmt", "AUGMENT-HLMT", 1, 0, false);
    declareFunction(myName, "reduce_hlmt", "REDUCE-HLMT", 1, 1, false);
    declareFunction(myName, "transform_mt_union_nauts", "TRANSFORM-MT-UNION-NAUTS", 2, 0, false);
    //declareFunction(myName, "reduce_mt_union_hlmt", "REDUCE-MT-UNION-HLMT", 2, 0, false);
    //declareFunction(myName, "clear_reduce_mt_union_hlmt_int", "CLEAR-REDUCE-MT-UNION-HLMT-INT", 0, 0, false);
    //declareFunction(myName, "remove_reduce_mt_union_hlmt_int", "REMOVE-REDUCE-MT-UNION-HLMT-INT", 1, 0, false);
    //declareFunction(myName, "reduce_mt_union_hlmt_int_internal", "REDUCE-MT-UNION-HLMT-INT-INTERNAL", 1, 0, false);
    //declareFunction(myName, "reduce_mt_union_hlmt_int", "REDUCE-MT-UNION-HLMT-INT", 1, 0, false);
    //declareFunction(myName, "new_reduced_hlmt", "NEW-REDUCED-HLMT", 1, 0, false);
    //declareFunction(myName, "combine_hlmts", "COMBINE-HLMTS", 2, 0, false);
    //declareFunction(myName, "new_canonicalized_hlmt", "NEW-CANONICALIZED-HLMT", 1, 0, false);
    //declareFunction(myName, "possibly_augment_dimension", "POSSIBLY-AUGMENT-DIMENSION", 2, 0, false);
    //declareFunction(myName, "possibly_reduce_dimension", "POSSIBLY-REDUCE-DIMENSION", 2, 0, false);
    //declareFunction(myName, "default_dimension_mt", "DEFAULT-DIMENSION-MT", 1, 0, false);
    //declareFunction(myName, "new_hlmt_from_dimension_plist", "NEW-HLMT-FROM-DIMENSION-PLIST", 1, 0, false);
    //declareFunction(myName, "valid_hlmtP", "VALID-HLMT?", 1, 1, false);
    declareFunction(myName, "valid_hlmt_p", "VALID-HLMT-P", 1, 1, false);
    //declareFunction(myName, "valid_mt_for_dimension_p", "VALID-MT-FOR-DIMENSION-P", 2, 0, false);
    //declareFunction(myName, "default_monad_mt_p", "DEFAULT-MONAD-MT-P", 1, 0, false);
    //declareFunction(myName, "monad_dimension_p", "MONAD-DIMENSION-P", 1, 0, false);
    declareFunction(myName, "monad_mt_p", "MONAD-MT-P", 1, 0, false); new $monad_mt_p$UnaryFunction();
    declareFunction(myName, "valid_monad_mt_p", "VALID-MONAD-MT-P", 1, 0, false);
    declareFunction(myName, "monad_mtP", "MONAD-MT?", 1, 0, false);
    //declareFunction(myName, "monad_cycl_mtP", "MONAD-CYCL-MT?", 1, 0, false); new $monad_cycl_mtP$UnaryFunction();
    declareFunction(myName, "hlmt_monad_mt", "HLMT-MONAD-MT", 1, 0, false);
    declareFunction(myName, "hlmt_monad_mt_without_default", "HLMT-MONAD-MT-WITHOUT-DEFAULT", 1, 0, false);
    //declareFunction(myName, "assertion_monad_mt", "ASSERTION-MONAD-MT", 1, 0, false);
    //declareFunction(myName, "equal_mt_monads_p", "EQUAL-MT-MONADS-P", 2, 0, false);
    //declareFunction(myName, "monad_mt_equal", "MONAD-MT-EQUAL", 2, 0, false);
    //declareFunction(myName, "temporal_dimension_function_p", "TEMPORAL-DIMENSION-FUNCTION-P", 1, 0, false);
    //declareFunction(myName, "temporal_dimension_predicate_p", "TEMPORAL-DIMENSION-PREDICATE-P", 1, 0, false);
    //declareFunction(myName, "default_mt_time_interval_p", "DEFAULT-MT-TIME-INTERVAL-P", 1, 0, false);
    //declareFunction(myName, "default_mt_time_parameter_p", "DEFAULT-MT-TIME-PARAMETER-P", 1, 0, false);
    //declareFunction(myName, "default_time_mt_p", "DEFAULT-TIME-MT-P", 1, 0, false);
    //declareFunction(myName, "mt_time_dim_naut_p", "MT-TIME-DIM-NAUT-P", 1, 0, false);
    declareFunction(myName, "anytime_psc_p", "ANYTIME-PSC-P", 1, 0, false);
    //declareFunction(myName, "anytime_during_psc_fn_p", "ANYTIME-DURING-PSC-FN-P", 1, 0, false);
    declareFunction(myName, "anytime_during_psc_fn_naut_p", "ANYTIME-DURING-PSC-FN-NAUT-P", 1, 0, false);
    //declareFunction(myName, "anytime_psc_hlmtP", "ANYTIME-PSC-HLMT?", 1, 0, false);
    //declareFunction(myName, "anytime_during_psc_hlmtP", "ANYTIME-DURING-PSC-HLMT?", 1, 0, false);
    //declareFunction(myName, "temporal_hlmt_p", "TEMPORAL-HLMT-P", 1, 0, false);
    //declareFunction(myName, "atemporal_hlmtP", "ATEMPORAL-HLMT?", 1, 0, false);
    //declareFunction(myName, "temporal_dimension_mt_p", "TEMPORAL-DIMENSION-MT-P", 1, 0, false); new $temporal_dimension_mt_p$UnaryFunction();
    //declareFunction(myName, "time_dimension_p", "TIME-DIMENSION-P", 1, 0, false);
    //declareFunction(myName, "time_intervalP", "TIME-INTERVAL?", 1, 0, false);
    //declareFunction(myName, "temporal_objectP", "TEMPORAL-OBJECT?", 1, 0, false);
    //declareFunction(myName, "time_parameterP", "TIME-PARAMETER?", 1, 0, false);
    //declareFunction(myName, "time_mt_with_implicit_parameter_p", "TIME-MT-WITH-IMPLICIT-PARAMETER-P", 1, 0, false);
    //declareFunction(myName, "time_mt_with_explicit_parameter_p", "TIME-MT-WITH-EXPLICIT-PARAMETER-P", 1, 0, false);
    //declareFunction(myName, "time_mt_with_indeterminate_time_p", "TIME-MT-WITH-INDETERMINATE-TIME-P", 1, 0, false);
    //declareFunction(myName, "some_time_in_interval_naut_p", "SOME-TIME-IN-INTERVAL-NAUT-P", 1, 0, false);
    //declareFunction(myName, "indeterminate_time_interval_p", "INDETERMINATE-TIME-INTERVAL-P", 1, 0, false);
    //declareFunction(myName, "hlmt_with_indeterminate_time_p", "HLMT-WITH-INDETERMINATE-TIME-P", 1, 0, false);
    declareFunction(myName, "hlmt_with_anytime_psc_p", "HLMT-WITH-ANYTIME-PSC-P", 1, 0, false);
    //declareFunction(myName, "equal_mt_times_p", "EQUAL-MT-TIMES-P", 2, 0, false);
    //declareFunction(myName, "temporal_object_equal", "TEMPORAL-OBJECT-EQUAL", 2, 0, false);
    //declareFunction(myName, "time_parameter_equal", "TIME-PARAMETER-EQUAL", 2, 0, false);
    //declareFunction(myName, "hlmt_times_equal_p", "HLMT-TIMES-EQUAL-P", 2, 0, false);
    //declareFunction(myName, "some_time_sentence_match_p", "SOME-TIME-SENTENCE-MATCH-P", 2, 0, false);
    declareFunction(myName, "hlmt_temporal_mt", "HLMT-TEMPORAL-MT", 1, 0, false);
    //declareFunction(myName, "extract_hlmt_temporal_index", "EXTRACT-HLMT-TEMPORAL-INDEX", 1, 0, false);
    //declareFunction(myName, "extract_hlmt_temporal_index_or_default", "EXTRACT-HLMT-TEMPORAL-INDEX-OR-DEFAULT", 1, 0, false);
    //declareFunction(myName, "extract_hlmt_time_parameter", "EXTRACT-HLMT-TIME-PARAMETER", 1, 0, false);
    //declareMacro(myName, "destructure_mt_time_dim_nat", "DESTRUCTURE-MT-TIME-DIM-NAT");
    //declareFunction(myName, "mt_time_dim_nat_temporal_values", "MT-TIME-DIM-NAT-TEMPORAL-VALUES", 1, 0, false);
    //declareFunction(myName, "explode_indeterminate_time_dim_nat", "EXPLODE-INDETERMINATE-TIME-DIM-NAT", 1, 0, false);
    //declareFunction(myName, "anytime_during_psc_fn_time_interval", "ANYTIME-DURING-PSC-FN-TIME-INTERVAL", 1, 0, false);
    //declareFunction(myName, "explode_hlmt_temporal_facets", "EXPLODE-HLMT-TEMPORAL-FACETS", 3, 0, false);
    //declareFunction(myName, "explode_hlmt_temporal_facets_with_defaults", "EXPLODE-HLMT-TEMPORAL-FACETS-WITH-DEFAULTS", 1, 0, false);
    //declareFunction(myName, "explode_genlmt_temporal_facets_based_on_temporality", "EXPLODE-GENLMT-TEMPORAL-FACETS-BASED-ON-TEMPORALITY", 2, 0, false);
    //declareMacro(myName, "destructure_monad_and_temporal_facets", "DESTRUCTURE-MONAD-AND-TEMPORAL-FACETS");
    //declareMacro(myName, "destructure_monad_and_temporal_facets_without_defaults", "DESTRUCTURE-MONAD-AND-TEMPORAL-FACETS-WITHOUT-DEFAULTS");
    //declareMacro(myName, "destructure_temporal_mt_temporal_facets", "DESTRUCTURE-TEMPORAL-MT-TEMPORAL-FACETS");
    //declareMacro(myName, "destructure_atemporal_genlmt_temporal_facets", "DESTRUCTURE-ATEMPORAL-GENLMT-TEMPORAL-FACETS");
    //declareMacro(myName, "destructure_atemporal_specmt_temporal_facets", "DESTRUCTURE-ATEMPORAL-SPECMT-TEMPORAL-FACETS");
    //declareFunction(myName, "new_time_dimension", "NEW-TIME-DIMENSION", 1, 1, false);
    //declareFunction(myName, "new_temporal_hlmt", "NEW-TEMPORAL-HLMT", 3, 0, false);
    //declareFunction(myName, "new_canonicalized_temporal_hlmt", "NEW-CANONICALIZED-TEMPORAL-HLMT", 2, 0, false);
    //declareFunction(myName, "new_default_granularity_hlmt", "NEW-DEFAULT-GRANULARITY-HLMT", 2, 0, false);
    //declareFunction(myName, "default_time_mt", "DEFAULT-TIME-MT", 0, 0, false);
    //declareFunction(myName, "new_temporal_object_default_parameter_mt", "NEW-TEMPORAL-OBJECT-DEFAULT-PARAMETER-MT", 1, 0, false);
    //declareFunction(myName, "possibly_augment_time_mt", "POSSIBLY-AUGMENT-TIME-MT", 1, 0, false);
    //declareFunction(myName, "possibly_reduce_time_mt", "POSSIBLY-REDUCE-TIME-MT", 1, 0, false);
    //declareFunction(myName, "add_default_parameter_to_time_nat", "ADD-DEFAULT-PARAMETER-TO-TIME-NAT", 1, 0, false);
    //declareFunction(myName, "valid_temporal_mt_slice_p", "VALID-TEMPORAL-MT-SLICE-P", 1, 0, false);
    //declareFunction(myName, "valid_temporal_object_p", "VALID-TEMPORAL-OBJECT-P", 1, 0, false);
    //declareFunction(myName, "valid_time_parameter_p", "VALID-TIME-PARAMETER-P", 1, 0, false);
    //declareFunction(myName, "valid_mt_time_with_granularity_dim_arglistP", "VALID-MT-TIME-WITH-GRANULARITY-DIM-ARGLIST?", 1, 0, false);
    //declareFunction(myName, "valid_mt_time_dim_arglistP", "VALID-MT-TIME-DIM-ARGLIST?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_hlmt_file() {
    $hlmts_supportedP$ = defvar("*HLMTS-SUPPORTED?*", T);
    $default_monad_mt$ = deflexical("*DEFAULT-MONAD-MT*", $const4$UniversalVocabularyMt);
    $default_temporal_mt_time_parameter$ = deflexical("*DEFAULT-TEMPORAL-MT-TIME-PARAMETER*", $const5$Null_TimeParameter);
    $default_atemporal_time_parameter$ = deflexical("*DEFAULT-ATEMPORAL-TIME-PARAMETER*", $const5$Null_TimeParameter);
    $default_atemporal_genlmt_time_parameter$ = deflexical("*DEFAULT-ATEMPORAL-GENLMT-TIME-PARAMETER*", $const6$TimePoint);
    $default_atemporal_specmt_time_parameter$ = deflexical("*DEFAULT-ATEMPORAL-SPECMT-TIME-PARAMETER*", $const5$Null_TimeParameter);
    $default_mt_time_interval$ = deflexical("*DEFAULT-MT-TIME-INTERVAL*", $const7$Always_TimeInterval);
    $default_mt_time_parameter$ = deflexical("*DEFAULT-MT-TIME-PARAMETER*", $const5$Null_TimeParameter);
    $mt_space_function$ = deflexical("*MT-SPACE-FUNCTION*", $const8$MtSpace);
    $temporal_dimension_functions$ = deflexical("*TEMPORAL-DIMENSION-FUNCTIONS*", $list9);
    $mt_dimension_types$ = deflexical("*MT-DIMENSION-TYPES*", $list10);
    $mt_dimension_functions$ = deflexical("*MT-DIMENSION-FUNCTIONS*", $list11);
    $context_space_functions$ = deflexical("*CONTEXT-SPACE-FUNCTIONS*", cons($mt_space_function$.getGlobalValue(), $mt_dimension_functions$.getGlobalValue()));
    $anytime_psc$ = deflexical("*ANYTIME-PSC*", $const12$AnytimePSC);
    $anytime_during_psc_fn$ = deflexical("*ANYTIME-DURING-PSC-FN*", $const13$AnytimeDuringPSCFn);
    $unindexed_hlmt_syntax_constants$ = deflexical("*UNINDEXED-HLMT-SYNTAX-CONSTANTS*", $list14);
    $reduce_mt_union_hlmt_int_caching_state$ = deflexical("*REDUCE-MT-UNION-HLMT-INT-CACHING-STATE*", NIL);
    $temporal_dimension_predicates$ = deflexical("*TEMPORAL-DIMENSION-PREDICATES*", $list63);
    return NIL;
  }

  public static final SubLObject setup_hlmt_file() {
    // CVS_ID("Id: hlmt.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.register_external_symbol($sym20$UNION_MT_RELEVANCE_CONTEXTS);
    access_macros.register_macro_helper($sym41$MT_DIMENSION_OF_ARG, $sym48$DO_MT_DIMENSIONS);
    memoization_state.note_globally_cached_function($sym57$REDUCE_MT_UNION_HLMT_INT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CLET = makeSymbol("CLET");
  public static final SubLList $list1 = list(list(makeSymbol("*HLMTS-SUPPORTED?*"), T));
  public static final SubLString $str2$Continue_without_temporal_support = makeString("Continue without temporal support.");
  public static final SubLString $str3$Need__Cyc_Time_feature_for_tempor = makeString("Need :Cyc-Time feature for temporal inference.");
  public static final SubLObject $const4$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
  public static final SubLObject $const5$Null_TimeParameter = constant_handles.reader_make_constant_shell(makeString("Null-TimeParameter"));
  public static final SubLObject $const6$TimePoint = constant_handles.reader_make_constant_shell(makeString("TimePoint"));
  public static final SubLObject $const7$Always_TimeInterval = constant_handles.reader_make_constant_shell(makeString("Always-TimeInterval"));
  public static final SubLObject $const8$MtSpace = constant_handles.reader_make_constant_shell(makeString("MtSpace"));
  public static final SubLList $list9 = list(constant_handles.reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")), constant_handles.reader_make_constant_shell(makeString("MtTimeDimFn")));
  public static final SubLList $list10 = list(makeKeyword("MONAD"), makeKeyword("TIME"));
  public static final SubLList $list11 = list(constant_handles.reader_make_constant_shell(makeString("MtDim")), constant_handles.reader_make_constant_shell(makeString("MtTimeDimFn")), constant_handles.reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")));
  public static final SubLObject $const12$AnytimePSC = constant_handles.reader_make_constant_shell(makeString("AnytimePSC"));
  public static final SubLObject $const13$AnytimeDuringPSCFn = constant_handles.reader_make_constant_shell(makeString("AnytimeDuringPSCFn"));
  public static final SubLList $list14 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("MtSpace")), constant_handles.reader_make_constant_shell(makeString("MtDim")), constant_handles.reader_make_constant_shell(makeString("MtTimeDimFn")), constant_handles.reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")), constant_handles.reader_make_constant_shell(makeString("mtTimeIndex")), constant_handles.reader_make_constant_shell(makeString("mtTimeParameter")), constant_handles.reader_make_constant_shell(makeString("mtMonad")), constant_handles.reader_make_constant_shell(makeString("Always-TimeInterval")), constant_handles.reader_make_constant_shell(makeString("Null-TimeParameter")), constant_handles.reader_make_constant_shell(makeString("TimePoint"))});
  public static final SubLObject $const15$MtUnionFn = constant_handles.reader_make_constant_shell(makeString("MtUnionFn"));
  public static final SubLObject $const16$MtTimeWithGranularityDimFn = constant_handles.reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn"));
  public static final SubLObject $const17$MtTimeDimFn = constant_handles.reader_make_constant_shell(makeString("MtTimeDimFn"));
  public static final SubLSymbol $sym18$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym19$MT_UNION_MTS_RECURSIVE_INT = makeSymbol("MT-UNION-MTS-RECURSIVE-INT");
  public static final SubLSymbol $sym20$UNION_MT_RELEVANCE_CONTEXTS = makeSymbol("UNION-MT-RELEVANCE-CONTEXTS");
  public static final SubLObject $const21$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const22$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $sym23$ANYTIME_PSC_HLMT_ = makeSymbol("ANYTIME-PSC-HLMT?");
  public static final SubLSymbol $sym24$HLMT_MONAD_MT = makeSymbol("HLMT-MONAD-MT");
  public static final SubLObject $const25$MicrotheoryDimensionPredicate = constant_handles.reader_make_constant_shell(makeString("MicrotheoryDimensionPredicate"));
  public static final SubLList $list26 = list(list(makeSymbol("DIM-VAR"), makeSymbol("VAL-VAR"), makeSymbol("HLMT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list27 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw28$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw29$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym30$ARGS = makeUninternedSymbol("ARGS");
  public static final SubLSymbol $sym31$ARG = makeUninternedSymbol("ARG");
  public static final SubLSymbol $sym32$PCOND = makeSymbol("PCOND");
  public static final SubLSymbol $sym33$MONAD_MT_P = makeSymbol("MONAD-MT-P");
  public static final SubLSymbol $sym34$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLList $list35 = list(makeKeyword("MONAD"));
  public static final SubLSymbol $sym36$MT_DIM_NAUT_P = makeSymbol("MT-DIM-NAUT-P");
  public static final SubLSymbol $sym37$MT_DIM_NAT_DIMENSION = makeSymbol("MT-DIM-NAT-DIMENSION");
  public static final SubLSymbol $sym38$MT_SPACE_NAUT_P = makeSymbol("MT-SPACE-NAUT-P");
  public static final SubLSymbol $sym39$NAUT_ARGS = makeSymbol("NAUT-ARGS");
  public static final SubLSymbol $sym40$CSOME = makeSymbol("CSOME");
  public static final SubLSymbol $sym41$MT_DIMENSION_OF_ARG = makeSymbol("MT-DIMENSION-OF-ARG");
  public static final SubLSymbol $sym42$COR = makeSymbol("COR");
  public static final SubLSymbol $sym43$ANYTIME_PSC_P = makeSymbol("ANYTIME-PSC-P");
  public static final SubLSymbol $sym44$ANYTIME_DURING_PSC_FN_NAUT_P = makeSymbol("ANYTIME-DURING-PSC-FN-NAUT-P");
  public static final SubLList $list45 = list(makeKeyword("TIME"));
  public static final SubLSymbol $sym46$CLOSED_POSSIBLY_HLMT_P = makeSymbol("CLOSED-POSSIBLY-HLMT-P");
  public static final SubLList $list47 = list(makeKeyword("UNKNOWN"));
  public static final SubLSymbol $sym48$DO_MT_DIMENSIONS = makeSymbol("DO-MT-DIMENSIONS");
  public static final SubLSymbol $kw49$MONAD = makeKeyword("MONAD");
  public static final SubLSymbol $kw50$TIME = makeKeyword("TIME");
  public static final SubLSymbol $kw51$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLObject $const52$MtDim = constant_handles.reader_make_constant_shell(makeString("MtDim"));
  public static final SubLObject $const53$mtMonad = constant_handles.reader_make_constant_shell(makeString("mtMonad"));
  public static final SubLObject $const54$mtTimeIndex = constant_handles.reader_make_constant_shell(makeString("mtTimeIndex"));
  public static final SubLObject $const55$mtTimeParameter = constant_handles.reader_make_constant_shell(makeString("mtTimeParameter"));
  public static final SubLSymbol $sym56$INTERESTING_HLMT_ = makeSymbol("INTERESTING-HLMT?");
  public static final SubLSymbol $sym57$REDUCE_MT_UNION_HLMT_INT = makeSymbol("REDUCE-MT-UNION-HLMT-INT");
  public static final SubLSymbol $sym58$_REDUCE_MT_UNION_HLMT_INT_CACHING_STATE_ = makeSymbol("*REDUCE-MT-UNION-HLMT-INT-CACHING-STATE*");
  public static final SubLSymbol $sym59$CLEAR_REDUCE_MT_UNION_HLMT_INT = makeSymbol("CLEAR-REDUCE-MT-UNION-HLMT-INT");
  public static final SubLSymbol $kw60$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym61$MONAD_MT_ = makeSymbol("MONAD-MT?");
  public static final SubLObject $const62$Microtheory = constant_handles.reader_make_constant_shell(makeString("Microtheory"));
  public static final SubLList $list63 = list(constant_handles.reader_make_constant_shell(makeString("mtTimeIndex")), constant_handles.reader_make_constant_shell(makeString("mtTimeParameter")));
  public static final SubLObject $const64$TimeInterval = constant_handles.reader_make_constant_shell(makeString("TimeInterval"));
  public static final SubLObject $const65$TemporalThing = constant_handles.reader_make_constant_shell(makeString("TemporalThing"));
  public static final SubLObject $const66$TimeParameter = constant_handles.reader_make_constant_shell(makeString("TimeParameter"));
  public static final SubLObject $const67$SomeTimeInIntervalFn = constant_handles.reader_make_constant_shell(makeString("SomeTimeInIntervalFn"));
  public static final SubLSymbol $sym68$INDETERMINATE_TIME_INTERVAL_P = makeSymbol("INDETERMINATE-TIME-INTERVAL-P");
  public static final SubLString $str69$Continue_Anyway_ = makeString("Continue Anyway.");
  public static final SubLString $str70$We_should_never_test_two_some_tim = makeString("We should never test two some time conjuncts.");
  public static final SubLList $list71 = list(list(makeSymbol("TEMPORAL-OBJECT"), makeSymbol("TIME-PARAMETER")), makeSymbol("HLMT"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym72$CMULTIPLE_VALUE_SETQ = makeSymbol("CMULTIPLE-VALUE-SETQ");
  public static final SubLSymbol $sym73$MT_TIME_DIM_NAT_TEMPORAL_VALUES = makeSymbol("MT-TIME-DIM-NAT-TEMPORAL-VALUES");
  public static final SubLString $str74$DIM_NAT__a_is_not_a_microtheory_t = makeString("DIM-NAT ~a is not a microtheory time dimension NAT");
  public static final SubLSymbol $kw75$ERROR = makeKeyword("ERROR");
  public static final SubLList $list76 = list(list(makeSymbol("MONAD-MT"), makeSymbol("TEMPORAL-OBJECT"), makeSymbol("TIME-PARAMETER")), makeSymbol("HLMT"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym77$EXPLODE_HLMT_TEMPORAL_FACETS_WITH_DEFAULTS = makeSymbol("EXPLODE-HLMT-TEMPORAL-FACETS-WITH-DEFAULTS");
  public static final SubLSymbol $sym78$HLMT_MONAD_MT_WITHOUT_DEFAULT = makeSymbol("HLMT-MONAD-MT-WITHOUT-DEFAULT");
  public static final SubLSymbol $sym79$EXPLODE_HLMT_TEMPORAL_FACETS = makeSymbol("EXPLODE-HLMT-TEMPORAL-FACETS");
  public static final SubLList $list80 = list(NIL, NIL);
  public static final SubLList $list81 = list(makeSymbol("*DEFAULT-MT-TIME-INTERVAL*"), makeSymbol("*DEFAULT-TEMPORAL-MT-TIME-PARAMETER*"));
  public static final SubLSymbol $sym82$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym83$IGNORE = makeSymbol("IGNORE");
  public static final SubLList $list84 = list(makeSymbol("*DEFAULT-MT-TIME-INTERVAL*"));
  public static final SubLList $list85 = list(makeSymbol("*DEFAULT-ATEMPORAL-GENLMT-TIME-PARAMETER*"));
  public static final SubLList $list86 = list(makeSymbol("*DEFAULT-ATEMPORAL-SPECMT-TIME-PARAMETER*"));

  //// Initializers

  public void declareFunctions() {
    declare_hlmt_file();
  }

  public void initializeVariables() {
    init_hlmt_file();
  }

  public void runTopLevelForms() {
    setup_hlmt_file();
  }

}
