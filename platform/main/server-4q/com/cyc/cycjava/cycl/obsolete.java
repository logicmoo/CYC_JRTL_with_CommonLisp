package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class obsolete
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.obsolete";
  public static final String myFingerPrint = "d78a5b58569f74e31ad851a2d2c15f0e379ed7a90f789a9f7f75c7fc99ea2dbc";
  private static final SubLSymbol $sym0$NAT_P;
  private static final SubLList $list1;
  private static final SubLString $str2$NAT_P_is_obsolete___use_NART_P_or;
  private static final SubLSymbol $sym3$FIND_NAT;
  private static final SubLList $list4;
  private static final SubLString $str5$FIND_NAT_is_obsolete___use_FIND_N;
  private static final SubLSymbol $sym6$CYCL_SYSTEM_NUMBER;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$CYCL_PATCH_NUMBER;
  private static final SubLSymbol $sym9$EL_TEMPLATE_ARG_;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$NAT_;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$EL_VAR_;
  private static final SubLSymbol $sym14$RELATIONSHIP_;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$REIFIED_NAT_;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$REIFIABLE_NAT_;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$CYC_VAR_;
  private static final SubLSymbol $sym21$KB_NAT_;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$VARIABLE_P;
  private static final SubLSymbol $sym24$NAUT_IN_MT_;
  private static final SubLSymbol $sym25$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $sym26$GNAT_;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$GNAT_P;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$FIND_GNAT;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$CNAT_P;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$CLOSED_NAT_P;
  private static final SubLSymbol $sym35$REIFY_ARG_WHEN_CNAT;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$REIFY_WHEN_CNAT;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$FORTIFY;
  private static final SubLSymbol $sym40$FIND_WHEN_CNAT;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$FIND_CNAT;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$OPEN_NAT_P;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$FO_NAT_;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$NAT_NOT_GNAT;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$FORMULA_FREE_VARIABLES;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$FORMULA_VARIABLES;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$COMPLETE_COLLECTION_EXTENT;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$COMPLETE_EXTENT_KNOWN;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$BOOLEAN_;
  private static final SubLList $list59;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 799L)
  public static SubLObject nat_p(final SubLObject v_object)
  {
    Errors.warn( $str2$NAT_P_is_obsolete___use_NART_P_or );
    return nart_handles.nart_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1203L)
  public static SubLObject find_nat(final SubLObject nat_formula)
  {
    Errors.warn( $str5$FIND_NAT_is_obsolete___use_FIND_N );
    return narts_high.find_nart( nat_formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1380L)
  public static SubLObject cycl_system_number()
  {
    final SubLObject number = system_info.cyc_revision_numbers().first();
    return number.isInteger() ? number : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1616L)
  public static SubLObject cycl_patch_number()
  {
    final SubLObject number = conses_high.second( system_info.cyc_revision_numbers() );
    return number.isInteger() ? number : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1831L)
  public static SubLObject el_template_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( argnum.numG( ZERO_INTEGER ) )
    {
      return czer_utilities.leave_some_terms_at_el_for_argP( relation, argnum, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2308L)
  public static SubLObject natP(final SubLObject nat, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym13$EL_VAR_ );
    }
    return term.nautP( nat, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2414L)
  public static SubLObject relationshipP(final SubLObject v_object)
  {
    return kb_accessors.relationP( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2511L)
  public static SubLObject reified_natP(final SubLObject v_term)
  {
    return czer_utilities.naut_with_corresponding_nartP( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2643L)
  public static SubLObject reifiable_natP(final SubLObject v_term, SubLObject varP, SubLObject mt)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym20$CYC_VAR_ );
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return czer_utilities.reifiable_nautP( v_term, varP, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2788L)
  public static SubLObject kb_natP(final SubLObject nat, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym23$VARIABLE_P );
    }
    return term.kb_nautP( nat, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2906L)
  public static SubLObject naut_in_mtP(final SubLObject v_object, SubLObject mt, SubLObject varP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym13$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject nautP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym25$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      nautP = term.nautP( v_object, varP );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return nautP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3088L)
  public static SubLObject gnatP(final SubLObject nat, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym20$CYC_VAR_ );
    }
    return term.ground_nautP( nat, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3210L)
  public static SubLObject gnat_p(final SubLObject nat)
  {
    return term.hl_ground_nautP( nat );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3354L)
  public static SubLObject find_gnat(final SubLObject v_object)
  {
    return cycl_utilities.find_ground_naut( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3461L)
  public static SubLObject cnat_p(final SubLObject v_object, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym20$CYC_VAR_ );
    }
    return term.closed_nautP( v_object, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3590L)
  public static SubLObject closed_nat_p(final SubLObject v_object, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym20$CYC_VAR_ );
    }
    return term.closed_nautP( v_object, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3725L)
  public static SubLObject reify_arg_when_cnat(final SubLObject reln, final SubLObject psn)
  {
    return cycl_utilities.reify_arg_when_closed_naut( reln, psn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3866L)
  public static SubLObject reify_when_cnat(final SubLObject v_object)
  {
    return cycl_utilities.reify_when_closed_naut( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3991L)
  public static SubLObject fortify(final SubLObject v_object)
  {
    return cycl_utilities.reify_when_closed_naut( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4108L)
  public static SubLObject find_when_cnat(final SubLObject v_object)
  {
    return cycl_utilities.find_when_closed_naut( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4230L)
  public static SubLObject find_cnat(final SubLObject v_object)
  {
    return cycl_utilities.find_closed_naut( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4337L)
  public static SubLObject open_nat_p(final SubLObject v_object, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym20$CYC_VAR_ );
    }
    return term.open_nautP( v_object, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4466L)
  public static SubLObject fo_natP(final SubLObject v_object)
  {
    return term.first_order_nautP( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4573L)
  public static SubLObject nat_not_gnat(final SubLObject nat, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym13$EL_VAR_ );
    }
    return term.unground_nautP( nat, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4705L)
  public static SubLObject formula_free_variables(final SubLObject formula, SubLObject bound_vars, SubLObject varP, SubLObject include_sequence_varsP)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym20$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    return el_utilities.sentence_free_variables( formula, bound_vars, varP, include_sequence_varsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4945L)
  public static SubLObject formula_variables(final SubLObject formula, SubLObject varP, SubLObject include_sequence_varsP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym20$CYC_VAR_;
    }
    if( include_sequence_varsP == UNPROVIDED )
    {
      include_sequence_varsP = T;
    }
    return el_utilities.sentence_variables( formula, varP, include_sequence_varsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5148L)
  public static SubLObject complete_collection_extent(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != forts.fort_p( collection ) && NIL != kb_accessors.completely_enumerable_collectionP( collection, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5385L)
  public static SubLObject complete_extent_known(final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_accessors.complete_extent_enumerableP( predicate, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5548L)
  public static SubLObject booleanP(final SubLObject v_object)
  {
    return makeBoolean( NIL == v_object || v_object == T );
  }

  public static SubLObject declare_obsolete_file()
  {
    SubLFiles.declareFunction( me, "nat_p", "NAT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "find_nat", "FIND-NAT", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_system_number", "CYCL-SYSTEM-NUMBER", 0, 0, false );
    SubLFiles.declareFunction( me, "cycl_patch_number", "CYCL-PATCH-NUMBER", 0, 0, false );
    SubLFiles.declareFunction( me, "el_template_argP", "EL-TEMPLATE-ARG?", 2, 1, false );
    SubLFiles.declareFunction( me, "natP", "NAT?", 1, 1, false );
    SubLFiles.declareFunction( me, "relationshipP", "RELATIONSHIP?", 1, 0, false );
    SubLFiles.declareFunction( me, "reified_natP", "REIFIED-NAT?", 1, 0, false );
    SubLFiles.declareFunction( me, "reifiable_natP", "REIFIABLE-NAT?", 1, 2, false );
    SubLFiles.declareFunction( me, "kb_natP", "KB-NAT?", 1, 1, false );
    SubLFiles.declareFunction( me, "naut_in_mtP", "NAUT-IN-MT?", 1, 2, false );
    SubLFiles.declareFunction( me, "gnatP", "GNAT?", 1, 1, false );
    SubLFiles.declareFunction( me, "gnat_p", "GNAT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "find_gnat", "FIND-GNAT", 1, 0, false );
    SubLFiles.declareFunction( me, "cnat_p", "CNAT-P", 1, 1, false );
    SubLFiles.declareFunction( me, "closed_nat_p", "CLOSED-NAT-P", 1, 1, false );
    SubLFiles.declareFunction( me, "reify_arg_when_cnat", "REIFY-ARG-WHEN-CNAT", 2, 0, false );
    SubLFiles.declareFunction( me, "reify_when_cnat", "REIFY-WHEN-CNAT", 1, 0, false );
    SubLFiles.declareFunction( me, "fortify", "FORTIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "find_when_cnat", "FIND-WHEN-CNAT", 1, 0, false );
    SubLFiles.declareFunction( me, "find_cnat", "FIND-CNAT", 1, 0, false );
    SubLFiles.declareFunction( me, "open_nat_p", "OPEN-NAT-P", 1, 1, false );
    SubLFiles.declareFunction( me, "fo_natP", "FO-NAT?", 1, 0, false );
    SubLFiles.declareFunction( me, "nat_not_gnat", "NAT-NOT-GNAT", 1, 1, false );
    SubLFiles.declareFunction( me, "formula_free_variables", "FORMULA-FREE-VARIABLES", 1, 3, false );
    SubLFiles.declareFunction( me, "formula_variables", "FORMULA-VARIABLES", 1, 2, false );
    SubLFiles.declareFunction( me, "complete_collection_extent", "COMPLETE-COLLECTION-EXTENT", 1, 1, false );
    SubLFiles.declareFunction( me, "complete_extent_known", "COMPLETE-EXTENT-KNOWN", 1, 1, false );
    SubLFiles.declareFunction( me, "booleanP", "BOOLEAN?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_obsolete_file()
  {
    return NIL;
  }

  public static SubLObject setup_obsolete_file()
  {
    access_macros.define_obsolete_register( $sym0$NAT_P, $list1 );
    access_macros.define_obsolete_register( $sym3$FIND_NAT, $list4 );
    access_macros.define_obsolete_register( $sym6$CYCL_SYSTEM_NUMBER, $list7 );
    access_macros.define_obsolete_register( $sym8$CYCL_PATCH_NUMBER, $list7 );
    access_macros.define_obsolete_register( $sym9$EL_TEMPLATE_ARG_, $list10 );
    access_macros.define_obsolete_register( $sym11$NAT_, $list12 );
    access_macros.define_obsolete_register( $sym14$RELATIONSHIP_, $list15 );
    access_macros.define_obsolete_register( $sym16$REIFIED_NAT_, $list17 );
    access_macros.define_obsolete_register( $sym18$REIFIABLE_NAT_, $list19 );
    access_macros.define_obsolete_register( $sym21$KB_NAT_, $list22 );
    access_macros.define_obsolete_register( $sym24$NAUT_IN_MT_, NIL );
    access_macros.define_obsolete_register( $sym26$GNAT_, $list27 );
    access_macros.define_obsolete_register( $sym28$GNAT_P, $list29 );
    access_macros.define_obsolete_register( $sym30$FIND_GNAT, $list31 );
    access_macros.define_obsolete_register( $sym32$CNAT_P, $list33 );
    access_macros.define_obsolete_register( $sym34$CLOSED_NAT_P, $list33 );
    access_macros.define_obsolete_register( $sym35$REIFY_ARG_WHEN_CNAT, $list36 );
    access_macros.define_obsolete_register( $sym37$REIFY_WHEN_CNAT, $list38 );
    access_macros.define_obsolete_register( $sym39$FORTIFY, $list38 );
    access_macros.define_obsolete_register( $sym40$FIND_WHEN_CNAT, $list41 );
    access_macros.define_obsolete_register( $sym42$FIND_CNAT, $list43 );
    access_macros.define_obsolete_register( $sym44$OPEN_NAT_P, $list45 );
    access_macros.define_obsolete_register( $sym46$FO_NAT_, $list47 );
    access_macros.define_obsolete_register( $sym48$NAT_NOT_GNAT, $list49 );
    access_macros.define_obsolete_register( $sym50$FORMULA_FREE_VARIABLES, $list51 );
    access_macros.define_obsolete_register( $sym52$FORMULA_VARIABLES, $list53 );
    access_macros.define_obsolete_register( $sym54$COMPLETE_COLLECTION_EXTENT, $list55 );
    access_macros.define_obsolete_register( $sym56$COMPLETE_EXTENT_KNOWN, $list57 );
    access_macros.define_obsolete_register( $sym58$BOOLEAN_, $list59 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_obsolete_file();
  }

  @Override
  public void initializeVariables()
  {
    init_obsolete_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_obsolete_file();
  }
  static
  {
    me = new obsolete();
    $sym0$NAT_P = makeSymbol( "NAT-P" );
    $list1 = ConsesLow.list( makeSymbol( "NART-P" ), makeSymbol( "CYCL-NAT-P" ) );
    $str2$NAT_P_is_obsolete___use_NART_P_or = makeString( "NAT-P is obsolete ; use NART-P or CYCL-NAT-P" );
    $sym3$FIND_NAT = makeSymbol( "FIND-NAT" );
    $list4 = ConsesLow.list( makeSymbol( "NART-P" ) );
    $str5$FIND_NAT_is_obsolete___use_FIND_N = makeString( "FIND-NAT is obsolete ; use FIND-NART" );
    $sym6$CYCL_SYSTEM_NUMBER = makeSymbol( "CYCL-SYSTEM-NUMBER" );
    $list7 = ConsesLow.list( makeSymbol( "CYC-REVISION-NUMBERS" ) );
    $sym8$CYCL_PATCH_NUMBER = makeSymbol( "CYCL-PATCH-NUMBER" );
    $sym9$EL_TEMPLATE_ARG_ = makeSymbol( "EL-TEMPLATE-ARG?" );
    $list10 = ConsesLow.list( makeSymbol( "LEAVE-SOME-TERMS-AT-EL-FOR-ARG?" ) );
    $sym11$NAT_ = makeSymbol( "NAT?" );
    $list12 = ConsesLow.list( makeSymbol( "NAUT?" ) );
    $sym13$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym14$RELATIONSHIP_ = makeSymbol( "RELATIONSHIP?" );
    $list15 = ConsesLow.list( makeSymbol( "RELATION?" ) );
    $sym16$REIFIED_NAT_ = makeSymbol( "REIFIED-NAT?" );
    $list17 = ConsesLow.list( makeSymbol( "NAUT-WITH-CORRESPONDING-NART?" ) );
    $sym18$REIFIABLE_NAT_ = makeSymbol( "REIFIABLE-NAT?" );
    $list19 = ConsesLow.list( makeSymbol( "REIFIABLE-NAUT?" ) );
    $sym20$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $sym21$KB_NAT_ = makeSymbol( "KB-NAT?" );
    $list22 = ConsesLow.list( makeSymbol( "KB-NAUT?" ) );
    $sym23$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $sym24$NAUT_IN_MT_ = makeSymbol( "NAUT-IN-MT?" );
    $sym25$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $sym26$GNAT_ = makeSymbol( "GNAT?" );
    $list27 = ConsesLow.list( makeSymbol( "GROUND-NAUT?" ) );
    $sym28$GNAT_P = makeSymbol( "GNAT-P" );
    $list29 = ConsesLow.list( makeSymbol( "HL-GROUND-NAUT?" ) );
    $sym30$FIND_GNAT = makeSymbol( "FIND-GNAT" );
    $list31 = ConsesLow.list( makeSymbol( "FIND-GROUND-NAUT" ) );
    $sym32$CNAT_P = makeSymbol( "CNAT-P" );
    $list33 = ConsesLow.list( makeSymbol( "CLOSED-NAUT?" ) );
    $sym34$CLOSED_NAT_P = makeSymbol( "CLOSED-NAT-P" );
    $sym35$REIFY_ARG_WHEN_CNAT = makeSymbol( "REIFY-ARG-WHEN-CNAT" );
    $list36 = ConsesLow.list( makeSymbol( "REIFY-ARG-WHEN-CLOSED-NAUT" ) );
    $sym37$REIFY_WHEN_CNAT = makeSymbol( "REIFY-WHEN-CNAT" );
    $list38 = ConsesLow.list( makeSymbol( "REIFY-WHEN-CLOSED-NAUT" ) );
    $sym39$FORTIFY = makeSymbol( "FORTIFY" );
    $sym40$FIND_WHEN_CNAT = makeSymbol( "FIND-WHEN-CNAT" );
    $list41 = ConsesLow.list( makeSymbol( "FIND-WHEN-CLOSED-NAUT" ) );
    $sym42$FIND_CNAT = makeSymbol( "FIND-CNAT" );
    $list43 = ConsesLow.list( makeSymbol( "FIND-CLOSED-NAUT" ) );
    $sym44$OPEN_NAT_P = makeSymbol( "OPEN-NAT-P" );
    $list45 = ConsesLow.list( makeSymbol( "OPEN-NAUT?" ) );
    $sym46$FO_NAT_ = makeSymbol( "FO-NAT?" );
    $list47 = ConsesLow.list( makeSymbol( "FIRST-ORDER-NAUT?" ) );
    $sym48$NAT_NOT_GNAT = makeSymbol( "NAT-NOT-GNAT" );
    $list49 = ConsesLow.list( makeSymbol( "UNGROUND-NAUT?" ) );
    $sym50$FORMULA_FREE_VARIABLES = makeSymbol( "FORMULA-FREE-VARIABLES" );
    $list51 = ConsesLow.list( makeSymbol( "SENTENCE-FREE-VARIABLES" ) );
    $sym52$FORMULA_VARIABLES = makeSymbol( "FORMULA-VARIABLES" );
    $list53 = ConsesLow.list( makeSymbol( "SENTENCE-VARIABLES" ) );
    $sym54$COMPLETE_COLLECTION_EXTENT = makeSymbol( "COMPLETE-COLLECTION-EXTENT" );
    $list55 = ConsesLow.list( makeSymbol( "COMPLETELY-ENUMERABLE-COLLECTION?" ) );
    $sym56$COMPLETE_EXTENT_KNOWN = makeSymbol( "COMPLETE-EXTENT-KNOWN" );
    $list57 = ConsesLow.list( makeSymbol( "COMPLETE-EXTENT-ENUMERABLE?" ) );
    $sym58$BOOLEAN_ = makeSymbol( "BOOLEAN?" );
    $list59 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
  }
}
/*
 * 
 * Total time: 137 ms
 * 
 */