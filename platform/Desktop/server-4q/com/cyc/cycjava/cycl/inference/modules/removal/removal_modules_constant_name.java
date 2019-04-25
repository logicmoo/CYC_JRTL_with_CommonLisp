package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_constant_name
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_constant_name";
  public static final String myFingerPrint = "5ef31cead88851b9028b46a85a9d21b79c72e71c696c35c5f1d7ccf3faa54649";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 986L)
  public static SubLSymbol $constant_name_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1168L)
  private static SubLSymbol $constant_name_check_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 3087L)
  private static SubLSymbol $constant_name_unify_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 5386L)
  public static SubLSymbol $denotational_term_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 5585L)
  private static SubLSymbol $denotational_term_check_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 7750L)
  private static SubLSymbol $denotational_term_unify_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10235L)
  public static SubLSymbol $constant_id_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10754L)
  private static SubLSymbol $constant_id_check_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 12649L)
  private static SubLSymbol $constant_id_unify_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 14888L)
  public static SubLSymbol $constant_guid_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15330L)
  private static SubLSymbol $constant_guid_check_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 17366L)
  private static SubLSymbol $constant_guid_unify_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 18313L)
  private static SubLSymbol $constant_guid_lookup_default_cost$;
  private static final SubLObject $const0$constantName;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLSymbol $sym3$_CONSTANT_NAME_DEFINING_MT_;
  private static final SubLObject $const4$BaseKB;
  private static final SubLSymbol $kw5$REMOVAL_CONSTANT_NAME_CHECK_POS;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$REMOVAL_CONSTANT_NAME_CHECK_NEG;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$REMOVAL_CONSTANT_NAME_UNIFY;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$REMOVAL_CONSTANT_NAME_LOOKUP;
  private static final SubLList $list12;
  private static final SubLObject $const13$denotationalTermName;
  private static final SubLSymbol $sym14$_DENOTATIONAL_TERM_DEFINING_MT_;
  private static final SubLSymbol $kw15$REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_POS;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_NEG;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$REMOVAL_DENOTATIONAL_TERM_NAME_UNIFY;
  private static final SubLList $list20;
  private static final SubLSymbol $kw21$REMOVAL_DENOTATIONAL_TERM_NAME_LOOKUP;
  private static final SubLList $list22;
  private static final SubLObject $const23$constantID;
  private static final SubLSymbol $sym24$_CONSTANT_ID_DEFINING_MT_;
  private static final SubLSymbol $kw25$OPAQUE;
  private static final SubLSymbol $kw26$TRUE_MON;
  private static final SubLSymbol $kw27$REMOVAL_CONSTANT_ID_CHECK_POS;
  private static final SubLList $list28;
  private static final SubLSymbol $kw29$REMOVAL_CONSTANT_ID_CHECK_NEG;
  private static final SubLList $list30;
  private static final SubLSymbol $kw31$REMOVAL_CONSTANT_ID_UNIFY;
  private static final SubLList $list32;
  private static final SubLSymbol $kw33$REMOVAL_CONSTANT_ID_LOOKUP;
  private static final SubLList $list34;
  private static final SubLObject $const35$constantGUID;
  private static final SubLSymbol $sym36$_CONSTANT_GUID_DEFINING_MT_;
  private static final SubLSymbol $kw37$REMOVAL_CONSTANT_GUID_CHECK_POS;
  private static final SubLList $list38;
  private static final SubLSymbol $kw39$REMOVAL_CONSTANT_GUID_CHECK_NEG;
  private static final SubLList $list40;
  private static final SubLSymbol $kw41$REMOVAL_CONSTANT_GUID_UNIFY;
  private static final SubLList $list42;
  private static final SubLSymbol $kw43$REMOVAL_CONSTANT_GUID_LOOKUP;
  private static final SubLList $list44;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1058L)
  public static SubLObject inference_constant_name_check(final SubLObject constant, final SubLObject name)
  {
    return Equality.equal( name, constants_high.constant_name( constant ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1407L)
  public static SubLObject removal_constant_name_check_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return ( NIL != removal_constant_name_check( asent ) ) ? $constant_name_check_default_cost$.getGlobalValue() : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1600L)
  public static SubLObject removal_constant_name_check_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_module_utilities.invert_removal_check_cost( removal_constant_name_check_pos_cost( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 1778L)
  public static SubLObject removal_constant_name_check(final SubLObject asent)
  {
    final SubLObject constant = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject name = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return inference_constant_name_check( constant, name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 3987L)
  public static SubLObject removal_constant_name_lookup_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject name = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return ( NIL != constants_high.find_constant( name ) ) ? ONE_INTEGER : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 5470L)
  public static SubLObject inference_denotational_term_check(final SubLObject v_term, final SubLObject name)
  {
    return Equality.equal( name, cycl_utilities.denotational_term_name( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 5836L)
  public static SubLObject removal_denotational_term_check_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return ( NIL != removal_denotational_term_check( asent ) ) ? $denotational_term_check_default_cost$.getGlobalValue() : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 6041L)
  public static SubLObject removal_denotational_term_check_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_module_utilities.invert_removal_check_cost( removal_denotational_term_check_pos_cost( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 6227L)
  public static SubLObject removal_denotational_term_check(final SubLObject asent)
  {
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject name = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return inference_denotational_term_check( v_term, name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 8777L)
  public static SubLObject removal_denotational_term_name_lookup_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject name = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return ( NIL != cycl_utilities.find_denotational_term( name ) ) ? ONE_INTEGER : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10303L)
  public static SubLObject inference_constant_id_check(final SubLObject constant, final SubLObject id)
  {
    return Equality.eql( id, constants_high.constant_internal_id( constant ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10412L)
  public static SubLObject make_constant_id_support(final SubLObject constant, final SubLObject id, SubLObject negateP)
  {
    if( negateP == UNPROVIDED )
    {
      negateP = NIL;
    }
    final SubLObject support_formula = ConsesLow.list( $const23$constantID, constant, id );
    if( NIL == negateP )
    {
      return arguments.make_hl_support( $kw25$OPAQUE, support_formula, $constant_id_defining_mt$.getGlobalValue(), $kw26$TRUE_MON );
    }
    return arguments.make_hl_support( $kw25$OPAQUE, cycl_utilities.negate( support_formula ), $constant_id_defining_mt$.getGlobalValue(), $kw26$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 10983L)
  public static SubLObject removal_constant_id_check_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return ( NIL != removal_constant_id_check( asent ) ) ? $constant_id_check_default_cost$.getGlobalValue() : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 11222L)
  public static SubLObject removal_constant_id_check_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_module_utilities.invert_removal_check_cost( removal_constant_id_check_pos_cost( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 11396L)
  public static SubLObject removal_constant_id_check(final SubLObject asent)
  {
    final SubLObject constant = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject id = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return inference_constant_id_check( constant, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 13532L)
  public static SubLObject removal_constant_id_lookup_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject id = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return ( NIL != constants_high.find_constant_by_internal_id( id ) ) ? ONE_INTEGER : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 14960L)
  public static SubLObject inference_constant_guid_check(final SubLObject constant, final SubLObject guid_string)
  {
    return Equality.equal( guid_string, Guids.guid_to_string( constants_high.constant_external_id( constant ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15108L)
  public static SubLObject inference_constant_guid_lookup(final SubLObject guid_string)
  {
    if( NIL != Guids.guid_string_p( guid_string ) )
    {
      final SubLObject guid = Guids.string_to_guid( guid_string );
      final SubLObject constant = constants_high.find_constant_by_external_id( guid );
      return constant;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15569L)
  public static SubLObject removal_constant_guid_check_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return ( NIL != removal_constant_guid_check( asent ) ) ? $constant_guid_check_default_cost$.getGlobalValue() : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15814L)
  public static SubLObject removal_constant_guid_check_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_module_utilities.invert_removal_check_cost( removal_constant_guid_check_pos_cost( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-constant-name.lisp", position = 15992L)
  public static SubLObject removal_constant_guid_check(final SubLObject asent)
  {
    final SubLObject constant = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject guid_string = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return inference_constant_guid_check( constant, guid_string );
  }

  public static SubLObject declare_removal_modules_constant_name_file()
  {
    SubLFiles.declareFunction( me, "inference_constant_name_check", "INFERENCE-CONSTANT-NAME-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_constant_name_check_pos_cost", "REMOVAL-CONSTANT-NAME-CHECK-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_constant_name_check_neg_cost", "REMOVAL-CONSTANT-NAME-CHECK-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_constant_name_check", "REMOVAL-CONSTANT-NAME-CHECK", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_constant_name_lookup_cost", "REMOVAL-CONSTANT-NAME-LOOKUP-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_denotational_term_check", "INFERENCE-DENOTATIONAL-TERM-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_denotational_term_check_pos_cost", "REMOVAL-DENOTATIONAL-TERM-CHECK-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_denotational_term_check_neg_cost", "REMOVAL-DENOTATIONAL-TERM-CHECK-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_denotational_term_check", "REMOVAL-DENOTATIONAL-TERM-CHECK", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_denotational_term_name_lookup_cost", "REMOVAL-DENOTATIONAL-TERM-NAME-LOOKUP-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_constant_id_check", "INFERENCE-CONSTANT-ID-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "make_constant_id_support", "MAKE-CONSTANT-ID-SUPPORT", 2, 1, false );
    SubLFiles.declareFunction( me, "removal_constant_id_check_pos_cost", "REMOVAL-CONSTANT-ID-CHECK-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_constant_id_check_neg_cost", "REMOVAL-CONSTANT-ID-CHECK-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_constant_id_check", "REMOVAL-CONSTANT-ID-CHECK", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_constant_id_lookup_cost", "REMOVAL-CONSTANT-ID-LOOKUP-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_constant_guid_check", "INFERENCE-CONSTANT-GUID-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_constant_guid_lookup", "INFERENCE-CONSTANT-GUID-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_constant_guid_check_pos_cost", "REMOVAL-CONSTANT-GUID-CHECK-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_constant_guid_check_neg_cost", "REMOVAL-CONSTANT-GUID-CHECK-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_constant_guid_check", "REMOVAL-CONSTANT-GUID-CHECK", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_constant_name_file()
  {
    $constant_name_defining_mt$ = SubLFiles.deflexical( "*CONSTANT-NAME-DEFINING-MT*", maybeDefault( $sym3$_CONSTANT_NAME_DEFINING_MT_, $constant_name_defining_mt$, $const4$BaseKB ) );
    $constant_name_check_default_cost$ = SubLFiles.deflexical( "*CONSTANT-NAME-CHECK-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $constant_name_unify_default_cost$ = SubLFiles.deflexical( "*CONSTANT-NAME-UNIFY-DEFAULT-COST*", ONE_INTEGER );
    $denotational_term_defining_mt$ = SubLFiles.deflexical( "*DENOTATIONAL-TERM-DEFINING-MT*", maybeDefault( $sym14$_DENOTATIONAL_TERM_DEFINING_MT_, $denotational_term_defining_mt$, $const4$BaseKB ) );
    $denotational_term_check_default_cost$ = SubLFiles.deflexical( "*DENOTATIONAL-TERM-CHECK-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $denotational_term_unify_default_cost$ = SubLFiles.deflexical( "*DENOTATIONAL-TERM-UNIFY-DEFAULT-COST*", ONE_INTEGER );
    $constant_id_defining_mt$ = SubLFiles.deflexical( "*CONSTANT-ID-DEFINING-MT*", maybeDefault( $sym24$_CONSTANT_ID_DEFINING_MT_, $constant_id_defining_mt$, $const4$BaseKB ) );
    $constant_id_check_default_cost$ = SubLFiles.deflexical( "*CONSTANT-ID-CHECK-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $constant_id_unify_default_cost$ = SubLFiles.deflexical( "*CONSTANT-ID-UNIFY-DEFAULT-COST*", ONE_INTEGER );
    $constant_guid_defining_mt$ = SubLFiles.deflexical( "*CONSTANT-GUID-DEFINING-MT*", maybeDefault( $sym36$_CONSTANT_GUID_DEFINING_MT_, $constant_guid_defining_mt$, $const4$BaseKB ) );
    $constant_guid_check_default_cost$ = SubLFiles.deflexical( "*CONSTANT-GUID-CHECK-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $constant_guid_unify_default_cost$ = SubLFiles.deflexical( "*CONSTANT-GUID-UNIFY-DEFAULT-COST*", ONE_INTEGER );
    $constant_guid_lookup_default_cost$ = SubLFiles.deflexical( "*CONSTANT-GUID-LOOKUP-DEFAULT-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject setup_removal_modules_constant_name_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$constantName );
    preference_modules.doomed_unless_either_arg_bindable( $kw1$POS, $const0$constantName );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$constantName );
    subl_macro_promotions.declare_defglobal( $sym3$_CONSTANT_NAME_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym3$_CONSTANT_NAME_DEFINING_MT_, $const0$constantName );
    inference_modules.inference_removal_module( $kw5$REMOVAL_CONSTANT_NAME_CHECK_POS, $list6 );
    inference_modules.inference_removal_module( $kw7$REMOVAL_CONSTANT_NAME_CHECK_NEG, $list8 );
    inference_modules.inference_removal_module( $kw9$REMOVAL_CONSTANT_NAME_UNIFY, $list10 );
    inference_modules.inference_removal_module( $kw11$REMOVAL_CONSTANT_NAME_LOOKUP, $list12 );
    inference_modules.register_solely_specific_removal_module_predicate( $const13$denotationalTermName );
    preference_modules.doomed_unless_either_arg_bindable( $kw1$POS, $const13$denotationalTermName );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const13$denotationalTermName );
    subl_macro_promotions.declare_defglobal( $sym14$_DENOTATIONAL_TERM_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym14$_DENOTATIONAL_TERM_DEFINING_MT_, $const13$denotationalTermName );
    inference_modules.inference_removal_module( $kw15$REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_POS, $list16 );
    inference_modules.inference_removal_module( $kw17$REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_NEG, $list18 );
    inference_modules.inference_removal_module( $kw19$REMOVAL_DENOTATIONAL_TERM_NAME_UNIFY, $list20 );
    inference_modules.inference_removal_module( $kw21$REMOVAL_DENOTATIONAL_TERM_NAME_LOOKUP, $list22 );
    inference_modules.register_solely_specific_removal_module_predicate( $const23$constantID );
    preference_modules.doomed_unless_either_arg_bindable( $kw1$POS, $const23$constantID );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const23$constantID );
    subl_macro_promotions.declare_defglobal( $sym24$_CONSTANT_ID_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym24$_CONSTANT_ID_DEFINING_MT_, $const23$constantID );
    inference_modules.inference_removal_module( $kw27$REMOVAL_CONSTANT_ID_CHECK_POS, $list28 );
    inference_modules.inference_removal_module( $kw29$REMOVAL_CONSTANT_ID_CHECK_NEG, $list30 );
    inference_modules.inference_removal_module( $kw31$REMOVAL_CONSTANT_ID_UNIFY, $list32 );
    inference_modules.inference_removal_module( $kw33$REMOVAL_CONSTANT_ID_LOOKUP, $list34 );
    inference_modules.register_solely_specific_removal_module_predicate( $const35$constantGUID );
    preference_modules.doomed_unless_either_arg_bindable( $kw1$POS, $const35$constantGUID );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const35$constantGUID );
    subl_macro_promotions.declare_defglobal( $sym36$_CONSTANT_GUID_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym36$_CONSTANT_GUID_DEFINING_MT_, $const35$constantGUID );
    inference_modules.inference_removal_module( $kw37$REMOVAL_CONSTANT_GUID_CHECK_POS, $list38 );
    inference_modules.inference_removal_module( $kw39$REMOVAL_CONSTANT_GUID_CHECK_NEG, $list40 );
    inference_modules.inference_removal_module( $kw41$REMOVAL_CONSTANT_GUID_UNIFY, $list42 );
    inference_modules.inference_removal_module( $kw43$REMOVAL_CONSTANT_GUID_LOOKUP, $list44 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_constant_name_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_constant_name_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_constant_name_file();
  }
  static
  {
    me = new removal_modules_constant_name();
    $constant_name_defining_mt$ = null;
    $constant_name_check_default_cost$ = null;
    $constant_name_unify_default_cost$ = null;
    $denotational_term_defining_mt$ = null;
    $denotational_term_check_default_cost$ = null;
    $denotational_term_unify_default_cost$ = null;
    $constant_id_defining_mt$ = null;
    $constant_id_check_default_cost$ = null;
    $constant_id_unify_default_cost$ = null;
    $constant_guid_defining_mt$ = null;
    $constant_guid_check_default_cost$ = null;
    $constant_guid_unify_default_cost$ = null;
    $constant_guid_lookup_default_cost$ = null;
    $const0$constantName = constant_handles.reader_make_constant_shell( makeString( "constantName" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $sym3$_CONSTANT_NAME_DEFINING_MT_ = makeSymbol( "*CONSTANT-NAME-DEFINING-MT*" );
    $const4$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $kw5$REMOVAL_CONSTANT_NAME_CHECK_POS = makeKeyword( "REMOVAL-CONSTANT-NAME-CHECK-POS" );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "constantName" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "constantName" ) ), makeKeyword( "CONSTANT" ), makeKeyword( "STRING" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-CONSTANT-NAME-CHECK-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                makeSymbol( "REMOVAL-CONSTANT-NAME-CHECK" ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*CONSTANT-NAME-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword(
                    "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$constantName <constant-p> <stringp>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$constantName #$Thing \"Thing\")" )
    } );
    $kw7$REMOVAL_CONSTANT_NAME_CHECK_NEG = makeKeyword( "REMOVAL-CONSTANT-NAME-CHECK-NEG" );
    $list8 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "constantName" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "constantName" ) ), makeKeyword( "CONSTANT" ), makeKeyword( "STRING" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-CONSTANT-NAME-CHECK-NEG-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-CONSTANT-NAME-CHECK" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                    "*CONSTANT-NAME-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$constantName <constant-p> <stringp>))" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$constantName #$Thing \"Collection\"))" )
    } );
    $kw9$REMOVAL_CONSTANT_NAME_UNIFY = makeKeyword( "REMOVAL-CONSTANT-NAME-UNIFY" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "constantName" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "constantName" ) ), makeKeyword( "CONSTANT" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*CONSTANT-NAME-UNIFY-DEFAULT-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "constantName" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CONSTANT" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword(
              "VALUE" ), makeSymbol( "CONSTANT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ),
                  makeSymbol( "CONSTANT-NAME" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "constantName" ) ),
                      ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CONSTANT" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*CONSTANT-NAME-DEFINING-MT*" ), makeKeyword(
                          "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$constantName <constant-p> <not fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$constantName #$Thing ?NAME)" )
    } );
    $kw11$REMOVAL_CONSTANT_NAME_LOOKUP = makeKeyword( "REMOVAL-CONSTANT-NAME-LOOKUP" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "constantName" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "constantName" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "STRING" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-CONSTANT-NAME-LOOKUP-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "constantName" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "NAME" ) ) ), ConsesLow.list( makeKeyword(
                    "VALUE" ), makeSymbol( "NAME" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword(
                        "CALL" ), makeSymbol( "FIND-CONSTANT" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                            "constantName" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "NAME" ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*CONSTANT-NAME-DEFINING-MT*" ),
      makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$constantName <not fully-bound> <stringp>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$constantName ?CONSTANT \"Thing\")" )
    } );
    $const13$denotationalTermName = constant_handles.reader_make_constant_shell( makeString( "denotationalTermName" ) );
    $sym14$_DENOTATIONAL_TERM_DEFINING_MT_ = makeSymbol( "*DENOTATIONAL-TERM-DEFINING-MT*" );
    $kw15$REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_POS = makeKeyword( "REMOVAL-DENOTATIONAL-TERM-NAME-CHECK-POS" );
    $list16 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "denotationalTermName" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotationalTermName" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list(
            makeKeyword( "TEST" ), makeSymbol( "CYCL-DENOTATIONAL-TERM-P" ) ) ), makeKeyword( "STRING" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-DENOTATIONAL-TERM-CHECK-POS-COST" ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-DENOTATIONAL-TERM-CHECK" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "SUPPORT-MT" ), makeSymbol( "*DENOTATIONAL-TERM-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$denotationalTermName <cycl-denotational-term-p> <stringp>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$denotationalTermName #$Thing \"Thing\")" )
    } );
    $kw17$REMOVAL_DENOTATIONAL_TERM_NAME_CHECK_NEG = makeKeyword( "REMOVAL-DENOTATIONAL-TERM-NAME-CHECK-NEG" );
    $list18 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "denotationalTermName" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotationalTermName" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list(
            makeKeyword( "TEST" ), makeSymbol( "CYCL-DENOTATIONAL-TERM-P" ) ) ), makeKeyword( "STRING" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-DENOTATIONAL-TERM-CHECK-NEG-COST" ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ),
          makeSymbol( "REMOVAL-DENOTATIONAL-TERM-CHECK" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*DENOTATIONAL-TERM-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword(
              "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$denotationalTermName <cycl-denotation-term-p> <stringp>))" ), makeKeyword( "EXAMPLE" ), makeString(
                  "(#$not (#$denotationalTermName #$Thing \"Collection\"))" )
    } );
    $kw19$REMOVAL_DENOTATIONAL_TERM_NAME_UNIFY = makeKeyword( "REMOVAL-DENOTATIONAL-TERM-NAME-UNIFY" );
    $list20 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "denotationalTermName" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotationalTermName" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list(
            makeKeyword( "TEST" ), makeSymbol( "CYCL-DENOTATIONAL-TERM-P" ) ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DENOTATIONAL-TERM-UNIFY-DEFAULT-COST*" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "denotationalTermName" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ), makeKeyword(
                        "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "DENOTATIONAL-TERM-NAME" ), makeKeyword(
                            "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotationalTermName" ) ), ConsesLow.list( makeKeyword(
                                "VALUE" ), makeSymbol( "TERM" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*DENOTATIONAL-TERM-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword(
                                    "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$denotationalTermName <cycl-denotational-term-p> <not fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                        "(#$denotationalTermName #$Thing ?NAME)" )
    } );
    $kw21$REMOVAL_DENOTATIONAL_TERM_NAME_LOOKUP = makeKeyword( "REMOVAL-DENOTATIONAL-TERM-NAME-LOOKUP" );
    $list22 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "denotationalTermName" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotationalTermName" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "STRING" ) ), makeKeyword( "COST" ),
      makeSymbol( "REMOVAL-DENOTATIONAL-TERM-NAME-LOOKUP-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow
          .list( constant_handles.reader_make_constant_shell( makeString( "denotationalTermName" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "NAME" ) ) ), ConsesLow.list(
              makeKeyword( "VALUE" ), makeSymbol( "NAME" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword(
                  "CALL" ), makeSymbol( "FIND-DENOTATIONAL-TERM" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "denotationalTermName" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "NAME" ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*DENOTATIONAL-TERM-DEFINING-MT*" ),
      makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$denotationalTermName <not fully-bound> <stringp>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$denotationalTermName ?TERM \"Thing\")" )
    } );
    $const23$constantID = constant_handles.reader_make_constant_shell( makeString( "constantID" ) );
    $sym24$_CONSTANT_ID_DEFINING_MT_ = makeSymbol( "*CONSTANT-ID-DEFINING-MT*" );
    $kw25$OPAQUE = makeKeyword( "OPAQUE" );
    $kw26$TRUE_MON = makeKeyword( "TRUE-MON" );
    $kw27$REMOVAL_CONSTANT_ID_CHECK_POS = makeKeyword( "REMOVAL-CONSTANT-ID-CHECK-POS" );
    $list28 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "constantID" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "constantID" ) ), makeKeyword( "CONSTANT" ), makeKeyword( "INTEGER" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-CONSTANT-ID-CHECK-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                makeSymbol( "REMOVAL-CONSTANT-ID-CHECK" ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*CONSTANT-ID-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$constantID <constant-p> <integerp>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$constantID #$isa 260)" )
    } );
    $kw29$REMOVAL_CONSTANT_ID_CHECK_NEG = makeKeyword( "REMOVAL-CONSTANT-ID-CHECK-NEG" );
    $list30 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "constantID" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "constantID" ) ), makeKeyword( "CONSTANT" ), makeKeyword( "INTEGER" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-CONSTANT-ID-CHECK-NEG-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-CONSTANT-ID-CHECK" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                    "*CONSTANT-ID-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$constantID <constant-p> <integerp>))" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$constantID #$Thing 260))" )
    } );
    $kw31$REMOVAL_CONSTANT_ID_UNIFY = makeKeyword( "REMOVAL-CONSTANT-ID-UNIFY" );
    $list32 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "constantID" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "constantID" ) ), makeKeyword( "CONSTANT" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*CONSTANT-ID-UNIFY-DEFAULT-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "constantID" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CONSTANT" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "CONSTANT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "CONSTANT-INTERNAL-ID" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "constantID" ) ), ConsesLow
                      .list( makeKeyword( "VALUE" ), makeSymbol( "CONSTANT" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*CONSTANT-ID-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ),
      makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$constantID <constant-p> <not fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$constantID #$isa ?ID)" )
    } );
    $kw33$REMOVAL_CONSTANT_ID_LOOKUP = makeKeyword( "REMOVAL-CONSTANT-ID-LOOKUP" );
    $list34 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "constantID" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "constantID" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "INTEGER" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-CONSTANT-ID-LOOKUP-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "constantID" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ID" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                    makeSymbol( "ID" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ),
                        makeSymbol( "FIND-CONSTANT-BY-INTERNAL-ID" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                            "constantID" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ID" ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*CONSTANT-ID-DEFINING-MT*" ), makeKeyword(
                                "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$constantID <not fully-bound> <integerp>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                    "(#$constantID ?CONSTANT 260)" )
    } );
    $const35$constantGUID = constant_handles.reader_make_constant_shell( makeString( "constantGUID" ) );
    $sym36$_CONSTANT_GUID_DEFINING_MT_ = makeSymbol( "*CONSTANT-GUID-DEFINING-MT*" );
    $kw37$REMOVAL_CONSTANT_GUID_CHECK_POS = makeKeyword( "REMOVAL-CONSTANT-GUID-CHECK-POS" );
    $list38 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "constantGUID" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "constantGUID" ) ), makeKeyword( "CONSTANT" ), makeKeyword( "STRING" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-CONSTANT-GUID-CHECK-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                makeSymbol( "REMOVAL-CONSTANT-GUID-CHECK" ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*CONSTANT-GUID-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword(
                    "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$constantGUID <constant-p> <stringp>)" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$constantGUID #$isa \"bd588104-9c29-11b1-9dad-c379636f7270\")" )
    } );
    $kw39$REMOVAL_CONSTANT_GUID_CHECK_NEG = makeKeyword( "REMOVAL-CONSTANT-GUID-CHECK-NEG" );
    $list40 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "constantGUID" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "constantGUID" ) ), makeKeyword( "CONSTANT" ), makeKeyword( "STRING" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-CONSTANT-GUID-CHECK-NEG-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-CONSTANT-GUID-CHECK" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                    "*CONSTANT-GUID-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$constantGUID <constant-p> <stringp>))" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$constantGUID #$Thing \"bd588104-9c29-11b1-9dad-c379636f7270\"))" )
    } );
    $kw41$REMOVAL_CONSTANT_GUID_UNIFY = makeKeyword( "REMOVAL-CONSTANT-GUID-UNIFY" );
    $list42 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "constantGUID" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "constantGUID" ) ), makeKeyword( "CONSTANT" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*CONSTANT-GUID-UNIFY-DEFAULT-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "constantGUID" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CONSTANT" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword(
              "VALUE" ), makeSymbol( "CONSTANT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ),
                  makeSymbol( "GUID-TO-STRING" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CONSTANT-EXTERNAL-ID" ), makeKeyword( "INPUT" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                      constant_handles.reader_make_constant_shell( makeString( "constantGUID" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CONSTANT" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                          "SUPPORT-MT" ), makeSymbol( "*CONSTANT-GUID-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
                              "(#$constantGUID <constant-p> <not fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$constantGUID #$isa ?GUID-STRING)" )
    } );
    $kw43$REMOVAL_CONSTANT_GUID_LOOKUP = makeKeyword( "REMOVAL-CONSTANT-GUID-LOOKUP" );
    $list44 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "constantGUID" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "constantGUID" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "STRING" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*CONSTANT-GUID-LOOKUP-DEFAULT-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "constantGUID" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "GUID-STRING" ) ) ), ConsesLow.list( makeKeyword(
              "VALUE" ), makeSymbol( "GUID-STRING" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword(
                  "CALL" ), makeSymbol( "INFERENCE-CONSTANT-GUID-LOOKUP" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "constantGUID" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "GUID-STRING" ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*CONSTANT-GUID-DEFINING-MT*" ),
      makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$constantGUID <not fully-bound> <stringp>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$constantGUID ?CONSTANT \"bd588104-9c29-11b1-9dad-c379636f7270\")" )
    } );
  }
}
/*
 * 
 * Total time: 140 ms
 * 
 */