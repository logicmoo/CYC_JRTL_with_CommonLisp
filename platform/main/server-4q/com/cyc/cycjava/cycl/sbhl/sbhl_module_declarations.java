package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_module_declarations
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations";
  public static final String myFingerPrint = "83b42acb7154f9a7cf01a767d8e102ba10a4a72a0ba9749399ec7845b72f2b18";
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 13034L)
  private static SubLSymbol $sbhl_modules_initializedP$;
  private static final SubLObject $const0$genls;
  private static final SubLSymbol $kw1$LINK_PRED;
  private static final SubLSymbol $kw2$LINK_STYLE;
  private static final SubLObject $const3$DirectedMultigraph;
  private static final SubLSymbol $kw4$NAUT_FORWARD_TRUE_GENERATORS;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$MODULE_TYPE;
  private static final SubLSymbol $kw7$SIMPLE_REFLEXIVE;
  private static final SubLSymbol $kw8$TYPE_TEST;
  private static final SubLSymbol $sym9$COLLECTION_P;
  private static final SubLSymbol $kw10$DISJOINS_MODULE;
  private static final SubLObject $const11$disjointWith;
  private static final SubLSymbol $kw12$PATH_TERMINATING_MARK__FN;
  private static final SubLSymbol $sym13$SBHL_MARKED_P;
  private static final SubLSymbol $kw14$MARKING_FN;
  private static final SubLSymbol $sym15$SET_SBHL_MARKING_STATE_TO_MARKED;
  private static final SubLSymbol $kw16$UNMARKING_FN;
  private static final SubLSymbol $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED;
  private static final SubLSymbol $kw18$ROOT;
  private static final SubLObject $const19$Thing;
  private static final SubLSymbol $kw20$INDEX_ARG;
  private static final SubLObject $const21$Multigraph;
  private static final SubLSymbol $kw22$DISJOINS;
  private static final SubLSymbol $kw23$TRANSFERS_THROUGH_MODULE;
  private static final SubLSymbol $kw24$TRANSFERS_VIA_ARG;
  private static final SubLObject $const25$isa;
  private static final SubLList $list26;
  private static final SubLSymbol $kw27$TRANSFERS_THROUGH;
  private static final SubLObject $const28$quotedIsa;
  private static final SubLList $list29;
  private static final SubLObject $const30$genlMt;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$MICROTHEORY_P;
  private static final SubLObject $const33$intensionallyIncompatibleMt;
  private static final SubLObject $const34$negationMt;
  private static final SubLObject $const35$genlPreds;
  private static final SubLSymbol $sym36$PREDICATE_P;
  private static final SubLObject $const37$negationPreds;
  private static final SubLSymbol $kw38$MODULE_INVERTS_ARGUMENTS;
  private static final SubLObject $const39$genlInverse;
  private static final SubLSymbol $sym40$SBHL_PREDICATE_PATH_TERMINATION_P;
  private static final SubLSymbol $sym41$SBHL_PREDICATE_MARKING_FN;
  private static final SubLSymbol $sym42$SBHL_PREDICATE_UNMARKING_FN;
  private static final SubLSymbol $kw43$PREDICATE_SEARCH_P;
  private static final SubLSymbol $kw44$ADD_NODE_TO_RESULT_TEST;
  private static final SubLSymbol $sym45$NOT_GENL_INVERSE_MODE_P;
  private static final SubLSymbol $kw46$ACCESSIBLE_LINK_PREDS;
  private static final SubLList $list47;
  private static final SubLSymbol $kw48$SIMPLE_NON_REFLEXIVE;
  private static final SubLSymbol $kw49$INVERTS_ARGUMENTS_OF_MODULE;
  private static final SubLObject $const50$negationInverse;
  private static final SubLSymbol $sym51$GENL_INVERSE_MODE_P;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLObject $const55$incompatibleMt;
  private static final SubLObject $const56$weak_HL_TimePrecedence;
  private static final SubLSymbol $kw57$MODULE_TAG;
  private static final SubLSymbol $kw58$WEAK;
  private static final SubLSymbol $kw59$TIME;
  private static final SubLSymbol $sym60$SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P;
  private static final SubLSymbol $sym61$INCREMENT_SBHL_MARKING_STATE_BY_ZERO;
  private static final SubLSymbol $kw62$MARKING_INCREMENT;
  private static final SubLSymbol $sym63$SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P;
  private static final SubLList $list64;
  private static final SubLObject $const65$weakSuccessor_HL_TimePrecedence;
  private static final SubLSymbol $kw66$WEAK_SUCCESSOR;
  private static final SubLSymbol $sym67$INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE;
  private static final SubLObject $const68$strict_HL_TimePrecedence;
  private static final SubLSymbol $kw69$STRICT;
  private static final SubLSymbol $sym70$INCREMENT_SBHL_MARKING_STATE_BY_ONE;
  private static final SubLObject $const71$successorStrict_HL_TimePrecedence;
  private static final SubLSymbol $kw72$SUCCESSOR_STRICT;
  private static final SubLSymbol $sym73$INCREMENT_SBHL_MARKING_STATE_BY_TWO;
  private static final SubLSymbol $sym74$_SBHL_MODULES_INITIALIZED__;
  private static final SubLSymbol $kw75$SBHL_GRAPH;
  private static final SubLSymbol $kw76$GRAPH;
  private static final SubLList $list77;
  private static final SubLString $str78$sbhl_module__A__graph__A__tt_modu;
  private static final SubLString $str79$missing;

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 555L)
  public static SubLObject initialize_genls_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const0$genls, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const0$genls ), ConsesLow.list( $kw2$LINK_STYLE, $const3$DirectedMultigraph ), ConsesLow
        .list( $kw4$NAUT_FORWARD_TRUE_GENERATORS, $list5 ), ConsesLow.list( $kw6$MODULE_TYPE, $kw7$SIMPLE_REFLEXIVE ), ConsesLow.list( $kw8$TYPE_TEST, $sym9$COLLECTION_P ), ConsesLow.list( $kw10$DISJOINS_MODULE,
            $const11$disjointWith ), ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN, $sym13$SBHL_MARKED_P ), ConsesLow.list( $kw14$MARKING_FN, $sym15$SET_SBHL_MARKING_STATE_TO_MARKED ), ConsesLow.list(
                $kw16$UNMARKING_FN, $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED ), ConsesLow.list( $kw18$ROOT, $const19$Thing ), ConsesLow.list( $kw20$INDEX_ARG, ONE_INTEGER )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 1298L)
  public static SubLObject initialize_disjoint_with_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const11$disjointWith, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const11$disjointWith ), ConsesLow.list( $kw2$LINK_STYLE, $const21$Multigraph ),
      ConsesLow.list( $kw6$MODULE_TYPE, $kw22$DISJOINS ), ConsesLow.list( $kw8$TYPE_TEST, $sym9$COLLECTION_P ), ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN, $sym13$SBHL_MARKED_P ), ConsesLow.list( $kw14$MARKING_FN,
          $sym15$SET_SBHL_MARKING_STATE_TO_MARKED ), ConsesLow.list( $kw16$UNMARKING_FN, $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED ), ConsesLow.list( $kw20$INDEX_ARG, ONE_INTEGER ), ConsesLow.list(
              $kw23$TRANSFERS_THROUGH_MODULE, $const0$genls ), ConsesLow.list( $kw24$TRANSFERS_VIA_ARG, ONE_INTEGER )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 1920L)
  public static SubLObject initialize_isa_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const25$isa, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const25$isa ), ConsesLow.list( $kw2$LINK_STYLE, $const3$DirectedMultigraph ), ConsesLow
        .list( $kw4$NAUT_FORWARD_TRUE_GENERATORS, $list26 ), ConsesLow.list( $kw6$MODULE_TYPE, $kw27$TRANSFERS_THROUGH ), ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN, $sym13$SBHL_MARKED_P ), ConsesLow.list(
            $kw14$MARKING_FN, $sym15$SET_SBHL_MARKING_STATE_TO_MARKED ), ConsesLow.list( $kw16$UNMARKING_FN, $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED ), ConsesLow.list( $kw20$INDEX_ARG, ONE_INTEGER ), ConsesLow.list(
                $kw23$TRANSFERS_THROUGH_MODULE, $const0$genls ), ConsesLow.list( $kw24$TRANSFERS_VIA_ARG, TWO_INTEGER )
    } ) );
    sbhl_link_methods.initialize_isa_arg2_naut_table();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 2726L)
  public static SubLObject initialize_quoted_isa_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const28$quotedIsa, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const28$quotedIsa ), ConsesLow.list( $kw2$LINK_STYLE, $const3$DirectedMultigraph ),
      ConsesLow.list( $kw4$NAUT_FORWARD_TRUE_GENERATORS, $list29 ), ConsesLow.list( $kw6$MODULE_TYPE, $kw27$TRANSFERS_THROUGH ), ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN, $sym13$SBHL_MARKED_P ), ConsesLow.list(
          $kw14$MARKING_FN, $sym15$SET_SBHL_MARKING_STATE_TO_MARKED ), ConsesLow.list( $kw16$UNMARKING_FN, $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED ), ConsesLow.list( $kw20$INDEX_ARG, ONE_INTEGER ), ConsesLow.list(
              $kw23$TRANSFERS_THROUGH_MODULE, $const0$genls ), ConsesLow.list( $kw24$TRANSFERS_VIA_ARG, TWO_INTEGER )
    } ) );
    sbhl_link_methods.initialize_quoted_isa_arg2_naut_table();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 3443L)
  public static SubLObject initialize_genl_mt_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const30$genlMt, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const30$genlMt ), ConsesLow.list( $kw2$LINK_STYLE, $const3$DirectedMultigraph ),
      ConsesLow.list( $kw4$NAUT_FORWARD_TRUE_GENERATORS, $list31 ), ConsesLow.list( $kw6$MODULE_TYPE, $kw7$SIMPLE_REFLEXIVE ), ConsesLow.list( $kw8$TYPE_TEST, $sym32$MICROTHEORY_P ), ConsesLow.list(
          $kw10$DISJOINS_MODULE, $const33$intensionallyIncompatibleMt ), ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN, $sym13$SBHL_MARKED_P ), ConsesLow.list( $kw14$MARKING_FN,
              $sym15$SET_SBHL_MARKING_STATE_TO_MARKED ), ConsesLow.list( $kw16$UNMARKING_FN, $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED ), ConsesLow.list( $kw18$ROOT, mt_vars.$mt_root$.getGlobalValue() ), ConsesLow.list(
                  $kw20$INDEX_ARG, ONE_INTEGER )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 4126L)
  public static SubLObject initialize_negation_mt_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const34$negationMt, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const34$negationMt ), ConsesLow.list( $kw2$LINK_STYLE, $const21$Multigraph ),
      ConsesLow.list( $kw6$MODULE_TYPE, $kw22$DISJOINS ), ConsesLow.list( $kw8$TYPE_TEST, $sym32$MICROTHEORY_P ), ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN, $sym13$SBHL_MARKED_P ), ConsesLow.list( $kw14$MARKING_FN,
          $sym15$SET_SBHL_MARKING_STATE_TO_MARKED ), ConsesLow.list( $kw16$UNMARKING_FN, $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED ), ConsesLow.list( $kw20$INDEX_ARG, ONE_INTEGER ), ConsesLow.list(
              $kw23$TRANSFERS_THROUGH_MODULE, $const30$genlMt ), ConsesLow.list( $kw24$TRANSFERS_VIA_ARG, ONE_INTEGER )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 4739L)
  public static SubLObject initialize_genl_preds_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const35$genlPreds, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const35$genlPreds ), ConsesLow.list( $kw2$LINK_STYLE, $const3$DirectedMultigraph ),
      ConsesLow.list( $kw6$MODULE_TYPE, $kw7$SIMPLE_REFLEXIVE ), ConsesLow.list( $kw8$TYPE_TEST, $sym36$PREDICATE_P ), ConsesLow.list( $kw10$DISJOINS_MODULE, $const37$negationPreds ), ConsesLow.list(
          $kw38$MODULE_INVERTS_ARGUMENTS, $const39$genlInverse ), ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN, $sym40$SBHL_PREDICATE_PATH_TERMINATION_P ), ConsesLow.list( $kw14$MARKING_FN,
              $sym41$SBHL_PREDICATE_MARKING_FN ), ConsesLow.list( $kw16$UNMARKING_FN, $sym42$SBHL_PREDICATE_UNMARKING_FN ), ConsesLow.list( $kw43$PREDICATE_SEARCH_P, T ), ConsesLow.list( $kw44$ADD_NODE_TO_RESULT_TEST,
                  $sym45$NOT_GENL_INVERSE_MODE_P ), ConsesLow.list( $kw46$ACCESSIBLE_LINK_PREDS, $list47 ), ConsesLow.list( $kw20$INDEX_ARG, ONE_INTEGER )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 5647L)
  public static SubLObject initialize_genl_inverse_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const39$genlInverse, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const39$genlInverse ), ConsesLow.list( $kw2$LINK_STYLE,
        $const3$DirectedMultigraph ), ConsesLow.list( $kw6$MODULE_TYPE, $kw48$SIMPLE_NON_REFLEXIVE ), ConsesLow.list( $kw8$TYPE_TEST, $sym36$PREDICATE_P ), ConsesLow.list( $kw49$INVERTS_ARGUMENTS_OF_MODULE,
            $const35$genlPreds ), ConsesLow.list( $kw10$DISJOINS_MODULE, $const50$negationInverse ), ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN, $sym40$SBHL_PREDICATE_PATH_TERMINATION_P ), ConsesLow.list(
                $kw14$MARKING_FN, $sym41$SBHL_PREDICATE_MARKING_FN ), ConsesLow.list( $kw16$UNMARKING_FN, $sym42$SBHL_PREDICATE_UNMARKING_FN ), ConsesLow.list( $kw43$PREDICATE_SEARCH_P, T ), ConsesLow.list(
                    $kw44$ADD_NODE_TO_RESULT_TEST, $sym51$GENL_INVERSE_MODE_P ), ConsesLow.list( $kw46$ACCESSIBLE_LINK_PREDS, $list52 ), ConsesLow.list( $kw20$INDEX_ARG, ONE_INTEGER )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 6464L)
  public static SubLObject initialize_negation_preds_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const37$negationPreds, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const37$negationPreds ), ConsesLow.list( $kw2$LINK_STYLE,
        $const21$Multigraph ), ConsesLow.list( $kw6$MODULE_TYPE, $kw22$DISJOINS ), ConsesLow.list( $kw8$TYPE_TEST, $sym36$PREDICATE_P ), ConsesLow.list( $kw38$MODULE_INVERTS_ARGUMENTS, $const50$negationInverse ),
      ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN, $sym40$SBHL_PREDICATE_PATH_TERMINATION_P ), ConsesLow.list( $kw14$MARKING_FN, $sym41$SBHL_PREDICATE_MARKING_FN ), ConsesLow.list( $kw16$UNMARKING_FN,
          $sym42$SBHL_PREDICATE_UNMARKING_FN ), ConsesLow.list( $kw43$PREDICATE_SEARCH_P, T ), ConsesLow.list( $kw44$ADD_NODE_TO_RESULT_TEST, $sym45$NOT_GENL_INVERSE_MODE_P ), ConsesLow.list( $kw46$ACCESSIBLE_LINK_PREDS,
              $list53 ), ConsesLow.list( $kw20$INDEX_ARG, ONE_INTEGER ), ConsesLow.list( $kw23$TRANSFERS_THROUGH_MODULE, $const35$genlPreds ), ConsesLow.list( $kw24$TRANSFERS_VIA_ARG, ONE_INTEGER )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 7323L)
  public static SubLObject initialize_negation_inverse_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const50$negationInverse, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const50$negationInverse ), ConsesLow.list( $kw2$LINK_STYLE,
        $const21$Multigraph ), ConsesLow.list( $kw6$MODULE_TYPE, $kw22$DISJOINS ), ConsesLow.list( $kw8$TYPE_TEST, $sym36$PREDICATE_P ), ConsesLow.list( $kw49$INVERTS_ARGUMENTS_OF_MODULE, $const37$negationPreds ),
      ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN, $sym40$SBHL_PREDICATE_PATH_TERMINATION_P ), ConsesLow.list( $kw14$MARKING_FN, $sym41$SBHL_PREDICATE_MARKING_FN ), ConsesLow.list( $kw16$UNMARKING_FN,
          $sym42$SBHL_PREDICATE_UNMARKING_FN ), ConsesLow.list( $kw43$PREDICATE_SEARCH_P, T ), ConsesLow.list( $kw44$ADD_NODE_TO_RESULT_TEST, $sym51$GENL_INVERSE_MODE_P ), ConsesLow.list( $kw46$ACCESSIBLE_LINK_PREDS,
              $list54 ), ConsesLow.list( $kw20$INDEX_ARG, ONE_INTEGER ), ConsesLow.list( $kw23$TRANSFERS_THROUGH_MODULE, $const35$genlPreds ), ConsesLow.list( $kw24$TRANSFERS_VIA_ARG, ONE_INTEGER )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 8193L)
  public static SubLObject initialize_incompatible_mt_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const55$incompatibleMt, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const55$incompatibleMt ), ConsesLow.list( $kw2$LINK_STYLE,
        $const21$Multigraph ), ConsesLow.list( $kw6$MODULE_TYPE, $kw22$DISJOINS ), ConsesLow.list( $kw8$TYPE_TEST, $sym32$MICROTHEORY_P ), ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN, $sym13$SBHL_MARKED_P ),
      ConsesLow.list( $kw14$MARKING_FN, $sym15$SET_SBHL_MARKING_STATE_TO_MARKED ), ConsesLow.list( $kw16$UNMARKING_FN, $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED ), ConsesLow.list( $kw20$INDEX_ARG, ONE_INTEGER ),
      ConsesLow.list( $kw23$TRANSFERS_THROUGH_MODULE, $const30$genlMt ), ConsesLow.list( $kw24$TRANSFERS_VIA_ARG, ONE_INTEGER )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 8829L)
  public static SubLObject initialize_intensionally_incompatible_mt_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const33$intensionallyIncompatibleMt, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const33$intensionallyIncompatibleMt ), ConsesLow.list(
        $kw2$LINK_STYLE, $const21$Multigraph ), ConsesLow.list( $kw6$MODULE_TYPE, $kw22$DISJOINS ), ConsesLow.list( $kw8$TYPE_TEST, $sym32$MICROTHEORY_P ), ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN,
            $sym13$SBHL_MARKED_P ), ConsesLow.list( $kw14$MARKING_FN, $sym15$SET_SBHL_MARKING_STATE_TO_MARKED ), ConsesLow.list( $kw16$UNMARKING_FN, $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED ), ConsesLow.list(
                $kw20$INDEX_ARG, ONE_INTEGER ), ConsesLow.list( $kw23$TRANSFERS_THROUGH_MODULE, $const30$genlMt ), ConsesLow.list( $kw24$TRANSFERS_VIA_ARG, ONE_INTEGER )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 9425L)
  public static SubLObject initialize_weak_precedence_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const56$weak_HL_TimePrecedence, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const56$weak_HL_TimePrecedence ), ConsesLow.list( $kw57$MODULE_TAG,
        $kw58$WEAK ), ConsesLow.list( $kw2$LINK_STYLE, $const3$DirectedMultigraph ), ConsesLow.list( $kw6$MODULE_TYPE, $kw59$TIME ), ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN,
            $sym60$SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P ), ConsesLow.list( $kw14$MARKING_FN, $sym61$INCREMENT_SBHL_MARKING_STATE_BY_ZERO ), ConsesLow.list( $kw16$UNMARKING_FN,
                $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED ), ConsesLow.list( $kw62$MARKING_INCREMENT, ZERO_INTEGER ), ConsesLow.list( $kw44$ADD_NODE_TO_RESULT_TEST, $sym63$SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P ),
      ConsesLow.list( $kw46$ACCESSIBLE_LINK_PREDS, $list64 ), ConsesLow.list( $kw20$INDEX_ARG, ONE_INTEGER )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 9425L)
  public static SubLObject initialize_weak_successor_precedence_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const65$weakSuccessor_HL_TimePrecedence, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const65$weakSuccessor_HL_TimePrecedence ), ConsesLow.list(
        $kw57$MODULE_TAG, $kw66$WEAK_SUCCESSOR ), ConsesLow.list( $kw2$LINK_STYLE, $const3$DirectedMultigraph ), ConsesLow.list( $kw6$MODULE_TYPE, $kw59$TIME ), ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN,
            $sym60$SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P ), ConsesLow.list( $kw14$MARKING_FN, $sym67$INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE ), ConsesLow.list( $kw16$UNMARKING_FN,
                $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED ), ConsesLow.list( $kw62$MARKING_INCREMENT, MINUS_ONE_INTEGER ), ConsesLow.list( $kw44$ADD_NODE_TO_RESULT_TEST,
                    $sym63$SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P ), ConsesLow.list( $kw46$ACCESSIBLE_LINK_PREDS, $list64 ), ConsesLow.list( $kw20$INDEX_ARG, ONE_INTEGER )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 9425L)
  public static SubLObject initialize_strict_precedence_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const68$strict_HL_TimePrecedence, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const68$strict_HL_TimePrecedence ), ConsesLow.list(
        $kw57$MODULE_TAG, $kw69$STRICT ), ConsesLow.list( $kw2$LINK_STYLE, $const3$DirectedMultigraph ), ConsesLow.list( $kw6$MODULE_TYPE, $kw59$TIME ), ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN,
            $sym60$SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P ), ConsesLow.list( $kw14$MARKING_FN, $sym70$INCREMENT_SBHL_MARKING_STATE_BY_ONE ), ConsesLow.list( $kw16$UNMARKING_FN,
                $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED ), ConsesLow.list( $kw62$MARKING_INCREMENT, ONE_INTEGER ), ConsesLow.list( $kw44$ADD_NODE_TO_RESULT_TEST, $sym63$SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P ),
      ConsesLow.list( $kw46$ACCESSIBLE_LINK_PREDS, $list64 ), ConsesLow.list( $kw20$INDEX_ARG, ONE_INTEGER )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 9425L)
  public static SubLObject initialize_successor_strict_precedence_module()
  {
    sbhl_module_utilities.init_sbhl_module_data( $const71$successorStrict_HL_TimePrecedence, ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw1$LINK_PRED, $const71$successorStrict_HL_TimePrecedence ), ConsesLow
        .list( $kw57$MODULE_TAG, $kw72$SUCCESSOR_STRICT ), ConsesLow.list( $kw2$LINK_STYLE, $const3$DirectedMultigraph ), ConsesLow.list( $kw6$MODULE_TYPE, $kw59$TIME ), ConsesLow.list( $kw12$PATH_TERMINATING_MARK__FN,
            $sym60$SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P ), ConsesLow.list( $kw14$MARKING_FN, $sym73$INCREMENT_SBHL_MARKING_STATE_BY_TWO ), ConsesLow.list( $kw16$UNMARKING_FN,
                $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED ), ConsesLow.list( $kw62$MARKING_INCREMENT, TWO_INTEGER ), ConsesLow.list( $kw44$ADD_NODE_TO_RESULT_TEST, $sym63$SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P ),
      ConsesLow.list( $kw46$ACCESSIBLE_LINK_PREDS, $list64 ), ConsesLow.list( $kw20$INDEX_ARG, ONE_INTEGER )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 13230L)
  public static SubLObject sbhl_modules_initializedP()
  {
    return $sbhl_modules_initializedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 13315L)
  public static SubLObject note_sbhl_modules_initialized()
  {
    $sbhl_modules_initializedP$.setGlobalValue( T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 13420L)
  public static SubLObject initialize_sbhl_modules(SubLObject forceP)
  {
    if( forceP == UNPROVIDED )
    {
      forceP = NIL;
    }
    if( NIL != forceP || NIL == sbhl_modules_initializedP() )
    {
      sbhl_module_vars.reset_sbhl_modules();
      initialize_genls_module();
      initialize_disjoint_with_module();
      initialize_isa_module();
      initialize_quoted_isa_module();
      initialize_genl_mt_module();
      initialize_intensionally_incompatible_mt_module();
      initialize_incompatible_mt_module();
      initialize_genl_preds_module();
      initialize_genl_inverse_module();
      initialize_negation_preds_module();
      initialize_negation_inverse_module();
      initialize_weak_precedence_module();
      initialize_weak_successor_precedence_module();
      initialize_strict_precedence_module();
      initialize_successor_strict_precedence_module();
      note_sbhl_modules_initialized();
    }
    else
    {
      sbhl_module_vars.check_sbhl_modules_store_for_legacy_format();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 14542L)
  public static SubLObject convert_legacy_sbhl_modules_to_structs(SubLObject forceP)
  {
    if( forceP == UNPROVIDED )
    {
      forceP = NIL;
    }
    final SubLObject sbhl_graph_dictionary = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = sbhl_module_utilities.get_sbhl_predicates();
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject legacy_module = sbhl_module_vars.get_sbhl_module( pred );
      if( NIL != dictionary.dictionary_p( legacy_module ) )
      {
        dictionary.dictionary_enter( sbhl_graph_dictionary, pred, dictionary.dictionary_lookup( legacy_module, $kw75$SBHL_GRAPH, UNPROVIDED ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    if( NIL == dictionary.dictionary_empty_p( sbhl_graph_dictionary ) || NIL != forceP )
    {
      initialize_sbhl_modules( T );
      cdolist_list_var = dictionary.dictionary_keys( sbhl_graph_dictionary );
      pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject module = sbhl_module_vars.get_sbhl_module( pred );
        final SubLObject v_graph = dictionary.dictionary_lookup( sbhl_graph_dictionary, pred, UNPROVIDED );
        if( NIL != sbhl_module_vars.sbhl_module_p( module ) && NIL == dictionary.dictionary_p( module ) )
        {
          sbhl_module_vars.set_sbhl_module_property( module, $kw76$GRAPH, v_graph );
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 15802L)
  public static SubLObject verify_sbhl_modules(SubLObject auto_correctP)
  {
    if( auto_correctP == UNPROVIDED )
    {
      auto_correctP = NIL;
    }
    SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject key = NIL;
      SubLObject module = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
      key = current.first();
      current = ( module = current.rest() );
      PrintLow.format( T, $str78$sbhl_module__A__graph__A__tt_modu, new SubLObject[] { sbhl_module_utilities.get_sbhl_link_pred( module ), sbhl_module_vars.get_sbhl_module_graph( module ).isHashtable() ? Hashtables
          .hash_table_count( sbhl_module_vars.get_sbhl_module_graph( module ) ) : $str79$missing, sbhl_module_utilities.get_sbhl_transfers_through_module( module )
      } );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return NIL;
  }

  public static SubLObject declare_sbhl_module_declarations_file()
  {
    SubLFiles.declareFunction( me, "initialize_genls_module", "INITIALIZE-GENLS-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_disjoint_with_module", "INITIALIZE-DISJOINT-WITH-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_isa_module", "INITIALIZE-ISA-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_quoted_isa_module", "INITIALIZE-QUOTED-ISA-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_genl_mt_module", "INITIALIZE-GENL-MT-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_negation_mt_module", "INITIALIZE-NEGATION-MT-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_genl_preds_module", "INITIALIZE-GENL-PREDS-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_genl_inverse_module", "INITIALIZE-GENL-INVERSE-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_negation_preds_module", "INITIALIZE-NEGATION-PREDS-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_negation_inverse_module", "INITIALIZE-NEGATION-INVERSE-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_incompatible_mt_module", "INITIALIZE-INCOMPATIBLE-MT-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_intensionally_incompatible_mt_module", "INITIALIZE-INTENSIONALLY-INCOMPATIBLE-MT-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_weak_precedence_module", "INITIALIZE-WEAK-PRECEDENCE-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_weak_successor_precedence_module", "INITIALIZE-WEAK-SUCCESSOR-PRECEDENCE-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_strict_precedence_module", "INITIALIZE-STRICT-PRECEDENCE-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_successor_strict_precedence_module", "INITIALIZE-SUCCESSOR-STRICT-PRECEDENCE-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "sbhl_modules_initializedP", "SBHL-MODULES-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "note_sbhl_modules_initialized", "NOTE-SBHL-MODULES-INITIALIZED", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_sbhl_modules", "INITIALIZE-SBHL-MODULES", 0, 1, false );
    SubLFiles.declareFunction( me, "convert_legacy_sbhl_modules_to_structs", "CONVERT-LEGACY-SBHL-MODULES-TO-STRUCTS", 0, 1, false );
    SubLFiles.declareFunction( me, "verify_sbhl_modules", "VERIFY-SBHL-MODULES", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_sbhl_module_declarations_file()
  {
    $sbhl_modules_initializedP$ = SubLFiles.deflexical( "*SBHL-MODULES-INITIALIZED?*", ( maybeDefault( $sym74$_SBHL_MODULES_INITIALIZED__, $sbhl_modules_initializedP$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_sbhl_module_declarations_file()
  {
    subl_macro_promotions.declare_defglobal( $sym74$_SBHL_MODULES_INITIALIZED__ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sbhl_module_declarations_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sbhl_module_declarations_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sbhl_module_declarations_file();
  }
  static
  {
    me = new sbhl_module_declarations();
    $sbhl_modules_initializedP$ = null;
    $const0$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $kw1$LINK_PRED = makeKeyword( "LINK-PRED" );
    $kw2$LINK_STYLE = makeKeyword( "LINK-STYLE" );
    $const3$DirectedMultigraph = constant_handles.reader_make_constant_shell( makeString( "DirectedMultigraph" ) );
    $kw4$NAUT_FORWARD_TRUE_GENERATORS = makeKeyword( "NAUT-FORWARD-TRUE-GENERATORS" );
    $list5 = ConsesLow.list( makeSymbol( "SBHL-RESULT-GENL" ), makeSymbol( "RESULT-GENL-ARGS" ), makeSymbol( "RESULT-INTER-ARG-GENL" ), makeSymbol( "RESULT-INTER-ARG-GENL-RELN" ), makeSymbol(
        "RESULT-GENL-VIA-ARG-ARG-GENL" ) );
    $kw6$MODULE_TYPE = makeKeyword( "MODULE-TYPE" );
    $kw7$SIMPLE_REFLEXIVE = makeKeyword( "SIMPLE-REFLEXIVE" );
    $kw8$TYPE_TEST = makeKeyword( "TYPE-TEST" );
    $sym9$COLLECTION_P = makeSymbol( "COLLECTION-P" );
    $kw10$DISJOINS_MODULE = makeKeyword( "DISJOINS-MODULE" );
    $const11$disjointWith = constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) );
    $kw12$PATH_TERMINATING_MARK__FN = makeKeyword( "PATH-TERMINATING-MARK?-FN" );
    $sym13$SBHL_MARKED_P = makeSymbol( "SBHL-MARKED-P" );
    $kw14$MARKING_FN = makeKeyword( "MARKING-FN" );
    $sym15$SET_SBHL_MARKING_STATE_TO_MARKED = makeSymbol( "SET-SBHL-MARKING-STATE-TO-MARKED" );
    $kw16$UNMARKING_FN = makeKeyword( "UNMARKING-FN" );
    $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED = makeSymbol( "SET-SBHL-MARKING-STATE-TO-UNMARKED" );
    $kw18$ROOT = makeKeyword( "ROOT" );
    $const19$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $kw20$INDEX_ARG = makeKeyword( "INDEX-ARG" );
    $const21$Multigraph = constant_handles.reader_make_constant_shell( makeString( "Multigraph" ) );
    $kw22$DISJOINS = makeKeyword( "DISJOINS" );
    $kw23$TRANSFERS_THROUGH_MODULE = makeKeyword( "TRANSFERS-THROUGH-MODULE" );
    $kw24$TRANSFERS_VIA_ARG = makeKeyword( "TRANSFERS-VIA-ARG" );
    $const25$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list26 = ConsesLow.list( makeSymbol( "SBHL-RESULT-ISA" ), makeSymbol( "RESULT-ISA-ARGS" ), makeSymbol( "RESULT-INTER-ARG-ISA" ), makeSymbol( "RESULT-INTER-ARG-ISA-RELN" ), makeSymbol( "RESULT-ISA-VIA-ARG-ARG-ISA" ),
        makeSymbol( "RESULT-ISA-ARG-ISAS" ), makeSymbol( "RESULT-ISA-WHEN-ARG-ISA" ), makeSymbol( "RESULT-ISA-VIA-CLOSED-UNDER" ) );
    $kw27$TRANSFERS_THROUGH = makeKeyword( "TRANSFERS-THROUGH" );
    $const28$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $list29 = ConsesLow.list( makeSymbol( "SBHL-EVALUATION-RESULT-QUOTED-ISA" ), makeSymbol( "SBHL-RESULT-QUOTED-ISA" ) );
    $const30$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $list31 = ConsesLow.list( makeSymbol( "SBHL-NAUT-FORWARD-GENL-MTS" ) );
    $sym32$MICROTHEORY_P = makeSymbol( "MICROTHEORY-P" );
    $const33$intensionallyIncompatibleMt = constant_handles.reader_make_constant_shell( makeString( "intensionallyIncompatibleMt" ) );
    $const34$negationMt = constant_handles.reader_make_constant_shell( makeString( "negationMt" ) );
    $const35$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $sym36$PREDICATE_P = makeSymbol( "PREDICATE-P" );
    $const37$negationPreds = constant_handles.reader_make_constant_shell( makeString( "negationPreds" ) );
    $kw38$MODULE_INVERTS_ARGUMENTS = makeKeyword( "MODULE-INVERTS-ARGUMENTS" );
    $const39$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $sym40$SBHL_PREDICATE_PATH_TERMINATION_P = makeSymbol( "SBHL-PREDICATE-PATH-TERMINATION-P" );
    $sym41$SBHL_PREDICATE_MARKING_FN = makeSymbol( "SBHL-PREDICATE-MARKING-FN" );
    $sym42$SBHL_PREDICATE_UNMARKING_FN = makeSymbol( "SBHL-PREDICATE-UNMARKING-FN" );
    $kw43$PREDICATE_SEARCH_P = makeKeyword( "PREDICATE-SEARCH-P" );
    $kw44$ADD_NODE_TO_RESULT_TEST = makeKeyword( "ADD-NODE-TO-RESULT-TEST" );
    $sym45$NOT_GENL_INVERSE_MODE_P = makeSymbol( "NOT-GENL-INVERSE-MODE-P" );
    $kw46$ACCESSIBLE_LINK_PREDS = makeKeyword( "ACCESSIBLE-LINK-PREDS" );
    $list47 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ) );
    $kw48$SIMPLE_NON_REFLEXIVE = makeKeyword( "SIMPLE-NON-REFLEXIVE" );
    $kw49$INVERTS_ARGUMENTS_OF_MODULE = makeKeyword( "INVERTS-ARGUMENTS-OF-MODULE" );
    $const50$negationInverse = constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) );
    $sym51$GENL_INVERSE_MODE_P = makeSymbol( "GENL-INVERSE-MODE-P" );
    $list52 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ) );
    $list53 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "negationPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) ) );
    $list54 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) ), constant_handles.reader_make_constant_shell( makeString( "negationPreds" ) ) );
    $const55$incompatibleMt = constant_handles.reader_make_constant_shell( makeString( "incompatibleMt" ) );
    $const56$weak_HL_TimePrecedence = constant_handles.reader_make_constant_shell( makeString( "weak-HL-TimePrecedence" ) );
    $kw57$MODULE_TAG = makeKeyword( "MODULE-TAG" );
    $kw58$WEAK = makeKeyword( "WEAK" );
    $kw59$TIME = makeKeyword( "TIME" );
    $sym60$SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P = makeSymbol( "SBHL-NODES-MARK-EXCEEDS-TEMPORAL-THRESHOLD-P" );
    $sym61$INCREMENT_SBHL_MARKING_STATE_BY_ZERO = makeSymbol( "INCREMENT-SBHL-MARKING-STATE-BY-ZERO" );
    $kw62$MARKING_INCREMENT = makeKeyword( "MARKING-INCREMENT" );
    $sym63$SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P = makeSymbol( "SBHL-NODE-VALID-FOR-TEMPORAL-SEARCH-RESULT-P" );
    $list64 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "successorStrict-HL-TimePrecedence" ) ), constant_handles.reader_make_constant_shell( makeString( "strict-HL-TimePrecedence" ) ),
        constant_handles.reader_make_constant_shell( makeString( "weak-HL-TimePrecedence" ) ), constant_handles.reader_make_constant_shell( makeString( "weakSuccessor-HL-TimePrecedence" ) ) );
    $const65$weakSuccessor_HL_TimePrecedence = constant_handles.reader_make_constant_shell( makeString( "weakSuccessor-HL-TimePrecedence" ) );
    $kw66$WEAK_SUCCESSOR = makeKeyword( "WEAK-SUCCESSOR" );
    $sym67$INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE = makeSymbol( "INCREMENT-SBHL-MARKING-STATE-BY-MINUS-ONE" );
    $const68$strict_HL_TimePrecedence = constant_handles.reader_make_constant_shell( makeString( "strict-HL-TimePrecedence" ) );
    $kw69$STRICT = makeKeyword( "STRICT" );
    $sym70$INCREMENT_SBHL_MARKING_STATE_BY_ONE = makeSymbol( "INCREMENT-SBHL-MARKING-STATE-BY-ONE" );
    $const71$successorStrict_HL_TimePrecedence = constant_handles.reader_make_constant_shell( makeString( "successorStrict-HL-TimePrecedence" ) );
    $kw72$SUCCESSOR_STRICT = makeKeyword( "SUCCESSOR-STRICT" );
    $sym73$INCREMENT_SBHL_MARKING_STATE_BY_TWO = makeSymbol( "INCREMENT-SBHL-MARKING-STATE-BY-TWO" );
    $sym74$_SBHL_MODULES_INITIALIZED__ = makeSymbol( "*SBHL-MODULES-INITIALIZED?*" );
    $kw75$SBHL_GRAPH = makeKeyword( "SBHL-GRAPH" );
    $kw76$GRAPH = makeKeyword( "GRAPH" );
    $list77 = ConsesLow.cons( makeUninternedSymbol( "KEY" ), makeSymbol( "MODULE" ) );
    $str78$sbhl_module__A__graph__A__tt_modu = makeString( "sbhl-module ~A: graph=~A  tt-module=~A~%" );
    $str79$missing = makeString( "missing" );
  }
}
/*
 * 
 * Total time: 136 ms
 * 
 */