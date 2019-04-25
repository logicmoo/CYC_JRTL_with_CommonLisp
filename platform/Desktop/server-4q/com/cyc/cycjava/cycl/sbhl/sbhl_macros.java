package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_macros";
  public static final String myFingerPrint = "af88cc3372f3175345b4048796df66fbefe0c421bc099d61a512ca56285d041d";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$LINK_NODES;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLSymbol $sym3$GET_SBHL_LINK_NODES;
  private static final SubLSymbol $sym4$PWHEN;
  private static final SubLSymbol $sym5$DO_SET_OR_LIST;
  private static final SubLSymbol $kw6$DONE;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$DO_DICTIONARY;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$TV_LINKS;
  private static final SubLSymbol $sym11$GET_SBHL_TV_LINKS;
  private static final SubLSymbol $sym12$DO_SBHL_TV_LINKS;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$MT_LINKS;
  private static final SubLSymbol $sym16$GET_SBHL_MT_LINKS;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$D_LINK;
  private static final SubLSymbol $sym19$GET_SBHL_GRAPH_LINK;
  private static final SubLSymbol $sym20$DO_RELEVANT_SBHL_DIRECTIONS;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$DIRECTION;
  private static final SubLSymbol $sym23$MT_LINKS;
  private static final SubLSymbol $sym24$TV_LINKS;
  private static final SubLSymbol $sym25$POSSIBLY_WITH_SBHL_MODULE;
  private static final SubLSymbol $sym26$WITH_SBHL_FORWARD_LINK_DIRECTION_FOR_MODULE;
  private static final SubLSymbol $sym27$DO_SBHL_GRAPH_LINK;
  private static final SubLSymbol $sym28$SBHL_FORWARD_DIRECTION_FOR_MODULE_P;
  private static final SubLSymbol $sym29$DO_SBHL_MT_LINKS;
  private static final SubLSymbol $sym30$ANY_SBHL_TRUE_LINK_NODES_P;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$DIRECTION;
  private static final SubLSymbol $sym33$MT_LINKS;
  private static final SubLSymbol $sym34$TV_LINKS;
  private static final SubLSymbol $sym35$TV;
  private static final SubLSymbol $sym36$LINK_NODES;
  private static final SubLSymbol $sym37$SBHL_TRUE_TV_P;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$MT_LINKS;
  private static final SubLSymbol $sym40$TV_LINKS;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$LINK_NODES_VAR;
  private static final SubLSymbol $sym43$DO_ALL_SBHL_TV_LINKS;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$LINK_NODES_VAR;
  private static final SubLSymbol $sym46$DIRECTION;
  private static final SubLSymbol $sym47$MT_LINKS;
  private static final SubLSymbol $sym48$TV_LINKS;
  private static final SubLSymbol $sym49$GET_SBHL_MODULE_FORWARD_DIRECTION;
  private static final SubLSymbol $sym50$LINK_NODES_VAR;
  private static final SubLSymbol $sym51$DIRECTION;
  private static final SubLSymbol $sym52$MT_LINKS;
  private static final SubLSymbol $sym53$TV_LINKS;
  private static final SubLSymbol $sym54$GET_SBHL_MODULE_BACKWARD_DIRECTION;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$PIF;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$NODE;
  private static final SubLSymbol $sym60$NAUT_TO_NART;
  private static final SubLSymbol $sym61$PCOND;
  private static final SubLSymbol $sym62$SBHL_NODE_OBJECT_P;
  private static final SubLSymbol $sym63$WITH_RELEVANT_SBHL_FORT_LINK_NODES;
  private static final SubLSymbol $sym64$CNAT_P;
  private static final SubLSymbol $sym65$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS;
  private static final SubLSymbol $sym66$NODE;
  private static final SubLSymbol $sym67$WITH_SBHL_NON_FORT_LINKS;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$D_LINK;
  private static final SubLSymbol $sym70$MT;
  private static final SubLSymbol $sym71$TV_LINKS;
  private static final SubLSymbol $sym72$TV;
  private static final SubLSymbol $sym73$WITH_SBHL_GRAPH_LINK;
  private static final SubLSymbol $sym74$DO_SBHL_DIRECTION_LINK;
  private static final SubLSymbol $sym75$RELEVANT_MT_;
  private static final SubLSymbol $sym76$_SBHL_LINK_MT_;
  private static final SubLSymbol $sym77$RELEVANT_SBHL_TV_;
  private static final SubLSymbol $sym78$_SBHL_LINK_TV_;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$INSTANCE_TUPLE;
  private static final SubLSymbol $sym81$CSOME;
  private static final SubLSymbol $sym82$NON_FORT_INSTANCE_TABLE_LOOKUP;
  private static final SubLSymbol $sym83$CDESTRUCTURING_BIND;
  private static final SubLList $list84;
  private static final SubLSymbol $sym85$LINK_NODE;
  private static final SubLSymbol $sym86$MT;
  private static final SubLSymbol $sym87$TV;
  private static final SubLSymbol $sym88$DO_SBHL_NON_FORT_LINKS_;
  private static final SubLSymbol $sym89$DO_NON_FORT_DIRECT_INSTANCE_LINKS;
  private static final SubLSymbol $sym90$LIST;
  private static final SubLSymbol $sym91$DO_SBHL_NON_FORT_LINKS;
  private static final SubLObject $const92$isa;
  private static final SubLSymbol $sym93$ADMISSIBLE_NON_FORT_LINK_NODE_;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$GENERATING_FN;
  private static final SubLSymbol $sym96$SBHL_CSOME;
  private static final SubLSymbol $sym97$GET_SBHL_MODULE_RELEVANT_NAUT_LINK_GENERATORS;
  private static final SubLSymbol $sym98$_SBHL_TV_;
  private static final SubLSymbol $sym99$_SBHL_LINK_GENERATOR_;
  private static final SubLSymbol $sym100$FUNCALL;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE;
  private static final SubLSymbol $sym103$POSSIBLY_WITH_SBHL_TV;
  private static final SubLSymbol $sym104$WITH_RELEVANT_SBHL_LINK_NODES;
  private static final SubLSymbol $sym105$DO_WITH_RELEVANT_SBHL_MODULES;
  private static final SubLSymbol $sym106$POSSIBLY_FLIP_GENL_INVERSE_MODE;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$WITH_RELEVANT_SBHL_LINK_NODES_AND_NON_FORTS;
  private static final SubLList $list109;
  private static final SubLSymbol $sym110$LINK_NODES;
  private static final SubLSymbol $sym111$WITH_ACCESSIBLE_SBHL_LINK_NODES;
  private static final SubLSymbol $sym112$LINK_NODES;
  private static final SubLSymbol $sym113$WITH_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS;
  private static final SubLList $list114;
  private static final SubLList $list115;
  private static final SubLSymbol $kw116$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $sym117$DO_SBHL_ITERATOR;
  private static final SubLSymbol $sym118$NEW_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR;
  private static final SubLList $list119;
  private static final SubLSymbol $sym120$LINK_NODES;
  private static final SubLList $list121;
  private static final SubLSymbol $sym122$DO_RELEVANT_SBHL_LINK_NODES;
  private static final SubLList $list123;
  private static final SubLSymbol $sym124$SMART_CSOME;
  private static final SubLList $list125;
  private static final SubLSymbol $sym126$MODULE;
  private static final SubLSymbol $sym127$DO_SBHL_MODULES;
  private static final SubLSymbol $sym128$PUNLESS;
  private static final SubLSymbol $sym129$SBHL_TIME_MODULE_P;
  private static final SubLSymbol $sym130$GET_SBHL_LINK_PRED;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$MODULE;
  private static final SubLList $list133;
  private static final SubLSymbol $sym134$GET_SBHL_MODULE_GRAPH;
  private static final SubLList $list135;
  private static final SubLList $list136;
  private static final SubLList $list137;
  private static final SubLSymbol $sym138$COR;
  private static final SubLList $list139;
  private static final SubLSymbol $sym140$APPLY_SBHL_MODULE_TYPE_TEST;
  private static final SubLList $list141;
  private static final SubLSymbol $sym142$PROGN;
  private static final SubLSymbol $sym143$SBHL_WARN;
  private static final SubLString $str144$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLList $list145;
  private static final SubLList $list146;
  private static final SubLSymbol $sym147$DO_SBHL_GRAPH_LINKS;
  private static final SubLSymbol $kw148$MODULE;
  private static final SubLList $list149;
  private static final SubLSymbol $sym150$MODULE_VAR;
  private static final SubLSymbol $sym151$ACCESSIBLE_MODULES;
  private static final SubLSymbol $sym152$GET_SBHL_ACCESSIBLE_MODULES;
  private static final SubLSymbol $sym153$WITH_SBHL_MODULE;
  private static final SubLSymbol $sym154$SBHL_MODULE_P;
  private static final SubLSymbol $sym155$GET_SBHL_MODULE;
  private static final SubLList $list156;
  private static final SubLSymbol $sym157$GET_RELEVANT_SBHL_DIRECTIONS;
  private static final SubLList $list158;
  private static final SubLSymbol $sym159$PREMARKING_;
  private static final SubLSymbol $sym160$GOAL_FN;
  private static final SubLSymbol $sym161$GOAL_NODE;
  private static final SubLSymbol $sym162$GOAL_SPACE;
  private static final SubLList $list163;
  private static final SubLList $list164;
  private static final SubLList $list165;
  private static final SubLList $list166;
  private static final SubLSymbol $sym167$POSSIBLY_PREMARK_WITH_GENL_INVERSE_MODE;
  private static final SubLSymbol $sym168$SBHL_PREMARK_GATHER_NODES;
  private static final SubLSymbol $sym169$CSETQ;
  private static final SubLList $list170;
  private static final SubLList $list171;
  private static final SubLSymbol $sym172$RESET_SBHL_SEARCH_PARENT_MARKING;
  private static final SubLSymbol $sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE;
  private static final SubLSymbol $sym174$WITH_SBHL_CONSIDER_NODE_FN;
  private static final SubLSymbol $sym175$WITH_SBHL_GOAL_NODE;
  private static final SubLSymbol $sym176$WITH_SBHL_GOAL_SPACE;
  private static final SubLList $list177;
  private static final SubLList $list178;
  private static final SubLSymbol $sym179$_SBHL_TEMPORALITY_SEARCH_PASSED_THROUGH_DATE__;
  private static final SubLSymbol $sym180$FWHEN;
  private static final SubLList $list181;
  private static final SubLSymbol $sym182$HL_DATE_POINT_P;
  private static final SubLList $list183;
  private static final SubLSymbol $sym184$CAND;
  private static final SubLSymbol $sym185$SBHL_TEMPORALITY_CONSEQUENT_LINKS_SEARCH_PASSED_THROUGH_LINK_P;
  private static final SubLSymbol $sym186$SBHL_TEMPORAL_FAUX_LINK;
  private static final SubLList $list187;
  private static final SubLList $list188;
  private static final SubLSymbol $kw189$BREADTH;
  private static final SubLSymbol $sym190$NODE_VAR;
  private static final SubLSymbol $sym191$DECK_TYPE;
  private static final SubLSymbol $sym192$RECUR_DECK;
  private static final SubLSymbol $sym193$NODE_VARS_LINK_NODE;
  private static final SubLSymbol $sym194$FIF;
  private static final SubLList $list195;
  private static final SubLList $list196;
  private static final SubLSymbol $sym197$CREATE_DECK;
  private static final SubLSymbol $sym198$WITH_NEW_SBHL_SPACE;
  private static final SubLSymbol $sym199$POSSIBLY_WITH_SBHL_TRUE_TV;
  private static final SubLSymbol $sym200$WITH_SBHL_SEARCH_MODULE;
  private static final SubLSymbol $sym201$WITH_SBHL_TYPE_TEST;
  private static final SubLSymbol $sym202$WITH_SBHL_SEARCH_DIRECTION;
  private static final SubLSymbol $sym203$WITH_SBHL_LINK_DIRECTION;
  private static final SubLSymbol $sym204$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION;
  private static final SubLSymbol $sym205$SBHL_MARK_NODE_MARKED;
  private static final SubLSymbol $sym206$WHILE;
  private static final SubLSymbol $sym207$CNOT;
  private static final SubLSymbol $sym208$DO_ACCESSIBLE_SBHL_LINK_NODES;
  private static final SubLList $list209;
  private static final SubLSymbol $sym210$SBHL_SEARCH_PATH_TERMINATION_P;
  private static final SubLSymbol $sym211$DECK_PUSH;
  private static final SubLSymbol $sym212$DECK_POP;
  private static final SubLList $list213;
  private static final SubLSymbol $sym214$DO_ALL_SIMPLE_TRUE_LINKS;
  private static final SubLList $list215;
  private static final SubLList $list216;
  private static final SubLList $list217;
  private static final SubLSymbol $kw218$DEPTH;
  private static final SubLSymbol $sym219$NODE_VAR;
  private static final SubLSymbol $sym220$NODE_AND_PREDICATE_MODE;
  private static final SubLSymbol $sym221$PREDICATE_MODE;
  private static final SubLSymbol $sym222$DECK_TYPE;
  private static final SubLSymbol $sym223$RECUR_DECK;
  private static final SubLSymbol $sym224$NODE_VARS_LINK_NODE;
  private static final SubLList $list225;
  private static final SubLList $list226;
  private static final SubLList $list227;
  private static final SubLSymbol $sym228$FIRST;
  private static final SubLSymbol $sym229$SECOND;
  private static final SubLSymbol $sym230$WITH_SBHL_PREDICATE_MODE;
  private static final SubLSymbol $sym231$APPLY_SBHL_ADD_NODE_TEST;
  private static final SubLList $list232;
  private static final SubLSymbol $sym233$DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES;
  private static final SubLList $list234;
  private static final SubLSymbol $sym235$NODE_VAR;
  private static final SubLSymbol $sym236$NODE_AND_PREDICATE_MODE;
  private static final SubLSymbol $sym237$PREDICATE_MODE;
  private static final SubLSymbol $sym238$DECK_TYPE;
  private static final SubLSymbol $sym239$RECUR_DECK;
  private static final SubLSymbol $sym240$NODE_VARS_LINK_NODE;
  private static final SubLList $list241;
  private static final SubLSymbol $sym242$DO_ALL_MODE_TRUE_LINKS_FOR_INVERSES;
  private static final SubLSymbol $sym243$NODE_VAR;
  private static final SubLSymbol $sym244$DECK_TYPE;
  private static final SubLSymbol $sym245$RECUR_DECK;
  private static final SubLSymbol $sym246$NODE_VARS_LINK_NODE;
  private static final SubLSymbol $sym247$WITH_SBHL_FORWARD_SEARCH_DIRECTION;
  private static final SubLSymbol $sym248$WITH_SBHL_FORWARD_LINK_DIRECTION;
  private static final SubLSymbol $sym249$NODE_VAR;
  private static final SubLSymbol $sym250$TT_NODE_VAR;
  private static final SubLSymbol $sym251$WITH_NEW_SBHL_GATHER_SPACE;
  private static final SubLSymbol $sym252$GET_SBHL_TRANSFERS_THROUGH_MODULE;
  private static final SubLSymbol $sym253$DO_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS;
  private static final SubLList $list254;
  private static final SubLSymbol $sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES;
  private static final SubLList $list256;
  private static final SubLList $list257;
  private static final SubLSymbol $sym258$DO_RELEVANT_FORWARD_SBHL_LINK_NODES;
  private static final SubLList $list259;
  private static final SubLList $list260;
  private static final SubLSymbol $kw261$MT;
  private static final SubLSymbol $sym262$MT_VAR;
  private static final SubLSymbol $sym263$TV_VAR;
  private static final SubLSymbol $sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE;
  private static final SubLSymbol $sym265$DO_TRUE_ISA_LINKS;
  private static final SubLSymbol $sym266$IGNORE;
  private static final SubLList $list267;
  private static final SubLSymbol $sym268$LINK_NODES;
  private static final SubLList $list269;
  private static final SubLList $list270;
  private static final SubLSymbol $sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES;
  private static final SubLList $list272;
  private static final SubLSymbol $sym273$DO_RELEVANT_BACKWARD_SBHL_LINK_NODES;
  private static final SubLList $list274;
  private static final SubLSymbol $sym275$MT_VAR;
  private static final SubLSymbol $sym276$TV_VAR;
  private static final SubLSymbol $sym277$DO_TRUE_INSTANCE_LINKS;
  private static final SubLList $list278;
  private static final SubLList $list279;
  private static final SubLList $list280;
  private static final SubLSymbol $sym281$MT_VAR;
  private static final SubLSymbol $sym282$TV_VAR;
  private static final SubLSymbol $sym283$DO_TRUE_QUOTED_ISA_LINKS;
  private static final SubLList $list284;
  private static final SubLSymbol $sym285$MT_VAR;
  private static final SubLSymbol $sym286$TV_VAR;
  private static final SubLSymbol $sym287$DO_TRUE_QUOTED_INSTANCE_LINKS;
  private static final SubLList $list288;
  private static final SubLSymbol $sym289$DO_ALL_FORWARD_TRUE_LINKS_FOR_TT;
  private static final SubLList $list290;
  private static final SubLList $list291;
  private static final SubLSymbol $sym292$ISAS;
  private static final SubLSymbol $sym293$WITH_MT;
  private static final SubLSymbol $sym294$SORT_BY_GENERALITY_ESTIMATE;
  private static final SubLSymbol $sym295$ALL_ISA;
  private static final SubLList $list296;
  private static final SubLSymbol $sym297$DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT;
  private static final SubLSymbol $sym298$DO_ALL_INSTANCES;
  private static final SubLString $str299$Iterator___see_do_all_simple_back;
  private static final SubLList $list300;
  private static final SubLSymbol $sym301$FORT_P;
  private static final SubLSymbol $sym302$DO_ALL_FORT_INSTANCES;
  private static final SubLString $str303$Like__xref_do_all_instances_excep;
  private static final SubLList $list304;
  private static final SubLSymbol $sym305$TERMS_VAR;
  private static final SubLSymbol $sym306$ALL_ISA_;
  private static final SubLSymbol $sym307$REST;
  private static final SubLSymbol $sym308$DO_ALL_QUOTED_INSTANCES;
  private static final SubLSymbol $sym309$DO_ALL_FORT_QUOTED_INSTANCES;
  private static final SubLSymbol $sym310$TERMS_VAR;
  private static final SubLSymbol $sym311$ALL_QUOTED_ISA_;
  private static final SubLList $list312;
  private static final SubLList $list313;
  private static final SubLList $list314;
  private static final SubLList $list315;
  private static final SubLSymbol $sym316$DUMMY;
  private static final SubLSymbol $sym317$DO_TRUE_GENLS_LINKS;
  private static final SubLList $list318;
  private static final SubLSymbol $sym319$MT_VAR;
  private static final SubLSymbol $sym320$TV_VAR;
  private static final SubLList $list321;
  private static final SubLList $list322;
  private static final SubLList $list323;
  private static final SubLSymbol $sym324$MT_VAR;
  private static final SubLSymbol $sym325$TV_VAR;
  private static final SubLSymbol $sym326$DO_TRUE_SPEC_LINKS;
  private static final SubLList $list327;
  private static final SubLSymbol $sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS;
  private static final SubLList $list329;
  private static final SubLList $list330;
  private static final SubLSymbol $sym331$GENLS;
  private static final SubLSymbol $sym332$ALL_GENLS;
  private static final SubLList $list333;
  private static final SubLSymbol $sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS;
  private static final SubLList $list335;
  private static final SubLList $list336;
  private static final SubLSymbol $sym337$SPECS;
  private static final SubLSymbol $sym338$NREVERSE;
  private static final SubLSymbol $sym339$ALL_SPECS;
  private static final SubLList $list340;
  private static final SubLList $list341;
  private static final SubLList $list342;
  private static final SubLList $list343;
  private static final SubLList $list344;
  private static final SubLList $list345;
  private static final SubLSymbol $sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES;
  private static final SubLList $list347;
  private static final SubLList $list348;
  private static final SubLSymbol $sym349$DO_ALL_MODE_FORWARD_TRUE_LINKS_FOR_INVERSES;
  private static final SubLList $list350;
  private static final SubLSymbol $sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES;
  private static final SubLList $list352;
  private static final SubLList $list353;
  private static final SubLSymbol $sym354$DO_ALL_MODE_BACKWARD_TRUE_LINKS_FOR_INVERSES;
  private static final SubLSymbol $sym355$ALL_PROPER_GENL_PREDICATES;
  private static final SubLList $list356;
  private static final SubLSymbol $sym357$ALL_PROPER_GENL_INVERSES;
  private static final SubLList $list358;
  private static final SubLList $list359;
  private static final SubLList $list360;
  private static final SubLList $list361;
  private static final SubLList $list362;
  private static final SubLList $list363;
  private static final SubLList $list364;
  private static final SubLList $list365;
  private static final SubLList $list366;
  private static final SubLSymbol $sym367$DO_ALL_PREDS_AND_INVERSES;
  private static final SubLList $list368;
  private static final SubLSymbol $sym369$MODULE;
  private static final SubLSymbol $sym370$NODE_VAR;
  private static final SubLSymbol $sym371$NODE_AND_PREDICATE_MODE;
  private static final SubLSymbol $sym372$PREDICATE_MODE;
  private static final SubLSymbol $sym373$DECK_TYPE;
  private static final SubLSymbol $sym374$RECUR_DECK;
  private static final SubLSymbol $sym375$NODE_VARS_LINK_NODE;
  private static final SubLList $list376;
  private static final SubLList $list377;
  private static final SubLList $list378;
  private static final SubLList $list379;
  private static final SubLList $list380;
  private static final SubLList $list381;
  private static final SubLList $list382;
  private static final SubLList $list383;
  private static final SubLList $list384;
  private static final SubLList $list385;

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 1239L)
  public static SubLObject do_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject tv = NIL;
    SubLObject tv_links = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    tv = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    tv_links = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list0 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject link_nodes = $sym1$LINK_NODES;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( link_nodes, ConsesLow.list( $sym3$GET_SBHL_LINK_NODES, tv_links, tv ) ) ), ConsesLow.list( $sym4$PWHEN, link_nodes, ConsesLow.listS(
          $sym5$DO_SET_OR_LIST, ConsesLow.list( link_node_var, link_nodes, $kw6$DONE, done_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 2412L)
  public static SubLObject do_sbhl_tv_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tv_var = NIL;
    SubLObject link_nodes_var = NIL;
    SubLObject tv_links = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    link_nodes_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    tv_links = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list7 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym8$DO_DICTIONARY, ConsesLow.list( tv_var, link_nodes_var, tv_links, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 2720L)
  public static SubLObject do_sbhl_mt_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tv_var = NIL;
    SubLObject link_nodes_var = NIL;
    SubLObject mt = NIL;
    SubLObject mt_links = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    link_nodes_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
    mt_links = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list9 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject tv_links = $sym10$TV_LINKS;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( tv_links, ConsesLow.list( $sym11$GET_SBHL_TV_LINKS, mt_links, mt ) ) ), ConsesLow.list( $sym4$PWHEN, tv_links, ConsesLow.listS(
          $sym12$DO_SBHL_TV_LINKS, ConsesLow.list( tv_var, link_nodes_var, tv_links, done_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 3184L)
  public static SubLObject do_sbhl_mt_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject mt_var = NIL;
    SubLObject tv_links_var = NIL;
    SubLObject mt_links = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    tv_links_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    mt_links = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list13 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym8$DO_DICTIONARY, ConsesLow.list( mt_var, tv_links_var, mt_links, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list13 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 3486L)
  public static SubLObject do_sbhl_direction_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject mt_var = NIL;
    SubLObject tv_links_var = NIL;
    SubLObject direction = NIL;
    SubLObject d_link = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    tv_links_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    d_link = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list14 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject mt_links = $sym15$MT_LINKS;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( mt_links, ConsesLow.list( $sym16$GET_SBHL_MT_LINKS, d_link, direction, module ) ) ), ConsesLow.list( $sym4$PWHEN, mt_links, ConsesLow.listS(
          $sym8$DO_DICTIONARY, ConsesLow.list( mt_var, tv_links_var, mt_links, done_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list14 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 3979L)
  public static SubLObject do_sbhl_graph_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject direction_var = NIL;
    SubLObject mt_links_var = NIL;
    SubLObject node = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    direction_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    mt_links_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list17 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject d_link = $sym18$D_LINK;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( d_link, ConsesLow.list( $sym19$GET_SBHL_GRAPH_LINK, node, module ) ) ), ConsesLow.list( $sym4$PWHEN, d_link, ConsesLow.list(
          $sym20$DO_RELEVANT_SBHL_DIRECTIONS, ConsesLow.list( direction_var, module, done_var ), ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( mt_links_var, ConsesLow.list( $sym16$GET_SBHL_MT_LINKS, d_link,
              direction_var, module ) ) ), ConsesLow.listS( $sym4$PWHEN, mt_links_var, ConsesLow.append( body, NIL ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list17 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 4545L)
  public static SubLObject do_sbhl_forward_true_link_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject mt_var = NIL;
    SubLObject node = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list21 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject direction = $sym22$DIRECTION;
      final SubLObject mt_links = $sym23$MT_LINKS;
      final SubLObject tv_links = $sym24$TV_LINKS;
      return ConsesLow.list( $sym25$POSSIBLY_WITH_SBHL_MODULE, module, ConsesLow.list( $sym26$WITH_SBHL_FORWARD_LINK_DIRECTION_FOR_MODULE, module, ConsesLow.list( $sym27$DO_SBHL_GRAPH_LINK, ConsesLow.list( direction,
          mt_links, node, module, done_var ), ConsesLow.list( $sym4$PWHEN, ConsesLow.list( $sym28$SBHL_FORWARD_DIRECTION_FOR_MODULE_P, direction, module ), ConsesLow.list( $sym29$DO_SBHL_MT_LINKS, ConsesLow.list( mt_var,
              tv_links, mt_links, done_var ), ConsesLow.listS( $sym4$PWHEN, ConsesLow.list( $sym30$ANY_SBHL_TRUE_LINK_NODES_P, tv_links ), ConsesLow.append( body, NIL ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 5194L)
  public static SubLObject do_sbhl_forward_true_link_nodes_and_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject node = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list31 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject direction = $sym32$DIRECTION;
      final SubLObject mt_links = $sym33$MT_LINKS;
      final SubLObject tv_links = $sym34$TV_LINKS;
      final SubLObject tv = $sym35$TV;
      final SubLObject link_nodes = $sym36$LINK_NODES;
      return ConsesLow.list( $sym25$POSSIBLY_WITH_SBHL_MODULE, module, ConsesLow.list( $sym26$WITH_SBHL_FORWARD_LINK_DIRECTION_FOR_MODULE, module, ConsesLow.list( $sym27$DO_SBHL_GRAPH_LINK, ConsesLow.list( direction,
          mt_links, node, module, done_var ), ConsesLow.list( $sym4$PWHEN, ConsesLow.list( $sym28$SBHL_FORWARD_DIRECTION_FOR_MODULE_P, direction, module ), ConsesLow.list( $sym29$DO_SBHL_MT_LINKS, ConsesLow.list( mt_var,
              tv_links, mt_links, done_var ), ConsesLow.list( $sym12$DO_SBHL_TV_LINKS, ConsesLow.list( tv, link_nodes, tv_links, done_var ), ConsesLow.list( $sym4$PWHEN, ConsesLow.list( $sym37$SBHL_TRUE_TV_P, tv ),
                  ConsesLow.listS( $sym5$DO_SET_OR_LIST, ConsesLow.list( link_node_var, link_nodes ), ConsesLow.append( body, NIL ) ) ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list31 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 5876L)
  public static SubLObject do_all_sbhl_tv_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject direction_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject link_nodes_var = NIL;
    SubLObject node = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    direction_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    link_nodes_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list38 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject mt_links = $sym39$MT_LINKS;
      final SubLObject tv_links = $sym40$TV_LINKS;
      return ConsesLow.list( $sym27$DO_SBHL_GRAPH_LINK, ConsesLow.list( direction_var, mt_links, node, module, done_var ), ConsesLow.list( $sym29$DO_SBHL_MT_LINKS, ConsesLow.list( mt_var, tv_links, mt_links, done_var ),
          ConsesLow.listS( $sym12$DO_SBHL_TV_LINKS, ConsesLow.list( tv_var, link_nodes_var, tv_links, done_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 7065L)
  public static SubLObject do_all_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject direction_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject link_node_var = NIL;
    SubLObject node = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    direction_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list41 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject link_nodes_var = $sym42$LINK_NODES_VAR;
      return ConsesLow.list( $sym43$DO_ALL_SBHL_TV_LINKS, ConsesLow.list( direction_var, mt_var, tv_var, link_nodes_var, node, module, done_var ), ConsesLow.listS( $sym5$DO_SET_OR_LIST, ConsesLow.list( link_node_var,
          link_nodes_var, $kw6$DONE, done_var ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 7902L)
  public static SubLObject do_all_sbhl_forward_true_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject node = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list44 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject link_nodes_var = $sym45$LINK_NODES_VAR;
      final SubLObject direction = $sym46$DIRECTION;
      final SubLObject mt_links = $sym47$MT_LINKS;
      final SubLObject tv_links = $sym48$TV_LINKS;
      return ConsesLow.list( $sym25$POSSIBLY_WITH_SBHL_MODULE, module, ConsesLow.list( $sym27$DO_SBHL_GRAPH_LINK, ConsesLow.list( direction, mt_links, node, module, done_var ), ConsesLow.list( $sym4$PWHEN, ConsesLow
          .list( EQ, direction, ConsesLow.list( $sym49$GET_SBHL_MODULE_FORWARD_DIRECTION, module ) ), ConsesLow.list( $sym29$DO_SBHL_MT_LINKS, ConsesLow.list( mt_var, tv_links, mt_links, done_var ), ConsesLow.list(
              $sym12$DO_SBHL_TV_LINKS, ConsesLow.list( tv_var, link_nodes_var, tv_links, done_var ), ConsesLow.list( $sym4$PWHEN, ConsesLow.list( $sym37$SBHL_TRUE_TV_P, tv_var ), ConsesLow.listS( $sym5$DO_SET_OR_LIST,
                  ConsesLow.list( link_node_var, link_nodes_var, $kw6$DONE, done_var ), ConsesLow.append( body, NIL ) ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list44 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 8588L)
  public static SubLObject do_all_sbhl_backward_true_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject node = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list44 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject link_nodes_var = $sym50$LINK_NODES_VAR;
      final SubLObject direction = $sym51$DIRECTION;
      final SubLObject mt_links = $sym52$MT_LINKS;
      final SubLObject tv_links = $sym53$TV_LINKS;
      return ConsesLow.list( $sym25$POSSIBLY_WITH_SBHL_MODULE, module, ConsesLow.list( $sym27$DO_SBHL_GRAPH_LINK, ConsesLow.list( direction, mt_links, node, module, done_var ), ConsesLow.list( $sym4$PWHEN, ConsesLow
          .list( EQ, direction, ConsesLow.list( $sym54$GET_SBHL_MODULE_BACKWARD_DIRECTION, module ) ), ConsesLow.list( $sym29$DO_SBHL_MT_LINKS, ConsesLow.list( mt_var, tv_links, mt_links, done_var ), ConsesLow.list(
              $sym12$DO_SBHL_TV_LINKS, ConsesLow.list( tv_var, link_nodes_var, tv_links, done_var ), ConsesLow.list( $sym4$PWHEN, ConsesLow.list( $sym37$SBHL_TRUE_TV_P, tv_var ), ConsesLow.listS( $sym5$DO_SET_OR_LIST,
                  ConsesLow.list( link_node_var, link_nodes_var, $kw6$DONE, done_var ), ConsesLow.append( body, NIL ) ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list44 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 9248L)
  public static SubLObject with_sbhl_graph_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject d_link_var = NIL;
    SubLObject node = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    d_link_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    module = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( d_link_var, ConsesLow.list( $sym19$GET_SBHL_GRAPH_LINK, node, module ) ) ), ConsesLow.listS( $sym56$PIF, d_link_var, ConsesLow.append( body,
          $list57 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list55 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 9638L)
  public static SubLObject with_relevant_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_nodes_var = NIL;
    SubLObject start_node = NIL;
    SubLObject direction = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    link_nodes_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    start_node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list58 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject node = $sym59$NODE;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( node, ConsesLow.list( $sym60$NAUT_TO_NART, start_node ) ) ), ConsesLow.list( $sym61$PCOND, ConsesLow.list( ConsesLow.list(
          $sym62$SBHL_NODE_OBJECT_P, node ), ConsesLow.listS( $sym63$WITH_RELEVANT_SBHL_FORT_LINK_NODES, ConsesLow.list( link_nodes_var, node, direction, module, done_var ), ConsesLow.append( body, NIL ) ) ), ConsesLow
              .list( ConsesLow.list( $sym64$CNAT_P, node ), ConsesLow.listS( $sym65$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS, ConsesLow.list( link_nodes_var, node, direction, module, done_var ), ConsesLow.append( body,
                  NIL ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list58 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 10272L)
  public static SubLObject with_relevant_sbhl_link_nodes_and_non_forts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_nodes_var = NIL;
    SubLObject start_node = NIL;
    SubLObject direction = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    link_nodes_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    start_node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list58 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject node = $sym66$NODE;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( node, ConsesLow.list( $sym60$NAUT_TO_NART, start_node ) ) ), ConsesLow.list( $sym61$PCOND, ConsesLow.list( ConsesLow.list(
          $sym62$SBHL_NODE_OBJECT_P, node ), ConsesLow.listS( $sym63$WITH_RELEVANT_SBHL_FORT_LINK_NODES, ConsesLow.list( link_nodes_var, node, direction, module, done_var ), ConsesLow.append( body, NIL ) ), ConsesLow
              .listS( $sym67$WITH_SBHL_NON_FORT_LINKS, ConsesLow.list( link_nodes_var, node, module, done_var ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( ConsesLow.list( $sym64$CNAT_P, node ), ConsesLow.listS(
                  $sym65$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS, ConsesLow.list( link_nodes_var, node, direction, module, done_var ), ConsesLow.append( body, NIL ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list58 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 10867L)
  public static SubLObject with_relevant_sbhl_fort_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_nodes_var = NIL;
    SubLObject node = NIL;
    SubLObject direction = NIL;
    SubLObject module = NIL;
    SubLObject done_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    link_nodes_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list68 );
    done_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject d_link = $sym69$D_LINK;
      final SubLObject mt = $sym70$MT;
      final SubLObject tv_links = $sym71$TV_LINKS;
      final SubLObject tv = $sym72$TV;
      return ConsesLow.list( $sym73$WITH_SBHL_GRAPH_LINK, ConsesLow.list( d_link, node, module ), ConsesLow.list( $sym74$DO_SBHL_DIRECTION_LINK, ConsesLow.list( mt, tv_links, direction, d_link, module, done_var ),
          ConsesLow.list( $sym4$PWHEN, ConsesLow.list( $sym75$RELEVANT_MT_, mt ), ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym76$_SBHL_LINK_MT_, mt ) ), ConsesLow.list( $sym12$DO_SBHL_TV_LINKS,
              ConsesLow.list( tv, link_nodes_var, tv_links, done_var ), ConsesLow.list( $sym4$PWHEN, ConsesLow.list( $sym77$RELEVANT_SBHL_TV_, tv ), ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list(
                  $sym78$_SBHL_LINK_TV_, tv ) ), ConsesLow.append( body, NIL ) ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list68 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 11386L)
  public static SubLObject do_non_fort_direct_instance_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject ins_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject col = NIL;
    SubLObject done_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    ins_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    col = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
    done_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject instance_tuple = $sym80$INSTANCE_TUPLE;
      return ConsesLow.list( $sym81$CSOME, ConsesLow.list( instance_tuple, ConsesLow.list( $sym82$NON_FORT_INSTANCE_TABLE_LOOKUP, col ), done_var ), ConsesLow.listS( $sym83$CDESTRUCTURING_BIND, ConsesLow.list( ins_var,
          mt_var, tv_var ), instance_tuple, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list79 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 11697L)
  public static SubLObject with_sbhl_non_fort_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_nodes_var = NIL;
    SubLObject node = NIL;
    SubLObject module = NIL;
    SubLObject done_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    link_nodes_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    done_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject link_node = $sym85$LINK_NODE;
      final SubLObject mt = $sym86$MT;
      final SubLObject tv = $sym87$TV;
      return ConsesLow.list( $sym4$PWHEN, ConsesLow.list( $sym88$DO_SBHL_NON_FORT_LINKS_, node, module ), ConsesLow.list( $sym89$DO_NON_FORT_DIRECT_INSTANCE_LINKS, ConsesLow.list( link_node, mt, tv, node, done_var ),
          ConsesLow.list( $sym4$PWHEN, ConsesLow.list( $sym75$RELEVANT_MT_, mt ), ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym76$_SBHL_LINK_MT_, mt ) ), ConsesLow.list( $sym4$PWHEN, ConsesLow.list(
              $sym77$RELEVANT_SBHL_TV_, tv ), ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym78$_SBHL_LINK_TV_, tv ) ), ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( link_nodes_var,
                  ConsesLow.list( $sym90$LIST, link_node ) ) ), ConsesLow.append( body, NIL ) ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list84 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 12170L)
  public static SubLObject do_sbhl_non_fort_linksP(final SubLObject node, final SubLObject module)
  {
    return makeBoolean( module.eql( sbhl_module_vars.get_sbhl_module( $const92$isa ) ) && NIL != collection_supports_non_fort_instancesP( node ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 12370L)
  public static SubLObject collection_supports_non_fort_instancesP(final SubLObject col)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 12461L)
  public static SubLObject admissible_non_fort_link_nodeP(final SubLObject link_node)
  {
    return forts.non_fort_p( link_node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 12592L)
  public static SubLObject do_relevant_sbhl_naut_generated_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_nodes_var = NIL;
    SubLObject node = NIL;
    SubLObject direction = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    link_nodes_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list94 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject generating_fn = $sym95$GENERATING_FN;
      return ConsesLow.list( $sym96$SBHL_CSOME, ConsesLow.list( generating_fn, ConsesLow.list( $sym97$GET_SBHL_MODULE_RELEVANT_NAUT_LINK_GENERATORS, direction, $sym98$_SBHL_TV_, module ), done_var ), ConsesLow.list(
          $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym99$_SBHL_LINK_GENERATOR_, generating_fn ) ), ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( link_nodes_var, ConsesLow.list( $sym100$FUNCALL,
              generating_fn, node ) ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list94 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 13013L)
  public static SubLObject do_relevant_forward_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_nodes_var = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
    link_nodes_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
    node = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list101 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list101 );
    current = current.rest();
    final SubLObject module = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list101 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list101 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, ConsesLow.list( $sym103$POSSIBLY_WITH_SBHL_TV, tv, ConsesLow.listS( $sym25$POSSIBLY_WITH_SBHL_MODULE, module, ConsesLow.list(
          $sym104$WITH_RELEVANT_SBHL_LINK_NODES, ConsesLow.list( link_nodes_var, node, ConsesLow.list( $sym49$GET_SBHL_MODULE_FORWARD_DIRECTION, module ), module, done_var ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list101 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 13437L)
  public static SubLObject do_relevant_backward_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_nodes_var = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
    link_nodes_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
    node = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list101 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list101 );
    current = current.rest();
    final SubLObject module = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list101 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list101 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, ConsesLow.list( $sym103$POSSIBLY_WITH_SBHL_TV, tv, ConsesLow.listS( $sym25$POSSIBLY_WITH_SBHL_MODULE, module, ConsesLow.list(
          $sym104$WITH_RELEVANT_SBHL_LINK_NODES, ConsesLow.list( link_nodes_var, node, ConsesLow.list( $sym54$GET_SBHL_MODULE_BACKWARD_DIRECTION, module ), module, done_var ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list101 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 13822L)
  public static SubLObject with_accessible_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_nodes_var = NIL;
    SubLObject node = NIL;
    SubLObject direction = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    link_nodes_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list94 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym105$DO_WITH_RELEVANT_SBHL_MODULES, ConsesLow.list( module, done_var ), ConsesLow.list( $sym106$POSSIBLY_FLIP_GENL_INVERSE_MODE, ConsesLow.listS( $sym104$WITH_RELEVANT_SBHL_LINK_NODES,
          ConsesLow.list( link_nodes_var, node, direction, $list107, done_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list94 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 14317L)
  public static SubLObject with_accessible_sbhl_link_nodes_and_non_forts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_nodes_var = NIL;
    SubLObject node = NIL;
    SubLObject direction = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    link_nodes_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list94 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym105$DO_WITH_RELEVANT_SBHL_MODULES, ConsesLow.list( module, done_var ), ConsesLow.list( $sym106$POSSIBLY_FLIP_GENL_INVERSE_MODE, ConsesLow.listS(
          $sym108$WITH_RELEVANT_SBHL_LINK_NODES_AND_NON_FORTS, ConsesLow.list( link_nodes_var, node, direction, $list107, done_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list94 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 14830L)
  public static SubLObject do_accessible_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject node = NIL;
    SubLObject direction = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list109 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject link_nodes = $sym110$LINK_NODES;
      return ConsesLow.list( $sym111$WITH_ACCESSIBLE_SBHL_LINK_NODES, ConsesLow.list( link_nodes, node, direction, module, done_var ), ConsesLow.listS( $sym5$DO_SET_OR_LIST, ConsesLow.list( link_node_var, link_nodes,
          $kw6$DONE, done_var ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list109 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 15159L)
  public static SubLObject do_accessible_sbhl_link_nodes_and_non_forts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject node = NIL;
    SubLObject direction = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list109 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject link_nodes = $sym112$LINK_NODES;
      return ConsesLow.list( $sym113$WITH_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS, ConsesLow.list( link_nodes, node, direction, module, done_var ), ConsesLow.listS( $sym5$DO_SET_OR_LIST, ConsesLow.list( link_node_var,
          link_nodes, $kw6$DONE, done_var ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list109 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 15516L)
  public static SubLObject do_accessible_sbhl_link_node_search_states(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list114 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_search_state_var = NIL;
    SubLObject node_search_state = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list114 );
    link_node_search_state_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list114 );
    node_search_state = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list114 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list114 );
      if( NIL == conses_high.member( current_$1, $list115, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw116$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list114 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym117$DO_SBHL_ITERATOR, ConsesLow.list( link_node_search_state_var, ConsesLow.list( $sym118$NEW_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR, node_search_state ), $kw6$DONE, done ), ConsesLow
        .append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 15793L)
  public static SubLObject do_accessible_sbhl_tv_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject tv_links_var = NIL;
    SubLObject node = NIL;
    SubLObject direction = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    tv_links_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list119 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym111$WITH_ACCESSIBLE_SBHL_LINK_NODES, ConsesLow.list( tv_links_var, node, direction, module, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list119 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 16016L)
  public static SubLObject do_relevant_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject node = NIL;
    SubLObject direction = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list109 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list109 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject link_nodes = $sym120$LINK_NODES;
      return ConsesLow.list( $sym25$POSSIBLY_WITH_SBHL_MODULE, module, ConsesLow.list( $sym104$WITH_RELEVANT_SBHL_LINK_NODES, ConsesLow.list( link_nodes, node, direction, module, done_var ), ConsesLow.listS(
          $sym5$DO_SET_OR_LIST, ConsesLow.list( link_node_var, link_nodes, $kw6$DONE, done_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list109 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 16379L)
  public static SubLObject do_relevant_sbhl_forward_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject node = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list121 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym122$DO_RELEVANT_SBHL_LINK_NODES, ConsesLow.list( link_node_var, node, ConsesLow.list( $sym49$GET_SBHL_MODULE_FORWARD_DIRECTION, module ), module, done_var ), ConsesLow.append( body,
          NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list121 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 16631L)
  public static SubLObject do_relevant_sbhl_backward_link_nodes(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject node = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list121 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym122$DO_RELEVANT_SBHL_LINK_NODES, ConsesLow.list( link_node_var, node, ConsesLow.list( $sym54$GET_SBHL_MODULE_BACKWARD_DIRECTION, module ), module, done_var ), ConsesLow.append( body,
          NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list121 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 16885L)
  public static SubLObject do_sbhl_predicates(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list123 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject pred_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list123 );
    pred_var = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list123 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym124$SMART_CSOME, ConsesLow.list( pred_var, $list125, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list123 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 17160L)
  public static SubLObject do_sbhl_non_time_predicates(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list123 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject pred_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list123 );
    pred_var = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list123 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject module = $sym126$MODULE;
      return ConsesLow.list( $sym127$DO_SBHL_MODULES, ConsesLow.list( module, done_var ), ConsesLow.list( $sym128$PUNLESS, ConsesLow.list( $sym129$SBHL_TIME_MODULE_P, module ), ConsesLow.listS( $sym2$CLET, ConsesLow
          .list( ConsesLow.list( pred_var, ConsesLow.list( $sym130$GET_SBHL_LINK_PRED, module ) ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list123 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 17489L)
  public static SubLObject do_sbhl_non_time_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list131 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject module_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list131 );
    module_var = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list131 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject module = $sym132$MODULE;
      return ConsesLow.list( $sym127$DO_SBHL_MODULES, ConsesLow.list( module, done_var ), ConsesLow.list( $sym128$PUNLESS, ConsesLow.list( $sym129$SBHL_TIME_MODULE_P, module ), ConsesLow.listS( $sym2$CLET, ConsesLow
          .list( ConsesLow.list( module_var, module ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list131 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 17795L)
  public static SubLObject do_sbhl_graphs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list133 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject module_var = NIL;
    SubLObject graph_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list133 );
    module_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list133 );
    graph_var = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list133 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym127$DO_SBHL_MODULES, ConsesLow.list( module_var, done_var ), ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( graph_var, ConsesLow.list( $sym134$GET_SBHL_MODULE_GRAPH,
          module_var ) ) ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list133 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 18045L)
  public static SubLObject with_forward_sbhl_link_direction(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list135, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 18308L)
  public static SubLObject with_backward_sbhl_link_direction(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list136, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 18565L)
  public static SubLObject with_sbhl_type_test(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list137 );
    node = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym56$PIF, ConsesLow.list( $sym138$COR, $list139, ConsesLow.listS( $sym140$APPLY_SBHL_MODULE_TYPE_TEST, node, $list141 ) ), reader.bq_cons( $sym142$PROGN, ConsesLow.append( body, NIL ) ),
        ConsesLow.listS( $sym143$SBHL_WARN, TWO_INTEGER, $str144$Node__a_does_not_pass_sbhl_type_t, node, $list145 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 18967L)
  public static SubLObject do_sbhl_module_graph(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject node_var = NIL;
    SubLObject link_var = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
    node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
    link_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list146 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym147$DO_SBHL_GRAPH_LINKS, ConsesLow.list( node_var, link_var, $kw148$MODULE, module, $kw6$DONE, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list146 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 19448L)
  public static SubLObject do_with_relevant_sbhl_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list149 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list149 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject module_var = $sym150$MODULE_VAR;
      final SubLObject accessible_modules = $sym151$ACCESSIBLE_MODULES;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( accessible_modules, ConsesLow.list( $sym152$GET_SBHL_ACCESSIBLE_MODULES, module ) ) ), ConsesLow.list( $sym124$SMART_CSOME, ConsesLow.list(
          module_var, accessible_modules, done_var ), ConsesLow.listS( $sym153$WITH_SBHL_MODULE, module_var, ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list149 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 19975L)
  public static SubLObject get_sbhl_accessible_modules(final SubLObject module)
  {
    assert NIL != sbhl_module_vars.sbhl_module_p( module ) : module;
    final SubLObject preds = sbhl_module_utilities.get_sbhl_accessible_link_preds( module );
    return ( NIL != preds ) ? Mapping.mapcar( $sym155$GET_SBHL_MODULE, preds ) : ConsesLow.list( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 20346L)
  public static SubLObject do_relevant_sbhl_directions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject direction_var = NIL;
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
    direction_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
    module = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list156 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym124$SMART_CSOME, ConsesLow.list( direction_var, ConsesLow.list( $sym157$GET_RELEVANT_SBHL_DIRECTIONS, module ), done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list156 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 20700L)
  public static SubLObject bind_sbhl_search_behavior(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list158, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 21337L)
  public static SubLObject bind_sbhl_boolean_goal_fn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list137 );
    node = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject premarkingP = $sym159$PREMARKING_;
    final SubLObject goal_fn = $sym160$GOAL_FN;
    final SubLObject goal_node = $sym161$GOAL_NODE;
    final SubLObject goal_space = $sym162$GOAL_SPACE;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( reader.bq_cons( premarkingP, $list163 ), reader.bq_cons( goal_fn, $list164 ), ConsesLow.list( goal_node, node ), reader.bq_cons( goal_space, $list165 ) ), ConsesLow
        .list( $sym4$PWHEN, premarkingP, ConsesLow.list( $sym153$WITH_SBHL_MODULE, $list166, ConsesLow.list( $sym167$POSSIBLY_PREMARK_WITH_GENL_INVERSE_MODE, ConsesLow.list( $sym168$SBHL_PREMARK_GATHER_NODES,
            goal_node ) ) ), ConsesLow.listS( $sym169$CSETQ, goal_fn, $list170 ), ConsesLow.listS( $sym169$CSETQ, goal_space, $list171 ) ), ConsesLow.list( $sym172$RESET_SBHL_SEARCH_PARENT_MARKING, ConsesLow.list(
                $sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, ConsesLow.list( $sym174$WITH_SBHL_CONSIDER_NODE_FN, goal_fn, ConsesLow.list( $sym175$WITH_SBHL_GOAL_NODE, goal_node, ConsesLow.listS(
                    $sym176$WITH_SBHL_GOAL_SPACE, goal_space, ConsesLow.append( body, NIL ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 22221L)
  public static SubLObject sbhl_possibly_rebind_temporal_search_state(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject node = NIL;
    SubLObject link_node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list177 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list177 );
    link_node = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( $list178, ConsesLow.list( $sym179$_SBHL_TEMPORALITY_SEARCH_PASSED_THROUGH_DATE__, ConsesLow.list( $sym180$FWHEN, $list181, ConsesLow.listS( $sym138$COR, ConsesLow
        .list( $sym182$HL_DATE_POINT_P, node ), $list183 ) ) ) ), ConsesLow.list( $sym128$PUNLESS, ConsesLow.list( $sym184$CAND, $list181, ConsesLow.list(
            $sym185$SBHL_TEMPORALITY_CONSEQUENT_LINKS_SEARCH_PASSED_THROUGH_LINK_P, ConsesLow.list( $sym186$SBHL_TEMPORAL_FAUX_LINK, node, link_node ) ) ), reader.bq_cons( $sym142$PROGN, ConsesLow.append( body,
                NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 23258L)
  public static SubLObject bind_sbhl_sample_leaf_search_behavior(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list187, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 23580L)
  public static SubLObject do_all_simple_true_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject module = NIL;
    SubLObject direction = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list188 );
    node = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list188 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list188 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list188 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : $kw189$BREADTH;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list188 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject node_var = $sym190$NODE_VAR;
      final SubLObject deck_type = $sym191$DECK_TYPE;
      final SubLObject recur_deck = $sym192$RECUR_DECK;
      final SubLObject node_vars_link_node = $sym193$NODE_VARS_LINK_NODE;
      return ConsesLow.list( $sym128$PUNLESS, done_var, ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( node_var, node ), ConsesLow.list( deck_type, ConsesLow.listS( $sym194$FIF, ConsesLow.listS( EQ,
          search_type, $list195 ), $list196 ) ), ConsesLow.list( recur_deck, ConsesLow.list( $sym197$CREATE_DECK, deck_type ) ) ), ConsesLow.list( $sym198$WITH_NEW_SBHL_SPACE, ConsesLow.list(
              $sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, ConsesLow.list( $sym199$POSSIBLY_WITH_SBHL_TRUE_TV, tv, ConsesLow.list( $sym200$WITH_SBHL_SEARCH_MODULE, module, ConsesLow.list( $sym201$WITH_SBHL_TYPE_TEST,
                  node, ConsesLow.list( $sym202$WITH_SBHL_SEARCH_DIRECTION, direction, ConsesLow.list( $sym203$WITH_SBHL_LINK_DIRECTION, ConsesLow.list( $sym204$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, direction,
                      module ), ConsesLow.list( $sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, ConsesLow.list( $sym205$SBHL_MARK_NODE_MARKED, node_var ), ConsesLow.list( $sym206$WHILE, ConsesLow.list( $sym184$CAND,
                          node_var, ConsesLow.list( $sym207$CNOT, done_var ) ), ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( link_node_var, node_var ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list(
                              $sym208$DO_ACCESSIBLE_SBHL_LINK_NODES, ConsesLow.list( node_vars_link_node, node_var, $list209, module, done_var ), ConsesLow.list( $sym128$PUNLESS, ConsesLow.list(
                                  $sym210$SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node ), ConsesLow.list( $sym205$SBHL_MARK_NODE_MARKED, node_vars_link_node ), ConsesLow.list( $sym211$DECK_PUSH,
                                      node_vars_link_node, recur_deck ) ) ), ConsesLow.list( $sym169$CSETQ, node_var, ConsesLow.list( $sym212$DECK_POP, recur_deck ) ) ) ) ) ) ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list188 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 25025L)
  public static SubLObject do_all_simple_forward_true_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject module = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    node = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym214$DO_ALL_SIMPLE_TRUE_LINKS, ConsesLow.list( link_node_var, module, $list215, node, mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list213 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 25457L)
  public static SubLObject do_all_simple_backward_true_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject module = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    node = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym214$DO_ALL_SIMPLE_TRUE_LINKS, ConsesLow.list( link_node_var, module, $list216, node, mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list213 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 25893L)
  public static SubLObject do_all_simple_true_links_for_inverses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list217 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject module = NIL;
    SubLObject direction = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list217 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list217 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list217 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list217 );
    node = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list217 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list217 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list217 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : $kw218$DEPTH;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list217 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject node_var = $sym219$NODE_VAR;
      final SubLObject node_and_predicate_mode = $sym220$NODE_AND_PREDICATE_MODE;
      final SubLObject predicate_mode = $sym221$PREDICATE_MODE;
      final SubLObject deck_type = $sym222$DECK_TYPE;
      final SubLObject recur_deck = $sym223$RECUR_DECK;
      final SubLObject node_vars_link_node = $sym224$NODE_VARS_LINK_NODE;
      return ConsesLow.list( $sym128$PUNLESS, done_var, ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( node_var, node ), ConsesLow.list( deck_type, ConsesLow.listS( $sym194$FIF, ConsesLow.listS( EQ,
          search_type, $list225 ), $list226 ) ), ConsesLow.list( recur_deck, ConsesLow.list( $sym197$CREATE_DECK, deck_type ) ), node_and_predicate_mode ), ConsesLow.list( $sym198$WITH_NEW_SBHL_SPACE, ConsesLow.list(
              $sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, ConsesLow.list( $sym199$POSSIBLY_WITH_SBHL_TRUE_TV, tv, ConsesLow.list( $sym200$WITH_SBHL_SEARCH_MODULE, module, ConsesLow.list( $sym201$WITH_SBHL_TYPE_TEST,
                  node, ConsesLow.list( $sym202$WITH_SBHL_SEARCH_DIRECTION, direction, ConsesLow.list( $sym203$WITH_SBHL_LINK_DIRECTION, ConsesLow.list( $sym204$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, direction,
                      module ), ConsesLow.list( $sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, ConsesLow.list( $sym205$SBHL_MARK_NODE_MARKED, node_var ), ConsesLow.list( $sym169$CSETQ, node_and_predicate_mode, ConsesLow
                          .listS( $sym90$LIST, node, $list227 ) ), ConsesLow.list( $sym206$WHILE, ConsesLow.list( $sym184$CAND, node_and_predicate_mode, ConsesLow.list( $sym207$CNOT, done_var ) ), ConsesLow.list(
                              $sym2$CLET, ConsesLow.list( ConsesLow.list( node_var, ConsesLow.list( $sym228$FIRST, node_and_predicate_mode ) ), ConsesLow.list( predicate_mode, ConsesLow.list( $sym229$SECOND,
                                  node_and_predicate_mode ) ), ConsesLow.list( link_node_var, node_var ) ), ConsesLow.list( $sym230$WITH_SBHL_PREDICATE_MODE, predicate_mode, ConsesLow.listS( $sym4$PWHEN, ConsesLow.list(
                                      $sym231$APPLY_SBHL_ADD_NODE_TEST, $list232, node_var ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym208$DO_ACCESSIBLE_SBHL_LINK_NODES, ConsesLow.list( node_vars_link_node,
                                          node_var, $list209, module, done_var ), ConsesLow.list( $sym128$PUNLESS, ConsesLow.list( $sym210$SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node ), ConsesLow.list(
                                              $sym205$SBHL_MARK_NODE_MARKED, node_vars_link_node ), ConsesLow.list( $sym211$DECK_PUSH, ConsesLow.listS( $sym90$LIST, node_vars_link_node, $list227 ), recur_deck ) ) ) ) ),
                              ConsesLow.list( $sym169$CSETQ, node_and_predicate_mode, ConsesLow.list( $sym212$DECK_POP, recur_deck ) ) ) ) ) ) ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list217 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 27871L)
  public static SubLObject do_all_simple_forward_true_links_for_inverses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject module = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    node = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym233$DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES, ConsesLow.list( link_node_var, module, $list215, node, mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list213 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 28397L)
  public static SubLObject do_all_simple_backward_true_links_for_inverses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject module = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    node = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym233$DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES, ConsesLow.list( link_node_var, module, $list216, node, mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list213 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 28926L)
  public static SubLObject do_all_mode_true_links_for_inverses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list234 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject mode_var = NIL;
    SubLObject module = NIL;
    SubLObject direction = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list234 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list234 );
    mode_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list234 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list234 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list234 );
    node = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list234 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list234 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list234 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : $kw218$DEPTH;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list234 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject node_var = $sym235$NODE_VAR;
      final SubLObject node_and_predicate_mode = $sym236$NODE_AND_PREDICATE_MODE;
      final SubLObject predicate_mode = $sym237$PREDICATE_MODE;
      final SubLObject deck_type = $sym238$DECK_TYPE;
      final SubLObject recur_deck = $sym239$RECUR_DECK;
      final SubLObject node_vars_link_node = $sym240$NODE_VARS_LINK_NODE;
      return ConsesLow.list( $sym128$PUNLESS, done_var, ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( node_var, node ), ConsesLow.list( deck_type, ConsesLow.listS( $sym194$FIF, ConsesLow.listS( EQ,
          search_type, $list225 ), $list226 ) ), ConsesLow.list( recur_deck, ConsesLow.list( $sym197$CREATE_DECK, deck_type ) ), node_and_predicate_mode ), ConsesLow.list( $sym198$WITH_NEW_SBHL_SPACE, ConsesLow.list(
              $sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, ConsesLow.list( $sym199$POSSIBLY_WITH_SBHL_TRUE_TV, tv, ConsesLow.list( $sym200$WITH_SBHL_SEARCH_MODULE, module, ConsesLow.list( $sym201$WITH_SBHL_TYPE_TEST,
                  node, ConsesLow.list( $sym202$WITH_SBHL_SEARCH_DIRECTION, direction, ConsesLow.list( $sym203$WITH_SBHL_LINK_DIRECTION, ConsesLow.list( $sym204$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, direction,
                      module ), ConsesLow.list( $sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, ConsesLow.list( $sym205$SBHL_MARK_NODE_MARKED, node_var ), ConsesLow.list( $sym169$CSETQ, node_and_predicate_mode, ConsesLow
                          .listS( $sym90$LIST, node, $list227 ) ), ConsesLow.list( $sym206$WHILE, ConsesLow.list( $sym184$CAND, node_and_predicate_mode, ConsesLow.list( $sym207$CNOT, done_var ) ), ConsesLow.list(
                              $sym2$CLET, ConsesLow.list( ConsesLow.list( node_var, ConsesLow.list( $sym228$FIRST, node_and_predicate_mode ) ), ConsesLow.list( predicate_mode, ConsesLow.list( $sym229$SECOND,
                                  node_and_predicate_mode ) ), ConsesLow.list( link_node_var, node_var ) ), ConsesLow.list( $sym230$WITH_SBHL_PREDICATE_MODE, predicate_mode, ConsesLow.list( $sym142$PROGN, ConsesLow
                                      .listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( mode_var, predicate_mode ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym208$DO_ACCESSIBLE_SBHL_LINK_NODES, ConsesLow
                                          .list( node_vars_link_node, node_var, $list209, module, done_var ), ConsesLow.list( $sym128$PUNLESS, ConsesLow.list( $sym210$SBHL_SEARCH_PATH_TERMINATION_P,
                                              node_vars_link_node ), ConsesLow.list( $sym205$SBHL_MARK_NODE_MARKED, node_vars_link_node ), ConsesLow.list( $sym211$DECK_PUSH, ConsesLow.listS( $sym90$LIST,
                                                  node_vars_link_node, $list227 ), recur_deck ) ) ) ) ) ), ConsesLow.list( $sym169$CSETQ, node_and_predicate_mode, ConsesLow.list( $sym212$DECK_POP,
                                                      recur_deck ) ) ) ) ) ) ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list234 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 30673L)
  public static SubLObject do_all_mode_backward_true_links_for_inverses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list241 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject mode_var = NIL;
    SubLObject module = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list241 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list241 );
    mode_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list241 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list241 );
    node = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list241 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list241 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list241 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list241 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym242$DO_ALL_MODE_TRUE_LINKS_FOR_INVERSES, ConsesLow.list( new SubLObject[] { link_node_var, mode_var, module, $list216, node, mt, tv, done_var, search_type
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list241 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 31035L)
  public static SubLObject do_all_mode_forward_true_links_for_inverses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list241 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject mode_var = NIL;
    SubLObject module = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list241 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list241 );
    mode_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list241 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list241 );
    node = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list241 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list241 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list241 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list241 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym242$DO_ALL_MODE_TRUE_LINKS_FOR_INVERSES, ConsesLow.list( new SubLObject[] { link_node_var, mode_var, module, $list215, node, mt, tv, done_var, search_type
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list241 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 31395L)
  public static SubLObject do_all_forward_true_links_for_tt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject module = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    node = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject node_var = $sym243$NODE_VAR;
      final SubLObject deck_type = $sym244$DECK_TYPE;
      final SubLObject recur_deck = $sym245$RECUR_DECK;
      final SubLObject node_vars_link_node = $sym246$NODE_VARS_LINK_NODE;
      return ConsesLow.list( $sym128$PUNLESS, done_var, ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( node_var, node ), ConsesLow.list( deck_type, ConsesLow.listS( $sym194$FIF, ConsesLow.listS( EQ,
          search_type, $list225 ), $list226 ) ), ConsesLow.list( recur_deck, ConsesLow.list( $sym197$CREATE_DECK, deck_type ) ) ), ConsesLow.list( $sym198$WITH_NEW_SBHL_SPACE, ConsesLow.list(
              $sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, ConsesLow.list( $sym199$POSSIBLY_WITH_SBHL_TRUE_TV, tv, ConsesLow.list( $sym200$WITH_SBHL_SEARCH_MODULE, module, ConsesLow.list( $sym201$WITH_SBHL_TYPE_TEST,
                  node, ConsesLow.list( $sym247$WITH_SBHL_FORWARD_SEARCH_DIRECTION, ConsesLow.list( $sym248$WITH_SBHL_FORWARD_LINK_DIRECTION, ConsesLow.list( $sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, ConsesLow.list(
                      $sym208$DO_ACCESSIBLE_SBHL_LINK_NODES, ConsesLow.list( node_vars_link_node, node_var, $list209, module, done_var ), ConsesLow.list( $sym128$PUNLESS, ConsesLow.list(
                          $sym210$SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node ), ConsesLow.list( $sym205$SBHL_MARK_NODE_MARKED, node_vars_link_node ), ConsesLow.list( $sym211$DECK_PUSH, node_vars_link_node,
                              recur_deck ) ) ), ConsesLow.list( $sym169$CSETQ, node_var, ConsesLow.list( $sym212$DECK_POP, recur_deck ) ), ConsesLow.list( $sym153$WITH_SBHL_MODULE, $list166, ConsesLow.list(
                                  $sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, ConsesLow.list( $sym248$WITH_SBHL_FORWARD_LINK_DIRECTION, ConsesLow.list( $sym206$WHILE, ConsesLow.list( $sym184$CAND, node_var, ConsesLow
                                      .list( $sym207$CNOT, done_var ) ), ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( link_node_var, node_var ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list(
                                          $sym208$DO_ACCESSIBLE_SBHL_LINK_NODES, ConsesLow.list( node_vars_link_node, node_var, $list209, $list107, done_var ), ConsesLow.list( $sym128$PUNLESS, ConsesLow.list(
                                              $sym210$SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node ), ConsesLow.list( $sym205$SBHL_MARK_NODE_MARKED, node_vars_link_node ), ConsesLow.list( $sym211$DECK_PUSH,
                                                  node_vars_link_node, recur_deck ) ) ), ConsesLow.list( $sym169$CSETQ, node_var, ConsesLow.list( $sym212$DECK_POP, recur_deck ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list213 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 33350L)
  public static SubLObject do_all_backward_true_links_for_tt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject link_node_var = NIL;
    SubLObject module = NIL;
    SubLObject node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    link_node_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    node = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list213 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject node_var = $sym249$NODE_VAR;
      final SubLObject tt_node_var = $sym250$TT_NODE_VAR;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( node_var, node ) ), ConsesLow.list( $sym153$WITH_SBHL_MODULE, module, ConsesLow.list( $sym251$WITH_NEW_SBHL_GATHER_SPACE, ConsesLow.list(
          $sym214$DO_ALL_SIMPLE_TRUE_LINKS, ConsesLow.list( tt_node_var, ConsesLow.list( $sym252$GET_SBHL_TRANSFERS_THROUGH_MODULE, module ), $list216, node_var, mt, tv, done_var, search_type ), ConsesLow.list(
              $sym253$DO_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS, ConsesLow.list( link_node_var, tt_node_var, ConsesLow.list( $sym54$GET_SBHL_MODULE_BACKWARD_DIRECTION, module ), module, done_var ), ConsesLow.listS(
                  $sym128$PUNLESS, ConsesLow.listS( $sym210$SBHL_SEARCH_PATH_TERMINATION_P, link_node_var, $list171 ), ConsesLow.listS( $sym205$SBHL_MARK_NODE_MARKED, link_node_var, $list171 ), ConsesLow.append( body,
                      NIL ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list213 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 34356L)
  public static SubLObject do_true_isa_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list254 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject isa_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list254 );
    isa_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list254 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list254 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list254 );
    v_term = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list254 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, ConsesLow.list( isa_var, tv_var, mt_var, v_term, $list256, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list254 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 34747L)
  public static SubLObject do_relevant_isa_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list257 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject isa_links_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list257 );
    isa_links_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list257 );
    v_term = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list257 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list257 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list257 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym258$DO_RELEVANT_FORWARD_SBHL_LINK_NODES, ConsesLow.list( isa_links_var, v_term, mt, tv, $list256, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list257 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 35025L)
  public static SubLObject do_local_isas(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list259 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject isa_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list259 );
    isa_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list259 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list259 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list259 );
      if( NIL == conses_high.member( current_$2, $list260, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw116$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list259 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw261$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject mt_var = $sym262$MT_VAR;
    final SubLObject tv_var = $sym263$TV_VAR;
    return ConsesLow.list( $sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, ConsesLow.list( $sym265$DO_TRUE_ISA_LINKS, ConsesLow.list( isa_var, mt_var, tv_var, v_term, done ), ConsesLow.list( $sym266$IGNORE, tv_var ),
        ConsesLow.listS( $sym4$PWHEN, ConsesLow.list( $sym75$RELEVANT_MT_, mt_var ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 35423L)
  public static SubLObject some_relevant_isa(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list267 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject isa_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list267 );
    isa_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list267 );
    v_term = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list267 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject link_nodes = $sym268$LINK_NODES;
      return ConsesLow.list( $sym199$POSSIBLY_WITH_SBHL_TRUE_TV, NIL, ConsesLow.list( $sym104$WITH_RELEVANT_SBHL_LINK_NODES, ConsesLow.list( link_nodes, v_term, $list269, $list256, done_var ), ConsesLow.listS(
          $sym5$DO_SET_OR_LIST, ConsesLow.list( isa_var, link_nodes, $kw6$DONE, done_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list267 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 35862L)
  public static SubLObject do_true_instance_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    instance_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    v_term = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list270 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, ConsesLow.list( instance_var, tv_var, mt_var, v_term, $list256, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list270 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 36181L)
  public static SubLObject do_relevant_instance_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list272 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance_links_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list272 );
    instance_links_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list272 );
    v_term = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list272 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list272 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list272 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym273$DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, ConsesLow.list( instance_links_var, v_term, mt, tv, $list256, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list272 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 36476L)
  public static SubLObject do_local_instances(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list274 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list274 );
    instance_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list274 );
    col = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list274 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list274 );
      if( NIL == conses_high.member( current_$3, $list260, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw116$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list274 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw261$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject mt_var = $sym275$MT_VAR;
    final SubLObject tv_var = $sym276$TV_VAR;
    return ConsesLow.list( $sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, ConsesLow.list( $sym277$DO_TRUE_INSTANCE_LINKS, ConsesLow.list( instance_var, mt_var, tv_var, col, done ), ConsesLow.list( $sym266$IGNORE,
        tv_var ), ConsesLow.listS( $sym4$PWHEN, ConsesLow.list( $sym75$RELEVANT_MT_, mt_var ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym89$DO_NON_FORT_DIRECT_INSTANCE_LINKS, ConsesLow.list( instance_var,
            mt_var, tv_var, col, done ), ConsesLow.list( $sym4$PWHEN, ConsesLow.list( $sym37$SBHL_TRUE_TV_P, tv_var ), ConsesLow.listS( $sym4$PWHEN, ConsesLow.list( $sym75$RELEVANT_MT_, mt_var ), ConsesLow.append( body,
                NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 37069L)
  public static SubLObject do_true_quoted_isa_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list278 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject quoted_isa_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list278 );
    quoted_isa_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list278 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list278 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list278 );
    v_term = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list278 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, ConsesLow.list( quoted_isa_var, tv_var, mt_var, v_term, $list279, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list278 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 37396L)
  public static SubLObject do_local_quoted_isas(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list280 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject quoted_isa_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list280 );
    quoted_isa_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list280 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list280 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list280 );
      if( NIL == conses_high.member( current_$4, $list260, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw116$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list280 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw261$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject mt_var = $sym281$MT_VAR;
    final SubLObject tv_var = $sym282$TV_VAR;
    return ConsesLow.list( $sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, ConsesLow.list( $sym283$DO_TRUE_QUOTED_ISA_LINKS, ConsesLow.list( quoted_isa_var, mt_var, tv_var, v_term, done ), ConsesLow.list(
        $sym266$IGNORE, tv_var ), ConsesLow.listS( $sym4$PWHEN, ConsesLow.list( $sym75$RELEVANT_MT_, mt_var ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 37836L)
  public static SubLObject do_true_quoted_instance_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    instance_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list270 );
    v_term = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list270 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, ConsesLow.list( instance_var, tv_var, mt_var, v_term, $list279, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list270 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 38171L)
  public static SubLObject do_local_quoted_instances(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list284 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject quoted_instance_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list284 );
    quoted_instance_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list284 );
    col = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list284 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list284 );
      if( NIL == conses_high.member( current_$5, $list260, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw116$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list284 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw261$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject mt_var = $sym285$MT_VAR;
    final SubLObject tv_var = $sym286$TV_VAR;
    return ConsesLow.list( $sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, ConsesLow.list( $sym287$DO_TRUE_QUOTED_INSTANCE_LINKS, ConsesLow.list( quoted_instance_var, mt_var, tv_var, col, done ), ConsesLow.list(
        $sym266$IGNORE, tv_var ), ConsesLow.listS( $sym4$PWHEN, ConsesLow.list( $sym75$RELEVANT_MT_, mt_var ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 38638L)
  public static SubLObject do_all_isa(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list288 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject isa_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list288 );
    isa_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list288 );
    v_term = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list288 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list288 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list288 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list288 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym289$DO_ALL_FORWARD_TRUE_LINKS_FOR_TT, ConsesLow.list( isa_var, $list256, v_term, mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list288 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 38926L)
  public static SubLObject do_all_isa_depth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject isa_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    isa_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    v_term = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list290 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list290 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list290 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym289$DO_ALL_FORWARD_TRUE_LINKS_FOR_TT, ConsesLow.listS( isa_var, new SubLObject[] { $list256, v_term, mt, tv, done_var, $list225
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list290 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 39209L)
  public static SubLObject do_all_isa_breadth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject isa_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    isa_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list290 );
    v_term = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list290 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list290 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list290 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym289$DO_ALL_FORWARD_TRUE_LINKS_FOR_TT, ConsesLow.listS( isa_var, new SubLObject[] { $list256, v_term, mt, tv, done_var, $list195
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list290 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 39498L)
  public static SubLObject do_all_isas_by_generality(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list291 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_isa = NIL;
    SubLObject v_term = NIL;
    SubLObject domain_mt = NIL;
    SubLObject doneP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list291 );
    v_isa = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list291 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list291 );
    domain_mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list291 );
    doneP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject isas = $sym292$ISAS;
      return ConsesLow.list( $sym293$WITH_MT, domain_mt, ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( isas, ConsesLow.list( $sym294$SORT_BY_GENERALITY_ESTIMATE, ConsesLow.list( $sym295$ALL_ISA,
          v_term ) ) ) ), ConsesLow.listS( $sym81$CSOME, ConsesLow.list( v_isa, isas, doneP ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list291 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 39822L)
  public static SubLObject do_all_instances(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    instance_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    v_term = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym297$DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT, ConsesLow.list( instance_var, $list256, v_term, mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list296 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 40130L)
  public static SubLObject do_all_instances_depth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    instance_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    v_term = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list300 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list300 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list300 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym297$DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT, ConsesLow.listS( instance_var, new SubLObject[] { $list256, v_term, mt, tv, done_var, $list225
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list300 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 40431L)
  public static SubLObject do_all_instances_breadth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    instance_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    v_term = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list300 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list300 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list300 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym297$DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT, ConsesLow.listS( instance_var, new SubLObject[] { $list256, v_term, mt, tv, done_var, $list195
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list300 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 40738L)
  public static SubLObject do_all_fort_instances(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    instance_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    v_term = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym298$DO_ALL_INSTANCES, ConsesLow.list( instance_var, v_term, mt, tv, done_var, search_type ), ConsesLow.listS( $sym4$PWHEN, ConsesLow.list( $sym301$FORT_P, instance_var ), ConsesLow
          .append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list296 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 41038L)
  public static SubLObject do_all_instances_of_all(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list304 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance_var = NIL;
    SubLObject terms = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list304 );
    instance_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list304 );
    terms = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list304 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list304 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list304 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list304 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject terms_var = $sym305$TERMS_VAR;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( terms_var, terms ) ), ConsesLow.list( $sym298$DO_ALL_INSTANCES, ConsesLow.list( instance_var, ConsesLow.list( $sym228$FIRST, terms_var ), mt, tv,
          done_var, search_type ), ConsesLow.listS( $sym4$PWHEN, ConsesLow.list( $sym306$ALL_ISA_, instance_var, ConsesLow.list( $sym307$REST, terms_var ), mt, tv ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list304 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 41464L)
  public static SubLObject do_all_quoted_instances(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    instance_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    v_term = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym297$DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT, ConsesLow.list( instance_var, $list279, v_term, mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list296 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 41792L)
  public static SubLObject do_all_fort_quoted_instances(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance_var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    instance_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list296 );
    v_term = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list296 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym308$DO_ALL_QUOTED_INSTANCES, ConsesLow.list( instance_var, v_term, mt, tv, done_var, search_type ), ConsesLow.listS( $sym4$PWHEN, ConsesLow.list( $sym301$FORT_P, instance_var ), ConsesLow
          .append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list296 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 42106L)
  public static SubLObject do_all_quoted_instances_of_all(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list304 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject instance_var = NIL;
    SubLObject terms = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list304 );
    instance_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list304 );
    terms = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list304 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list304 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list304 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list304 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject terms_var = $sym310$TERMS_VAR;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( terms_var, terms ) ), ConsesLow.list( $sym308$DO_ALL_QUOTED_INSTANCES, ConsesLow.list( instance_var, ConsesLow.list( $sym228$FIRST, terms_var ),
          mt, tv, done_var, search_type ), ConsesLow.listS( $sym4$PWHEN, ConsesLow.list( $sym311$ALL_QUOTED_ISA_, instance_var, ConsesLow.list( $sym307$REST, terms_var ), mt, tv ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list304 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 42560L)
  public static SubLObject do_true_genls_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list312 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list312 );
    genl_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list312 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list312 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list312 );
    col = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list312 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, ConsesLow.list( genl_var, tv_var, mt_var, col, $list313, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list312 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 42961L)
  public static SubLObject do_relevant_genls_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list314 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_links_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list314 );
    genl_links_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list314 );
    col = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list314 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list314 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list314 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym258$DO_RELEVANT_FORWARD_SBHL_LINK_NODES, ConsesLow.list( genl_links_var, col, mt, tv, $list313, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list314 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 43243L)
  public static SubLObject do_genls(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list315 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list315 );
    genl_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list315 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list315 );
    col = current.first();
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list315 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject dummy = $sym316$DUMMY;
      return ConsesLow.listS( $sym317$DO_TRUE_GENLS_LINKS, ConsesLow.list( genl_var, mt_var, dummy, col ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list315 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 43500L)
  public static SubLObject do_local_genls(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list318 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list318 );
    genl_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list318 );
    col = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list318 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list318 );
      if( NIL == conses_high.member( current_$6, $list260, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw116$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list318 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw261$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject mt_var = $sym319$MT_VAR;
    final SubLObject tv_var = $sym320$TV_VAR;
    return ConsesLow.list( $sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, ConsesLow.list( $sym317$DO_TRUE_GENLS_LINKS, ConsesLow.list( genl_var, mt_var, tv_var, col, done ), ConsesLow.list( $sym266$IGNORE, tv_var ),
        ConsesLow.listS( $sym4$PWHEN, ConsesLow.list( $sym75$RELEVANT_MT_, mt_var ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 43902L)
  public static SubLObject do_true_spec_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list321 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list321 );
    spec_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list321 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list321 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list321 );
    col = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list321 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, ConsesLow.list( spec_var, tv_var, mt_var, col, $list313, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list321 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 44201L)
  public static SubLObject do_relevant_spec_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list322 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_links_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list322 );
    spec_links_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list322 );
    col = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list322 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list322 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list322 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym273$DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, ConsesLow.list( spec_links_var, col, mt, tv, $list313, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list322 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 44484L)
  public static SubLObject do_local_specs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list323 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list323 );
    spec_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list323 );
    col = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list323 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list323 );
      if( NIL == conses_high.member( current_$7, $list260, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw116$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list323 );
    }
    final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw261$MT, current );
    final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject mt_var = $sym324$MT_VAR;
    final SubLObject tv_var = $sym325$TV_VAR;
    return ConsesLow.list( $sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, ConsesLow.list( $sym326$DO_TRUE_SPEC_LINKS, ConsesLow.list( spec_var, mt_var, tv_var, col, done ), ConsesLow.list( $sym266$IGNORE, tv_var ),
        ConsesLow.listS( $sym4$PWHEN, ConsesLow.list( $sym75$RELEVANT_MT_, mt_var ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 44885L)
  public static SubLObject do_all_genls(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list327 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list327 );
    genl_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list327 );
    col = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list327 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list327 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list327 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list327 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, ConsesLow.list( genl_var, $list313, col, mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list327 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 45178L)
  public static SubLObject do_all_genls_depth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list329 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list329 );
    genl_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list329 );
    col = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list329 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list329 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list329 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, ConsesLow.listS( genl_var, new SubLObject[] { $list313, col, mt, tv, done_var, $list225
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list329 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 45465L)
  public static SubLObject do_all_genls_breadth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list329 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list329 );
    genl_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list329 );
    col = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list329 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list329 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list329 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, ConsesLow.listS( genl_var, new SubLObject[] { $list313, col, mt, tv, done_var, $list195
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list329 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 45758L)
  public static SubLObject do_all_genls_by_generality(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list330 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl = NIL;
    SubLObject spec = NIL;
    SubLObject domain_mt = NIL;
    SubLObject doneP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list330 );
    genl = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list330 );
    spec = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list330 );
    domain_mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list330 );
    doneP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject v_genls = $sym331$GENLS;
      return ConsesLow.list( $sym293$WITH_MT, domain_mt, ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( v_genls, ConsesLow.list( $sym294$SORT_BY_GENERALITY_ESTIMATE, ConsesLow.list( $sym332$ALL_GENLS,
          spec ) ) ) ), ConsesLow.listS( $sym81$CSOME, ConsesLow.list( genl, v_genls, doneP ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list330 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 46076L)
  public static SubLObject do_all_specs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list333 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list333 );
    spec_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list333 );
    col = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list333 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list333 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list333 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list333 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, ConsesLow.list( spec_var, $list313, col, mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list333 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 46371L)
  public static SubLObject do_all_specs_depth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list335 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list335 );
    spec_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list335 );
    col = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list335 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list335 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list335 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, ConsesLow.listS( spec_var, new SubLObject[] { $list313, col, mt, tv, done_var, $list225
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list335 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 46660L)
  public static SubLObject do_all_specs_breadth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list335 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_var = NIL;
    SubLObject col = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list335 );
    spec_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list335 );
    col = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list335 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list335 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list335 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, ConsesLow.listS( spec_var, new SubLObject[] { $list313, col, mt, tv, done_var, $list195
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list335 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 46955L)
  public static SubLObject do_all_specs_by_generality(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list336 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec = NIL;
    SubLObject v_term = NIL;
    SubLObject domain_mt = NIL;
    SubLObject doneP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list336 );
    spec = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list336 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list336 );
    domain_mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list336 );
    doneP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject specs = $sym337$SPECS;
      return ConsesLow.list( $sym293$WITH_MT, domain_mt, ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( specs, ConsesLow.list( $sym338$NREVERSE, ConsesLow.list( $sym294$SORT_BY_GENERALITY_ESTIMATE, ConsesLow
          .list( $sym339$ALL_SPECS, v_term ) ) ) ) ), ConsesLow.listS( $sym81$CSOME, ConsesLow.list( spec, specs, doneP ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list336 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 47228L)
  public static SubLObject do_true_genl_predicate_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list340 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_predicate_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list340 );
    genl_predicate_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list340 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list340 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list340 );
    pred = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list340 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, ConsesLow.list( genl_predicate_var, tv_var, mt_var, pred, $list341, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list340 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 47686L)
  public static SubLObject do_relevant_genl_predicate_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list342 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_predicate_links_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list342 );
    genl_predicate_links_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list342 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list342 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list342 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list342 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym258$DO_RELEVANT_FORWARD_SBHL_LINK_NODES, ConsesLow.list( genl_predicate_links_var, pred, mt, tv, $list341, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list342 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 48003L)
  public static SubLObject do_true_spec_predicate_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list343 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_predicate_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list343 );
    spec_predicate_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list343 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list343 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list343 );
    pred = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list343 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, ConsesLow.list( spec_predicate_var, tv_var, mt_var, pred, $list341, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list343 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 48348L)
  public static SubLObject do_relevant_spec_predicate_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list344 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_predicate_links_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list344 );
    spec_predicate_links_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list344 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list344 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list344 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list344 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym273$DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, ConsesLow.list( spec_predicate_links_var, pred, mt, tv, $list341, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list344 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 48667L)
  public static SubLObject do_all_genl_predicates(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list345 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_predicate_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list345 );
    genl_predicate_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list345 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list345 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list345 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list345 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list345 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, ConsesLow.list( genl_predicate_var, $list341, pred, mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list345 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 49020L)
  public static SubLObject do_all_genl_predicates_depth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list347 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_predicate_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list347 );
    genl_predicate_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list347 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list347 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list347 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list347 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, ConsesLow.listS( genl_predicate_var, new SubLObject[] { $list341, pred, mt, tv, done_var, $list225
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list347 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 49356L)
  public static SubLObject do_all_genl_predicates_breadth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list347 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_predicate_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list347 );
    genl_predicate_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list347 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list347 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list347 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list347 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, ConsesLow.listS( genl_predicate_var, new SubLObject[] { $list341, pred, mt, tv, done_var, $list195
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list347 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 49698L)
  public static SubLObject do_all_genl_predicates_and_inverses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list348 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_predicate_var = NIL;
    SubLObject inverse_mode_p = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list348 );
    genl_predicate_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list348 );
    inverse_mode_p = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list348 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list348 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list348 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list348 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym349$DO_ALL_MODE_FORWARD_TRUE_LINKS_FOR_INVERSES, ConsesLow.list( genl_predicate_var, inverse_mode_p, $list341, pred, mt, tv, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list348 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 50031L)
  public static SubLObject do_all_spec_predicates(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list350 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_predicate_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list350 );
    spec_predicate_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list350 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list350 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list350 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list350 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list350 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, ConsesLow.list( spec_predicate_var, $list341, pred, mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list350 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 50385L)
  public static SubLObject do_all_spec_predicates_depth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list352 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_predicate_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list352 );
    spec_predicate_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list352 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list352 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list352 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list352 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, ConsesLow.listS( spec_predicate_var, new SubLObject[] { $list341, pred, mt, tv, done_var, $list225
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list352 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 50723L)
  public static SubLObject do_all_spec_predicates_breadth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list352 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_predicate_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list352 );
    spec_predicate_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list352 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list352 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list352 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list352 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, ConsesLow.listS( spec_predicate_var, new SubLObject[] { $list341, pred, mt, tv, done_var, $list195
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list352 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 51067L)
  public static SubLObject do_all_spec_predicates_and_inverses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list353 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_var = NIL;
    SubLObject inverse_mode_p = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list353 );
    spec_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list353 );
    inverse_mode_p = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list353 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list353 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list353 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list353 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym354$DO_ALL_MODE_BACKWARD_TRUE_LINKS_FOR_INVERSES, ConsesLow.list( spec_var, inverse_mode_p, $list341, pred, mt, tv, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list353 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 51381L)
  public static SubLObject do_all_proper_genl_predicates(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list345 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_predicate_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list345 );
    genl_predicate_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list345 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list345 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list345 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list345 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list345 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym81$CSOME, ConsesLow.list( genl_predicate_var, ConsesLow.list( $sym355$ALL_PROPER_GENL_PREDICATES, pred, mt, tv ), done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list345 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 52121L)
  public static SubLObject do_all_proper_genl_inverses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list356 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_inverse_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list356 );
    genl_inverse_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list356 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list356 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list356 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list356 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list356 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym81$CSOME, ConsesLow.list( genl_inverse_var, ConsesLow.list( $sym357$ALL_PROPER_GENL_INVERSES, pred, mt, tv ), done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list356 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 52826L)
  public static SubLObject do_true_genl_inverse_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list358 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_inverse_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list358 );
    genl_inverse_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list358 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list358 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list358 );
    pred = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list358 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, ConsesLow.list( genl_inverse_var, tv_var, mt_var, pred, $list359, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list358 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 53190L)
  public static SubLObject do_relevant_genl_inverse_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list360 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_inverse_links_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list360 );
    genl_inverse_links_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list360 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list360 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list360 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list360 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym258$DO_RELEVANT_FORWARD_SBHL_LINK_NODES, ConsesLow.list( genl_inverse_links_var, pred, mt, tv, $list359, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list360 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 53503L)
  public static SubLObject do_true_spec_inverse_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list361 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_inverse_var = NIL;
    SubLObject mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list361 );
    spec_inverse_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list361 );
    mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list361 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list361 );
    pred = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list361 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, ConsesLow.list( spec_inverse_var, tv_var, mt_var, pred, $list359, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list361 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 53842L)
  public static SubLObject do_relevant_spec_inverse_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list362 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_inverse_links_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list362 );
    spec_inverse_links_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list362 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list362 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list362 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list362 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym273$DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, ConsesLow.list( spec_inverse_links_var, pred, mt, tv, $list359, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list362 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 54157L)
  public static SubLObject do_all_genl_inverses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list356 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_inverse_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list356 );
    genl_inverse_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list356 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list356 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list356 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list356 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list356 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, ConsesLow.list( genl_inverse_var, $list359, pred, mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list356 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 54504L)
  public static SubLObject do_all_genl_inverses_depth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list363 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_inverse_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list363 );
    genl_inverse_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list363 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list363 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list363 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list363 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, ConsesLow.listS( genl_inverse_var, new SubLObject[] { $list359, pred, mt, tv, done_var, $list225
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list363 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 54836L)
  public static SubLObject do_all_genl_inverses_breadth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list363 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_inverse_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list363 );
    genl_inverse_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list363 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list363 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list363 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list363 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, ConsesLow.listS( genl_inverse_var, new SubLObject[] { $list359, pred, mt, tv, done_var, $list195
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list363 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 55174L)
  public static SubLObject do_all_spec_inverses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list364 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_inverse_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list364 );
    spec_inverse_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list364 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list364 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list364 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list364 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list364 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, ConsesLow.list( spec_inverse_var, $list359, pred, mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list364 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 55522L)
  public static SubLObject do_all_spec_inverses_depth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list365 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_inverse_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list365 );
    spec_inverse_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list365 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list365 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list365 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list365 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, ConsesLow.listS( spec_inverse_var, new SubLObject[] { $list359, pred, mt, tv, done_var, $list225
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list365 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 55856L)
  public static SubLObject do_all_spec_inverses_breadth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list365 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_inverse_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list365 );
    spec_inverse_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list365 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list365 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list365 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list365 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, ConsesLow.listS( spec_inverse_var, new SubLObject[] { $list359, pred, mt, tv, done_var, $list195
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list365 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 56196L)
  public static SubLObject do_all_genl_preds_and_inverses_breadth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list366 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject pred_var = NIL;
    SubLObject inverse_mode_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list366 );
    pred_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list366 );
    inverse_mode_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list366 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list366 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list366 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list366 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym367$DO_ALL_PREDS_AND_INVERSES, ConsesLow.listS( pred_var, new SubLObject[] { inverse_mode_var, pred, $list215, mt, tv, done_var, $list195
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list366 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 56499L)
  public static SubLObject do_all_genl_preds_and_inverses_depth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list366 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject pred_var = NIL;
    SubLObject inverse_mode_var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list366 );
    pred_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list366 );
    inverse_mode_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list366 );
    pred = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list366 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list366 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list366 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym367$DO_ALL_PREDS_AND_INVERSES, ConsesLow.listS( pred_var, new SubLObject[] { inverse_mode_var, pred, $list215, mt, tv, done_var, $list225
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list366 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 56770L)
  public static SubLObject do_all_preds_and_inverses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list368 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject pred_var = NIL;
    SubLObject inverse_mode_var = NIL;
    SubLObject pred = NIL;
    SubLObject direction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list368 );
    pred_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list368 );
    inverse_mode_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list368 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list368 );
    direction = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list368 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list368 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list368 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list368 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject module = $sym369$MODULE;
      final SubLObject node_var = $sym370$NODE_VAR;
      final SubLObject node_and_predicate_mode = $sym371$NODE_AND_PREDICATE_MODE;
      final SubLObject predicate_mode = $sym372$PREDICATE_MODE;
      final SubLObject deck_type = $sym373$DECK_TYPE;
      final SubLObject recur_deck = $sym374$RECUR_DECK;
      final SubLObject node_vars_link_node = $sym375$NODE_VARS_LINK_NODE;
      return ConsesLow.list( $sym128$PUNLESS, done_var, ConsesLow.list( $sym2$CLET, ConsesLow.list( reader.bq_cons( module, $list376 ), ConsesLow.list( node_var, pred ), ConsesLow.list( deck_type, ConsesLow.listS(
          $sym194$FIF, ConsesLow.listS( EQ, search_type, $list225 ), $list226 ) ), ConsesLow.list( recur_deck, ConsesLow.list( $sym197$CREATE_DECK, deck_type ) ), node_and_predicate_mode ), ConsesLow.list(
              $sym198$WITH_NEW_SBHL_SPACE, ConsesLow.list( $sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, ConsesLow.list( $sym199$POSSIBLY_WITH_SBHL_TRUE_TV, tv, ConsesLow.list( $sym200$WITH_SBHL_SEARCH_MODULE, module,
                  ConsesLow.list( $sym201$WITH_SBHL_TYPE_TEST, pred, ConsesLow.list( $sym202$WITH_SBHL_SEARCH_DIRECTION, direction, ConsesLow.list( $sym203$WITH_SBHL_LINK_DIRECTION, ConsesLow.list(
                      $sym204$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, direction, module ), ConsesLow.list( $sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, ConsesLow.list( $sym205$SBHL_MARK_NODE_MARKED, node_var ), ConsesLow
                          .list( $sym169$CSETQ, node_and_predicate_mode, ConsesLow.listS( $sym90$LIST, pred, $list227 ) ), ConsesLow.list( $sym206$WHILE, ConsesLow.list( $sym184$CAND, node_and_predicate_mode, ConsesLow
                              .list( $sym207$CNOT, done_var ) ), ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( node_var, ConsesLow.list( $sym228$FIRST, node_and_predicate_mode ) ), ConsesLow.list(
                                  predicate_mode, ConsesLow.list( $sym229$SECOND, node_and_predicate_mode ) ), ConsesLow.list( pred_var, node_var ) ), ConsesLow.list( $sym230$WITH_SBHL_PREDICATE_MODE, predicate_mode,
                                      ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( inverse_mode_var, predicate_mode ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list(
                                          $sym208$DO_ACCESSIBLE_SBHL_LINK_NODES, ConsesLow.list( node_vars_link_node, node_var, $list209, module, done_var ), ConsesLow.list( $sym128$PUNLESS, ConsesLow.list(
                                              $sym210$SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node ), ConsesLow.list( $sym205$SBHL_MARK_NODE_MARKED, node_vars_link_node ), ConsesLow.list( $sym211$DECK_PUSH,
                                                  ConsesLow.listS( $sym90$LIST, node_vars_link_node, $list227 ), recur_deck ) ) ) ) ), ConsesLow.list( $sym169$CSETQ, node_and_predicate_mode, ConsesLow.list(
                                                      $sym212$DECK_POP, recur_deck ) ) ) ) ) ) ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list368 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 58490L)
  public static SubLObject do_true_genl_mt_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list377 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_mt_var = NIL;
    SubLObject mt_mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject mt_node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list377 );
    genl_mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list377 );
    mt_mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list377 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list377 );
    mt_node = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list377 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, ConsesLow.list( genl_mt_var, tv_var, mt_mt_var, mt_node, $list378, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list377 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 58920L)
  public static SubLObject do_relevant_genl_mt_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list379 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_mt_links_var = NIL;
    SubLObject mt_node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list379 );
    genl_mt_links_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list379 );
    mt_node = current.first();
    current = current.rest();
    final SubLObject mt_mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list379 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list379 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list379 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym258$DO_RELEVANT_FORWARD_SBHL_LINK_NODES, ConsesLow.list( genl_mt_links_var, mt_node, mt_mt, tv, $list378, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list379 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 59225L)
  public static SubLObject do_true_spec_mt_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list380 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_mt_var = NIL;
    SubLObject mt_mt_var = NIL;
    SubLObject tv_var = NIL;
    SubLObject mt_node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list380 );
    spec_mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list380 );
    mt_mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list380 );
    tv_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list380 );
    mt_node = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list380 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, ConsesLow.list( spec_mt_var, tv_var, mt_mt_var, mt_node, $list378, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list380 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 59551L)
  public static SubLObject do_relevant_spec_mt_links(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list381 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_mt_links_var = NIL;
    SubLObject mt_node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list381 );
    spec_mt_links_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list381 );
    mt_node = current.first();
    current = current.rest();
    final SubLObject mt_mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list381 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list381 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list381 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym273$DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, ConsesLow.list( spec_mt_links_var, mt_node, mt_mt, tv, $list378, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list381 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 59858L)
  public static SubLObject do_all_genl_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list382 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_mt_var = NIL;
    SubLObject mt_node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list382 );
    genl_mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list382 );
    mt_node = current.first();
    current = current.rest();
    final SubLObject mt_mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list382 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list382 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list382 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list382 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, ConsesLow.list( genl_mt_var, $list378, mt_node, mt_mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list382 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 60178L)
  public static SubLObject do_all_genl_mts_depth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list383 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_mt_var = NIL;
    SubLObject mt_node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list383 );
    genl_mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list383 );
    mt_node = current.first();
    current = current.rest();
    final SubLObject mt_mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list383 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list383 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list383 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, ConsesLow.listS( genl_mt_var, new SubLObject[] { $list378, mt_node, mt_mt, tv, done_var, $list225
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list383 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 60489L)
  public static SubLObject do_all_genl_mts_breadth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list383 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject genl_mt_var = NIL;
    SubLObject mt_node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list383 );
    genl_mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list383 );
    mt_node = current.first();
    current = current.rest();
    final SubLObject mt_mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list383 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list383 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list383 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, ConsesLow.listS( genl_mt_var, new SubLObject[] { $list378, mt_node, mt_mt, tv, done_var, $list195
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list383 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 60806L)
  public static SubLObject do_all_spec_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list384 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_mt_var = NIL;
    SubLObject mt_node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list384 );
    spec_mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list384 );
    mt_node = current.first();
    current = current.rest();
    final SubLObject mt_mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list384 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list384 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list384 );
    current = current.rest();
    final SubLObject search_type = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list384 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, ConsesLow.list( spec_mt_var, $list378, mt_node, mt_mt, tv, done_var, search_type ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list384 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 61128L)
  public static SubLObject do_all_spec_mts_depth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_mt_var = NIL;
    SubLObject mt_node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    spec_mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    mt_node = current.first();
    current = current.rest();
    final SubLObject mt_mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list385 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list385 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list385 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, ConsesLow.listS( spec_mt_var, new SubLObject[] { $list378, mt_node, mt_mt, tv, done_var, $list225
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list385 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 61441L)
  public static SubLObject do_all_spec_mts_breadth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject spec_mt_var = NIL;
    SubLObject mt_node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    spec_mt_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list385 );
    mt_node = current.first();
    current = current.rest();
    final SubLObject mt_mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list385 );
    current = current.rest();
    final SubLObject tv = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list385 );
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list385 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, ConsesLow.listS( spec_mt_var, new SubLObject[] { $list378, mt_node, mt_mt, tv, done_var, $list195
      } ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list385 );
    return NIL;
  }

  public static SubLObject declare_sbhl_macros_file()
  {
    SubLFiles.declareMacro( me, "do_sbhl_link_nodes", "DO-SBHL-LINK-NODES" );
    SubLFiles.declareMacro( me, "do_sbhl_tv_links", "DO-SBHL-TV-LINKS" );
    SubLFiles.declareMacro( me, "do_sbhl_mt_link", "DO-SBHL-MT-LINK" );
    SubLFiles.declareMacro( me, "do_sbhl_mt_links", "DO-SBHL-MT-LINKS" );
    SubLFiles.declareMacro( me, "do_sbhl_direction_link", "DO-SBHL-DIRECTION-LINK" );
    SubLFiles.declareMacro( me, "do_sbhl_graph_link", "DO-SBHL-GRAPH-LINK" );
    SubLFiles.declareMacro( me, "do_sbhl_forward_true_link_mts", "DO-SBHL-FORWARD-TRUE-LINK-MTS" );
    SubLFiles.declareMacro( me, "do_sbhl_forward_true_link_nodes_and_mts", "DO-SBHL-FORWARD-TRUE-LINK-NODES-AND-MTS" );
    SubLFiles.declareMacro( me, "do_all_sbhl_tv_links", "DO-ALL-SBHL-TV-LINKS" );
    SubLFiles.declareMacro( me, "do_all_sbhl_link_nodes", "DO-ALL-SBHL-LINK-NODES" );
    SubLFiles.declareMacro( me, "do_all_sbhl_forward_true_link_nodes", "DO-ALL-SBHL-FORWARD-TRUE-LINK-NODES" );
    SubLFiles.declareMacro( me, "do_all_sbhl_backward_true_link_nodes", "DO-ALL-SBHL-BACKWARD-TRUE-LINK-NODES" );
    SubLFiles.declareMacro( me, "with_sbhl_graph_link", "WITH-SBHL-GRAPH-LINK" );
    SubLFiles.declareMacro( me, "with_relevant_sbhl_link_nodes", "WITH-RELEVANT-SBHL-LINK-NODES" );
    SubLFiles.declareMacro( me, "with_relevant_sbhl_link_nodes_and_non_forts", "WITH-RELEVANT-SBHL-LINK-NODES-AND-NON-FORTS" );
    SubLFiles.declareMacro( me, "with_relevant_sbhl_fort_link_nodes", "WITH-RELEVANT-SBHL-FORT-LINK-NODES" );
    SubLFiles.declareMacro( me, "do_non_fort_direct_instance_links", "DO-NON-FORT-DIRECT-INSTANCE-LINKS" );
    SubLFiles.declareMacro( me, "with_sbhl_non_fort_links", "WITH-SBHL-NON-FORT-LINKS" );
    SubLFiles.declareFunction( me, "do_sbhl_non_fort_linksP", "DO-SBHL-NON-FORT-LINKS?", 2, 0, false );
    SubLFiles.declareFunction( me, "collection_supports_non_fort_instancesP", "COLLECTION-SUPPORTS-NON-FORT-INSTANCES?", 1, 0, false );
    SubLFiles.declareFunction( me, "admissible_non_fort_link_nodeP", "ADMISSIBLE-NON-FORT-LINK-NODE?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_relevant_sbhl_naut_generated_links", "DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS" );
    SubLFiles.declareMacro( me, "do_relevant_forward_sbhl_link_nodes", "DO-RELEVANT-FORWARD-SBHL-LINK-NODES" );
    SubLFiles.declareMacro( me, "do_relevant_backward_sbhl_link_nodes", "DO-RELEVANT-BACKWARD-SBHL-LINK-NODES" );
    SubLFiles.declareMacro( me, "with_accessible_sbhl_link_nodes", "WITH-ACCESSIBLE-SBHL-LINK-NODES" );
    SubLFiles.declareMacro( me, "with_accessible_sbhl_link_nodes_and_non_forts", "WITH-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS" );
    SubLFiles.declareMacro( me, "do_accessible_sbhl_link_nodes", "DO-ACCESSIBLE-SBHL-LINK-NODES" );
    SubLFiles.declareMacro( me, "do_accessible_sbhl_link_nodes_and_non_forts", "DO-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS" );
    SubLFiles.declareMacro( me, "do_accessible_sbhl_link_node_search_states", "DO-ACCESSIBLE-SBHL-LINK-NODE-SEARCH-STATES" );
    SubLFiles.declareMacro( me, "do_accessible_sbhl_tv_links", "DO-ACCESSIBLE-SBHL-TV-LINKS" );
    SubLFiles.declareMacro( me, "do_relevant_sbhl_link_nodes", "DO-RELEVANT-SBHL-LINK-NODES" );
    SubLFiles.declareMacro( me, "do_relevant_sbhl_forward_link_nodes", "DO-RELEVANT-SBHL-FORWARD-LINK-NODES" );
    SubLFiles.declareMacro( me, "do_relevant_sbhl_backward_link_nodes", "DO-RELEVANT-SBHL-BACKWARD-LINK-NODES" );
    SubLFiles.declareMacro( me, "do_sbhl_predicates", "DO-SBHL-PREDICATES" );
    SubLFiles.declareMacro( me, "do_sbhl_non_time_predicates", "DO-SBHL-NON-TIME-PREDICATES" );
    SubLFiles.declareMacro( me, "do_sbhl_non_time_modules", "DO-SBHL-NON-TIME-MODULES" );
    SubLFiles.declareMacro( me, "do_sbhl_graphs", "DO-SBHL-GRAPHS" );
    SubLFiles.declareMacro( me, "with_forward_sbhl_link_direction", "WITH-FORWARD-SBHL-LINK-DIRECTION" );
    SubLFiles.declareMacro( me, "with_backward_sbhl_link_direction", "WITH-BACKWARD-SBHL-LINK-DIRECTION" );
    SubLFiles.declareMacro( me, "with_sbhl_type_test", "WITH-SBHL-TYPE-TEST" );
    SubLFiles.declareMacro( me, "do_sbhl_module_graph", "DO-SBHL-MODULE-GRAPH" );
    SubLFiles.declareMacro( me, "do_with_relevant_sbhl_modules", "DO-WITH-RELEVANT-SBHL-MODULES" );
    SubLFiles.declareFunction( me, "get_sbhl_accessible_modules", "GET-SBHL-ACCESSIBLE-MODULES", 1, 0, false );
    SubLFiles.declareMacro( me, "do_relevant_sbhl_directions", "DO-RELEVANT-SBHL-DIRECTIONS" );
    SubLFiles.declareMacro( me, "bind_sbhl_search_behavior", "BIND-SBHL-SEARCH-BEHAVIOR" );
    SubLFiles.declareMacro( me, "bind_sbhl_boolean_goal_fn", "BIND-SBHL-BOOLEAN-GOAL-FN" );
    SubLFiles.declareMacro( me, "sbhl_possibly_rebind_temporal_search_state", "SBHL-POSSIBLY-REBIND-TEMPORAL-SEARCH-STATE" );
    SubLFiles.declareMacro( me, "bind_sbhl_sample_leaf_search_behavior", "BIND-SBHL-SAMPLE-LEAF-SEARCH-BEHAVIOR" );
    SubLFiles.declareMacro( me, "do_all_simple_true_links", "DO-ALL-SIMPLE-TRUE-LINKS" );
    SubLFiles.declareMacro( me, "do_all_simple_forward_true_links", "DO-ALL-SIMPLE-FORWARD-TRUE-LINKS" );
    SubLFiles.declareMacro( me, "do_all_simple_backward_true_links", "DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS" );
    SubLFiles.declareMacro( me, "do_all_simple_true_links_for_inverses", "DO-ALL-SIMPLE-TRUE-LINKS-FOR-INVERSES" );
    SubLFiles.declareMacro( me, "do_all_simple_forward_true_links_for_inverses", "DO-ALL-SIMPLE-FORWARD-TRUE-LINKS-FOR-INVERSES" );
    SubLFiles.declareMacro( me, "do_all_simple_backward_true_links_for_inverses", "DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS-FOR-INVERSES" );
    SubLFiles.declareMacro( me, "do_all_mode_true_links_for_inverses", "DO-ALL-MODE-TRUE-LINKS-FOR-INVERSES" );
    SubLFiles.declareMacro( me, "do_all_mode_backward_true_links_for_inverses", "DO-ALL-MODE-BACKWARD-TRUE-LINKS-FOR-INVERSES" );
    SubLFiles.declareMacro( me, "do_all_mode_forward_true_links_for_inverses", "DO-ALL-MODE-FORWARD-TRUE-LINKS-FOR-INVERSES" );
    SubLFiles.declareMacro( me, "do_all_forward_true_links_for_tt", "DO-ALL-FORWARD-TRUE-LINKS-FOR-TT" );
    SubLFiles.declareMacro( me, "do_all_backward_true_links_for_tt", "DO-ALL-BACKWARD-TRUE-LINKS-FOR-TT" );
    SubLFiles.declareMacro( me, "do_true_isa_links", "DO-TRUE-ISA-LINKS" );
    SubLFiles.declareMacro( me, "do_relevant_isa_links", "DO-RELEVANT-ISA-LINKS" );
    SubLFiles.declareMacro( me, "do_local_isas", "DO-LOCAL-ISAS" );
    SubLFiles.declareMacro( me, "some_relevant_isa", "SOME-RELEVANT-ISA" );
    SubLFiles.declareMacro( me, "do_true_instance_links", "DO-TRUE-INSTANCE-LINKS" );
    SubLFiles.declareMacro( me, "do_relevant_instance_links", "DO-RELEVANT-INSTANCE-LINKS" );
    SubLFiles.declareMacro( me, "do_local_instances", "DO-LOCAL-INSTANCES" );
    SubLFiles.declareMacro( me, "do_true_quoted_isa_links", "DO-TRUE-QUOTED-ISA-LINKS" );
    SubLFiles.declareMacro( me, "do_local_quoted_isas", "DO-LOCAL-QUOTED-ISAS" );
    SubLFiles.declareMacro( me, "do_true_quoted_instance_links", "DO-TRUE-QUOTED-INSTANCE-LINKS" );
    SubLFiles.declareMacro( me, "do_local_quoted_instances", "DO-LOCAL-QUOTED-INSTANCES" );
    SubLFiles.declareMacro( me, "do_all_isa", "DO-ALL-ISA" );
    SubLFiles.declareMacro( me, "do_all_isa_depth", "DO-ALL-ISA-DEPTH" );
    SubLFiles.declareMacro( me, "do_all_isa_breadth", "DO-ALL-ISA-BREADTH" );
    SubLFiles.declareMacro( me, "do_all_isas_by_generality", "DO-ALL-ISAS-BY-GENERALITY" );
    SubLFiles.declareMacro( me, "do_all_instances", "DO-ALL-INSTANCES" );
    SubLFiles.declareMacro( me, "do_all_instances_depth", "DO-ALL-INSTANCES-DEPTH" );
    SubLFiles.declareMacro( me, "do_all_instances_breadth", "DO-ALL-INSTANCES-BREADTH" );
    SubLFiles.declareMacro( me, "do_all_fort_instances", "DO-ALL-FORT-INSTANCES" );
    SubLFiles.declareMacro( me, "do_all_instances_of_all", "DO-ALL-INSTANCES-OF-ALL" );
    SubLFiles.declareMacro( me, "do_all_quoted_instances", "DO-ALL-QUOTED-INSTANCES" );
    SubLFiles.declareMacro( me, "do_all_fort_quoted_instances", "DO-ALL-FORT-QUOTED-INSTANCES" );
    SubLFiles.declareMacro( me, "do_all_quoted_instances_of_all", "DO-ALL-QUOTED-INSTANCES-OF-ALL" );
    SubLFiles.declareMacro( me, "do_true_genls_links", "DO-TRUE-GENLS-LINKS" );
    SubLFiles.declareMacro( me, "do_relevant_genls_links", "DO-RELEVANT-GENLS-LINKS" );
    SubLFiles.declareMacro( me, "do_genls", "DO-GENLS" );
    SubLFiles.declareMacro( me, "do_local_genls", "DO-LOCAL-GENLS" );
    SubLFiles.declareMacro( me, "do_true_spec_links", "DO-TRUE-SPEC-LINKS" );
    SubLFiles.declareMacro( me, "do_relevant_spec_links", "DO-RELEVANT-SPEC-LINKS" );
    SubLFiles.declareMacro( me, "do_local_specs", "DO-LOCAL-SPECS" );
    SubLFiles.declareMacro( me, "do_all_genls", "DO-ALL-GENLS" );
    SubLFiles.declareMacro( me, "do_all_genls_depth", "DO-ALL-GENLS-DEPTH" );
    SubLFiles.declareMacro( me, "do_all_genls_breadth", "DO-ALL-GENLS-BREADTH" );
    SubLFiles.declareMacro( me, "do_all_genls_by_generality", "DO-ALL-GENLS-BY-GENERALITY" );
    SubLFiles.declareMacro( me, "do_all_specs", "DO-ALL-SPECS" );
    SubLFiles.declareMacro( me, "do_all_specs_depth", "DO-ALL-SPECS-DEPTH" );
    SubLFiles.declareMacro( me, "do_all_specs_breadth", "DO-ALL-SPECS-BREADTH" );
    SubLFiles.declareMacro( me, "do_all_specs_by_generality", "DO-ALL-SPECS-BY-GENERALITY" );
    SubLFiles.declareMacro( me, "do_true_genl_predicate_links", "DO-TRUE-GENL-PREDICATE-LINKS" );
    SubLFiles.declareMacro( me, "do_relevant_genl_predicate_links", "DO-RELEVANT-GENL-PREDICATE-LINKS" );
    SubLFiles.declareMacro( me, "do_true_spec_predicate_links", "DO-TRUE-SPEC-PREDICATE-LINKS" );
    SubLFiles.declareMacro( me, "do_relevant_spec_predicate_links", "DO-RELEVANT-SPEC-PREDICATE-LINKS" );
    SubLFiles.declareMacro( me, "do_all_genl_predicates", "DO-ALL-GENL-PREDICATES" );
    SubLFiles.declareMacro( me, "do_all_genl_predicates_depth", "DO-ALL-GENL-PREDICATES-DEPTH" );
    SubLFiles.declareMacro( me, "do_all_genl_predicates_breadth", "DO-ALL-GENL-PREDICATES-BREADTH" );
    SubLFiles.declareMacro( me, "do_all_genl_predicates_and_inverses", "DO-ALL-GENL-PREDICATES-AND-INVERSES" );
    SubLFiles.declareMacro( me, "do_all_spec_predicates", "DO-ALL-SPEC-PREDICATES" );
    SubLFiles.declareMacro( me, "do_all_spec_predicates_depth", "DO-ALL-SPEC-PREDICATES-DEPTH" );
    SubLFiles.declareMacro( me, "do_all_spec_predicates_breadth", "DO-ALL-SPEC-PREDICATES-BREADTH" );
    SubLFiles.declareMacro( me, "do_all_spec_predicates_and_inverses", "DO-ALL-SPEC-PREDICATES-AND-INVERSES" );
    SubLFiles.declareMacro( me, "do_all_proper_genl_predicates", "DO-ALL-PROPER-GENL-PREDICATES" );
    SubLFiles.declareMacro( me, "do_all_proper_genl_inverses", "DO-ALL-PROPER-GENL-INVERSES" );
    SubLFiles.declareMacro( me, "do_true_genl_inverse_links", "DO-TRUE-GENL-INVERSE-LINKS" );
    SubLFiles.declareMacro( me, "do_relevant_genl_inverse_links", "DO-RELEVANT-GENL-INVERSE-LINKS" );
    SubLFiles.declareMacro( me, "do_true_spec_inverse_links", "DO-TRUE-SPEC-INVERSE-LINKS" );
    SubLFiles.declareMacro( me, "do_relevant_spec_inverse_links", "DO-RELEVANT-SPEC-INVERSE-LINKS" );
    SubLFiles.declareMacro( me, "do_all_genl_inverses", "DO-ALL-GENL-INVERSES" );
    SubLFiles.declareMacro( me, "do_all_genl_inverses_depth", "DO-ALL-GENL-INVERSES-DEPTH" );
    SubLFiles.declareMacro( me, "do_all_genl_inverses_breadth", "DO-ALL-GENL-INVERSES-BREADTH" );
    SubLFiles.declareMacro( me, "do_all_spec_inverses", "DO-ALL-SPEC-INVERSES" );
    SubLFiles.declareMacro( me, "do_all_spec_inverses_depth", "DO-ALL-SPEC-INVERSES-DEPTH" );
    SubLFiles.declareMacro( me, "do_all_spec_inverses_breadth", "DO-ALL-SPEC-INVERSES-BREADTH" );
    SubLFiles.declareMacro( me, "do_all_genl_preds_and_inverses_breadth", "DO-ALL-GENL-PREDS-AND-INVERSES-BREADTH" );
    SubLFiles.declareMacro( me, "do_all_genl_preds_and_inverses_depth", "DO-ALL-GENL-PREDS-AND-INVERSES-DEPTH" );
    SubLFiles.declareMacro( me, "do_all_preds_and_inverses", "DO-ALL-PREDS-AND-INVERSES" );
    SubLFiles.declareMacro( me, "do_true_genl_mt_links", "DO-TRUE-GENL-MT-LINKS" );
    SubLFiles.declareMacro( me, "do_relevant_genl_mt_links", "DO-RELEVANT-GENL-MT-LINKS" );
    SubLFiles.declareMacro( me, "do_true_spec_mt_links", "DO-TRUE-SPEC-MT-LINKS" );
    SubLFiles.declareMacro( me, "do_relevant_spec_mt_links", "DO-RELEVANT-SPEC-MT-LINKS" );
    SubLFiles.declareMacro( me, "do_all_genl_mts", "DO-ALL-GENL-MTS" );
    SubLFiles.declareMacro( me, "do_all_genl_mts_depth", "DO-ALL-GENL-MTS-DEPTH" );
    SubLFiles.declareMacro( me, "do_all_genl_mts_breadth", "DO-ALL-GENL-MTS-BREADTH" );
    SubLFiles.declareMacro( me, "do_all_spec_mts", "DO-ALL-SPEC-MTS" );
    SubLFiles.declareMacro( me, "do_all_spec_mts_depth", "DO-ALL-SPEC-MTS-DEPTH" );
    SubLFiles.declareMacro( me, "do_all_spec_mts_breadth", "DO-ALL-SPEC-MTS-BREADTH" );
    return NIL;
  }

  public static SubLObject init_sbhl_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_sbhl_macros_file()
  {
    access_macros.register_macro_helper( $sym88$DO_SBHL_NON_FORT_LINKS_, $sym91$DO_SBHL_NON_FORT_LINKS );
    access_macros.register_macro_helper( $sym93$ADMISSIBLE_NON_FORT_LINK_NODE_, $sym91$DO_SBHL_NON_FORT_LINKS );
    access_macros.register_macro_helper( $sym152$GET_SBHL_ACCESSIBLE_MODULES, $sym105$DO_WITH_RELEVANT_SBHL_MODULES );
    utilities_macros.register_cyc_api_macro( $sym298$DO_ALL_INSTANCES, $list296, $str299$Iterator___see_do_all_simple_back );
    utilities_macros.register_cyc_api_macro( $sym302$DO_ALL_FORT_INSTANCES, $list296, $str303$Like__xref_do_all_instances_excep );
    utilities_macros.register_cyc_api_macro( $sym308$DO_ALL_QUOTED_INSTANCES, $list296, $str299$Iterator___see_do_all_simple_back );
    utilities_macros.register_cyc_api_macro( $sym309$DO_ALL_FORT_QUOTED_INSTANCES, $list296, $str303$Like__xref_do_all_instances_excep );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sbhl_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sbhl_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sbhl_macros_file();
  }
  static
  {
    me = new sbhl_macros();
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "TV" ), makeSymbol( "TV-LINKS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym1$LINK_NODES = makeUninternedSymbol( "LINK-NODES" );
    $sym2$CLET = makeSymbol( "CLET" );
    $sym3$GET_SBHL_LINK_NODES = makeSymbol( "GET-SBHL-LINK-NODES" );
    $sym4$PWHEN = makeSymbol( "PWHEN" );
    $sym5$DO_SET_OR_LIST = makeSymbol( "DO-SET-OR-LIST" );
    $kw6$DONE = makeKeyword( "DONE" );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "TV-VAR" ), makeSymbol( "LINK-NODES-VAR" ), makeSymbol( "TV-LINKS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym8$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "TV-VAR" ), makeSymbol( "LINK-NODES-VAR" ), makeSymbol( "MT" ), makeSymbol( "MT-LINKS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym10$TV_LINKS = makeUninternedSymbol( "TV-LINKS" );
    $sym11$GET_SBHL_TV_LINKS = makeSymbol( "GET-SBHL-TV-LINKS" );
    $sym12$DO_SBHL_TV_LINKS = makeSymbol( "DO-SBHL-TV-LINKS" );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "MT-VAR" ), makeSymbol( "TV-LINKS-VAR" ), makeSymbol( "MT-LINKS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "MT-VAR" ), makeSymbol( "TV-LINKS-VAR" ), makeSymbol( "DIRECTION" ), makeSymbol( "D-LINK" ), makeSymbol( "MODULE" ), makeSymbol( "&OPTIONAL" ), makeSymbol(
        "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym15$MT_LINKS = makeUninternedSymbol( "MT-LINKS" );
    $sym16$GET_SBHL_MT_LINKS = makeSymbol( "GET-SBHL-MT-LINKS" );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "DIRECTION-VAR" ), makeSymbol( "MT-LINKS-VAR" ), makeSymbol( "NODE" ), makeSymbol( "MODULE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym18$D_LINK = makeUninternedSymbol( "D-LINK" );
    $sym19$GET_SBHL_GRAPH_LINK = makeSymbol( "GET-SBHL-GRAPH-LINK" );
    $sym20$DO_RELEVANT_SBHL_DIRECTIONS = makeSymbol( "DO-RELEVANT-SBHL-DIRECTIONS" );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "MT-VAR" ), makeSymbol( "NODE" ), makeSymbol( "MODULE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym22$DIRECTION = makeUninternedSymbol( "DIRECTION" );
    $sym23$MT_LINKS = makeUninternedSymbol( "MT-LINKS" );
    $sym24$TV_LINKS = makeUninternedSymbol( "TV-LINKS" );
    $sym25$POSSIBLY_WITH_SBHL_MODULE = makeSymbol( "POSSIBLY-WITH-SBHL-MODULE" );
    $sym26$WITH_SBHL_FORWARD_LINK_DIRECTION_FOR_MODULE = makeSymbol( "WITH-SBHL-FORWARD-LINK-DIRECTION-FOR-MODULE" );
    $sym27$DO_SBHL_GRAPH_LINK = makeSymbol( "DO-SBHL-GRAPH-LINK" );
    $sym28$SBHL_FORWARD_DIRECTION_FOR_MODULE_P = makeSymbol( "SBHL-FORWARD-DIRECTION-FOR-MODULE-P" );
    $sym29$DO_SBHL_MT_LINKS = makeSymbol( "DO-SBHL-MT-LINKS" );
    $sym30$ANY_SBHL_TRUE_LINK_NODES_P = makeSymbol( "ANY-SBHL-TRUE-LINK-NODES-P" );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "NODE" ), makeSymbol( "MODULE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym32$DIRECTION = makeUninternedSymbol( "DIRECTION" );
    $sym33$MT_LINKS = makeUninternedSymbol( "MT-LINKS" );
    $sym34$TV_LINKS = makeUninternedSymbol( "TV-LINKS" );
    $sym35$TV = makeUninternedSymbol( "TV" );
    $sym36$LINK_NODES = makeUninternedSymbol( "LINK-NODES" );
    $sym37$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "DIRECTION-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "LINK-NODES-VAR" ), makeSymbol( "NODE" ), makeSymbol( "MODULE" ), makeSymbol(
        "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym39$MT_LINKS = makeUninternedSymbol( "MT-LINKS" );
    $sym40$TV_LINKS = makeUninternedSymbol( "TV-LINKS" );
    $list41 = ConsesLow.list( ConsesLow.list( makeSymbol( "DIRECTION-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "NODE" ), makeSymbol( "MODULE" ), makeSymbol(
        "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym42$LINK_NODES_VAR = makeUninternedSymbol( "LINK-NODES-VAR" );
    $sym43$DO_ALL_SBHL_TV_LINKS = makeSymbol( "DO-ALL-SBHL-TV-LINKS" );
    $list44 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "NODE" ), makeSymbol( "MODULE" ), makeSymbol( "&OPTIONAL" ), makeSymbol(
        "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym45$LINK_NODES_VAR = makeUninternedSymbol( "LINK-NODES-VAR" );
    $sym46$DIRECTION = makeUninternedSymbol( "DIRECTION" );
    $sym47$MT_LINKS = makeUninternedSymbol( "MT-LINKS" );
    $sym48$TV_LINKS = makeUninternedSymbol( "TV-LINKS" );
    $sym49$GET_SBHL_MODULE_FORWARD_DIRECTION = makeSymbol( "GET-SBHL-MODULE-FORWARD-DIRECTION" );
    $sym50$LINK_NODES_VAR = makeUninternedSymbol( "LINK-NODES-VAR" );
    $sym51$DIRECTION = makeUninternedSymbol( "DIRECTION" );
    $sym52$MT_LINKS = makeUninternedSymbol( "MT-LINKS" );
    $sym53$TV_LINKS = makeUninternedSymbol( "TV-LINKS" );
    $sym54$GET_SBHL_MODULE_BACKWARD_DIRECTION = makeSymbol( "GET-SBHL-MODULE-BACKWARD-DIRECTION" );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "D-LINK-VAR" ), makeSymbol( "NODE" ), makeSymbol( "MODULE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym56$PIF = makeSymbol( "PIF" );
    $list57 = ConsesLow.list( ConsesLow.list( makeSymbol( "SBHL-ERROR" ), FIVE_INTEGER, makeString( "attempting to bind direction link variable, to NIL. macro body not executed." ) ) );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODES-VAR" ), makeSymbol( "START-NODE" ), makeSymbol( "DIRECTION" ), makeSymbol( "MODULE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym59$NODE = makeUninternedSymbol( "NODE" );
    $sym60$NAUT_TO_NART = makeSymbol( "NAUT-TO-NART" );
    $sym61$PCOND = makeSymbol( "PCOND" );
    $sym62$SBHL_NODE_OBJECT_P = makeSymbol( "SBHL-NODE-OBJECT-P" );
    $sym63$WITH_RELEVANT_SBHL_FORT_LINK_NODES = makeSymbol( "WITH-RELEVANT-SBHL-FORT-LINK-NODES" );
    $sym64$CNAT_P = makeSymbol( "CNAT-P" );
    $sym65$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS = makeSymbol( "DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS" );
    $sym66$NODE = makeUninternedSymbol( "NODE" );
    $sym67$WITH_SBHL_NON_FORT_LINKS = makeSymbol( "WITH-SBHL-NON-FORT-LINKS" );
    $list68 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODES-VAR" ), makeSymbol( "NODE" ), makeSymbol( "DIRECTION" ), makeSymbol( "MODULE" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym69$D_LINK = makeUninternedSymbol( "D-LINK" );
    $sym70$MT = makeUninternedSymbol( "MT" );
    $sym71$TV_LINKS = makeUninternedSymbol( "TV-LINKS" );
    $sym72$TV = makeUninternedSymbol( "TV" );
    $sym73$WITH_SBHL_GRAPH_LINK = makeSymbol( "WITH-SBHL-GRAPH-LINK" );
    $sym74$DO_SBHL_DIRECTION_LINK = makeSymbol( "DO-SBHL-DIRECTION-LINK" );
    $sym75$RELEVANT_MT_ = makeSymbol( "RELEVANT-MT?" );
    $sym76$_SBHL_LINK_MT_ = makeSymbol( "*SBHL-LINK-MT*" );
    $sym77$RELEVANT_SBHL_TV_ = makeSymbol( "RELEVANT-SBHL-TV?" );
    $sym78$_SBHL_LINK_TV_ = makeSymbol( "*SBHL-LINK-TV*" );
    $list79 = ConsesLow.list( ConsesLow.list( makeSymbol( "INS-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "COL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym80$INSTANCE_TUPLE = makeUninternedSymbol( "INSTANCE-TUPLE" );
    $sym81$CSOME = makeSymbol( "CSOME" );
    $sym82$NON_FORT_INSTANCE_TABLE_LOOKUP = makeSymbol( "NON-FORT-INSTANCE-TABLE-LOOKUP" );
    $sym83$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $list84 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODES-VAR" ), makeSymbol( "NODE" ), makeSymbol( "MODULE" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym85$LINK_NODE = makeUninternedSymbol( "LINK-NODE" );
    $sym86$MT = makeUninternedSymbol( "MT" );
    $sym87$TV = makeUninternedSymbol( "TV" );
    $sym88$DO_SBHL_NON_FORT_LINKS_ = makeSymbol( "DO-SBHL-NON-FORT-LINKS?" );
    $sym89$DO_NON_FORT_DIRECT_INSTANCE_LINKS = makeSymbol( "DO-NON-FORT-DIRECT-INSTANCE-LINKS" );
    $sym90$LIST = makeSymbol( "LIST" );
    $sym91$DO_SBHL_NON_FORT_LINKS = makeSymbol( "DO-SBHL-NON-FORT-LINKS" );
    $const92$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym93$ADMISSIBLE_NON_FORT_LINK_NODE_ = makeSymbol( "ADMISSIBLE-NON-FORT-LINK-NODE?" );
    $list94 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODES-VAR" ), makeSymbol( "NODE" ), makeSymbol( "DIRECTION" ), makeSymbol( "MODULE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym95$GENERATING_FN = makeUninternedSymbol( "GENERATING-FN" );
    $sym96$SBHL_CSOME = makeSymbol( "SBHL-CSOME" );
    $sym97$GET_SBHL_MODULE_RELEVANT_NAUT_LINK_GENERATORS = makeSymbol( "GET-SBHL-MODULE-RELEVANT-NAUT-LINK-GENERATORS" );
    $sym98$_SBHL_TV_ = makeSymbol( "*SBHL-TV*" );
    $sym99$_SBHL_LINK_GENERATOR_ = makeSymbol( "*SBHL-LINK-GENERATOR*" );
    $sym100$FUNCALL = makeSymbol( "FUNCALL" );
    $list101 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODES-VAR" ), makeSymbol( "NODE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "MODULE" ), makeSymbol( "DONE-VAR" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE = makeSymbol( "POSSIBLY-WITH-SBHL-MT-RELEVANCE" );
    $sym103$POSSIBLY_WITH_SBHL_TV = makeSymbol( "POSSIBLY-WITH-SBHL-TV" );
    $sym104$WITH_RELEVANT_SBHL_LINK_NODES = makeSymbol( "WITH-RELEVANT-SBHL-LINK-NODES" );
    $sym105$DO_WITH_RELEVANT_SBHL_MODULES = makeSymbol( "DO-WITH-RELEVANT-SBHL-MODULES" );
    $sym106$POSSIBLY_FLIP_GENL_INVERSE_MODE = makeSymbol( "POSSIBLY-FLIP-GENL-INVERSE-MODE" );
    $list107 = ConsesLow.list( makeSymbol( "GET-SBHL-MODULE" ) );
    $sym108$WITH_RELEVANT_SBHL_LINK_NODES_AND_NON_FORTS = makeSymbol( "WITH-RELEVANT-SBHL-LINK-NODES-AND-NON-FORTS" );
    $list109 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "NODE" ), makeSymbol( "DIRECTION" ), makeSymbol( "MODULE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym110$LINK_NODES = makeUninternedSymbol( "LINK-NODES" );
    $sym111$WITH_ACCESSIBLE_SBHL_LINK_NODES = makeSymbol( "WITH-ACCESSIBLE-SBHL-LINK-NODES" );
    $sym112$LINK_NODES = makeUninternedSymbol( "LINK-NODES" );
    $sym113$WITH_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS = makeSymbol( "WITH-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS" );
    $list114 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODE-SEARCH-STATE-VAR" ), makeSymbol( "NODE-SEARCH-STATE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list115 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw116$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $sym117$DO_SBHL_ITERATOR = makeSymbol( "DO-SBHL-ITERATOR" );
    $sym118$NEW_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR = makeSymbol( "NEW-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR" );
    $list119 = ConsesLow.list( ConsesLow.list( makeSymbol( "TV-LINKS-VAR" ), makeSymbol( "NODE" ), makeSymbol( "DIRECTION" ), makeSymbol( "MODULE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym120$LINK_NODES = makeUninternedSymbol( "LINK-NODES" );
    $list121 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "NODE" ), makeSymbol( "MODULE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym122$DO_RELEVANT_SBHL_LINK_NODES = makeSymbol( "DO-RELEVANT-SBHL-LINK-NODES" );
    $list123 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRED-VAR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym124$SMART_CSOME = makeSymbol( "SMART-CSOME" );
    $list125 = ConsesLow.list( makeSymbol( "GET-SBHL-PREDICATES" ) );
    $sym126$MODULE = makeUninternedSymbol( "MODULE" );
    $sym127$DO_SBHL_MODULES = makeSymbol( "DO-SBHL-MODULES" );
    $sym128$PUNLESS = makeSymbol( "PUNLESS" );
    $sym129$SBHL_TIME_MODULE_P = makeSymbol( "SBHL-TIME-MODULE-P" );
    $sym130$GET_SBHL_LINK_PRED = makeSymbol( "GET-SBHL-LINK-PRED" );
    $list131 = ConsesLow.list( ConsesLow.list( makeSymbol( "MODULE-VAR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym132$MODULE = makeUninternedSymbol( "MODULE" );
    $list133 = ConsesLow.list( ConsesLow.list( makeSymbol( "MODULE-VAR" ), makeSymbol( "GRAPH-VAR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym134$GET_SBHL_MODULE_GRAPH = makeSymbol( "GET-SBHL-MODULE-GRAPH" );
    $list135 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SBHL-LINK-DIRECTION*" ), ConsesLow.list( makeSymbol( "GET-SBHL-MODULE-FORWARD-DIRECTION" ), ConsesLow.list( makeSymbol( "GET-SBHL-MODULE" ) ) ) ) );
    $list136 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SBHL-LINK-DIRECTION*" ), ConsesLow.list( makeSymbol( "GET-SBHL-MODULE-BACKWARD-DIRECTION" ), ConsesLow.list( makeSymbol( "GET-SBHL-MODULE" ) ) ) ) );
    $list137 = ConsesLow.list( makeSymbol( "NODE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym138$COR = makeSymbol( "COR" );
    $list139 = ConsesLow.list( makeSymbol( "SUSPEND-SBHL-TYPE-CHECKING?" ) );
    $sym140$APPLY_SBHL_MODULE_TYPE_TEST = makeSymbol( "APPLY-SBHL-MODULE-TYPE-TEST" );
    $list141 = ConsesLow.list( ConsesLow.list( makeSymbol( "GET-SBHL-MODULE" ) ) );
    $sym142$PROGN = makeSymbol( "PROGN" );
    $sym143$SBHL_WARN = makeSymbol( "SBHL-WARN" );
    $str144$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $list145 = ConsesLow.list( ConsesLow.list( makeSymbol( "GET-SBHL-TYPE-TEST" ), ConsesLow.list( makeSymbol( "GET-SBHL-MODULE" ) ) ) );
    $list146 = ConsesLow.list( ConsesLow.list( makeSymbol( "NODE-VAR" ), makeSymbol( "LINK-VAR" ), makeSymbol( "MODULE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym147$DO_SBHL_GRAPH_LINKS = makeSymbol( "DO-SBHL-GRAPH-LINKS" );
    $kw148$MODULE = makeKeyword( "MODULE" );
    $list149 = ConsesLow.list( ConsesLow.list( makeSymbol( "MODULE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym150$MODULE_VAR = makeUninternedSymbol( "MODULE-VAR" );
    $sym151$ACCESSIBLE_MODULES = makeUninternedSymbol( "ACCESSIBLE-MODULES" );
    $sym152$GET_SBHL_ACCESSIBLE_MODULES = makeSymbol( "GET-SBHL-ACCESSIBLE-MODULES" );
    $sym153$WITH_SBHL_MODULE = makeSymbol( "WITH-SBHL-MODULE" );
    $sym154$SBHL_MODULE_P = makeSymbol( "SBHL-MODULE-P" );
    $sym155$GET_SBHL_MODULE = makeSymbol( "GET-SBHL-MODULE" );
    $list156 = ConsesLow.list( ConsesLow.list( makeSymbol( "DIRECTION-VAR" ), makeSymbol( "MODULE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym157$GET_RELEVANT_SBHL_DIRECTIONS = makeSymbol( "GET-RELEVANT-SBHL-DIRECTIONS" );
    $list158 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SBHL-SEARCH-BEHAVIOR*" ), ConsesLow.list( makeSymbol( "DETERMINE-SBHL-SEARCH-BEHAVIOR" ), ConsesLow.list( makeSymbol( "GET-SBHL-SEARCH-MODULE" ) ), ConsesLow
        .list( makeSymbol( "GET-SBHL-SEARCH-DIRECTION" ) ), ConsesLow.list( makeSymbol( "GET-SBHL-TV" ) ) ) ), ConsesLow.list( makeSymbol( "*SBHL-TERMINATING-MARKING-SPACE*" ), ConsesLow.list( makeSymbol(
            "DETERMINE-SBHL-TERMINATING-MARKING-SPACE" ), makeSymbol( "*SBHL-SEARCH-BEHAVIOR*" ) ) ) );
    $sym159$PREMARKING_ = makeUninternedSymbol( "PREMARKING?" );
    $sym160$GOAL_FN = makeUninternedSymbol( "GOAL-FN" );
    $sym161$GOAL_NODE = makeUninternedSymbol( "GOAL-NODE" );
    $sym162$GOAL_SPACE = makeUninternedSymbol( "GOAL-SPACE" );
    $list163 = ConsesLow.list( ConsesLow.list( makeSymbol( "SBHL-MODULE-PREMARKS-GATHER-NODES-P" ) ) );
    $list164 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SBHL-NODE-IS-GOAL-NODE" ) ) );
    $list165 = ConsesLow.list( makeSymbol( "*SBHL-SPACE*" ) );
    $list166 = ConsesLow.list( makeSymbol( "GET-SBHL-TRANSFERS-THROUGH-MODULE" ), ConsesLow.list( makeSymbol( "GET-SBHL-SEARCH-MODULE" ) ) );
    $sym167$POSSIBLY_PREMARK_WITH_GENL_INVERSE_MODE = makeSymbol( "POSSIBLY-PREMARK-WITH-GENL-INVERSE-MODE" );
    $sym168$SBHL_PREMARK_GATHER_NODES = makeSymbol( "SBHL-PREMARK-GATHER-NODES" );
    $sym169$CSETQ = makeSymbol( "CSETQ" );
    $list170 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SBHL-NODE-MARKED-AS-GOAL-NODE" ) ) );
    $list171 = ConsesLow.list( makeSymbol( "*SBHL-GATHER-SPACE*" ) );
    $sym172$RESET_SBHL_SEARCH_PARENT_MARKING = makeSymbol( "RESET-SBHL-SEARCH-PARENT-MARKING" );
    $sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE = makeSymbol( "WITH-NEW-SBHL-PREDICATE-MODE-SCOPE" );
    $sym174$WITH_SBHL_CONSIDER_NODE_FN = makeSymbol( "WITH-SBHL-CONSIDER-NODE-FN" );
    $sym175$WITH_SBHL_GOAL_NODE = makeSymbol( "WITH-SBHL-GOAL-NODE" );
    $sym176$WITH_SBHL_GOAL_SPACE = makeSymbol( "WITH-SBHL-GOAL-SPACE" );
    $list177 = ConsesLow.list( makeSymbol( "NODE" ), makeSymbol( "LINK-NODE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list178 = ConsesLow.list( makeSymbol( "*SBHL-SEARCH-PARENT-MARKING*" ), makeSymbol( "*SBHL-SEARCH-PARENT-MARKING*" ) );
    $sym179$_SBHL_TEMPORALITY_SEARCH_PASSED_THROUGH_DATE__ = makeSymbol( "*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*" );
    $sym180$FWHEN = makeSymbol( "FWHEN" );
    $list181 = ConsesLow.list( makeSymbol( "SBHL-JUSTIFICATION-SEARCH-P" ) );
    $sym182$HL_DATE_POINT_P = makeSymbol( "HL-DATE-POINT-P" );
    $list183 = ConsesLow.list( makeSymbol( "*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*" ) );
    $sym184$CAND = makeSymbol( "CAND" );
    $sym185$SBHL_TEMPORALITY_CONSEQUENT_LINKS_SEARCH_PASSED_THROUGH_LINK_P = makeSymbol( "SBHL-TEMPORALITY-CONSEQUENT-LINKS-SEARCH-PASSED-THROUGH-LINK-P" );
    $sym186$SBHL_TEMPORAL_FAUX_LINK = makeSymbol( "SBHL-TEMPORAL-FAUX-LINK" );
    $list187 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SBHL-SEARCH-BEHAVIOR*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "SBHL-TRANSFERS-THROUGH-MODULE-P" ), ConsesLow.list( makeSymbol(
        "GET-SBHL-MODULE" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SBHL-LEAF-INSTANCES-SWEEP" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SBHL-SIMPLE-TRUE-SEARCH-AND-UNWIND" ) ) ) ) );
    $list188 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "MODULE" ), makeSymbol( "DIRECTION" ), makeSymbol( "NODE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ),
      makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), ConsesLow.list( makeSymbol( "SEARCH-TYPE" ), makeKeyword( "BREADTH" ) )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $kw189$BREADTH = makeKeyword( "BREADTH" );
    $sym190$NODE_VAR = makeUninternedSymbol( "NODE-VAR" );
    $sym191$DECK_TYPE = makeUninternedSymbol( "DECK-TYPE" );
    $sym192$RECUR_DECK = makeUninternedSymbol( "RECUR-DECK" );
    $sym193$NODE_VARS_LINK_NODE = makeUninternedSymbol( "NODE-VARS-LINK-NODE" );
    $sym194$FIF = makeSymbol( "FIF" );
    $list195 = ConsesLow.list( makeKeyword( "BREADTH" ) );
    $list196 = ConsesLow.list( makeKeyword( "QUEUE" ), makeKeyword( "STACK" ) );
    $sym197$CREATE_DECK = makeSymbol( "CREATE-DECK" );
    $sym198$WITH_NEW_SBHL_SPACE = makeSymbol( "WITH-NEW-SBHL-SPACE" );
    $sym199$POSSIBLY_WITH_SBHL_TRUE_TV = makeSymbol( "POSSIBLY-WITH-SBHL-TRUE-TV" );
    $sym200$WITH_SBHL_SEARCH_MODULE = makeSymbol( "WITH-SBHL-SEARCH-MODULE" );
    $sym201$WITH_SBHL_TYPE_TEST = makeSymbol( "WITH-SBHL-TYPE-TEST" );
    $sym202$WITH_SBHL_SEARCH_DIRECTION = makeSymbol( "WITH-SBHL-SEARCH-DIRECTION" );
    $sym203$WITH_SBHL_LINK_DIRECTION = makeSymbol( "WITH-SBHL-LINK-DIRECTION" );
    $sym204$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION = makeSymbol( "SBHL-SEARCH-DIRECTION-TO-LINK-DIRECTION" );
    $sym205$SBHL_MARK_NODE_MARKED = makeSymbol( "SBHL-MARK-NODE-MARKED" );
    $sym206$WHILE = makeSymbol( "WHILE" );
    $sym207$CNOT = makeSymbol( "CNOT" );
    $sym208$DO_ACCESSIBLE_SBHL_LINK_NODES = makeSymbol( "DO-ACCESSIBLE-SBHL-LINK-NODES" );
    $list209 = ConsesLow.list( makeSymbol( "GET-SBHL-LINK-DIRECTION" ) );
    $sym210$SBHL_SEARCH_PATH_TERMINATION_P = makeSymbol( "SBHL-SEARCH-PATH-TERMINATION-P" );
    $sym211$DECK_PUSH = makeSymbol( "DECK-PUSH" );
    $sym212$DECK_POP = makeSymbol( "DECK-POP" );
    $list213 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "MODULE" ), makeSymbol( "NODE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ),
        makeSymbol( "SEARCH-TYPE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym214$DO_ALL_SIMPLE_TRUE_LINKS = makeSymbol( "DO-ALL-SIMPLE-TRUE-LINKS" );
    $list215 = ConsesLow.list( makeSymbol( "GET-SBHL-FORWARD-SEARCH-DIRECTION" ) );
    $list216 = ConsesLow.list( makeSymbol( "GET-SBHL-BACKWARD-SEARCH-DIRECTION" ) );
    $list217 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "MODULE" ), makeSymbol( "DIRECTION" ), makeSymbol( "NODE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ),
      makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), ConsesLow.list( makeSymbol( "SEARCH-TYPE" ), makeKeyword( "DEPTH" ) )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $kw218$DEPTH = makeKeyword( "DEPTH" );
    $sym219$NODE_VAR = makeUninternedSymbol( "NODE-VAR" );
    $sym220$NODE_AND_PREDICATE_MODE = makeUninternedSymbol( "NODE-AND-PREDICATE-MODE" );
    $sym221$PREDICATE_MODE = makeUninternedSymbol( "PREDICATE-MODE" );
    $sym222$DECK_TYPE = makeUninternedSymbol( "DECK-TYPE" );
    $sym223$RECUR_DECK = makeUninternedSymbol( "RECUR-DECK" );
    $sym224$NODE_VARS_LINK_NODE = makeUninternedSymbol( "NODE-VARS-LINK-NODE" );
    $list225 = ConsesLow.list( makeKeyword( "DEPTH" ) );
    $list226 = ConsesLow.list( makeKeyword( "STACK" ), makeKeyword( "QUEUE" ) );
    $list227 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-INVERSE-MODE-P" ) ) );
    $sym228$FIRST = makeSymbol( "FIRST" );
    $sym229$SECOND = makeSymbol( "SECOND" );
    $sym230$WITH_SBHL_PREDICATE_MODE = makeSymbol( "WITH-SBHL-PREDICATE-MODE" );
    $sym231$APPLY_SBHL_ADD_NODE_TEST = makeSymbol( "APPLY-SBHL-ADD-NODE-TEST" );
    $list232 = ConsesLow.list( makeSymbol( "GET-SBHL-SEARCH-ADD-NODE-TEST" ) );
    $sym233$DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES = makeSymbol( "DO-ALL-SIMPLE-TRUE-LINKS-FOR-INVERSES" );
    $list234 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "MODE-VAR" ), makeSymbol( "MODULE" ), makeSymbol( "DIRECTION" ), makeSymbol( "NODE" ), makeSymbol(
        "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), ConsesLow.list( makeSymbol( "SEARCH-TYPE" ), makeKeyword( "DEPTH" ) )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym235$NODE_VAR = makeUninternedSymbol( "NODE-VAR" );
    $sym236$NODE_AND_PREDICATE_MODE = makeUninternedSymbol( "NODE-AND-PREDICATE-MODE" );
    $sym237$PREDICATE_MODE = makeUninternedSymbol( "PREDICATE-MODE" );
    $sym238$DECK_TYPE = makeUninternedSymbol( "DECK-TYPE" );
    $sym239$RECUR_DECK = makeUninternedSymbol( "RECUR-DECK" );
    $sym240$NODE_VARS_LINK_NODE = makeUninternedSymbol( "NODE-VARS-LINK-NODE" );
    $list241 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "LINK-NODE-VAR" ), makeSymbol( "MODE-VAR" ), makeSymbol( "MODULE" ), makeSymbol( "NODE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ),
      makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), makeSymbol( "SEARCH-TYPE" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym242$DO_ALL_MODE_TRUE_LINKS_FOR_INVERSES = makeSymbol( "DO-ALL-MODE-TRUE-LINKS-FOR-INVERSES" );
    $sym243$NODE_VAR = makeUninternedSymbol( "NODE-VAR" );
    $sym244$DECK_TYPE = makeUninternedSymbol( "DECK-TYPE" );
    $sym245$RECUR_DECK = makeUninternedSymbol( "RECUR-DECK" );
    $sym246$NODE_VARS_LINK_NODE = makeUninternedSymbol( "NODE-VARS-LINK-NODE" );
    $sym247$WITH_SBHL_FORWARD_SEARCH_DIRECTION = makeSymbol( "WITH-SBHL-FORWARD-SEARCH-DIRECTION" );
    $sym248$WITH_SBHL_FORWARD_LINK_DIRECTION = makeSymbol( "WITH-SBHL-FORWARD-LINK-DIRECTION" );
    $sym249$NODE_VAR = makeUninternedSymbol( "NODE-VAR" );
    $sym250$TT_NODE_VAR = makeUninternedSymbol( "TT-NODE-VAR" );
    $sym251$WITH_NEW_SBHL_GATHER_SPACE = makeSymbol( "WITH-NEW-SBHL-GATHER-SPACE" );
    $sym252$GET_SBHL_TRANSFERS_THROUGH_MODULE = makeSymbol( "GET-SBHL-TRANSFERS-THROUGH-MODULE" );
    $sym253$DO_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS = makeSymbol( "DO-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS" );
    $list254 = ConsesLow.list( ConsesLow.list( makeSymbol( "ISA-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES = makeSymbol( "DO-ALL-SBHL-FORWARD-TRUE-LINK-NODES" );
    $list256 = ConsesLow.list( makeSymbol( "GET-SBHL-MODULE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ) );
    $list257 = ConsesLow.list( ConsesLow.list( makeSymbol( "ISA-LINKS-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym258$DO_RELEVANT_FORWARD_SBHL_LINK_NODES = makeSymbol( "DO-RELEVANT-FORWARD-SBHL-LINK-NODES" );
    $list259 = ConsesLow.list( ConsesLow.list( makeSymbol( "ISA-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&KEY" ), makeSymbol( "MT" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list260 = ConsesLow.list( makeKeyword( "MT" ), makeKeyword( "DONE" ) );
    $kw261$MT = makeKeyword( "MT" );
    $sym262$MT_VAR = makeUninternedSymbol( "MT-VAR" );
    $sym263$TV_VAR = makeUninternedSymbol( "TV-VAR" );
    $sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE = makeSymbol( "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE" );
    $sym265$DO_TRUE_ISA_LINKS = makeSymbol( "DO-TRUE-ISA-LINKS" );
    $sym266$IGNORE = makeSymbol( "IGNORE" );
    $list267 = ConsesLow.list( ConsesLow.list( makeSymbol( "ISA-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym268$LINK_NODES = makeUninternedSymbol( "LINK-NODES" );
    $list269 = ConsesLow.list( makeSymbol( "GET-SBHL-MODULE-FORWARD-DIRECTION" ), ConsesLow.list( makeSymbol( "GET-SBHL-MODULE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ) ) );
    $list270 = ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES = makeSymbol( "DO-ALL-SBHL-BACKWARD-TRUE-LINK-NODES" );
    $list272 = ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE-LINKS-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym273$DO_RELEVANT_BACKWARD_SBHL_LINK_NODES = makeSymbol( "DO-RELEVANT-BACKWARD-SBHL-LINK-NODES" );
    $list274 = ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE-VAR" ), makeSymbol( "COL" ), makeSymbol( "&KEY" ), makeSymbol( "MT" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym275$MT_VAR = makeUninternedSymbol( "MT-VAR" );
    $sym276$TV_VAR = makeUninternedSymbol( "TV-VAR" );
    $sym277$DO_TRUE_INSTANCE_LINKS = makeSymbol( "DO-TRUE-INSTANCE-LINKS" );
    $list278 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTED-ISA-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list279 = ConsesLow.list( makeSymbol( "GET-SBHL-MODULE" ), constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) ) );
    $list280 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTED-ISA-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&KEY" ), makeSymbol( "MT" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym281$MT_VAR = makeUninternedSymbol( "MT-VAR" );
    $sym282$TV_VAR = makeUninternedSymbol( "TV-VAR" );
    $sym283$DO_TRUE_QUOTED_ISA_LINKS = makeSymbol( "DO-TRUE-QUOTED-ISA-LINKS" );
    $list284 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTED-INSTANCE-VAR" ), makeSymbol( "COL" ), makeSymbol( "&KEY" ), makeSymbol( "MT" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym285$MT_VAR = makeUninternedSymbol( "MT-VAR" );
    $sym286$TV_VAR = makeUninternedSymbol( "TV-VAR" );
    $sym287$DO_TRUE_QUOTED_INSTANCE_LINKS = makeSymbol( "DO-TRUE-QUOTED-INSTANCE-LINKS" );
    $list288 = ConsesLow.list( ConsesLow.list( makeSymbol( "ISA-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), makeSymbol( "SEARCH-TYPE" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym289$DO_ALL_FORWARD_TRUE_LINKS_FOR_TT = makeSymbol( "DO-ALL-FORWARD-TRUE-LINKS-FOR-TT" );
    $list290 = ConsesLow.list( ConsesLow.list( makeSymbol( "ISA-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list291 = ConsesLow.list( ConsesLow.list( makeSymbol( "ISA" ), makeSymbol( "TERM" ), makeSymbol( "DOMAIN-MT" ), makeSymbol( "DONE?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym292$ISAS = makeUninternedSymbol( "ISAS" );
    $sym293$WITH_MT = makeSymbol( "WITH-MT" );
    $sym294$SORT_BY_GENERALITY_ESTIMATE = makeSymbol( "SORT-BY-GENERALITY-ESTIMATE" );
    $sym295$ALL_ISA = makeSymbol( "ALL-ISA" );
    $list296 = ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), makeSymbol(
        "SEARCH-TYPE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym297$DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT = makeSymbol( "DO-ALL-BACKWARD-TRUE-LINKS-FOR-TT" );
    $sym298$DO_ALL_INSTANCES = makeSymbol( "DO-ALL-INSTANCES" );
    $str299$Iterator___see_do_all_simple_back = makeString( "Iterator. @see do-all-simple-backward-true-links." );
    $list300 = ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE-VAR" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym301$FORT_P = makeSymbol( "FORT-P" );
    $sym302$DO_ALL_FORT_INSTANCES = makeSymbol( "DO-ALL-FORT-INSTANCES" );
    $str303$Like__xref_do_all_instances_excep = makeString( "Like @xref do-all-instances except only iterates over forts." );
    $list304 = ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE-VAR" ), makeSymbol( "TERMS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), makeSymbol(
        "SEARCH-TYPE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym305$TERMS_VAR = makeUninternedSymbol( "TERMS-VAR" );
    $sym306$ALL_ISA_ = makeSymbol( "ALL-ISA?" );
    $sym307$REST = makeSymbol( "REST" );
    $sym308$DO_ALL_QUOTED_INSTANCES = makeSymbol( "DO-ALL-QUOTED-INSTANCES" );
    $sym309$DO_ALL_FORT_QUOTED_INSTANCES = makeSymbol( "DO-ALL-FORT-QUOTED-INSTANCES" );
    $sym310$TERMS_VAR = makeUninternedSymbol( "TERMS-VAR" );
    $sym311$ALL_QUOTED_ISA_ = makeSymbol( "ALL-QUOTED-ISA?" );
    $list312 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list313 = ConsesLow.list( makeSymbol( "GET-SBHL-MODULE" ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $list314 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-LINKS-VAR" ), makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list315 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TV" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym316$DUMMY = makeUninternedSymbol( "DUMMY" );
    $sym317$DO_TRUE_GENLS_LINKS = makeSymbol( "DO-TRUE-GENLS-LINKS" );
    $list318 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-VAR" ), makeSymbol( "COL" ), makeSymbol( "&KEY" ), makeSymbol( "MT" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym319$MT_VAR = makeUninternedSymbol( "MT-VAR" );
    $sym320$TV_VAR = makeUninternedSymbol( "TV-VAR" );
    $list321 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list322 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-LINKS-VAR" ), makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list323 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-VAR" ), makeSymbol( "COL" ), makeSymbol( "&KEY" ), makeSymbol( "MT" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym324$MT_VAR = makeUninternedSymbol( "MT-VAR" );
    $sym325$TV_VAR = makeUninternedSymbol( "TV-VAR" );
    $sym326$DO_TRUE_SPEC_LINKS = makeSymbol( "DO-TRUE-SPEC-LINKS" );
    $list327 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-VAR" ), makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), makeSymbol( "SEARCH-TYPE" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS = makeSymbol( "DO-ALL-SIMPLE-FORWARD-TRUE-LINKS" );
    $list329 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-VAR" ), makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list330 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL" ), makeSymbol( "SPEC" ), makeSymbol( "DOMAIN-MT" ), makeSymbol( "DONE?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym331$GENLS = makeUninternedSymbol( "GENLS" );
    $sym332$ALL_GENLS = makeSymbol( "ALL-GENLS" );
    $list333 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-VAR" ), makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), makeSymbol( "SEARCH-TYPE" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS = makeSymbol( "DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS" );
    $list335 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-VAR" ), makeSymbol( "COL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list336 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC" ), makeSymbol( "TERM" ), makeSymbol( "DOMAIN-MT" ), makeSymbol( "DONE?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym337$SPECS = makeUninternedSymbol( "SPECS" );
    $sym338$NREVERSE = makeSymbol( "NREVERSE" );
    $sym339$ALL_SPECS = makeSymbol( "ALL-SPECS" );
    $list340 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-PREDICATE-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list341 = ConsesLow.list( makeSymbol( "GET-SBHL-MODULE" ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ) );
    $list342 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-PREDICATE-LINKS-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list343 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-PREDICATE-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list344 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-PREDICATE-LINKS-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list345 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-PREDICATE-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), makeSymbol(
        "SEARCH-TYPE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES = makeSymbol( "DO-ALL-SIMPLE-FORWARD-TRUE-LINKS-FOR-INVERSES" );
    $list347 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-PREDICATE-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list348 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-PREDICATE-VAR" ), makeSymbol( "INVERSE-MODE-P" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol(
        "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym349$DO_ALL_MODE_FORWARD_TRUE_LINKS_FOR_INVERSES = makeSymbol( "DO-ALL-MODE-FORWARD-TRUE-LINKS-FOR-INVERSES" );
    $list350 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-PREDICATE-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), makeSymbol(
        "SEARCH-TYPE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES = makeSymbol( "DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS-FOR-INVERSES" );
    $list352 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-PREDICATE-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list353 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-VAR" ), makeSymbol( "INVERSE-MODE-P" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol(
        "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym354$DO_ALL_MODE_BACKWARD_TRUE_LINKS_FOR_INVERSES = makeSymbol( "DO-ALL-MODE-BACKWARD-TRUE-LINKS-FOR-INVERSES" );
    $sym355$ALL_PROPER_GENL_PREDICATES = makeSymbol( "ALL-PROPER-GENL-PREDICATES" );
    $list356 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-INVERSE-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), makeSymbol(
        "SEARCH-TYPE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym357$ALL_PROPER_GENL_INVERSES = makeSymbol( "ALL-PROPER-GENL-INVERSES" );
    $list358 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-INVERSE-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list359 = ConsesLow.list( makeSymbol( "GET-SBHL-MODULE" ), constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ) );
    $list360 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-INVERSE-LINKS-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list361 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-INVERSE-VAR" ), makeSymbol( "MT-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list362 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-INVERSE-LINKS-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list363 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-INVERSE-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list364 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-INVERSE-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), makeSymbol(
        "SEARCH-TYPE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list365 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-INVERSE-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list366 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRED-VAR" ), makeSymbol( "INVERSE-MODE-VAR" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "TV" ), makeSymbol(
        "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym367$DO_ALL_PREDS_AND_INVERSES = makeSymbol( "DO-ALL-PREDS-AND-INVERSES" );
    $list368 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "PRED-VAR" ), makeSymbol( "INVERSE-MODE-VAR" ), makeSymbol( "PRED" ), makeSymbol( "DIRECTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol(
        "MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), makeSymbol( "SEARCH-TYPE" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym369$MODULE = makeUninternedSymbol( "MODULE" );
    $sym370$NODE_VAR = makeUninternedSymbol( "NODE-VAR" );
    $sym371$NODE_AND_PREDICATE_MODE = makeUninternedSymbol( "NODE-AND-PREDICATE-MODE" );
    $sym372$PREDICATE_MODE = makeUninternedSymbol( "PREDICATE-MODE" );
    $sym373$DECK_TYPE = makeUninternedSymbol( "DECK-TYPE" );
    $sym374$RECUR_DECK = makeUninternedSymbol( "RECUR-DECK" );
    $sym375$NODE_VARS_LINK_NODE = makeUninternedSymbol( "NODE-VARS-LINK-NODE" );
    $list376 = ConsesLow.list( ConsesLow.list( makeSymbol( "GET-SBHL-MODULE" ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ) ) );
    $list377 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-MT-VAR" ), makeSymbol( "MT-MT-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "MT-NODE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list378 = ConsesLow.list( makeSymbol( "GET-SBHL-MODULE" ), constant_handles.reader_make_constant_shell( makeString( "genlMt" ) ) );
    $list379 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-MT-LINKS-VAR" ), makeSymbol( "MT-NODE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT-MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list380 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-MT-VAR" ), makeSymbol( "MT-MT-VAR" ), makeSymbol( "TV-VAR" ), makeSymbol( "MT-NODE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list381 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-MT-LINKS-VAR" ), makeSymbol( "MT-NODE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT-MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list382 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-MT-VAR" ), makeSymbol( "MT-NODE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT-MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), makeSymbol(
        "SEARCH-TYPE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list383 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENL-MT-VAR" ), makeSymbol( "MT-NODE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT-MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list384 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-MT-VAR" ), makeSymbol( "MT-NODE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT-MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ), makeSymbol(
        "SEARCH-TYPE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list385 = ConsesLow.list( ConsesLow.list( makeSymbol( "SPEC-MT-VAR" ), makeSymbol( "MT-NODE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT-MT" ), makeSymbol( "TV" ), makeSymbol( "DONE-VAR" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
  }
}
/*
 * 
 * Total time: 1762 ms
 * 
 */