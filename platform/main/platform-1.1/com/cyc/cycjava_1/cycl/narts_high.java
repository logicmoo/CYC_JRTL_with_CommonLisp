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

package  com.cyc.cycjava_1.cycl;

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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.assertions_low;
import com.cyc.cycjava_1.cycl.canon_tl;
import com.cyc.cycjava_1.cycl.cardinality_estimates;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cyc_kernel;
import com.cyc.cycjava_1.cycl.cycl_grammar;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.czer_main;
import com.cyc.cycjava_1.cycl.czer_utilities;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.function_terms;
import com.cyc.cycjava_1.cycl.hash_table_utilities;
import com.cyc.cycjava_1.cycl.id_index;
import com.cyc.cycjava_1.cycl.kb_accessors;
import com.cyc.cycjava_1.cycl.kb_control_vars;
import com.cyc.cycjava_1.cycl.kb_hl_supports;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.kb_macros;
import com.cyc.cycjava_1.cycl.kb_mapping;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.nart_handles;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.transform_list_utilities;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.variables;

public  final class narts_high extends SubLTranslatedFile {

  //// Constructor

  private narts_high() {}
  public static final SubLFile me = new narts_high();
  public static final String myName = "com.cyc.cycjava_1.cycl.narts_high";

  //// Definitions

