package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulation_specification
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.reformulation_specification";
  public static final String myFingerPrint = "30f7776870a6b7fc2360256abb834da437f5929e6827fa8420146739b0c0dd28";
  private static final SubLObject $const0$ReformulationSpecification;
  private static final SubLSymbol $kw1$META_PREDICATES;
  private static final SubLSymbol $sym2$VALID_REFORMULATOR_SETTING_KEYWORD_P;
  private static final SubLList $list3;
  private static final SubLObject $const4$useMetaPredicateInReformulation;
  private static final SubLSymbol $sym5$FIRST;
  private static final SubLSymbol $sym6$_;
  private static final SubLSymbol $sym7$SECOND;
  private static final SubLSymbol $kw8$REFORMULATOR_RULES;
  private static final SubLList $list9;
  private static final SubLObject $const10$useRuleInReformulation;
  private static final SubLSymbol $kw11$IGNORE_RL_MODULES;
  private static final SubLList $list12;
  private static final SubLObject $const13$ignoreModuleInReformulation;

  @SubLTranslatedFile.SubL(source = "cycl/reformulation-specification.lisp", position = 1042L)
  public static SubLObject load_reformulation_specification_from_kb(final SubLObject refspec_id, final SubLObject mt)
  {
    SubLObject settings = NIL;
    if( NIL != isa.isaP( refspec_id, $const0$ReformulationSpecification, mt, UNPROVIDED ) )
    {
      settings = load_refspec_behaviour_wrt_recursion( refspec_id, settings, mt );
      settings = load_refspec_caching( refspec_id, settings, mt );
      settings = load_refspec_modes( refspec_id, settings, mt );
      settings = load_refspec_precondition_checking( refspec_id, settings, mt );
      settings = load_refspec_reformulation_history( refspec_id, settings, mt );
      settings = load_refspec_reformulator_rules_to_use( refspec_id, settings, mt );
      settings = load_refspec_search_strategy( refspec_id, settings, mt );
      settings = load_refspec_use_of_rl_modules( refspec_id, settings, mt );
      settings = load_refspec_well_formedness_constraints_to_impose( refspec_id, settings, mt );
    }
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulation-specification.lisp", position = 1951L)
  public static SubLObject reformulate_cycl_via_specification(final SubLObject cycl, final SubLObject mt, final SubLObject refspec_id, SubLObject refspec_mt)
  {
    if( refspec_mt == UNPROVIDED )
    {
      refspec_mt = NIL;
    }
    if( NIL == refspec_mt )
    {
      refspec_mt = mt;
    }
    return reformulator_hub.reformulate_cycl( cycl, mt, load_reformulation_specification_from_kb( refspec_id, refspec_mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulation-specification.lisp", position = 2295L)
  public static SubLObject load_refspec_behaviour_wrt_recursion(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt)
  {
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulation-specification.lisp", position = 2802L)
  public static SubLObject load_refspec_caching(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt)
  {
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulation-specification.lisp", position = 2987L)
  public static SubLObject load_refspec_modes(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt)
  {
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulation-specification.lisp", position = 3157L)
  public static SubLObject load_refspec_precondition_checking(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt)
  {
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulation-specification.lisp", position = 3374L)
  public static SubLObject load_refspec_reformulation_history(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt)
  {
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulation-specification.lisp", position = 3617L)
  public static SubLObject load_refspec_reformulator_rules_to_use(final SubLObject refspec_id, SubLObject settings, final SubLObject mt)
  {
    settings = load_refspec_explicit_reformulator_rules( refspec_id, settings, mt );
    settings = load_refspec_meta_predicates( refspec_id, settings, mt );
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulation-specification.lisp", position = 4104L)
  public static SubLObject load_refspec_meta_predicates(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt)
  {
    assert NIL != reformulator_datastructures.valid_reformulator_setting_keyword_p( $kw1$META_PREDICATES ) : $kw1$META_PREDICATES;
    final SubLObject predicate_specs = ask_utilities.ask_template( $list3, ConsesLow.listS( $const4$useMetaPredicateInReformulation, refspec_id, $list3 ), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != predicate_specs ) ? conses_high.putf( settings, $kw1$META_PREDICATES, Mapping.mapcar( Symbols.symbol_function( $sym5$FIRST ), Sort.sort( predicate_specs, Symbols.symbol_function( $sym6$_ ), Symbols
        .symbol_function( $sym7$SECOND ) ) ) ) : settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulation-specification.lisp", position = 4579L)
  public static SubLObject load_refspec_explicit_reformulator_rules(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt)
  {
    assert NIL != reformulator_datastructures.valid_reformulator_setting_keyword_p( $kw8$REFORMULATOR_RULES ) : $kw8$REFORMULATOR_RULES;
    final SubLObject rule_specs = ask_utilities.ask_template( $list9, ConsesLow.listS( $const10$useRuleInReformulation, refspec_id, $list9 ), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject rule_formula_specs = Sort.sort( rule_specs, Symbols.symbol_function( $sym6$_ ), Symbols.symbol_function( $sym7$SECOND ) );
    SubLObject reformulator_rules = NIL;
    SubLObject cdolist_list_var = rule_formula_specs;
    SubLObject rule_formula_spec = NIL;
    rule_formula_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject rule_formula = rule_formula_spec.first();
      final SubLObject rule_assertion = czer_meta.find_assertion_cycl( rule_formula, mt );
      final SubLObject reformulator_rule = ( NIL != assertion_handles.assertion_p( rule_assertion ) ) ? reformulator_datastructures.find_reformulator_rule_for_rule_assertion( rule_assertion ) : NIL;
      if( NIL != reformulator_rule_unifier_datastructures.reformulator_rule_p( reformulator_rule ) )
      {
        reformulator_rules = ConsesLow.cons( reformulator_rule, reformulator_rules );
      }
      cdolist_list_var = cdolist_list_var.rest();
      rule_formula_spec = cdolist_list_var.first();
    }
    return ( NIL != reformulator_rules ) ? conses_high.putf( settings, $kw8$REFORMULATOR_RULES, Sequences.nreverse( reformulator_rules ) ) : settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulation-specification.lisp", position = 5608L)
  public static SubLObject load_refspec_search_strategy(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt)
  {
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulation-specification.lisp", position = 5809L)
  public static SubLObject load_refspec_use_of_rl_modules(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt)
  {
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulation-specification.lisp", position = 6033L)
  public static SubLObject load_refspec_well_formedness_constraints_to_impose(final SubLObject refspec_id, SubLObject settings, final SubLObject mt)
  {
    settings = load_refspec_ignore_rl_modules( refspec_id, settings, mt );
    return settings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulation-specification.lisp", position = 6379L)
  public static SubLObject load_refspec_ignore_rl_modules(final SubLObject refspec_id, final SubLObject settings, final SubLObject mt)
  {
    assert NIL != reformulator_datastructures.valid_reformulator_setting_keyword_p( $kw11$IGNORE_RL_MODULES ) : $kw11$IGNORE_RL_MODULES;
    final SubLObject module_specs = ask_utilities.ask_template( $list12, ConsesLow.listS( $const13$ignoreModuleInReformulation, refspec_id, $list12 ), mt, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != module_specs ) ? conses_high.putf( settings, $kw11$IGNORE_RL_MODULES, Mapping.mapcar( Symbols.symbol_function( $sym5$FIRST ), Sort.sort( module_specs, Symbols.symbol_function( $sym6$_ ), Symbols
        .symbol_function( $sym7$SECOND ) ) ) ) : settings;
  }

  public static SubLObject declare_reformulation_specification_file()
  {
    SubLFiles.declareFunction( me, "load_reformulation_specification_from_kb", "LOAD-REFORMULATION-SPECIFICATION-FROM-KB", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulate_cycl_via_specification", "REFORMULATE-CYCL-VIA-SPECIFICATION", 3, 1, false );
    SubLFiles.declareFunction( me, "load_refspec_behaviour_wrt_recursion", "LOAD-REFSPEC-BEHAVIOUR-WRT-RECURSION", 3, 0, false );
    SubLFiles.declareFunction( me, "load_refspec_caching", "LOAD-REFSPEC-CACHING", 3, 0, false );
    SubLFiles.declareFunction( me, "load_refspec_modes", "LOAD-REFSPEC-MODES", 3, 0, false );
    SubLFiles.declareFunction( me, "load_refspec_precondition_checking", "LOAD-REFSPEC-PRECONDITION-CHECKING", 3, 0, false );
    SubLFiles.declareFunction( me, "load_refspec_reformulation_history", "LOAD-REFSPEC-REFORMULATION-HISTORY", 3, 0, false );
    SubLFiles.declareFunction( me, "load_refspec_reformulator_rules_to_use", "LOAD-REFSPEC-REFORMULATOR-RULES-TO-USE", 3, 0, false );
    SubLFiles.declareFunction( me, "load_refspec_meta_predicates", "LOAD-REFSPEC-META-PREDICATES", 3, 0, false );
    SubLFiles.declareFunction( me, "load_refspec_explicit_reformulator_rules", "LOAD-REFSPEC-EXPLICIT-REFORMULATOR-RULES", 3, 0, false );
    SubLFiles.declareFunction( me, "load_refspec_search_strategy", "LOAD-REFSPEC-SEARCH-STRATEGY", 3, 0, false );
    SubLFiles.declareFunction( me, "load_refspec_use_of_rl_modules", "LOAD-REFSPEC-USE-OF-RL-MODULES", 3, 0, false );
    SubLFiles.declareFunction( me, "load_refspec_well_formedness_constraints_to_impose", "LOAD-REFSPEC-WELL-FORMEDNESS-CONSTRAINTS-TO-IMPOSE", 3, 0, false );
    SubLFiles.declareFunction( me, "load_refspec_ignore_rl_modules", "LOAD-REFSPEC-IGNORE-RL-MODULES", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_reformulation_specification_file()
  {
    return NIL;
  }

  public static SubLObject setup_reformulation_specification_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_reformulation_specification_file();
  }

  @Override
  public void initializeVariables()
  {
    init_reformulation_specification_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_reformulation_specification_file();
  }
  static
  {
    me = new reformulation_specification();
    $const0$ReformulationSpecification = constant_handles.reader_make_constant_shell( makeString( "ReformulationSpecification" ) );
    $kw1$META_PREDICATES = makeKeyword( "META-PREDICATES" );
    $sym2$VALID_REFORMULATOR_SETTING_KEYWORD_P = makeSymbol( "VALID-REFORMULATOR-SETTING-KEYWORD-P" );
    $list3 = ConsesLow.list( makeSymbol( "?PRED" ), makeSymbol( "?POSITION" ) );
    $const4$useMetaPredicateInReformulation = constant_handles.reader_make_constant_shell( makeString( "useMetaPredicateInReformulation" ) );
    $sym5$FIRST = makeSymbol( "FIRST" );
    $sym6$_ = makeSymbol( "<" );
    $sym7$SECOND = makeSymbol( "SECOND" );
    $kw8$REFORMULATOR_RULES = makeKeyword( "REFORMULATOR-RULES" );
    $list9 = ConsesLow.list( makeSymbol( "?RULE" ), makeSymbol( "?POSITION" ) );
    $const10$useRuleInReformulation = constant_handles.reader_make_constant_shell( makeString( "useRuleInReformulation" ) );
    $kw11$IGNORE_RL_MODULES = makeKeyword( "IGNORE-RL-MODULES" );
    $list12 = ConsesLow.list( makeSymbol( "?MODULE" ), makeSymbol( "?POSITION" ) );
    $const13$ignoreModuleInReformulation = constant_handles.reader_make_constant_shell( makeString( "ignoreModuleInReformulation" ) );
  }
}
/*
 * 
 * Total time: 147 ms
 * 
 */