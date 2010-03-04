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
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.wff_macros;

public  final class wff_vars extends SubLTranslatedFile {

  //// Constructor

  private wff_vars() {}
  public static final SubLFile me = new wff_vars();
  public static final String myName = "com.cyc.cycjava.cycl.wff_vars";

  //// Definitions

  /** A dictionary mapping WFF property keywords to a list of the form (<corresponding variable> <default value>).
   Initialized via @xref defparameter-wff. */
  @SubL(source = "cycl/wff-vars.lisp", position = 931) 
  private static SubLSymbol $wff_properties_table$ = null;

  @SubL(source = "cycl/wff-vars.lisp", position = 1205) 
  public static final SubLObject wff_properties_table() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $wff_properties_table$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/wff-vars.lisp", position = 1279) 
  public static final SubLObject note_wff_property(SubLObject keyword, SubLObject variable, SubLObject v_default) {
    return dictionary.dictionary_enter(wff_properties_table(), keyword, list(variable, v_default));
  }

  /** Dynamically bound to the user-specified WFF properties */
  @SubL(source = "cycl/wff-vars.lisp", position = 1798) 
  public static SubLSymbol $wff_properties$ = null;

  /** The primary way WFF will handle constraints.
   :strict -- WFF rejects sentences if they do not provably meet arg constraints.
              Colloquially known as 'bitchy gatekeeper' mode.
   :lenient -- WFF rejects sentences if they are disjoint with arg constraints,
               but does not add the provable consequences to the KB */
  @SubL(source = "cycl/wff-vars.lisp", position = 2040) 
  public static SubLSymbol $wff_mode$ = null;

  /** Should WFF print out debugging messages during its computation?  Setting or binding this to T
can be useful when trying to figure out why WFF is rejecting something and why-not-wff is not yielding a useful result. */
  @SubL(source = "cycl/wff-vars.lisp", position = 2548) 
  public static SubLSymbol $wff_debugP$ = null;

  /** require that constants referenced by a formula be valid for the formula to be valid? */
  @SubL(source = "cycl/wff-vars.lisp", position = 2874) 
  public static SubLSymbol $validate_constantsP$ = null;

  /** do not impose arg-type constraints on variables? */
  @SubL(source = "cycl/wff-vars.lisp", position = 3028) 
  public static SubLSymbol $recognize_variablesP$ = null;

  /** should asserted gafs that introduce sbhl conflicts be rejected? */
  @SubL(source = "cycl/wff-vars.lisp", position = 3147) 
  public static SubLSymbol $reject_sbhl_conflictsP$ = null;

  /** restrict assertions involving skolems? */
  @SubL(source = "cycl/wff-vars.lisp", position = 3285) 
  public static SubLSymbol $inhibit_skolem_assertsP$ = null;

  /** canonicalize evaluatable expressions to their result when possible? */
  @SubL(source = "cycl/wff-vars.lisp", position = 3399) 
  public static SubLSymbol $simplify_evaluatable_expressionsP$ = null;

  /** must evaluatable literals be satisfiable to be deemed wffs? */
  @SubL(source = "cycl/wff-vars.lisp", position = 3564) 
  public static SubLSymbol $enforce_evaluatable_satisfiabilityP$ = null;

  /** must predicates of gafs asserted to vocab mts must be definitional predicates? */
  @SubL(source = "cycl/wff-vars.lisp", position = 3722) 
  public static SubLSymbol $enforce_only_definitional_gafs_in_vocab_mtP$ = null;

  /** whether to inhibit asserting semantically dubious #$commutativeInArgs or #$commutativeInArgsAndRest gafs, based on what is already in the KB, as determined by @xref ok-wrt-partial-commutativity? */
  @SubL(source = "cycl/wff-vars.lisp", position = 3917) 
  public static SubLSymbol $inhibit_cyclic_commutative_in_argsP$ = null;

  /** Whether we note more than one wff violation, and
continue at wff checks even after failure. */
  @SubL(source = "cycl/wff-vars.lisp", position = 4211) 
  public static SubLSymbol $accumulating_wff_violationsP$ = null;

  /** should wff violations be recorded for presentation? */
  @SubL(source = "cycl/wff-vars.lisp", position = 4389) 
  public static SubLSymbol $noting_wff_violationsP$ = null;

