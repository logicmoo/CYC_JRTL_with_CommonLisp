package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class ghl_link_iterators extends SubLTranslatedFile {
    public static final SubLFile me = new ghl_link_iterators();

    public static final String myName = "com.cyc.cycjava.cycl.ghl_link_iterators";

    public static final String myFingerPrint = "d2b7b06988a3a236b3f7e4543e837b545a2ba0d9e044d0d6a2d70480d87db26a";







    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("PRED"), makeSymbol("DIRECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $ghl_link_pred$ = makeSymbol("*GHL-LINK-PRED*");

    public static final SubLSymbol $ghl_link_direction$ = makeSymbol("*GHL-LINK-DIRECTION*");

    public static final SubLList $list4 = list(list(makeSymbol("*GHL-LINK-PRED*"), NIL), list(makeSymbol("*GHL-LINK-DIRECTION*"), NIL));

    public static final SubLList $list5 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("NODE"), makeSymbol("PREDICATES"), makeSymbol("DIRECTIONS"), makeSymbol("&KEY"), makeSymbol("SUPPORT-VAR"), list(makeSymbol("TV"), makeKeyword("TRUE-DEF")), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list6 = list(makeKeyword("SUPPORT-VAR"), makeKeyword("TV"), makeKeyword("DONE-VAR"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");









    private static final SubLSymbol $sym12$PRED = makeUninternedSymbol("PRED");

    private static final SubLSymbol $sym13$DIRECTION = makeUninternedSymbol("DIRECTION");

    private static final SubLSymbol CDOLIST_MULTIPLE = makeSymbol("CDOLIST-MULTIPLE");

    private static final SubLSymbol WITH_GHL_LINK_PRED_AND_DIRECTION = makeSymbol("WITH-GHL-LINK-PRED-AND-DIRECTION");



    private static final SubLSymbol SBHL_PREDICATE_P = makeSymbol("SBHL-PREDICATE-P");

    private static final SubLSymbol DO_SBHL_ACCESSIBLE_LINK_NODES = makeSymbol("DO-SBHL-ACCESSIBLE-LINK-NODES");



    private static final SubLSymbol GHL_MAKE_SBHL_SUPPORT = makeSymbol("GHL-MAKE-SBHL-SUPPORT");

    private static final SubLSymbol GT_PREDICATE_P = makeSymbol("GT-PREDICATE-P");

    private static final SubLSymbol DO_GT_ACCESSIBLE_LINK_NODES = makeSymbol("DO-GT-ACCESSIBLE-LINK-NODES");

    private static final SubLSymbol $sym23$PRED = makeUninternedSymbol("PRED");

    private static final SubLSymbol $sym24$DIRECTION = makeUninternedSymbol("DIRECTION");

    private static final SubLSymbol $sym25$SUPPORT_VAR = makeUninternedSymbol("SUPPORT-VAR");



    private static final SubLSymbol DO_GHL_ACCESSIBLE_LINK_NODES = makeSymbol("DO-GHL-ACCESSIBLE-LINK-NODES");

    private static final SubLList $list28 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("START-NODE"), makeSymbol("MODULE"), makeSymbol("DIRECTION"), makeSymbol("&KEY"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list29 = list(makeKeyword("DONE-VAR"));

    private static final SubLSymbol $sym30$LINK_NODES_VAR = makeUninternedSymbol("LINK-NODES-VAR");

    private static final SubLSymbol $sym31$SEARCH_DIRECTION = makeUninternedSymbol("SEARCH-DIRECTION");

    private static final SubLSymbol $sym32$LINK_DIRECTION = makeUninternedSymbol("LINK-DIRECTION");

    private static final SubLSymbol $sym33$D_LINK = makeUninternedSymbol("D-LINK");

    private static final SubLSymbol $sym34$MT = makeUninternedSymbol("MT");

    private static final SubLSymbol $sym35$TV_LINKS = makeUninternedSymbol("TV-LINKS");

    private static final SubLSymbol $sym36$TV = makeUninternedSymbol("TV");

    private static final SubLSymbol $sym37$NODE = makeUninternedSymbol("NODE");

    private static final SubLSymbol NAUT_TO_NART = makeSymbol("NAUT-TO-NART");

    private static final SubLSymbol WITH_SBHL_SEARCH_MODULE = makeSymbol("WITH-SBHL-SEARCH-MODULE");

    private static final SubLSymbol POSSIBLY_FLIP_GENL_INVERSE_MODE = makeSymbol("POSSIBLY-FLIP-GENL-INVERSE-MODE");



    private static final SubLSymbol WITH_SBHL_GRAPH_LINK = makeSymbol("WITH-SBHL-GRAPH-LINK");

    private static final SubLSymbol DO_GHL_RELEVANT_DIRECTIONS = makeSymbol("DO-GHL-RELEVANT-DIRECTIONS");

    private static final SubLSymbol SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION = makeSymbol("SBHL-SEARCH-DIRECTION-TO-LINK-DIRECTION");

    private static final SubLSymbol DO_SBHL_DIRECTION_LINK = makeSymbol("DO-SBHL-DIRECTION-LINK");



    private static final SubLSymbol $sym47$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");

    private static final SubLSymbol $sbhl_link_mt$ = makeSymbol("*SBHL-LINK-MT*");

    private static final SubLSymbol DO_SBHL_TV_LINKS = makeSymbol("DO-SBHL-TV-LINKS");

    private static final SubLSymbol $sym50$RELEVANT_SBHL_TV_ = makeSymbol("RELEVANT-SBHL-TV?");

    private static final SubLSymbol $sbhl_link_tv$ = makeSymbol("*SBHL-LINK-TV*");

    private static final SubLSymbol DO_SET_OR_LIST = makeSymbol("DO-SET-OR-LIST");



    private static final SubLSymbol $sym54$CLOSED_NAUT_ = makeSymbol("CLOSED-NAUT?");

    private static final SubLSymbol DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS = makeSymbol("DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS");

    private static final SubLList $list56 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("ASSERTION-VAR"), makeSymbol("NODE"), makeSymbol("PRED"), makeSymbol("DIRECTION"), makeSymbol("&KEY"), list(makeSymbol("TV"), makeKeyword("TRUE-DEF")), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list57 = list(makeKeyword("TV"), makeKeyword("DONE-VAR"));

    private static final SubLSymbol $sym58$SEARCH_DIRECTION = makeUninternedSymbol("SEARCH-DIRECTION");

    private static final SubLSymbol $sym59$INDEX_ARGNUM = makeUninternedSymbol("INDEX-ARGNUM");

    private static final SubLSymbol $sym60$GATHER_ARGNUM = makeUninternedSymbol("GATHER-ARGNUM");

    private static final SubLSymbol $sym61$ASSERTION = makeUninternedSymbol("ASSERTION");

    private static final SubLSymbol $sym62$TRUTH = makeUninternedSymbol("TRUTH");

    private static final SubLSymbol $sym63$STRENGTH = makeUninternedSymbol("STRENGTH");

    private static final SubLSymbol TV_TRUTH = makeSymbol("TV-TRUTH");

    private static final SubLSymbol TV_STRENGTH = makeSymbol("TV-STRENGTH");

    private static final SubLSymbol WITH_GT_ARGS_UNSWAPPED = makeSymbol("WITH-GT-ARGS-UNSWAPPED");

    private static final SubLSymbol GT_INDEX_ARGNUM_FOR_DIRECTION = makeSymbol("GT-INDEX-ARGNUM-FOR-DIRECTION");

    private static final SubLSymbol OTHER_BINARY_ARG = makeSymbol("OTHER-BINARY-ARG");

    private static final SubLSymbol DO_GT_GAF_ARG_INDEX = makeSymbol("DO-GT-GAF-ARG-INDEX");







    private static final SubLSymbol $sym73$ACCESSIBLE_LINK_NODE_SENTENCE_IRRELEVANT_ = makeSymbol("ACCESSIBLE-LINK-NODE-SENTENCE-IRRELEVANT?");



    public static final SubLList $list75 = list(makeSymbol("GHL-USES-SPEC-PREDS-P"));

    public static final SubLSymbol WITH_GT_ARGS_SWAPPED = makeSymbol("WITH-GT-ARGS-SWAPPED");

    public static final SubLList $list77 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list78 = list(makeKeyword("INDEX"), makeKeyword("TRUTH"), makeKeyword("DONE"));

    public static final SubLSymbol $sym79$VAR_MT = makeUninternedSymbol("VAR-MT");



    public static final SubLSymbol $gt_relevant_pred$ = makeSymbol("*GT-RELEVANT-PRED*");

    public static final SubLSymbol WITH_PREDICATE_FUNCTION = makeSymbol("WITH-PREDICATE-FUNCTION");

    public static final SubLList $list83 = list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-PRED-WRT-GT?"));







    public static final SubLList $list87 = list(makeSymbol("GT-USE-SKSI?"));

    public static final SubLSymbol WITH_SKSI_GT_SEARCH_PRED = makeSymbol("WITH-SKSI-GT-SEARCH-PRED");

    public static final SubLSymbol DO_SKSI_GAF_ARG_INDEX_RELEVANT_PRED = makeSymbol("DO-SKSI-GAF-ARG-INDEX-RELEVANT-PRED");







    public static final SubLString $str93$Invalid_direction__a = makeString("Invalid direction ~a");

    public static SubLObject with_ghl_link_pred_and_direction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        direction = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($ghl_link_pred$, pred), list($ghl_link_direction$, direction)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject with_new_ghl_link_pred_and_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list4, append(body, NIL));
    }

    public static SubLObject get_ghl_link_pred() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ghl_link_pred$.getDynamicValue(thread);
    }

    public static SubLObject get_ghl_link_direction() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ghl_link_direction$.getDynamicValue(thread);
    }

    public static SubLObject do_ghl_accessible_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject node = NIL;
        SubLObject predicates = NIL;
        SubLObject directions = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        predicates = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        directions = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list5);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list5);
            if (NIL == member(current_$1, $list6, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list5);
        }
        final SubLObject support_var_tail = property_list_member($SUPPORT_VAR, current);
        final SubLObject support_var = (NIL != support_var_tail) ? cadr(support_var_tail) : NIL;
        final SubLObject tv_tail = property_list_member($TV, current);
        final SubLObject tv = (NIL != tv_tail) ? cadr(tv_tail) : $TRUE_DEF;
        final SubLObject done_var_tail = property_list_member($DONE_VAR, current);
        final SubLObject done_var = (NIL != done_var_tail) ? cadr(done_var_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != support_var) {
            final SubLObject pred = $sym12$PRED;
            final SubLObject direction = $sym13$DIRECTION;
            return list(CDOLIST_MULTIPLE, list(list(pred, predicates), list(direction, directions)), list(WITH_GHL_LINK_PRED_AND_DIRECTION, list(pred, direction), list(PCOND, list(list(SBHL_PREDICATE_P, pred), list(DO_SBHL_ACCESSIBLE_LINK_NODES, list(link_node_var, node, list(GET_SBHL_MODULE, pred), direction, $DONE_VAR, done_var), listS(CLET, list(list(support_var, list(GHL_MAKE_SBHL_SUPPORT, pred, node, link_node_var, direction))), append(body, NIL)))), list(list(GT_PREDICATE_P, pred), listS(DO_GT_ACCESSIBLE_LINK_NODES, list(new SubLObject[]{ link_node_var, support_var, node, pred, direction, $TV, tv, $DONE_VAR, done_var }), append(body, NIL))))));
        }
        final SubLObject pred = $sym23$PRED;
        final SubLObject direction = $sym24$DIRECTION;
        final SubLObject support_var_$2 = $sym25$SUPPORT_VAR;
        return list(CDOLIST_MULTIPLE, list(list(pred, predicates), list(direction, directions)), list(WITH_GHL_LINK_PRED_AND_DIRECTION, list(pred, direction), list(PCOND, list(list(SBHL_PREDICATE_P, pred), listS(DO_SBHL_ACCESSIBLE_LINK_NODES, list(link_node_var, node, list(GET_SBHL_MODULE, pred), direction, $DONE_VAR, done_var), append(body, NIL))), list(list(GT_PREDICATE_P, pred), listS(DO_GT_ACCESSIBLE_LINK_NODES, list(new SubLObject[]{ link_node_var, support_var_$2, node, pred, direction, $TV, tv, $DONE_VAR, done_var }), list(IGNORE, support_var_$2), append(body, NIL))))));
    }

    public static SubLObject ghl_make_sbhl_support(final SubLObject pred, final SubLObject node, final SubLObject link_node, final SubLObject direction) {
        final SubLObject module = sbhl_module_utilities.sbhl_pred_hl_support_module(pred);
        final SubLObject sentence = (NIL != ghl_search_vars.ghl_forward_direction_p(direction)) ? make_binary_formula(pred, node, link_node) : make_binary_formula(pred, link_node, node);
        return arguments.make_hl_support(module, sentence, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject do_sbhl_accessible_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject start_node = NIL;
        SubLObject module = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list28);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        start_node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        module = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        direction = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list28);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list28);
            if (NIL == member(current_$3, $list29, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list28);
        }
        final SubLObject done_var_tail = property_list_member($DONE_VAR, current);
        final SubLObject done_var = (NIL != done_var_tail) ? cadr(done_var_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject link_nodes_var = $sym30$LINK_NODES_VAR;
        final SubLObject search_direction = $sym31$SEARCH_DIRECTION;
        final SubLObject link_direction = $sym32$LINK_DIRECTION;
        final SubLObject d_link = $sym33$D_LINK;
        final SubLObject mt = $sym34$MT;
        final SubLObject tv_links = $sym35$TV_LINKS;
        final SubLObject tv = $sym36$TV;
        final SubLObject node = $sym37$NODE;
        return list(CLET, list(list(node, list(NAUT_TO_NART, start_node))), list(WITH_SBHL_SEARCH_MODULE, module, list(POSSIBLY_FLIP_GENL_INVERSE_MODE, list(PCOND, list(list(FORT_P, node), list(WITH_SBHL_GRAPH_LINK, list(d_link, node, module), list(DO_GHL_RELEVANT_DIRECTIONS, list(search_direction, direction, $DONE_VAR, done_var), list(CLET, list(list(link_direction, list(SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, search_direction, module))), list(DO_SBHL_DIRECTION_LINK, list(mt, tv_links, link_direction, d_link, module, done_var), list(PWHEN, list($sym47$RELEVANT_MT_, mt), list(CLET, list(list($sbhl_link_mt$, mt)), list(DO_SBHL_TV_LINKS, list(tv, link_nodes_var, tv_links, done_var), list(PWHEN, list($sym50$RELEVANT_SBHL_TV_, tv), list(CLET, list(list($sbhl_link_tv$, tv)), listS(DO_SET_OR_LIST, list(link_node_var, link_nodes_var, $DONE, done_var), append(body, NIL)))))))))))), list(list($sym54$CLOSED_NAUT_, node), list(DO_GHL_RELEVANT_DIRECTIONS, list(search_direction, direction, $DONE_VAR, done_var), list(CLET, list(list(link_direction, list(SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, search_direction, module))), list(DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS, list(link_nodes_var, node, link_direction, module, done_var), listS(DO_SET_OR_LIST, list(link_node_var, link_nodes_var, $DONE, done_var), append(body, NIL))))))))));
    }

    public static SubLObject do_gt_accessible_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject assertion_var = NIL;
        SubLObject node = NIL;
        SubLObject pred = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list56);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        direction = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list56);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list56);
            if (NIL == member(current_$4, $list57, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list56);
        }
        final SubLObject tv_tail = property_list_member($TV, current);
        final SubLObject tv = (NIL != tv_tail) ? cadr(tv_tail) : $TRUE_DEF;
        final SubLObject done_var_tail = property_list_member($DONE_VAR, current);
        final SubLObject done_var = (NIL != done_var_tail) ? cadr(done_var_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject search_direction = $sym58$SEARCH_DIRECTION;
        final SubLObject index_argnum = $sym59$INDEX_ARGNUM;
        final SubLObject gather_argnum = $sym60$GATHER_ARGNUM;
        final SubLObject assertion = $sym61$ASSERTION;
        final SubLObject truth = $sym62$TRUTH;
        final SubLObject strength = $sym63$STRENGTH;
        return list(CLET, list(list(truth, list(TV_TRUTH, tv)), list(strength, list(TV_STRENGTH, tv))), list(WITH_GT_ARGS_UNSWAPPED, list(DO_GHL_RELEVANT_DIRECTIONS, list(search_direction, direction, $DONE_VAR, done_var), list(CLET, list(list(index_argnum, list(GT_INDEX_ARGNUM_FOR_DIRECTION, search_direction)), list(gather_argnum, list(OTHER_BINARY_ARG, index_argnum))), list(DO_GT_GAF_ARG_INDEX, list(new SubLObject[]{ assertion, node, pred, $INDEX, index_argnum, $TRUTH, truth, $DONE, done_var }), list(PUNLESS, list($sym73$ACCESSIBLE_LINK_NODE_SENTENCE_IRRELEVANT_, assertion, strength), listS(CLET, list(list(link_node_var, list(FORMULA_ARG, assertion, gather_argnum)), list(assertion_var, assertion)), append(body, NIL)))), list(PWHEN, $list75, list(WITH_GT_ARGS_SWAPPED, list(DO_GT_GAF_ARG_INDEX, list(new SubLObject[]{ assertion, node, pred, $INDEX, gather_argnum, $TRUTH, truth, $DONE, done_var }), list(PUNLESS, list($sym73$ACCESSIBLE_LINK_NODE_SENTENCE_IRRELEVANT_, assertion, strength), listS(CLET, list(list(link_node_var, list(FORMULA_ARG, assertion, index_argnum)), list(assertion_var, assertion)), append(body, NIL))))))))));
    }

    public static SubLObject accessible_link_node_sentence_irrelevantP(final SubLObject sentence, final SubLObject strength) {
        return makeBoolean((NIL != assertion_handles.assertion_p(sentence)) && ((NIL != assertion_utilities.excepted_assertionP(sentence, UNPROVIDED, UNPROVIDED)) || (NIL == enumeration_types.el_strength_implies(assertions_high.assertion_strength(sentence), strength))));
    }

    public static SubLObject relevant_pred_wrt_gtP(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gt_relevant_predP(predicate, $gt_relevant_pred$.getDynamicValue(thread));
    }

    public static SubLObject do_gt_gaf_arg_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list77);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list77);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list77);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list77);
            if (NIL == member(current_$5, $list78, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list77);
        }
        final SubLObject index_tail = property_list_member($INDEX, current);
        final SubLObject index = (NIL != index_tail) ? cadr(index_tail) : NIL;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject var_mt = $sym79$VAR_MT;
        return list(PROGN, list(CLET, list(list($gt_relevant_pred$, pred)), list(WITH_PREDICATE_FUNCTION, $list83, listS(DO_GAF_ARG_INDEX, list(var, v_term, $INDEX, index, $TRUTH, truth, $DONE, done), append(body, NIL)))), list(PWHEN_FEATURE, $CYC_SKSI, list(PWHEN, $list87, list(WITH_SKSI_GT_SEARCH_PRED, pred, listS(DO_SKSI_GAF_ARG_INDEX_RELEVANT_PRED, list(new SubLObject[]{ var, var_mt, v_term, $INDEX_ARGNUM, index, $TRUTH, truth, $DONE, done }), list(IGNORE, var_mt), append(body, NIL))))));
    }

    public static SubLObject gt_predicate_p(final SubLObject pred) {
        return T;
    }

    public static SubLObject gt_index_argnum_for_direction(final SubLObject direction) {
        if (direction.eql($FORWARD)) {
            return ONE_INTEGER;
        }
        if (direction.eql($BACKWARD)) {
            return TWO_INTEGER;
        }
        ghl_search_vars.ghl_error(ONE_INTEGER, $str93$Invalid_direction__a, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject gt_relevant_predP(final SubLObject pred, final SubLObject search_pred) {
        if (NIL == ghl_search_vars.ghl_uses_spec_preds_p()) {
            return eql(pred, search_pred);
        }
        if (NIL != ghl_search_vars.gt_args_swapped_p()) {
            return predicate_relevance_cache.cached_spec_inverseP(search_pred, pred, UNPROVIDED);
        }
        return predicate_relevance_cache.cached_spec_predP(search_pred, pred, UNPROVIDED);
    }

    public static SubLObject all_possibly_relevant_gt_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = $gt_relevant_pred$.getDynamicValue(thread);
        if (NIL == ghl_search_vars.ghl_uses_spec_preds_p()) {
            return list(pred);
        }
        if (NIL != ghl_search_vars.gt_args_swapped_p()) {
            return genl_predicates.all_spec_inverses(pred, UNPROVIDED, UNPROVIDED);
        }
        return genl_predicates.all_spec_preds(pred, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_ghl_link_iterators_file() {
        declareMacro(me, "with_ghl_link_pred_and_direction", "WITH-GHL-LINK-PRED-AND-DIRECTION");
        declareMacro(me, "with_new_ghl_link_pred_and_direction", "WITH-NEW-GHL-LINK-PRED-AND-DIRECTION");
        declareFunction(me, "get_ghl_link_pred", "GET-GHL-LINK-PRED", 0, 0, false);
        declareFunction(me, "get_ghl_link_direction", "GET-GHL-LINK-DIRECTION", 0, 0, false);
        declareMacro(me, "do_ghl_accessible_link_nodes", "DO-GHL-ACCESSIBLE-LINK-NODES");
        declareFunction(me, "ghl_make_sbhl_support", "GHL-MAKE-SBHL-SUPPORT", 4, 0, false);
        declareMacro(me, "do_sbhl_accessible_link_nodes", "DO-SBHL-ACCESSIBLE-LINK-NODES");
        declareMacro(me, "do_gt_accessible_link_nodes", "DO-GT-ACCESSIBLE-LINK-NODES");
        declareFunction(me, "accessible_link_node_sentence_irrelevantP", "ACCESSIBLE-LINK-NODE-SENTENCE-IRRELEVANT?", 2, 0, false);
        declareFunction(me, "relevant_pred_wrt_gtP", "RELEVANT-PRED-WRT-GT?", 1, 0, false);
        declareMacro(me, "do_gt_gaf_arg_index", "DO-GT-GAF-ARG-INDEX");
        declareFunction(me, "gt_predicate_p", "GT-PREDICATE-P", 1, 0, false);
        declareFunction(me, "gt_index_argnum_for_direction", "GT-INDEX-ARGNUM-FOR-DIRECTION", 1, 0, false);
        declareFunction(me, "gt_relevant_predP", "GT-RELEVANT-PRED?", 2, 0, false);
        declareFunction(me, "all_possibly_relevant_gt_preds", "ALL-POSSIBLY-RELEVANT-GT-PREDS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_ghl_link_iterators_file() {
        defparameter("*GHL-LINK-PRED*", NIL);
        defparameter("*GHL-LINK-DIRECTION*", NIL);
        defparameter("*GT-RELEVANT-PRED*", NIL);
        return NIL;
    }

    public static SubLObject setup_ghl_link_iterators_file() {
        register_macro_helper(GHL_MAKE_SBHL_SUPPORT, DO_GHL_ACCESSIBLE_LINK_NODES);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ghl_link_iterators_file();
    }

    @Override
    public void initializeVariables() {
        init_ghl_link_iterators_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ghl_link_iterators_file();
    }

    
}

/**
 * Total time: 217 ms
 */
