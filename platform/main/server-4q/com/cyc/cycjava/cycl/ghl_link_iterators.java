package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ghl_link_iterators
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.ghl_link_iterators";
  public static final String myFingerPrint = "d2b7b06988a3a236b3f7e4543e837b545a2ba0d9e044d0d6a2d70480d87db26a";
  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 790L)
  public static SubLSymbol $ghl_link_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 855L)
  public static SubLSymbol $ghl_link_direction$;
  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 6295L)
  public static SubLSymbol $gt_relevant_pred$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLSymbol $sym2$_GHL_LINK_PRED_;
  private static final SubLSymbol $sym3$_GHL_LINK_DIRECTION_;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw8$SUPPORT_VAR;
  private static final SubLSymbol $kw9$TV;
  private static final SubLSymbol $kw10$TRUE_DEF;
  private static final SubLSymbol $kw11$DONE_VAR;
  private static final SubLSymbol $sym12$PRED;
  private static final SubLSymbol $sym13$DIRECTION;
  private static final SubLSymbol $sym14$CDOLIST_MULTIPLE;
  private static final SubLSymbol $sym15$WITH_GHL_LINK_PRED_AND_DIRECTION;
  private static final SubLSymbol $sym16$PCOND;
  private static final SubLSymbol $sym17$SBHL_PREDICATE_P;
  private static final SubLSymbol $sym18$DO_SBHL_ACCESSIBLE_LINK_NODES;
  private static final SubLSymbol $sym19$GET_SBHL_MODULE;
  private static final SubLSymbol $sym20$GHL_MAKE_SBHL_SUPPORT;
  private static final SubLSymbol $sym21$GT_PREDICATE_P;
  private static final SubLSymbol $sym22$DO_GT_ACCESSIBLE_LINK_NODES;
  private static final SubLSymbol $sym23$PRED;
  private static final SubLSymbol $sym24$DIRECTION;
  private static final SubLSymbol $sym25$SUPPORT_VAR;
  private static final SubLSymbol $sym26$IGNORE;
  private static final SubLSymbol $sym27$DO_GHL_ACCESSIBLE_LINK_NODES;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$LINK_NODES_VAR;
  private static final SubLSymbol $sym31$SEARCH_DIRECTION;
  private static final SubLSymbol $sym32$LINK_DIRECTION;
  private static final SubLSymbol $sym33$D_LINK;
  private static final SubLSymbol $sym34$MT;
  private static final SubLSymbol $sym35$TV_LINKS;
  private static final SubLSymbol $sym36$TV;
  private static final SubLSymbol $sym37$NODE;
  private static final SubLSymbol $sym38$NAUT_TO_NART;
  private static final SubLSymbol $sym39$WITH_SBHL_SEARCH_MODULE;
  private static final SubLSymbol $sym40$POSSIBLY_FLIP_GENL_INVERSE_MODE;
  private static final SubLSymbol $sym41$FORT_P;
  private static final SubLSymbol $sym42$WITH_SBHL_GRAPH_LINK;
  private static final SubLSymbol $sym43$DO_GHL_RELEVANT_DIRECTIONS;
  private static final SubLSymbol $sym44$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION;
  private static final SubLSymbol $sym45$DO_SBHL_DIRECTION_LINK;
  private static final SubLSymbol $sym46$PWHEN;
  private static final SubLSymbol $sym47$RELEVANT_MT_;
  private static final SubLSymbol $sym48$_SBHL_LINK_MT_;
  private static final SubLSymbol $sym49$DO_SBHL_TV_LINKS;
  private static final SubLSymbol $sym50$RELEVANT_SBHL_TV_;
  private static final SubLSymbol $sym51$_SBHL_LINK_TV_;
  private static final SubLSymbol $sym52$DO_SET_OR_LIST;
  private static final SubLSymbol $kw53$DONE;
  private static final SubLSymbol $sym54$CLOSED_NAUT_;
  private static final SubLSymbol $sym55$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS;
  private static final SubLList $list56;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$SEARCH_DIRECTION;
  private static final SubLSymbol $sym59$INDEX_ARGNUM;
  private static final SubLSymbol $sym60$GATHER_ARGNUM;
  private static final SubLSymbol $sym61$ASSERTION;
  private static final SubLSymbol $sym62$TRUTH;
  private static final SubLSymbol $sym63$STRENGTH;
  private static final SubLSymbol $sym64$TV_TRUTH;
  private static final SubLSymbol $sym65$TV_STRENGTH;
  private static final SubLSymbol $sym66$WITH_GT_ARGS_UNSWAPPED;
  private static final SubLSymbol $sym67$GT_INDEX_ARGNUM_FOR_DIRECTION;
  private static final SubLSymbol $sym68$OTHER_BINARY_ARG;
  private static final SubLSymbol $sym69$DO_GT_GAF_ARG_INDEX;
  private static final SubLSymbol $kw70$INDEX;
  private static final SubLSymbol $kw71$TRUTH;
  private static final SubLSymbol $sym72$PUNLESS;
  private static final SubLSymbol $sym73$ACCESSIBLE_LINK_NODE_SENTENCE_IRRELEVANT_;
  private static final SubLSymbol $sym74$FORMULA_ARG;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$WITH_GT_ARGS_SWAPPED;
  private static final SubLList $list77;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$VAR_MT;
  private static final SubLSymbol $sym80$PROGN;
  private static final SubLSymbol $sym81$_GT_RELEVANT_PRED_;
  private static final SubLSymbol $sym82$WITH_PREDICATE_FUNCTION;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$DO_GAF_ARG_INDEX;
  private static final SubLSymbol $sym85$PWHEN_FEATURE;
  private static final SubLSymbol $kw86$CYC_SKSI;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$WITH_SKSI_GT_SEARCH_PRED;
  private static final SubLSymbol $sym89$DO_SKSI_GAF_ARG_INDEX_RELEVANT_PRED;
  private static final SubLSymbol $kw90$INDEX_ARGNUM;
  private static final SubLSymbol $kw91$FORWARD;
  private static final SubLSymbol $kw92$BACKWARD;
  private static final SubLString $str93$Invalid_direction__a;

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 905L)
  public static SubLObject with_ghl_link_pred_and_direction(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject pred = NIL;
    SubLObject direction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    direction = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym2$_GHL_LINK_PRED_, pred ), ConsesLow.list( $sym3$_GHL_LINK_DIRECTION_, direction ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 1084L)
  public static SubLObject with_new_ghl_link_pred_and_direction(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list4, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 1241L)
  public static SubLObject get_ghl_link_pred()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $ghl_link_pred$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 1306L)
  public static SubLObject get_ghl_link_direction()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $ghl_link_direction$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 1381L)
  public static SubLObject do_ghl_accessible_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject node = NIL;
    SubLObject predicates = NIL;
    SubLObject directions = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    predicates = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    directions = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list5 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list5 );
      if( NIL == conses_high.member( current_$1, $list6, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw7$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    }
    final SubLObject support_var_tail = cdestructuring_bind.property_list_member( $kw8$SUPPORT_VAR, current );
    final SubLObject support_var = ( NIL != support_var_tail ) ? conses_high.cadr( support_var_tail ) : NIL;
    final SubLObject tv_tail = cdestructuring_bind.property_list_member( $kw9$TV, current );
    final SubLObject tv = ( NIL != tv_tail ) ? conses_high.cadr( tv_tail ) : $kw10$TRUE_DEF;
    final SubLObject done_var_tail = cdestructuring_bind.property_list_member( $kw11$DONE_VAR, current );
    final SubLObject done_var = ( NIL != done_var_tail ) ? conses_high.cadr( done_var_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != support_var )
    {
      final SubLObject pred = $sym12$PRED;
      final SubLObject direction = $sym13$DIRECTION;
      return ConsesLow.list( $sym14$CDOLIST_MULTIPLE, ConsesLow.list( ConsesLow.list( pred, predicates ), ConsesLow.list( direction, directions ) ), ConsesLow.list( $sym15$WITH_GHL_LINK_PRED_AND_DIRECTION, ConsesLow
          .list( pred, direction ), ConsesLow.list( $sym16$PCOND, ConsesLow.list( ConsesLow.list( $sym17$SBHL_PREDICATE_P, pred ), ConsesLow.list( $sym18$DO_SBHL_ACCESSIBLE_LINK_NODES, ConsesLow.list( link_node_var,
              node, ConsesLow.list( $sym19$GET_SBHL_MODULE, pred ), direction, $kw11$DONE_VAR, done_var ), ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( support_var, ConsesLow.list(
                  $sym20$GHL_MAKE_SBHL_SUPPORT, pred, node, link_node_var, direction ) ) ), ConsesLow.append( body, NIL ) ) ) ), ConsesLow.list( ConsesLow.list( $sym21$GT_PREDICATE_P, pred ), ConsesLow.listS(
                      $sym22$DO_GT_ACCESSIBLE_LINK_NODES, ConsesLow.list( new SubLObject[]
                      { link_node_var, support_var, node, pred, direction, $kw9$TV, tv, $kw11$DONE_VAR, done_var
                      } ), ConsesLow.append( body, NIL ) ) ) ) ) );
    }
    final SubLObject pred = $sym23$PRED;
    final SubLObject direction = $sym24$DIRECTION;
    final SubLObject support_var_$2 = $sym25$SUPPORT_VAR;
    return ConsesLow.list( $sym14$CDOLIST_MULTIPLE, ConsesLow.list( ConsesLow.list( pred, predicates ), ConsesLow.list( direction, directions ) ), ConsesLow.list( $sym15$WITH_GHL_LINK_PRED_AND_DIRECTION, ConsesLow.list(
        pred, direction ), ConsesLow.list( $sym16$PCOND, ConsesLow.list( ConsesLow.list( $sym17$SBHL_PREDICATE_P, pred ), ConsesLow.listS( $sym18$DO_SBHL_ACCESSIBLE_LINK_NODES, ConsesLow.list( link_node_var, node,
            ConsesLow.list( $sym19$GET_SBHL_MODULE, pred ), direction, $kw11$DONE_VAR, done_var ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( ConsesLow.list( $sym21$GT_PREDICATE_P, pred ), ConsesLow.listS(
                $sym22$DO_GT_ACCESSIBLE_LINK_NODES, ConsesLow.list( new SubLObject[]
                { link_node_var, support_var_$2, node, pred, direction, $kw9$TV, tv, $kw11$DONE_VAR, done_var
                } ), ConsesLow.list( $sym26$IGNORE, support_var_$2 ), ConsesLow.append( body, NIL ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 2864L)
  public static SubLObject ghl_make_sbhl_support(final SubLObject pred, final SubLObject node, final SubLObject link_node, final SubLObject direction)
  {
    final SubLObject module = sbhl_module_utilities.sbhl_pred_hl_support_module( pred );
    final SubLObject sentence = ( NIL != ghl_search_vars.ghl_forward_direction_p( direction ) ) ? el_utilities.make_binary_formula( pred, node, link_node ) : el_utilities.make_binary_formula( pred, link_node, node );
    return arguments.make_hl_support( module, sentence, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 3227L)
  public static SubLObject do_sbhl_accessible_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject start_node = NIL;
    SubLObject module = NIL;
    SubLObject direction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    start_node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    direction = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list28 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list28 );
      if( NIL == conses_high.member( current_$3, $list29, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw7$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list28 );
    }
    final SubLObject done_var_tail = cdestructuring_bind.property_list_member( $kw11$DONE_VAR, current );
    final SubLObject done_var = ( NIL != done_var_tail ) ? conses_high.cadr( done_var_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject link_nodes_var = $sym30$LINK_NODES_VAR;
    final SubLObject search_direction = $sym31$SEARCH_DIRECTION;
    final SubLObject link_direction = $sym32$LINK_DIRECTION;
    final SubLObject d_link = $sym33$D_LINK;
    final SubLObject mt = $sym34$MT;
    final SubLObject tv_links = $sym35$TV_LINKS;
    final SubLObject tv = $sym36$TV;
    final SubLObject node = $sym37$NODE;
    return ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list( node, ConsesLow.list( $sym38$NAUT_TO_NART, start_node ) ) ), ConsesLow.list( $sym39$WITH_SBHL_SEARCH_MODULE, module, ConsesLow.list(
        $sym40$POSSIBLY_FLIP_GENL_INVERSE_MODE, ConsesLow.list( $sym16$PCOND, ConsesLow.list( ConsesLow.list( $sym41$FORT_P, node ), ConsesLow.list( $sym42$WITH_SBHL_GRAPH_LINK, ConsesLow.list( d_link, node, module ),
            ConsesLow.list( $sym43$DO_GHL_RELEVANT_DIRECTIONS, ConsesLow.list( search_direction, direction, $kw11$DONE_VAR, done_var ), ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list( link_direction,
                ConsesLow.list( $sym44$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, search_direction, module ) ) ), ConsesLow.list( $sym45$DO_SBHL_DIRECTION_LINK, ConsesLow.list( mt, tv_links, link_direction, d_link, module,
                    done_var ), ConsesLow.list( $sym46$PWHEN, ConsesLow.list( $sym47$RELEVANT_MT_, mt ), ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym48$_SBHL_LINK_MT_, mt ) ), ConsesLow.list(
                        $sym49$DO_SBHL_TV_LINKS, ConsesLow.list( tv, link_nodes_var, tv_links, done_var ), ConsesLow.list( $sym46$PWHEN, ConsesLow.list( $sym50$RELEVANT_SBHL_TV_, tv ), ConsesLow.list( $sym1$CLET,
                            ConsesLow.list( ConsesLow.list( $sym51$_SBHL_LINK_TV_, tv ) ), ConsesLow.listS( $sym52$DO_SET_OR_LIST, ConsesLow.list( link_node_var, link_nodes_var, $kw53$DONE, done_var ), ConsesLow.append(
                                body, NIL ) ) ) ) ) ) ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( $sym54$CLOSED_NAUT_, node ), ConsesLow.list( $sym43$DO_GHL_RELEVANT_DIRECTIONS, ConsesLow.list( search_direction,
                                    direction, $kw11$DONE_VAR, done_var ), ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list( link_direction, ConsesLow.list( $sym44$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION,
                                        search_direction, module ) ) ), ConsesLow.list( $sym55$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS, ConsesLow.list( link_nodes_var, node, link_direction, module, done_var ), ConsesLow
                                            .listS( $sym52$DO_SET_OR_LIST, ConsesLow.list( link_node_var, link_nodes_var, $kw53$DONE, done_var ), ConsesLow.append( body, NIL ) ) ) ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 4748L)
  public static SubLObject do_gt_accessible_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject assertion_var = NIL;
    SubLObject node = NIL;
    SubLObject pred = NIL;
    SubLObject direction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    direction = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list56 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list56 );
      if( NIL == conses_high.member( current_$4, $list57, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw7$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list56 );
    }
    final SubLObject tv_tail = cdestructuring_bind.property_list_member( $kw9$TV, current );
    final SubLObject tv = ( NIL != tv_tail ) ? conses_high.cadr( tv_tail ) : $kw10$TRUE_DEF;
    final SubLObject done_var_tail = cdestructuring_bind.property_list_member( $kw11$DONE_VAR, current );
    final SubLObject done_var = ( NIL != done_var_tail ) ? conses_high.cadr( done_var_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject search_direction = $sym58$SEARCH_DIRECTION;
    final SubLObject index_argnum = $sym59$INDEX_ARGNUM;
    final SubLObject gather_argnum = $sym60$GATHER_ARGNUM;
    final SubLObject assertion = $sym61$ASSERTION;
    final SubLObject truth = $sym62$TRUTH;
    final SubLObject strength = $sym63$STRENGTH;
    return ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list( truth, ConsesLow.list( $sym64$TV_TRUTH, tv ) ), ConsesLow.list( strength, ConsesLow.list( $sym65$TV_STRENGTH, tv ) ) ), ConsesLow.list(
        $sym66$WITH_GT_ARGS_UNSWAPPED, ConsesLow.list( $sym43$DO_GHL_RELEVANT_DIRECTIONS, ConsesLow.list( search_direction, direction, $kw11$DONE_VAR, done_var ), ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow
            .list( index_argnum, ConsesLow.list( $sym67$GT_INDEX_ARGNUM_FOR_DIRECTION, search_direction ) ), ConsesLow.list( gather_argnum, ConsesLow.list( $sym68$OTHER_BINARY_ARG, index_argnum ) ) ), ConsesLow.list(
                $sym69$DO_GT_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[]
                { assertion, node, pred, $kw70$INDEX, index_argnum, $kw71$TRUTH, truth, $kw53$DONE, done_var
                } ), ConsesLow.list( $sym72$PUNLESS, ConsesLow.list( $sym73$ACCESSIBLE_LINK_NODE_SENTENCE_IRRELEVANT_, assertion, strength ), ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( link_node_var,
                    ConsesLow.list( $sym74$FORMULA_ARG, assertion, gather_argnum ) ), ConsesLow.list( assertion_var, assertion ) ), ConsesLow.append( body, NIL ) ) ) ), ConsesLow.list( $sym46$PWHEN, $list75, ConsesLow
                        .list( $sym76$WITH_GT_ARGS_SWAPPED, ConsesLow.list( $sym69$DO_GT_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[]
                        { assertion, node, pred, $kw70$INDEX, gather_argnum, $kw71$TRUTH, truth, $kw53$DONE, done_var
        } ), ConsesLow.list( $sym72$PUNLESS, ConsesLow.list( $sym73$ACCESSIBLE_LINK_NODE_SENTENCE_IRRELEVANT_, assertion, strength ), ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( link_node_var, ConsesLow
            .list( $sym74$FORMULA_ARG, assertion, index_argnum ) ), ConsesLow.list( assertion_var, assertion ) ), ConsesLow.append( body, NIL ) ) ) ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 6008L)
  public static SubLObject accessible_link_node_sentence_irrelevantP(final SubLObject sentence, final SubLObject strength)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( sentence ) && ( NIL != assertion_utilities.excepted_assertionP( sentence, UNPROVIDED, UNPROVIDED ) || NIL == enumeration_types.el_strength_implies(
        assertions_high.assertion_strength( sentence ), strength ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 6413L)
  public static SubLObject relevant_pred_wrt_gtP(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return gt_relevant_predP( predicate, $gt_relevant_pred$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 6524L)
  public static SubLObject do_gt_gaf_arg_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
    pred = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list77 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list77 );
      if( NIL == conses_high.member( current_$5, $list78, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw7$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list77 );
    }
    final SubLObject index_tail = cdestructuring_bind.property_list_member( $kw70$INDEX, current );
    final SubLObject index = ( NIL != index_tail ) ? conses_high.cadr( index_tail ) : NIL;
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw71$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw53$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject var_mt = $sym79$VAR_MT;
    return ConsesLow.list( $sym80$PROGN, ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym81$_GT_RELEVANT_PRED_, pred ) ), ConsesLow.list( $sym82$WITH_PREDICATE_FUNCTION, $list83, ConsesLow.listS(
        $sym84$DO_GAF_ARG_INDEX, ConsesLow.list( var, v_term, $kw70$INDEX, index, $kw71$TRUTH, truth, $kw53$DONE, done ), ConsesLow.append( body, NIL ) ) ) ), ConsesLow.list( $sym85$PWHEN_FEATURE, $kw86$CYC_SKSI,
            ConsesLow.list( $sym46$PWHEN, $list87, ConsesLow.list( $sym88$WITH_SKSI_GT_SEARCH_PRED, pred, ConsesLow.listS( $sym89$DO_SKSI_GAF_ARG_INDEX_RELEVANT_PRED, ConsesLow.list( new SubLObject[]
            { var, var_mt, v_term, $kw90$INDEX_ARGNUM, index, $kw71$TRUTH, truth, $kw53$DONE, done
            } ), ConsesLow.list( $sym26$IGNORE, var_mt ), ConsesLow.append( body, NIL ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 7209L)
  public static SubLObject gt_predicate_p(final SubLObject pred)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 7312L)
  public static SubLObject gt_index_argnum_for_direction(final SubLObject direction)
  {
    if( direction.eql( $kw91$FORWARD ) )
    {
      return ONE_INTEGER;
    }
    if( direction.eql( $kw92$BACKWARD ) )
    {
      return TWO_INTEGER;
    }
    ghl_search_vars.ghl_error( ONE_INTEGER, $str93$Invalid_direction__a, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 7513L)
  public static SubLObject gt_relevant_predP(final SubLObject pred, final SubLObject search_pred)
  {
    if( NIL == ghl_search_vars.ghl_uses_spec_preds_p() )
    {
      return Equality.eql( pred, search_pred );
    }
    if( NIL != ghl_search_vars.gt_args_swapped_p() )
    {
      return predicate_relevance_cache.cached_spec_inverseP( search_pred, pred, UNPROVIDED );
    }
    return predicate_relevance_cache.cached_spec_predP( search_pred, pred, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 7770L)
  public static SubLObject all_possibly_relevant_gt_preds()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = $gt_relevant_pred$.getDynamicValue( thread );
    if( NIL == ghl_search_vars.ghl_uses_spec_preds_p() )
    {
      return ConsesLow.list( pred );
    }
    if( NIL != ghl_search_vars.gt_args_swapped_p() )
    {
      return genl_predicates.all_spec_inverses( pred, UNPROVIDED, UNPROVIDED );
    }
    return genl_predicates.all_spec_preds( pred, UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_ghl_link_iterators_file()
  {
    SubLFiles.declareMacro( me, "with_ghl_link_pred_and_direction", "WITH-GHL-LINK-PRED-AND-DIRECTION" );
    SubLFiles.declareMacro( me, "with_new_ghl_link_pred_and_direction", "WITH-NEW-GHL-LINK-PRED-AND-DIRECTION" );
    SubLFiles.declareFunction( me, "get_ghl_link_pred", "GET-GHL-LINK-PRED", 0, 0, false );
    SubLFiles.declareFunction( me, "get_ghl_link_direction", "GET-GHL-LINK-DIRECTION", 0, 0, false );
    SubLFiles.declareMacro( me, "do_ghl_accessible_link_nodes", "DO-GHL-ACCESSIBLE-LINK-NODES" );
    SubLFiles.declareFunction( me, "ghl_make_sbhl_support", "GHL-MAKE-SBHL-SUPPORT", 4, 0, false );
    SubLFiles.declareMacro( me, "do_sbhl_accessible_link_nodes", "DO-SBHL-ACCESSIBLE-LINK-NODES" );
    SubLFiles.declareMacro( me, "do_gt_accessible_link_nodes", "DO-GT-ACCESSIBLE-LINK-NODES" );
    SubLFiles.declareFunction( me, "accessible_link_node_sentence_irrelevantP", "ACCESSIBLE-LINK-NODE-SENTENCE-IRRELEVANT?", 2, 0, false );
    SubLFiles.declareFunction( me, "relevant_pred_wrt_gtP", "RELEVANT-PRED-WRT-GT?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_gt_gaf_arg_index", "DO-GT-GAF-ARG-INDEX" );
    SubLFiles.declareFunction( me, "gt_predicate_p", "GT-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "gt_index_argnum_for_direction", "GT-INDEX-ARGNUM-FOR-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "gt_relevant_predP", "GT-RELEVANT-PRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "all_possibly_relevant_gt_preds", "ALL-POSSIBLY-RELEVANT-GT-PREDS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_ghl_link_iterators_file()
  {
    $ghl_link_pred$ = SubLFiles.defparameter( "*GHL-LINK-PRED*", NIL );
    $ghl_link_direction$ = SubLFiles.defparameter( "*GHL-LINK-DIRECTION*", NIL );
    $gt_relevant_pred$ = SubLFiles.defparameter( "*GT-RELEVANT-PRED*", NIL );
    return NIL;
  }

  public static SubLObject setup_ghl_link_iterators_file()
  {
    access_macros.register_macro_helper( $sym20$GHL_MAKE_SBHL_SUPPORT, $sym27$DO_GHL_ACCESSIBLE_LINK_NODES );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ghl_link_iterators_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ghl_link_iterators_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ghl_link_iterators_file();
  }
  static
  {
    me = new ghl_link_iterators();
    $ghl_link_pred$ = null;
    $ghl_link_direction$ = null;
    $gt_relevant_pred$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "DIRECTION" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$CLET = makeSymbol( "CLET" );
    $sym2$_GHL_LINK_PRED_ = makeSymbol( "*GHL-LINK-PRED*" );
    $sym3$_GHL_LINK_DIRECTION_ = makeSymbol( "*GHL-LINK-DIRECTION*" );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GHL-LINK-PRED*" ), NIL ), ConsesLow.list( makeSymbol( "*GHL-LINK-DIRECTION*" ), NIL ) );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "NODE" ), makeSymbol( "PREDICATES" ), makeSymbol( "DIRECTIONS" ), makeSymbol( "&KEY" ), makeSymbol( "SUPPORT-VAR" ), ConsesLow.list(
        makeSymbol( "TV" ), makeKeyword( "TRUE-DEF" ) ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list6 = ConsesLow.list( makeKeyword( "SUPPORT-VAR" ), makeKeyword( "TV" ), makeKeyword( "DONE-VAR" ) );
    $kw7$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw8$SUPPORT_VAR = makeKeyword( "SUPPORT-VAR" );
    $kw9$TV = makeKeyword( "TV" );
    $kw10$TRUE_DEF = makeKeyword( "TRUE-DEF" );
    $kw11$DONE_VAR = makeKeyword( "DONE-VAR" );
    $sym12$PRED = makeUninternedSymbol( "PRED" );
    $sym13$DIRECTION = makeUninternedSymbol( "DIRECTION" );
    $sym14$CDOLIST_MULTIPLE = makeSymbol( "CDOLIST-MULTIPLE" );
    $sym15$WITH_GHL_LINK_PRED_AND_DIRECTION = makeSymbol( "WITH-GHL-LINK-PRED-AND-DIRECTION" );
    $sym16$PCOND = makeSymbol( "PCOND" );
    $sym17$SBHL_PREDICATE_P = makeSymbol( "SBHL-PREDICATE-P" );
    $sym18$DO_SBHL_ACCESSIBLE_LINK_NODES = makeSymbol( "DO-SBHL-ACCESSIBLE-LINK-NODES" );
    $sym19$GET_SBHL_MODULE = makeSymbol( "GET-SBHL-MODULE" );
    $sym20$GHL_MAKE_SBHL_SUPPORT = makeSymbol( "GHL-MAKE-SBHL-SUPPORT" );
    $sym21$GT_PREDICATE_P = makeSymbol( "GT-PREDICATE-P" );
    $sym22$DO_GT_ACCESSIBLE_LINK_NODES = makeSymbol( "DO-GT-ACCESSIBLE-LINK-NODES" );
    $sym23$PRED = makeUninternedSymbol( "PRED" );
    $sym24$DIRECTION = makeUninternedSymbol( "DIRECTION" );
    $sym25$SUPPORT_VAR = makeUninternedSymbol( "SUPPORT-VAR" );
    $sym26$IGNORE = makeSymbol( "IGNORE" );
    $sym27$DO_GHL_ACCESSIBLE_LINK_NODES = makeSymbol( "DO-GHL-ACCESSIBLE-LINK-NODES" );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "START-NODE" ), makeSymbol( "MODULE" ), makeSymbol( "DIRECTION" ), makeSymbol( "&KEY" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list29 = ConsesLow.list( makeKeyword( "DONE-VAR" ) );
    $sym30$LINK_NODES_VAR = makeUninternedSymbol( "LINK-NODES-VAR" );
    $sym31$SEARCH_DIRECTION = makeUninternedSymbol( "SEARCH-DIRECTION" );
    $sym32$LINK_DIRECTION = makeUninternedSymbol( "LINK-DIRECTION" );
    $sym33$D_LINK = makeUninternedSymbol( "D-LINK" );
    $sym34$MT = makeUninternedSymbol( "MT" );
    $sym35$TV_LINKS = makeUninternedSymbol( "TV-LINKS" );
    $sym36$TV = makeUninternedSymbol( "TV" );
    $sym37$NODE = makeUninternedSymbol( "NODE" );
    $sym38$NAUT_TO_NART = makeSymbol( "NAUT-TO-NART" );
    $sym39$WITH_SBHL_SEARCH_MODULE = makeSymbol( "WITH-SBHL-SEARCH-MODULE" );
    $sym40$POSSIBLY_FLIP_GENL_INVERSE_MODE = makeSymbol( "POSSIBLY-FLIP-GENL-INVERSE-MODE" );
    $sym41$FORT_P = makeSymbol( "FORT-P" );
    $sym42$WITH_SBHL_GRAPH_LINK = makeSymbol( "WITH-SBHL-GRAPH-LINK" );
    $sym43$DO_GHL_RELEVANT_DIRECTIONS = makeSymbol( "DO-GHL-RELEVANT-DIRECTIONS" );
    $sym44$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION = makeSymbol( "SBHL-SEARCH-DIRECTION-TO-LINK-DIRECTION" );
    $sym45$DO_SBHL_DIRECTION_LINK = makeSymbol( "DO-SBHL-DIRECTION-LINK" );
    $sym46$PWHEN = makeSymbol( "PWHEN" );
    $sym47$RELEVANT_MT_ = makeSymbol( "RELEVANT-MT?" );
    $sym48$_SBHL_LINK_MT_ = makeSymbol( "*SBHL-LINK-MT*" );
    $sym49$DO_SBHL_TV_LINKS = makeSymbol( "DO-SBHL-TV-LINKS" );
    $sym50$RELEVANT_SBHL_TV_ = makeSymbol( "RELEVANT-SBHL-TV?" );
    $sym51$_SBHL_LINK_TV_ = makeSymbol( "*SBHL-LINK-TV*" );
    $sym52$DO_SET_OR_LIST = makeSymbol( "DO-SET-OR-LIST" );
    $kw53$DONE = makeKeyword( "DONE" );
    $sym54$CLOSED_NAUT_ = makeSymbol( "CLOSED-NAUT?" );
    $sym55$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS = makeSymbol( "DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS" );
    $list56 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "ASSERTION-VAR" ), makeSymbol( "NODE" ), makeSymbol( "PRED" ), makeSymbol( "DIRECTION" ), makeSymbol( "&KEY" ), ConsesLow.list(
        makeSymbol( "TV" ), makeKeyword( "TRUE-DEF" ) ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list57 = ConsesLow.list( makeKeyword( "TV" ), makeKeyword( "DONE-VAR" ) );
    $sym58$SEARCH_DIRECTION = makeUninternedSymbol( "SEARCH-DIRECTION" );
    $sym59$INDEX_ARGNUM = makeUninternedSymbol( "INDEX-ARGNUM" );
    $sym60$GATHER_ARGNUM = makeUninternedSymbol( "GATHER-ARGNUM" );
    $sym61$ASSERTION = makeUninternedSymbol( "ASSERTION" );
    $sym62$TRUTH = makeUninternedSymbol( "TRUTH" );
    $sym63$STRENGTH = makeUninternedSymbol( "STRENGTH" );
    $sym64$TV_TRUTH = makeSymbol( "TV-TRUTH" );
    $sym65$TV_STRENGTH = makeSymbol( "TV-STRENGTH" );
    $sym66$WITH_GT_ARGS_UNSWAPPED = makeSymbol( "WITH-GT-ARGS-UNSWAPPED" );
    $sym67$GT_INDEX_ARGNUM_FOR_DIRECTION = makeSymbol( "GT-INDEX-ARGNUM-FOR-DIRECTION" );
    $sym68$OTHER_BINARY_ARG = makeSymbol( "OTHER-BINARY-ARG" );
    $sym69$DO_GT_GAF_ARG_INDEX = makeSymbol( "DO-GT-GAF-ARG-INDEX" );
    $kw70$INDEX = makeKeyword( "INDEX" );
    $kw71$TRUTH = makeKeyword( "TRUTH" );
    $sym72$PUNLESS = makeSymbol( "PUNLESS" );
    $sym73$ACCESSIBLE_LINK_NODE_SENTENCE_IRRELEVANT_ = makeSymbol( "ACCESSIBLE-LINK-NODE-SENTENCE-IRRELEVANT?" );
    $sym74$FORMULA_ARG = makeSymbol( "FORMULA-ARG" );
    $list75 = ConsesLow.list( makeSymbol( "GHL-USES-SPEC-PREDS-P" ) );
    $sym76$WITH_GT_ARGS_SWAPPED = makeSymbol( "WITH-GT-ARGS-SWAPPED" );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "&KEY" ), makeSymbol( "INDEX" ), makeSymbol( "TRUTH" ), makeSymbol( "DONE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list78 = ConsesLow.list( makeKeyword( "INDEX" ), makeKeyword( "TRUTH" ), makeKeyword( "DONE" ) );
    $sym79$VAR_MT = makeUninternedSymbol( "VAR-MT" );
    $sym80$PROGN = makeSymbol( "PROGN" );
    $sym81$_GT_RELEVANT_PRED_ = makeSymbol( "*GT-RELEVANT-PRED*" );
    $sym82$WITH_PREDICATE_FUNCTION = makeSymbol( "WITH-PREDICATE-FUNCTION" );
    $list83 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-PRED-WRT-GT?" ) );
    $sym84$DO_GAF_ARG_INDEX = makeSymbol( "DO-GAF-ARG-INDEX" );
    $sym85$PWHEN_FEATURE = makeSymbol( "PWHEN-FEATURE" );
    $kw86$CYC_SKSI = makeKeyword( "CYC-SKSI" );
    $list87 = ConsesLow.list( makeSymbol( "GT-USE-SKSI?" ) );
    $sym88$WITH_SKSI_GT_SEARCH_PRED = makeSymbol( "WITH-SKSI-GT-SEARCH-PRED" );
    $sym89$DO_SKSI_GAF_ARG_INDEX_RELEVANT_PRED = makeSymbol( "DO-SKSI-GAF-ARG-INDEX-RELEVANT-PRED" );
    $kw90$INDEX_ARGNUM = makeKeyword( "INDEX-ARGNUM" );
    $kw91$FORWARD = makeKeyword( "FORWARD" );
    $kw92$BACKWARD = makeKeyword( "BACKWARD" );
    $str93$Invalid_direction__a = makeString( "Invalid direction ~a" );
  }
}
/*
 * 
 * Total time: 217 ms
 * 
 */