  /** should sufficient defn violations be included in wff violations? */
  @SubL(source = "cycl/wff-vars.lisp", position = 4513) 
  public static SubLSymbol $include_suf_defn_violationsP$ = null;

  /** require wff literals to pass idiosyncratic constraints? */
  @SubL(source = "cycl/wff-vars.lisp", position = 4664) 
  public static SubLSymbol $enforce_literal_wff_idiosyncrasiesP$ = null;

  /** is wff module only gathering terse violation data? */
  @SubL(source = "cycl/wff-vars.lisp", position = 4815) 
  public static SubLSymbol $wff_violation_data_terseP$ = null;

  /** transient state variable; is t during the execution of kwt-wff? */
  @SubL(source = "cycl/wff-vars.lisp", position = 5025) 
  public static SubLSymbol $permit_keyword_variablesP$ = null;

  /** transient state variable; is t sometimes and nil other times */
  @SubL(source = "cycl/wff-vars.lisp", position = 5172) 
  public static SubLSymbol $permit_generic_arg_variablesP$ = null;

  /** should wff tests be applied to expansions (in addition to given form)? */
  @SubL(source = "cycl/wff-vars.lisp", position = 5323) 
  public static SubLSymbol $validate_expansionsP$ = null;

  @SubL(source = "cycl/wff-vars.lisp", position = 5977) 
  public static final SubLObject check_wff_properties(SubLObject v_properties) {
    {
      SubLObject plist_var = v_properties;
      checkType(plist_var, $sym40$PROPERTY_LIST_P);
      {
        SubLObject remainder = NIL;
        for (remainder = plist_var; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
          {
            SubLObject property = remainder.first();
            SubLObject value = conses_high.cadr(remainder);
            checkType(property, $sym41$WFF_PROPERTY_P);
          }
        }
      }
    }
    if ((NIL != conses_high.getf(v_properties, $kw1$WFF_MODE, NIL))) {
      checkType(conses_high.getf(v_properties, $kw1$WFF_MODE, NIL), $sym42$WFF_MODE_P);
    }
    return NIL;
  }

  /** transient state variable; is t during the execution of wff? */
  @SubL(source = "cycl/wff-vars.lisp", position = 6187) 
  public static SubLSymbol $within_wffP$ = null;

  /** @see *wff-mode* */
  @SubL(source = "cycl/wff-vars.lisp", position = 6359) 
  private static SubLSymbol $wff_modes$ = null;

  @SubL(source = "cycl/wff-vars.lisp", position = 6511) 
  public static final SubLObject wff_mode() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $wff_mode$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/wff-vars.lisp", position = 6627) 
  public static final SubLObject wff_lenientP() {
    return Equality.eq($kw44$LENIENT, wff_mode());
  }

  /** formula being appraised by wff module */
  @SubL(source = "cycl/wff-vars.lisp", position = 6695) 
  public static SubLSymbol $wff_formula$ = null;