  public static final class $nart_hl_formula$UnaryFunction extends UnaryFunction {
    public $nart_hl_formula$UnaryFunction() { super(extractFunctionNamed("NART-HL-FORMULA")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10413"); }
  }

  /** Return T iff OBJECT is a datastructure implementing a non-atomic unreified term (NAUT).
   By definition, this satisies @xref CYCL-NAT-P but not @xref NART-P. */
  @SubL(source = "cycl/narts-high.lisp", position = 1723) 
  public static final SubLObject naut_p(SubLObject object) {
    if ((NIL != el_utilities.possibly_naut_p(object))) {
      return cycl_grammar.cycl_nat_p(object);
    }
    return NIL;
  }

  public static final class $find_nart$UnaryFunction extends UnaryFunction {
    public $find_nart$UnaryFunction() { super(extractFunctionNamed("FIND-NART")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10351"); }
  }


  /** Return the nart implementing NART-HL-FORMULA, or NIL if none is present.
   Substitutions for existing sub-NARTs are performed. */
  @SubL(source = "cycl/narts-high.lisp", position = 2539) 
  public static final SubLObject find_nart(SubLObject nart_hl_formula) {
    checkType(nart_hl_formula, $sym12$POSSIBLY_NAUT_P);
    {
      SubLObject nart = nart_substitute(nart_hl_formula);
      return ((NIL != nart_handles.nart_p(nart)) ? ((SubLObject) nart) : NIL);
    }
  }

  
  /** Remove all current NARTs which are are functions of FORT. */
  @SubL(source = "cycl/narts-high.lisp", position = 4097) 
  public static final SubLObject remove_dependent_narts(SubLObject fort) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(fort, $sym22$FORT_P);
      {
        SubLObject dependencies = kb_indexing.dependent_narts(fort);
        SubLObject cdolist_list_var = dependencies;
        SubLObject dependent = NIL;
        for (dependent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), dependent = cdolist_list_var.first()) {
          if ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30883"))) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
              if ((fort == dependent)) {
                Errors.error($str23$A_horrible_and_gross_circularity_, fort);
              }
            }
            cyc_kernel.cyc_kill(dependent);
          }
        }
      }
      return NIL;
    }
  }

  /** Recursively expand all NARTs in OBJECT into to their EL forms (NAUTs). */
  @SubL(source = "cycl/narts-high.lisp", position = 5461) 
  public static final SubLObject nart_expand(SubLObject object) {
    if ((NIL != list_utilities.tree_find_if(Symbols.symbol_function($sym0$NART_P), object, UNPROVIDED))) {
      object = transform_list_utilities.transform(object, Symbols.symbol_function($sym0$NART_P), Symbols.symbol_function($sym10$NART_EL_FORMULA), UNPROVIDED);
    }
    return object;
  }

  /** Substitute into OBJECT as many NARTs as possible.
   If the entire formula can be converted to a NART, it will.
   Returns OBJECT itself if no substitutions can be made. */
  @SubL(source = "cycl/narts-high.lisp", position = 5751) 
  public static final SubLObject nart_substitute(SubLObject object) {
    if ((NIL == el_utilities.possibly_naut_p(object))) {
      return object;
    }
    return nart_substitute_recursive(object);
  }


  @SubL(source = "cycl/narts-high.lisp", position = 6149) 
  public static final SubLObject nart_substitute_recursive(SubLObject tree) {
    if ((NIL != el_utilities.subl_escape_p(tree))) {
      return tree;
    }
    {
      SubLObject result = NIL;
      if ((NIL != contains_nat_formula_as_elementP(tree))) {
        {
          SubLObject new_tree = conses_high.copy_list(tree);
          SubLObject list = NIL;
          for (list = new_tree; (!(list.isAtom())); list = list.rest()) {
            {
              SubLObject arg = list.first();
              if ((NIL != function_terms.nat_formula_p(arg))) {
                {
                  SubLObject sub_nart = nart_substitute_recursive(arg);
                  if ((NIL != sub_nart)) {
                    ConsesLow.rplaca(list, sub_nart);
                  }
                }
              }
            }
          }
          result = new_tree;
        }
      } else {
        result = tree;
      }
      {
        SubLObject nart = nart_lookup(result);
        return ((NIL != nart_handles.nart_p(nart)) ? ((SubLObject) nart) : result);
      }
    }
  }



  /** @return boolean; t iff LIST contains at least one element
   that could be reified as a nart.  It does not consider whether
   LIST itself could be reified as a nart, and it does not
   look deeper than one level of nesting. */
  @SubL(source = "cycl/narts-high.lisp", position = 6735) 
  public static final SubLObject contains_nat_formula_as_elementP(SubLObject list) {
    {
      SubLObject rest = NIL;
      for (rest = list; (!(rest.isAtom())); rest = rest.rest()) {
        {
          SubLObject arg = rest.first();
          if ((NIL != function_terms.nat_formula_p(arg))) {
            return T;
          }
        }
      }
      return NIL;
    }
  }


  
  /** Return the NART implementing NART-HL-FORMULA, or NIL if none is present.
   No substitutions for sub-NARTs are performed. */
  @SubL(source = "cycl/narts-high.lisp", position = 1250) 
  public static final SubLObject nart_lookup(SubLObject nart_hl_formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == control_vars.$bootstrapping_kbP$.getDynamicValue(thread))) {
        {
          SubLObject functor = cycl_utilities.nat_functor(nart_hl_formula);
          if ((NIL == czer_utilities.reifiable_functorP(functor, UNPROVIDED))) {
            return NIL;
          }
        }
        if ((NIL == variables.fully_bound_p(nart_hl_formula))) {
          return NIL;
        }
      }
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 871");
    }
  }

  
  
  @SubL(source = "cycl/narts-high.lisp", position = 8177) 
  public static SubLSymbol $nart_dump_id_table$ = null;

  /** Return the NART with DUMP-ID during a KB load. */
  @SubL(source = "cycl/narts-high.lisp", position = 8520) 
  public static final SubLObject find_nart_by_dump_id(SubLObject dump_id) {
    return nart_handles.find_nart_by_id(dump_id);
  }

  public static final SubLObject declare_narts_high_file() {
    //declareFunction(myName, "nart_hl_formula", "NART-HL-FORMULA", 1, 0, false); new $nart_hl_formula$UnaryFunction();
    //declareFunction(myName, "nart_lookup", "NART-LOOKUP", 1, 0, false);
    declareFunction(myName, "naut_p", "NAUT-P", 1, 0, false);
    //declareFunction(myName, "invalid_nartP", "INVALID-NART?", 1, 1, false);
    //declareFunction(myName, "invalid_nart_robustP", "INVALID-NART-ROBUST?", 1, 0, false);
    //declareFunction(myName, "nart_el_formula", "NART-EL-FORMULA", 1, 0, false);
    //declareFunction(myName, "find_nart", "FIND-NART", 1, 0, false); new $find_nart$UnaryFunction();
    //declareFunction(myName, "random_nart", "RANDOM-NART", 0, 1, false);
    //declareFunction(myName, "hl_find_or_create_nart", "HL-FIND-OR-CREATE-NART", 1, 0, false);
    //declareFunction(myName, "tl_find_or_create_nart", "TL-FIND-OR-CREATE-NART", 1, 0, false);
    //declareFunction(myName, "find_or_create_nart", "FIND-OR-CREATE-NART", 1, 0, false);
    declareFunction(myName, "remove_dependent_narts", "REMOVE-DEPENDENT-NARTS", 1, 0, false);
    //declareFunction(myName, "remove_nart", "REMOVE-NART", 1, 0, false);
    declareFunction(myName, "nart_expand", "NART-EXPAND", 1, 0, false);
    declareFunction(myName, "nart_substitute", "NART-SUBSTITUTE", 1, 0, false);
    //declareFunction(myName, "nart_substitute_recursive", "NART-SUBSTITUTE-RECURSIVE", 1, 0, false);
    ////declareFunction(myName, "contains_nat_formula_as_elementP", "CONTAINS-NAT-FORMULA-AS-ELEMENT?", 1, 0, false);
    //declareFunction(myName, "nart_with_functor_p", "NART-WITH-FUNCTOR-P", 2, 0, false);
    //declareFunction(myName, "nart_checkpoint_p", "NART-CHECKPOINT-P", 1, 0, false);
    //declareFunction(myName, "new_nart_checkpoint", "NEW-NART-CHECKPOINT", 0, 0, false);
    //declareFunction(myName, "nart_checkpoint_currentP", "NART-CHECKPOINT-CURRENT?", 1, 0, false);
    //declareFunction(myName, "nart_dump_id", "NART-DUMP-ID", 1, 0, false);
    declareFunction(myName, "find_nart_by_dump_id", "FIND-NART-BY-DUMP-ID", 1, 0, false);
    //declareMacro(myName, "with_nart_dump_id_table", "WITH-NART-DUMP-ID-TABLE");
    //declareFunction(myName, "useful_nartP", "USEFUL-NART?", 1, 0, false);
    //declareFunction(myName, "useless_nartP", "USELESS-NART?", 1, 0, false);
    //declareFunction(myName, "nart_specified_to_be_retainedP", "NART-SPECIFIED-TO-BE-RETAINED?", 1, 0, false);
    //declareFunction(myName, "skolemize_forward_nartP", "SKOLEMIZE-FORWARD-NART?", 1, 0, false);
    //declareFunction(myName, "nart_independent_assertions", "NART-INDEPENDENT-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "nart_independent_assertions_internal", "NART-INDEPENDENT-ASSERTIONS-INTERNAL", 1, 0, false);
    //declareFunction(myName, "nart_id_from_recipe", "NART-ID-FROM-RECIPE", 1, 0, false);
    //declareFunction(myName, "nart_knows_its_hl_formulaP", "NART-KNOWS-ITS-HL-FORMULA?", 1, 0, false);
    //declareFunction(myName, "all_narts_know_their_hl_formulasP", "ALL-NARTS-KNOW-THEIR-HL-FORMULAS?", 0, 0, false);
    //declareFunction(myName, "narts_that_dont_know_their_hl_formulas", "NARTS-THAT-DONT-KNOW-THEIR-HL-FORMULAS", 0, 0, false);
    //declareFunction(myName, "nart_findable_by_hl_formulaP", "NART-FINDABLE-BY-HL-FORMULA?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_narts_high_file() {
    $nart_dump_id_table$ = defparameter("*NART-DUMP-ID-TABLE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_narts_high_file() {
    // CVS_ID("Id: narts-high.lisp 126735 2008-12-22 23:55:19Z goolsbey ");
    utilities_macros.register_cyc_api_function($sym1$NART_HL_FORMULA, $list2, $str3$Return_the_hl_formula_of_this_NAR, $list4, $list5);
    utilities_macros.register_cyc_api_function($sym6$NAUT_P, $list7, $str8$Return_T_iff_OBJECT_is_a_datastru, NIL, $list9);
    utilities_macros.register_cyc_api_function($sym10$NART_EL_FORMULA, $list2, $str11$Return_the_el_formula_of_this_NAR, $list4, $list5);
    utilities_macros.register_cyc_api_function($sym14$RANDOM_NART, $list15, $str16$Return_a_randomly_chosen_NART_tha, NIL, $list17);
    access_macros.define_obsolete_register($sym18$HL_FIND_OR_CREATE_NART, $list19);
    access_macros.define_obsolete_register($sym20$FIND_OR_CREATE_NART, $list21);
    utilities_macros.register_cyc_api_function($sym24$REMOVE_NART, $list2, $str25$Remove_NART_from_the_KB_, $list4, $list26);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$NART_P = makeSymbol("NART-P");
  public static final SubLSymbol $sym1$NART_HL_FORMULA = makeSymbol("NART-HL-FORMULA");
  public static final SubLList $list2 = list(makeSymbol("NART"));
  public static final SubLString $str3$Return_the_hl_formula_of_this_NAR = makeString("Return the hl formula of this NART.");
  public static final SubLList $list4 = list(list(makeSymbol("NART"), makeSymbol("NART-P")));
  public static final SubLList $list5 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSP")));
  public static final SubLSymbol $sym6$NAUT_P = makeSymbol("NAUT-P");
  public static final SubLList $list7 = list(makeSymbol("OBJECT"));
  public static final SubLString $str8$Return_T_iff_OBJECT_is_a_datastru = makeString("Return T iff OBJECT is a datastructure implementing a non-atomic unreified term (NAUT).\n   By definition, this satisies @xref CYCL-NAT-P but not @xref NART-P.");
  public static final SubLList $list9 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym10$NART_EL_FORMULA = makeSymbol("NART-EL-FORMULA");
  public static final SubLString $str11$Return_the_el_formula_of_this_NAR = makeString("Return the el formula of this NART.");
  public static final SubLSymbol $sym12$POSSIBLY_NAUT_P = makeSymbol("POSSIBLY-NAUT-P");
  public static final SubLSymbol $sym13$TRUE = makeSymbol("TRUE");
  public static final SubLSymbol $sym14$RANDOM_NART = makeSymbol("RANDOM-NART");
  public static final SubLList $list15 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("FUNCTION"), makeSymbol("TRUE"))));
  public static final SubLString $str16$Return_a_randomly_chosen_NART_tha = makeString("Return a randomly chosen NART that satisfies TEST");
  public static final SubLList $list17 = list(makeSymbol("NART-P"));
  public static final SubLSymbol $sym18$HL_FIND_OR_CREATE_NART = makeSymbol("HL-FIND-OR-CREATE-NART");
  public static final SubLList $list19 = list(makeSymbol("CYC-FIND-OR-CREATE-NART"));
  public static final SubLSymbol $sym20$FIND_OR_CREATE_NART = makeSymbol("FIND-OR-CREATE-NART");
  public static final SubLList $list21 = list(makeSymbol("HL-FIND-OR-CREATE-NART"));
  public static final SubLSymbol $sym22$FORT_P = makeSymbol("FORT-P");
  public static final SubLString $str23$A_horrible_and_gross_circularity_ = makeString("A horrible and gross circularity has occurred -- ~s is a dependent of itself!");
  public static final SubLSymbol $sym24$REMOVE_NART = makeSymbol("REMOVE-NART");
  public static final SubLString $str25$Remove_NART_from_the_KB_ = makeString("Remove NART from the KB.");
  public static final SubLList $list26 = list(makeSymbol("NULL"));
  public static final SubLSymbol $sym27$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLList $list28 = list(makeSymbol("CHECKPOINT-COUNT"), makeSymbol("CHECKPOINT-NEXT-ID"));
  public static final SubLSymbol $sym29$CLET = makeSymbol("CLET");
  public static final SubLList $list30 = list(list(makeSymbol("*NART-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-NART-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-NART-HANDLE-FUNC*"), list(makeSymbol("QUOTE"), makeSymbol("NART-DUMP-ID"))));
  public static final SubLSymbol $sym31$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const32$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym33$NART_INDEPENDENT_ASSERTIONS_INTERNAL = makeSymbol("NART-INDEPENDENT-ASSERTIONS-INTERNAL");
  public static final SubLString $str34$Looking_for_bad_narts = makeString("Looking for bad narts");
  public static final SubLSymbol $sym35$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw36$SKIP = makeKeyword("SKIP");
  public static final SubLList $list37 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

  //// Initializers

  public void declareFunctions() {
    declare_narts_high_file();
  }

  public void initializeVariables() {
    init_narts_high_file();
  }

  public void runTopLevelForms() {
    setup_narts_high_file();
  }

}
