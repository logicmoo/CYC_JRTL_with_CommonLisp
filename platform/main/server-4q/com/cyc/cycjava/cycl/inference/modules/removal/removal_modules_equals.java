package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.arithmetic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.equals;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_equals
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equals";
  public static final String myFingerPrint = "5af699adaa7d9c1a4a4da9555c4c3300c95d31db99edd79e29aef7307c9adac2";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 2183L)
  private static SubLSymbol $default_equals_fort_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 3300L)
  private static SubLSymbol $default_all_equals_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 4576L)
  public static SubLSymbol $default_unify_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 6514L)
  private static SubLSymbol $default_unique_names_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 7966L)
  private static SubLSymbol $default_not_equals_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 9605L)
  private static SubLSymbol $default_not_equals_non_atomic_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 11708L)
  public static SubLSymbol $equal_symbols_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 13117L)
  private static SubLSymbol $default_equal_symbols_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 14438L)
  private static SubLSymbol $default_equal_symbols_unify_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 16806L)
  private static SubLSymbol $default_not_equal_symbols_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 18485L)
  public static SubLSymbol $equal_strings_case_insensitive_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 19039L)
  private static SubLSymbol $default_equal_strings_case_insensitive_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 20614L)
  private static SubLSymbol $default_not_equal_strings_case_insensitive_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 22209L)
  private static SubLSymbol $default_equals_via_numerically_equals_cost$;
  private static final SubLObject $const0$equals;
  private static final SubLSymbol $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
  private static final SubLSymbol $kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS;
  private static final SubLSymbol $kw3$REMOVAL_NON_WFF_CHECK_NEG;
  private static final SubLSymbol $kw4$POS;
  private static final SubLSymbol $kw5$NEG;
  private static final SubLSymbol $kw6$TRUE_MON;
  private static final SubLSymbol $kw7$TRUE_DEF;
  private static final SubLSymbol $kw8$EQUALITY;
  private static final SubLSymbol $kw9$REMOVAL_EQUALS_FORT_CHECK;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$REMOVAL_ALL_EQUALS;
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$REMOVAL_UNIFY;
  private static final SubLList $list14;
  private static final SubLSymbol $kw15$REMOVAL_UNIQUE_NAMES;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$REMOVAL_NOT_EQUALS;
  private static final SubLList $list18;
  private static final SubLFloat $float19$1_1;
  private static final SubLSymbol $kw20$REMOVAL_NOT_EQUALS_NON_ATOMIC;
  private static final SubLList $list21;
  private static final SubLObject $const22$equalSymbols;
  private static final SubLSymbol $kw23$EQUAL_SYMBOLS_DELAY_POS;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$_EQUAL_SYMBOLS_DEFINING_MT_;
  private static final SubLObject $const26$BaseKB;
  private static final SubLSymbol $kw27$REMOVAL_EQUAL_SYMBOLS_REJECT;
  private static final SubLList $list28;
  private static final SubLSymbol $kw29$REMOVAL_EQUAL_SYMBOLS_CHECK;
  private static final SubLList $list30;
  private static final SubLSymbol $kw31$REMOVAL_EQUAL_SYMBOLS_UNIFY;
  private static final SubLList $list32;
  private static final SubLSymbol $kw33$REMOVAL_NOT_EQUAL_SYMBOLS;
  private static final SubLList $list34;
  private static final SubLObject $const35$equalStrings_CaseInsensitive;
  private static final SubLSymbol $kw36$BOTH;
  private static final SubLSymbol $sym37$_EQUAL_STRINGS_CASE_INSENSITIVE_DEFINING_MT_;
  private static final SubLSymbol $kw38$OPAQUE;
  private static final SubLSymbol $kw39$REMOVAL_EQUAL_STRINGS_CASE_INSENSITIVE_CHECK;
  private static final SubLList $list40;
  private static final SubLSymbol $kw41$REMOVAL_NOT_EQUAL_STRINGS_CASE_INSENSITIVE;
  private static final SubLList $list42;
  private static final SubLObject $const43$numericallyEquals;
  private static final SubLList $list44;
  private static final SubLSymbol $kw45$EVAL;
  private static final SubLSymbol $kw46$GENLPREDS;
  private static final SubLObject $const47$UniversalVocabularyMt;
  private static final SubLSymbol $kw48$REMOVAL_EQUALS_VIA_NUMERICALLY_EQUALS;
  private static final SubLList $list49;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 1520L)
  public static SubLObject make_equals_hl_support(final SubLObject term1, final SubLObject term2, SubLObject negateP)
  {
    if( negateP == UNPROVIDED )
    {
      negateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject monotonically_universally_equalP = Equality.equal( term1, term2 );
    final SubLObject universally_equalP = makeBoolean( NIL != monotonically_universally_equalP || NIL != equals.equal_everywhereP( term1, term2 ) );
    final SubLObject tv = ( NIL != monotonically_universally_equalP ) ? $kw6$TRUE_MON : $kw7$TRUE_DEF;
    final SubLObject mt = ( NIL != negateP ) ? mt_relevance_macros.$mt$.getDynamicValue( thread )
        : ( ( NIL != universally_equalP ) ? mt_vars.$equals_defining_mt$.getGlobalValue() : mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    final SubLObject atomic_sentence = backward_utilities.inference_make_commutative_literal( $const0$equals, ConsesLow.list( term1, term2 ) );
    final SubLObject hl_support_formula = ( NIL != negateP ) ? cycl_utilities.negate( atomic_sentence ) : atomic_sentence;
    final SubLObject hl_support = arguments.make_hl_support( $kw8$EQUALITY, hl_support_formula, mt, tv );
    return hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 2362L)
  public static SubLObject removal_equals_fort_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject fort = ( NIL != forts.fort_p( arg1 ) ) ? arg1 : arg2;
    final SubLObject other = ( NIL != forts.fort_p( arg1 ) ) ? arg2 : arg1;
    if( NIL != equals.equalsP( fort, other, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject hl_support = make_equals_hl_support( fort, other, UNPROVIDED );
      backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 3422L)
  public static SubLObject removal_all_equals_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject fort = ( NIL != forts.fort_p( arg1 ) ) ? arg1 : arg2;
    final SubLObject other = ( NIL != forts.fort_p( arg1 ) ) ? arg2 : arg1;
    SubLObject cdolist_list_var;
    final SubLObject equal_terms = cdolist_list_var = equals.all_equals( fort, UNPROVIDED, UNPROVIDED );
    SubLObject equal_term = NIL;
    equal_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( other, equal_term, T, T );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        final SubLObject subst_other = bindings.subst_bindings( v_bindings, other );
        final SubLObject hl_support = make_equals_hl_support( fort, subst_other, UNPROVIDED );
        backward.removal_add_node( hl_support, v_bindings, unify_justification );
      }
      cdolist_list_var = cdolist_list_var.rest();
      equal_term = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 4670L)
  public static SubLObject removal_unify_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject v_bindings = unification_utilities.term_unify( term1, term2, UNPROVIDED, UNPROVIDED );
    final SubLObject unify_justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != v_bindings )
    {
      final SubLObject unify_term1 = bindings.subst_bindings( v_bindings, term1 );
      final SubLObject unify_term2 = bindings.subst_bindings( v_bindings, term2 );
      if( NIL != variables.fully_bound_p( unify_term1 ) && NIL != variables.fully_bound_p( unify_term2 ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 5301L)
  public static SubLObject removal_unify_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject v_bindings = unification_utilities.term_unify( term1, term2, T, T );
    final SubLObject unify_justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != v_bindings )
    {
      final SubLObject unify_term1 = bindings.subst_bindings( v_bindings, term1 );
      final SubLObject unify_term2 = bindings.subst_bindings( v_bindings, term2 );
      final SubLObject hl_support = make_equals_hl_support( unify_term1, unify_term2, UNPROVIDED );
      backward.removal_add_node( hl_support, v_bindings, unify_justification );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 6673L)
  public static SubLObject removal_unique_names_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( term1.equal( term2 ) )
    {
      return ZERO_INTEGER;
    }
    return $default_unique_names_cost$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 6942L)
  public static SubLObject removal_unique_names_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL == equals.unique_names_assumption_applicable_to_termP( term1 ) || NIL == equals.unique_names_assumption_applicable_to_termP( term2 ) )
    {
      if( NIL != equals.differentP( ConsesLow.list( term1, term2 ), UNPROVIDED ) )
      {
        final SubLObject hl_support = make_equals_hl_support( term1, term2, T );
        backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
      }
    }
    else if( NIL == equals.equalsP( term1, term2, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject hl_support = make_equals_hl_support( term1, term2, T );
      backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 8088L)
  public static SubLObject removal_not_equals_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( term1.equal( term2 ) )
    {
      return ZERO_INTEGER;
    }
    return $default_not_equals_cost$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 8353L)
  public static SubLObject removal_not_equals_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL == equals.unique_names_assumption_applicable_to_termP( term1 ) || NIL == equals.unique_names_assumption_applicable_to_termP( term2 ) )
    {
      if( NIL != equals.differentP( ConsesLow.list( term1, term2 ), UNPROVIDED ) )
      {
        final SubLObject hl_support = make_equals_hl_support( term1, term2, T );
        backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
      }
    }
    else if( NIL == unification_utilities.term_unify( term1, term2, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject hl_support = make_equals_hl_support( term1, term2, T );
      backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 9774L)
  public static SubLObject removal_not_equals_non_atomic_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( term1.equal( term2 ) )
    {
      return ZERO_INTEGER;
    }
    return $default_not_equals_non_atomic_cost$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 11519L)
  public static SubLObject inference_equal_symbols_reject(final SubLObject term1, final SubLObject term2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = control_vars.$perform_equals_unification$.currentBinding( thread );
    try
    {
      control_vars.$perform_equals_unification$.bind( NIL, thread );
      ans = unification.unify_impossible( term1, term2 );
    }
    finally
    {
      control_vars.$perform_equals_unification$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 11842L)
  public static SubLObject make_equal_symbols_hl_support(final SubLObject term1, final SubLObject term2, SubLObject negateP)
  {
    if( negateP == UNPROVIDED )
    {
      negateP = NIL;
    }
    final SubLObject atomic_sentence = backward_utilities.inference_make_commutative_literal( $const22$equalSymbols, ConsesLow.list( term1, term2 ) );
    final SubLObject hl_support_formula = ( NIL != negateP ) ? cycl_utilities.negate( atomic_sentence ) : atomic_sentence;
    final SubLObject hl_support = arguments.make_hl_support( $kw8$EQUALITY, hl_support_formula, $equal_symbols_defining_mt$.getGlobalValue(), $kw6$TRUE_MON );
    return hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 12234L)
  public static SubLObject removal_equal_symbols_reject(final SubLObject asent)
  {
    return inference_equal_symbols_reject( cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ), cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 13361L)
  public static SubLObject removal_equal_symbols_check_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( term1.equal( term2 ) )
    {
      return $default_equal_symbols_check_cost$.getDynamicValue( thread );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 13644L)
  public static SubLObject removal_equal_symbols_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( term1.equal( term2 ) )
    {
      final SubLObject hl_support = make_equal_symbols_hl_support( term1, term2, UNPROVIDED );
      backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 14740L)
  public static SubLObject removal_equal_symbols_unify_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject v_bindings = NIL;
    final SubLObject _prev_bind_0 = control_vars.$perform_equals_unification$.currentBinding( thread );
    try
    {
      control_vars.$perform_equals_unification$.bind( NIL, thread );
      v_bindings = unification_utilities.term_unify( term1, term2, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      control_vars.$perform_equals_unification$.rebind( _prev_bind_0, thread );
    }
    if( NIL != v_bindings )
    {
      final SubLObject unify_term1 = bindings.subst_bindings( v_bindings, term1 );
      final SubLObject unify_term2 = bindings.subst_bindings( v_bindings, term2 );
      if( NIL != variables.fully_bound_p( unify_term1 ) && NIL != variables.fully_bound_p( unify_term2 ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 15367L)
  public static SubLObject removal_equal_symbols_unify_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject _prev_bind_0 = control_vars.$perform_equals_unification$.currentBinding( thread );
    try
    {
      control_vars.$perform_equals_unification$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( term1, term2, T, T );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        final SubLObject unify_term1 = bindings.subst_bindings( v_bindings, term1 );
        final SubLObject unify_term2 = bindings.subst_bindings( v_bindings, term2 );
        final SubLObject hl_support = make_equal_symbols_hl_support( unify_term1, unify_term2, UNPROVIDED );
        backward.removal_add_node( hl_support, v_bindings, unify_justification );
      }
    }
    finally
    {
      control_vars.$perform_equals_unification$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 17050L)
  public static SubLObject removal_not_equal_symbols_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( term1.equal( term2 ) )
    {
      return ZERO_INTEGER;
    }
    return $default_not_equal_symbols_cost$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 17329L)
  public static SubLObject removal_not_equal_symbols_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( !term1.equal( term2 ) )
    {
      final SubLObject hl_support = make_equal_symbols_hl_support( term1, term2, T );
      backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 18598L)
  public static SubLObject make_equal_string_case_insensitive_support(final SubLObject string1, final SubLObject string2, SubLObject negateP)
  {
    if( negateP == UNPROVIDED )
    {
      negateP = NIL;
    }
    final SubLObject atomic_sentence = backward_utilities.inference_make_commutative_literal( $const35$equalStrings_CaseInsensitive, ConsesLow.list( string1, string2 ) );
    final SubLObject hl_support_formula = ( NIL != negateP ) ? cycl_utilities.negate( atomic_sentence ) : atomic_sentence;
    final SubLObject hl_support = arguments.make_hl_support( $kw38$OPAQUE, hl_support_formula, $equal_strings_case_insensitive_defining_mt$.getGlobalValue(), $kw6$TRUE_MON );
    return hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 19357L)
  public static SubLObject removal_equal_strings_case_insensitive_check_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject string1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject string2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL != Strings.string_equal( string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return $default_equal_strings_case_insensitive_check_cost$.getDynamicValue( thread );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 19689L)
  public static SubLObject removal_equal_strings_case_insensitive_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject string1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject string2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL != Strings.string_equal( string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject hl_support = make_equal_string_case_insensitive_support( string1, string2, UNPROVIDED );
      backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 20932L)
  public static SubLObject removal_not_equal_strings_case_insensitive_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject string1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject string2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL != Strings.string_equal( string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return ZERO_INTEGER;
    }
    return $default_not_equal_strings_case_insensitive_cost$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 21260L)
  public static SubLObject removal_not_equal_strings_case_insensitive_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject string1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject string2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL == Strings.string_equal( string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject hl_support = make_equal_string_case_insensitive_support( string1, string2, T );
      backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equals.lisp", position = 22509L)
  public static SubLObject removal_equals_via_numerically_equals_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL != arithmetic.cyc_numerically_equal( arg1, arg2 ) )
    {
      final SubLObject hl_support_formula_eval = ConsesLow.list( $const43$numericallyEquals, arg1, arg2 );
      final SubLObject hl_support_formula_genl = $list44;
      final SubLObject hl_support_eval = arguments.make_hl_support( $kw45$EVAL, hl_support_formula_eval, mt_relevance_macros.$mt$.getDynamicValue( thread ), $kw6$TRUE_MON );
      final SubLObject hl_support_genl = arguments.make_hl_support( $kw46$GENLPREDS, hl_support_formula_genl, $const47$UniversalVocabularyMt, $kw6$TRUE_MON );
      backward.removal_add_node( hl_support_eval, NIL, ConsesLow.list( hl_support_genl ) );
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_equals_file()
  {
    SubLFiles.declareFunction( me, "make_equals_hl_support", "MAKE-EQUALS-HL-SUPPORT", 2, 1, false );
    SubLFiles.declareFunction( me, "removal_equals_fort_check_expand", "REMOVAL-EQUALS-FORT-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_equals_expand", "REMOVAL-ALL-EQUALS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_unify_required", "REMOVAL-UNIFY-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_unify_expand", "REMOVAL-UNIFY-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_unique_names_cost", "REMOVAL-UNIQUE-NAMES-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_unique_names_expand", "REMOVAL-UNIQUE-NAMES-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_equals_cost", "REMOVAL-NOT-EQUALS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_equals_expand", "REMOVAL-NOT-EQUALS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_equals_non_atomic_cost", "REMOVAL-NOT-EQUALS-NON-ATOMIC-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_equal_symbols_reject", "INFERENCE-EQUAL-SYMBOLS-REJECT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_equal_symbols_hl_support", "MAKE-EQUAL-SYMBOLS-HL-SUPPORT", 2, 1, false );
    SubLFiles.declareFunction( me, "removal_equal_symbols_reject", "REMOVAL-EQUAL-SYMBOLS-REJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_equal_symbols_check_cost", "REMOVAL-EQUAL-SYMBOLS-CHECK-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_equal_symbols_check_expand", "REMOVAL-EQUAL-SYMBOLS-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_equal_symbols_unify_required", "REMOVAL-EQUAL-SYMBOLS-UNIFY-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_equal_symbols_unify_expand", "REMOVAL-EQUAL-SYMBOLS-UNIFY-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_equal_symbols_cost", "REMOVAL-NOT-EQUAL-SYMBOLS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_equal_symbols_expand", "REMOVAL-NOT-EQUAL-SYMBOLS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "make_equal_string_case_insensitive_support", "MAKE-EQUAL-STRING-CASE-INSENSITIVE-SUPPORT", 2, 1, false );
    SubLFiles.declareFunction( me, "removal_equal_strings_case_insensitive_check_cost", "REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_equal_strings_case_insensitive_check_expand", "REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_equal_strings_case_insensitive_cost", "REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_equal_strings_case_insensitive_expand", "REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_equals_via_numerically_equals_expand", "REMOVAL-EQUALS-VIA-NUMERICALLY-EQUALS-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_equals_file()
  {
    $default_equals_fort_check_cost$ = SubLFiles.defparameter( "*DEFAULT-EQUALS-FORT-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $default_all_equals_cost$ = SubLFiles.defparameter( "*DEFAULT-ALL-EQUALS-COST*", ONE_INTEGER );
    $default_unify_cost$ = SubLFiles.defparameter( "*DEFAULT-UNIFY-COST*", ONE_INTEGER );
    $default_unique_names_cost$ = SubLFiles.defparameter( "*DEFAULT-UNIQUE-NAMES-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $default_not_equals_cost$ = SubLFiles.defparameter( "*DEFAULT-NOT-EQUALS-COST*", ONE_INTEGER );
    $default_not_equals_non_atomic_cost$ = SubLFiles.defparameter( "*DEFAULT-NOT-EQUALS-NON-ATOMIC-COST*", $float19$1_1 );
    $equal_symbols_defining_mt$ = SubLFiles.deflexical( "*EQUAL-SYMBOLS-DEFINING-MT*", maybeDefault( $sym25$_EQUAL_SYMBOLS_DEFINING_MT_, $equal_symbols_defining_mt$, $const26$BaseKB ) );
    $default_equal_symbols_check_cost$ = SubLFiles.defparameter( "*DEFAULT-EQUAL-SYMBOLS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $default_equal_symbols_unify_cost$ = SubLFiles.defparameter( "*DEFAULT-EQUAL-SYMBOLS-UNIFY-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $default_not_equal_symbols_cost$ = SubLFiles.defparameter( "*DEFAULT-NOT-EQUAL-SYMBOLS-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $equal_strings_case_insensitive_defining_mt$ = SubLFiles.deflexical( "*EQUAL-STRINGS-CASE-INSENSITIVE-DEFINING-MT*", maybeDefault( $sym37$_EQUAL_STRINGS_CASE_INSENSITIVE_DEFINING_MT_,
        $equal_strings_case_insensitive_defining_mt$, $const26$BaseKB ) );
    $default_equal_strings_case_insensitive_check_cost$ = SubLFiles.defparameter( "*DEFAULT-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $default_not_equal_strings_case_insensitive_cost$ = SubLFiles.defparameter( "*DEFAULT-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $default_equals_via_numerically_equals_cost$ = SubLFiles.defparameter( "*DEFAULT-EQUALS-VIA-NUMERICALLY-EQUALS-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    return NIL;
  }

  public static SubLObject setup_removal_modules_equals_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$equals );
    inference_modules.inference_removal_module_use_meta_removal( $const0$equals, $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS );
    inference_modules.inference_removal_module_use_meta_removal( $const0$equals, $kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS );
    inference_modules.inference_removal_module_dont_use_universal( $const0$equals, $kw3$REMOVAL_NON_WFF_CHECK_NEG );
    preference_modules.doomed_unless_either_arg_bindable( $kw4$POS, $const0$equals );
    preference_modules.doomed_unless_all_args_bindable( $kw5$NEG, $const0$equals );
    inference_modules.inference_removal_module( $kw9$REMOVAL_EQUALS_FORT_CHECK, $list10 );
    inference_modules.inference_removal_module( $kw11$REMOVAL_ALL_EQUALS, $list12 );
    inference_modules.inference_removal_module( $kw13$REMOVAL_UNIFY, $list14 );
    inference_modules.inference_removal_module( $kw15$REMOVAL_UNIQUE_NAMES, $list16 );
    inference_modules.inference_removal_module( $kw17$REMOVAL_NOT_EQUALS, $list18 );
    inference_modules.inference_removal_module( $kw20$REMOVAL_NOT_EQUALS_NON_ATOMIC, $list21 );
    inference_modules.register_solely_specific_removal_module_predicate( $const22$equalSymbols );
    inference_modules.inference_removal_module_dont_use_universal( $const22$equalSymbols, $kw3$REMOVAL_NON_WFF_CHECK_NEG );
    preference_modules.doomed_unless_either_arg_bindable( $kw4$POS, $const22$equalSymbols );
    preference_modules.doomed_unless_all_args_bindable( $kw5$NEG, $const22$equalSymbols );
    preference_modules.inference_preference_module( $kw23$EQUAL_SYMBOLS_DELAY_POS, $list24 );
    subl_macro_promotions.declare_defglobal( $sym25$_EQUAL_SYMBOLS_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym25$_EQUAL_SYMBOLS_DEFINING_MT_, $const22$equalSymbols );
    inference_modules.inference_removal_module( $kw27$REMOVAL_EQUAL_SYMBOLS_REJECT, $list28 );
    inference_modules.inference_removal_module( $kw29$REMOVAL_EQUAL_SYMBOLS_CHECK, $list30 );
    inference_modules.inference_removal_module( $kw31$REMOVAL_EQUAL_SYMBOLS_UNIFY, $list32 );
    inference_modules.inference_removal_module( $kw33$REMOVAL_NOT_EQUAL_SYMBOLS, $list34 );
    inference_modules.register_solely_specific_removal_module_predicate( $const35$equalStrings_CaseInsensitive );
    preference_modules.doomed_unless_all_args_bindable( $kw36$BOTH, $const35$equalStrings_CaseInsensitive );
    subl_macro_promotions.declare_defglobal( $sym37$_EQUAL_STRINGS_CASE_INSENSITIVE_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym37$_EQUAL_STRINGS_CASE_INSENSITIVE_DEFINING_MT_, $const35$equalStrings_CaseInsensitive );
    inference_modules.inference_removal_module( $kw39$REMOVAL_EQUAL_STRINGS_CASE_INSENSITIVE_CHECK, $list40 );
    inference_modules.inference_removal_module( $kw41$REMOVAL_NOT_EQUAL_STRINGS_CASE_INSENSITIVE, $list42 );
    inference_modules.inference_removal_module( $kw48$REMOVAL_EQUALS_VIA_NUMERICALLY_EQUALS, $list49 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_equals_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_equals_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_equals_file();
  }
  static
  {
    me = new removal_modules_equals();
    $default_equals_fort_check_cost$ = null;
    $default_all_equals_cost$ = null;
    $default_unify_cost$ = null;
    $default_unique_names_cost$ = null;
    $default_not_equals_cost$ = null;
    $default_not_equals_non_atomic_cost$ = null;
    $equal_symbols_defining_mt$ = null;
    $default_equal_symbols_check_cost$ = null;
    $default_equal_symbols_unify_cost$ = null;
    $default_not_equal_symbols_cost$ = null;
    $equal_strings_case_insensitive_defining_mt$ = null;
    $default_equal_strings_case_insensitive_check_cost$ = null;
    $default_not_equal_strings_case_insensitive_cost$ = null;
    $default_equals_via_numerically_equals_cost$ = null;
    $const0$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword( "META-REMOVAL-COMPLETELY-ENUMERABLE-POS" );
    $kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword( "META-REMOVAL-COMPLETELY-DECIDABLE-POS" );
    $kw3$REMOVAL_NON_WFF_CHECK_NEG = makeKeyword( "REMOVAL-NON-WFF-CHECK-NEG" );
    $kw4$POS = makeKeyword( "POS" );
    $kw5$NEG = makeKeyword( "NEG" );
    $kw6$TRUE_MON = makeKeyword( "TRUE-MON" );
    $kw7$TRUE_DEF = makeKeyword( "TRUE-DEF" );
    $kw8$EQUALITY = makeKeyword( "EQUALITY" );
    $kw9$REMOVAL_EQUALS_FORT_CHECK = makeKeyword( "REMOVAL-EQUALS-FORT-CHECK" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword( "FORT" ), makeKeyword( "FULLY-BOUND" ) ), ConsesLow
            .list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FORT" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                "*DEFAULT-EQUALS-FORT-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-EQUALS-FORT-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$equals <fort> <fully-bound>))\n    (#$equals <fully-bound> <fort>)\n    via unification and #$equals assertions" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$equals #$Dog #$Dog)\n    (#$equals (#$JuvenileFn #$Dog)(#$JuvenileFn #$Dog))" )
    } );
    $kw11$REMOVAL_ALL_EQUALS = makeKeyword( "REMOVAL-ALL-EQUALS" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword( "FORT" ), makeKeyword( "NOT-FULLY-BOUND" ) ),
            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FORT" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                "*DEFAULT-ALL-EQUALS-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ALL-EQUALS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$equals <fort> <not fully-bound>)\n    (#$equals <not fully-bound> <fort>)\n    via unification and #$equals assertions" ), makeKeyword( "EXAMPLE" ), makeString( "(#$equals #$Dog ?WHAT)" )
    } );
    $kw13$REMOVAL_UNIFY = makeKeyword( "REMOVAL-UNIFY" );
    $list14 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), ConsesLow.list( makeKeyword( "NOT" ), makeKeyword( "FORT" ) ), ConsesLow.list( makeKeyword( "NOT" ),
            makeKeyword( "FORT" ) ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-UNIFY-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-UNIFY-COST*" ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$equals <non-fort> <non-fort>)\n    by unifying ARG1 and ARG2 and using #$equals assertions" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$equals 212 212)\n    (#$equals 212 ?TERM)\n    (#$equals (#$YearFn 2000) (#$YearFn 2000))\n    (#$equals (#$YearFn 2000) (#$YearFn ?YEAR))\n    (#$equals (?FUNC 2000) (#$YearFn ?YEAR))" )
    } );
    $kw15$REMOVAL_UNIQUE_NAMES = makeKeyword( "REMOVAL-UNIQUE-NAMES" );
    $list16 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword( "CONSTANT" ), makeKeyword( "CONSTANT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-UNIQUE-NAMES-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-UNIQUE-NAMES-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(#$not (#$equals <constant> <constant>))\n    by checking for unification failure" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$equals #$Dog #$Person))" )
    } );
    $kw17$REMOVAL_NOT_EQUALS = makeKeyword( "REMOVAL-NOT-EQUALS" );
    $list18 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "INFERENCE-ATOMIC-TERM-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-ATOMIC-TERM-P" ) ) ), ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "equals" ) ), makeKeyword( "CONSTANT" ), makeKeyword( "CONSTANT" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-NOT-EQUALS-COST" ), makeKeyword(
                    "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-EQUALS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                        "(#$not (#$equals <atomic term> <atomic term>))\n    where either ARG1 or ARG2 is not a <constant-p>\n    by checking for unification failure" ), makeKeyword( "EXAMPLE" ), makeString(
                            "(#$not (#$equals #$Dog \"Dog\"))\n    (#$not (#$equals 1 2))" )
    } );
    $float19$1_1 = makeDouble( 1.1 );
    $kw20$REMOVAL_NOT_EQUALS_NON_ATOMIC = makeKeyword( "REMOVAL-NOT-EQUALS-NON-ATOMIC" );
    $list21 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ),
            ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-ATOMIC-TERM-P" ) ),
                ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-ATOMIC-TERM-P" ) ) ) ), ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "equals" ) ), makeKeyword( "CONSTANT" ), makeKeyword( "CONSTANT" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-NOT-EQUALS-NON-ATOMIC-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
                        "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-EQUALS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                            "(#$not (#$equals <fully-bound term> <fully-bound term>))\n    where either ARG1 or ARG2 is not a <constant-p> or <atomic term>\n    by checking for unification failure" ), makeKeyword(
                                "EXAMPLE" ), makeString( "(#$not (#$equals #$Dog (#$JuvenileFn \"Dog\")))\n    (#$not (#$equals (#$JuvenileFn \"Dog\") (#$JuvenileFn #$Dog)))" )
    } );
    $const22$equalSymbols = constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) );
    $kw23$EQUAL_SYMBOLS_DELAY_POS = makeKeyword( "EQUAL-SYMBOLS-DELAY-POS" );
    $list24 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "DISALLOWED" ) );
    $sym25$_EQUAL_SYMBOLS_DEFINING_MT_ = makeSymbol( "*EQUAL-SYMBOLS-DEFINING-MT*" );
    $const26$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $kw27$REMOVAL_EQUAL_SYMBOLS_REJECT = makeKeyword( "REMOVAL-EQUAL-SYMBOLS-REJECT" );
    $list28 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ),
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "REMOVAL-EQUAL-SYMBOLS-REJECT" ) ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "COST-EXPRESSION" ), ZERO_INTEGER, makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$equalSymbols <whatever> <whatever>)\n    where unification between ARG1 and ARG2 is provably doomed to fail" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$equalSymbols (#$JuvenileFn ?DOG) (#$MaleFn ?DOG))" )
    } );
    $kw29$REMOVAL_EQUAL_SYMBOLS_CHECK = makeKeyword( "REMOVAL-EQUAL-SYMBOLS-CHECK" );
    $list30 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-EQUAL-SYMBOLS-CHECK-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-EQUAL-SYMBOLS-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$equalSymbols <fully bound> <fully bound>) using EQUAL" ), makeKeyword( "EXAMPLE" ), makeString( "(#$equalSymbols #$Dog #$Dog)\n    (#$equalSymbols 3 3)" )
    } );
    $kw31$REMOVAL_EQUAL_SYMBOLS_UNIFY = makeKeyword( "REMOVAL-EQUAL-SYMBOLS-UNIFY" );
    $list32 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeKeyword( "ANYTHING" ), makeKeyword(
            "NOT-FULLY-BOUND" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "REQUIRED" ),
      makeSymbol( "REMOVAL-EQUAL-SYMBOLS-UNIFY-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-EQUAL-SYMBOLS-UNIFY-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
          "EXPAND" ), makeSymbol( "REMOVAL-EQUAL-SYMBOLS-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$equalSymbols <whatever> <not fully bound>)\n    (#$equalSymbols <not fully bound> <whatever>)\n    using unification, but no #$equals assertions." ), makeKeyword( "EXAMPLE" ), makeString(
                  "(#$equalSymbols 212 ?WHAT)\n    (#$equalSymbols #$Dog ?WHAT)\n    (#$equalSymbols (#$YearFn ?YEAR)(?FUNC 2003))" )
    } );
    $kw33$REMOVAL_NOT_EQUAL_SYMBOLS = makeKeyword( "REMOVAL-NOT-EQUAL-SYMBOLS" );
    $list34 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-NOT-EQUAL-SYMBOLS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-EQUAL-SYMBOLS-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$not (#$equalSymbols <fully bound> <fully bound>))\n    using failure of EQUAL" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$equalSymbols #$Pi-Number 3.14159))" )
    } );
    $const35$equalStrings_CaseInsensitive = constant_handles.reader_make_constant_shell( makeString( "equalStrings-CaseInsensitive" ) );
    $kw36$BOTH = makeKeyword( "BOTH" );
    $sym37$_EQUAL_STRINGS_CASE_INSENSITIVE_DEFINING_MT_ = makeSymbol( "*EQUAL-STRINGS-CASE-INSENSITIVE-DEFINING-MT*" );
    $kw38$OPAQUE = makeKeyword( "OPAQUE" );
    $kw39$REMOVAL_EQUAL_STRINGS_CASE_INSENSITIVE_CHECK = makeKeyword( "REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK" );
    $list40 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equalStrings-CaseInsensitive" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalStrings-CaseInsensitive" ) ), makeKeyword( "STRING" ), makeKeyword( "STRING" ) ), makeKeyword(
          "COST" ), makeSymbol( "REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
              "REMOVAL-EQUAL-STRINGS-CASE-INSENSITIVE-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$equalStrings-CaseInsensitive <string> <string>)\n    using STRING-EQUAL" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$equalStrings-CaseInsensitive \"DOG\" \"Dog\")" )
    } );
    $kw41$REMOVAL_NOT_EQUAL_STRINGS_CASE_INSENSITIVE = makeKeyword( "REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE" );
    $list42 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equalStrings-CaseInsensitive" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalStrings-CaseInsensitive" ) ), makeKeyword( "STRING" ), makeKeyword( "STRING" ) ), makeKeyword(
          "COST" ), makeSymbol( "REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
              "REMOVAL-NOT-EQUAL-STRINGS-CASE-INSENSITIVE-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$equalStrings-CaseInsensitive <string> <string>))\n    using failure of STRING-EQUAL" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$equalStrings-CaseInsensitive \"DOGG\" \"Dog\"))" )
    } );
    $const43$numericallyEquals = constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) );
    $list44 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), constant_handles
        .reader_make_constant_shell( makeString( "equals" ) ) );
    $kw45$EVAL = makeKeyword( "EVAL" );
    $kw46$GENLPREDS = makeKeyword( "GENLPREDS" );
    $const47$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $kw48$REMOVAL_EQUALS_VIA_NUMERICALLY_EQUALS = makeKeyword( "REMOVAL-EQUALS-VIA-NUMERICALLY-EQUALS" );
    $list49 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "IBQE?" ) ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "IBQE?" ) ) ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-EQUALS-VIA-NUMERICALLY-EQUALS-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-EQUALS-VIA-NUMERICALLY-EQUALS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$equals <fully-bound ibqe> <fully-bound ibqe>)\n    via evaulation of #$numericallyEquals" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$equals (#$GigaHertz 1) (#$MegaHertz 1000))\n    (#$equals (#$Percent 0 100) (#$Unity 0 1))" )
    } );
  }
}
/*
 * 
 * Total time: 196 ms
 * 
 */