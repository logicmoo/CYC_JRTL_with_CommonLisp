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

public final class ghl_link_iterators extends SubLTranslatedFile
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
    public static SubLObject with_ghl_link_pred_and_direction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred = (SubLObject)ghl_link_iterators.NIL;
        SubLObject direction = (SubLObject)ghl_link_iterators.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list0);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list0);
        direction = current.first();
        current = current.rest();
        if (ghl_link_iterators.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)ghl_link_iterators.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym2$_GHL_LINK_PRED_, pred), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym3$_GHL_LINK_DIRECTION_, direction)), ConsesLow.append(body, (SubLObject)ghl_link_iterators.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ghl_link_iterators.$list0);
        return (SubLObject)ghl_link_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 1084L)
    public static SubLObject with_new_ghl_link_pred_and_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)ghl_link_iterators.$sym1$CLET, (SubLObject)ghl_link_iterators.$list4, ConsesLow.append(body, (SubLObject)ghl_link_iterators.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 1241L)
    public static SubLObject get_ghl_link_pred() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ghl_link_iterators.$ghl_link_pred$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 1306L)
    public static SubLObject get_ghl_link_direction() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ghl_link_iterators.$ghl_link_direction$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 1381L)
    public static SubLObject do_ghl_accessible_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)ghl_link_iterators.NIL;
        SubLObject node = (SubLObject)ghl_link_iterators.NIL;
        SubLObject predicates = (SubLObject)ghl_link_iterators.NIL;
        SubLObject directions = (SubLObject)ghl_link_iterators.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list5);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list5);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list5);
        predicates = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list5);
        directions = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)ghl_link_iterators.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)ghl_link_iterators.NIL;
        SubLObject current_$1 = (SubLObject)ghl_link_iterators.NIL;
        while (ghl_link_iterators.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)ghl_link_iterators.$list5);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)ghl_link_iterators.$list5);
            if (ghl_link_iterators.NIL == conses_high.member(current_$1, (SubLObject)ghl_link_iterators.$list6, (SubLObject)ghl_link_iterators.UNPROVIDED, (SubLObject)ghl_link_iterators.UNPROVIDED)) {
                bad = (SubLObject)ghl_link_iterators.T;
            }
            if (current_$1 == ghl_link_iterators.$kw7$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (ghl_link_iterators.NIL != bad && ghl_link_iterators.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ghl_link_iterators.$list5);
        }
        final SubLObject support_var_tail = cdestructuring_bind.property_list_member((SubLObject)ghl_link_iterators.$kw8$SUPPORT_VAR, current);
        final SubLObject support_var = (SubLObject)((ghl_link_iterators.NIL != support_var_tail) ? conses_high.cadr(support_var_tail) : ghl_link_iterators.NIL);
        final SubLObject tv_tail = cdestructuring_bind.property_list_member((SubLObject)ghl_link_iterators.$kw9$TV, current);
        final SubLObject tv = (SubLObject)((ghl_link_iterators.NIL != tv_tail) ? conses_high.cadr(tv_tail) : ghl_link_iterators.$kw10$TRUE_DEF);
        final SubLObject done_var_tail = cdestructuring_bind.property_list_member((SubLObject)ghl_link_iterators.$kw11$DONE_VAR, current);
        final SubLObject done_var = (SubLObject)((ghl_link_iterators.NIL != done_var_tail) ? conses_high.cadr(done_var_tail) : ghl_link_iterators.NIL);
        final SubLObject body;
        current = (body = temp);
        if (ghl_link_iterators.NIL != support_var) {
            final SubLObject pred = (SubLObject)ghl_link_iterators.$sym12$PRED;
            final SubLObject direction = (SubLObject)ghl_link_iterators.$sym13$DIRECTION;
            return (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym14$CDOLIST_MULTIPLE, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pred, predicates), (SubLObject)ConsesLow.list(direction, directions)), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym15$WITH_GHL_LINK_PRED_AND_DIRECTION, (SubLObject)ConsesLow.list(pred, direction), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym16$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym17$SBHL_PREDICATE_P, pred), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym18$DO_SBHL_ACCESSIBLE_LINK_NODES, (SubLObject)ConsesLow.list(link_node_var, node, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym19$GET_SBHL_MODULE, pred), direction, (SubLObject)ghl_link_iterators.$kw11$DONE_VAR, done_var), (SubLObject)ConsesLow.listS((SubLObject)ghl_link_iterators.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(support_var, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym20$GHL_MAKE_SBHL_SUPPORT, pred, node, link_node_var, direction))), ConsesLow.append(body, (SubLObject)ghl_link_iterators.NIL)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym21$GT_PREDICATE_P, pred), (SubLObject)ConsesLow.listS((SubLObject)ghl_link_iterators.$sym22$DO_GT_ACCESSIBLE_LINK_NODES, (SubLObject)ConsesLow.list(new SubLObject[] { link_node_var, support_var, node, pred, direction, ghl_link_iterators.$kw9$TV, tv, ghl_link_iterators.$kw11$DONE_VAR, done_var }), ConsesLow.append(body, (SubLObject)ghl_link_iterators.NIL))))));
        }
        final SubLObject pred = (SubLObject)ghl_link_iterators.$sym23$PRED;
        final SubLObject direction = (SubLObject)ghl_link_iterators.$sym24$DIRECTION;
        final SubLObject support_var_$2 = (SubLObject)ghl_link_iterators.$sym25$SUPPORT_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym14$CDOLIST_MULTIPLE, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pred, predicates), (SubLObject)ConsesLow.list(direction, directions)), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym15$WITH_GHL_LINK_PRED_AND_DIRECTION, (SubLObject)ConsesLow.list(pred, direction), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym16$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym17$SBHL_PREDICATE_P, pred), (SubLObject)ConsesLow.listS((SubLObject)ghl_link_iterators.$sym18$DO_SBHL_ACCESSIBLE_LINK_NODES, (SubLObject)ConsesLow.list(link_node_var, node, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym19$GET_SBHL_MODULE, pred), direction, (SubLObject)ghl_link_iterators.$kw11$DONE_VAR, done_var), ConsesLow.append(body, (SubLObject)ghl_link_iterators.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym21$GT_PREDICATE_P, pred), (SubLObject)ConsesLow.listS((SubLObject)ghl_link_iterators.$sym22$DO_GT_ACCESSIBLE_LINK_NODES, (SubLObject)ConsesLow.list(new SubLObject[] { link_node_var, support_var_$2, node, pred, direction, ghl_link_iterators.$kw9$TV, tv, ghl_link_iterators.$kw11$DONE_VAR, done_var }), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym26$IGNORE, support_var_$2), ConsesLow.append(body, (SubLObject)ghl_link_iterators.NIL))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 2864L)
    public static SubLObject ghl_make_sbhl_support(final SubLObject pred, final SubLObject node, final SubLObject link_node, final SubLObject direction) {
        final SubLObject module = sbhl_module_utilities.sbhl_pred_hl_support_module(pred);
        final SubLObject sentence = (ghl_link_iterators.NIL != ghl_search_vars.ghl_forward_direction_p(direction)) ? el_utilities.make_binary_formula(pred, node, link_node) : el_utilities.make_binary_formula(pred, link_node, node);
        return arguments.make_hl_support(module, sentence, (SubLObject)ghl_link_iterators.UNPROVIDED, (SubLObject)ghl_link_iterators.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 3227L)
    public static SubLObject do_sbhl_accessible_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list28);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)ghl_link_iterators.NIL;
        SubLObject start_node = (SubLObject)ghl_link_iterators.NIL;
        SubLObject module = (SubLObject)ghl_link_iterators.NIL;
        SubLObject direction = (SubLObject)ghl_link_iterators.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list28);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list28);
        start_node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list28);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list28);
        direction = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)ghl_link_iterators.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)ghl_link_iterators.NIL;
        SubLObject current_$3 = (SubLObject)ghl_link_iterators.NIL;
        while (ghl_link_iterators.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)ghl_link_iterators.$list28);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)ghl_link_iterators.$list28);
            if (ghl_link_iterators.NIL == conses_high.member(current_$3, (SubLObject)ghl_link_iterators.$list29, (SubLObject)ghl_link_iterators.UNPROVIDED, (SubLObject)ghl_link_iterators.UNPROVIDED)) {
                bad = (SubLObject)ghl_link_iterators.T;
            }
            if (current_$3 == ghl_link_iterators.$kw7$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (ghl_link_iterators.NIL != bad && ghl_link_iterators.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ghl_link_iterators.$list28);
        }
        final SubLObject done_var_tail = cdestructuring_bind.property_list_member((SubLObject)ghl_link_iterators.$kw11$DONE_VAR, current);
        final SubLObject done_var = (SubLObject)((ghl_link_iterators.NIL != done_var_tail) ? conses_high.cadr(done_var_tail) : ghl_link_iterators.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject link_nodes_var = (SubLObject)ghl_link_iterators.$sym30$LINK_NODES_VAR;
        final SubLObject search_direction = (SubLObject)ghl_link_iterators.$sym31$SEARCH_DIRECTION;
        final SubLObject link_direction = (SubLObject)ghl_link_iterators.$sym32$LINK_DIRECTION;
        final SubLObject d_link = (SubLObject)ghl_link_iterators.$sym33$D_LINK;
        final SubLObject mt = (SubLObject)ghl_link_iterators.$sym34$MT;
        final SubLObject tv_links = (SubLObject)ghl_link_iterators.$sym35$TV_LINKS;
        final SubLObject tv = (SubLObject)ghl_link_iterators.$sym36$TV;
        final SubLObject node = (SubLObject)ghl_link_iterators.$sym37$NODE;
        return (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(node, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym38$NAUT_TO_NART, start_node))), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym39$WITH_SBHL_SEARCH_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym40$POSSIBLY_FLIP_GENL_INVERSE_MODE, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym16$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym41$FORT_P, node), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym42$WITH_SBHL_GRAPH_LINK, (SubLObject)ConsesLow.list(d_link, node, module), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym43$DO_GHL_RELEVANT_DIRECTIONS, (SubLObject)ConsesLow.list(search_direction, direction, (SubLObject)ghl_link_iterators.$kw11$DONE_VAR, done_var), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(link_direction, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym44$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, search_direction, module))), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym45$DO_SBHL_DIRECTION_LINK, (SubLObject)ConsesLow.list(mt, tv_links, link_direction, d_link, module, done_var), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym46$PWHEN, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym47$RELEVANT_MT_, mt), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym48$_SBHL_LINK_MT_, mt)), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym49$DO_SBHL_TV_LINKS, (SubLObject)ConsesLow.list(tv, link_nodes_var, tv_links, done_var), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym46$PWHEN, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym50$RELEVANT_SBHL_TV_, tv), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym51$_SBHL_LINK_TV_, tv)), (SubLObject)ConsesLow.listS((SubLObject)ghl_link_iterators.$sym52$DO_SET_OR_LIST, (SubLObject)ConsesLow.list(link_node_var, link_nodes_var, (SubLObject)ghl_link_iterators.$kw53$DONE, done_var), ConsesLow.append(body, (SubLObject)ghl_link_iterators.NIL)))))))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym54$CLOSED_NAUT_, node), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym43$DO_GHL_RELEVANT_DIRECTIONS, (SubLObject)ConsesLow.list(search_direction, direction, (SubLObject)ghl_link_iterators.$kw11$DONE_VAR, done_var), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(link_direction, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym44$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION, search_direction, module))), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym55$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS, (SubLObject)ConsesLow.list(link_nodes_var, node, link_direction, module, done_var), (SubLObject)ConsesLow.listS((SubLObject)ghl_link_iterators.$sym52$DO_SET_OR_LIST, (SubLObject)ConsesLow.list(link_node_var, link_nodes_var, (SubLObject)ghl_link_iterators.$kw53$DONE, done_var), ConsesLow.append(body, (SubLObject)ghl_link_iterators.NIL))))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 4748L)
    public static SubLObject do_gt_accessible_link_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = (SubLObject)ghl_link_iterators.NIL;
        SubLObject assertion_var = (SubLObject)ghl_link_iterators.NIL;
        SubLObject node = (SubLObject)ghl_link_iterators.NIL;
        SubLObject pred = (SubLObject)ghl_link_iterators.NIL;
        SubLObject direction = (SubLObject)ghl_link_iterators.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list56);
        link_node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list56);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list56);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list56);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list56);
        direction = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)ghl_link_iterators.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)ghl_link_iterators.NIL;
        SubLObject current_$4 = (SubLObject)ghl_link_iterators.NIL;
        while (ghl_link_iterators.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)ghl_link_iterators.$list56);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)ghl_link_iterators.$list56);
            if (ghl_link_iterators.NIL == conses_high.member(current_$4, (SubLObject)ghl_link_iterators.$list57, (SubLObject)ghl_link_iterators.UNPROVIDED, (SubLObject)ghl_link_iterators.UNPROVIDED)) {
                bad = (SubLObject)ghl_link_iterators.T;
            }
            if (current_$4 == ghl_link_iterators.$kw7$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (ghl_link_iterators.NIL != bad && ghl_link_iterators.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ghl_link_iterators.$list56);
        }
        final SubLObject tv_tail = cdestructuring_bind.property_list_member((SubLObject)ghl_link_iterators.$kw9$TV, current);
        final SubLObject tv = (SubLObject)((ghl_link_iterators.NIL != tv_tail) ? conses_high.cadr(tv_tail) : ghl_link_iterators.$kw10$TRUE_DEF);
        final SubLObject done_var_tail = cdestructuring_bind.property_list_member((SubLObject)ghl_link_iterators.$kw11$DONE_VAR, current);
        final SubLObject done_var = (SubLObject)((ghl_link_iterators.NIL != done_var_tail) ? conses_high.cadr(done_var_tail) : ghl_link_iterators.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject search_direction = (SubLObject)ghl_link_iterators.$sym58$SEARCH_DIRECTION;
        final SubLObject index_argnum = (SubLObject)ghl_link_iterators.$sym59$INDEX_ARGNUM;
        final SubLObject gather_argnum = (SubLObject)ghl_link_iterators.$sym60$GATHER_ARGNUM;
        final SubLObject assertion = (SubLObject)ghl_link_iterators.$sym61$ASSERTION;
        final SubLObject truth = (SubLObject)ghl_link_iterators.$sym62$TRUTH;
        final SubLObject strength = (SubLObject)ghl_link_iterators.$sym63$STRENGTH;
        return (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(truth, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym64$TV_TRUTH, tv)), (SubLObject)ConsesLow.list(strength, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym65$TV_STRENGTH, tv))), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym66$WITH_GT_ARGS_UNSWAPPED, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym43$DO_GHL_RELEVANT_DIRECTIONS, (SubLObject)ConsesLow.list(search_direction, direction, (SubLObject)ghl_link_iterators.$kw11$DONE_VAR, done_var), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(index_argnum, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym67$GT_INDEX_ARGNUM_FOR_DIRECTION, search_direction)), (SubLObject)ConsesLow.list(gather_argnum, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym68$OTHER_BINARY_ARG, index_argnum))), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym69$DO_GT_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { assertion, node, pred, ghl_link_iterators.$kw70$INDEX, index_argnum, ghl_link_iterators.$kw71$TRUTH, truth, ghl_link_iterators.$kw53$DONE, done_var }), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym72$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym73$ACCESSIBLE_LINK_NODE_SENTENCE_IRRELEVANT_, assertion, strength), (SubLObject)ConsesLow.listS((SubLObject)ghl_link_iterators.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(link_node_var, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym74$FORMULA_ARG, assertion, gather_argnum)), (SubLObject)ConsesLow.list(assertion_var, assertion)), ConsesLow.append(body, (SubLObject)ghl_link_iterators.NIL)))), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym46$PWHEN, (SubLObject)ghl_link_iterators.$list75, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym76$WITH_GT_ARGS_SWAPPED, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym69$DO_GT_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { assertion, node, pred, ghl_link_iterators.$kw70$INDEX, gather_argnum, ghl_link_iterators.$kw71$TRUTH, truth, ghl_link_iterators.$kw53$DONE, done_var }), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym72$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym73$ACCESSIBLE_LINK_NODE_SENTENCE_IRRELEVANT_, assertion, strength), (SubLObject)ConsesLow.listS((SubLObject)ghl_link_iterators.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(link_node_var, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym74$FORMULA_ARG, assertion, index_argnum)), (SubLObject)ConsesLow.list(assertion_var, assertion)), ConsesLow.append(body, (SubLObject)ghl_link_iterators.NIL))))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 6008L)
    public static SubLObject accessible_link_node_sentence_irrelevantP(final SubLObject sentence, final SubLObject strength) {
        return (SubLObject)SubLObjectFactory.makeBoolean(ghl_link_iterators.NIL != assertion_handles.assertion_p(sentence) && (ghl_link_iterators.NIL != assertion_utilities.excepted_assertionP(sentence, (SubLObject)ghl_link_iterators.UNPROVIDED, (SubLObject)ghl_link_iterators.UNPROVIDED) || ghl_link_iterators.NIL == enumeration_types.el_strength_implies(assertions_high.assertion_strength(sentence), strength)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 6413L)
    public static SubLObject relevant_pred_wrt_gtP(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gt_relevant_predP(predicate, ghl_link_iterators.$gt_relevant_pred$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 6524L)
    public static SubLObject do_gt_gaf_arg_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)ghl_link_iterators.NIL;
        SubLObject v_term = (SubLObject)ghl_link_iterators.NIL;
        SubLObject pred = (SubLObject)ghl_link_iterators.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list77);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list77);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ghl_link_iterators.$list77);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)ghl_link_iterators.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)ghl_link_iterators.NIL;
        SubLObject current_$5 = (SubLObject)ghl_link_iterators.NIL;
        while (ghl_link_iterators.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)ghl_link_iterators.$list77);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)ghl_link_iterators.$list77);
            if (ghl_link_iterators.NIL == conses_high.member(current_$5, (SubLObject)ghl_link_iterators.$list78, (SubLObject)ghl_link_iterators.UNPROVIDED, (SubLObject)ghl_link_iterators.UNPROVIDED)) {
                bad = (SubLObject)ghl_link_iterators.T;
            }
            if (current_$5 == ghl_link_iterators.$kw7$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (ghl_link_iterators.NIL != bad && ghl_link_iterators.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ghl_link_iterators.$list77);
        }
        final SubLObject index_tail = cdestructuring_bind.property_list_member((SubLObject)ghl_link_iterators.$kw70$INDEX, current);
        final SubLObject index = (SubLObject)((ghl_link_iterators.NIL != index_tail) ? conses_high.cadr(index_tail) : ghl_link_iterators.NIL);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)ghl_link_iterators.$kw71$TRUTH, current);
        final SubLObject truth = (SubLObject)((ghl_link_iterators.NIL != truth_tail) ? conses_high.cadr(truth_tail) : ghl_link_iterators.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)ghl_link_iterators.$kw53$DONE, current);
        final SubLObject done = (SubLObject)((ghl_link_iterators.NIL != done_tail) ? conses_high.cadr(done_tail) : ghl_link_iterators.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject var_mt = (SubLObject)ghl_link_iterators.$sym79$VAR_MT;
        return (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym80$PROGN, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym81$_GT_RELEVANT_PRED_, pred)), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym82$WITH_PREDICATE_FUNCTION, (SubLObject)ghl_link_iterators.$list83, (SubLObject)ConsesLow.listS((SubLObject)ghl_link_iterators.$sym84$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(var, v_term, (SubLObject)ghl_link_iterators.$kw70$INDEX, index, (SubLObject)ghl_link_iterators.$kw71$TRUTH, truth, (SubLObject)ghl_link_iterators.$kw53$DONE, done), ConsesLow.append(body, (SubLObject)ghl_link_iterators.NIL)))), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym85$PWHEN_FEATURE, (SubLObject)ghl_link_iterators.$kw86$CYC_SKSI, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym46$PWHEN, (SubLObject)ghl_link_iterators.$list87, (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym88$WITH_SKSI_GT_SEARCH_PRED, pred, (SubLObject)ConsesLow.listS((SubLObject)ghl_link_iterators.$sym89$DO_SKSI_GAF_ARG_INDEX_RELEVANT_PRED, (SubLObject)ConsesLow.list(new SubLObject[] { var, var_mt, v_term, ghl_link_iterators.$kw90$INDEX_ARGNUM, index, ghl_link_iterators.$kw71$TRUTH, truth, ghl_link_iterators.$kw53$DONE, done }), (SubLObject)ConsesLow.list((SubLObject)ghl_link_iterators.$sym26$IGNORE, var_mt), ConsesLow.append(body, (SubLObject)ghl_link_iterators.NIL))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 7209L)
    public static SubLObject gt_predicate_p(final SubLObject pred) {
        return (SubLObject)ghl_link_iterators.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 7312L)
    public static SubLObject gt_index_argnum_for_direction(final SubLObject direction) {
        if (direction.eql((SubLObject)ghl_link_iterators.$kw91$FORWARD)) {
            return (SubLObject)ghl_link_iterators.ONE_INTEGER;
        }
        if (direction.eql((SubLObject)ghl_link_iterators.$kw92$BACKWARD)) {
            return (SubLObject)ghl_link_iterators.TWO_INTEGER;
        }
        ghl_search_vars.ghl_error((SubLObject)ghl_link_iterators.ONE_INTEGER, (SubLObject)ghl_link_iterators.$str93$Invalid_direction__a, direction, (SubLObject)ghl_link_iterators.UNPROVIDED, (SubLObject)ghl_link_iterators.UNPROVIDED, (SubLObject)ghl_link_iterators.UNPROVIDED, (SubLObject)ghl_link_iterators.UNPROVIDED);
        return (SubLObject)ghl_link_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 7513L)
    public static SubLObject gt_relevant_predP(final SubLObject pred, final SubLObject search_pred) {
        if (ghl_link_iterators.NIL == ghl_search_vars.ghl_uses_spec_preds_p()) {
            return Equality.eql(pred, search_pred);
        }
        if (ghl_link_iterators.NIL != ghl_search_vars.gt_args_swapped_p()) {
            return predicate_relevance_cache.cached_spec_inverseP(search_pred, pred, (SubLObject)ghl_link_iterators.UNPROVIDED);
        }
        return predicate_relevance_cache.cached_spec_predP(search_pred, pred, (SubLObject)ghl_link_iterators.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ghl-link-iterators.lisp", position = 7770L)
    public static SubLObject all_possibly_relevant_gt_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = ghl_link_iterators.$gt_relevant_pred$.getDynamicValue(thread);
        if (ghl_link_iterators.NIL == ghl_search_vars.ghl_uses_spec_preds_p()) {
            return (SubLObject)ConsesLow.list(pred);
        }
        if (ghl_link_iterators.NIL != ghl_search_vars.gt_args_swapped_p()) {
            return genl_predicates.all_spec_inverses(pred, (SubLObject)ghl_link_iterators.UNPROVIDED, (SubLObject)ghl_link_iterators.UNPROVIDED);
        }
        return genl_predicates.all_spec_preds(pred, (SubLObject)ghl_link_iterators.UNPROVIDED, (SubLObject)ghl_link_iterators.UNPROVIDED);
    }
    
    public static SubLObject declare_ghl_link_iterators_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_link_iterators", "with_ghl_link_pred_and_direction", "WITH-GHL-LINK-PRED-AND-DIRECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_link_iterators", "with_new_ghl_link_pred_and_direction", "WITH-NEW-GHL-LINK-PRED-AND-DIRECTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_link_iterators", "get_ghl_link_pred", "GET-GHL-LINK-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_link_iterators", "get_ghl_link_direction", "GET-GHL-LINK-DIRECTION", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_link_iterators", "do_ghl_accessible_link_nodes", "DO-GHL-ACCESSIBLE-LINK-NODES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_link_iterators", "ghl_make_sbhl_support", "GHL-MAKE-SBHL-SUPPORT", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_link_iterators", "do_sbhl_accessible_link_nodes", "DO-SBHL-ACCESSIBLE-LINK-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_link_iterators", "do_gt_accessible_link_nodes", "DO-GT-ACCESSIBLE-LINK-NODES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_link_iterators", "accessible_link_node_sentence_irrelevantP", "ACCESSIBLE-LINK-NODE-SENTENCE-IRRELEVANT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_link_iterators", "relevant_pred_wrt_gtP", "RELEVANT-PRED-WRT-GT?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.ghl_link_iterators", "do_gt_gaf_arg_index", "DO-GT-GAF-ARG-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_link_iterators", "gt_predicate_p", "GT-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_link_iterators", "gt_index_argnum_for_direction", "GT-INDEX-ARGNUM-FOR-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_link_iterators", "gt_relevant_predP", "GT-RELEVANT-PRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ghl_link_iterators", "all_possibly_relevant_gt_preds", "ALL-POSSIBLY-RELEVANT-GT-PREDS", 0, 0, false);
        return (SubLObject)ghl_link_iterators.NIL;
    }
    
    public static SubLObject init_ghl_link_iterators_file() {
        ghl_link_iterators.$ghl_link_pred$ = SubLFiles.defparameter("*GHL-LINK-PRED*", (SubLObject)ghl_link_iterators.NIL);
        ghl_link_iterators.$ghl_link_direction$ = SubLFiles.defparameter("*GHL-LINK-DIRECTION*", (SubLObject)ghl_link_iterators.NIL);
        ghl_link_iterators.$gt_relevant_pred$ = SubLFiles.defparameter("*GT-RELEVANT-PRED*", (SubLObject)ghl_link_iterators.NIL);
        return (SubLObject)ghl_link_iterators.NIL;
    }
    
    public static SubLObject setup_ghl_link_iterators_file() {
        access_macros.register_macro_helper((SubLObject)ghl_link_iterators.$sym20$GHL_MAKE_SBHL_SUPPORT, (SubLObject)ghl_link_iterators.$sym27$DO_GHL_ACCESSIBLE_LINK_NODES);
        return (SubLObject)ghl_link_iterators.NIL;
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
    
    static {
        me = (SubLFile)new ghl_link_iterators();
        ghl_link_iterators.$ghl_link_pred$ = null;
        ghl_link_iterators.$ghl_link_direction$ = null;
        ghl_link_iterators.$gt_relevant_pred$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym2$_GHL_LINK_PRED_ = SubLObjectFactory.makeSymbol("*GHL-LINK-PRED*");
        $sym3$_GHL_LINK_DIRECTION_ = SubLObjectFactory.makeSymbol("*GHL-LINK-DIRECTION*");
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GHL-LINK-PRED*"), (SubLObject)ghl_link_iterators.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GHL-LINK-DIRECTION*"), (SubLObject)ghl_link_iterators.NIL));
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATES"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF")), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPORT-VAR"), (SubLObject)SubLObjectFactory.makeKeyword("TV"), (SubLObject)SubLObjectFactory.makeKeyword("DONE-VAR"));
        $kw7$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw8$SUPPORT_VAR = SubLObjectFactory.makeKeyword("SUPPORT-VAR");
        $kw9$TV = SubLObjectFactory.makeKeyword("TV");
        $kw10$TRUE_DEF = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $kw11$DONE_VAR = SubLObjectFactory.makeKeyword("DONE-VAR");
        $sym12$PRED = SubLObjectFactory.makeUninternedSymbol("PRED");
        $sym13$DIRECTION = SubLObjectFactory.makeUninternedSymbol("DIRECTION");
        $sym14$CDOLIST_MULTIPLE = SubLObjectFactory.makeSymbol("CDOLIST-MULTIPLE");
        $sym15$WITH_GHL_LINK_PRED_AND_DIRECTION = SubLObjectFactory.makeSymbol("WITH-GHL-LINK-PRED-AND-DIRECTION");
        $sym16$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym17$SBHL_PREDICATE_P = SubLObjectFactory.makeSymbol("SBHL-PREDICATE-P");
        $sym18$DO_SBHL_ACCESSIBLE_LINK_NODES = SubLObjectFactory.makeSymbol("DO-SBHL-ACCESSIBLE-LINK-NODES");
        $sym19$GET_SBHL_MODULE = SubLObjectFactory.makeSymbol("GET-SBHL-MODULE");
        $sym20$GHL_MAKE_SBHL_SUPPORT = SubLObjectFactory.makeSymbol("GHL-MAKE-SBHL-SUPPORT");
        $sym21$GT_PREDICATE_P = SubLObjectFactory.makeSymbol("GT-PREDICATE-P");
        $sym22$DO_GT_ACCESSIBLE_LINK_NODES = SubLObjectFactory.makeSymbol("DO-GT-ACCESSIBLE-LINK-NODES");
        $sym23$PRED = SubLObjectFactory.makeUninternedSymbol("PRED");
        $sym24$DIRECTION = SubLObjectFactory.makeUninternedSymbol("DIRECTION");
        $sym25$SUPPORT_VAR = SubLObjectFactory.makeUninternedSymbol("SUPPORT-VAR");
        $sym26$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym27$DO_GHL_ACCESSIBLE_LINK_NODES = SubLObjectFactory.makeSymbol("DO-GHL-ACCESSIBLE-LINK-NODES");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("START-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE-VAR"));
        $sym30$LINK_NODES_VAR = SubLObjectFactory.makeUninternedSymbol("LINK-NODES-VAR");
        $sym31$SEARCH_DIRECTION = SubLObjectFactory.makeUninternedSymbol("SEARCH-DIRECTION");
        $sym32$LINK_DIRECTION = SubLObjectFactory.makeUninternedSymbol("LINK-DIRECTION");
        $sym33$D_LINK = SubLObjectFactory.makeUninternedSymbol("D-LINK");
        $sym34$MT = SubLObjectFactory.makeUninternedSymbol("MT");
        $sym35$TV_LINKS = SubLObjectFactory.makeUninternedSymbol("TV-LINKS");
        $sym36$TV = SubLObjectFactory.makeUninternedSymbol("TV");
        $sym37$NODE = SubLObjectFactory.makeUninternedSymbol("NODE");
        $sym38$NAUT_TO_NART = SubLObjectFactory.makeSymbol("NAUT-TO-NART");
        $sym39$WITH_SBHL_SEARCH_MODULE = SubLObjectFactory.makeSymbol("WITH-SBHL-SEARCH-MODULE");
        $sym40$POSSIBLY_FLIP_GENL_INVERSE_MODE = SubLObjectFactory.makeSymbol("POSSIBLY-FLIP-GENL-INVERSE-MODE");
        $sym41$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym42$WITH_SBHL_GRAPH_LINK = SubLObjectFactory.makeSymbol("WITH-SBHL-GRAPH-LINK");
        $sym43$DO_GHL_RELEVANT_DIRECTIONS = SubLObjectFactory.makeSymbol("DO-GHL-RELEVANT-DIRECTIONS");
        $sym44$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION = SubLObjectFactory.makeSymbol("SBHL-SEARCH-DIRECTION-TO-LINK-DIRECTION");
        $sym45$DO_SBHL_DIRECTION_LINK = SubLObjectFactory.makeSymbol("DO-SBHL-DIRECTION-LINK");
        $sym46$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym47$RELEVANT_MT_ = SubLObjectFactory.makeSymbol("RELEVANT-MT?");
        $sym48$_SBHL_LINK_MT_ = SubLObjectFactory.makeSymbol("*SBHL-LINK-MT*");
        $sym49$DO_SBHL_TV_LINKS = SubLObjectFactory.makeSymbol("DO-SBHL-TV-LINKS");
        $sym50$RELEVANT_SBHL_TV_ = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV?");
        $sym51$_SBHL_LINK_TV_ = SubLObjectFactory.makeSymbol("*SBHL-LINK-TV*");
        $sym52$DO_SET_OR_LIST = SubLObjectFactory.makeSymbol("DO-SET-OR-LIST");
        $kw53$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym54$CLOSED_NAUT_ = SubLObjectFactory.makeSymbol("CLOSED-NAUT?");
        $sym55$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS = SubLObjectFactory.makeSymbol("DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF")), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TV"), (SubLObject)SubLObjectFactory.makeKeyword("DONE-VAR"));
        $sym58$SEARCH_DIRECTION = SubLObjectFactory.makeUninternedSymbol("SEARCH-DIRECTION");
        $sym59$INDEX_ARGNUM = SubLObjectFactory.makeUninternedSymbol("INDEX-ARGNUM");
        $sym60$GATHER_ARGNUM = SubLObjectFactory.makeUninternedSymbol("GATHER-ARGNUM");
        $sym61$ASSERTION = SubLObjectFactory.makeUninternedSymbol("ASSERTION");
        $sym62$TRUTH = SubLObjectFactory.makeUninternedSymbol("TRUTH");
        $sym63$STRENGTH = SubLObjectFactory.makeUninternedSymbol("STRENGTH");
        $sym64$TV_TRUTH = SubLObjectFactory.makeSymbol("TV-TRUTH");
        $sym65$TV_STRENGTH = SubLObjectFactory.makeSymbol("TV-STRENGTH");
        $sym66$WITH_GT_ARGS_UNSWAPPED = SubLObjectFactory.makeSymbol("WITH-GT-ARGS-UNSWAPPED");
        $sym67$GT_INDEX_ARGNUM_FOR_DIRECTION = SubLObjectFactory.makeSymbol("GT-INDEX-ARGNUM-FOR-DIRECTION");
        $sym68$OTHER_BINARY_ARG = SubLObjectFactory.makeSymbol("OTHER-BINARY-ARG");
        $sym69$DO_GT_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("DO-GT-GAF-ARG-INDEX");
        $kw70$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw71$TRUTH = SubLObjectFactory.makeKeyword("TRUTH");
        $sym72$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym73$ACCESSIBLE_LINK_NODE_SENTENCE_IRRELEVANT_ = SubLObjectFactory.makeSymbol("ACCESSIBLE-LINK-NODE-SENTENCE-IRRELEVANT?");
        $sym74$FORMULA_ARG = SubLObjectFactory.makeSymbol("FORMULA-ARG");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GHL-USES-SPEC-PREDS-P"));
        $sym76$WITH_GT_ARGS_SWAPPED = SubLObjectFactory.makeSymbol("WITH-GT-ARGS-SWAPPED");
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym79$VAR_MT = SubLObjectFactory.makeUninternedSymbol("VAR-MT");
        $sym80$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym81$_GT_RELEVANT_PRED_ = SubLObjectFactory.makeSymbol("*GT-RELEVANT-PRED*");
        $sym82$WITH_PREDICATE_FUNCTION = SubLObjectFactory.makeSymbol("WITH-PREDICATE-FUNCTION");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-PRED-WRT-GT?"));
        $sym84$DO_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX");
        $sym85$PWHEN_FEATURE = SubLObjectFactory.makeSymbol("PWHEN-FEATURE");
        $kw86$CYC_SKSI = SubLObjectFactory.makeKeyword("CYC-SKSI");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GT-USE-SKSI?"));
        $sym88$WITH_SKSI_GT_SEARCH_PRED = SubLObjectFactory.makeSymbol("WITH-SKSI-GT-SEARCH-PRED");
        $sym89$DO_SKSI_GAF_ARG_INDEX_RELEVANT_PRED = SubLObjectFactory.makeSymbol("DO-SKSI-GAF-ARG-INDEX-RELEVANT-PRED");
        $kw90$INDEX_ARGNUM = SubLObjectFactory.makeKeyword("INDEX-ARGNUM");
        $kw91$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $kw92$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $str93$Invalid_direction__a = SubLObjectFactory.makeString("Invalid direction ~a");
    }
}

/*

	Total time: 217 ms
	
*/