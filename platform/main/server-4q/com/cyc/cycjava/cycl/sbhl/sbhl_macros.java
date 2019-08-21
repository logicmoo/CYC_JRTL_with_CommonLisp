package com.cyc.cycjava.cycl.sbhl;


import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_macros.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sbhl_macros extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_macros();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_macros";

    public static final String myFingerPrint = "af88cc3372f3175345b4048796df66fbefe0c421bc099d61a512ca56285d041d";

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("TV"), makeSymbol("TV-LINKS"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym1$LINK_NODES = makeUninternedSymbol("LINK-NODES");



    public static final SubLSymbol GET_SBHL_LINK_NODES = makeSymbol("GET-SBHL-LINK-NODES");



    private static final SubLSymbol DO_SET_OR_LIST = makeSymbol("DO-SET-OR-LIST");



    private static final SubLList $list7 = list(list(makeSymbol("TV-VAR"), makeSymbol("LINK-NODES-VAR"), makeSymbol("TV-LINKS"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list9 = list(list(makeSymbol("TV-VAR"), makeSymbol("LINK-NODES-VAR"), makeSymbol("MT"), makeSymbol("MT-LINKS"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym10$TV_LINKS = makeUninternedSymbol("TV-LINKS");

    private static final SubLSymbol GET_SBHL_TV_LINKS = makeSymbol("GET-SBHL-TV-LINKS");

    private static final SubLSymbol DO_SBHL_TV_LINKS = makeSymbol("DO-SBHL-TV-LINKS");

    public static final SubLList $list13 = list(list(makeSymbol("MT-VAR"), makeSymbol("TV-LINKS-VAR"), makeSymbol("MT-LINKS"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list14 = list(list(makeSymbol("MT-VAR"), makeSymbol("TV-LINKS-VAR"), makeSymbol("DIRECTION"), makeSymbol("D-LINK"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym15$MT_LINKS = makeUninternedSymbol("MT-LINKS");

    private static final SubLSymbol GET_SBHL_MT_LINKS = makeSymbol("GET-SBHL-MT-LINKS");

    private static final SubLList $list17 = list(list(makeSymbol("DIRECTION-VAR"), makeSymbol("MT-LINKS-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym18$D_LINK = makeUninternedSymbol("D-LINK");

    private static final SubLSymbol GET_SBHL_GRAPH_LINK = makeSymbol("GET-SBHL-GRAPH-LINK");

    private static final SubLSymbol DO_RELEVANT_SBHL_DIRECTIONS = makeSymbol("DO-RELEVANT-SBHL-DIRECTIONS");

    private static final SubLList $list21 = list(list(makeSymbol("MT-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym22$DIRECTION = makeUninternedSymbol("DIRECTION");

    private static final SubLSymbol $sym23$MT_LINKS = makeUninternedSymbol("MT-LINKS");

    private static final SubLSymbol $sym24$TV_LINKS = makeUninternedSymbol("TV-LINKS");

    private static final SubLSymbol POSSIBLY_WITH_SBHL_MODULE = makeSymbol("POSSIBLY-WITH-SBHL-MODULE");

    private static final SubLSymbol WITH_SBHL_FORWARD_LINK_DIRECTION_FOR_MODULE = makeSymbol("WITH-SBHL-FORWARD-LINK-DIRECTION-FOR-MODULE");

    private static final SubLSymbol DO_SBHL_GRAPH_LINK = makeSymbol("DO-SBHL-GRAPH-LINK");

    private static final SubLSymbol SBHL_FORWARD_DIRECTION_FOR_MODULE_P = makeSymbol("SBHL-FORWARD-DIRECTION-FOR-MODULE-P");

    private static final SubLSymbol DO_SBHL_MT_LINKS = makeSymbol("DO-SBHL-MT-LINKS");

    private static final SubLSymbol ANY_SBHL_TRUE_LINK_NODES_P = makeSymbol("ANY-SBHL-TRUE-LINK-NODES-P");

    private static final SubLList $list31 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("MT-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym32$DIRECTION = makeUninternedSymbol("DIRECTION");

    private static final SubLSymbol $sym33$MT_LINKS = makeUninternedSymbol("MT-LINKS");

    private static final SubLSymbol $sym34$TV_LINKS = makeUninternedSymbol("TV-LINKS");

    private static final SubLSymbol $sym35$TV = makeUninternedSymbol("TV");

    private static final SubLSymbol $sym36$LINK_NODES = makeUninternedSymbol("LINK-NODES");



    public static final SubLList $list38 = list(list(makeSymbol("DIRECTION-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("LINK-NODES-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym39$MT_LINKS = makeUninternedSymbol("MT-LINKS");

    public static final SubLSymbol $sym40$TV_LINKS = makeUninternedSymbol("TV-LINKS");

    public static final SubLList $list41 = list(list(makeSymbol("DIRECTION-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("LINK-NODE-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym42$LINK_NODES_VAR = makeUninternedSymbol("LINK-NODES-VAR");

    public static final SubLSymbol DO_ALL_SBHL_TV_LINKS = makeSymbol("DO-ALL-SBHL-TV-LINKS");

    public static final SubLList $list44 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("TV-VAR"), makeSymbol("MT-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym45$LINK_NODES_VAR = makeUninternedSymbol("LINK-NODES-VAR");

    public static final SubLSymbol $sym46$DIRECTION = makeUninternedSymbol("DIRECTION");

    public static final SubLSymbol $sym47$MT_LINKS = makeUninternedSymbol("MT-LINKS");

    public static final SubLSymbol $sym48$TV_LINKS = makeUninternedSymbol("TV-LINKS");

    public static final SubLSymbol GET_SBHL_MODULE_FORWARD_DIRECTION = makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION");

    public static final SubLSymbol $sym50$LINK_NODES_VAR = makeUninternedSymbol("LINK-NODES-VAR");

    public static final SubLSymbol $sym51$DIRECTION = makeUninternedSymbol("DIRECTION");

    public static final SubLSymbol $sym52$MT_LINKS = makeUninternedSymbol("MT-LINKS");

    public static final SubLSymbol $sym53$TV_LINKS = makeUninternedSymbol("TV-LINKS");

    public static final SubLSymbol GET_SBHL_MODULE_BACKWARD_DIRECTION = makeSymbol("GET-SBHL-MODULE-BACKWARD-DIRECTION");

    public static final SubLList $list55 = list(list(makeSymbol("D-LINK-VAR"), makeSymbol("NODE"), makeSymbol("MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list57 = list(list(makeSymbol("SBHL-ERROR"), FIVE_INTEGER, makeString("attempting to bind direction link variable, to NIL. macro body not executed.")));

    public static final SubLList $list58 = list(list(makeSymbol("LINK-NODES-VAR"), makeSymbol("START-NODE"), makeSymbol("DIRECTION"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym59$NODE = makeUninternedSymbol("NODE");

    public static final SubLSymbol NAUT_TO_NART = makeSymbol("NAUT-TO-NART");



    public static final SubLSymbol SBHL_NODE_OBJECT_P = makeSymbol("SBHL-NODE-OBJECT-P");

    public static final SubLSymbol WITH_RELEVANT_SBHL_FORT_LINK_NODES = makeSymbol("WITH-RELEVANT-SBHL-FORT-LINK-NODES");

    public static final SubLSymbol CNAT_P = makeSymbol("CNAT-P");

    public static final SubLSymbol DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS = makeSymbol("DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS");

    public static final SubLSymbol $sym66$NODE = makeUninternedSymbol("NODE");

    public static final SubLSymbol WITH_SBHL_NON_FORT_LINKS = makeSymbol("WITH-SBHL-NON-FORT-LINKS");

    public static final SubLList $list68 = list(list(makeSymbol("LINK-NODES-VAR"), makeSymbol("NODE"), makeSymbol("DIRECTION"), makeSymbol("MODULE"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym69$D_LINK = makeUninternedSymbol("D-LINK");

    public static final SubLSymbol $sym70$MT = makeUninternedSymbol("MT");

    public static final SubLSymbol $sym71$TV_LINKS = makeUninternedSymbol("TV-LINKS");

    public static final SubLSymbol $sym72$TV = makeUninternedSymbol("TV");

    public static final SubLSymbol WITH_SBHL_GRAPH_LINK = makeSymbol("WITH-SBHL-GRAPH-LINK");

    public static final SubLSymbol DO_SBHL_DIRECTION_LINK = makeSymbol("DO-SBHL-DIRECTION-LINK");

    public static final SubLSymbol $sym75$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");

    public static final SubLSymbol $sbhl_link_mt$ = makeSymbol("*SBHL-LINK-MT*");

    public static final SubLSymbol $sym77$RELEVANT_SBHL_TV_ = makeSymbol("RELEVANT-SBHL-TV?");

    public static final SubLSymbol $sbhl_link_tv$ = makeSymbol("*SBHL-LINK-TV*");

    public static final SubLList $list79 = list(list(makeSymbol("INS-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("COL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym80$INSTANCE_TUPLE = makeUninternedSymbol("INSTANCE-TUPLE");



    public static final SubLSymbol NON_FORT_INSTANCE_TABLE_LOOKUP = makeSymbol("NON-FORT-INSTANCE-TABLE-LOOKUP");



    public static final SubLList $list84 = list(list(makeSymbol("LINK-NODES-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym85$LINK_NODE = makeUninternedSymbol("LINK-NODE");

    public static final SubLSymbol $sym86$MT = makeUninternedSymbol("MT");

    public static final SubLSymbol $sym87$TV = makeUninternedSymbol("TV");

    public static final SubLSymbol $sym88$DO_SBHL_NON_FORT_LINKS_ = makeSymbol("DO-SBHL-NON-FORT-LINKS?");

    public static final SubLSymbol DO_NON_FORT_DIRECT_INSTANCE_LINKS = makeSymbol("DO-NON-FORT-DIRECT-INSTANCE-LINKS");



    public static final SubLSymbol DO_SBHL_NON_FORT_LINKS = makeSymbol("DO-SBHL-NON-FORT-LINKS");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLSymbol $sym93$ADMISSIBLE_NON_FORT_LINK_NODE_ = makeSymbol("ADMISSIBLE-NON-FORT-LINK-NODE?");

    public static final SubLList $list94 = list(list(makeSymbol("LINK-NODES-VAR"), makeSymbol("NODE"), makeSymbol("DIRECTION"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym95$GENERATING_FN = makeUninternedSymbol("GENERATING-FN");

    private static final SubLSymbol SBHL_CSOME = makeSymbol("SBHL-CSOME");

    private static final SubLSymbol GET_SBHL_MODULE_RELEVANT_NAUT_LINK_GENERATORS = makeSymbol("GET-SBHL-MODULE-RELEVANT-NAUT-LINK-GENERATORS");

    private static final SubLSymbol $sbhl_tv$ = makeSymbol("*SBHL-TV*");

    private static final SubLSymbol $sbhl_link_generator$ = makeSymbol("*SBHL-LINK-GENERATOR*");



    private static final SubLList $list101 = list(list(makeSymbol("LINK-NODES-VAR"), makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("MODULE"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol POSSIBLY_WITH_SBHL_MT_RELEVANCE = makeSymbol("POSSIBLY-WITH-SBHL-MT-RELEVANCE");

    private static final SubLSymbol POSSIBLY_WITH_SBHL_TV = makeSymbol("POSSIBLY-WITH-SBHL-TV");

    private static final SubLSymbol WITH_RELEVANT_SBHL_LINK_NODES = makeSymbol("WITH-RELEVANT-SBHL-LINK-NODES");

    private static final SubLSymbol DO_WITH_RELEVANT_SBHL_MODULES = makeSymbol("DO-WITH-RELEVANT-SBHL-MODULES");

    private static final SubLSymbol POSSIBLY_FLIP_GENL_INVERSE_MODE = makeSymbol("POSSIBLY-FLIP-GENL-INVERSE-MODE");

    private static final SubLList $list107 = list(makeSymbol("GET-SBHL-MODULE"));

    private static final SubLSymbol WITH_RELEVANT_SBHL_LINK_NODES_AND_NON_FORTS = makeSymbol("WITH-RELEVANT-SBHL-LINK-NODES-AND-NON-FORTS");

    private static final SubLList $list109 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("NODE"), makeSymbol("DIRECTION"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym110$LINK_NODES = makeUninternedSymbol("LINK-NODES");

    private static final SubLSymbol WITH_ACCESSIBLE_SBHL_LINK_NODES = makeSymbol("WITH-ACCESSIBLE-SBHL-LINK-NODES");

    private static final SubLSymbol $sym112$LINK_NODES = makeUninternedSymbol("LINK-NODES");

    private static final SubLSymbol WITH_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS = makeSymbol("WITH-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS");

    public static final SubLList $list114 = list(list(makeSymbol("LINK-NODE-SEARCH-STATE-VAR"), makeSymbol("NODE-SEARCH-STATE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list115 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    public static final SubLSymbol DO_SBHL_ITERATOR = makeSymbol("DO-SBHL-ITERATOR");

    public static final SubLSymbol NEW_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR = makeSymbol("NEW-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR");

    public static final SubLList $list119 = list(list(makeSymbol("TV-LINKS-VAR"), makeSymbol("NODE"), makeSymbol("DIRECTION"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym120$LINK_NODES = makeUninternedSymbol("LINK-NODES");

    public static final SubLList $list121 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_RELEVANT_SBHL_LINK_NODES = makeSymbol("DO-RELEVANT-SBHL-LINK-NODES");

    public static final SubLList $list123 = list(list(makeSymbol("PRED-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol SMART_CSOME = makeSymbol("SMART-CSOME");

    public static final SubLList $list125 = list(makeSymbol("GET-SBHL-PREDICATES"));

    public static final SubLSymbol $sym126$MODULE = makeUninternedSymbol("MODULE");

    public static final SubLSymbol DO_SBHL_MODULES = makeSymbol("DO-SBHL-MODULES");



    public static final SubLSymbol SBHL_TIME_MODULE_P = makeSymbol("SBHL-TIME-MODULE-P");

    public static final SubLSymbol GET_SBHL_LINK_PRED = makeSymbol("GET-SBHL-LINK-PRED");

    public static final SubLList $list131 = list(list(makeSymbol("MODULE-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym132$MODULE = makeUninternedSymbol("MODULE");

    public static final SubLList $list133 = list(list(makeSymbol("MODULE-VAR"), makeSymbol("GRAPH-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol GET_SBHL_MODULE_GRAPH = makeSymbol("GET-SBHL-MODULE-GRAPH");

    public static final SubLList $list135 = list(list(makeSymbol("*SBHL-LINK-DIRECTION*"), list(makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION"), list(makeSymbol("GET-SBHL-MODULE")))));

    public static final SubLList $list136 = list(list(makeSymbol("*SBHL-LINK-DIRECTION*"), list(makeSymbol("GET-SBHL-MODULE-BACKWARD-DIRECTION"), list(makeSymbol("GET-SBHL-MODULE")))));

    public static final SubLList $list137 = list(makeSymbol("NODE"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list139 = list(makeSymbol("SUSPEND-SBHL-TYPE-CHECKING?"));

    public static final SubLSymbol APPLY_SBHL_MODULE_TYPE_TEST = makeSymbol("APPLY-SBHL-MODULE-TYPE-TEST");

    public static final SubLList $list141 = list(list(makeSymbol("GET-SBHL-MODULE")));



    public static final SubLSymbol SBHL_WARN = makeSymbol("SBHL-WARN");

    public static final SubLString $str144$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    public static final SubLList $list145 = list(list(makeSymbol("GET-SBHL-TYPE-TEST"), list(makeSymbol("GET-SBHL-MODULE"))));

    public static final SubLList $list146 = list(list(makeSymbol("NODE-VAR"), makeSymbol("LINK-VAR"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_SBHL_GRAPH_LINKS = makeSymbol("DO-SBHL-GRAPH-LINKS");



    public static final SubLList $list149 = list(list(makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym150$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");

    public static final SubLSymbol $sym151$ACCESSIBLE_MODULES = makeUninternedSymbol("ACCESSIBLE-MODULES");

    public static final SubLSymbol GET_SBHL_ACCESSIBLE_MODULES = makeSymbol("GET-SBHL-ACCESSIBLE-MODULES");

    public static final SubLSymbol WITH_SBHL_MODULE = makeSymbol("WITH-SBHL-MODULE");





    public static final SubLList $list156 = list(list(makeSymbol("DIRECTION-VAR"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol GET_RELEVANT_SBHL_DIRECTIONS = makeSymbol("GET-RELEVANT-SBHL-DIRECTIONS");

    public static final SubLList $list158 = list(list(makeSymbol("*SBHL-SEARCH-BEHAVIOR*"), list(makeSymbol("DETERMINE-SBHL-SEARCH-BEHAVIOR"), list(makeSymbol("GET-SBHL-SEARCH-MODULE")), list(makeSymbol("GET-SBHL-SEARCH-DIRECTION")), list(makeSymbol("GET-SBHL-TV")))), list(makeSymbol("*SBHL-TERMINATING-MARKING-SPACE*"), list(makeSymbol("DETERMINE-SBHL-TERMINATING-MARKING-SPACE"), makeSymbol("*SBHL-SEARCH-BEHAVIOR*"))));

    public static final SubLSymbol $sym159$PREMARKING_ = makeUninternedSymbol("PREMARKING?");

    public static final SubLSymbol $sym160$GOAL_FN = makeUninternedSymbol("GOAL-FN");

    public static final SubLSymbol $sym161$GOAL_NODE = makeUninternedSymbol("GOAL-NODE");

    public static final SubLSymbol $sym162$GOAL_SPACE = makeUninternedSymbol("GOAL-SPACE");

    public static final SubLList $list163 = list(list(makeSymbol("SBHL-MODULE-PREMARKS-GATHER-NODES-P")));

    public static final SubLList $list164 = list(list(makeSymbol("QUOTE"), makeSymbol("SBHL-NODE-IS-GOAL-NODE")));

    public static final SubLList $list165 = list(makeSymbol("*SBHL-SPACE*"));

    public static final SubLList $list166 = list(makeSymbol("GET-SBHL-TRANSFERS-THROUGH-MODULE"), list(makeSymbol("GET-SBHL-SEARCH-MODULE")));

    public static final SubLSymbol POSSIBLY_PREMARK_WITH_GENL_INVERSE_MODE = makeSymbol("POSSIBLY-PREMARK-WITH-GENL-INVERSE-MODE");

    public static final SubLSymbol SBHL_PREMARK_GATHER_NODES = makeSymbol("SBHL-PREMARK-GATHER-NODES");



    public static final SubLList $list170 = list(list(makeSymbol("QUOTE"), makeSymbol("SBHL-NODE-MARKED-AS-GOAL-NODE")));

    public static final SubLList $list171 = list(makeSymbol("*SBHL-GATHER-SPACE*"));

    public static final SubLSymbol RESET_SBHL_SEARCH_PARENT_MARKING = makeSymbol("RESET-SBHL-SEARCH-PARENT-MARKING");

    public static final SubLSymbol WITH_NEW_SBHL_PREDICATE_MODE_SCOPE = makeSymbol("WITH-NEW-SBHL-PREDICATE-MODE-SCOPE");

    public static final SubLSymbol WITH_SBHL_CONSIDER_NODE_FN = makeSymbol("WITH-SBHL-CONSIDER-NODE-FN");

    public static final SubLSymbol WITH_SBHL_GOAL_NODE = makeSymbol("WITH-SBHL-GOAL-NODE");

    public static final SubLSymbol WITH_SBHL_GOAL_SPACE = makeSymbol("WITH-SBHL-GOAL-SPACE");

    public static final SubLList $list177 = list(makeSymbol("NODE"), makeSymbol("LINK-NODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list178 = list(makeSymbol("*SBHL-SEARCH-PARENT-MARKING*"), makeSymbol("*SBHL-SEARCH-PARENT-MARKING*"));

    public static final SubLSymbol $sym179$_SBHL_TEMPORALITY_SEARCH_PASSED_THROUGH_DATE__ = makeSymbol("*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*");



    public static final SubLList $list181 = list(makeSymbol("SBHL-JUSTIFICATION-SEARCH-P"));

    public static final SubLSymbol HL_DATE_POINT_P = makeSymbol("HL-DATE-POINT-P");

    public static final SubLList $list183 = list(makeSymbol("*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*"));



    public static final SubLSymbol SBHL_TEMPORALITY_CONSEQUENT_LINKS_SEARCH_PASSED_THROUGH_LINK_P = makeSymbol("SBHL-TEMPORALITY-CONSEQUENT-LINKS-SEARCH-PASSED-THROUGH-LINK-P");

    public static final SubLSymbol SBHL_TEMPORAL_FAUX_LINK = makeSymbol("SBHL-TEMPORAL-FAUX-LINK");

    public static final SubLList $list187 = list(list(makeSymbol("*SBHL-SEARCH-BEHAVIOR*"), list(makeSymbol("FIF"), list(makeSymbol("SBHL-TRANSFERS-THROUGH-MODULE-P"), list(makeSymbol("GET-SBHL-MODULE"))), list(makeSymbol("QUOTE"), makeSymbol("SBHL-LEAF-INSTANCES-SWEEP")), list(makeSymbol("QUOTE"), makeSymbol("SBHL-SIMPLE-TRUE-SEARCH-AND-UNWIND")))));

    public static final SubLList $list188 = list(list(new SubLObject[]{ makeSymbol("LINK-NODE-VAR"), makeSymbol("MODULE"), makeSymbol("DIRECTION"), makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), list(makeSymbol("SEARCH-TYPE"), makeKeyword("BREADTH")) }), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym190$NODE_VAR = makeUninternedSymbol("NODE-VAR");

    public static final SubLSymbol $sym191$DECK_TYPE = makeUninternedSymbol("DECK-TYPE");

    public static final SubLSymbol $sym192$RECUR_DECK = makeUninternedSymbol("RECUR-DECK");

    public static final SubLSymbol $sym193$NODE_VARS_LINK_NODE = makeUninternedSymbol("NODE-VARS-LINK-NODE");



    public static final SubLList $list195 = list(makeKeyword("BREADTH"));

    public static final SubLList $list196 = list(makeKeyword("QUEUE"), makeKeyword("STACK"));

    public static final SubLSymbol CREATE_DECK = makeSymbol("CREATE-DECK");

    public static final SubLSymbol WITH_NEW_SBHL_SPACE = makeSymbol("WITH-NEW-SBHL-SPACE");

    public static final SubLSymbol POSSIBLY_WITH_SBHL_TRUE_TV = makeSymbol("POSSIBLY-WITH-SBHL-TRUE-TV");

    public static final SubLSymbol WITH_SBHL_SEARCH_MODULE = makeSymbol("WITH-SBHL-SEARCH-MODULE");

    public static final SubLSymbol WITH_SBHL_TYPE_TEST = makeSymbol("WITH-SBHL-TYPE-TEST");

    public static final SubLSymbol WITH_SBHL_SEARCH_DIRECTION = makeSymbol("WITH-SBHL-SEARCH-DIRECTION");

    public static final SubLSymbol WITH_SBHL_LINK_DIRECTION = makeSymbol("WITH-SBHL-LINK-DIRECTION");

    public static final SubLSymbol SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION = makeSymbol("SBHL-SEARCH-DIRECTION-TO-LINK-DIRECTION");

    public static final SubLSymbol SBHL_MARK_NODE_MARKED = makeSymbol("SBHL-MARK-NODE-MARKED");





    public static final SubLSymbol DO_ACCESSIBLE_SBHL_LINK_NODES = makeSymbol("DO-ACCESSIBLE-SBHL-LINK-NODES");

    public static final SubLList $list209 = list(makeSymbol("GET-SBHL-LINK-DIRECTION"));

    public static final SubLSymbol SBHL_SEARCH_PATH_TERMINATION_P = makeSymbol("SBHL-SEARCH-PATH-TERMINATION-P");

    public static final SubLSymbol DECK_PUSH = makeSymbol("DECK-PUSH");

    public static final SubLSymbol DECK_POP = makeSymbol("DECK-POP");

    public static final SubLList $list213 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("MODULE"), makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_ALL_SIMPLE_TRUE_LINKS = makeSymbol("DO-ALL-SIMPLE-TRUE-LINKS");

    public static final SubLList $list215 = list(makeSymbol("GET-SBHL-FORWARD-SEARCH-DIRECTION"));

    public static final SubLList $list216 = list(makeSymbol("GET-SBHL-BACKWARD-SEARCH-DIRECTION"));

    public static final SubLList $list217 = list(list(new SubLObject[]{ makeSymbol("LINK-NODE-VAR"), makeSymbol("MODULE"), makeSymbol("DIRECTION"), makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), list(makeSymbol("SEARCH-TYPE"), makeKeyword("DEPTH")) }), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym219$NODE_VAR = makeUninternedSymbol("NODE-VAR");

    public static final SubLSymbol $sym220$NODE_AND_PREDICATE_MODE = makeUninternedSymbol("NODE-AND-PREDICATE-MODE");

    public static final SubLSymbol $sym221$PREDICATE_MODE = makeUninternedSymbol("PREDICATE-MODE");

    public static final SubLSymbol $sym222$DECK_TYPE = makeUninternedSymbol("DECK-TYPE");

    public static final SubLSymbol $sym223$RECUR_DECK = makeUninternedSymbol("RECUR-DECK");

    public static final SubLSymbol $sym224$NODE_VARS_LINK_NODE = makeUninternedSymbol("NODE-VARS-LINK-NODE");

    public static final SubLList $list225 = list(makeKeyword("DEPTH"));

    public static final SubLList $list226 = list(makeKeyword("STACK"), makeKeyword("QUEUE"));

    public static final SubLList $list227 = list(list(makeSymbol("GENL-INVERSE-MODE-P")));





    public static final SubLSymbol WITH_SBHL_PREDICATE_MODE = makeSymbol("WITH-SBHL-PREDICATE-MODE");

    public static final SubLSymbol APPLY_SBHL_ADD_NODE_TEST = makeSymbol("APPLY-SBHL-ADD-NODE-TEST");

    public static final SubLList $list232 = list(makeSymbol("GET-SBHL-SEARCH-ADD-NODE-TEST"));

    public static final SubLSymbol DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES = makeSymbol("DO-ALL-SIMPLE-TRUE-LINKS-FOR-INVERSES");

    public static final SubLList $list234 = list(list(new SubLObject[]{ makeSymbol("LINK-NODE-VAR"), makeSymbol("MODE-VAR"), makeSymbol("MODULE"), makeSymbol("DIRECTION"), makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), list(makeSymbol("SEARCH-TYPE"), makeKeyword("DEPTH")) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym235$NODE_VAR = makeUninternedSymbol("NODE-VAR");

    public static final SubLSymbol $sym236$NODE_AND_PREDICATE_MODE = makeUninternedSymbol("NODE-AND-PREDICATE-MODE");

    public static final SubLSymbol $sym237$PREDICATE_MODE = makeUninternedSymbol("PREDICATE-MODE");

    public static final SubLSymbol $sym238$DECK_TYPE = makeUninternedSymbol("DECK-TYPE");

    public static final SubLSymbol $sym239$RECUR_DECK = makeUninternedSymbol("RECUR-DECK");

    public static final SubLSymbol $sym240$NODE_VARS_LINK_NODE = makeUninternedSymbol("NODE-VARS-LINK-NODE");

    public static final SubLList $list241 = list(list(new SubLObject[]{ makeSymbol("LINK-NODE-VAR"), makeSymbol("MODE-VAR"), makeSymbol("MODULE"), makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_ALL_MODE_TRUE_LINKS_FOR_INVERSES = makeSymbol("DO-ALL-MODE-TRUE-LINKS-FOR-INVERSES");

    public static final SubLSymbol $sym243$NODE_VAR = makeUninternedSymbol("NODE-VAR");

    public static final SubLSymbol $sym244$DECK_TYPE = makeUninternedSymbol("DECK-TYPE");

    public static final SubLSymbol $sym245$RECUR_DECK = makeUninternedSymbol("RECUR-DECK");

    public static final SubLSymbol $sym246$NODE_VARS_LINK_NODE = makeUninternedSymbol("NODE-VARS-LINK-NODE");

    public static final SubLSymbol WITH_SBHL_FORWARD_SEARCH_DIRECTION = makeSymbol("WITH-SBHL-FORWARD-SEARCH-DIRECTION");

    public static final SubLSymbol WITH_SBHL_FORWARD_LINK_DIRECTION = makeSymbol("WITH-SBHL-FORWARD-LINK-DIRECTION");

    public static final SubLSymbol $sym249$NODE_VAR = makeUninternedSymbol("NODE-VAR");

    public static final SubLSymbol $sym250$TT_NODE_VAR = makeUninternedSymbol("TT-NODE-VAR");

    public static final SubLSymbol WITH_NEW_SBHL_GATHER_SPACE = makeSymbol("WITH-NEW-SBHL-GATHER-SPACE");

    public static final SubLSymbol GET_SBHL_TRANSFERS_THROUGH_MODULE = makeSymbol("GET-SBHL-TRANSFERS-THROUGH-MODULE");

    public static final SubLSymbol DO_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS = makeSymbol("DO-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS");

    public static final SubLList $list254 = list(list(makeSymbol("ISA-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES = makeSymbol("DO-ALL-SBHL-FORWARD-TRUE-LINK-NODES");

    public static final SubLList $list256 = list(makeSymbol("GET-SBHL-MODULE"), reader_make_constant_shell(makeString("isa")));

    public static final SubLList $list257 = list(list(makeSymbol("ISA-LINKS-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_RELEVANT_FORWARD_SBHL_LINK_NODES = makeSymbol("DO-RELEVANT-FORWARD-SBHL-LINK-NODES");

    public static final SubLList $list259 = list(list(makeSymbol("ISA-VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list260 = list(makeKeyword("MT"), makeKeyword("DONE"));



    public static final SubLSymbol $sym262$MT_VAR = makeUninternedSymbol("MT-VAR");

    public static final SubLSymbol $sym263$TV_VAR = makeUninternedSymbol("TV-VAR");



    public static final SubLSymbol DO_TRUE_ISA_LINKS = makeSymbol("DO-TRUE-ISA-LINKS");



    public static final SubLList $list267 = list(list(makeSymbol("ISA-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym268$LINK_NODES = makeUninternedSymbol("LINK-NODES");

    public static final SubLList $list269 = list(makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION"), list(makeSymbol("GET-SBHL-MODULE"), reader_make_constant_shell(makeString("isa"))));

    public static final SubLList $list270 = list(list(makeSymbol("INSTANCE-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES = makeSymbol("DO-ALL-SBHL-BACKWARD-TRUE-LINK-NODES");

    public static final SubLList $list272 = list(list(makeSymbol("INSTANCE-LINKS-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_RELEVANT_BACKWARD_SBHL_LINK_NODES = makeSymbol("DO-RELEVANT-BACKWARD-SBHL-LINK-NODES");

    public static final SubLList $list274 = list(list(makeSymbol("INSTANCE-VAR"), makeSymbol("COL"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym275$MT_VAR = makeUninternedSymbol("MT-VAR");

    public static final SubLSymbol $sym276$TV_VAR = makeUninternedSymbol("TV-VAR");

    public static final SubLSymbol DO_TRUE_INSTANCE_LINKS = makeSymbol("DO-TRUE-INSTANCE-LINKS");

    public static final SubLList $list278 = list(list(makeSymbol("QUOTED-ISA-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list279 = list(makeSymbol("GET-SBHL-MODULE"), reader_make_constant_shell(makeString("quotedIsa")));

    public static final SubLList $list280 = list(list(makeSymbol("QUOTED-ISA-VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym281$MT_VAR = makeUninternedSymbol("MT-VAR");

    public static final SubLSymbol $sym282$TV_VAR = makeUninternedSymbol("TV-VAR");

    public static final SubLSymbol DO_TRUE_QUOTED_ISA_LINKS = makeSymbol("DO-TRUE-QUOTED-ISA-LINKS");

    public static final SubLList $list284 = list(list(makeSymbol("QUOTED-INSTANCE-VAR"), makeSymbol("COL"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym285$MT_VAR = makeUninternedSymbol("MT-VAR");

    public static final SubLSymbol $sym286$TV_VAR = makeUninternedSymbol("TV-VAR");

    public static final SubLSymbol DO_TRUE_QUOTED_INSTANCE_LINKS = makeSymbol("DO-TRUE-QUOTED-INSTANCE-LINKS");

    public static final SubLList $list288 = list(list(makeSymbol("ISA-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_ALL_FORWARD_TRUE_LINKS_FOR_TT = makeSymbol("DO-ALL-FORWARD-TRUE-LINKS-FOR-TT");

    public static final SubLList $list290 = list(list(makeSymbol("ISA-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list291 = list(list(makeSymbol("ISA"), makeSymbol("TERM"), makeSymbol("DOMAIN-MT"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym292$ISAS = makeUninternedSymbol("ISAS");



    public static final SubLSymbol SORT_BY_GENERALITY_ESTIMATE = makeSymbol("SORT-BY-GENERALITY-ESTIMATE");

    public static final SubLSymbol ALL_ISA = makeSymbol("ALL-ISA");

    public static final SubLList $list296 = list(list(makeSymbol("INSTANCE-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT = makeSymbol("DO-ALL-BACKWARD-TRUE-LINKS-FOR-TT");

    public static final SubLSymbol DO_ALL_INSTANCES = makeSymbol("DO-ALL-INSTANCES");

    public static final SubLString $str299$Iterator___see_do_all_simple_back = makeString("Iterator. @see do-all-simple-backward-true-links.");

    public static final SubLList $list300 = list(list(makeSymbol("INSTANCE-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol DO_ALL_FORT_INSTANCES = makeSymbol("DO-ALL-FORT-INSTANCES");

    private static final SubLString $str303$Like__xref_do_all_instances_excep = makeString("Like @xref do-all-instances except only iterates over forts.");

    private static final SubLList $list304 = list(list(makeSymbol("INSTANCE-VAR"), makeSymbol("TERMS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym305$TERMS_VAR = makeUninternedSymbol("TERMS-VAR");

    private static final SubLSymbol $sym306$ALL_ISA_ = makeSymbol("ALL-ISA?");



    private static final SubLSymbol DO_ALL_QUOTED_INSTANCES = makeSymbol("DO-ALL-QUOTED-INSTANCES");

    private static final SubLSymbol DO_ALL_FORT_QUOTED_INSTANCES = makeSymbol("DO-ALL-FORT-QUOTED-INSTANCES");

    public static final SubLSymbol $sym310$TERMS_VAR = makeUninternedSymbol("TERMS-VAR");

    public static final SubLSymbol $sym311$ALL_QUOTED_ISA_ = makeSymbol("ALL-QUOTED-ISA?");

    public static final SubLList $list312 = list(list(makeSymbol("GENL-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list313 = list(makeSymbol("GET-SBHL-MODULE"), reader_make_constant_shell(makeString("genls")));

    public static final SubLList $list314 = list(list(makeSymbol("GENL-LINKS-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list315 = list(list(makeSymbol("GENL-VAR"), makeSymbol("MT-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("TV")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym316$DUMMY = makeUninternedSymbol("DUMMY");

    public static final SubLSymbol DO_TRUE_GENLS_LINKS = makeSymbol("DO-TRUE-GENLS-LINKS");

    public static final SubLList $list318 = list(list(makeSymbol("GENL-VAR"), makeSymbol("COL"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym319$MT_VAR = makeUninternedSymbol("MT-VAR");

    public static final SubLSymbol $sym320$TV_VAR = makeUninternedSymbol("TV-VAR");

    public static final SubLList $list321 = list(list(makeSymbol("SPEC-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list322 = list(list(makeSymbol("SPEC-LINKS-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list323 = list(list(makeSymbol("SPEC-VAR"), makeSymbol("COL"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym324$MT_VAR = makeUninternedSymbol("MT-VAR");

    public static final SubLSymbol $sym325$TV_VAR = makeUninternedSymbol("TV-VAR");

    public static final SubLSymbol DO_TRUE_SPEC_LINKS = makeSymbol("DO-TRUE-SPEC-LINKS");

    public static final SubLList $list327 = list(list(makeSymbol("GENL-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_ALL_SIMPLE_FORWARD_TRUE_LINKS = makeSymbol("DO-ALL-SIMPLE-FORWARD-TRUE-LINKS");

    public static final SubLList $list329 = list(list(makeSymbol("GENL-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list330 = list(list(makeSymbol("GENL"), makeSymbol("SPEC"), makeSymbol("DOMAIN-MT"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym331$GENLS = makeUninternedSymbol("GENLS");



    public static final SubLList $list333 = list(list(makeSymbol("SPEC-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS = makeSymbol("DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS");

    public static final SubLList $list335 = list(list(makeSymbol("SPEC-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list336 = list(list(makeSymbol("SPEC"), makeSymbol("TERM"), makeSymbol("DOMAIN-MT"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym337$SPECS = makeUninternedSymbol("SPECS");



    public static final SubLSymbol ALL_SPECS = makeSymbol("ALL-SPECS");

    public static final SubLList $list340 = list(list(makeSymbol("GENL-PREDICATE-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list341 = list(makeSymbol("GET-SBHL-MODULE"), reader_make_constant_shell(makeString("genlPreds")));

    public static final SubLList $list342 = list(list(makeSymbol("GENL-PREDICATE-LINKS-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list343 = list(list(makeSymbol("SPEC-PREDICATE-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list344 = list(list(makeSymbol("SPEC-PREDICATE-LINKS-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list345 = list(list(makeSymbol("GENL-PREDICATE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES = makeSymbol("DO-ALL-SIMPLE-FORWARD-TRUE-LINKS-FOR-INVERSES");

    public static final SubLList $list347 = list(list(makeSymbol("GENL-PREDICATE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list348 = list(list(makeSymbol("GENL-PREDICATE-VAR"), makeSymbol("INVERSE-MODE-P"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_ALL_MODE_FORWARD_TRUE_LINKS_FOR_INVERSES = makeSymbol("DO-ALL-MODE-FORWARD-TRUE-LINKS-FOR-INVERSES");

    public static final SubLList $list350 = list(list(makeSymbol("SPEC-PREDICATE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES = makeSymbol("DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS-FOR-INVERSES");

    public static final SubLList $list352 = list(list(makeSymbol("SPEC-PREDICATE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list353 = list(list(makeSymbol("SPEC-VAR"), makeSymbol("INVERSE-MODE-P"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_ALL_MODE_BACKWARD_TRUE_LINKS_FOR_INVERSES = makeSymbol("DO-ALL-MODE-BACKWARD-TRUE-LINKS-FOR-INVERSES");

    public static final SubLSymbol ALL_PROPER_GENL_PREDICATES = makeSymbol("ALL-PROPER-GENL-PREDICATES");

    public static final SubLList $list356 = list(list(makeSymbol("GENL-INVERSE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol ALL_PROPER_GENL_INVERSES = makeSymbol("ALL-PROPER-GENL-INVERSES");

    public static final SubLList $list358 = list(list(makeSymbol("GENL-INVERSE-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list359 = list(makeSymbol("GET-SBHL-MODULE"), reader_make_constant_shell(makeString("genlInverse")));

    public static final SubLList $list360 = list(list(makeSymbol("GENL-INVERSE-LINKS-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list361 = list(list(makeSymbol("SPEC-INVERSE-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list362 = list(list(makeSymbol("SPEC-INVERSE-LINKS-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list363 = list(list(makeSymbol("GENL-INVERSE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list364 = list(list(makeSymbol("SPEC-INVERSE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list365 = list(list(makeSymbol("SPEC-INVERSE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list366 = list(list(makeSymbol("PRED-VAR"), makeSymbol("INVERSE-MODE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol DO_ALL_PREDS_AND_INVERSES = makeSymbol("DO-ALL-PREDS-AND-INVERSES");

    public static final SubLList $list368 = list(list(new SubLObject[]{ makeSymbol("PRED-VAR"), makeSymbol("INVERSE-MODE-VAR"), makeSymbol("PRED"), makeSymbol("DIRECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym369$MODULE = makeUninternedSymbol("MODULE");

    public static final SubLSymbol $sym370$NODE_VAR = makeUninternedSymbol("NODE-VAR");

    public static final SubLSymbol $sym371$NODE_AND_PREDICATE_MODE = makeUninternedSymbol("NODE-AND-PREDICATE-MODE");

    public static final SubLSymbol $sym372$PREDICATE_MODE = makeUninternedSymbol("PREDICATE-MODE");

    public static final SubLSymbol $sym373$DECK_TYPE = makeUninternedSymbol("DECK-TYPE");

    public static final SubLSymbol $sym374$RECUR_DECK = makeUninternedSymbol("RECUR-DECK");

    public static final SubLSymbol $sym375$NODE_VARS_LINK_NODE = makeUninternedSymbol("NODE-VARS-LINK-NODE");

    public static final SubLList $list376 = list(list(makeSymbol("GET-SBHL-MODULE"), reader_make_constant_shell(makeString("genlPreds"))));

    public static final SubLList $list377 = list(list(makeSymbol("GENL-MT-VAR"), makeSymbol("MT-MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list378 = list(makeSymbol("GET-SBHL-MODULE"), reader_make_constant_shell(makeString("genlMt")));

    public static final SubLList $list379 = list(list(makeSymbol("GENL-MT-LINKS-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT-MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list380 = list(list(makeSymbol("SPEC-MT-VAR"), makeSymbol("MT-MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list381 = list(list(makeSymbol("SPEC-MT-LINKS-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT-MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list382 = list(list(makeSymbol("GENL-MT-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT-MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list383 = list(list(makeSymbol("GENL-MT-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT-MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list384 = list(list(makeSymbol("SPEC-MT-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT-MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list385 = list(list(makeSymbol("SPEC-MT-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT-MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static SubLObject do_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject tv = NIL;
        SubLObject tv_links = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        tv = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        tv_links = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list0);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject link_nodes = $sym1$LINK_NODES;
            return list(CLET, list(list(link_nodes, list(GET_SBHL_LINK_NODES, tv_links, tv))), list(PWHEN, link_nodes, listS(DO_SET_OR_LIST, list(link_node_var, link_nodes, $DONE, done_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject do_sbhl_tv_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tv_var = NIL;
        SubLObject link_nodes_var = NIL;
        SubLObject tv_links = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        link_nodes_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        tv_links = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list7);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_DICTIONARY, list(tv_var, link_nodes_var, tv_links, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static SubLObject do_sbhl_mt_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tv_var = NIL;
        SubLObject link_nodes_var = NIL;
        SubLObject mt = NIL;
        SubLObject mt_links = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        link_nodes_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        mt_links = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list9);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject tv_links = $sym10$TV_LINKS;
            return list(CLET, list(list(tv_links, list(GET_SBHL_TV_LINKS, mt_links, mt))), list(PWHEN, tv_links, listS(DO_SBHL_TV_LINKS, list(tv_var, link_nodes_var, tv_links, done_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list9);
        return NIL;
    }

    public static SubLObject do_sbhl_mt_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mt_var = NIL;
        SubLObject tv_links_var = NIL;
        SubLObject mt_links = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        tv_links_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        mt_links = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list13);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_DICTIONARY, list(mt_var, tv_links_var, mt_links, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list13);
        return NIL;
    }

    public static SubLObject do_sbhl_direction_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mt_var = NIL;
        SubLObject tv_links_var = NIL;
        SubLObject direction = NIL;
        SubLObject d_link = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list14);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        tv_links_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        d_link = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list14);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject mt_links = $sym15$MT_LINKS;
            return list(CLET, list(list(mt_links, list(GET_SBHL_MT_LINKS, d_link, direction, module))), list(PWHEN, mt_links, listS(DO_DICTIONARY, list(mt_var, tv_links_var, mt_links, done_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list14);
        return NIL;
    }

    public static SubLObject do_sbhl_graph_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject direction_var = NIL;
        SubLObject mt_links_var = NIL;
        SubLObject node = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list17);
        direction_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        mt_links_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list17);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject d_link = $sym18$D_LINK;
            return list(CLET, list(list(d_link, list(GET_SBHL_GRAPH_LINK, node, module))), list(PWHEN, d_link, list(DO_RELEVANT_SBHL_DIRECTIONS, list(direction_var, module, done_var), list(CLET, list(list(mt_links_var, list(GET_SBHL_MT_LINKS, d_link, direction_var, module))), listS(PWHEN, mt_links_var, append(body, NIL))))));
        }
        cdestructuring_bind_error(datum, $list17);
        return NIL;
    }

    public static SubLObject do_sbhl_forward_true_link_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mt_var = NIL;
        SubLObject node = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list21);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject direction = $sym22$DIRECTION;
            final SubLObject mt_links = $sym23$MT_LINKS;
            final SubLObject tv_links = $sym24$TV_LINKS;
            return list(POSSIBLY_WITH_SBHL_MODULE, module, list(WITH_SBHL_FORWARD_LINK_DIRECTION_FOR_MODULE, module, list(DO_SBHL_GRAPH_LINK, list(direction, mt_links, node, module, done_var), list(PWHEN, list(SBHL_FORWARD_DIRECTION_FOR_MODULE_P, direction, module), list(DO_SBHL_MT_LINKS, list(mt_var, tv_links, mt_links, done_var), listS(PWHEN, list(ANY_SBHL_TRUE_LINK_NODES_P, tv_links), append(body, NIL)))))));
        }
        cdestructuring_bind_error(datum, $list21);
        return NIL;
    }

    public static SubLObject do_sbhl_forward_true_link_nodes_and_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject node = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list31);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list31);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject direction = $sym32$DIRECTION;
            final SubLObject mt_links = $sym33$MT_LINKS;
            final SubLObject tv_links = $sym34$TV_LINKS;
            final SubLObject tv = $sym35$TV;
            final SubLObject link_nodes = $sym36$LINK_NODES;
            return list(POSSIBLY_WITH_SBHL_MODULE, module, list(WITH_SBHL_FORWARD_LINK_DIRECTION_FOR_MODULE, module, list(DO_SBHL_GRAPH_LINK, list(direction, mt_links, node, module, done_var), list(PWHEN, list(SBHL_FORWARD_DIRECTION_FOR_MODULE_P, direction, module), list(DO_SBHL_MT_LINKS, list(mt_var, tv_links, mt_links, done_var), list(DO_SBHL_TV_LINKS, list(tv, link_nodes, tv_links, done_var), list(PWHEN, list(SBHL_TRUE_TV_P, tv), listS(DO_SET_OR_LIST, list(link_node_var, link_nodes), append(body, NIL)))))))));
        }
        cdestructuring_bind_error(datum, $list31);
        return NIL;
    }

    public static SubLObject do_all_sbhl_tv_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject direction_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject link_nodes_var = NIL;
        SubLObject node = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list38);
        direction_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        link_nodes_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list38);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject mt_links = $sym39$MT_LINKS;
            final SubLObject tv_links = $sym40$TV_LINKS;
            return list(DO_SBHL_GRAPH_LINK, list(direction_var, mt_links, node, module, done_var), list(DO_SBHL_MT_LINKS, list(mt_var, tv_links, mt_links, done_var), listS(DO_SBHL_TV_LINKS, list(tv_var, link_nodes_var, tv_links, done_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list38);
        return NIL;
    }

    public static SubLObject do_all_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject direction_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject link_node_var = NIL;
        SubLObject node = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list41);
        direction_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list41);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject link_nodes_var = $sym42$LINK_NODES_VAR;
            return list(DO_ALL_SBHL_TV_LINKS, list(direction_var, mt_var, tv_var, link_nodes_var, node, module, done_var), listS(DO_SET_OR_LIST, list(link_node_var, link_nodes_var, $DONE, done_var), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list41);
        return NIL;
    }

    public static SubLObject do_all_sbhl_forward_true_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject node = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list44);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list44);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject link_nodes_var = $sym45$LINK_NODES_VAR;
            final SubLObject direction = $sym46$DIRECTION;
            final SubLObject mt_links = $sym47$MT_LINKS;
            final SubLObject tv_links = $sym48$TV_LINKS;
            return list(POSSIBLY_WITH_SBHL_MODULE, module, list(DO_SBHL_GRAPH_LINK, list(direction, mt_links, node, module, done_var), list(PWHEN, list(EQ, direction, list(GET_SBHL_MODULE_FORWARD_DIRECTION, module)), list(DO_SBHL_MT_LINKS, list(mt_var, tv_links, mt_links, done_var), list(DO_SBHL_TV_LINKS, list(tv_var, link_nodes_var, tv_links, done_var), list(PWHEN, list(SBHL_TRUE_TV_P, tv_var), listS(DO_SET_OR_LIST, list(link_node_var, link_nodes_var, $DONE, done_var), append(body, NIL))))))));
        }
        cdestructuring_bind_error(datum, $list44);
        return NIL;
    }

    public static SubLObject do_all_sbhl_backward_true_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject node = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list44);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list44);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list44);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject link_nodes_var = $sym50$LINK_NODES_VAR;
            final SubLObject direction = $sym51$DIRECTION;
            final SubLObject mt_links = $sym52$MT_LINKS;
            final SubLObject tv_links = $sym53$TV_LINKS;
            return list(POSSIBLY_WITH_SBHL_MODULE, module, list(DO_SBHL_GRAPH_LINK, list(direction, mt_links, node, module, done_var), list(PWHEN, list(EQ, direction, list(GET_SBHL_MODULE_BACKWARD_DIRECTION, module)), list(DO_SBHL_MT_LINKS, list(mt_var, tv_links, mt_links, done_var), list(DO_SBHL_TV_LINKS, list(tv_var, link_nodes_var, tv_links, done_var), list(PWHEN, list(SBHL_TRUE_TV_P, tv_var), listS(DO_SET_OR_LIST, list(link_node_var, link_nodes_var, $DONE, done_var), append(body, NIL))))))));
        }
        cdestructuring_bind_error(datum, $list44);
        return NIL;
    }

    public static SubLObject with_sbhl_graph_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject d_link_var = NIL;
        SubLObject node = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        d_link_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        module = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(list(d_link_var, list(GET_SBHL_GRAPH_LINK, node, module))), listS(PIF, d_link_var, append(body, $list57)));
        }
        cdestructuring_bind_error(datum, $list55);
        return NIL;
    }

    public static SubLObject with_relevant_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = NIL;
        SubLObject start_node = NIL;
        SubLObject direction = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        link_nodes_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        start_node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list58);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject node = $sym59$NODE;
            return list(CLET, list(list(node, list(NAUT_TO_NART, start_node))), list(PCOND, list(list(SBHL_NODE_OBJECT_P, node), listS(WITH_RELEVANT_SBHL_FORT_LINK_NODES, list(link_nodes_var, node, direction, module, done_var), append(body, NIL))), list(list(CNAT_P, node), listS(DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS, list(link_nodes_var, node, direction, module, done_var), append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list58);
        return NIL;
    }

    public static SubLObject with_relevant_sbhl_link_nodes_and_non_forts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = NIL;
        SubLObject start_node = NIL;
        SubLObject direction = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        link_nodes_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        start_node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list58);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject node = $sym66$NODE;
            return list(CLET, list(list(node, list(NAUT_TO_NART, start_node))), list(PCOND, list(list(SBHL_NODE_OBJECT_P, node), listS(WITH_RELEVANT_SBHL_FORT_LINK_NODES, list(link_nodes_var, node, direction, module, done_var), append(body, NIL)), listS(WITH_SBHL_NON_FORT_LINKS, list(link_nodes_var, node, module, done_var), append(body, NIL))), list(list(CNAT_P, node), listS(DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS, list(link_nodes_var, node, direction, module, done_var), append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list58);
        return NIL;
    }

    public static SubLObject with_relevant_sbhl_fort_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list68);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = NIL;
        SubLObject node = NIL;
        SubLObject direction = NIL;
        SubLObject module = NIL;
        SubLObject done_var = NIL;
        destructuring_bind_must_consp(current, datum, $list68);
        link_nodes_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list68);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list68);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list68);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list68);
        done_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject d_link = $sym69$D_LINK;
            final SubLObject mt = $sym70$MT;
            final SubLObject tv_links = $sym71$TV_LINKS;
            final SubLObject tv = $sym72$TV;
            return list(WITH_SBHL_GRAPH_LINK, list(d_link, node, module), list(DO_SBHL_DIRECTION_LINK, list(mt, tv_links, direction, d_link, module, done_var), list(PWHEN, list($sym75$RELEVANT_MT_, mt), list(CLET, list(list($sbhl_link_mt$, mt)), list(DO_SBHL_TV_LINKS, list(tv, link_nodes_var, tv_links, done_var), list(PWHEN, list($sym77$RELEVANT_SBHL_TV_, tv), listS(CLET, list(list($sbhl_link_tv$, tv)), append(body, NIL))))))));
        }
        cdestructuring_bind_error(datum, $list68);
        return NIL;
    }

    public static SubLObject do_non_fort_direct_instance_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject ins_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject col = NIL;
        SubLObject done_var = NIL;
        destructuring_bind_must_consp(current, datum, $list79);
        ins_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        col = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        done_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject instance_tuple = $sym80$INSTANCE_TUPLE;
            return list(CSOME, list(instance_tuple, list(NON_FORT_INSTANCE_TABLE_LOOKUP, col), done_var), listS(CDESTRUCTURING_BIND, list(ins_var, mt_var, tv_var), instance_tuple, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list79);
        return NIL;
    }

    public static SubLObject with_sbhl_non_fort_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = NIL;
        SubLObject node = NIL;
        SubLObject module = NIL;
        SubLObject done_var = NIL;
        destructuring_bind_must_consp(current, datum, $list84);
        link_nodes_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        done_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject link_node = $sym85$LINK_NODE;
            final SubLObject mt = $sym86$MT;
            final SubLObject tv = $sym87$TV;
            return list(PWHEN, list($sym88$DO_SBHL_NON_FORT_LINKS_, node, module), list(DO_NON_FORT_DIRECT_INSTANCE_LINKS, list(link_node, mt, tv, node, done_var), list(PWHEN, list($sym75$RELEVANT_MT_, mt), list(CLET, list(list($sbhl_link_mt$, mt)), list(PWHEN, list($sym77$RELEVANT_SBHL_TV_, tv), list(CLET, list(list($sbhl_link_tv$, tv)), listS(CLET, list(list(link_nodes_var, list(LIST, link_node))), append(body, NIL))))))));
        }
        cdestructuring_bind_error(datum, $list84);
        return NIL;
    }

    public static SubLObject do_sbhl_non_fort_linksP(final SubLObject node, final SubLObject module) {
        return makeBoolean(module.eql(sbhl_module_vars.get_sbhl_module($$isa)) && (NIL != collection_supports_non_fort_instancesP(node)));
    }

    public static SubLObject collection_supports_non_fort_instancesP(final SubLObject col) {
        return T;
    }

    public static SubLObject admissible_non_fort_link_nodeP(final SubLObject link_node) {
        return forts.non_fort_p(link_node);
    }

    public static SubLObject do_relevant_sbhl_naut_generated_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = NIL;
        SubLObject node = NIL;
        SubLObject direction = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list94);
        link_nodes_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list94);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject generating_fn = $sym95$GENERATING_FN;
            return list(SBHL_CSOME, list(generating_fn, list(GET_SBHL_MODULE_RELEVANT_NAUT_LINK_GENERATORS, direction, $sbhl_tv$, module), done_var), list(CLET, list(list($sbhl_link_generator$, generating_fn)), listS(CLET, list(list(link_nodes_var, list(FUNCALL, generating_fn, node))), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list94);
        return NIL;
    }

    public static SubLObject do_relevant_forward_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list101);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list101);
        link_nodes_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list101);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list101);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list101);
        current = current.rest();
        final SubLObject module = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list101);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list101);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TV, tv, listS(POSSIBLY_WITH_SBHL_MODULE, module, list(WITH_RELEVANT_SBHL_LINK_NODES, list(link_nodes_var, node, list(GET_SBHL_MODULE_FORWARD_DIRECTION, module), module, done_var)), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list101);
        return NIL;
    }

    public static SubLObject do_relevant_backward_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list101);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list101);
        link_nodes_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list101);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list101);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list101);
        current = current.rest();
        final SubLObject module = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list101);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list101);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TV, tv, listS(POSSIBLY_WITH_SBHL_MODULE, module, list(WITH_RELEVANT_SBHL_LINK_NODES, list(link_nodes_var, node, list(GET_SBHL_MODULE_BACKWARD_DIRECTION, module), module, done_var)), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list101);
        return NIL;
    }

    public static SubLObject with_accessible_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = NIL;
        SubLObject node = NIL;
        SubLObject direction = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list94);
        link_nodes_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list94);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(DO_WITH_RELEVANT_SBHL_MODULES, list(module, done_var), list(POSSIBLY_FLIP_GENL_INVERSE_MODE, listS(WITH_RELEVANT_SBHL_LINK_NODES, list(link_nodes_var, node, direction, $list107, done_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list94);
        return NIL;
    }

    public static SubLObject with_accessible_sbhl_link_nodes_and_non_forts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_nodes_var = NIL;
        SubLObject node = NIL;
        SubLObject direction = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list94);
        link_nodes_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list94);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(DO_WITH_RELEVANT_SBHL_MODULES, list(module, done_var), list(POSSIBLY_FLIP_GENL_INVERSE_MODE, listS(WITH_RELEVANT_SBHL_LINK_NODES_AND_NON_FORTS, list(link_nodes_var, node, direction, $list107, done_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list94);
        return NIL;
    }

    public static SubLObject do_accessible_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list109);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject node = NIL;
        SubLObject direction = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list109);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list109);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list109);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list109);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list109);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject link_nodes = $sym110$LINK_NODES;
            return list(WITH_ACCESSIBLE_SBHL_LINK_NODES, list(link_nodes, node, direction, module, done_var), listS(DO_SET_OR_LIST, list(link_node_var, link_nodes, $DONE, done_var), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list109);
        return NIL;
    }

    public static SubLObject do_accessible_sbhl_link_nodes_and_non_forts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list109);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject node = NIL;
        SubLObject direction = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list109);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list109);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list109);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list109);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list109);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject link_nodes = $sym112$LINK_NODES;
            return list(WITH_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS, list(link_nodes, node, direction, module, done_var), listS(DO_SET_OR_LIST, list(link_node_var, link_nodes, $DONE, done_var), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list109);
        return NIL;
    }

    public static SubLObject do_accessible_sbhl_link_node_search_states(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list114);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_search_state_var = NIL;
        SubLObject node_search_state = NIL;
        destructuring_bind_must_consp(current, datum, $list114);
        link_node_search_state_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list114);
        node_search_state = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list114);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list114);
            if (NIL == member(current_$1, $list115, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list114);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SBHL_ITERATOR, list(link_node_search_state_var, list(NEW_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR, node_search_state), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_accessible_sbhl_tv_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list119);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tv_links_var = NIL;
        SubLObject node = NIL;
        SubLObject direction = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list119);
        tv_links_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list119);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list119);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list119);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list119);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(WITH_ACCESSIBLE_SBHL_LINK_NODES, list(tv_links_var, node, direction, module, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list119);
        return NIL;
    }

    public static SubLObject do_relevant_sbhl_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list109);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject node = NIL;
        SubLObject direction = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list109);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list109);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list109);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list109);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list109);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject link_nodes = $sym120$LINK_NODES;
            return list(POSSIBLY_WITH_SBHL_MODULE, module, list(WITH_RELEVANT_SBHL_LINK_NODES, list(link_nodes, node, direction, module, done_var), listS(DO_SET_OR_LIST, list(link_node_var, link_nodes, $DONE, done_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list109);
        return NIL;
    }

    public static SubLObject do_relevant_sbhl_forward_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject node = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list121);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list121);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_RELEVANT_SBHL_LINK_NODES, list(link_node_var, node, list(GET_SBHL_MODULE_FORWARD_DIRECTION, module), module, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list121);
        return NIL;
    }

    public static SubLObject do_relevant_sbhl_backward_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject node = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list121);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list121);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list121);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_RELEVANT_SBHL_LINK_NODES, list(link_node_var, node, list(GET_SBHL_MODULE_BACKWARD_DIRECTION, module), module, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list121);
        return NIL;
    }

    public static SubLObject do_sbhl_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list123);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred_var = NIL;
        destructuring_bind_must_consp(current, datum, $list123);
        pred_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list123);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(SMART_CSOME, list(pred_var, $list125, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list123);
        return NIL;
    }

    public static SubLObject do_sbhl_non_time_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list123);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred_var = NIL;
        destructuring_bind_must_consp(current, datum, $list123);
        pred_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list123);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject module = $sym126$MODULE;
            return list(DO_SBHL_MODULES, list(module, done_var), list(PUNLESS, list(SBHL_TIME_MODULE_P, module), listS(CLET, list(list(pred_var, list(GET_SBHL_LINK_PRED, module))), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list123);
        return NIL;
    }

    public static SubLObject do_sbhl_non_time_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list131);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module_var = NIL;
        destructuring_bind_must_consp(current, datum, $list131);
        module_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list131);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject module = $sym132$MODULE;
            return list(DO_SBHL_MODULES, list(module, done_var), list(PUNLESS, list(SBHL_TIME_MODULE_P, module), listS(CLET, list(list(module_var, module)), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list131);
        return NIL;
    }

    public static SubLObject do_sbhl_graphs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list133);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module_var = NIL;
        SubLObject graph_var = NIL;
        destructuring_bind_must_consp(current, datum, $list133);
        module_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list133);
        graph_var = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list133);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(DO_SBHL_MODULES, list(module_var, done_var), listS(CLET, list(list(graph_var, list(GET_SBHL_MODULE_GRAPH, module_var))), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list133);
        return NIL;
    }

    public static SubLObject with_forward_sbhl_link_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list135, append(body, NIL));
    }

    public static SubLObject with_backward_sbhl_link_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list136, append(body, NIL));
    }

    public static SubLObject with_sbhl_type_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list137);
        node = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PIF, list(COR, $list139, listS(APPLY_SBHL_MODULE_TYPE_TEST, node, $list141)), bq_cons(PROGN, append(body, NIL)), listS(SBHL_WARN, TWO_INTEGER, $str144$Node__a_does_not_pass_sbhl_type_t, node, $list145));
    }

    public static SubLObject do_sbhl_module_graph(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list146);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node_var = NIL;
        SubLObject link_var = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list146);
        node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list146);
        link_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list146);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list146);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_SBHL_GRAPH_LINKS, list(node_var, link_var, $MODULE, module, $DONE, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list146);
        return NIL;
    }

    public static SubLObject do_with_relevant_sbhl_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list149);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list149);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject module_var = $sym150$MODULE_VAR;
            final SubLObject accessible_modules = $sym151$ACCESSIBLE_MODULES;
            return list(CLET, list(list(accessible_modules, list(GET_SBHL_ACCESSIBLE_MODULES, module))), list(SMART_CSOME, list(module_var, accessible_modules, done_var), listS(WITH_SBHL_MODULE, module_var, append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list149);
        return NIL;
    }

    public static SubLObject get_sbhl_accessible_modules(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject preds = sbhl_module_utilities.get_sbhl_accessible_link_preds(module);
        return NIL != preds ? Mapping.mapcar(GET_SBHL_MODULE, preds) : list(module);
    }

    public static SubLObject do_relevant_sbhl_directions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject direction_var = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, datum, $list156);
        direction_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        module = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list156);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(SMART_CSOME, list(direction_var, list(GET_RELEVANT_SBHL_DIRECTIONS, module), done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list156);
        return NIL;
    }

    public static SubLObject bind_sbhl_search_behavior(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list158, append(body, NIL));
    }

    public static SubLObject bind_sbhl_boolean_goal_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list137);
        node = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject premarkingP = $sym159$PREMARKING_;
        final SubLObject goal_fn = $sym160$GOAL_FN;
        final SubLObject goal_node = $sym161$GOAL_NODE;
        final SubLObject goal_space = $sym162$GOAL_SPACE;
        return list(CLET, list(bq_cons(premarkingP, $list163), bq_cons(goal_fn, $list164), list(goal_node, node), bq_cons(goal_space, $list165)), list(PWHEN, premarkingP, list(WITH_SBHL_MODULE, $list166, list(POSSIBLY_PREMARK_WITH_GENL_INVERSE_MODE, list(SBHL_PREMARK_GATHER_NODES, goal_node))), listS(CSETQ, goal_fn, $list170), listS(CSETQ, goal_space, $list171)), list(RESET_SBHL_SEARCH_PARENT_MARKING, list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, list(WITH_SBHL_CONSIDER_NODE_FN, goal_fn, list(WITH_SBHL_GOAL_NODE, goal_node, listS(WITH_SBHL_GOAL_SPACE, goal_space, append(body, NIL)))))));
    }

    public static SubLObject sbhl_possibly_rebind_temporal_search_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = NIL;
        SubLObject link_node = NIL;
        destructuring_bind_must_consp(current, datum, $list177);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list177);
        link_node = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CLET, list($list178, list($sym179$_SBHL_TEMPORALITY_SEARCH_PASSED_THROUGH_DATE__, list(FWHEN, $list181, listS(COR, list(HL_DATE_POINT_P, node), $list183)))), list(PUNLESS, list(CAND, $list181, list(SBHL_TEMPORALITY_CONSEQUENT_LINKS_SEARCH_PASSED_THROUGH_LINK_P, list(SBHL_TEMPORAL_FAUX_LINK, node, link_node))), bq_cons(PROGN, append(body, NIL))));
    }

    public static SubLObject bind_sbhl_sample_leaf_search_behavior(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list187, append(body, NIL));
    }

    public static SubLObject do_all_simple_true_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject module = NIL;
        SubLObject direction = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list188);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list188);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list188);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list188);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list188);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : $BREADTH;
        destructuring_bind_must_listp(current, datum, $list188);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject node_var = $sym190$NODE_VAR;
            final SubLObject deck_type = $sym191$DECK_TYPE;
            final SubLObject recur_deck = $sym192$RECUR_DECK;
            final SubLObject node_vars_link_node = $sym193$NODE_VARS_LINK_NODE;
            return list(PUNLESS, done_var, list(CLET, list(list(node_var, node), list(deck_type, listS(FIF, listS(EQ, search_type, $list195), $list196)), list(recur_deck, list(CREATE_DECK, deck_type))), list(WITH_NEW_SBHL_SPACE, list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TRUE_TV, tv, list(WITH_SBHL_SEARCH_MODULE, module, list(WITH_SBHL_TYPE_TEST, node, list(WITH_SBHL_SEARCH_DIRECTION, direction, list(WITH_SBHL_LINK_DIRECTION, list(SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, direction, module), list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, list(SBHL_MARK_NODE_MARKED, node_var), list(WHILE, list(CAND, node_var, list(CNOT, done_var)), listS(CLET, list(list(link_node_var, node_var)), append(body, NIL)), list(DO_ACCESSIBLE_SBHL_LINK_NODES, list(node_vars_link_node, node_var, $list209, module, done_var), list(PUNLESS, list(SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node), list(SBHL_MARK_NODE_MARKED, node_vars_link_node), list(DECK_PUSH, node_vars_link_node, recur_deck))), list(CSETQ, node_var, list(DECK_POP, recur_deck)))))))))))));
        }
        cdestructuring_bind_error(datum, $list188);
        return NIL;
    }

    public static SubLObject do_all_simple_forward_true_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject module = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list213);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_TRUE_LINKS, list(link_node_var, module, $list215, node, mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list213);
        return NIL;
    }

    public static SubLObject do_all_simple_backward_true_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject module = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list213);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_TRUE_LINKS, list(link_node_var, module, $list216, node, mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list213);
        return NIL;
    }

    public static SubLObject do_all_simple_true_links_for_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list217);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject module = NIL;
        SubLObject direction = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list217);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list217);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list217);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list217);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list217);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list217);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list217);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : $DEPTH;
        destructuring_bind_must_listp(current, datum, $list217);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject node_var = $sym219$NODE_VAR;
            final SubLObject node_and_predicate_mode = $sym220$NODE_AND_PREDICATE_MODE;
            final SubLObject predicate_mode = $sym221$PREDICATE_MODE;
            final SubLObject deck_type = $sym222$DECK_TYPE;
            final SubLObject recur_deck = $sym223$RECUR_DECK;
            final SubLObject node_vars_link_node = $sym224$NODE_VARS_LINK_NODE;
            return list(PUNLESS, done_var, list(CLET, list(list(node_var, node), list(deck_type, listS(FIF, listS(EQ, search_type, $list225), $list226)), list(recur_deck, list(CREATE_DECK, deck_type)), node_and_predicate_mode), list(WITH_NEW_SBHL_SPACE, list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TRUE_TV, tv, list(WITH_SBHL_SEARCH_MODULE, module, list(WITH_SBHL_TYPE_TEST, node, list(WITH_SBHL_SEARCH_DIRECTION, direction, list(WITH_SBHL_LINK_DIRECTION, list(SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, direction, module), list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, list(SBHL_MARK_NODE_MARKED, node_var), list(CSETQ, node_and_predicate_mode, listS(LIST, node, $list227)), list(WHILE, list(CAND, node_and_predicate_mode, list(CNOT, done_var)), list(CLET, list(list(node_var, list(FIRST, node_and_predicate_mode)), list(predicate_mode, list(SECOND, node_and_predicate_mode)), list(link_node_var, node_var)), list(WITH_SBHL_PREDICATE_MODE, predicate_mode, listS(PWHEN, list(APPLY_SBHL_ADD_NODE_TEST, $list232, node_var), append(body, NIL)), list(DO_ACCESSIBLE_SBHL_LINK_NODES, list(node_vars_link_node, node_var, $list209, module, done_var), list(PUNLESS, list(SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node), list(SBHL_MARK_NODE_MARKED, node_vars_link_node), list(DECK_PUSH, listS(LIST, node_vars_link_node, $list227), recur_deck))))), list(CSETQ, node_and_predicate_mode, list(DECK_POP, recur_deck)))))))))))));
        }
        cdestructuring_bind_error(datum, $list217);
        return NIL;
    }

    public static SubLObject do_all_simple_forward_true_links_for_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject module = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list213);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES, list(link_node_var, module, $list215, node, mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list213);
        return NIL;
    }

    public static SubLObject do_all_simple_backward_true_links_for_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject module = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list213);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES, list(link_node_var, module, $list216, node, mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list213);
        return NIL;
    }

    public static SubLObject do_all_mode_true_links_for_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list234);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject mode_var = NIL;
        SubLObject module = NIL;
        SubLObject direction = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list234);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list234);
        mode_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list234);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list234);
        direction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list234);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list234);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list234);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list234);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : $DEPTH;
        destructuring_bind_must_listp(current, datum, $list234);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject node_var = $sym235$NODE_VAR;
            final SubLObject node_and_predicate_mode = $sym236$NODE_AND_PREDICATE_MODE;
            final SubLObject predicate_mode = $sym237$PREDICATE_MODE;
            final SubLObject deck_type = $sym238$DECK_TYPE;
            final SubLObject recur_deck = $sym239$RECUR_DECK;
            final SubLObject node_vars_link_node = $sym240$NODE_VARS_LINK_NODE;
            return list(PUNLESS, done_var, list(CLET, list(list(node_var, node), list(deck_type, listS(FIF, listS(EQ, search_type, $list225), $list226)), list(recur_deck, list(CREATE_DECK, deck_type)), node_and_predicate_mode), list(WITH_NEW_SBHL_SPACE, list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TRUE_TV, tv, list(WITH_SBHL_SEARCH_MODULE, module, list(WITH_SBHL_TYPE_TEST, node, list(WITH_SBHL_SEARCH_DIRECTION, direction, list(WITH_SBHL_LINK_DIRECTION, list(SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, direction, module), list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, list(SBHL_MARK_NODE_MARKED, node_var), list(CSETQ, node_and_predicate_mode, listS(LIST, node, $list227)), list(WHILE, list(CAND, node_and_predicate_mode, list(CNOT, done_var)), list(CLET, list(list(node_var, list(FIRST, node_and_predicate_mode)), list(predicate_mode, list(SECOND, node_and_predicate_mode)), list(link_node_var, node_var)), list(WITH_SBHL_PREDICATE_MODE, predicate_mode, list(PROGN, listS(CLET, list(list(mode_var, predicate_mode)), append(body, NIL)), list(DO_ACCESSIBLE_SBHL_LINK_NODES, list(node_vars_link_node, node_var, $list209, module, done_var), list(PUNLESS, list(SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node), list(SBHL_MARK_NODE_MARKED, node_vars_link_node), list(DECK_PUSH, listS(LIST, node_vars_link_node, $list227), recur_deck)))))), list(CSETQ, node_and_predicate_mode, list(DECK_POP, recur_deck)))))))))))));
        }
        cdestructuring_bind_error(datum, $list234);
        return NIL;
    }

    public static SubLObject do_all_mode_backward_true_links_for_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list241);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject mode_var = NIL;
        SubLObject module = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list241);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list241);
        mode_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list241);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list241);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list241);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list241);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list241);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list241);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_MODE_TRUE_LINKS_FOR_INVERSES, list(new SubLObject[]{ link_node_var, mode_var, module, $list216, node, mt, tv, done_var, search_type }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list241);
        return NIL;
    }

    public static SubLObject do_all_mode_forward_true_links_for_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list241);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject mode_var = NIL;
        SubLObject module = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list241);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list241);
        mode_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list241);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list241);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list241);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list241);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list241);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list241);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_MODE_TRUE_LINKS_FOR_INVERSES, list(new SubLObject[]{ link_node_var, mode_var, module, $list215, node, mt, tv, done_var, search_type }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list241);
        return NIL;
    }

    public static SubLObject do_all_forward_true_links_for_tt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject module = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list213);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject node_var = $sym243$NODE_VAR;
            final SubLObject deck_type = $sym244$DECK_TYPE;
            final SubLObject recur_deck = $sym245$RECUR_DECK;
            final SubLObject node_vars_link_node = $sym246$NODE_VARS_LINK_NODE;
            return list(PUNLESS, done_var, list(CLET, list(list(node_var, node), list(deck_type, listS(FIF, listS(EQ, search_type, $list225), $list226)), list(recur_deck, list(CREATE_DECK, deck_type))), list(WITH_NEW_SBHL_SPACE, list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TRUE_TV, tv, list(WITH_SBHL_SEARCH_MODULE, module, list(WITH_SBHL_TYPE_TEST, node, list(WITH_SBHL_FORWARD_SEARCH_DIRECTION, list(WITH_SBHL_FORWARD_LINK_DIRECTION, list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, list(DO_ACCESSIBLE_SBHL_LINK_NODES, list(node_vars_link_node, node_var, $list209, module, done_var), list(PUNLESS, list(SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node), list(SBHL_MARK_NODE_MARKED, node_vars_link_node), list(DECK_PUSH, node_vars_link_node, recur_deck))), list(CSETQ, node_var, list(DECK_POP, recur_deck)), list(WITH_SBHL_MODULE, $list166, list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, list(WITH_SBHL_FORWARD_LINK_DIRECTION, list(WHILE, list(CAND, node_var, list(CNOT, done_var)), listS(CLET, list(list(link_node_var, node_var)), append(body, NIL)), list(DO_ACCESSIBLE_SBHL_LINK_NODES, list(node_vars_link_node, node_var, $list209, $list107, done_var), list(PUNLESS, list(SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node), list(SBHL_MARK_NODE_MARKED, node_vars_link_node), list(DECK_PUSH, node_vars_link_node, recur_deck))), list(CSETQ, node_var, list(DECK_POP, recur_deck))))))))))))))));
        }
        cdestructuring_bind_error(datum, $list213);
        return NIL;
    }

    public static SubLObject do_all_backward_true_links_for_tt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject module = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list213);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list213);
        node = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list213);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject node_var = $sym249$NODE_VAR;
            final SubLObject tt_node_var = $sym250$TT_NODE_VAR;
            return list(CLET, list(list(node_var, node)), list(WITH_SBHL_MODULE, module, list(WITH_NEW_SBHL_GATHER_SPACE, list(DO_ALL_SIMPLE_TRUE_LINKS, list(tt_node_var, list(GET_SBHL_TRANSFERS_THROUGH_MODULE, module), $list216, node_var, mt, tv, done_var, search_type), list(DO_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS, list(link_node_var, tt_node_var, list(GET_SBHL_MODULE_BACKWARD_DIRECTION, module), module, done_var), listS(PUNLESS, listS(SBHL_SEARCH_PATH_TERMINATION_P, link_node_var, $list171), listS(SBHL_MARK_NODE_MARKED, link_node_var, $list171), append(body, NIL)))))));
        }
        cdestructuring_bind_error(datum, $list213);
        return NIL;
    }

    public static SubLObject do_true_isa_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list254);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list254);
        isa_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list254);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list254);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list254);
        v_term = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list254);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, list(isa_var, tv_var, mt_var, v_term, $list256, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list254);
        return NIL;
    }

    public static SubLObject do_relevant_isa_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list257);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_links_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list257);
        isa_links_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list257);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list257);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list257);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list257);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_RELEVANT_FORWARD_SBHL_LINK_NODES, list(isa_links_var, v_term, mt, tv, $list256, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list257);
        return NIL;
    }

    public static SubLObject do_local_isas(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list259);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list259);
        isa_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list259);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list259);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list259);
            if (NIL == member(current_$2, $list260, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list259);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject mt_var = $sym262$MT_VAR;
        final SubLObject tv_var = $sym263$TV_VAR;
        return list(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, list(DO_TRUE_ISA_LINKS, list(isa_var, mt_var, tv_var, v_term, done), list(IGNORE, tv_var), listS(PWHEN, list($sym75$RELEVANT_MT_, mt_var), append(body, NIL))));
    }

    public static SubLObject some_relevant_isa(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list267);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list267);
        isa_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list267);
        v_term = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list267);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject link_nodes = $sym268$LINK_NODES;
            return list(POSSIBLY_WITH_SBHL_TRUE_TV, NIL, list(WITH_RELEVANT_SBHL_LINK_NODES, list(link_nodes, v_term, $list269, $list256, done_var), listS(DO_SET_OR_LIST, list(isa_var, link_nodes, $DONE, done_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list267);
        return NIL;
    }

    public static SubLObject do_true_instance_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list270);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list270);
        instance_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list270);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list270);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list270);
        v_term = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list270);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, list(instance_var, tv_var, mt_var, v_term, $list256, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list270);
        return NIL;
    }

    public static SubLObject do_relevant_instance_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list272);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_links_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list272);
        instance_links_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list272);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list272);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list272);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list272);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, list(instance_links_var, v_term, mt, tv, $list256, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list272);
        return NIL;
    }

    public static SubLObject do_local_instances(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list274);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list274);
        instance_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list274);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list274);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list274);
            if (NIL == member(current_$3, $list260, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list274);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject mt_var = $sym275$MT_VAR;
        final SubLObject tv_var = $sym276$TV_VAR;
        return list(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, list(DO_TRUE_INSTANCE_LINKS, list(instance_var, mt_var, tv_var, col, done), list(IGNORE, tv_var), listS(PWHEN, list($sym75$RELEVANT_MT_, mt_var), append(body, NIL))), list(DO_NON_FORT_DIRECT_INSTANCE_LINKS, list(instance_var, mt_var, tv_var, col, done), list(PWHEN, list(SBHL_TRUE_TV_P, tv_var), listS(PWHEN, list($sym75$RELEVANT_MT_, mt_var), append(body, NIL)))));
    }

    public static SubLObject do_true_quoted_isa_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list278);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject quoted_isa_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list278);
        quoted_isa_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list278);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list278);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list278);
        v_term = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list278);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, list(quoted_isa_var, tv_var, mt_var, v_term, $list279, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list278);
        return NIL;
    }

    public static SubLObject do_local_quoted_isas(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list280);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject quoted_isa_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list280);
        quoted_isa_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list280);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list280);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list280);
            if (NIL == member(current_$4, $list260, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list280);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject mt_var = $sym281$MT_VAR;
        final SubLObject tv_var = $sym282$TV_VAR;
        return list(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, list(DO_TRUE_QUOTED_ISA_LINKS, list(quoted_isa_var, mt_var, tv_var, v_term, done), list(IGNORE, tv_var), listS(PWHEN, list($sym75$RELEVANT_MT_, mt_var), append(body, NIL))));
    }

    public static SubLObject do_true_quoted_instance_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list270);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list270);
        instance_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list270);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list270);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list270);
        v_term = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list270);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, list(instance_var, tv_var, mt_var, v_term, $list279, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list270);
        return NIL;
    }

    public static SubLObject do_local_quoted_instances(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list284);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject quoted_instance_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list284);
        quoted_instance_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list284);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list284);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list284);
            if (NIL == member(current_$5, $list260, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list284);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject mt_var = $sym285$MT_VAR;
        final SubLObject tv_var = $sym286$TV_VAR;
        return list(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, list(DO_TRUE_QUOTED_INSTANCE_LINKS, list(quoted_instance_var, mt_var, tv_var, col, done), list(IGNORE, tv_var), listS(PWHEN, list($sym75$RELEVANT_MT_, mt_var), append(body, NIL))));
    }

    public static SubLObject do_all_isa(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list288);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list288);
        isa_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list288);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list288);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list288);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list288);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list288);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_FORWARD_TRUE_LINKS_FOR_TT, list(isa_var, $list256, v_term, mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list288);
        return NIL;
    }

    public static SubLObject do_all_isa_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list290);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list290);
        isa_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list290);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list290);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list290);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list290);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_FORWARD_TRUE_LINKS_FOR_TT, listS(isa_var, new SubLObject[]{ $list256, v_term, mt, tv, done_var, $list225 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list290);
        return NIL;
    }

    public static SubLObject do_all_isa_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list290);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject isa_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list290);
        isa_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list290);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list290);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list290);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list290);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_FORWARD_TRUE_LINKS_FOR_TT, listS(isa_var, new SubLObject[]{ $list256, v_term, mt, tv, done_var, $list195 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list290);
        return NIL;
    }

    public static SubLObject do_all_isas_by_generality(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list291);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_isa = NIL;
        SubLObject v_term = NIL;
        SubLObject domain_mt = NIL;
        SubLObject doneP = NIL;
        destructuring_bind_must_consp(current, datum, $list291);
        v_isa = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list291);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list291);
        domain_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list291);
        doneP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject isas = $sym292$ISAS;
            return list(WITH_MT, domain_mt, list(CLET, list(list(isas, list(SORT_BY_GENERALITY_ESTIMATE, list(ALL_ISA, v_term)))), listS(CSOME, list(v_isa, isas, doneP), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list291);
        return NIL;
    }

    public static SubLObject do_all_instances(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list296);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list296);
        instance_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list296);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT, list(instance_var, $list256, v_term, mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list296);
        return NIL;
    }

    public static SubLObject do_all_instances_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list300);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list300);
        instance_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list300);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list300);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list300);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list300);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT, listS(instance_var, new SubLObject[]{ $list256, v_term, mt, tv, done_var, $list225 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list300);
        return NIL;
    }

    public static SubLObject do_all_instances_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list300);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list300);
        instance_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list300);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list300);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list300);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list300);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT, listS(instance_var, new SubLObject[]{ $list256, v_term, mt, tv, done_var, $list195 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list300);
        return NIL;
    }

    public static SubLObject do_all_fort_instances(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list296);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list296);
        instance_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list296);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(DO_ALL_INSTANCES, list(instance_var, v_term, mt, tv, done_var, search_type), listS(PWHEN, list(FORT_P, instance_var), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list296);
        return NIL;
    }

    public static SubLObject do_all_instances_of_all(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list304);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = NIL;
        SubLObject terms = NIL;
        destructuring_bind_must_consp(current, datum, $list304);
        instance_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list304);
        terms = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list304);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list304);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list304);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list304);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject terms_var = $sym305$TERMS_VAR;
            return list(CLET, list(list(terms_var, terms)), list(DO_ALL_INSTANCES, list(instance_var, list(FIRST, terms_var), mt, tv, done_var, search_type), listS(PWHEN, list($sym306$ALL_ISA_, instance_var, list(REST, terms_var), mt, tv), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list304);
        return NIL;
    }

    public static SubLObject do_all_quoted_instances(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list296);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list296);
        instance_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list296);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT, list(instance_var, $list279, v_term, mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list296);
        return NIL;
    }

    public static SubLObject do_all_fort_quoted_instances(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list296);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list296);
        instance_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list296);
        v_term = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list296);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(DO_ALL_QUOTED_INSTANCES, list(instance_var, v_term, mt, tv, done_var, search_type), listS(PWHEN, list(FORT_P, instance_var), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list296);
        return NIL;
    }

    public static SubLObject do_all_quoted_instances_of_all(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list304);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = NIL;
        SubLObject terms = NIL;
        destructuring_bind_must_consp(current, datum, $list304);
        instance_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list304);
        terms = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list304);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list304);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list304);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list304);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject terms_var = $sym310$TERMS_VAR;
            return list(CLET, list(list(terms_var, terms)), list(DO_ALL_QUOTED_INSTANCES, list(instance_var, list(FIRST, terms_var), mt, tv, done_var, search_type), listS(PWHEN, list($sym311$ALL_QUOTED_ISA_, instance_var, list(REST, terms_var), mt, tv), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list304);
        return NIL;
    }

    public static SubLObject do_true_genls_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list312);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list312);
        genl_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list312);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list312);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list312);
        col = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list312);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, list(genl_var, tv_var, mt_var, col, $list313, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list312);
        return NIL;
    }

    public static SubLObject do_relevant_genls_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list314);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_links_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list314);
        genl_links_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list314);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list314);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list314);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list314);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_RELEVANT_FORWARD_SBHL_LINK_NODES, list(genl_links_var, col, mt, tv, $list313, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list314);
        return NIL;
    }

    public static SubLObject do_genls(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list315);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list315);
        genl_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list315);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list315);
        col = current.first();
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list315);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject dummy = $sym316$DUMMY;
            return listS(DO_TRUE_GENLS_LINKS, list(genl_var, mt_var, dummy, col), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list315);
        return NIL;
    }

    public static SubLObject do_local_genls(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list318);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list318);
        genl_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list318);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list318);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list318);
            if (NIL == member(current_$6, $list260, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list318);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject mt_var = $sym319$MT_VAR;
        final SubLObject tv_var = $sym320$TV_VAR;
        return list(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, list(DO_TRUE_GENLS_LINKS, list(genl_var, mt_var, tv_var, col, done), list(IGNORE, tv_var), listS(PWHEN, list($sym75$RELEVANT_MT_, mt_var), append(body, NIL))));
    }

    public static SubLObject do_true_spec_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list321);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list321);
        spec_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list321);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list321);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list321);
        col = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list321);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, list(spec_var, tv_var, mt_var, col, $list313, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list321);
        return NIL;
    }

    public static SubLObject do_relevant_spec_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list322);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_links_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list322);
        spec_links_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list322);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list322);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list322);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list322);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, list(spec_links_var, col, mt, tv, $list313, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list322);
        return NIL;
    }

    public static SubLObject do_local_specs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list323);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list323);
        spec_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list323);
        col = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list323);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list323);
            if (NIL == member(current_$7, $list260, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list323);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject mt_var = $sym324$MT_VAR;
        final SubLObject tv_var = $sym325$TV_VAR;
        return list(POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, list(DO_TRUE_SPEC_LINKS, list(spec_var, mt_var, tv_var, col, done), list(IGNORE, tv_var), listS(PWHEN, list($sym75$RELEVANT_MT_, mt_var), append(body, NIL))));
    }

    public static SubLObject do_all_genls(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list327);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list327);
        genl_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list327);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list327);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list327);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list327);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list327);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, list(genl_var, $list313, col, mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list327);
        return NIL;
    }

    public static SubLObject do_all_genls_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list329);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list329);
        genl_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list329);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list329);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list329);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list329);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, listS(genl_var, new SubLObject[]{ $list313, col, mt, tv, done_var, $list225 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list329);
        return NIL;
    }

    public static SubLObject do_all_genls_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list329);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list329);
        genl_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list329);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list329);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list329);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list329);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, listS(genl_var, new SubLObject[]{ $list313, col, mt, tv, done_var, $list195 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list329);
        return NIL;
    }

    public static SubLObject do_all_genls_by_generality(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list330);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl = NIL;
        SubLObject spec = NIL;
        SubLObject domain_mt = NIL;
        SubLObject doneP = NIL;
        destructuring_bind_must_consp(current, datum, $list330);
        genl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list330);
        spec = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list330);
        domain_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list330);
        doneP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject v_genls = $sym331$GENLS;
            return list(WITH_MT, domain_mt, list(CLET, list(list(v_genls, list(SORT_BY_GENERALITY_ESTIMATE, list(ALL_GENLS, spec)))), listS(CSOME, list(genl, v_genls, doneP), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list330);
        return NIL;
    }

    public static SubLObject do_all_specs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list333);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list333);
        spec_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list333);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list333);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list333);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list333);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list333);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, list(spec_var, $list313, col, mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list333);
        return NIL;
    }

    public static SubLObject do_all_specs_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list335);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list335);
        spec_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list335);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list335);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list335);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list335);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, listS(spec_var, new SubLObject[]{ $list313, col, mt, tv, done_var, $list225 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list335);
        return NIL;
    }

    public static SubLObject do_all_specs_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list335);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_var = NIL;
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list335);
        spec_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list335);
        col = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list335);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list335);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list335);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, listS(spec_var, new SubLObject[]{ $list313, col, mt, tv, done_var, $list195 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list335);
        return NIL;
    }

    public static SubLObject do_all_specs_by_generality(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list336);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec = NIL;
        SubLObject v_term = NIL;
        SubLObject domain_mt = NIL;
        SubLObject doneP = NIL;
        destructuring_bind_must_consp(current, datum, $list336);
        spec = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list336);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list336);
        domain_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list336);
        doneP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject specs = $sym337$SPECS;
            return list(WITH_MT, domain_mt, list(CLET, list(list(specs, list(NREVERSE, list(SORT_BY_GENERALITY_ESTIMATE, list(ALL_SPECS, v_term))))), listS(CSOME, list(spec, specs, doneP), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list336);
        return NIL;
    }

    public static SubLObject do_true_genl_predicate_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list340);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_predicate_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list340);
        genl_predicate_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list340);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list340);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list340);
        pred = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list340);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, list(genl_predicate_var, tv_var, mt_var, pred, $list341, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list340);
        return NIL;
    }

    public static SubLObject do_relevant_genl_predicate_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list342);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_predicate_links_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list342);
        genl_predicate_links_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list342);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list342);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list342);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list342);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_RELEVANT_FORWARD_SBHL_LINK_NODES, list(genl_predicate_links_var, pred, mt, tv, $list341, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list342);
        return NIL;
    }

    public static SubLObject do_true_spec_predicate_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list343);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_predicate_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list343);
        spec_predicate_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list343);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list343);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list343);
        pred = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list343);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, list(spec_predicate_var, tv_var, mt_var, pred, $list341, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list343);
        return NIL;
    }

    public static SubLObject do_relevant_spec_predicate_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list344);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_predicate_links_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list344);
        spec_predicate_links_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list344);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list344);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list344);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list344);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, list(spec_predicate_links_var, pred, mt, tv, $list341, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list344);
        return NIL;
    }

    public static SubLObject do_all_genl_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list345);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_predicate_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list345);
        genl_predicate_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list345);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list345);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list345);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list345);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list345);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, list(genl_predicate_var, $list341, pred, mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list345);
        return NIL;
    }

    public static SubLObject do_all_genl_predicates_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list347);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_predicate_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list347);
        genl_predicate_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list347);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list347);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list347);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list347);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, listS(genl_predicate_var, new SubLObject[]{ $list341, pred, mt, tv, done_var, $list225 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list347);
        return NIL;
    }

    public static SubLObject do_all_genl_predicates_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list347);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_predicate_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list347);
        genl_predicate_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list347);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list347);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list347);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list347);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, listS(genl_predicate_var, new SubLObject[]{ $list341, pred, mt, tv, done_var, $list195 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list347);
        return NIL;
    }

    public static SubLObject do_all_genl_predicates_and_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list348);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_predicate_var = NIL;
        SubLObject inverse_mode_p = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list348);
        genl_predicate_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list348);
        inverse_mode_p = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list348);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list348);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list348);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list348);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_MODE_FORWARD_TRUE_LINKS_FOR_INVERSES, list(genl_predicate_var, inverse_mode_p, $list341, pred, mt, tv, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list348);
        return NIL;
    }

    public static SubLObject do_all_spec_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list350);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_predicate_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list350);
        spec_predicate_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list350);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list350);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list350);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list350);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list350);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, list(spec_predicate_var, $list341, pred, mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list350);
        return NIL;
    }

    public static SubLObject do_all_spec_predicates_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list352);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_predicate_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list352);
        spec_predicate_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list352);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list352);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list352);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list352);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, listS(spec_predicate_var, new SubLObject[]{ $list341, pred, mt, tv, done_var, $list225 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list352);
        return NIL;
    }

    public static SubLObject do_all_spec_predicates_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list352);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_predicate_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list352);
        spec_predicate_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list352);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list352);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list352);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list352);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, listS(spec_predicate_var, new SubLObject[]{ $list341, pred, mt, tv, done_var, $list195 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list352);
        return NIL;
    }

    public static SubLObject do_all_spec_predicates_and_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list353);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_var = NIL;
        SubLObject inverse_mode_p = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list353);
        spec_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list353);
        inverse_mode_p = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list353);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list353);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list353);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list353);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_MODE_BACKWARD_TRUE_LINKS_FOR_INVERSES, list(spec_var, inverse_mode_p, $list341, pred, mt, tv, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list353);
        return NIL;
    }

    public static SubLObject do_all_proper_genl_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list345);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_predicate_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list345);
        genl_predicate_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list345);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list345);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list345);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list345);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list345);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CSOME, list(genl_predicate_var, list(ALL_PROPER_GENL_PREDICATES, pred, mt, tv), done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list345);
        return NIL;
    }

    public static SubLObject do_all_proper_genl_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list356);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_inverse_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list356);
        genl_inverse_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list356);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list356);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list356);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list356);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list356);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CSOME, list(genl_inverse_var, list(ALL_PROPER_GENL_INVERSES, pred, mt, tv), done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list356);
        return NIL;
    }

    public static SubLObject do_true_genl_inverse_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list358);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_inverse_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list358);
        genl_inverse_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list358);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list358);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list358);
        pred = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list358);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, list(genl_inverse_var, tv_var, mt_var, pred, $list359, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list358);
        return NIL;
    }

    public static SubLObject do_relevant_genl_inverse_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list360);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_inverse_links_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list360);
        genl_inverse_links_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list360);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list360);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list360);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list360);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_RELEVANT_FORWARD_SBHL_LINK_NODES, list(genl_inverse_links_var, pred, mt, tv, $list359, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list360);
        return NIL;
    }

    public static SubLObject do_true_spec_inverse_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list361);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_inverse_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list361);
        spec_inverse_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list361);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list361);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list361);
        pred = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list361);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, list(spec_inverse_var, tv_var, mt_var, pred, $list359, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list361);
        return NIL;
    }

    public static SubLObject do_relevant_spec_inverse_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list362);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_inverse_links_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list362);
        spec_inverse_links_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list362);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list362);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list362);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list362);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, list(spec_inverse_links_var, pred, mt, tv, $list359, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list362);
        return NIL;
    }

    public static SubLObject do_all_genl_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list356);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_inverse_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list356);
        genl_inverse_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list356);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list356);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list356);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list356);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list356);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, list(genl_inverse_var, $list359, pred, mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list356);
        return NIL;
    }

    public static SubLObject do_all_genl_inverses_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list363);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_inverse_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list363);
        genl_inverse_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list363);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list363);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list363);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list363);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, listS(genl_inverse_var, new SubLObject[]{ $list359, pred, mt, tv, done_var, $list225 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list363);
        return NIL;
    }

    public static SubLObject do_all_genl_inverses_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list363);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_inverse_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list363);
        genl_inverse_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list363);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list363);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list363);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list363);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES, listS(genl_inverse_var, new SubLObject[]{ $list359, pred, mt, tv, done_var, $list195 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list363);
        return NIL;
    }

    public static SubLObject do_all_spec_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list364);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_inverse_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list364);
        spec_inverse_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list364);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list364);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list364);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list364);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list364);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, list(spec_inverse_var, $list359, pred, mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list364);
        return NIL;
    }

    public static SubLObject do_all_spec_inverses_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list365);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_inverse_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list365);
        spec_inverse_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list365);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list365);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list365);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list365);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, listS(spec_inverse_var, new SubLObject[]{ $list359, pred, mt, tv, done_var, $list225 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list365);
        return NIL;
    }

    public static SubLObject do_all_spec_inverses_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list365);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_inverse_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list365);
        spec_inverse_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list365);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list365);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list365);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list365);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES, listS(spec_inverse_var, new SubLObject[]{ $list359, pred, mt, tv, done_var, $list195 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list365);
        return NIL;
    }

    public static SubLObject do_all_genl_preds_and_inverses_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list366);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred_var = NIL;
        SubLObject inverse_mode_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list366);
        pred_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list366);
        inverse_mode_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list366);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list366);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list366);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list366);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_PREDS_AND_INVERSES, listS(pred_var, new SubLObject[]{ inverse_mode_var, pred, $list215, mt, tv, done_var, $list195 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list366);
        return NIL;
    }

    public static SubLObject do_all_genl_preds_and_inverses_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list366);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred_var = NIL;
        SubLObject inverse_mode_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list366);
        pred_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list366);
        inverse_mode_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list366);
        pred = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list366);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list366);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list366);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_PREDS_AND_INVERSES, listS(pred_var, new SubLObject[]{ inverse_mode_var, pred, $list215, mt, tv, done_var, $list225 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list366);
        return NIL;
    }

    public static SubLObject do_all_preds_and_inverses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list368);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred_var = NIL;
        SubLObject inverse_mode_var = NIL;
        SubLObject pred = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list368);
        pred_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list368);
        inverse_mode_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list368);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list368);
        direction = current.first();
        current = current.rest();
        final SubLObject mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list368);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list368);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list368);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list368);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject module = $sym369$MODULE;
            final SubLObject node_var = $sym370$NODE_VAR;
            final SubLObject node_and_predicate_mode = $sym371$NODE_AND_PREDICATE_MODE;
            final SubLObject predicate_mode = $sym372$PREDICATE_MODE;
            final SubLObject deck_type = $sym373$DECK_TYPE;
            final SubLObject recur_deck = $sym374$RECUR_DECK;
            final SubLObject node_vars_link_node = $sym375$NODE_VARS_LINK_NODE;
            return list(PUNLESS, done_var, list(CLET, list(bq_cons(module, $list376), list(node_var, pred), list(deck_type, listS(FIF, listS(EQ, search_type, $list225), $list226)), list(recur_deck, list(CREATE_DECK, deck_type)), node_and_predicate_mode), list(WITH_NEW_SBHL_SPACE, list(POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, list(POSSIBLY_WITH_SBHL_TRUE_TV, tv, list(WITH_SBHL_SEARCH_MODULE, module, list(WITH_SBHL_TYPE_TEST, pred, list(WITH_SBHL_SEARCH_DIRECTION, direction, list(WITH_SBHL_LINK_DIRECTION, list(SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, direction, module), list(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, list(SBHL_MARK_NODE_MARKED, node_var), list(CSETQ, node_and_predicate_mode, listS(LIST, pred, $list227)), list(WHILE, list(CAND, node_and_predicate_mode, list(CNOT, done_var)), list(CLET, list(list(node_var, list(FIRST, node_and_predicate_mode)), list(predicate_mode, list(SECOND, node_and_predicate_mode)), list(pred_var, node_var)), list(WITH_SBHL_PREDICATE_MODE, predicate_mode, listS(CLET, list(list(inverse_mode_var, predicate_mode)), append(body, NIL)), list(DO_ACCESSIBLE_SBHL_LINK_NODES, list(node_vars_link_node, node_var, $list209, module, done_var), list(PUNLESS, list(SBHL_SEARCH_PATH_TERMINATION_P, node_vars_link_node), list(SBHL_MARK_NODE_MARKED, node_vars_link_node), list(DECK_PUSH, listS(LIST, node_vars_link_node, $list227), recur_deck))))), list(CSETQ, node_and_predicate_mode, list(DECK_POP, recur_deck)))))))))))));
        }
        cdestructuring_bind_error(datum, $list368);
        return NIL;
    }

    public static SubLObject do_true_genl_mt_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list377);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_mt_var = NIL;
        SubLObject mt_mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject mt_node = NIL;
        destructuring_bind_must_consp(current, datum, $list377);
        genl_mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list377);
        mt_mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list377);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list377);
        mt_node = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list377);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES, list(genl_mt_var, tv_var, mt_mt_var, mt_node, $list378, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list377);
        return NIL;
    }

    public static SubLObject do_relevant_genl_mt_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list379);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_mt_links_var = NIL;
        SubLObject mt_node = NIL;
        destructuring_bind_must_consp(current, datum, $list379);
        genl_mt_links_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list379);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list379);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list379);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list379);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_RELEVANT_FORWARD_SBHL_LINK_NODES, list(genl_mt_links_var, mt_node, mt_mt, tv, $list378, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list379);
        return NIL;
    }

    public static SubLObject do_true_spec_mt_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list380);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_mt_var = NIL;
        SubLObject mt_mt_var = NIL;
        SubLObject tv_var = NIL;
        SubLObject mt_node = NIL;
        destructuring_bind_must_consp(current, datum, $list380);
        spec_mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list380);
        mt_mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list380);
        tv_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list380);
        mt_node = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list380);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES, list(spec_mt_var, tv_var, mt_mt_var, mt_node, $list378, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list380);
        return NIL;
    }

    public static SubLObject do_relevant_spec_mt_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list381);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_mt_links_var = NIL;
        SubLObject mt_node = NIL;
        destructuring_bind_must_consp(current, datum, $list381);
        spec_mt_links_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list381);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list381);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list381);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list381);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_RELEVANT_BACKWARD_SBHL_LINK_NODES, list(spec_mt_links_var, mt_node, mt_mt, tv, $list378, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list381);
        return NIL;
    }

    public static SubLObject do_all_genl_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list382);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_mt_var = NIL;
        SubLObject mt_node = NIL;
        destructuring_bind_must_consp(current, datum, $list382);
        genl_mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list382);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list382);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list382);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list382);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list382);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, list(genl_mt_var, $list378, mt_node, mt_mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list382);
        return NIL;
    }

    public static SubLObject do_all_genl_mts_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list383);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_mt_var = NIL;
        SubLObject mt_node = NIL;
        destructuring_bind_must_consp(current, datum, $list383);
        genl_mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list383);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list383);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list383);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list383);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, listS(genl_mt_var, new SubLObject[]{ $list378, mt_node, mt_mt, tv, done_var, $list225 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list383);
        return NIL;
    }

    public static SubLObject do_all_genl_mts_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list383);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject genl_mt_var = NIL;
        SubLObject mt_node = NIL;
        destructuring_bind_must_consp(current, datum, $list383);
        genl_mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list383);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list383);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list383);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list383);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_FORWARD_TRUE_LINKS, listS(genl_mt_var, new SubLObject[]{ $list378, mt_node, mt_mt, tv, done_var, $list195 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list383);
        return NIL;
    }

    public static SubLObject do_all_spec_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list384);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_mt_var = NIL;
        SubLObject mt_node = NIL;
        destructuring_bind_must_consp(current, datum, $list384);
        spec_mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list384);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list384);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list384);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list384);
        current = current.rest();
        final SubLObject search_type = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list384);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, list(spec_mt_var, $list378, mt_node, mt_mt, tv, done_var, search_type), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list384);
        return NIL;
    }

    public static SubLObject do_all_spec_mts_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list385);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_mt_var = NIL;
        SubLObject mt_node = NIL;
        destructuring_bind_must_consp(current, datum, $list385);
        spec_mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list385);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list385);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list385);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list385);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, listS(spec_mt_var, new SubLObject[]{ $list378, mt_node, mt_mt, tv, done_var, $list225 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list385);
        return NIL;
    }

    public static SubLObject do_all_spec_mts_breadth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list385);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject spec_mt_var = NIL;
        SubLObject mt_node = NIL;
        destructuring_bind_must_consp(current, datum, $list385);
        spec_mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list385);
        mt_node = current.first();
        current = current.rest();
        final SubLObject mt_mt = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list385);
        current = current.rest();
        final SubLObject tv = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list385);
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list385);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS, listS(spec_mt_var, new SubLObject[]{ $list378, mt_node, mt_mt, tv, done_var, $list195 }), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list385);
        return NIL;
    }

    public static SubLObject declare_sbhl_macros_file() {
        declareMacro(me, "do_sbhl_link_nodes", "DO-SBHL-LINK-NODES");
        declareMacro(me, "do_sbhl_tv_links", "DO-SBHL-TV-LINKS");
        declareMacro(me, "do_sbhl_mt_link", "DO-SBHL-MT-LINK");
        declareMacro(me, "do_sbhl_mt_links", "DO-SBHL-MT-LINKS");
        declareMacro(me, "do_sbhl_direction_link", "DO-SBHL-DIRECTION-LINK");
        declareMacro(me, "do_sbhl_graph_link", "DO-SBHL-GRAPH-LINK");
        declareMacro(me, "do_sbhl_forward_true_link_mts", "DO-SBHL-FORWARD-TRUE-LINK-MTS");
        declareMacro(me, "do_sbhl_forward_true_link_nodes_and_mts", "DO-SBHL-FORWARD-TRUE-LINK-NODES-AND-MTS");
        declareMacro(me, "do_all_sbhl_tv_links", "DO-ALL-SBHL-TV-LINKS");
        declareMacro(me, "do_all_sbhl_link_nodes", "DO-ALL-SBHL-LINK-NODES");
        declareMacro(me, "do_all_sbhl_forward_true_link_nodes", "DO-ALL-SBHL-FORWARD-TRUE-LINK-NODES");
        declareMacro(me, "do_all_sbhl_backward_true_link_nodes", "DO-ALL-SBHL-BACKWARD-TRUE-LINK-NODES");
        declareMacro(me, "with_sbhl_graph_link", "WITH-SBHL-GRAPH-LINK");
        declareMacro(me, "with_relevant_sbhl_link_nodes", "WITH-RELEVANT-SBHL-LINK-NODES");
        declareMacro(me, "with_relevant_sbhl_link_nodes_and_non_forts", "WITH-RELEVANT-SBHL-LINK-NODES-AND-NON-FORTS");
        declareMacro(me, "with_relevant_sbhl_fort_link_nodes", "WITH-RELEVANT-SBHL-FORT-LINK-NODES");
        declareMacro(me, "do_non_fort_direct_instance_links", "DO-NON-FORT-DIRECT-INSTANCE-LINKS");
        declareMacro(me, "with_sbhl_non_fort_links", "WITH-SBHL-NON-FORT-LINKS");
        declareFunction(me, "do_sbhl_non_fort_linksP", "DO-SBHL-NON-FORT-LINKS?", 2, 0, false);
        declareFunction(me, "collection_supports_non_fort_instancesP", "COLLECTION-SUPPORTS-NON-FORT-INSTANCES?", 1, 0, false);
        declareFunction(me, "admissible_non_fort_link_nodeP", "ADMISSIBLE-NON-FORT-LINK-NODE?", 1, 0, false);
        declareMacro(me, "do_relevant_sbhl_naut_generated_links", "DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS");
        declareMacro(me, "do_relevant_forward_sbhl_link_nodes", "DO-RELEVANT-FORWARD-SBHL-LINK-NODES");
        declareMacro(me, "do_relevant_backward_sbhl_link_nodes", "DO-RELEVANT-BACKWARD-SBHL-LINK-NODES");
        declareMacro(me, "with_accessible_sbhl_link_nodes", "WITH-ACCESSIBLE-SBHL-LINK-NODES");
        declareMacro(me, "with_accessible_sbhl_link_nodes_and_non_forts", "WITH-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS");
        declareMacro(me, "do_accessible_sbhl_link_nodes", "DO-ACCESSIBLE-SBHL-LINK-NODES");
        declareMacro(me, "do_accessible_sbhl_link_nodes_and_non_forts", "DO-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS");
        declareMacro(me, "do_accessible_sbhl_link_node_search_states", "DO-ACCESSIBLE-SBHL-LINK-NODE-SEARCH-STATES");
        declareMacro(me, "do_accessible_sbhl_tv_links", "DO-ACCESSIBLE-SBHL-TV-LINKS");
        declareMacro(me, "do_relevant_sbhl_link_nodes", "DO-RELEVANT-SBHL-LINK-NODES");
        declareMacro(me, "do_relevant_sbhl_forward_link_nodes", "DO-RELEVANT-SBHL-FORWARD-LINK-NODES");
        declareMacro(me, "do_relevant_sbhl_backward_link_nodes", "DO-RELEVANT-SBHL-BACKWARD-LINK-NODES");
        declareMacro(me, "do_sbhl_predicates", "DO-SBHL-PREDICATES");
        declareMacro(me, "do_sbhl_non_time_predicates", "DO-SBHL-NON-TIME-PREDICATES");
        declareMacro(me, "do_sbhl_non_time_modules", "DO-SBHL-NON-TIME-MODULES");
        declareMacro(me, "do_sbhl_graphs", "DO-SBHL-GRAPHS");
        declareMacro(me, "with_forward_sbhl_link_direction", "WITH-FORWARD-SBHL-LINK-DIRECTION");
        declareMacro(me, "with_backward_sbhl_link_direction", "WITH-BACKWARD-SBHL-LINK-DIRECTION");
        declareMacro(me, "with_sbhl_type_test", "WITH-SBHL-TYPE-TEST");
        declareMacro(me, "do_sbhl_module_graph", "DO-SBHL-MODULE-GRAPH");
        declareMacro(me, "do_with_relevant_sbhl_modules", "DO-WITH-RELEVANT-SBHL-MODULES");
        declareFunction(me, "get_sbhl_accessible_modules", "GET-SBHL-ACCESSIBLE-MODULES", 1, 0, false);
        declareMacro(me, "do_relevant_sbhl_directions", "DO-RELEVANT-SBHL-DIRECTIONS");
        declareMacro(me, "bind_sbhl_search_behavior", "BIND-SBHL-SEARCH-BEHAVIOR");
        declareMacro(me, "bind_sbhl_boolean_goal_fn", "BIND-SBHL-BOOLEAN-GOAL-FN");
        declareMacro(me, "sbhl_possibly_rebind_temporal_search_state", "SBHL-POSSIBLY-REBIND-TEMPORAL-SEARCH-STATE");
        declareMacro(me, "bind_sbhl_sample_leaf_search_behavior", "BIND-SBHL-SAMPLE-LEAF-SEARCH-BEHAVIOR");
        declareMacro(me, "do_all_simple_true_links", "DO-ALL-SIMPLE-TRUE-LINKS");
        declareMacro(me, "do_all_simple_forward_true_links", "DO-ALL-SIMPLE-FORWARD-TRUE-LINKS");
        declareMacro(me, "do_all_simple_backward_true_links", "DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS");
        declareMacro(me, "do_all_simple_true_links_for_inverses", "DO-ALL-SIMPLE-TRUE-LINKS-FOR-INVERSES");
        declareMacro(me, "do_all_simple_forward_true_links_for_inverses", "DO-ALL-SIMPLE-FORWARD-TRUE-LINKS-FOR-INVERSES");
        declareMacro(me, "do_all_simple_backward_true_links_for_inverses", "DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS-FOR-INVERSES");
        declareMacro(me, "do_all_mode_true_links_for_inverses", "DO-ALL-MODE-TRUE-LINKS-FOR-INVERSES");
        declareMacro(me, "do_all_mode_backward_true_links_for_inverses", "DO-ALL-MODE-BACKWARD-TRUE-LINKS-FOR-INVERSES");
        declareMacro(me, "do_all_mode_forward_true_links_for_inverses", "DO-ALL-MODE-FORWARD-TRUE-LINKS-FOR-INVERSES");
        declareMacro(me, "do_all_forward_true_links_for_tt", "DO-ALL-FORWARD-TRUE-LINKS-FOR-TT");
        declareMacro(me, "do_all_backward_true_links_for_tt", "DO-ALL-BACKWARD-TRUE-LINKS-FOR-TT");
        declareMacro(me, "do_true_isa_links", "DO-TRUE-ISA-LINKS");
        declareMacro(me, "do_relevant_isa_links", "DO-RELEVANT-ISA-LINKS");
        declareMacro(me, "do_local_isas", "DO-LOCAL-ISAS");
        declareMacro(me, "some_relevant_isa", "SOME-RELEVANT-ISA");
        declareMacro(me, "do_true_instance_links", "DO-TRUE-INSTANCE-LINKS");
        declareMacro(me, "do_relevant_instance_links", "DO-RELEVANT-INSTANCE-LINKS");
        declareMacro(me, "do_local_instances", "DO-LOCAL-INSTANCES");
        declareMacro(me, "do_true_quoted_isa_links", "DO-TRUE-QUOTED-ISA-LINKS");
        declareMacro(me, "do_local_quoted_isas", "DO-LOCAL-QUOTED-ISAS");
        declareMacro(me, "do_true_quoted_instance_links", "DO-TRUE-QUOTED-INSTANCE-LINKS");
        declareMacro(me, "do_local_quoted_instances", "DO-LOCAL-QUOTED-INSTANCES");
        declareMacro(me, "do_all_isa", "DO-ALL-ISA");
        declareMacro(me, "do_all_isa_depth", "DO-ALL-ISA-DEPTH");
        declareMacro(me, "do_all_isa_breadth", "DO-ALL-ISA-BREADTH");
        declareMacro(me, "do_all_isas_by_generality", "DO-ALL-ISAS-BY-GENERALITY");
        declareMacro(me, "do_all_instances", "DO-ALL-INSTANCES");
        declareMacro(me, "do_all_instances_depth", "DO-ALL-INSTANCES-DEPTH");
        declareMacro(me, "do_all_instances_breadth", "DO-ALL-INSTANCES-BREADTH");
        declareMacro(me, "do_all_fort_instances", "DO-ALL-FORT-INSTANCES");
        declareMacro(me, "do_all_instances_of_all", "DO-ALL-INSTANCES-OF-ALL");
        declareMacro(me, "do_all_quoted_instances", "DO-ALL-QUOTED-INSTANCES");
        declareMacro(me, "do_all_fort_quoted_instances", "DO-ALL-FORT-QUOTED-INSTANCES");
        declareMacro(me, "do_all_quoted_instances_of_all", "DO-ALL-QUOTED-INSTANCES-OF-ALL");
        declareMacro(me, "do_true_genls_links", "DO-TRUE-GENLS-LINKS");
        declareMacro(me, "do_relevant_genls_links", "DO-RELEVANT-GENLS-LINKS");
        declareMacro(me, "do_genls", "DO-GENLS");
        declareMacro(me, "do_local_genls", "DO-LOCAL-GENLS");
        declareMacro(me, "do_true_spec_links", "DO-TRUE-SPEC-LINKS");
        declareMacro(me, "do_relevant_spec_links", "DO-RELEVANT-SPEC-LINKS");
        declareMacro(me, "do_local_specs", "DO-LOCAL-SPECS");
        declareMacro(me, "do_all_genls", "DO-ALL-GENLS");
        declareMacro(me, "do_all_genls_depth", "DO-ALL-GENLS-DEPTH");
        declareMacro(me, "do_all_genls_breadth", "DO-ALL-GENLS-BREADTH");
        declareMacro(me, "do_all_genls_by_generality", "DO-ALL-GENLS-BY-GENERALITY");
        declareMacro(me, "do_all_specs", "DO-ALL-SPECS");
        declareMacro(me, "do_all_specs_depth", "DO-ALL-SPECS-DEPTH");
        declareMacro(me, "do_all_specs_breadth", "DO-ALL-SPECS-BREADTH");
        declareMacro(me, "do_all_specs_by_generality", "DO-ALL-SPECS-BY-GENERALITY");
        declareMacro(me, "do_true_genl_predicate_links", "DO-TRUE-GENL-PREDICATE-LINKS");
        declareMacro(me, "do_relevant_genl_predicate_links", "DO-RELEVANT-GENL-PREDICATE-LINKS");
        declareMacro(me, "do_true_spec_predicate_links", "DO-TRUE-SPEC-PREDICATE-LINKS");
        declareMacro(me, "do_relevant_spec_predicate_links", "DO-RELEVANT-SPEC-PREDICATE-LINKS");
        declareMacro(me, "do_all_genl_predicates", "DO-ALL-GENL-PREDICATES");
        declareMacro(me, "do_all_genl_predicates_depth", "DO-ALL-GENL-PREDICATES-DEPTH");
        declareMacro(me, "do_all_genl_predicates_breadth", "DO-ALL-GENL-PREDICATES-BREADTH");
        declareMacro(me, "do_all_genl_predicates_and_inverses", "DO-ALL-GENL-PREDICATES-AND-INVERSES");
        declareMacro(me, "do_all_spec_predicates", "DO-ALL-SPEC-PREDICATES");
        declareMacro(me, "do_all_spec_predicates_depth", "DO-ALL-SPEC-PREDICATES-DEPTH");
        declareMacro(me, "do_all_spec_predicates_breadth", "DO-ALL-SPEC-PREDICATES-BREADTH");
        declareMacro(me, "do_all_spec_predicates_and_inverses", "DO-ALL-SPEC-PREDICATES-AND-INVERSES");
        declareMacro(me, "do_all_proper_genl_predicates", "DO-ALL-PROPER-GENL-PREDICATES");
        declareMacro(me, "do_all_proper_genl_inverses", "DO-ALL-PROPER-GENL-INVERSES");
        declareMacro(me, "do_true_genl_inverse_links", "DO-TRUE-GENL-INVERSE-LINKS");
        declareMacro(me, "do_relevant_genl_inverse_links", "DO-RELEVANT-GENL-INVERSE-LINKS");
        declareMacro(me, "do_true_spec_inverse_links", "DO-TRUE-SPEC-INVERSE-LINKS");
        declareMacro(me, "do_relevant_spec_inverse_links", "DO-RELEVANT-SPEC-INVERSE-LINKS");
        declareMacro(me, "do_all_genl_inverses", "DO-ALL-GENL-INVERSES");
        declareMacro(me, "do_all_genl_inverses_depth", "DO-ALL-GENL-INVERSES-DEPTH");
        declareMacro(me, "do_all_genl_inverses_breadth", "DO-ALL-GENL-INVERSES-BREADTH");
        declareMacro(me, "do_all_spec_inverses", "DO-ALL-SPEC-INVERSES");
        declareMacro(me, "do_all_spec_inverses_depth", "DO-ALL-SPEC-INVERSES-DEPTH");
        declareMacro(me, "do_all_spec_inverses_breadth", "DO-ALL-SPEC-INVERSES-BREADTH");
        declareMacro(me, "do_all_genl_preds_and_inverses_breadth", "DO-ALL-GENL-PREDS-AND-INVERSES-BREADTH");
        declareMacro(me, "do_all_genl_preds_and_inverses_depth", "DO-ALL-GENL-PREDS-AND-INVERSES-DEPTH");
        declareMacro(me, "do_all_preds_and_inverses", "DO-ALL-PREDS-AND-INVERSES");
        declareMacro(me, "do_true_genl_mt_links", "DO-TRUE-GENL-MT-LINKS");
        declareMacro(me, "do_relevant_genl_mt_links", "DO-RELEVANT-GENL-MT-LINKS");
        declareMacro(me, "do_true_spec_mt_links", "DO-TRUE-SPEC-MT-LINKS");
        declareMacro(me, "do_relevant_spec_mt_links", "DO-RELEVANT-SPEC-MT-LINKS");
        declareMacro(me, "do_all_genl_mts", "DO-ALL-GENL-MTS");
        declareMacro(me, "do_all_genl_mts_depth", "DO-ALL-GENL-MTS-DEPTH");
        declareMacro(me, "do_all_genl_mts_breadth", "DO-ALL-GENL-MTS-BREADTH");
        declareMacro(me, "do_all_spec_mts", "DO-ALL-SPEC-MTS");
        declareMacro(me, "do_all_spec_mts_depth", "DO-ALL-SPEC-MTS-DEPTH");
        declareMacro(me, "do_all_spec_mts_breadth", "DO-ALL-SPEC-MTS-BREADTH");
        return NIL;
    }

    public static SubLObject init_sbhl_macros_file() {
        return NIL;
    }

    public static SubLObject setup_sbhl_macros_file() {
        register_macro_helper($sym88$DO_SBHL_NON_FORT_LINKS_, DO_SBHL_NON_FORT_LINKS);
        register_macro_helper($sym93$ADMISSIBLE_NON_FORT_LINK_NODE_, DO_SBHL_NON_FORT_LINKS);
        register_macro_helper(GET_SBHL_ACCESSIBLE_MODULES, DO_WITH_RELEVANT_SBHL_MODULES);
        register_cyc_api_macro(DO_ALL_INSTANCES, $list296, $str299$Iterator___see_do_all_simple_back);
        register_cyc_api_macro(DO_ALL_FORT_INSTANCES, $list296, $str303$Like__xref_do_all_instances_excep);
        register_cyc_api_macro(DO_ALL_QUOTED_INSTANCES, $list296, $str299$Iterator___see_do_all_simple_back);
        register_cyc_api_macro(DO_ALL_FORT_QUOTED_INSTANCES, $list296, $str303$Like__xref_do_all_instances_excep);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_macros_file();
    }

    static {



































































































































































































































































































































































































    }
}

/**
 * Total time: 1762 ms
 */