  @SubL(source = "cycl/wff-vars.lisp", position = 6780) 
  public static final SubLObject wff_formula() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $wff_formula$.getDynamicValue(thread);
    }
  }

  /** original formula being appraised by wff module */
  @SubL(source = "cycl/wff-vars.lisp", position = 6834) 
  public static SubLSymbol $wff_original_formula$ = null;

  /** expansion formula being appraised by wff module */
  @SubL(source = "cycl/wff-vars.lisp", position = 7008) 
  public static SubLSymbol $wff_expansion_formula$ = null;

  /** descriptions of how the current argument to wff? is incoherent */
  @SubL(source = "cycl/wff-vars.lisp", position = 7186) 
  public static SubLSymbol $coherence_violations$ = null;

  /** descriptions of how the current argument to wff? is invalid */
  @SubL(source = "cycl/wff-vars.lisp", position = 7306) 
  public static SubLSymbol $wff_violations$ = null;

  /** descriptions of how a relational expresion is not valid wrt arity constraints */
  @SubL(source = "cycl/wff-vars.lisp", position = 7416) 
  public static SubLSymbol $arity_violations$ = null;

  /** suggestions for making a non-wff formula wff will be attempted with this is non-nil */
  @SubL(source = "cycl/wff-vars.lisp", position = 7546) 
  public static SubLSymbol $provide_wff_suggestionsP$ = null;

  /** descriptions of how the current invalid argument to wff? can be fixed */
  @SubL(source = "cycl/wff-vars.lisp", position = 7690) 
  public static SubLSymbol $wff_suggestions$ = null;

  /** transient state variable; contains the current memoization state during execution of wff? */
  @SubL(source = "cycl/wff-vars.lisp", position = 7811) 
  public static SubLSymbol $wff_memoization_state$ = null;

  /** within wff tests applied to expansion (in addition to given form)? */
  @SubL(source = "cycl/wff-vars.lisp", position = 7959) 
  public static SubLSymbol $validating_expansionP$ = null;

  @SubL(source = "cycl/wff-vars.lisp", position = 8114) 
  public static final SubLObject validating_expansionP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $validating_expansionP$.getDynamicValue(thread);
    }
  }

  /** original formula whose expansion is being considered? */
  @SubL(source = "cycl/wff-vars.lisp", position = 8278) 
  public static SubLSymbol $unexpanded_formula$ = null;

  @SubL(source = "cycl/wff-vars.lisp", position = 8385) 
  public static final SubLObject unexpanded_formula() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $unexpanded_formula$.getDynamicValue(thread);
    }
  }

  public static final SubLObject declare_wff_vars_file() {
    declareFunction(myName, "wff_properties_table", "WFF-PROPERTIES-TABLE", 0, 0, false);
    declareFunction(myName, "note_wff_property", "NOTE-WFF-PROPERTY", 3, 0, false);
    declareFunction(myName, "wff_property_variable", "WFF-PROPERTY-VARIABLE", 1, 0, false);
    declareFunction(myName, "wff_property_default", "WFF-PROPERTY-DEFAULT", 1, 0, false);
    declareFunction(myName, "wff_property_p", "WFF-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "wff_properties", "WFF-PROPERTIES", 0, 0, false);
    declareFunction(myName, "wff_debugP", "WFF-DEBUG?", 0, 0, false);
    declareFunction(myName, "wff_violation_data_terseP", "WFF-VIOLATION-DATA-TERSE?", 0, 0, false);
    declareFunction(myName, "check_wff_properties", "CHECK-WFF-PROPERTIES", 1, 0, false);
    declareFunction(myName, "wff_mode_p", "WFF-MODE-P", 1, 0, false);
    declareFunction(myName, "wff_mode", "WFF-MODE", 0, 0, false);
    declareFunction(myName, "wff_strictP", "WFF-STRICT?", 0, 0, false);
    declareFunction(myName, "wff_lenientP", "WFF-LENIENT?", 0, 0, false);
    declareFunction(myName, "wff_formula", "WFF-FORMULA", 0, 0, false);
    declareFunction(myName, "wff_original_formula", "WFF-ORIGINAL-FORMULA", 0, 0, false);
    declareFunction(myName, "wff_expansion_formula", "WFF-EXPANSION-FORMULA", 0, 0, false);
    declareFunction(myName, "validating_expansionP", "VALIDATING-EXPANSION?", 0, 0, false);
    declareFunction(myName, "validate_expansionsP", "VALIDATE-EXPANSIONS?", 0, 0, false);
    declareFunction(myName, "unexpanded_formula", "UNEXPANDED-FORMULA", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_wff_vars_file() {
    $wff_properties_table$ = defvar("*WFF-PROPERTIES-TABLE*", dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
    $wff_properties$ = defparameter("*WFF-PROPERTIES*", NIL);
    $wff_mode$ = defparameter("*WFF-MODE*", $kw0$STRICT);
    $wff_debugP$ = defparameter("*WFF-DEBUG?*", NIL);
    $validate_constantsP$ = defparameter("*VALIDATE-CONSTANTS?*", T);
    $recognize_variablesP$ = defparameter("*RECOGNIZE-VARIABLES?*", T);
    $reject_sbhl_conflictsP$ = defparameter("*REJECT-SBHL-CONFLICTS?*", T);
    $inhibit_skolem_assertsP$ = defparameter("*INHIBIT-SKOLEM-ASSERTS?*", T);
    $simplify_evaluatable_expressionsP$ = defparameter("*SIMPLIFY-EVALUATABLE-EXPRESSIONS?*", NIL);
    $enforce_evaluatable_satisfiabilityP$ = defparameter("*ENFORCE-EVALUATABLE-SATISFIABILITY?*", T);
    $enforce_only_definitional_gafs_in_vocab_mtP$ = defparameter("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*", NIL);
    $inhibit_cyclic_commutative_in_argsP$ = defparameter("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*", T);
    $accumulating_wff_violationsP$ = defparameter("*ACCUMULATING-WFF-VIOLATIONS?*", NIL);
    $noting_wff_violationsP$ = defparameter("*NOTING-WFF-VIOLATIONS?*", NIL);
    $include_suf_defn_violationsP$ = defparameter("*INCLUDE-SUF-DEFN-VIOLATIONS?*", T);
    $enforce_literal_wff_idiosyncrasiesP$ = defparameter("*ENFORCE-LITERAL-WFF-IDIOSYNCRASIES?*", T);
    $wff_violation_data_terseP$ = defparameter("*WFF-VIOLATION-DATA-TERSE?*", NIL);
    $permit_keyword_variablesP$ = defparameter("*PERMIT-KEYWORD-VARIABLES?*", NIL);
    $permit_generic_arg_variablesP$ = defparameter("*PERMIT-GENERIC-ARG-VARIABLES?*", NIL);
    $validate_expansionsP$ = defparameter("*VALIDATE-EXPANSIONS?*", NIL);
    $within_wffP$ = defparameter("*WITHIN-WFF?*", NIL);
    $wff_modes$ = deflexical("*WFF-MODES*", $list43);
    $wff_formula$ = defparameter("*WFF-FORMULA*", NIL);
    $wff_original_formula$ = defparameter("*WFF-ORIGINAL-FORMULA*", NIL);
    $wff_expansion_formula$ = defparameter("*WFF-EXPANSION-FORMULA*", NIL);
    $coherence_violations$ = defparameter("*COHERENCE-VIOLATIONS*", NIL);
    $wff_violations$ = defparameter("*WFF-VIOLATIONS*", NIL);
    $arity_violations$ = defparameter("*ARITY-VIOLATIONS*", NIL);
    $provide_wff_suggestionsP$ = defparameter("*PROVIDE-WFF-SUGGESTIONS?*", NIL);
    $wff_suggestions$ = defparameter("*WFF-SUGGESTIONS*", NIL);
    $wff_memoization_state$ = defparameter("*WFF-MEMOIZATION-STATE*", NIL);
    $validating_expansionP$ = defparameter("*VALIDATING-EXPANSION?*", NIL);
    $unexpanded_formula$ = defparameter("*UNEXPANDED-FORMULA*", NIL);
    return NIL;
  }

  public static final SubLObject setup_wff_vars_file() {
    // CVS_ID("Id: wff-vars.lisp 126660 2008-12-06 00:38:39Z goolsbey ");
    note_wff_property($kw1$WFF_MODE, $sym2$_WFF_MODE_, $kw0$STRICT);
    note_wff_property($kw3$DEBUG_, $sym4$_WFF_DEBUG__, NIL);
    note_wff_property($kw5$VALIDATE_CONSTANTS_, $sym6$_VALIDATE_CONSTANTS__, T);
    note_wff_property($kw7$RECOGNIZE_VARIABLES_, $sym8$_RECOGNIZE_VARIABLES__, T);
    note_wff_property($kw9$REJECT_SBHL_CONFLICTS_, $sym10$_REJECT_SBHL_CONFLICTS__, T);
    note_wff_property($kw11$INHIBIT_SKOLEM_ASSERTS_, $sym12$_INHIBIT_SKOLEM_ASSERTS__, T);
    note_wff_property($kw13$SIMPLIFY_EVALUATABLE_EXPRESSIONS_, $sym14$_SIMPLIFY_EVALUATABLE_EXPRESSIONS__, NIL);
    note_wff_property($kw15$ENFORCE_EVALUATABLE_SATISFIABILITY_, $sym16$_ENFORCE_EVALUATABLE_SATISFIABILITY__, T);
    note_wff_property($kw17$ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT_, $sym18$_ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT__, NIL);
    note_wff_property($kw19$INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS_, $sym20$_INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS__, T);
    note_wff_property($kw21$ACCUMULATING_VIOLATIONS_, $sym22$_ACCUMULATING_WFF_VIOLATIONS__, NIL);
    note_wff_property($kw23$NOTING_VIOLATIONS_, $sym24$_NOTING_WFF_VIOLATIONS__, NIL);
    note_wff_property($kw25$INCLUDE_SUF_DEFN_VIOLATIONS_, $sym26$_INCLUDE_SUF_DEFN_VIOLATIONS__, T);
    note_wff_property($kw27$ENFORCE_LITERAL_IDIOSYNCRASIES_, $sym28$_ENFORCE_LITERAL_WFF_IDIOSYNCRASIES__, T);
    note_wff_property($kw29$VIOLATION_DATA_TERSE_, $sym30$_WFF_VIOLATION_DATA_TERSE__, NIL);
    note_wff_property($kw31$PERMIT_KEYWORD_VARIABLES_, $sym32$_PERMIT_KEYWORD_VARIABLES__, NIL);
    note_wff_property($kw33$PERMIT_GENERIC_ARG_VARIABLES_, $sym34$_PERMIT_GENERIC_ARG_VARIABLES__, NIL);
    note_wff_property($kw35$VALIDATE_EXPANSIONS_, $sym36$_VALIDATE_EXPANSIONS__, NIL);
    note_wff_property($kw37$IO_MODE, NIL, $kw38$NL);
    note_wff_property($kw39$VIOLATIONS, NIL, NIL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$STRICT = makeKeyword("STRICT");
  public static final SubLSymbol $kw1$WFF_MODE = makeKeyword("WFF-MODE");
  public static final SubLSymbol $sym2$_WFF_MODE_ = makeSymbol("*WFF-MODE*");
  public static final SubLSymbol $kw3$DEBUG_ = makeKeyword("DEBUG?");
  public static final SubLSymbol $sym4$_WFF_DEBUG__ = makeSymbol("*WFF-DEBUG?*");
  public static final SubLSymbol $kw5$VALIDATE_CONSTANTS_ = makeKeyword("VALIDATE-CONSTANTS?");
  public static final SubLSymbol $sym6$_VALIDATE_CONSTANTS__ = makeSymbol("*VALIDATE-CONSTANTS?*");
  public static final SubLSymbol $kw7$RECOGNIZE_VARIABLES_ = makeKeyword("RECOGNIZE-VARIABLES?");
  public static final SubLSymbol $sym8$_RECOGNIZE_VARIABLES__ = makeSymbol("*RECOGNIZE-VARIABLES?*");
  public static final SubLSymbol $kw9$REJECT_SBHL_CONFLICTS_ = makeKeyword("REJECT-SBHL-CONFLICTS?");
  public static final SubLSymbol $sym10$_REJECT_SBHL_CONFLICTS__ = makeSymbol("*REJECT-SBHL-CONFLICTS?*");
  public static final SubLSymbol $kw11$INHIBIT_SKOLEM_ASSERTS_ = makeKeyword("INHIBIT-SKOLEM-ASSERTS?");
  public static final SubLSymbol $sym12$_INHIBIT_SKOLEM_ASSERTS__ = makeSymbol("*INHIBIT-SKOLEM-ASSERTS?*");
  public static final SubLSymbol $kw13$SIMPLIFY_EVALUATABLE_EXPRESSIONS_ = makeKeyword("SIMPLIFY-EVALUATABLE-EXPRESSIONS?");
  public static final SubLSymbol $sym14$_SIMPLIFY_EVALUATABLE_EXPRESSIONS__ = makeSymbol("*SIMPLIFY-EVALUATABLE-EXPRESSIONS?*");
  public static final SubLSymbol $kw15$ENFORCE_EVALUATABLE_SATISFIABILITY_ = makeKeyword("ENFORCE-EVALUATABLE-SATISFIABILITY?");
  public static final SubLSymbol $sym16$_ENFORCE_EVALUATABLE_SATISFIABILITY__ = makeSymbol("*ENFORCE-EVALUATABLE-SATISFIABILITY?*");
  public static final SubLSymbol $kw17$ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT_ = makeKeyword("ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?");
  public static final SubLSymbol $sym18$_ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT__ = makeSymbol("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*");
  public static final SubLSymbol $kw19$INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS_ = makeKeyword("INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?");
  public static final SubLSymbol $sym20$_INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS__ = makeSymbol("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*");
  public static final SubLSymbol $kw21$ACCUMULATING_VIOLATIONS_ = makeKeyword("ACCUMULATING-VIOLATIONS?");
  public static final SubLSymbol $sym22$_ACCUMULATING_WFF_VIOLATIONS__ = makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*");
  public static final SubLSymbol $kw23$NOTING_VIOLATIONS_ = makeKeyword("NOTING-VIOLATIONS?");
  public static final SubLSymbol $sym24$_NOTING_WFF_VIOLATIONS__ = makeSymbol("*NOTING-WFF-VIOLATIONS?*");
  public static final SubLSymbol $kw25$INCLUDE_SUF_DEFN_VIOLATIONS_ = makeKeyword("INCLUDE-SUF-DEFN-VIOLATIONS?");
  public static final SubLSymbol $sym26$_INCLUDE_SUF_DEFN_VIOLATIONS__ = makeSymbol("*INCLUDE-SUF-DEFN-VIOLATIONS?*");
  public static final SubLSymbol $kw27$ENFORCE_LITERAL_IDIOSYNCRASIES_ = makeKeyword("ENFORCE-LITERAL-IDIOSYNCRASIES?");
  public static final SubLSymbol $sym28$_ENFORCE_LITERAL_WFF_IDIOSYNCRASIES__ = makeSymbol("*ENFORCE-LITERAL-WFF-IDIOSYNCRASIES?*");
  public static final SubLSymbol $kw29$VIOLATION_DATA_TERSE_ = makeKeyword("VIOLATION-DATA-TERSE?");
  public static final SubLSymbol $sym30$_WFF_VIOLATION_DATA_TERSE__ = makeSymbol("*WFF-VIOLATION-DATA-TERSE?*");
  public static final SubLSymbol $kw31$PERMIT_KEYWORD_VARIABLES_ = makeKeyword("PERMIT-KEYWORD-VARIABLES?");
  public static final SubLSymbol $sym32$_PERMIT_KEYWORD_VARIABLES__ = makeSymbol("*PERMIT-KEYWORD-VARIABLES?*");
  public static final SubLSymbol $kw33$PERMIT_GENERIC_ARG_VARIABLES_ = makeKeyword("PERMIT-GENERIC-ARG-VARIABLES?");
  public static final SubLSymbol $sym34$_PERMIT_GENERIC_ARG_VARIABLES__ = makeSymbol("*PERMIT-GENERIC-ARG-VARIABLES?*");
  public static final SubLSymbol $kw35$VALIDATE_EXPANSIONS_ = makeKeyword("VALIDATE-EXPANSIONS?");
  public static final SubLSymbol $sym36$_VALIDATE_EXPANSIONS__ = makeSymbol("*VALIDATE-EXPANSIONS?*");
  public static final SubLSymbol $kw37$IO_MODE = makeKeyword("IO-MODE");
  public static final SubLSymbol $kw38$NL = makeKeyword("NL");
  public static final SubLSymbol $kw39$VIOLATIONS = makeKeyword("VIOLATIONS");
  public static final SubLSymbol $sym40$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLSymbol $sym41$WFF_PROPERTY_P = makeSymbol("WFF-PROPERTY-P");
  public static final SubLSymbol $sym42$WFF_MODE_P = makeSymbol("WFF-MODE-P");
  public static final SubLList $list43 = list(makeKeyword("STRICT"), makeKeyword("LENIENT"));
  public static final SubLSymbol $kw44$LENIENT = makeKeyword("LENIENT");

  //// Initializers

  public void declareFunctions() {
    declare_wff_vars_file();
  }

  public void initializeVariables() {
    init_wff_vars_file();
  }

  public void runTopLevelForms() {
    setup_wff_vars_file();
  }

}
