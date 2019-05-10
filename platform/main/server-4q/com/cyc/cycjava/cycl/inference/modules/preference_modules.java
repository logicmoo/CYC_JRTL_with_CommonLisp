package com.cyc.cycjava.cycl.inference.modules;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_abduction;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class preference_modules
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.preference_modules";
  public static final String myFingerPrint = "fbb6cc44efd26736fc2434c72afd320055fae8dc0a0c4e30326529b6f743fd35";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 10215L)
  private static SubLSymbol $within_generic_preference_analysisP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 11371L)
  public static SubLSymbol $min_preference_level$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 11531L)
  public static SubLSymbol $max_preference_level$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 11582L)
  public static SubLSymbol $default_preference_level$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 11641L)
  private static SubLSymbol $ordered_preference_levels$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 16256L)
  private static SubLSymbol $preference_module_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 18859L)
  private static SubLSymbol $preference_modules_by_name$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 19085L)
  private static SubLSymbol $generic_preference_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 19228L)
  private static SubLSymbol $specific_preference_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 19398L)
  private static SubLSymbol $preference_module_supplants$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLSymbol $dtp_preference_module$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 34416L)
  private static SubLSymbol $bindable_vars_lambda$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 35144L)
  private static SubLSymbol $preference_functions_from_must_bind_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 36303L)
  private static SubLSymbol $doom_module_store$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$DONE;
  private static final SubLSymbol $sym4$DO_SET;
  private static final SubLSymbol $sym5$_GENERIC_PREFERENCE_MODULES_;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$CSOME;
  private static final SubLSymbol $sym8$SPECIFIC_PREFERENCE_MODULES_FOR_PRED;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$PRED;
  private static final SubLSymbol $sym11$CLET;
  private static final SubLSymbol $sym12$ATOMIC_SENTENCE_PREDICATE;
  private static final SubLSymbol $sym13$DO_SPECIFIC_PREFERENCE_MODULES_FOR_PRED;
  private static final SubLSymbol $sym14$PWHEN;
  private static final SubLSymbol $sym15$PREFERENCE_MODULE_RELEVANT_;
  private static final SubLSymbol $sym16$DO_GENERIC_PREFERENCE_MODULES;
  private static final SubLSymbol $sym17$DO_DICTIONARY_VALUES;
  private static final SubLSymbol $sym18$_PREFERENCE_MODULES_BY_NAME_;
  private static final SubLSymbol $sym19$SINGLE_LITERAL_PROBLEM_P;
  private static final SubLString $str20$no_preference_modules_applicable;
  private static final SubLSymbol $kw21$DISALLOWED;
  private static final SubLSymbol $kw22$ALL;
  private static final SubLSymbol $sym23$PREFERENCE_MODULE_NAME;
  private static final SubLSymbol $sym24$SINGLETON_;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$POS_ATOMIC_CLAUSE_P;
  private static final SubLSymbol $kw27$TACTICAL;
  private static final SubLSymbol $kw28$UNSPECIFIED;
  private static final SubLSymbol $kw29$NEG;
  private static final SubLSymbol $kw30$POS;
  private static final SubLObject $const31$isa;
  private static final SubLObject $const32$genls;
  private static final SubLObject $const33$Thing;
  private static final SubLList $list34;
  private static final SubLSymbol $kw35$PREFERRED;
  private static final SubLString $str36$closed_asent;
  private static final SubLString $str37$open_negation;
  private static final SubLString $str38$no_removal_options;
  private static final SubLObject $const39$EverythingPSC;
  private static final SubLSymbol $kw40$DOOMED;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$PREFERENCE_LEVEL_P;
  private static final SubLString $str43$Preferred;
  private static final SubLSymbol $kw44$DISPREFERRED;
  private static final SubLString $str45$Dispreferred;
  private static final SubLSymbol $kw46$GROSSLY_DISPREFERRED;
  private static final SubLString $str47$Grossly_Dispreferred;
  private static final SubLString $str48$Disallowed;
  private static final SubLString $str49$Doomed;
  private static final SubLString $str50$Undetermined;
  private static final SubLString $str51$Unexpected_preference_level__a;
  private static final SubLSymbol $sym52$PREFERENCE_LEVEL__;
  private static final SubLSymbol $sym53$PREFERENCE_LEVEL__;
  private static final SubLSymbol $kw54$COMPLETE;
  private static final SubLSymbol $kw55$INCOMPLETE;
  private static final SubLSymbol $kw56$GROSSLY_INCOMPLETE;
  private static final SubLSymbol $kw57$IMPOSSIBLE;
  private static final SubLString $str58$unexpected_completeness__s;
  private static final SubLString $str59$unexpected_preference_level__s;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$PREFERENCE_MODULE_PROPERTY_P;
  private static final SubLSymbol $kw62$PREDICATE;
  private static final SubLSymbol $sym63$FORT_P;
  private static final SubLSymbol $kw64$SENSE;
  private static final SubLSymbol $sym65$SENSE_P;
  private static final SubLSymbol $kw66$REQUIRED_PATTERN;
  private static final SubLSymbol $sym67$CONSP;
  private static final SubLSymbol $kw68$REQUIRED_MT;
  private static final SubLSymbol $sym69$FORT_OR_POSSIBLY_NAUT_P;
  private static final SubLSymbol $kw70$ANY_PREDICATES;
  private static final SubLSymbol $sym71$LISTP;
  private static final SubLSymbol $kw72$EXCLUSIVE;
  private static final SubLSymbol $sym73$FUNCTION_SPEC_P;
  private static final SubLSymbol $kw74$SUPPLANTS;
  private static final SubLSymbol $sym75$SYMBOLP;
  private static final SubLString $str76$invalid__supplants_value__s;
  private static final SubLSymbol $kw77$PREFERENCE_LEVEL;
  private static final SubLSymbol $kw78$PREFERENCE;
  private static final SubLString $str79$unexpected_preference_module_prop;
  private static final SubLString $str80$_s_must_specify__sense;
  private static final SubLString $str81$_s_must_specify_exactly_one_of__p;
  private static final SubLSymbol $sym82$_SPECIFIC_PREFERENCE_MODULES_;
  private static final SubLSymbol $sym83$_PREFERENCE_MODULE_SUPPLANTS_;
  private static final SubLSymbol $sym84$PREFERENCE_MODULE;
  private static final SubLSymbol $sym85$PREFERENCE_MODULE_P;
  private static final SubLList $list86;
  private static final SubLList $list87;
  private static final SubLList $list88;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$PRINT_PREFERENCE_MODULE;
  private static final SubLSymbol $sym91$PREFERENCE_MODULE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$PREF_MOD_NAME;
  private static final SubLSymbol $sym94$_CSETF_PREF_MOD_NAME;
  private static final SubLSymbol $sym95$PREF_MOD_PREDICATE;
  private static final SubLSymbol $sym96$_CSETF_PREF_MOD_PREDICATE;
  private static final SubLSymbol $sym97$PREF_MOD_SENSE;
  private static final SubLSymbol $sym98$_CSETF_PREF_MOD_SENSE;
  private static final SubLSymbol $sym99$PREF_MOD_REQUIRED_PATTERN;
  private static final SubLSymbol $sym100$_CSETF_PREF_MOD_REQUIRED_PATTERN;
  private static final SubLSymbol $sym101$PREF_MOD_PREFERENCE_LEVEL;
  private static final SubLSymbol $sym102$_CSETF_PREF_MOD_PREFERENCE_LEVEL;
  private static final SubLSymbol $sym103$PREF_MOD_PREFERENCE_FUNC;
  private static final SubLSymbol $sym104$_CSETF_PREF_MOD_PREFERENCE_FUNC;
  private static final SubLSymbol $sym105$PREF_MOD_REQUIRED_MT;
  private static final SubLSymbol $sym106$_CSETF_PREF_MOD_REQUIRED_MT;
  private static final SubLSymbol $sym107$PREF_MOD_ANY_PREDICATES;
  private static final SubLSymbol $sym108$_CSETF_PREF_MOD_ANY_PREDICATES;
  private static final SubLSymbol $kw109$NAME;
  private static final SubLSymbol $kw110$PREFERENCE_FUNC;
  private static final SubLString $str111$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw112$BEGIN;
  private static final SubLSymbol $sym113$MAKE_PREFERENCE_MODULE;
  private static final SubLSymbol $kw114$SLOT;
  private static final SubLSymbol $kw115$END;
  private static final SubLSymbol $sym116$VISIT_DEFSTRUCT_OBJECT_PREFERENCE_MODULE_METHOD;
  private static final SubLString $str117$_PREFMOD__a_;
  private static final SubLSymbol $sym118$SXHASH_PREFERENCE_MODULE_METHOD;
  private static final SubLSymbol $sym119$KEYWORDP;
  private static final SubLList $list120;
  private static final SubLList $list121;
  private static final SubLString $str122$module_;
  private static final SubLString $str123$sense___;
  private static final SubLString $str124$predicate___;
  private static final SubLString $str125$any_predicates___;
  private static final SubLString $str126$required_pattern___;
  private static final SubLString $str127$required_mt___;
  private static final SubLString $str128$preference_level___;
  private static final SubLString $str129$preference_function___;
  private static final SubLSymbol $sym130$PATTERN_MATCHES_FORMULA;
  private static final SubLSymbol $sym131$TVA_POS_PREFERENCE;
  private static final SubLSymbol $sym132$MUST_BIND_ARG1;
  private static final SubLSymbol $sym133$MUST_BIND_ARG2;
  private static final SubLSymbol $sym134$MUST_BIND_ARG3;
  private static final SubLSymbol $sym135$MUST_BIND_ARG4;
  private static final SubLSymbol $sym136$MUST_BIND_ARG5;
  private static final SubLList $list137;
  private static final SubLSymbol $sym138$MUST_BIND_ARG1_AND_ARG2;
  private static final SubLList $list139;
  private static final SubLSymbol $sym140$MUST_BIND_ARG1_AND_ARG3;
  private static final SubLList $list141;
  private static final SubLSymbol $sym142$MUST_BIND_ARG2_AND_ARG3;
  private static final SubLList $list143;
  private static final SubLSymbol $sym144$MUST_BIND_ARG1_ARG2_AND_ARG3;
  private static final SubLSymbol $sym145$MUST_BIND_ARG1_OR_ARG2;
  private static final SubLSymbol $sym146$MUST_BIND_ARG1_OR_ARG3;
  private static final SubLSymbol $sym147$MUST_BIND_ARG2_OR_ARG3;
  private static final SubLSymbol $sym148$MUST_BIND_ALL_ARGS;
  private static final SubLSymbol $kw149$REGULARIZE;
  private static final SubLSymbol $sym150$_EXIT;
  private static final SubLSymbol $sym151$NON_BINDABLE_VAR_;
  private static final SubLSymbol $kw152$BOTH;
  private static final SubLList $list153;
  private static final SubLString $str154$No_preference_function_registered;
  private static final SubLSymbol $kw155$ANYTHING;
  private static final SubLSymbol $kw156$NOT_FULLY_BOUND;
  private static final SubLSymbol $sym157$_DOOM_MODULE_STORE_;
  private static final SubLSymbol $sym158$NON_NEGATIVE_INTEGER_P;
  private static final SubLList $list159;
  private static final SubLSymbol $sym160$SENSE_SPEC_P;
  private static final SubLSymbol $sym161$DISALLOWED_PATTERN_P;
  private static final SubLList $list162;
  private static final SubLSymbol $sym163$TINY_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES;
  private static final SubLSymbol $kw164$TEST;
  private static final SubLSymbol $kw165$OWNER;
  private static final SubLSymbol $kw166$CLASSES;
  private static final SubLSymbol $kw167$KB;
  private static final SubLSymbol $kw168$TINY;
  private static final SubLSymbol $kw169$WORKING_;
  private static final SubLList $list170;
  private static final SubLSymbol $sym171$FULL_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES;
  private static final SubLSymbol $kw172$FULL;
  private static final SubLList $list173;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 1508L)
  public static SubLObject do_generic_preference_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject prefmod = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    prefmod = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym4$DO_SET, ConsesLow.list( prefmod, $sym5$_GENERIC_PREFERENCE_MODULES_, $kw3$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 2307L)
  public static SubLObject do_specific_preference_modules_for_pred(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject prefmod = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    prefmod = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    pred = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list6 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list6 );
      if( NIL == conses_high.member( current_$2, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym7$CSOME, ConsesLow.list( prefmod, ConsesLow.list( $sym8$SPECIFIC_PREFERENCE_MODULES_FOR_PRED, pred ), done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 2494L)
  public static SubLObject do_relevant_preference_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject prefmod = NIL;
    SubLObject asent = NIL;
    SubLObject sense = NIL;
    SubLObject bindable_vars = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    prefmod = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    asent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    sense = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    bindable_vars = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list9 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list9 );
      if( NIL == conses_high.member( current_$3, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject pred = $sym10$PRED;
    return ConsesLow.list( $sym11$CLET, ConsesLow.list( ConsesLow.list( pred, ConsesLow.list( $sym12$ATOMIC_SENTENCE_PREDICATE, asent ) ) ), ConsesLow.list( $sym13$DO_SPECIFIC_PREFERENCE_MODULES_FOR_PRED, ConsesLow.list(
        prefmod, pred, $kw3$DONE, done ), ConsesLow.listS( $sym14$PWHEN, ConsesLow.list( $sym15$PREFERENCE_MODULE_RELEVANT_, prefmod, asent, sense, bindable_vars ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list(
            $sym16$DO_GENERIC_PREFERENCE_MODULES, ConsesLow.list( prefmod, $kw3$DONE, done ), ConsesLow.listS( $sym14$PWHEN, ConsesLow.list( $sym15$PREFERENCE_MODULE_RELEVANT_, prefmod, asent, sense, bindable_vars ),
                ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 3113L)
  public static SubLObject do_preference_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject prefmod = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    prefmod = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$4, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym17$DO_DICTIONARY_VALUES, ConsesLow.list( prefmod, $sym18$_PREFERENCE_MODULES_BY_NAME_, $kw3$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 3282L)
  public static SubLObject single_literal_problem_preference_level_wrt_modules(final SubLObject problem, final SubLObject strategic_context, final SubLObject shared_vars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_problem.single_literal_problem_p( problem ) : problem;
    SubLObject preference_level = NIL;
    SubLObject justification = NIL;
    thread.resetMultipleValues();
    final SubLObject mt = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem( problem );
    final SubLObject asent = thread.secondMultipleValue();
    final SubLObject sense = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      thread.resetMultipleValues();
      final SubLObject preference_level_$5 = literal_preference_level_wrt_modules( asent, sense, shared_vars, strategic_context );
      final SubLObject justification_$6 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      preference_level = preference_level_$5;
      justification = justification_$6;
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( preference_level, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 3894L)
  public static SubLObject literal_preference_level_wrt_modules(final SubLObject asent, final SubLObject sense, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    SubLObject min_preference_level = $min_preference_level$.getGlobalValue();
    SubLObject justification = $str20$no_preference_modules_applicable;
    SubLObject disallowedP = NIL;
    if( NIL != bindable_vars )
    {
      final SubLObject relevant_modules = all_relevant_preference_modules( asent, sense, bindable_vars );
      SubLObject rest;
      SubLObject prefmod;
      SubLObject preference_level;
      for( rest = NIL, rest = relevant_modules; NIL == disallowedP && NIL != rest; rest = rest.rest() )
      {
        prefmod = rest.first();
        preference_level = preference_module_compute_preference_level( prefmod, asent, bindable_vars, strategic_context );
        if( NIL != preference_level )
        {
          if( NIL != preference_level_L( preference_level, min_preference_level ) )
          {
            min_preference_level = preference_level;
            justification = string_utilities.str( preference_module_name( prefmod ) );
          }
          if( $kw21$DISALLOWED == preference_level )
          {
            disallowedP = T;
          }
        }
      }
    }
    return Values.values( min_preference_level, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 4887L)
  public static SubLObject all_relevant_preference_modules(final SubLObject asent, final SubLObject sense, final SubLObject bindable_vars)
  {
    SubLObject candidate_modules = NIL;
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject csome_list_var = specific_preference_modules_for_pred( pred );
    SubLObject prefmod = NIL;
    prefmod = csome_list_var.first();
    while ( NIL != csome_list_var)
    {
      if( NIL != preference_module_relevantP( prefmod, asent, sense, bindable_vars ) )
      {
        candidate_modules = ConsesLow.cons( prefmod, candidate_modules );
      }
      csome_list_var = csome_list_var.rest();
      prefmod = csome_list_var.first();
    }
    final SubLObject set_contents_var = set.do_set_internal( $generic_preference_modules$.getGlobalValue() );
    SubLObject basis_object;
    SubLObject state;
    SubLObject prefmod2;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      prefmod2 = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, prefmod2 ) && NIL != preference_module_relevantP( prefmod2, asent, sense, bindable_vars ) )
      {
        candidate_modules = ConsesLow.cons( prefmod2, candidate_modules );
      }
    }
    SubLObject relevant_modules = NIL;
    SubLObject supplanted_module_names = NIL;
    SubLObject cdolist_list_var = candidate_modules;
    SubLObject candidate_module = NIL;
    candidate_module = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $kw22$ALL != supplanted_module_names && NIL == list_utilities.member_eqP( preference_module_name( candidate_module ), supplanted_module_names ) )
      {
        if( NIL != preference_module_exclusiveP( candidate_module ) )
        {
          final SubLObject supplants_spec = preference_module_supplants( candidate_module );
          if( $kw22$ALL == supplants_spec )
          {
            supplanted_module_names = $kw22$ALL;
            relevant_modules = NIL;
          }
          else
          {
            SubLObject cdolist_list_var_$7 = supplants_spec;
            SubLObject supplanted_module_name = NIL;
            supplanted_module_name = cdolist_list_var_$7.first();
            while ( NIL != cdolist_list_var_$7)
            {
              relevant_modules = Sequences.delete( supplanted_module_name, relevant_modules, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym23$PREFERENCE_MODULE_NAME ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
              final SubLObject item_var = supplanted_module_name;
              if( NIL == conses_high.member( item_var, supplanted_module_names, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                supplanted_module_names = ConsesLow.cons( item_var, supplanted_module_names );
              }
              cdolist_list_var_$7 = cdolist_list_var_$7.rest();
              supplanted_module_name = cdolist_list_var_$7.first();
            }
          }
        }
        relevant_modules = ConsesLow.cons( candidate_module, relevant_modules );
      }
      cdolist_list_var = cdolist_list_var.rest();
      candidate_module = cdolist_list_var.first();
    }
    return relevant_modules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 6010L)
  public static SubLObject el_literal_preference_level_wrt_modules(final SubLObject el_asent, final SubLObject sense, final SubLObject el_bindable_vars, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preference_level = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
      final SubLObject czer_results = czer_main.canonicalize_query_sentence( el_asent, UNPROVIDED );
      assert NIL != list_utilities.singletonP( czer_results ) : czer_results;
      final SubLObject czer_result = czer_results.first();
      SubLObject current;
      final SubLObject datum = current = czer_result;
      SubLObject dnf_clause = NIL;
      SubLObject v_bindings = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
      dnf_clause = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
      v_bindings = current.first();
      current = current.rest();
      if( NIL == current )
      {
        assert NIL != clause_utilities.pos_atomic_clause_p( dnf_clause ) : dnf_clause;
        final SubLObject hl_asent = clause_utilities.atomic_clause_asent( dnf_clause );
        final SubLObject hl_bindable_vars = bindings.apply_bindings( v_bindings, el_bindable_vars );
        preference_level = literal_preference_level_wrt_modules( hl_asent, sense, hl_bindable_vars, $kw27$TACTICAL );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return preference_level;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 6714L)
  public static SubLObject statically_sort_conjunct_literals(final SubLObject literals, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return statically_sort_conjunct_literals_recursive( literals, mt, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 7194L)
  public static SubLObject statically_sort_conjunct_literals_recursive(final SubLObject literals, final SubLObject mt, final SubLObject reverse_sorted_literals)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == literals )
    {
      return Sequences.nreverse( reverse_sorted_literals );
    }
    thread.resetMultipleValues();
    final SubLObject next_literal = statically_select_next_conjunct_literal( literals, reverse_sorted_literals );
    final SubLObject remaining_literals = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return statically_sort_conjunct_literals_recursive( remaining_literals, mt, ConsesLow.cons( next_literal, reverse_sorted_literals ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 7669L)
  public static SubLObject statically_select_next_conjunct_literal(final SubLObject literals, final SubLObject reverse_sorted_literals)
  {
    if( NIL != list_utilities.singletonP( literals ) )
    {
      return Values.values( literals.first(), NIL );
    }
    SubLObject best_literal = $kw28$UNSPECIFIED;
    SubLObject best_remaining = $kw28$UNSPECIFIED;
    SubLObject best_preference = $kw28$UNSPECIFIED;
    SubLObject best_cost = $kw28$UNSPECIFIED;
    SubLObject cdolist_list_var = literals;
    SubLObject candidate_literal = NIL;
    candidate_literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject remaining_literals = Sequences.remove( candidate_literal, literals, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject bound_vars = variables.gather_hl_variables( reverse_sorted_literals );
      final SubLObject literal_vars = variables.gather_hl_variables( candidate_literal );
      final SubLObject remaining_vars = variables.gather_hl_variables( remaining_literals );
      final SubLObject shared_vars = conses_high.intersection( literal_vars, remaining_vars, Symbols.symbol_function( EQL ), UNPROVIDED );
      final SubLObject bound_literal_vars = conses_high.intersection( literal_vars, bound_vars, Symbols.symbol_function( EQL ), UNPROVIDED );
      final SubLObject bindable_vars = conses_high.set_difference( shared_vars, bound_vars, Symbols.symbol_function( EQL ), UNPROVIDED );
      final SubLObject candidate_asent = ( NIL != cycl_utilities.negatedP( candidate_literal ) ) ? cycl_utilities.negate( candidate_literal ) : candidate_literal;
      final SubLObject candidate_sense = ( NIL != cycl_utilities.negatedP( candidate_literal ) ) ? $kw29$NEG : $kw30$POS;
      final SubLObject analysis_asent = compute_analysis_asent_wrt_static_sort( candidate_asent, bound_literal_vars );
      final SubLObject candidate_preference = literal_preference_level_wrt_static_sort( analysis_asent, candidate_sense, bindable_vars );
      final SubLObject candidate_cost = literal_removal_cost_wrt_static_sort( analysis_asent, candidate_sense );
      if( $kw28$UNSPECIFIED.eql( best_preference ) || NIL != preference_level_G( candidate_preference, best_preference ) || ( candidate_preference.equal( best_preference ) && candidate_cost.numL( best_cost ) ) )
      {
        best_literal = candidate_literal;
        best_remaining = remaining_literals;
        best_preference = candidate_preference;
        best_cost = candidate_cost;
      }
      cdolist_list_var = cdolist_list_var.rest();
      candidate_literal = cdolist_list_var.first();
    }
    return Values.values( best_literal, best_remaining );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 9518L)
  public static SubLObject compute_analysis_asent_wrt_static_sort(SubLObject asent, final SubLObject bound_literal_vars)
  {
    if( NIL != bound_literal_vars )
    {
      final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
      final SubLObject generic_term = compute_generic_term_for_bound_argument_of_predicate( predicate );
      SubLObject cdolist_list_var = bound_literal_vars;
      SubLObject bound_var = NIL;
      bound_var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != list_utilities.simple_tree_findP( bound_var, asent ) )
        {
          asent = conses_high.subst( generic_term, bound_var, asent, Symbols.symbol_function( EQL ), UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        bound_var = cdolist_list_var.first();
      }
    }
    return asent;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 9943L)
  public static SubLObject compute_generic_term_for_bound_argument_of_predicate(final SubLObject predicate)
  {
    if( predicate.eql( $const31$isa ) || predicate.eql( $const32$genls ) )
    {
      return $const33$Thing;
    }
    return $list34;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 10359L)
  public static SubLObject within_generic_preference_analysisP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $within_generic_preference_analysisP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 10464L)
  public static SubLObject literal_preference_level_wrt_static_sort(final SubLObject asent, final SubLObject sense, final SubLObject bindable_vars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != variables.fully_bound_p( asent ) )
    {
      return Values.values( $kw35$PREFERRED, $str36$closed_asent );
    }
    if( sense == $kw29$NEG && NIL != bindable_vars )
    {
      return Values.values( $kw21$DISALLOWED, $str37$open_negation );
    }
    if( NIL == inference_worker_removal.literal_removal_options( asent, sense, UNPROVIDED ) )
    {
      return Values.values( $kw21$DISALLOWED, $str38$no_removal_options );
    }
    SubLObject preference = NIL;
    SubLObject reason = NIL;
    final SubLObject _prev_bind_0 = $within_generic_preference_analysisP$.currentBinding( thread );
    try
    {
      $within_generic_preference_analysisP$.bind( T, thread );
      thread.resetMultipleValues();
      final SubLObject preference_$8 = literal_preference_level_wrt_modules( asent, sense, bindable_vars, $kw27$TACTICAL );
      final SubLObject reason_$9 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      preference = preference_$8;
      reason = reason_$9;
    }
    finally
    {
      $within_generic_preference_analysisP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( preference, reason );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 11206L)
  public static SubLObject literal_removal_cost_wrt_static_sort(final SubLObject asent, final SubLObject sense)
  {
    return inference_utilities.literal_removal_cost( asent, sense, $const39$EverythingPSC, removal_modules_abduction.abductive_modules_not_allowed_spec() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 12616L)
  public static SubLObject preference_level_string(final SubLObject preference_level)
  {
    if( NIL != preference_level && !assertionsDisabledInClass && NIL == preference_level_p( preference_level ) )
    {
      throw new AssertionError( preference_level );
    }
    if( preference_level.eql( $kw35$PREFERRED ) )
    {
      return $str43$Preferred;
    }
    if( preference_level.eql( $kw44$DISPREFERRED ) )
    {
      return $str45$Dispreferred;
    }
    if( preference_level.eql( $kw46$GROSSLY_DISPREFERRED ) )
    {
      return $str47$Grossly_Dispreferred;
    }
    if( preference_level.eql( $kw21$DISALLOWED ) )
    {
      return $str48$Disallowed;
    }
    if( preference_level.eql( $kw40$DOOMED ) )
    {
      return $str49$Doomed;
    }
    if( preference_level.eql( NIL ) )
    {
      return $str50$Undetermined;
    }
    Errors.error( $str51$Unexpected_preference_level__a, preference_level );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 13151L)
  public static SubLObject preference_level_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $ordered_preference_levels$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 13252L)
  public static SubLObject disallowed_preference_level_p(final SubLObject v_object)
  {
    return Equality.eq( $kw21$DISALLOWED, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 13340L)
  public static SubLObject doomed_preference_level_p(final SubLObject v_object)
  {
    return Equality.eq( $kw40$DOOMED, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 13420L)
  public static SubLObject disallowed_or_doomed_preference_level_p(final SubLObject v_object)
  {
    return makeBoolean( $kw21$DISALLOWED == v_object || $kw40$DOOMED == v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 13549L)
  public static SubLObject preference_level_L(final SubLObject preference_level1, final SubLObject preference_level2)
  {
    assert NIL != preference_level_p( preference_level1 ) : preference_level1;
    assert NIL != preference_level_p( preference_level2 ) : preference_level2;
    return list_utilities.position_L( preference_level1, preference_level2, $ordered_preference_levels$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 13901L)
  public static SubLObject preference_level_G(final SubLObject preference_level1, final SubLObject preference_level2)
  {
    return preference_level_L( preference_level2, preference_level1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 14129L)
  public static SubLObject preference_level_LE(final SubLObject preference_level1, final SubLObject preference_level2)
  {
    return makeBoolean( NIL == preference_level_G( preference_level1, preference_level2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 14276L)
  public static SubLObject preference_level_GE(final SubLObject preference_level1, final SubLObject preference_level2)
  {
    return makeBoolean( NIL == preference_level_L( preference_level1, preference_level2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 14423L)
  public static SubLObject min_preference_level(final SubLObject preference_level_list)
  {
    return ( NIL != preference_level_list ) ? list_utilities.extremal( preference_level_list, $sym52$PREFERENCE_LEVEL__, UNPROVIDED )
        : conses_high.last( $ordered_preference_levels$.getGlobalValue(), UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 14721L)
  public static SubLObject min2_preference_level(final SubLObject preference_level1, final SubLObject preference_level2)
  {
    return ( NIL != preference_level_L( preference_level2, preference_level1 ) ) ? preference_level2 : preference_level1;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 14905L)
  public static SubLObject max_preference_level(final SubLObject preference_level_list)
  {
    return ( NIL != preference_level_list ) ? list_utilities.extremal( preference_level_list, $sym53$PREFERENCE_LEVEL__, UNPROVIDED ) : $ordered_preference_levels$.getGlobalValue().first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 15195L)
  public static SubLObject max2_preference_level(final SubLObject preference_level1, final SubLObject preference_level2)
  {
    return ( NIL != preference_level_L( preference_level2, preference_level1 ) ) ? preference_level1 : preference_level2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 15379L)
  public static SubLObject completeness_to_preference_level(final SubLObject completeness)
  {
    if( completeness.eql( $kw54$COMPLETE ) )
    {
      return $kw35$PREFERRED;
    }
    if( completeness.eql( $kw55$INCOMPLETE ) )
    {
      return $kw44$DISPREFERRED;
    }
    if( completeness.eql( $kw56$GROSSLY_INCOMPLETE ) )
    {
      return $kw46$GROSSLY_DISPREFERRED;
    }
    if( completeness.eql( $kw57$IMPOSSIBLE ) )
    {
      return $kw21$DISALLOWED;
    }
    return Errors.error( $str58$unexpected_completeness__s, completeness );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 15784L)
  public static SubLObject preference_level_to_completeness(final SubLObject preference_level)
  {
    if( preference_level.eql( $kw35$PREFERRED ) )
    {
      return $kw54$COMPLETE;
    }
    if( preference_level.eql( $kw44$DISPREFERRED ) )
    {
      return $kw55$INCOMPLETE;
    }
    if( preference_level.eql( $kw46$GROSSLY_DISPREFERRED ) )
    {
      return $kw56$GROSSLY_INCOMPLETE;
    }
    if( preference_level.eql( $kw21$DISALLOWED ) )
    {
      return $kw57$IMPOSSIBLE;
    }
    if( preference_level.eql( $kw40$DOOMED ) )
    {
      return $kw57$IMPOSSIBLE;
    }
    return Errors.error( $str59$unexpected_preference_level__s, preference_level );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17549L)
  public static SubLObject preference_module_property_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $preference_module_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 17664L)
  public static SubLObject check_preference_module_properties(final SubLObject plist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    SubLObject pcase_var;
    for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != preference_module_property_p( property ) : property;
      pcase_var = property;
      if( pcase_var.eql( $kw62$PREDICATE ) )
      {
        assert NIL != forts.fort_p( value ) : value;
      }
      else if( pcase_var.eql( $kw64$SENSE ) )
      {
        assert NIL != enumeration_types.sense_p( value ) : value;
      }
      else if( pcase_var.eql( $kw66$REQUIRED_PATTERN ) )
      {
        assert NIL != Types.consp( value ) : value;
      }
      else if( pcase_var.eql( $kw68$REQUIRED_MT ) )
      {
        assert NIL != cycl_utilities.fort_or_possibly_naut_p( value ) : value;
      }
      else if( pcase_var.eql( $kw70$ANY_PREDICATES ) )
      {
        assert NIL != Types.listp( value ) : value;
      }
      else if( pcase_var.eql( $kw72$EXCLUSIVE ) )
      {
        assert NIL != Types.function_spec_p( value ) : value;
      }
      else if( pcase_var.eql( $kw74$SUPPLANTS ) )
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && value != $kw22$ALL && ( NIL == list_utilities.proper_list_p( value ) || NIL == list_utilities.every_in_list( $sym75$SYMBOLP, value, UNPROVIDED ) ) )
        {
          Errors.error( $str76$invalid__supplants_value__s, value );
        }
      }
      else if( pcase_var.eql( $kw77$PREFERENCE_LEVEL ) )
      {
        assert NIL != preference_level_p( value ) : value;
      }
      else if( pcase_var.eql( $kw78$PREFERENCE ) )
      {
        assert NIL != Types.symbolp( value ) : value;
      }
      else
      {
        Errors.error( $str79$unexpected_preference_module_prop, property );
      }
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.getf( plist, $kw64$SENSE, UNPROVIDED ) )
    {
      Errors.error( $str80$_s_must_specify__sense, plist );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && makeBoolean( NIL == conses_high.getf( plist, $kw77$PREFERENCE_LEVEL, UNPROVIDED ) ).eql( makeBoolean( NIL == conses_high.getf( plist, $kw78$PREFERENCE,
        UNPROVIDED ) ) ) )
    {
      Errors.error( $str81$_s_must_specify_exactly_one_of__p, plist );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 19586L)
  public static SubLObject reclassify_preference_modules()
  {
    dictionary.dictionary_rebuild( $specific_preference_modules$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 19765L)
  public static SubLObject generic_preference_modules()
  {
    return set.set_element_list( $generic_preference_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 19910L)
  public static SubLObject generic_preference_module_count()
  {
    return set.set_size( $generic_preference_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 20013L)
  public static SubLObject specific_preference_module_count()
  {
    return dictionary.dictionary_length( $specific_preference_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 20127L)
  public static SubLObject preference_module_count()
  {
    return Numbers.add( generic_preference_module_count(), specific_preference_module_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 20257L)
  public static SubLObject specific_preference_module_predicates()
  {
    return dictionary.dictionary_keys( $specific_preference_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 20374L)
  public static SubLObject specific_preference_modules_for_pred(final SubLObject pred)
  {
    return dictionary.dictionary_lookup_without_values( $specific_preference_modules$.getGlobalValue(), pred, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 20516L)
  public static SubLObject predicate_has_specific_preference_modulesP(final SubLObject predicate)
  {
    return list_utilities.sublisp_boolean( specific_preference_modules_for_pred( predicate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 20655L)
  public static SubLObject note_preference_module_supplants(final SubLObject prefmod, final SubLObject supplants)
  {
    if( NIL == supplants )
    {
      dictionary.dictionary_remove( $preference_module_supplants$.getGlobalValue(), prefmod );
    }
    else
    {
      dictionary.dictionary_enter( $preference_module_supplants$.getGlobalValue(), prefmod, supplants );
    }
    return prefmod;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 20920L)
  public static SubLObject preference_module_exclusiveP(final SubLObject prefmod)
  {
    return list_utilities.sublisp_boolean( dictionary.dictionary_lookup_without_values( $preference_module_supplants$.getGlobalValue(), prefmod, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 21072L)
  public static SubLObject preference_module_supplants(final SubLObject prefmod)
  {
    return dictionary.dictionary_lookup_without_values( $preference_module_supplants$.getGlobalValue(), prefmod, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 21213L)
  public static SubLObject deregister_preference_module(final SubLObject prefmod)
  {
    final SubLObject pred = preference_module_predicate( prefmod );
    if( NIL != pred )
    {
      dictionary_utilities.dictionary_delete_from_value( $specific_preference_modules$.getGlobalValue(), pred, prefmod, UNPROVIDED, UNPROVIDED );
    }
    set.set_remove( prefmod, $generic_preference_modules$.getGlobalValue() );
    dictionary.dictionary_remove( $preference_modules_by_name$.getGlobalValue(), preference_module_name( prefmod ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 21777L)
  public static SubLObject register_preference_module(final SubLObject prefmod)
  {
    dictionary.dictionary_enter( $preference_modules_by_name$.getGlobalValue(), preference_module_name( prefmod ), prefmod );
    final SubLObject predicate = preference_module_predicate( prefmod );
    if( NIL != predicate )
    {
      dictionary_utilities.dictionary_push( $specific_preference_modules$.getGlobalValue(), predicate, prefmod );
    }
    else
    {
      set.set_add( prefmod, $generic_preference_modules$.getGlobalValue() );
    }
    return prefmod;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22137L)
  public static SubLObject deregister_all_preference_modules_for_predicate(final SubLObject predicate)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = specific_preference_modules_for_pred( predicate );
    SubLObject prefmod = NIL;
    prefmod = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      deregister_preference_module( prefmod );
      count = Numbers.add( count, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      prefmod = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject preference_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_preference_module( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject preference_module_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $preference_module_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject pref_mod_name(final SubLObject v_object)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject pref_mod_predicate(final SubLObject v_object)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject pref_mod_sense(final SubLObject v_object)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject pref_mod_required_pattern(final SubLObject v_object)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject pref_mod_preference_level(final SubLObject v_object)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject pref_mod_preference_func(final SubLObject v_object)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject pref_mod_required_mt(final SubLObject v_object)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject pref_mod_any_predicates(final SubLObject v_object)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject _csetf_pref_mod_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject _csetf_pref_mod_predicate(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject _csetf_pref_mod_sense(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject _csetf_pref_mod_required_pattern(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject _csetf_pref_mod_preference_level(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject _csetf_pref_mod_preference_func(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject _csetf_pref_mod_required_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject _csetf_pref_mod_any_predicates(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != preference_module_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject make_preference_module(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $preference_module_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw109$NAME ) )
      {
        _csetf_pref_mod_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw62$PREDICATE ) )
      {
        _csetf_pref_mod_predicate( v_new, current_value );
      }
      else if( pcase_var.eql( $kw64$SENSE ) )
      {
        _csetf_pref_mod_sense( v_new, current_value );
      }
      else if( pcase_var.eql( $kw66$REQUIRED_PATTERN ) )
      {
        _csetf_pref_mod_required_pattern( v_new, current_value );
      }
      else if( pcase_var.eql( $kw77$PREFERENCE_LEVEL ) )
      {
        _csetf_pref_mod_preference_level( v_new, current_value );
      }
      else if( pcase_var.eql( $kw110$PREFERENCE_FUNC ) )
      {
        _csetf_pref_mod_preference_func( v_new, current_value );
      }
      else if( pcase_var.eql( $kw68$REQUIRED_MT ) )
      {
        _csetf_pref_mod_required_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw70$ANY_PREDICATES ) )
      {
        _csetf_pref_mod_any_predicates( v_new, current_value );
      }
      else
      {
        Errors.error( $str111$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject visit_defstruct_preference_module(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw112$BEGIN, $sym113$MAKE_PREFERENCE_MODULE, EIGHT_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw114$SLOT, $kw109$NAME, pref_mod_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw114$SLOT, $kw62$PREDICATE, pref_mod_predicate( obj ) );
    Functions.funcall( visitor_fn, obj, $kw114$SLOT, $kw64$SENSE, pref_mod_sense( obj ) );
    Functions.funcall( visitor_fn, obj, $kw114$SLOT, $kw66$REQUIRED_PATTERN, pref_mod_required_pattern( obj ) );
    Functions.funcall( visitor_fn, obj, $kw114$SLOT, $kw77$PREFERENCE_LEVEL, pref_mod_preference_level( obj ) );
    Functions.funcall( visitor_fn, obj, $kw114$SLOT, $kw110$PREFERENCE_FUNC, pref_mod_preference_func( obj ) );
    Functions.funcall( visitor_fn, obj, $kw114$SLOT, $kw68$REQUIRED_MT, pref_mod_required_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw114$SLOT, $kw70$ANY_PREDICATES, pref_mod_any_predicates( obj ) );
    Functions.funcall( visitor_fn, obj, $kw115$END, $sym113$MAKE_PREFERENCE_MODULE, EIGHT_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 22926L)
  public static SubLObject visit_defstruct_object_preference_module_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_preference_module( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 23220L)
  public static SubLObject print_preference_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str117$_PREFMOD__a_, pref_mod_name( v_object ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 23369L)
  public static SubLObject sxhash_preference_module_method(final SubLObject v_object)
  {
    return Sxhash.sxhash( pref_mod_name( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 23462L)
  public static SubLObject find_preference_module(final SubLObject name)
  {
    assert NIL != Types.keywordp( name ) : name;
    return dictionary.dictionary_lookup_without_values( $preference_modules_by_name$.getGlobalValue(), name, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 23672L)
  public static SubLObject inference_preference_module(final SubLObject name, final SubLObject plist)
  {
    assert NIL != Types.keywordp( name ) : name;
    check_preference_module_properties( plist );
    SubLObject prefmod = find_preference_module( name );
    if( NIL != prefmod )
    {
      deregister_preference_module( prefmod );
    }
    else
    {
      prefmod = make_preference_module( UNPROVIDED );
    }
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = plist;
    SubLObject bad = NIL;
    SubLObject current_$10 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, plist, $list120 );
      current_$10 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, plist, $list120 );
      if( NIL == conses_high.member( current_$10, $list121, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$10 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( plist, $list120 );
    }
    final SubLObject predicate_tail = cdestructuring_bind.property_list_member( $kw62$PREDICATE, plist );
    final SubLObject predicate = ( NIL != predicate_tail ) ? conses_high.cadr( predicate_tail ) : NIL;
    final SubLObject sense_tail = cdestructuring_bind.property_list_member( $kw64$SENSE, plist );
    final SubLObject sense = ( NIL != sense_tail ) ? conses_high.cadr( sense_tail ) : NIL;
    final SubLObject any_predicates_tail = cdestructuring_bind.property_list_member( $kw70$ANY_PREDICATES, plist );
    final SubLObject any_predicates = ( NIL != any_predicates_tail ) ? conses_high.cadr( any_predicates_tail ) : NIL;
    final SubLObject required_pattern_tail = cdestructuring_bind.property_list_member( $kw66$REQUIRED_PATTERN, plist );
    final SubLObject required_pattern = ( NIL != required_pattern_tail ) ? conses_high.cadr( required_pattern_tail ) : NIL;
    final SubLObject required_mt_tail = cdestructuring_bind.property_list_member( $kw68$REQUIRED_MT, plist );
    final SubLObject required_mt = ( NIL != required_mt_tail ) ? conses_high.cadr( required_mt_tail ) : NIL;
    final SubLObject supplants_tail = cdestructuring_bind.property_list_member( $kw74$SUPPLANTS, plist );
    final SubLObject supplants = ( NIL != supplants_tail ) ? conses_high.cadr( supplants_tail ) : NIL;
    final SubLObject preference_level_tail = cdestructuring_bind.property_list_member( $kw77$PREFERENCE_LEVEL, plist );
    final SubLObject preference_level = ( NIL != preference_level_tail ) ? conses_high.cadr( preference_level_tail ) : NIL;
    final SubLObject preference_tail = cdestructuring_bind.property_list_member( $kw78$PREFERENCE, plist );
    final SubLObject preference = ( NIL != preference_tail ) ? conses_high.cadr( preference_tail ) : NIL;
    _csetf_pref_mod_name( prefmod, name );
    _csetf_pref_mod_predicate( prefmod, predicate );
    _csetf_pref_mod_any_predicates( prefmod, any_predicates );
    _csetf_pref_mod_sense( prefmod, sense );
    _csetf_pref_mod_required_pattern( prefmod, required_pattern );
    _csetf_pref_mod_required_mt( prefmod, required_mt );
    _csetf_pref_mod_preference_level( prefmod, preference_level );
    _csetf_pref_mod_preference_func( prefmod, preference );
    note_preference_module_supplants( prefmod, supplants );
    register_preference_module( prefmod );
    return prefmod;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 24712L)
  public static SubLObject undeclare_inference_preference_module(final SubLObject name)
  {
    final SubLObject prefmod = find_preference_module( name );
    if( NIL != prefmod )
    {
      deregister_preference_module( prefmod );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 24933L)
  public static SubLObject preference_module_name(final SubLObject prefmod)
  {
    assert NIL != preference_module_p( prefmod ) : prefmod;
    return pref_mod_name( prefmod );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 25073L)
  public static SubLObject preference_module_predicate(final SubLObject prefmod)
  {
    assert NIL != preference_module_p( prefmod ) : prefmod;
    return pref_mod_predicate( prefmod );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 25209L)
  public static SubLObject preference_module_any_predicates(final SubLObject prefmod)
  {
    assert NIL != preference_module_p( prefmod ) : prefmod;
    return pref_mod_any_predicates( prefmod );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 25355L)
  public static SubLObject preference_module_sense(final SubLObject prefmod)
  {
    assert NIL != preference_module_p( prefmod ) : prefmod;
    return pref_mod_sense( prefmod );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 25483L)
  public static SubLObject preference_module_required_pattern(final SubLObject prefmod)
  {
    assert NIL != preference_module_p( prefmod ) : prefmod;
    return pref_mod_required_pattern( prefmod );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 25633L)
  public static SubLObject preference_module_required_mt(final SubLObject prefmod)
  {
    assert NIL != preference_module_p( prefmod ) : prefmod;
    return pref_mod_required_mt( prefmod );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 25773L)
  public static SubLObject preference_module_preference_level(final SubLObject prefmod)
  {
    assert NIL != preference_module_p( prefmod ) : prefmod;
    return pref_mod_preference_level( prefmod );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 25923L)
  public static SubLObject preference_module_preference_func(final SubLObject prefmod)
  {
    assert NIL != preference_module_p( prefmod ) : prefmod;
    return pref_mod_preference_func( prefmod );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 26071L)
  public static SubLObject cb_display_preference_module_info(final SubLObject prefmod)
  {
    final SubLObject name = preference_module_name( prefmod );
    html_utilities.html_princ( $str122$module_ );
    html_utilities.html_princ_strong( name );
    html_utilities.html_newline( UNPROVIDED );
    final SubLObject sense = preference_module_sense( prefmod );
    html_utilities.html_princ( $str123$sense___ );
    html_utilities.html_princ( sense );
    html_utilities.html_newline( UNPROVIDED );
    final SubLObject pred = preference_module_predicate( prefmod );
    if( NIL != pred )
    {
      html_utilities.html_princ( $str124$predicate___ );
      cb_utilities.cb_form( pred, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
    }
    final SubLObject any_preds = preference_module_any_predicates( prefmod );
    if( NIL != any_preds )
    {
      html_utilities.html_princ( $str125$any_predicates___ );
      cb_utilities.cb_form( any_preds, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
    }
    final SubLObject required_pattern = preference_module_required_pattern( prefmod );
    if( NIL != required_pattern )
    {
      html_utilities.html_princ( $str126$required_pattern___ );
      cb_utilities.cb_form( required_pattern, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
    }
    final SubLObject required_mt = preference_module_required_mt( prefmod );
    if( NIL != required_mt )
    {
      html_utilities.html_princ( $str127$required_mt___ );
      cb_utilities.cb_form( required_mt, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
    }
    final SubLObject preference_level = preference_module_preference_level( prefmod );
    if( NIL != preference_level )
    {
      html_utilities.html_princ( $str128$preference_level___ );
      html_utilities.html_princ( preference_level );
      html_utilities.html_newline( UNPROVIDED );
    }
    final SubLObject preference_func = preference_module_preference_func( prefmod );
    if( NIL != preference_func )
    {
      html_utilities.html_princ( $str129$preference_function___ );
      html_utilities.html_princ( preference_func );
      html_utilities.html_newline( UNPROVIDED );
    }
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 27542L)
  public static SubLObject preference_module_relevantP(final SubLObject prefmod, final SubLObject asent, final SubLObject sense, final SubLObject bindable_vars)
  {
    if( NIL != preference_module_predicate_matchP( prefmod, cycl_utilities.atomic_sentence_predicate( asent ) ) && NIL != preference_module_sense_matchP( prefmod, sense )
        && NIL != preference_module_required_pattern_matchP( prefmod, asent, bindable_vars ) && NIL != preference_module_required_mt_matchP( prefmod ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 28123L)
  public static SubLObject preference_module_predicate_matchP(final SubLObject prefmod, final SubLObject pred)
  {
    final SubLObject match_pred = preference_module_predicate( prefmod );
    if( NIL != match_pred )
    {
      return Equality.eql( match_pred, pred );
    }
    final SubLObject match_any_preds = preference_module_any_predicates( prefmod );
    if( NIL != match_any_preds )
    {
      return subl_promotions.memberP( pred, match_any_preds, $sym130$PATTERN_MATCHES_FORMULA, UNPROVIDED );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 28488L)
  public static SubLObject preference_module_sense_matchP(final SubLObject prefmod, final SubLObject sense)
  {
    return Equality.eql( sense, preference_module_sense( prefmod ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 28607L)
  public static SubLObject preference_module_required_pattern_matchP(final SubLObject prefmod, final SubLObject asent, final SubLObject bindable_vars)
  {
    final SubLObject pattern = preference_module_required_pattern( prefmod );
    return makeBoolean( NIL == pattern || NIL != formula_pattern_match.formula_matches_pattern( asent, pattern ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 28915L)
  public static SubLObject preference_module_required_mt_matchP(final SubLObject prefmod)
  {
    final SubLObject match_mt = preference_module_required_mt( prefmod );
    return makeBoolean( NIL == match_mt || NIL != mt_relevance_macros.relevant_mtP( match_mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 29096L)
  public static SubLObject preference_module_compute_preference_level(final SubLObject prefmod, final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    final SubLObject preference_level = preference_module_preference_level( prefmod );
    if( NIL != preference_level )
    {
      return preference_level;
    }
    final SubLObject preference_func = preference_module_preference_func( prefmod );
    return preference_module_compute_preference_level_funcall( preference_func, asent, bindable_vars, strategic_context );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 29556L)
  public static SubLObject preference_module_compute_preference_level_funcall(final SubLObject preference_func, final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    if( preference_func.eql( $sym131$TVA_POS_PREFERENCE ) )
    {
      return removal_modules_tva_lookup.tva_pos_preference( asent, bindable_vars, strategic_context );
    }
    return Functions.funcall( preference_func, asent, bindable_vars, strategic_context );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 29893L)
  public static SubLObject must_bind_arg1(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    return doomed_unless_bindable( arg_bindableP( ONE_INTEGER, asent, bindable_vars ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 30179L)
  public static SubLObject must_bind_arg2(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    return doomed_unless_bindable( arg_bindableP( TWO_INTEGER, asent, bindable_vars ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 30428L)
  public static SubLObject must_bind_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    return doomed_unless_bindable( arg_bindableP( THREE_INTEGER, asent, bindable_vars ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 30677L)
  public static SubLObject must_bind_arg4(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    return doomed_unless_bindable( arg_bindableP( FOUR_INTEGER, asent, bindable_vars ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 30926L)
  public static SubLObject must_bind_arg5(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    return doomed_unless_bindable( arg_bindableP( FIVE_INTEGER, asent, bindable_vars ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 31175L)
  public static SubLObject must_bind_arg1_and_arg2(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    return doomed_unless_bindable( args_bindableP( $list137, asent, bindable_vars ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 31454L)
  public static SubLObject must_bind_arg1_and_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    return doomed_unless_bindable( args_bindableP( $list139, asent, bindable_vars ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 31733L)
  public static SubLObject must_bind_arg2_and_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    return doomed_unless_bindable( args_bindableP( $list141, asent, bindable_vars ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 32012L)
  public static SubLObject must_bind_arg1_arg2_and_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    return doomed_unless_bindable( args_bindableP( $list143, asent, bindable_vars ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 32305L)
  public static SubLObject must_bind_arg1_or_arg2(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    final SubLObject at_least_one_arg_bindableP = makeBoolean( NIL != arg_bindableP( ONE_INTEGER, asent, bindable_vars ) || NIL != arg_bindableP( TWO_INTEGER, asent, bindable_vars ) );
    return doomed_unless_bindable( at_least_one_arg_bindableP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 32695L)
  public static SubLObject must_bind_arg1_or_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    final SubLObject at_least_one_arg_bindableP = makeBoolean( NIL != arg_bindableP( ONE_INTEGER, asent, bindable_vars ) || NIL != arg_bindableP( THREE_INTEGER, asent, bindable_vars ) );
    return doomed_unless_bindable( at_least_one_arg_bindableP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 33085L)
  public static SubLObject must_bind_arg2_or_arg3(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    final SubLObject at_least_one_arg_bindableP = makeBoolean( NIL != arg_bindableP( TWO_INTEGER, asent, bindable_vars ) || NIL != arg_bindableP( THREE_INTEGER, asent, bindable_vars ) );
    return doomed_unless_bindable( at_least_one_arg_bindableP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 33475L)
  public static SubLObject must_bind_all_args(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context)
  {
    return doomed_unless_bindable( all_args_bindableP( asent, bindable_vars ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 33734L)
  public static SubLObject doomed_unless_bindable(final SubLObject bindableP)
  {
    if( NIL != bindableP )
    {
      return $kw21$DISALLOWED;
    }
    return $kw40$DOOMED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 33851L)
  public static SubLObject all_args_bindableP(final SubLObject asent, final SubLObject bindable_vars)
  {
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( asent, $kw149$REGULARIZE );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != tree_find_a_non_bindable_varP( arg, bindable_vars ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 34059L)
  public static SubLObject args_bindableP(final SubLObject argnums, final SubLObject asent, final SubLObject bindable_vars)
  {
    SubLObject cdolist_list_var = argnums;
    SubLObject argnum = NIL;
    argnum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == arg_bindableP( argnum, asent, bindable_vars ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      argnum = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 34234L)
  public static SubLObject arg_bindableP(final SubLObject argnum, final SubLObject asent, final SubLObject bindable_vars)
  {
    final SubLObject arg = cycl_utilities.atomic_sentence_arg( asent, argnum, UNPROVIDED );
    return makeBoolean( NIL == tree_find_a_non_bindable_varP( arg, bindable_vars ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 34467L)
  public static SubLObject non_bindable_varP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != variables.variable_p( v_object ) && NIL == subl_promotions.memberP( v_object, $bindable_vars_lambda$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 34606L)
  public static SubLObject tree_find_a_non_bindable_varP(final SubLObject tree, final SubLObject bindable_vars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $bindable_vars_lambda$.currentBinding( thread );
    try
    {
      $bindable_vars_lambda$.bind( bindable_vars, thread );
      return list_utilities.tree_find_if( $sym151$NON_BINDABLE_VAR_, tree, UNPROVIDED );
    }
    finally
    {
      $bindable_vars_lambda$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 34774L)
  public static SubLObject sense_spec_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != enumeration_types.sense_p( v_object ) || $kw152$BOTH == v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 34905L)
  public static SubLObject disallowed_pattern_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_formula_p( v_object ) && NIL != forts.fort_p( cycl_utilities.el_formula_operator( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 35358L)
  public static SubLObject lookup_preference_function_from_must_bind_arg(final SubLObject must_bind_arg)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject preference_func = list_utilities.alist_lookup( $preference_functions_from_must_bind_arg$.getGlobalValue(), must_bind_arg, UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == preference_func )
    {
      Errors.error( $str154$No_preference_function_registered, must_bind_arg );
    }
    return preference_func;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 35662L)
  public static SubLObject compute_preference_module_name(final SubLObject sense, final SubLObject disallowed_pattern)
  {
    return removal_module_utilities.determine_hl_module_name( string_utilities.str( disallowed_pattern ), sense );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 35804L)
  public static SubLObject compute_disallowed_pattern_from_must_bind_arg(final SubLObject predicate, final SubLObject must_bind_arg)
  {
    SubLObject pattern = NIL;
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = number_utilities.f_1_( must_bind_arg ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      pattern = ConsesLow.cons( $kw155$ANYTHING, pattern );
    }
    pattern = ConsesLow.cons( $kw156$NOT_FULLY_BOUND, pattern );
    pattern = Sequences.nreverse( pattern );
    pattern = list_utilities.nadd_to_dotted_end( $kw155$ANYTHING, pattern );
    pattern = ConsesLow.nconc( ConsesLow.list( predicate ), pattern );
    return pattern;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 36469L)
  public static SubLObject note_doom_module(final SubLObject doom_module, final SubLObject name)
  {
    return dictionary.dictionary_enter( $doom_module_store$.getGlobalValue(), doom_module, name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 36587L)
  public static SubLObject unnote_doom_module(final SubLObject doom_module)
  {
    return dictionary.dictionary_remove( $doom_module_store$.getGlobalValue(), doom_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 36698L)
  public static SubLObject doom_module_name(final SubLObject doom_module)
  {
    return dictionary.dictionary_lookup_without_values( $doom_module_store$.getGlobalValue(), doom_module, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 36822L)
  public static SubLObject doom_module_already_declaredP(final SubLObject doom_module)
  {
    return list_utilities.sublisp_boolean( doom_module_name( doom_module ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 36933L)
  public static SubLObject doomed_unless_arg_bindable(final SubLObject sense_spec, final SubLObject predicate, final SubLObject must_bind_arg)
  {
    assert NIL != subl_promotions.non_negative_integer_p( must_bind_arg ) : must_bind_arg;
    final SubLObject preference_func = lookup_preference_function_from_must_bind_arg( must_bind_arg );
    final SubLObject disallowed_pattern = compute_disallowed_pattern_from_must_bind_arg( predicate, must_bind_arg );
    return doomed_unless_preference_func( sense_spec, disallowed_pattern, preference_func );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 38024L)
  public static SubLObject doomed_unless_all_args_bindable(final SubLObject sense_spec, final SubLObject predicate)
  {
    assert NIL != forts.fort_p( predicate ) : predicate;
    return doomed_unless_preference_func( sense_spec, reader.bq_cons( predicate, $kw156$NOT_FULLY_BOUND ), $sym148$MUST_BIND_ALL_ARGS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 38232L)
  public static SubLObject doomed_unless_either_arg_bindable(final SubLObject sense_spec, final SubLObject binary_predicate)
  {
    assert NIL != forts.fort_p( binary_predicate ) : binary_predicate;
    return doomed_unless_preference_func( sense_spec, reader.bq_cons( binary_predicate, $list159 ), $sym145$MUST_BIND_ARG1_OR_ARG2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 38482L)
  public static SubLObject doomed_unless_preference_func(final SubLObject sense_spec, final SubLObject disallowed_pattern, final SubLObject preference_func)
  {
    assert NIL != sense_spec_p( sense_spec ) : sense_spec;
    assert NIL != disallowed_pattern_p( disallowed_pattern ) : disallowed_pattern;
    final SubLObject cdolist_list_var;
    final SubLObject senses = cdolist_list_var = ( $kw152$BOTH == sense_spec ) ? $list162 : ConsesLow.list( sense_spec );
    SubLObject sense = NIL;
    sense = cdolist_list_var.first();
    if( NIL != cdolist_list_var )
    {
      final SubLObject pred = cycl_utilities.el_formula_operator( disallowed_pattern );
      final SubLObject doom_module_plist = ConsesLow.list( $kw64$SENSE, sense, $kw62$PREDICATE, pred, $kw66$REQUIRED_PATTERN, disallowed_pattern, $kw78$PREFERENCE, preference_func );
      if( NIL != doom_module_already_declaredP( doom_module_plist ) )
      {
        unnote_doom_module( doom_module_plist );
      }
      final SubLObject module_name = compute_preference_module_name( sense, disallowed_pattern );
      note_doom_module( doom_module_plist, module_name );
      return inference_preference_module( module_name, doom_module_plist );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 39306L)
  public static SubLObject test_el_literal_preference_level_wrt_modules(final SubLObject el_asent, final SubLObject sense, final SubLObject el_bindable_vars, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preference_level = NIL;
    final SubLObject asent = variables.error_unless_canonicalize_default_el_vars( el_asent );
    final SubLObject bindable_vars = variables.error_unless_canonicalize_default_el_vars( el_bindable_vars );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
      preference_level = literal_preference_level_wrt_modules( asent, sense, bindable_vars, $kw27$TACTICAL );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return preference_level;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 39306L)
  public static SubLObject tiny_kb_el_literal_preference_level_wrt_modules(final SubLObject el_asent, final SubLObject sense, final SubLObject el_bindable_vars, final SubLObject mt)
  {
    return test_el_literal_preference_level_wrt_modules( el_asent, sense, el_bindable_vars, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/preference-modules.lisp", position = 39306L)
  public static SubLObject full_kb_el_literal_preference_level_wrt_modules(final SubLObject el_asent, final SubLObject sense, final SubLObject el_bindable_vars, final SubLObject mt)
  {
    return test_el_literal_preference_level_wrt_modules( el_asent, sense, el_bindable_vars, mt );
  }

  public static SubLObject declare_preference_modules_file()
  {
    SubLFiles.declareMacro( me, "do_generic_preference_modules", "DO-GENERIC-PREFERENCE-MODULES" );
    SubLFiles.declareMacro( me, "do_specific_preference_modules_for_pred", "DO-SPECIFIC-PREFERENCE-MODULES-FOR-PRED" );
    SubLFiles.declareMacro( me, "do_relevant_preference_modules", "DO-RELEVANT-PREFERENCE-MODULES" );
    SubLFiles.declareMacro( me, "do_preference_modules", "DO-PREFERENCE-MODULES" );
    SubLFiles.declareFunction( me, "single_literal_problem_preference_level_wrt_modules", "SINGLE-LITERAL-PROBLEM-PREFERENCE-LEVEL-WRT-MODULES", 3, 0, false );
    SubLFiles.declareFunction( me, "literal_preference_level_wrt_modules", "LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false );
    SubLFiles.declareFunction( me, "all_relevant_preference_modules", "ALL-RELEVANT-PREFERENCE-MODULES", 3, 0, false );
    SubLFiles.declareFunction( me, "el_literal_preference_level_wrt_modules", "EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false );
    SubLFiles.declareFunction( me, "statically_sort_conjunct_literals", "STATICALLY-SORT-CONJUNCT-LITERALS", 1, 1, false );
    SubLFiles.declareFunction( me, "statically_sort_conjunct_literals_recursive", "STATICALLY-SORT-CONJUNCT-LITERALS-RECURSIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "statically_select_next_conjunct_literal", "STATICALLY-SELECT-NEXT-CONJUNCT-LITERAL", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_analysis_asent_wrt_static_sort", "COMPUTE-ANALYSIS-ASENT-WRT-STATIC-SORT", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_generic_term_for_bound_argument_of_predicate", "COMPUTE-GENERIC-TERM-FOR-BOUND-ARGUMENT-OF-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "within_generic_preference_analysisP", "WITHIN-GENERIC-PREFERENCE-ANALYSIS?", 0, 0, false );
    SubLFiles.declareFunction( me, "literal_preference_level_wrt_static_sort", "LITERAL-PREFERENCE-LEVEL-WRT-STATIC-SORT", 3, 0, false );
    SubLFiles.declareFunction( me, "literal_removal_cost_wrt_static_sort", "LITERAL-REMOVAL-COST-WRT-STATIC-SORT", 2, 0, false );
    SubLFiles.declareFunction( me, "preference_level_string", "PREFERENCE-LEVEL-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_level_p", "PREFERENCE-LEVEL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "disallowed_preference_level_p", "DISALLOWED-PREFERENCE-LEVEL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "doomed_preference_level_p", "DOOMED-PREFERENCE-LEVEL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "disallowed_or_doomed_preference_level_p", "DISALLOWED-OR-DOOMED-PREFERENCE-LEVEL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_level_L", "PREFERENCE-LEVEL-<", 2, 0, false );
    SubLFiles.declareFunction( me, "preference_level_G", "PREFERENCE-LEVEL->", 2, 0, false );
    SubLFiles.declareFunction( me, "preference_level_LE", "PREFERENCE-LEVEL-<=", 2, 0, false );
    SubLFiles.declareFunction( me, "preference_level_GE", "PREFERENCE-LEVEL->=", 2, 0, false );
    SubLFiles.declareFunction( me, "min_preference_level", "MIN-PREFERENCE-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "min2_preference_level", "MIN2-PREFERENCE-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "max_preference_level", "MAX-PREFERENCE-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "max2_preference_level", "MAX2-PREFERENCE-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "completeness_to_preference_level", "COMPLETENESS-TO-PREFERENCE-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_level_to_completeness", "PREFERENCE-LEVEL-TO-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_module_property_p", "PREFERENCE-MODULE-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "check_preference_module_properties", "CHECK-PREFERENCE-MODULE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "reclassify_preference_modules", "RECLASSIFY-PREFERENCE-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "generic_preference_modules", "GENERIC-PREFERENCE-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "generic_preference_module_count", "GENERIC-PREFERENCE-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "specific_preference_module_count", "SPECIFIC-PREFERENCE-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "preference_module_count", "PREFERENCE-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "specific_preference_module_predicates", "SPECIFIC-PREFERENCE-MODULE-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "specific_preference_modules_for_pred", "SPECIFIC-PREFERENCE-MODULES-FOR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_has_specific_preference_modulesP", "PREDICATE-HAS-SPECIFIC-PREFERENCE-MODULES?", 1, 0, false );
    SubLFiles.declareFunction( me, "note_preference_module_supplants", "NOTE-PREFERENCE-MODULE-SUPPLANTS", 2, 0, false );
    SubLFiles.declareFunction( me, "preference_module_exclusiveP", "PREFERENCE-MODULE-EXCLUSIVE?", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_module_supplants", "PREFERENCE-MODULE-SUPPLANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "deregister_preference_module", "DEREGISTER-PREFERENCE-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "register_preference_module", "REGISTER-PREFERENCE-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "deregister_all_preference_modules_for_predicate", "DEREGISTER-ALL-PREFERENCE-MODULES-FOR-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_module_print_function_trampoline", "PREFERENCE-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "preference_module_p", "PREFERENCE-MODULE-P", 1, 0, false );
    new $preference_module_p$UnaryFunction();
    SubLFiles.declareFunction( me, "pref_mod_name", "PREF-MOD-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "pref_mod_predicate", "PREF-MOD-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "pref_mod_sense", "PREF-MOD-SENSE", 1, 0, false );
    SubLFiles.declareFunction( me, "pref_mod_required_pattern", "PREF-MOD-REQUIRED-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "pref_mod_preference_level", "PREF-MOD-PREFERENCE-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "pref_mod_preference_func", "PREF-MOD-PREFERENCE-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "pref_mod_required_mt", "PREF-MOD-REQUIRED-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "pref_mod_any_predicates", "PREF-MOD-ANY-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pref_mod_name", "_CSETF-PREF-MOD-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pref_mod_predicate", "_CSETF-PREF-MOD-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pref_mod_sense", "_CSETF-PREF-MOD-SENSE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pref_mod_required_pattern", "_CSETF-PREF-MOD-REQUIRED-PATTERN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pref_mod_preference_level", "_CSETF-PREF-MOD-PREFERENCE-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pref_mod_preference_func", "_CSETF-PREF-MOD-PREFERENCE-FUNC", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pref_mod_required_mt", "_CSETF-PREF-MOD-REQUIRED-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pref_mod_any_predicates", "_CSETF-PREF-MOD-ANY-PREDICATES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_preference_module", "MAKE-PREFERENCE-MODULE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_preference_module", "VISIT-DEFSTRUCT-PREFERENCE-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_preference_module_method", "VISIT-DEFSTRUCT-OBJECT-PREFERENCE-MODULE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_preference_module", "PRINT-PREFERENCE-MODULE", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_preference_module_method", "SXHASH-PREFERENCE-MODULE-METHOD", 1, 0, false );
    new $sxhash_preference_module_method$UnaryFunction();
    SubLFiles.declareFunction( me, "find_preference_module", "FIND-PREFERENCE-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_preference_module", "INFERENCE-PREFERENCE-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "undeclare_inference_preference_module", "UNDECLARE-INFERENCE-PREFERENCE-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_module_name", "PREFERENCE-MODULE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_module_predicate", "PREFERENCE-MODULE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_module_any_predicates", "PREFERENCE-MODULE-ANY-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_module_sense", "PREFERENCE-MODULE-SENSE", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_module_required_pattern", "PREFERENCE-MODULE-REQUIRED-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_module_required_mt", "PREFERENCE-MODULE-REQUIRED-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_module_preference_level", "PREFERENCE-MODULE-PREFERENCE-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_module_preference_func", "PREFERENCE-MODULE-PREFERENCE-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_display_preference_module_info", "CB-DISPLAY-PREFERENCE-MODULE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_module_relevantP", "PREFERENCE-MODULE-RELEVANT?", 4, 0, false );
    SubLFiles.declareFunction( me, "preference_module_predicate_matchP", "PREFERENCE-MODULE-PREDICATE-MATCH?", 2, 0, false );
    SubLFiles.declareFunction( me, "preference_module_sense_matchP", "PREFERENCE-MODULE-SENSE-MATCH?", 2, 0, false );
    SubLFiles.declareFunction( me, "preference_module_required_pattern_matchP", "PREFERENCE-MODULE-REQUIRED-PATTERN-MATCH?", 3, 0, false );
    SubLFiles.declareFunction( me, "preference_module_required_mt_matchP", "PREFERENCE-MODULE-REQUIRED-MT-MATCH?", 1, 0, false );
    SubLFiles.declareFunction( me, "preference_module_compute_preference_level", "PREFERENCE-MODULE-COMPUTE-PREFERENCE-LEVEL", 4, 0, false );
    SubLFiles.declareFunction( me, "preference_module_compute_preference_level_funcall", "PREFERENCE-MODULE-COMPUTE-PREFERENCE-LEVEL-FUNCALL", 4, 0, false );
    SubLFiles.declareFunction( me, "must_bind_arg1", "MUST-BIND-ARG1", 3, 0, false );
    SubLFiles.declareFunction( me, "must_bind_arg2", "MUST-BIND-ARG2", 3, 0, false );
    SubLFiles.declareFunction( me, "must_bind_arg3", "MUST-BIND-ARG3", 3, 0, false );
    SubLFiles.declareFunction( me, "must_bind_arg4", "MUST-BIND-ARG4", 3, 0, false );
    SubLFiles.declareFunction( me, "must_bind_arg5", "MUST-BIND-ARG5", 3, 0, false );
    SubLFiles.declareFunction( me, "must_bind_arg1_and_arg2", "MUST-BIND-ARG1-AND-ARG2", 3, 0, false );
    SubLFiles.declareFunction( me, "must_bind_arg1_and_arg3", "MUST-BIND-ARG1-AND-ARG3", 3, 0, false );
    SubLFiles.declareFunction( me, "must_bind_arg2_and_arg3", "MUST-BIND-ARG2-AND-ARG3", 3, 0, false );
    SubLFiles.declareFunction( me, "must_bind_arg1_arg2_and_arg3", "MUST-BIND-ARG1-ARG2-AND-ARG3", 3, 0, false );
    SubLFiles.declareFunction( me, "must_bind_arg1_or_arg2", "MUST-BIND-ARG1-OR-ARG2", 3, 0, false );
    SubLFiles.declareFunction( me, "must_bind_arg1_or_arg3", "MUST-BIND-ARG1-OR-ARG3", 3, 0, false );
    SubLFiles.declareFunction( me, "must_bind_arg2_or_arg3", "MUST-BIND-ARG2-OR-ARG3", 3, 0, false );
    SubLFiles.declareFunction( me, "must_bind_all_args", "MUST-BIND-ALL-ARGS", 3, 0, false );
    SubLFiles.declareFunction( me, "doomed_unless_bindable", "DOOMED-UNLESS-BINDABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "all_args_bindableP", "ALL-ARGS-BINDABLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "args_bindableP", "ARGS-BINDABLE?", 3, 0, false );
    SubLFiles.declareFunction( me, "arg_bindableP", "ARG-BINDABLE?", 3, 0, false );
    SubLFiles.declareFunction( me, "non_bindable_varP", "NON-BINDABLE-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "tree_find_a_non_bindable_varP", "TREE-FIND-A-NON-BINDABLE-VAR?", 2, 0, false );
    SubLFiles.declareFunction( me, "sense_spec_p", "SENSE-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "disallowed_pattern_p", "DISALLOWED-PATTERN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lookup_preference_function_from_must_bind_arg", "LOOKUP-PREFERENCE-FUNCTION-FROM-MUST-BIND-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_preference_module_name", "COMPUTE-PREFERENCE-MODULE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_disallowed_pattern_from_must_bind_arg", "COMPUTE-DISALLOWED-PATTERN-FROM-MUST-BIND-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "note_doom_module", "NOTE-DOOM-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "unnote_doom_module", "UNNOTE-DOOM-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "doom_module_name", "DOOM-MODULE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "doom_module_already_declaredP", "DOOM-MODULE-ALREADY-DECLARED?", 1, 0, false );
    SubLFiles.declareFunction( me, "doomed_unless_arg_bindable", "DOOMED-UNLESS-ARG-BINDABLE", 3, 0, false );
    SubLFiles.declareFunction( me, "doomed_unless_all_args_bindable", "DOOMED-UNLESS-ALL-ARGS-BINDABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "doomed_unless_either_arg_bindable", "DOOMED-UNLESS-EITHER-ARG-BINDABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "doomed_unless_preference_func", "DOOMED-UNLESS-PREFERENCE-FUNC", 3, 0, false );
    SubLFiles.declareFunction( me, "test_el_literal_preference_level_wrt_modules", "TEST-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false );
    SubLFiles.declareFunction( me, "tiny_kb_el_literal_preference_level_wrt_modules", "TINY-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false );
    SubLFiles.declareFunction( me, "full_kb_el_literal_preference_level_wrt_modules", "FULL-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES", 4, 0, false );
    return NIL;
  }

  public static SubLObject init_preference_modules_file()
  {
    $within_generic_preference_analysisP$ = SubLFiles.defvar( "*WITHIN-GENERIC-PREFERENCE-ANALYSIS?*", NIL );
    $min_preference_level$ = SubLFiles.deflexical( "*MIN-PREFERENCE-LEVEL*", $kw35$PREFERRED );
    $max_preference_level$ = SubLFiles.deflexical( "*MAX-PREFERENCE-LEVEL*", $kw40$DOOMED );
    $default_preference_level$ = SubLFiles.deflexical( "*DEFAULT-PREFERENCE-LEVEL*", $kw21$DISALLOWED );
    $ordered_preference_levels$ = SubLFiles.deflexical( "*ORDERED-PREFERENCE-LEVELS*", $list41 );
    $preference_module_properties$ = SubLFiles.deflexical( "*PREFERENCE-MODULE-PROPERTIES*", $list60 );
    $preference_modules_by_name$ = SubLFiles.deflexical( "*PREFERENCE-MODULES-BY-NAME*", maybeDefault( $sym18$_PREFERENCE_MODULES_BY_NAME_, $preference_modules_by_name$, () -> ( dictionary.new_dictionary( Symbols
        .symbol_function( EQ ), UNPROVIDED ) ) ) );
    $generic_preference_modules$ = SubLFiles.deflexical( "*GENERIC-PREFERENCE-MODULES*", maybeDefault( $sym5$_GENERIC_PREFERENCE_MODULES_, $generic_preference_modules$, () -> ( set.new_set( Symbols.symbol_function( EQ ),
        UNPROVIDED ) ) ) );
    $specific_preference_modules$ = SubLFiles.deflexical( "*SPECIFIC-PREFERENCE-MODULES*", maybeDefault( $sym82$_SPECIFIC_PREFERENCE_MODULES_, $specific_preference_modules$, () -> ( dictionary.new_dictionary( Symbols
        .symbol_function( EQL ), UNPROVIDED ) ) ) );
    $preference_module_supplants$ = SubLFiles.deflexical( "*PREFERENCE-MODULE-SUPPLANTS*", maybeDefault( $sym83$_PREFERENCE_MODULE_SUPPLANTS_, $preference_module_supplants$, () -> ( dictionary.new_dictionary( Symbols
        .symbol_function( EQ ), UNPROVIDED ) ) ) );
    $dtp_preference_module$ = SubLFiles.defconstant( "*DTP-PREFERENCE-MODULE*", $sym84$PREFERENCE_MODULE );
    $bindable_vars_lambda$ = SubLFiles.defparameter( "*BINDABLE-VARS-LAMBDA*", NIL );
    $preference_functions_from_must_bind_arg$ = SubLFiles.deflexical( "*PREFERENCE-FUNCTIONS-FROM-MUST-BIND-ARG*", $list153 );
    $doom_module_store$ = SubLFiles.deflexical( "*DOOM-MODULE-STORE*", maybeDefault( $sym157$_DOOM_MODULE_STORE_, $doom_module_store$, () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ),
        UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_preference_modules_file()
  {
    subl_macro_promotions.declare_defglobal( $sym18$_PREFERENCE_MODULES_BY_NAME_ );
    subl_macro_promotions.declare_defglobal( $sym5$_GENERIC_PREFERENCE_MODULES_ );
    subl_macro_promotions.declare_defglobal( $sym82$_SPECIFIC_PREFERENCE_MODULES_ );
    subl_macro_promotions.declare_defglobal( $sym83$_PREFERENCE_MODULE_SUPPLANTS_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_preference_module$.getGlobalValue(), Symbols.symbol_function( $sym91$PREFERENCE_MODULE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list92 );
    Structures.def_csetf( $sym93$PREF_MOD_NAME, $sym94$_CSETF_PREF_MOD_NAME );
    Structures.def_csetf( $sym95$PREF_MOD_PREDICATE, $sym96$_CSETF_PREF_MOD_PREDICATE );
    Structures.def_csetf( $sym97$PREF_MOD_SENSE, $sym98$_CSETF_PREF_MOD_SENSE );
    Structures.def_csetf( $sym99$PREF_MOD_REQUIRED_PATTERN, $sym100$_CSETF_PREF_MOD_REQUIRED_PATTERN );
    Structures.def_csetf( $sym101$PREF_MOD_PREFERENCE_LEVEL, $sym102$_CSETF_PREF_MOD_PREFERENCE_LEVEL );
    Structures.def_csetf( $sym103$PREF_MOD_PREFERENCE_FUNC, $sym104$_CSETF_PREF_MOD_PREFERENCE_FUNC );
    Structures.def_csetf( $sym105$PREF_MOD_REQUIRED_MT, $sym106$_CSETF_PREF_MOD_REQUIRED_MT );
    Structures.def_csetf( $sym107$PREF_MOD_ANY_PREDICATES, $sym108$_CSETF_PREF_MOD_ANY_PREDICATES );
    Equality.identity( $sym84$PREFERENCE_MODULE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_preference_module$.getGlobalValue(), Symbols.symbol_function(
        $sym116$VISIT_DEFSTRUCT_OBJECT_PREFERENCE_MODULE_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_preference_module$.getGlobalValue(), Symbols.symbol_function( $sym118$SXHASH_PREFERENCE_MODULE_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym132$MUST_BIND_ARG1 );
    utilities_macros.note_funcall_helper_function( $sym133$MUST_BIND_ARG2 );
    utilities_macros.note_funcall_helper_function( $sym134$MUST_BIND_ARG3 );
    utilities_macros.note_funcall_helper_function( $sym135$MUST_BIND_ARG4 );
    utilities_macros.note_funcall_helper_function( $sym136$MUST_BIND_ARG5 );
    utilities_macros.note_funcall_helper_function( $sym138$MUST_BIND_ARG1_AND_ARG2 );
    utilities_macros.note_funcall_helper_function( $sym140$MUST_BIND_ARG1_AND_ARG3 );
    utilities_macros.note_funcall_helper_function( $sym142$MUST_BIND_ARG2_AND_ARG3 );
    utilities_macros.note_funcall_helper_function( $sym144$MUST_BIND_ARG1_ARG2_AND_ARG3 );
    utilities_macros.note_funcall_helper_function( $sym145$MUST_BIND_ARG1_OR_ARG2 );
    utilities_macros.note_funcall_helper_function( $sym146$MUST_BIND_ARG1_OR_ARG3 );
    utilities_macros.note_funcall_helper_function( $sym147$MUST_BIND_ARG2_OR_ARG3 );
    utilities_macros.note_funcall_helper_function( $sym148$MUST_BIND_ALL_ARGS );
    subl_macro_promotions.declare_defglobal( $sym157$_DOOM_MODULE_STORE_ );
    generic_testing.define_test_case_table_int( $sym163$TINY_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES, ConsesLow.list( new SubLObject[] { $kw164$TEST, NIL, $kw165$OWNER, NIL, $kw166$CLASSES, NIL, $kw167$KB,
      $kw168$TINY, $kw169$WORKING_, T
    } ), $list170 );
    generic_testing.define_test_case_table_int( $sym171$FULL_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES, ConsesLow.list( new SubLObject[] { $kw164$TEST, NIL, $kw165$OWNER, NIL, $kw166$CLASSES, NIL, $kw167$KB,
      $kw172$FULL, $kw169$WORKING_, T
    } ), $list173 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_preference_modules_file();
  }

  @Override
  public void initializeVariables()
  {
    init_preference_modules_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_preference_modules_file();
  }
  static
  {
    me = new preference_modules();
    $within_generic_preference_analysisP$ = null;
    $min_preference_level$ = null;
    $max_preference_level$ = null;
    $default_preference_level$ = null;
    $ordered_preference_levels$ = null;
    $preference_module_properties$ = null;
    $preference_modules_by_name$ = null;
    $generic_preference_modules$ = null;
    $specific_preference_modules$ = null;
    $preference_module_supplants$ = null;
    $dtp_preference_module$ = null;
    $bindable_vars_lambda$ = null;
    $preference_functions_from_must_bind_arg$ = null;
    $doom_module_store$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "PREFMOD" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$DONE = makeKeyword( "DONE" );
    $sym4$DO_SET = makeSymbol( "DO-SET" );
    $sym5$_GENERIC_PREFERENCE_MODULES_ = makeSymbol( "*GENERIC-PREFERENCE-MODULES*" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "PREFMOD" ), makeSymbol( "PRED" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym7$CSOME = makeSymbol( "CSOME" );
    $sym8$SPECIFIC_PREFERENCE_MODULES_FOR_PRED = makeSymbol( "SPECIFIC-PREFERENCE-MODULES-FOR-PRED" );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "PREFMOD" ), makeSymbol( "ASENT" ), makeSymbol( "SENSE" ), makeSymbol( "BINDABLE-VARS" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym10$PRED = makeUninternedSymbol( "PRED" );
    $sym11$CLET = makeSymbol( "CLET" );
    $sym12$ATOMIC_SENTENCE_PREDICATE = makeSymbol( "ATOMIC-SENTENCE-PREDICATE" );
    $sym13$DO_SPECIFIC_PREFERENCE_MODULES_FOR_PRED = makeSymbol( "DO-SPECIFIC-PREFERENCE-MODULES-FOR-PRED" );
    $sym14$PWHEN = makeSymbol( "PWHEN" );
    $sym15$PREFERENCE_MODULE_RELEVANT_ = makeSymbol( "PREFERENCE-MODULE-RELEVANT?" );
    $sym16$DO_GENERIC_PREFERENCE_MODULES = makeSymbol( "DO-GENERIC-PREFERENCE-MODULES" );
    $sym17$DO_DICTIONARY_VALUES = makeSymbol( "DO-DICTIONARY-VALUES" );
    $sym18$_PREFERENCE_MODULES_BY_NAME_ = makeSymbol( "*PREFERENCE-MODULES-BY-NAME*" );
    $sym19$SINGLE_LITERAL_PROBLEM_P = makeSymbol( "SINGLE-LITERAL-PROBLEM-P" );
    $str20$no_preference_modules_applicable = makeString( "no preference modules applicable" );
    $kw21$DISALLOWED = makeKeyword( "DISALLOWED" );
    $kw22$ALL = makeKeyword( "ALL" );
    $sym23$PREFERENCE_MODULE_NAME = makeSymbol( "PREFERENCE-MODULE-NAME" );
    $sym24$SINGLETON_ = makeSymbol( "SINGLETON?" );
    $list25 = ConsesLow.list( makeSymbol( "DNF-CLAUSE" ), makeSymbol( "BINDINGS" ) );
    $sym26$POS_ATOMIC_CLAUSE_P = makeSymbol( "POS-ATOMIC-CLAUSE-P" );
    $kw27$TACTICAL = makeKeyword( "TACTICAL" );
    $kw28$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $kw29$NEG = makeKeyword( "NEG" );
    $kw30$POS = makeKeyword( "POS" );
    $const31$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const32$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const33$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $list34 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) );
    $kw35$PREFERRED = makeKeyword( "PREFERRED" );
    $str36$closed_asent = makeString( "closed asent" );
    $str37$open_negation = makeString( "open negation" );
    $str38$no_removal_options = makeString( "no removal options" );
    $const39$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw40$DOOMED = makeKeyword( "DOOMED" );
    $list41 = ConsesLow.list( makeKeyword( "DOOMED" ), makeKeyword( "DISALLOWED" ), makeKeyword( "GROSSLY-DISPREFERRED" ), makeKeyword( "DISPREFERRED" ), makeKeyword( "PREFERRED" ) );
    $sym42$PREFERENCE_LEVEL_P = makeSymbol( "PREFERENCE-LEVEL-P" );
    $str43$Preferred = makeString( "Preferred" );
    $kw44$DISPREFERRED = makeKeyword( "DISPREFERRED" );
    $str45$Dispreferred = makeString( "Dispreferred" );
    $kw46$GROSSLY_DISPREFERRED = makeKeyword( "GROSSLY-DISPREFERRED" );
    $str47$Grossly_Dispreferred = makeString( "Grossly Dispreferred" );
    $str48$Disallowed = makeString( "Disallowed" );
    $str49$Doomed = makeString( "Doomed" );
    $str50$Undetermined = makeString( "Undetermined" );
    $str51$Unexpected_preference_level__a = makeString( "Unexpected preference-level ~a" );
    $sym52$PREFERENCE_LEVEL__ = makeSymbol( "PREFERENCE-LEVEL-<" );
    $sym53$PREFERENCE_LEVEL__ = makeSymbol( "PREFERENCE-LEVEL->" );
    $kw54$COMPLETE = makeKeyword( "COMPLETE" );
    $kw55$INCOMPLETE = makeKeyword( "INCOMPLETE" );
    $kw56$GROSSLY_INCOMPLETE = makeKeyword( "GROSSLY-INCOMPLETE" );
    $kw57$IMPOSSIBLE = makeKeyword( "IMPOSSIBLE" );
    $str58$unexpected_completeness__s = makeString( "unexpected completeness ~s" );
    $str59$unexpected_preference_level__s = makeString( "unexpected preference-level ~s" );
    $list60 = ConsesLow.list( makeKeyword( "PREDICATE" ), makeKeyword( "SENSE" ), makeKeyword( "REQUIRED-PATTERN" ), makeKeyword( "REQUIRED-MT" ), makeKeyword( "ANY-PREDICATES" ), makeKeyword( "SUPPLANTS" ), makeKeyword(
        "PREFERENCE-LEVEL" ), makeKeyword( "PREFERENCE" ) );
    $sym61$PREFERENCE_MODULE_PROPERTY_P = makeSymbol( "PREFERENCE-MODULE-PROPERTY-P" );
    $kw62$PREDICATE = makeKeyword( "PREDICATE" );
    $sym63$FORT_P = makeSymbol( "FORT-P" );
    $kw64$SENSE = makeKeyword( "SENSE" );
    $sym65$SENSE_P = makeSymbol( "SENSE-P" );
    $kw66$REQUIRED_PATTERN = makeKeyword( "REQUIRED-PATTERN" );
    $sym67$CONSP = makeSymbol( "CONSP" );
    $kw68$REQUIRED_MT = makeKeyword( "REQUIRED-MT" );
    $sym69$FORT_OR_POSSIBLY_NAUT_P = makeSymbol( "FORT-OR-POSSIBLY-NAUT-P" );
    $kw70$ANY_PREDICATES = makeKeyword( "ANY-PREDICATES" );
    $sym71$LISTP = makeSymbol( "LISTP" );
    $kw72$EXCLUSIVE = makeKeyword( "EXCLUSIVE" );
    $sym73$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $kw74$SUPPLANTS = makeKeyword( "SUPPLANTS" );
    $sym75$SYMBOLP = makeSymbol( "SYMBOLP" );
    $str76$invalid__supplants_value__s = makeString( "invalid :supplants value ~s" );
    $kw77$PREFERENCE_LEVEL = makeKeyword( "PREFERENCE-LEVEL" );
    $kw78$PREFERENCE = makeKeyword( "PREFERENCE" );
    $str79$unexpected_preference_module_prop = makeString( "unexpected preference module property ~s" );
    $str80$_s_must_specify__sense = makeString( "~s must specify :sense" );
    $str81$_s_must_specify_exactly_one_of__p = makeString( "~s must specify exactly one of :preference-level or :preference" );
    $sym82$_SPECIFIC_PREFERENCE_MODULES_ = makeSymbol( "*SPECIFIC-PREFERENCE-MODULES*" );
    $sym83$_PREFERENCE_MODULE_SUPPLANTS_ = makeSymbol( "*PREFERENCE-MODULE-SUPPLANTS*" );
    $sym84$PREFERENCE_MODULE = makeSymbol( "PREFERENCE-MODULE" );
    $sym85$PREFERENCE_MODULE_P = makeSymbol( "PREFERENCE-MODULE-P" );
    $list86 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "PREDICATE" ), makeSymbol( "SENSE" ), makeSymbol( "REQUIRED-PATTERN" ), makeSymbol( "PREFERENCE-LEVEL" ), makeSymbol( "PREFERENCE-FUNC" ), makeSymbol(
        "REQUIRED-MT" ), makeSymbol( "ANY-PREDICATES" ) );
    $list87 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "PREDICATE" ), makeKeyword( "SENSE" ), makeKeyword( "REQUIRED-PATTERN" ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword( "PREFERENCE-FUNC" ),
        makeKeyword( "REQUIRED-MT" ), makeKeyword( "ANY-PREDICATES" ) );
    $list88 = ConsesLow.list( makeSymbol( "PREF-MOD-NAME" ), makeSymbol( "PREF-MOD-PREDICATE" ), makeSymbol( "PREF-MOD-SENSE" ), makeSymbol( "PREF-MOD-REQUIRED-PATTERN" ), makeSymbol( "PREF-MOD-PREFERENCE-LEVEL" ),
        makeSymbol( "PREF-MOD-PREFERENCE-FUNC" ), makeSymbol( "PREF-MOD-REQUIRED-MT" ), makeSymbol( "PREF-MOD-ANY-PREDICATES" ) );
    $list89 = ConsesLow.list( makeSymbol( "_CSETF-PREF-MOD-NAME" ), makeSymbol( "_CSETF-PREF-MOD-PREDICATE" ), makeSymbol( "_CSETF-PREF-MOD-SENSE" ), makeSymbol( "_CSETF-PREF-MOD-REQUIRED-PATTERN" ), makeSymbol(
        "_CSETF-PREF-MOD-PREFERENCE-LEVEL" ), makeSymbol( "_CSETF-PREF-MOD-PREFERENCE-FUNC" ), makeSymbol( "_CSETF-PREF-MOD-REQUIRED-MT" ), makeSymbol( "_CSETF-PREF-MOD-ANY-PREDICATES" ) );
    $sym90$PRINT_PREFERENCE_MODULE = makeSymbol( "PRINT-PREFERENCE-MODULE" );
    $sym91$PREFERENCE_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PREFERENCE-MODULE-PRINT-FUNCTION-TRAMPOLINE" );
    $list92 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PREFERENCE-MODULE-P" ) );
    $sym93$PREF_MOD_NAME = makeSymbol( "PREF-MOD-NAME" );
    $sym94$_CSETF_PREF_MOD_NAME = makeSymbol( "_CSETF-PREF-MOD-NAME" );
    $sym95$PREF_MOD_PREDICATE = makeSymbol( "PREF-MOD-PREDICATE" );
    $sym96$_CSETF_PREF_MOD_PREDICATE = makeSymbol( "_CSETF-PREF-MOD-PREDICATE" );
    $sym97$PREF_MOD_SENSE = makeSymbol( "PREF-MOD-SENSE" );
    $sym98$_CSETF_PREF_MOD_SENSE = makeSymbol( "_CSETF-PREF-MOD-SENSE" );
    $sym99$PREF_MOD_REQUIRED_PATTERN = makeSymbol( "PREF-MOD-REQUIRED-PATTERN" );
    $sym100$_CSETF_PREF_MOD_REQUIRED_PATTERN = makeSymbol( "_CSETF-PREF-MOD-REQUIRED-PATTERN" );
    $sym101$PREF_MOD_PREFERENCE_LEVEL = makeSymbol( "PREF-MOD-PREFERENCE-LEVEL" );
    $sym102$_CSETF_PREF_MOD_PREFERENCE_LEVEL = makeSymbol( "_CSETF-PREF-MOD-PREFERENCE-LEVEL" );
    $sym103$PREF_MOD_PREFERENCE_FUNC = makeSymbol( "PREF-MOD-PREFERENCE-FUNC" );
    $sym104$_CSETF_PREF_MOD_PREFERENCE_FUNC = makeSymbol( "_CSETF-PREF-MOD-PREFERENCE-FUNC" );
    $sym105$PREF_MOD_REQUIRED_MT = makeSymbol( "PREF-MOD-REQUIRED-MT" );
    $sym106$_CSETF_PREF_MOD_REQUIRED_MT = makeSymbol( "_CSETF-PREF-MOD-REQUIRED-MT" );
    $sym107$PREF_MOD_ANY_PREDICATES = makeSymbol( "PREF-MOD-ANY-PREDICATES" );
    $sym108$_CSETF_PREF_MOD_ANY_PREDICATES = makeSymbol( "_CSETF-PREF-MOD-ANY-PREDICATES" );
    $kw109$NAME = makeKeyword( "NAME" );
    $kw110$PREFERENCE_FUNC = makeKeyword( "PREFERENCE-FUNC" );
    $str111$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw112$BEGIN = makeKeyword( "BEGIN" );
    $sym113$MAKE_PREFERENCE_MODULE = makeSymbol( "MAKE-PREFERENCE-MODULE" );
    $kw114$SLOT = makeKeyword( "SLOT" );
    $kw115$END = makeKeyword( "END" );
    $sym116$VISIT_DEFSTRUCT_OBJECT_PREFERENCE_MODULE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PREFERENCE-MODULE-METHOD" );
    $str117$_PREFMOD__a_ = makeString( "[PREFMOD ~a]" );
    $sym118$SXHASH_PREFERENCE_MODULE_METHOD = makeSymbol( "SXHASH-PREFERENCE-MODULE-METHOD" );
    $sym119$KEYWORDP = makeSymbol( "KEYWORDP" );
    $list120 = ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), makeSymbol( "PREDICATE" ), makeSymbol( "SENSE" ), makeSymbol( "ANY-PREDICATES" ), makeSymbol( "REQUIRED-PATTERN" ), makeSymbol( "REQUIRED-MT" ),
      makeSymbol( "SUPPLANTS" ), makeSymbol( "PREFERENCE-LEVEL" ), makeSymbol( "PREFERENCE" )
    } );
    $list121 = ConsesLow.list( makeKeyword( "PREDICATE" ), makeKeyword( "SENSE" ), makeKeyword( "ANY-PREDICATES" ), makeKeyword( "REQUIRED-PATTERN" ), makeKeyword( "REQUIRED-MT" ), makeKeyword( "SUPPLANTS" ),
        makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword( "PREFERENCE" ) );
    $str122$module_ = makeString( "module " );
    $str123$sense___ = makeString( "sense : " );
    $str124$predicate___ = makeString( "predicate : " );
    $str125$any_predicates___ = makeString( "any predicates : " );
    $str126$required_pattern___ = makeString( "required pattern : " );
    $str127$required_mt___ = makeString( "required mt : " );
    $str128$preference_level___ = makeString( "preference level : " );
    $str129$preference_function___ = makeString( "preference function : " );
    $sym130$PATTERN_MATCHES_FORMULA = makeSymbol( "PATTERN-MATCHES-FORMULA" );
    $sym131$TVA_POS_PREFERENCE = makeSymbol( "TVA-POS-PREFERENCE" );
    $sym132$MUST_BIND_ARG1 = makeSymbol( "MUST-BIND-ARG1" );
    $sym133$MUST_BIND_ARG2 = makeSymbol( "MUST-BIND-ARG2" );
    $sym134$MUST_BIND_ARG3 = makeSymbol( "MUST-BIND-ARG3" );
    $sym135$MUST_BIND_ARG4 = makeSymbol( "MUST-BIND-ARG4" );
    $sym136$MUST_BIND_ARG5 = makeSymbol( "MUST-BIND-ARG5" );
    $list137 = ConsesLow.list( ONE_INTEGER, TWO_INTEGER );
    $sym138$MUST_BIND_ARG1_AND_ARG2 = makeSymbol( "MUST-BIND-ARG1-AND-ARG2" );
    $list139 = ConsesLow.list( ONE_INTEGER, THREE_INTEGER );
    $sym140$MUST_BIND_ARG1_AND_ARG3 = makeSymbol( "MUST-BIND-ARG1-AND-ARG3" );
    $list141 = ConsesLow.list( TWO_INTEGER, THREE_INTEGER );
    $sym142$MUST_BIND_ARG2_AND_ARG3 = makeSymbol( "MUST-BIND-ARG2-AND-ARG3" );
    $list143 = ConsesLow.list( ONE_INTEGER, TWO_INTEGER, THREE_INTEGER );
    $sym144$MUST_BIND_ARG1_ARG2_AND_ARG3 = makeSymbol( "MUST-BIND-ARG1-ARG2-AND-ARG3" );
    $sym145$MUST_BIND_ARG1_OR_ARG2 = makeSymbol( "MUST-BIND-ARG1-OR-ARG2" );
    $sym146$MUST_BIND_ARG1_OR_ARG3 = makeSymbol( "MUST-BIND-ARG1-OR-ARG3" );
    $sym147$MUST_BIND_ARG2_OR_ARG3 = makeSymbol( "MUST-BIND-ARG2-OR-ARG3" );
    $sym148$MUST_BIND_ALL_ARGS = makeSymbol( "MUST-BIND-ALL-ARGS" );
    $kw149$REGULARIZE = makeKeyword( "REGULARIZE" );
    $sym150$_EXIT = makeSymbol( "%EXIT" );
    $sym151$NON_BINDABLE_VAR_ = makeSymbol( "NON-BINDABLE-VAR?" );
    $kw152$BOTH = makeKeyword( "BOTH" );
    $list153 = ConsesLow.list( ConsesLow.cons( ONE_INTEGER, makeSymbol( "MUST-BIND-ARG1" ) ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "MUST-BIND-ARG2" ) ), ConsesLow.cons( THREE_INTEGER, makeSymbol(
        "MUST-BIND-ARG3" ) ), ConsesLow.cons( FOUR_INTEGER, makeSymbol( "MUST-BIND-ARG4" ) ), ConsesLow.cons( FIVE_INTEGER, makeSymbol( "MUST-BIND-ARG5" ) ) );
    $str154$No_preference_function_registered = makeString( "No preference function registered for bindable args ~s" );
    $kw155$ANYTHING = makeKeyword( "ANYTHING" );
    $kw156$NOT_FULLY_BOUND = makeKeyword( "NOT-FULLY-BOUND" );
    $sym157$_DOOM_MODULE_STORE_ = makeSymbol( "*DOOM-MODULE-STORE*" );
    $sym158$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $list159 = ConsesLow.list( makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) );
    $sym160$SENSE_SPEC_P = makeSymbol( "SENSE-SPEC-P" );
    $sym161$DISALLOWED_PATTERN_P = makeSymbol( "DISALLOWED-PATTERN-P" );
    $list162 = ConsesLow.list( makeKeyword( "POS" ), makeKeyword( "NEG" ) );
    $sym163$TINY_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES = makeSymbol( "TINY-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES" );
    $kw164$TEST = makeKeyword( "TEST" );
    $kw165$OWNER = makeKeyword( "OWNER" );
    $kw166$CLASSES = makeKeyword( "CLASSES" );
    $kw167$KB = makeKeyword( "KB" );
    $kw168$TINY = makeKeyword( "TINY" );
    $kw169$WORKING_ = makeKeyword( "WORKING?" );
    $list170 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?VAR0" ), makeSymbol( "?VAR1" ) ), makeKeyword( "POS" ),
        ConsesLow.list( makeSymbol( "?VAR0" ), makeSymbol( "?VAR1" ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ) ), makeKeyword( "DISALLOWED" ) ), ConsesLow.list( ConsesLow.list(
            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?VAR0" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ), makeKeyword( "POS" ),
            ConsesLow.list( makeSymbol( "?VAR0" ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ) ), makeKeyword( "GROSSLY-DISPREFERRED" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ), makeSymbol( "?VAR0" ) ), makeKeyword( "POS" ), ConsesLow.list(
                    makeSymbol( "?VAR0" ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ) ), makeKeyword( "DISPREFERRED" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                        constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ), constant_handles.reader_make_constant_shell( makeString(
                            "Thing" ) ) ), makeKeyword( "POS" ), NIL, constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ) ), makeKeyword( "PREFERRED" ) ) );
    $sym171$FULL_KB_EL_LITERAL_PREFERENCE_LEVEL_WRT_MODULES = makeSymbol( "FULL-KB-EL-LITERAL-PREFERENCE-LEVEL-WRT-MODULES" );
    $kw172$FULL = makeKeyword( "FULL" );
    $list173 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "likesAsFriend" ) ), constant_handles.reader_make_constant_shell( makeString(
        "Muffet" ) ), makeSymbol( "?VAR0" ) ), makeKeyword( "POS" ), ConsesLow.list( makeSymbol( "?VAR0" ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ) ), makeKeyword( "PREFERRED" ) ),
        ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "residesInRegion" ) ), constant_handles.reader_make_constant_shell( makeString( "Muffet" ) ), makeSymbol(
            "?VAR0" ) ), makeKeyword( "POS" ), ConsesLow.list( makeSymbol( "?VAR0" ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ) ), makeKeyword( "PREFERRED" ) ) );
  }

  public static final class $preference_module_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $predicate;
    public SubLObject $sense;
    public SubLObject $required_pattern;
    public SubLObject $preference_level;
    public SubLObject $preference_func;
    public SubLObject $required_mt;
    public SubLObject $any_predicates;
    private static final SubLStructDeclNative structDecl;

    public $preference_module_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$predicate = CommonSymbols.NIL;
      this.$sense = CommonSymbols.NIL;
      this.$required_pattern = CommonSymbols.NIL;
      this.$preference_level = CommonSymbols.NIL;
      this.$preference_func = CommonSymbols.NIL;
      this.$required_mt = CommonSymbols.NIL;
      this.$any_predicates = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $preference_module_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$predicate;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$sense;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$required_pattern;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$preference_level;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$preference_func;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$required_mt;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$any_predicates;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$predicate = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$sense = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$required_pattern = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$preference_level = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$preference_func = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$required_mt = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$any_predicates = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $preference_module_native.class, $sym84$PREFERENCE_MODULE, $sym85$PREFERENCE_MODULE_P, $list86, $list87, new String[] { "$name", "$predicate", "$sense",
        "$required_pattern", "$preference_level", "$preference_func", "$required_mt", "$any_predicates"
      }, $list88, $list89, $sym90$PRINT_PREFERENCE_MODULE );
    }
  }

  public static final class $preference_module_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $preference_module_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PREFERENCE-MODULE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return preference_module_p( arg1 );
    }
  }

  public static final class $sxhash_preference_module_method$UnaryFunction
      extends
        UnaryFunction
  {
    public $sxhash_preference_module_method$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SXHASH-PREFERENCE-MODULE-METHOD" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sxhash_preference_module_method( arg1 );
    }
  }
}
/*
 * 
 * Total time: 640 ms synthetic
 */