package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.modules.after_adding_modules;
import com.cyc.cycjava.cycl.inference.collection_intersection;
import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class genls
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.genls";
  public static final String myFingerPrint = "c611f55ccab3febb0e4d67705efe4a4074b1b669d0ab39f4a005c82293097fbf";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30157L)
  private static SubLSymbol $sbhl_infer_intersection_from_instancesP$;
  private static final SubLObject $const0$genls;
  private static final SubLSymbol $sym1$MIN_GENLS;
  private static final SubLList $list2;
  private static final SubLString $str3$Returns_the_most_specific_genls_o;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$EL_FORT_P;
  private static final SubLSymbol $sym6$MAX_NOT_GENLS;
  private static final SubLString $str7$Returns_the_least_specific_negate;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$FALSE;
  private static final SubLSymbol $sym10$MAX_SPECS;
  private static final SubLString $str11$Returns_the_least_specific_specs_;
  private static final SubLSymbol $sym12$MIN_NOT_SPECS;
  private static final SubLString $str13$Returns_the_most_specific_negated;
  private static final SubLSymbol $sym14$GENL_SIBLINGS;
  private static final SubLString $str15$Returns_the_direct_genls_of_those;
  private static final SubLSymbol $sym16$SPEC_SIBLINGS;
  private static final SubLString $str17$Returns_the_direct_specs_of_those;
  private static final SubLSymbol $sym18$ALL_GENLS;
  private static final SubLString $str19$Returns_all_genls_of_collection_C;
  private static final SubLSymbol $sym20$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const21$EverythingPSC;
  private static final SubLSymbol $sym22$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $sym23$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
  private static final SubLSymbol $sym24$ALL_SPECS;
  private static final SubLString $str25$Returns_all_specs_of_collection_C;
  private static final SubLSymbol $kw26$DESCENDING;
  private static final SubLSymbol $kw27$BREADTH;
  private static final SubLSymbol $kw28$QUEUE;
  private static final SubLSymbol $kw29$STACK;
  private static final SubLSymbol $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw31$ERROR;
  private static final SubLString $str32$_A_is_not_a__A;
  private static final SubLSymbol $sym33$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw34$CERROR;
  private static final SubLString $str35$continue_anyway;
  private static final SubLSymbol $kw36$WARN;
  private static final SubLString $str37$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str38$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str39$attempting_to_bind_direction_link;
  private static final SubLString $str40$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $sym41$ALL_SPECS_WITH_MAX;
  private static final SubLSymbol $sym42$INTEGERP;
  private static final SubLSymbol $kw43$INVALID_ITERATION_TERM;
  private static final SubLSymbol $sym44$_EXIT;
  private static final SubLSymbol $sym45$COUNT_ALL_SPECS;
  private static final SubLList $list46;
  private static final SubLString $str47$Counts_the_number_of_specs_in_COL;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$ALL_GENLS_WRT;
  private static final SubLList $list51;
  private static final SubLString $str52$Returns_all_genls_of_collection_S;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$LISTP;
  private static final SubLSymbol $sym55$UNION_ALL_GENLS;
  private static final SubLList $list56;
  private static final SubLString $str57$Returns_all_genls_of_each_collect;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$UNION_ALL_SPECS;
  private static final SubLString $str60$Returns_all_specs_of_each_collect;
  private static final SubLSymbol $sym61$ALL_DEPENDENT_SPECS;
  private static final SubLString $str62$Returns_all_specs_s_of_COL_s_t__e;
  private static final SubLSymbol $sym63$ALL_GENLS_AMONG;
  private static final SubLList $list64;
  private static final SubLString $str65$Returns_those_genls_of_COL_that_a;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$ALL_SPECS_AMONG;
  private static final SubLString $str68$Returns_those_specs_of_COL_that_a;
  private static final SubLSymbol $sym69$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym70$ALL_GENLS_IF;
  private static final SubLList $list71;
  private static final SubLString $str72$Returns_all_genls_of_collection_C;
  private static final SubLList $list73;
  private static final SubLSymbol $sym74$ALL_SPECS_IF;
  private static final SubLSymbol $sym75$ALL_NOT_GENLS;
  private static final SubLString $str76$Returns_all_negated_genls_of_coll;
  private static final SubLSymbol $sym77$ALL_NOT_SPECS;
  private static final SubLString $str78$Returns_all_negated_specs_of_coll;
  private static final SubLSymbol $sym79$MAP_ALL_GENLS;
  private static final SubLList $list80;
  private static final SubLString $str81$Applies_FN_to_every__all__genls_o;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$MAP_ALL_SPECS;
  private static final SubLString $str84$Applies_FN_to_every__all__specs_o;
  private static final SubLSymbol $sym85$ANY_ALL_GENLS;
  private static final SubLString $str86$Return_a_non_nil_result_of_applyi;
  private static final SubLSymbol $sym87$ANY_ALL_SPECS;
  private static final SubLString $str88$Return_a_non_nil_result_of_applyi;
  private static final SubLSymbol $sym89$GENL_;
  private static final SubLString $str90$Returns_whether____genls_SPEC_GEN;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$SPEC_;
  private static final SubLList $list93;
  private static final SubLList $list94;
  private static final SubLObject $const95$preservesGenlsInArg;
  private static final SubLSymbol $sym96$ANY_GENL_;
  private static final SubLList $list97;
  private static final SubLString $str98$_any_genl__spec_genls__is_t_iff__;
  private static final SubLList $list99;
  private static final SubLSymbol $sym100$ANY_SPEC_;
  private static final SubLList $list101;
  private static final SubLString $str102$Returns_T_iff__spec__genl_spec__f;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$ALL_GENL_;
  private static final SubLString $str105$Returns_T_iff__genl__spec_genl__f;
  private static final SubLSymbol $sym106$ALL_SPEC_;
  private static final SubLString $str107$Returns_T_iff__spec__genl_spec__f;
  private static final SubLSymbol $sym108$ANY_GENL_ANY_;
  private static final SubLList $list109;
  private static final SubLString $str110$Return_T_iff__genl__spec_genl_mt_;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$ANY_GENL_ALL_;
  private static final SubLString $str113$Return_T_iff__genl__spec_genl_mt_;
  private static final SubLSymbol $sym114$ALL_SPEC_ANY_;
  private static final SubLString $str115$Return_T_iff_for_each_spec_in_SPE;
  private static final SubLSymbol $sym116$NOT_GENL_;
  private static final SubLList $list117;
  private static final SubLString $str118$Return_whether_collection_NOT_GEN;
  private static final SubLList $list119;
  private static final SubLSymbol $sym120$ALL_NOT_SPEC_;
  private static final SubLList $list121;
  private static final SubLString $str122$Return_whether_every_collection_i;
  private static final SubLList $list123;
  private static final SubLSymbol $sym124$ANY_NOT_GENL_;
  private static final SubLList $list125;
  private static final SubLString $str126$Returns_whether_any_collection_in;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$FORT_P;
  private static final SubLSymbol $sym129$HLMT_P;
  private static final SubLSymbol $sym130$COLLECTIONS_COEXTENSIONAL_;
  private static final SubLList $list131;
  private static final SubLString $str132$Are_COL_1_and_COL_2_coextensional;
  private static final SubLList $list133;
  private static final SubLSymbol $sym134$COLLECTIONS_INTERSECT_;
  private static final SubLString $str135$Do_collections_COL_1_and_COL_2_in;
  private static final SubLSymbol $kw136$TRUE;
  private static final SubLSymbol $kw137$GAF;
  private static final SubLSymbol $sym138$WHY_GENL_;
  private static final SubLList $list139;
  private static final SubLString $str140$Justification_of__genls_SPEC_GENL;
  private static final SubLList $list141;
  private static final SubLObject $const142$termOfUnit;
  private static final SubLList $list143;
  private static final SubLObject $const144$resultGenl;
  private static final SubLObject $const145$resultGenlArg;
  private static final SubLObject $const146$interArgResultGenl;
  private static final SubLObject $const147$interArgResultGenlReln;
  private static final SubLSymbol $sym148$WHY_NOT_GENL_;
  private static final SubLString $str149$Justification_of__not__genls_SPEC;
  private static final SubLSymbol $sym150$WHY_NOT_ASSERT_GENLS_;
  private static final SubLList $list151;
  private static final SubLString $str152$Justification_of_why_asserting__g;
  private static final SubLSymbol $sym153$COLLECTION_LEAVES;
  private static final SubLString $str154$Returns_the_minimally_general__th;
  private static final SubLSymbol $sym155$MIN_COLS;
  private static final SubLString $str156$Returns_the_minimally_general__th;
  private static final SubLSymbol $sym157$MIN_COL;
  private static final SubLString $str158$Returns_the_single_minimally_gene;
  private static final SubLList $list159;
  private static final SubLSymbol $sym160$MAX_COLS;
  private static final SubLString $str161$Returns_the_most_general_among_re;
  private static final SubLSymbol $sym162$MIN_CEILING_COLS;
  private static final SubLList $list163;
  private static final SubLString $str164$Returns_the_most_specific_common_;
  private static final SubLSymbol $sym165$MAX_FLOOR_COLS;
  private static final SubLString $str166$Returns_the_most_general_common_s;
  private static final SubLSymbol $sym167$ANY_GENL_ISA;
  private static final SubLList $list168;
  private static final SubLString $str169$Return_some_genl_of_COL_that_isa_;
  private static final SubLList $list170;
  private static final SubLSymbol $sym171$LIGHTER_COL;
  private static final SubLList $list172;
  private static final SubLString $str173$Return_COL_B_iff_it_has_fewer_spe;
  private static final SubLList $list174;
  private static final SubLSymbol $sym175$LIGHTEST_OF_COLS;
  private static final SubLList $list176;
  private static final SubLString $str177$Return_the_collection_having_the_;
  private static final SubLSymbol $sym178$SHALLOWER_COL;
  private static final SubLString $str179$Return_COL_B_iff_it_has_fewer_gen;
  private static final SubLSymbol $sym180$MAX_FLOOR_MTS_OF_GENLS_PATHS;
  private static final SubLList $list181;
  private static final SubLString $str182$_return_listp__Returns_in_what__m;
  private static final SubLObject $const183$coExtensional;
  private static final SubLSymbol $sym184$GENLS_AFTER_ADDING;
  private static final SubLSymbol $sym185$GENLS_AFTER_REMOVING;
  private static final SubLSymbol $kw186$TEST;
  private static final SubLSymbol $kw187$OWNER;
  private static final SubLSymbol $kw188$CLASSES;
  private static final SubLSymbol $kw189$KB;
  private static final SubLSymbol $kw190$TINY;
  private static final SubLSymbol $kw191$WORKING_;
  private static final SubLList $list192;
  private static final SubLSymbol $kw193$FULL;
  private static final SubLList $list194;
  private static final SubLSymbol $sym195$MAX_COLS_BENEATH;
  private static final SubLList $list196;
  private static final SubLList $list197;
  private static final SubLList $list198;
  private static final SubLList $list199;
  private static final SubLList $list200;
  private static final SubLList $list201;
  private static final SubLList $list202;
  private static final SubLList $list203;
  private static final SubLList $list204;
  private static final SubLList $list205;
  private static final SubLList $list206;
  private static final SubLSymbol $sym207$ALL_GENL_OF_SOME_;
  private static final SubLList $list208;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 784L)
  public static SubLObject genls(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_link_methods.sbhl_forward_true_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1104L)
  public static SubLObject min_genls(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_min_forward_true_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1317L)
  public static SubLObject nat_genls(final SubLObject naut, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject nart = narts_high.find_nart( naut );
    if( NIL != nart_handles.nart_p( nart ) )
    {
      return genls( nart, mt, tv );
    }
    return naut_genls( naut, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1559L)
  public static SubLObject nat_min_genls(final SubLObject naut, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject nart = narts_high.find_nart( naut );
    if( NIL != nart_handles.nart_p( nart ) )
    {
      return min_genls( nart, mt, tv );
    }
    return min_cols( naut_genls( naut, mt ), mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1830L)
  public static SubLObject min_genls_of_type(final SubLObject col, final SubLObject type_col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject all_genls = all_genls( col, mt, tv );
    final SubLObject genls_of_type = isa.all_instances_among( type_col, all_genls, mt, tv );
    return min_cols( genls_of_type, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2150L)
  public static SubLObject min_proper_genls_of_type(final SubLObject col, final SubLObject type_col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject all_genls = all_genls( col, mt, tv );
    final SubLObject genls_of_type = isa.all_instances_among( type_col, all_genls, mt, tv );
    return min_cols( Sequences.remove( col, genls_of_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2517L)
  public static SubLObject naut_genls(final SubLObject naut, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.remove_duplicate_forts( ConsesLow.append( new SubLObject[] { kb_accessors.result_genl( cycl_utilities.nat_functor( naut ), mt, UNPROVIDED ), kb_accessors.result_genl_args( naut, mt ),
      kb_accessors.result_inter_arg_genl( naut, mt ), kb_accessors.result_inter_arg_genl_reln( naut, mt ), kb_accessors.result_genl_via_arg_arg_genl( naut, mt )
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2841L)
  public static SubLObject not_genls(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_link_methods.sbhl_forward_false_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3032L)
  public static SubLObject max_not_genls(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    return sbhl_search_methods.sbhl_max_forward_false_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3301L)
  public static SubLObject nat_not_genls(final SubLObject naut, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject nart = narts_high.find_nart( naut );
    if( NIL != nart_handles.nart_p( nart ) )
    {
      return not_genls( nart, mt, tv );
    }
    return naut_not_genls( naut, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3522L)
  public static SubLObject nat_max_not_genls(final SubLObject nat_formula, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject nat = narts_high.find_nart( nat_formula );
    if( NIL != nart_handles.nart_p( nat ) )
    {
      return max_not_genls( nat, mt, tv );
    }
    return max_cols( naut_not_genls( nat, mt ), mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3793L)
  public static SubLObject naut_not_genls(final SubLObject naut, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return kb_accessors.result_genl( cycl_utilities.nat_functor( naut ), mt, $kw9$FALSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3940L)
  public static SubLObject specs(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_link_methods.sbhl_backward_true_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4130L)
  public static SubLObject leaf_colP(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return makeBoolean( NIL == sbhl_link_methods.sbhl_backward_true_link_nodes_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4300L)
  public static SubLObject max_specs(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    return sbhl_search_methods.sbhl_max_backward_true_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4557L)
  public static SubLObject not_specs(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_link_methods.sbhl_backward_false_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4745L)
  public static SubLObject min_not_specs(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    return sbhl_search_methods.sbhl_min_backward_false_link_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5014L)
  public static SubLObject genl_siblings(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    return sbhl_link_methods.sbhl_siblings_forward( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5291L)
  public static SubLObject spec_siblings(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    return sbhl_link_methods.sbhl_siblings_backward( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5556L)
  public static SubLObject all_genls(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    if( NIL == forts.fort_p( col ) || NIL != fort_types_interface.collectionP( col ) )
    {
      return sbhl_search_methods.sbhl_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5985L)
  public static SubLObject all_genls_in_any_mt(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_genls = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym20$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const21$EverythingPSC, thread );
      all_genls = all_genls( col, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return all_genls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6237L)
  public static SubLObject all_genls_in_mt(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_genls = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym22$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      all_genls = all_genls( col, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return all_genls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6508L)
  public static SubLObject all_genls_in_mts(final SubLObject col, SubLObject mts)
  {
    if( mts == UNPROVIDED )
    {
      mts = genl_mts.all_base_mts( mt_relevance_macros.$mt$.getDynamicValue() );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_genls = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      all_genls = all_genls( col, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return all_genls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6814L)
  public static SubLObject nat_all_genls(final SubLObject nat_formula, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject nat = narts_high.find_nart( nat_formula );
    if( NIL != nart_handles.nart_p( nat ) )
    {
      return all_genls( nat, mt, tv );
    }
    return union_all_genls( nat_genls( nat_formula, mt, tv ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7132L)
  public static SubLObject all_proper_genls(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return Sequences.remove( col, all_genls( col, mt, tv ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7268L)
  public static SubLObject all_specs(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    if( NIL == forts.fort_p( col ) || NIL != fort_types_interface.collectionP( col ) )
    {
      return sbhl_search_methods.sbhl_all_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7624L)
  public static SubLObject all_proper_specs(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return Sequences.remove( col, all_specs( col, mt, tv ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7760L)
  public static SubLObject all_proper_specs_in_any_mt(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym20$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const21$EverythingPSC, thread );
      result = cardinality_estimates.sort_by_generality_estimate( all_proper_specs( col, UNPROVIDED, UNPROVIDED ), $kw26$DESCENDING );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8052L)
  public static SubLObject all_leaf_specs_in_all_mts(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject expected_size = Numbers.integerDivide( cardinality_estimates.spec_cardinality( col ), TWO_INTEGER );
    final SubLObject leaf_set = set.new_set( Symbols.symbol_function( EQL ), expected_size );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym20$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const21$EverythingPSC, thread );
      SubLObject node_var = col;
      final SubLObject deck_type = $kw29$STACK;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw31$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw34$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw36$WARN ) )
              {
                Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genls ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const0$genls ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const0$genls ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genls ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( col, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const0$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  while ( NIL != node_var)
                  {
                    final SubLObject spec = node_var;
                    if( NIL != leaf_colP( spec, UNPROVIDED, UNPROVIDED ) )
                    {
                      set.set_add( spec, leaf_set );
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const0$genls ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$12;
                                    for( iteration_state_$12 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$12 ); iteration_state_$12 = dictionary_contents.do_dictionary_contents_next( iteration_state_$12 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$12 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node, recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node2, recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$7, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$12 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$6, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$14;
                          final SubLObject new_list = cdolist_list_var_$14 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$14.first();
                          while ( NIL != cdolist_list_var_$14)
                          {
                            final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node3, recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node4, recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$8, thread );
                            }
                            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                            generating_fn = cdolist_list_var_$14.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$6, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$5, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                    node_var = deck.deck_pop( recur_deck );
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$8, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$5, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$4, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str40$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$4, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$3, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$3, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return set.set_element_list( leaf_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8389L)
  public static SubLObject all_specs_with_max(final SubLObject cycl_term, final SubLObject max)
  {
    assert NIL != Types.integerp( max ) : max;
    if( NIL == fort_types_interface.collection_p( cycl_term ) )
    {
      return NIL;
    }
    final SubLObject iter = kb_iterators.new_specs_iterator( cycl_term );
    SubLObject cur_term = NIL;
    SubLObject result = NIL;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( max ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( NIL != iteration.iteration_done( iter ) )
      {
        return result;
      }
      cur_term = iteration.iteration_next_without_values( iter, $kw43$INVALID_ITERATION_TERM );
      if( cur_term != $kw43$INVALID_ITERATION_TERM )
      {
        result = ConsesLow.cons( cur_term, result );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9032L)
  public static SubLObject all_specs_in_all_mts(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym20$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const21$EverythingPSC, thread );
      return all_specs( col, mt, tv );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9141L)
  public static SubLObject count_all_specs(final SubLObject collection, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( collection, $sym5$EL_FORT_P );
    SubLObject count = ZERO_INTEGER;
    SubLObject node_var = collection;
    final SubLObject deck_type = $kw29$STACK;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0_$17 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          final SubLObject tv_var = tv;
          final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw31$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw34$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw36$WARN ) )
              {
                Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_2_$22 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genls ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const0$genls ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const0$genls ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genls ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$21 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const0$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  while ( NIL != node_var)
                  {
                    final SubLObject spec = node_var;
                    count = Numbers.add( count, ONE_INTEGER );
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const0$genls ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$21 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt_$28 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt_$28 ) )
                                {
                                  final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt_$28, thread );
                                    SubLObject iteration_state_$30;
                                    for( iteration_state_$30 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$30 ); iteration_state_$30 = dictionary_contents.do_dictionary_contents_next( iteration_state_$30 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv_$31 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$30 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$31 ) )
                                      {
                                        final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv_$31, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node, recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node2, recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$23, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$30 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$22, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$33;
                          final SubLObject new_list = cdolist_list_var_$33 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$33.first();
                          while ( NIL != cdolist_list_var_$33)
                          {
                            final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node3, recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node4, recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$24, thread );
                            }
                            cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                            generating_fn = cdolist_list_var_$33.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$22, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$21, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                    node_var = deck.deck_pop( recur_deck );
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$23, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$21, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$20, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                    UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$22, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$20, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$19, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$19, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$18, thread );
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0_$17, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9506L)
  public static SubLObject count_all_specs_if(final SubLObject collection, final SubLObject pred, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject node_var = collection;
    final SubLObject deck_type = $kw29$STACK;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0_$36 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          final SubLObject tv_var = tv;
          final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw31$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw34$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw36$WARN ) )
              {
                Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$39 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_2_$41 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genls ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const0$genls ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const0$genls ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genls ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$40 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const0$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  while ( NIL != node_var)
                  {
                    final SubLObject spec = node_var;
                    if( NIL != Functions.funcall( pred, spec ) )
                    {
                      count = Numbers.add( count, ONE_INTEGER );
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const0$genls ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$40 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$41 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt_$47 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt_$47 ) )
                                {
                                  final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt_$47, thread );
                                    SubLObject iteration_state_$49;
                                    for( iteration_state_$49 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$49 ); iteration_state_$49 = dictionary_contents.do_dictionary_contents_next( iteration_state_$49 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv_$50 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$49 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$50 ) )
                                      {
                                        final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv_$50, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node, recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node2, recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$42, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$49 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$41, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$52;
                          final SubLObject new_list = cdolist_list_var_$52 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$52.first();
                          while ( NIL != cdolist_list_var_$52)
                          {
                            final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node3, recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node4, recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$43, thread );
                            }
                            cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                            generating_fn = cdolist_list_var_$52.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$41, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$40, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                    node_var = deck.deck_pop( recur_deck );
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$42, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$40, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$39, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                    UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$41, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$39, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$38, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$38, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$37, thread );
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0_$36, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$44, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9796L)
  public static SubLObject count_all_specs_E(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject GP = NIL;
    if( NIL == GP )
    {
      SubLObject node_var = collection;
      final SubLObject deck_type = $kw29$STACK;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject mt_var = mt;
          final SubLObject _prev_bind_0_$55 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$56 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$57 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw31$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw34$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw36$WARN ) )
                {
                  Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$57 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$58 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_2_$60 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const0$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const0$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$59 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$61 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const0$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var && NIL == GP)
                    {
                      final SubLObject spec = node_var;
                      count = Numbers.add( count, ONE_INTEGER );
                      if( count.numG( num ) )
                      {
                        GP = T;
                      }
                      final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const0$genls ) );
                      SubLObject rest;
                      SubLObject module_var;
                      SubLObject _prev_bind_0_$59;
                      SubLObject _prev_bind_1_$60;
                      SubLObject node;
                      SubLObject d_link;
                      SubLObject mt_links;
                      SubLObject iteration_state;
                      SubLObject mt_$66;
                      SubLObject tv_links;
                      SubLObject _prev_bind_0_$60;
                      SubLObject iteration_state_$68;
                      SubLObject tv_$69;
                      SubLObject link_nodes;
                      SubLObject _prev_bind_0_$61;
                      SubLObject sol;
                      SubLObject set_contents_var;
                      SubLObject basis_object;
                      SubLObject state;
                      SubLObject node_vars_link_node;
                      SubLObject csome_list_var;
                      SubLObject node_vars_link_node2;
                      SubLObject new_list;
                      SubLObject rest_$71;
                      SubLObject generating_fn;
                      SubLObject _prev_bind_0_$62;
                      SubLObject sol2;
                      SubLObject link_nodes2;
                      SubLObject set_contents_var2;
                      SubLObject basis_object2;
                      SubLObject state2;
                      SubLObject node_vars_link_node3;
                      SubLObject csome_list_var2;
                      SubLObject node_vars_link_node4;
                      for( rest = NIL, rest = accessible_modules; NIL == GP && NIL != rest; rest = rest.rest() )
                      {
                        module_var = rest.first();
                        _prev_bind_0_$59 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        _prev_bind_1_$60 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == GP && NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  mt_$66 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt_$66 ) )
                                  {
                                    _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt_$66, thread );
                                      for( iteration_state_$68 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == GP && NIL == dictionary_contents
                                          .do_dictionary_contents_doneP( iteration_state_$68 ); iteration_state_$68 = dictionary_contents.do_dictionary_contents_next( iteration_state_$68 ) )
                                      {
                                        thread.resetMultipleValues();
                                        tv_$69 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$68 );
                                        link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$69 ) )
                                        {
                                          _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv_$69, thread );
                                            sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              set_contents_var = set.do_set_internal( sol );
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              if( NIL == GP )
                                              {
                                                csome_list_var = sol;
                                                node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var.first();
                                                while ( NIL == GP && NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  node_vars_link_node2 = csome_list_var.first();
                                                }
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$61, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$68 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$60, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            for( rest_$71 = NIL, rest_$71 = new_list; NIL == GP && NIL != rest_$71; rest_$71 = rest_$71.rest() )
                            {
                              generating_fn = rest_$71.first();
                              _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  set_contents_var2 = set.do_set_internal( sol2 );
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  if( NIL == GP )
                                  {
                                    csome_list_var2 = sol2;
                                    node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var2.first();
                                    while ( NIL == GP && NIL != csome_list_var2)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      node_vars_link_node4 = csome_list_var2.first();
                                    }
                                  }
                                }
                                else
                                {
                                  Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$62, thread );
                              }
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$60, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$59, thread );
                        }
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$61, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$59, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$58, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                      UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$60, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$58, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$57, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$57, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$56, thread );
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$55, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$63, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
      }
    }
    return Numbers.numE( count, num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10124L)
  public static SubLObject count_all_specs_G(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject GP = NIL;
    if( NIL == GP )
    {
      SubLObject node_var = collection;
      final SubLObject deck_type = $kw29$STACK;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject mt_var = mt;
          final SubLObject _prev_bind_0_$74 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$75 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$76 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw31$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw34$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw36$WARN ) )
                {
                  Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$76 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$77 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_2_$79 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const0$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const0$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$77 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$78 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$80 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const0$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var && NIL == GP)
                    {
                      final SubLObject spec = node_var;
                      count = Numbers.add( count, ONE_INTEGER );
                      if( count.numG( num ) )
                      {
                        GP = T;
                      }
                      final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const0$genls ) );
                      SubLObject rest;
                      SubLObject module_var;
                      SubLObject _prev_bind_0_$78;
                      SubLObject _prev_bind_1_$79;
                      SubLObject node;
                      SubLObject d_link;
                      SubLObject mt_links;
                      SubLObject iteration_state;
                      SubLObject mt_$85;
                      SubLObject tv_links;
                      SubLObject _prev_bind_0_$79;
                      SubLObject iteration_state_$87;
                      SubLObject tv_$88;
                      SubLObject link_nodes;
                      SubLObject _prev_bind_0_$80;
                      SubLObject sol;
                      SubLObject set_contents_var;
                      SubLObject basis_object;
                      SubLObject state;
                      SubLObject node_vars_link_node;
                      SubLObject csome_list_var;
                      SubLObject node_vars_link_node2;
                      SubLObject new_list;
                      SubLObject rest_$90;
                      SubLObject generating_fn;
                      SubLObject _prev_bind_0_$81;
                      SubLObject sol2;
                      SubLObject link_nodes2;
                      SubLObject set_contents_var2;
                      SubLObject basis_object2;
                      SubLObject state2;
                      SubLObject node_vars_link_node3;
                      SubLObject csome_list_var2;
                      SubLObject node_vars_link_node4;
                      for( rest = NIL, rest = accessible_modules; NIL == GP && NIL != rest; rest = rest.rest() )
                      {
                        module_var = rest.first();
                        _prev_bind_0_$78 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        _prev_bind_1_$79 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == GP && NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  mt_$85 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt_$85 ) )
                                  {
                                    _prev_bind_0_$79 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt_$85, thread );
                                      for( iteration_state_$87 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == GP && NIL == dictionary_contents
                                          .do_dictionary_contents_doneP( iteration_state_$87 ); iteration_state_$87 = dictionary_contents.do_dictionary_contents_next( iteration_state_$87 ) )
                                      {
                                        thread.resetMultipleValues();
                                        tv_$88 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$87 );
                                        link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$88 ) )
                                        {
                                          _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv_$88, thread );
                                            sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              set_contents_var = set.do_set_internal( sol );
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              if( NIL == GP )
                                              {
                                                csome_list_var = sol;
                                                node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var.first();
                                                while ( NIL == GP && NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  node_vars_link_node2 = csome_list_var.first();
                                                }
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$80, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$87 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$79, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            for( rest_$90 = NIL, rest_$90 = new_list; NIL == GP && NIL != rest_$90; rest_$90 = rest_$90.rest() )
                            {
                              generating_fn = rest_$90.first();
                              _prev_bind_0_$81 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  set_contents_var2 = set.do_set_internal( sol2 );
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == GP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  if( NIL == GP )
                                  {
                                    csome_list_var2 = sol2;
                                    node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var2.first();
                                    while ( NIL == GP && NIL != csome_list_var2)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      node_vars_link_node4 = csome_list_var2.first();
                                    }
                                  }
                                }
                                else
                                {
                                  Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$81, thread );
                              }
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$79, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$78, thread );
                        }
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$80, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$78, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$77, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                      UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$79, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$77, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$76, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$76, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$75, thread );
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$74, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$82, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
      }
    }
    return GP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10443L)
  public static SubLObject count_all_specs_GE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject GEP = NIL;
    if( NIL == GEP )
    {
      SubLObject node_var = collection;
      final SubLObject deck_type = $kw29$STACK;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject mt_var = mt;
          final SubLObject _prev_bind_0_$93 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            final SubLObject tv_var = tv;
            final SubLObject _prev_bind_0_$94 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$95 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw31$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw34$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw36$WARN ) )
                {
                  Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$95 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$96 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_2_$98 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const0$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const0$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$96 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$97 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$99 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const0$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var && NIL == GEP)
                    {
                      final SubLObject spec = node_var;
                      count = Numbers.add( count, ONE_INTEGER );
                      if( count.numGE( num ) )
                      {
                        GEP = T;
                      }
                      final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const0$genls ) );
                      SubLObject rest;
                      SubLObject module_var;
                      SubLObject _prev_bind_0_$97;
                      SubLObject _prev_bind_1_$98;
                      SubLObject node;
                      SubLObject d_link;
                      SubLObject mt_links;
                      SubLObject iteration_state;
                      SubLObject mt_$104;
                      SubLObject tv_links;
                      SubLObject _prev_bind_0_$98;
                      SubLObject iteration_state_$106;
                      SubLObject tv_$107;
                      SubLObject link_nodes;
                      SubLObject _prev_bind_0_$99;
                      SubLObject sol;
                      SubLObject set_contents_var;
                      SubLObject basis_object;
                      SubLObject state;
                      SubLObject node_vars_link_node;
                      SubLObject csome_list_var;
                      SubLObject node_vars_link_node2;
                      SubLObject new_list;
                      SubLObject rest_$109;
                      SubLObject generating_fn;
                      SubLObject _prev_bind_0_$100;
                      SubLObject sol2;
                      SubLObject link_nodes2;
                      SubLObject set_contents_var2;
                      SubLObject basis_object2;
                      SubLObject state2;
                      SubLObject node_vars_link_node3;
                      SubLObject csome_list_var2;
                      SubLObject node_vars_link_node4;
                      for( rest = NIL, rest = accessible_modules; NIL == GEP && NIL != rest; rest = rest.rest() )
                      {
                        module_var = rest.first();
                        _prev_bind_0_$97 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        _prev_bind_1_$98 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == GEP && NIL == dictionary_contents
                                    .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  mt_$104 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt_$104 ) )
                                  {
                                    _prev_bind_0_$98 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt_$104, thread );
                                      for( iteration_state_$106 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == GEP && NIL == dictionary_contents
                                          .do_dictionary_contents_doneP( iteration_state_$106 ); iteration_state_$106 = dictionary_contents.do_dictionary_contents_next( iteration_state_$106 ) )
                                      {
                                        thread.resetMultipleValues();
                                        tv_$107 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$106 );
                                        link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv_$107 ) )
                                        {
                                          _prev_bind_0_$99 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv_$107, thread );
                                            sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              set_contents_var = set.do_set_internal( sol );
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == GEP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              if( NIL == GEP )
                                              {
                                                csome_list_var = sol;
                                                node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var.first();
                                                while ( NIL == GEP && NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  node_vars_link_node2 = csome_list_var.first();
                                                }
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$99, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$106 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$98, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            for( rest_$109 = NIL, rest_$109 = new_list; NIL == GEP && NIL != rest_$109; rest_$109 = rest_$109.rest() )
                            {
                              generating_fn = rest_$109.first();
                              _prev_bind_0_$100 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  set_contents_var2 = set.do_set_internal( sol2 );
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == GEP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  if( NIL == GEP )
                                  {
                                    csome_list_var2 = sol2;
                                    node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var2.first();
                                    while ( NIL == GEP && NIL != csome_list_var2)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      node_vars_link_node4 = csome_list_var2.first();
                                    }
                                  }
                                }
                                else
                                {
                                  Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$100, thread );
                              }
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$98, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$97, thread );
                        }
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$99, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$97, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$96, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                      UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$98, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$96, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$95, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$95, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$94, thread );
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$93, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$101 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$101, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
      }
    }
    return GEP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10779L)
  public static SubLObject count_all_specs_L(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return Numbers.numL( count_all_specs( collection, mt, tv ), num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10978L)
  public static SubLObject count_all_specs_LE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return Numbers.numLE( count_all_specs( collection, mt, tv ), num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11190L)
  public static SubLObject all_genls_wrt(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( spec, $sym5$EL_FORT_P );
    enforceType( genl, $sym5$EL_FORT_P );
    return sbhl_search_methods.sbhl_all_forward_true_nodes_between( sbhl_module_vars.get_sbhl_module( $const0$genls ), spec, genl, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11578L)
  public static SubLObject union_all_genls(final SubLObject cols, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( cols, $sym54$LISTP );
    if( NIL == cols )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( cols ) )
    {
      return all_genls( cols.first(), mt, tv );
    }
    return sbhl_search_methods.sbhl_union_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), cols, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11951L)
  public static SubLObject union_min_genls_of_type(final SubLObject cols, final SubLObject type_col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLObject all_genls = union_all_genls( cols, mt, tv );
    final SubLObject genls_of_type = isa.all_instances_among( type_col, all_genls, mt, tv );
    return min_cols( genls_of_type, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12294L)
  public static SubLObject union_all_genls_among(final SubLObject cols, final SubLObject candidates, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return keyhash_utilities.fast_intersection( union_all_genls( cols, mt, tv ), candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12565L)
  public static SubLObject all_genl_of_someP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return conses_high.subsetp( v_genls, union_all_genls_among( specs, v_genls, mt, tv ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12905L)
  public static SubLObject union_all_specs(final SubLObject cols, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( cols, $sym54$LISTP );
    if( NIL == cols )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( cols ) )
    {
      return all_specs( cols.first(), mt, tv );
    }
    return sbhl_search_methods.sbhl_union_all_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), cols, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13268L)
  public static SubLObject union_all_specs_count(final SubLObject cols, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return Sequences.length( union_all_specs( cols, mt, tv ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13438L)
  public static SubLObject max_cols_beneath(final SubLObject cols, final SubLObject genl, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return max_cols( all_specs_among( genl, cols, mt, UNPROVIDED ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13730L)
  public static SubLObject all_dependent_specs(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    return sbhl_search_methods.sbhl_all_dependent_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14071L)
  public static SubLObject min_genls_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return min_cols( all_genls_among( col, candidates, mt, tv ), mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14256L)
  public static SubLObject all_genls_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    enforceType( candidates, $sym54$LISTP );
    if( NIL == candidates )
    {
      return NIL;
    }
    if( NIL == list_utilities.singletonP( candidates ) )
    {
      return sbhl_search_methods.sbhl_all_forward_true_nodes_among( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, candidates, mt, tv );
    }
    if( NIL != genlP( col, candidates.first(), mt, tv ) )
    {
      return candidates;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14742L)
  public static SubLObject all_specs_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    enforceType( candidates, $sym54$LISTP );
    if( NIL == candidates )
    {
      return NIL;
    }
    if( NIL == list_utilities.singletonP( candidates ) )
    {
      return sbhl_search_methods.sbhl_all_backward_true_nodes_among( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, candidates, mt, tv );
    }
    if( NIL != specP( col, candidates.first(), mt, tv ) )
    {
      return candidates;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15231L)
  public static SubLObject max_specs_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return max_cols( all_specs_among( col, candidates, mt, tv ), mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15402L)
  public static SubLObject all_genls_if(final SubLObject function, final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( function, $sym69$FUNCTION_SPEC_P );
    enforceType( col, $sym5$EL_FORT_P );
    return sbhl_search_methods.sbhl_all_forward_true_nodes_if( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, function, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15774L)
  public static SubLObject all_specs_if(final SubLObject function, final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( function, $sym69$FUNCTION_SPEC_P );
    enforceType( col, $sym5$EL_FORT_P );
    return sbhl_search_methods.sbhl_all_backward_true_nodes_if( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, function, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16136L)
  public static SubLObject all_genls_if_with_pruning(final SubLObject function, final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_all_forward_true_nodes_if_with_pruning( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, function, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16482L)
  public static SubLObject all_not_genls(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16799L)
  public static SubLObject all_not_specs(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    return sbhl_search_implied_relations.sbhl_all_implied_backward_false_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17105L)
  public static SubLObject cols_awning(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_forward_true_goals_with_no_path_from_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), specs, v_genls, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17363L)
  public static SubLObject map_all_genls(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( fn, $sym69$FUNCTION_SPEC_P );
    enforceType( col, $sym5$EL_FORT_P );
    sbhl_search_methods.sbhl_map_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, fn, mt, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17673L)
  public static SubLObject map_all_specs(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( fn, $sym69$FUNCTION_SPEC_P );
    enforceType( col, $sym5$EL_FORT_P );
    sbhl_search_methods.sbhl_map_all_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, fn, mt, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17972L)
  public static SubLObject map_union_all_genls(final SubLObject fn, final SubLObject cols, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    sbhl_search_methods.sbhl_map_union_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), cols, fn, mt, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18246L)
  public static SubLObject map_all_genls_if(final SubLObject fn, final SubLObject test_fn, final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    sbhl_search_methods.sbhl_map_all_forward_true_nodes_if( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, fn, test_fn, mt, tv );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18490L)
  public static SubLObject gather_all_genls(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv, SubLObject combine_fn)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( combine_fn == UNPROVIDED )
    {
      combine_fn = NIL;
    }
    return sbhl_search_methods.sbhl_gather_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, fn, mt, tv, combine_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18781L)
  public static SubLObject gather_all_specs(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv, SubLObject combine_fn)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( combine_fn == UNPROVIDED )
    {
      combine_fn = NIL;
    }
    return sbhl_search_methods.sbhl_gather_all_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, fn, mt, tv, combine_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19056L)
  public static SubLObject any_all_genls(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( fn, $sym69$FUNCTION_SPEC_P );
    enforceType( col, $sym5$EL_FORT_P );
    return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, fn, mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19404L)
  public static SubLObject any_all_specs(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( fn, $sym69$FUNCTION_SPEC_P );
    enforceType( col, $sym5$EL_FORT_P );
    return sbhl_search_methods.sbhl_gather_first_among_all_backward_true_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, fn, mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19736L)
  public static SubLObject sample_leaf_specs(final SubLObject col, SubLObject samples, SubLObject mt, SubLObject tv)
  {
    if( samples == UNPROVIDED )
    {
      samples = ONE_INTEGER;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_sample_leaf_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, samples, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20046L)
  public static SubLObject sample_different_leaf_specs(final SubLObject dif_node, final SubLObject col, SubLObject samples, SubLObject mt, SubLObject tv)
  {
    if( samples == UNPROVIDED )
    {
      samples = ONE_INTEGER;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_sample_different_leaf_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), dif_node, col, samples, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20457L)
  public static SubLObject genlP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( spec, $sym5$EL_FORT_P );
    enforceType( genl, $sym5$EL_FORT_P );
    if( NIL == forts.fort_p( spec ) || NIL != fort_types_interface.collectionP( spec ) )
    {
      return makeBoolean( NIL != sbhl_search_methods.sbhl_non_justifying_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), spec, genl, mt, tv ) || NIL != ( ( NIL != cycl_grammar.cycl_nat_p(
          spec ) ) ? result_genl_via_pgiaP( spec, genl, mt ) : NIL ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21038L)
  public static SubLObject genlsP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return genlP( spec, genl, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21207L)
  public static SubLObject genl_in_mtsP(final SubLObject spec, final SubLObject genl, SubLObject mts)
  {
    if( mts == UNPROVIDED )
    {
      mts = genl_mts.all_base_mts( mt_relevance_macros.$mt$.getDynamicValue() );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject genlP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      genlP = genlP( spec, genl, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return genlP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21497L)
  public static SubLObject genl_in_any_mtP(final SubLObject spec, final SubLObject genl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym20$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const21$EverythingPSC, thread );
      result = genlP( spec, genl, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21696L)
  public static SubLObject specP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( genl, $sym5$EL_FORT_P );
    enforceType( spec, $sym5$EL_FORT_P );
    return genlP( spec, genl, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21970L)
  public static SubLObject nat_genlP(final SubLObject nat_formula, final SubLObject genl, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject nat = cycl_utilities.find_ground_naut( nat_formula );
    if( NIL != nart_handles.nart_p( nat ) )
    {
      return genlP( nat, genl, mt, UNPROVIDED );
    }
    return naut_genlP( nat_formula, genl, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22285L)
  public static SubLObject naut_genlP(final SubLObject nat_formula, final SubLObject genl, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != result_genl_colP( cycl_utilities.nat_functor( nat_formula ), genl, mt ) || NIL != result_genl_arg_colP( nat_formula, genl, mt ) || NIL != result_genl_inter_arg_colP( nat_formula, genl, mt )
        || NIL != result_genl_via_pgiaP( nat_formula, genl, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22618L)
  public static SubLObject result_genl_colP(final SubLObject functor, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return any_specP( collection, kb_accessors.result_genl( functor, mt, UNPROVIDED ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22795L)
  public static SubLObject result_genl_arg_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return any_specP( collection, kb_accessors.result_genl_args( nat_formula, mt ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22993L)
  public static SubLObject result_genl_inter_arg_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return any_specP( collection, kb_accessors.result_inter_arg_genl( nat_formula, mt ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23200L)
  public static SubLObject result_genl_via_pgiaP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$pgia_activeP$.getDynamicValue( thread ) && cycl_utilities.nat_functor( nat_formula ).eql( cycl_utilities.nat_functor( collection ) ) )
    {
      final SubLObject functor = cycl_utilities.nat_functor( collection );
      SubLObject genlP = T;
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const95$preservesGenlsInArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != genlP )
        {
          genlP = genlsP( cycl_utilities.nat_arg( nat_formula, arg, UNPROVIDED ), cycl_utilities.nat_arg( collection, arg, UNPROVIDED ), mt, UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
      return genlP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23684L)
  public static SubLObject genl_ofP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_inverse_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), genl, spec, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23978L)
  public static SubLObject any_genlP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( spec, $sym5$EL_FORT_P );
    enforceType( v_genls, $sym54$LISTP );
    if( NIL == v_genls )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( v_genls ) )
    {
      return genlP( spec, v_genls.first(), mt, tv );
    }
    return sbhl_search_methods.sbhl_predicate_relation_with_any_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), spec, v_genls, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24470L)
  public static SubLObject any_specP(final SubLObject genl, final SubLObject specs, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( genl, $sym5$EL_FORT_P );
    enforceType( specs, $sym54$LISTP );
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_justification_search_p$.bind( NIL, thread );
      sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind( NIL, thread );
      if( NIL == specs )
      {
        result = NIL;
      }
      else if( NIL != list_utilities.singletonP( specs ) )
      {
        result = specP( genl, specs.first(), mt, tv );
      }
      else
      {
        result = sbhl_search_methods.sbhl_any_with_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), specs, genl, mt, tv );
      }
    }
    finally
    {
      sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_justification_search_p$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24996L)
  public static SubLObject all_genlP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( spec, $sym5$EL_FORT_P );
    enforceType( v_genls, $sym54$LISTP );
    if( NIL == v_genls )
    {
      return T;
    }
    if( NIL != list_utilities.singletonP( v_genls ) )
    {
      return genlP( spec, v_genls.first(), mt, tv );
    }
    return sbhl_search_methods.sbhl_predicate_relation_with_all_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), spec, v_genls, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25469L)
  public static SubLObject all_specP(final SubLObject genl, final SubLObject specs, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( genl, $sym5$EL_FORT_P );
    enforceType( specs, $sym54$LISTP );
    if( NIL == specs )
    {
      return T;
    }
    if( NIL != list_utilities.singletonP( specs ) )
    {
      return specP( genl, specs.first(), mt, tv );
    }
    return sbhl_search_methods.sbhl_all_with_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), specs, genl, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25868L)
  public static SubLObject any_genl_anyP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( specs, $sym54$LISTP );
    enforceType( v_genls, $sym54$LISTP );
    if( NIL == specs )
    {
      return NIL;
    }
    if( NIL == v_genls )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( specs ) )
    {
      return any_genlP( specs.first(), v_genls, mt, tv );
    }
    return sbhl_search_methods.sbhl_predicate_relation_between_any_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), specs, v_genls, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26357L)
  public static SubLObject any_genl_allP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( specs, $sym54$LISTP );
    enforceType( v_genls, $sym54$LISTP );
    return sbhl_search_methods.sbhl_any_predicate_relation_with_all_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), specs, v_genls, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26709L)
  public static SubLObject all_spec_anyP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( specs, $sym54$LISTP );
    enforceType( v_genls, $sym54$LISTP );
    return sbhl_search_methods.sbhl_all_with_predicate_relation_with_any_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), specs, v_genls, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27078L)
  public static SubLObject not_genlsP(final SubLObject col, final SubLObject not_genl, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return not_genlP( col, not_genl, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27489L)
  public static SubLObject not_genlP(final SubLObject col, final SubLObject not_genl, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    enforceType( not_genl, $sym5$EL_FORT_P );
    if( NIL != genlP( col, not_genl, mt, sbhl_search_vars.sbhl_opposite_or_nil_tv( tv ) ) )
    {
      return NIL;
    }
    return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, not_genl, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27882L)
  public static SubLObject argue_not_genlP(final SubLObject col, final SubLObject not_genl, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, not_genl, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28183L)
  public static SubLObject all_not_specP(final SubLObject col, final SubLObject not_specs, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    enforceType( not_specs, $sym54$LISTP );
    if( NIL == not_specs )
    {
      return T;
    }
    if( NIL != list_utilities.singletonP( not_specs ) )
    {
      return not_genlP( not_specs.first(), col, mt, tv );
    }
    return sbhl_search_implied_relations.sbhl_all_with_implied_false_inverse_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), not_specs, col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28667L)
  public static SubLObject any_not_genlP(final SubLObject col, final SubLObject not_genls, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    enforceType( not_genls, $sym54$LISTP );
    if( NIL == not_genls )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( not_genls ) )
    {
      return not_genlP( col, not_genls.first(), mt, tv );
    }
    return sbhl_search_implied_relations.sbhl_any_with_implied_false_inverse_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), not_genls, col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29152L)
  public static SubLObject random_genl_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != forts.fort_p( collection ) : collection;
    if( NIL != mt && !assertionsDisabledInClass && NIL == hlmt.hlmt_p( mt ) )
    {
      throw new AssertionError( mt );
    }
    return list_utilities.random_element( all_genls( collection, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29396L)
  public static SubLObject random_spec_of(final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != forts.fort_p( collection ) : collection;
    if( NIL != mt && !assertionsDisabledInClass && NIL == hlmt.hlmt_p( mt ) )
    {
      throw new AssertionError( mt );
    }
    return list_utilities.random_element( all_specs( collection, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29615L)
  public static SubLObject collections_coextensionalP(final SubLObject col_1, final SubLObject col_2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( col_1, $sym5$EL_FORT_P );
    enforceType( col_2, $sym5$EL_FORT_P );
    return makeBoolean( col_1.eql( col_2 ) || NIL != asserted_coextensionalP( col_1, col_2, mt ) || NIL != tacit_coextensionalP( col_1, col_2, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29983L)
  public static SubLObject tacit_coextensionalP(final SubLObject col_1, final SubLObject col_2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != genlP( col_1, col_2, mt, UNPROVIDED ) && NIL != genlP( col_2, col_1, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30333L)
  public static SubLObject common_instanceP(final SubLObject col_1, final SubLObject col_2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30441L)
  public static SubLObject why_common_instanceP(final SubLObject col_1, final SubLObject col_2, SubLObject mt, SubLObject tv, SubLObject behavior)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( behavior == UNPROVIDED )
    {
      behavior = NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30577L)
  public static SubLObject collections_intersectP(final SubLObject col_1, final SubLObject col_2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( col_1, $sym5$EL_FORT_P );
    enforceType( col_2, $sym5$EL_FORT_P );
    return makeBoolean( NIL != genlP( col_1, col_2, mt, UNPROVIDED ) || NIL != genlP( col_2, col_1, mt, UNPROVIDED ) || NIL != disjoint_with.not_disjoint_withP( col_1, col_2, mt, UNPROVIDED )
        || ( NIL != $sbhl_infer_intersection_from_instancesP$.getDynamicValue( thread ) && NIL != common_instanceP( col_1, col_2, mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31094L)
  public static SubLObject hierarchical_collectionsP(final SubLObject col_1, final SubLObject col_2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != genlP( col_1, col_2, mt, UNPROVIDED ) || NIL != genlP( col_2, col_1, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31274L)
  public static SubLObject genl_of_any_argP(final SubLObject collection, final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject access_arg, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( access_arg == UNPROVIDED )
    {
      access_arg = TWO_INTEGER;
    }
    if( tv == UNPROVIDED )
    {
      tv = $kw136$TRUE;
    }
    if( NIL == collection || NIL == v_term )
    {
      return NIL;
    }
    if( NIL != term.ground_nautP( collection, UNPROVIDED ) )
    {
      return genl_of_any_argP( narts_high.find_nart( collection ), v_term, pred, mt, index_arg, access_arg, tv );
    }
    if( NIL != term.ground_nautP( v_term, UNPROVIDED ) )
    {
      return genl_of_any_argP( collection, narts_high.find_nart( v_term ), pred, mt, index_arg, access_arg, tv );
    }
    if( NIL == fort_types_interface.collectionP( collection ) )
    {
      return NIL;
    }
    if( NIL == forts.fort_p( v_term ) )
    {
      return NIL;
    }
    return genl_of_any_argP_int( collection, v_term, pred, mt, index_arg, access_arg, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32371L)
  public static SubLObject genl_of_any_argP_int(final SubLObject collection, final SubLObject v_term, final SubLObject pred, final SubLObject mt, final SubLObject index_arg, final SubLObject access_arg,
      final SubLObject tv)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject genlP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
      if( kb_indexing.num_gaf_arg_index( v_term, index_arg, pred, UNPROVIDED ).numL( Numbers.divide( cardinality_estimates.spec_cardinality( collection ), THREE_INTEGER ) ) )
      {
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, index_arg, pred ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, index_arg, pred );
          SubLObject done_var = genlP;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw137$GAF, tv, NIL );
                SubLObject done_var_$112 = genlP;
                final SubLObject token_var_$113 = NIL;
                while ( NIL == done_var_$112)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$113 );
                  final SubLObject valid_$114 = makeBoolean( !token_var_$113.eql( assertion ) );
                  if( NIL != valid_$114 && NIL != genlP( assertions_high.gaf_arg( assertion, access_arg ), collection, UNPROVIDED, UNPROVIDED ) )
                  {
                    genlP = T;
                  }
                  done_var_$112 = makeBoolean( NIL == valid_$114 || NIL != genlP );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$115 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$115, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != genlP );
          }
        }
      }
      else
      {
        final SubLObject specs = all_specs( collection, UNPROVIDED, UNPROVIDED );
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, index_arg, pred ) )
        {
          final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, index_arg, pred );
          SubLObject done_var2 = genlP;
          final SubLObject token_var2 = NIL;
          while ( NIL == done_var2)
          {
            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
            final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
            if( NIL != valid2 )
            {
              SubLObject final_index_iterator2 = NIL;
              try
              {
                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw137$GAF, tv, NIL );
                SubLObject done_var_$113 = genlP;
                final SubLObject token_var_$114 = NIL;
                while ( NIL == done_var_$113)
                {
                  final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$114 );
                  final SubLObject valid_$115 = makeBoolean( !token_var_$114.eql( assertion2 ) );
                  if( NIL != valid_$115 && NIL != list_utilities.member_eqP( assertions_high.gaf_arg( assertion2, access_arg ), specs ) )
                  {
                    genlP = T;
                  }
                  done_var_$113 = makeBoolean( NIL == valid_$115 || NIL != genlP );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$116 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator2 )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$116, thread );
                }
              }
            }
            done_var2 = makeBoolean( NIL == valid2 || NIL != genlP );
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return genlP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33040L)
  public static SubLObject why_genlP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( behavior == UNPROVIDED )
    {
      behavior = NIL;
    }
    enforceType( spec, $sym5$EL_FORT_P );
    enforceType( genl, $sym5$EL_FORT_P );
    if( NIL != term.first_order_nautP( spec ) )
    {
      return any_just_of_nat_genl( spec, genl, mt );
    }
    return sbhl_search_methods.why_sbhl_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), spec, genl, mt, tv, behavior );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33498L)
  public static SubLObject any_just_of_nat_genl(final SubLObject nat, final SubLObject collection, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_term = cycl_utilities.find_ground_naut( nat );
    final SubLObject just = why_genlP( v_term, collection, mt, UNPROVIDED, UNPROVIDED );
    if( NIL != just )
    {
      return ConsesLow.cons( reader.bq_cons( ConsesLow.list( $const142$termOfUnit, v_term, nat ), $list143 ), just );
    }
    SubLObject nat_just = NIL;
    if( NIL == nat_just )
    {
      SubLObject csome_list_var = kb_accessors.result_genl( cycl_utilities.nat_functor( nat ), mt, UNPROVIDED );
      SubLObject genl = NIL;
      genl = csome_list_var.first();
      while ( NIL == nat_just && NIL != csome_list_var)
      {
        if( !genl.equal( collection ) )
        {
          nat_just = why_genlP( genl, collection, mt, UNPROVIDED, UNPROVIDED );
        }
        if( NIL != nat_just || genl.equal( collection ) )
        {
          return ConsesLow.cons( reader.bq_cons( ConsesLow.list( $const144$resultGenl, cycl_utilities.nat_functor( nat ), genl ), $list143 ), nat_just );
        }
        csome_list_var = csome_list_var.rest();
        genl = csome_list_var.first();
      }
    }
    if( NIL == nat_just )
    {
      SubLObject csome_list_var = kb_accessors.result_genl_args( nat, mt );
      SubLObject genl = NIL;
      genl = csome_list_var.first();
      while ( NIL == nat_just && NIL != csome_list_var)
      {
        if( !genl.equal( collection ) )
        {
          nat_just = why_genlP( genl, collection, mt, UNPROVIDED, UNPROVIDED );
        }
        if( NIL != nat_just || genl.equal( collection ) )
        {
          final SubLObject args = kb_accessors.result_genl_via_argnums( nat, collection, mt, UNPROVIDED );
          if( NIL != args )
          {
            return ConsesLow.cons( reader.bq_cons( ConsesLow.list( $const145$resultGenlArg, cycl_utilities.nat_functor( nat ), args.first() ), $list143 ), nat_just );
          }
        }
        csome_list_var = csome_list_var.rest();
        genl = csome_list_var.first();
      }
    }
    if( NIL == nat_just )
    {
      SubLObject csome_list_var = kb_accessors.result_inter_arg_genl( nat, mt );
      SubLObject genl = NIL;
      genl = csome_list_var.first();
      while ( NIL == nat_just && NIL != csome_list_var)
      {
        if( !genl.equal( collection ) )
        {
          nat_just = why_genlP( genl, collection, mt, UNPROVIDED, UNPROVIDED );
        }
        if( NIL != nat_just || genl.equal( collection ) )
        {
          final SubLObject args = kb_accessors.result_inter_arg_genl_via_which_args( nat, collection, mt ).first();
          if( args.isCons() )
          {
            final SubLObject arg = args.first();
            final SubLObject ind_col = conses_high.second( args );
            final SubLObject dep_col = conses_high.third( args );
            final SubLObject arg_col = cycl_utilities.nat_arg( nat, arg, UNPROVIDED );
            if( !arg_col.equal( ind_col ) )
            {
              nat_just = ConsesLow.nconc( nat_just, why_genlP( arg_col, ind_col, mt, UNPROVIDED, UNPROVIDED ) );
            }
            if( !dep_col.equal( collection ) )
            {
              nat_just = ConsesLow.nconc( nat_just, why_genlP( dep_col, collection, mt, UNPROVIDED, UNPROVIDED ) );
            }
            return ConsesLow.cons( reader.bq_cons( ConsesLow.list( $const146$interArgResultGenl, cycl_utilities.nat_functor( nat ), arg, ind_col, dep_col ), $list143 ), nat_just );
          }
        }
        csome_list_var = csome_list_var.rest();
        genl = csome_list_var.first();
      }
    }
    if( NIL == nat_just )
    {
      SubLObject csome_list_var = kb_accessors.result_inter_arg_genl_reln( nat, mt );
      SubLObject genl = NIL;
      genl = csome_list_var.first();
      while ( NIL == nat_just && NIL != csome_list_var)
      {
        if( !genl.equal( collection ) )
        {
          nat_just = why_genlP( genl, collection, mt, UNPROVIDED, UNPROVIDED );
        }
        if( NIL != nat_just || genl.equal( collection ) )
        {
          final SubLObject args = kb_accessors.result_inter_arg_genl_reln_via_which_args( nat, collection, mt, UNPROVIDED ).first();
          if( args.isCons() )
          {
            final SubLObject rel_sentence = args.first().first();
            final SubLObject arg2 = conses_high.second( args );
            final SubLObject rel = cycl_utilities.formula_operator( rel_sentence );
            final SubLObject rel_nat_term_arg = conses_high.third( args );
            final SubLObject rel_col_arg = conses_high.fourth( args );
            final SubLObject col = cycl_utilities.formula_arg( rel_sentence, rel_col_arg, UNPROVIDED );
            if( !col.equal( collection ) )
            {
              nat_just = ConsesLow.nconc( nat_just, why_genlP( col, collection, mt, UNPROVIDED, UNPROVIDED ) );
            }
            return ConsesLow.append( ConsesLow.list( reader.bq_cons( ConsesLow.list( $const147$interArgResultGenlReln, cycl_utilities.nat_functor( nat ), arg2, rel, rel_nat_term_arg, rel_col_arg ), $list143 ), reader
                .bq_cons( rel_sentence, $list143 ) ), nat_just );
          }
        }
        csome_list_var = csome_list_var.rest();
        genl = csome_list_var.first();
      }
    }
    if( NIL == nat_just && NIL != control_vars.$pgia_activeP$.getDynamicValue( thread ) && NIL != term.first_order_nautP( collection ) && cycl_utilities.nat_functor( nat ).eql( cycl_utilities.nat_functor(
        collection ) ) )
    {
      final SubLObject functor = cycl_utilities.nat_functor( collection );
      if( NIL == nat_just )
      {
        SubLObject csome_list_var2 = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const95$preservesGenlsInArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject arg3 = NIL;
        arg3 = csome_list_var2.first();
        while ( NIL == nat_just && NIL != csome_list_var2)
        {
          nat_just = why_genlP( cycl_utilities.nat_arg( nat, arg3, UNPROVIDED ), cycl_utilities.nat_arg( collection, arg3, UNPROVIDED ), mt, UNPROVIDED, UNPROVIDED );
          if( NIL != nat_just )
          {
            nat_just = ConsesLow.cons( reader.bq_cons( ConsesLow.list( $const95$preservesGenlsInArg, functor, arg3 ), $list143 ), nat_just );
          }
          csome_list_var2 = csome_list_var2.rest();
          arg3 = csome_list_var2.first();
        }
      }
      return nat_just;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36611L)
  public static SubLObject why_not_genlP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( behavior == UNPROVIDED )
    {
      behavior = NIL;
    }
    enforceType( spec, $sym5$EL_FORT_P );
    enforceType( genl, $sym5$EL_FORT_P );
    return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const0$genls ), spec, genl, mt, tv, behavior );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36954L)
  public static SubLObject why_not_assert_genlsP(final SubLObject spec, final SubLObject genl, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( spec, $sym5$EL_FORT_P );
    enforceType( genl, $sym5$EL_FORT_P );
    return why_not_genlP( spec, genl, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37213L)
  public static SubLObject why_collections_intersectP(final SubLObject col_1, final SubLObject col_2, SubLObject mt, SubLObject tv, SubLObject behavior)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( behavior == UNPROVIDED )
    {
      behavior = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject why = why_genlP( col_1, col_2, mt, tv, behavior );
    if( NIL != why )
    {
      return why;
    }
    why = why_genlP( col_2, col_1, mt, tv, behavior );
    if( NIL != why )
    {
      return why;
    }
    why = disjoint_with.why_not_disjoint_withP( col_1, col_2, mt, tv, behavior );
    if( NIL != why )
    {
      return why;
    }
    if( NIL != $sbhl_infer_intersection_from_instancesP$.getDynamicValue( thread ) )
    {
      return why_common_instanceP( col_1, col_2, mt, tv, behavior );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37745L)
  public static SubLObject why_not_assert_mdwP(final SubLObject col_1, final SubLObject col_2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return why_collections_intersectP( col_1, col_2, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37897L)
  public static SubLObject collection_leaves(final SubLObject col, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    return sbhl_search_methods.sbhl_leaf_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38243L)
  public static SubLObject min_cols(final SubLObject cols, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( cols, $sym54$LISTP );
    return sbhl_search_methods.sbhl_min_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), cols, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38582L)
  public static SubLObject min_col(final SubLObject cols, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( cols, $sym54$LISTP );
    final SubLObject min_cols = min_cols( cols, mt, tv );
    SubLObject min_col = min_cols.first();
    SubLObject depth_min_col = Sequences.length( all_genls( min_col, mt, UNPROVIDED ) );
    SubLObject depth_col = NIL;
    SubLObject cdolist_list_var = min_cols.rest();
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      depth_col = Sequences.length( all_genls( col, mt, UNPROVIDED ) );
      if( depth_col.numG( depth_min_col ) )
      {
        depth_min_col = depth_col;
        min_col = col;
      }
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    return min_col;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39217L)
  public static SubLObject max_cols(final SubLObject cols, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( cols, $sym54$LISTP );
    return sbhl_search_methods.sbhl_max_nodes( sbhl_module_vars.get_sbhl_module( $const0$genls ), cols, mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39532L)
  public static SubLObject nearest_common_genls(final SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return min_ceiling_cols( cols, candidates, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39682L)
  public static SubLObject min_ceiling_cols(final SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( cols, $sym54$LISTP );
    return sbhl_search_methods.sbhl_min_ceilings( sbhl_module_vars.get_sbhl_module( $const0$genls ), cols, candidates, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40049L)
  public static SubLObject nearest_common_specs(final SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return max_floor_cols( cols, candidates, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40190L)
  public static SubLObject max_floor_cols(final SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( cols, $sym54$LISTP );
    return sbhl_search_methods.sbhl_max_floors( sbhl_module_vars.get_sbhl_module( $const0$genls ), cols, candidates, mt, tv, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40552L)
  public static SubLObject floor_of_col_pairP(final SubLObject col_1, final SubLObject col_2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return list_utilities.sublisp_boolean( any_floor_of_col_pair( col_1, col_2, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40732L)
  public static SubLObject any_floor_of_col_pair(final SubLObject col_1, final SubLObject col_2, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_first_floor_of_node_pair( sbhl_module_vars.get_sbhl_module( $const0$genls ), col_1, col_2, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40945L)
  public static SubLObject all_common_specs(final SubLObject cols, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return union_all_specs( nearest_common_specs( cols, NIL, mt, tv ), mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41072L)
  public static SubLObject any_genl_isa(final SubLObject col, final SubLObject v_isa, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( col, $sym5$EL_FORT_P );
    enforceType( v_isa, $sym5$EL_FORT_P );
    return isa.any_all_forward_true_nodes_isa( $const0$genls, col, v_isa, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41389L)
  public static SubLObject lighter_col(final SubLObject col_a, final SubLObject col_b)
  {
    enforceType( col_a, $sym5$EL_FORT_P );
    enforceType( col_b, $sym5$EL_FORT_P );
    if( NIL != term.ground_nautP( col_a, UNPROVIDED ) )
    {
      return lighter_col( narts_high.find_nart( col_a ), col_b );
    }
    if( NIL != term.ground_nautP( col_b, UNPROVIDED ) )
    {
      return lighter_col( col_a, narts_high.find_nart( col_b ) );
    }
    if( NIL == forts.fort_p( col_a ) )
    {
      return NIL;
    }
    if( NIL == forts.fort_p( col_b ) )
    {
      return NIL;
    }
    return cardinality_estimates.lightest_node( col_a, col_b );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41890L)
  public static SubLObject lightest_col(final SubLObject col_a, final SubLObject col_b)
  {
    return cardinality_estimates.lightest_node( col_a, col_b );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42040L)
  public static SubLObject lightest_of_cols(final SubLObject cols)
  {
    enforceType( cols, $sym54$LISTP );
    if( NIL == cols )
    {
      return NIL;
    }
    SubLObject lightest = cols.first();
    SubLObject cdolist_list_var = cols.rest();
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      lightest = lightest_col( lightest, col );
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    return lightest;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42391L)
  public static SubLObject shallower_col(final SubLObject col_a, final SubLObject col_b)
  {
    enforceType( col_a, $sym5$EL_FORT_P );
    enforceType( col_b, $sym5$EL_FORT_P );
    if( NIL != term.ground_nautP( col_a, UNPROVIDED ) )
    {
      return shallower_col( narts_high.find_nart( col_a ), col_b );
    }
    if( NIL != term.ground_nautP( col_b, UNPROVIDED ) )
    {
      return shallower_col( col_a, narts_high.find_nart( col_b ) );
    }
    if( NIL == forts.fort_p( col_a ) )
    {
      return NIL;
    }
    if( NIL == forts.fort_p( col_b ) )
    {
      return NIL;
    }
    return cardinality_estimates.shallowest_node( col_a, col_b );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42899L)
  public static SubLObject shallowest_col(final SubLObject col_a, final SubLObject col_b)
  {
    return cardinality_estimates.shallowest_node( col_a, col_b );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43105L)
  public static SubLObject max_floor_mts_of_genls_paths_wrt(final SubLObject spec, final SubLObject genl, final SubLObject mt)
  {
    return genl_mts.selected_genl_mts( mt, max_floor_mts_of_genls_paths( spec, genl, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43485L)
  public static SubLObject max_floor_mts_of_genls_paths(final SubLObject spec, final SubLObject genl, SubLObject tv)
  {
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    enforceType( spec, $sym5$EL_FORT_P );
    enforceType( genl, $sym5$EL_FORT_P );
    if( NIL != term.first_order_nautP( spec ) )
    {
      return max_floor_mts_of_nat_genls_paths( spec, genl, tv );
    }
    return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths( sbhl_module_vars.get_sbhl_module( $const0$genls ), spec, genl, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43875L)
  public static SubLObject max_floor_mts_of_nat_genls_paths(final SubLObject spec, final SubLObject genl, SubLObject tv)
  {
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject hl_spec = narts_high.find_nart( spec );
    if( NIL != hl_spec )
    {
      return max_floor_mts_of_genls_paths( hl_spec, genl, tv );
    }
    final SubLObject functor = cycl_utilities.nat_functor( spec );
    SubLObject result = NIL;
    SubLObject mts = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym20$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const21$EverythingPSC, thread );
      SubLObject cdolist_list_var = kb_accessors.result_genl( functor, UNPROVIDED, UNPROVIDED );
      SubLObject link_node = NIL;
      link_node = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$120;
        mts = ( cdolist_list_var_$120 = max_floor_mts_of_genls_paths( link_node, genl, UNPROVIDED ) );
        SubLObject mt = NIL;
        mt = cdolist_list_var_$120.first();
        while ( NIL != cdolist_list_var_$120)
        {
          if( NIL != subl_promotions.memberP( link_node, kb_accessors.result_genl( functor, mt, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
          {
            result = ConsesLow.cons( mt, result );
          }
          cdolist_list_var_$120 = cdolist_list_var_$120.rest();
          mt = cdolist_list_var_$120.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        link_node = cdolist_list_var.first();
      }
      cdolist_list_var = kb_accessors.result_genl_args( spec, UNPROVIDED );
      link_node = NIL;
      link_node = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$121;
        mts = ( cdolist_list_var_$121 = max_floor_mts_of_genls_paths( link_node, genl, UNPROVIDED ) );
        SubLObject mt = NIL;
        mt = cdolist_list_var_$121.first();
        while ( NIL != cdolist_list_var_$121)
        {
          if( NIL != subl_promotions.memberP( link_node, kb_accessors.result_genl_args( spec, mt ), UNPROVIDED, UNPROVIDED ) )
          {
            result = ConsesLow.cons( mt, result );
          }
          cdolist_list_var_$121 = cdolist_list_var_$121.rest();
          mt = cdolist_list_var_$121.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        link_node = cdolist_list_var.first();
      }
      cdolist_list_var = kb_accessors.result_inter_arg_genl( spec, UNPROVIDED );
      link_node = NIL;
      link_node = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$122;
        mts = ( cdolist_list_var_$122 = max_floor_mts_of_genls_paths( link_node, genl, UNPROVIDED ) );
        SubLObject mt = NIL;
        mt = cdolist_list_var_$122.first();
        while ( NIL != cdolist_list_var_$122)
        {
          if( NIL != subl_promotions.memberP( link_node, kb_accessors.result_inter_arg_genl( spec, mt ), UNPROVIDED, UNPROVIDED ) )
          {
            result = ConsesLow.cons( mt, result );
          }
          cdolist_list_var_$122 = cdolist_list_var_$122.rest();
          mt = cdolist_list_var_$122.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        link_node = cdolist_list_var.first();
      }
      cdolist_list_var = kb_accessors.result_genl_via_arg_arg_genl( spec, UNPROVIDED );
      link_node = NIL;
      link_node = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$123;
        mts = ( cdolist_list_var_$123 = max_floor_mts_of_genls_paths( link_node, genl, UNPROVIDED ) );
        SubLObject mt = NIL;
        mt = cdolist_list_var_$123.first();
        while ( NIL != cdolist_list_var_$123)
        {
          if( NIL != subl_promotions.memberP( link_node, kb_accessors.result_genl_via_arg_arg_genl( spec, mt ), UNPROVIDED, UNPROVIDED ) )
          {
            result = ConsesLow.cons( mt, result );
          }
          cdolist_list_var_$123 = cdolist_list_var_$123.rest();
          mt = cdolist_list_var_$123.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        link_node = cdolist_list_var.first();
      }
      if( NIL != control_vars.$pgia_activeP$.getDynamicValue( thread ) && NIL != term.first_order_nautP( genl ) && cycl_utilities.nat_functor( spec ).eql( cycl_utilities.nat_functor( genl ) ) )
      {
        cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const95$preservesGenlsInArg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$124;
          mts = ( cdolist_list_var_$124 = max_floor_mts_of_genls_paths( cycl_utilities.nat_arg( spec, arg, UNPROVIDED ), cycl_utilities.nat_arg( genl, arg, UNPROVIDED ), UNPROVIDED ) );
          SubLObject mt = NIL;
          mt = cdolist_list_var_$124.first();
          while ( NIL != cdolist_list_var_$124)
          {
            if( NIL != subl_promotions.memberP( arg, kb_mapping_utilities.pred_values_in_relevant_mts( functor, $const95$preservesGenlsInArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
            {
              result = ConsesLow.cons( mt, result );
            }
            cdolist_list_var_$124 = cdolist_list_var_$124.rest();
            mt = cdolist_list_var_$124.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return Sequences.remove_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45472L)
  public static SubLObject min_mts_of_genls_paths(final SubLObject spec, final SubLObject genl, SubLObject tv)
  {
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths( sbhl_module_vars.get_sbhl_module( $const0$genls ), spec, genl, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45717L)
  public static SubLObject max_floor_mts_of_not_genls_paths(final SubLObject spec, final SubLObject not_genl, SubLObject tv)
  {
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths( sbhl_module_vars.get_sbhl_module( $const0$genls ), not_genl, spec, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46043L)
  public static SubLObject min_mts_of_not_genls_paths(final SubLObject spec, final SubLObject not_genl, SubLObject tv)
  {
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths( sbhl_module_vars.get_sbhl_module( $const0$genls ), not_genl, spec, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46359L)
  public static SubLObject genls_mts(final SubLObject col)
  {
    return kb_accessors.pred_mts( col, $const0$genls, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46620L)
  public static SubLObject asserted_genlsP(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_any_asserted_true_links( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46823L)
  public static SubLObject asserted_genls(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_true_links( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47013L)
  public static SubLObject asserted_not_genls(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_false_links( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47209L)
  public static SubLObject supported_genls(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_supported_true_links( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47402L)
  public static SubLObject supported_not_genls(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_supported_false_links( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47601L)
  public static SubLObject asserted_specs(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_true_inverse_links( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47801L)
  public static SubLObject asserted_not_specs(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_false_inverse_links( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48005L)
  public static SubLObject supported_specs(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_supported_true_inverse_links( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48206L)
  public static SubLObject supported_not_specs(final SubLObject col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_supported_false_inverse_links( sbhl_module_vars.get_sbhl_module( $const0$genls ), col, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48413L)
  public static SubLObject asserted_coextensionalP(final SubLObject col1, final SubLObject col2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return makeBoolean( NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts( $const183$coExtensional, col1, col2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != kb_mapping_utilities
        .pred_u_v_holds_in_relevant_mts( $const183$coExtensional, col2, col1, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48699L)
  public static SubLObject genls_after_adding(SubLObject source, final SubLObject assertion)
  {
    sbhl_link_methods.sbhl_after_adding( source, assertion, sbhl_module_vars.get_sbhl_module( $const0$genls ) );
    sbhl_cache.sbhl_cache_addition_maintainence( assertion );
    misc_kb_utilities.possibly_clear_genl_pos( assertion );
    final SubLObject spec = assertions_high.gaf_arg1( assertion );
    final SubLObject genl = assertions_high.gaf_arg2( assertion );
    if( NIL != assertions_high.assertion_has_truth( assertion, $kw136$TRUE ) )
    {
      at_defns.handle_added_genl_for_suf_defns( spec, genl );
      at_defns.handle_added_genl_for_suf_quoted_defns( spec, genl );
      at_defns.handle_added_genl_for_suf_functions( spec, genl );
      cardinality_estimates.update_cardinality_estimates_wrt_genls( spec, genl );
    }
    handle_more_specific_genl( spec, genl );
    collection_intersection.genls_collection_intersection_after_adding_int( assertion );
    after_adding_modules.clear_genls_dependent_caches( source, assertion );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49727L)
  public static SubLObject handle_more_specific_genl(final SubLObject spec, final SubLObject genl)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50265L)
  public static SubLObject more_general_genls_assertions(final SubLObject spec, final SubLObject genl)
  {
    final SubLObject genls_set = set_utilities.make_set_from_list( all_proper_genls( genl, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
    final SubLObject asserted_genls = kb_mapping.gather_gaf_arg_index( spec, ONE_INTEGER, $const0$genls, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = asserted_genls;
    SubLObject ass = NIL;
    ass = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != set.set_memberP( assertions_high.gaf_arg2( ass ), genls_set ) )
      {
        result = ConsesLow.cons( ass, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ass = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50660L)
  public static SubLObject genls_after_removing(SubLObject source, final SubLObject assertion)
  {
    misc_kb_utilities.possibly_clear_genl_pos( assertion );
    sbhl_link_methods.sbhl_after_removing( source, assertion, sbhl_module_vars.get_sbhl_module( $const0$genls ) );
    sbhl_cache.sbhl_cache_removal_maintainence( assertion );
    final SubLObject spec = assertions_high.gaf_arg1( assertion );
    final SubLObject genl = assertions_high.gaf_arg2( assertion );
    if( NIL != assertions_high.assertion_has_truth( assertion, $kw136$TRUE ) )
    {
      at_defns.handle_removed_genl_for_suf_defns( spec, genl );
      at_defns.handle_removed_genl_for_suf_quoted_defns( spec, genl );
      at_defns.handle_removed_genl_for_suf_functions( spec, genl );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51347L)
  public static SubLObject clear_genls_graph()
  {
    sbhl_link_methods.clear_sbhl_module_graph( sbhl_module_vars.get_sbhl_module( $const0$genls ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51565L)
  public static SubLObject clear_node_genls_links(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genls ), thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const0$genls ) ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const0$genls ) ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const0$genls ), thread );
      SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts( sbhl_module_vars.get_sbhl_module( $const0$genls ), node );
      SubLObject mt = NIL;
      mt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != fort_types_interface.collectionP( node ) )
        {
          sbhl_link_methods.clear_sbhl_links_within_mt( node, mt, UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        mt = cdolist_list_var.first();
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51815L)
  public static SubLObject reset_genls_links(final SubLObject col)
  {
    final SubLObject mts = genls_mts( col );
    clear_node_genls_links( col );
    SubLObject cdolist_list_var = mts;
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != fort_types_interface.collectionP( col ) )
      {
        reset_genls_links_in_mt( col, mt );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52025L)
  public static SubLObject reset_genls_links_in_mt(final SubLObject col, final SubLObject mt)
  {
    sbhl_link_methods.sbhl_recompute_links( col, mt, sbhl_module_vars.get_sbhl_module( $const0$genls ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52145L)
  public static SubLObject reset_genls_graph(SubLObject clearP)
  {
    if( clearP == UNPROVIDED )
    {
      clearP = T;
    }
    if( NIL != clearP )
    {
      clear_genls_graph();
    }
    sbhl_link_methods.sbhl_recompute_graph_links( sbhl_module_vars.get_sbhl_module( $const0$genls ) );
    return NIL;
  }

  public static SubLObject declare_genls_file()
  {
    SubLFiles.declareFunction( me, "genls", "GENLS", 1, 2, false );
    SubLFiles.declareFunction( me, "min_genls", "MIN-GENLS", 1, 2, false );
    SubLFiles.declareFunction( me, "nat_genls", "NAT-GENLS", 1, 2, false );
    SubLFiles.declareFunction( me, "nat_min_genls", "NAT-MIN-GENLS", 1, 2, false );
    SubLFiles.declareFunction( me, "min_genls_of_type", "MIN-GENLS-OF-TYPE", 2, 2, false );
    SubLFiles.declareFunction( me, "min_proper_genls_of_type", "MIN-PROPER-GENLS-OF-TYPE", 2, 2, false );
    SubLFiles.declareFunction( me, "naut_genls", "NAUT-GENLS", 1, 1, false );
    SubLFiles.declareFunction( me, "not_genls", "NOT-GENLS", 1, 2, false );
    SubLFiles.declareFunction( me, "max_not_genls", "MAX-NOT-GENLS", 1, 2, false );
    SubLFiles.declareFunction( me, "nat_not_genls", "NAT-NOT-GENLS", 1, 2, false );
    SubLFiles.declareFunction( me, "nat_max_not_genls", "NAT-MAX-NOT-GENLS", 1, 2, false );
    SubLFiles.declareFunction( me, "naut_not_genls", "NAUT-NOT-GENLS", 1, 1, false );
    SubLFiles.declareFunction( me, "specs", "SPECS", 1, 2, false );
    SubLFiles.declareFunction( me, "leaf_colP", "LEAF-COL?", 1, 2, false );
    SubLFiles.declareFunction( me, "max_specs", "MAX-SPECS", 1, 2, false );
    SubLFiles.declareFunction( me, "not_specs", "NOT-SPECS", 1, 2, false );
    SubLFiles.declareFunction( me, "min_not_specs", "MIN-NOT-SPECS", 1, 2, false );
    SubLFiles.declareFunction( me, "genl_siblings", "GENL-SIBLINGS", 1, 2, false );
    SubLFiles.declareFunction( me, "spec_siblings", "SPEC-SIBLINGS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_genls", "ALL-GENLS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_genls_in_any_mt", "ALL-GENLS-IN-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "all_genls_in_mt", "ALL-GENLS-IN-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "all_genls_in_mts", "ALL-GENLS-IN-MTS", 1, 1, false );
    SubLFiles.declareFunction( me, "nat_all_genls", "NAT-ALL-GENLS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_proper_genls", "ALL-PROPER-GENLS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_specs", "ALL-SPECS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_proper_specs", "ALL-PROPER-SPECS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_proper_specs_in_any_mt", "ALL-PROPER-SPECS-IN-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "all_leaf_specs_in_all_mts", "ALL-LEAF-SPECS-IN-ALL-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "all_specs_with_max", "ALL-SPECS-WITH-MAX", 2, 0, false );
    SubLFiles.declareFunction( me, "all_specs_in_all_mts", "ALL-SPECS-IN-ALL-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "count_all_specs", "COUNT-ALL-SPECS", 1, 2, false );
    SubLFiles.declareFunction( me, "count_all_specs_if", "COUNT-ALL-SPECS-IF", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_specs_E", "COUNT-ALL-SPECS-=", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_specs_G", "COUNT-ALL-SPECS->", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_specs_GE", "COUNT-ALL-SPECS->=", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_specs_L", "COUNT-ALL-SPECS-<", 2, 2, false );
    SubLFiles.declareFunction( me, "count_all_specs_LE", "COUNT-ALL-SPECS-<=", 2, 2, false );
    SubLFiles.declareFunction( me, "all_genls_wrt", "ALL-GENLS-WRT", 2, 2, false );
    SubLFiles.declareFunction( me, "union_all_genls", "UNION-ALL-GENLS", 1, 2, false );
    SubLFiles.declareFunction( me, "union_min_genls_of_type", "UNION-MIN-GENLS-OF-TYPE", 2, 2, false );
    SubLFiles.declareFunction( me, "union_all_genls_among", "UNION-ALL-GENLS-AMONG", 2, 2, false );
    SubLFiles.declareFunction( me, "all_genl_of_someP", "ALL-GENL-OF-SOME?", 2, 2, false );
    SubLFiles.declareFunction( me, "union_all_specs", "UNION-ALL-SPECS", 1, 2, false );
    SubLFiles.declareFunction( me, "union_all_specs_count", "UNION-ALL-SPECS-COUNT", 1, 2, false );
    SubLFiles.declareFunction( me, "max_cols_beneath", "MAX-COLS-BENEATH", 2, 1, false );
    SubLFiles.declareFunction( me, "all_dependent_specs", "ALL-DEPENDENT-SPECS", 1, 2, false );
    SubLFiles.declareFunction( me, "min_genls_among", "MIN-GENLS-AMONG", 2, 2, false );
    SubLFiles.declareFunction( me, "all_genls_among", "ALL-GENLS-AMONG", 2, 2, false );
    SubLFiles.declareFunction( me, "all_specs_among", "ALL-SPECS-AMONG", 2, 2, false );
    SubLFiles.declareFunction( me, "max_specs_among", "MAX-SPECS-AMONG", 2, 2, false );
    SubLFiles.declareFunction( me, "all_genls_if", "ALL-GENLS-IF", 2, 2, false );
    SubLFiles.declareFunction( me, "all_specs_if", "ALL-SPECS-IF", 2, 2, false );
    SubLFiles.declareFunction( me, "all_genls_if_with_pruning", "ALL-GENLS-IF-WITH-PRUNING", 2, 2, false );
    SubLFiles.declareFunction( me, "all_not_genls", "ALL-NOT-GENLS", 1, 2, false );
    SubLFiles.declareFunction( me, "all_not_specs", "ALL-NOT-SPECS", 1, 2, false );
    SubLFiles.declareFunction( me, "cols_awning", "COLS-AWNING", 2, 2, false );
    SubLFiles.declareFunction( me, "map_all_genls", "MAP-ALL-GENLS", 2, 2, false );
    SubLFiles.declareFunction( me, "map_all_specs", "MAP-ALL-SPECS", 2, 2, false );
    SubLFiles.declareFunction( me, "map_union_all_genls", "MAP-UNION-ALL-GENLS", 2, 2, false );
    SubLFiles.declareFunction( me, "map_all_genls_if", "MAP-ALL-GENLS-IF", 3, 2, false );
    SubLFiles.declareFunction( me, "gather_all_genls", "GATHER-ALL-GENLS", 2, 3, false );
    SubLFiles.declareFunction( me, "gather_all_specs", "GATHER-ALL-SPECS", 2, 3, false );
    SubLFiles.declareFunction( me, "any_all_genls", "ANY-ALL-GENLS", 2, 2, false );
    SubLFiles.declareFunction( me, "any_all_specs", "ANY-ALL-SPECS", 2, 2, false );
    SubLFiles.declareFunction( me, "sample_leaf_specs", "SAMPLE-LEAF-SPECS", 1, 3, false );
    SubLFiles.declareFunction( me, "sample_different_leaf_specs", "SAMPLE-DIFFERENT-LEAF-SPECS", 2, 3, false );
    SubLFiles.declareFunction( me, "genlP", "GENL?", 2, 2, false );
    SubLFiles.declareFunction( me, "genlsP", "GENLS?", 2, 2, false );
    SubLFiles.declareFunction( me, "genl_in_mtsP", "GENL-IN-MTS?", 2, 1, false );
    SubLFiles.declareFunction( me, "genl_in_any_mtP", "GENL-IN-ANY-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "specP", "SPEC?", 2, 2, false );
    SubLFiles.declareFunction( me, "nat_genlP", "NAT-GENL?", 2, 1, false );
    SubLFiles.declareFunction( me, "naut_genlP", "NAUT-GENL?", 2, 1, false );
    SubLFiles.declareFunction( me, "result_genl_colP", "RESULT-GENL-COL?", 2, 1, false );
    SubLFiles.declareFunction( me, "result_genl_arg_colP", "RESULT-GENL-ARG-COL?", 2, 1, false );
    SubLFiles.declareFunction( me, "result_genl_inter_arg_colP", "RESULT-GENL-INTER-ARG-COL?", 2, 1, false );
    SubLFiles.declareFunction( me, "result_genl_via_pgiaP", "RESULT-GENL-VIA-PGIA?", 2, 1, false );
    SubLFiles.declareFunction( me, "genl_ofP", "GENL-OF?", 2, 2, false );
    SubLFiles.declareFunction( me, "any_genlP", "ANY-GENL?", 2, 2, false );
    SubLFiles.declareFunction( me, "any_specP", "ANY-SPEC?", 2, 2, false );
    SubLFiles.declareFunction( me, "all_genlP", "ALL-GENL?", 2, 2, false );
    SubLFiles.declareFunction( me, "all_specP", "ALL-SPEC?", 2, 2, false );
    SubLFiles.declareFunction( me, "any_genl_anyP", "ANY-GENL-ANY?", 2, 2, false );
    SubLFiles.declareFunction( me, "any_genl_allP", "ANY-GENL-ALL?", 2, 2, false );
    SubLFiles.declareFunction( me, "all_spec_anyP", "ALL-SPEC-ANY?", 2, 2, false );
    SubLFiles.declareFunction( me, "not_genlsP", "NOT-GENLS?", 2, 2, false );
    SubLFiles.declareFunction( me, "not_genlP", "NOT-GENL?", 2, 2, false );
    SubLFiles.declareFunction( me, "argue_not_genlP", "ARGUE-NOT-GENL?", 2, 2, false );
    SubLFiles.declareFunction( me, "all_not_specP", "ALL-NOT-SPEC?", 2, 2, false );
    SubLFiles.declareFunction( me, "any_not_genlP", "ANY-NOT-GENL?", 2, 2, false );
    SubLFiles.declareFunction( me, "random_genl_of", "RANDOM-GENL-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "random_spec_of", "RANDOM-SPEC-OF", 1, 1, false );
    SubLFiles.declareFunction( me, "collections_coextensionalP", "COLLECTIONS-COEXTENSIONAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "tacit_coextensionalP", "TACIT-COEXTENSIONAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "common_instanceP", "COMMON-INSTANCE?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_common_instanceP", "WHY-COMMON-INSTANCE?", 2, 3, false );
    SubLFiles.declareFunction( me, "collections_intersectP", "COLLECTIONS-INTERSECT?", 2, 1, false );
    SubLFiles.declareFunction( me, "hierarchical_collectionsP", "HIERARCHICAL-COLLECTIONS?", 2, 1, false );
    SubLFiles.declareFunction( me, "genl_of_any_argP", "GENL-OF-ANY-ARG?", 3, 4, false );
    SubLFiles.declareFunction( me, "genl_of_any_argP_int", "GENL-OF-ANY-ARG?-INT", 7, 0, false );
    SubLFiles.declareFunction( me, "why_genlP", "WHY-GENL?", 2, 3, false );
    SubLFiles.declareFunction( me, "any_just_of_nat_genl", "ANY-JUST-OF-NAT-GENL", 2, 1, false );
    SubLFiles.declareFunction( me, "why_not_genlP", "WHY-NOT-GENL?", 2, 3, false );
    SubLFiles.declareFunction( me, "why_not_assert_genlsP", "WHY-NOT-ASSERT-GENLS?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_collections_intersectP", "WHY-COLLECTIONS-INTERSECT?", 2, 3, false );
    SubLFiles.declareFunction( me, "why_not_assert_mdwP", "WHY-NOT-ASSERT-MDW?", 2, 1, false );
    SubLFiles.declareFunction( me, "collection_leaves", "COLLECTION-LEAVES", 1, 2, false );
    SubLFiles.declareFunction( me, "min_cols", "MIN-COLS", 1, 2, false );
    SubLFiles.declareFunction( me, "min_col", "MIN-COL", 1, 2, false );
    SubLFiles.declareFunction( me, "max_cols", "MAX-COLS", 1, 2, false );
    SubLFiles.declareFunction( me, "nearest_common_genls", "NEAREST-COMMON-GENLS", 1, 3, false );
    SubLFiles.declareFunction( me, "min_ceiling_cols", "MIN-CEILING-COLS", 1, 3, false );
    SubLFiles.declareFunction( me, "nearest_common_specs", "NEAREST-COMMON-SPECS", 1, 3, false );
    SubLFiles.declareFunction( me, "max_floor_cols", "MAX-FLOOR-COLS", 1, 3, false );
    SubLFiles.declareFunction( me, "floor_of_col_pairP", "FLOOR-OF-COL-PAIR?", 2, 1, false );
    SubLFiles.declareFunction( me, "any_floor_of_col_pair", "ANY-FLOOR-OF-COL-PAIR", 2, 2, false );
    SubLFiles.declareFunction( me, "all_common_specs", "ALL-COMMON-SPECS", 1, 2, false );
    SubLFiles.declareFunction( me, "any_genl_isa", "ANY-GENL-ISA", 2, 2, false );
    SubLFiles.declareFunction( me, "lighter_col", "LIGHTER-COL", 2, 0, false );
    SubLFiles.declareFunction( me, "lightest_col", "LIGHTEST-COL", 2, 0, false );
    SubLFiles.declareFunction( me, "lightest_of_cols", "LIGHTEST-OF-COLS", 1, 0, false );
    SubLFiles.declareFunction( me, "shallower_col", "SHALLOWER-COL", 2, 0, false );
    SubLFiles.declareFunction( me, "shallowest_col", "SHALLOWEST-COL", 2, 0, false );
    SubLFiles.declareFunction( me, "max_floor_mts_of_genls_paths_wrt", "MAX-FLOOR-MTS-OF-GENLS-PATHS-WRT", 3, 0, false );
    SubLFiles.declareFunction( me, "max_floor_mts_of_genls_paths", "MAX-FLOOR-MTS-OF-GENLS-PATHS", 2, 1, false );
    SubLFiles.declareFunction( me, "max_floor_mts_of_nat_genls_paths", "MAX-FLOOR-MTS-OF-NAT-GENLS-PATHS", 2, 1, false );
    SubLFiles.declareFunction( me, "min_mts_of_genls_paths", "MIN-MTS-OF-GENLS-PATHS", 2, 1, false );
    SubLFiles.declareFunction( me, "max_floor_mts_of_not_genls_paths", "MAX-FLOOR-MTS-OF-NOT-GENLS-PATHS", 2, 1, false );
    SubLFiles.declareFunction( me, "min_mts_of_not_genls_paths", "MIN-MTS-OF-NOT-GENLS-PATHS", 2, 1, false );
    SubLFiles.declareFunction( me, "genls_mts", "GENLS-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "asserted_genlsP", "ASSERTED-GENLS?", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_genls", "ASSERTED-GENLS", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_not_genls", "ASSERTED-NOT-GENLS", 1, 1, false );
    SubLFiles.declareFunction( me, "supported_genls", "SUPPORTED-GENLS", 1, 1, false );
    SubLFiles.declareFunction( me, "supported_not_genls", "SUPPORTED-NOT-GENLS", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_specs", "ASSERTED-SPECS", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_not_specs", "ASSERTED-NOT-SPECS", 1, 1, false );
    SubLFiles.declareFunction( me, "supported_specs", "SUPPORTED-SPECS", 1, 1, false );
    SubLFiles.declareFunction( me, "supported_not_specs", "SUPPORTED-NOT-SPECS", 1, 1, false );
    SubLFiles.declareFunction( me, "asserted_coextensionalP", "ASSERTED-COEXTENSIONAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "genls_after_adding", "GENLS-AFTER-ADDING", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_more_specific_genl", "HANDLE-MORE-SPECIFIC-GENL", 2, 0, false );
    SubLFiles.declareFunction( me, "more_general_genls_assertions", "MORE-GENERAL-GENLS-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "genls_after_removing", "GENLS-AFTER-REMOVING", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_genls_graph", "CLEAR-GENLS-GRAPH", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_node_genls_links", "CLEAR-NODE-GENLS-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_genls_links", "RESET-GENLS-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_genls_links_in_mt", "RESET-GENLS-LINKS-IN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_genls_graph", "RESET-GENLS-GRAPH", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_genls_file()
  {
    $sbhl_infer_intersection_from_instancesP$ = SubLFiles.defvar( "*SBHL-INFER-INTERSECTION-FROM-INSTANCES?*", NIL );
    return NIL;
  }

  public static SubLObject setup_genls_file()
  {
    utilities_macros.register_cyc_api_function( $sym1$MIN_GENLS, $list2, $str3$Returns_the_most_specific_genls_o, NIL, $list4 );
    utilities_macros.register_cyc_api_function( $sym6$MAX_NOT_GENLS, $list2, $str7$Returns_the_least_specific_negate, $list8, $list4 );
    utilities_macros.register_cyc_api_function( $sym10$MAX_SPECS, $list2, $str11$Returns_the_least_specific_specs_, $list8, $list4 );
    utilities_macros.register_cyc_api_function( $sym12$MIN_NOT_SPECS, $list2, $str13$Returns_the_most_specific_negated, $list8, $list4 );
    utilities_macros.register_cyc_api_function( $sym14$GENL_SIBLINGS, $list2, $str15$Returns_the_direct_genls_of_those, $list8, $list4 );
    utilities_macros.register_cyc_api_function( $sym16$SPEC_SIBLINGS, $list2, $str17$Returns_the_direct_specs_of_those, $list8, $list4 );
    utilities_macros.register_cyc_api_function( $sym18$ALL_GENLS, $list2, $str19$Returns_all_genls_of_collection_C, $list8, $list4 );
    utilities_macros.register_cyc_api_function( $sym24$ALL_SPECS, $list2, $str25$Returns_all_specs_of_collection_C, $list8, $list4 );
    access_macros.register_external_symbol( $sym41$ALL_SPECS_WITH_MAX );
    utilities_macros.register_cyc_api_function( $sym45$COUNT_ALL_SPECS, $list46, $str47$Counts_the_number_of_specs_in_COL, $list48, $list49 );
    utilities_macros.register_cyc_api_function( $sym50$ALL_GENLS_WRT, $list51, $str52$Returns_all_genls_of_collection_S, $list53, $list4 );
    utilities_macros.register_cyc_api_function( $sym55$UNION_ALL_GENLS, $list56, $str57$Returns_all_genls_of_each_collect, $list58, $list4 );
    utilities_macros.register_cyc_api_function( $sym59$UNION_ALL_SPECS, $list56, $str60$Returns_all_specs_of_each_collect, $list58, $list4 );
    utilities_macros.register_cyc_api_function( $sym61$ALL_DEPENDENT_SPECS, $list2, $str62$Returns_all_specs_s_of_COL_s_t__e, $list8, $list4 );
    utilities_macros.register_cyc_api_function( $sym63$ALL_GENLS_AMONG, $list64, $str65$Returns_those_genls_of_COL_that_a, $list66, $list4 );
    utilities_macros.register_cyc_api_function( $sym67$ALL_SPECS_AMONG, $list64, $str68$Returns_those_specs_of_COL_that_a, $list66, $list4 );
    utilities_macros.register_cyc_api_function( $sym70$ALL_GENLS_IF, $list71, $str72$Returns_all_genls_of_collection_C, $list73, $list4 );
    utilities_macros.register_cyc_api_function( $sym74$ALL_SPECS_IF, $list71, $str72$Returns_all_genls_of_collection_C, $list73, $list4 );
    utilities_macros.register_cyc_api_function( $sym75$ALL_NOT_GENLS, $list2, $str76$Returns_all_negated_genls_of_coll, $list8, $list4 );
    utilities_macros.register_cyc_api_function( $sym77$ALL_NOT_SPECS, $list2, $str78$Returns_all_negated_specs_of_coll, $list8, $list4 );
    utilities_macros.register_cyc_api_function( $sym79$MAP_ALL_GENLS, $list80, $str81$Applies_FN_to_every__all__genls_o, $list82, NIL );
    utilities_macros.register_cyc_api_function( $sym83$MAP_ALL_SPECS, $list80, $str84$Applies_FN_to_every__all__specs_o, $list82, NIL );
    utilities_macros.register_cyc_api_function( $sym85$ANY_ALL_GENLS, $list80, $str86$Return_a_non_nil_result_of_applyi, $list82, NIL );
    utilities_macros.register_cyc_api_function( $sym87$ANY_ALL_SPECS, $list80, $str88$Return_a_non_nil_result_of_applyi, $list82, NIL );
    utilities_macros.register_cyc_api_function( $sym89$GENL_, $list51, $str90$Returns_whether____genls_SPEC_GEN, $list53, $list91 );
    utilities_macros.register_cyc_api_function( $sym92$SPEC_, $list93, $str90$Returns_whether____genls_SPEC_GEN, $list94, $list91 );
    utilities_macros.register_cyc_api_function( $sym96$ANY_GENL_, $list97, $str98$_any_genl__spec_genls__is_t_iff__, $list99, $list91 );
    utilities_macros.register_cyc_api_function( $sym100$ANY_SPEC_, $list101, $str102$Returns_T_iff__spec__genl_spec__f, $list103, $list91 );
    utilities_macros.register_cyc_api_function( $sym104$ALL_GENL_, $list97, $str105$Returns_T_iff__genl__spec_genl__f, $list99, $list91 );
    utilities_macros.register_cyc_api_function( $sym106$ALL_SPEC_, $list101, $str107$Returns_T_iff__spec__genl_spec__f, $list103, $list91 );
    utilities_macros.register_cyc_api_function( $sym108$ANY_GENL_ANY_, $list109, $str110$Return_T_iff__genl__spec_genl_mt_, $list111, $list91 );
    utilities_macros.register_cyc_api_function( $sym112$ANY_GENL_ALL_, $list109, $str113$Return_T_iff__genl__spec_genl_mt_, $list111, $list91 );
    utilities_macros.register_cyc_api_function( $sym114$ALL_SPEC_ANY_, $list109, $str115$Return_T_iff_for_each_spec_in_SPE, $list111, $list91 );
    utilities_macros.register_cyc_api_function( $sym116$NOT_GENL_, $list117, $str118$Return_whether_collection_NOT_GEN, $list119, $list91 );
    utilities_macros.register_cyc_api_function( $sym120$ALL_NOT_SPEC_, $list121, $str122$Return_whether_every_collection_i, $list123, $list91 );
    utilities_macros.register_cyc_api_function( $sym124$ANY_NOT_GENL_, $list125, $str126$Returns_whether_any_collection_in, $list127, $list91 );
    utilities_macros.register_cyc_api_function( $sym130$COLLECTIONS_COEXTENSIONAL_, $list131, $str132$Are_COL_1_and_COL_2_coextensional, $list133, $list91 );
    utilities_macros.register_cyc_api_function( $sym134$COLLECTIONS_INTERSECT_, $list131, $str135$Do_collections_COL_1_and_COL_2_in, $list133, $list91 );
    utilities_macros.register_cyc_api_function( $sym138$WHY_GENL_, $list139, $str140$Justification_of__genls_SPEC_GENL, $list53, $list141 );
    utilities_macros.register_cyc_api_function( $sym148$WHY_NOT_GENL_, $list139, $str149$Justification_of__not__genls_SPEC, $list53, $list141 );
    utilities_macros.register_cyc_api_function( $sym150$WHY_NOT_ASSERT_GENLS_, $list151, $str152$Justification_of_why_asserting__g, $list53, $list141 );
    utilities_macros.register_cyc_api_function( $sym153$COLLECTION_LEAVES, $list2, $str154$Returns_the_minimally_general__th, $list8, $list4 );
    utilities_macros.register_cyc_api_function( $sym155$MIN_COLS, $list56, $str156$Returns_the_minimally_general__th, $list58, $list4 );
    utilities_macros.register_cyc_api_function( $sym157$MIN_COL, $list56, $str158$Returns_the_single_minimally_gene, $list58, $list159 );
    utilities_macros.register_cyc_api_function( $sym160$MAX_COLS, $list56, $str161$Returns_the_most_general_among_re, $list58, $list4 );
    utilities_macros.register_cyc_api_function( $sym162$MIN_CEILING_COLS, $list163, $str164$Returns_the_most_specific_common_, $list58, $list4 );
    utilities_macros.register_cyc_api_function( $sym165$MAX_FLOOR_COLS, $list163, $str166$Returns_the_most_general_common_s, $list58, $list4 );
    utilities_macros.register_cyc_api_function( $sym167$ANY_GENL_ISA, $list168, $str169$Return_some_genl_of_COL_that_isa_, $list170, $list159 );
    utilities_macros.register_cyc_api_function( $sym171$LIGHTER_COL, $list172, $str173$Return_COL_B_iff_it_has_fewer_spe, $list174, $list159 );
    utilities_macros.register_cyc_api_function( $sym175$LIGHTEST_OF_COLS, $list176, $str177$Return_the_collection_having_the_, $list58, $list159 );
    utilities_macros.register_cyc_api_function( $sym178$SHALLOWER_COL, $list172, $str179$Return_COL_B_iff_it_has_fewer_gen, $list174, $list159 );
    utilities_macros.register_cyc_api_function( $sym180$MAX_FLOOR_MTS_OF_GENLS_PATHS, $list181, $str182$_return_listp__Returns_in_what__m, $list53, NIL );
    utilities_macros.register_kb_function( $sym184$GENLS_AFTER_ADDING );
    utilities_macros.register_kb_function( $sym185$GENLS_AFTER_REMOVING );
    generic_testing.define_test_case_table_int( $sym55$UNION_ALL_GENLS, ConsesLow.list( new SubLObject[] { $kw186$TEST, NIL, $kw187$OWNER, NIL, $kw188$CLASSES, NIL, $kw189$KB, $kw190$TINY, $kw191$WORKING_, T
    } ), $list192 );
    generic_testing.define_test_case_table_int( $sym59$UNION_ALL_SPECS, ConsesLow.list( new SubLObject[] { $kw186$TEST, NIL, $kw187$OWNER, NIL, $kw188$CLASSES, NIL, $kw189$KB, $kw193$FULL, $kw191$WORKING_, T
    } ), $list194 );
    generic_testing.define_test_case_table_int( $sym195$MAX_COLS_BENEATH, ConsesLow.list( new SubLObject[] { $kw186$TEST, NIL, $kw187$OWNER, NIL, $kw188$CLASSES, NIL, $kw189$KB, $kw193$FULL, $kw191$WORKING_, T
    } ), $list196 );
    generic_testing.define_test_case_table_int( $sym63$ALL_GENLS_AMONG, ConsesLow.list( new SubLObject[] { $kw186$TEST, NIL, $kw187$OWNER, NIL, $kw188$CLASSES, NIL, $kw189$KB, $kw193$FULL, $kw191$WORKING_, T
    } ), $list197 );
    generic_testing.define_test_case_table_int( $sym67$ALL_SPECS_AMONG, ConsesLow.list( new SubLObject[] { $kw186$TEST, NIL, $kw187$OWNER, NIL, $kw188$CLASSES, NIL, $kw189$KB, $kw193$FULL, $kw191$WORKING_, T
    } ), $list198 );
    generic_testing.define_test_case_table_int( $sym96$ANY_GENL_, ConsesLow.list( new SubLObject[] { $kw186$TEST, NIL, $kw187$OWNER, NIL, $kw188$CLASSES, NIL, $kw189$KB, $kw193$FULL, $kw191$WORKING_, T
    } ), $list199 );
    generic_testing.define_test_case_table_int( $sym100$ANY_SPEC_, ConsesLow.list( new SubLObject[] { $kw186$TEST, NIL, $kw187$OWNER, NIL, $kw188$CLASSES, NIL, $kw189$KB, $kw193$FULL, $kw191$WORKING_, T
    } ), $list200 );
    generic_testing.define_test_case_table_int( $sym104$ALL_GENL_, ConsesLow.list( new SubLObject[] { $kw186$TEST, NIL, $kw187$OWNER, NIL, $kw188$CLASSES, NIL, $kw189$KB, $kw193$FULL, $kw191$WORKING_, T
    } ), $list201 );
    generic_testing.define_test_case_table_int( $sym108$ANY_GENL_ANY_, ConsesLow.list( new SubLObject[] { $kw186$TEST, NIL, $kw187$OWNER, NIL, $kw188$CLASSES, NIL, $kw189$KB, $kw193$FULL, $kw191$WORKING_, T
    } ), $list202 );
    generic_testing.define_test_case_table_int( $sym112$ANY_GENL_ALL_, ConsesLow.list( new SubLObject[] { $kw186$TEST, NIL, $kw187$OWNER, NIL, $kw188$CLASSES, NIL, $kw189$KB, $kw190$TINY, $kw191$WORKING_, T
    } ), $list203 );
    generic_testing.define_test_case_table_int( $sym120$ALL_NOT_SPEC_, ConsesLow.list( new SubLObject[] { $kw186$TEST, NIL, $kw187$OWNER, NIL, $kw188$CLASSES, NIL, $kw189$KB, $kw193$FULL, $kw191$WORKING_, T
    } ), $list204 );
    generic_testing.define_test_case_table_int( $sym106$ALL_SPEC_, ConsesLow.list( new SubLObject[] { $kw186$TEST, NIL, $kw187$OWNER, NIL, $kw188$CLASSES, NIL, $kw189$KB, $kw193$FULL, $kw191$WORKING_, T
    } ), $list205 );
    generic_testing.define_test_case_table_int( $sym124$ANY_NOT_GENL_, ConsesLow.list( new SubLObject[] { $kw186$TEST, NIL, $kw187$OWNER, NIL, $kw188$CLASSES, NIL, $kw189$KB, $kw193$FULL, $kw191$WORKING_, T
    } ), $list206 );
    generic_testing.define_test_case_table_int( $sym207$ALL_GENL_OF_SOME_, ConsesLow.list( new SubLObject[] { $kw186$TEST, NIL, $kw187$OWNER, NIL, $kw188$CLASSES, NIL, $kw189$KB, $kw190$TINY, $kw191$WORKING_, T
    } ), $list208 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_genls_file();
  }

  @Override
  public void initializeVariables()
  {
    init_genls_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_genls_file();
  }
  static
  {
    me = new genls();
    $sbhl_infer_intersection_from_instancesP$ = null;
    $const0$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym1$MIN_GENLS = makeSymbol( "MIN-GENLS" );
    $list2 = ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str3$Returns_the_most_specific_genls_o = makeString( "Returns the most-specific genls of collection COL" );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "FORT-P" ) ) );
    $sym5$EL_FORT_P = makeSymbol( "EL-FORT-P" );
    $sym6$MAX_NOT_GENLS = makeSymbol( "MAX-NOT-GENLS" );
    $str7$Returns_the_least_specific_negate = makeString( "Returns the least-specific negated genls of collection COL" );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "EL-FORT-P" ) ) );
    $kw9$FALSE = makeKeyword( "FALSE" );
    $sym10$MAX_SPECS = makeSymbol( "MAX-SPECS" );
    $str11$Returns_the_least_specific_specs_ = makeString( "Returns the least-specific specs of collection COL" );
    $sym12$MIN_NOT_SPECS = makeSymbol( "MIN-NOT-SPECS" );
    $str13$Returns_the_most_specific_negated = makeString( "Returns the most-specific negated specs of collection COL" );
    $sym14$GENL_SIBLINGS = makeSymbol( "GENL-SIBLINGS" );
    $str15$Returns_the_direct_genls_of_those = makeString( "Returns the direct genls of those direct spec collections of COL" );
    $sym16$SPEC_SIBLINGS = makeSymbol( "SPEC-SIBLINGS" );
    $str17$Returns_the_direct_specs_of_those = makeString( "Returns the direct specs of those direct genls collections of COL" );
    $sym18$ALL_GENLS = makeSymbol( "ALL-GENLS" );
    $str19$Returns_all_genls_of_collection_C = makeString( "Returns all genls of collection COL\n   (ascending transitive closure; inexpensive)" );
    $sym20$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const21$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym22$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $sym23$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol( "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER" );
    $sym24$ALL_SPECS = makeSymbol( "ALL-SPECS" );
    $str25$Returns_all_specs_of_collection_C = makeString( "Returns all specs of collection COL \n   (descending transitive closure; expensive)" );
    $kw26$DESCENDING = makeKeyword( "DESCENDING" );
    $kw27$BREADTH = makeKeyword( "BREADTH" );
    $kw28$QUEUE = makeKeyword( "QUEUE" );
    $kw29$STACK = makeKeyword( "STACK" );
    $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw31$ERROR = makeKeyword( "ERROR" );
    $str32$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym33$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw34$CERROR = makeKeyword( "CERROR" );
    $str35$continue_anyway = makeString( "continue anyway" );
    $kw36$WARN = makeKeyword( "WARN" );
    $str37$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str38$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str39$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str40$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $sym41$ALL_SPECS_WITH_MAX = makeSymbol( "ALL-SPECS-WITH-MAX" );
    $sym42$INTEGERP = makeSymbol( "INTEGERP" );
    $kw43$INVALID_ITERATION_TERM = makeKeyword( "INVALID-ITERATION-TERM" );
    $sym44$_EXIT = makeSymbol( "%EXIT" );
    $sym45$COUNT_ALL_SPECS = makeSymbol( "COUNT-ALL-SPECS" );
    $list46 = ConsesLow.list( makeSymbol( "COLLECTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str47$Counts_the_number_of_specs_in_COL = makeString( "Counts the number of specs in COLLECTION and then returns the count." );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "COLLECTION" ), makeSymbol( "EL-FORT-P" ) ) );
    $list49 = ConsesLow.list( makeSymbol( "INTEGERP" ) );
    $sym50$ALL_GENLS_WRT = makeSymbol( "ALL-GENLS-WRT" );
    $list51 = ConsesLow.list( makeSymbol( "SPEC" ), makeSymbol( "GENL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str52$Returns_all_genls_of_collection_S = makeString( "Returns all genls of collection SPEC that are also specs of collection GENL (ascending transitive closure; inexpensive)" );
    $list53 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC" ), makeSymbol( "EL-FORT-P" ) ), ConsesLow.list( makeSymbol( "GENL" ), makeSymbol( "EL-FORT-P" ) ) );
    $sym54$LISTP = makeSymbol( "LISTP" );
    $sym55$UNION_ALL_GENLS = makeSymbol( "UNION-ALL-GENLS" );
    $list56 = ConsesLow.list( makeSymbol( "COLS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str57$Returns_all_genls_of_each_collect = makeString( "Returns all genls of each collection in COLs" );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "COLS" ), makeSymbol( "LISTP" ) ) );
    $sym59$UNION_ALL_SPECS = makeSymbol( "UNION-ALL-SPECS" );
    $str60$Returns_all_specs_of_each_collect = makeString( "Returns all specs of each collection in COLs" );
    $sym61$ALL_DEPENDENT_SPECS = makeSymbol( "ALL-DEPENDENT-SPECS" );
    $str62$Returns_all_specs_s_of_COL_s_t__e = makeString( "Returns all specs s of COL s.t. every path connecting\n   s to any genl of COL must pass through COL" );
    $sym63$ALL_GENLS_AMONG = makeSymbol( "ALL-GENLS-AMONG" );
    $list64 = ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "CANDIDATES" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str65$Returns_those_genls_of_COL_that_a = makeString( "Returns those genls of COL that are included among CANDIDATES" );
    $list66 = ConsesLow.list( ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "EL-FORT-P" ) ), ConsesLow.list( makeSymbol( "CANDIDATES" ), makeSymbol( "LISTP" ) ) );
    $sym67$ALL_SPECS_AMONG = makeSymbol( "ALL-SPECS-AMONG" );
    $str68$Returns_those_specs_of_COL_that_a = makeString( "Returns those specs of COL that are included among CANDIDATEs" );
    $sym69$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym70$ALL_GENLS_IF = makeSymbol( "ALL-GENLS-IF" );
    $list71 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str72$Returns_all_genls_of_collection_C = makeString( "Returns all genls of collection COL that satisfy FUNCTION\n   (FUNCTION must not effect sbhl search state)" );
    $list73 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "FUNCTION-SPEC-P" ) ), ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "EL-FORT-P" ) ) );
    $sym74$ALL_SPECS_IF = makeSymbol( "ALL-SPECS-IF" );
    $sym75$ALL_NOT_GENLS = makeSymbol( "ALL-NOT-GENLS" );
    $str76$Returns_all_negated_genls_of_coll = makeString( "Returns all negated genls of collection COL \n   (descending transitive closure; expensive)" );
    $sym77$ALL_NOT_SPECS = makeSymbol( "ALL-NOT-SPECS" );
    $str78$Returns_all_negated_specs_of_coll = makeString( "Returns all negated specs of collection COL \n   (ascending transitive closure; inexpensive)" );
    $sym79$MAP_ALL_GENLS = makeSymbol( "MAP-ALL-GENLS" );
    $list80 = ConsesLow.list( makeSymbol( "FN" ), makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str81$Applies_FN_to_every__all__genls_o = makeString( "Applies FN to every (all) genls of COL\n   (FN must not effect the current sbhl space)" );
    $list82 = ConsesLow.list( ConsesLow.list( makeSymbol( "FN" ), makeSymbol( "FUNCTION-SPEC-P" ) ), ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "EL-FORT-P" ) ) );
    $sym83$MAP_ALL_SPECS = makeSymbol( "MAP-ALL-SPECS" );
    $str84$Applies_FN_to_every__all__specs_o = makeString( "Applies FN to every (all) specs of COL\n   (FN must not effect the current sbhl space)" );
    $sym85$ANY_ALL_GENLS = makeSymbol( "ANY-ALL-GENLS" );
    $str86$Return_a_non_nil_result_of_applyi = makeString( "Return a non-nil result of applying FN to some all-genl of COL\n   (FN must not effect the current sbhl space)" );
    $sym87$ANY_ALL_SPECS = makeSymbol( "ANY-ALL-SPECS" );
    $str88$Return_a_non_nil_result_of_applyi = makeString( "Return a non-nil result of applying FN to some all-spec of COL\n   (FN must not effect the current sbhl space)" );
    $sym89$GENL_ = makeSymbol( "GENL?" );
    $str90$Returns_whether____genls_SPEC_GEN = makeString( "Returns whether (#$genls SPEC GENL) can be inferred.\n   (ascending transitive search; inexpensive)" );
    $list91 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym92$SPEC_ = makeSymbol( "SPEC?" );
    $list93 = ConsesLow.list( makeSymbol( "GENL" ), makeSymbol( "SPEC" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $list94 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL" ), makeSymbol( "EL-FORT-P" ) ), ConsesLow.list( makeSymbol( "SPEC" ), makeSymbol( "EL-FORT-P" ) ) );
    $const95$preservesGenlsInArg = constant_handles.reader_make_constant_shell( makeString( "preservesGenlsInArg" ) );
    $sym96$ANY_GENL_ = makeSymbol( "ANY-GENL?" );
    $list97 = ConsesLow.list( makeSymbol( "SPEC" ), makeSymbol( "GENLS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str98$_any_genl__spec_genls__is_t_iff__ = makeString( "(any-genl? spec genls) is t iff (genl? spec genl) for some genl in genls\n   (ascending transitive search; inexpensive)" );
    $list99 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC" ), makeSymbol( "EL-FORT-P" ) ), ConsesLow.list( makeSymbol( "GENLS" ), makeSymbol( "LISTP" ) ) );
    $sym100$ANY_SPEC_ = makeSymbol( "ANY-SPEC?" );
    $list101 = ConsesLow.list( makeSymbol( "GENL" ), makeSymbol( "SPECS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str102$Returns_T_iff__spec__genl_spec__f = makeString( "Returns T iff (spec? genl spec) for some spec in SPECS" );
    $list103 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL" ), makeSymbol( "EL-FORT-P" ) ), ConsesLow.list( makeSymbol( "SPECS" ), makeSymbol( "LISTP" ) ) );
    $sym104$ALL_GENL_ = makeSymbol( "ALL-GENL?" );
    $str105$Returns_T_iff__genl__spec_genl__f = makeString( "Returns T iff (genl? spec genl) for every genl in GENLS\n   (ascending transitive search; inexpensive)" );
    $sym106$ALL_SPEC_ = makeSymbol( "ALL-SPEC?" );
    $str107$Returns_T_iff__spec__genl_spec__f = makeString( "Returns T iff (spec? genl spec) for every spec in SPECS" );
    $sym108$ANY_GENL_ANY_ = makeSymbol( "ANY-GENL-ANY?" );
    $list109 = ConsesLow.list( makeSymbol( "SPECS" ), makeSymbol( "GENLS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str110$Return_T_iff__genl__spec_genl_mt_ = makeString( "Return T iff (genl? spec genl mt) for any spec in SPECS, genl in GENLS" );
    $list111 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPECS" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "GENLS" ), makeSymbol( "LISTP" ) ) );
    $sym112$ANY_GENL_ALL_ = makeSymbol( "ANY-GENL-ALL?" );
    $str113$Return_T_iff__genl__spec_genl_mt_ = makeString( "Return T iff (genl? spec genl mt) for any spec in SPECS and all genl in GENLS" );
    $sym114$ALL_SPEC_ANY_ = makeSymbol( "ALL-SPEC-ANY?" );
    $str115$Return_T_iff_for_each_spec_in_SPE = makeString( "Return T iff for each spec in SPECS there is some genl in GENLS s.t. (genl? spec genl mt)" );
    $sym116$NOT_GENL_ = makeSymbol( "NOT-GENL?" );
    $list117 = ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "NOT-GENL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str118$Return_whether_collection_NOT_GEN = makeString( "Return whether collection NOT-GENL is not a genl of COL." );
    $list119 = ConsesLow.list( ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "EL-FORT-P" ) ), ConsesLow.list( makeSymbol( "NOT-GENL" ), makeSymbol( "EL-FORT-P" ) ) );
    $sym120$ALL_NOT_SPEC_ = makeSymbol( "ALL-NOT-SPEC?" );
    $list121 = ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "NOT-SPECS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str122$Return_whether_every_collection_i = makeString( "Return whether every collection in NOT-SPECS is not a spec of COL." );
    $list123 = ConsesLow.list( ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "EL-FORT-P" ) ), ConsesLow.list( makeSymbol( "NOT-SPECS" ), makeSymbol( "LISTP" ) ) );
    $sym124$ANY_NOT_GENL_ = makeSymbol( "ANY-NOT-GENL?" );
    $list125 = ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "NOT-GENLS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str126$Returns_whether_any_collection_in = makeString( "Returns whether any collection in NOT-GENLS is not a genl of COL." );
    $list127 = ConsesLow.list( ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "EL-FORT-P" ) ), ConsesLow.list( makeSymbol( "NOT-GENLS" ), makeSymbol( "LISTP" ) ) );
    $sym128$FORT_P = makeSymbol( "FORT-P" );
    $sym129$HLMT_P = makeSymbol( "HLMT-P" );
    $sym130$COLLECTIONS_COEXTENSIONAL_ = makeSymbol( "COLLECTIONS-COEXTENSIONAL?" );
    $list131 = ConsesLow.list( makeSymbol( "COL-1" ), makeSymbol( "COL-2" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str132$Are_COL_1_and_COL_2_coextensional = makeString( "Are COL-1 and COL-2 coextensional?" );
    $list133 = ConsesLow.list( ConsesLow.list( makeSymbol( "COL-1" ), makeSymbol( "EL-FORT-P" ) ), ConsesLow.list( makeSymbol( "COL-2" ), makeSymbol( "EL-FORT-P" ) ) );
    $sym134$COLLECTIONS_INTERSECT_ = makeSymbol( "COLLECTIONS-INTERSECT?" );
    $str135$Do_collections_COL_1_and_COL_2_in = makeString( "Do collections COL-1 and COL-2 intersect?\n   (uses only sbhl graphs: their extensions are not searched\n    nor are their sufficient conditions analyzed)" );
    $kw136$TRUE = makeKeyword( "TRUE" );
    $kw137$GAF = makeKeyword( "GAF" );
    $sym138$WHY_GENL_ = makeSymbol( "WHY-GENL?" );
    $list139 = ConsesLow.list( makeSymbol( "SPEC" ), makeSymbol( "GENL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "BEHAVIOR" ) );
    $str140$Justification_of__genls_SPEC_GENL = makeString( "Justification of (genls SPEC GENL)" );
    $list141 = ConsesLow.list( makeSymbol( "LISTP" ) );
    $const142$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $list143 = ConsesLow.list( makeKeyword( "TRUE" ) );
    $const144$resultGenl = constant_handles.reader_make_constant_shell( makeString( "resultGenl" ) );
    $const145$resultGenlArg = constant_handles.reader_make_constant_shell( makeString( "resultGenlArg" ) );
    $const146$interArgResultGenl = constant_handles.reader_make_constant_shell( makeString( "interArgResultGenl" ) );
    $const147$interArgResultGenlReln = constant_handles.reader_make_constant_shell( makeString( "interArgResultGenlReln" ) );
    $sym148$WHY_NOT_GENL_ = makeSymbol( "WHY-NOT-GENL?" );
    $str149$Justification_of__not__genls_SPEC = makeString( "Justification of (not (genls SPEC GENL))" );
    $sym150$WHY_NOT_ASSERT_GENLS_ = makeSymbol( "WHY-NOT-ASSERT-GENLS?" );
    $list151 = ConsesLow.list( makeSymbol( "SPEC" ), makeSymbol( "GENL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str152$Justification_of_why_asserting__g = makeString( "Justification of why asserting (genls SPEC GENL) is not consistent" );
    $sym153$COLLECTION_LEAVES = makeSymbol( "COLLECTION-LEAVES" );
    $str154$Returns_the_minimally_general__th = makeString( "Returns the minimally-general (the most specific) among all-specs of COL" );
    $sym155$MIN_COLS = makeSymbol( "MIN-COLS" );
    $str156$Returns_the_minimally_general__th = makeString( "Returns the minimally-general (the most specific) among reified collections COLS,\n   collections that have no proper specs among COLS" );
    $sym157$MIN_COL = makeSymbol( "MIN-COL" );
    $str158$Returns_the_single_minimally_gene = makeString(
        "Returns the single minimally-general (the most specific) among reified collections COLS.\nTies are broken by comparing the number of all-genls which is a rough depth estimate." );
    $list159 = ConsesLow.list( makeSymbol( "FORT-P" ) );
    $sym160$MAX_COLS = makeSymbol( "MAX-COLS" );
    $str161$Returns_the_most_general_among_re = makeString( "Returns the most-general among reified collections COLS, collections\n   that have no proper genls among COLS" );
    $sym162$MIN_CEILING_COLS = makeSymbol( "MIN-CEILING-COLS" );
    $list163 = ConsesLow.list( makeSymbol( "COLS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "CANDIDATES" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str164$Returns_the_most_specific_common_ = makeString( "Returns the most specific common generalizations among reified collections COLS\n   (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)" );
    $sym165$MAX_FLOOR_COLS = makeSymbol( "MAX-FLOOR-COLS" );
    $str166$Returns_the_most_general_common_s = makeString( "Returns the most general common specializations among reified collections COLS\n   (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)" );
    $sym167$ANY_GENL_ISA = makeSymbol( "ANY-GENL-ISA" );
    $list168 = ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "ISA" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $str169$Return_some_genl_of_COL_that_isa_ = makeString( "Return some genl of COL that isa instance of ISA (if any such genl exists)" );
    $list170 = ConsesLow.list( ConsesLow.list( makeSymbol( "COL" ), makeSymbol( "EL-FORT-P" ) ), ConsesLow.list( makeSymbol( "ISA" ), makeSymbol( "EL-FORT-P" ) ) );
    $sym171$LIGHTER_COL = makeSymbol( "LIGHTER-COL" );
    $list172 = ConsesLow.list( makeSymbol( "COL-A" ), makeSymbol( "COL-B" ) );
    $str173$Return_COL_B_iff_it_has_fewer_spe = makeString( "Return COL-B iff it has fewer specs than COL-A, else return COL-A" );
    $list174 = ConsesLow.list( ConsesLow.list( makeSymbol( "COL-A" ), makeSymbol( "EL-FORT-P" ) ), ConsesLow.list( makeSymbol( "COL-B" ), makeSymbol( "EL-FORT-P" ) ) );
    $sym175$LIGHTEST_OF_COLS = makeSymbol( "LIGHTEST-OF-COLS" );
    $list176 = ConsesLow.list( makeSymbol( "COLS" ) );
    $str177$Return_the_collection_having_the_ = makeString( "Return the collection having the fewest specs given a list of collections." );
    $sym178$SHALLOWER_COL = makeSymbol( "SHALLOWER-COL" );
    $str179$Return_COL_B_iff_it_has_fewer_gen = makeString( "Return COL-B iff it has fewer genls than COL-A, else return COL-A" );
    $sym180$MAX_FLOOR_MTS_OF_GENLS_PATHS = makeSymbol( "MAX-FLOOR-MTS-OF-GENLS-PATHS" );
    $list181 = ConsesLow.list( makeSymbol( "SPEC" ), makeSymbol( "GENL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TV" ) );
    $str182$_return_listp__Returns_in_what__m = makeString( "@return listp; Returns in what (most-genl) mts GENL is a genls of SPEC" );
    $const183$coExtensional = constant_handles.reader_make_constant_shell( makeString( "coExtensional" ) );
    $sym184$GENLS_AFTER_ADDING = makeSymbol( "GENLS-AFTER-ADDING" );
    $sym185$GENLS_AFTER_REMOVING = makeSymbol( "GENLS-AFTER-REMOVING" );
    $kw186$TEST = makeKeyword( "TEST" );
    $kw187$OWNER = makeKeyword( "OWNER" );
    $kw188$CLASSES = makeKeyword( "CLASSES" );
    $kw189$KB = makeKeyword( "KB" );
    $kw190$TINY = makeKeyword( "TINY" );
    $kw191$WORKING_ = makeKeyword( "WORKING?" );
    $list192 = ConsesLow.list( ConsesLow.list( ConsesLow.list( NIL ), NIL ) );
    $kw193$FULL = makeKeyword( "FULL" );
    $list194 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Nothing" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
        makeString( "Nothing" ) ) ) ) );
    $sym195$MAX_COLS_BENEATH = makeSymbol( "MAX-COLS-BENEATH" );
    $list196 = ConsesLow.list( ConsesLow.list( ConsesLow.list( NIL, constant_handles.reader_make_constant_shell( makeString( "Dog" ) ), constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) ) ),
        NIL ) );
    $list197 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FemaleHuman" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "Female" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Female" ) ) ) ) );
    $list198 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Female" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "FemaleHuman" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FemaleHuman" ) ) ) ) );
    $list199 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FemaleHuman" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "Female" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FemaleHuman" ) ), NIL ), NIL ) );
    $list200 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Female" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "FemaleHuman" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Female" ) ), NIL ), NIL ) );
    $list201 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FemaleHuman" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "Female" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FemaleHuman" ) ), NIL ), T ) );
    $list202 = ConsesLow.list( ConsesLow.list( ConsesLow.list( NIL, NIL ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FemaleHuman" ) ) ), ConsesLow
        .list( constant_handles.reader_make_constant_shell( makeString( "Female" ) ) ) ), T ) );
    $list203 = ConsesLow.list( ConsesLow.list( ConsesLow.list( NIL, NIL ), NIL ) );
    $list204 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Female" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "Male" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Female" ) ), NIL ), T ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "Female" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Female" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                makeString( "Female" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FemaleHuman" ) ) ) ), NIL ) );
    $list205 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Female" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "FemaleHuman" ) ), constant_handles.reader_make_constant_shell( makeString( "FemaleAnimal" ) ) ) ), T ) );
    $list206 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Female" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "FemaleHuman" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Female" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "Thing" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Female" ) ), NIL ), NIL ) );
    $sym207$ALL_GENL_OF_SOME_ = makeSymbol( "ALL-GENL-OF-SOME?" );
    $list208 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "Individual" ) ) ), constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "Predicate" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ) ), constant_handles.reader_make_constant_shell(
                makeString( "BaseKB" ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ), ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "Individual" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                        "BaseKB" ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) ) ), ConsesLow.list( constant_handles
                            .reader_make_constant_shell( makeString( "Individual" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                "BaseKB" ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) ) ), ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "Individual" ) ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ), constant_handles.reader_make_constant_shell(
                                        makeString( "BaseKB" ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles
                                            .reader_make_constant_shell( makeString( "BinaryPredicate" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Individual" ) ), constant_handles
                                                .reader_make_constant_shell( makeString( "Predicate" ) ) ), constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ) ), T ), ConsesLow.list( ConsesLow.list(
                                                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                        "Collection" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ), constant_handles.reader_make_constant_shell(
                                                            makeString( "BaseKB" ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) ),
                                                                constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                    "Collection" ) ), constant_handles.reader_make_constant_shell( makeString( "Individual" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                        "BaseKB" ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ),
                                                                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), constant_handles.reader_make_constant_shell(
                                                                                makeString( "Individual" ) ) ), constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ) ), NIL )
    } );
  }
}
/*
 * 
 * Total time: 2516 ms synthetic
 */