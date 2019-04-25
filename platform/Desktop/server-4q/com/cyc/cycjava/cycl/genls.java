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

public final class genls extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.genls";
    public static final String myFingerPrint = "c611f55ccab3febb0e4d67705efe4a4074b1b669d0ab39f4a005c82293097fbf";
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 30157L)
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
    
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 784L)
    public static SubLObject genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 1104L)
    public static SubLObject min_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 1317L)
    public static SubLObject nat_genls(final SubLObject naut, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLObject nart = narts_high.find_nart(naut);
        if (genls.NIL != nart_handles.nart_p(nart)) {
            return genls(nart, mt, tv);
        }
        return naut_genls(naut, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 1559L)
    public static SubLObject nat_min_genls(final SubLObject naut, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLObject nart = narts_high.find_nart(naut);
        if (genls.NIL != nart_handles.nart_p(nart)) {
            return min_genls(nart, mt, tv);
        }
        return min_cols(naut_genls(naut, mt), mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 1830L)
    public static SubLObject min_genls_of_type(final SubLObject col, final SubLObject type_col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLObject all_genls = all_genls(col, mt, tv);
        final SubLObject genls_of_type = isa.all_instances_among(type_col, all_genls, mt, tv);
        return min_cols(genls_of_type, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 2150L)
    public static SubLObject min_proper_genls_of_type(final SubLObject col, final SubLObject type_col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLObject all_genls = all_genls(col, mt, tv);
        final SubLObject genls_of_type = isa.all_instances_among(type_col, all_genls, mt, tv);
        return min_cols(Sequences.remove(col, genls_of_type, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED), mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 2517L)
    public static SubLObject naut_genls(final SubLObject naut, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return list_utilities.remove_duplicate_forts(ConsesLow.append(new SubLObject[] { kb_accessors.result_genl(cycl_utilities.nat_functor(naut), mt, (SubLObject)genls.UNPROVIDED), kb_accessors.result_genl_args(naut, mt), kb_accessors.result_inter_arg_genl(naut, mt), kb_accessors.result_inter_arg_genl_reln(naut, mt), kb_accessors.result_genl_via_arg_arg_genl(naut, mt) }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 2841L)
    public static SubLObject not_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 3032L)
    public static SubLObject max_not_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        return sbhl_search_methods.sbhl_max_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 3301L)
    public static SubLObject nat_not_genls(final SubLObject naut, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLObject nart = narts_high.find_nart(naut);
        if (genls.NIL != nart_handles.nart_p(nart)) {
            return not_genls(nart, mt, tv);
        }
        return naut_not_genls(naut, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 3522L)
    public static SubLObject nat_max_not_genls(final SubLObject nat_formula, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLObject nat = narts_high.find_nart(nat_formula);
        if (genls.NIL != nart_handles.nart_p(nat)) {
            return max_not_genls(nat, mt, tv);
        }
        return max_cols(naut_not_genls(nat, mt), mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 3793L)
    public static SubLObject naut_not_genls(final SubLObject naut, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return kb_accessors.result_genl(cycl_utilities.nat_functor(naut), mt, (SubLObject)genls.$kw9$FALSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 3940L)
    public static SubLObject specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 4130L)
    public static SubLObject leaf_colP(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(genls.NIL == sbhl_link_methods.sbhl_backward_true_link_nodes_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 4300L)
    public static SubLObject max_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        return sbhl_search_methods.sbhl_max_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 4557L)
    public static SubLObject not_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_link_methods.sbhl_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 4745L)
    public static SubLObject min_not_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        return sbhl_search_methods.sbhl_min_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 5014L)
    public static SubLObject genl_siblings(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        return sbhl_link_methods.sbhl_siblings_forward(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 5291L)
    public static SubLObject spec_siblings(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        return sbhl_link_methods.sbhl_siblings_backward(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 5556L)
    public static SubLObject all_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        if (genls.NIL == forts.fort_p(col) || genls.NIL != fort_types_interface.collectionP(col)) {
            return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv);
        }
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 5985L)
    public static SubLObject all_genls_in_any_mt(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_genls = (SubLObject)genls.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)genls.$sym20$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(genls.$const21$EverythingPSC, thread);
            all_genls = all_genls(col, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return all_genls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 6237L)
    public static SubLObject all_genls_in_mt(final SubLObject col, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_genls = (SubLObject)genls.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)genls.$sym22$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            all_genls = all_genls(col, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return all_genls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 6508L)
    public static SubLObject all_genls_in_mts(final SubLObject col, SubLObject mts) {
        if (mts == genls.UNPROVIDED) {
            mts = genl_mts.all_base_mts(mt_relevance_macros.$mt$.getDynamicValue());
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_genls = (SubLObject)genls.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)genls.$sym23$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            all_genls = all_genls(col, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return all_genls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 6814L)
    public static SubLObject nat_all_genls(final SubLObject nat_formula, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLObject nat = narts_high.find_nart(nat_formula);
        if (genls.NIL != nart_handles.nart_p(nat)) {
            return all_genls(nat, mt, tv);
        }
        return union_all_genls(nat_genls(nat_formula, mt, tv), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 7132L)
    public static SubLObject all_proper_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return Sequences.remove(col, all_genls(col, mt, tv), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 7268L)
    public static SubLObject all_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        if (genls.NIL == forts.fort_p(col) || genls.NIL != fort_types_interface.collectionP(col)) {
            return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv);
        }
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 7624L)
    public static SubLObject all_proper_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return Sequences.remove(col, all_specs(col, mt, tv), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 7760L)
    public static SubLObject all_proper_specs_in_any_mt(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)genls.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)genls.$sym20$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(genls.$const21$EverythingPSC, thread);
            result = cardinality_estimates.sort_by_generality_estimate(all_proper_specs(col, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED), (SubLObject)genls.$kw26$DESCENDING);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 8052L)
    public static SubLObject all_leaf_specs_in_all_mts(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expected_size = Numbers.integerDivide(cardinality_estimates.spec_cardinality(col), (SubLObject)genls.TWO_INTEGER);
        final SubLObject leaf_set = set.new_set(Symbols.symbol_function((SubLObject)genls.EQL), expected_size);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)genls.$sym20$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(genls.$const21$EverythingPSC, thread);
            SubLObject node_var = col;
            final SubLObject deck_type = (SubLObject)genls.$kw29$STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = (SubLObject)genls.NIL;
                    final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((genls.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((genls.NIL != tv_var) ? genls.$sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (genls.NIL != tv_var && genls.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && genls.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)genls.$kw31$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)genls.ONE_INTEGER, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)genls.$kw34$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)genls.ONE_INTEGER, (SubLObject)genls.$str35$continue_anyway, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)genls.$kw36$WARN)) {
                                Errors.warn((SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)genls.$str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)genls.$str35$continue_anyway, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genls.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), thread);
                            if (genls.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || genls.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genls.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)genls.UNPROVIDED);
                                    while (genls.NIL != node_var) {
                                        final SubLObject spec = node_var;
                                        if (genls.NIL != leaf_colP(spec, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED)) {
                                            set.set_add(spec, leaf_set);
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(genls.$const0$genls));
                                        SubLObject module_var = (SubLObject)genls.NIL;
                                        module_var = cdolist_list_var.first();
                                        while (genls.NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((genls.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(genls.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
                                                if (genls.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED));
                                                    if (genls.NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED));
                                                        if (genls.NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); genls.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (genls.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$12;
                                                                        for (iteration_state_$12 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); genls.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$12); iteration_state_$12 = dictionary_contents.do_dictionary_contents_next(iteration_state_$12)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$12);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (genls.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (genls.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)genls.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); genls.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (genls.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)genls.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)genls.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = (SubLObject)genls.NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (genls.NIL != csome_list_var) {
                                                                                            if (genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)genls.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)genls.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)genls.$str38$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$7, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$12);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$6, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)genls.FIVE_INTEGER, (SubLObject)genls.$str39$attempting_to_bind_direction_link, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                                    }
                                                }
                                                else if (genls.NIL != obsolete.cnat_p(node, (SubLObject)genls.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$14;
                                                    final SubLObject new_list = cdolist_list_var_$14 = ((genls.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED)));
                                                    SubLObject generating_fn = (SubLObject)genls.NIL;
                                                    generating_fn = cdolist_list_var_$14.first();
                                                    while (genls.NIL != cdolist_list_var_$14) {
                                                        final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (genls.NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)genls.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); genls.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (genls.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)genls.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)genls.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = (SubLObject)genls.NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (genls.NIL != csome_list_var2) {
                                                                    if (genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)genls.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)genls.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)genls.$str38$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$8, thread);
                                                        }
                                                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                                        generating_fn = cdolist_list_var_$14.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$6, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$5, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                        node_var = deck.deck_pop(recur_deck);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$8, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$5, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)genls.TWO_INTEGER, (SubLObject)genls.$str40$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED)), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$3, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genls.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return set.set_element_list(leaf_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 8389L)
    public static SubLObject all_specs_with_max(final SubLObject cycl_term, final SubLObject max) {
        assert genls.NIL != Types.integerp(max) : max;
        if (genls.NIL == fort_types_interface.collection_p(cycl_term)) {
            return (SubLObject)genls.NIL;
        }
        final SubLObject iter = kb_iterators.new_specs_iterator(cycl_term);
        SubLObject cur_term = (SubLObject)genls.NIL;
        SubLObject result = (SubLObject)genls.NIL;
        SubLObject i;
        for (i = (SubLObject)genls.NIL, i = (SubLObject)genls.ZERO_INTEGER; i.numL(max); i = Numbers.add(i, (SubLObject)genls.ONE_INTEGER)) {
            if (genls.NIL != iteration.iteration_done(iter)) {
                return result;
            }
            cur_term = iteration.iteration_next_without_values(iter, (SubLObject)genls.$kw43$INVALID_ITERATION_TERM);
            if (cur_term != genls.$kw43$INVALID_ITERATION_TERM) {
                result = (SubLObject)ConsesLow.cons(cur_term, result);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 9032L)
    public static SubLObject all_specs_in_all_mts(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)genls.$sym20$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(genls.$const21$EverythingPSC, thread);
            return all_specs(col, mt, tv);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 9141L)
    public static SubLObject count_all_specs(final SubLObject collection, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(collection, genls.$sym5$EL_FORT_P);
        SubLObject count = (SubLObject)genls.ZERO_INTEGER;
        SubLObject node_var = collection;
        final SubLObject deck_type = (SubLObject)genls.$kw29$STACK;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$17 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject tv_var = tv;
                    final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((genls.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((genls.NIL != tv_var) ? genls.$sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (genls.NIL != tv_var && genls.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && genls.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)genls.$kw31$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)genls.ONE_INTEGER, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)genls.$kw34$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)genls.ONE_INTEGER, (SubLObject)genls.$str35$continue_anyway, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)genls.$kw36$WARN)) {
                                Errors.warn((SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)genls.$str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)genls.$str35$continue_anyway, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$22 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genls.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), thread);
                            if (genls.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || genls.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$21 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genls.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)genls.UNPROVIDED);
                                    while (genls.NIL != node_var) {
                                        final SubLObject spec = node_var;
                                        count = Numbers.add(count, (SubLObject)genls.ONE_INTEGER);
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(genls.$const0$genls));
                                        SubLObject module_var = (SubLObject)genls.NIL;
                                        module_var = cdolist_list_var.first();
                                        while (genls.NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$21 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((genls.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(genls.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
                                                if (genls.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED));
                                                    if (genls.NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED));
                                                        if (genls.NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); genls.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt_$28 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (genls.NIL != mt_relevance_macros.relevant_mtP(mt_$28)) {
                                                                    final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$28, thread);
                                                                        SubLObject iteration_state_$30;
                                                                        for (iteration_state_$30 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); genls.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$30); iteration_state_$30 = dictionary_contents.do_dictionary_contents_next(iteration_state_$30)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv_$31 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$30);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (genls.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$31)) {
                                                                                final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv_$31, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (genls.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)genls.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); genls.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (genls.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)genls.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)genls.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = (SubLObject)genls.NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (genls.NIL != csome_list_var) {
                                                                                            if (genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)genls.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)genls.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)genls.$str38$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$23, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$30);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$22, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)genls.FIVE_INTEGER, (SubLObject)genls.$str39$attempting_to_bind_direction_link, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                                    }
                                                }
                                                else if (genls.NIL != obsolete.cnat_p(node, (SubLObject)genls.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$33;
                                                    final SubLObject new_list = cdolist_list_var_$33 = ((genls.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED)));
                                                    SubLObject generating_fn = (SubLObject)genls.NIL;
                                                    generating_fn = cdolist_list_var_$33.first();
                                                    while (genls.NIL != cdolist_list_var_$33) {
                                                        final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (genls.NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)genls.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); genls.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (genls.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)genls.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)genls.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = (SubLObject)genls.NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (genls.NIL != csome_list_var2) {
                                                                    if (genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)genls.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)genls.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)genls.$str38$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$24, thread);
                                                        }
                                                        cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                                                        generating_fn = cdolist_list_var_$33.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$22, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$21, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                        node_var = deck.deck_pop(recur_deck);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$23, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$21, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$20, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)genls.TWO_INTEGER, (SubLObject)genls.$str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED)), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$22, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$20, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$19, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$18, thread);
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$17, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genls.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 9506L)
    public static SubLObject count_all_specs_if(final SubLObject collection, final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)genls.ZERO_INTEGER;
        SubLObject node_var = collection;
        final SubLObject deck_type = (SubLObject)genls.$kw29$STACK;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$36 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject tv_var = tv;
                    final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((genls.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((genls.NIL != tv_var) ? genls.$sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (genls.NIL != tv_var && genls.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && genls.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)genls.$kw31$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)genls.ONE_INTEGER, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)genls.$kw34$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)genls.ONE_INTEGER, (SubLObject)genls.$str35$continue_anyway, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)genls.$kw36$WARN)) {
                                Errors.warn((SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)genls.$str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)genls.$str35$continue_anyway, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$39 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$41 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genls.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), thread);
                            if (genls.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || genls.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$40 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genls.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)genls.UNPROVIDED);
                                    while (genls.NIL != node_var) {
                                        final SubLObject spec = node_var;
                                        if (genls.NIL != Functions.funcall(pred, spec)) {
                                            count = Numbers.add(count, (SubLObject)genls.ONE_INTEGER);
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(genls.$const0$genls));
                                        SubLObject module_var = (SubLObject)genls.NIL;
                                        module_var = cdolist_list_var.first();
                                        while (genls.NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$40 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$41 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((genls.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(genls.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var);
                                                if (genls.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED));
                                                    if (genls.NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED));
                                                        if (genls.NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); genls.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt_$47 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (genls.NIL != mt_relevance_macros.relevant_mtP(mt_$47)) {
                                                                    final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$47, thread);
                                                                        SubLObject iteration_state_$49;
                                                                        for (iteration_state_$49 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); genls.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$49); iteration_state_$49 = dictionary_contents.do_dictionary_contents_next(iteration_state_$49)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv_$50 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$49);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (genls.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$50)) {
                                                                                final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv_$50, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (genls.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)genls.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); genls.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (genls.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)genls.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)genls.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = (SubLObject)genls.NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (genls.NIL != csome_list_var) {
                                                                                            if (genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)genls.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)genls.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)genls.$str38$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$42, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$49);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$41, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)genls.FIVE_INTEGER, (SubLObject)genls.$str39$attempting_to_bind_direction_link, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                                    }
                                                }
                                                else if (genls.NIL != obsolete.cnat_p(node, (SubLObject)genls.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$52;
                                                    final SubLObject new_list = cdolist_list_var_$52 = ((genls.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED)));
                                                    SubLObject generating_fn = (SubLObject)genls.NIL;
                                                    generating_fn = cdolist_list_var_$52.first();
                                                    while (genls.NIL != cdolist_list_var_$52) {
                                                        final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (genls.NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)genls.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); genls.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (genls.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)genls.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)genls.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = (SubLObject)genls.NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (genls.NIL != csome_list_var2) {
                                                                    if (genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)genls.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)genls.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)genls.$str38$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$43, thread);
                                                        }
                                                        cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                                                        generating_fn = cdolist_list_var_$52.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$41, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$40, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                        node_var = deck.deck_pop(recur_deck);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$42, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$40, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$39, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)genls.TWO_INTEGER, (SubLObject)genls.$str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED)), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$41, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$39, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$38, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$38, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$37, thread);
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$36, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genls.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 9796L)
    public static SubLObject count_all_specs_E(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)genls.ZERO_INTEGER;
        SubLObject GP = (SubLObject)genls.NIL;
        if (genls.NIL == GP) {
            SubLObject node_var = collection;
            final SubLObject deck_type = (SubLObject)genls.$kw29$STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$55 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = tv;
                        final SubLObject _prev_bind_0_$56 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$57 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((genls.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((genls.NIL != tv_var) ? genls.$sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (genls.NIL != tv_var && genls.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && genls.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)genls.$kw31$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)genls.ONE_INTEGER, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)genls.$kw34$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)genls.ONE_INTEGER, (SubLObject)genls.$str35$continue_anyway, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)genls.$kw36$WARN)) {
                                    Errors.warn((SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)genls.$str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)genls.$str35$continue_anyway, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$57 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$58 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$60 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genls.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), thread);
                                if (genls.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || genls.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$59 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$61 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genls.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)genls.UNPROVIDED);
                                        while (genls.NIL != node_var && genls.NIL == GP) {
                                            final SubLObject spec = node_var;
                                            count = Numbers.add(count, (SubLObject)genls.ONE_INTEGER);
                                            if (count.numG(num)) {
                                                GP = (SubLObject)genls.T;
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(genls.$const0$genls));
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
                                            for (rest = (SubLObject)genls.NIL, rest = accessible_modules; genls.NIL == GP && genls.NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$59 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$60 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((genls.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(genls.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (genls.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED));
                                                        if (genls.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED));
                                                            if (genls.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); genls.NIL == GP && genls.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$66 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (genls.NIL != mt_relevance_macros.relevant_mtP(mt_$66)) {
                                                                        _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$66, thread);
                                                                            for (iteration_state_$68 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); genls.NIL == GP && genls.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$68); iteration_state_$68 = dictionary_contents.do_dictionary_contents_next(iteration_state_$68)) {
                                                                                thread.resetMultipleValues();
                                                                                tv_$69 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$68);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (genls.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$69)) {
                                                                                    _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$69, thread);
                                                                                        sol = link_nodes;
                                                                                        if (genls.NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)genls.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); genls.NIL == GP && genls.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (genls.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)genls.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)genls.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            if (genls.NIL == GP) {
                                                                                                csome_list_var = sol;
                                                                                                node_vars_link_node2 = (SubLObject)genls.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (genls.NIL == GP && genls.NIL != csome_list_var) {
                                                                                                    if (genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)genls.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)genls.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)genls.$str38$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$61, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$68);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$60, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)genls.FIVE_INTEGER, (SubLObject)genls.$str39$attempting_to_bind_direction_link, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (genls.NIL != obsolete.cnat_p(node, (SubLObject)genls.UNPROVIDED)) {
                                                        new_list = ((genls.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED)));
                                                        for (rest_$71 = (SubLObject)genls.NIL, rest_$71 = new_list; genls.NIL == GP && genls.NIL != rest_$71; rest_$71 = rest_$71.rest()) {
                                                            generating_fn = rest_$71.first();
                                                            _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (genls.NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)genls.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); genls.NIL == GP && genls.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (genls.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)genls.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)genls.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    if (genls.NIL == GP) {
                                                                        csome_list_var2 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)genls.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (genls.NIL == GP && genls.NIL != csome_list_var2) {
                                                                            if (genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)genls.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)genls.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)genls.$str38$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$62, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$60, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$59, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$61, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$59, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$58, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)genls.TWO_INTEGER, (SubLObject)genls.$str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED)), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$60, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$58, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$57, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$57, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$56, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$55, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genls.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return Numbers.numE(count, num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 10124L)
    public static SubLObject count_all_specs_G(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)genls.ZERO_INTEGER;
        SubLObject GP = (SubLObject)genls.NIL;
        if (genls.NIL == GP) {
            SubLObject node_var = collection;
            final SubLObject deck_type = (SubLObject)genls.$kw29$STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$74 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = tv;
                        final SubLObject _prev_bind_0_$75 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$76 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((genls.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((genls.NIL != tv_var) ? genls.$sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (genls.NIL != tv_var && genls.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && genls.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)genls.$kw31$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)genls.ONE_INTEGER, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)genls.$kw34$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)genls.ONE_INTEGER, (SubLObject)genls.$str35$continue_anyway, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)genls.$kw36$WARN)) {
                                    Errors.warn((SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)genls.$str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)genls.$str35$continue_anyway, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$76 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$77 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$79 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genls.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), thread);
                                if (genls.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || genls.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$77 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$78 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$80 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genls.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)genls.UNPROVIDED);
                                        while (genls.NIL != node_var && genls.NIL == GP) {
                                            final SubLObject spec = node_var;
                                            count = Numbers.add(count, (SubLObject)genls.ONE_INTEGER);
                                            if (count.numG(num)) {
                                                GP = (SubLObject)genls.T;
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(genls.$const0$genls));
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
                                            for (rest = (SubLObject)genls.NIL, rest = accessible_modules; genls.NIL == GP && genls.NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$78 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$79 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((genls.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(genls.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (genls.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED));
                                                        if (genls.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED));
                                                            if (genls.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); genls.NIL == GP && genls.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$85 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (genls.NIL != mt_relevance_macros.relevant_mtP(mt_$85)) {
                                                                        _prev_bind_0_$79 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$85, thread);
                                                                            for (iteration_state_$87 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); genls.NIL == GP && genls.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$87); iteration_state_$87 = dictionary_contents.do_dictionary_contents_next(iteration_state_$87)) {
                                                                                thread.resetMultipleValues();
                                                                                tv_$88 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$87);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (genls.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$88)) {
                                                                                    _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$88, thread);
                                                                                        sol = link_nodes;
                                                                                        if (genls.NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)genls.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); genls.NIL == GP && genls.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (genls.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)genls.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)genls.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            if (genls.NIL == GP) {
                                                                                                csome_list_var = sol;
                                                                                                node_vars_link_node2 = (SubLObject)genls.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (genls.NIL == GP && genls.NIL != csome_list_var) {
                                                                                                    if (genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)genls.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)genls.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)genls.$str38$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$80, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$87);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$79, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)genls.FIVE_INTEGER, (SubLObject)genls.$str39$attempting_to_bind_direction_link, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (genls.NIL != obsolete.cnat_p(node, (SubLObject)genls.UNPROVIDED)) {
                                                        new_list = ((genls.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED)));
                                                        for (rest_$90 = (SubLObject)genls.NIL, rest_$90 = new_list; genls.NIL == GP && genls.NIL != rest_$90; rest_$90 = rest_$90.rest()) {
                                                            generating_fn = rest_$90.first();
                                                            _prev_bind_0_$81 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (genls.NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)genls.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); genls.NIL == GP && genls.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (genls.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)genls.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)genls.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    if (genls.NIL == GP) {
                                                                        csome_list_var2 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)genls.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (genls.NIL == GP && genls.NIL != csome_list_var2) {
                                                                            if (genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)genls.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)genls.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)genls.$str38$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$81, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$79, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$78, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$80, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$78, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$77, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)genls.TWO_INTEGER, (SubLObject)genls.$str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED)), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$79, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$77, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$76, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$76, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$75, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$74, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genls.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return GP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 10443L)
    public static SubLObject count_all_specs_GE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)genls.ZERO_INTEGER;
        SubLObject GEP = (SubLObject)genls.NIL;
        if (genls.NIL == GEP) {
            SubLObject node_var = collection;
            final SubLObject deck_type = (SubLObject)genls.$kw29$STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$93 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = tv;
                        final SubLObject _prev_bind_0_$94 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$95 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((genls.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((genls.NIL != tv_var) ? genls.$sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (genls.NIL != tv_var && genls.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && genls.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)genls.$kw31$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)genls.ONE_INTEGER, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)genls.$kw34$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)genls.ONE_INTEGER, (SubLObject)genls.$str35$continue_anyway, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)genls.$kw36$WARN)) {
                                    Errors.warn((SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)genls.$str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)genls.$str35$continue_anyway, (SubLObject)genls.$str32$_A_is_not_a__A, tv_var, (SubLObject)genls.$sym33$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$95 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$96 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$98 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genls.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), thread);
                                if (genls.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || genls.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$96 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$97 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$99 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genls.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)genls.UNPROVIDED);
                                        while (genls.NIL != node_var && genls.NIL == GEP) {
                                            final SubLObject spec = node_var;
                                            count = Numbers.add(count, (SubLObject)genls.ONE_INTEGER);
                                            if (count.numGE(num)) {
                                                GEP = (SubLObject)genls.T;
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(genls.$const0$genls));
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
                                            for (rest = (SubLObject)genls.NIL, rest = accessible_modules; genls.NIL == GEP && genls.NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$97 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$98 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((genls.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(genls.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (genls.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED));
                                                        if (genls.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED));
                                                            if (genls.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); genls.NIL == GEP && genls.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$104 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (genls.NIL != mt_relevance_macros.relevant_mtP(mt_$104)) {
                                                                        _prev_bind_0_$98 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$104, thread);
                                                                            for (iteration_state_$106 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); genls.NIL == GEP && genls.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$106); iteration_state_$106 = dictionary_contents.do_dictionary_contents_next(iteration_state_$106)) {
                                                                                thread.resetMultipleValues();
                                                                                tv_$107 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$106);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (genls.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$107)) {
                                                                                    _prev_bind_0_$99 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$107, thread);
                                                                                        sol = link_nodes;
                                                                                        if (genls.NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)genls.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); genls.NIL == GEP && genls.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (genls.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)genls.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)genls.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            if (genls.NIL == GEP) {
                                                                                                csome_list_var = sol;
                                                                                                node_vars_link_node2 = (SubLObject)genls.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (genls.NIL == GEP && genls.NIL != csome_list_var) {
                                                                                                    if (genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)genls.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)genls.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)genls.$str38$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$99, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$106);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$98, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)genls.FIVE_INTEGER, (SubLObject)genls.$str39$attempting_to_bind_direction_link, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (genls.NIL != obsolete.cnat_p(node, (SubLObject)genls.UNPROVIDED)) {
                                                        new_list = ((genls.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED)));
                                                        for (rest_$109 = (SubLObject)genls.NIL, rest_$109 = new_list; genls.NIL == GEP && genls.NIL != rest_$109; rest_$109 = rest_$109.rest()) {
                                                            generating_fn = rest_$109.first();
                                                            _prev_bind_0_$100 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (genls.NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)genls.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); genls.NIL == GEP && genls.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (genls.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)genls.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)genls.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    if (genls.NIL == GEP) {
                                                                        csome_list_var2 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)genls.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (genls.NIL == GEP && genls.NIL != csome_list_var2) {
                                                                            if (genls.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)genls.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)genls.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)genls.$str38$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$100, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$98, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$97, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$99, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$97, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$96, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)genls.TWO_INTEGER, (SubLObject)genls.$str40$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)genls.UNPROVIDED)), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$98, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$96, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$95, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$95, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$94, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$93, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$101 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genls.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$101, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return GEP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 10779L)
    public static SubLObject count_all_specs_L(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return Numbers.numL(count_all_specs(collection, mt, tv), num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 10978L)
    public static SubLObject count_all_specs_LE(final SubLObject collection, final SubLObject num, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return Numbers.numLE(count_all_specs(collection, mt, tv), num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 11190L)
    public static SubLObject all_genls_wrt(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(spec, genls.$sym5$EL_FORT_P);
        enforceType(genl, genls.$sym5$EL_FORT_P);
        return sbhl_search_methods.sbhl_all_forward_true_nodes_between(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), spec, genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 11578L)
    public static SubLObject union_all_genls(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(cols, genls.$sym54$LISTP);
        if (genls.NIL == cols) {
            return (SubLObject)genls.NIL;
        }
        if (genls.NIL != list_utilities.singletonP(cols)) {
            return all_genls(cols.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), cols, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 11951L)
    public static SubLObject union_min_genls_of_type(final SubLObject cols, final SubLObject type_col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLObject all_genls = union_all_genls(cols, mt, tv);
        final SubLObject genls_of_type = isa.all_instances_among(type_col, all_genls, mt, tv);
        return min_cols(genls_of_type, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 12294L)
    public static SubLObject union_all_genls_among(final SubLObject cols, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return keyhash_utilities.fast_intersection(union_all_genls(cols, mt, tv), candidates, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 12565L)
    public static SubLObject all_genl_of_someP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return conses_high.subsetp(v_genls, union_all_genls_among(specs, v_genls, mt, tv), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 12905L)
    public static SubLObject union_all_specs(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(cols, genls.$sym54$LISTP);
        if (genls.NIL == cols) {
            return (SubLObject)genls.NIL;
        }
        if (genls.NIL != list_utilities.singletonP(cols)) {
            return all_specs(cols.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), cols, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 13268L)
    public static SubLObject union_all_specs_count(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return Sequences.length(union_all_specs(cols, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 13438L)
    public static SubLObject max_cols_beneath(final SubLObject cols, final SubLObject genl, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return max_cols(all_specs_among(genl, cols, mt, (SubLObject)genls.UNPROVIDED), mt, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 13730L)
    public static SubLObject all_dependent_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        return sbhl_search_methods.sbhl_all_dependent_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 14071L)
    public static SubLObject min_genls_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return min_cols(all_genls_among(col, candidates, mt, tv), mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 14256L)
    public static SubLObject all_genls_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        enforceType(candidates, genls.$sym54$LISTP);
        if (genls.NIL == candidates) {
            return (SubLObject)genls.NIL;
        }
        if (genls.NIL == list_utilities.singletonP(candidates)) {
            return sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, candidates, mt, tv);
        }
        if (genls.NIL != genlP(col, candidates.first(), mt, tv)) {
            return candidates;
        }
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 14742L)
    public static SubLObject all_specs_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        enforceType(candidates, genls.$sym54$LISTP);
        if (genls.NIL == candidates) {
            return (SubLObject)genls.NIL;
        }
        if (genls.NIL == list_utilities.singletonP(candidates)) {
            return sbhl_search_methods.sbhl_all_backward_true_nodes_among(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, candidates, mt, tv);
        }
        if (genls.NIL != specP(col, candidates.first(), mt, tv)) {
            return candidates;
        }
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 15231L)
    public static SubLObject max_specs_among(final SubLObject col, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return max_cols(all_specs_among(col, candidates, mt, tv), mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 15402L)
    public static SubLObject all_genls_if(final SubLObject function, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(function, genls.$sym69$FUNCTION_SPEC_P);
        enforceType(col, genls.$sym5$EL_FORT_P);
        return sbhl_search_methods.sbhl_all_forward_true_nodes_if(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, function, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 15774L)
    public static SubLObject all_specs_if(final SubLObject function, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(function, genls.$sym69$FUNCTION_SPEC_P);
        enforceType(col, genls.$sym5$EL_FORT_P);
        return sbhl_search_methods.sbhl_all_backward_true_nodes_if(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, function, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 16136L)
    public static SubLObject all_genls_if_with_pruning(final SubLObject function, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_if_with_pruning(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, function, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 16482L)
    public static SubLObject all_not_genls(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 16799L)
    public static SubLObject all_not_specs(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_backward_false_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 17105L)
    public static SubLObject cols_awning(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_search_methods.sbhl_forward_true_goals_with_no_path_from_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), specs, v_genls, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 17363L)
    public static SubLObject map_all_genls(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(fn, genls.$sym69$FUNCTION_SPEC_P);
        enforceType(col, genls.$sym5$EL_FORT_P);
        sbhl_search_methods.sbhl_map_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, fn, mt, tv);
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 17673L)
    public static SubLObject map_all_specs(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(fn, genls.$sym69$FUNCTION_SPEC_P);
        enforceType(col, genls.$sym5$EL_FORT_P);
        sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, fn, mt, tv);
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 17972L)
    public static SubLObject map_union_all_genls(final SubLObject fn, final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        sbhl_search_methods.sbhl_map_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), cols, fn, mt, tv);
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 18246L)
    public static SubLObject map_all_genls_if(final SubLObject fn, final SubLObject test_fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        sbhl_search_methods.sbhl_map_all_forward_true_nodes_if(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, fn, test_fn, mt, tv);
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 18490L)
    public static SubLObject gather_all_genls(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv, SubLObject combine_fn) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        if (combine_fn == genls.UNPROVIDED) {
            combine_fn = (SubLObject)genls.NIL;
        }
        return sbhl_search_methods.sbhl_gather_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, fn, mt, tv, combine_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 18781L)
    public static SubLObject gather_all_specs(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv, SubLObject combine_fn) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        if (combine_fn == genls.UNPROVIDED) {
            combine_fn = (SubLObject)genls.NIL;
        }
        return sbhl_search_methods.sbhl_gather_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, fn, mt, tv, combine_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 19056L)
    public static SubLObject any_all_genls(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(fn, genls.$sym69$FUNCTION_SPEC_P);
        enforceType(col, genls.$sym5$EL_FORT_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, fn, mt, tv, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 19404L)
    public static SubLObject any_all_specs(final SubLObject fn, final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(fn, genls.$sym69$FUNCTION_SPEC_P);
        enforceType(col, genls.$sym5$EL_FORT_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, fn, mt, tv, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 19736L)
    public static SubLObject sample_leaf_specs(final SubLObject col, SubLObject samples, SubLObject mt, SubLObject tv) {
        if (samples == genls.UNPROVIDED) {
            samples = (SubLObject)genls.ONE_INTEGER;
        }
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_search_methods.sbhl_sample_leaf_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, samples, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 20046L)
    public static SubLObject sample_different_leaf_specs(final SubLObject dif_node, final SubLObject col, SubLObject samples, SubLObject mt, SubLObject tv) {
        if (samples == genls.UNPROVIDED) {
            samples = (SubLObject)genls.ONE_INTEGER;
        }
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_search_methods.sbhl_sample_different_leaf_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), dif_node, col, samples, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 20457L)
    public static SubLObject genlP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(spec, genls.$sym5$EL_FORT_P);
        enforceType(genl, genls.$sym5$EL_FORT_P);
        if (genls.NIL == forts.fort_p(spec) || genls.NIL != fort_types_interface.collectionP(spec)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(genls.NIL != sbhl_search_methods.sbhl_non_justifying_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), spec, genl, mt, tv) || genls.NIL != ((genls.NIL != cycl_grammar.cycl_nat_p(spec)) ? result_genl_via_pgiaP(spec, genl, mt) : genls.NIL));
        }
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 21038L)
    public static SubLObject genlsP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return genlP(spec, genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 21207L)
    public static SubLObject genl_in_mtsP(final SubLObject spec, final SubLObject genl, SubLObject mts) {
        if (mts == genls.UNPROVIDED) {
            mts = genl_mts.all_base_mts(mt_relevance_macros.$mt$.getDynamicValue());
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject genlP = (SubLObject)genls.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)genls.$sym23$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            genlP = genlP(spec, genl, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return genlP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 21497L)
    public static SubLObject genl_in_any_mtP(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)genls.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)genls.$sym20$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(genls.$const21$EverythingPSC, thread);
            result = genlP(spec, genl, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 21696L)
    public static SubLObject specP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(genl, genls.$sym5$EL_FORT_P);
        enforceType(spec, genls.$sym5$EL_FORT_P);
        return genlP(spec, genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 21970L)
    public static SubLObject nat_genlP(final SubLObject nat_formula, final SubLObject genl, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        final SubLObject nat = cycl_utilities.find_ground_naut(nat_formula);
        if (genls.NIL != nart_handles.nart_p(nat)) {
            return genlP(nat, genl, mt, (SubLObject)genls.UNPROVIDED);
        }
        return naut_genlP(nat_formula, genl, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 22285L)
    public static SubLObject naut_genlP(final SubLObject nat_formula, final SubLObject genl, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(genls.NIL != result_genl_colP(cycl_utilities.nat_functor(nat_formula), genl, mt) || genls.NIL != result_genl_arg_colP(nat_formula, genl, mt) || genls.NIL != result_genl_inter_arg_colP(nat_formula, genl, mt) || genls.NIL != result_genl_via_pgiaP(nat_formula, genl, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 22618L)
    public static SubLObject result_genl_colP(final SubLObject functor, final SubLObject collection, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return any_specP(collection, kb_accessors.result_genl(functor, mt, (SubLObject)genls.UNPROVIDED), mt, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 22795L)
    public static SubLObject result_genl_arg_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return any_specP(collection, kb_accessors.result_genl_args(nat_formula, mt), mt, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 22993L)
    public static SubLObject result_genl_inter_arg_colP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return any_specP(collection, kb_accessors.result_inter_arg_genl(nat_formula, mt), mt, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 23200L)
    public static SubLObject result_genl_via_pgiaP(final SubLObject nat_formula, final SubLObject collection, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (genls.NIL != control_vars.$pgia_activeP$.getDynamicValue(thread) && cycl_utilities.nat_functor(nat_formula).eql(cycl_utilities.nat_functor(collection))) {
            final SubLObject functor = cycl_utilities.nat_functor(collection);
            SubLObject genlP = (SubLObject)genls.T;
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts(functor, genls.$const95$preservesGenlsInArg, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
            SubLObject arg = (SubLObject)genls.NIL;
            arg = cdolist_list_var.first();
            while (genls.NIL != cdolist_list_var) {
                if (genls.NIL != genlP) {
                    genlP = genlsP(cycl_utilities.nat_arg(nat_formula, arg, (SubLObject)genls.UNPROVIDED), cycl_utilities.nat_arg(collection, arg, (SubLObject)genls.UNPROVIDED), mt, (SubLObject)genls.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
            return genlP;
        }
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 23684L)
    public static SubLObject genl_ofP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_search_methods.sbhl_inverse_relation_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), genl, spec, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 23978L)
    public static SubLObject any_genlP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(spec, genls.$sym5$EL_FORT_P);
        enforceType(v_genls, genls.$sym54$LISTP);
        if (genls.NIL == v_genls) {
            return (SubLObject)genls.NIL;
        }
        if (genls.NIL != list_utilities.singletonP(v_genls)) {
            return genlP(spec, v_genls.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), spec, v_genls, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 24470L)
    public static SubLObject any_specP(final SubLObject genl, final SubLObject specs, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(genl, genls.$sym5$EL_FORT_P);
        enforceType(specs, genls.$sym54$LISTP);
        SubLObject result = (SubLObject)genls.NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_justification_search_p$.bind((SubLObject)genls.NIL, thread);
            sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind((SubLObject)genls.NIL, thread);
            if (genls.NIL == specs) {
                result = (SubLObject)genls.NIL;
            }
            else if (genls.NIL != list_utilities.singletonP(specs)) {
                result = specP(genl, specs.first(), mt, tv);
            }
            else {
                result = sbhl_search_methods.sbhl_any_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), specs, genl, mt, tv);
            }
        }
        finally {
            sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 24996L)
    public static SubLObject all_genlP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(spec, genls.$sym5$EL_FORT_P);
        enforceType(v_genls, genls.$sym54$LISTP);
        if (genls.NIL == v_genls) {
            return (SubLObject)genls.T;
        }
        if (genls.NIL != list_utilities.singletonP(v_genls)) {
            return genlP(spec, v_genls.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_predicate_relation_with_all_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), spec, v_genls, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 25469L)
    public static SubLObject all_specP(final SubLObject genl, final SubLObject specs, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(genl, genls.$sym5$EL_FORT_P);
        enforceType(specs, genls.$sym54$LISTP);
        if (genls.NIL == specs) {
            return (SubLObject)genls.T;
        }
        if (genls.NIL != list_utilities.singletonP(specs)) {
            return specP(genl, specs.first(), mt, tv);
        }
        return sbhl_search_methods.sbhl_all_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), specs, genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 25868L)
    public static SubLObject any_genl_anyP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(specs, genls.$sym54$LISTP);
        enforceType(v_genls, genls.$sym54$LISTP);
        if (genls.NIL == specs) {
            return (SubLObject)genls.NIL;
        }
        if (genls.NIL == v_genls) {
            return (SubLObject)genls.NIL;
        }
        if (genls.NIL != list_utilities.singletonP(specs)) {
            return any_genlP(specs.first(), v_genls, mt, tv);
        }
        return sbhl_search_methods.sbhl_predicate_relation_between_any_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), specs, v_genls, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 26357L)
    public static SubLObject any_genl_allP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(specs, genls.$sym54$LISTP);
        enforceType(v_genls, genls.$sym54$LISTP);
        return sbhl_search_methods.sbhl_any_predicate_relation_with_all_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), specs, v_genls, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 26709L)
    public static SubLObject all_spec_anyP(final SubLObject specs, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(specs, genls.$sym54$LISTP);
        enforceType(v_genls, genls.$sym54$LISTP);
        return sbhl_search_methods.sbhl_all_with_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), specs, v_genls, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 27078L)
    public static SubLObject not_genlsP(final SubLObject col, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return not_genlP(col, not_genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 27489L)
    public static SubLObject not_genlP(final SubLObject col, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        enforceType(not_genl, genls.$sym5$EL_FORT_P);
        if (genls.NIL != genlP(col, not_genl, mt, sbhl_search_vars.sbhl_opposite_or_nil_tv(tv))) {
            return (SubLObject)genls.NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, not_genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 27882L)
    public static SubLObject argue_not_genlP(final SubLObject col, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, not_genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 28183L)
    public static SubLObject all_not_specP(final SubLObject col, final SubLObject not_specs, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        enforceType(not_specs, genls.$sym54$LISTP);
        if (genls.NIL == not_specs) {
            return (SubLObject)genls.T;
        }
        if (genls.NIL != list_utilities.singletonP(not_specs)) {
            return not_genlP(not_specs.first(), col, mt, tv);
        }
        return sbhl_search_implied_relations.sbhl_all_with_implied_false_inverse_relation_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), not_specs, col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 28667L)
    public static SubLObject any_not_genlP(final SubLObject col, final SubLObject not_genls, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        enforceType(not_genls, genls.$sym54$LISTP);
        if (genls.NIL == not_genls) {
            return (SubLObject)genls.NIL;
        }
        if (genls.NIL != list_utilities.singletonP(not_genls)) {
            return not_genlP(col, not_genls.first(), mt, tv);
        }
        return sbhl_search_implied_relations.sbhl_any_with_implied_false_inverse_relation_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), not_genls, col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 29152L)
    public static SubLObject random_genl_of(final SubLObject collection, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        assert genls.NIL != forts.fort_p(collection) : collection;
        if (genls.NIL != mt && !genls.assertionsDisabledInClass && genls.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        return list_utilities.random_element(all_genls(collection, mt, (SubLObject)genls.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 29396L)
    public static SubLObject random_spec_of(final SubLObject collection, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        assert genls.NIL != forts.fort_p(collection) : collection;
        if (genls.NIL != mt && !genls.assertionsDisabledInClass && genls.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        return list_utilities.random_element(all_specs(collection, mt, (SubLObject)genls.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 29615L)
    public static SubLObject collections_coextensionalP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        enforceType(col_1, genls.$sym5$EL_FORT_P);
        enforceType(col_2, genls.$sym5$EL_FORT_P);
        return (SubLObject)SubLObjectFactory.makeBoolean(col_1.eql(col_2) || genls.NIL != asserted_coextensionalP(col_1, col_2, mt) || genls.NIL != tacit_coextensionalP(col_1, col_2, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 29983L)
    public static SubLObject tacit_coextensionalP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(genls.NIL != genlP(col_1, col_2, mt, (SubLObject)genls.UNPROVIDED) && genls.NIL != genlP(col_2, col_1, mt, (SubLObject)genls.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 30333L)
    public static SubLObject common_instanceP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 30441L)
    public static SubLObject why_common_instanceP(final SubLObject col_1, final SubLObject col_2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        if (behavior == genls.UNPROVIDED) {
            behavior = (SubLObject)genls.NIL;
        }
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 30577L)
    public static SubLObject collections_intersectP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(col_1, genls.$sym5$EL_FORT_P);
        enforceType(col_2, genls.$sym5$EL_FORT_P);
        return (SubLObject)SubLObjectFactory.makeBoolean(genls.NIL != genlP(col_1, col_2, mt, (SubLObject)genls.UNPROVIDED) || genls.NIL != genlP(col_2, col_1, mt, (SubLObject)genls.UNPROVIDED) || genls.NIL != disjoint_with.not_disjoint_withP(col_1, col_2, mt, (SubLObject)genls.UNPROVIDED) || (genls.NIL != genls.$sbhl_infer_intersection_from_instancesP$.getDynamicValue(thread) && genls.NIL != common_instanceP(col_1, col_2, mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 31094L)
    public static SubLObject hierarchical_collectionsP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(genls.NIL != genlP(col_1, col_2, mt, (SubLObject)genls.UNPROVIDED) || genls.NIL != genlP(col_2, col_1, mt, (SubLObject)genls.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 31274L)
    public static SubLObject genl_of_any_argP(final SubLObject collection, final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject access_arg, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (index_arg == genls.UNPROVIDED) {
            index_arg = (SubLObject)genls.ONE_INTEGER;
        }
        if (access_arg == genls.UNPROVIDED) {
            access_arg = (SubLObject)genls.TWO_INTEGER;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.$kw136$TRUE;
        }
        if (genls.NIL == collection || genls.NIL == v_term) {
            return (SubLObject)genls.NIL;
        }
        if (genls.NIL != term.ground_nautP(collection, (SubLObject)genls.UNPROVIDED)) {
            return genl_of_any_argP(narts_high.find_nart(collection), v_term, pred, mt, index_arg, access_arg, tv);
        }
        if (genls.NIL != term.ground_nautP(v_term, (SubLObject)genls.UNPROVIDED)) {
            return genl_of_any_argP(collection, narts_high.find_nart(v_term), pred, mt, index_arg, access_arg, tv);
        }
        if (genls.NIL == fort_types_interface.collectionP(collection)) {
            return (SubLObject)genls.NIL;
        }
        if (genls.NIL == forts.fort_p(v_term)) {
            return (SubLObject)genls.NIL;
        }
        return genl_of_any_argP_int(collection, v_term, pred, mt, index_arg, access_arg, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 32371L)
    public static SubLObject genl_of_any_argP_int(final SubLObject collection, final SubLObject v_term, final SubLObject pred, final SubLObject mt, final SubLObject index_arg, final SubLObject access_arg, final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject genlP = (SubLObject)genls.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if (kb_indexing.num_gaf_arg_index(v_term, index_arg, pred, (SubLObject)genls.UNPROVIDED).numL(Numbers.divide(cardinality_estimates.spec_cardinality(collection), (SubLObject)genls.THREE_INTEGER))) {
                if (genls.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
                    SubLObject done_var = genlP;
                    final SubLObject token_var = (SubLObject)genls.NIL;
                    while (genls.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (genls.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)genls.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)genls.$kw137$GAF, tv, (SubLObject)genls.NIL);
                                SubLObject done_var_$112 = genlP;
                                final SubLObject token_var_$113 = (SubLObject)genls.NIL;
                                while (genls.NIL == done_var_$112) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$113);
                                    final SubLObject valid_$114 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$113.eql(assertion));
                                    if (genls.NIL != valid_$114 && genls.NIL != genlP(assertions_high.gaf_arg(assertion, access_arg), collection, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED)) {
                                        genlP = (SubLObject)genls.T;
                                    }
                                    done_var_$112 = (SubLObject)SubLObjectFactory.makeBoolean(genls.NIL == valid_$114 || genls.NIL != genlP);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$115 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genls.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (genls.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(genls.NIL == valid || genls.NIL != genlP);
                    }
                }
            }
            else {
                final SubLObject specs = all_specs(collection, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                if (genls.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
                    SubLObject done_var2 = genlP;
                    final SubLObject token_var2 = (SubLObject)genls.NIL;
                    while (genls.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (genls.NIL != valid2) {
                            SubLObject final_index_iterator2 = (SubLObject)genls.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)genls.$kw137$GAF, tv, (SubLObject)genls.NIL);
                                SubLObject done_var_$113 = genlP;
                                final SubLObject token_var_$114 = (SubLObject)genls.NIL;
                                while (genls.NIL == done_var_$113) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$114);
                                    final SubLObject valid_$115 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$114.eql(assertion2));
                                    if (genls.NIL != valid_$115 && genls.NIL != list_utilities.member_eqP(assertions_high.gaf_arg(assertion2, access_arg), specs)) {
                                        genlP = (SubLObject)genls.T;
                                    }
                                    done_var_$113 = (SubLObject)SubLObjectFactory.makeBoolean(genls.NIL == valid_$115 || genls.NIL != genlP);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$116 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genls.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (genls.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$116, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(genls.NIL == valid2 || genls.NIL != genlP);
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return genlP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 33040L)
    public static SubLObject why_genlP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        if (behavior == genls.UNPROVIDED) {
            behavior = (SubLObject)genls.NIL;
        }
        enforceType(spec, genls.$sym5$EL_FORT_P);
        enforceType(genl, genls.$sym5$EL_FORT_P);
        if (genls.NIL != term.first_order_nautP(spec)) {
            return any_just_of_nat_genl(spec, genl, mt);
        }
        return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), spec, genl, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 33498L)
    public static SubLObject any_just_of_nat_genl(final SubLObject nat, final SubLObject collection, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.find_ground_naut(nat);
        final SubLObject just = why_genlP(v_term, collection, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
        if (genls.NIL != just) {
            return (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list(genls.$const142$termOfUnit, v_term, nat), (SubLObject)genls.$list143), just);
        }
        SubLObject nat_just = (SubLObject)genls.NIL;
        if (genls.NIL == nat_just) {
            SubLObject csome_list_var = kb_accessors.result_genl(cycl_utilities.nat_functor(nat), mt, (SubLObject)genls.UNPROVIDED);
            SubLObject genl = (SubLObject)genls.NIL;
            genl = csome_list_var.first();
            while (genls.NIL == nat_just && genls.NIL != csome_list_var) {
                if (!genl.equal(collection)) {
                    nat_just = why_genlP(genl, collection, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                }
                if (genls.NIL != nat_just || genl.equal(collection)) {
                    return (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list(genls.$const144$resultGenl, cycl_utilities.nat_functor(nat), genl), (SubLObject)genls.$list143), nat_just);
                }
                csome_list_var = csome_list_var.rest();
                genl = csome_list_var.first();
            }
        }
        if (genls.NIL == nat_just) {
            SubLObject csome_list_var = kb_accessors.result_genl_args(nat, mt);
            SubLObject genl = (SubLObject)genls.NIL;
            genl = csome_list_var.first();
            while (genls.NIL == nat_just && genls.NIL != csome_list_var) {
                if (!genl.equal(collection)) {
                    nat_just = why_genlP(genl, collection, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                }
                if (genls.NIL != nat_just || genl.equal(collection)) {
                    final SubLObject args = kb_accessors.result_genl_via_argnums(nat, collection, mt, (SubLObject)genls.UNPROVIDED);
                    if (genls.NIL != args) {
                        return (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list(genls.$const145$resultGenlArg, cycl_utilities.nat_functor(nat), args.first()), (SubLObject)genls.$list143), nat_just);
                    }
                }
                csome_list_var = csome_list_var.rest();
                genl = csome_list_var.first();
            }
        }
        if (genls.NIL == nat_just) {
            SubLObject csome_list_var = kb_accessors.result_inter_arg_genl(nat, mt);
            SubLObject genl = (SubLObject)genls.NIL;
            genl = csome_list_var.first();
            while (genls.NIL == nat_just && genls.NIL != csome_list_var) {
                if (!genl.equal(collection)) {
                    nat_just = why_genlP(genl, collection, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                }
                if (genls.NIL != nat_just || genl.equal(collection)) {
                    final SubLObject args = kb_accessors.result_inter_arg_genl_via_which_args(nat, collection, mt).first();
                    if (args.isCons()) {
                        final SubLObject arg = args.first();
                        final SubLObject ind_col = conses_high.second(args);
                        final SubLObject dep_col = conses_high.third(args);
                        final SubLObject arg_col = cycl_utilities.nat_arg(nat, arg, (SubLObject)genls.UNPROVIDED);
                        if (!arg_col.equal(ind_col)) {
                            nat_just = ConsesLow.nconc(nat_just, why_genlP(arg_col, ind_col, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED));
                        }
                        if (!dep_col.equal(collection)) {
                            nat_just = ConsesLow.nconc(nat_just, why_genlP(dep_col, collection, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED));
                        }
                        return (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list(genls.$const146$interArgResultGenl, cycl_utilities.nat_functor(nat), arg, ind_col, dep_col), (SubLObject)genls.$list143), nat_just);
                    }
                }
                csome_list_var = csome_list_var.rest();
                genl = csome_list_var.first();
            }
        }
        if (genls.NIL == nat_just) {
            SubLObject csome_list_var = kb_accessors.result_inter_arg_genl_reln(nat, mt);
            SubLObject genl = (SubLObject)genls.NIL;
            genl = csome_list_var.first();
            while (genls.NIL == nat_just && genls.NIL != csome_list_var) {
                if (!genl.equal(collection)) {
                    nat_just = why_genlP(genl, collection, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                }
                if (genls.NIL != nat_just || genl.equal(collection)) {
                    final SubLObject args = kb_accessors.result_inter_arg_genl_reln_via_which_args(nat, collection, mt, (SubLObject)genls.UNPROVIDED).first();
                    if (args.isCons()) {
                        final SubLObject rel_sentence = args.first().first();
                        final SubLObject arg2 = conses_high.second(args);
                        final SubLObject rel = cycl_utilities.formula_operator(rel_sentence);
                        final SubLObject rel_nat_term_arg = conses_high.third(args);
                        final SubLObject rel_col_arg = conses_high.fourth(args);
                        final SubLObject col = cycl_utilities.formula_arg(rel_sentence, rel_col_arg, (SubLObject)genls.UNPROVIDED);
                        if (!col.equal(collection)) {
                            nat_just = ConsesLow.nconc(nat_just, why_genlP(col, collection, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED));
                        }
                        return ConsesLow.append((SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)ConsesLow.list(genls.$const147$interArgResultGenlReln, cycl_utilities.nat_functor(nat), arg2, rel, rel_nat_term_arg, rel_col_arg), (SubLObject)genls.$list143), reader.bq_cons(rel_sentence, (SubLObject)genls.$list143)), nat_just);
                    }
                }
                csome_list_var = csome_list_var.rest();
                genl = csome_list_var.first();
            }
        }
        if (genls.NIL == nat_just && genls.NIL != control_vars.$pgia_activeP$.getDynamicValue(thread) && genls.NIL != term.first_order_nautP(collection) && cycl_utilities.nat_functor(nat).eql(cycl_utilities.nat_functor(collection))) {
            final SubLObject functor = cycl_utilities.nat_functor(collection);
            if (genls.NIL == nat_just) {
                SubLObject csome_list_var2 = kb_mapping_utilities.pred_values_in_relevant_mts(functor, genls.$const95$preservesGenlsInArg, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                SubLObject arg3 = (SubLObject)genls.NIL;
                arg3 = csome_list_var2.first();
                while (genls.NIL == nat_just && genls.NIL != csome_list_var2) {
                    nat_just = why_genlP(cycl_utilities.nat_arg(nat, arg3, (SubLObject)genls.UNPROVIDED), cycl_utilities.nat_arg(collection, arg3, (SubLObject)genls.UNPROVIDED), mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                    if (genls.NIL != nat_just) {
                        nat_just = (SubLObject)ConsesLow.cons(reader.bq_cons((SubLObject)ConsesLow.list(genls.$const95$preservesGenlsInArg, functor, arg3), (SubLObject)genls.$list143), nat_just);
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    arg3 = csome_list_var2.first();
                }
            }
            return nat_just;
        }
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 36611L)
    public static SubLObject why_not_genlP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        if (behavior == genls.UNPROVIDED) {
            behavior = (SubLObject)genls.NIL;
        }
        enforceType(spec, genls.$sym5$EL_FORT_P);
        enforceType(genl, genls.$sym5$EL_FORT_P);
        return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), spec, genl, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 36954L)
    public static SubLObject why_not_assert_genlsP(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        enforceType(spec, genls.$sym5$EL_FORT_P);
        enforceType(genl, genls.$sym5$EL_FORT_P);
        return why_not_genlP(spec, genl, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 37213L)
    public static SubLObject why_collections_intersectP(final SubLObject col_1, final SubLObject col_2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        if (behavior == genls.UNPROVIDED) {
            behavior = (SubLObject)genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject why = why_genlP(col_1, col_2, mt, tv, behavior);
        if (genls.NIL != why) {
            return why;
        }
        why = why_genlP(col_2, col_1, mt, tv, behavior);
        if (genls.NIL != why) {
            return why;
        }
        why = disjoint_with.why_not_disjoint_withP(col_1, col_2, mt, tv, behavior);
        if (genls.NIL != why) {
            return why;
        }
        if (genls.NIL != genls.$sbhl_infer_intersection_from_instancesP$.getDynamicValue(thread)) {
            return why_common_instanceP(col_1, col_2, mt, tv, behavior);
        }
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 37745L)
    public static SubLObject why_not_assert_mdwP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return why_collections_intersectP(col_1, col_2, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 37897L)
    public static SubLObject collection_leaves(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        return sbhl_search_methods.sbhl_leaf_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 38243L)
    public static SubLObject min_cols(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(cols, genls.$sym54$LISTP);
        return sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), cols, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 38582L)
    public static SubLObject min_col(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(cols, genls.$sym54$LISTP);
        final SubLObject min_cols = min_cols(cols, mt, tv);
        SubLObject min_col = min_cols.first();
        SubLObject depth_min_col = Sequences.length(all_genls(min_col, mt, (SubLObject)genls.UNPROVIDED));
        SubLObject depth_col = (SubLObject)genls.NIL;
        SubLObject cdolist_list_var = min_cols.rest();
        SubLObject col = (SubLObject)genls.NIL;
        col = cdolist_list_var.first();
        while (genls.NIL != cdolist_list_var) {
            depth_col = Sequences.length(all_genls(col, mt, (SubLObject)genls.UNPROVIDED));
            if (depth_col.numG(depth_min_col)) {
                depth_min_col = depth_col;
                min_col = col;
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return min_col;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 39217L)
    public static SubLObject max_cols(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(cols, genls.$sym54$LISTP);
        return sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), cols, mt, tv, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 39532L)
    public static SubLObject nearest_common_genls(final SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == genls.UNPROVIDED) {
            candidates = (SubLObject)genls.NIL;
        }
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return min_ceiling_cols(cols, candidates, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 39682L)
    public static SubLObject min_ceiling_cols(final SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == genls.UNPROVIDED) {
            candidates = (SubLObject)genls.NIL;
        }
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(cols, genls.$sym54$LISTP);
        return sbhl_search_methods.sbhl_min_ceilings(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), cols, candidates, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 40049L)
    public static SubLObject nearest_common_specs(final SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == genls.UNPROVIDED) {
            candidates = (SubLObject)genls.NIL;
        }
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return max_floor_cols(cols, candidates, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 40190L)
    public static SubLObject max_floor_cols(final SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == genls.UNPROVIDED) {
            candidates = (SubLObject)genls.NIL;
        }
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(cols, genls.$sym54$LISTP);
        return sbhl_search_methods.sbhl_max_floors(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), cols, candidates, mt, tv, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 40552L)
    public static SubLObject floor_of_col_pairP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return list_utilities.sublisp_boolean(any_floor_of_col_pair(col_1, col_2, mt, (SubLObject)genls.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 40732L)
    public static SubLObject any_floor_of_col_pair(final SubLObject col_1, final SubLObject col_2, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_search_methods.sbhl_first_floor_of_node_pair(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col_1, col_2, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 40945L)
    public static SubLObject all_common_specs(final SubLObject cols, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return union_all_specs(nearest_common_specs(cols, (SubLObject)genls.NIL, mt, tv), mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 41072L)
    public static SubLObject any_genl_isa(final SubLObject col, final SubLObject v_isa, SubLObject mt, SubLObject tv) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(col, genls.$sym5$EL_FORT_P);
        enforceType(v_isa, genls.$sym5$EL_FORT_P);
        return isa.any_all_forward_true_nodes_isa(genls.$const0$genls, col, v_isa, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 41389L)
    public static SubLObject lighter_col(final SubLObject col_a, final SubLObject col_b) {
        enforceType(col_a, genls.$sym5$EL_FORT_P);
        enforceType(col_b, genls.$sym5$EL_FORT_P);
        if (genls.NIL != term.ground_nautP(col_a, (SubLObject)genls.UNPROVIDED)) {
            return lighter_col(narts_high.find_nart(col_a), col_b);
        }
        if (genls.NIL != term.ground_nautP(col_b, (SubLObject)genls.UNPROVIDED)) {
            return lighter_col(col_a, narts_high.find_nart(col_b));
        }
        if (genls.NIL == forts.fort_p(col_a)) {
            return (SubLObject)genls.NIL;
        }
        if (genls.NIL == forts.fort_p(col_b)) {
            return (SubLObject)genls.NIL;
        }
        return cardinality_estimates.lightest_node(col_a, col_b);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 41890L)
    public static SubLObject lightest_col(final SubLObject col_a, final SubLObject col_b) {
        return cardinality_estimates.lightest_node(col_a, col_b);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 42040L)
    public static SubLObject lightest_of_cols(final SubLObject cols) {
        enforceType(cols, genls.$sym54$LISTP);
        if (genls.NIL == cols) {
            return (SubLObject)genls.NIL;
        }
        SubLObject lightest = cols.first();
        SubLObject cdolist_list_var = cols.rest();
        SubLObject col = (SubLObject)genls.NIL;
        col = cdolist_list_var.first();
        while (genls.NIL != cdolist_list_var) {
            lightest = lightest_col(lightest, col);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return lightest;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 42391L)
    public static SubLObject shallower_col(final SubLObject col_a, final SubLObject col_b) {
        enforceType(col_a, genls.$sym5$EL_FORT_P);
        enforceType(col_b, genls.$sym5$EL_FORT_P);
        if (genls.NIL != term.ground_nautP(col_a, (SubLObject)genls.UNPROVIDED)) {
            return shallower_col(narts_high.find_nart(col_a), col_b);
        }
        if (genls.NIL != term.ground_nautP(col_b, (SubLObject)genls.UNPROVIDED)) {
            return shallower_col(col_a, narts_high.find_nart(col_b));
        }
        if (genls.NIL == forts.fort_p(col_a)) {
            return (SubLObject)genls.NIL;
        }
        if (genls.NIL == forts.fort_p(col_b)) {
            return (SubLObject)genls.NIL;
        }
        return cardinality_estimates.shallowest_node(col_a, col_b);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 42899L)
    public static SubLObject shallowest_col(final SubLObject col_a, final SubLObject col_b) {
        return cardinality_estimates.shallowest_node(col_a, col_b);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 43105L)
    public static SubLObject max_floor_mts_of_genls_paths_wrt(final SubLObject spec, final SubLObject genl, final SubLObject mt) {
        return genl_mts.selected_genl_mts(mt, max_floor_mts_of_genls_paths(spec, genl, (SubLObject)genls.UNPROVIDED), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 43485L)
    public static SubLObject max_floor_mts_of_genls_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        enforceType(spec, genls.$sym5$EL_FORT_P);
        enforceType(genl, genls.$sym5$EL_FORT_P);
        if (genls.NIL != term.first_order_nautP(spec)) {
            return max_floor_mts_of_nat_genls_paths(spec, genl, tv);
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), spec, genl, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 43875L)
    public static SubLObject max_floor_mts_of_nat_genls_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_spec = narts_high.find_nart(spec);
        if (genls.NIL != hl_spec) {
            return max_floor_mts_of_genls_paths(hl_spec, genl, tv);
        }
        final SubLObject functor = cycl_utilities.nat_functor(spec);
        SubLObject result = (SubLObject)genls.NIL;
        SubLObject mts = (SubLObject)genls.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)genls.$sym20$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(genls.$const21$EverythingPSC, thread);
            SubLObject cdolist_list_var = kb_accessors.result_genl(functor, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
            SubLObject link_node = (SubLObject)genls.NIL;
            link_node = cdolist_list_var.first();
            while (genls.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$120;
                mts = (cdolist_list_var_$120 = max_floor_mts_of_genls_paths(link_node, genl, (SubLObject)genls.UNPROVIDED));
                SubLObject mt = (SubLObject)genls.NIL;
                mt = cdolist_list_var_$120.first();
                while (genls.NIL != cdolist_list_var_$120) {
                    if (genls.NIL != subl_promotions.memberP(link_node, kb_accessors.result_genl(functor, mt, (SubLObject)genls.UNPROVIDED), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED)) {
                        result = (SubLObject)ConsesLow.cons(mt, result);
                    }
                    cdolist_list_var_$120 = cdolist_list_var_$120.rest();
                    mt = cdolist_list_var_$120.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                link_node = cdolist_list_var.first();
            }
            cdolist_list_var = kb_accessors.result_genl_args(spec, (SubLObject)genls.UNPROVIDED);
            link_node = (SubLObject)genls.NIL;
            link_node = cdolist_list_var.first();
            while (genls.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$121;
                mts = (cdolist_list_var_$121 = max_floor_mts_of_genls_paths(link_node, genl, (SubLObject)genls.UNPROVIDED));
                SubLObject mt = (SubLObject)genls.NIL;
                mt = cdolist_list_var_$121.first();
                while (genls.NIL != cdolist_list_var_$121) {
                    if (genls.NIL != subl_promotions.memberP(link_node, kb_accessors.result_genl_args(spec, mt), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED)) {
                        result = (SubLObject)ConsesLow.cons(mt, result);
                    }
                    cdolist_list_var_$121 = cdolist_list_var_$121.rest();
                    mt = cdolist_list_var_$121.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                link_node = cdolist_list_var.first();
            }
            cdolist_list_var = kb_accessors.result_inter_arg_genl(spec, (SubLObject)genls.UNPROVIDED);
            link_node = (SubLObject)genls.NIL;
            link_node = cdolist_list_var.first();
            while (genls.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$122;
                mts = (cdolist_list_var_$122 = max_floor_mts_of_genls_paths(link_node, genl, (SubLObject)genls.UNPROVIDED));
                SubLObject mt = (SubLObject)genls.NIL;
                mt = cdolist_list_var_$122.first();
                while (genls.NIL != cdolist_list_var_$122) {
                    if (genls.NIL != subl_promotions.memberP(link_node, kb_accessors.result_inter_arg_genl(spec, mt), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED)) {
                        result = (SubLObject)ConsesLow.cons(mt, result);
                    }
                    cdolist_list_var_$122 = cdolist_list_var_$122.rest();
                    mt = cdolist_list_var_$122.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                link_node = cdolist_list_var.first();
            }
            cdolist_list_var = kb_accessors.result_genl_via_arg_arg_genl(spec, (SubLObject)genls.UNPROVIDED);
            link_node = (SubLObject)genls.NIL;
            link_node = cdolist_list_var.first();
            while (genls.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$123;
                mts = (cdolist_list_var_$123 = max_floor_mts_of_genls_paths(link_node, genl, (SubLObject)genls.UNPROVIDED));
                SubLObject mt = (SubLObject)genls.NIL;
                mt = cdolist_list_var_$123.first();
                while (genls.NIL != cdolist_list_var_$123) {
                    if (genls.NIL != subl_promotions.memberP(link_node, kb_accessors.result_genl_via_arg_arg_genl(spec, mt), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED)) {
                        result = (SubLObject)ConsesLow.cons(mt, result);
                    }
                    cdolist_list_var_$123 = cdolist_list_var_$123.rest();
                    mt = cdolist_list_var_$123.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                link_node = cdolist_list_var.first();
            }
            if (genls.NIL != control_vars.$pgia_activeP$.getDynamicValue(thread) && genls.NIL != term.first_order_nautP(genl) && cycl_utilities.nat_functor(spec).eql(cycl_utilities.nat_functor(genl))) {
                cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts(functor, genls.$const95$preservesGenlsInArg, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
                SubLObject arg = (SubLObject)genls.NIL;
                arg = cdolist_list_var.first();
                while (genls.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$124;
                    mts = (cdolist_list_var_$124 = max_floor_mts_of_genls_paths(cycl_utilities.nat_arg(spec, arg, (SubLObject)genls.UNPROVIDED), cycl_utilities.nat_arg(genl, arg, (SubLObject)genls.UNPROVIDED), (SubLObject)genls.UNPROVIDED));
                    SubLObject mt = (SubLObject)genls.NIL;
                    mt = cdolist_list_var_$124.first();
                    while (genls.NIL != cdolist_list_var_$124) {
                        if (genls.NIL != subl_promotions.memberP(arg, kb_mapping_utilities.pred_values_in_relevant_mts(functor, genls.$const95$preservesGenlsInArg, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED), (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED)) {
                            result = (SubLObject)ConsesLow.cons(mt, result);
                        }
                        cdolist_list_var_$124 = cdolist_list_var_$124.rest();
                        mt = cdolist_list_var_$124.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Sequences.remove_duplicates(result, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 45472L)
    public static SubLObject min_mts_of_genls_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), spec, genl, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 45717L)
    public static SubLObject max_floor_mts_of_not_genls_paths(final SubLObject spec, final SubLObject not_genl, SubLObject tv) {
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), not_genl, spec, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 46043L)
    public static SubLObject min_mts_of_not_genls_paths(final SubLObject spec, final SubLObject not_genl, SubLObject tv) {
        if (tv == genls.UNPROVIDED) {
            tv = (SubLObject)genls.NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), not_genl, spec, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 46359L)
    public static SubLObject genls_mts(final SubLObject col) {
        return kb_accessors.pred_mts(col, genls.$const0$genls, (SubLObject)genls.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 46620L)
    public static SubLObject asserted_genlsP(final SubLObject col, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 46823L)
    public static SubLObject asserted_genls(final SubLObject col, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 47013L)
    public static SubLObject asserted_not_genls(final SubLObject col, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 47209L)
    public static SubLObject supported_genls(final SubLObject col, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 47402L)
    public static SubLObject supported_not_genls(final SubLObject col, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 47601L)
    public static SubLObject asserted_specs(final SubLObject col, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 47801L)
    public static SubLObject asserted_not_specs(final SubLObject col, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 48005L)
    public static SubLObject supported_specs(final SubLObject col, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 48206L)
    public static SubLObject supported_not_specs(final SubLObject col, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = (SubLObject)genls.NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 48413L)
    public static SubLObject asserted_coextensionalP(final SubLObject col1, final SubLObject col2, SubLObject mt) {
        if (mt == genls.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(genls.NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(genls.$const183$coExtensional, col1, col2, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED) || genls.NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(genls.$const183$coExtensional, col2, col1, mt, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 48699L)
    public static SubLObject genls_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module(genls.$const0$genls));
        sbhl_cache.sbhl_cache_addition_maintainence(assertion);
        misc_kb_utilities.possibly_clear_genl_pos(assertion);
        final SubLObject spec = assertions_high.gaf_arg1(assertion);
        final SubLObject genl = assertions_high.gaf_arg2(assertion);
        if (genls.NIL != assertions_high.assertion_has_truth(assertion, (SubLObject)genls.$kw136$TRUE)) {
            at_defns.handle_added_genl_for_suf_defns(spec, genl);
            at_defns.handle_added_genl_for_suf_quoted_defns(spec, genl);
            at_defns.handle_added_genl_for_suf_functions(spec, genl);
            cardinality_estimates.update_cardinality_estimates_wrt_genls(spec, genl);
        }
        handle_more_specific_genl(spec, genl);
        collection_intersection.genls_collection_intersection_after_adding_int(assertion);
        after_adding_modules.clear_genls_dependent_caches(source, assertion);
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 49727L)
    public static SubLObject handle_more_specific_genl(final SubLObject spec, final SubLObject genl) {
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 50265L)
    public static SubLObject more_general_genls_assertions(final SubLObject spec, final SubLObject genl) {
        final SubLObject genls_set = set_utilities.make_set_from_list(all_proper_genls(genl, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED), (SubLObject)genls.UNPROVIDED);
        final SubLObject asserted_genls = kb_mapping.gather_gaf_arg_index(spec, (SubLObject)genls.ONE_INTEGER, genls.$const0$genls, (SubLObject)genls.UNPROVIDED, (SubLObject)genls.UNPROVIDED);
        SubLObject result = (SubLObject)genls.NIL;
        SubLObject cdolist_list_var = asserted_genls;
        SubLObject ass = (SubLObject)genls.NIL;
        ass = cdolist_list_var.first();
        while (genls.NIL != cdolist_list_var) {
            if (genls.NIL != set.set_memberP(assertions_high.gaf_arg2(ass), genls_set)) {
                result = (SubLObject)ConsesLow.cons(ass, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 50660L)
    public static SubLObject genls_after_removing(SubLObject source, final SubLObject assertion) {
        misc_kb_utilities.possibly_clear_genl_pos(assertion);
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module(genls.$const0$genls));
        sbhl_cache.sbhl_cache_removal_maintainence(assertion);
        final SubLObject spec = assertions_high.gaf_arg1(assertion);
        final SubLObject genl = assertions_high.gaf_arg2(assertion);
        if (genls.NIL != assertions_high.assertion_has_truth(assertion, (SubLObject)genls.$kw136$TRUE)) {
            at_defns.handle_removed_genl_for_suf_defns(spec, genl);
            at_defns.handle_removed_genl_for_suf_quoted_defns(spec, genl);
            at_defns.handle_removed_genl_for_suf_functions(spec, genl);
        }
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 51347L)
    public static SubLObject clear_genls_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module(genls.$const0$genls));
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 51565L)
    public static SubLObject clear_node_genls_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(genls.$const0$genls)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genls.NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), thread);
            SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module(genls.$const0$genls), node);
            SubLObject mt = (SubLObject)genls.NIL;
            mt = cdolist_list_var.first();
            while (genls.NIL != cdolist_list_var) {
                if (genls.NIL != fort_types_interface.collectionP(node)) {
                    sbhl_link_methods.clear_sbhl_links_within_mt(node, mt, (SubLObject)genls.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            }
        }
        finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 51815L)
    public static SubLObject reset_genls_links(final SubLObject col) {
        final SubLObject mts = genls_mts(col);
        clear_node_genls_links(col);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = (SubLObject)genls.NIL;
        mt = cdolist_list_var.first();
        while (genls.NIL != cdolist_list_var) {
            if (genls.NIL != fort_types_interface.collectionP(col)) {
                reset_genls_links_in_mt(col, mt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        }
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 52025L)
    public static SubLObject reset_genls_links_in_mt(final SubLObject col, final SubLObject mt) {
        sbhl_link_methods.sbhl_recompute_links(col, mt, sbhl_module_vars.get_sbhl_module(genls.$const0$genls));
        return (SubLObject)genls.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genls.lisp", position = 52145L)
    public static SubLObject reset_genls_graph(SubLObject clearP) {
        if (clearP == genls.UNPROVIDED) {
            clearP = (SubLObject)genls.T;
        }
        if (genls.NIL != clearP) {
            clear_genls_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module(genls.$const0$genls));
        return (SubLObject)genls.NIL;
    }
    
    public static SubLObject declare_genls_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "genls", "GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "min_genls", "MIN-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "nat_genls", "NAT-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "nat_min_genls", "NAT-MIN-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "min_genls_of_type", "MIN-GENLS-OF-TYPE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "min_proper_genls_of_type", "MIN-PROPER-GENLS-OF-TYPE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "naut_genls", "NAUT-GENLS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "not_genls", "NOT-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "max_not_genls", "MAX-NOT-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "nat_not_genls", "NAT-NOT-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "nat_max_not_genls", "NAT-MAX-NOT-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "naut_not_genls", "NAUT-NOT-GENLS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "specs", "SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "leaf_colP", "LEAF-COL?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "max_specs", "MAX-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "not_specs", "NOT-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "min_not_specs", "MIN-NOT-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "genl_siblings", "GENL-SIBLINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "spec_siblings", "SPEC-SIBLINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_genls", "ALL-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_genls_in_any_mt", "ALL-GENLS-IN-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_genls_in_mt", "ALL-GENLS-IN-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_genls_in_mts", "ALL-GENLS-IN-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "nat_all_genls", "NAT-ALL-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_proper_genls", "ALL-PROPER-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_specs", "ALL-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_proper_specs", "ALL-PROPER-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_proper_specs_in_any_mt", "ALL-PROPER-SPECS-IN-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_leaf_specs_in_all_mts", "ALL-LEAF-SPECS-IN-ALL-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_specs_with_max", "ALL-SPECS-WITH-MAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_specs_in_all_mts", "ALL-SPECS-IN-ALL-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "count_all_specs", "COUNT-ALL-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "count_all_specs_if", "COUNT-ALL-SPECS-IF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "count_all_specs_E", "COUNT-ALL-SPECS-=", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "count_all_specs_G", "COUNT-ALL-SPECS->", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "count_all_specs_GE", "COUNT-ALL-SPECS->=", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "count_all_specs_L", "COUNT-ALL-SPECS-<", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "count_all_specs_LE", "COUNT-ALL-SPECS-<=", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_genls_wrt", "ALL-GENLS-WRT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "union_all_genls", "UNION-ALL-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "union_min_genls_of_type", "UNION-MIN-GENLS-OF-TYPE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "union_all_genls_among", "UNION-ALL-GENLS-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_genl_of_someP", "ALL-GENL-OF-SOME?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "union_all_specs", "UNION-ALL-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "union_all_specs_count", "UNION-ALL-SPECS-COUNT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "max_cols_beneath", "MAX-COLS-BENEATH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_dependent_specs", "ALL-DEPENDENT-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "min_genls_among", "MIN-GENLS-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_genls_among", "ALL-GENLS-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_specs_among", "ALL-SPECS-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "max_specs_among", "MAX-SPECS-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_genls_if", "ALL-GENLS-IF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_specs_if", "ALL-SPECS-IF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_genls_if_with_pruning", "ALL-GENLS-IF-WITH-PRUNING", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_not_genls", "ALL-NOT-GENLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_not_specs", "ALL-NOT-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "cols_awning", "COLS-AWNING", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "map_all_genls", "MAP-ALL-GENLS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "map_all_specs", "MAP-ALL-SPECS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "map_union_all_genls", "MAP-UNION-ALL-GENLS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "map_all_genls_if", "MAP-ALL-GENLS-IF", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "gather_all_genls", "GATHER-ALL-GENLS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "gather_all_specs", "GATHER-ALL-SPECS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "any_all_genls", "ANY-ALL-GENLS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "any_all_specs", "ANY-ALL-SPECS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "sample_leaf_specs", "SAMPLE-LEAF-SPECS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "sample_different_leaf_specs", "SAMPLE-DIFFERENT-LEAF-SPECS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "genlP", "GENL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "genlsP", "GENLS?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "genl_in_mtsP", "GENL-IN-MTS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "genl_in_any_mtP", "GENL-IN-ANY-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "specP", "SPEC?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "nat_genlP", "NAT-GENL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "naut_genlP", "NAUT-GENL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "result_genl_colP", "RESULT-GENL-COL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "result_genl_arg_colP", "RESULT-GENL-ARG-COL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "result_genl_inter_arg_colP", "RESULT-GENL-INTER-ARG-COL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "result_genl_via_pgiaP", "RESULT-GENL-VIA-PGIA?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "genl_ofP", "GENL-OF?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "any_genlP", "ANY-GENL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "any_specP", "ANY-SPEC?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_genlP", "ALL-GENL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_specP", "ALL-SPEC?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "any_genl_anyP", "ANY-GENL-ANY?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "any_genl_allP", "ANY-GENL-ALL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_spec_anyP", "ALL-SPEC-ANY?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "not_genlsP", "NOT-GENLS?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "not_genlP", "NOT-GENL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "argue_not_genlP", "ARGUE-NOT-GENL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_not_specP", "ALL-NOT-SPEC?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "any_not_genlP", "ANY-NOT-GENL?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "random_genl_of", "RANDOM-GENL-OF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "random_spec_of", "RANDOM-SPEC-OF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "collections_coextensionalP", "COLLECTIONS-COEXTENSIONAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "tacit_coextensionalP", "TACIT-COEXTENSIONAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "common_instanceP", "COMMON-INSTANCE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "why_common_instanceP", "WHY-COMMON-INSTANCE?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "collections_intersectP", "COLLECTIONS-INTERSECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "hierarchical_collectionsP", "HIERARCHICAL-COLLECTIONS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "genl_of_any_argP", "GENL-OF-ANY-ARG?", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "genl_of_any_argP_int", "GENL-OF-ANY-ARG?-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "why_genlP", "WHY-GENL?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "any_just_of_nat_genl", "ANY-JUST-OF-NAT-GENL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "why_not_genlP", "WHY-NOT-GENL?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "why_not_assert_genlsP", "WHY-NOT-ASSERT-GENLS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "why_collections_intersectP", "WHY-COLLECTIONS-INTERSECT?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "why_not_assert_mdwP", "WHY-NOT-ASSERT-MDW?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "collection_leaves", "COLLECTION-LEAVES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "min_cols", "MIN-COLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "min_col", "MIN-COL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "max_cols", "MAX-COLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "nearest_common_genls", "NEAREST-COMMON-GENLS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "min_ceiling_cols", "MIN-CEILING-COLS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "nearest_common_specs", "NEAREST-COMMON-SPECS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "max_floor_cols", "MAX-FLOOR-COLS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "floor_of_col_pairP", "FLOOR-OF-COL-PAIR?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "any_floor_of_col_pair", "ANY-FLOOR-OF-COL-PAIR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "all_common_specs", "ALL-COMMON-SPECS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "any_genl_isa", "ANY-GENL-ISA", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "lighter_col", "LIGHTER-COL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "lightest_col", "LIGHTEST-COL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "lightest_of_cols", "LIGHTEST-OF-COLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "shallower_col", "SHALLOWER-COL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "shallowest_col", "SHALLOWEST-COL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "max_floor_mts_of_genls_paths_wrt", "MAX-FLOOR-MTS-OF-GENLS-PATHS-WRT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "max_floor_mts_of_genls_paths", "MAX-FLOOR-MTS-OF-GENLS-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "max_floor_mts_of_nat_genls_paths", "MAX-FLOOR-MTS-OF-NAT-GENLS-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "min_mts_of_genls_paths", "MIN-MTS-OF-GENLS-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "max_floor_mts_of_not_genls_paths", "MAX-FLOOR-MTS-OF-NOT-GENLS-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "min_mts_of_not_genls_paths", "MIN-MTS-OF-NOT-GENLS-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "genls_mts", "GENLS-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "asserted_genlsP", "ASSERTED-GENLS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "asserted_genls", "ASSERTED-GENLS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "asserted_not_genls", "ASSERTED-NOT-GENLS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "supported_genls", "SUPPORTED-GENLS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "supported_not_genls", "SUPPORTED-NOT-GENLS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "asserted_specs", "ASSERTED-SPECS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "asserted_not_specs", "ASSERTED-NOT-SPECS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "supported_specs", "SUPPORTED-SPECS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "supported_not_specs", "SUPPORTED-NOT-SPECS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "asserted_coextensionalP", "ASSERTED-COEXTENSIONAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "genls_after_adding", "GENLS-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "handle_more_specific_genl", "HANDLE-MORE-SPECIFIC-GENL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "more_general_genls_assertions", "MORE-GENERAL-GENLS-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "genls_after_removing", "GENLS-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "clear_genls_graph", "CLEAR-GENLS-GRAPH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "clear_node_genls_links", "CLEAR-NODE-GENLS-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "reset_genls_links", "RESET-GENLS-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "reset_genls_links_in_mt", "RESET-GENLS-LINKS-IN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genls", "reset_genls_graph", "RESET-GENLS-GRAPH", 0, 1, false);
        return (SubLObject)genls.NIL;
    }
    
    public static SubLObject init_genls_file() {
        genls.$sbhl_infer_intersection_from_instancesP$ = SubLFiles.defvar("*SBHL-INFER-INTERSECTION-FROM-INSTANCES?*", (SubLObject)genls.NIL);
        return (SubLObject)genls.NIL;
    }
    
    public static SubLObject setup_genls_file() {
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym1$MIN_GENLS, (SubLObject)genls.$list2, (SubLObject)genls.$str3$Returns_the_most_specific_genls_o, (SubLObject)genls.NIL, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym6$MAX_NOT_GENLS, (SubLObject)genls.$list2, (SubLObject)genls.$str7$Returns_the_least_specific_negate, (SubLObject)genls.$list8, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym10$MAX_SPECS, (SubLObject)genls.$list2, (SubLObject)genls.$str11$Returns_the_least_specific_specs_, (SubLObject)genls.$list8, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym12$MIN_NOT_SPECS, (SubLObject)genls.$list2, (SubLObject)genls.$str13$Returns_the_most_specific_negated, (SubLObject)genls.$list8, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym14$GENL_SIBLINGS, (SubLObject)genls.$list2, (SubLObject)genls.$str15$Returns_the_direct_genls_of_those, (SubLObject)genls.$list8, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym16$SPEC_SIBLINGS, (SubLObject)genls.$list2, (SubLObject)genls.$str17$Returns_the_direct_specs_of_those, (SubLObject)genls.$list8, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym18$ALL_GENLS, (SubLObject)genls.$list2, (SubLObject)genls.$str19$Returns_all_genls_of_collection_C, (SubLObject)genls.$list8, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym24$ALL_SPECS, (SubLObject)genls.$list2, (SubLObject)genls.$str25$Returns_all_specs_of_collection_C, (SubLObject)genls.$list8, (SubLObject)genls.$list4);
        access_macros.register_external_symbol((SubLObject)genls.$sym41$ALL_SPECS_WITH_MAX);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym45$COUNT_ALL_SPECS, (SubLObject)genls.$list46, (SubLObject)genls.$str47$Counts_the_number_of_specs_in_COL, (SubLObject)genls.$list48, (SubLObject)genls.$list49);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym50$ALL_GENLS_WRT, (SubLObject)genls.$list51, (SubLObject)genls.$str52$Returns_all_genls_of_collection_S, (SubLObject)genls.$list53, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym55$UNION_ALL_GENLS, (SubLObject)genls.$list56, (SubLObject)genls.$str57$Returns_all_genls_of_each_collect, (SubLObject)genls.$list58, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym59$UNION_ALL_SPECS, (SubLObject)genls.$list56, (SubLObject)genls.$str60$Returns_all_specs_of_each_collect, (SubLObject)genls.$list58, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym61$ALL_DEPENDENT_SPECS, (SubLObject)genls.$list2, (SubLObject)genls.$str62$Returns_all_specs_s_of_COL_s_t__e, (SubLObject)genls.$list8, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym63$ALL_GENLS_AMONG, (SubLObject)genls.$list64, (SubLObject)genls.$str65$Returns_those_genls_of_COL_that_a, (SubLObject)genls.$list66, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym67$ALL_SPECS_AMONG, (SubLObject)genls.$list64, (SubLObject)genls.$str68$Returns_those_specs_of_COL_that_a, (SubLObject)genls.$list66, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym70$ALL_GENLS_IF, (SubLObject)genls.$list71, (SubLObject)genls.$str72$Returns_all_genls_of_collection_C, (SubLObject)genls.$list73, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym74$ALL_SPECS_IF, (SubLObject)genls.$list71, (SubLObject)genls.$str72$Returns_all_genls_of_collection_C, (SubLObject)genls.$list73, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym75$ALL_NOT_GENLS, (SubLObject)genls.$list2, (SubLObject)genls.$str76$Returns_all_negated_genls_of_coll, (SubLObject)genls.$list8, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym77$ALL_NOT_SPECS, (SubLObject)genls.$list2, (SubLObject)genls.$str78$Returns_all_negated_specs_of_coll, (SubLObject)genls.$list8, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym79$MAP_ALL_GENLS, (SubLObject)genls.$list80, (SubLObject)genls.$str81$Applies_FN_to_every__all__genls_o, (SubLObject)genls.$list82, (SubLObject)genls.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym83$MAP_ALL_SPECS, (SubLObject)genls.$list80, (SubLObject)genls.$str84$Applies_FN_to_every__all__specs_o, (SubLObject)genls.$list82, (SubLObject)genls.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym85$ANY_ALL_GENLS, (SubLObject)genls.$list80, (SubLObject)genls.$str86$Return_a_non_nil_result_of_applyi, (SubLObject)genls.$list82, (SubLObject)genls.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym87$ANY_ALL_SPECS, (SubLObject)genls.$list80, (SubLObject)genls.$str88$Return_a_non_nil_result_of_applyi, (SubLObject)genls.$list82, (SubLObject)genls.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym89$GENL_, (SubLObject)genls.$list51, (SubLObject)genls.$str90$Returns_whether____genls_SPEC_GEN, (SubLObject)genls.$list53, (SubLObject)genls.$list91);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym92$SPEC_, (SubLObject)genls.$list93, (SubLObject)genls.$str90$Returns_whether____genls_SPEC_GEN, (SubLObject)genls.$list94, (SubLObject)genls.$list91);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym96$ANY_GENL_, (SubLObject)genls.$list97, (SubLObject)genls.$str98$_any_genl__spec_genls__is_t_iff__, (SubLObject)genls.$list99, (SubLObject)genls.$list91);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym100$ANY_SPEC_, (SubLObject)genls.$list101, (SubLObject)genls.$str102$Returns_T_iff__spec__genl_spec__f, (SubLObject)genls.$list103, (SubLObject)genls.$list91);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym104$ALL_GENL_, (SubLObject)genls.$list97, (SubLObject)genls.$str105$Returns_T_iff__genl__spec_genl__f, (SubLObject)genls.$list99, (SubLObject)genls.$list91);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym106$ALL_SPEC_, (SubLObject)genls.$list101, (SubLObject)genls.$str107$Returns_T_iff__spec__genl_spec__f, (SubLObject)genls.$list103, (SubLObject)genls.$list91);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym108$ANY_GENL_ANY_, (SubLObject)genls.$list109, (SubLObject)genls.$str110$Return_T_iff__genl__spec_genl_mt_, (SubLObject)genls.$list111, (SubLObject)genls.$list91);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym112$ANY_GENL_ALL_, (SubLObject)genls.$list109, (SubLObject)genls.$str113$Return_T_iff__genl__spec_genl_mt_, (SubLObject)genls.$list111, (SubLObject)genls.$list91);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym114$ALL_SPEC_ANY_, (SubLObject)genls.$list109, (SubLObject)genls.$str115$Return_T_iff_for_each_spec_in_SPE, (SubLObject)genls.$list111, (SubLObject)genls.$list91);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym116$NOT_GENL_, (SubLObject)genls.$list117, (SubLObject)genls.$str118$Return_whether_collection_NOT_GEN, (SubLObject)genls.$list119, (SubLObject)genls.$list91);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym120$ALL_NOT_SPEC_, (SubLObject)genls.$list121, (SubLObject)genls.$str122$Return_whether_every_collection_i, (SubLObject)genls.$list123, (SubLObject)genls.$list91);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym124$ANY_NOT_GENL_, (SubLObject)genls.$list125, (SubLObject)genls.$str126$Returns_whether_any_collection_in, (SubLObject)genls.$list127, (SubLObject)genls.$list91);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym130$COLLECTIONS_COEXTENSIONAL_, (SubLObject)genls.$list131, (SubLObject)genls.$str132$Are_COL_1_and_COL_2_coextensional, (SubLObject)genls.$list133, (SubLObject)genls.$list91);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym134$COLLECTIONS_INTERSECT_, (SubLObject)genls.$list131, (SubLObject)genls.$str135$Do_collections_COL_1_and_COL_2_in, (SubLObject)genls.$list133, (SubLObject)genls.$list91);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym138$WHY_GENL_, (SubLObject)genls.$list139, (SubLObject)genls.$str140$Justification_of__genls_SPEC_GENL, (SubLObject)genls.$list53, (SubLObject)genls.$list141);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym148$WHY_NOT_GENL_, (SubLObject)genls.$list139, (SubLObject)genls.$str149$Justification_of__not__genls_SPEC, (SubLObject)genls.$list53, (SubLObject)genls.$list141);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym150$WHY_NOT_ASSERT_GENLS_, (SubLObject)genls.$list151, (SubLObject)genls.$str152$Justification_of_why_asserting__g, (SubLObject)genls.$list53, (SubLObject)genls.$list141);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym153$COLLECTION_LEAVES, (SubLObject)genls.$list2, (SubLObject)genls.$str154$Returns_the_minimally_general__th, (SubLObject)genls.$list8, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym155$MIN_COLS, (SubLObject)genls.$list56, (SubLObject)genls.$str156$Returns_the_minimally_general__th, (SubLObject)genls.$list58, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym157$MIN_COL, (SubLObject)genls.$list56, (SubLObject)genls.$str158$Returns_the_single_minimally_gene, (SubLObject)genls.$list58, (SubLObject)genls.$list159);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym160$MAX_COLS, (SubLObject)genls.$list56, (SubLObject)genls.$str161$Returns_the_most_general_among_re, (SubLObject)genls.$list58, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym162$MIN_CEILING_COLS, (SubLObject)genls.$list163, (SubLObject)genls.$str164$Returns_the_most_specific_common_, (SubLObject)genls.$list58, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym165$MAX_FLOOR_COLS, (SubLObject)genls.$list163, (SubLObject)genls.$str166$Returns_the_most_general_common_s, (SubLObject)genls.$list58, (SubLObject)genls.$list4);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym167$ANY_GENL_ISA, (SubLObject)genls.$list168, (SubLObject)genls.$str169$Return_some_genl_of_COL_that_isa_, (SubLObject)genls.$list170, (SubLObject)genls.$list159);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym171$LIGHTER_COL, (SubLObject)genls.$list172, (SubLObject)genls.$str173$Return_COL_B_iff_it_has_fewer_spe, (SubLObject)genls.$list174, (SubLObject)genls.$list159);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym175$LIGHTEST_OF_COLS, (SubLObject)genls.$list176, (SubLObject)genls.$str177$Return_the_collection_having_the_, (SubLObject)genls.$list58, (SubLObject)genls.$list159);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym178$SHALLOWER_COL, (SubLObject)genls.$list172, (SubLObject)genls.$str179$Return_COL_B_iff_it_has_fewer_gen, (SubLObject)genls.$list174, (SubLObject)genls.$list159);
        utilities_macros.register_cyc_api_function((SubLObject)genls.$sym180$MAX_FLOOR_MTS_OF_GENLS_PATHS, (SubLObject)genls.$list181, (SubLObject)genls.$str182$_return_listp__Returns_in_what__m, (SubLObject)genls.$list53, (SubLObject)genls.NIL);
        utilities_macros.register_kb_function((SubLObject)genls.$sym184$GENLS_AFTER_ADDING);
        utilities_macros.register_kb_function((SubLObject)genls.$sym185$GENLS_AFTER_REMOVING);
        generic_testing.define_test_case_table_int((SubLObject)genls.$sym55$UNION_ALL_GENLS, (SubLObject)ConsesLow.list(new SubLObject[] { genls.$kw186$TEST, genls.NIL, genls.$kw187$OWNER, genls.NIL, genls.$kw188$CLASSES, genls.NIL, genls.$kw189$KB, genls.$kw190$TINY, genls.$kw191$WORKING_, genls.T }), (SubLObject)genls.$list192);
        generic_testing.define_test_case_table_int((SubLObject)genls.$sym59$UNION_ALL_SPECS, (SubLObject)ConsesLow.list(new SubLObject[] { genls.$kw186$TEST, genls.NIL, genls.$kw187$OWNER, genls.NIL, genls.$kw188$CLASSES, genls.NIL, genls.$kw189$KB, genls.$kw193$FULL, genls.$kw191$WORKING_, genls.T }), (SubLObject)genls.$list194);
        generic_testing.define_test_case_table_int((SubLObject)genls.$sym195$MAX_COLS_BENEATH, (SubLObject)ConsesLow.list(new SubLObject[] { genls.$kw186$TEST, genls.NIL, genls.$kw187$OWNER, genls.NIL, genls.$kw188$CLASSES, genls.NIL, genls.$kw189$KB, genls.$kw193$FULL, genls.$kw191$WORKING_, genls.T }), (SubLObject)genls.$list196);
        generic_testing.define_test_case_table_int((SubLObject)genls.$sym63$ALL_GENLS_AMONG, (SubLObject)ConsesLow.list(new SubLObject[] { genls.$kw186$TEST, genls.NIL, genls.$kw187$OWNER, genls.NIL, genls.$kw188$CLASSES, genls.NIL, genls.$kw189$KB, genls.$kw193$FULL, genls.$kw191$WORKING_, genls.T }), (SubLObject)genls.$list197);
        generic_testing.define_test_case_table_int((SubLObject)genls.$sym67$ALL_SPECS_AMONG, (SubLObject)ConsesLow.list(new SubLObject[] { genls.$kw186$TEST, genls.NIL, genls.$kw187$OWNER, genls.NIL, genls.$kw188$CLASSES, genls.NIL, genls.$kw189$KB, genls.$kw193$FULL, genls.$kw191$WORKING_, genls.T }), (SubLObject)genls.$list198);
        generic_testing.define_test_case_table_int((SubLObject)genls.$sym96$ANY_GENL_, (SubLObject)ConsesLow.list(new SubLObject[] { genls.$kw186$TEST, genls.NIL, genls.$kw187$OWNER, genls.NIL, genls.$kw188$CLASSES, genls.NIL, genls.$kw189$KB, genls.$kw193$FULL, genls.$kw191$WORKING_, genls.T }), (SubLObject)genls.$list199);
        generic_testing.define_test_case_table_int((SubLObject)genls.$sym100$ANY_SPEC_, (SubLObject)ConsesLow.list(new SubLObject[] { genls.$kw186$TEST, genls.NIL, genls.$kw187$OWNER, genls.NIL, genls.$kw188$CLASSES, genls.NIL, genls.$kw189$KB, genls.$kw193$FULL, genls.$kw191$WORKING_, genls.T }), (SubLObject)genls.$list200);
        generic_testing.define_test_case_table_int((SubLObject)genls.$sym104$ALL_GENL_, (SubLObject)ConsesLow.list(new SubLObject[] { genls.$kw186$TEST, genls.NIL, genls.$kw187$OWNER, genls.NIL, genls.$kw188$CLASSES, genls.NIL, genls.$kw189$KB, genls.$kw193$FULL, genls.$kw191$WORKING_, genls.T }), (SubLObject)genls.$list201);
        generic_testing.define_test_case_table_int((SubLObject)genls.$sym108$ANY_GENL_ANY_, (SubLObject)ConsesLow.list(new SubLObject[] { genls.$kw186$TEST, genls.NIL, genls.$kw187$OWNER, genls.NIL, genls.$kw188$CLASSES, genls.NIL, genls.$kw189$KB, genls.$kw193$FULL, genls.$kw191$WORKING_, genls.T }), (SubLObject)genls.$list202);
        generic_testing.define_test_case_table_int((SubLObject)genls.$sym112$ANY_GENL_ALL_, (SubLObject)ConsesLow.list(new SubLObject[] { genls.$kw186$TEST, genls.NIL, genls.$kw187$OWNER, genls.NIL, genls.$kw188$CLASSES, genls.NIL, genls.$kw189$KB, genls.$kw190$TINY, genls.$kw191$WORKING_, genls.T }), (SubLObject)genls.$list203);
        generic_testing.define_test_case_table_int((SubLObject)genls.$sym120$ALL_NOT_SPEC_, (SubLObject)ConsesLow.list(new SubLObject[] { genls.$kw186$TEST, genls.NIL, genls.$kw187$OWNER, genls.NIL, genls.$kw188$CLASSES, genls.NIL, genls.$kw189$KB, genls.$kw193$FULL, genls.$kw191$WORKING_, genls.T }), (SubLObject)genls.$list204);
        generic_testing.define_test_case_table_int((SubLObject)genls.$sym106$ALL_SPEC_, (SubLObject)ConsesLow.list(new SubLObject[] { genls.$kw186$TEST, genls.NIL, genls.$kw187$OWNER, genls.NIL, genls.$kw188$CLASSES, genls.NIL, genls.$kw189$KB, genls.$kw193$FULL, genls.$kw191$WORKING_, genls.T }), (SubLObject)genls.$list205);
        generic_testing.define_test_case_table_int((SubLObject)genls.$sym124$ANY_NOT_GENL_, (SubLObject)ConsesLow.list(new SubLObject[] { genls.$kw186$TEST, genls.NIL, genls.$kw187$OWNER, genls.NIL, genls.$kw188$CLASSES, genls.NIL, genls.$kw189$KB, genls.$kw193$FULL, genls.$kw191$WORKING_, genls.T }), (SubLObject)genls.$list206);
        generic_testing.define_test_case_table_int((SubLObject)genls.$sym207$ALL_GENL_OF_SOME_, (SubLObject)ConsesLow.list(new SubLObject[] { genls.$kw186$TEST, genls.NIL, genls.$kw187$OWNER, genls.NIL, genls.$kw188$CLASSES, genls.NIL, genls.$kw189$KB, genls.$kw190$TINY, genls.$kw191$WORKING_, genls.T }), (SubLObject)genls.$list208);
        return (SubLObject)genls.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_genls_file();
    }
    
    @Override
	public void initializeVariables() {
        init_genls_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_genls_file();
    }
    
    static {
        me = (SubLFile)new genls();
        genls.$sbhl_infer_intersection_from_instancesP$ = null;
        $const0$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym1$MIN_GENLS = SubLObjectFactory.makeSymbol("MIN-GENLS");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str3$Returns_the_most_specific_genls_o = SubLObjectFactory.makeString("Returns the most-specific genls of collection COL");
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $sym5$EL_FORT_P = SubLObjectFactory.makeSymbol("EL-FORT-P");
        $sym6$MAX_NOT_GENLS = SubLObjectFactory.makeSymbol("MAX-NOT-GENLS");
        $str7$Returns_the_least_specific_negate = SubLObjectFactory.makeString("Returns the least-specific negated genls of collection COL");
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $kw9$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $sym10$MAX_SPECS = SubLObjectFactory.makeSymbol("MAX-SPECS");
        $str11$Returns_the_least_specific_specs_ = SubLObjectFactory.makeString("Returns the least-specific specs of collection COL");
        $sym12$MIN_NOT_SPECS = SubLObjectFactory.makeSymbol("MIN-NOT-SPECS");
        $str13$Returns_the_most_specific_negated = SubLObjectFactory.makeString("Returns the most-specific negated specs of collection COL");
        $sym14$GENL_SIBLINGS = SubLObjectFactory.makeSymbol("GENL-SIBLINGS");
        $str15$Returns_the_direct_genls_of_those = SubLObjectFactory.makeString("Returns the direct genls of those direct spec collections of COL");
        $sym16$SPEC_SIBLINGS = SubLObjectFactory.makeSymbol("SPEC-SIBLINGS");
        $str17$Returns_the_direct_specs_of_those = SubLObjectFactory.makeString("Returns the direct specs of those direct genls collections of COL");
        $sym18$ALL_GENLS = SubLObjectFactory.makeSymbol("ALL-GENLS");
        $str19$Returns_all_genls_of_collection_C = SubLObjectFactory.makeString("Returns all genls of collection COL\n   (ascending transitive closure; inexpensive)");
        $sym20$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const21$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym22$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $sym23$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
        $sym24$ALL_SPECS = SubLObjectFactory.makeSymbol("ALL-SPECS");
        $str25$Returns_all_specs_of_collection_C = SubLObjectFactory.makeString("Returns all specs of collection COL \n   (descending transitive closure; expensive)");
        $kw26$DESCENDING = SubLObjectFactory.makeKeyword("DESCENDING");
        $kw27$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw28$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw29$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw31$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str32$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym33$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw34$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str35$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw36$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str37$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str38$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str39$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str40$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym41$ALL_SPECS_WITH_MAX = SubLObjectFactory.makeSymbol("ALL-SPECS-WITH-MAX");
        $sym42$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $kw43$INVALID_ITERATION_TERM = SubLObjectFactory.makeKeyword("INVALID-ITERATION-TERM");
        $sym44$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym45$COUNT_ALL_SPECS = SubLObjectFactory.makeSymbol("COUNT-ALL-SPECS");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str47$Counts_the_number_of_specs_in_COL = SubLObjectFactory.makeString("Counts the number of specs in COLLECTION and then returns the count.");
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $sym50$ALL_GENLS_WRT = SubLObjectFactory.makeSymbol("ALL-GENLS-WRT");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str52$Returns_all_genls_of_collection_S = SubLObjectFactory.makeString("Returns all genls of collection SPEC that are also specs of collection GENL (ascending transitive closure; inexpensive)");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $sym54$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym55$UNION_ALL_GENLS = SubLObjectFactory.makeSymbol("UNION-ALL-GENLS");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str57$Returns_all_genls_of_each_collect = SubLObjectFactory.makeString("Returns all genls of each collection in COLs");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym59$UNION_ALL_SPECS = SubLObjectFactory.makeSymbol("UNION-ALL-SPECS");
        $str60$Returns_all_specs_of_each_collect = SubLObjectFactory.makeString("Returns all specs of each collection in COLs");
        $sym61$ALL_DEPENDENT_SPECS = SubLObjectFactory.makeSymbol("ALL-DEPENDENT-SPECS");
        $str62$Returns_all_specs_s_of_COL_s_t__e = SubLObjectFactory.makeString("Returns all specs s of COL s.t. every path connecting\n   s to any genl of COL must pass through COL");
        $sym63$ALL_GENLS_AMONG = SubLObjectFactory.makeSymbol("ALL-GENLS-AMONG");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str65$Returns_those_genls_of_COL_that_a = SubLObjectFactory.makeString("Returns those genls of COL that are included among CANDIDATES");
        $list66 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym67$ALL_SPECS_AMONG = SubLObjectFactory.makeSymbol("ALL-SPECS-AMONG");
        $str68$Returns_those_specs_of_COL_that_a = SubLObjectFactory.makeString("Returns those specs of COL that are included among CANDIDATEs");
        $sym69$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym70$ALL_GENLS_IF = SubLObjectFactory.makeSymbol("ALL-GENLS-IF");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str72$Returns_all_genls_of_collection_C = SubLObjectFactory.makeString("Returns all genls of collection COL that satisfy FUNCTION\n   (FUNCTION must not effect sbhl search state)");
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $sym74$ALL_SPECS_IF = SubLObjectFactory.makeSymbol("ALL-SPECS-IF");
        $sym75$ALL_NOT_GENLS = SubLObjectFactory.makeSymbol("ALL-NOT-GENLS");
        $str76$Returns_all_negated_genls_of_coll = SubLObjectFactory.makeString("Returns all negated genls of collection COL \n   (descending transitive closure; expensive)");
        $sym77$ALL_NOT_SPECS = SubLObjectFactory.makeSymbol("ALL-NOT-SPECS");
        $str78$Returns_all_negated_specs_of_coll = SubLObjectFactory.makeString("Returns all negated specs of collection COL \n   (ascending transitive closure; inexpensive)");
        $sym79$MAP_ALL_GENLS = SubLObjectFactory.makeSymbol("MAP-ALL-GENLS");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str81$Applies_FN_to_every__all__genls_o = SubLObjectFactory.makeString("Applies FN to every (all) genls of COL\n   (FN must not effect the current sbhl space)");
        $list82 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $sym83$MAP_ALL_SPECS = SubLObjectFactory.makeSymbol("MAP-ALL-SPECS");
        $str84$Applies_FN_to_every__all__specs_o = SubLObjectFactory.makeString("Applies FN to every (all) specs of COL\n   (FN must not effect the current sbhl space)");
        $sym85$ANY_ALL_GENLS = SubLObjectFactory.makeSymbol("ANY-ALL-GENLS");
        $str86$Return_a_non_nil_result_of_applyi = SubLObjectFactory.makeString("Return a non-nil result of applying FN to some all-genl of COL\n   (FN must not effect the current sbhl space)");
        $sym87$ANY_ALL_SPECS = SubLObjectFactory.makeSymbol("ANY-ALL-SPECS");
        $str88$Return_a_non_nil_result_of_applyi = SubLObjectFactory.makeString("Return a non-nil result of applying FN to some all-spec of COL\n   (FN must not effect the current sbhl space)");
        $sym89$GENL_ = SubLObjectFactory.makeSymbol("GENL?");
        $str90$Returns_whether____genls_SPEC_GEN = SubLObjectFactory.makeString("Returns whether (#$genls SPEC GENL) can be inferred.\n   (ascending transitive search; inexpensive)");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym92$SPEC_ = SubLObjectFactory.makeSymbol("SPEC?");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $list94 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $const95$preservesGenlsInArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preservesGenlsInArg"));
        $sym96$ANY_GENL_ = SubLObjectFactory.makeSymbol("ANY-GENL?");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str98$_any_genl__spec_genls__is_t_iff__ = SubLObjectFactory.makeString("(any-genl? spec genls) is t iff (genl? spec genl) for some genl in genls\n   (ascending transitive search; inexpensive)");
        $list99 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym100$ANY_SPEC_ = SubLObjectFactory.makeSymbol("ANY-SPEC?");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("SPECS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str102$Returns_T_iff__spec__genl_spec__f = SubLObjectFactory.makeString("Returns T iff (spec? genl spec) for some spec in SPECS");
        $list103 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPECS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym104$ALL_GENL_ = SubLObjectFactory.makeSymbol("ALL-GENL?");
        $str105$Returns_T_iff__genl__spec_genl__f = SubLObjectFactory.makeString("Returns T iff (genl? spec genl) for every genl in GENLS\n   (ascending transitive search; inexpensive)");
        $sym106$ALL_SPEC_ = SubLObjectFactory.makeSymbol("ALL-SPEC?");
        $str107$Returns_T_iff__spec__genl_spec__f = SubLObjectFactory.makeString("Returns T iff (spec? genl spec) for every spec in SPECS");
        $sym108$ANY_GENL_ANY_ = SubLObjectFactory.makeSymbol("ANY-GENL-ANY?");
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPECS"), (SubLObject)SubLObjectFactory.makeSymbol("GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str110$Return_T_iff__genl__spec_genl_mt_ = SubLObjectFactory.makeString("Return T iff (genl? spec genl mt) for any spec in SPECS, genl in GENLS");
        $list111 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPECS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym112$ANY_GENL_ALL_ = SubLObjectFactory.makeSymbol("ANY-GENL-ALL?");
        $str113$Return_T_iff__genl__spec_genl_mt_ = SubLObjectFactory.makeString("Return T iff (genl? spec genl mt) for any spec in SPECS and all genl in GENLS");
        $sym114$ALL_SPEC_ANY_ = SubLObjectFactory.makeSymbol("ALL-SPEC-ANY?");
        $str115$Return_T_iff_for_each_spec_in_SPE = SubLObjectFactory.makeString("Return T iff for each spec in SPECS there is some genl in GENLS s.t. (genl? spec genl mt)");
        $sym116$NOT_GENL_ = SubLObjectFactory.makeSymbol("NOT-GENL?");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("NOT-GENL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str118$Return_whether_collection_NOT_GEN = SubLObjectFactory.makeString("Return whether collection NOT-GENL is not a genl of COL.");
        $list119 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOT-GENL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $sym120$ALL_NOT_SPEC_ = SubLObjectFactory.makeSymbol("ALL-NOT-SPEC?");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("NOT-SPECS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str122$Return_whether_every_collection_i = SubLObjectFactory.makeString("Return whether every collection in NOT-SPECS is not a spec of COL.");
        $list123 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOT-SPECS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym124$ANY_NOT_GENL_ = SubLObjectFactory.makeSymbol("ANY-NOT-GENL?");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("NOT-GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str126$Returns_whether_any_collection_in = SubLObjectFactory.makeString("Returns whether any collection in NOT-GENLS is not a genl of COL.");
        $list127 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOT-GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym128$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym129$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym130$COLLECTIONS_COEXTENSIONAL_ = SubLObjectFactory.makeSymbol("COLLECTIONS-COEXTENSIONAL?");
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL-1"), (SubLObject)SubLObjectFactory.makeSymbol("COL-2"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str132$Are_COL_1_and_COL_2_coextensional = SubLObjectFactory.makeString("Are COL-1 and COL-2 coextensional?");
        $list133 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL-1"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL-2"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $sym134$COLLECTIONS_INTERSECT_ = SubLObjectFactory.makeSymbol("COLLECTIONS-INTERSECT?");
        $str135$Do_collections_COL_1_and_COL_2_in = SubLObjectFactory.makeString("Do collections COL-1 and COL-2 intersect?\n   (uses only sbhl graphs: their extensions are not searched\n    nor are their sufficient conditions analyzed)");
        $kw136$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw137$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym138$WHY_GENL_ = SubLObjectFactory.makeSymbol("WHY-GENL?");
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("BEHAVIOR"));
        $str140$Justification_of__genls_SPEC_GENL = SubLObjectFactory.makeString("Justification of (genls SPEC GENL)");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $const142$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE"));
        $const144$resultGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenl"));
        $const145$resultGenlArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenlArg"));
        $const146$interArgResultGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgResultGenl"));
        $const147$interArgResultGenlReln = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgResultGenlReln"));
        $sym148$WHY_NOT_GENL_ = SubLObjectFactory.makeSymbol("WHY-NOT-GENL?");
        $str149$Justification_of__not__genls_SPEC = SubLObjectFactory.makeString("Justification of (not (genls SPEC GENL))");
        $sym150$WHY_NOT_ASSERT_GENLS_ = SubLObjectFactory.makeSymbol("WHY-NOT-ASSERT-GENLS?");
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str152$Justification_of_why_asserting__g = SubLObjectFactory.makeString("Justification of why asserting (genls SPEC GENL) is not consistent");
        $sym153$COLLECTION_LEAVES = SubLObjectFactory.makeSymbol("COLLECTION-LEAVES");
        $str154$Returns_the_minimally_general__th = SubLObjectFactory.makeString("Returns the minimally-general (the most specific) among all-specs of COL");
        $sym155$MIN_COLS = SubLObjectFactory.makeSymbol("MIN-COLS");
        $str156$Returns_the_minimally_general__th = SubLObjectFactory.makeString("Returns the minimally-general (the most specific) among reified collections COLS,\n   collections that have no proper specs among COLS");
        $sym157$MIN_COL = SubLObjectFactory.makeSymbol("MIN-COL");
        $str158$Returns_the_single_minimally_gene = SubLObjectFactory.makeString("Returns the single minimally-general (the most specific) among reified collections COLS.\nTies are broken by comparing the number of all-genls which is a rough depth estimate.");
        $list159 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-P"));
        $sym160$MAX_COLS = SubLObjectFactory.makeSymbol("MAX-COLS");
        $str161$Returns_the_most_general_among_re = SubLObjectFactory.makeString("Returns the most-general among reified collections COLS, collections\n   that have no proper genls among COLS");
        $sym162$MIN_CEILING_COLS = SubLObjectFactory.makeSymbol("MIN-CEILING-COLS");
        $list163 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str164$Returns_the_most_specific_common_ = SubLObjectFactory.makeString("Returns the most specific common generalizations among reified collections COLS\n   (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)");
        $sym165$MAX_FLOOR_COLS = SubLObjectFactory.makeSymbol("MAX-FLOOR-COLS");
        $str166$Returns_the_most_general_common_s = SubLObjectFactory.makeString("Returns the most general common specializations among reified collections COLS\n   (if CANDIDATES is non-nil, then result is a subset of CANDIDATES)");
        $sym167$ANY_GENL_ISA = SubLObjectFactory.makeSymbol("ANY-GENL-ISA");
        $list168 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("ISA"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str169$Return_some_genl_of_COL_that_isa_ = SubLObjectFactory.makeString("Return some genl of COL that isa instance of ISA (if any such genl exists)");
        $list170 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $sym171$LIGHTER_COL = SubLObjectFactory.makeSymbol("LIGHTER-COL");
        $list172 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL-A"), (SubLObject)SubLObjectFactory.makeSymbol("COL-B"));
        $str173$Return_COL_B_iff_it_has_fewer_spe = SubLObjectFactory.makeString("Return COL-B iff it has fewer specs than COL-A, else return COL-A");
        $list174 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL-A"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL-B"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $sym175$LIGHTEST_OF_COLS = SubLObjectFactory.makeSymbol("LIGHTEST-OF-COLS");
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLS"));
        $str177$Return_the_collection_having_the_ = SubLObjectFactory.makeString("Return the collection having the fewest specs given a list of collections.");
        $sym178$SHALLOWER_COL = SubLObjectFactory.makeSymbol("SHALLOWER-COL");
        $str179$Return_COL_B_iff_it_has_fewer_gen = SubLObjectFactory.makeString("Return COL-B iff it has fewer genls than COL-A, else return COL-A");
        $sym180$MAX_FLOOR_MTS_OF_GENLS_PATHS = SubLObjectFactory.makeSymbol("MAX-FLOOR-MTS-OF-GENLS-PATHS");
        $list181 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str182$_return_listp__Returns_in_what__m = SubLObjectFactory.makeString("@return listp; Returns in what (most-genl) mts GENL is a genls of SPEC");
        $const183$coExtensional = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("coExtensional"));
        $sym184$GENLS_AFTER_ADDING = SubLObjectFactory.makeSymbol("GENLS-AFTER-ADDING");
        $sym185$GENLS_AFTER_REMOVING = SubLObjectFactory.makeSymbol("GENLS-AFTER-REMOVING");
        $kw186$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw187$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw188$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw189$KB = SubLObjectFactory.makeKeyword("KB");
        $kw190$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw191$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list192 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)genls.NIL), (SubLObject)genls.NIL));
        $kw193$FULL = SubLObjectFactory.makeKeyword("FULL");
        $list194 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Nothing")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Nothing")))));
        $sym195$MAX_COLS_BENEATH = SubLObjectFactory.makeSymbol("MAX-COLS-BENEATH");
        $list196 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)genls.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt"))), (SubLObject)genls.NIL));
        $list197 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleHuman")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")))));
        $list198 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleHuman")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleHuman")))));
        $list199 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleHuman")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")))), (SubLObject)genls.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleHuman")), (SubLObject)genls.NIL), (SubLObject)genls.NIL));
        $list200 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleHuman")))), (SubLObject)genls.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")), (SubLObject)genls.NIL), (SubLObject)genls.NIL));
        $list201 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleHuman")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")))), (SubLObject)genls.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleHuman")), (SubLObject)genls.NIL), (SubLObject)genls.T));
        $list202 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)genls.NIL, (SubLObject)genls.NIL), (SubLObject)genls.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleHuman"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")))), (SubLObject)genls.T));
        $list203 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)genls.NIL, (SubLObject)genls.NIL), (SubLObject)genls.NIL));
        $list204 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Male")))), (SubLObject)genls.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")), (SubLObject)genls.NIL), (SubLObject)genls.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")))), (SubLObject)genls.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleHuman")))), (SubLObject)genls.NIL));
        $list205 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleHuman")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleAnimal")))), (SubLObject)genls.T));
        $list206 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleHuman")))), (SubLObject)genls.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), (SubLObject)genls.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Female")), (SubLObject)genls.NIL), (SubLObject)genls.NIL));
        $sym207$ALL_GENL_OF_SOME_ = SubLObjectFactory.makeSymbol("ALL-GENL-OF-SOME?");
        $list208 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)genls.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)genls.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)genls.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)genls.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)genls.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)genls.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)genls.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)genls.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)genls.NIL) });
    }
}

/*

	Total time: 2516 ms
	 synthetic 
*/