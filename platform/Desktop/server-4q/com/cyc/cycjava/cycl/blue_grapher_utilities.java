package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.browser.cb_query_browser;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class blue_grapher_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.blue_grapher_utilities";
    public static final String myFingerPrint = "f902a76ede6edeee341747b76d704ec76e3246f94b92d01750a21120e7dbd76c";
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 784L)
    public static SubLSymbol $blue_filter_fns$;
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 1747L)
    private static SubLSymbol $default_blue_filter_fn_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 2048L)
    private static SubLSymbol $default_blue_filter_fn_strength$;
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 2377L)
    private static SubLSymbol $default_blue_filter_fn_type$;
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 5677L)
    public static SubLSymbol $blue_builder_fns$;
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 5848L)
    public static SubLSymbol $blue_builder_fn_to_deflist_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 36501L)
    private static SubLSymbol $inference_answers_default_undetermined_relation$;
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 46157L)
    private static SubLSymbol $blue_event_dispatcher_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 46157L)
    private static SubLSymbol $blue_event_dispatcher_listeners$;
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 47168L)
    private static SubLSymbol $blue_message_mailbox_suite$;
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 47982L)
    private static SubLSymbol $blue_event_to_blue_event_listener$;
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLSymbol $dtp_blue_graph$;
    private static final SubLSymbol $sym0$_BLUE_FILTER_FNS_;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$PROGN;
    private static final SubLSymbol $sym3$SETHASH;
    private static final SubLSymbol $sym4$QUOTE;
    private static final SubLSymbol $sym5$DEFINE_PROTECTED;
    private static final SubLSymbol $sym6$REGISTER_API_PREDEFINED_FUNCTION;
    private static final SubLSymbol $sym7$_DEFAULT_BLUE_FILTER_FN_COST_;
    private static final SubLSymbol $kw8$COST;
    private static final SubLSymbol $sym9$_DEFAULT_BLUE_FILTER_FN_STRENGTH_;
    private static final SubLSymbol $kw10$STRENGTH;
    private static final SubLSymbol $sym11$_DEFAULT_BLUE_FILTER_FN_TYPE_;
    private static final SubLSymbol $kw12$TYPE;
    private static final SubLString $str13$APPLY_BLUE_FILTER_FN___A_is_not_a;
    private static final SubLSymbol $sym14$_;
    private static final SubLSymbol $sym15$GET_BLUE_FILTER_FN_STRENGTH;
    private static final SubLSymbol $sym16$MAKE_KEYWORD;
    private static final SubLSymbol $sym17$BFF_ARBITRARY_UNIONS;
    private static final SubLList $list18;
    private static final SubLObject $const19$ArbitraryUnion;
    private static final SubLSymbol $sym20$BFF_CYC_KB_SUBSET_COLLECTIONS;
    private static final SubLObject $const21$CycKBSubsetCollection;
    private static final SubLSymbol $sym22$BFF_MOST_GENERAL_5;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$GENERALITY_ESTIMATE_;
    private static final SubLSymbol $sym25$BFF_MOST_GENERAL_10;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$BFF_MOST_GENERAL_20;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$_BLUE_BUILDER_FNS_;
    private static final SubLSymbol $sym30$_BLUE_BUILDER_FN_TO_DEFLIST_HASH_;
    private static final SubLList $list31;
    private static final SubLString $str32$BLUE_BUILDER___A_is_not_a_blue_bu;
    private static final SubLSymbol $sym33$STRING_;
    private static final SubLSymbol $sym34$SYMBOL_NAME;
    private static final SubLSymbol $sym35$BBF_FORWARD_TRUE;
    private static final SubLList $list36;
    private static final SubLSymbol $kw37$PREDS;
    private static final SubLSymbol $kw38$FORTS;
    private static final SubLSymbol $kw39$MT;
    private static final SubLSymbol $kw40$FILTER_FNS;
    private static final SubLSymbol $kw41$DEPTH;
    private static final SubLSymbol $kw42$POST_MINIMIZATION;
    private static final SubLSymbol $sym43$BBF_BACKWARD_TRUE;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$BBF_MIN_FORWARD_TRUE;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$BBF_MIN_BACKWARD_TRUE;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$BBF_MIN_CEILINGS_FORWARD_TRUE;
    private static final SubLList $list50;
    private static final SubLObject $const51$True_JustificationTruth;
    private static final SubLSymbol $sym52$BBF_MIN_FORWARD_AND_BACKWARD_TRUE;
    private static final SubLList $list53;
    private static final SubLInteger $int54$32;
    private static final SubLSymbol $sym55$APPEND;
    private static final SubLSymbol $sym56$BBF_SCRIPT;
    private static final SubLList $list57;
    private static final SubLObject $const58$CurrentWorldDataCollectorMt_NonHo;
    private static final SubLObject $const59$Situation;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$TERNARY_PREDICATE_;
    private static final SubLObject $const62$QuasiTemporalSubSituationTypesPre;
    private static final SubLObject $const63$SomethingExisting;
    private static final SubLSymbol $kw64$ACTOR;
    private static final SubLSymbol $kw65$ROLE;
    private static final SubLSymbol $kw66$SCENE;
    private static final SubLSymbol $kw67$ORIGINAL_PREDICATE;
    private static final SubLList $list68;
    private static final SubLObject $const69$SituationTypeRelation_BasicActorT;
    private static final SubLObject $const70$individualPlaysRoleInSubSituation;
    private static final SubLObject $const71$Individual;
    private static final SubLObject $const72$SituationTypeRelation_SitTypeToSu;
    private static final SubLList $list73;
    private static final SubLObject $const74$GraphicallyEditableRoleMappingPre;
    private static final SubLSymbol $kw75$HEAD;
    private static final SubLSymbol $kw76$TAIL;
    private static final SubLSymbol $kw77$RELATION;
    private static final SubLObject $const78$EverythingPSC;
    private static final SubLSymbol $sym79$BBF_INFERENCE_ANSWERS;
    private static final SubLList $list80;
    private static final SubLSymbol $kw81$PARAMS;
    private static final SubLSymbol $kw82$INFERENCE_STORE_ID;
    private static final SubLSymbol $kw83$INFERENCE_ID;
    private static final SubLSymbol $kw84$DIRECTION;
    private static final SubLSymbol $kw85$UNDIRECTED;
    private static final SubLObject $const86$conceptuallyRelated;
    private static final SubLObject $const87$arg1Isa;
    private static final SubLObject $const88$CycLSentence_Assertible;
    private static final SubLObject $const89$different;
    private static final SubLSymbol $kw90$LEFT;
    private static final SubLString $str91$Query;
    private static final SubLSymbol $kw92$NBSP;
    private static final SubLString $str93$Edge_Templates;
    private static final SubLSymbol $kw94$TOP;
    private static final SubLString $str95$_____;
    private static final SubLString $str96$______;
    private static final SubLSymbol $sym97$BBF_INFERENCE;
    private static final SubLList $list98;
    private static final SubLSymbol $kw99$STORE_SUID;
    private static final SubLSymbol $kw100$INFERENCE_SUID;
    private static final SubLString $str101$Inference_not_found_;
    private static final SubLSymbol $kw102$NEG;
    private static final SubLList $list103;
    private static final SubLSymbol $kw104$POS;
    private static final SubLSymbol $sym105$BBF_RULE;
    private static final SubLList $list106;
    private static final SubLSymbol $kw107$ASSERTIONS;
    private static final SubLList $list108;
    private static final SubLSymbol $sym109$INTERN_EL_VAR;
    private static final SubLSymbol $kw110$NODES;
    private static final SubLSymbol $kw111$EDGES;
    private static final SubLSymbol $kw112$PROPERTIES;
    private static final SubLSymbol $kw113$DEFAULT;
    private static final SubLSymbol $kw114$TRUE;
    private static final SubLSymbol $kw115$TRUE_;
    private static final SubLSymbol $kw116$ASSERTED_;
    private static final SubLSymbol $kw117$CORE;
    private static final SubLSymbol $kw118$BLUE_GRAPHER_BASE_EVENT;
    private static final SubLSymbol $kw119$CYC_APPLICATION_EVENT;
    private static final SubLSymbol $kw120$BLUE_EVENT;
    private static final SubLString $str121$BLUE_EVENT_DISPATCHER_Lock;
    private static final SubLSymbol $sym122$_BLUE_EVENT_DISPATCHER_LISTENERS_;
    private static final SubLSymbol $sym123$BLUE_FETCH_EVENT;
    private static final SubLSymbol $sym124$BLUE_MAP_EVENT_TO_BLUE_EVENT;
    private static final SubLSymbol $sym125$BLUE_GRAPH;
    private static final SubLSymbol $sym126$BLUE_GRAPH_P;
    private static final SubLList $list127;
    private static final SubLList $list128;
    private static final SubLList $list129;
    private static final SubLList $list130;
    private static final SubLSymbol $sym131$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym132$BLUE_GRAPH_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$BLUE_GRAPH_ISG;
    private static final SubLSymbol $sym135$_CSETF_BLUE_GRAPH_ISG;
    private static final SubLSymbol $sym136$BLUE_GRAPH_NODE_LABEL_MAP;
    private static final SubLSymbol $sym137$_CSETF_BLUE_GRAPH_NODE_LABEL_MAP;
    private static final SubLSymbol $sym138$BLUE_GRAPH_NODES;
    private static final SubLSymbol $sym139$_CSETF_BLUE_GRAPH_NODES;
    private static final SubLSymbol $sym140$BLUE_GRAPH_EDGE_LABEL_MAP;
    private static final SubLSymbol $sym141$_CSETF_BLUE_GRAPH_EDGE_LABEL_MAP;
    private static final SubLSymbol $sym142$BLUE_GRAPH_EDGES;
    private static final SubLSymbol $sym143$_CSETF_BLUE_GRAPH_EDGES;
    private static final SubLSymbol $sym144$BLUE_GRAPH_NODE_DEFINITIONS;
    private static final SubLSymbol $sym145$_CSETF_BLUE_GRAPH_NODE_DEFINITIONS;
    private static final SubLSymbol $sym146$BLUE_GRAPH_EDGE_DEFINITIONS;
    private static final SubLSymbol $sym147$_CSETF_BLUE_GRAPH_EDGE_DEFINITIONS;
    private static final SubLSymbol $sym148$BLUE_GRAPH_OPTIONS;
    private static final SubLSymbol $sym149$_CSETF_BLUE_GRAPH_OPTIONS;
    private static final SubLSymbol $kw150$ISG;
    private static final SubLSymbol $kw151$NODE_LABEL_MAP;
    private static final SubLSymbol $kw152$EDGE_LABEL_MAP;
    private static final SubLSymbol $kw153$NODE_DEFINITIONS;
    private static final SubLSymbol $kw154$EDGE_DEFINITIONS;
    private static final SubLSymbol $kw155$OPTIONS;
    private static final SubLString $str156$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw157$BEGIN;
    private static final SubLSymbol $sym158$MAKE_BLUE_GRAPH;
    private static final SubLSymbol $kw159$SLOT;
    private static final SubLSymbol $kw160$END;
    private static final SubLSymbol $sym161$VISIT_DEFSTRUCT_OBJECT_BLUE_GRAPH_METHOD;
    private static final SubLSymbol $kw162$COLOR;
    private static final SubLSymbol $kw163$ORIENTATION;
    private static final SubLString $str164$;
    private static final SubLSymbol $kw165$ID;
    private static final SubLSymbol $kw166$LABEL;
    private static final SubLSymbol $kw167$FROM;
    private static final SubLSymbol $kw168$TO;
    private static final SubLSymbol $kw169$NODE_TYPE;
    private static final SubLSymbol $kw170$EDGE_TYPE;
    private static final SubLSymbol $kw171$DEFINITIONS;
    private static final SubLSymbol $kw172$NODE;
    private static final SubLSymbol $kw173$EDGE;
    private static final SubLSymbol $sym174$BBF_RTV_FROM_INFERENCE;
    private static final SubLList $list175;
    private static final SubLSymbol $kw176$FORMULA;
    private static final SubLSymbol $kw177$PROBLEM_STORE_ID;
    private static final SubLSymbol $sym178$RTV_CLAUSE_P;
    private static final SubLSymbol $kw179$SKIP;
    private static final SubLSymbol $sym180$BBF_RTV_UNBOUND;
    private static final SubLSymbol $kw181$ARG1_ANSWERS;
    private static final SubLSymbol $kw182$ARG2_ANSWERS;
    private static final SubLSymbol $sym183$ASSERTION_FORMULA;
    private static final SubLSymbol $sym184$BBF_RTV_FROM_INFERENCE_NEW;
    private static final SubLSymbol $kw185$ANSWERS;
    private static final SubLSymbol $sym186$CDR;
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 962L)
    public static SubLObject define_blue_filter_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject arglist = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject deflist = (SubLObject)blue_grapher_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)blue_grapher_utilities.$list1);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)blue_grapher_utilities.$list1);
        arglist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)blue_grapher_utilities.$list1);
        deflist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$sym2$PROGN, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$sym3$SETHASH, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$sym4$QUOTE, name), (SubLObject)blue_grapher_utilities.$sym0$_BLUE_FILTER_FNS_, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$sym4$QUOTE, deflist)), (SubLObject)ConsesLow.listS((SubLObject)blue_grapher_utilities.$sym5$DEFINE_PROTECTED, name, arglist, ConsesLow.append(body, (SubLObject)blue_grapher_utilities.NIL)), (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$sym6$REGISTER_API_PREDEFINED_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$sym4$QUOTE, name)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 1198L)
    public static SubLObject blue_filter_fns() {
        return hash_table_utilities.hash_table_keys(blue_grapher_utilities.$blue_filter_fns$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 1281L)
    public static SubLObject get_blue_filter_fn_data(final SubLObject blue_filter_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject blue_filter_fn_data = Hashtables.gethash(blue_filter_fn, blue_grapher_utilities.$blue_filter_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject foundP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(blue_filter_fn_data, foundP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 1519L)
    public static SubLObject blue_filter_fn_p(final SubLObject blue_filter_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject blue_filter_fn_data = get_blue_filter_fn_data(blue_filter_fn);
        final SubLObject foundP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (blue_grapher_utilities.NIL != foundP) {
            return (SubLObject)blue_grapher_utilities.T;
        }
        return (SubLObject)blue_grapher_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 1800L)
    public static SubLObject get_blue_filter_fn_cost(final SubLObject blue_filter_fn) {
        final SubLObject filter_fn_data = get_blue_filter_fn_data(blue_filter_fn);
        final SubLObject cost = conses_high.getf(filter_fn_data, (SubLObject)blue_grapher_utilities.$kw8$COST, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        return cost.isInteger() ? cost : blue_grapher_utilities.$default_blue_filter_fn_cost$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 2105L)
    public static SubLObject get_blue_filter_fn_strength(final SubLObject blue_filter_fn) {
        final SubLObject filter_fn_data = get_blue_filter_fn_data(blue_filter_fn);
        final SubLObject strength = conses_high.getf(filter_fn_data, (SubLObject)blue_grapher_utilities.$kw10$STRENGTH, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        return strength.isInteger() ? strength : blue_grapher_utilities.$default_blue_filter_fn_strength$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 2432L)
    public static SubLObject get_blue_filter_fn_type(final SubLObject blue_filter_fn) {
        final SubLObject filter_fn_data = get_blue_filter_fn_data(blue_filter_fn);
        final SubLObject type = conses_high.getf(filter_fn_data, (SubLObject)blue_grapher_utilities.$kw12$TYPE, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        return type.isKeyword() ? type : blue_grapher_utilities.$default_blue_filter_fn_type$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 2680L)
    public static SubLObject apply_blue_filter_fn(final SubLObject blue_filter_fn, final SubLObject list, final SubLObject mt, SubLObject type) {
        if (type == blue_grapher_utilities.UNPROVIDED) {
            type = (SubLObject)blue_grapher_utilities.NIL;
        }
        if (blue_grapher_utilities.NIL == blue_filter_fn_p(blue_filter_fn)) {
            Errors.warn((SubLObject)blue_grapher_utilities.$str13$APPLY_BLUE_FILTER_FN___A_is_not_a, blue_filter_fn);
            return (SubLObject)blue_grapher_utilities.NIL;
        }
        if (get_blue_filter_fn_type(blue_filter_fn).eql(type)) {
            return Functions.funcall(blue_filter_fn, list, mt);
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 3068L)
    public static SubLObject blue_filter_fns_sorted(SubLObject blue_filter_fns) {
        if (blue_filter_fns == blue_grapher_utilities.UNPROVIDED) {
            blue_filter_fns = blue_filter_fns();
        }
        return Sort.sort(blue_filter_fns, Symbols.symbol_function((SubLObject)blue_grapher_utilities.$sym14$_), Symbols.symbol_function((SubLObject)blue_grapher_utilities.$sym15$GET_BLUE_FILTER_FN_STRENGTH));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 3224L)
    public static SubLObject blue_apply_filter_fns(final SubLObject term_list, final SubLObject blue_filter_fns, final SubLObject mt, SubLObject type) {
        if (type == blue_grapher_utilities.UNPROVIDED) {
            type = (SubLObject)blue_grapher_utilities.NIL;
        }
        final SubLObject sorted_blue_filter_fns = blue_filter_fns_sorted(blue_filter_fns);
        SubLObject result_term_list = term_list;
        SubLObject cdolist_list_var = sorted_blue_filter_fns;
        SubLObject blue_filter_fn = (SubLObject)blue_grapher_utilities.NIL;
        blue_filter_fn = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            result_term_list = apply_blue_filter_fn(blue_filter_fn, result_term_list, mt, type);
            cdolist_list_var = cdolist_list_var.rest();
            blue_filter_fn = cdolist_list_var.first();
        }
        return result_term_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 3595L)
    public static SubLObject blue_filter_fn_keys(SubLObject blue_filter_fns) {
        if (blue_filter_fns == blue_grapher_utilities.UNPROVIDED) {
            blue_filter_fns = blue_filter_fns();
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)blue_grapher_utilities.$sym16$MAKE_KEYWORD), blue_filter_fns_sorted(blue_filter_fns));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 3756L)
    public static SubLObject blue_filter_fn_by_key(final SubLObject bbf_key) {
        final SubLObject poss_function_spec = Packages.intern(string_utilities.string_from_keyword(bbf_key), (SubLObject)blue_grapher_utilities.UNPROVIDED);
        if (blue_grapher_utilities.NIL != Hashtables.gethash(poss_function_spec, blue_grapher_utilities.$blue_filter_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.UNPROVIDED) && poss_function_spec.isFunctionSpec()) {
            return poss_function_spec;
        }
        return (SubLObject)blue_grapher_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 4028L)
    public static SubLObject bff_arbitrary_unions(final SubLObject terms, final SubLObject mt) {
        SubLObject result = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)blue_grapher_utilities.NIL;
        v_term = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            if (blue_grapher_utilities.NIL == isa.isa_in_any_mtP(v_term, blue_grapher_utilities.$const19$ArbitraryUnion)) {
                result = (SubLObject)ConsesLow.cons(v_term, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 4582L)
    public static SubLObject bff_cyc_kb_subset_collections(final SubLObject terms, final SubLObject mt) {
        SubLObject result = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)blue_grapher_utilities.NIL;
        v_term = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            if (blue_grapher_utilities.NIL == isa.isa_in_any_mtP(v_term, blue_grapher_utilities.$const21$CycKBSubsetCollection)) {
                result = (SubLObject)ConsesLow.cons(v_term, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 5149L)
    public static SubLObject bff_most_general_5(final SubLObject terms, final SubLObject mt) {
        return list_utilities.first_n((SubLObject)blue_grapher_utilities.FIVE_INTEGER, Sort.sort(terms, Symbols.symbol_function((SubLObject)blue_grapher_utilities.$sym24$GENERALITY_ESTIMATE_), (SubLObject)blue_grapher_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 5323L)
    public static SubLObject bff_most_general_10(final SubLObject terms, final SubLObject mt) {
        return list_utilities.first_n((SubLObject)blue_grapher_utilities.TEN_INTEGER, Sort.sort(terms, Symbols.symbol_function((SubLObject)blue_grapher_utilities.$sym24$GENERALITY_ESTIMATE_), (SubLObject)blue_grapher_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 5500L)
    public static SubLObject bff_most_general_20(final SubLObject terms, final SubLObject mt) {
        return list_utilities.first_n((SubLObject)blue_grapher_utilities.TWENTY_INTEGER, Sort.sort(terms, Symbols.symbol_function((SubLObject)blue_grapher_utilities.$sym24$GENERALITY_ESTIMATE_), (SubLObject)blue_grapher_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 5926L)
    public static SubLObject define_blue_builder_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject arglist = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject deflist = (SubLObject)blue_grapher_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)blue_grapher_utilities.$list1);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)blue_grapher_utilities.$list1);
        arglist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)blue_grapher_utilities.$list1);
        deflist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$sym2$PROGN, (SubLObject)ConsesLow.listS((SubLObject)blue_grapher_utilities.$sym3$SETHASH, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$sym4$QUOTE, name), (SubLObject)blue_grapher_utilities.$list31), (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$sym3$SETHASH, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$sym4$QUOTE, name), (SubLObject)blue_grapher_utilities.$sym30$_BLUE_BUILDER_FN_TO_DEFLIST_HASH_, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$sym4$QUOTE, deflist)), (SubLObject)ConsesLow.listS((SubLObject)blue_grapher_utilities.$sym5$DEFINE_PROTECTED, name, arglist, ConsesLow.append(body, (SubLObject)blue_grapher_utilities.NIL)), (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$sym6$REGISTER_API_PREDEFINED_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$sym4$QUOTE, name)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 6220L)
    public static SubLObject get_blue_builder_fn_data(final SubLObject blue_builder_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject blue_builder_fn_data = Hashtables.gethash(blue_builder_fn, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject foundP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(blue_builder_fn_data, foundP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 6464L)
    public static SubLObject blue_builder_fn_p(final SubLObject blue_builder_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject blue_builder_fn_data = get_blue_builder_fn_data(blue_builder_fn);
        final SubLObject foundP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (blue_grapher_utilities.NIL != foundP) {
            return (SubLObject)blue_grapher_utilities.T;
        }
        return (SubLObject)blue_grapher_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 6698L)
    public static SubLObject blue_builder(final SubLObject blue_builder_fn, final SubLObject key_list) {
        if (blue_grapher_utilities.NIL != blue_builder_fn_p(blue_builder_fn)) {
            return Functions.funcall(blue_builder_fn, key_list);
        }
        Errors.warn((SubLObject)blue_grapher_utilities.$str32$BLUE_BUILDER___A_is_not_a_blue_bu, blue_builder_fn);
        return (SubLObject)blue_grapher_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 6997L)
    public static SubLObject blue_builder_fn_keys() {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)blue_grapher_utilities.$sym16$MAKE_KEYWORD), Sort.sort(hash_table_utilities.hash_table_keys(blue_grapher_utilities.$blue_builder_fns$.getGlobalValue()), (SubLObject)blue_grapher_utilities.$sym33$STRING_, (SubLObject)blue_grapher_utilities.$sym34$SYMBOL_NAME));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 7139L)
    public static SubLObject blue_builder_fn_by_key(final SubLObject bbf_key) {
        final SubLObject poss_function_spec = Packages.intern(string_utilities.string_from_keyword(bbf_key), (SubLObject)blue_grapher_utilities.UNPROVIDED);
        if (blue_grapher_utilities.NIL != Hashtables.gethash(poss_function_spec, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.UNPROVIDED) && poss_function_spec.isFunctionSpec()) {
            return poss_function_spec;
        }
        return (SubLObject)blue_grapher_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 7413L)
    public static SubLObject get_blue_builder_fn_def_value(final SubLObject bbf_key, final SubLObject def_key) {
        final SubLObject bbf = blue_builder_fn_by_key(bbf_key);
        if (blue_grapher_utilities.NIL != blue_builder_fn_p(bbf)) {
            return conses_high.getf(Hashtables.gethash(bbf, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)blue_grapher_utilities.UNPROVIDED), def_key, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        }
        return (SubLObject)blue_grapher_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 7645L)
    public static SubLObject bbf_forward_true(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preds = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw37$PREDS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject v_forts = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw38$FORTS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject mt = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw39$MT, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject filter_fns = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw40$FILTER_FNS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject depth = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw41$DEPTH, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject result_nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject result_edges = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject cdolist_list_var = v_forts;
        SubLObject fort = (SubLObject)blue_grapher_utilities.NIL;
        fort = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = preds;
            SubLObject pred = (SubLObject)blue_grapher_utilities.NIL;
            pred = cdolist_list_var_$1.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$1) {
                thread.resetMultipleValues();
                final SubLObject protoedges = bbf_forward_true_internal(pred, fort, mt, filter_fns, depth, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                final SubLObject protonodes = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var_$2 = protonodes;
                SubLObject protonode = (SubLObject)blue_grapher_utilities.NIL;
                protonode = cdolist_list_var_$2.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var_$2) {
                    result_nodes = (SubLObject)ConsesLow.cons(bbf_make_node(protonode, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), result_nodes);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    protonode = cdolist_list_var_$2.first();
                }
                SubLObject cdolist_list_var_$3 = protoedges;
                SubLObject protoedge = (SubLObject)blue_grapher_utilities.NIL;
                protoedge = cdolist_list_var_$3.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var_$3) {
                    result_edges = (SubLObject)ConsesLow.cons(bbf_make_edge(pred, protoedge.first(), conses_high.second(protoedge), mt, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), result_edges);
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    protoedge = cdolist_list_var_$3.first();
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                pred = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        }
        return bbf_make_graph(result_nodes, result_edges, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw39$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 9154L)
    public static SubLObject bbf_forward_true_internal(final SubLObject pred, final SubLObject tail_node, final SubLObject mt, final SubLObject filter_fns, SubLObject depth, SubLObject done_tail_nodes) {
        if (done_tail_nodes == blue_grapher_utilities.UNPROVIDED) {
            done_tail_nodes = (SubLObject)blue_grapher_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject recurseP = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject protoedges = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject head_nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject coextensional_head_nodes = (SubLObject)blue_grapher_utilities.NIL;
        head_nodes = ((blue_grapher_utilities.NIL != kb_accessors.transitive_predicateP(pred)) ? gt_methods.gt_superiors(pred, tail_node, mt) : kb_mapping_utilities.pred_values_in_mt(tail_node, pred, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
        if (blue_grapher_utilities.NIL != head_nodes) {
            head_nodes = blue_apply_filter_fns(head_nodes, filter_fns, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            if (blue_grapher_utilities.NIL != head_nodes) {
                coextensional_head_nodes = conses_high.intersection(head_nodes, (blue_grapher_utilities.NIL != kb_accessors.transitive_predicateP(pred)) ? gt_methods.gt_inferiors(pred, tail_node, mt) : kb_mapping_utilities.pred_values_in_mt(tail_node, pred, mt, (SubLObject)blue_grapher_utilities.TWO_INTEGER, (SubLObject)blue_grapher_utilities.ONE_INTEGER, (SubLObject)blue_grapher_utilities.UNPROVIDED), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                head_nodes = conses_high.set_difference(head_nodes, coextensional_head_nodes, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                coextensional_head_nodes = conses_high.set_difference(coextensional_head_nodes, (SubLObject)ConsesLow.list(tail_node), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            }
        }
        SubLObject cdolist_list_var;
        head_nodes = (cdolist_list_var = blue_apply_filter_fns(head_nodes, filter_fns, mt, (SubLObject)blue_grapher_utilities.$kw42$POST_MINIMIZATION));
        SubLObject head_node = (SubLObject)blue_grapher_utilities.NIL;
        head_node = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(tail_node, head_node), protoedges);
            cdolist_list_var = cdolist_list_var.rest();
            head_node = cdolist_list_var.first();
        }
        cdolist_list_var = coextensional_head_nodes;
        SubLObject coextensional_head_node = (SubLObject)blue_grapher_utilities.NIL;
        coextensional_head_node = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(tail_node, coextensional_head_node), protoedges);
            protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(coextensional_head_node, tail_node), protoedges);
            SubLObject cdolist_list_var_$4 = coextensional_head_nodes;
            SubLObject another_coextensional_head_node = (SubLObject)blue_grapher_utilities.NIL;
            another_coextensional_head_node = cdolist_list_var_$4.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$4) {
                if (!coextensional_head_node.eql(another_coextensional_head_node)) {
                    protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(coextensional_head_node, another_coextensional_head_node), protoedges);
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                another_coextensional_head_node = cdolist_list_var_$4.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            coextensional_head_node = cdolist_list_var.first();
        }
        cdolist_list_var = head_nodes;
        head_node = (SubLObject)blue_grapher_utilities.NIL;
        head_node = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5 = coextensional_head_nodes;
            SubLObject coextensional_head_node2 = (SubLObject)blue_grapher_utilities.NIL;
            coextensional_head_node2 = cdolist_list_var_$5.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$5) {
                protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(coextensional_head_node2, head_node), protoedges);
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                coextensional_head_node2 = cdolist_list_var_$5.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            head_node = cdolist_list_var.first();
        }
        if (depth.numE((SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
            recurseP = (SubLObject)blue_grapher_utilities.NIL;
        }
        else {
            recurseP = (SubLObject)blue_grapher_utilities.T;
            depth = Numbers.subtract(depth, (SubLObject)blue_grapher_utilities.ONE_INTEGER);
        }
        if (blue_grapher_utilities.NIL != recurseP) {
            cdolist_list_var = head_nodes;
            SubLObject recurse_tail_node = (SubLObject)blue_grapher_utilities.NIL;
            recurse_tail_node = cdolist_list_var.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var) {
                if (blue_grapher_utilities.NIL == subl_promotions.memberP(recurse_tail_node, done_tail_nodes, Symbols.symbol_function((SubLObject)blue_grapher_utilities.EQUAL), (SubLObject)blue_grapher_utilities.UNPROVIDED)) {
                    done_tail_nodes = (SubLObject)ConsesLow.cons(recurse_tail_node, done_tail_nodes);
                    thread.resetMultipleValues();
                    SubLObject recurse_protoedges = bbf_forward_true_internal(pred, recurse_tail_node, mt, filter_fns, depth, done_tail_nodes);
                    final SubLObject recurse_done_tail_nodes = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    done_tail_nodes = recurse_done_tail_nodes;
                    SubLObject cdolist_list_var_$6;
                    recurse_protoedges = (cdolist_list_var_$6 = Sequences.remove_duplicates(recurse_protoedges, Symbols.symbol_function((SubLObject)blue_grapher_utilities.EQUAL), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
                    SubLObject recurse_protoedge = (SubLObject)blue_grapher_utilities.NIL;
                    recurse_protoedge = cdolist_list_var_$6.first();
                    while (blue_grapher_utilities.NIL != cdolist_list_var_$6) {
                        protoedges = (SubLObject)ConsesLow.cons(recurse_protoedge, protoedges);
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        recurse_protoedge = cdolist_list_var_$6.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                recurse_tail_node = cdolist_list_var.first();
            }
        }
        return Values.values(protoedges, done_tail_nodes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 11853L)
    public static SubLObject bbf_backward_true(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preds = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw37$PREDS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject v_forts = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw38$FORTS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject mt = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw39$MT, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject filter_fns = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw40$FILTER_FNS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject depth = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw41$DEPTH, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject result_nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject result_edges = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject cdolist_list_var = v_forts;
        SubLObject fort = (SubLObject)blue_grapher_utilities.NIL;
        fort = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$7 = preds;
            SubLObject pred = (SubLObject)blue_grapher_utilities.NIL;
            pred = cdolist_list_var_$7.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$7) {
                thread.resetMultipleValues();
                final SubLObject protoedges = bbf_backward_true_internal(pred, fort, mt, filter_fns, depth, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                final SubLObject protonodes = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var_$8 = protonodes;
                SubLObject protonode = (SubLObject)blue_grapher_utilities.NIL;
                protonode = cdolist_list_var_$8.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var_$8) {
                    result_nodes = (SubLObject)ConsesLow.cons(bbf_make_node(protonode, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), result_nodes);
                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                    protonode = cdolist_list_var_$8.first();
                }
                SubLObject cdolist_list_var_$9 = protoedges;
                SubLObject protoedge = (SubLObject)blue_grapher_utilities.NIL;
                protoedge = cdolist_list_var_$9.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var_$9) {
                    result_edges = (SubLObject)ConsesLow.cons(bbf_make_edge(pred, protoedge.first(), conses_high.second(protoedge), mt, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), result_edges);
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    protoedge = cdolist_list_var_$9.first();
                }
                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                pred = cdolist_list_var_$7.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        }
        return bbf_make_graph(result_nodes, result_edges, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw39$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 12821L)
    public static SubLObject bbf_backward_true_internal(final SubLObject pred, final SubLObject head_node, final SubLObject mt, final SubLObject filter_fns, SubLObject depth, SubLObject done_head_nodes) {
        if (done_head_nodes == blue_grapher_utilities.UNPROVIDED) {
            done_head_nodes = (SubLObject)blue_grapher_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject recurseP = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject protoedges = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject tail_nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject coextensional_tail_nodes = (SubLObject)blue_grapher_utilities.NIL;
        tail_nodes = ((blue_grapher_utilities.NIL != kb_accessors.transitive_predicateP(pred)) ? gt_methods.gt_inferiors(pred, head_node, mt) : kb_mapping_utilities.pred_values_in_mt(head_node, pred, mt, (SubLObject)blue_grapher_utilities.TWO_INTEGER, (SubLObject)blue_grapher_utilities.ONE_INTEGER, (SubLObject)blue_grapher_utilities.UNPROVIDED));
        if (blue_grapher_utilities.NIL != tail_nodes) {
            tail_nodes = blue_apply_filter_fns(tail_nodes, filter_fns, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            if (blue_grapher_utilities.NIL != tail_nodes) {
                coextensional_tail_nodes = conses_high.intersection(tail_nodes, (blue_grapher_utilities.NIL != kb_accessors.transitive_predicateP(pred)) ? gt_methods.gt_superiors(pred, head_node, mt) : kb_mapping_utilities.pred_values_in_mt(head_node, pred, mt, (SubLObject)blue_grapher_utilities.ONE_INTEGER, (SubLObject)blue_grapher_utilities.TWO_INTEGER, (SubLObject)blue_grapher_utilities.UNPROVIDED), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                tail_nodes = conses_high.set_difference(tail_nodes, coextensional_tail_nodes, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                coextensional_tail_nodes = conses_high.set_difference(coextensional_tail_nodes, (SubLObject)ConsesLow.list(head_node), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            }
        }
        SubLObject cdolist_list_var;
        tail_nodes = (cdolist_list_var = blue_apply_filter_fns(tail_nodes, filter_fns, mt, (SubLObject)blue_grapher_utilities.$kw42$POST_MINIMIZATION));
        SubLObject tail_node = (SubLObject)blue_grapher_utilities.NIL;
        tail_node = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(tail_node, head_node), protoedges);
            cdolist_list_var = cdolist_list_var.rest();
            tail_node = cdolist_list_var.first();
        }
        cdolist_list_var = coextensional_tail_nodes;
        SubLObject coextensional_tail_node = (SubLObject)blue_grapher_utilities.NIL;
        coextensional_tail_node = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(head_node, coextensional_tail_node), protoedges);
            protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(coextensional_tail_node, head_node), protoedges);
            cdolist_list_var = cdolist_list_var.rest();
            coextensional_tail_node = cdolist_list_var.first();
        }
        if (depth.numE((SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
            recurseP = (SubLObject)blue_grapher_utilities.NIL;
        }
        else {
            recurseP = (SubLObject)blue_grapher_utilities.T;
            depth = Numbers.subtract(depth, (SubLObject)blue_grapher_utilities.ONE_INTEGER);
        }
        if (blue_grapher_utilities.NIL != recurseP) {
            cdolist_list_var = tail_nodes;
            SubLObject recurse_head_node = (SubLObject)blue_grapher_utilities.NIL;
            recurse_head_node = cdolist_list_var.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var) {
                if (blue_grapher_utilities.NIL == subl_promotions.memberP(recurse_head_node, done_head_nodes, Symbols.symbol_function((SubLObject)blue_grapher_utilities.EQUAL), (SubLObject)blue_grapher_utilities.UNPROVIDED)) {
                    done_head_nodes = (SubLObject)ConsesLow.cons(recurse_head_node, done_head_nodes);
                    thread.resetMultipleValues();
                    SubLObject recurse_protoedges = bbf_backward_true_internal(pred, recurse_head_node, mt, filter_fns, depth, done_head_nodes);
                    final SubLObject recurse_done_head_nodes = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    done_head_nodes = recurse_done_head_nodes;
                    SubLObject cdolist_list_var_$10;
                    recurse_protoedges = (cdolist_list_var_$10 = Sequences.remove_duplicates(recurse_protoedges, Symbols.symbol_function((SubLObject)blue_grapher_utilities.EQUAL), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
                    SubLObject recurse_protoedge = (SubLObject)blue_grapher_utilities.NIL;
                    recurse_protoedge = cdolist_list_var_$10.first();
                    while (blue_grapher_utilities.NIL != cdolist_list_var_$10) {
                        protoedges = (SubLObject)ConsesLow.cons(recurse_protoedge, protoedges);
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        recurse_protoedge = cdolist_list_var_$10.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                recurse_head_node = cdolist_list_var.first();
            }
        }
        return Values.values(protoedges, done_head_nodes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 14980L)
    public static SubLObject bbf_min_forward_true(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preds = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw37$PREDS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject v_forts = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw38$FORTS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject mt = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw39$MT, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject filter_fns = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw40$FILTER_FNS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject depth = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw41$DEPTH, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject result_nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject result_edges = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject cdolist_list_var = v_forts;
        SubLObject fort = (SubLObject)blue_grapher_utilities.NIL;
        fort = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$11 = preds;
            SubLObject pred = (SubLObject)blue_grapher_utilities.NIL;
            pred = cdolist_list_var_$11.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$11) {
                thread.resetMultipleValues();
                final SubLObject protoedges = bbf_min_forward_true_internal(pred, fort, mt, filter_fns, depth, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                final SubLObject protonodes = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var_$12 = protonodes;
                SubLObject protonode = (SubLObject)blue_grapher_utilities.NIL;
                protonode = cdolist_list_var_$12.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var_$12) {
                    result_nodes = (SubLObject)ConsesLow.cons(bbf_make_node(protonode, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), result_nodes);
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    protonode = cdolist_list_var_$12.first();
                }
                SubLObject cdolist_list_var_$13 = protoedges;
                SubLObject protoedge = (SubLObject)blue_grapher_utilities.NIL;
                protoedge = cdolist_list_var_$13.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var_$13) {
                    result_edges = (SubLObject)ConsesLow.cons(bbf_make_edge(pred, protoedge.first(), conses_high.second(protoedge), mt, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), result_edges);
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    protoedge = cdolist_list_var_$13.first();
                }
                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                pred = cdolist_list_var_$11.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        }
        return bbf_make_graph(result_nodes, result_edges, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw39$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 15961L)
    public static SubLObject bbf_min_forward_true_internal(final SubLObject pred, final SubLObject tail_node, final SubLObject mt, final SubLObject filter_fns, SubLObject depth, SubLObject done_tail_nodes) {
        if (done_tail_nodes == blue_grapher_utilities.UNPROVIDED) {
            done_tail_nodes = (SubLObject)blue_grapher_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject recurseP = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject protoedges = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject head_nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject coextensional_head_nodes = (SubLObject)blue_grapher_utilities.NIL;
        if (blue_grapher_utilities.NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) {
            head_nodes = sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(pred), tail_node, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            if (blue_grapher_utilities.NIL != head_nodes) {
                head_nodes = blue_apply_filter_fns(head_nodes, filter_fns, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                if (blue_grapher_utilities.NIL != head_nodes) {
                    coextensional_head_nodes = sbhl_search_methods.sbhl_all_backward_true_nodes_among(sbhl_module_vars.get_sbhl_module(pred), tail_node, head_nodes, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    head_nodes = conses_high.set_difference(head_nodes, coextensional_head_nodes, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    coextensional_head_nodes = conses_high.set_difference(coextensional_head_nodes, (SubLObject)ConsesLow.list(tail_node), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    if (Sequences.length(head_nodes).numG((SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
                        head_nodes = sbhl_search_methods.sbhl_min_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(pred)), head_nodes, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    }
                    if (Sequences.length(coextensional_head_nodes).numG((SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
                        coextensional_head_nodes = sbhl_search_methods.sbhl_min_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(pred)), coextensional_head_nodes, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    }
                }
            }
        }
        SubLObject cdolist_list_var;
        head_nodes = (cdolist_list_var = blue_apply_filter_fns(head_nodes, filter_fns, mt, (SubLObject)blue_grapher_utilities.$kw42$POST_MINIMIZATION));
        SubLObject head_node = (SubLObject)blue_grapher_utilities.NIL;
        head_node = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(tail_node, head_node), protoedges);
            cdolist_list_var = cdolist_list_var.rest();
            head_node = cdolist_list_var.first();
        }
        cdolist_list_var = coextensional_head_nodes;
        SubLObject coextensional_head_node = (SubLObject)blue_grapher_utilities.NIL;
        coextensional_head_node = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(tail_node, coextensional_head_node), protoedges);
            protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(coextensional_head_node, tail_node), protoedges);
            SubLObject cdolist_list_var_$14 = coextensional_head_nodes;
            SubLObject another_coextensional_head_node = (SubLObject)blue_grapher_utilities.NIL;
            another_coextensional_head_node = cdolist_list_var_$14.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$14) {
                if (!coextensional_head_node.eql(another_coextensional_head_node)) {
                    protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(coextensional_head_node, another_coextensional_head_node), protoedges);
                }
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                another_coextensional_head_node = cdolist_list_var_$14.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            coextensional_head_node = cdolist_list_var.first();
        }
        cdolist_list_var = head_nodes;
        head_node = (SubLObject)blue_grapher_utilities.NIL;
        head_node = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$15 = coextensional_head_nodes;
            SubLObject coextensional_head_node2 = (SubLObject)blue_grapher_utilities.NIL;
            coextensional_head_node2 = cdolist_list_var_$15.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$15) {
                protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(coextensional_head_node2, head_node), protoedges);
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                coextensional_head_node2 = cdolist_list_var_$15.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            head_node = cdolist_list_var.first();
        }
        if (depth.numE((SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
            recurseP = (SubLObject)blue_grapher_utilities.NIL;
        }
        else {
            recurseP = (SubLObject)blue_grapher_utilities.T;
            depth = Numbers.subtract(depth, (SubLObject)blue_grapher_utilities.ONE_INTEGER);
        }
        if (blue_grapher_utilities.NIL != recurseP) {
            cdolist_list_var = head_nodes;
            SubLObject recurse_tail_node = (SubLObject)blue_grapher_utilities.NIL;
            recurse_tail_node = cdolist_list_var.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var) {
                if (blue_grapher_utilities.NIL == subl_promotions.memberP(recurse_tail_node, done_tail_nodes, Symbols.symbol_function((SubLObject)blue_grapher_utilities.EQUAL), (SubLObject)blue_grapher_utilities.UNPROVIDED)) {
                    done_tail_nodes = (SubLObject)ConsesLow.cons(recurse_tail_node, done_tail_nodes);
                    thread.resetMultipleValues();
                    SubLObject recurse_protoedges = bbf_min_forward_true_internal(pred, recurse_tail_node, mt, filter_fns, depth, done_tail_nodes);
                    final SubLObject recurse_done_tail_nodes = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    done_tail_nodes = recurse_done_tail_nodes;
                    SubLObject cdolist_list_var_$16;
                    recurse_protoedges = (cdolist_list_var_$16 = Sequences.remove_duplicates(recurse_protoedges, Symbols.symbol_function((SubLObject)blue_grapher_utilities.EQUAL), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
                    SubLObject recurse_protoedge = (SubLObject)blue_grapher_utilities.NIL;
                    recurse_protoedge = cdolist_list_var_$16.first();
                    while (blue_grapher_utilities.NIL != cdolist_list_var_$16) {
                        protoedges = (SubLObject)ConsesLow.cons(recurse_protoedge, protoedges);
                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                        recurse_protoedge = cdolist_list_var_$16.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                recurse_tail_node = cdolist_list_var.first();
            }
        }
        return Values.values(protoedges, done_tail_nodes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 18976L)
    public static SubLObject bbf_min_backward_true(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preds = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw37$PREDS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject v_forts = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw38$FORTS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject mt = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw39$MT, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject filter_fns = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw40$FILTER_FNS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject depth = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw41$DEPTH, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject result_nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject result_edges = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject cdolist_list_var = v_forts;
        SubLObject fort = (SubLObject)blue_grapher_utilities.NIL;
        fort = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$17 = preds;
            SubLObject pred = (SubLObject)blue_grapher_utilities.NIL;
            pred = cdolist_list_var_$17.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$17) {
                thread.resetMultipleValues();
                final SubLObject protoedges = bbf_min_backward_true_internal(pred, fort, mt, filter_fns, depth, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                final SubLObject protonodes = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var_$18 = protonodes;
                SubLObject protonode = (SubLObject)blue_grapher_utilities.NIL;
                protonode = cdolist_list_var_$18.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var_$18) {
                    result_nodes = (SubLObject)ConsesLow.cons(bbf_make_node(protonode, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), result_nodes);
                    cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                    protonode = cdolist_list_var_$18.first();
                }
                SubLObject cdolist_list_var_$19 = protoedges;
                SubLObject protoedge = (SubLObject)blue_grapher_utilities.NIL;
                protoedge = cdolist_list_var_$19.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var_$19) {
                    result_edges = (SubLObject)ConsesLow.cons(bbf_make_edge(pred, protoedge.first(), conses_high.second(protoedge), mt, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), result_edges);
                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                    protoedge = cdolist_list_var_$19.first();
                }
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                pred = cdolist_list_var_$17.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        }
        return bbf_make_graph(result_nodes, result_edges, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw39$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 19960L)
    public static SubLObject bbf_min_backward_true_internal(final SubLObject pred, final SubLObject head_node, final SubLObject mt, final SubLObject filter_fns, SubLObject depth, SubLObject done_head_nodes) {
        if (done_head_nodes == blue_grapher_utilities.UNPROVIDED) {
            done_head_nodes = (SubLObject)blue_grapher_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject recurseP = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject protoedges = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject tail_nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject coextensional_tail_nodes = (SubLObject)blue_grapher_utilities.NIL;
        if (blue_grapher_utilities.NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) {
            tail_nodes = sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(pred), head_node, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            if (blue_grapher_utilities.NIL != tail_nodes) {
                tail_nodes = blue_apply_filter_fns(tail_nodes, filter_fns, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                if (blue_grapher_utilities.NIL != tail_nodes) {
                    coextensional_tail_nodes = sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module(pred), head_node, tail_nodes, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    tail_nodes = conses_high.set_difference(tail_nodes, coextensional_tail_nodes, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    coextensional_tail_nodes = conses_high.set_difference(coextensional_tail_nodes, (SubLObject)ConsesLow.list(head_node), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    if (Sequences.length(tail_nodes).numG((SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
                        tail_nodes = sbhl_search_methods.sbhl_max_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(pred)), tail_nodes, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    }
                    if (Sequences.length(coextensional_tail_nodes).numG((SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
                        coextensional_tail_nodes = sbhl_search_methods.sbhl_max_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(pred)), coextensional_tail_nodes, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    }
                }
            }
        }
        SubLObject cdolist_list_var;
        tail_nodes = (cdolist_list_var = blue_apply_filter_fns(tail_nodes, filter_fns, mt, (SubLObject)blue_grapher_utilities.$kw42$POST_MINIMIZATION));
        SubLObject tail_node = (SubLObject)blue_grapher_utilities.NIL;
        tail_node = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(tail_node, head_node), protoedges);
            cdolist_list_var = cdolist_list_var.rest();
            tail_node = cdolist_list_var.first();
        }
        cdolist_list_var = coextensional_tail_nodes;
        SubLObject coextensional_tail_node = (SubLObject)blue_grapher_utilities.NIL;
        coextensional_tail_node = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(head_node, coextensional_tail_node), protoedges);
            protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(coextensional_tail_node, head_node), protoedges);
            cdolist_list_var = cdolist_list_var.rest();
            coextensional_tail_node = cdolist_list_var.first();
        }
        if (depth.numE((SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
            recurseP = (SubLObject)blue_grapher_utilities.NIL;
        }
        else {
            recurseP = (SubLObject)blue_grapher_utilities.T;
            depth = Numbers.subtract(depth, (SubLObject)blue_grapher_utilities.ONE_INTEGER);
        }
        if (blue_grapher_utilities.NIL != recurseP) {
            cdolist_list_var = tail_nodes;
            SubLObject recurse_head_node = (SubLObject)blue_grapher_utilities.NIL;
            recurse_head_node = cdolist_list_var.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var) {
                if (blue_grapher_utilities.NIL == subl_promotions.memberP(recurse_head_node, done_head_nodes, Symbols.symbol_function((SubLObject)blue_grapher_utilities.EQUAL), (SubLObject)blue_grapher_utilities.UNPROVIDED)) {
                    done_head_nodes = (SubLObject)ConsesLow.cons(recurse_head_node, done_head_nodes);
                    thread.resetMultipleValues();
                    SubLObject recurse_protoedges = bbf_min_backward_true_internal(pred, recurse_head_node, mt, filter_fns, depth, done_head_nodes);
                    final SubLObject recurse_done_head_nodes = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    done_head_nodes = recurse_done_head_nodes;
                    SubLObject cdolist_list_var_$20;
                    recurse_protoedges = (cdolist_list_var_$20 = Sequences.remove_duplicates(recurse_protoedges, Symbols.symbol_function((SubLObject)blue_grapher_utilities.EQUAL), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
                    SubLObject recurse_protoedge = (SubLObject)blue_grapher_utilities.NIL;
                    recurse_protoedge = cdolist_list_var_$20.first();
                    while (blue_grapher_utilities.NIL != cdolist_list_var_$20) {
                        protoedges = (SubLObject)ConsesLow.cons(recurse_protoedge, protoedges);
                        cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                        recurse_protoedge = cdolist_list_var_$20.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                recurse_head_node = cdolist_list_var.first();
            }
        }
        return Values.values(protoedges, done_head_nodes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 22358L)
    public static SubLObject bbf_min_ceilings_forward_true(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preds = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw37$PREDS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject v_forts = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw38$FORTS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject mt = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw39$MT, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject filter_fns = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw40$FILTER_FNS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject depth = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw41$DEPTH, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject result_nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject result_edges = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject cdolist_list_var = preds;
        SubLObject pred = (SubLObject)blue_grapher_utilities.NIL;
        pred = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject protoedges = bbf_min_ceilings_forward_true_internal(pred, v_forts, mt, filter_fns, depth, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            final SubLObject protonodes = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var_$21 = protonodes;
            SubLObject protonode = (SubLObject)blue_grapher_utilities.NIL;
            protonode = cdolist_list_var_$21.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$21) {
                result_nodes = (SubLObject)ConsesLow.cons(bbf_make_node(protonode, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), result_nodes);
                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                protonode = cdolist_list_var_$21.first();
            }
            SubLObject cdolist_list_var_$22 = protoedges;
            SubLObject protoedge = (SubLObject)blue_grapher_utilities.NIL;
            protoedge = cdolist_list_var_$22.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$22) {
                result_edges = (SubLObject)ConsesLow.cons(bbf_make_edge(pred, protoedge.first(), conses_high.second(protoedge), mt, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), result_edges);
                cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                protoedge = cdolist_list_var_$22.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return bbf_make_graph(result_nodes, result_edges, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw39$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 23371L)
    public static SubLObject bbf_min_ceilings_forward_true_internal(final SubLObject pred, final SubLObject arg_ins, final SubLObject mt, final SubLObject filter_fns, SubLObject depth, SubLObject done_arg_ins) {
        if (done_arg_ins == blue_grapher_utilities.UNPROVIDED) {
            done_arg_ins = (SubLObject)blue_grapher_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (blue_grapher_utilities.NIL == arg_ins || Sequences.length(arg_ins).numLE((SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
            return Values.values((SubLObject)blue_grapher_utilities.NIL, done_arg_ins);
        }
        SubLObject recurseP = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject protoedges = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject arg_outs = (SubLObject)blue_grapher_utilities.NIL;
        if (blue_grapher_utilities.NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) {
            SubLObject arg_in_1 = (SubLObject)blue_grapher_utilities.NIL;
            SubLObject arg_ins_copy = (SubLObject)blue_grapher_utilities.NIL;
            arg_in_1 = arg_ins.first();
            for (arg_ins_copy = arg_ins.rest(); blue_grapher_utilities.NIL != arg_ins_copy; arg_ins_copy = arg_ins_copy.rest()) {
                SubLObject cdolist_list_var = arg_ins_copy;
                SubLObject arg_in_2 = (SubLObject)blue_grapher_utilities.NIL;
                arg_in_2 = cdolist_list_var.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var) {
                    SubLObject local_arg_outs = (SubLObject)blue_grapher_utilities.NIL;
                    local_arg_outs = sbhl_search_methods.sbhl_ceilings(sbhl_module_vars.get_sbhl_module(pred), (SubLObject)ConsesLow.list(arg_in_1, arg_in_2), (SubLObject)blue_grapher_utilities.NIL, mt, blue_grapher_utilities.$const51$True_JustificationTruth);
                    if (blue_grapher_utilities.NIL != local_arg_outs) {
                        local_arg_outs = blue_apply_filter_fns(local_arg_outs, filter_fns, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                        local_arg_outs = conses_high.set_difference(local_arg_outs, arg_ins, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                        if (Sequences.length(local_arg_outs).numG((SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
                            local_arg_outs = sbhl_search_methods.sbhl_min_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(pred)), local_arg_outs, mt, blue_grapher_utilities.$const51$True_JustificationTruth);
                        }
                    }
                    SubLObject cdolist_list_var_$23;
                    local_arg_outs = (cdolist_list_var_$23 = blue_apply_filter_fns(local_arg_outs, filter_fns, mt, (SubLObject)blue_grapher_utilities.$kw42$POST_MINIMIZATION));
                    SubLObject local_arg_out = (SubLObject)blue_grapher_utilities.NIL;
                    local_arg_out = cdolist_list_var_$23.first();
                    while (blue_grapher_utilities.NIL != cdolist_list_var_$23) {
                        arg_outs = (SubLObject)ConsesLow.cons(local_arg_out, arg_outs);
                        protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(arg_in_1, local_arg_out), protoedges);
                        protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(arg_in_2, local_arg_out), protoedges);
                        cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                        local_arg_out = cdolist_list_var_$23.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg_in_2 = cdolist_list_var.first();
                }
                arg_in_1 = arg_ins_copy.first();
            }
            protoedges = Sequences.remove_duplicates(protoedges, Symbols.symbol_function((SubLObject)blue_grapher_utilities.EQUAL), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            arg_outs = Sequences.remove_duplicates(arg_outs, Symbols.symbol_function((SubLObject)blue_grapher_utilities.EQUAL), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        }
        if (depth.numE((SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
            recurseP = (SubLObject)blue_grapher_utilities.NIL;
        }
        else {
            recurseP = (SubLObject)blue_grapher_utilities.T;
            depth = Numbers.subtract(depth, (SubLObject)blue_grapher_utilities.ONE_INTEGER);
        }
        if (blue_grapher_utilities.NIL != recurseP) {
            done_arg_ins = arg_ins;
            thread.resetMultipleValues();
            SubLObject recurse_protoedges = bbf_min_ceilings_forward_true_internal(pred, arg_outs, mt, filter_fns, depth, done_arg_ins);
            final SubLObject recurse_done_arg_ins = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var;
            recurse_protoedges = (cdolist_list_var = Sequences.remove_duplicates(recurse_protoedges, Symbols.symbol_function((SubLObject)blue_grapher_utilities.EQUAL), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
            SubLObject recurse_protoedge = (SubLObject)blue_grapher_utilities.NIL;
            recurse_protoedge = cdolist_list_var.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var) {
                protoedges = (SubLObject)ConsesLow.cons(recurse_protoedge, protoedges);
                cdolist_list_var = cdolist_list_var.rest();
                recurse_protoedge = cdolist_list_var.first();
            }
        }
        return Values.values(protoedges, done_arg_ins);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 25343L)
    public static SubLObject bbf_min_forward_and_backward_true(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preds = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw37$PREDS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject v_forts = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw38$FORTS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject mt = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw39$MT, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject filter_fns = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw40$FILTER_FNS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject depth = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw41$DEPTH, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject result_nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject result_edges = (SubLObject)blue_grapher_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject protoedges = bbf_min_forward_and_backward_true_internal(preds, mt, filter_fns, depth, v_forts);
        final SubLObject protonodes = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = protonodes;
        SubLObject protonode = (SubLObject)blue_grapher_utilities.NIL;
        protonode = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            result_nodes = (SubLObject)ConsesLow.cons(bbf_make_node(protonode, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), result_nodes);
            cdolist_list_var = cdolist_list_var.rest();
            protonode = cdolist_list_var.first();
        }
        cdolist_list_var = protoedges;
        SubLObject protoedge = (SubLObject)blue_grapher_utilities.NIL;
        protoedge = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            result_edges = (SubLObject)ConsesLow.cons(bbf_make_edge(protoedge.first(), conses_high.second(protoedge), conses_high.third(protoedge), mt, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), result_edges);
            cdolist_list_var = cdolist_list_var.rest();
            protoedge = cdolist_list_var.first();
        }
        return bbf_make_graph(result_nodes, result_edges, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw39$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 26384L)
    public static SubLObject bbf_min_forward_and_backward_true_internal(final SubLObject preds, final SubLObject mt, final SubLObject filter_fns, final SubLObject depth, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (blue_grapher_utilities.NIL == args) {
            return Values.values((SubLObject)blue_grapher_utilities.NIL, (SubLObject)blue_grapher_utilities.NIL);
        }
        final SubLObject arg_step_map = (SubLObject)ConsesLow.list(args);
        thread.resetMultipleValues();
        final SubLObject arg_edge_map = bbf_min_forward_and_backward_true_internal_internal(preds, mt, filter_fns, depth, arg_step_map, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject arg_depth_map = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject protoedges = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject protonodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject arg_in = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject pred_arg_outs = (SubLObject)blue_grapher_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(arg_edge_map);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                arg_in = Hashtables.getEntryKey(cdohash_entry);
                SubLObject cdolist_list_var;
                pred_arg_outs = (cdolist_list_var = Hashtables.getEntryValue(cdohash_entry));
                SubLObject pred_arg_out = (SubLObject)blue_grapher_utilities.NIL;
                pred_arg_out = cdolist_list_var.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var) {
                    final SubLObject pred = pred_arg_out.first();
                    final SubLObject arg_out = conses_high.second(pred_arg_out);
                    protoedges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pred, arg_out, arg_in), protoedges);
                    cdolist_list_var = cdolist_list_var.rest();
                    pred_arg_out = cdolist_list_var.first();
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        SubLObject arg = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject arg_depth = (SubLObject)blue_grapher_utilities.NIL;
        final Iterator cdohash_iterator_$24 = Hashtables.getEntrySetIterator(arg_depth_map);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator_$24)) {
                final Map.Entry cdohash_entry_$25 = Hashtables.iteratorNextEntry(cdohash_iterator_$24);
                arg = Hashtables.getEntryKey(cdohash_entry_$25);
                arg_depth = Hashtables.getEntryValue(cdohash_entry_$25);
                protonodes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(arg, arg_depth), protonodes);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator_$24);
        }
        return Values.values(protoedges, protonodes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 27089L)
    public static SubLObject bbf_min_forward_and_backward_true_internal_internal(final SubLObject preds, final SubLObject mt, final SubLObject filter_fns, SubLObject depth, SubLObject arg_step_map, SubLObject arg_edge_map, SubLObject arg_depth_map) {
        if (arg_edge_map == blue_grapher_utilities.UNPROVIDED) {
            arg_edge_map = (SubLObject)blue_grapher_utilities.NIL;
        }
        if (arg_depth_map == blue_grapher_utilities.UNPROVIDED) {
            arg_depth_map = (SubLObject)blue_grapher_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!arg_edge_map.isHashtable()) {
            arg_edge_map = Hashtables.make_hash_table((SubLObject)blue_grapher_utilities.$int54$32, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        }
        if (!arg_depth_map.isHashtable()) {
            arg_depth_map = Hashtables.make_hash_table((SubLObject)blue_grapher_utilities.$int54$32, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            SubLObject cdolist_list_var = arg_step_map.first();
            SubLObject arg_step = (SubLObject)blue_grapher_utilities.NIL;
            arg_step = cdolist_list_var.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var) {
                Hashtables.sethash(arg_step, arg_depth_map, depth);
                cdolist_list_var = cdolist_list_var.rest();
                arg_step = cdolist_list_var.first();
            }
        }
        SubLObject recurseP = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject arg_nexts = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject arg_nexts_list = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject cdolist_list_var2 = preds;
        SubLObject pred = (SubLObject)blue_grapher_utilities.NIL;
        pred = cdolist_list_var2.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var2) {
            if (blue_grapher_utilities.NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) {
                SubLObject cdolist_list_var_$26;
                final SubLObject args = cdolist_list_var_$26 = arg_step_map.first();
                SubLObject arg = (SubLObject)blue_grapher_utilities.NIL;
                arg = cdolist_list_var_$26.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var_$26) {
                    SubLObject arg_outs = (SubLObject)blue_grapher_utilities.NIL;
                    arg_outs = sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(pred), arg, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    if (blue_grapher_utilities.NIL != arg_outs) {
                        arg_outs = blue_apply_filter_fns(arg_outs, filter_fns, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                        if (Sequences.length(arg_outs).numG((SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
                            arg_outs = sbhl_search_methods.sbhl_min_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(pred)), arg_outs, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                        }
                    }
                    SubLObject cdolist_list_var_$27 = arg_outs;
                    SubLObject arg_out = (SubLObject)blue_grapher_utilities.NIL;
                    arg_out = cdolist_list_var_$27.first();
                    while (blue_grapher_utilities.NIL != cdolist_list_var_$27) {
                        hash_table_utilities.pushnew_hash(arg, (SubLObject)ConsesLow.list(pred, arg_out), arg_edge_map, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                        cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                        arg_out = cdolist_list_var_$27.first();
                    }
                    arg_nexts_list = (SubLObject)ConsesLow.cons(arg_outs, arg_nexts_list);
                    SubLObject arg_ins = (SubLObject)blue_grapher_utilities.NIL;
                    arg_ins = sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(pred), arg, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    if (blue_grapher_utilities.NIL != arg_ins) {
                        arg_ins = blue_apply_filter_fns(arg_ins, filter_fns, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                        if (Sequences.length(arg_ins).numG((SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
                            arg_ins = sbhl_search_methods.sbhl_max_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(pred)), arg_ins, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                        }
                    }
                    SubLObject cdolist_list_var_$28 = arg_ins;
                    SubLObject arg_in = (SubLObject)blue_grapher_utilities.NIL;
                    arg_in = cdolist_list_var_$28.first();
                    while (blue_grapher_utilities.NIL != cdolist_list_var_$28) {
                        hash_table_utilities.push_hash(arg_in, (SubLObject)ConsesLow.list(pred, arg), arg_edge_map);
                        cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                        arg_in = cdolist_list_var_$28.first();
                    }
                    arg_nexts_list = (SubLObject)ConsesLow.cons(arg_ins, arg_nexts_list);
                    cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                    arg = cdolist_list_var_$26.first();
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            pred = cdolist_list_var2.first();
        }
        arg_nexts = Sequences.remove_duplicates(Functions.apply(Symbols.symbol_function((SubLObject)blue_grapher_utilities.$sym55$APPEND), arg_nexts_list), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        arg_nexts = Sequences.remove_duplicates(arg_nexts, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        arg_nexts = blue_apply_filter_fns(arg_nexts, filter_fns, mt, (SubLObject)blue_grapher_utilities.$kw42$POST_MINIMIZATION);
        arg_nexts = conses_high.set_difference(arg_nexts, Functions.apply(Symbols.symbol_function((SubLObject)blue_grapher_utilities.$sym55$APPEND), arg_step_map), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        arg_step_map = (SubLObject)ConsesLow.cons(arg_nexts, arg_step_map);
        if (depth.numG((SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
            recurseP = (SubLObject)blue_grapher_utilities.T;
        }
        depth = Numbers.subtract(depth, (SubLObject)blue_grapher_utilities.ONE_INTEGER);
        cdolist_list_var2 = arg_nexts;
        SubLObject arg_next = (SubLObject)blue_grapher_utilities.NIL;
        arg_next = cdolist_list_var2.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var2) {
            final SubLObject arg_depth = Hashtables.gethash(arg_next, arg_depth_map, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            if (!arg_depth.isInteger() || !arg_depth.numG(depth)) {
                Hashtables.sethash(arg_next, arg_depth_map, depth);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            arg_next = cdolist_list_var2.first();
        }
        if (blue_grapher_utilities.NIL != recurseP) {
            thread.resetMultipleValues();
            final SubLObject new_arg_edge_map = bbf_min_forward_and_backward_true_internal_internal(preds, mt, filter_fns, depth, arg_step_map, arg_edge_map, arg_depth_map);
            final SubLObject new_arg_depth_map = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arg_edge_map = new_arg_edge_map;
            arg_depth_map = new_arg_depth_map;
        }
        return Values.values(arg_edge_map, arg_depth_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 29639L)
    public static SubLObject bbf_script(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_forts = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw38$FORTS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject mt = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw39$MT, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject script_fort = v_forts.first();
        SubLObject result_nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject result_edges = (SubLObject)blue_grapher_utilities.NIL;
        if (blue_grapher_utilities.NIL == mt) {
            mt = kb_accessors.defining_mt(script_fort);
        }
        if (blue_grapher_utilities.NIL == mt) {
            mt = blue_grapher_utilities.$const58$CurrentWorldDataCollectorMt_NonHo;
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = list_utilities.remove_if_not((SubLObject)blue_grapher_utilities.$sym61$TERNARY_PREDICATE_, isa.all_fort_instances(blue_grapher_utilities.$const62$QuasiTemporalSubSituationTypesPre, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            SubLObject quasi_temporal_pred = (SubLObject)blue_grapher_utilities.NIL;
            quasi_temporal_pred = cdolist_list_var.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$29 = kb_mapping_utilities.pred_value_tuples(script_fort, quasi_temporal_pred, (SubLObject)blue_grapher_utilities.ONE_INTEGER, (SubLObject)blue_grapher_utilities.$list60, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                SubLObject scene2_scene1 = (SubLObject)blue_grapher_utilities.NIL;
                scene2_scene1 = cdolist_list_var_$29.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var_$29) {
                    final SubLObject scene2 = scene2_scene1.first();
                    final SubLObject scene3 = conses_high.second(scene2_scene1);
                    final SubLObject node2 = bbf_make_node(scene2, blue_grapher_utilities.$const59$Situation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    final SubLObject node3 = bbf_make_node(scene3, blue_grapher_utilities.$const59$Situation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    result_nodes = (SubLObject)ConsesLow.cons(node3, result_nodes);
                    result_nodes = (SubLObject)ConsesLow.cons(node2, result_nodes);
                    result_edges = (SubLObject)ConsesLow.cons(bbf_make_edge_with_nodes(quasi_temporal_pred, node3, node2, mt, (SubLObject)blue_grapher_utilities.NIL, (SubLObject)blue_grapher_utilities.UNPROVIDED), result_edges);
                    cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                    scene2_scene1 = cdolist_list_var_$29.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                quasi_temporal_pred = cdolist_list_var.first();
            }
            cdolist_list_var = isa.all_fort_instances(blue_grapher_utilities.$const69$SituationTypeRelation_BasicActorT, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            SubLObject actor_scene_role_pred = (SubLObject)blue_grapher_utilities.NIL;
            actor_scene_role_pred = cdolist_list_var.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$30 = kb_mapping_utilities.pred_value_tuples(script_fort, actor_scene_role_pred, (SubLObject)blue_grapher_utilities.ONE_INTEGER, (SubLObject)blue_grapher_utilities.$list68, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                SubLObject actor_scene_role = (SubLObject)blue_grapher_utilities.NIL;
                actor_scene_role = cdolist_list_var_$30.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var_$30) {
                    final SubLObject actor = actor_scene_role.first();
                    final SubLObject scene4 = conses_high.second(actor_scene_role);
                    final SubLObject role = conses_high.third(actor_scene_role);
                    final SubLObject tailnode = bbf_make_node(scene4, blue_grapher_utilities.$const59$Situation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    final SubLObject headnode = bbf_make_node((SubLObject)ConsesLow.list(actor, role, scene4), blue_grapher_utilities.$const63$SomethingExisting, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw64$ACTOR, actor, (SubLObject)blue_grapher_utilities.$kw65$ROLE, role, (SubLObject)blue_grapher_utilities.$kw66$SCENE, scene4));
                    result_nodes = (SubLObject)ConsesLow.cons(tailnode, result_nodes);
                    result_nodes = (SubLObject)ConsesLow.cons(headnode, result_nodes);
                    result_edges = (SubLObject)ConsesLow.cons(bbf_make_edge_with_nodes(role, tailnode, headnode, mt, (SubLObject)blue_grapher_utilities.NIL, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw67$ORIGINAL_PREDICATE, actor_scene_role_pred)), result_edges);
                    cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                    actor_scene_role = cdolist_list_var_$30.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                actor_scene_role_pred = cdolist_list_var.first();
            }
            final SubLObject actor_scene_role_pred2 = blue_grapher_utilities.$const70$individualPlaysRoleInSubSituation;
            final SubLObject headnodes = dictionary.new_dictionary((SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            SubLObject cdolist_list_var2 = kb_mapping_utilities.pred_value_tuples(script_fort, actor_scene_role_pred2, (SubLObject)blue_grapher_utilities.ONE_INTEGER, (SubLObject)blue_grapher_utilities.$list68, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            SubLObject actor_scene_role = (SubLObject)blue_grapher_utilities.NIL;
            actor_scene_role = cdolist_list_var2.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var2) {
                final SubLObject actor = actor_scene_role.first();
                final SubLObject scene4 = conses_high.second(actor_scene_role);
                final SubLObject role = conses_high.third(actor_scene_role);
                final SubLObject tailnode = bbf_make_node(scene4, blue_grapher_utilities.$const59$Situation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                SubLObject headnode = dictionary.dictionary_lookup(headnodes, actor, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                if (blue_grapher_utilities.NIL == headnode) {
                    headnode = bbf_make_node((SubLObject)ConsesLow.list(actor, role, scene4), blue_grapher_utilities.$const71$Individual, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw64$ACTOR, actor, (SubLObject)blue_grapher_utilities.$kw65$ROLE, role, (SubLObject)blue_grapher_utilities.$kw66$SCENE, scene4));
                    dictionary.dictionary_enter(headnodes, actor, headnode);
                }
                result_nodes = (SubLObject)ConsesLow.cons(tailnode, result_nodes);
                result_nodes = (SubLObject)ConsesLow.cons(headnode, result_nodes);
                result_edges = (SubLObject)ConsesLow.cons(bbf_make_edge_with_nodes(role, tailnode, headnode, mt, (SubLObject)blue_grapher_utilities.NIL, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw67$ORIGINAL_PREDICATE, actor_scene_role_pred2)), result_edges);
                cdolist_list_var2 = cdolist_list_var2.rest();
                actor_scene_role = cdolist_list_var2.first();
            }
            cdolist_list_var = isa.all_fort_instances(blue_grapher_utilities.$const72$SituationTypeRelation_SitTypeToSu, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            SubLObject script_pred = (SubLObject)blue_grapher_utilities.NIL;
            script_pred = cdolist_list_var.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$31 = kb_mapping_utilities.pred_values(script_fort, script_pred, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                SubLObject scene5 = (SubLObject)blue_grapher_utilities.NIL;
                scene5 = cdolist_list_var_$31.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var_$31) {
                    result_nodes = (SubLObject)ConsesLow.cons(bbf_make_node(scene5, blue_grapher_utilities.$const59$Situation, (SubLObject)blue_grapher_utilities.UNPROVIDED), result_nodes);
                    cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                    scene5 = cdolist_list_var_$31.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                script_pred = cdolist_list_var.first();
            }
            cdolist_list_var = isa.all_fort_instances_in_all_mts(blue_grapher_utilities.$const74$GraphicallyEditableRoleMappingPre);
            SubLObject scene_to_scene_actor_relation = (SubLObject)blue_grapher_utilities.NIL;
            scene_to_scene_actor_relation = cdolist_list_var.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$32 = kb_mapping_utilities.pred_value_tuples(script_fort, scene_to_scene_actor_relation, (SubLObject)blue_grapher_utilities.ONE_INTEGER, (SubLObject)blue_grapher_utilities.$list73, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                SubLObject scene1_role1_scene2_role2_type = (SubLObject)blue_grapher_utilities.NIL;
                scene1_role1_scene2_role2_type = cdolist_list_var_$32.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var_$32) {
                    final SubLObject scene6 = scene1_role1_scene2_role2_type.first();
                    final SubLObject role2 = conses_high.second(scene1_role1_scene2_role2_type);
                    final SubLObject scene7 = conses_high.third(scene1_role1_scene2_role2_type);
                    final SubLObject role3 = conses_high.fourth(scene1_role1_scene2_role2_type);
                    final SubLObject type = conses_high.fifth(scene1_role1_scene2_role2_type);
                    final SubLObject tailnode2 = bbf_make_node((SubLObject)ConsesLow.list(type, role2, scene6), blue_grapher_utilities.$const63$SomethingExisting, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw64$ACTOR, type, (SubLObject)blue_grapher_utilities.$kw65$ROLE, role2, (SubLObject)blue_grapher_utilities.$kw66$SCENE, scene6));
                    final SubLObject headnode2 = bbf_make_node((SubLObject)ConsesLow.list(type, role3, scene7), blue_grapher_utilities.$const63$SomethingExisting, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw64$ACTOR, type, (SubLObject)blue_grapher_utilities.$kw65$ROLE, role3, (SubLObject)blue_grapher_utilities.$kw66$SCENE, scene7));
                    final SubLObject edge = bbf_make_edge_with_nodes(scene_to_scene_actor_relation, tailnode2, headnode2, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    result_nodes = (SubLObject)ConsesLow.cons(tailnode2, result_nodes);
                    result_nodes = (SubLObject)ConsesLow.cons(headnode2, result_nodes);
                    result_edges = (SubLObject)ConsesLow.cons(edge, result_edges);
                    cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                    scene1_role1_scene2_role2_type = cdolist_list_var_$32.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                scene_to_scene_actor_relation = cdolist_list_var.first();
            }
            SubLObject removed_result_edges = (SubLObject)blue_grapher_utilities.NIL;
            SubLObject cdolist_list_var3 = result_edges;
            SubLObject edge_1 = (SubLObject)blue_grapher_utilities.NIL;
            edge_1 = cdolist_list_var3.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var3) {
                SubLObject cdolist_list_var_$33 = result_edges;
                SubLObject edge_2 = (SubLObject)blue_grapher_utilities.NIL;
                edge_2 = cdolist_list_var_$33.first();
                while (blue_grapher_utilities.NIL != cdolist_list_var_$33) {
                    if (conses_high.getf(edge_1, (SubLObject)blue_grapher_utilities.$kw75$HEAD, (SubLObject)blue_grapher_utilities.UNPROVIDED).equal(conses_high.getf(edge_2, (SubLObject)blue_grapher_utilities.$kw75$HEAD, (SubLObject)blue_grapher_utilities.UNPROVIDED)) && conses_high.getf(edge_1, (SubLObject)blue_grapher_utilities.$kw76$TAIL, (SubLObject)blue_grapher_utilities.UNPROVIDED).equal(conses_high.getf(edge_2, (SubLObject)blue_grapher_utilities.$kw76$TAIL, (SubLObject)blue_grapher_utilities.UNPROVIDED)) && !conses_high.getf(edge_1, (SubLObject)blue_grapher_utilities.$kw77$RELATION, (SubLObject)blue_grapher_utilities.UNPROVIDED).equal(conses_high.getf(edge_2, (SubLObject)blue_grapher_utilities.$kw77$RELATION, (SubLObject)blue_grapher_utilities.UNPROVIDED))) {
                        if (blue_grapher_utilities.NIL != genl_predicates.genl_predicateP(conses_high.getf(edge_1, (SubLObject)blue_grapher_utilities.$kw77$RELATION, (SubLObject)blue_grapher_utilities.UNPROVIDED), conses_high.getf(edge_2, (SubLObject)blue_grapher_utilities.$kw77$RELATION, (SubLObject)blue_grapher_utilities.UNPROVIDED), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED)) {
                            final SubLObject item_var = edge_2;
                            if (blue_grapher_utilities.NIL == conses_high.member(item_var, removed_result_edges, (SubLObject)blue_grapher_utilities.EQUAL, Symbols.symbol_function((SubLObject)blue_grapher_utilities.IDENTITY))) {
                                removed_result_edges = (SubLObject)ConsesLow.cons(item_var, removed_result_edges);
                            }
                        }
                        else {
                            final SubLObject item_var = edge_1;
                            if (blue_grapher_utilities.NIL == conses_high.member(item_var, removed_result_edges, (SubLObject)blue_grapher_utilities.EQUAL, Symbols.symbol_function((SubLObject)blue_grapher_utilities.IDENTITY))) {
                                removed_result_edges = (SubLObject)ConsesLow.cons(item_var, removed_result_edges);
                            }
                        }
                    }
                    cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                    edge_2 = cdolist_list_var_$33.first();
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                edge_1 = cdolist_list_var3.first();
            }
            SubLObject new_result_edges = (SubLObject)blue_grapher_utilities.NIL;
            cdolist_list_var2 = result_edges;
            SubLObject edge2 = (SubLObject)blue_grapher_utilities.NIL;
            edge2 = cdolist_list_var2.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var2) {
                if (blue_grapher_utilities.NIL == subl_promotions.memberP(edge2, removed_result_edges, (SubLObject)blue_grapher_utilities.EQUAL, (SubLObject)blue_grapher_utilities.UNPROVIDED)) {
                    new_result_edges = (SubLObject)ConsesLow.cons(edge2, new_result_edges);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                edge2 = cdolist_list_var2.first();
            }
            result_edges = new_result_edges;
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return bbf_make_graph(list_utilities.hash_remove_duplicates(result_nodes, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), list_utilities.hash_remove_duplicates(result_edges, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), (SubLObject)(mt.eql(blue_grapher_utilities.$const78$EverythingPSC) ? blue_grapher_utilities.NIL : ConsesLow.list((SubLObject)blue_grapher_utilities.$kw39$MT, mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 34808L)
    public static SubLObject bbf_inference_answers(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject params = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw81$PARAMS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject inference_store_id = conses_high.getf(params, (SubLObject)blue_grapher_utilities.$kw82$INFERENCE_STORE_ID, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject inference_id = conses_high.getf(params, (SubLObject)blue_grapher_utilities.$kw83$INFERENCE_ID, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(inference_store_id, inference_id);
        final SubLObject var_var_pred_map = determine_edge_templates_for_inference(inference);
        final SubLObject result_nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject result_edges = (SubLObject)blue_grapher_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject current_answers = cb_query_browser.cb_inference_current_answers(inference);
        final SubLObject free_el_variables = thread.secondMultipleValue();
        final SubLObject inference_new_justification_set = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = current_answers;
        SubLObject v_answer = (SubLObject)blue_grapher_utilities.NIL;
        v_answer = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
            SubLObject cdolist_list_var_$34 = var_var_pred_map;
            SubLObject var_var_pred = (SubLObject)blue_grapher_utilities.NIL;
            var_var_pred = cdolist_list_var_$34.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$34) {
                final SubLObject pred = (blue_grapher_utilities.NIL != cycl_variables.el_varP(conses_high.third(var_var_pred))) ? list_utilities.alist_lookup(v_bindings, conses_high.third(var_var_pred), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED) : conses_high.third(var_var_pred);
                final SubLObject node_in = bbf_make_node(list_utilities.alist_lookup(v_bindings, var_var_pred.first(), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                final SubLObject node_out = bbf_make_node(list_utilities.alist_lookup(v_bindings, conses_high.second(var_var_pred), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                final SubLObject mt = conses_high.fourth(var_var_pred);
                final SubLObject type = (SubLObject)blue_grapher_utilities.NIL;
                final SubLObject v_properties = (SubLObject)((blue_grapher_utilities.NIL != fort_types_interface.commutative_relationP(pred)) ? ConsesLow.list((SubLObject)blue_grapher_utilities.$kw84$DIRECTION, (SubLObject)blue_grapher_utilities.$kw85$UNDIRECTED) : blue_grapher_utilities.NIL);
                result_edges = (SubLObject)ConsesLow.cons(bbf_make_edge_with_nodes(pred, node_in, node_out, mt, type, v_properties), result_edges);
                cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                var_var_pred = cdolist_list_var_$34.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return bbf_make_graph(list_utilities.hash_remove_duplicates(result_nodes, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), list_utilities.hash_remove_duplicates(result_edges, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), (SubLObject)((blue_grapher_utilities.NIL != inference_datastructures_inference.inference_mt(inference)) ? ConsesLow.list((SubLObject)blue_grapher_utilities.$kw39$MT, inference_datastructures_inference.inference_mt(inference)) : blue_grapher_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 36691L)
    public static SubLObject determine_edge_templates_for_inference(final SubLObject inference) {
        final SubLObject el_bindings = inference_datastructures_inference.inference_el_bindings(inference);
        final SubLObject free_el_variables = inference_datastructures_inference.inference_free_el_vars(inference);
        SubLObject var_var_pred_map = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_hl_query(inference);
        SubLObject clause = (SubLObject)blue_grapher_utilities.NIL;
        clause = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$35 = clauses.neg_lits(clause);
            SubLObject lit = (SubLObject)blue_grapher_utilities.NIL;
            lit = cdolist_list_var_$35.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$35) {
                SubLObject lit_asent = inference_datastructures_problem_query.contextualized_asent_asent(lit);
                final SubLObject lit_mt = inference_datastructures_problem_query.contextualized_asent_mt(lit);
                final SubLObject pred = lit_asent.first();
                if (blue_grapher_utilities.NIL != forts.fort_p(pred) && kb_mapping_utilities.fpred_value_in_any_mt(pred, blue_grapher_utilities.$const87$arg1Isa, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED).eql(blue_grapher_utilities.$const88$CycLSentence_Assertible)) {
                    lit_asent = conses_high.second(lit_asent);
                }
                SubLObject list_var = (SubLObject)blue_grapher_utilities.NIL;
                SubLObject arg1 = (SubLObject)blue_grapher_utilities.NIL;
                SubLObject arg1_pos = (SubLObject)blue_grapher_utilities.NIL;
                list_var = cycl_utilities.sentence_args(lit_asent, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                arg1 = list_var.first();
                for (arg1_pos = (SubLObject)blue_grapher_utilities.ZERO_INTEGER; blue_grapher_utilities.NIL != list_var; list_var = list_var.rest(), arg1 = list_var.first(), arg1_pos = Numbers.add((SubLObject)blue_grapher_utilities.ONE_INTEGER, arg1_pos)) {
                    SubLObject list_var_$36 = (SubLObject)blue_grapher_utilities.NIL;
                    SubLObject arg2 = (SubLObject)blue_grapher_utilities.NIL;
                    SubLObject arg2_pos = (SubLObject)blue_grapher_utilities.NIL;
                    list_var_$36 = cycl_utilities.sentence_args(lit_asent, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    arg2 = list_var_$36.first();
                    for (arg2_pos = (SubLObject)blue_grapher_utilities.ZERO_INTEGER; blue_grapher_utilities.NIL != list_var_$36; list_var_$36 = list_var_$36.rest(), arg2 = list_var_$36.first(), arg2_pos = Numbers.add((SubLObject)blue_grapher_utilities.ONE_INTEGER, arg2_pos)) {
                        if (arg1_pos.numL(arg2_pos) && blue_grapher_utilities.NIL != cycl_grammar.hl_variable_p(arg1) && blue_grapher_utilities.NIL != cycl_grammar.hl_variable_p(arg2)) {
                            final SubLObject el_var1 = list_utilities.alist_reverse_lookup(el_bindings, arg1, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                            final SubLObject el_var2 = list_utilities.alist_reverse_lookup(el_bindings, arg2, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                            if (blue_grapher_utilities.NIL != subl_promotions.memberP(el_var1, free_el_variables, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED) && blue_grapher_utilities.NIL != subl_promotions.memberP(el_var2, free_el_variables, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED)) {
                                SubLObject pred_$37 = (blue_grapher_utilities.NIL != cycl_grammar.hl_variable_p(cycl_utilities.sentence_arg0(lit_asent))) ? list_utilities.alist_reverse_lookup(el_bindings, cycl_utilities.sentence_arg0(lit_asent), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED) : cycl_utilities.sentence_arg0(lit_asent);
                                if (pred_$37.eql(blue_grapher_utilities.$const89$different)) {
                                    pred_$37 = blue_grapher_utilities.$inference_answers_default_undetermined_relation$.getGlobalValue();
                                }
                                var_var_pred_map = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(el_var1, el_var2, pred_$37, lit_mt), var_var_pred_map);
                            }
                        }
                    }
                }
                cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                lit = cdolist_list_var_$35.first();
            }
            SubLObject cdolist_list_var_$36 = clauses.pos_lits(clause);
            lit = (SubLObject)blue_grapher_utilities.NIL;
            lit = cdolist_list_var_$36.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$36) {
                SubLObject lit_asent = inference_datastructures_problem_query.contextualized_asent_asent(lit);
                final SubLObject lit_mt = inference_datastructures_problem_query.contextualized_asent_mt(lit);
                final SubLObject pred = lit_asent.first();
                if (blue_grapher_utilities.NIL != forts.fort_p(pred) && kb_mapping_utilities.fpred_value_in_any_mt(pred, blue_grapher_utilities.$const87$arg1Isa, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED).eql(blue_grapher_utilities.$const88$CycLSentence_Assertible)) {
                    lit_asent = conses_high.second(lit_asent);
                }
                SubLObject list_var = (SubLObject)blue_grapher_utilities.NIL;
                SubLObject arg1 = (SubLObject)blue_grapher_utilities.NIL;
                SubLObject arg1_pos = (SubLObject)blue_grapher_utilities.NIL;
                list_var = cycl_utilities.sentence_args(lit_asent, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                arg1 = list_var.first();
                for (arg1_pos = (SubLObject)blue_grapher_utilities.ZERO_INTEGER; blue_grapher_utilities.NIL != list_var; list_var = list_var.rest(), arg1 = list_var.first(), arg1_pos = Numbers.add((SubLObject)blue_grapher_utilities.ONE_INTEGER, arg1_pos)) {
                    SubLObject list_var_$37 = (SubLObject)blue_grapher_utilities.NIL;
                    SubLObject arg2 = (SubLObject)blue_grapher_utilities.NIL;
                    SubLObject arg2_pos = (SubLObject)blue_grapher_utilities.NIL;
                    list_var_$37 = cycl_utilities.sentence_args(lit_asent, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    arg2 = list_var_$37.first();
                    for (arg2_pos = (SubLObject)blue_grapher_utilities.ZERO_INTEGER; blue_grapher_utilities.NIL != list_var_$37; list_var_$37 = list_var_$37.rest(), arg2 = list_var_$37.first(), arg2_pos = Numbers.add((SubLObject)blue_grapher_utilities.ONE_INTEGER, arg2_pos)) {
                        if (arg1_pos.numL(arg2_pos) && blue_grapher_utilities.NIL != cycl_grammar.hl_variable_p(arg1) && blue_grapher_utilities.NIL != cycl_grammar.hl_variable_p(arg2)) {
                            final SubLObject el_var1 = list_utilities.alist_reverse_lookup(el_bindings, arg1, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                            final SubLObject el_var2 = list_utilities.alist_reverse_lookup(el_bindings, arg2, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                            if (blue_grapher_utilities.NIL != subl_promotions.memberP(el_var1, free_el_variables, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED) && blue_grapher_utilities.NIL != subl_promotions.memberP(el_var2, free_el_variables, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED)) {
                                SubLObject pred_$38 = (blue_grapher_utilities.NIL != cycl_grammar.hl_variable_p(cycl_utilities.sentence_arg0(lit_asent))) ? list_utilities.alist_reverse_lookup(el_bindings, cycl_utilities.sentence_arg0(lit_asent), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED) : cycl_utilities.sentence_arg0(lit_asent);
                                if (pred_$38.eql(blue_grapher_utilities.$const89$different)) {
                                    pred_$38 = blue_grapher_utilities.$inference_answers_default_undetermined_relation$.getGlobalValue();
                                }
                                var_var_pred_map = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(el_var1, el_var2, pred_$38, lit_mt), var_var_pred_map);
                            }
                        }
                    }
                }
                cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                lit = cdolist_list_var_$36.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        if (blue_grapher_utilities.NIL == var_var_pred_map) {
            final SubLObject focus_el_var = free_el_variables.first();
            SubLObject cdolist_list_var2;
            final SubLObject other_el_vars = cdolist_list_var2 = free_el_variables.rest();
            SubLObject other_el_var = (SubLObject)blue_grapher_utilities.NIL;
            other_el_var = cdolist_list_var2.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var2) {
                var_var_pred_map = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(focus_el_var, other_el_var, blue_grapher_utilities.$inference_answers_default_undetermined_relation$.getGlobalValue(), blue_grapher_utilities.$const78$EverythingPSC), var_var_pred_map);
                cdolist_list_var2 = cdolist_list_var2.rest();
                other_el_var = cdolist_list_var2.first();
            }
        }
        return var_var_pred_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 38403L)
    public static SubLObject html_determine_edge_templates_for_inference(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_var_pred_map = determine_edge_templates_for_inference(inference);
        final SubLObject el_query = inference_datastructures_inference.inference_el_query(inference);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)blue_grapher_utilities.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)blue_grapher_utilities.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)blue_grapher_utilities.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)blue_grapher_utilities.T, thread);
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)blue_grapher_utilities.$kw90$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)blue_grapher_utilities.T, thread);
                    html_utilities.html_princ((SubLObject)blue_grapher_utilities.$str91$Query);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)blue_grapher_utilities.T, thread);
                    html_utilities.html_glyph((SubLObject)blue_grapher_utilities.$kw92$NBSP, (SubLObject)blue_grapher_utilities.THREE_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)blue_grapher_utilities.$kw90$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)blue_grapher_utilities.T, thread);
                    html_utilities.html_princ((SubLObject)blue_grapher_utilities.$str93$Edge_Templates);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)blue_grapher_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)blue_grapher_utilities.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)blue_grapher_utilities.$kw94$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)blue_grapher_utilities.T, thread);
                    final SubLObject size_val = (SubLObject)blue_grapher_utilities.ONE_INTEGER;
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (blue_grapher_utilities.NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)blue_grapher_utilities.T, thread);
                        cb_utilities.cb_form(el_query, (SubLObject)blue_grapher_utilities.ZERO_INTEGER, (SubLObject)blue_grapher_utilities.T);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)blue_grapher_utilities.T, thread);
                    html_utilities.html_glyph((SubLObject)blue_grapher_utilities.$kw92$NBSP, (SubLObject)blue_grapher_utilities.THREE_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)blue_grapher_utilities.$kw94$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)blue_grapher_utilities.T, thread);
                    final SubLObject size_val = (SubLObject)blue_grapher_utilities.ONE_INTEGER;
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (blue_grapher_utilities.NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)blue_grapher_utilities.T, thread);
                        SubLObject cdolist_list_var = var_var_pred_map;
                        SubLObject var_var_pred = (SubLObject)blue_grapher_utilities.NIL;
                        var_var_pred = cdolist_list_var.first();
                        while (blue_grapher_utilities.NIL != cdolist_list_var) {
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            cb_utilities.cb_form(var_var_pred.first(), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)blue_grapher_utilities.$str95$_____);
                            cb_utilities.cb_form(conses_high.third(var_var_pred), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                            if (blue_grapher_utilities.NIL != fort_types_interface.commutative_relationP(conses_high.third(var_var_pred))) {
                                html_utilities.html_princ((SubLObject)blue_grapher_utilities.$str95$_____);
                            }
                            else {
                                html_utilities.html_princ((SubLObject)blue_grapher_utilities.$str96$______);
                            }
                            cb_utilities.cb_form(conses_high.second(var_var_pred), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            html_utilities.html_br();
                            cdolist_list_var = cdolist_list_var.rest();
                            var_var_pred = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)blue_grapher_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)blue_grapher_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 39499L)
    public static SubLObject bbf_inference(final SubLObject arg_plist) {
        final SubLObject params = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw81$PARAMS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject store_suid = conses_high.getf(params, (SubLObject)blue_grapher_utilities.$kw99$STORE_SUID, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject inference_suid = conses_high.getf(params, (SubLObject)blue_grapher_utilities.$kw100$INFERENCE_SUID, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(store_suid, inference_suid);
        if (blue_grapher_utilities.NIL == inference_datastructures_inference.inference_p(inference)) {
            Errors.error((SubLObject)blue_grapher_utilities.$str101$Inference_not_found_);
        }
        final SubLObject inference_mt = inference_datastructures_inference.inference_mt(inference);
        final SubLObject hl_query = inference_datastructures_inference.inference_hl_query(inference);
        final SubLObject hl_to_el_var_list = make_inference_hl_to_el_var_list(inference);
        final SubLObject result_nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject result_edges = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject cdolist_list_var = hl_query;
        SubLObject contextualized_clause = (SubLObject)blue_grapher_utilities.NIL;
        contextualized_clause = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            SubLObject sense = (SubLObject)blue_grapher_utilities.$kw102$NEG;
            SubLObject index_var = (SubLObject)blue_grapher_utilities.ZERO_INTEGER;
            SubLObject cdolist_list_var_$51 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = (SubLObject)blue_grapher_utilities.NIL;
            contextualized_asent = cdolist_list_var_$51.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$51) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = (SubLObject)blue_grapher_utilities.NIL;
                SubLObject asent = (SubLObject)blue_grapher_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)blue_grapher_utilities.$list103);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)blue_grapher_utilities.$list103);
                asent = current.first();
                current = current.rest();
                if (blue_grapher_utilities.NIL == current) {
                    result_edges = (SubLObject)ConsesLow.cons(blue_literal_to_edge(asent, hl_to_el_var_list, mt), result_edges);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)blue_grapher_utilities.$list103);
                }
                index_var = Numbers.add(index_var, (SubLObject)blue_grapher_utilities.ONE_INTEGER);
                cdolist_list_var_$51 = cdolist_list_var_$51.rest();
                contextualized_asent = cdolist_list_var_$51.first();
            }
            sense = (SubLObject)blue_grapher_utilities.$kw104$POS;
            index_var = (SubLObject)blue_grapher_utilities.ZERO_INTEGER;
            SubLObject cdolist_list_var_$52 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = (SubLObject)blue_grapher_utilities.NIL;
            contextualized_asent = cdolist_list_var_$52.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$52) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = (SubLObject)blue_grapher_utilities.NIL;
                SubLObject asent = (SubLObject)blue_grapher_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)blue_grapher_utilities.$list103);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)blue_grapher_utilities.$list103);
                asent = current.first();
                current = current.rest();
                if (blue_grapher_utilities.NIL == current) {
                    result_edges = (SubLObject)ConsesLow.cons(blue_literal_to_edge(asent, hl_to_el_var_list, mt), result_edges);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)blue_grapher_utilities.$list103);
                }
                index_var = Numbers.add(index_var, (SubLObject)blue_grapher_utilities.ONE_INTEGER);
                cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                contextualized_asent = cdolist_list_var_$52.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        return bbf_make_graph(list_utilities.hash_remove_duplicates(result_nodes, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), list_utilities.hash_remove_duplicates(result_edges, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw39$MT, inference_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 40576L)
    public static SubLObject bbf_rule(final SubLObject arg_plist) {
        final SubLObject assertions = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw107$ASSERTIONS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject mt = (SubLObject)blue_grapher_utilities.NIL;
        final SubLObject result_nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject result_edges = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)blue_grapher_utilities.NIL;
        assertion = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            mt = assertions_high.assertion_mt(assertion);
            final SubLObject clause = assertions_high.assertion_cnf(assertion);
            final SubLObject neg_lits = clauses.neg_lits(clause);
            final SubLObject pos_lits = clauses.pos_lits(clause);
            final SubLObject hl_to_el_var_list = make_assertion_hl_to_el_var_list(assertion);
            SubLObject cdolist_list_var_$53 = neg_lits;
            SubLObject neg_lit = (SubLObject)blue_grapher_utilities.NIL;
            neg_lit = cdolist_list_var_$53.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$53) {
                result_edges = (SubLObject)ConsesLow.cons(blue_literal_to_edge(neg_lit, hl_to_el_var_list, mt), result_edges);
                cdolist_list_var_$53 = cdolist_list_var_$53.rest();
                neg_lit = cdolist_list_var_$53.first();
            }
            SubLObject cdolist_list_var_$54 = pos_lits;
            SubLObject pos_lit = (SubLObject)blue_grapher_utilities.NIL;
            pos_lit = cdolist_list_var_$54.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var_$54) {
                result_edges = (SubLObject)ConsesLow.cons(blue_literal_to_edge(pos_lit, hl_to_el_var_list, mt), result_edges);
                cdolist_list_var_$54 = cdolist_list_var_$54.rest();
                pos_lit = cdolist_list_var_$54.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return bbf_make_graph(list_utilities.hash_remove_duplicates(result_nodes, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), list_utilities.hash_remove_duplicates(result_edges, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw39$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 41514L)
    public static SubLObject blue_literal_to_edge(final SubLObject lit, final SubLObject hl_to_el_var_list, final SubLObject mt) {
        if (blue_grapher_utilities.NIL != el_utilities.unary_lit_p(lit)) {
            return (SubLObject)blue_grapher_utilities.NIL;
        }
        final SubLObject predicate = cycl_utilities.formula_arg0(lit);
        SubLObject arg1 = el_utilities.literal_arg1(lit, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject arg2 = (blue_grapher_utilities.NIL != el_utilities.binary_lit_p(lit)) ? el_utilities.literal_arg2(lit, (SubLObject)blue_grapher_utilities.UNPROVIDED) : el_utilities.literal_args(lit, (SubLObject)blue_grapher_utilities.UNPROVIDED).rest();
        SubLObject list_var = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject el_var = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject hl_var_id = (SubLObject)blue_grapher_utilities.NIL;
        list_var = hl_to_el_var_list;
        el_var = list_var.first();
        for (hl_var_id = (SubLObject)blue_grapher_utilities.ZERO_INTEGER; blue_grapher_utilities.NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), hl_var_id = Numbers.add((SubLObject)blue_grapher_utilities.ONE_INTEGER, hl_var_id)) {
            final SubLObject hl_var = variables.get_variable(hl_var_id);
            arg1 = list_utilities.tree_substitute((SubLObject)ConsesLow.list(arg1), hl_var, el_var).first();
            arg2 = list_utilities.tree_substitute((SubLObject)ConsesLow.list(arg2), hl_var, el_var).first();
        }
        final SubLObject node_in = bbf_make_node(arg1, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject node_out = bbf_make_node(arg2, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        return bbf_make_edge_with_nodes(predicate, node_in, node_out, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 42230L)
    public static SubLObject make_inference_hl_to_el_var_list(final SubLObject inference) {
        final SubLObject inference_el_bindings = inference_datastructures_inference.inference_el_bindings(inference);
        SubLObject list_length = (SubLObject)blue_grapher_utilities.ZERO_INTEGER;
        SubLObject result = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject cdolist_list_var = inference_el_bindings;
        SubLObject cons = (SubLObject)blue_grapher_utilities.NIL;
        cons = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject el_var = (SubLObject)blue_grapher_utilities.NIL;
            SubLObject hl_var = (SubLObject)blue_grapher_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)blue_grapher_utilities.$list108);
            el_var = current.first();
            current = (hl_var = current.rest());
            final SubLObject hl_var_pos = Numbers.add((SubLObject)blue_grapher_utilities.ONE_INTEGER, variables.variable_id(hl_var));
            if (hl_var_pos.numG(list_length)) {
                list_length = hl_var_pos;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        result = (SubLObject)ConsesLow.make_list(list_length, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        cdolist_list_var = inference_el_bindings;
        cons = (SubLObject)blue_grapher_utilities.NIL;
        cons = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject el_var = (SubLObject)blue_grapher_utilities.NIL;
            SubLObject hl_var = (SubLObject)blue_grapher_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)blue_grapher_utilities.$list108);
            el_var = current.first();
            current = (hl_var = current.rest());
            ConsesLow.set_nth(variables.variable_id(hl_var), result, el_var);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 42755L)
    public static SubLObject make_assertion_hl_to_el_var_list(final SubLObject assertion) {
        return Mapping.mapcar((SubLObject)blue_grapher_utilities.$sym109$INTERN_EL_VAR, assertions_high.assertion_variable_names(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 42889L)
    public static SubLObject bbf_make_edge_from_assertion(final SubLObject assertion) {
        if (blue_grapher_utilities.NIL == assertion_handles.assertion_p(assertion)) {
            return (SubLObject)blue_grapher_utilities.NIL;
        }
        final SubLObject formula = assertions_high.assertion_formula(assertion);
        return bbf_make_edge(cycl_utilities.formula_arg0(formula), cycl_utilities.formula_arg1(formula, (SubLObject)blue_grapher_utilities.UNPROVIDED), cycl_utilities.formula_arg2(formula, (SubLObject)blue_grapher_utilities.UNPROVIDED), assertions_high.assertion_mt(assertion), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 43707L)
    public static SubLObject bbf_make_graph(SubLObject nodes, final SubLObject edges, SubLObject v_properties) {
        if (v_properties == blue_grapher_utilities.UNPROVIDED) {
            v_properties = (SubLObject)blue_grapher_utilities.NIL;
        }
        if (blue_grapher_utilities.NIL != edges && blue_grapher_utilities.NIL == nodes) {
            SubLObject cdolist_list_var = edges;
            SubLObject edge = (SubLObject)blue_grapher_utilities.NIL;
            edge = cdolist_list_var.first();
            while (blue_grapher_utilities.NIL != cdolist_list_var) {
                nodes = (SubLObject)ConsesLow.cons(conses_high.getf(edge, (SubLObject)blue_grapher_utilities.$kw75$HEAD, (SubLObject)blue_grapher_utilities.UNPROVIDED), nodes);
                nodes = (SubLObject)ConsesLow.cons(conses_high.getf(edge, (SubLObject)blue_grapher_utilities.$kw76$TAIL, (SubLObject)blue_grapher_utilities.UNPROVIDED), nodes);
                cdolist_list_var = cdolist_list_var.rest();
                edge = cdolist_list_var.first();
            }
            nodes = list_utilities.hash_remove_duplicates(nodes, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        }
        return (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw110$NODES, nodes, (SubLObject)blue_grapher_utilities.$kw111$EDGES, edges, (SubLObject)blue_grapher_utilities.$kw112$PROPERTIES, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 44090L)
    public static SubLObject bbf_make_edge(final SubLObject pred, final SubLObject arg_in, final SubLObject arg_out, SubLObject mt, SubLObject type, SubLObject arg_in_type, SubLObject arg_out_type, SubLObject v_properties) {
        if (type == blue_grapher_utilities.UNPROVIDED) {
            type = (SubLObject)blue_grapher_utilities.NIL;
        }
        if (arg_in_type == blue_grapher_utilities.UNPROVIDED) {
            arg_in_type = (SubLObject)blue_grapher_utilities.NIL;
        }
        if (arg_out_type == blue_grapher_utilities.UNPROVIDED) {
            arg_out_type = (SubLObject)blue_grapher_utilities.NIL;
        }
        if (v_properties == blue_grapher_utilities.UNPROVIDED) {
            v_properties = (SubLObject)blue_grapher_utilities.NIL;
        }
        final SubLObject possible_assertion = kb_indexing.find_gaf_genl_mts((SubLObject)ConsesLow.list(pred, arg_in, arg_out), mt);
        SubLObject trueP = (SubLObject)blue_grapher_utilities.T;
        SubLObject assertedP = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject strength = (SubLObject)blue_grapher_utilities.$kw113$DEFAULT;
        if (blue_grapher_utilities.NIL != assertion_handles.assertion_p(possible_assertion)) {
            trueP = (SubLObject)((assertions_high.assertion_truth(possible_assertion) == blue_grapher_utilities.$kw114$TRUE) ? blue_grapher_utilities.T : blue_grapher_utilities.NIL);
            assertedP = assertions_high.asserted_assertionP(possible_assertion);
            strength = assertions_high.assertion_strength(possible_assertion);
            mt = assertions_high.assertion_mt(possible_assertion);
        }
        else if (blue_grapher_utilities.NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) {
            mt = sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(pred), arg_in, arg_out, blue_grapher_utilities.$const51$True_JustificationTruth).first();
        }
        return (SubLObject)ConsesLow.list(new SubLObject[] { blue_grapher_utilities.$kw77$RELATION, pred, blue_grapher_utilities.$kw76$TAIL, bbf_make_node(arg_in, arg_in_type, (SubLObject)blue_grapher_utilities.UNPROVIDED), blue_grapher_utilities.$kw75$HEAD, bbf_make_node(arg_out, arg_out_type, (SubLObject)blue_grapher_utilities.UNPROVIDED), blue_grapher_utilities.$kw39$MT, mt, blue_grapher_utilities.$kw115$TRUE_, trueP, blue_grapher_utilities.$kw116$ASSERTED_, assertedP, blue_grapher_utilities.$kw10$STRENGTH, strength, blue_grapher_utilities.$kw12$TYPE, type, blue_grapher_utilities.$kw112$PROPERTIES, v_properties });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 45154L)
    public static SubLObject bbf_make_edge_with_nodes(final SubLObject pred, final SubLObject node_in, final SubLObject node_out, final SubLObject mt, SubLObject type, SubLObject v_properties) {
        if (type == blue_grapher_utilities.UNPROVIDED) {
            type = (SubLObject)blue_grapher_utilities.NIL;
        }
        if (v_properties == blue_grapher_utilities.UNPROVIDED) {
            v_properties = (SubLObject)blue_grapher_utilities.NIL;
        }
        return (SubLObject)ConsesLow.list(new SubLObject[] { blue_grapher_utilities.$kw77$RELATION, pred, blue_grapher_utilities.$kw76$TAIL, node_in, blue_grapher_utilities.$kw75$HEAD, node_out, blue_grapher_utilities.$kw39$MT, mt, blue_grapher_utilities.$kw12$TYPE, type, blue_grapher_utilities.$kw112$PROPERTIES, v_properties });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 45458L)
    public static SubLObject bbf_make_node(final SubLObject v_core, SubLObject type, SubLObject v_properties) {
        if (type == blue_grapher_utilities.UNPROVIDED) {
            type = (SubLObject)blue_grapher_utilities.NIL;
        }
        if (v_properties == blue_grapher_utilities.UNPROVIDED) {
            v_properties = (SubLObject)blue_grapher_utilities.NIL;
        }
        return (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw117$CORE, v_core, (SubLObject)blue_grapher_utilities.$kw12$TYPE, type, (SubLObject)blue_grapher_utilities.$kw112$PROPERTIES, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 46157L)
    public static SubLObject blue_event_dispatcher_runningP() {
        return event_utilities.generic_event_dispatcher_process_running_for_application_p((SubLObject)blue_grapher_utilities.$sym122$_BLUE_EVENT_DISPATCHER_LISTENERS_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 46157L)
    public static SubLObject ensure_blue_event_dispatcher_running() {
        if (blue_grapher_utilities.NIL == blue_event_dispatcher_runningP()) {
            start_blue_event_dispatcher();
        }
        return event_utilities.generic_event_dispatcher_process();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 46157L)
    public static SubLObject register_listener_with_blue_event_dispatcher(final SubLObject listener_var) {
        SubLObject release = (SubLObject)blue_grapher_utilities.NIL;
        try {
            release = Locks.seize_lock(blue_grapher_utilities.$blue_event_dispatcher_lock$.getGlobalValue());
            if (blue_grapher_utilities.NIL == Sequences.find(listener_var, blue_grapher_utilities.$blue_event_dispatcher_listeners$.getGlobalValue(), (SubLObject)blue_grapher_utilities.EQUALP, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED)) {
                blue_grapher_utilities.$blue_event_dispatcher_listeners$.setGlobalValue((SubLObject)ConsesLow.cons(listener_var, blue_grapher_utilities.$blue_event_dispatcher_listeners$.getGlobalValue()));
                if (blue_grapher_utilities.NIL != blue_event_dispatcher_runningP()) {
                    event_broker.register_event_listener(listener_var, (SubLObject)blue_grapher_utilities.NIL);
                }
            }
        }
        finally {
            if (blue_grapher_utilities.NIL != release) {
                Locks.release_lock(blue_grapher_utilities.$blue_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 46157L)
    public static SubLObject deregister_listener_with_blue_event_dispatcher(final SubLObject listener_var) {
        SubLObject release = (SubLObject)blue_grapher_utilities.NIL;
        try {
            release = Locks.seize_lock(blue_grapher_utilities.$blue_event_dispatcher_lock$.getGlobalValue());
            blue_grapher_utilities.$blue_event_dispatcher_listeners$.setGlobalValue(Sequences.remove(listener_var, blue_grapher_utilities.$blue_event_dispatcher_listeners$.getGlobalValue(), (SubLObject)blue_grapher_utilities.EQUALP, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
            if (blue_grapher_utilities.NIL != blue_event_dispatcher_runningP()) {
                event_broker.deregister_event_listener(listener_var, (SubLObject)blue_grapher_utilities.NIL);
            }
        }
        finally {
            if (blue_grapher_utilities.NIL != release) {
                Locks.release_lock(blue_grapher_utilities.$blue_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 46157L)
    public static SubLObject stop_blue_event_dispatcher() {
        return event_utilities.stop_generic_event_dispatcher_process_for_application((SubLObject)blue_grapher_utilities.$sym122$_BLUE_EVENT_DISPATCHER_LISTENERS_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 46157L)
    public static SubLObject start_blue_event_dispatcher() {
        return event_utilities.start_generic_event_dispatcher_process_for_application((SubLObject)blue_grapher_utilities.$sym122$_BLUE_EVENT_DISPATCHER_LISTENERS_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 46399L)
    public static SubLObject blue_event(final SubLObject signature, final SubLObject blue_event) {
        ensure_blue_event_dispatcher_running();
        final SubLObject event = event_model.new_event((SubLObject)blue_grapher_utilities.$kw120$BLUE_EVENT, blue_event, signature);
        return event_broker.post_event(event, event_broker.core_event_broker());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 46793L)
    public static SubLObject blue_fetch_event(final SubLObject signature) {
        SubLObject message = message_mailboxes.retrieve_mail_from_message_mailbox(signature);
        if (blue_grapher_utilities.NIL != string_utilities.empty_string_p(message)) {
            message = (SubLObject)blue_grapher_utilities.NIL;
        }
        return message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 47073L)
    public static SubLObject blue_fetch_uia_blue_event(final SubLObject signature) {
        return blue_fetch_event(signature);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 47349L)
    public static SubLObject blue_current_message_mailbox_suite() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return blue_grapher_utilities.$blue_message_mailbox_suite$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 47443L)
    public static SubLObject blue_ensure_blue_event_address(final SubLObject address) {
        final SubLObject mbox_suite = blue_current_message_mailbox_suite();
        message_mailboxes.ensure_message_mailbox_allocation(address, mbox_suite);
        return address;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 47640L)
    public static SubLObject map_blue_event_to_mailbox(final SubLObject event) {
        final SubLObject source = event_model.event_source(event);
        final SubLObject message = event_model.event_message(event);
        message_mailboxes.store_mail_in_message_mailbox(source, message, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        return event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 47842L)
    public static SubLObject blue_map_event_to_blue_event(final SubLObject event, SubLObject params) {
        if (params == blue_grapher_utilities.UNPROVIDED) {
            params = (SubLObject)blue_grapher_utilities.NIL;
        }
        map_blue_event_to_mailbox(event);
        return event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject blue_graph_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)blue_grapher_utilities.ZERO_INTEGER);
        return (SubLObject)blue_grapher_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject blue_graph_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $blue_graph_native.class) ? blue_grapher_utilities.T : blue_grapher_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject blue_graph_isg(final SubLObject v_object) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject blue_graph_node_label_map(final SubLObject v_object) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject blue_graph_nodes(final SubLObject v_object) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject blue_graph_edge_label_map(final SubLObject v_object) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject blue_graph_edges(final SubLObject v_object) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject blue_graph_node_definitions(final SubLObject v_object) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject blue_graph_edge_definitions(final SubLObject v_object) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject blue_graph_options(final SubLObject v_object) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject _csetf_blue_graph_isg(final SubLObject v_object, final SubLObject value) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject _csetf_blue_graph_node_label_map(final SubLObject v_object, final SubLObject value) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject _csetf_blue_graph_nodes(final SubLObject v_object, final SubLObject value) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject _csetf_blue_graph_edge_label_map(final SubLObject v_object, final SubLObject value) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject _csetf_blue_graph_edges(final SubLObject v_object, final SubLObject value) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject _csetf_blue_graph_node_definitions(final SubLObject v_object, final SubLObject value) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject _csetf_blue_graph_edge_definitions(final SubLObject v_object, final SubLObject value) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject _csetf_blue_graph_options(final SubLObject v_object, final SubLObject value) {
        assert blue_grapher_utilities.NIL != blue_graph_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject make_blue_graph(SubLObject arglist) {
        if (arglist == blue_grapher_utilities.UNPROVIDED) {
            arglist = (SubLObject)blue_grapher_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $blue_graph_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)blue_grapher_utilities.NIL, next = arglist; blue_grapher_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)blue_grapher_utilities.$kw150$ISG)) {
                _csetf_blue_graph_isg(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)blue_grapher_utilities.$kw151$NODE_LABEL_MAP)) {
                _csetf_blue_graph_node_label_map(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)blue_grapher_utilities.$kw110$NODES)) {
                _csetf_blue_graph_nodes(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)blue_grapher_utilities.$kw152$EDGE_LABEL_MAP)) {
                _csetf_blue_graph_edge_label_map(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)blue_grapher_utilities.$kw111$EDGES)) {
                _csetf_blue_graph_edges(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)blue_grapher_utilities.$kw153$NODE_DEFINITIONS)) {
                _csetf_blue_graph_node_definitions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)blue_grapher_utilities.$kw154$EDGE_DEFINITIONS)) {
                _csetf_blue_graph_edge_definitions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)blue_grapher_utilities.$kw155$OPTIONS)) {
                _csetf_blue_graph_options(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)blue_grapher_utilities.$str156$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject visit_defstruct_blue_graph(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)blue_grapher_utilities.$kw157$BEGIN, (SubLObject)blue_grapher_utilities.$sym158$MAKE_BLUE_GRAPH, (SubLObject)blue_grapher_utilities.EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)blue_grapher_utilities.$kw159$SLOT, (SubLObject)blue_grapher_utilities.$kw150$ISG, blue_graph_isg(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)blue_grapher_utilities.$kw159$SLOT, (SubLObject)blue_grapher_utilities.$kw151$NODE_LABEL_MAP, blue_graph_node_label_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)blue_grapher_utilities.$kw159$SLOT, (SubLObject)blue_grapher_utilities.$kw110$NODES, blue_graph_nodes(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)blue_grapher_utilities.$kw159$SLOT, (SubLObject)blue_grapher_utilities.$kw152$EDGE_LABEL_MAP, blue_graph_edge_label_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)blue_grapher_utilities.$kw159$SLOT, (SubLObject)blue_grapher_utilities.$kw111$EDGES, blue_graph_edges(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)blue_grapher_utilities.$kw159$SLOT, (SubLObject)blue_grapher_utilities.$kw153$NODE_DEFINITIONS, blue_graph_node_definitions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)blue_grapher_utilities.$kw159$SLOT, (SubLObject)blue_grapher_utilities.$kw154$EDGE_DEFINITIONS, blue_graph_edge_definitions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)blue_grapher_utilities.$kw159$SLOT, (SubLObject)blue_grapher_utilities.$kw155$OPTIONS, blue_graph_options(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)blue_grapher_utilities.$kw160$END, (SubLObject)blue_grapher_utilities.$sym158$MAKE_BLUE_GRAPH, (SubLObject)blue_grapher_utilities.EIGHT_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48199L)
    public static SubLObject visit_defstruct_object_blue_graph_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_blue_graph(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 48462L)
    public static SubLObject new_blue_graph() {
        final SubLObject blue_graph = make_blue_graph((SubLObject)blue_grapher_utilities.UNPROVIDED);
        _csetf_blue_graph_isg(blue_graph, integer_sequence_generator.new_integer_sequence_generator((SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
        _csetf_blue_graph_node_label_map(blue_graph, dictionary.new_dictionary((SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
        _csetf_blue_graph_edge_label_map(blue_graph, dictionary.new_dictionary((SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
        _csetf_blue_graph_edges(blue_graph, (SubLObject)blue_grapher_utilities.NIL);
        _csetf_blue_graph_nodes(blue_graph, dictionary.new_dictionary((SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
        _csetf_blue_graph_node_definitions(blue_graph, dictionary.new_dictionary((SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
        _csetf_blue_graph_edge_definitions(blue_graph, dictionary.new_dictionary((SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
        _csetf_blue_graph_options(blue_graph, dictionary.new_dictionary((SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
        return blue_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 49076L)
    public static SubLObject blue_graph_add_node_type(final SubLObject blue_graph, final SubLObject type, final SubLObject color) {
        final SubLObject node_definitions = blue_graph_node_definitions(blue_graph);
        dictionary.dictionary_enter(node_definitions, type, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw162$COLOR, color));
        return blue_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 49321L)
    public static SubLObject blue_graph_add_edge_type(final SubLObject blue_graph, final SubLObject type, final SubLObject color, SubLObject orientation) {
        if (orientation == blue_grapher_utilities.UNPROVIDED) {
            orientation = (SubLObject)blue_grapher_utilities.$kw113$DEFAULT;
        }
        final SubLObject edge_definitions = blue_graph_edge_definitions(blue_graph);
        dictionary.dictionary_enter(edge_definitions, type, (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw162$COLOR, color, (SubLObject)blue_grapher_utilities.$kw163$ORIENTATION, orientation));
        return blue_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 49604L)
    public static SubLObject blue_graph_add_option(final SubLObject blue_graph, final SubLObject option, final SubLObject plist) {
        final SubLObject options = blue_graph_options(blue_graph);
        dictionary.dictionary_enter(options, option, plist);
        return blue_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 49787L)
    public static SubLObject blue_graph_add_node(final SubLObject blue_graph, SubLObject type, SubLObject label) {
        if (type == blue_grapher_utilities.UNPROVIDED) {
            type = (SubLObject)blue_grapher_utilities.$kw113$DEFAULT;
        }
        if (label == blue_grapher_utilities.UNPROVIDED) {
            label = (SubLObject)blue_grapher_utilities.$str164$;
        }
        final SubLObject new_id = blue_graph_next_id(blue_graph);
        final SubLObject nodes = blue_graph_nodes(blue_graph);
        final SubLObject node_label_map = blue_graph_node_label_map(blue_graph);
        final SubLObject node = (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw165$ID, new_id, (SubLObject)blue_grapher_utilities.$kw12$TYPE, type, (SubLObject)blue_grapher_utilities.$kw166$LABEL, label);
        dictionary.dictionary_enter(nodes, new_id, node);
        if (blue_grapher_utilities.NIL == string_utilities.empty_string_p(label)) {
            dictionary.dictionary_enter(node_label_map, label, node);
        }
        return blue_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 50280L)
    public static SubLObject blue_graph_node_p(final SubLObject node) {
        return (SubLObject)SubLObjectFactory.makeBoolean(node.isList() && blue_graph_node_get_id(node).isFixnum());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 50404L)
    public static SubLObject blue_graph_maybe_add_node(final SubLObject blue_graph, final SubLObject label, SubLObject type) {
        if (type == blue_grapher_utilities.UNPROVIDED) {
            type = (SubLObject)blue_grapher_utilities.$kw113$DEFAULT;
        }
        if (blue_grapher_utilities.NIL == blue_graph_node_p(blue_graph_get_node_by_label(blue_graph, label))) {
            blue_graph_add_node(blue_graph, type, label);
        }
        return blue_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 50639L)
    public static SubLObject blue_graph_node_get_id(final SubLObject node) {
        return conses_high.getf(node, (SubLObject)blue_grapher_utilities.$kw165$ID, (SubLObject)blue_grapher_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 50712L)
    public static SubLObject blue_graph_node_get_type(final SubLObject node) {
        return conses_high.getf(node, (SubLObject)blue_grapher_utilities.$kw12$TYPE, (SubLObject)blue_grapher_utilities.$kw113$DEFAULT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 50797L)
    public static SubLObject blue_graph_node_get_label(final SubLObject node) {
        return conses_high.getf(node, (SubLObject)blue_grapher_utilities.$kw166$LABEL, (SubLObject)blue_grapher_utilities.$str164$);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 50878L)
    public static SubLObject blue_graph_get_node(final SubLObject blue_graph, final SubLObject id) {
        final SubLObject nodes = blue_graph_nodes(blue_graph);
        return dictionary.dictionary_lookup(nodes, id, (SubLObject)blue_grapher_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 51021L)
    public static SubLObject blue_graph_get_node_by_label(final SubLObject blue_graph, final SubLObject label) {
        final SubLObject node_label_map = blue_graph_node_label_map(blue_graph);
        return dictionary.dictionary_lookup(node_label_map, label, (SubLObject)blue_grapher_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 51205L)
    public static SubLObject blue_graph_resolve_node_label_reference(final SubLObject blue_graph, final SubLObject label) {
        final SubLObject node = blue_graph_get_node_by_label(blue_graph, label);
        return blue_graph_node_get_id(node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 51388L)
    public static SubLObject blue_graph_edge_from(final SubLObject edge) {
        return conses_high.getf(edge, (SubLObject)blue_grapher_utilities.$kw167$FROM, (SubLObject)blue_grapher_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 51493L)
    public static SubLObject blue_graph_edge_to(final SubLObject edge) {
        return conses_high.getf(edge, (SubLObject)blue_grapher_utilities.$kw168$TO, (SubLObject)blue_grapher_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 51562L)
    public static SubLObject blue_graph_edge_get_type(final SubLObject edge) {
        return conses_high.getf(edge, (SubLObject)blue_grapher_utilities.$kw12$TYPE, (SubLObject)blue_grapher_utilities.$kw113$DEFAULT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 51646L)
    public static SubLObject blue_graph_edge_get_label(final SubLObject edge) {
        return conses_high.getf(edge, (SubLObject)blue_grapher_utilities.$kw166$LABEL, (SubLObject)blue_grapher_utilities.$str164$);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 51726L)
    public static SubLObject blue_graph_add_edge(final SubLObject blue_graph, SubLObject from, SubLObject to, SubLObject type, SubLObject label) {
        if (type == blue_grapher_utilities.UNPROVIDED) {
            type = (SubLObject)blue_grapher_utilities.$kw113$DEFAULT;
        }
        if (label == blue_grapher_utilities.UNPROVIDED) {
            label = (SubLObject)blue_grapher_utilities.$str164$;
        }
        SubLObject edges = blue_graph_edges(blue_graph);
        final SubLObject edge_label_map = blue_graph_edge_label_map(blue_graph);
        SubLObject edge = (SubLObject)blue_grapher_utilities.NIL;
        if (from.isString()) {
            from = blue_graph_resolve_node_label_reference(blue_graph, from);
        }
        if (to.isString()) {
            to = blue_graph_resolve_node_label_reference(blue_graph, to);
        }
        edge = (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw167$FROM, from, (SubLObject)blue_grapher_utilities.$kw168$TO, to, (SubLObject)blue_grapher_utilities.$kw12$TYPE, type, (SubLObject)blue_grapher_utilities.$kw166$LABEL, label);
        edges = (SubLObject)ConsesLow.cons(edge, edges);
        _csetf_blue_graph_edges(blue_graph, edges);
        if (blue_grapher_utilities.NIL == string_utilities.empty_string_p(label)) {
            dictionary_utilities.dictionary_push(edge_label_map, label, edge);
        }
        return blue_graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 52481L)
    public static SubLObject blue_graph_next_id(final SubLObject blue_graph) {
        final SubLObject isg = blue_graph_isg(blue_graph);
        return integer_sequence_generator.integer_sequence_generator_next(isg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 52675L)
    public static SubLObject blue_graph_generate_description(final SubLObject blue_graph) {
        return (SubLObject)ConsesLow.listS(blue_graph_generate_definition_description(blue_graph), blue_graph_generate_option_description(blue_graph), ConsesLow.append(blue_graph_generate_node_description(blue_graph), blue_graph_generate_edge_description(blue_graph), (SubLObject)blue_grapher_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 53037L)
    public static SubLObject blue_graph_generate_definition_description(final SubLObject blue_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject definitions = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(blue_graph_node_definitions(blue_graph))); blue_grapher_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject definition = thread.secondMultipleValue();
            thread.resetMultipleValues();
            definitions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)blue_grapher_utilities.$kw169$NODE_TYPE, type, ConsesLow.append(definition, (SubLObject)blue_grapher_utilities.NIL)), definitions);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(blue_graph_edge_definitions(blue_graph))); blue_grapher_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject definition = thread.secondMultipleValue();
            thread.resetMultipleValues();
            definitions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)blue_grapher_utilities.$kw170$EDGE_TYPE, type, ConsesLow.append(definition, (SubLObject)blue_grapher_utilities.NIL)), definitions);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw171$DEFINITIONS, definitions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 53453L)
    public static SubLObject blue_graph_generate_option_description(final SubLObject blue_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject options = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(blue_graph_options(blue_graph))); blue_grapher_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject option = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            options = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(option, value), options);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw155$OPTIONS, options);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 53686L)
    public static SubLObject blue_graph_generate_node_description(final SubLObject blue_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nodes = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(blue_graph_nodes(blue_graph))); blue_grapher_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject node = thread.secondMultipleValue();
            thread.resetMultipleValues();
            nodes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw172$NODE, node), nodes);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return nodes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 53904L)
    public static SubLObject blue_graph_generate_edge_description(final SubLObject blue_graph) {
        SubLObject edges = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject cdolist_list_var = blue_graph_edges(blue_graph);
        SubLObject edge = (SubLObject)blue_grapher_utilities.NIL;
        edge = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            edges = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw173$EDGE, edge), edges);
            cdolist_list_var = cdolist_list_var.rest();
            edge = cdolist_list_var.first();
        }
        return edges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 54095L)
    public static SubLObject bbf_rtv_from_inference(final SubLObject arg_plist) {
        final SubLObject params = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw81$PARAMS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject formula = conses_high.getf(params, (SubLObject)blue_grapher_utilities.$kw176$FORMULA, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject problem_store_id = conses_high.getf(params, (SubLObject)blue_grapher_utilities.$kw177$PROBLEM_STORE_ID, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject inference_id = conses_high.getf(params, (SubLObject)blue_grapher_utilities.$kw83$INFERENCE_ID, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject rtv_clause = list_utilities.tree_find_if((SubLObject)blue_grapher_utilities.$sym178$RTV_CLAUSE_P, formula, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject rtv_preds_list = conses_high.fourth(rtv_clause);
        SubLObject all_rtv_relevant_preds_set = (SubLObject)blue_grapher_utilities.NIL;
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        final SubLObject mt = inference_datastructures_inference.inference_mt(inference);
        SubLObject bbf_edges = (SubLObject)blue_grapher_utilities.NIL;
        all_rtv_relevant_preds_set = set_utilities.construct_set_from_list(rtv_preds_list.rest(), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = rtv_preds_list;
        SubLObject each_pred = (SubLObject)blue_grapher_utilities.NIL;
        each_pred = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            set_utilities.set_add_all(genl_predicates.all_spec_preds(each_pred, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED), all_rtv_relevant_preds_set);
            cdolist_list_var = cdolist_list_var.rest();
            each_pred = cdolist_list_var.first();
        }
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (blue_grapher_utilities.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)blue_grapher_utilities.$kw179$SKIP)) {
            final SubLObject idx_$55 = idx;
            if (blue_grapher_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$55, (SubLObject)blue_grapher_utilities.$kw179$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$55);
                final SubLObject backwardP_var = (SubLObject)blue_grapher_utilities.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference_answer;
                SubLObject cdolist_list_var2;
                SubLObject proofs;
                SubLObject proof;
                SubLObject v_proof_view;
                SubLObject cdolist_list_var_$56;
                SubLObject facts_used;
                SubLObject fact;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)blue_grapher_utilities.NIL, v_iteration = (SubLObject)blue_grapher_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
                    id = ((blue_grapher_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)blue_grapher_utilities.ONE_INTEGER) : v_iteration);
                    inference_answer = Vectors.aref(vector_var, id);
                    if (blue_grapher_utilities.NIL == id_index.id_index_tombstone_p(inference_answer) || blue_grapher_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)blue_grapher_utilities.$kw179$SKIP)) {
                        if (blue_grapher_utilities.NIL != id_index.id_index_tombstone_p(inference_answer)) {
                            inference_answer = (SubLObject)blue_grapher_utilities.$kw179$SKIP;
                        }
                        proofs = (cdolist_list_var2 = pph_proof.inference_answer_get_proofs(inference_answer));
                        proof = (SubLObject)blue_grapher_utilities.NIL;
                        proof = cdolist_list_var2.first();
                        while (blue_grapher_utilities.NIL != cdolist_list_var2) {
                            v_proof_view = proof_view.construct_inference_proof_view(proof, inference_answer, mt);
                            facts_used = (cdolist_list_var_$56 = proof_view.proof_view_get_facts_used(v_proof_view));
                            fact = (SubLObject)blue_grapher_utilities.NIL;
                            fact = cdolist_list_var_$56.first();
                            while (blue_grapher_utilities.NIL != cdolist_list_var_$56) {
                                if (blue_grapher_utilities.NIL != valid_rtv_justificationP(assertions_high.assertion_formula(fact), all_rtv_relevant_preds_set)) {
                                    bbf_edges = (SubLObject)ConsesLow.cons(bbf_make_edge_from_assertion(fact), bbf_edges);
                                }
                                cdolist_list_var_$56 = cdolist_list_var_$56.rest();
                                fact = cdolist_list_var_$56.first();
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            proof = cdolist_list_var2.first();
                        }
                    }
                }
            }
            final SubLObject idx_$56 = idx;
            if (blue_grapher_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$56)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$56);
                SubLObject id2 = (SubLObject)blue_grapher_utilities.NIL;
                SubLObject inference_answer2 = (SubLObject)blue_grapher_utilities.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var3;
                        final SubLObject proofs2 = cdolist_list_var3 = pph_proof.inference_answer_get_proofs(inference_answer2);
                        SubLObject proof2 = (SubLObject)blue_grapher_utilities.NIL;
                        proof2 = cdolist_list_var3.first();
                        while (blue_grapher_utilities.NIL != cdolist_list_var3) {
                            final SubLObject v_proof_view2 = proof_view.construct_inference_proof_view(proof2, inference_answer2, mt);
                            SubLObject cdolist_list_var_$57;
                            final SubLObject facts_used2 = cdolist_list_var_$57 = proof_view.proof_view_get_facts_used(v_proof_view2);
                            SubLObject fact2 = (SubLObject)blue_grapher_utilities.NIL;
                            fact2 = cdolist_list_var_$57.first();
                            while (blue_grapher_utilities.NIL != cdolist_list_var_$57) {
                                if (blue_grapher_utilities.NIL != valid_rtv_justificationP(assertions_high.assertion_formula(fact2), all_rtv_relevant_preds_set)) {
                                    bbf_edges = (SubLObject)ConsesLow.cons(bbf_make_edge_from_assertion(fact2), bbf_edges);
                                }
                                cdolist_list_var_$57 = cdolist_list_var_$57.rest();
                                fact2 = cdolist_list_var_$57.first();
                            }
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            proof2 = cdolist_list_var3.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return bbf_make_graph((SubLObject)blue_grapher_utilities.NIL, list_utilities.hash_remove_duplicates(bbf_edges, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw39$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 55884L)
    public static SubLObject bbf_rtv_unbound(final SubLObject arg_plist) {
        final SubLObject params = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw81$PARAMS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject mt = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw39$MT, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject formula = conses_high.getf(params, (SubLObject)blue_grapher_utilities.$kw176$FORMULA, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject arg1_answers = conses_high.getf(params, (SubLObject)blue_grapher_utilities.$kw181$ARG1_ANSWERS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject arg2_answers = conses_high.getf(params, (SubLObject)blue_grapher_utilities.$kw182$ARG2_ANSWERS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject rtv_clause = list_utilities.tree_find_if((SubLObject)blue_grapher_utilities.$sym178$RTV_CLAUSE_P, formula, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject arg1_var = cycl_utilities.formula_arg1(rtv_clause, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject arg2_var = cycl_utilities.formula_arg2(rtv_clause, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject depth = cycl_utilities.formula_arg4(rtv_clause, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject preds = el_utilities.el_extensional_set_elements(cycl_utilities.formula_arg3(rtv_clause, (SubLObject)blue_grapher_utilities.UNPROVIDED));
        SubLObject new_formula = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject just_assertions = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject all_relevant_assertions = set.new_set((SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject all_rtv_relevant_preds_set = set.new_set((SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject result_links = set.new_set((SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject goal_terms = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject start_terms = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject subst_var = (SubLObject)blue_grapher_utilities.NIL;
        if (Sequences.length(arg1_answers).numG(Sequences.length(arg2_answers))) {
            goal_terms = arg1_answers;
            start_terms = arg2_answers;
            subst_var = arg1_var;
        }
        else {
            goal_terms = arg2_answers;
            start_terms = arg1_answers;
            subst_var = arg2_var;
        }
        all_rtv_relevant_preds_set = set_utilities.construct_set_from_list(preds, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = preds;
        SubLObject each_pred = (SubLObject)blue_grapher_utilities.NIL;
        each_pred = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            set_utilities.set_add_all(genl_predicates.all_spec_preds(each_pred, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED), all_rtv_relevant_preds_set);
            cdolist_list_var = cdolist_list_var.rest();
            each_pred = cdolist_list_var.first();
        }
        cdolist_list_var = start_terms;
        SubLObject fort = (SubLObject)blue_grapher_utilities.NIL;
        fort = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            new_formula = list_utilities.tree_substitute(formula, subst_var, fort);
            just_assertions = Sequences.remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_nodes_satisfying(fort, new_formula, preds, depth, mt), Symbols.symbol_function((SubLObject)blue_grapher_utilities.EQUAL), Symbols.symbol_function((SubLObject)blue_grapher_utilities.$sym183$ASSERTION_FORMULA), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
            set_utilities.set_add_all(just_assertions, all_relevant_assertions);
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        }
        all_relevant_assertions = remove_rtv_irrelevant_justifications(all_relevant_assertions, all_rtv_relevant_preds_set);
        final SubLObject set_contents_var = set.do_set_internal(all_relevant_assertions);
        SubLObject basis_object;
        SubLObject state;
        SubLObject each_ass;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)blue_grapher_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); blue_grapher_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            each_ass = set_contents.do_set_contents_next(basis_object, state);
            if (blue_grapher_utilities.NIL != set_contents.do_set_contents_element_validP(state, each_ass)) {
                set.set_add(bbf_make_edge_from_assertion(each_ass), result_links);
            }
        }
        return bbf_make_graph((SubLObject)blue_grapher_utilities.NIL, set.set_element_list(result_links), (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw39$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 57883L)
    public static SubLObject bbf_rtv_from_inference_new(final SubLObject arg_plist) {
        final SubLObject params = conses_high.getf(arg_plist, (SubLObject)blue_grapher_utilities.$kw81$PARAMS, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject formula = conses_high.getf(params, (SubLObject)blue_grapher_utilities.$kw176$FORMULA, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject answers = set_utilities.construct_set_from_list(conses_high.getf(params, (SubLObject)blue_grapher_utilities.$kw185$ANSWERS, (SubLObject)blue_grapher_utilities.UNPROVIDED), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject problem_store_id = conses_high.getf(params, (SubLObject)blue_grapher_utilities.$kw177$PROBLEM_STORE_ID, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject inference_id = conses_high.getf(params, (SubLObject)blue_grapher_utilities.$kw83$INFERENCE_ID, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject rtv_clause = list_utilities.tree_find_if((SubLObject)blue_grapher_utilities.$sym178$RTV_CLAUSE_P, formula, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject rtv_preds_list = conses_high.fourth(rtv_clause);
        SubLObject all_rtv_relevant_preds_set = (SubLObject)blue_grapher_utilities.NIL;
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        final SubLObject mt = inference_datastructures_inference.inference_mt(inference);
        SubLObject supports = (SubLObject)blue_grapher_utilities.NIL;
        SubLObject justification = (SubLObject)blue_grapher_utilities.NIL;
        final SubLObject bbf_edges = set.new_set((SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject answer_terms_set = set.new_set((SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        all_rtv_relevant_preds_set = set_utilities.construct_set_from_list(rtv_preds_list.rest(), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = rtv_preds_list;
        SubLObject each_pred = (SubLObject)blue_grapher_utilities.NIL;
        each_pred = cdolist_list_var.first();
        while (blue_grapher_utilities.NIL != cdolist_list_var) {
            set_utilities.set_add_all(genl_predicates.all_spec_preds(each_pred, mt, (SubLObject)blue_grapher_utilities.UNPROVIDED), all_rtv_relevant_preds_set);
            cdolist_list_var = cdolist_list_var.rest();
            each_pred = cdolist_list_var.first();
        }
        final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
        if (blue_grapher_utilities.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)blue_grapher_utilities.$kw179$SKIP)) {
            final SubLObject idx_$59 = idx;
            if (blue_grapher_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$59, (SubLObject)blue_grapher_utilities.$kw179$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$59);
                final SubLObject backwardP_var = (SubLObject)blue_grapher_utilities.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference_answer;
                SubLObject cdolist_list_var2;
                SubLObject inference_justify;
                SubLObject cdolist_list_var_$60;
                SubLObject support;
                SubLObject cdolist_list_var_$61;
                SubLObject each_sentence;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)blue_grapher_utilities.NIL, v_iteration = (SubLObject)blue_grapher_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)blue_grapher_utilities.ONE_INTEGER)) {
                    id = ((blue_grapher_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)blue_grapher_utilities.ONE_INTEGER) : v_iteration);
                    inference_answer = Vectors.aref(vector_var, id);
                    if (blue_grapher_utilities.NIL == id_index.id_index_tombstone_p(inference_answer) || blue_grapher_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)blue_grapher_utilities.$kw179$SKIP)) {
                        if (blue_grapher_utilities.NIL != id_index.id_index_tombstone_p(inference_answer)) {
                            inference_answer = (SubLObject)blue_grapher_utilities.$kw179$SKIP;
                        }
                        answer_terms_set = set_utilities.construct_set_from_list(Mapping.mapcar(Symbols.symbol_function((SubLObject)blue_grapher_utilities.$sym186$CDR), inference_datastructures_inference.inference_answer_bindings(inference_answer)), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                        if (blue_grapher_utilities.NIL != set.non_empty_set_p(set_utilities.set_intersection((SubLObject)ConsesLow.list(answers, answer_terms_set), (SubLObject)blue_grapher_utilities.UNPROVIDED))) {
                            cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications(inference_answer);
                            inference_justify = (SubLObject)blue_grapher_utilities.NIL;
                            inference_justify = cdolist_list_var2.first();
                            while (blue_grapher_utilities.NIL != cdolist_list_var2) {
                                supports = (cdolist_list_var_$60 = inference_datastructures_inference.inference_answer_justification_supports(inference_justify));
                                support = (SubLObject)blue_grapher_utilities.NIL;
                                support = cdolist_list_var_$60.first();
                                while (blue_grapher_utilities.NIL != cdolist_list_var_$60) {
                                    justification = (cdolist_list_var_$61 = arguments.support_justification(support));
                                    each_sentence = (SubLObject)blue_grapher_utilities.NIL;
                                    each_sentence = cdolist_list_var_$61.first();
                                    while (blue_grapher_utilities.NIL != cdolist_list_var_$61) {
                                        if (blue_grapher_utilities.NIL != assertion_handles.assertion_p(each_sentence) && blue_grapher_utilities.NIL != valid_rtv_justificationP(assertions_high.assertion_formula(each_sentence), all_rtv_relevant_preds_set)) {
                                            set.set_add(bbf_make_edge_from_assertion(each_sentence), bbf_edges);
                                        }
                                        cdolist_list_var_$61 = cdolist_list_var_$61.rest();
                                        each_sentence = cdolist_list_var_$61.first();
                                    }
                                    cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                                    support = cdolist_list_var_$60.first();
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                inference_justify = cdolist_list_var2.first();
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$60 = idx;
            if (blue_grapher_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$60)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$60);
                SubLObject id2 = (SubLObject)blue_grapher_utilities.NIL;
                SubLObject inference_answer2 = (SubLObject)blue_grapher_utilities.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference_answer2 = Hashtables.getEntryValue(cdohash_entry);
                        answer_terms_set = set_utilities.construct_set_from_list(Mapping.mapcar(Symbols.symbol_function((SubLObject)blue_grapher_utilities.$sym186$CDR), inference_datastructures_inference.inference_answer_bindings(inference_answer2)), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
                        if (blue_grapher_utilities.NIL != set.non_empty_set_p(set_utilities.set_intersection((SubLObject)ConsesLow.list(answers, answer_terms_set), (SubLObject)blue_grapher_utilities.UNPROVIDED))) {
                            SubLObject cdolist_list_var3 = inference_datastructures_inference.inference_answer_justifications(inference_answer2);
                            SubLObject inference_justify2 = (SubLObject)blue_grapher_utilities.NIL;
                            inference_justify2 = cdolist_list_var3.first();
                            while (blue_grapher_utilities.NIL != cdolist_list_var3) {
                                SubLObject cdolist_list_var_$62;
                                supports = (cdolist_list_var_$62 = inference_datastructures_inference.inference_answer_justification_supports(inference_justify2));
                                SubLObject support2 = (SubLObject)blue_grapher_utilities.NIL;
                                support2 = cdolist_list_var_$62.first();
                                while (blue_grapher_utilities.NIL != cdolist_list_var_$62) {
                                    SubLObject cdolist_list_var_$63;
                                    justification = (cdolist_list_var_$63 = arguments.support_justification(support2));
                                    SubLObject each_sentence2 = (SubLObject)blue_grapher_utilities.NIL;
                                    each_sentence2 = cdolist_list_var_$63.first();
                                    while (blue_grapher_utilities.NIL != cdolist_list_var_$63) {
                                        if (blue_grapher_utilities.NIL != assertion_handles.assertion_p(each_sentence2) && blue_grapher_utilities.NIL != valid_rtv_justificationP(assertions_high.assertion_formula(each_sentence2), all_rtv_relevant_preds_set)) {
                                            set.set_add(bbf_make_edge_from_assertion(each_sentence2), bbf_edges);
                                        }
                                        cdolist_list_var_$63 = cdolist_list_var_$63.rest();
                                        each_sentence2 = cdolist_list_var_$63.first();
                                    }
                                    cdolist_list_var_$62 = cdolist_list_var_$62.rest();
                                    support2 = cdolist_list_var_$62.first();
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                inference_justify2 = cdolist_list_var3.first();
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return bbf_make_graph((SubLObject)blue_grapher_utilities.NIL, list_utilities.hash_remove_duplicates(set.set_element_list(bbf_edges), (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)blue_grapher_utilities.$kw39$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 59637L)
    public static SubLObject valid_rtv_justificationP(final SubLObject formula, final SubLObject rtv_preds_set) {
        if (blue_grapher_utilities.NIL != set.set_memberP(cycl_utilities.formula_arg0(formula), rtv_preds_set)) {
            return (SubLObject)blue_grapher_utilities.T;
        }
        return (SubLObject)blue_grapher_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/blue-grapher-utilities.lisp", position = 59796L)
    public static SubLObject remove_rtv_irrelevant_justifications(final SubLObject all_relevant_assertions, final SubLObject rtv_preds_set) {
        final SubLObject rtv_filtered_set = set.new_set((SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(all_relevant_assertions);
        SubLObject basis_object;
        SubLObject state;
        SubLObject each_ass;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)blue_grapher_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); blue_grapher_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            each_ass = set_contents.do_set_contents_next(basis_object, state);
            if (blue_grapher_utilities.NIL != set_contents.do_set_contents_element_validP(state, each_ass) && blue_grapher_utilities.NIL != valid_rtv_justificationP(assertions_high.assertion_formula(each_ass), rtv_preds_set)) {
                set.set_add(each_ass, rtv_filtered_set);
            }
        }
        return rtv_filtered_set;
    }
    
    public static SubLObject declare_blue_grapher_utilities_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.blue_grapher_utilities", "define_blue_filter_fn", "DEFINE-BLUE-FILTER-FN");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_filter_fns", "BLUE-FILTER-FNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "get_blue_filter_fn_data", "GET-BLUE-FILTER-FN-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_filter_fn_p", "BLUE-FILTER-FN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "get_blue_filter_fn_cost", "GET-BLUE-FILTER-FN-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "get_blue_filter_fn_strength", "GET-BLUE-FILTER-FN-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "get_blue_filter_fn_type", "GET-BLUE-FILTER-FN-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "apply_blue_filter_fn", "APPLY-BLUE-FILTER-FN", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_filter_fns_sorted", "BLUE-FILTER-FNS-SORTED", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_apply_filter_fns", "BLUE-APPLY-FILTER-FNS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_filter_fn_keys", "BLUE-FILTER-FN-KEYS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_filter_fn_by_key", "BLUE-FILTER-FN-BY-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bff_arbitrary_unions", "BFF-ARBITRARY-UNIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bff_cyc_kb_subset_collections", "BFF-CYC-KB-SUBSET-COLLECTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bff_most_general_5", "BFF-MOST-GENERAL-5", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bff_most_general_10", "BFF-MOST-GENERAL-10", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bff_most_general_20", "BFF-MOST-GENERAL-20", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.blue_grapher_utilities", "define_blue_builder_fn", "DEFINE-BLUE-BUILDER-FN");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "get_blue_builder_fn_data", "GET-BLUE-BUILDER-FN-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_builder_fn_p", "BLUE-BUILDER-FN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_builder", "BLUE-BUILDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_builder_fn_keys", "BLUE-BUILDER-FN-KEYS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_builder_fn_by_key", "BLUE-BUILDER-FN-BY-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "get_blue_builder_fn_def_value", "GET-BLUE-BUILDER-FN-DEF-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_forward_true", "BBF-FORWARD-TRUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_forward_true_internal", "BBF-FORWARD-TRUE-INTERNAL", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_backward_true", "BBF-BACKWARD-TRUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_backward_true_internal", "BBF-BACKWARD-TRUE-INTERNAL", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_min_forward_true", "BBF-MIN-FORWARD-TRUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_min_forward_true_internal", "BBF-MIN-FORWARD-TRUE-INTERNAL", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_min_backward_true", "BBF-MIN-BACKWARD-TRUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_min_backward_true_internal", "BBF-MIN-BACKWARD-TRUE-INTERNAL", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_min_ceilings_forward_true", "BBF-MIN-CEILINGS-FORWARD-TRUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_min_ceilings_forward_true_internal", "BBF-MIN-CEILINGS-FORWARD-TRUE-INTERNAL", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_min_forward_and_backward_true", "BBF-MIN-FORWARD-AND-BACKWARD-TRUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_min_forward_and_backward_true_internal", "BBF-MIN-FORWARD-AND-BACKWARD-TRUE-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_min_forward_and_backward_true_internal_internal", "BBF-MIN-FORWARD-AND-BACKWARD-TRUE-INTERNAL-INTERNAL", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_script", "BBF-SCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_inference_answers", "BBF-INFERENCE-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "determine_edge_templates_for_inference", "DETERMINE-EDGE-TEMPLATES-FOR-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "html_determine_edge_templates_for_inference", "HTML-DETERMINE-EDGE-TEMPLATES-FOR-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_inference", "BBF-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_rule", "BBF-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_literal_to_edge", "BLUE-LITERAL-TO-EDGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "make_inference_hl_to_el_var_list", "MAKE-INFERENCE-HL-TO-EL-VAR-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "make_assertion_hl_to_el_var_list", "MAKE-ASSERTION-HL-TO-EL-VAR-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_make_edge_from_assertion", "BBF-MAKE-EDGE-FROM-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_make_graph", "BBF-MAKE-GRAPH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_make_edge", "BBF-MAKE-EDGE", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_make_edge_with_nodes", "BBF-MAKE-EDGE-WITH-NODES", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_make_node", "BBF-MAKE-NODE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_event_dispatcher_runningP", "BLUE-EVENT-DISPATCHER-RUNNING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "ensure_blue_event_dispatcher_running", "ENSURE-BLUE-EVENT-DISPATCHER-RUNNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "register_listener_with_blue_event_dispatcher", "REGISTER-LISTENER-WITH-BLUE-EVENT-DISPATCHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "deregister_listener_with_blue_event_dispatcher", "DEREGISTER-LISTENER-WITH-BLUE-EVENT-DISPATCHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "stop_blue_event_dispatcher", "STOP-BLUE-EVENT-DISPATCHER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "start_blue_event_dispatcher", "START-BLUE-EVENT-DISPATCHER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_event", "BLUE-EVENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_fetch_event", "BLUE-FETCH-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_fetch_uia_blue_event", "BLUE-FETCH-UIA-BLUE-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_current_message_mailbox_suite", "BLUE-CURRENT-MESSAGE-MAILBOX-SUITE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_ensure_blue_event_address", "BLUE-ENSURE-BLUE-EVENT-ADDRESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "map_blue_event_to_mailbox", "MAP-BLUE-EVENT-TO-MAILBOX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_map_event_to_blue_event", "BLUE-MAP-EVENT-TO-BLUE-EVENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_print_function_trampoline", "BLUE-GRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_p", "BLUE-GRAPH-P", 1, 0, false);
        new $blue_graph_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_isg", "BLUE-GRAPH-ISG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_node_label_map", "BLUE-GRAPH-NODE-LABEL-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_nodes", "BLUE-GRAPH-NODES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_edge_label_map", "BLUE-GRAPH-EDGE-LABEL-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_edges", "BLUE-GRAPH-EDGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_node_definitions", "BLUE-GRAPH-NODE-DEFINITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_edge_definitions", "BLUE-GRAPH-EDGE-DEFINITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_options", "BLUE-GRAPH-OPTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "_csetf_blue_graph_isg", "_CSETF-BLUE-GRAPH-ISG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "_csetf_blue_graph_node_label_map", "_CSETF-BLUE-GRAPH-NODE-LABEL-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "_csetf_blue_graph_nodes", "_CSETF-BLUE-GRAPH-NODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "_csetf_blue_graph_edge_label_map", "_CSETF-BLUE-GRAPH-EDGE-LABEL-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "_csetf_blue_graph_edges", "_CSETF-BLUE-GRAPH-EDGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "_csetf_blue_graph_node_definitions", "_CSETF-BLUE-GRAPH-NODE-DEFINITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "_csetf_blue_graph_edge_definitions", "_CSETF-BLUE-GRAPH-EDGE-DEFINITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "_csetf_blue_graph_options", "_CSETF-BLUE-GRAPH-OPTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "make_blue_graph", "MAKE-BLUE-GRAPH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "visit_defstruct_blue_graph", "VISIT-DEFSTRUCT-BLUE-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "visit_defstruct_object_blue_graph_method", "VISIT-DEFSTRUCT-OBJECT-BLUE-GRAPH-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "new_blue_graph", "NEW-BLUE-GRAPH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_add_node_type", "BLUE-GRAPH-ADD-NODE-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_add_edge_type", "BLUE-GRAPH-ADD-EDGE-TYPE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_add_option", "BLUE-GRAPH-ADD-OPTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_add_node", "BLUE-GRAPH-ADD-NODE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_node_p", "BLUE-GRAPH-NODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_maybe_add_node", "BLUE-GRAPH-MAYBE-ADD-NODE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_node_get_id", "BLUE-GRAPH-NODE-GET-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_node_get_type", "BLUE-GRAPH-NODE-GET-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_node_get_label", "BLUE-GRAPH-NODE-GET-LABEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_get_node", "BLUE-GRAPH-GET-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_get_node_by_label", "BLUE-GRAPH-GET-NODE-BY-LABEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_resolve_node_label_reference", "BLUE-GRAPH-RESOLVE-NODE-LABEL-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_edge_from", "BLUE-GRAPH-EDGE-FROM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_edge_to", "BLUE-GRAPH-EDGE-TO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_edge_get_type", "BLUE-GRAPH-EDGE-GET-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_edge_get_label", "BLUE-GRAPH-EDGE-GET-LABEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_add_edge", "BLUE-GRAPH-ADD-EDGE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_next_id", "BLUE-GRAPH-NEXT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_generate_description", "BLUE-GRAPH-GENERATE-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_generate_definition_description", "BLUE-GRAPH-GENERATE-DEFINITION-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_generate_option_description", "BLUE-GRAPH-GENERATE-OPTION-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_generate_node_description", "BLUE-GRAPH-GENERATE-NODE-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "blue_graph_generate_edge_description", "BLUE-GRAPH-GENERATE-EDGE-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_rtv_from_inference", "BBF-RTV-FROM-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_rtv_unbound", "BBF-RTV-UNBOUND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "bbf_rtv_from_inference_new", "BBF-RTV-FROM-INFERENCE-NEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "valid_rtv_justificationP", "VALID-RTV-JUSTIFICATION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.blue_grapher_utilities", "remove_rtv_irrelevant_justifications", "REMOVE-RTV-IRRELEVANT-JUSTIFICATIONS", 2, 0, false);
        return (SubLObject)blue_grapher_utilities.NIL;
    }
    
    public static SubLObject init_blue_grapher_utilities_file() {
        blue_grapher_utilities.$blue_filter_fns$ = SubLFiles.deflexical("*BLUE-FILTER-FNS*", maybeDefault((SubLObject)blue_grapher_utilities.$sym0$_BLUE_FILTER_FNS_, blue_grapher_utilities.$blue_filter_fns$, ()->(Hashtables.make_hash_table((SubLObject)blue_grapher_utilities.SIXTEEN_INTEGER, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED))));
        blue_grapher_utilities.$default_blue_filter_fn_cost$ = SubLFiles.deflexical("*DEFAULT-BLUE-FILTER-FN-COST*", (SubLObject)(maybeDefault((SubLObject)blue_grapher_utilities.$sym7$_DEFAULT_BLUE_FILTER_FN_COST_, blue_grapher_utilities.$default_blue_filter_fn_cost$, blue_grapher_utilities.ZERO_INTEGER)));
        blue_grapher_utilities.$default_blue_filter_fn_strength$ = SubLFiles.deflexical("*DEFAULT-BLUE-FILTER-FN-STRENGTH*", (SubLObject)(maybeDefault((SubLObject)blue_grapher_utilities.$sym9$_DEFAULT_BLUE_FILTER_FN_STRENGTH_, blue_grapher_utilities.$default_blue_filter_fn_strength$, blue_grapher_utilities.ZERO_INTEGER)));
        blue_grapher_utilities.$default_blue_filter_fn_type$ = SubLFiles.deflexical("*DEFAULT-BLUE-FILTER-FN-TYPE*", (SubLObject)(maybeDefault((SubLObject)blue_grapher_utilities.$sym11$_DEFAULT_BLUE_FILTER_FN_TYPE_, blue_grapher_utilities.$default_blue_filter_fn_type$, blue_grapher_utilities.NIL)));
        blue_grapher_utilities.$blue_builder_fns$ = SubLFiles.deflexical("*BLUE-BUILDER-FNS*", maybeDefault((SubLObject)blue_grapher_utilities.$sym29$_BLUE_BUILDER_FNS_, blue_grapher_utilities.$blue_builder_fns$, ()->(Hashtables.make_hash_table((SubLObject)blue_grapher_utilities.SIXTEEN_INTEGER, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED))));
        blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$ = SubLFiles.deflexical("*BLUE-BUILDER-FN-TO-DEFLIST-HASH*", maybeDefault((SubLObject)blue_grapher_utilities.$sym30$_BLUE_BUILDER_FN_TO_DEFLIST_HASH_, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$, ()->(Hashtables.make_hash_table((SubLObject)blue_grapher_utilities.SIXTEEN_INTEGER, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED))));
        blue_grapher_utilities.$inference_answers_default_undetermined_relation$ = SubLFiles.deflexical("*INFERENCE-ANSWERS-DEFAULT-UNDETERMINED-RELATION*", blue_grapher_utilities.$const86$conceptuallyRelated);
        blue_grapher_utilities.$blue_event_dispatcher_lock$ = SubLFiles.deflexical("*BLUE-EVENT-DISPATCHER-LOCK*", Locks.make_lock((SubLObject)blue_grapher_utilities.$str121$BLUE_EVENT_DISPATCHER_Lock));
        blue_grapher_utilities.$blue_event_dispatcher_listeners$ = SubLFiles.deflexical("*BLUE-EVENT-DISPATCHER-LISTENERS*", (SubLObject)(maybeDefault((SubLObject)blue_grapher_utilities.$sym122$_BLUE_EVENT_DISPATCHER_LISTENERS_, blue_grapher_utilities.$blue_event_dispatcher_listeners$, blue_grapher_utilities.NIL)));
        blue_grapher_utilities.$blue_message_mailbox_suite$ = SubLFiles.defparameter("*BLUE-MESSAGE-MAILBOX-SUITE*", message_mailboxes.new_message_mailbox_suite());
        blue_grapher_utilities.$blue_event_to_blue_event_listener$ = SubLFiles.deflexical("*BLUE-EVENT-TO-BLUE-EVENT-LISTENER*", event_broker.describe_funcall_listener((SubLObject)blue_grapher_utilities.$kw120$BLUE_EVENT, (SubLObject)blue_grapher_utilities.$sym124$BLUE_MAP_EVENT_TO_BLUE_EVENT, (SubLObject)blue_grapher_utilities.UNPROVIDED, (SubLObject)blue_grapher_utilities.UNPROVIDED));
        blue_grapher_utilities.$dtp_blue_graph$ = SubLFiles.defconstant("*DTP-BLUE-GRAPH*", (SubLObject)blue_grapher_utilities.$sym125$BLUE_GRAPH);
        return (SubLObject)blue_grapher_utilities.NIL;
    }
    
    public static SubLObject setup_blue_grapher_utilities_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)blue_grapher_utilities.$sym0$_BLUE_FILTER_FNS_);
        subl_macro_promotions.declare_defglobal((SubLObject)blue_grapher_utilities.$sym7$_DEFAULT_BLUE_FILTER_FN_COST_);
        subl_macro_promotions.declare_defglobal((SubLObject)blue_grapher_utilities.$sym9$_DEFAULT_BLUE_FILTER_FN_STRENGTH_);
        subl_macro_promotions.declare_defglobal((SubLObject)blue_grapher_utilities.$sym11$_DEFAULT_BLUE_FILTER_FN_TYPE_);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym17$BFF_ARBITRARY_UNIONS, blue_grapher_utilities.$blue_filter_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list18);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym17$BFF_ARBITRARY_UNIONS);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym20$BFF_CYC_KB_SUBSET_COLLECTIONS, blue_grapher_utilities.$blue_filter_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list18);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym20$BFF_CYC_KB_SUBSET_COLLECTIONS);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym22$BFF_MOST_GENERAL_5, blue_grapher_utilities.$blue_filter_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list23);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym22$BFF_MOST_GENERAL_5);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym25$BFF_MOST_GENERAL_10, blue_grapher_utilities.$blue_filter_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list26);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym25$BFF_MOST_GENERAL_10);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym27$BFF_MOST_GENERAL_20, blue_grapher_utilities.$blue_filter_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list28);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym27$BFF_MOST_GENERAL_20);
        subl_macro_promotions.declare_defglobal((SubLObject)blue_grapher_utilities.$sym29$_BLUE_BUILDER_FNS_);
        subl_macro_promotions.declare_defglobal((SubLObject)blue_grapher_utilities.$sym30$_BLUE_BUILDER_FN_TO_DEFLIST_HASH_);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym35$BBF_FORWARD_TRUE, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.T);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym35$BBF_FORWARD_TRUE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list36);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym35$BBF_FORWARD_TRUE);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym43$BBF_BACKWARD_TRUE, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.T);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym43$BBF_BACKWARD_TRUE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list44);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym43$BBF_BACKWARD_TRUE);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym45$BBF_MIN_FORWARD_TRUE, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.T);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym45$BBF_MIN_FORWARD_TRUE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list46);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym45$BBF_MIN_FORWARD_TRUE);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym47$BBF_MIN_BACKWARD_TRUE, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.T);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym47$BBF_MIN_BACKWARD_TRUE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list48);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym47$BBF_MIN_BACKWARD_TRUE);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym49$BBF_MIN_CEILINGS_FORWARD_TRUE, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.T);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym49$BBF_MIN_CEILINGS_FORWARD_TRUE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list50);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym49$BBF_MIN_CEILINGS_FORWARD_TRUE);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym52$BBF_MIN_FORWARD_AND_BACKWARD_TRUE, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.T);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym52$BBF_MIN_FORWARD_AND_BACKWARD_TRUE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list53);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym52$BBF_MIN_FORWARD_AND_BACKWARD_TRUE);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym56$BBF_SCRIPT, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.T);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym56$BBF_SCRIPT, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list57);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym56$BBF_SCRIPT);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym79$BBF_INFERENCE_ANSWERS, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.T);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym79$BBF_INFERENCE_ANSWERS, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list80);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym79$BBF_INFERENCE_ANSWERS);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym97$BBF_INFERENCE, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.T);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym97$BBF_INFERENCE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list98);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym97$BBF_INFERENCE);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym105$BBF_RULE, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.T);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym105$BBF_RULE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list106);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym105$BBF_RULE);
        event_model.register_event_class((SubLObject)blue_grapher_utilities.$kw118$BLUE_GRAPHER_BASE_EVENT, (SubLObject)blue_grapher_utilities.$kw119$CYC_APPLICATION_EVENT, (SubLObject)blue_grapher_utilities.NIL);
        event_model.register_event_class((SubLObject)blue_grapher_utilities.$kw120$BLUE_EVENT, (SubLObject)blue_grapher_utilities.$kw118$BLUE_GRAPHER_BASE_EVENT, (SubLObject)blue_grapher_utilities.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)blue_grapher_utilities.$sym122$_BLUE_EVENT_DISPATCHER_LISTENERS_);
        access_macros.register_external_symbol((SubLObject)blue_grapher_utilities.$sym123$BLUE_FETCH_EVENT);
        register_listener_with_blue_event_dispatcher(blue_grapher_utilities.$blue_event_to_blue_event_listener$.getGlobalValue());
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), blue_grapher_utilities.$dtp_blue_graph$.getGlobalValue(), Symbols.symbol_function((SubLObject)blue_grapher_utilities.$sym132$BLUE_GRAPH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)blue_grapher_utilities.$list133);
        Structures.def_csetf((SubLObject)blue_grapher_utilities.$sym134$BLUE_GRAPH_ISG, (SubLObject)blue_grapher_utilities.$sym135$_CSETF_BLUE_GRAPH_ISG);
        Structures.def_csetf((SubLObject)blue_grapher_utilities.$sym136$BLUE_GRAPH_NODE_LABEL_MAP, (SubLObject)blue_grapher_utilities.$sym137$_CSETF_BLUE_GRAPH_NODE_LABEL_MAP);
        Structures.def_csetf((SubLObject)blue_grapher_utilities.$sym138$BLUE_GRAPH_NODES, (SubLObject)blue_grapher_utilities.$sym139$_CSETF_BLUE_GRAPH_NODES);
        Structures.def_csetf((SubLObject)blue_grapher_utilities.$sym140$BLUE_GRAPH_EDGE_LABEL_MAP, (SubLObject)blue_grapher_utilities.$sym141$_CSETF_BLUE_GRAPH_EDGE_LABEL_MAP);
        Structures.def_csetf((SubLObject)blue_grapher_utilities.$sym142$BLUE_GRAPH_EDGES, (SubLObject)blue_grapher_utilities.$sym143$_CSETF_BLUE_GRAPH_EDGES);
        Structures.def_csetf((SubLObject)blue_grapher_utilities.$sym144$BLUE_GRAPH_NODE_DEFINITIONS, (SubLObject)blue_grapher_utilities.$sym145$_CSETF_BLUE_GRAPH_NODE_DEFINITIONS);
        Structures.def_csetf((SubLObject)blue_grapher_utilities.$sym146$BLUE_GRAPH_EDGE_DEFINITIONS, (SubLObject)blue_grapher_utilities.$sym147$_CSETF_BLUE_GRAPH_EDGE_DEFINITIONS);
        Structures.def_csetf((SubLObject)blue_grapher_utilities.$sym148$BLUE_GRAPH_OPTIONS, (SubLObject)blue_grapher_utilities.$sym149$_CSETF_BLUE_GRAPH_OPTIONS);
        Equality.identity((SubLObject)blue_grapher_utilities.$sym125$BLUE_GRAPH);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), blue_grapher_utilities.$dtp_blue_graph$.getGlobalValue(), Symbols.symbol_function((SubLObject)blue_grapher_utilities.$sym161$VISIT_DEFSTRUCT_OBJECT_BLUE_GRAPH_METHOD));
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym174$BBF_RTV_FROM_INFERENCE, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.T);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym174$BBF_RTV_FROM_INFERENCE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list175);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym174$BBF_RTV_FROM_INFERENCE);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym180$BBF_RTV_UNBOUND, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.T);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym180$BBF_RTV_UNBOUND, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list175);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym180$BBF_RTV_UNBOUND);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym184$BBF_RTV_FROM_INFERENCE_NEW, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)blue_grapher_utilities.T);
        Hashtables.sethash((SubLObject)blue_grapher_utilities.$sym184$BBF_RTV_FROM_INFERENCE_NEW, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)blue_grapher_utilities.$list175);
        utilities_macros.register_api_predefined_function((SubLObject)blue_grapher_utilities.$sym184$BBF_RTV_FROM_INFERENCE_NEW);
        return (SubLObject)blue_grapher_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_blue_grapher_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_blue_grapher_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_blue_grapher_utilities_file();
    }
    
    static {
        me = (SubLFile)new blue_grapher_utilities();
        blue_grapher_utilities.$blue_filter_fns$ = null;
        blue_grapher_utilities.$default_blue_filter_fn_cost$ = null;
        blue_grapher_utilities.$default_blue_filter_fn_strength$ = null;
        blue_grapher_utilities.$default_blue_filter_fn_type$ = null;
        blue_grapher_utilities.$blue_builder_fns$ = null;
        blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$ = null;
        blue_grapher_utilities.$inference_answers_default_undetermined_relation$ = null;
        blue_grapher_utilities.$blue_event_dispatcher_lock$ = null;
        blue_grapher_utilities.$blue_event_dispatcher_listeners$ = null;
        blue_grapher_utilities.$blue_message_mailbox_suite$ = null;
        blue_grapher_utilities.$blue_event_to_blue_event_listener$ = null;
        blue_grapher_utilities.$dtp_blue_graph$ = null;
        $sym0$_BLUE_FILTER_FNS_ = SubLObjectFactory.makeSymbol("*BLUE-FILTER-FNS*");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("DEFLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym2$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym3$SETHASH = SubLObjectFactory.makeSymbol("SETHASH");
        $sym4$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym5$DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $sym6$REGISTER_API_PREDEFINED_FUNCTION = SubLObjectFactory.makeSymbol("REGISTER-API-PREDEFINED-FUNCTION");
        $sym7$_DEFAULT_BLUE_FILTER_FN_COST_ = SubLObjectFactory.makeSymbol("*DEFAULT-BLUE-FILTER-FN-COST*");
        $kw8$COST = SubLObjectFactory.makeKeyword("COST");
        $sym9$_DEFAULT_BLUE_FILTER_FN_STRENGTH_ = SubLObjectFactory.makeSymbol("*DEFAULT-BLUE-FILTER-FN-STRENGTH*");
        $kw10$STRENGTH = SubLObjectFactory.makeKeyword("STRENGTH");
        $sym11$_DEFAULT_BLUE_FILTER_FN_TYPE_ = SubLObjectFactory.makeSymbol("*DEFAULT-BLUE-FILTER-FN-TYPE*");
        $kw12$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $str13$APPLY_BLUE_FILTER_FN___A_is_not_a = SubLObjectFactory.makeString("APPLY-BLUE-FILTER-FN: ~A is not a blue-filter-fn-p");
        $sym14$_ = SubLObjectFactory.makeSymbol("<");
        $sym15$GET_BLUE_FILTER_FN_STRENGTH = SubLObjectFactory.makeSymbol("GET-BLUE-FILTER-FN-STRENGTH");
        $sym16$MAKE_KEYWORD = SubLObjectFactory.makeSymbol("MAKE-KEYWORD");
        $sym17$BFF_ARBITRARY_UNIONS = SubLObjectFactory.makeSymbol("BFF-ARBITRARY-UNIONS");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)blue_grapher_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)blue_grapher_utilities.TEN_INTEGER);
        $const19$ArbitraryUnion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArbitraryUnion"));
        $sym20$BFF_CYC_KB_SUBSET_COLLECTIONS = SubLObjectFactory.makeSymbol("BFF-CYC-KB-SUBSET-COLLECTIONS");
        $const21$CycKBSubsetCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycKBSubsetCollection"));
        $sym22$BFF_MOST_GENERAL_5 = SubLObjectFactory.makeSymbol("BFF-MOST-GENERAL-5");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)blue_grapher_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)SubLObjectFactory.makeInteger(500), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("POST-MINIMIZATION"));
        $sym24$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE>");
        $sym25$BFF_MOST_GENERAL_10 = SubLObjectFactory.makeSymbol("BFF-MOST-GENERAL-10");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)blue_grapher_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)SubLObjectFactory.makeInteger(1000), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("POST-MINIMIZATION"));
        $sym27$BFF_MOST_GENERAL_20 = SubLObjectFactory.makeSymbol("BFF-MOST-GENERAL-20");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)blue_grapher_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)SubLObjectFactory.makeInteger(2000), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("POST-MINIMIZATION"));
        $sym29$_BLUE_BUILDER_FNS_ = SubLObjectFactory.makeSymbol("*BLUE-BUILDER-FNS*");
        $sym30$_BLUE_BUILDER_FN_TO_DEFLIST_HASH_ = SubLObjectFactory.makeSymbol("*BLUE-BUILDER-FN-TO-DEFLIST-HASH*");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*BLUE-BUILDER-FNS*"), (SubLObject)blue_grapher_utilities.T);
        $str32$BLUE_BUILDER___A_is_not_a_blue_bu = SubLObjectFactory.makeString("BLUE-BUILDER: ~A is not a blue-builder-fn-p");
        $sym33$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym34$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $sym35$BBF_FORWARD_TRUE = SubLObjectFactory.makeSymbol("BBF-FORWARD-TRUE");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show forward edges from FORTS (nodes) through PREDS (edges) in MT to DEPTH.  (Forts failing FILTER-FNS are not shown.)"));
        $kw37$PREDS = SubLObjectFactory.makeKeyword("PREDS");
        $kw38$FORTS = SubLObjectFactory.makeKeyword("FORTS");
        $kw39$MT = SubLObjectFactory.makeKeyword("MT");
        $kw40$FILTER_FNS = SubLObjectFactory.makeKeyword("FILTER-FNS");
        $kw41$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw42$POST_MINIMIZATION = SubLObjectFactory.makeKeyword("POST-MINIMIZATION");
        $sym43$BBF_BACKWARD_TRUE = SubLObjectFactory.makeSymbol("BBF-BACKWARD-TRUE");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show backward edges from FORTS (nodes) through PREDS (edges) in MT to DEPTH.  (Forts failing FILTER-FNS are not shown.)"));
        $sym45$BBF_MIN_FORWARD_TRUE = SubLObjectFactory.makeSymbol("BBF-MIN-FORWARD-TRUE");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show minimum forward edges from FORTS (nodes) through PREDS (edges) in MT to DEPTH.  (Forts failing FILTER-FNS are not shown.)"));
        $sym47$BBF_MIN_BACKWARD_TRUE = SubLObjectFactory.makeSymbol("BBF-MIN-BACKWARD-TRUE");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show minimum backward edges from FORTS (nodes) through PREDS (edges) in MT to DEPTH.  (Forts failing FILTER-FNS are not shown.)"));
        $sym49$BBF_MIN_CEILINGS_FORWARD_TRUE = SubLObjectFactory.makeSymbol("BBF-MIN-CEILINGS-FORWARD-TRUE");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show the minimal ceilings of all forward edges from FORTS (nodes) through PREDS (edges) in MT and iterate DEPTH times.  (Forts failing FILTER-FNS are not shown.) (EXPERIMENTAL)"));
        $const51$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $sym52$BBF_MIN_FORWARD_AND_BACKWARD_TRUE = SubLObjectFactory.makeSymbol("BBF-MIN-FORWARD-AND-BACKWARD-TRUE");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show minimum forward and backward edges from FORTS (nodes) through PREDS (edges) in MT to DEPTH.  (Forts failing FILTER-FNS are not shown.)  (Note that this is *expensive* for higher depths) (EXPERIMENTAL)"));
        $int54$32 = SubLObjectFactory.makeInteger(32);
        $sym55$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $sym56$BBF_SCRIPT = SubLObjectFactory.makeSymbol("BBF-SCRIPT");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Create a graph representation of a script (a spec of #$Situation) that shows the temporal ordering of scenes and the actors and roles involved in each scene.  FORTS must be a singleton containing the script term."));
        $const58$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $const59$Situation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Situation"));
        $list60 = ConsesLow.list((SubLObject)blue_grapher_utilities.TWO_INTEGER, (SubLObject)blue_grapher_utilities.THREE_INTEGER);
        $sym61$TERNARY_PREDICATE_ = SubLObjectFactory.makeSymbol("TERNARY-PREDICATE?");
        $const62$QuasiTemporalSubSituationTypesPre = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuasiTemporalSubSituationTypesPredicate"));
        $const63$SomethingExisting = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomethingExisting"));
        $kw64$ACTOR = SubLObjectFactory.makeKeyword("ACTOR");
        $kw65$ROLE = SubLObjectFactory.makeKeyword("ROLE");
        $kw66$SCENE = SubLObjectFactory.makeKeyword("SCENE");
        $kw67$ORIGINAL_PREDICATE = SubLObjectFactory.makeKeyword("ORIGINAL-PREDICATE");
        $list68 = ConsesLow.list((SubLObject)blue_grapher_utilities.TWO_INTEGER, (SubLObject)blue_grapher_utilities.THREE_INTEGER, (SubLObject)blue_grapher_utilities.FOUR_INTEGER);
        $const69$SituationTypeRelation_BasicActorT = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SituationTypeRelation-BasicActorTypesAndRolesForSubSitTypes"));
        $const70$individualPlaysRoleInSubSituation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("individualPlaysRoleInSubSituationType"));
        $const71$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $const72$SituationTypeRelation_SitTypeToSu = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SituationTypeRelation-SitTypeToSubSitTypeBasic"));
        $list73 = ConsesLow.list((SubLObject)blue_grapher_utilities.TWO_INTEGER, (SubLObject)blue_grapher_utilities.THREE_INTEGER, (SubLObject)blue_grapher_utilities.FOUR_INTEGER, (SubLObject)blue_grapher_utilities.FIVE_INTEGER, (SubLObject)blue_grapher_utilities.SIX_INTEGER);
        $const74$GraphicallyEditableRoleMappingPre = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GraphicallyEditableRoleMappingPredicate"));
        $kw75$HEAD = SubLObjectFactory.makeKeyword("HEAD");
        $kw76$TAIL = SubLObjectFactory.makeKeyword("TAIL");
        $kw77$RELATION = SubLObjectFactory.makeKeyword("RELATION");
        $const78$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym79$BBF_INFERENCE_ANSWERS = SubLObjectFactory.makeSymbol("BBF-INFERENCE-ANSWERS");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Graph the results of an inference by graphing the GAFs the result when filling in the bindings back into the query."));
        $kw81$PARAMS = SubLObjectFactory.makeKeyword("PARAMS");
        $kw82$INFERENCE_STORE_ID = SubLObjectFactory.makeKeyword("INFERENCE-STORE-ID");
        $kw83$INFERENCE_ID = SubLObjectFactory.makeKeyword("INFERENCE-ID");
        $kw84$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw85$UNDIRECTED = SubLObjectFactory.makeKeyword("UNDIRECTED");
        $const86$conceptuallyRelated = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated"));
        $const87$arg1Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa"));
        $const88$CycLSentence_Assertible = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence-Assertible"));
        $const89$different = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different"));
        $kw90$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $str91$Query = SubLObjectFactory.makeString("Query");
        $kw92$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $str93$Edge_Templates = SubLObjectFactory.makeString("Edge Templates");
        $kw94$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str95$_____ = SubLObjectFactory.makeString(" --- ");
        $str96$______ = SubLObjectFactory.makeString(" ---> ");
        $sym97$BBF_INFERENCE = SubLObjectFactory.makeSymbol("BBF-INFERENCE");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Graph an inference query formula by taking the neg-lits and pos-lits, converting the HL vars to EL, then treating them as edges."));
        $kw99$STORE_SUID = SubLObjectFactory.makeKeyword("STORE-SUID");
        $kw100$INFERENCE_SUID = SubLObjectFactory.makeKeyword("INFERENCE-SUID");
        $str101$Inference_not_found_ = SubLObjectFactory.makeString("Inference not found.");
        $kw102$NEG = SubLObjectFactory.makeKeyword("NEG");
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $kw104$POS = SubLObjectFactory.makeKeyword("POS");
        $sym105$BBF_RULE = SubLObjectFactory.makeSymbol("BBF-RULE");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Graph a rule by taking the neg-lits and pos-lits, converting the HL vars to EL, then treating them as edges."));
        $kw107$ASSERTIONS = SubLObjectFactory.makeKeyword("ASSERTIONS");
        $list108 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("EL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VAR"));
        $sym109$INTERN_EL_VAR = SubLObjectFactory.makeSymbol("INTERN-EL-VAR");
        $kw110$NODES = SubLObjectFactory.makeKeyword("NODES");
        $kw111$EDGES = SubLObjectFactory.makeKeyword("EDGES");
        $kw112$PROPERTIES = SubLObjectFactory.makeKeyword("PROPERTIES");
        $kw113$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw114$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw115$TRUE_ = SubLObjectFactory.makeKeyword("TRUE?");
        $kw116$ASSERTED_ = SubLObjectFactory.makeKeyword("ASSERTED?");
        $kw117$CORE = SubLObjectFactory.makeKeyword("CORE");
        $kw118$BLUE_GRAPHER_BASE_EVENT = SubLObjectFactory.makeKeyword("BLUE-GRAPHER-BASE-EVENT");
        $kw119$CYC_APPLICATION_EVENT = SubLObjectFactory.makeKeyword("CYC-APPLICATION-EVENT");
        $kw120$BLUE_EVENT = SubLObjectFactory.makeKeyword("BLUE-EVENT");
        $str121$BLUE_EVENT_DISPATCHER_Lock = SubLObjectFactory.makeString("BLUE-EVENT-DISPATCHER Lock");
        $sym122$_BLUE_EVENT_DISPATCHER_LISTENERS_ = SubLObjectFactory.makeSymbol("*BLUE-EVENT-DISPATCHER-LISTENERS*");
        $sym123$BLUE_FETCH_EVENT = SubLObjectFactory.makeSymbol("BLUE-FETCH-EVENT");
        $sym124$BLUE_MAP_EVENT_TO_BLUE_EVENT = SubLObjectFactory.makeSymbol("BLUE-MAP-EVENT-TO-BLUE-EVENT");
        $sym125$BLUE_GRAPH = SubLObjectFactory.makeSymbol("BLUE-GRAPH");
        $sym126$BLUE_GRAPH_P = SubLObjectFactory.makeSymbol("BLUE-GRAPH-P");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISG"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-LABEL-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE-LABEL-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-DEFINITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("EDGE-DEFINITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONS"));
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISG"), (SubLObject)SubLObjectFactory.makeKeyword("NODE-LABEL-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("NODES"), (SubLObject)SubLObjectFactory.makeKeyword("EDGE-LABEL-MAP"), (SubLObject)SubLObjectFactory.makeKeyword("EDGES"), (SubLObject)SubLObjectFactory.makeKeyword("NODE-DEFINITIONS"), (SubLObject)SubLObjectFactory.makeKeyword("EDGE-DEFINITIONS"), (SubLObject)SubLObjectFactory.makeKeyword("OPTIONS"));
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BLUE-GRAPH-ISG"), (SubLObject)SubLObjectFactory.makeSymbol("BLUE-GRAPH-NODE-LABEL-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("BLUE-GRAPH-NODES"), (SubLObject)SubLObjectFactory.makeSymbol("BLUE-GRAPH-EDGE-LABEL-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("BLUE-GRAPH-EDGES"), (SubLObject)SubLObjectFactory.makeSymbol("BLUE-GRAPH-NODE-DEFINITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("BLUE-GRAPH-EDGE-DEFINITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("BLUE-GRAPH-OPTIONS"));
        $list130 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-ISG"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-NODE-LABEL-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-NODES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-EDGE-LABEL-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-EDGES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-NODE-DEFINITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-EDGE-DEFINITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-OPTIONS"));
        $sym131$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym132$BLUE_GRAPH_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("BLUE-GRAPH-PRINT-FUNCTION-TRAMPOLINE");
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("BLUE-GRAPH-P"));
        $sym134$BLUE_GRAPH_ISG = SubLObjectFactory.makeSymbol("BLUE-GRAPH-ISG");
        $sym135$_CSETF_BLUE_GRAPH_ISG = SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-ISG");
        $sym136$BLUE_GRAPH_NODE_LABEL_MAP = SubLObjectFactory.makeSymbol("BLUE-GRAPH-NODE-LABEL-MAP");
        $sym137$_CSETF_BLUE_GRAPH_NODE_LABEL_MAP = SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-NODE-LABEL-MAP");
        $sym138$BLUE_GRAPH_NODES = SubLObjectFactory.makeSymbol("BLUE-GRAPH-NODES");
        $sym139$_CSETF_BLUE_GRAPH_NODES = SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-NODES");
        $sym140$BLUE_GRAPH_EDGE_LABEL_MAP = SubLObjectFactory.makeSymbol("BLUE-GRAPH-EDGE-LABEL-MAP");
        $sym141$_CSETF_BLUE_GRAPH_EDGE_LABEL_MAP = SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-EDGE-LABEL-MAP");
        $sym142$BLUE_GRAPH_EDGES = SubLObjectFactory.makeSymbol("BLUE-GRAPH-EDGES");
        $sym143$_CSETF_BLUE_GRAPH_EDGES = SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-EDGES");
        $sym144$BLUE_GRAPH_NODE_DEFINITIONS = SubLObjectFactory.makeSymbol("BLUE-GRAPH-NODE-DEFINITIONS");
        $sym145$_CSETF_BLUE_GRAPH_NODE_DEFINITIONS = SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-NODE-DEFINITIONS");
        $sym146$BLUE_GRAPH_EDGE_DEFINITIONS = SubLObjectFactory.makeSymbol("BLUE-GRAPH-EDGE-DEFINITIONS");
        $sym147$_CSETF_BLUE_GRAPH_EDGE_DEFINITIONS = SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-EDGE-DEFINITIONS");
        $sym148$BLUE_GRAPH_OPTIONS = SubLObjectFactory.makeSymbol("BLUE-GRAPH-OPTIONS");
        $sym149$_CSETF_BLUE_GRAPH_OPTIONS = SubLObjectFactory.makeSymbol("_CSETF-BLUE-GRAPH-OPTIONS");
        $kw150$ISG = SubLObjectFactory.makeKeyword("ISG");
        $kw151$NODE_LABEL_MAP = SubLObjectFactory.makeKeyword("NODE-LABEL-MAP");
        $kw152$EDGE_LABEL_MAP = SubLObjectFactory.makeKeyword("EDGE-LABEL-MAP");
        $kw153$NODE_DEFINITIONS = SubLObjectFactory.makeKeyword("NODE-DEFINITIONS");
        $kw154$EDGE_DEFINITIONS = SubLObjectFactory.makeKeyword("EDGE-DEFINITIONS");
        $kw155$OPTIONS = SubLObjectFactory.makeKeyword("OPTIONS");
        $str156$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw157$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym158$MAKE_BLUE_GRAPH = SubLObjectFactory.makeSymbol("MAKE-BLUE-GRAPH");
        $kw159$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw160$END = SubLObjectFactory.makeKeyword("END");
        $sym161$VISIT_DEFSTRUCT_OBJECT_BLUE_GRAPH_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-BLUE-GRAPH-METHOD");
        $kw162$COLOR = SubLObjectFactory.makeKeyword("COLOR");
        $kw163$ORIENTATION = SubLObjectFactory.makeKeyword("ORIENTATION");
        $str164$ = SubLObjectFactory.makeString("");
        $kw165$ID = SubLObjectFactory.makeKeyword("ID");
        $kw166$LABEL = SubLObjectFactory.makeKeyword("LABEL");
        $kw167$FROM = SubLObjectFactory.makeKeyword("FROM");
        $kw168$TO = SubLObjectFactory.makeKeyword("TO");
        $kw169$NODE_TYPE = SubLObjectFactory.makeKeyword("NODE-TYPE");
        $kw170$EDGE_TYPE = SubLObjectFactory.makeKeyword("EDGE-TYPE");
        $kw171$DEFINITIONS = SubLObjectFactory.makeKeyword("DEFINITIONS");
        $kw172$NODE = SubLObjectFactory.makeKeyword("NODE");
        $kw173$EDGE = SubLObjectFactory.makeKeyword("EDGE");
        $sym174$BBF_RTV_FROM_INFERENCE = SubLObjectFactory.makeSymbol("BBF-RTV-FROM-INFERENCE");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString(""));
        $kw176$FORMULA = SubLObjectFactory.makeKeyword("FORMULA");
        $kw177$PROBLEM_STORE_ID = SubLObjectFactory.makeKeyword("PROBLEM-STORE-ID");
        $sym178$RTV_CLAUSE_P = SubLObjectFactory.makeSymbol("RTV-CLAUSE-P");
        $kw179$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym180$BBF_RTV_UNBOUND = SubLObjectFactory.makeSymbol("BBF-RTV-UNBOUND");
        $kw181$ARG1_ANSWERS = SubLObjectFactory.makeKeyword("ARG1-ANSWERS");
        $kw182$ARG2_ANSWERS = SubLObjectFactory.makeKeyword("ARG2-ANSWERS");
        $sym183$ASSERTION_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-FORMULA");
        $sym184$BBF_RTV_FROM_INFERENCE_NEW = SubLObjectFactory.makeSymbol("BBF-RTV-FROM-INFERENCE-NEW");
        $kw185$ANSWERS = SubLObjectFactory.makeKeyword("ANSWERS");
        $sym186$CDR = SubLObjectFactory.makeSymbol("CDR");
    }
    
    public static final class $blue_graph_native extends SubLStructNative
    {
        public SubLObject $isg;
        public SubLObject $node_label_map;
        public SubLObject $nodes;
        public SubLObject $edge_label_map;
        public SubLObject $edges;
        public SubLObject $node_definitions;
        public SubLObject $edge_definitions;
        public SubLObject $options;
        private static final SubLStructDeclNative structDecl;
        
        public $blue_graph_native() {
            this.$isg = (SubLObject)CommonSymbols.NIL;
            this.$node_label_map = (SubLObject)CommonSymbols.NIL;
            this.$nodes = (SubLObject)CommonSymbols.NIL;
            this.$edge_label_map = (SubLObject)CommonSymbols.NIL;
            this.$edges = (SubLObject)CommonSymbols.NIL;
            this.$node_definitions = (SubLObject)CommonSymbols.NIL;
            this.$edge_definitions = (SubLObject)CommonSymbols.NIL;
            this.$options = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$blue_graph_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$isg;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$node_label_map;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$nodes;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$edge_label_map;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$edges;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$node_definitions;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$edge_definitions;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$options;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$isg = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$node_label_map = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$nodes = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$edge_label_map = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$edges = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$node_definitions = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$edge_definitions = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$options = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$blue_graph_native.class, blue_grapher_utilities.$sym125$BLUE_GRAPH, blue_grapher_utilities.$sym126$BLUE_GRAPH_P, blue_grapher_utilities.$list127, blue_grapher_utilities.$list128, new String[] { "$isg", "$node_label_map", "$nodes", "$edge_label_map", "$edges", "$node_definitions", "$edge_definitions", "$options" }, blue_grapher_utilities.$list129, blue_grapher_utilities.$list130, blue_grapher_utilities.$sym131$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $blue_graph_p$UnaryFunction extends UnaryFunction
    {
        public $blue_graph_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("BLUE-GRAPH-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return blue_grapher_utilities.blue_graph_p(arg1);
        }
    }
}

/*

	Total time: 917 ms
	
*/