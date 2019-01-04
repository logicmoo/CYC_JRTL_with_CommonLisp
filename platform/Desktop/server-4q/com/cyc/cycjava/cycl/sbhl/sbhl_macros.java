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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_macros extends SubLTranslatedFile
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
    public static SubLObject do_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_links = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list0);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list0);
        tv = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list0);
        tv_links = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list0);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject link_nodes = (SubLObject)sbhl_macros.$sym1$LINK_NODES;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(link_nodes, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym3$GET_SBHL_LINK_NODES, tv_links, tv))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, link_nodes, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym5$DO_SET_OR_LIST, (SubLObject)ConsesLow.list(link_node_var, link_nodes, (SubLObject)sbhl_macros.$kw6$DONE, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list0);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 2412L)
    public static SubLObject do_sbhl_tv_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject link_nodes_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_links = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list7);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list7);
        link_nodes_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list7);
        tv_links = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list7);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym8$DO_DICTIONARY, (SubLObject)ConsesLow.list(tv_var, link_nodes_var, tv_links, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list7);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 2720L)
    public static SubLObject do_sbhl_mt_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject link_nodes_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_links = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list9);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list9);
        link_nodes_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list9);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list9);
        mt_links = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list9);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject tv_links = (SubLObject)sbhl_macros.$sym10$TV_LINKS;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tv_links, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym11$GET_SBHL_TV_LINKS, mt_links, mt))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, tv_links, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym12$DO_SBHL_TV_LINKS, (SubLObject)ConsesLow.list(tv_var, link_nodes_var, tv_links, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list9);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 3184L)
    public static SubLObject do_sbhl_mt_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list13);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_links_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_links = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list13);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list13);
        tv_links_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list13);
        mt_links = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list13);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym8$DO_DICTIONARY, (SubLObject)ConsesLow.list(mt_var, tv_links_var, mt_links, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list13);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 3486L)
    public static SubLObject do_sbhl_direction_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list14);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_links_var = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        SubLObject d_link = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list14);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list14);
        tv_links_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list14);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list14);
        d_link = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list14);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list14);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject mt_links = (SubLObject)sbhl_macros.$sym15$MT_LINKS;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mt_links, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym16$GET_SBHL_MT_LINKS, d_link, direction, module))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, mt_links, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym8$DO_DICTIONARY, (SubLObject)ConsesLow.list(mt_var, tv_links_var, mt_links, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list14);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 3979L)
    public static SubLObject do_sbhl_graph_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list17);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject direction_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_links_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list17);
        direction_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list17);
        mt_links_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list17);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list17);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list17);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject d_link = (SubLObject)sbhl_macros.$sym18$D_LINK;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(d_link, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym19$GET_SBHL_GRAPH_LINK, node, module))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, d_link, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym20$DO_RELEVANT_SBHL_DIRECTIONS, (SubLObject)ConsesLow.list(direction_var, module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mt_links_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym16$GET_SBHL_MT_LINKS, d_link, direction_var, module))), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym4$PWHEN, mt_links_var, ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list17);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 4545L)
    public static SubLObject do_sbhl_forward_true_link_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list21);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list21);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list21);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list21);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject direction = (SubLObject)sbhl_macros.$sym22$DIRECTION;
            final SubLObject mt_links = (SubLObject)sbhl_macros.$sym23$MT_LINKS;
            final SubLObject tv_links = (SubLObject)sbhl_macros.$sym24$TV_LINKS;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym25$POSSIBLY_WITH_SBHL_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym26$WITH_SBHL_FORWARD_LINK_DIRECTION_FOR_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym27$DO_SBHL_GRAPH_LINK, (SubLObject)ConsesLow.list(direction, mt_links, node, module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym28$SBHL_FORWARD_DIRECTION_FOR_MODULE_P, direction, module), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym29$DO_SBHL_MT_LINKS, (SubLObject)ConsesLow.list(mt_var, tv_links, mt_links, done_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym30$ANY_SBHL_TRUE_LINK_NODES_P, tv_links), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list21);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 5194L)
    public static SubLObject do_sbhl_forward_true_link_nodes_and_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list31);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list31);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list31);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list31);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list31);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list31);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject direction = (SubLObject)sbhl_macros.$sym32$DIRECTION;
            final SubLObject mt_links = (SubLObject)sbhl_macros.$sym33$MT_LINKS;
            final SubLObject tv_links = (SubLObject)sbhl_macros.$sym34$TV_LINKS;
            final SubLObject tv = (SubLObject)sbhl_macros.$sym35$TV;
            final SubLObject link_nodes = (SubLObject)sbhl_macros.$sym36$LINK_NODES;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym25$POSSIBLY_WITH_SBHL_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym26$WITH_SBHL_FORWARD_LINK_DIRECTION_FOR_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym27$DO_SBHL_GRAPH_LINK, (SubLObject)ConsesLow.list(direction, mt_links, node, module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym28$SBHL_FORWARD_DIRECTION_FOR_MODULE_P, direction, module), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym29$DO_SBHL_MT_LINKS, (SubLObject)ConsesLow.list(mt_var, tv_links, mt_links, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym12$DO_SBHL_TV_LINKS, (SubLObject)ConsesLow.list(tv, link_nodes, tv_links, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym37$SBHL_TRUE_TV_P, tv), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym5$DO_SET_OR_LIST, (SubLObject)ConsesLow.list(link_node_var, link_nodes), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)))))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list31);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 5876L)
    public static SubLObject do_all_sbhl_tv_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject direction_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject link_nodes_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list38);
        direction_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list38);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list38);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list38);
        link_nodes_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list38);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list38);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list38);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject mt_links = (SubLObject)sbhl_macros.$sym39$MT_LINKS;
            final SubLObject tv_links = (SubLObject)sbhl_macros.$sym40$TV_LINKS;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym27$DO_SBHL_GRAPH_LINK, (SubLObject)ConsesLow.list(direction_var, mt_links, node, module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym29$DO_SBHL_MT_LINKS, (SubLObject)ConsesLow.list(mt_var, tv_links, mt_links, done_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym12$DO_SBHL_TV_LINKS, (SubLObject)ConsesLow.list(tv_var, link_nodes_var, tv_links, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list38);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 7065L)
    public static SubLObject do_all_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list41);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject direction_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list41);
        direction_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list41);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list41);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list41);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list41);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list41);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list41);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject link_nodes_var = (SubLObject)sbhl_macros.$sym42$LINK_NODES_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym43$DO_ALL_SBHL_TV_LINKS, (SubLObject)ConsesLow.list(direction_var, mt_var, tv_var, link_nodes_var, node, module, done_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym5$DO_SET_OR_LIST, (SubLObject)ConsesLow.list(link_node_var, link_nodes_var, (SubLObject)sbhl_macros.$kw6$DONE, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list41);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 7902L)
    public static SubLObject do_all_sbhl_forward_true_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list44);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list44);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list44);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list44);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list44);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list44);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list44);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject link_nodes_var = (SubLObject)sbhl_macros.$sym45$LINK_NODES_VAR;
            final SubLObject direction = (SubLObject)sbhl_macros.$sym46$DIRECTION;
            final SubLObject mt_links = (SubLObject)sbhl_macros.$sym47$MT_LINKS;
            final SubLObject tv_links = (SubLObject)sbhl_macros.$sym48$TV_LINKS;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym25$POSSIBLY_WITH_SBHL_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym27$DO_SBHL_GRAPH_LINK, (SubLObject)ConsesLow.list(direction, mt_links, node, module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.EQ, direction, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym49$GET_SBHL_MODULE_FORWARD_DIRECTION, module)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym29$DO_SBHL_MT_LINKS, (SubLObject)ConsesLow.list(mt_var, tv_links, mt_links, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym12$DO_SBHL_TV_LINKS, (SubLObject)ConsesLow.list(tv_var, link_nodes_var, tv_links, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym37$SBHL_TRUE_TV_P, tv_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym5$DO_SET_OR_LIST, (SubLObject)ConsesLow.list(link_node_var, link_nodes_var, (SubLObject)sbhl_macros.$kw6$DONE, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list44);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 8588L)
    public static SubLObject do_all_sbhl_backward_true_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list44);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list44);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list44);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list44);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list44);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list44);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list44);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject link_nodes_var = (SubLObject)sbhl_macros.$sym50$LINK_NODES_VAR;
            final SubLObject direction = (SubLObject)sbhl_macros.$sym51$DIRECTION;
            final SubLObject mt_links = (SubLObject)sbhl_macros.$sym52$MT_LINKS;
            final SubLObject tv_links = (SubLObject)sbhl_macros.$sym53$TV_LINKS;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym25$POSSIBLY_WITH_SBHL_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym27$DO_SBHL_GRAPH_LINK, (SubLObject)ConsesLow.list(direction, mt_links, node, module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.EQ, direction, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym54$GET_SBHL_MODULE_BACKWARD_DIRECTION, module)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym29$DO_SBHL_MT_LINKS, (SubLObject)ConsesLow.list(mt_var, tv_links, mt_links, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym12$DO_SBHL_TV_LINKS, (SubLObject)ConsesLow.list(tv_var, link_nodes_var, tv_links, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym37$SBHL_TRUE_TV_P, tv_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym5$DO_SET_OR_LIST, (SubLObject)ConsesLow.list(link_node_var, link_nodes_var, (SubLObject)sbhl_macros.$kw6$DONE, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list44);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 9248L)
    public static SubLObject with_sbhl_graph_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject d_link_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list55);
        d_link_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list55);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list55);
        module = current.first();
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(d_link_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym19$GET_SBHL_GRAPH_LINK, node, module))), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym56$PIF, d_link_var, ConsesLow.append(body, (SubLObject)sbhl_macros.$list57)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list55);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 9638L)
    public static SubLObject with_relevant_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = (SubLObject)sbhl_macros.NIL;
        SubLObject start_node = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list58);
        link_nodes_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list58);
        start_node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list58);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list58);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list58);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject node = (SubLObject)sbhl_macros.$sym59$NODE;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(node, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym60$NAUT_TO_NART, start_node))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym61$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym62$SBHL_NODE_OBJECT_P, node), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym63$WITH_RELEVANT_SBHL_FORT_LINK_NODES, (SubLObject)ConsesLow.list(link_nodes_var, node, direction, module, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym64$CNAT_P, node), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym65$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS, (SubLObject)ConsesLow.list(link_nodes_var, node, direction, module, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list58);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 10272L)
    public static SubLObject with_relevant_sbhl_link_nodes_and_non_forts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = (SubLObject)sbhl_macros.NIL;
        SubLObject start_node = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list58);
        link_nodes_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list58);
        start_node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list58);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list58);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list58);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject node = (SubLObject)sbhl_macros.$sym66$NODE;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(node, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym60$NAUT_TO_NART, start_node))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym61$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym62$SBHL_NODE_OBJECT_P, node), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym63$WITH_RELEVANT_SBHL_FORT_LINK_NODES, (SubLObject)ConsesLow.list(link_nodes_var, node, direction, module, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym67$WITH_SBHL_NON_FORT_LINKS, (SubLObject)ConsesLow.list(link_nodes_var, node, module, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym64$CNAT_P, node), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym65$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS, (SubLObject)ConsesLow.list(link_nodes_var, node, direction, module, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list58);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 10867L)
    public static SubLObject with_relevant_sbhl_fort_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list68);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        SubLObject done_var = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list68);
        link_nodes_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list68);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list68);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list68);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list68);
        done_var = current.first();
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject d_link = (SubLObject)sbhl_macros.$sym69$D_LINK;
            final SubLObject mt = (SubLObject)sbhl_macros.$sym70$MT;
            final SubLObject tv_links = (SubLObject)sbhl_macros.$sym71$TV_LINKS;
            final SubLObject tv = (SubLObject)sbhl_macros.$sym72$TV;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym73$WITH_SBHL_GRAPH_LINK, (SubLObject)ConsesLow.list(d_link, node, module), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym74$DO_SBHL_DIRECTION_LINK, (SubLObject)ConsesLow.list(mt, tv_links, direction, d_link, module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym75$RELEVANT_MT_, mt), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym76$_SBHL_LINK_MT_, mt)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym12$DO_SBHL_TV_LINKS, (SubLObject)ConsesLow.list(tv, link_nodes_var, tv_links, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym77$RELEVANT_SBHL_TV_, tv), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym78$_SBHL_LINK_TV_, tv)), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list68);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 11386L)
    public static SubLObject do_non_fort_direct_instance_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject ins_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        SubLObject done_var = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list79);
        ins_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list79);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list79);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list79);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list79);
        done_var = current.first();
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject instance_tuple = (SubLObject)sbhl_macros.$sym80$INSTANCE_TUPLE;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym81$CSOME, (SubLObject)ConsesLow.list(instance_tuple, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym82$NON_FORT_INSTANCE_TABLE_LOOKUP, col), done_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym83$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(ins_var, mt_var, tv_var), instance_tuple, ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list79);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 11697L)
    public static SubLObject with_sbhl_non_fort_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list84);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        SubLObject done_var = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list84);
        link_nodes_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list84);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list84);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list84);
        done_var = current.first();
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject link_node = (SubLObject)sbhl_macros.$sym85$LINK_NODE;
            final SubLObject mt = (SubLObject)sbhl_macros.$sym86$MT;
            final SubLObject tv = (SubLObject)sbhl_macros.$sym87$TV;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym88$DO_SBHL_NON_FORT_LINKS_, node, module), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym89$DO_NON_FORT_DIRECT_INSTANCE_LINKS, (SubLObject)ConsesLow.list(link_node, mt, tv, node, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym75$RELEVANT_MT_, mt), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym76$_SBHL_LINK_MT_, mt)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym77$RELEVANT_SBHL_TV_, tv), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym78$_SBHL_LINK_TV_, tv)), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(link_nodes_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym90$LIST, link_node))), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list84);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 12170L)
    public static SubLObject do_sbhl_non_fort_linksP(final SubLObject node, final SubLObject module) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module.eql(sbhl_module_vars.get_sbhl_module(sbhl_macros.$const92$isa)) && sbhl_macros.NIL != collection_supports_non_fort_instancesP(node));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 12370L)
    public static SubLObject collection_supports_non_fort_instancesP(final SubLObject col) {
        return (SubLObject)sbhl_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 12461L)
    public static SubLObject admissible_non_fort_link_nodeP(final SubLObject link_node) {
        return forts.non_fort_p(link_node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 12592L)
    public static SubLObject do_relevant_sbhl_naut_generated_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        link_nodes_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list94);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject generating_fn = (SubLObject)sbhl_macros.$sym95$GENERATING_FN;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym96$SBHL_CSOME, (SubLObject)ConsesLow.list(generating_fn, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym97$GET_SBHL_MODULE_RELEVANT_NAUT_LINK_GENERATORS, direction, (SubLObject)sbhl_macros.$sym98$_SBHL_TV_, module), done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym99$_SBHL_LINK_GENERATOR_, generating_fn)), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(link_nodes_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym100$FUNCALL, generating_fn, node))), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list94);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 13013L)
    public static SubLObject do_relevant_forward_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list101);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list101);
        link_nodes_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list101);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list101);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list101);
        current = current.rest();
        final SubLObject module = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list101);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list101);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym103$POSSIBLY_WITH_SBHL_TV, tv, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym25$POSSIBLY_WITH_SBHL_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym104$WITH_RELEVANT_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(link_nodes_var, node, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym49$GET_SBHL_MODULE_FORWARD_DIRECTION, module), module, done_var)), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list101);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 13437L)
    public static SubLObject do_relevant_backward_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list101);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list101);
        link_nodes_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list101);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list101);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list101);
        current = current.rest();
        final SubLObject module = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list101);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list101);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym103$POSSIBLY_WITH_SBHL_TV, tv, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym25$POSSIBLY_WITH_SBHL_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym104$WITH_RELEVANT_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(link_nodes_var, node, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym54$GET_SBHL_MODULE_BACKWARD_DIRECTION, module), module, done_var)), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list101);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 13822L)
    public static SubLObject with_accessible_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        link_nodes_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list94);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym105$DO_WITH_RELEVANT_SBHL_MODULES, (SubLObject)ConsesLow.list(module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym106$POSSIBLY_FLIP_GENL_INVERSE_MODE, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym104$WITH_RELEVANT_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(link_nodes_var, node, direction, (SubLObject)sbhl_macros.$list107, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list94);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 14317L)
    public static SubLObject with_accessible_sbhl_link_nodes_and_non_forts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        link_nodes_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list94);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list94);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym105$DO_WITH_RELEVANT_SBHL_MODULES, (SubLObject)ConsesLow.list(module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym106$POSSIBLY_FLIP_GENL_INVERSE_MODE, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym108$WITH_RELEVANT_SBHL_LINK_NODES_AND_NON_FORTS, (SubLObject)ConsesLow.list(link_nodes_var, node, direction, (SubLObject)sbhl_macros.$list107, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list94);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 14830L)
    public static SubLObject do_accessible_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list109);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject link_nodes = (SubLObject)sbhl_macros.$sym110$LINK_NODES;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym111$WITH_ACCESSIBLE_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(link_nodes, node, direction, module, done_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym5$DO_SET_OR_LIST, (SubLObject)ConsesLow.list(link_node_var, link_nodes, (SubLObject)sbhl_macros.$kw6$DONE, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list109);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 15159L)
    public static SubLObject do_accessible_sbhl_link_nodes_and_non_forts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list109);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject link_nodes = (SubLObject)sbhl_macros.$sym112$LINK_NODES;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym113$WITH_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS, (SubLObject)ConsesLow.list(link_nodes, node, direction, module, done_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym5$DO_SET_OR_LIST, (SubLObject)ConsesLow.list(link_node_var, link_nodes, (SubLObject)sbhl_macros.$kw6$DONE, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list109);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 15516L)
    public static SubLObject do_accessible_sbhl_link_node_search_states(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list114);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_search_state_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node_search_state = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list114);
        link_node_search_state_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list114);
        node_search_state = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sbhl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sbhl_macros.NIL;
        SubLObject current_$1 = (SubLObject)sbhl_macros.NIL;
        while (sbhl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_macros.$list114);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_macros.$list114);
            if (sbhl_macros.NIL == conses_high.member(current_$1, (SubLObject)sbhl_macros.$list115, (SubLObject)sbhl_macros.UNPROVIDED, (SubLObject)sbhl_macros.UNPROVIDED)) {
                bad = (SubLObject)sbhl_macros.T;
            }
            if (current_$1 == sbhl_macros.$kw116$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sbhl_macros.NIL != bad && sbhl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list114);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_macros.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((sbhl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sbhl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym117$DO_SBHL_ITERATOR, (SubLObject)ConsesLow.list(link_node_search_state_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym118$NEW_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR, node_search_state), (SubLObject)sbhl_macros.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 15793L)
    public static SubLObject do_accessible_sbhl_tv_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list119);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tv_links_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list119);
        tv_links_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list119);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list119);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list119);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list119);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym111$WITH_ACCESSIBLE_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(tv_links_var, node, direction, module, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list119);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 16016L)
    public static SubLObject do_relevant_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list109);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list109);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject link_nodes = (SubLObject)sbhl_macros.$sym120$LINK_NODES;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym25$POSSIBLY_WITH_SBHL_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym104$WITH_RELEVANT_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(link_nodes, node, direction, module, done_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym5$DO_SET_OR_LIST, (SubLObject)ConsesLow.list(link_node_var, link_nodes, (SubLObject)sbhl_macros.$kw6$DONE, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list109);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 16379L)
    public static SubLObject do_relevant_sbhl_forward_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list121);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list121);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list121);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list121);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list121);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym122$DO_RELEVANT_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(link_node_var, node, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym49$GET_SBHL_MODULE_FORWARD_DIRECTION, module), module, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list121);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 16631L)
    public static SubLObject do_relevant_sbhl_backward_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list121);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list121);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list121);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list121);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list121);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym122$DO_RELEVANT_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(link_node_var, node, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym54$GET_SBHL_MODULE_BACKWARD_DIRECTION, module), module, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list121);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 16885L)
    public static SubLObject do_sbhl_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list123);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred_var = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list123);
        pred_var = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list123);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym124$SMART_CSOME, (SubLObject)ConsesLow.list(pred_var, (SubLObject)sbhl_macros.$list125, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list123);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 17160L)
    public static SubLObject do_sbhl_non_time_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list123);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred_var = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list123);
        pred_var = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list123);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject module = (SubLObject)sbhl_macros.$sym126$MODULE;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym127$DO_SBHL_MODULES, (SubLObject)ConsesLow.list(module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym128$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym129$SBHL_TIME_MODULE_P, module), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pred_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym130$GET_SBHL_LINK_PRED, module))), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list123);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 17489L)
    public static SubLObject do_sbhl_non_time_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list131);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module_var = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list131);
        module_var = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list131);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject module = (SubLObject)sbhl_macros.$sym132$MODULE;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym127$DO_SBHL_MODULES, (SubLObject)ConsesLow.list(module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym128$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym129$SBHL_TIME_MODULE_P, module), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(module_var, module)), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list131);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 17795L)
    public static SubLObject do_sbhl_graphs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list133);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module_var = (SubLObject)sbhl_macros.NIL;
        SubLObject graph_var = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list133);
        module_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list133);
        graph_var = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list133);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym127$DO_SBHL_MODULES, (SubLObject)ConsesLow.list(module_var, done_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(graph_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym134$GET_SBHL_MODULE_GRAPH, module_var))), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list133);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 18045L)
    public static SubLObject with_forward_sbhl_link_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)sbhl_macros.$list135, ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 18308L)
    public static SubLObject with_backward_sbhl_link_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)sbhl_macros.$list136, ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 18565L)
    public static SubLObject with_sbhl_type_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list137);
        node = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym56$PIF, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym138$COR, (SubLObject)sbhl_macros.$list139, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym140$APPLY_SBHL_MODULE_TYPE_TEST, node, (SubLObject)sbhl_macros.$list141)), reader.bq_cons((SubLObject)sbhl_macros.$sym142$PROGN, ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym143$SBHL_WARN, (SubLObject)sbhl_macros.TWO_INTEGER, (SubLObject)sbhl_macros.$str144$Node__a_does_not_pass_sbhl_type_t, node, (SubLObject)sbhl_macros.$list145));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 18967L)
    public static SubLObject do_sbhl_module_graph(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list146);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject link_var = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list146);
        node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list146);
        link_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list146);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list146);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym147$DO_SBHL_GRAPH_LINKS, (SubLObject)ConsesLow.list(node_var, link_var, (SubLObject)sbhl_macros.$kw148$MODULE, module, (SubLObject)sbhl_macros.$kw6$DONE, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list146);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 19448L)
    public static SubLObject do_with_relevant_sbhl_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list149);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list149);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject module_var = (SubLObject)sbhl_macros.$sym150$MODULE_VAR;
            final SubLObject accessible_modules = (SubLObject)sbhl_macros.$sym151$ACCESSIBLE_MODULES;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(accessible_modules, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym152$GET_SBHL_ACCESSIBLE_MODULES, module))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym124$SMART_CSOME, (SubLObject)ConsesLow.list(module_var, accessible_modules, done_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym153$WITH_SBHL_MODULE, module_var, ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list149);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 19975L)
    public static SubLObject get_sbhl_accessible_modules(final SubLObject module) {
        assert sbhl_macros.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject preds = sbhl_module_utilities.get_sbhl_accessible_link_preds(module);
        return (SubLObject)((sbhl_macros.NIL != preds) ? Mapping.mapcar((SubLObject)sbhl_macros.$sym155$GET_SBHL_MODULE, preds) : ConsesLow.list(module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 20346L)
    public static SubLObject do_relevant_sbhl_directions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list156);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject direction_var = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list156);
        direction_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list156);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list156);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym124$SMART_CSOME, (SubLObject)ConsesLow.list(direction_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym157$GET_RELEVANT_SBHL_DIRECTIONS, module), done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list156);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 20700L)
    public static SubLObject bind_sbhl_search_behavior(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)sbhl_macros.$list158, ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 21337L)
    public static SubLObject bind_sbhl_boolean_goal_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list137);
        node = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject premarkingP = (SubLObject)sbhl_macros.$sym159$PREMARKING_;
        final SubLObject goal_fn = (SubLObject)sbhl_macros.$sym160$GOAL_FN;
        final SubLObject goal_node = (SubLObject)sbhl_macros.$sym161$GOAL_NODE;
        final SubLObject goal_space = (SubLObject)sbhl_macros.$sym162$GOAL_SPACE;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(premarkingP, (SubLObject)sbhl_macros.$list163), reader.bq_cons(goal_fn, (SubLObject)sbhl_macros.$list164), (SubLObject)ConsesLow.list(goal_node, node), reader.bq_cons(goal_space, (SubLObject)sbhl_macros.$list165)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, premarkingP, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym153$WITH_SBHL_MODULE, (SubLObject)sbhl_macros.$list166, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym167$POSSIBLY_PREMARK_WITH_GENL_INVERSE_MODE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym168$SBHL_PREMARK_GATHER_NODES, goal_node))), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym169$CSETQ, goal_fn, (SubLObject)sbhl_macros.$list170), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym169$CSETQ, goal_space, (SubLObject)sbhl_macros.$list171)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym172$RESET_SBHL_SEARCH_PARENT_MARKING, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym174$WITH_SBHL_CONSIDER_NODE_FN, goal_fn, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym175$WITH_SBHL_GOAL_NODE, goal_node, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym176$WITH_SBHL_GOAL_SPACE, goal_space, ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 22221L)
    public static SubLObject sbhl_possibly_rebind_temporal_search_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        SubLObject link_node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list177);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list177);
        link_node = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$list178, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym179$_SBHL_TEMPORALITY_SEARCH_PASSED_THROUGH_DATE__, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym180$FWHEN, (SubLObject)sbhl_macros.$list181, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym138$COR, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym182$HL_DATE_POINT_P, node), (SubLObject)sbhl_macros.$list183)))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym128$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym184$CAND, (SubLObject)sbhl_macros.$list181, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym185$SBHL_TEMPORALITY_CONSEQUENT_LINKS_SEARCH_PASSED_THROUGH_LINK_P, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym186$SBHL_TEMPORAL_FAUX_LINK, node, link_node))), reader.bq_cons((SubLObject)sbhl_macros.$sym142$PROGN, ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 23258L)
    public static SubLObject bind_sbhl_sample_leaf_search_behavior(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)sbhl_macros.$list187, ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 23580L)
    public static SubLObject do_all_simple_true_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list188);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list188);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list188);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list188);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list188);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list188);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list188);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list188);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.$kw189$BREADTH);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list188);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject node_var = (SubLObject)sbhl_macros.$sym190$NODE_VAR;
            final SubLObject deck_type = (SubLObject)sbhl_macros.$sym191$DECK_TYPE;
            final SubLObject recur_deck = (SubLObject)sbhl_macros.$sym192$RECUR_DECK;
            final SubLObject node_vars_link_node = (SubLObject)sbhl_macros.$sym193$NODE_VARS_LINK_NODE;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym128$PUNLESS, done_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(node_var, node), (SubLObject)ConsesLow.list(deck_type, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym194$FIF, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.EQ, search_type, (SubLObject)sbhl_macros.$list195), (SubLObject)sbhl_macros.$list196)), (SubLObject)ConsesLow.list(recur_deck, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym197$CREATE_DECK, deck_type))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym198$WITH_NEW_SBHL_SPACE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym199$POSSIBLY_WITH_SBHL_TRUE_TV, tv, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym200$WITH_SBHL_SEARCH_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym201$WITH_SBHL_TYPE_TEST, node, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym202$WITH_SBHL_SEARCH_DIRECTION, direction, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym203$WITH_SBHL_LINK_DIRECTION, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym204$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, direction, module), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym205$SBHL_MARK_NODE_MARKED, node_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym206$WHILE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym184$CAND, node_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym207$CNOT, done_var)), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(link_node_var, node_var)), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym208$DO_ACCESSIBLE_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(node_vars_link_node, node_var, (SubLObject)sbhl_macros.$list209, module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym128$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym210$SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym205$SBHL_MARK_NODE_MARKED, node_vars_link_node), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym211$DECK_PUSH, node_vars_link_node, recur_deck))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym169$CSETQ, node_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym212$DECK_POP, recur_deck)))))))))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list188);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 25025L)
    public static SubLObject do_all_simple_forward_true_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym214$DO_ALL_SIMPLE_TRUE_LINKS, (SubLObject)ConsesLow.list(link_node_var, module, (SubLObject)sbhl_macros.$list215, node, mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list213);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 25457L)
    public static SubLObject do_all_simple_backward_true_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym214$DO_ALL_SIMPLE_TRUE_LINKS, (SubLObject)ConsesLow.list(link_node_var, module, (SubLObject)sbhl_macros.$list216, node, mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list213);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 25893L)
    public static SubLObject do_all_simple_true_links_for_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list217);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list217);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list217);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list217);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list217);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list217);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list217);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list217);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.$kw218$DEPTH);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list217);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject node_var = (SubLObject)sbhl_macros.$sym219$NODE_VAR;
            final SubLObject node_and_predicate_mode = (SubLObject)sbhl_macros.$sym220$NODE_AND_PREDICATE_MODE;
            final SubLObject predicate_mode = (SubLObject)sbhl_macros.$sym221$PREDICATE_MODE;
            final SubLObject deck_type = (SubLObject)sbhl_macros.$sym222$DECK_TYPE;
            final SubLObject recur_deck = (SubLObject)sbhl_macros.$sym223$RECUR_DECK;
            final SubLObject node_vars_link_node = (SubLObject)sbhl_macros.$sym224$NODE_VARS_LINK_NODE;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym128$PUNLESS, done_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(node_var, node), (SubLObject)ConsesLow.list(deck_type, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym194$FIF, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.EQ, search_type, (SubLObject)sbhl_macros.$list225), (SubLObject)sbhl_macros.$list226)), (SubLObject)ConsesLow.list(recur_deck, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym197$CREATE_DECK, deck_type)), node_and_predicate_mode), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym198$WITH_NEW_SBHL_SPACE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym199$POSSIBLY_WITH_SBHL_TRUE_TV, tv, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym200$WITH_SBHL_SEARCH_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym201$WITH_SBHL_TYPE_TEST, node, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym202$WITH_SBHL_SEARCH_DIRECTION, direction, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym203$WITH_SBHL_LINK_DIRECTION, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym204$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, direction, module), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym205$SBHL_MARK_NODE_MARKED, node_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym169$CSETQ, node_and_predicate_mode, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym90$LIST, node, (SubLObject)sbhl_macros.$list227)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym206$WHILE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym184$CAND, node_and_predicate_mode, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym207$CNOT, done_var)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(node_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym228$FIRST, node_and_predicate_mode)), (SubLObject)ConsesLow.list(predicate_mode, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym229$SECOND, node_and_predicate_mode)), (SubLObject)ConsesLow.list(link_node_var, node_var)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym230$WITH_SBHL_PREDICATE_MODE, predicate_mode, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym231$APPLY_SBHL_ADD_NODE_TEST, (SubLObject)sbhl_macros.$list232, node_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym208$DO_ACCESSIBLE_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(node_vars_link_node, node_var, (SubLObject)sbhl_macros.$list209, module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym128$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym210$SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym205$SBHL_MARK_NODE_MARKED, node_vars_link_node), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym211$DECK_PUSH, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym90$LIST, node_vars_link_node, (SubLObject)sbhl_macros.$list227), recur_deck))))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym169$CSETQ, node_and_predicate_mode, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym212$DECK_POP, recur_deck)))))))))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list217);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 27871L)
    public static SubLObject do_all_simple_forward_true_links_for_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym233$DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.list(link_node_var, module, (SubLObject)sbhl_macros.$list215, node, mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list213);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 28397L)
    public static SubLObject do_all_simple_backward_true_links_for_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym233$DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.list(link_node_var, module, (SubLObject)sbhl_macros.$list216, node, mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list213);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 28926L)
    public static SubLObject do_all_mode_true_links_for_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list234);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mode_var = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list234);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list234);
        mode_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list234);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list234);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list234);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list234);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list234);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list234);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.$kw218$DEPTH);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list234);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject node_var = (SubLObject)sbhl_macros.$sym235$NODE_VAR;
            final SubLObject node_and_predicate_mode = (SubLObject)sbhl_macros.$sym236$NODE_AND_PREDICATE_MODE;
            final SubLObject predicate_mode = (SubLObject)sbhl_macros.$sym237$PREDICATE_MODE;
            final SubLObject deck_type = (SubLObject)sbhl_macros.$sym238$DECK_TYPE;
            final SubLObject recur_deck = (SubLObject)sbhl_macros.$sym239$RECUR_DECK;
            final SubLObject node_vars_link_node = (SubLObject)sbhl_macros.$sym240$NODE_VARS_LINK_NODE;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym128$PUNLESS, done_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(node_var, node), (SubLObject)ConsesLow.list(deck_type, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym194$FIF, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.EQ, search_type, (SubLObject)sbhl_macros.$list225), (SubLObject)sbhl_macros.$list226)), (SubLObject)ConsesLow.list(recur_deck, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym197$CREATE_DECK, deck_type)), node_and_predicate_mode), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym198$WITH_NEW_SBHL_SPACE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym199$POSSIBLY_WITH_SBHL_TRUE_TV, tv, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym200$WITH_SBHL_SEARCH_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym201$WITH_SBHL_TYPE_TEST, node, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym202$WITH_SBHL_SEARCH_DIRECTION, direction, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym203$WITH_SBHL_LINK_DIRECTION, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym204$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, direction, module), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym205$SBHL_MARK_NODE_MARKED, node_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym169$CSETQ, node_and_predicate_mode, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym90$LIST, node, (SubLObject)sbhl_macros.$list227)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym206$WHILE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym184$CAND, node_and_predicate_mode, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym207$CNOT, done_var)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(node_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym228$FIRST, node_and_predicate_mode)), (SubLObject)ConsesLow.list(predicate_mode, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym229$SECOND, node_and_predicate_mode)), (SubLObject)ConsesLow.list(link_node_var, node_var)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym230$WITH_SBHL_PREDICATE_MODE, predicate_mode, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym142$PROGN, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mode_var, predicate_mode)), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym208$DO_ACCESSIBLE_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(node_vars_link_node, node_var, (SubLObject)sbhl_macros.$list209, module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym128$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym210$SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym205$SBHL_MARK_NODE_MARKED, node_vars_link_node), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym211$DECK_PUSH, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym90$LIST, node_vars_link_node, (SubLObject)sbhl_macros.$list227), recur_deck)))))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym169$CSETQ, node_and_predicate_mode, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym212$DECK_POP, recur_deck)))))))))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list234);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 30673L)
    public static SubLObject do_all_mode_backward_true_links_for_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list241);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mode_var = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list241);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list241);
        mode_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list241);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list241);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list241);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list241);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list241);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list241);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym242$DO_ALL_MODE_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.list(new SubLObject[] { link_node_var, mode_var, module, sbhl_macros.$list216, node, mt, tv, done_var, search_type }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list241);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 31035L)
    public static SubLObject do_all_mode_forward_true_links_for_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list241);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mode_var = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list241);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list241);
        mode_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list241);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list241);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list241);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list241);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list241);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list241);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym242$DO_ALL_MODE_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.list(new SubLObject[] { link_node_var, mode_var, module, sbhl_macros.$list215, node, mt, tv, done_var, search_type }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list241);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 31395L)
    public static SubLObject do_all_forward_true_links_for_tt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject node_var = (SubLObject)sbhl_macros.$sym243$NODE_VAR;
            final SubLObject deck_type = (SubLObject)sbhl_macros.$sym244$DECK_TYPE;
            final SubLObject recur_deck = (SubLObject)sbhl_macros.$sym245$RECUR_DECK;
            final SubLObject node_vars_link_node = (SubLObject)sbhl_macros.$sym246$NODE_VARS_LINK_NODE;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym128$PUNLESS, done_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(node_var, node), (SubLObject)ConsesLow.list(deck_type, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym194$FIF, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.EQ, search_type, (SubLObject)sbhl_macros.$list225), (SubLObject)sbhl_macros.$list226)), (SubLObject)ConsesLow.list(recur_deck, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym197$CREATE_DECK, deck_type))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym198$WITH_NEW_SBHL_SPACE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym199$POSSIBLY_WITH_SBHL_TRUE_TV, tv, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym200$WITH_SBHL_SEARCH_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym201$WITH_SBHL_TYPE_TEST, node, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym247$WITH_SBHL_FORWARD_SEARCH_DIRECTION, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym248$WITH_SBHL_FORWARD_LINK_DIRECTION, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym208$DO_ACCESSIBLE_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(node_vars_link_node, node_var, (SubLObject)sbhl_macros.$list209, module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym128$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym210$SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym205$SBHL_MARK_NODE_MARKED, node_vars_link_node), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym211$DECK_PUSH, node_vars_link_node, recur_deck))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym169$CSETQ, node_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym212$DECK_POP, recur_deck)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym153$WITH_SBHL_MODULE, (SubLObject)sbhl_macros.$list166, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym248$WITH_SBHL_FORWARD_LINK_DIRECTION, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym206$WHILE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym184$CAND, node_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym207$CNOT, done_var)), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(link_node_var, node_var)), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym208$DO_ACCESSIBLE_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(node_vars_link_node, node_var, (SubLObject)sbhl_macros.$list209, (SubLObject)sbhl_macros.$list107, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym128$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym210$SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym205$SBHL_MARK_NODE_MARKED, node_vars_link_node), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym211$DECK_PUSH, node_vars_link_node, recur_deck))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym169$CSETQ, node_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym212$DECK_POP, recur_deck))))))))))))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list213);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 33350L)
    public static SubLObject do_all_backward_true_links_for_tt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)sbhl_macros.NIL;
        SubLObject module = (SubLObject)sbhl_macros.NIL;
        SubLObject node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list213);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list213);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject node_var = (SubLObject)sbhl_macros.$sym249$NODE_VAR;
            final SubLObject tt_node_var = (SubLObject)sbhl_macros.$sym250$TT_NODE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(node_var, node)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym153$WITH_SBHL_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym251$WITH_NEW_SBHL_GATHER_SPACE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym214$DO_ALL_SIMPLE_TRUE_LINKS, (SubLObject)ConsesLow.list(tt_node_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym252$GET_SBHL_TRANSFERS_THROUGH_MODULE, module), (SubLObject)sbhl_macros.$list216, node_var, mt, tv, done_var, search_type), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym253$DO_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS, (SubLObject)ConsesLow.list(link_node_var, tt_node_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym54$GET_SBHL_MODULE_BACKWARD_DIRECTION, module), module, done_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym128$PUNLESS, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym210$SBHL_SEARCH_PATH_TERMINATION_P, link_node_var, (SubLObject)sbhl_macros.$list171), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym205$SBHL_MARK_NODE_MARKED, link_node_var, (SubLObject)sbhl_macros.$list171), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list213);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 34356L)
    public static SubLObject do_true_isa_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list254);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list254);
        isa_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list254);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list254);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list254);
        v_term = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list254);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, (SubLObject)ConsesLow.list(isa_var, tv_var, mt_var, v_term, (SubLObject)sbhl_macros.$list256, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list254);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 34747L)
    public static SubLObject do_relevant_isa_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list257);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_links_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list257);
        isa_links_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list257);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list257);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list257);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list257);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym258$DO_RELEVANT_FORWARD_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(isa_links_var, v_term, mt, tv, (SubLObject)sbhl_macros.$list256, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list257);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 35025L)
    public static SubLObject do_local_isas(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list259);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list259);
        isa_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list259);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sbhl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sbhl_macros.NIL;
        SubLObject current_$2 = (SubLObject)sbhl_macros.NIL;
        while (sbhl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_macros.$list259);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_macros.$list259);
            if (sbhl_macros.NIL == conses_high.member(current_$2, (SubLObject)sbhl_macros.$list260, (SubLObject)sbhl_macros.UNPROVIDED, (SubLObject)sbhl_macros.UNPROVIDED)) {
                bad = (SubLObject)sbhl_macros.T;
            }
            if (current_$2 == sbhl_macros.$kw116$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sbhl_macros.NIL != bad && sbhl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list259);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_macros.$kw261$MT, current);
        final SubLObject mt = (SubLObject)((sbhl_macros.NIL != mt_tail) ? conses_high.cadr(mt_tail) : sbhl_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_macros.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((sbhl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sbhl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject mt_var = (SubLObject)sbhl_macros.$sym262$MT_VAR;
        final SubLObject tv_var = (SubLObject)sbhl_macros.$sym263$TV_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym265$DO_TRUE_ISA_LINKS, (SubLObject)ConsesLow.list(isa_var, mt_var, tv_var, v_term, done), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym266$IGNORE, tv_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym75$RELEVANT_MT_, mt_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 35423L)
    public static SubLObject some_relevant_isa(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list267);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list267);
        isa_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list267);
        v_term = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list267);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject link_nodes = (SubLObject)sbhl_macros.$sym268$LINK_NODES;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym199$POSSIBLY_WITH_SBHL_TRUE_TV, (SubLObject)sbhl_macros.NIL, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym104$WITH_RELEVANT_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(link_nodes, v_term, (SubLObject)sbhl_macros.$list269, (SubLObject)sbhl_macros.$list256, done_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym5$DO_SET_OR_LIST, (SubLObject)ConsesLow.list(isa_var, link_nodes, (SubLObject)sbhl_macros.$kw6$DONE, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list267);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 35862L)
    public static SubLObject do_true_instance_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list270);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list270);
        instance_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list270);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list270);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list270);
        v_term = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list270);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, (SubLObject)ConsesLow.list(instance_var, tv_var, mt_var, v_term, (SubLObject)sbhl_macros.$list256, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list270);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 36181L)
    public static SubLObject do_relevant_instance_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list272);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_links_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list272);
        instance_links_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list272);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list272);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list272);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list272);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym273$DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(instance_links_var, v_term, mt, tv, (SubLObject)sbhl_macros.$list256, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list272);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 36476L)
    public static SubLObject do_local_instances(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list274);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list274);
        instance_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list274);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sbhl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sbhl_macros.NIL;
        SubLObject current_$3 = (SubLObject)sbhl_macros.NIL;
        while (sbhl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_macros.$list274);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_macros.$list274);
            if (sbhl_macros.NIL == conses_high.member(current_$3, (SubLObject)sbhl_macros.$list260, (SubLObject)sbhl_macros.UNPROVIDED, (SubLObject)sbhl_macros.UNPROVIDED)) {
                bad = (SubLObject)sbhl_macros.T;
            }
            if (current_$3 == sbhl_macros.$kw116$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sbhl_macros.NIL != bad && sbhl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list274);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_macros.$kw261$MT, current);
        final SubLObject mt = (SubLObject)((sbhl_macros.NIL != mt_tail) ? conses_high.cadr(mt_tail) : sbhl_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_macros.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((sbhl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sbhl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject mt_var = (SubLObject)sbhl_macros.$sym275$MT_VAR;
        final SubLObject tv_var = (SubLObject)sbhl_macros.$sym276$TV_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym277$DO_TRUE_INSTANCE_LINKS, (SubLObject)ConsesLow.list(instance_var, mt_var, tv_var, col, done), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym266$IGNORE, tv_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym75$RELEVANT_MT_, mt_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym89$DO_NON_FORT_DIRECT_INSTANCE_LINKS, (SubLObject)ConsesLow.list(instance_var, mt_var, tv_var, col, done), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym37$SBHL_TRUE_TV_P, tv_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym75$RELEVANT_MT_, mt_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 37069L)
    public static SubLObject do_true_quoted_isa_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list278);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject quoted_isa_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list278);
        quoted_isa_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list278);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list278);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list278);
        v_term = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list278);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, (SubLObject)ConsesLow.list(quoted_isa_var, tv_var, mt_var, v_term, (SubLObject)sbhl_macros.$list279, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list278);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 37396L)
    public static SubLObject do_local_quoted_isas(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list280);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject quoted_isa_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list280);
        quoted_isa_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list280);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sbhl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sbhl_macros.NIL;
        SubLObject current_$4 = (SubLObject)sbhl_macros.NIL;
        while (sbhl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_macros.$list280);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_macros.$list280);
            if (sbhl_macros.NIL == conses_high.member(current_$4, (SubLObject)sbhl_macros.$list260, (SubLObject)sbhl_macros.UNPROVIDED, (SubLObject)sbhl_macros.UNPROVIDED)) {
                bad = (SubLObject)sbhl_macros.T;
            }
            if (current_$4 == sbhl_macros.$kw116$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sbhl_macros.NIL != bad && sbhl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list280);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_macros.$kw261$MT, current);
        final SubLObject mt = (SubLObject)((sbhl_macros.NIL != mt_tail) ? conses_high.cadr(mt_tail) : sbhl_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_macros.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((sbhl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sbhl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject mt_var = (SubLObject)sbhl_macros.$sym281$MT_VAR;
        final SubLObject tv_var = (SubLObject)sbhl_macros.$sym282$TV_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym283$DO_TRUE_QUOTED_ISA_LINKS, (SubLObject)ConsesLow.list(quoted_isa_var, mt_var, tv_var, v_term, done), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym266$IGNORE, tv_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym75$RELEVANT_MT_, mt_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 37836L)
    public static SubLObject do_true_quoted_instance_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list270);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list270);
        instance_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list270);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list270);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list270);
        v_term = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list270);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, (SubLObject)ConsesLow.list(instance_var, tv_var, mt_var, v_term, (SubLObject)sbhl_macros.$list279, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list270);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 38171L)
    public static SubLObject do_local_quoted_instances(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list284);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject quoted_instance_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list284);
        quoted_instance_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list284);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sbhl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sbhl_macros.NIL;
        SubLObject current_$5 = (SubLObject)sbhl_macros.NIL;
        while (sbhl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_macros.$list284);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_macros.$list284);
            if (sbhl_macros.NIL == conses_high.member(current_$5, (SubLObject)sbhl_macros.$list260, (SubLObject)sbhl_macros.UNPROVIDED, (SubLObject)sbhl_macros.UNPROVIDED)) {
                bad = (SubLObject)sbhl_macros.T;
            }
            if (current_$5 == sbhl_macros.$kw116$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sbhl_macros.NIL != bad && sbhl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list284);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_macros.$kw261$MT, current);
        final SubLObject mt = (SubLObject)((sbhl_macros.NIL != mt_tail) ? conses_high.cadr(mt_tail) : sbhl_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_macros.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((sbhl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sbhl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject mt_var = (SubLObject)sbhl_macros.$sym285$MT_VAR;
        final SubLObject tv_var = (SubLObject)sbhl_macros.$sym286$TV_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym287$DO_TRUE_QUOTED_INSTANCE_LINKS, (SubLObject)ConsesLow.list(quoted_instance_var, mt_var, tv_var, col, done), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym266$IGNORE, tv_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym75$RELEVANT_MT_, mt_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 38638L)
    public static SubLObject do_all_isa(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list288);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list288);
        isa_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list288);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list288);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list288);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list288);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list288);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym289$DO_ALL_FORWARD_TRUE_LINKS_FOR_TT, (SubLObject)ConsesLow.list(isa_var, (SubLObject)sbhl_macros.$list256, v_term, mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list288);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 38926L)
    public static SubLObject do_all_isa_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list290);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list290);
        isa_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list290);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list290);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list290);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list290);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym289$DO_ALL_FORWARD_TRUE_LINKS_FOR_TT, (SubLObject)ConsesLow.listS(isa_var, new SubLObject[] { sbhl_macros.$list256, v_term, mt, tv, done_var, sbhl_macros.$list225 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list290);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 39209L)
    public static SubLObject do_all_isa_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list290);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list290);
        isa_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list290);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list290);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list290);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list290);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym289$DO_ALL_FORWARD_TRUE_LINKS_FOR_TT, (SubLObject)ConsesLow.listS(isa_var, new SubLObject[] { sbhl_macros.$list256, v_term, mt, tv, done_var, sbhl_macros.$list195 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list290);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 39498L)
    public static SubLObject do_all_isas_by_generality(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list291);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_isa = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        SubLObject domain_mt = (SubLObject)sbhl_macros.NIL;
        SubLObject doneP = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list291);
        v_isa = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list291);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list291);
        domain_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list291);
        doneP = current.first();
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject isas = (SubLObject)sbhl_macros.$sym292$ISAS;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym293$WITH_MT, domain_mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(isas, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym294$SORT_BY_GENERALITY_ESTIMATE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym295$ALL_ISA, v_term)))), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym81$CSOME, (SubLObject)ConsesLow.list(v_isa, isas, doneP), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list291);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 39822L)
    public static SubLObject do_all_instances(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list296);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list296);
        instance_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list296);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym297$DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT, (SubLObject)ConsesLow.list(instance_var, (SubLObject)sbhl_macros.$list256, v_term, mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list296);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 40130L)
    public static SubLObject do_all_instances_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list300);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list300);
        instance_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list300);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list300);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list300);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list300);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym297$DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT, (SubLObject)ConsesLow.listS(instance_var, new SubLObject[] { sbhl_macros.$list256, v_term, mt, tv, done_var, sbhl_macros.$list225 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list300);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 40431L)
    public static SubLObject do_all_instances_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list300);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list300);
        instance_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list300);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list300);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list300);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list300);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym297$DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT, (SubLObject)ConsesLow.listS(instance_var, new SubLObject[] { sbhl_macros.$list256, v_term, mt, tv, done_var, sbhl_macros.$list195 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list300);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 40738L)
    public static SubLObject do_all_fort_instances(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list296);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list296);
        instance_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list296);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym298$DO_ALL_INSTANCES, (SubLObject)ConsesLow.list(instance_var, v_term, mt, tv, done_var, search_type), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym301$FORT_P, instance_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list296);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 41038L)
    public static SubLObject do_all_instances_of_all(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list304);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = (SubLObject)sbhl_macros.NIL;
        SubLObject terms = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list304);
        instance_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list304);
        terms = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list304);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list304);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list304);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list304);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject terms_var = (SubLObject)sbhl_macros.$sym305$TERMS_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(terms_var, terms)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym298$DO_ALL_INSTANCES, (SubLObject)ConsesLow.list(instance_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym228$FIRST, terms_var), mt, tv, done_var, search_type), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym306$ALL_ISA_, instance_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym307$REST, terms_var), mt, tv), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list304);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 41464L)
    public static SubLObject do_all_quoted_instances(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list296);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list296);
        instance_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list296);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym297$DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT, (SubLObject)ConsesLow.list(instance_var, (SubLObject)sbhl_macros.$list279, v_term, mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list296);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 41792L)
    public static SubLObject do_all_fort_quoted_instances(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list296);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list296);
        instance_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list296);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list296);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym308$DO_ALL_QUOTED_INSTANCES, (SubLObject)ConsesLow.list(instance_var, v_term, mt, tv, done_var, search_type), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym301$FORT_P, instance_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list296);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 42106L)
    public static SubLObject do_all_quoted_instances_of_all(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list304);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = (SubLObject)sbhl_macros.NIL;
        SubLObject terms = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list304);
        instance_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list304);
        terms = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list304);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list304);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list304);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list304);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject terms_var = (SubLObject)sbhl_macros.$sym310$TERMS_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(terms_var, terms)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym308$DO_ALL_QUOTED_INSTANCES, (SubLObject)ConsesLow.list(instance_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym228$FIRST, terms_var), mt, tv, done_var, search_type), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym311$ALL_QUOTED_ISA_, instance_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym307$REST, terms_var), mt, tv), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list304);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 42560L)
    public static SubLObject do_true_genls_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list312);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list312);
        genl_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list312);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list312);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list312);
        col = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list312);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, (SubLObject)ConsesLow.list(genl_var, tv_var, mt_var, col, (SubLObject)sbhl_macros.$list313, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list312);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 42961L)
    public static SubLObject do_relevant_genls_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list314);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_links_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list314);
        genl_links_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list314);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list314);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list314);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list314);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym258$DO_RELEVANT_FORWARD_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(genl_links_var, col, mt, tv, (SubLObject)sbhl_macros.$list313, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list314);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 43243L)
    public static SubLObject do_genls(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list315);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list315);
        genl_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list315);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list315);
        col = current.first();
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list315);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject dummy = (SubLObject)sbhl_macros.$sym316$DUMMY;
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym317$DO_TRUE_GENLS_LINKS, (SubLObject)ConsesLow.list(genl_var, mt_var, dummy, col), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list315);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 43500L)
    public static SubLObject do_local_genls(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list318);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list318);
        genl_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list318);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sbhl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sbhl_macros.NIL;
        SubLObject current_$6 = (SubLObject)sbhl_macros.NIL;
        while (sbhl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_macros.$list318);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_macros.$list318);
            if (sbhl_macros.NIL == conses_high.member(current_$6, (SubLObject)sbhl_macros.$list260, (SubLObject)sbhl_macros.UNPROVIDED, (SubLObject)sbhl_macros.UNPROVIDED)) {
                bad = (SubLObject)sbhl_macros.T;
            }
            if (current_$6 == sbhl_macros.$kw116$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sbhl_macros.NIL != bad && sbhl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list318);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_macros.$kw261$MT, current);
        final SubLObject mt = (SubLObject)((sbhl_macros.NIL != mt_tail) ? conses_high.cadr(mt_tail) : sbhl_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_macros.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((sbhl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sbhl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject mt_var = (SubLObject)sbhl_macros.$sym319$MT_VAR;
        final SubLObject tv_var = (SubLObject)sbhl_macros.$sym320$TV_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym317$DO_TRUE_GENLS_LINKS, (SubLObject)ConsesLow.list(genl_var, mt_var, tv_var, col, done), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym266$IGNORE, tv_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym75$RELEVANT_MT_, mt_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 43902L)
    public static SubLObject do_true_spec_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list321);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list321);
        spec_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list321);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list321);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list321);
        col = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list321);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, (SubLObject)ConsesLow.list(spec_var, tv_var, mt_var, col, (SubLObject)sbhl_macros.$list313, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list321);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 44201L)
    public static SubLObject do_relevant_spec_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list322);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_links_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list322);
        spec_links_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list322);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list322);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list322);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list322);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym273$DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(spec_links_var, col, mt, tv, (SubLObject)sbhl_macros.$list313, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list322);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 44484L)
    public static SubLObject do_local_specs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list323);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list323);
        spec_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list323);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sbhl_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sbhl_macros.NIL;
        SubLObject current_$7 = (SubLObject)sbhl_macros.NIL;
        while (sbhl_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_macros.$list323);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_macros.$list323);
            if (sbhl_macros.NIL == conses_high.member(current_$7, (SubLObject)sbhl_macros.$list260, (SubLObject)sbhl_macros.UNPROVIDED, (SubLObject)sbhl_macros.UNPROVIDED)) {
                bad = (SubLObject)sbhl_macros.T;
            }
            if (current_$7 == sbhl_macros.$kw116$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sbhl_macros.NIL != bad && sbhl_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list323);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_macros.$kw261$MT, current);
        final SubLObject mt = (SubLObject)((sbhl_macros.NIL != mt_tail) ? conses_high.cadr(mt_tail) : sbhl_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_macros.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((sbhl_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sbhl_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject mt_var = (SubLObject)sbhl_macros.$sym324$MT_VAR;
        final SubLObject tv_var = (SubLObject)sbhl_macros.$sym325$TV_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym326$DO_TRUE_SPEC_LINKS, (SubLObject)ConsesLow.list(spec_var, mt_var, tv_var, col, done), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym266$IGNORE, tv_var), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym75$RELEVANT_MT_, mt_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 44885L)
    public static SubLObject do_all_genls(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list327);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list327);
        genl_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list327);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list327);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list327);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list327);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list327);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, (SubLObject)ConsesLow.list(genl_var, (SubLObject)sbhl_macros.$list313, col, mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list327);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 45178L)
    public static SubLObject do_all_genls_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list329);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list329);
        genl_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list329);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list329);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list329);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list329);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, (SubLObject)ConsesLow.listS(genl_var, new SubLObject[] { sbhl_macros.$list313, col, mt, tv, done_var, sbhl_macros.$list225 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list329);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 45465L)
    public static SubLObject do_all_genls_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list329);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list329);
        genl_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list329);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list329);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list329);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list329);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, (SubLObject)ConsesLow.listS(genl_var, new SubLObject[] { sbhl_macros.$list313, col, mt, tv, done_var, sbhl_macros.$list195 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list329);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 45758L)
    public static SubLObject do_all_genls_by_generality(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list330);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl = (SubLObject)sbhl_macros.NIL;
        SubLObject spec = (SubLObject)sbhl_macros.NIL;
        SubLObject domain_mt = (SubLObject)sbhl_macros.NIL;
        SubLObject doneP = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list330);
        genl = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list330);
        spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list330);
        domain_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list330);
        doneP = current.first();
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject v_genls = (SubLObject)sbhl_macros.$sym331$GENLS;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym293$WITH_MT, domain_mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_genls, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym294$SORT_BY_GENERALITY_ESTIMATE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym332$ALL_GENLS, spec)))), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym81$CSOME, (SubLObject)ConsesLow.list(genl, v_genls, doneP), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list330);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 46076L)
    public static SubLObject do_all_specs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list333);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list333);
        spec_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list333);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list333);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list333);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list333);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list333);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, (SubLObject)ConsesLow.list(spec_var, (SubLObject)sbhl_macros.$list313, col, mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list333);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 46371L)
    public static SubLObject do_all_specs_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list335);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list335);
        spec_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list335);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list335);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list335);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list335);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, (SubLObject)ConsesLow.listS(spec_var, new SubLObject[] { sbhl_macros.$list313, col, mt, tv, done_var, sbhl_macros.$list225 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list335);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 46660L)
    public static SubLObject do_all_specs_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list335);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_var = (SubLObject)sbhl_macros.NIL;
        SubLObject col = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list335);
        spec_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list335);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list335);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list335);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list335);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, (SubLObject)ConsesLow.listS(spec_var, new SubLObject[] { sbhl_macros.$list313, col, mt, tv, done_var, sbhl_macros.$list195 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list335);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 46955L)
    public static SubLObject do_all_specs_by_generality(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list336);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec = (SubLObject)sbhl_macros.NIL;
        SubLObject v_term = (SubLObject)sbhl_macros.NIL;
        SubLObject domain_mt = (SubLObject)sbhl_macros.NIL;
        SubLObject doneP = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list336);
        spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list336);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list336);
        domain_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list336);
        doneP = current.first();
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject specs = (SubLObject)sbhl_macros.$sym337$SPECS;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym293$WITH_MT, domain_mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(specs, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym338$NREVERSE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym294$SORT_BY_GENERALITY_ESTIMATE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym339$ALL_SPECS, v_term))))), (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym81$CSOME, (SubLObject)ConsesLow.list(spec, specs, doneP), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list336);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 47228L)
    public static SubLObject do_true_genl_predicate_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list340);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_predicate_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list340);
        genl_predicate_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list340);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list340);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list340);
        pred = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list340);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, (SubLObject)ConsesLow.list(genl_predicate_var, tv_var, mt_var, pred, (SubLObject)sbhl_macros.$list341, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list340);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 47686L)
    public static SubLObject do_relevant_genl_predicate_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list342);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_predicate_links_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list342);
        genl_predicate_links_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list342);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list342);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list342);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list342);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym258$DO_RELEVANT_FORWARD_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(genl_predicate_links_var, pred, mt, tv, (SubLObject)sbhl_macros.$list341, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list342);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 48003L)
    public static SubLObject do_true_spec_predicate_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list343);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_predicate_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list343);
        spec_predicate_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list343);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list343);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list343);
        pred = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list343);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, (SubLObject)ConsesLow.list(spec_predicate_var, tv_var, mt_var, pred, (SubLObject)sbhl_macros.$list341, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list343);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 48348L)
    public static SubLObject do_relevant_spec_predicate_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list344);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_predicate_links_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list344);
        spec_predicate_links_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list344);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list344);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list344);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list344);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym273$DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(spec_predicate_links_var, pred, mt, tv, (SubLObject)sbhl_macros.$list341, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list344);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 48667L)
    public static SubLObject do_all_genl_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list345);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_predicate_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list345);
        genl_predicate_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list345);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list345);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list345);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list345);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list345);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.list(genl_predicate_var, (SubLObject)sbhl_macros.$list341, pred, mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list345);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 49020L)
    public static SubLObject do_all_genl_predicates_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list347);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_predicate_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list347);
        genl_predicate_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list347);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list347);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list347);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list347);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.listS(genl_predicate_var, new SubLObject[] { sbhl_macros.$list341, pred, mt, tv, done_var, sbhl_macros.$list225 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list347);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 49356L)
    public static SubLObject do_all_genl_predicates_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list347);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_predicate_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list347);
        genl_predicate_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list347);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list347);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list347);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list347);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.listS(genl_predicate_var, new SubLObject[] { sbhl_macros.$list341, pred, mt, tv, done_var, sbhl_macros.$list195 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list347);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 49698L)
    public static SubLObject do_all_genl_predicates_and_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list348);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_predicate_var = (SubLObject)sbhl_macros.NIL;
        SubLObject inverse_mode_p = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list348);
        genl_predicate_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list348);
        inverse_mode_p = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list348);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list348);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list348);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list348);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym349$DO_ALL_MODE_FORWARD_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.list(genl_predicate_var, inverse_mode_p, (SubLObject)sbhl_macros.$list341, pred, mt, tv, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list348);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 50031L)
    public static SubLObject do_all_spec_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list350);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_predicate_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list350);
        spec_predicate_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list350);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list350);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list350);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list350);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list350);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.list(spec_predicate_var, (SubLObject)sbhl_macros.$list341, pred, mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list350);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 50385L)
    public static SubLObject do_all_spec_predicates_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list352);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_predicate_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list352);
        spec_predicate_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list352);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list352);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list352);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list352);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.listS(spec_predicate_var, new SubLObject[] { sbhl_macros.$list341, pred, mt, tv, done_var, sbhl_macros.$list225 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list352);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 50723L)
    public static SubLObject do_all_spec_predicates_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list352);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_predicate_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list352);
        spec_predicate_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list352);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list352);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list352);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list352);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.listS(spec_predicate_var, new SubLObject[] { sbhl_macros.$list341, pred, mt, tv, done_var, sbhl_macros.$list195 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list352);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 51067L)
    public static SubLObject do_all_spec_predicates_and_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list353);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_var = (SubLObject)sbhl_macros.NIL;
        SubLObject inverse_mode_p = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list353);
        spec_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list353);
        inverse_mode_p = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list353);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list353);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list353);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list353);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym354$DO_ALL_MODE_BACKWARD_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.list(spec_var, inverse_mode_p, (SubLObject)sbhl_macros.$list341, pred, mt, tv, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list353);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 51381L)
    public static SubLObject do_all_proper_genl_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list345);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_predicate_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list345);
        genl_predicate_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list345);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list345);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list345);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list345);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list345);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym81$CSOME, (SubLObject)ConsesLow.list(genl_predicate_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym355$ALL_PROPER_GENL_PREDICATES, pred, mt, tv), done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list345);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 52121L)
    public static SubLObject do_all_proper_genl_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list356);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_inverse_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list356);
        genl_inverse_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list356);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list356);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list356);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list356);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list356);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym81$CSOME, (SubLObject)ConsesLow.list(genl_inverse_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym357$ALL_PROPER_GENL_INVERSES, pred, mt, tv), done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list356);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 52826L)
    public static SubLObject do_true_genl_inverse_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list358);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_inverse_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list358);
        genl_inverse_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list358);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list358);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list358);
        pred = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list358);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, (SubLObject)ConsesLow.list(genl_inverse_var, tv_var, mt_var, pred, (SubLObject)sbhl_macros.$list359, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list358);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 53190L)
    public static SubLObject do_relevant_genl_inverse_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list360);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_inverse_links_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list360);
        genl_inverse_links_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list360);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list360);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list360);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list360);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym258$DO_RELEVANT_FORWARD_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(genl_inverse_links_var, pred, mt, tv, (SubLObject)sbhl_macros.$list359, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list360);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 53503L)
    public static SubLObject do_true_spec_inverse_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list361);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_inverse_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list361);
        spec_inverse_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list361);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list361);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list361);
        pred = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list361);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, (SubLObject)ConsesLow.list(spec_inverse_var, tv_var, mt_var, pred, (SubLObject)sbhl_macros.$list359, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list361);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 53842L)
    public static SubLObject do_relevant_spec_inverse_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list362);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_inverse_links_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list362);
        spec_inverse_links_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list362);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list362);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list362);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list362);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym273$DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(spec_inverse_links_var, pred, mt, tv, (SubLObject)sbhl_macros.$list359, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list362);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 54157L)
    public static SubLObject do_all_genl_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list356);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_inverse_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list356);
        genl_inverse_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list356);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list356);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list356);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list356);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list356);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.list(genl_inverse_var, (SubLObject)sbhl_macros.$list359, pred, mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list356);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 54504L)
    public static SubLObject do_all_genl_inverses_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list363);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_inverse_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list363);
        genl_inverse_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list363);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list363);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list363);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list363);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.listS(genl_inverse_var, new SubLObject[] { sbhl_macros.$list359, pred, mt, tv, done_var, sbhl_macros.$list225 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list363);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 54836L)
    public static SubLObject do_all_genl_inverses_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list363);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_inverse_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list363);
        genl_inverse_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list363);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list363);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list363);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list363);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.listS(genl_inverse_var, new SubLObject[] { sbhl_macros.$list359, pred, mt, tv, done_var, sbhl_macros.$list195 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list363);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 55174L)
    public static SubLObject do_all_spec_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list364);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_inverse_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list364);
        spec_inverse_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list364);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list364);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list364);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list364);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list364);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.list(spec_inverse_var, (SubLObject)sbhl_macros.$list359, pred, mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list364);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 55522L)
    public static SubLObject do_all_spec_inverses_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list365);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_inverse_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list365);
        spec_inverse_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list365);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list365);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list365);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list365);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.listS(spec_inverse_var, new SubLObject[] { sbhl_macros.$list359, pred, mt, tv, done_var, sbhl_macros.$list225 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list365);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 55856L)
    public static SubLObject do_all_spec_inverses_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list365);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_inverse_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list365);
        spec_inverse_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list365);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list365);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list365);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list365);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, (SubLObject)ConsesLow.listS(spec_inverse_var, new SubLObject[] { sbhl_macros.$list359, pred, mt, tv, done_var, sbhl_macros.$list195 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list365);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 56196L)
    public static SubLObject do_all_genl_preds_and_inverses_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list366);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred_var = (SubLObject)sbhl_macros.NIL;
        SubLObject inverse_mode_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list366);
        pred_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list366);
        inverse_mode_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list366);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list366);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list366);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list366);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym367$DO_ALL_PREDS_AND_INVERSES, (SubLObject)ConsesLow.listS(pred_var, new SubLObject[] { inverse_mode_var, pred, sbhl_macros.$list215, mt, tv, done_var, sbhl_macros.$list195 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list366);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 56499L)
    public static SubLObject do_all_genl_preds_and_inverses_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list366);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred_var = (SubLObject)sbhl_macros.NIL;
        SubLObject inverse_mode_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list366);
        pred_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list366);
        inverse_mode_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list366);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list366);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list366);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list366);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym367$DO_ALL_PREDS_AND_INVERSES, (SubLObject)ConsesLow.listS(pred_var, new SubLObject[] { inverse_mode_var, pred, sbhl_macros.$list215, mt, tv, done_var, sbhl_macros.$list225 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list366);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 56770L)
    public static SubLObject do_all_preds_and_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list368);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred_var = (SubLObject)sbhl_macros.NIL;
        SubLObject inverse_mode_var = (SubLObject)sbhl_macros.NIL;
        SubLObject pred = (SubLObject)sbhl_macros.NIL;
        SubLObject direction = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list368);
        pred_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list368);
        inverse_mode_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list368);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list368);
        direction = current.first();
        current = current.rest();
        final SubLObject mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list368);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list368);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list368);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list368);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject module = (SubLObject)sbhl_macros.$sym369$MODULE;
            final SubLObject node_var = (SubLObject)sbhl_macros.$sym370$NODE_VAR;
            final SubLObject node_and_predicate_mode = (SubLObject)sbhl_macros.$sym371$NODE_AND_PREDICATE_MODE;
            final SubLObject predicate_mode = (SubLObject)sbhl_macros.$sym372$PREDICATE_MODE;
            final SubLObject deck_type = (SubLObject)sbhl_macros.$sym373$DECK_TYPE;
            final SubLObject recur_deck = (SubLObject)sbhl_macros.$sym374$RECUR_DECK;
            final SubLObject node_vars_link_node = (SubLObject)sbhl_macros.$sym375$NODE_VARS_LINK_NODE;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym128$PUNLESS, done_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(module, (SubLObject)sbhl_macros.$list376), (SubLObject)ConsesLow.list(node_var, pred), (SubLObject)ConsesLow.list(deck_type, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym194$FIF, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.EQ, search_type, (SubLObject)sbhl_macros.$list225), (SubLObject)sbhl_macros.$list226)), (SubLObject)ConsesLow.list(recur_deck, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym197$CREATE_DECK, deck_type)), node_and_predicate_mode), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym198$WITH_NEW_SBHL_SPACE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym199$POSSIBLY_WITH_SBHL_TRUE_TV, tv, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym200$WITH_SBHL_SEARCH_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym201$WITH_SBHL_TYPE_TEST, pred, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym202$WITH_SBHL_SEARCH_DIRECTION, direction, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym203$WITH_SBHL_LINK_DIRECTION, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym204$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, direction, module), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym205$SBHL_MARK_NODE_MARKED, node_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym169$CSETQ, node_and_predicate_mode, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym90$LIST, pred, (SubLObject)sbhl_macros.$list227)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym206$WHILE, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym184$CAND, node_and_predicate_mode, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym207$CNOT, done_var)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(node_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym228$FIRST, node_and_predicate_mode)), (SubLObject)ConsesLow.list(predicate_mode, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym229$SECOND, node_and_predicate_mode)), (SubLObject)ConsesLow.list(pred_var, node_var)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym230$WITH_SBHL_PREDICATE_MODE, predicate_mode, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(inverse_mode_var, predicate_mode)), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym208$DO_ACCESSIBLE_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(node_vars_link_node, node_var, (SubLObject)sbhl_macros.$list209, module, done_var), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym128$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym210$SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym205$SBHL_MARK_NODE_MARKED, node_vars_link_node), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym211$DECK_PUSH, (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym90$LIST, node_vars_link_node, (SubLObject)sbhl_macros.$list227), recur_deck))))), (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym169$CSETQ, node_and_predicate_mode, (SubLObject)ConsesLow.list((SubLObject)sbhl_macros.$sym212$DECK_POP, recur_deck)))))))))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list368);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 58490L)
    public static SubLObject do_true_genl_mt_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list377);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list377);
        genl_mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list377);
        mt_mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list377);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list377);
        mt_node = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list377);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, (SubLObject)ConsesLow.list(genl_mt_var, tv_var, mt_mt_var, mt_node, (SubLObject)sbhl_macros.$list378, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list377);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 58920L)
    public static SubLObject do_relevant_genl_mt_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list379);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_mt_links_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list379);
        genl_mt_links_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list379);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list379);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list379);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list379);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym258$DO_RELEVANT_FORWARD_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(genl_mt_links_var, mt_node, mt_mt, tv, (SubLObject)sbhl_macros.$list378, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list379);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 59225L)
    public static SubLObject do_true_spec_mt_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list380);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject tv_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list380);
        spec_mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list380);
        mt_mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list380);
        tv_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list380);
        mt_node = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list380);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, (SubLObject)ConsesLow.list(spec_mt_var, tv_var, mt_mt_var, mt_node, (SubLObject)sbhl_macros.$list378, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list380);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 59551L)
    public static SubLObject do_relevant_spec_mt_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list381);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_mt_links_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list381);
        spec_mt_links_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list381);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list381);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list381);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list381);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym273$DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, (SubLObject)ConsesLow.list(spec_mt_links_var, mt_node, mt_mt, tv, (SubLObject)sbhl_macros.$list378, done_var), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list381);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 59858L)
    public static SubLObject do_all_genl_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list382);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list382);
        genl_mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list382);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list382);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list382);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list382);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list382);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, (SubLObject)ConsesLow.list(genl_mt_var, (SubLObject)sbhl_macros.$list378, mt_node, mt_mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list382);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 60178L)
    public static SubLObject do_all_genl_mts_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list383);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list383);
        genl_mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list383);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list383);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list383);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list383);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, (SubLObject)ConsesLow.listS(genl_mt_var, new SubLObject[] { sbhl_macros.$list378, mt_node, mt_mt, tv, done_var, sbhl_macros.$list225 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list383);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 60489L)
    public static SubLObject do_all_genl_mts_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list383);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list383);
        genl_mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list383);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list383);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list383);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list383);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, (SubLObject)ConsesLow.listS(genl_mt_var, new SubLObject[] { sbhl_macros.$list378, mt_node, mt_mt, tv, done_var, sbhl_macros.$list195 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list383);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 60806L)
    public static SubLObject do_all_spec_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list384);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list384);
        spec_mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list384);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list384);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list384);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list384);
        current = current.rest();
        final SubLObject search_type = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list384);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, (SubLObject)ConsesLow.list(spec_mt_var, (SubLObject)sbhl_macros.$list378, mt_node, mt_mt, tv, done_var, search_type), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list384);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 61128L)
    public static SubLObject do_all_spec_mts_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list385);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list385);
        spec_mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list385);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list385);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list385);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list385);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, (SubLObject)ConsesLow.listS(spec_mt_var, new SubLObject[] { sbhl_macros.$list378, mt_node, mt_mt, tv, done_var, sbhl_macros.$list225 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list385);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 61441L)
    public static SubLObject do_all_spec_mts_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list385);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_mt_var = (SubLObject)sbhl_macros.NIL;
        SubLObject mt_node = (SubLObject)sbhl_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list385);
        spec_mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_macros.$list385);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list385);
        current = current.rest();
        final SubLObject tv = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list385);
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_macros.$list385);
        current = current.rest();
        if (sbhl_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_macros.$sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, (SubLObject)ConsesLow.listS(spec_mt_var, new SubLObject[] { sbhl_macros.$list378, mt_node, mt_mt, tv, done_var, sbhl_macros.$list195 }), ConsesLow.append(body, (SubLObject)sbhl_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_macros.$list385);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    public static SubLObject declare_sbhl_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_sbhl_link_nodes", "DO-SBHL-LINK-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_sbhl_tv_links", "DO-SBHL-TV-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_sbhl_mt_link", "DO-SBHL-MT-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_sbhl_mt_links", "DO-SBHL-MT-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_sbhl_direction_link", "DO-SBHL-DIRECTION-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_sbhl_graph_link", "DO-SBHL-GRAPH-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_sbhl_forward_true_link_mts", "DO-SBHL-FORWARD-TRUE-LINK-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_sbhl_forward_true_link_nodes_and_mts", "DO-SBHL-FORWARD-TRUE-LINK-NODES-AND-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_sbhl_tv_links", "DO-ALL-SBHL-TV-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_sbhl_link_nodes", "DO-ALL-SBHL-LINK-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_sbhl_forward_true_link_nodes", "DO-ALL-SBHL-FORWARD-TRUE-LINK-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_sbhl_backward_true_link_nodes", "DO-ALL-SBHL-BACKWARD-TRUE-LINK-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "with_sbhl_graph_link", "WITH-SBHL-GRAPH-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "with_relevant_sbhl_link_nodes", "WITH-RELEVANT-SBHL-LINK-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "with_relevant_sbhl_link_nodes_and_non_forts", "WITH-RELEVANT-SBHL-LINK-NODES-AND-NON-FORTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "with_relevant_sbhl_fort_link_nodes", "WITH-RELEVANT-SBHL-FORT-LINK-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_non_fort_direct_instance_links", "DO-NON-FORT-DIRECT-INSTANCE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "with_sbhl_non_fort_links", "WITH-SBHL-NON-FORT-LINKS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_sbhl_non_fort_linksP", "DO-SBHL-NON-FORT-LINKS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "collection_supports_non_fort_instancesP", "COLLECTION-SUPPORTS-NON-FORT-INSTANCES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "admissible_non_fort_link_nodeP", "ADMISSIBLE-NON-FORT-LINK-NODE?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_sbhl_naut_generated_links", "DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_forward_sbhl_link_nodes", "DO-RELEVANT-FORWARD-SBHL-LINK-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_backward_sbhl_link_nodes", "DO-RELEVANT-BACKWARD-SBHL-LINK-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "with_accessible_sbhl_link_nodes", "WITH-ACCESSIBLE-SBHL-LINK-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "with_accessible_sbhl_link_nodes_and_non_forts", "WITH-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_accessible_sbhl_link_nodes", "DO-ACCESSIBLE-SBHL-LINK-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_accessible_sbhl_link_nodes_and_non_forts", "DO-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_accessible_sbhl_link_node_search_states", "DO-ACCESSIBLE-SBHL-LINK-NODE-SEARCH-STATES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_accessible_sbhl_tv_links", "DO-ACCESSIBLE-SBHL-TV-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_sbhl_link_nodes", "DO-RELEVANT-SBHL-LINK-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_sbhl_forward_link_nodes", "DO-RELEVANT-SBHL-FORWARD-LINK-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_sbhl_backward_link_nodes", "DO-RELEVANT-SBHL-BACKWARD-LINK-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_sbhl_predicates", "DO-SBHL-PREDICATES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_sbhl_non_time_predicates", "DO-SBHL-NON-TIME-PREDICATES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_sbhl_non_time_modules", "DO-SBHL-NON-TIME-MODULES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_sbhl_graphs", "DO-SBHL-GRAPHS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "with_forward_sbhl_link_direction", "WITH-FORWARD-SBHL-LINK-DIRECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "with_backward_sbhl_link_direction", "WITH-BACKWARD-SBHL-LINK-DIRECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "with_sbhl_type_test", "WITH-SBHL-TYPE-TEST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_sbhl_module_graph", "DO-SBHL-MODULE-GRAPH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_with_relevant_sbhl_modules", "DO-WITH-RELEVANT-SBHL-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "get_sbhl_accessible_modules", "GET-SBHL-ACCESSIBLE-MODULES", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_sbhl_directions", "DO-RELEVANT-SBHL-DIRECTIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "bind_sbhl_search_behavior", "BIND-SBHL-SEARCH-BEHAVIOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "bind_sbhl_boolean_goal_fn", "BIND-SBHL-BOOLEAN-GOAL-FN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "sbhl_possibly_rebind_temporal_search_state", "SBHL-POSSIBLY-REBIND-TEMPORAL-SEARCH-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "bind_sbhl_sample_leaf_search_behavior", "BIND-SBHL-SAMPLE-LEAF-SEARCH-BEHAVIOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_simple_true_links", "DO-ALL-SIMPLE-TRUE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_simple_forward_true_links", "DO-ALL-SIMPLE-FORWARD-TRUE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_simple_backward_true_links", "DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_simple_true_links_for_inverses", "DO-ALL-SIMPLE-TRUE-LINKS-FOR-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_simple_forward_true_links_for_inverses", "DO-ALL-SIMPLE-FORWARD-TRUE-LINKS-FOR-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_simple_backward_true_links_for_inverses", "DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS-FOR-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_mode_true_links_for_inverses", "DO-ALL-MODE-TRUE-LINKS-FOR-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_mode_backward_true_links_for_inverses", "DO-ALL-MODE-BACKWARD-TRUE-LINKS-FOR-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_mode_forward_true_links_for_inverses", "DO-ALL-MODE-FORWARD-TRUE-LINKS-FOR-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_forward_true_links_for_tt", "DO-ALL-FORWARD-TRUE-LINKS-FOR-TT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_backward_true_links_for_tt", "DO-ALL-BACKWARD-TRUE-LINKS-FOR-TT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_true_isa_links", "DO-TRUE-ISA-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_isa_links", "DO-RELEVANT-ISA-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_local_isas", "DO-LOCAL-ISAS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "some_relevant_isa", "SOME-RELEVANT-ISA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_true_instance_links", "DO-TRUE-INSTANCE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_instance_links", "DO-RELEVANT-INSTANCE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_local_instances", "DO-LOCAL-INSTANCES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_true_quoted_isa_links", "DO-TRUE-QUOTED-ISA-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_local_quoted_isas", "DO-LOCAL-QUOTED-ISAS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_true_quoted_instance_links", "DO-TRUE-QUOTED-INSTANCE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_local_quoted_instances", "DO-LOCAL-QUOTED-INSTANCES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_isa", "DO-ALL-ISA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_isa_depth", "DO-ALL-ISA-DEPTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_isa_breadth", "DO-ALL-ISA-BREADTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_isas_by_generality", "DO-ALL-ISAS-BY-GENERALITY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_instances", "DO-ALL-INSTANCES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_instances_depth", "DO-ALL-INSTANCES-DEPTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_instances_breadth", "DO-ALL-INSTANCES-BREADTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_fort_instances", "DO-ALL-FORT-INSTANCES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_instances_of_all", "DO-ALL-INSTANCES-OF-ALL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_quoted_instances", "DO-ALL-QUOTED-INSTANCES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_fort_quoted_instances", "DO-ALL-FORT-QUOTED-INSTANCES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_quoted_instances_of_all", "DO-ALL-QUOTED-INSTANCES-OF-ALL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_true_genls_links", "DO-TRUE-GENLS-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_genls_links", "DO-RELEVANT-GENLS-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_genls", "DO-GENLS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_local_genls", "DO-LOCAL-GENLS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_true_spec_links", "DO-TRUE-SPEC-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_spec_links", "DO-RELEVANT-SPEC-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_local_specs", "DO-LOCAL-SPECS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genls", "DO-ALL-GENLS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genls_depth", "DO-ALL-GENLS-DEPTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genls_breadth", "DO-ALL-GENLS-BREADTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genls_by_generality", "DO-ALL-GENLS-BY-GENERALITY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_specs", "DO-ALL-SPECS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_specs_depth", "DO-ALL-SPECS-DEPTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_specs_breadth", "DO-ALL-SPECS-BREADTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_specs_by_generality", "DO-ALL-SPECS-BY-GENERALITY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_true_genl_predicate_links", "DO-TRUE-GENL-PREDICATE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_genl_predicate_links", "DO-RELEVANT-GENL-PREDICATE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_true_spec_predicate_links", "DO-TRUE-SPEC-PREDICATE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_spec_predicate_links", "DO-RELEVANT-SPEC-PREDICATE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genl_predicates", "DO-ALL-GENL-PREDICATES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genl_predicates_depth", "DO-ALL-GENL-PREDICATES-DEPTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genl_predicates_breadth", "DO-ALL-GENL-PREDICATES-BREADTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genl_predicates_and_inverses", "DO-ALL-GENL-PREDICATES-AND-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_spec_predicates", "DO-ALL-SPEC-PREDICATES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_spec_predicates_depth", "DO-ALL-SPEC-PREDICATES-DEPTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_spec_predicates_breadth", "DO-ALL-SPEC-PREDICATES-BREADTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_spec_predicates_and_inverses", "DO-ALL-SPEC-PREDICATES-AND-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_proper_genl_predicates", "DO-ALL-PROPER-GENL-PREDICATES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_proper_genl_inverses", "DO-ALL-PROPER-GENL-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_true_genl_inverse_links", "DO-TRUE-GENL-INVERSE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_genl_inverse_links", "DO-RELEVANT-GENL-INVERSE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_true_spec_inverse_links", "DO-TRUE-SPEC-INVERSE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_spec_inverse_links", "DO-RELEVANT-SPEC-INVERSE-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genl_inverses", "DO-ALL-GENL-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genl_inverses_depth", "DO-ALL-GENL-INVERSES-DEPTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genl_inverses_breadth", "DO-ALL-GENL-INVERSES-BREADTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_spec_inverses", "DO-ALL-SPEC-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_spec_inverses_depth", "DO-ALL-SPEC-INVERSES-DEPTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_spec_inverses_breadth", "DO-ALL-SPEC-INVERSES-BREADTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genl_preds_and_inverses_breadth", "DO-ALL-GENL-PREDS-AND-INVERSES-BREADTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genl_preds_and_inverses_depth", "DO-ALL-GENL-PREDS-AND-INVERSES-DEPTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_preds_and_inverses", "DO-ALL-PREDS-AND-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_true_genl_mt_links", "DO-TRUE-GENL-MT-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_genl_mt_links", "DO-RELEVANT-GENL-MT-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_true_spec_mt_links", "DO-TRUE-SPEC-MT-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_relevant_spec_mt_links", "DO-RELEVANT-SPEC-MT-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genl_mts", "DO-ALL-GENL-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genl_mts_depth", "DO-ALL-GENL-MTS-DEPTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_genl_mts_breadth", "DO-ALL-GENL-MTS-BREADTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_spec_mts", "DO-ALL-SPEC-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_spec_mts_depth", "DO-ALL-SPEC-MTS-DEPTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_macros", "do_all_spec_mts_breadth", "DO-ALL-SPEC-MTS-BREADTH");
        return (SubLObject)sbhl_macros.NIL;
    }
    
    public static SubLObject init_sbhl_macros_file() {
        return (SubLObject)sbhl_macros.NIL;
    }
    
    public static SubLObject setup_sbhl_macros_file() {
        access_macros.register_macro_helper((SubLObject)sbhl_macros.$sym88$DO_SBHL_NON_FORT_LINKS_, (SubLObject)sbhl_macros.$sym91$DO_SBHL_NON_FORT_LINKS);
        access_macros.register_macro_helper((SubLObject)sbhl_macros.$sym93$ADMISSIBLE_NON_FORT_LINK_NODE_, (SubLObject)sbhl_macros.$sym91$DO_SBHL_NON_FORT_LINKS);
        access_macros.register_macro_helper((SubLObject)sbhl_macros.$sym152$GET_SBHL_ACCESSIBLE_MODULES, (SubLObject)sbhl_macros.$sym105$DO_WITH_RELEVANT_SBHL_MODULES);
        utilities_macros.register_cyc_api_macro((SubLObject)sbhl_macros.$sym298$DO_ALL_INSTANCES, (SubLObject)sbhl_macros.$list296, (SubLObject)sbhl_macros.$str299$Iterator___see_do_all_simple_back);
        utilities_macros.register_cyc_api_macro((SubLObject)sbhl_macros.$sym302$DO_ALL_FORT_INSTANCES, (SubLObject)sbhl_macros.$list296, (SubLObject)sbhl_macros.$str303$Like__xref_do_all_instances_excep);
        utilities_macros.register_cyc_api_macro((SubLObject)sbhl_macros.$sym308$DO_ALL_QUOTED_INSTANCES, (SubLObject)sbhl_macros.$list296, (SubLObject)sbhl_macros.$str299$Iterator___see_do_all_simple_back);
        utilities_macros.register_cyc_api_macro((SubLObject)sbhl_macros.$sym309$DO_ALL_FORT_QUOTED_INSTANCES, (SubLObject)sbhl_macros.$list296, (SubLObject)sbhl_macros.$str303$Like__xref_do_all_instances_excep);
        return (SubLObject)sbhl_macros.NIL;
    }
    
    public void declareFunctions() {
        declare_sbhl_macros_file();
    }
    
    public void initializeVariables() {
        init_sbhl_macros_file();
    }
    
    public void runTopLevelForms() {
        setup_sbhl_macros_file();
    }
    
    static {
        me = (SubLFile)new sbhl_macros();
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("TV-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$LINK_NODES = SubLObjectFactory.makeUninternedSymbol("LINK-NODES");
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym3$GET_SBHL_LINK_NODES = SubLObjectFactory.makeSymbol("GET-SBHL-LINK-NODES");
        $sym4$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym5$DO_SET_OR_LIST = SubLObjectFactory.makeSymbol("DO-SET-OR-LIST");
        $kw6$DONE = SubLObjectFactory.makeKeyword("DONE");
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-NODES-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym8$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-NODES-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("MT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym10$TV_LINKS = SubLObjectFactory.makeUninternedSymbol("TV-LINKS");
        $sym11$GET_SBHL_TV_LINKS = SubLObjectFactory.makeSymbol("GET-SBHL-TV-LINKS");
        $sym12$DO_SBHL_TV_LINKS = SubLObjectFactory.makeSymbol("DO-SBHL-TV-LINKS");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-LINKS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-LINKS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("D-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym15$MT_LINKS = SubLObjectFactory.makeUninternedSymbol("MT-LINKS");
        $sym16$GET_SBHL_MT_LINKS = SubLObjectFactory.makeSymbol("GET-SBHL-MT-LINKS");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-LINKS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym18$D_LINK = SubLObjectFactory.makeUninternedSymbol("D-LINK");
        $sym19$GET_SBHL_GRAPH_LINK = SubLObjectFactory.makeSymbol("GET-SBHL-GRAPH-LINK");
        $sym20$DO_RELEVANT_SBHL_DIRECTIONS = SubLObjectFactory.makeSymbol("DO-RELEVANT-SBHL-DIRECTIONS");
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym22$DIRECTION = SubLObjectFactory.makeUninternedSymbol("DIRECTION");
        $sym23$MT_LINKS = SubLObjectFactory.makeUninternedSymbol("MT-LINKS");
        $sym24$TV_LINKS = SubLObjectFactory.makeUninternedSymbol("TV-LINKS");
        $sym25$POSSIBLY_WITH_SBHL_MODULE = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-SBHL-MODULE");
        $sym26$WITH_SBHL_FORWARD_LINK_DIRECTION_FOR_MODULE = SubLObjectFactory.makeSymbol("WITH-SBHL-FORWARD-LINK-DIRECTION-FOR-MODULE");
        $sym27$DO_SBHL_GRAPH_LINK = SubLObjectFactory.makeSymbol("DO-SBHL-GRAPH-LINK");
        $sym28$SBHL_FORWARD_DIRECTION_FOR_MODULE_P = SubLObjectFactory.makeSymbol("SBHL-FORWARD-DIRECTION-FOR-MODULE-P");
        $sym29$DO_SBHL_MT_LINKS = SubLObjectFactory.makeSymbol("DO-SBHL-MT-LINKS");
        $sym30$ANY_SBHL_TRUE_LINK_NODES_P = SubLObjectFactory.makeSymbol("ANY-SBHL-TRUE-LINK-NODES-P");
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym32$DIRECTION = SubLObjectFactory.makeUninternedSymbol("DIRECTION");
        $sym33$MT_LINKS = SubLObjectFactory.makeUninternedSymbol("MT-LINKS");
        $sym34$TV_LINKS = SubLObjectFactory.makeUninternedSymbol("TV-LINKS");
        $sym35$TV = SubLObjectFactory.makeUninternedSymbol("TV");
        $sym36$LINK_NODES = SubLObjectFactory.makeUninternedSymbol("LINK-NODES");
        $sym37$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-NODES-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym39$MT_LINKS = SubLObjectFactory.makeUninternedSymbol("MT-LINKS");
        $sym40$TV_LINKS = SubLObjectFactory.makeUninternedSymbol("TV-LINKS");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym42$LINK_NODES_VAR = SubLObjectFactory.makeUninternedSymbol("LINK-NODES-VAR");
        $sym43$DO_ALL_SBHL_TV_LINKS = SubLObjectFactory.makeSymbol("DO-ALL-SBHL-TV-LINKS");
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym45$LINK_NODES_VAR = SubLObjectFactory.makeUninternedSymbol("LINK-NODES-VAR");
        $sym46$DIRECTION = SubLObjectFactory.makeUninternedSymbol("DIRECTION");
        $sym47$MT_LINKS = SubLObjectFactory.makeUninternedSymbol("MT-LINKS");
        $sym48$TV_LINKS = SubLObjectFactory.makeUninternedSymbol("TV-LINKS");
        $sym49$GET_SBHL_MODULE_FORWARD_DIRECTION = SubLObjectFactory.makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION");
        $sym50$LINK_NODES_VAR = SubLObjectFactory.makeUninternedSymbol("LINK-NODES-VAR");
        $sym51$DIRECTION = SubLObjectFactory.makeUninternedSymbol("DIRECTION");
        $sym52$MT_LINKS = SubLObjectFactory.makeUninternedSymbol("MT-LINKS");
        $sym53$TV_LINKS = SubLObjectFactory.makeUninternedSymbol("TV-LINKS");
        $sym54$GET_SBHL_MODULE_BACKWARD_DIRECTION = SubLObjectFactory.makeSymbol("GET-SBHL-MODULE-BACKWARD-DIRECTION");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D-LINK-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym56$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-ERROR"), (SubLObject)sbhl_macros.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.")));
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODES-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("START-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym59$NODE = SubLObjectFactory.makeUninternedSymbol("NODE");
        $sym60$NAUT_TO_NART = SubLObjectFactory.makeSymbol("NAUT-TO-NART");
        $sym61$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym62$SBHL_NODE_OBJECT_P = SubLObjectFactory.makeSymbol("SBHL-NODE-OBJECT-P");
        $sym63$WITH_RELEVANT_SBHL_FORT_LINK_NODES = SubLObjectFactory.makeSymbol("WITH-RELEVANT-SBHL-FORT-LINK-NODES");
        $sym64$CNAT_P = SubLObjectFactory.makeSymbol("CNAT-P");
        $sym65$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS = SubLObjectFactory.makeSymbol("DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS");
        $sym66$NODE = SubLObjectFactory.makeUninternedSymbol("NODE");
        $sym67$WITH_SBHL_NON_FORT_LINKS = SubLObjectFactory.makeSymbol("WITH-SBHL-NON-FORT-LINKS");
        $list68 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODES-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym69$D_LINK = SubLObjectFactory.makeUninternedSymbol("D-LINK");
        $sym70$MT = SubLObjectFactory.makeUninternedSymbol("MT");
        $sym71$TV_LINKS = SubLObjectFactory.makeUninternedSymbol("TV-LINKS");
        $sym72$TV = SubLObjectFactory.makeUninternedSymbol("TV");
        $sym73$WITH_SBHL_GRAPH_LINK = SubLObjectFactory.makeSymbol("WITH-SBHL-GRAPH-LINK");
        $sym74$DO_SBHL_DIRECTION_LINK = SubLObjectFactory.makeSymbol("DO-SBHL-DIRECTION-LINK");
        $sym75$RELEVANT_MT_ = SubLObjectFactory.makeSymbol("RELEVANT-MT?");
        $sym76$_SBHL_LINK_MT_ = SubLObjectFactory.makeSymbol("*SBHL-LINK-MT*");
        $sym77$RELEVANT_SBHL_TV_ = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV?");
        $sym78$_SBHL_LINK_TV_ = SubLObjectFactory.makeSymbol("*SBHL-LINK-TV*");
        $list79 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym80$INSTANCE_TUPLE = SubLObjectFactory.makeUninternedSymbol("INSTANCE-TUPLE");
        $sym81$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym82$NON_FORT_INSTANCE_TABLE_LOOKUP = SubLObjectFactory.makeSymbol("NON-FORT-INSTANCE-TABLE-LOOKUP");
        $sym83$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $list84 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODES-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym85$LINK_NODE = SubLObjectFactory.makeUninternedSymbol("LINK-NODE");
        $sym86$MT = SubLObjectFactory.makeUninternedSymbol("MT");
        $sym87$TV = SubLObjectFactory.makeUninternedSymbol("TV");
        $sym88$DO_SBHL_NON_FORT_LINKS_ = SubLObjectFactory.makeSymbol("DO-SBHL-NON-FORT-LINKS?");
        $sym89$DO_NON_FORT_DIRECT_INSTANCE_LINKS = SubLObjectFactory.makeSymbol("DO-NON-FORT-DIRECT-INSTANCE-LINKS");
        $sym90$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym91$DO_SBHL_NON_FORT_LINKS = SubLObjectFactory.makeSymbol("DO-SBHL-NON-FORT-LINKS");
        $const92$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym93$ADMISSIBLE_NON_FORT_LINK_NODE_ = SubLObjectFactory.makeSymbol("ADMISSIBLE-NON-FORT-LINK-NODE?");
        $list94 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODES-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym95$GENERATING_FN = SubLObjectFactory.makeUninternedSymbol("GENERATING-FN");
        $sym96$SBHL_CSOME = SubLObjectFactory.makeSymbol("SBHL-CSOME");
        $sym97$GET_SBHL_MODULE_RELEVANT_NAUT_LINK_GENERATORS = SubLObjectFactory.makeSymbol("GET-SBHL-MODULE-RELEVANT-NAUT-LINK-GENERATORS");
        $sym98$_SBHL_TV_ = SubLObjectFactory.makeSymbol("*SBHL-TV*");
        $sym99$_SBHL_LINK_GENERATOR_ = SubLObjectFactory.makeSymbol("*SBHL-LINK-GENERATOR*");
        $sym100$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
        $list101 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODES-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym102$POSSIBLY_WITH_SBHL_MT_RELEVANCE = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-SBHL-MT-RELEVANCE");
        $sym103$POSSIBLY_WITH_SBHL_TV = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-SBHL-TV");
        $sym104$WITH_RELEVANT_SBHL_LINK_NODES = SubLObjectFactory.makeSymbol("WITH-RELEVANT-SBHL-LINK-NODES");
        $sym105$DO_WITH_RELEVANT_SBHL_MODULES = SubLObjectFactory.makeSymbol("DO-WITH-RELEVANT-SBHL-MODULES");
        $sym106$POSSIBLY_FLIP_GENL_INVERSE_MODE = SubLObjectFactory.makeSymbol("POSSIBLY-FLIP-GENL-INVERSE-MODE");
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE"));
        $sym108$WITH_RELEVANT_SBHL_LINK_NODES_AND_NON_FORTS = SubLObjectFactory.makeSymbol("WITH-RELEVANT-SBHL-LINK-NODES-AND-NON-FORTS");
        $list109 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym110$LINK_NODES = SubLObjectFactory.makeUninternedSymbol("LINK-NODES");
        $sym111$WITH_ACCESSIBLE_SBHL_LINK_NODES = SubLObjectFactory.makeSymbol("WITH-ACCESSIBLE-SBHL-LINK-NODES");
        $sym112$LINK_NODES = SubLObjectFactory.makeUninternedSymbol("LINK-NODES");
        $sym113$WITH_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS = SubLObjectFactory.makeSymbol("WITH-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS");
        $list114 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE-SEARCH-STATE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-SEARCH-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list115 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw116$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $sym117$DO_SBHL_ITERATOR = SubLObjectFactory.makeSymbol("DO-SBHL-ITERATOR");
        $sym118$NEW_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR = SubLObjectFactory.makeSymbol("NEW-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR");
        $list119 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TV-LINKS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym120$LINK_NODES = SubLObjectFactory.makeUninternedSymbol("LINK-NODES");
        $list121 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym122$DO_RELEVANT_SBHL_LINK_NODES = SubLObjectFactory.makeSymbol("DO-RELEVANT-SBHL-LINK-NODES");
        $list123 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym124$SMART_CSOME = SubLObjectFactory.makeSymbol("SMART-CSOME");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-PREDICATES"));
        $sym126$MODULE = SubLObjectFactory.makeUninternedSymbol("MODULE");
        $sym127$DO_SBHL_MODULES = SubLObjectFactory.makeSymbol("DO-SBHL-MODULES");
        $sym128$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym129$SBHL_TIME_MODULE_P = SubLObjectFactory.makeSymbol("SBHL-TIME-MODULE-P");
        $sym130$GET_SBHL_LINK_PRED = SubLObjectFactory.makeSymbol("GET-SBHL-LINK-PRED");
        $list131 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym132$MODULE = SubLObjectFactory.makeUninternedSymbol("MODULE");
        $list133 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("GRAPH-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym134$GET_SBHL_MODULE_GRAPH = SubLObjectFactory.makeSymbol("GET-SBHL-MODULE-GRAPH");
        $list135 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-LINK-DIRECTION*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE")))));
        $list136 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-LINK-DIRECTION*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE-BACKWARD-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE")))));
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym138$COR = SubLObjectFactory.makeSymbol("COR");
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUSPEND-SBHL-TYPE-CHECKING?"));
        $sym140$APPLY_SBHL_MODULE_TYPE_TEST = SubLObjectFactory.makeSymbol("APPLY-SBHL-MODULE-TYPE-TEST");
        $list141 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE")));
        $sym142$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym143$SBHL_WARN = SubLObjectFactory.makeSymbol("SBHL-WARN");
        $str144$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $list145 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-TYPE-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE"))));
        $list146 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym147$DO_SBHL_GRAPH_LINKS = SubLObjectFactory.makeSymbol("DO-SBHL-GRAPH-LINKS");
        $kw148$MODULE = SubLObjectFactory.makeKeyword("MODULE");
        $list149 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym150$MODULE_VAR = SubLObjectFactory.makeUninternedSymbol("MODULE-VAR");
        $sym151$ACCESSIBLE_MODULES = SubLObjectFactory.makeUninternedSymbol("ACCESSIBLE-MODULES");
        $sym152$GET_SBHL_ACCESSIBLE_MODULES = SubLObjectFactory.makeSymbol("GET-SBHL-ACCESSIBLE-MODULES");
        $sym153$WITH_SBHL_MODULE = SubLObjectFactory.makeSymbol("WITH-SBHL-MODULE");
        $sym154$SBHL_MODULE_P = SubLObjectFactory.makeSymbol("SBHL-MODULE-P");
        $sym155$GET_SBHL_MODULE = SubLObjectFactory.makeSymbol("GET-SBHL-MODULE");
        $list156 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym157$GET_RELEVANT_SBHL_DIRECTIONS = SubLObjectFactory.makeSymbol("GET-RELEVANT-SBHL-DIRECTIONS");
        $list158 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SEARCH-BEHAVIOR*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DETERMINE-SBHL-SEARCH-BEHAVIOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-MODULE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-DIRECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-TV")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TERMINATING-MARKING-SPACE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DETERMINE-SBHL-TERMINATING-MARKING-SPACE"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SEARCH-BEHAVIOR*"))));
        $sym159$PREMARKING_ = SubLObjectFactory.makeUninternedSymbol("PREMARKING?");
        $sym160$GOAL_FN = SubLObjectFactory.makeUninternedSymbol("GOAL-FN");
        $sym161$GOAL_NODE = SubLObjectFactory.makeUninternedSymbol("GOAL-NODE");
        $sym162$GOAL_SPACE = SubLObjectFactory.makeUninternedSymbol("GOAL-SPACE");
        $list163 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-MODULE-PREMARKS-GATHER-NODES-P")));
        $list164 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-NODE-IS-GOAL-NODE")));
        $list165 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SPACE*"));
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-TRANSFERS-THROUGH-MODULE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-MODULE")));
        $sym167$POSSIBLY_PREMARK_WITH_GENL_INVERSE_MODE = SubLObjectFactory.makeSymbol("POSSIBLY-PREMARK-WITH-GENL-INVERSE-MODE");
        $sym168$SBHL_PREMARK_GATHER_NODES = SubLObjectFactory.makeSymbol("SBHL-PREMARK-GATHER-NODES");
        $sym169$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list170 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-NODE-MARKED-AS-GOAL-NODE")));
        $list171 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-GATHER-SPACE*"));
        $sym172$RESET_SBHL_SEARCH_PARENT_MARKING = SubLObjectFactory.makeSymbol("RESET-SBHL-SEARCH-PARENT-MARKING");
        $sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE = SubLObjectFactory.makeSymbol("WITH-NEW-SBHL-PREDICATE-MODE-SCOPE");
        $sym174$WITH_SBHL_CONSIDER_NODE_FN = SubLObjectFactory.makeSymbol("WITH-SBHL-CONSIDER-NODE-FN");
        $sym175$WITH_SBHL_GOAL_NODE = SubLObjectFactory.makeSymbol("WITH-SBHL-GOAL-NODE");
        $sym176$WITH_SBHL_GOAL_SPACE = SubLObjectFactory.makeSymbol("WITH-SBHL-GOAL-SPACE");
        $list177 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list178 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SEARCH-PARENT-MARKING*"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SEARCH-PARENT-MARKING*"));
        $sym179$_SBHL_TEMPORALITY_SEARCH_PASSED_THROUGH_DATE__ = SubLObjectFactory.makeSymbol("*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*");
        $sym180$FWHEN = SubLObjectFactory.makeSymbol("FWHEN");
        $list181 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-JUSTIFICATION-SEARCH-P"));
        $sym182$HL_DATE_POINT_P = SubLObjectFactory.makeSymbol("HL-DATE-POINT-P");
        $list183 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*"));
        $sym184$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym185$SBHL_TEMPORALITY_CONSEQUENT_LINKS_SEARCH_PASSED_THROUGH_LINK_P = SubLObjectFactory.makeSymbol("SBHL-TEMPORALITY-CONSEQUENT-LINKS-SEARCH-PASSED-THROUGH-LINK-P");
        $sym186$SBHL_TEMPORAL_FAUX_LINK = SubLObjectFactory.makeSymbol("SBHL-TEMPORAL-FAUX-LINK");
        $list187 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SEARCH-BEHAVIOR*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-TRANSFERS-THROUGH-MODULE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-LEAF-INSTANCES-SWEEP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-SIMPLE-TRUE-SEARCH-AND-UNWIND")))));
        $list188 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), SubLObjectFactory.makeSymbol("MODULE"), SubLObjectFactory.makeSymbol("DIRECTION"), SubLObjectFactory.makeSymbol("NODE"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("TV"), SubLObjectFactory.makeSymbol("DONE-VAR"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("BREADTH")) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw189$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $sym190$NODE_VAR = SubLObjectFactory.makeUninternedSymbol("NODE-VAR");
        $sym191$DECK_TYPE = SubLObjectFactory.makeUninternedSymbol("DECK-TYPE");
        $sym192$RECUR_DECK = SubLObjectFactory.makeUninternedSymbol("RECUR-DECK");
        $sym193$NODE_VARS_LINK_NODE = SubLObjectFactory.makeUninternedSymbol("NODE-VARS-LINK-NODE");
        $sym194$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list195 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BREADTH"));
        $list196 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUEUE"), (SubLObject)SubLObjectFactory.makeKeyword("STACK"));
        $sym197$CREATE_DECK = SubLObjectFactory.makeSymbol("CREATE-DECK");
        $sym198$WITH_NEW_SBHL_SPACE = SubLObjectFactory.makeSymbol("WITH-NEW-SBHL-SPACE");
        $sym199$POSSIBLY_WITH_SBHL_TRUE_TV = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-SBHL-TRUE-TV");
        $sym200$WITH_SBHL_SEARCH_MODULE = SubLObjectFactory.makeSymbol("WITH-SBHL-SEARCH-MODULE");
        $sym201$WITH_SBHL_TYPE_TEST = SubLObjectFactory.makeSymbol("WITH-SBHL-TYPE-TEST");
        $sym202$WITH_SBHL_SEARCH_DIRECTION = SubLObjectFactory.makeSymbol("WITH-SBHL-SEARCH-DIRECTION");
        $sym203$WITH_SBHL_LINK_DIRECTION = SubLObjectFactory.makeSymbol("WITH-SBHL-LINK-DIRECTION");
        $sym204$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION = SubLObjectFactory.makeSymbol("SBHL-SEARCH-DIRECTION-TO-LINK-DIRECTION");
        $sym205$SBHL_MARK_NODE_MARKED = SubLObjectFactory.makeSymbol("SBHL-MARK-NODE-MARKED");
        $sym206$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym207$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym208$DO_ACCESSIBLE_SBHL_LINK_NODES = SubLObjectFactory.makeSymbol("DO-ACCESSIBLE-SBHL-LINK-NODES");
        $list209 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-LINK-DIRECTION"));
        $sym210$SBHL_SEARCH_PATH_TERMINATION_P = SubLObjectFactory.makeSymbol("SBHL-SEARCH-PATH-TERMINATION-P");
        $sym211$DECK_PUSH = SubLObjectFactory.makeSymbol("DECK-PUSH");
        $sym212$DECK_POP = SubLObjectFactory.makeSymbol("DECK-POP");
        $list213 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym214$DO_ALL_SIMPLE_TRUE_LINKS = SubLObjectFactory.makeSymbol("DO-ALL-SIMPLE-TRUE-LINKS");
        $list215 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-FORWARD-SEARCH-DIRECTION"));
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-BACKWARD-SEARCH-DIRECTION"));
        $list217 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), SubLObjectFactory.makeSymbol("MODULE"), SubLObjectFactory.makeSymbol("DIRECTION"), SubLObjectFactory.makeSymbol("NODE"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("TV"), SubLObjectFactory.makeSymbol("DONE-VAR"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DEPTH")) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw218$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $sym219$NODE_VAR = SubLObjectFactory.makeUninternedSymbol("NODE-VAR");
        $sym220$NODE_AND_PREDICATE_MODE = SubLObjectFactory.makeUninternedSymbol("NODE-AND-PREDICATE-MODE");
        $sym221$PREDICATE_MODE = SubLObjectFactory.makeUninternedSymbol("PREDICATE-MODE");
        $sym222$DECK_TYPE = SubLObjectFactory.makeUninternedSymbol("DECK-TYPE");
        $sym223$RECUR_DECK = SubLObjectFactory.makeUninternedSymbol("RECUR-DECK");
        $sym224$NODE_VARS_LINK_NODE = SubLObjectFactory.makeUninternedSymbol("NODE-VARS-LINK-NODE");
        $list225 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEPTH"));
        $list226 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STACK"), (SubLObject)SubLObjectFactory.makeKeyword("QUEUE"));
        $list227 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-INVERSE-MODE-P")));
        $sym228$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym229$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym230$WITH_SBHL_PREDICATE_MODE = SubLObjectFactory.makeSymbol("WITH-SBHL-PREDICATE-MODE");
        $sym231$APPLY_SBHL_ADD_NODE_TEST = SubLObjectFactory.makeSymbol("APPLY-SBHL-ADD-NODE-TEST");
        $list232 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-ADD-NODE-TEST"));
        $sym233$DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES = SubLObjectFactory.makeSymbol("DO-ALL-SIMPLE-TRUE-LINKS-FOR-INVERSES");
        $list234 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), SubLObjectFactory.makeSymbol("MODE-VAR"), SubLObjectFactory.makeSymbol("MODULE"), SubLObjectFactory.makeSymbol("DIRECTION"), SubLObjectFactory.makeSymbol("NODE"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("TV"), SubLObjectFactory.makeSymbol("DONE-VAR"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DEPTH")) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym235$NODE_VAR = SubLObjectFactory.makeUninternedSymbol("NODE-VAR");
        $sym236$NODE_AND_PREDICATE_MODE = SubLObjectFactory.makeUninternedSymbol("NODE-AND-PREDICATE-MODE");
        $sym237$PREDICATE_MODE = SubLObjectFactory.makeUninternedSymbol("PREDICATE-MODE");
        $sym238$DECK_TYPE = SubLObjectFactory.makeUninternedSymbol("DECK-TYPE");
        $sym239$RECUR_DECK = SubLObjectFactory.makeUninternedSymbol("RECUR-DECK");
        $sym240$NODE_VARS_LINK_NODE = SubLObjectFactory.makeUninternedSymbol("NODE-VARS-LINK-NODE");
        $list241 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), SubLObjectFactory.makeSymbol("MODE-VAR"), SubLObjectFactory.makeSymbol("MODULE"), SubLObjectFactory.makeSymbol("NODE"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("TV"), SubLObjectFactory.makeSymbol("DONE-VAR"), SubLObjectFactory.makeSymbol("SEARCH-TYPE") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym242$DO_ALL_MODE_TRUE_LINKS_FOR_INVERSES = SubLObjectFactory.makeSymbol("DO-ALL-MODE-TRUE-LINKS-FOR-INVERSES");
        $sym243$NODE_VAR = SubLObjectFactory.makeUninternedSymbol("NODE-VAR");
        $sym244$DECK_TYPE = SubLObjectFactory.makeUninternedSymbol("DECK-TYPE");
        $sym245$RECUR_DECK = SubLObjectFactory.makeUninternedSymbol("RECUR-DECK");
        $sym246$NODE_VARS_LINK_NODE = SubLObjectFactory.makeUninternedSymbol("NODE-VARS-LINK-NODE");
        $sym247$WITH_SBHL_FORWARD_SEARCH_DIRECTION = SubLObjectFactory.makeSymbol("WITH-SBHL-FORWARD-SEARCH-DIRECTION");
        $sym248$WITH_SBHL_FORWARD_LINK_DIRECTION = SubLObjectFactory.makeSymbol("WITH-SBHL-FORWARD-LINK-DIRECTION");
        $sym249$NODE_VAR = SubLObjectFactory.makeUninternedSymbol("NODE-VAR");
        $sym250$TT_NODE_VAR = SubLObjectFactory.makeUninternedSymbol("TT-NODE-VAR");
        $sym251$WITH_NEW_SBHL_GATHER_SPACE = SubLObjectFactory.makeSymbol("WITH-NEW-SBHL-GATHER-SPACE");
        $sym252$GET_SBHL_TRANSFERS_THROUGH_MODULE = SubLObjectFactory.makeSymbol("GET-SBHL-TRANSFERS-THROUGH-MODULE");
        $sym253$DO_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS = SubLObjectFactory.makeSymbol("DO-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS");
        $list254 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym255$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES = SubLObjectFactory.makeSymbol("DO-ALL-SBHL-FORWARD-TRUE-LINK-NODES");
        $list256 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")));
        $list257 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-LINKS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym258$DO_RELEVANT_FORWARD_SBHL_LINK_NODES = SubLObjectFactory.makeSymbol("DO-RELEVANT-FORWARD-SBHL-LINK-NODES");
        $list259 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list260 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw261$MT = SubLObjectFactory.makeKeyword("MT");
        $sym262$MT_VAR = SubLObjectFactory.makeUninternedSymbol("MT-VAR");
        $sym263$TV_VAR = SubLObjectFactory.makeUninternedSymbol("TV-VAR");
        $sym264$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE");
        $sym265$DO_TRUE_ISA_LINKS = SubLObjectFactory.makeSymbol("DO-TRUE-ISA-LINKS");
        $sym266$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $list267 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym268$LINK_NODES = SubLObjectFactory.makeUninternedSymbol("LINK-NODES");
        $list269 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))));
        $list270 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym271$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES = SubLObjectFactory.makeSymbol("DO-ALL-SBHL-BACKWARD-TRUE-LINK-NODES");
        $list272 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-LINKS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym273$DO_RELEVANT_BACKWARD_SBHL_LINK_NODES = SubLObjectFactory.makeSymbol("DO-RELEVANT-BACKWARD-SBHL-LINK-NODES");
        $list274 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym275$MT_VAR = SubLObjectFactory.makeUninternedSymbol("MT-VAR");
        $sym276$TV_VAR = SubLObjectFactory.makeUninternedSymbol("TV-VAR");
        $sym277$DO_TRUE_INSTANCE_LINKS = SubLObjectFactory.makeSymbol("DO-TRUE-INSTANCE-LINKS");
        $list278 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTED-ISA-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list279 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")));
        $list280 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTED-ISA-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym281$MT_VAR = SubLObjectFactory.makeUninternedSymbol("MT-VAR");
        $sym282$TV_VAR = SubLObjectFactory.makeUninternedSymbol("TV-VAR");
        $sym283$DO_TRUE_QUOTED_ISA_LINKS = SubLObjectFactory.makeSymbol("DO-TRUE-QUOTED-ISA-LINKS");
        $list284 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTED-INSTANCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym285$MT_VAR = SubLObjectFactory.makeUninternedSymbol("MT-VAR");
        $sym286$TV_VAR = SubLObjectFactory.makeUninternedSymbol("TV-VAR");
        $sym287$DO_TRUE_QUOTED_INSTANCE_LINKS = SubLObjectFactory.makeSymbol("DO-TRUE-QUOTED-INSTANCE-LINKS");
        $list288 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym289$DO_ALL_FORWARD_TRUE_LINKS_FOR_TT = SubLObjectFactory.makeSymbol("DO-ALL-FORWARD-TRUE-LINKS-FOR-TT");
        $list290 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list291 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym292$ISAS = SubLObjectFactory.makeUninternedSymbol("ISAS");
        $sym293$WITH_MT = SubLObjectFactory.makeSymbol("WITH-MT");
        $sym294$SORT_BY_GENERALITY_ESTIMATE = SubLObjectFactory.makeSymbol("SORT-BY-GENERALITY-ESTIMATE");
        $sym295$ALL_ISA = SubLObjectFactory.makeSymbol("ALL-ISA");
        $list296 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym297$DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT = SubLObjectFactory.makeSymbol("DO-ALL-BACKWARD-TRUE-LINKS-FOR-TT");
        $sym298$DO_ALL_INSTANCES = SubLObjectFactory.makeSymbol("DO-ALL-INSTANCES");
        $str299$Iterator___see_do_all_simple_back = SubLObjectFactory.makeString("Iterator. @see do-all-simple-backward-true-links.");
        $list300 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym301$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym302$DO_ALL_FORT_INSTANCES = SubLObjectFactory.makeSymbol("DO-ALL-FORT-INSTANCES");
        $str303$Like__xref_do_all_instances_excep = SubLObjectFactory.makeString("Like @xref do-all-instances except only iterates over forts.");
        $list304 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym305$TERMS_VAR = SubLObjectFactory.makeUninternedSymbol("TERMS-VAR");
        $sym306$ALL_ISA_ = SubLObjectFactory.makeSymbol("ALL-ISA?");
        $sym307$REST = SubLObjectFactory.makeSymbol("REST");
        $sym308$DO_ALL_QUOTED_INSTANCES = SubLObjectFactory.makeSymbol("DO-ALL-QUOTED-INSTANCES");
        $sym309$DO_ALL_FORT_QUOTED_INSTANCES = SubLObjectFactory.makeSymbol("DO-ALL-FORT-QUOTED-INSTANCES");
        $sym310$TERMS_VAR = SubLObjectFactory.makeUninternedSymbol("TERMS-VAR");
        $sym311$ALL_QUOTED_ISA_ = SubLObjectFactory.makeSymbol("ALL-QUOTED-ISA?");
        $list312 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list313 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $list314 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-LINKS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list315 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TV")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym316$DUMMY = SubLObjectFactory.makeUninternedSymbol("DUMMY");
        $sym317$DO_TRUE_GENLS_LINKS = SubLObjectFactory.makeSymbol("DO-TRUE-GENLS-LINKS");
        $list318 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym319$MT_VAR = SubLObjectFactory.makeUninternedSymbol("MT-VAR");
        $sym320$TV_VAR = SubLObjectFactory.makeUninternedSymbol("TV-VAR");
        $list321 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list322 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-LINKS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list323 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym324$MT_VAR = SubLObjectFactory.makeUninternedSymbol("MT-VAR");
        $sym325$TV_VAR = SubLObjectFactory.makeUninternedSymbol("TV-VAR");
        $sym326$DO_TRUE_SPEC_LINKS = SubLObjectFactory.makeSymbol("DO-TRUE-SPEC-LINKS");
        $list327 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym328$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS = SubLObjectFactory.makeSymbol("DO-ALL-SIMPLE-FORWARD-TRUE-LINKS");
        $list329 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list330 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym331$GENLS = SubLObjectFactory.makeUninternedSymbol("GENLS");
        $sym332$ALL_GENLS = SubLObjectFactory.makeSymbol("ALL-GENLS");
        $list333 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym334$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS = SubLObjectFactory.makeSymbol("DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS");
        $list335 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list336 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym337$SPECS = SubLObjectFactory.makeUninternedSymbol("SPECS");
        $sym338$NREVERSE = SubLObjectFactory.makeSymbol("NREVERSE");
        $sym339$ALL_SPECS = SubLObjectFactory.makeSymbol("ALL-SPECS");
        $list340 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-PREDICATE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list341 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")));
        $list342 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-PREDICATE-LINKS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list343 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-PREDICATE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list344 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-PREDICATE-LINKS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list345 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-PREDICATE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym346$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES = SubLObjectFactory.makeSymbol("DO-ALL-SIMPLE-FORWARD-TRUE-LINKS-FOR-INVERSES");
        $list347 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-PREDICATE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list348 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-PREDICATE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-MODE-P"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym349$DO_ALL_MODE_FORWARD_TRUE_LINKS_FOR_INVERSES = SubLObjectFactory.makeSymbol("DO-ALL-MODE-FORWARD-TRUE-LINKS-FOR-INVERSES");
        $list350 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-PREDICATE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym351$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES = SubLObjectFactory.makeSymbol("DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS-FOR-INVERSES");
        $list352 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-PREDICATE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list353 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-MODE-P"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym354$DO_ALL_MODE_BACKWARD_TRUE_LINKS_FOR_INVERSES = SubLObjectFactory.makeSymbol("DO-ALL-MODE-BACKWARD-TRUE-LINKS-FOR-INVERSES");
        $sym355$ALL_PROPER_GENL_PREDICATES = SubLObjectFactory.makeSymbol("ALL-PROPER-GENL-PREDICATES");
        $list356 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-INVERSE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym357$ALL_PROPER_GENL_INVERSES = SubLObjectFactory.makeSymbol("ALL-PROPER-GENL-INVERSES");
        $list358 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-INVERSE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list359 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")));
        $list360 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-INVERSE-LINKS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list361 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-INVERSE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list362 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-INVERSE-LINKS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list363 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-INVERSE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list364 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-INVERSE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list365 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-INVERSE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list366 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-MODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym367$DO_ALL_PREDS_AND_INVERSES = SubLObjectFactory.makeSymbol("DO-ALL-PREDS-AND-INVERSES");
        $list368 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PRED-VAR"), SubLObjectFactory.makeSymbol("INVERSE-MODE-VAR"), SubLObjectFactory.makeSymbol("PRED"), SubLObjectFactory.makeSymbol("DIRECTION"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("TV"), SubLObjectFactory.makeSymbol("DONE-VAR"), SubLObjectFactory.makeSymbol("SEARCH-TYPE") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym369$MODULE = SubLObjectFactory.makeUninternedSymbol("MODULE");
        $sym370$NODE_VAR = SubLObjectFactory.makeUninternedSymbol("NODE-VAR");
        $sym371$NODE_AND_PREDICATE_MODE = SubLObjectFactory.makeUninternedSymbol("NODE-AND-PREDICATE-MODE");
        $sym372$PREDICATE_MODE = SubLObjectFactory.makeUninternedSymbol("PREDICATE-MODE");
        $sym373$DECK_TYPE = SubLObjectFactory.makeUninternedSymbol("DECK-TYPE");
        $sym374$RECUR_DECK = SubLObjectFactory.makeUninternedSymbol("RECUR-DECK");
        $sym375$NODE_VARS_LINK_NODE = SubLObjectFactory.makeUninternedSymbol("NODE-VARS-LINK-NODE");
        $list376 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"))));
        $list377 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list378 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")));
        $list379 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-MT-LINKS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list380 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list381 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-MT-LINKS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list382 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list383 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list384 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list385 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
    }
}

/*

	Total time: 1762 ms
	
*/