package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class wff_vars
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.wff_vars";
  public static final String myFingerPrint = "7776700015cc94655d4203b9e0991df34e3fde5110fedb01f9dd21474c4c88b0";
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 935L)
  private static SubLSymbol $wff_properties_table$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 1928L)
  public static SubLSymbol $wff_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 2170L)
  public static SubLSymbol $wff_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 2771L)
  public static SubLSymbol $wff_debugP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 3097L)
  public static SubLSymbol $validate_constantsP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 3251L)
  public static SubLSymbol $recognize_variablesP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 3370L)
  public static SubLSymbol $reject_sbhl_conflictsP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 3508L)
  public static SubLSymbol $inhibit_skolem_assertsP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 3622L)
  public static SubLSymbol $simplify_evaluatable_expressionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 3787L)
  public static SubLSymbol $enforce_evaluatable_satisfiabilityP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 3945L)
  public static SubLSymbol $enforce_only_definitional_gafs_in_vocab_mtP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 4140L)
  public static SubLSymbol $inhibit_cyclic_commutative_in_argsP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 4434L)
  public static SubLSymbol $accumulating_wff_violationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 4612L)
  public static SubLSymbol $noting_wff_violationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 4736L)
  public static SubLSymbol $include_suf_defn_violationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 4887L)
  public static SubLSymbol $enforce_literal_wff_idiosyncrasiesP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 5038L)
  public static SubLSymbol $wff_violation_data_terseP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 5248L)
  public static SubLSymbol $permit_keyword_variablesP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 5395L)
  public static SubLSymbol $permit_generic_arg_variablesP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 5546L)
  public static SubLSymbol $validate_expansionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 7024L)
  public static SubLSymbol $within_wffP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 7196L)
  private static SubLSymbol $wff_modes$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 7704L)
  public static SubLSymbol $wff_constraint_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 7865L)
  public static SubLSymbol $wff_formula$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 8004L)
  public static SubLSymbol $wff_original_formula$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 8178L)
  public static SubLSymbol $wff_expansion_formula$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 8356L)
  public static SubLSymbol $coherence_violations$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 8476L)
  public static SubLSymbol $wff_violations$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 8586L)
  public static SubLSymbol $arity_violations$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 8716L)
  public static SubLSymbol $provide_wff_suggestionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 8860L)
  public static SubLSymbol $wff_suggestions$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 8981L)
  public static SubLSymbol $wff_memoization_state$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 9129L)
  public static SubLSymbol $validating_expansionP$;
  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 9448L)
  public static SubLSymbol $unexpanded_formula$;
  private static final SubLSymbol $kw0$ASSERTIVE;
  private static final SubLSymbol $kw1$WFF_MODE;
  private static final SubLSymbol $sym2$_WFF_MODE_;
  private static final SubLSymbol $kw3$DEBUG_;
  private static final SubLSymbol $sym4$_WFF_DEBUG__;
  private static final SubLSymbol $kw5$VALIDATE_CONSTANTS_;
  private static final SubLSymbol $sym6$_VALIDATE_CONSTANTS__;
  private static final SubLSymbol $kw7$RECOGNIZE_VARIABLES_;
  private static final SubLSymbol $sym8$_RECOGNIZE_VARIABLES__;
  private static final SubLSymbol $kw9$REJECT_SBHL_CONFLICTS_;
  private static final SubLSymbol $sym10$_REJECT_SBHL_CONFLICTS__;
  private static final SubLSymbol $kw11$INHIBIT_SKOLEM_ASSERTS_;
  private static final SubLSymbol $sym12$_INHIBIT_SKOLEM_ASSERTS__;
  private static final SubLSymbol $kw13$SIMPLIFY_EVALUATABLE_EXPRESSIONS_;
  private static final SubLSymbol $sym14$_SIMPLIFY_EVALUATABLE_EXPRESSIONS__;
  private static final SubLSymbol $kw15$ENFORCE_EVALUATABLE_SATISFIABILITY_;
  private static final SubLSymbol $sym16$_ENFORCE_EVALUATABLE_SATISFIABILITY__;
  private static final SubLSymbol $kw17$ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT_;
  private static final SubLSymbol $sym18$_ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT__;
  private static final SubLSymbol $kw19$INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS_;
  private static final SubLSymbol $sym20$_INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS__;
  private static final SubLSymbol $kw21$ACCUMULATING_VIOLATIONS_;
  private static final SubLSymbol $sym22$_ACCUMULATING_WFF_VIOLATIONS__;
  private static final SubLSymbol $kw23$NOTING_VIOLATIONS_;
  private static final SubLSymbol $sym24$_NOTING_WFF_VIOLATIONS__;
  private static final SubLSymbol $kw25$INCLUDE_SUF_DEFN_VIOLATIONS_;
  private static final SubLSymbol $sym26$_INCLUDE_SUF_DEFN_VIOLATIONS__;
  private static final SubLSymbol $kw27$ENFORCE_LITERAL_IDIOSYNCRASIES_;
  private static final SubLSymbol $sym28$_ENFORCE_LITERAL_WFF_IDIOSYNCRASIES__;
  private static final SubLSymbol $kw29$VIOLATION_DATA_TERSE_;
  private static final SubLSymbol $sym30$_WFF_VIOLATION_DATA_TERSE__;
  private static final SubLSymbol $kw31$PERMIT_KEYWORD_VARIABLES_;
  private static final SubLSymbol $sym32$_PERMIT_KEYWORD_VARIABLES__;
  private static final SubLSymbol $kw33$PERMIT_GENERIC_ARG_VARIABLES_;
  private static final SubLSymbol $sym34$_PERMIT_GENERIC_ARG_VARIABLES__;
  private static final SubLSymbol $kw35$VALIDATE_EXPANSIONS_;
  private static final SubLSymbol $sym36$_VALIDATE_EXPANSIONS__;
  private static final SubLSymbol $kw37$IO_MODE;
  private static final SubLSymbol $kw38$NL;
  private static final SubLSymbol $kw39$NL_VERBOSITY;
  private static final SubLSymbol $kw40$VERBOSE;
  private static final SubLSymbol $kw41$NL_TERM_MAP;
  private static final SubLSymbol $kw42$NL_LIST_OUTPUT;
  private static final SubLSymbol $kw43$VIOLATIONS;
  private static final SubLSymbol $sym44$PROPERTY_LIST_P;
  private static final SubLSymbol $sym45$WFF_PROPERTY_P;
  private static final SubLSymbol $sym46$WFF_MODE_P;
  private static final SubLList $list47;
  private static final SubLSymbol $kw48$STRICT;
  private static final SubLSymbol $kw49$LENIENT;
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 1209L)
  public static SubLObject wff_properties_table()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $wff_properties_table$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 1283L)
  public static SubLObject note_wff_property(final SubLObject keyword, final SubLObject variable, final SubLObject v_default)
  {
    return dictionary.dictionary_enter( wff_properties_table(), keyword, ConsesLow.list( variable, v_default ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 1428L)
  public static SubLObject wff_property_variable(final SubLObject property)
  {
    return dictionary.dictionary_lookup( wff_properties_table(), property, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 1549L)
  public static SubLObject wff_property_default(final SubLObject property)
  {
    return conses_high.second( dictionary.dictionary_lookup( wff_properties_table(), property, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 1670L)
  public static SubLObject get_wff_property(final SubLObject v_properties, final SubLObject property)
  {
    return conses_high.getf( v_properties, property, wff_property_default( property ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 1796L)
  public static SubLObject wff_property_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isKeyword() && NIL != dictionary_utilities.dictionary_has_keyP( wff_properties_table(), v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 2034L)
  public static SubLObject wff_properties()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $wff_properties$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 3043L)
  public static SubLObject wff_debugP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $wff_debugP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 5166L)
  public static SubLObject wff_violation_data_terseP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $wff_violation_data_terseP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 6814L)
  public static SubLObject check_wff_properties(final SubLObject v_properties)
  {
    assert NIL != list_utilities.property_list_p( v_properties ) : v_properties;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = v_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != wff_property_p( property ) : property;
    }
    if( NIL != conses_high.getf( v_properties, $kw1$WFF_MODE, NIL ) && !assertionsDisabledSynth && NIL == wff_mode_p( conses_high.getf( v_properties, $kw1$WFF_MODE, NIL ) ) )
    {
      throw new AssertionError( conses_high.getf( v_properties, $kw1$WFF_MODE, NIL ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 7283L)
  public static SubLObject wff_mode_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $wff_modes$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 7359L)
  public static SubLObject wff_mode()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $wff_mode$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 7409L)
  public static SubLObject wff_strictP()
  {
    return Equality.eq( $kw48$STRICT, wff_mode() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 7475L)
  public static SubLObject wff_lenientP()
  {
    return makeBoolean( $kw0$ASSERTIVE == wff_mode() || $kw49$LENIENT == wff_mode() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 7632L)
  public static SubLObject wff_assertiveP()
  {
    return Equality.eq( $kw0$ASSERTIVE, wff_mode() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 7797L)
  public static SubLObject wff_constraint_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $wff_constraint_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 7950L)
  public static SubLObject wff_formula()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $wff_formula$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 8106L)
  public static SubLObject wff_original_formula()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $wff_original_formula$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 8282L)
  public static SubLObject wff_expansion_formula()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $wff_expansion_formula$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 9284L)
  public static SubLObject validating_expansionP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $validating_expansionP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 9348L)
  public static SubLObject validate_expansionsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $validate_expansionsP$.getDynamicValue( thread ) && NIL == validating_expansionP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wff-vars.lisp", position = 9555L)
  public static SubLObject unexpanded_formula()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $unexpanded_formula$.getDynamicValue( thread );
  }

  public static SubLObject declare_wff_vars_file()
  {
    SubLFiles.declareFunction( me, "wff_properties_table", "WFF-PROPERTIES-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "note_wff_property", "NOTE-WFF-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "wff_property_variable", "WFF-PROPERTY-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_property_default", "WFF-PROPERTY-DEFAULT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_wff_property", "GET-WFF-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "wff_property_p", "WFF-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_properties", "WFF-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "wff_debugP", "WFF-DEBUG?", 0, 0, false );
    SubLFiles.declareFunction( me, "wff_violation_data_terseP", "WFF-VIOLATION-DATA-TERSE?", 0, 0, false );
    SubLFiles.declareFunction( me, "check_wff_properties", "CHECK-WFF-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_mode_p", "WFF-MODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_mode", "WFF-MODE", 0, 0, false );
    SubLFiles.declareFunction( me, "wff_strictP", "WFF-STRICT?", 0, 0, false );
    SubLFiles.declareFunction( me, "wff_lenientP", "WFF-LENIENT?", 0, 0, false );
    SubLFiles.declareFunction( me, "wff_assertiveP", "WFF-ASSERTIVE?", 0, 0, false );
    SubLFiles.declareFunction( me, "wff_constraint_mt", "WFF-CONSTRAINT-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "wff_formula", "WFF-FORMULA", 0, 0, false );
    SubLFiles.declareFunction( me, "wff_original_formula", "WFF-ORIGINAL-FORMULA", 0, 0, false );
    SubLFiles.declareFunction( me, "wff_expansion_formula", "WFF-EXPANSION-FORMULA", 0, 0, false );
    SubLFiles.declareFunction( me, "validating_expansionP", "VALIDATING-EXPANSION?", 0, 0, false );
    SubLFiles.declareFunction( me, "validate_expansionsP", "VALIDATE-EXPANSIONS?", 0, 0, false );
    SubLFiles.declareFunction( me, "unexpanded_formula", "UNEXPANDED-FORMULA", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_wff_vars_file()
  {
    $wff_properties_table$ = SubLFiles.defvar( "*WFF-PROPERTIES-TABLE*", dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    $wff_properties$ = SubLFiles.defparameter( "*WFF-PROPERTIES*", NIL );
    $wff_mode$ = SubLFiles.defparameter( "*WFF-MODE*", $kw0$ASSERTIVE );
    $wff_debugP$ = SubLFiles.defparameter( "*WFF-DEBUG?*", NIL );
    $validate_constantsP$ = SubLFiles.defparameter( "*VALIDATE-CONSTANTS?*", T );
    $recognize_variablesP$ = SubLFiles.defparameter( "*RECOGNIZE-VARIABLES?*", T );
    $reject_sbhl_conflictsP$ = SubLFiles.defparameter( "*REJECT-SBHL-CONFLICTS?*", T );
    $inhibit_skolem_assertsP$ = SubLFiles.defparameter( "*INHIBIT-SKOLEM-ASSERTS?*", T );
    $simplify_evaluatable_expressionsP$ = SubLFiles.defparameter( "*SIMPLIFY-EVALUATABLE-EXPRESSIONS?*", NIL );
    $enforce_evaluatable_satisfiabilityP$ = SubLFiles.defparameter( "*ENFORCE-EVALUATABLE-SATISFIABILITY?*", T );
    $enforce_only_definitional_gafs_in_vocab_mtP$ = SubLFiles.defparameter( "*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*", NIL );
    $inhibit_cyclic_commutative_in_argsP$ = SubLFiles.defparameter( "*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*", T );
    $accumulating_wff_violationsP$ = SubLFiles.defparameter( "*ACCUMULATING-WFF-VIOLATIONS?*", NIL );
    $noting_wff_violationsP$ = SubLFiles.defparameter( "*NOTING-WFF-VIOLATIONS?*", NIL );
    $include_suf_defn_violationsP$ = SubLFiles.defparameter( "*INCLUDE-SUF-DEFN-VIOLATIONS?*", T );
    $enforce_literal_wff_idiosyncrasiesP$ = SubLFiles.defparameter( "*ENFORCE-LITERAL-WFF-IDIOSYNCRASIES?*", T );
    $wff_violation_data_terseP$ = SubLFiles.defparameter( "*WFF-VIOLATION-DATA-TERSE?*", NIL );
    $permit_keyword_variablesP$ = SubLFiles.defparameter( "*PERMIT-KEYWORD-VARIABLES?*", NIL );
    $permit_generic_arg_variablesP$ = SubLFiles.defparameter( "*PERMIT-GENERIC-ARG-VARIABLES?*", NIL );
    $validate_expansionsP$ = SubLFiles.defparameter( "*VALIDATE-EXPANSIONS?*", NIL );
    $within_wffP$ = SubLFiles.defparameter( "*WITHIN-WFF?*", NIL );
    $wff_modes$ = SubLFiles.deflexical( "*WFF-MODES*", $list47 );
    $wff_constraint_mt$ = SubLFiles.defparameter( "*WFF-CONSTRAINT-MT*", NIL );
    $wff_formula$ = SubLFiles.defparameter( "*WFF-FORMULA*", NIL );
    $wff_original_formula$ = SubLFiles.defparameter( "*WFF-ORIGINAL-FORMULA*", NIL );
    $wff_expansion_formula$ = SubLFiles.defparameter( "*WFF-EXPANSION-FORMULA*", NIL );
    $coherence_violations$ = SubLFiles.defparameter( "*COHERENCE-VIOLATIONS*", NIL );
    $wff_violations$ = SubLFiles.defparameter( "*WFF-VIOLATIONS*", NIL );
    $arity_violations$ = SubLFiles.defparameter( "*ARITY-VIOLATIONS*", NIL );
    $provide_wff_suggestionsP$ = SubLFiles.defparameter( "*PROVIDE-WFF-SUGGESTIONS?*", NIL );
    $wff_suggestions$ = SubLFiles.defparameter( "*WFF-SUGGESTIONS*", NIL );
    $wff_memoization_state$ = SubLFiles.defparameter( "*WFF-MEMOIZATION-STATE*", NIL );
    $validating_expansionP$ = SubLFiles.defparameter( "*VALIDATING-EXPANSION?*", NIL );
    $unexpanded_formula$ = SubLFiles.defparameter( "*UNEXPANDED-FORMULA*", NIL );
    return NIL;
  }

  public static SubLObject setup_wff_vars_file()
  {
    note_wff_property( $kw1$WFF_MODE, $sym2$_WFF_MODE_, $kw0$ASSERTIVE );
    note_wff_property( $kw3$DEBUG_, $sym4$_WFF_DEBUG__, NIL );
    note_wff_property( $kw5$VALIDATE_CONSTANTS_, $sym6$_VALIDATE_CONSTANTS__, T );
    note_wff_property( $kw7$RECOGNIZE_VARIABLES_, $sym8$_RECOGNIZE_VARIABLES__, T );
    note_wff_property( $kw9$REJECT_SBHL_CONFLICTS_, $sym10$_REJECT_SBHL_CONFLICTS__, T );
    note_wff_property( $kw11$INHIBIT_SKOLEM_ASSERTS_, $sym12$_INHIBIT_SKOLEM_ASSERTS__, T );
    note_wff_property( $kw13$SIMPLIFY_EVALUATABLE_EXPRESSIONS_, $sym14$_SIMPLIFY_EVALUATABLE_EXPRESSIONS__, NIL );
    note_wff_property( $kw15$ENFORCE_EVALUATABLE_SATISFIABILITY_, $sym16$_ENFORCE_EVALUATABLE_SATISFIABILITY__, T );
    note_wff_property( $kw17$ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT_, $sym18$_ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT__, NIL );
    note_wff_property( $kw19$INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS_, $sym20$_INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS__, T );
    note_wff_property( $kw21$ACCUMULATING_VIOLATIONS_, $sym22$_ACCUMULATING_WFF_VIOLATIONS__, NIL );
    note_wff_property( $kw23$NOTING_VIOLATIONS_, $sym24$_NOTING_WFF_VIOLATIONS__, NIL );
    note_wff_property( $kw25$INCLUDE_SUF_DEFN_VIOLATIONS_, $sym26$_INCLUDE_SUF_DEFN_VIOLATIONS__, T );
    note_wff_property( $kw27$ENFORCE_LITERAL_IDIOSYNCRASIES_, $sym28$_ENFORCE_LITERAL_WFF_IDIOSYNCRASIES__, T );
    note_wff_property( $kw29$VIOLATION_DATA_TERSE_, $sym30$_WFF_VIOLATION_DATA_TERSE__, NIL );
    note_wff_property( $kw31$PERMIT_KEYWORD_VARIABLES_, $sym32$_PERMIT_KEYWORD_VARIABLES__, NIL );
    note_wff_property( $kw33$PERMIT_GENERIC_ARG_VARIABLES_, $sym34$_PERMIT_GENERIC_ARG_VARIABLES__, NIL );
    note_wff_property( $kw35$VALIDATE_EXPANSIONS_, $sym36$_VALIDATE_EXPANSIONS__, NIL );
    note_wff_property( $kw37$IO_MODE, NIL, $kw38$NL );
    note_wff_property( $kw39$NL_VERBOSITY, NIL, $kw40$VERBOSE );
    note_wff_property( $kw41$NL_TERM_MAP, NIL, NIL );
    note_wff_property( $kw42$NL_LIST_OUTPUT, NIL, NIL );
    note_wff_property( $kw43$VIOLATIONS, NIL, NIL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_wff_vars_file();
  }

  @Override
  public void initializeVariables()
  {
    init_wff_vars_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_wff_vars_file();
  }
  static
  {
    me = new wff_vars();
    $wff_properties_table$ = null;
    $wff_properties$ = null;
    $wff_mode$ = null;
    $wff_debugP$ = null;
    $validate_constantsP$ = null;
    $recognize_variablesP$ = null;
    $reject_sbhl_conflictsP$ = null;
    $inhibit_skolem_assertsP$ = null;
    $simplify_evaluatable_expressionsP$ = null;
    $enforce_evaluatable_satisfiabilityP$ = null;
    $enforce_only_definitional_gafs_in_vocab_mtP$ = null;
    $inhibit_cyclic_commutative_in_argsP$ = null;
    $accumulating_wff_violationsP$ = null;
    $noting_wff_violationsP$ = null;
    $include_suf_defn_violationsP$ = null;
    $enforce_literal_wff_idiosyncrasiesP$ = null;
    $wff_violation_data_terseP$ = null;
    $permit_keyword_variablesP$ = null;
    $permit_generic_arg_variablesP$ = null;
    $validate_expansionsP$ = null;
    $within_wffP$ = null;
    $wff_modes$ = null;
    $wff_constraint_mt$ = null;
    $wff_formula$ = null;
    $wff_original_formula$ = null;
    $wff_expansion_formula$ = null;
    $coherence_violations$ = null;
    $wff_violations$ = null;
    $arity_violations$ = null;
    $provide_wff_suggestionsP$ = null;
    $wff_suggestions$ = null;
    $wff_memoization_state$ = null;
    $validating_expansionP$ = null;
    $unexpanded_formula$ = null;
    $kw0$ASSERTIVE = makeKeyword( "ASSERTIVE" );
    $kw1$WFF_MODE = makeKeyword( "WFF-MODE" );
    $sym2$_WFF_MODE_ = makeSymbol( "*WFF-MODE*" );
    $kw3$DEBUG_ = makeKeyword( "DEBUG?" );
    $sym4$_WFF_DEBUG__ = makeSymbol( "*WFF-DEBUG?*" );
    $kw5$VALIDATE_CONSTANTS_ = makeKeyword( "VALIDATE-CONSTANTS?" );
    $sym6$_VALIDATE_CONSTANTS__ = makeSymbol( "*VALIDATE-CONSTANTS?*" );
    $kw7$RECOGNIZE_VARIABLES_ = makeKeyword( "RECOGNIZE-VARIABLES?" );
    $sym8$_RECOGNIZE_VARIABLES__ = makeSymbol( "*RECOGNIZE-VARIABLES?*" );
    $kw9$REJECT_SBHL_CONFLICTS_ = makeKeyword( "REJECT-SBHL-CONFLICTS?" );
    $sym10$_REJECT_SBHL_CONFLICTS__ = makeSymbol( "*REJECT-SBHL-CONFLICTS?*" );
    $kw11$INHIBIT_SKOLEM_ASSERTS_ = makeKeyword( "INHIBIT-SKOLEM-ASSERTS?" );
    $sym12$_INHIBIT_SKOLEM_ASSERTS__ = makeSymbol( "*INHIBIT-SKOLEM-ASSERTS?*" );
    $kw13$SIMPLIFY_EVALUATABLE_EXPRESSIONS_ = makeKeyword( "SIMPLIFY-EVALUATABLE-EXPRESSIONS?" );
    $sym14$_SIMPLIFY_EVALUATABLE_EXPRESSIONS__ = makeSymbol( "*SIMPLIFY-EVALUATABLE-EXPRESSIONS?*" );
    $kw15$ENFORCE_EVALUATABLE_SATISFIABILITY_ = makeKeyword( "ENFORCE-EVALUATABLE-SATISFIABILITY?" );
    $sym16$_ENFORCE_EVALUATABLE_SATISFIABILITY__ = makeSymbol( "*ENFORCE-EVALUATABLE-SATISFIABILITY?*" );
    $kw17$ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT_ = makeKeyword( "ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?" );
    $sym18$_ENFORCE_ONLY_DEFINITIONAL_GAFS_IN_VOCAB_MT__ = makeSymbol( "*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*" );
    $kw19$INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS_ = makeKeyword( "INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?" );
    $sym20$_INHIBIT_CYCLIC_COMMUTATIVE_IN_ARGS__ = makeSymbol( "*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*" );
    $kw21$ACCUMULATING_VIOLATIONS_ = makeKeyword( "ACCUMULATING-VIOLATIONS?" );
    $sym22$_ACCUMULATING_WFF_VIOLATIONS__ = makeSymbol( "*ACCUMULATING-WFF-VIOLATIONS?*" );
    $kw23$NOTING_VIOLATIONS_ = makeKeyword( "NOTING-VIOLATIONS?" );
    $sym24$_NOTING_WFF_VIOLATIONS__ = makeSymbol( "*NOTING-WFF-VIOLATIONS?*" );
    $kw25$INCLUDE_SUF_DEFN_VIOLATIONS_ = makeKeyword( "INCLUDE-SUF-DEFN-VIOLATIONS?" );
    $sym26$_INCLUDE_SUF_DEFN_VIOLATIONS__ = makeSymbol( "*INCLUDE-SUF-DEFN-VIOLATIONS?*" );
    $kw27$ENFORCE_LITERAL_IDIOSYNCRASIES_ = makeKeyword( "ENFORCE-LITERAL-IDIOSYNCRASIES?" );
    $sym28$_ENFORCE_LITERAL_WFF_IDIOSYNCRASIES__ = makeSymbol( "*ENFORCE-LITERAL-WFF-IDIOSYNCRASIES?*" );
    $kw29$VIOLATION_DATA_TERSE_ = makeKeyword( "VIOLATION-DATA-TERSE?" );
    $sym30$_WFF_VIOLATION_DATA_TERSE__ = makeSymbol( "*WFF-VIOLATION-DATA-TERSE?*" );
    $kw31$PERMIT_KEYWORD_VARIABLES_ = makeKeyword( "PERMIT-KEYWORD-VARIABLES?" );
    $sym32$_PERMIT_KEYWORD_VARIABLES__ = makeSymbol( "*PERMIT-KEYWORD-VARIABLES?*" );
    $kw33$PERMIT_GENERIC_ARG_VARIABLES_ = makeKeyword( "PERMIT-GENERIC-ARG-VARIABLES?" );
    $sym34$_PERMIT_GENERIC_ARG_VARIABLES__ = makeSymbol( "*PERMIT-GENERIC-ARG-VARIABLES?*" );
    $kw35$VALIDATE_EXPANSIONS_ = makeKeyword( "VALIDATE-EXPANSIONS?" );
    $sym36$_VALIDATE_EXPANSIONS__ = makeSymbol( "*VALIDATE-EXPANSIONS?*" );
    $kw37$IO_MODE = makeKeyword( "IO-MODE" );
    $kw38$NL = makeKeyword( "NL" );
    $kw39$NL_VERBOSITY = makeKeyword( "NL-VERBOSITY" );
    $kw40$VERBOSE = makeKeyword( "VERBOSE" );
    $kw41$NL_TERM_MAP = makeKeyword( "NL-TERM-MAP" );
    $kw42$NL_LIST_OUTPUT = makeKeyword( "NL-LIST-OUTPUT" );
    $kw43$VIOLATIONS = makeKeyword( "VIOLATIONS" );
    $sym44$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $sym45$WFF_PROPERTY_P = makeSymbol( "WFF-PROPERTY-P" );
    $sym46$WFF_MODE_P = makeSymbol( "WFF-MODE-P" );
    $list47 = ConsesLow.list( makeKeyword( "STRICT" ), makeKeyword( "LENIENT" ), makeKeyword( "ASSERTIVE" ) );
    $kw48$STRICT = makeKeyword( "STRICT" );
    $kw49$LENIENT = makeKeyword( "LENIENT" );
  }
}
/*
 * 
 * Total time: 130 ms synthetic
 */