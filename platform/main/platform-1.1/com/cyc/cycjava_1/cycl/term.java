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
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.collection_defns;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.uncanonicalizer;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;
//dm import com.cyc.cycjava_1.cycl.wff;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class term extends SubLTranslatedFile {

  //// Constructor

  private term() {}
  public static final SubLFile me = new term();
  public static final String myName = "com.cyc.cycjava_1.cycl.term";

  //// Definitions

  /** Returns t iff OBJECT is a fort or an EL formula. */
  @SubL(source = "cycl/term.lisp", position = 581) 
  public static final SubLObject el_fort_p(SubLObject object) {
    return makeBoolean(((NIL != forts.fort_p(object))
          || (NIL == object)
          || (NIL != el_utilities.el_formula_p(object))));
  }

  @SubL(source = "cycl/term.lisp", position = 1011) 
  public static final SubLObject kb_assertionP(SubLObject object) {
    return assertion_handles.assertion_p(object);
  }

  public static final class $kb_assertionP$UnaryFunction extends UnaryFunction {
    public $kb_assertionP$UnaryFunction() { super(extractFunctionNamed("KB-ASSERTION?")); }
    public SubLObject processItem(SubLObject arg1) { return kb_assertionP(arg1); }
  }

  @SubL(source = "cycl/term.lisp", position = 1295) 
  public static final SubLObject kb_predicateP(SubLObject symbol) {
    if ((NIL != forts.fort_p(symbol))) {
      return fort_types_interface.predicateP(symbol);
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31575");
    }
  }

  @SubL(source = "cycl/term.lisp", position = 1490) 
  public static final SubLObject mt_designating_relationP(SubLObject v_term) {
    return makeBoolean(((NIL != forts.fort_p(v_term))
           && (NIL != fort_types_interface.microtheory_designating_relation_p(v_term))));
  }

  @SubL(source = "cycl/term.lisp", position = 2463) 
  public static final SubLObject kb_relationP(SubLObject object) {
    if ((NIL != forts.fort_p(object))) {
      return kb_accessors.relationP(object);
    } else if ((NIL != nautP(object, UNPROVIDED))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3707");
    }
    return NIL;
  }

  /** e.g. (#$SKF-1234 #$Muffet) */
  @SubL(source = "cycl/term.lisp", position = 2690) 
  public static final SubLObject reified_skolem_termP(SubLObject v_term) {
    return makeBoolean(((NIL != el_utilities.el_formula_p(v_term))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31573"))));
  }

  public static final class $reified_skolem_constant_termP$UnaryFunction extends UnaryFunction {
    public $reified_skolem_constant_termP$UnaryFunction() { super(extractFunctionNamed("REIFIED-SKOLEM-CONSTANT-TERM?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31571"); }
  }

  public static final class $skolem_constantP$UnaryFunction extends UnaryFunction {
    public $skolem_constantP$UnaryFunction() { super(extractFunctionNamed("SKOLEM-CONSTANT?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31577"); }
  }

  @SubL(source = "cycl/term.lisp", position = 3544) 
  public static final SubLObject reified_skolem_fn_in_any_mtP(SubLObject fn, SubLObject robustP, SubLObject assumeP) {
    if ((robustP == UNPROVIDED)) {
      robustP = NIL;
    }
    if ((assumeP == UNPROVIDED)) {
      assumeP = NIL;
    }
    if ((NIL != forts.fort_p(fn))) {
      return makeBoolean(((NIL != fort_types_interface.skolem_function_p(fn))
            || (NIL != ((NIL != robustP) ? ((SubLObject) kb_mapping_utilities.pred_u_v_holds_in_any_mt($const8$isa, fn, $const9$SkolemFuncN, UNPROVIDED, UNPROVIDED, UNPROVIDED)) : NIL))
            || (NIL != ((NIL != robustP) ? ((SubLObject) kb_mapping_utilities.pred_u_v_holds_in_any_mt($const8$isa, fn, $const10$SkolemFunction, UNPROVIDED, UNPROVIDED, UNPROVIDED)) : NIL))
            || (NIL != ((NIL != assumeP) ? ((SubLObject) ((NIL != sbhl_links.any_sbhl_predicate_links_p(fn, $const8$isa)) ? ((SubLObject) NIL) : has_skolem_nameP(fn))) : NIL))));
    }
    return NIL;
  }

  @SubL(source = "cycl/term.lisp", position = 4046) 
  public static final SubLObject has_skolem_nameP(SubLObject fort) {
    if ((NIL != constant_handles.constant_p(fort))) {
      {
        SubLObject name = constants_high.constant_name(fort);
        if (name.isString()) {
          return string_utilities.starts_with(name, $str11$SKF);
        }
      }
    } else if ((NIL != nart_handles.nart_p(fort))) {
      return has_skolem_nameP(cycl_utilities.nat_functor(fort));
    }
    return NIL;
  }

  @SubL(source = "cycl/term.lisp", position = 4290) 
  public static final SubLObject fast_reified_skolemP(SubLObject fort) {
    if ((NIL != nart_handles.nart_p(fort))) {
      return fast_reified_skolemP(cycl_utilities.nat_functor(fort));
    } else if ((NIL != constant_handles.constant_p(fort))) {
      if ((NIL != has_skolem_nameP(fort))) {
        return reified_skolem_fn_in_any_mtP(fort, UNPROVIDED, UNPROVIDED);
      }
    }
    return NIL;
  }

  public static final class $fast_reified_skolemP$UnaryFunction extends UnaryFunction {
    public $fast_reified_skolemP$UnaryFunction() { super(extractFunctionNamed("FAST-REIFIED-SKOLEM?")); }
    public SubLObject processItem(SubLObject arg1) { return fast_reified_skolemP(arg1); }
  }

  /** Like @xref skolem-nart except this assumes that all skolem functions begin with SKF. */
  @SubL(source = "cycl/term.lisp", position = 4765) 
  public static final SubLObject fast_skolem_nartP(SubLObject v_term) {
    if ((NIL != nart_handles.nart_p(v_term))) {
      {
        SubLObject functor = cycl_utilities.nat_functor(v_term);
        if ((NIL != has_skolem_nameP(functor))) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31578");
        }
      }
    }
    return NIL;
  }

  /** Like @xref skolem-nart except this assumes that all skolem functions begin with SKF. */
  @SubL(source = "cycl/term.lisp", position = 5318) 
  public static final SubLObject fast_skolem_natP(SubLObject v_term) {
    return makeBoolean(((NIL != fast_skolem_nartP(v_term))
          || ((NIL != narts_high.naut_p(v_term))
             && (NIL != has_skolem_nameP(cycl_utilities.nat_functor(v_term))))));
  }

  public static final class $fast_skolem_natP$UnaryFunction extends UnaryFunction {
    public $fast_skolem_natP$UnaryFunction() { super(extractFunctionNamed("FAST-SKOLEM-NAT?")); }
    public SubLObject processItem(SubLObject arg1) { return fast_skolem_natP(arg1); }
  }

  @SubL(source = "cycl/term.lisp", position = 5672) 
  public static final SubLObject unreified_skolem_termP(SubLObject v_term) {
    return unreified_skolem_fn_termP(v_term);
  }

  public static final class $unreified_skolem_termP$UnaryFunction extends UnaryFunction {
    public $unreified_skolem_termP$UnaryFunction() { super(extractFunctionNamed("UNREIFIED-SKOLEM-TERM?")); }
    public SubLObject processItem(SubLObject arg1) { return unreified_skolem_termP(arg1); }
  }

  @SubL(source = "cycl/term.lisp", position = 5760) 
  public static final SubLObject unreified_skolem_fn_termP(SubLObject v_term) {
    if (((NIL != list_utilities.proper_list_p(v_term))
         && Sequences.length(v_term).numGE(FOUR_INTEGER)
         && Sequences.length(v_term).numLE(FIVE_INTEGER))) {
      {
        SubLObject datum = v_term;
        SubLObject current = datum;
        SubLObject fn = NIL;
        SubLObject var_list = NIL;
        SubLObject var = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list12);
        fn = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list12);
        var_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list12);
        var = current.first();
        current = current.rest();
        {
          SubLObject seqvar = (current.isCons() ? ((SubLObject) current.first()) : NIL);
          cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list12);
          current = current.rest();
          {
            SubLObject num = (current.isCons() ? ((SubLObject) current.first()) : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list12);
            current = current.rest();
            if ((NIL == current)) {
              return makeBoolean(((NIL != skolem_fn_functionP(fn))
                     && var_list.isList()
                     && (NIL != cycl_variables.el_varP(var))));
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list12);
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/term.lisp", position = 6254) 
  public static final SubLObject skolem_fn_functionP(SubLObject symbol) {
    return subl_promotions.memberP(symbol, czer_vars.$skolem_function_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/term.lisp", position = 6353) 
  public static final SubLObject ground_nautP(SubLObject naut, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym13$CYC_VAR_);
    }
    if (((NIL != el_utilities.possibly_naut_p(naut))
         && (NIL == el_utilities.sequence_var(naut, UNPROVIDED))
         && (NIL == list_utilities.cons_tree_find_if(varP, naut, UNPROVIDED)))) {
      return nautP(naut, varP);
    }
    return NIL;
  }

  /** @return booleanp; whether OBJECT is a naut which is ground at the HL,
i.e. contains no HL variables. */
  @SubL(source = "cycl/term.lisp", position = 6626) 
  public static final SubLObject hl_ground_nautP(SubLObject object) {
    return ground_nautP(object, Symbols.symbol_function($sym14$VARIABLE_P));
  }

  @SubL(source = "cycl/term.lisp", position = 6816) 
  public static final SubLObject closed_nautP(SubLObject object, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym13$CYC_VAR_);
    }
    return makeBoolean(((NIL != nautP(object, varP))
           && (NIL != el_utilities.closedP(object, varP))));
  }

  public static final class $closed_nautP$UnaryFunction extends UnaryFunction {
    public $closed_nautP$UnaryFunction() { super(extractFunctionNamed("CLOSED-NAUT?")); }
    public SubLObject processItem(SubLObject arg1) { return closed_nautP(arg1, UNPROVIDED); }
  }

  public static final class $closed_nautP$BinaryFunction extends BinaryFunction {
    public $closed_nautP$BinaryFunction() { super(extractFunctionNamed("CLOSED-NAUT?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return closed_nautP(arg1, arg2); }
  }

  /** is <object> a first-order non-atomic unreified term? */
  @SubL(source = "cycl/term.lisp", position = 7215) 
  public static final SubLObject first_order_nautP(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.possibly_naut_p(object))
           && (NIL != fort_types_interface.non_predicate_functionP(cycl_utilities.nat_functor(object)))));
  }

  @SubL(source = "cycl/term.lisp", position = 7490) 
  public static final SubLObject nautP(SubLObject nat, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym15$EL_VAR_);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != el_utilities.possibly_naut_p(nat))) {
        {
          SubLObject functor = cycl_utilities.nat_functor(nat);
          SubLObject nautP = Functions.funcall(varP, functor);
          if ((NIL == nautP)) {
            {
              SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
              SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
              try {
                mt_relevance_macros.$relevant_mt_function$.bind($sym16$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($const17$EverythingPSC, thread);
                nautP = makeBoolean(((NIL != fort_types_interface.non_predicate_functionP(functor))
                      || (NIL != ((NIL != forts.fort_p(functor)) ? ((SubLObject) NIL) : Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31568")))));
              } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
              }
            }
          }
          return nautP;
        }
      }
      return NIL;
    }
  }

  /** @return boolean; t iff TERM is a nat. */
  @SubL(source = "cycl/term.lisp", position = 8282) 
  public static final SubLObject function_termP(SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((((NIL != relation_syntaxP(v_term, UNPROVIDED))
               && ((NIL != cycl_variables.cyc_varP(cycl_utilities.nat_functor(v_term)))
                || (NIL != function_symbolP(cycl_utilities.nat_functor(v_term))))
               && ((NIL == wff_vars.$within_wffP$.getDynamicValue(thread))
                || (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31567"))))
            || (NIL != cycl_utilities.find_ground_naut(v_term))));
    }
  }


  @SubL(source = "cycl/term.lisp", position = 8670) 
  public static final SubLObject function_symbolP(SubLObject symbol) {
    if ((NIL != forts.fort_p(symbol))) {
      return fort_types_interface.functionP(symbol);
    } else {
      return represented_first_order_termP(symbol);
    }
  }

  @SubL(source = "cycl/term.lisp", position = 1669) 
  public static final SubLObject represented_first_order_termP(SubLObject v_term) {
    if ((NIL != v_term)) {
      return makeBoolean(((NIL != forts.fort_p(v_term))
            || (NIL != cycl_variables.el_varP(v_term))
            || (NIL != function_termP(v_term))));
    }
    return NIL;
  }


  @SubL(source = "cycl/term.lisp", position = 9173) 
  public static final SubLObject sentenceP(SubLObject formula, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym15$EL_VAR_);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != el_utilities.possibly_sentence_p(formula))) {
        {
          SubLObject predicate = cycl_utilities.formula_arg0(formula);
          SubLObject sentenceP = Functions.funcall(varP, predicate);
          if ((NIL == sentenceP)) {
            {
              SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
              SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
              try {
                mt_relevance_macros.$relevant_mt_function$.bind($sym16$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($const17$EverythingPSC, thread);
                sentenceP = makeBoolean(((NIL != fort_types_interface.sentential_relation_p(predicate))
                      || (NIL != fort_types_interface.predicateP(predicate))
                      || (NIL != fort_types_interface.isa_predicateP(predicate, UNPROVIDED))));
              } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
              }
            }
          }
          return sentenceP;
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/term.lisp", position = 11922) 
  public static final SubLObject relation_syntaxP(SubLObject v_term, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym13$CYC_VAR_);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((((NIL != czer_vars.$el_supports_dot_syntaxP$.getDynamicValue(thread))
               && (NIL != dotted_argsP(v_term, varP))
               && (NIL != el_utilities.wf_wrt_sequence_varsP(v_term)))
            || (NIL != list_utilities.proper_list_p(v_term))));
    }
  }

  @SubL(source = "cycl/term.lisp", position = 12185) 
  public static final SubLObject dotted_argsP(SubLObject args, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym13$CYC_VAR_);
    }
    if (args.isCons()) {
      {
        SubLObject cdr = args.rest();
        if (cdr.isCons()) {
          return dotted_argsP(cdr, varP);
        } else if ((NIL == cdr)) {
          return NIL;
        } else {
          return Functions.funcall(varP, cdr);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/term.lisp", position = 12977) 
  public static final SubLObject var_specP(SubLObject object) {
    return makeBoolean(((NIL != cycl_variables.el_varP(object))
          || (NIL != cycl_variables.kb_varP(object))
          || (NIL != cycl_variables.permissible_keyword_varP(object))
          || (NIL != cycl_variables.generic_arg_varP(object))
          || (NIL != unreified_skolem_termP(object))));
  }

  public static final class $var_specP$UnaryFunction extends UnaryFunction {
    public $var_specP$UnaryFunction() { super(extractFunctionNamed("VAR-SPEC?")); }
    public SubLObject processItem(SubLObject arg1) { return var_specP(arg1); }
  }

  public static final SubLObject declare_term_file() {
    declareFunction(myName, "el_fort_p", "EL-FORT-P", 1, 0, false);
    declareFunction(myName, "kb_assertionP", "KB-ASSERTION?", 1, 0, false); new $kb_assertionP$UnaryFunction();
    declareFunction(myName, "lisp_itemP", "LISP-ITEM?", 1, 0, false);
    declareFunction(myName, "kb_predicateP", "KB-PREDICATE?", 1, 0, false);
    declareFunction(myName, "mt_designating_relationP", "MT-DESIGNATING-RELATION?", 1, 0, false);
    declareFunction(myName, "represented_first_order_termP", "REPRESENTED-FIRST-ORDER-TERM?", 1, 0, false);
    declareFunction(myName, "hl_term_p", "HL-TERM-P", 1, 0, false);
    declareFunction(myName, "first_order_termP", "FIRST-ORDER-TERM?", 1, 0, false);
    declareFunction(myName, "second_order_termP", "SECOND-ORDER-TERM?", 1, 1, false);
    declareFunction(myName, "kb_relationP", "KB-RELATION?", 1, 0, false);
    declareFunction(myName, "reified_skolem_termP", "REIFIED-SKOLEM-TERM?", 1, 0, false);
    declareFunction(myName, "reified_skolem_constant_termP", "REIFIED-SKOLEM-CONSTANT-TERM?", 1, 0, false); new $reified_skolem_constant_termP$UnaryFunction();
    declareFunction(myName, "skolem_constantP", "SKOLEM-CONSTANT?", 1, 0, false); new $skolem_constantP$UnaryFunction();
    declareFunction(myName, "reified_skolem_function_termP", "REIFIED-SKOLEM-FUNCTION-TERM?", 1, 0, false);
    declareFunction(myName, "reified_skolem_fnP", "REIFIED-SKOLEM-FN?", 1, 0, false);
    declareFunction(myName, "reified_skolem_fn_in_any_mtP", "REIFIED-SKOLEM-FN-IN-ANY-MT?", 1, 2, false);
    declareFunction(myName, "has_skolem_nameP", "HAS-SKOLEM-NAME?", 1, 0, false);
    declareFunction(myName, "fast_reified_skolemP", "FAST-REIFIED-SKOLEM?", 1, 0, false); new $fast_reified_skolemP$UnaryFunction();
    declareFunction(myName, "skolem_nartP", "SKOLEM-NART?", 1, 0, false);
    declareFunction(myName, "fast_skolem_nartP", "FAST-SKOLEM-NART?", 1, 0, false);
    declareFunction(myName, "fast_skolem_natP", "FAST-SKOLEM-NAT?", 1, 0, false); new $fast_skolem_natP$UnaryFunction();
    declareFunction(myName, "skolem_termP", "SKOLEM-TERM?", 1, 0, false);
    declareFunction(myName, "unreified_skolem_termP", "UNREIFIED-SKOLEM-TERM?", 1, 0, false); new $unreified_skolem_termP$UnaryFunction();
    declareFunction(myName, "unreified_skolem_fn_termP", "UNREIFIED-SKOLEM-FN-TERM?", 1, 0, false);
    declareFunction(myName, "unreified_skolem_term_vars", "UNREIFIED-SKOLEM-TERM-VARS", 1, 0, false);
    declareFunction(myName, "skolem_fn_functionP", "SKOLEM-FN-FUNCTION?", 1, 0, false);
    declareFunction(myName, "ground_nautP", "GROUND-NAUT?", 1, 1, false);
    declareFunction(myName, "hl_ground_nautP", "HL-GROUND-NAUT?", 1, 0, false);
    declareFunction(myName, "closed_nautP", "CLOSED-NAUT?", 1, 1, false); new $closed_nautP$UnaryFunction(); new $closed_nautP$BinaryFunction();
    declareFunction(myName, "open_nautP", "OPEN-NAUT?", 1, 1, false);
    declareFunction(myName, "unground_nautP", "UNGROUND-NAUT?", 1, 1, false);
    declareFunction(myName, "first_order_nautP", "FIRST-ORDER-NAUT?", 1, 0, false);
    declareFunction(myName, "kb_nautP", "KB-NAUT?", 1, 1, false);
    declareFunction(myName, "nautP", "NAUT?", 1, 1, false);
    declareFunction(myName, "meta_functionP", "META-FUNCTION?", 1, 1, false);
    declareFunction(myName, "function_termP", "FUNCTION-TERM?", 1, 0, false);
    declareFunction(myName, "function_symbolP", "FUNCTION-SYMBOL?", 1, 0, false);
    declareFunction(myName, "memoized_valid_fn_term_wrt_nestingP_internal", "MEMOIZED-VALID-FN-TERM-WRT-NESTING?-INTERNAL", 1, 0, false);
    declareFunction(myName, "memoized_valid_fn_term_wrt_nestingP", "MEMOIZED-VALID-FN-TERM-WRT-NESTING?", 1, 0, false);
    declareFunction(myName, "valid_fn_term_wrt_nestingP", "VALID-FN-TERM-WRT-NESTING?", 1, 0, false);
    declareFunction(myName, "sentenceP", "SENTENCE?", 1, 1, false);
    declareFunction(myName, "first_order_formula_p", "FIRST-ORDER-FORMULA-P", 1, 0, false);
    declareFunction(myName, "formula_with_constant_operator_p", "FORMULA-WITH-CONSTANT-OPERATOR-P", 1, 0, false);
    declareFunction(myName, "formula_with_non_constant_operator_p", "FORMULA-WITH-NON-CONSTANT-OPERATOR-P", 1, 0, false);
    declareFunction(myName, "first_order_clause_p", "FIRST-ORDER-CLAUSE-P", 1, 0, false);
    declareFunction(myName, "first_order_assertion_p", "FIRST-ORDER-ASSERTION-P", 1, 0, false);
    declareFunction(myName, "higher_order_formula_p", "HIGHER-ORDER-FORMULA-P", 1, 0, false);
    declareFunction(myName, "higher_order_clause_p", "HIGHER-ORDER-CLAUSE-P", 1, 0, false);
    declareFunction(myName, "higher_order_assertion_p", "HIGHER-ORDER-ASSERTION-P", 1, 0, false);
    declareFunction(myName, "relation_syntaxP", "RELATION-SYNTAX?", 1, 1, false);
    declareFunction(myName, "dotted_argsP", "DOTTED-ARGS?", 1, 1, false);
    declareFunction(myName, "scalar_termP", "SCALAR-TERM?", 1, 1, false);
    declareFunction(myName, "ground_fn_termP", "GROUND-FN-TERM?", 1, 0, false);
    declareFunction(myName, "closed_fn_termP", "CLOSED-FN-TERM?", 1, 0, false);
    declareFunction(myName, "closed_functional_expressionP", "CLOSED-FUNCTIONAL-EXPRESSION?", 1, 0, false);
    declareFunction(myName, "var_specP", "VAR-SPEC?", 1, 0, false); new $var_specP$UnaryFunction();
    declareFunction(myName, "termP", "TERM?", 1, 1, false);
    declareFunction(myName, "ground_termP", "GROUND-TERM?", 1, 1, false);
    declareFunction(myName, "closed_termP", "CLOSED-TERM?", 1, 1, false);
    declareFunction(myName, "open_termP", "OPEN-TERM?", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_term_file() {
    return NIL;
  }

  public static final SubLObject setup_term_file() {
    // CVS_ID("Id: term.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym0$EL_FORT_P, $list1, $str2$Returns_t_iff_OBJECT_is_a_fort_or, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym4$HL_TERM_P, $list5, $str6$Returns_T_if_the_OBJ_is_a_valid_C, NIL, $list3);
    memoization_state.note_memoized_function($sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$EL_FORT_P = makeSymbol("EL-FORT-P");
  public static final SubLList $list1 = list(makeSymbol("OBJECT"));
  public static final SubLString $str2$Returns_t_iff_OBJECT_is_a_fort_or = makeString("Returns t iff OBJECT is a fort or an EL formula.");
  public static final SubLList $list3 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym4$HL_TERM_P = makeSymbol("HL-TERM-P");
  public static final SubLList $list5 = list(makeSymbol("OBJ"));
  public static final SubLString $str6$Returns_T_if_the_OBJ_is_a_valid_C = makeString("Returns T if the OBJ is a valid CycL HL term.");
  public static final SubLObject $const7$Relation = constant_handles.reader_make_constant_shell(makeString("Relation"));
  public static final SubLObject $const8$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const9$SkolemFuncN = constant_handles.reader_make_constant_shell(makeString("SkolemFuncN"));
  public static final SubLObject $const10$SkolemFunction = constant_handles.reader_make_constant_shell(makeString("SkolemFunction"));
  public static final SubLString $str11$SKF = makeString("SKF");
  public static final SubLList $list12 = list(makeSymbol("FN"), makeSymbol("VAR-LIST"), makeSymbol("VAR"), makeSymbol("&OPTIONAL"), makeSymbol("SEQVAR"), makeSymbol("NUM"));
  public static final SubLSymbol $sym13$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLSymbol $sym14$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLSymbol $sym15$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym16$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const17$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const18$Function_Denotational = constant_handles.reader_make_constant_shell(makeString("Function-Denotational"));
  public static final SubLSymbol $sym19$MEMOIZED_VALID_FN_TERM_WRT_NESTING_ = makeSymbol("MEMOIZED-VALID-FN-TERM-WRT-NESTING?");
  public static final SubLSymbol $kw20$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $kw21$MAL_FN_NESTING = makeKeyword("MAL-FN-NESTING");
  public static final SubLSymbol $sym22$FORMULA_WITH_NON_CONSTANT_OPERATOR_P = makeSymbol("FORMULA-WITH-NON-CONSTANT-OPERATOR-P");
  public static final SubLSymbol $kw23$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw24$POS = makeKeyword("POS");
  public static final SubLObject $const25$ScalarInterval = constant_handles.reader_make_constant_shell(makeString("ScalarInterval"));
  public static final SubLSymbol $sym26$VAR_SPEC_ = makeSymbol("VAR-SPEC?");

  //// Initializers

  public void declareFunctions() {
    declare_term_file();
  }

  public void initializeVariables() {
    init_term_file();
  }

  public void runTopLevelForms() {
    setup_term_file();
  }

}
