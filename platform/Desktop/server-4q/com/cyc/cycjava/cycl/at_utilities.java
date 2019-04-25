package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class at_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.at_utilities";
    public static final String myFingerPrint = "d5b0a893604debad6bce6048aca9885771d56db3ce95c6fc120f4b9049a0a785";
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 949L)
    private static SubLSymbol $generic_arg_store$;
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 27097L)
    private static SubLSymbol $some_inter_arg_isa_assertion_somewhere_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 30576L)
    private static SubLSymbol $some_inter_arg_format_assertion_somewhere_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 47032L)
    private static SubLSymbol $mts_cutoff_for_mts_accommodating_formula_wrt_types$;
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 48760L)
    private static SubLSymbol $max_floor_mts_of_nat_exceptions$;
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 53373L)
    private static SubLSymbol $cached_max_floor_mts_of_nat_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 54056L)
    private static SubLSymbol $max_floor_mts_of_nat_recursionP$;
    private static final SubLObject $const0$arg1Isa;
    private static final SubLObject $const1$arg2Isa;
    private static final SubLObject $const2$arg3Isa;
    private static final SubLObject $const3$arg4Isa;
    private static final SubLObject $const4$arg5Isa;
    private static final SubLSymbol $sym5$_GENERIC_ARG_STORE_;
    private static final SubLSymbol $sym6$KBEQ;
    private static final SubLString $str7$ARG;
    private static final SubLString $str8$_S;
    private static final SubLObject $const9$interArgIsa1_2;
    private static final SubLObject $const10$interArgIsa1_3;
    private static final SubLObject $const11$interArgIsa1_4;
    private static final SubLObject $const12$interArgIsa1_5;
    private static final SubLString $str13$invalid_arg_isa_pred_index___s__s;
    private static final SubLObject $const14$interArgIsa2_1;
    private static final SubLObject $const15$interArgIsa2_3;
    private static final SubLObject $const16$interArgIsa2_4;
    private static final SubLObject $const17$interArgIsa2_5;
    private static final SubLObject $const18$interArgIsa3_1;
    private static final SubLObject $const19$interArgIsa3_2;
    private static final SubLObject $const20$interArgIsa3_4;
    private static final SubLObject $const21$interArgIsa3_5;
    private static final SubLObject $const22$interArgIsa4_1;
    private static final SubLObject $const23$interArgIsa4_2;
    private static final SubLObject $const24$interArgIsa4_3;
    private static final SubLObject $const25$interArgIsa4_5;
    private static final SubLObject $const26$interArgIsa5_1;
    private static final SubLObject $const27$interArgIsa5_2;
    private static final SubLObject $const28$interArgIsa5_3;
    private static final SubLObject $const29$interArgIsa5_4;
    private static final SubLList $list30;
    private static final SubLObject $const31$interArgNotIsa1_2;
    private static final SubLObject $const32$interArgNotIsa1_3;
    private static final SubLObject $const33$interArgNotIsa1_4;
    private static final SubLObject $const34$interArgNotIsa1_5;
    private static final SubLString $str35$invalid_arg_not_isa_pred_index___;
    private static final SubLObject $const36$interArgNotIsa2_3;
    private static final SubLObject $const37$interArgNotIsa2_4;
    private static final SubLObject $const38$interArgNotIsa2_5;
    private static final SubLObject $const39$interArgNotIsa3_4;
    private static final SubLObject $const40$interArgNotIsa3_5;
    private static final SubLObject $const41$interArgNotIsa4_5;
    private static final SubLObject $const42$interArgGenl1_2;
    private static final SubLString $str43$invalid_arg_genl_pred_index___s__;
    private static final SubLObject $const44$interArgGenl2_1;
    private static final SubLObject $const45$interArgGenl2_4;
    private static final SubLObject $const46$interArgNotGenl1_2;
    private static final SubLString $str47$invalid_arg_not_genl_pred_index__;
    private static final SubLObject $const48$interArgIsaGenl1_2;
    private static final SubLString $str49$invalid_arg_isa_genl_pred_index__;
    private static final SubLObject $const50$interArgIsaGenl2_1;
    private static final SubLObject $const51$interArgIsaGenl2_3;
    private static final SubLObject $const52$interArgIsaGenl3_2;
    private static final SubLString $str53$invalid_arg_genl_isa_pred_index__;
    private static final SubLObject $const54$interArgGenlIsa2_1;
    private static final SubLObject $const55$TruthFunction;
    private static final SubLObject $const56$ArgIsaBinaryPredicate;
    private static final SubLObject $const57$ArgIsaTernaryPredicate;
    private static final SubLObject $const58$ArgIsaPredicate;
    private static final SubLObject $const59$ArgGenlBinaryPredicate;
    private static final SubLObject $const60$ArgGenlTernaryPredicate;
    private static final SubLObject $const61$ArgGenlPredicate;
    private static final SubLSymbol $sym62$INTEGERP;
    private static final SubLObject $const63$Collection;
    private static final SubLSymbol $kw64$STRONG_FORT;
    private static final SubLSymbol $kw65$ISA;
    private static final SubLObject $const66$genls;
    private static final SubLObject $const67$Thing;
    private static final SubLSymbol $kw68$GENLS;
    private static final SubLSymbol $sym69$TREE_POSITION_P;
    private static final SubLSymbol $sym70$CYCL_FORMULA_;
    private static final SubLSymbol $kw71$EL_VAR;
    private static final SubLSymbol $sym72$RELEVANT_MT_IS_SPEC_MT;
    private static final SubLSymbol $sym73$GATHER_VIA_MAP_PRED_INDEX;
    private static final SubLSymbol $sym74$GATHER_ASSERTIONS;
    private static final SubLSymbol $kw75$TRUE;
    private static final SubLSymbol $sym76$_SOME_INTER_ARG_ISA_ASSERTION_SOMEWHERE_CACHE_;
    private static final SubLSymbol $sym77$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const78$EverythingPSC;
    private static final SubLString $str79$Initializing___interArgIsa_cache;
    private static final SubLString $str80$cdolist;
    private static final SubLSymbol $kw81$GAF;
    private static final SubLObject $const82$genlPreds;
    private static final SubLSymbol $kw83$DEPTH;
    private static final SubLSymbol $kw84$STACK;
    private static final SubLSymbol $kw85$QUEUE;
    private static final SubLSymbol $sym86$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw87$ERROR;
    private static final SubLString $str88$_A_is_not_a__A;
    private static final SubLSymbol $sym89$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw90$CERROR;
    private static final SubLString $str91$continue_anyway;
    private static final SubLSymbol $kw92$WARN;
    private static final SubLString $str93$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str94$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str95$attempting_to_bind_direction_link;
    private static final SubLString $str96$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym97$_SOME_INTER_ARG_FORMAT_ASSERTION_SOMEWHERE_CACHE_;
    private static final SubLString $str98$Initializing___interArgFormat_cac;
    private static final SubLObject $const99$GenericArgTemplate;
    private static final SubLObject $const100$KeywordVariableTemplate;
    private static final SubLString $str101$got_an_arg_type_predicate___s__th;
    private static final SubLSymbol $kw102$FORMAT;
    private static final SubLSymbol $kw103$DIFFERENT;
    private static final SubLSymbol $kw104$AT_MAPPING_DONE;
    private static final SubLSymbol $sym105$AT_ERROR;
    private static final SubLSymbol $sym106$AT_NOTE;
    private static final SubLString $str107$__at_test_fails___s_fails__s_cons;
    private static final SubLString $str108$__at_test_fails___s_fails__s_cons;
    private static final SubLSymbol $kw109$IRREFLEXIVE_PREDICATE;
    private static final SubLSymbol $kw110$ASYMMETRIC_PREDICATE;
    private static final SubLSymbol $kw111$ANTI_SYMMETRIC_PREDICATE;
    private static final SubLSymbol $kw112$ANTI_TRANSITIVE_PREDICATE;
    private static final SubLSymbol $kw113$NEGATION_PREDS;
    private static final SubLSymbol $kw114$NEGATION_INVERSES;
    private static final SubLString $str115$illegal_value_of__at_mode____s;
    private static final SubLSymbol $kw116$PREDICATE_ISA_VIOLATION;
    private static final SubLSymbol $kw117$META_PREDICATE_VIOLATION;
    private static final SubLSymbol $kw118$MAL_ARG_WRT_COL_DEFN;
    private static final SubLObject $const119$CycLSentence_Assertible;
    private static final SubLSymbol $kw120$MAL_ARG_WRT_NEC_DEFN;
    private static final SubLSymbol $kw121$CHANGE_MT;
    private static final SubLSymbol $sym122$ASSERTION_ARG_VIOLATION_;
    private static final SubLSymbol $sym123$SEF_VIOLATION_;
    private static final SubLSymbol $sym124$PREDICATE_VIOLATION_;
    private static final SubLSymbol $kw125$MAL_ARG_WRT_IFF_DEFN;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$CYC_ASSERTION;
    private static final SubLObject $const128$CycLAssertion;
    private static final SubLSymbol $kw129$MAL_ARG_WRT_ARG_FORMAT;
    private static final SubLSymbol $kw130$MAL_ARG_WRT_INTER_ARG_FORMAT;
    private static final SubLSymbol $kw131$REPLACE_TERM;
    private static final SubLObject $const132$ist;
    private static final SubLList $list133;
    private static final SubLSymbol $kw134$ASSERT;
    private static final SubLObject $const135$equals;
    private static final SubLList $list136;
    private static final SubLList $list137;
    private static final SubLSymbol $kw138$UNASSERT;
    private static final SubLInteger $int139$40;
    private static final SubLSymbol $sym140$CONSTANT_P;
    private static final SubLSymbol $sym141$_;
    private static final SubLSymbol $sym142$SPEC_CARDINALITY;
    private static final SubLSymbol $sym143$CACHED_MAX_FLOOR_MTS_OF_NAT;
    private static final SubLSymbol $sym144$_CACHED_MAX_FLOOR_MTS_OF_NAT_CACHING_STATE_;
    private static final SubLInteger $int145$64;
    private static final SubLObject $const146$Microtheory;
    private static final SubLSymbol $kw147$IGNORE;
    private static final SubLObject $const148$Kappa;
    private static final SubLObject $const149$UniversalVocabularyMt;
    private static final SubLSymbol $sym150$RELEVANT_MT_IS_GENL_MT;
    private static final SubLString $str151$___S_____S_____s__;
    private static final SubLString $str152$mapping_Cyc_arguments;
    private static final SubLSymbol $sym153$STRINGP;
    private static final SubLSymbol $kw154$SKIP;
    private static final SubLObject $const155$admittedArgument;
    private static final SubLObject $const156$Function_Denotational;
    private static final SubLObject $const157$Relation;
    private static final SubLSymbol $sym158$WARN;
    private static final SubLObject $const159$AtemporalNecessarilyEssentialColl;
    private static final SubLObject $const160$argIsa;
    private static final SubLObject $const161$argGenl;
    private static final SubLSymbol $sym162$VARIABLE_ARITY_RELATION_P;
    private static final SubLObject $const163$argsIsa;
    private static final SubLObject $const164$argsGenl;
    private static final SubLSymbol $sym165$RELATION_P;
    private static final SubLSymbol $sym166$FORT_P;
    private static final SubLSymbol $sym167$POSITIVE_INTEGER_P;
    private static final SubLObject $const168$isa;
    private static final SubLList $list169;
    private static final SubLSymbol $sym170$CYC_VAR_;
    private static final SubLSymbol $sym171$VARIABLE_BINDING_SET_ITEM_COMPARATOR;
    private static final SubLInteger $int172$100;
    private static final SubLFloat $float173$0_01;
    private static final SubLObject $const174$Number_General;
    private static final SubLSymbol $sym175$ALL_RELATION_CONSTRAINT_SENTENCES;
    private static final SubLSymbol $kw176$TEST;
    private static final SubLSymbol $kw177$OWNER;
    private static final SubLSymbol $kw178$CLASSES;
    private static final SubLSymbol $kw179$KB;
    private static final SubLSymbol $kw180$FULL;
    private static final SubLSymbol $kw181$WORKING_;
    private static final SubLList $list182;
    private static final SubLSymbol $sym183$ALL_RELATION_ARG_CONSTRAINT_SENTENCES;
    private static final SubLSymbol $kw184$TINY;
    private static final SubLList $list185;
    private static final SubLSymbol $sym186$FORMULA_ARG_CONSTRAINTS_CYCL;
    private static final SubLList $list187;
    private static final SubLString $str188$Arg_Type_Utilities_Test_Suite;
    private static final SubLList $list189;
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 399L)
    public static SubLObject arg_n_predicate(final SubLObject n) {
        if (n.eql((SubLObject)at_utilities.ONE_INTEGER)) {
            return at_utilities.$const0$arg1Isa;
        }
        if (n.eql((SubLObject)at_utilities.TWO_INTEGER)) {
            return at_utilities.$const1$arg2Isa;
        }
        if (n.eql((SubLObject)at_utilities.THREE_INTEGER)) {
            return at_utilities.$const2$arg3Isa;
        }
        if (n.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
            return at_utilities.$const3$arg4Isa;
        }
        if (n.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
            return at_utilities.$const4$arg5Isa;
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 722L)
    public static SubLObject arg_type_mt(final SubLObject relation, final SubLObject args, final SubLObject argnum, final SubLObject mt) {
        if (argnum.numE((SubLObject)at_utilities.TWO_INTEGER) && at_utilities.NIL != fort_types_interface.mtP(args.first()) && at_utilities.NIL != term.mt_designating_relationP(relation)) {
            return args.first();
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 1049L)
    public static SubLObject find_generic_arg_by_id(final SubLObject number) {
        return list_utilities.alist_lookup_without_values(at_utilities.$generic_arg_store$.getGlobalValue(), number, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 1164L)
    public static SubLObject find_generic_arg_id(final SubLObject generic_arg) {
        return conses_high.rassoc(generic_arg, at_utilities.$generic_arg_store$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_utilities.$sym6$KBEQ), (SubLObject)at_utilities.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 1278L)
    public static SubLObject store_generic_arg(final SubLObject v_new, final SubLObject number) {
        at_utilities.$generic_arg_store$.setGlobalValue(list_utilities.alist_enter(at_utilities.$generic_arg_store$.getGlobalValue(), number, v_new, (SubLObject)at_utilities.UNPROVIDED));
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 1414L)
    public static SubLObject stored_generic_arg_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(conses_high.rassoc(v_object, at_utilities.$generic_arg_store$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_utilities.$sym6$KBEQ), (SubLObject)at_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 1523L)
    public static SubLObject get_generic_arg(final SubLObject number) {
        final SubLObject generic_arg_from_lookup = find_generic_arg_by_id(number);
        if (generic_arg_from_lookup.isKeyword()) {
            return generic_arg_from_lookup;
        }
        final SubLObject v_new = Symbols.make_keyword(Sequences.cconcatenate((SubLObject)at_utilities.$str7$ARG, PrintLow.format((SubLObject)at_utilities.NIL, (SubLObject)at_utilities.$str8$_S, number)));
        store_generic_arg(v_new, number);
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 1895L)
    public static SubLObject generic_arg_num(final SubLObject v_object) {
        if (at_utilities.NIL == generic_argP(v_object)) {
            return (SubLObject)at_utilities.NIL;
        }
        if (at_utilities.NIL != stored_generic_arg_p(v_object)) {
            return find_generic_arg_id(v_object);
        }
        final SubLObject argnum = string_utilities.substring(Symbols.symbol_name(v_object), (SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.UNPROVIDED);
        final SubLObject num = reader.read_from_string(argnum, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
        final SubLObject generic_argP = Types.integerp(num);
        if (at_utilities.NIL != generic_argP) {
            store_generic_arg(v_object, num);
        }
        return generic_argP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 2431L)
    public static SubLObject generic_argP(final SubLObject v_object) {
        if (!v_object.isKeyword()) {
            return (SubLObject)at_utilities.NIL;
        }
        if (at_utilities.NIL != stored_generic_arg_p(v_object)) {
            return (SubLObject)at_utilities.T;
        }
        if (at_utilities.NIL != list_utilities.lengthLE(Symbols.symbol_name(v_object), (SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.UNPROVIDED)) {
            return (SubLObject)at_utilities.NIL;
        }
        final SubLObject name = Symbols.symbol_name(v_object);
        final SubLObject arg = string_utilities.substring(name, (SubLObject)at_utilities.ZERO_INTEGER, (SubLObject)at_utilities.THREE_INTEGER);
        final SubLObject argnum_string = string_utilities.substring(name, (SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.UNPROVIDED);
        final SubLObject generic_argP = (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.$str7$ARG.equalp(arg) && at_utilities.NIL != string_utilities.digit_stringP(argnum_string));
        if (at_utilities.NIL != generic_argP) {
            store_generic_arg(v_object, reader.read_from_string(argnum_string, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED));
        }
        return generic_argP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 2975L)
    public static SubLObject inter_arg_isa_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql((SubLObject)at_utilities.ONE_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
                return at_utilities.$const9$interArgIsa1_2;
            }
            if (dep_arg.eql((SubLObject)at_utilities.THREE_INTEGER)) {
                return at_utilities.$const10$interArgIsa1_3;
            }
            if (dep_arg.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
                return at_utilities.$const11$interArgIsa1_4;
            }
            if (dep_arg.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
                return at_utilities.$const12$interArgIsa1_5;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.ONE_INTEGER)) {
                return at_utilities.$const14$interArgIsa2_1;
            }
            if (dep_arg.eql((SubLObject)at_utilities.THREE_INTEGER)) {
                return at_utilities.$const15$interArgIsa2_3;
            }
            if (dep_arg.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
                return at_utilities.$const16$interArgIsa2_4;
            }
            if (dep_arg.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
                return at_utilities.$const17$interArgIsa2_5;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.THREE_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.ONE_INTEGER)) {
                return at_utilities.$const18$interArgIsa3_1;
            }
            if (dep_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
                return at_utilities.$const19$interArgIsa3_2;
            }
            if (dep_arg.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
                return at_utilities.$const20$interArgIsa3_4;
            }
            if (dep_arg.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
                return at_utilities.$const21$interArgIsa3_5;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.ONE_INTEGER)) {
                return at_utilities.$const22$interArgIsa4_1;
            }
            if (dep_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
                return at_utilities.$const23$interArgIsa4_2;
            }
            if (dep_arg.eql((SubLObject)at_utilities.THREE_INTEGER)) {
                return at_utilities.$const24$interArgIsa4_3;
            }
            if (dep_arg.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
                return at_utilities.$const25$interArgIsa4_5;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.ONE_INTEGER)) {
                return at_utilities.$const26$interArgIsa5_1;
            }
            if (dep_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
                return at_utilities.$const27$interArgIsa5_2;
            }
            if (dep_arg.eql((SubLObject)at_utilities.THREE_INTEGER)) {
                return at_utilities.$const28$interArgIsa5_3;
            }
            if (dep_arg.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
                return at_utilities.$const29$interArgIsa5_4;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str13$invalid_arg_isa_pred_index___s__s, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 4223L)
    public static SubLObject inter_arg_isa_inverse(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (at_utilities.NIL != subl_promotions.memberP(ind_arg, (SubLObject)at_utilities.$list30, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) && at_utilities.NIL != subl_promotions.memberP(dep_arg, (SubLObject)at_utilities.$list30, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED)) {
            return inter_arg_isa_pred(dep_arg, ind_arg);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 4508L)
    public static SubLObject inter_arg_not_isa_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql((SubLObject)at_utilities.ONE_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
                return at_utilities.$const31$interArgNotIsa1_2;
            }
            if (dep_arg.eql((SubLObject)at_utilities.THREE_INTEGER)) {
                return at_utilities.$const32$interArgNotIsa1_3;
            }
            if (dep_arg.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
                return at_utilities.$const33$interArgNotIsa1_4;
            }
            if (dep_arg.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
                return at_utilities.$const34$interArgNotIsa1_5;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.THREE_INTEGER)) {
                return at_utilities.$const36$interArgNotIsa2_3;
            }
            if (dep_arg.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
                return at_utilities.$const37$interArgNotIsa2_4;
            }
            if (dep_arg.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
                return at_utilities.$const38$interArgNotIsa2_5;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.THREE_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
                return at_utilities.$const39$interArgNotIsa3_4;
            }
            if (dep_arg.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
                return at_utilities.$const40$interArgNotIsa3_5;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
                return at_utilities.$const41$interArgNotIsa4_5;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str35$invalid_arg_not_isa_pred_index___, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 5889L)
    public static SubLObject inter_arg_not_isa_inverse(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (at_utilities.NIL != subl_promotions.memberP(ind_arg, (SubLObject)at_utilities.$list30, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) && at_utilities.NIL != subl_promotions.memberP(dep_arg, (SubLObject)at_utilities.$list30, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED)) {
            return inter_arg_not_isa_pred(dep_arg, ind_arg);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 6186L)
    public static SubLObject inter_arg_genl_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql((SubLObject)at_utilities.ONE_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
                return at_utilities.$const42$interArgGenl1_2;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.ONE_INTEGER)) {
                return at_utilities.$const44$interArgGenl2_1;
            }
            if (dep_arg.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
                return at_utilities.$const45$interArgGenl2_4;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.THREE_INTEGER)) {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str43$invalid_arg_genl_pred_index___s__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 7513L)
    public static SubLObject inter_arg_not_genl_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql((SubLObject)at_utilities.ONE_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
                return at_utilities.$const46$interArgNotGenl1_2;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.THREE_INTEGER)) {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str47$invalid_arg_not_genl_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 8956L)
    public static SubLObject inter_arg_isa_genl_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql((SubLObject)at_utilities.ONE_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
                return at_utilities.$const48$interArgIsaGenl1_2;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.ONE_INTEGER)) {
                return at_utilities.$const50$interArgIsaGenl2_1;
            }
            if (dep_arg.eql((SubLObject)at_utilities.THREE_INTEGER)) {
                return at_utilities.$const51$interArgIsaGenl2_3;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.THREE_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
                return at_utilities.$const52$interArgIsaGenl3_2;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str49$invalid_arg_isa_genl_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 10383L)
    public static SubLObject inter_arg_genl_isa_pred(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (ind_arg.eql((SubLObject)at_utilities.ONE_INTEGER)) {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.TWO_INTEGER)) {
            if (dep_arg.eql((SubLObject)at_utilities.ONE_INTEGER)) {
                return at_utilities.$const54$interArgGenlIsa2_1;
            }
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.THREE_INTEGER)) {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.FOUR_INTEGER)) {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else if (ind_arg.eql((SubLObject)at_utilities.FIVE_INTEGER)) {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        else {
            el_utilities.el_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str53$invalid_arg_genl_isa_pred_index__, ind_arg, dep_arg, (SubLObject)at_utilities.UNPROVIDED);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 11826L)
    public static SubLObject inter_arg_genl_inverse(final SubLObject ind_arg, final SubLObject dep_arg) {
        if (at_utilities.NIL != subl_promotions.memberP(ind_arg, (SubLObject)at_utilities.$list30, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) && at_utilities.NIL != subl_promotions.memberP(dep_arg, (SubLObject)at_utilities.$list30, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED)) {
            return inter_arg_genl_pred(dep_arg, ind_arg);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 12114L)
    public static SubLObject implication_opP(final SubLObject symbol) {
        return subl_promotions.memberP(symbol, czer_vars.$implication_operators$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_utilities.$sym6$KBEQ), (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 12238L)
    public static SubLObject logical_opP(final SubLObject symbol) {
        return (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL != fort_types_interface.isa_logical_connectiveP(symbol, mt_vars.$anect_mt$.getGlobalValue()) || at_utilities.NIL != fort_types_interface.isa_quantifierP(symbol, mt_vars.$anect_mt$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 12378L)
    public static SubLObject truth_functionP(final SubLObject v_object) {
        return isa.isaP(v_object, at_utilities.$const55$TruthFunction, mt_vars.$anect_mt$.getGlobalValue(), (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 12472L)
    public static SubLObject initialize_all_arg_type_predicate_caches() {
        SubLObject count = (SubLObject)at_utilities.ZERO_INTEGER;
        count = Numbers.add(count, initialize_some_inter_arg_isa_assertion_somewhere_cache());
        count = Numbers.add(count, initialize_some_inter_arg_format_assertion_somewhere_cache());
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 12757L)
    public static SubLObject clear_all_arg_type_predicate_caches() {
        clear_some_inter_arg_isa_assertion_somewhere_cache();
        clear_some_inter_arg_format_assertion_somewhere_cache();
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 12941L)
    public static SubLObject arg_isa_binary_predP(final SubLObject v_object, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_binary_preds$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_utilities.$sym6$KBEQ), (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != isa.isaP(v_object, at_utilities.$const56$ArgIsaBinaryPredicate, mt, (SubLObject)at_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 13261L)
    public static SubLObject arg_isa_ternary_predP(final SubLObject v_object, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_ternary_preds$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_utilities.$sym6$KBEQ), (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != isa.isaP(v_object, at_utilities.$const57$ArgIsaTernaryPredicate, mt, (SubLObject)at_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 13496L)
    public static SubLObject arg_isa_predicateP(final SubLObject v_object, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_binary_preds$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_utilities.$sym6$KBEQ), (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != subl_promotions.memberP(v_object, czer_vars.$arg_isa_ternary_preds$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_utilities.$sym6$KBEQ), (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != isa.isaP(v_object, at_utilities.$const58$ArgIsaPredicate, mt, (SubLObject)at_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 13766L)
    public static SubLObject arg_genl_binary_predP(final SubLObject v_object, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_utilities.$sym6$KBEQ), (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != isa.isaP(v_object, at_utilities.$const59$ArgGenlBinaryPredicate, mt, (SubLObject)at_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 14001L)
    public static SubLObject arg_genl_ternary_predP(final SubLObject v_object, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_utilities.$sym6$KBEQ), (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != isa.isaP(v_object, at_utilities.$const60$ArgGenlTernaryPredicate, mt, (SubLObject)at_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 14240L)
    public static SubLObject arg_genl_predicateP(final SubLObject v_object, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_utilities.$sym6$KBEQ), (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != subl_promotions.memberP(v_object, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_utilities.$sym6$KBEQ), (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != isa.isaP(v_object, at_utilities.$const61$ArgGenlPredicate, mt, (SubLObject)at_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 14515L)
    public static SubLObject formula_denoting_functionP(final SubLObject v_object, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (at_utilities.NIL != el_utilities.relation_expressionP(v_object)) {
            return formula_functorP(cycl_utilities.nat_functor(v_object), mt);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 14730L)
    public static SubLObject formula_functorP(final SubLObject functor, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (at_utilities.NIL != term.nautP(functor, (SubLObject)at_utilities.UNPROVIDED)) {
            return formula_functorP(narts_high.find_nart(functor), mt);
        }
        if (at_utilities.NIL != forts.fort_p(functor)) {
            SubLObject formula_functorP = (SubLObject)at_utilities.NIL;
            if (at_utilities.NIL == formula_functorP) {
                SubLObject csome_list_var;
                SubLObject result_isa;
                for (csome_list_var = kb_accessors.result_isa(functor, mt), result_isa = (SubLObject)at_utilities.NIL, result_isa = csome_list_var.first(); at_utilities.NIL == formula_functorP && at_utilities.NIL != csome_list_var; formula_functorP = el_utilities.formula_denoting_collectionP(result_isa), csome_list_var = csome_list_var.rest(), result_isa = csome_list_var.first()) {}
            }
            return formula_functorP;
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 15124L)
    public static SubLObject sentence_denoting_functionP(final SubLObject v_object, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (at_utilities.NIL != el_utilities.relation_expressionP(v_object)) {
            return sentence_functorP(cycl_utilities.nat_functor(v_object), mt);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 15342L)
    public static SubLObject sentence_functorP(final SubLObject functor, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (at_utilities.NIL != term.nautP(functor, (SubLObject)at_utilities.UNPROVIDED)) {
            return sentence_functorP(narts_high.find_nart(functor), mt);
        }
        if (at_utilities.NIL != forts.fort_p(functor)) {
            SubLObject sentence_functorP = (SubLObject)at_utilities.NIL;
            if (at_utilities.NIL == sentence_functorP) {
                SubLObject csome_list_var;
                SubLObject result_isa;
                for (csome_list_var = kb_accessors.result_isa(functor, mt), result_isa = (SubLObject)at_utilities.NIL, result_isa = csome_list_var.first(); at_utilities.NIL == sentence_functorP && at_utilities.NIL != csome_list_var; sentence_functorP = el_utilities.sentence_denoting_collectionP(result_isa), csome_list_var = csome_list_var.rest(), result_isa = csome_list_var.first()) {}
            }
            return sentence_functorP;
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 15744L)
    public static SubLObject argn_type_levelP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        assert at_utilities.NIL != Types.integerp(argnum) : argnum;
        final SubLObject types = kb_accessors.argn_isa(relation, argnum, mt);
        SubLObject foundP = (SubLObject)at_utilities.NIL;
        if (at_utilities.NIL == foundP) {
            SubLObject csome_list_var;
            SubLObject type;
            for (csome_list_var = types, type = (SubLObject)at_utilities.NIL, type = csome_list_var.first(); at_utilities.NIL == foundP && at_utilities.NIL != csome_list_var; foundP = genls.genlP(type, at_utilities.$const63$Collection, mt, (SubLObject)at_utilities.UNPROVIDED), csome_list_var = csome_list_var.rest(), type = csome_list_var.first()) {}
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 16102L)
    public static SubLObject min_genl_preds_admitting_fort_as_arg(final SubLObject fort, final SubLObject argnum, final SubLObject predicate, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        return at_admitted.relations_admitting_fort_as_arg(fort, argnum, genl_predicates.all_genl_preds(predicate, mt, (SubLObject)at_utilities.UNPROVIDED), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 16280L)
    public static SubLObject forts_admitted_as_arg(final SubLObject v_forts, final SubLObject reln, final SubLObject argnum, SubLObject mt, SubLObject ind_arg_fort, SubLObject ind_argnum) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (ind_arg_fort == at_utilities.UNPROVIDED) {
            ind_arg_fort = (SubLObject)at_utilities.NIL;
        }
        if (ind_argnum == at_utilities.UNPROVIDED) {
            ind_argnum = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_utilities.NIL != v_forts) {
            final SubLObject isa_okP = (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread));
            final SubLObject genls_okP = (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue(thread));
            SubLObject result = (SubLObject)at_utilities.NIL;
            SubLObject isa_candidates = (SubLObject)at_utilities.NIL;
            if (at_utilities.NIL != isa_okP && at_utilities.NIL != genls_okP) {
                result = v_forts;
            }
            else {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    final SubLObject genl_somethingP = (SubLObject)((at_utilities.NIL != forts.fort_p(reln)) ? SubLObjectFactory.makeBoolean(at_utilities.NIL != genl_predicates.genl_predicates(reln, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != genl_predicates.genl_inverses(reln, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED)) : at_utilities.NIL);
                    final SubLObject _prev_bind_0_$31 = at_vars.$at_reln$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$32 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                    try {
                        at_vars.$at_reln$.bind(reln, thread);
                        at_vars.$at_search_genl_predsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread) && at_utilities.NIL != genl_somethingP), thread);
                        at_vars.$at_search_genl_inversesP$.bind((SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread) && at_utilities.NIL != genl_somethingP), thread);
                        assert at_utilities.NIL != Types.integerp(argnum) : argnum;
                        final SubLObject _prev_bind_0_$32 = at_vars.$at_argnum$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$33 = at_vars.$at_arg_type$.currentBinding(thread);
                        try {
                            at_vars.$at_argnum$.bind(argnum, thread);
                            at_vars.$at_arg_type$.bind((SubLObject)at_utilities.$kw64$STRONG_FORT, thread);
                            if (at_utilities.NIL != isa_okP) {
                                isa_candidates = v_forts;
                            }
                            else {
                                SubLObject cdolist_list_var = v_forts;
                                SubLObject fort = (SubLObject)at_utilities.NIL;
                                fort = cdolist_list_var.first();
                                while (at_utilities.NIL != cdolist_list_var) {
                                    if (at_utilities.NIL != forts.fort_p(fort)) {
                                        final SubLObject _prev_bind_0_$33 = at_vars.$at_arg$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$34 = at_vars.$defn_fn_history$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$37 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
                                        final SubLObject _prev_bind_4 = at_vars.$defn_col_history$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
                                        try {
                                            at_vars.$at_arg$.bind(fort, thread);
                                            at_vars.$defn_fn_history$.bind(at_macros.make_defn_fn_history_table(), thread);
                                            at_vars.$quoted_defn_fn_history$.bind(at_macros.make_quoted_defn_fn_history_table(), thread);
                                            at_vars.$defn_col_history$.bind(at_macros.make_defn_col_history_table(), thread);
                                            at_vars.$quoted_defn_col_history$.bind(at_macros.make_quoted_defn_col_history_table(), thread);
                                            try {
                                                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                                final SubLObject _prev_bind_0_$34 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$35 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_utilities.NIL, thread);
                                                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    try {
                                                        final SubLObject _prev_bind_0_$35 = at_vars.$at_isa_space$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$36 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                        try {
                                                            at_vars.$at_isa_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                                            isa.sbhl_record_all_isa(fort, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
                                                            if (at_utilities.NIL != arg_type.arg_test_okP(reln, fort, argnum, (SubLObject)at_utilities.$kw65$ISA) && (at_utilities.NIL == at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread) || at_utilities.NIL == ind_arg_fort || at_utilities.NIL == ind_argnum || at_utilities.NIL == arg_type.mal_inter_argP(reln, ind_arg_fort, ind_argnum, fort, argnum, (SubLObject)at_utilities.$kw65$ISA))) {
                                                                isa_candidates = (SubLObject)ConsesLow.cons(fort, isa_candidates);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$36, thread);
                                                            at_vars.$at_isa_space$.rebind(_prev_bind_0_$35, thread);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_utilities.T, thread);
                                                            final SubLObject _values = Values.getValuesAsVector();
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                            Values.restoreValuesFromVector(_values);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$35, thread);
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$34, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_utilities.T, thread);
                                                    final SubLObject _values2 = Values.getValuesAsVector();
                                                    at_defns.clear_defn_space();
                                                    Values.restoreValuesFromVector(_values2);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_5, thread);
                                            at_vars.$defn_col_history$.rebind(_prev_bind_4, thread);
                                            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2_$37, thread);
                                            at_vars.$defn_fn_history$.rebind(_prev_bind_1_$34, thread);
                                            at_vars.$at_arg$.rebind(_prev_bind_0_$33, thread);
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    fort = cdolist_list_var.first();
                                }
                            }
                            if (at_utilities.NIL != genls_okP) {
                                result = isa_candidates;
                            }
                            else {
                                SubLObject cdolist_list_var = isa_candidates;
                                SubLObject fort = (SubLObject)at_utilities.NIL;
                                fort = cdolist_list_var.first();
                                while (at_utilities.NIL != cdolist_list_var) {
                                    final SubLObject _prev_bind_0_$38 = at_vars.$at_arg$.currentBinding(thread);
                                    try {
                                        at_vars.$at_arg$.bind(fort, thread);
                                        final SubLObject resourcing_p2 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                        final SubLObject _prev_bind_0_$39 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$37 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_utilities.NIL, thread);
                                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            try {
                                                final SubLObject _prev_bind_0_$40 = at_vars.$at_genls_space$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$38 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                try {
                                                    at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p2, thread);
                                                    final SubLObject collectionP = fort_types_interface.collectionP(fort);
                                                    if (at_utilities.NIL != collectionP) {
                                                        sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(at_utilities.$const66$genls), fort, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
                                                        sbhl_marking_methods.sbhl_record_node(at_utilities.$const67$Thing, (SubLObject)at_utilities.UNPROVIDED);
                                                    }
                                                    final SubLObject genl_somethingP_$49 = (SubLObject)((at_utilities.NIL != forts.fort_p(reln)) ? SubLObjectFactory.makeBoolean(at_utilities.NIL != genl_predicates.genl_predicates(reln, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != genl_predicates.genl_inverses(reln, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED)) : at_utilities.NIL);
                                                    final SubLObject _prev_bind_0_$41 = at_vars.$at_reln$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$39 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$38 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                                                    try {
                                                        at_vars.$at_reln$.bind(reln, thread);
                                                        at_vars.$at_search_genl_predsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread) && at_utilities.NIL != genl_somethingP_$49), thread);
                                                        at_vars.$at_search_genl_inversesP$.bind((SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread) && at_utilities.NIL != genl_somethingP_$49), thread);
                                                        if (at_utilities.NIL != arg_type.arg_test_okP(reln, fort, argnum, (SubLObject)at_utilities.$kw68$GENLS)) {
                                                            result = (SubLObject)ConsesLow.cons(fort, result);
                                                        }
                                                    }
                                                    finally {
                                                        at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2_$38, thread);
                                                        at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$39, thread);
                                                        at_vars.$at_reln$.rebind(_prev_bind_0_$41, thread);
                                                    }
                                                }
                                                finally {
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$38, thread);
                                                    at_vars.$at_genls_space$.rebind(_prev_bind_0_$40, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_utilities.T, thread);
                                                    final SubLObject _values3 = Values.getValuesAsVector();
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                    Values.restoreValuesFromVector(_values3);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$37, thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$39, thread);
                                        }
                                    }
                                    finally {
                                        at_vars.$at_arg$.rebind(_prev_bind_0_$38, thread);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    fort = cdolist_list_var.first();
                                }
                            }
                        }
                        finally {
                            at_vars.$at_arg_type$.rebind(_prev_bind_1_$33, thread);
                            at_vars.$at_argnum$.rebind(_prev_bind_0_$32, thread);
                        }
                    }
                    finally {
                        at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_3, thread);
                        at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$32, thread);
                        at_vars.$at_reln$.rebind(_prev_bind_0_$31, thread);
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return result;
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 17747L)
    public static SubLObject min_implicit_types(final SubLObject fort, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        final SubLObject gafs = kb_accessors.constant_pos_gafs(fort, mt);
        return term_requires_isa_in_relations(fort, gafs, mt, (SubLObject)at_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 18033L)
    public static SubLObject term_requires_isa_in_relations(final SubLObject v_term, final SubLObject relation_expressions, SubLObject mt, SubLObject minimizeP) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (minimizeP == at_utilities.UNPROVIDED) {
            minimizeP = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result_isas = term_requires_types_in_relations(v_term, relation_expressions, mt, minimizeP);
        final SubLObject result_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return result_isas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 18358L)
    public static SubLObject term_requires_genl_in_relations(final SubLObject v_term, final SubLObject relation_expressions, SubLObject mt, SubLObject minimizeP) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (minimizeP == at_utilities.UNPROVIDED) {
            minimizeP = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result_isas = term_requires_types_in_relations(v_term, relation_expressions, mt, minimizeP);
        final SubLObject result_genls = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return result_genls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 18652L)
    public static SubLObject term_requires_types_in_relations(final SubLObject v_term, final SubLObject relation_expressions, SubLObject mt, SubLObject minimizeP) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (minimizeP == at_utilities.UNPROVIDED) {
            minimizeP = (SubLObject)at_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_isas = (SubLObject)at_utilities.NIL;
        SubLObject result_genls = (SubLObject)at_utilities.NIL;
        SubLObject cdolist_list_var = relation_expressions;
        SubLObject relation_expression = (SubLObject)at_utilities.NIL;
        relation_expression = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject isas = term_requires_types_in_relation(v_term, relation_expression, mt);
            final SubLObject v_genls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (at_utilities.NIL != minimizeP) {
                result_isas = genls.min_cols(ConsesLow.nconc(result_isas, isas), mt, (SubLObject)at_utilities.UNPROVIDED);
                result_genls = genls.min_cols(ConsesLow.nconc(result_genls, v_genls), mt, (SubLObject)at_utilities.UNPROVIDED);
            }
            else {
                result_isas = conses_high.nunion(result_isas, isas, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
                result_genls = conses_high.nunion(result_genls, v_genls, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            relation_expression = cdolist_list_var.first();
        }
        return Values.values(result_isas, result_genls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 19333L)
    public static SubLObject term_requires_isa_in_clause(final SubLObject v_term, final SubLObject clause, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_utilities.NIL;
        final SubLObject _prev_bind_0 = at_vars.$appraising_disjunctP$.currentBinding(thread);
        try {
            at_vars.$appraising_disjunctP$.bind(arg_type.appraising_disjunct_cnfP(clause), thread);
            SubLObject cdolist_list_var = clauses.neg_lits(clause);
            SubLObject literal = (SubLObject)at_utilities.NIL;
            literal = cdolist_list_var.first();
            while (at_utilities.NIL != cdolist_list_var) {
                result = conses_high.nunion(term_requires_isa_in_relation(v_term, literal, mt), result, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            }
            cdolist_list_var = clauses.pos_lits(clause);
            literal = (SubLObject)at_utilities.NIL;
            literal = cdolist_list_var.first();
            while (at_utilities.NIL != cdolist_list_var) {
                result = conses_high.nunion(term_requires_isa_in_relation(v_term, literal, mt), result, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            }
        }
        finally {
            at_vars.$appraising_disjunctP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 19793L)
    public static SubLObject term_requires_isa_in_relation(final SubLObject v_term, final SubLObject relation_expression, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_utilities.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind((SubLObject)at_utilities.NIL, thread);
            at_vars.$at_defns_availableP$.bind((SubLObject)at_utilities.NIL, thread);
            at_vars.$at_check_arg_genlsP$.bind((SubLObject)at_utilities.NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$54 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$55 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2_$56 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind((SubLObject)at_utilities.T, thread);
                final SubLObject _prev_bind_0_$55 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_1_$56 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_2_$57 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_argnum$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                    at_vars.$at_formula$.bind(relation_expression, thread);
                    if (at_utilities.NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(relation_expression, (SubLObject)at_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$56 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind((SubLObject)at_utilities.NIL, thread);
                            at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            while (at_utilities.NIL != cdolist_list_var) {
                                at_vars.$at_argnum$.setDynamicValue(Numbers.add(at_vars.$at_argnum$.getDynamicValue(thread), (SubLObject)at_utilities.ONE_INTEGER), thread);
                                if (at_vars.$at_arg$.getDynamicValue(thread).equal(v_term)) {
                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            }
                        }
                        finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0_$56, thread);
                        }
                    }
                }
                finally {
                    at_vars.$at_formula$.rebind(_prev_bind_2_$57, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_1_$56, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_0_$55, thread);
                }
                result = Hashtables.gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), (SubLObject)at_utilities.UNPROVIDED);
                Hashtables.clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                Hashtables.clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            }
            finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_$56, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$55, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$54, thread);
            }
        }
        finally {
            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_3, thread);
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 20638L)
    public static SubLObject term_requires_isa_in_formula(final SubLObject v_term, final SubLObject formula, SubLObject mt, SubLObject subformulasP) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (subformulasP == at_utilities.UNPROVIDED) {
            subformulasP = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_utilities.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind((SubLObject)at_utilities.NIL, thread);
            at_vars.$at_defns_availableP$.bind(subformulasP, thread);
            at_vars.$at_check_arg_genlsP$.bind((SubLObject)at_utilities.NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$61 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$62 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2_$63 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind((SubLObject)at_utilities.T, thread);
                final SubLObject _prev_bind_0_$62 = at_vars.$at_profile_term$.currentBinding(thread);
                final SubLObject _prev_bind_1_$63 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_2_$64 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_4 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_profile_term$.bind(v_term, thread);
                    at_vars.$at_argnum$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(formula), thread);
                    at_vars.$at_formula$.bind(formula, thread);
                    if (at_utilities.NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(formula, (SubLObject)at_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind((SubLObject)at_utilities.NIL, thread);
                            at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            while (at_utilities.NIL != cdolist_list_var) {
                                at_vars.$at_argnum$.setDynamicValue(Numbers.add(at_vars.$at_argnum$.getDynamicValue(thread), (SubLObject)at_utilities.ONE_INTEGER), thread);
                                if (at_utilities.NIL != ((at_utilities.NIL != subformulasP) ? cycl_utilities.expression_find(v_term, at_vars.$at_arg$.getDynamicValue(thread), (SubLObject)at_utilities.NIL, Symbols.symbol_function((SubLObject)at_utilities.EQUAL), (SubLObject)at_utilities.UNPROVIDED) : Equality.equal(v_term, at_vars.$at_arg$.getDynamicValue(thread)))) {
                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_arg$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            }
                        }
                        finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0_$63, thread);
                        }
                    }
                }
                finally {
                    at_vars.$at_formula$.rebind(_prev_bind_4, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_2_$64, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_1_$63, thread);
                    at_vars.$at_profile_term$.rebind(_prev_bind_0_$62, thread);
                }
                result = Hashtables.gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), (SubLObject)at_utilities.UNPROVIDED);
                Hashtables.clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                Hashtables.clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            }
            finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_$63, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$62, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$61, thread);
            }
        }
        finally {
            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_3, thread);
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 21417L)
    public static SubLObject term_requires_genl_in_relation(final SubLObject v_term, final SubLObject relation_expression, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_utilities.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind((SubLObject)at_utilities.NIL, thread);
            at_vars.$at_defns_availableP$.bind((SubLObject)at_utilities.NIL, thread);
            at_vars.$at_check_arg_isaP$.bind((SubLObject)at_utilities.NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$68 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$69 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2_$70 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind((SubLObject)at_utilities.T, thread);
                final SubLObject _prev_bind_0_$69 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_1_$70 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_2_$71 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_argnum$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                    at_vars.$at_formula$.bind(relation_expression, thread);
                    if (at_utilities.NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(relation_expression, (SubLObject)at_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$70 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind((SubLObject)at_utilities.NIL, thread);
                            at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            while (at_utilities.NIL != cdolist_list_var) {
                                at_vars.$at_argnum$.setDynamicValue(Numbers.add(at_vars.$at_argnum$.getDynamicValue(thread), (SubLObject)at_utilities.ONE_INTEGER), thread);
                                if (at_vars.$at_arg$.getDynamicValue(thread).equal(v_term)) {
                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            }
                        }
                        finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0_$70, thread);
                        }
                    }
                }
                finally {
                    at_vars.$at_formula$.rebind(_prev_bind_2_$71, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_1_$70, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_0_$69, thread);
                }
                result = Hashtables.gethash(v_term, at_vars.$at_genl_constraints$.getDynamicValue(thread), (SubLObject)at_utilities.UNPROVIDED);
                Hashtables.clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                Hashtables.clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            }
            finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_$70, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$69, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$68, thread);
            }
        }
        finally {
            at_vars.$at_check_arg_isaP$.rebind(_prev_bind_3, thread);
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 22377L)
    public static SubLObject get_sub_expression_for_term_position(final SubLObject term_position, final SubLObject expression) {
        assert at_utilities.NIL != list_utilities.tree_position_p(term_position) : term_position;
        assert at_utilities.NIL != collection_defns.cycl_formulaP(expression) : expression;
        if (at_utilities.ONE_INTEGER.equal(Sequences.length(term_position))) {
            return expression;
        }
        return list_utilities.get_nested_nth(expression, list_utilities.remove_last(conses_high.copy_list(term_position)), (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 22690L)
    public static SubLObject term_position_requires_types_in_relation(final SubLObject term_position, final SubLObject expression, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert at_utilities.NIL != list_utilities.tree_position_p(term_position) : term_position;
        assert at_utilities.NIL != collection_defns.cycl_formulaP(expression) : expression;
        SubLObject v_term = (SubLObject)at_utilities.NIL;
        SubLObject isa_result = (SubLObject)at_utilities.NIL;
        SubLObject genls_result = (SubLObject)at_utilities.NIL;
        final SubLObject relation_expression = get_sub_expression_for_term_position(term_position, expression);
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind((SubLObject)at_utilities.NIL, thread);
            at_vars.$at_defns_availableP$.bind((SubLObject)at_utilities.NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$75 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$76 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind((SubLObject)at_utilities.T, thread);
                final SubLObject _prev_bind_0_$76 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_1_$77 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_2_$79 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_argnum$.bind(conses_high.last(term_position, (SubLObject)at_utilities.UNPROVIDED).first(), thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                    at_vars.$at_formula$.bind(relation_expression, thread);
                    v_term = ConsesLow.nth(at_vars.$at_argnum$.getDynamicValue(thread), relation_expression);
                    if (at_utilities.NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                    }
                }
                finally {
                    at_vars.$at_formula$.rebind(_prev_bind_2_$79, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_1_$77, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_0_$76, thread);
                }
                isa_result = Hashtables.gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), (SubLObject)at_utilities.UNPROVIDED);
                genls_result = Hashtables.gethash(v_term, at_vars.$at_genl_constraints$.getDynamicValue(thread), (SubLObject)at_utilities.UNPROVIDED);
                Hashtables.clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                Hashtables.clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            }
            finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$76, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$75, thread);
            }
        }
        finally {
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(genls.min_cols(isa_result, mt, (SubLObject)at_utilities.UNPROVIDED), genls.min_cols(genls_result, mt, (SubLObject)at_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 23643L)
    public static SubLObject term_requires_types_in_relation(final SubLObject v_term, final SubLObject relation_expression, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isa_result = (SubLObject)at_utilities.NIL;
        SubLObject genls_result = (SubLObject)at_utilities.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_defns_availableP$.currentBinding(thread);
        try {
            wff_vars.$recognize_variablesP$.bind((SubLObject)at_utilities.NIL, thread);
            at_vars.$at_defns_availableP$.bind((SubLObject)at_utilities.NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$80 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$81 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind((SubLObject)at_utilities.T, thread);
                final SubLObject _prev_bind_0_$81 = at_vars.$at_argnum$.currentBinding(thread);
                final SubLObject _prev_bind_1_$82 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_2_$84 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_argnum$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(relation_expression), thread);
                    at_vars.$at_formula$.bind(relation_expression, thread);
                    if (at_utilities.NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(relation_expression, (SubLObject)at_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$82 = at_vars.$at_arg$.currentBinding(thread);
                        try {
                            at_vars.$at_arg$.bind((SubLObject)at_utilities.NIL, thread);
                            at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            while (at_utilities.NIL != cdolist_list_var) {
                                at_vars.$at_argnum$.setDynamicValue(Numbers.add(at_vars.$at_argnum$.getDynamicValue(thread), (SubLObject)at_utilities.ONE_INTEGER), thread);
                                if (at_vars.$at_arg$.getDynamicValue(thread).equal(v_term)) {
                                    arg_type.relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), v_term, at_vars.$at_argnum$.getDynamicValue(thread), mt);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                at_vars.$at_arg$.setDynamicValue(cdolist_list_var.first(), thread);
                            }
                        }
                        finally {
                            at_vars.$at_arg$.rebind(_prev_bind_0_$82, thread);
                        }
                    }
                }
                finally {
                    at_vars.$at_formula$.rebind(_prev_bind_2_$84, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_1_$82, thread);
                    at_vars.$at_argnum$.rebind(_prev_bind_0_$81, thread);
                }
                isa_result = Hashtables.gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), (SubLObject)at_utilities.UNPROVIDED);
                genls_result = Hashtables.gethash(v_term, at_vars.$at_genl_constraints$.getDynamicValue(thread), (SubLObject)at_utilities.UNPROVIDED);
                Hashtables.clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                Hashtables.clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            }
            finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$81, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$80, thread);
            }
        }
        finally {
            at_vars.$at_defns_availableP$.rebind(_prev_bind_2, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(isa_result, genls_result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 24706L)
    public static SubLObject arg_requires_isa_in_relation(final SubLObject arg, final SubLObject relation_expression, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        final SubLObject v_term = cycl_utilities.formula_arg(relation_expression, arg, (SubLObject)at_utilities.UNPROVIDED);
        return term_requires_isa_in_relation(v_term, relation_expression, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 24949L)
    public static SubLObject pred_arg_isa_requires_other_arg_isa(final SubLObject pred, final SubLObject arg_isa, final SubLObject arg, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_utilities.NIL;
        final SubLObject literal = make_el_query_literal(pred);
        final SubLObject _prev_bind_0 = at_vars.$at_formula$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_argnum$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$recognize_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = at_vars.$at_defns_availableP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
        try {
            at_vars.$at_formula$.bind(list_utilities.replace_nth(arg, arg_isa, literal), thread);
            at_vars.$at_arg$.bind(arg_isa, thread);
            at_vars.$at_argnum$.bind(arg, thread);
            wff_vars.$recognize_variablesP$.bind((SubLObject)at_utilities.NIL, thread);
            at_vars.$at_defns_availableP$.bind((SubLObject)at_utilities.NIL, thread);
            at_vars.$at_check_arg_genlsP$.bind((SubLObject)at_utilities.NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$86 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$87 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2_$88 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                at_vars.$gather_at_constraintsP$.bind((SubLObject)at_utilities.T, thread);
                final SubLObject _prev_bind_0_$87 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_1_$88 = at_vars.$at_formula$.currentBinding(thread);
                try {
                    at_vars.$at_reln$.bind(cycl_utilities.formula_arg0(at_vars.$at_formula$.getDynamicValue(thread)), thread);
                    at_vars.$at_formula$.bind(at_vars.$at_formula$.getDynamicValue(thread), thread);
                    SubLObject n = (SubLObject)at_utilities.ZERO_INTEGER;
                    SubLObject cdolist_list_var = el_utilities.literal_args(at_vars.$at_formula$.getDynamicValue(thread), (SubLObject)at_utilities.UNPROVIDED);
                    SubLObject v_term = (SubLObject)at_utilities.NIL;
                    v_term = cdolist_list_var.first();
                    while (at_utilities.NIL != cdolist_list_var) {
                        n = Numbers.add(n, (SubLObject)at_utilities.ONE_INTEGER);
                        if (n.numE(arg)) {
                            arg_type.arg_isa_arg_types_okP(pred, v_term, arg, mt);
                        }
                        else {
                            arg_type.relation_arg_okP(pred, v_term, n, (SubLObject)at_utilities.UNPROVIDED);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        v_term = cdolist_list_var.first();
                    }
                    n = (SubLObject)at_utilities.ZERO_INTEGER;
                    cdolist_list_var = el_utilities.literal_args(at_vars.$at_formula$.getDynamicValue(thread), (SubLObject)at_utilities.UNPROVIDED);
                    v_term = (SubLObject)at_utilities.NIL;
                    v_term = cdolist_list_var.first();
                    while (at_utilities.NIL != cdolist_list_var) {
                        n = Numbers.add(n, (SubLObject)at_utilities.ONE_INTEGER);
                        if (!arg_isa.eql(v_term)) {
                            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(n, genls.min_cols(list_utilities.remove_duplicate_forts(Hashtables.gethash(v_term, at_vars.$at_isa_constraints$.getDynamicValue(thread), (SubLObject)at_utilities.UNPROVIDED)), mt, (SubLObject)at_utilities.UNPROVIDED)), result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        v_term = cdolist_list_var.first();
                    }
                }
                finally {
                    at_vars.$at_formula$.rebind(_prev_bind_1_$88, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_0_$87, thread);
                }
                Hashtables.clrhash(at_vars.$at_isa_constraints$.getDynamicValue(thread));
                Hashtables.clrhash(at_vars.$at_genl_constraints$.getDynamicValue(thread));
            }
            finally {
                at_vars.$gather_at_constraintsP$.rebind(_prev_bind_2_$88, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$87, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$86, thread);
            }
        }
        finally {
            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_6, thread);
            at_vars.$at_defns_availableP$.rebind(_prev_bind_5, thread);
            wff_vars.$recognize_variablesP$.rebind(_prev_bind_4, thread);
            at_vars.$at_argnum$.rebind(_prev_bind_3, thread);
            at_vars.$at_arg$.rebind(_prev_bind_2, thread);
            at_vars.$at_formula$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 25990L)
    public static SubLObject make_el_query_literal(final SubLObject pred) {
        final SubLObject v_arity = arity.arity(pred);
        SubLObject literal = (SubLObject)ConsesLow.list(pred);
        if (at_utilities.NIL != el_utilities.valid_arity_p(v_arity)) {
            SubLObject i;
            for (i = (SubLObject)at_utilities.NIL, i = (SubLObject)at_utilities.ZERO_INTEGER; i.numL(v_arity); i = Numbers.add(i, (SubLObject)at_utilities.ONE_INTEGER)) {
                literal = (SubLObject)ConsesLow.cons(czer_utilities.get_nth_canonical_variable(i, (SubLObject)at_utilities.$kw71$EL_VAR), literal);
            }
        }
        return Sequences.nreverse(literal);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 26236L)
    public static SubLObject arg_isa_applicable_gafs(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject relation = assertions_high.gaf_arg1(assertion);
        SubLObject result = (SubLObject)at_utilities.NIL;
        if (at_utilities.NIL != forts.fort_p(relation)) {
            final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding(thread);
            try {
                control_vars.$mapping_answer$.bind((SubLObject)at_utilities.NIL, thread);
                if (at_utilities.NIL != fort_types_interface.predicateP(relation)) {
                    final SubLObject _prev_bind_0_$91 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_utilities.$sym72$RELEVANT_MT_IS_SPEC_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        genl_predicates.map_spec_preds(relation, (SubLObject)at_utilities.$sym73$GATHER_VIA_MAP_PRED_INDEX, (SubLObject)at_utilities.UNPROVIDED);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$91, thread);
                    }
                }
                else {
                    final SubLObject _prev_bind_0_$92 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_utilities.$sym72$RELEVANT_MT_IS_SPEC_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        kb_mapping.map_predicate_extent_index((SubLObject)at_utilities.$sym74$GATHER_ASSERTIONS, relation, (SubLObject)at_utilities.$kw75$TRUE, (SubLObject)at_utilities.UNPROVIDED);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$92, thread);
                    }
                }
                result = control_vars.$mapping_answer$.getDynamicValue(thread);
            }
            finally {
                control_vars.$mapping_answer$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 26932L)
    public static SubLObject gather_via_map_pred_index(final SubLObject predicate) {
        if (at_utilities.NIL != forts.fort_p(predicate)) {
            kb_mapping.map_predicate_extent_index((SubLObject)at_utilities.$sym74$GATHER_ASSERTIONS, predicate, (SubLObject)at_utilities.$kw75$TRUE, (SubLObject)at_utilities.UNPROVIDED);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 27578L)
    public static SubLObject inter_arg_isa_cache_initializedP() {
        return set.set_p(at_utilities.$some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 27724L)
    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_add_int(final SubLObject reln) {
        return set.set_add(reln, at_utilities.$some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 27872L)
    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_remove_int(final SubLObject reln) {
        return set.set_remove(reln, at_utilities.$some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 28028L)
    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_int(final SubLObject reln) {
        SubLObject count = (SubLObject)at_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
        SubLObject ind_argnum = (SubLObject)at_utilities.NIL;
        ind_argnum = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$93 = czer_vars.$arg_positions$.getGlobalValue();
            SubLObject dep_argnum = (SubLObject)at_utilities.NIL;
            dep_argnum = cdolist_list_var_$93.first();
            while (at_utilities.NIL != cdolist_list_var_$93) {
                final SubLObject inter_arg_isa_pred = inter_arg_isa_pred(ind_argnum, dep_argnum);
                if (at_utilities.NIL != inter_arg_isa_pred) {
                    count = Numbers.add(count, kb_indexing.num_gaf_arg_index(reln, (SubLObject)at_utilities.ONE_INTEGER, inter_arg_isa_pred, (SubLObject)at_utilities.UNPROVIDED));
                }
                cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                dep_argnum = cdolist_list_var_$93.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            ind_argnum = cdolist_list_var.first();
        }
        if (count.numLE((SubLObject)at_utilities.ONE_INTEGER)) {
            return some_inter_arg_isa_assertion_somewhere_cache_remove_int(reln);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 28555L)
    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_add(final SubLObject reln) {
        if (at_utilities.NIL != inter_arg_isa_cache_initializedP()) {
            return some_inter_arg_isa_assertion_somewhere_cache_add_int(reln);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 28783L)
    public static SubLObject some_inter_arg_isa_assertion_somewhere_cache_maybe_remove(final SubLObject reln) {
        if (at_utilities.NIL != inter_arg_isa_cache_initializedP()) {
            return some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_int(reln);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 28992L)
    public static SubLObject clear_some_inter_arg_isa_assertion_somewhere_cache() {
        if (at_utilities.NIL != set.set_p(at_utilities.$some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue())) {
            set.clear_set(at_utilities.$some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
        }
        else {
            at_utilities.$some_inter_arg_isa_assertion_somewhere_cache$.setGlobalValue(set.new_set((SubLObject)at_utilities.EQL, (SubLObject)at_utilities.UNPROVIDED));
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 29302L)
    public static SubLObject initialize_some_inter_arg_isa_assertion_somewhere_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_some_inter_arg_isa_assertion_somewhere_cache();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_utilities.$sym77$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_utilities.$const78$EverythingPSC, thread);
            final SubLObject list_var = czer_vars.$arg_positions$.getGlobalValue();
            final SubLObject _prev_bind_0_$94 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$95 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)at_utilities.$str79$Initializing___interArgIsa_cache, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)at_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)at_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject ind_argnum = (SubLObject)at_utilities.NIL;
                    ind_argnum = csome_list_var.first();
                    while (at_utilities.NIL != csome_list_var) {
                        SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
                        SubLObject dep_argnum = (SubLObject)at_utilities.NIL;
                        dep_argnum = cdolist_list_var.first();
                        while (at_utilities.NIL != cdolist_list_var) {
                            if (!ind_argnum.eql(dep_argnum)) {
                                final SubLObject inter_arg_isa_pred = inter_arg_isa_pred(ind_argnum, dep_argnum);
                                if (at_utilities.NIL != inter_arg_isa_pred) {
                                    final SubLObject pred_var = inter_arg_isa_pred;
                                    if (at_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        final SubLObject str = (SubLObject)at_utilities.NIL;
                                        final SubLObject _prev_bind_0_$95 = utilities_macros.$progress_start_time$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$96 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$98 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                        final SubLObject _prev_bind_3_$99 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                                        final SubLObject _prev_bind_4_$100 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                                        final SubLObject _prev_bind_5_$101 = utilities_macros.$progress_count$.currentBinding(thread);
                                        final SubLObject _prev_bind_6_$102 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                                        final SubLObject _prev_bind_7_$103 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                        try {
                                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                            utilities_macros.$progress_notification_count$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
                                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
                                            utilities_macros.$progress_count$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
                                            utilities_macros.$is_noting_progressP$.bind((SubLObject)at_utilities.T, thread);
                                            utilities_macros.$silent_progressP$.bind((SubLObject)((at_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : at_utilities.T), thread);
                                            utilities_macros.noting_progress_preamble(str);
                                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                            SubLObject done_var = (SubLObject)at_utilities.NIL;
                                            final SubLObject token_var = (SubLObject)at_utilities.NIL;
                                            while (at_utilities.NIL == done_var) {
                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                if (at_utilities.NIL != valid) {
                                                    utilities_macros.note_progress();
                                                    SubLObject final_index_iterator = (SubLObject)at_utilities.NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_utilities.$kw81$GAF, (SubLObject)at_utilities.$kw75$TRUE, (SubLObject)at_utilities.NIL);
                                                        SubLObject done_var_$104 = (SubLObject)at_utilities.NIL;
                                                        final SubLObject token_var_$105 = (SubLObject)at_utilities.NIL;
                                                        while (at_utilities.NIL == done_var_$104) {
                                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$105);
                                                            final SubLObject valid_$106 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$105.eql(ass));
                                                            if (at_utilities.NIL != valid_$106) {
                                                                final SubLObject reln = assertions_high.gaf_arg1(ass);
                                                                some_inter_arg_isa_assertion_somewhere_cache_add_int(reln);
                                                            }
                                                            done_var_$104 = (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL == valid_$106);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$96 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_utilities.T, thread);
                                                            final SubLObject _values = Values.getValuesAsVector();
                                                            if (at_utilities.NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                            Values.restoreValuesFromVector(_values);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$96, thread);
                                                        }
                                                    }
                                                }
                                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL == valid);
                                            }
                                            utilities_macros.noting_progress_postamble();
                                        }
                                        finally {
                                            utilities_macros.$silent_progressP$.rebind(_prev_bind_7_$103, thread);
                                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_6_$102, thread);
                                            utilities_macros.$progress_count$.rebind(_prev_bind_5_$101, thread);
                                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$100, thread);
                                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$99, thread);
                                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$98, thread);
                                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$96, thread);
                                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$95, thread);
                                        }
                                    }
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            dep_argnum = cdolist_list_var.first();
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)at_utilities.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        ind_argnum = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$95, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$94, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return set.set_size(at_utilities.$some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 29966L)
    public static SubLObject some_inter_arg_isa_assertion_somewhereP(final SubLObject reln) {
        return set.set_memberP(reln, at_utilities.$some_inter_arg_isa_assertion_somewhere_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 30105L)
    public static SubLObject some_inter_arg_isa_constraint_somewhereP(final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found_oneP = (SubLObject)at_utilities.NIL;
        if (at_utilities.NIL != fort_types_interface.predicateP(reln)) {
            if (at_utilities.NIL == found_oneP) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module(at_utilities.$const82$genlPreds);
                final SubLObject deck_type = (SubLObject)((at_utilities.$kw83$DEPTH == at_utilities.$kw83$DEPTH) ? at_utilities.$kw84$STACK : at_utilities.$kw85$QUEUE);
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = (SubLObject)at_utilities.NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)at_utilities.NIL;
                        final SubLObject _prev_bind_0_$109 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((at_utilities.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((at_utilities.NIL != tv_var) ? at_utilities.$sym86$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (at_utilities.NIL != tv_var && at_utilities.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && at_utilities.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)at_utilities.$kw87$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)at_utilities.ONE_INTEGER, (SubLObject)at_utilities.$str88$_A_is_not_a__A, tv_var, (SubLObject)at_utilities.$sym89$SBHL_TRUE_TV_P, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)at_utilities.$kw90$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)at_utilities.ONE_INTEGER, (SubLObject)at_utilities.$str91$continue_anyway, (SubLObject)at_utilities.$str88$_A_is_not_a__A, tv_var, (SubLObject)at_utilities.$sym89$SBHL_TRUE_TV_P, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)at_utilities.$kw92$WARN)) {
                                    Errors.warn((SubLObject)at_utilities.$str88$_A_is_not_a__A, tv_var, (SubLObject)at_utilities.$sym89$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)at_utilities.$str93$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)at_utilities.$str91$continue_anyway, (SubLObject)at_utilities.$str88$_A_is_not_a__A, tv_var, (SubLObject)at_utilities.$sym89$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$110 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$111 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_utilities.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                if (at_utilities.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || at_utilities.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module((SubLObject)at_utilities.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$111 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$112 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$114 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_utilities.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(reln, (SubLObject)at_utilities.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(reln, sbhl_search_vars.genl_inverse_mode_p()); at_utilities.NIL != node_and_predicate_mode && at_utilities.NIL == found_oneP; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$115 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject genl_pred = node_var_$115;
                                            final SubLObject _prev_bind_0_$112 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverse_mode = predicate_mode;
                                                if (at_utilities.NIL != some_inter_arg_isa_assertion_somewhereP(genl_pred)) {
                                                    found_oneP = (SubLObject)at_utilities.T;
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$113;
                                                SubLObject _prev_bind_1_$113;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$114;
                                                SubLObject iteration_state_$120;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$115;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$122;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$116;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = (SubLObject)at_utilities.NIL, rest = accessible_modules; at_utilities.NIL == found_oneP && at_utilities.NIL != rest; rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$113 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$113 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((at_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(at_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        node = function_terms.naut_to_nart(node_var_$115);
                                                        if (at_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)at_utilities.UNPROVIDED));
                                                            if (at_utilities.NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)at_utilities.UNPROVIDED));
                                                                if (at_utilities.NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); at_utilities.NIL == found_oneP && at_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (at_utilities.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$114 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$120 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); at_utilities.NIL == found_oneP && at_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$120); iteration_state_$120 = dictionary_contents.do_dictionary_contents_next(iteration_state_$120)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$120);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (at_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$115 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (at_utilities.NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)at_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); at_utilities.NIL == found_oneP && at_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (at_utilities.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && at_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)at_utilities.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)at_utilities.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                if (at_utilities.NIL == found_oneP) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = (SubLObject)at_utilities.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (at_utilities.NIL == found_oneP && at_utilities.NIL != csome_list_var) {
                                                                                                        if (at_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)at_utilities.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)at_utilities.UNPROVIDED);
                                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)at_utilities.$str94$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$115, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$120);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$114, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)at_utilities.FIVE_INTEGER, (SubLObject)at_utilities.$str95$attempting_to_bind_direction_link, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (at_utilities.NIL != obsolete.cnat_p(node, (SubLObject)at_utilities.UNPROVIDED)) {
                                                            new_list = ((at_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_utilities.UNPROVIDED)));
                                                            for (rest_$122 = (SubLObject)at_utilities.NIL, rest_$122 = new_list; at_utilities.NIL == found_oneP && at_utilities.NIL != rest_$122; rest_$122 = rest_$122.rest()) {
                                                                generating_fn = rest_$122.first();
                                                                _prev_bind_0_$116 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                    if (at_utilities.NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)at_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); at_utilities.NIL == found_oneP && at_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (at_utilities.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && at_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)at_utilities.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)at_utilities.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        if (at_utilities.NIL == found_oneP) {
                                                                            csome_list_var2 = sol2;
                                                                            node_vars_link_node4 = (SubLObject)at_utilities.NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (at_utilities.NIL == found_oneP && at_utilities.NIL != csome_list_var2) {
                                                                                if (at_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)at_utilities.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)at_utilities.UNPROVIDED);
                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)at_utilities.$str94$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$116, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$113, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$113, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$112, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$114, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$112, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$111, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)at_utilities.TWO_INTEGER, (SubLObject)at_utilities.$str96$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)at_utilities.UNPROVIDED)), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$111, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$110, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$109, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$117 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            found_oneP = some_inter_arg_isa_assertion_somewhereP(reln);
        }
        return found_oneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 30676L)
    public static SubLObject inter_arg_format_cache_initializedP() {
        return set.set_p(at_utilities.$some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 30828L)
    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_add_int(final SubLObject reln) {
        return set.set_add(reln, at_utilities.$some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 30982L)
    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_remove_int(final SubLObject reln) {
        return set.set_remove(reln, at_utilities.$some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 31144L)
    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_maybe_remove_int(final SubLObject reln) {
        SubLObject count = (SubLObject)at_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
        SubLObject ind_argnum = (SubLObject)at_utilities.NIL;
        ind_argnum = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$125 = czer_vars.$arg_positions$.getGlobalValue();
            SubLObject dep_argnum = (SubLObject)at_utilities.NIL;
            dep_argnum = cdolist_list_var_$125.first();
            while (at_utilities.NIL != cdolist_list_var_$125) {
                final SubLObject inter_arg_format_pred = kb_accessors.inter_arg_format_pred(ind_argnum, dep_argnum);
                if (at_utilities.NIL != inter_arg_format_pred) {
                    count = Numbers.add(count, kb_indexing.num_gaf_arg_index(reln, (SubLObject)at_utilities.ONE_INTEGER, inter_arg_format_pred, (SubLObject)at_utilities.UNPROVIDED));
                }
                cdolist_list_var_$125 = cdolist_list_var_$125.rest();
                dep_argnum = cdolist_list_var_$125.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            ind_argnum = cdolist_list_var.first();
        }
        if (count.numLE((SubLObject)at_utilities.ONE_INTEGER)) {
            return some_inter_arg_format_assertion_somewhere_cache_remove_int(reln);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 31689L)
    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_add(final SubLObject reln) {
        if (at_utilities.NIL != inter_arg_format_cache_initializedP()) {
            return some_inter_arg_format_assertion_somewhere_cache_add_int(reln);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 31926L)
    public static SubLObject some_inter_arg_format_assertion_somewhere_cache_maybe_remove(final SubLObject reln) {
        if (at_utilities.NIL != inter_arg_format_cache_initializedP()) {
            return some_inter_arg_format_assertion_somewhere_cache_maybe_remove_int(reln);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 32144L)
    public static SubLObject clear_some_inter_arg_format_assertion_somewhere_cache() {
        if (at_utilities.NIL != set.set_p(at_utilities.$some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue())) {
            set.clear_set(at_utilities.$some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
        }
        else {
            at_utilities.$some_inter_arg_format_assertion_somewhere_cache$.setGlobalValue(set.new_set((SubLObject)at_utilities.EQL, (SubLObject)at_utilities.UNPROVIDED));
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 32466L)
    public static SubLObject initialize_some_inter_arg_format_assertion_somewhere_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_some_inter_arg_format_assertion_somewhere_cache();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_utilities.$sym77$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_utilities.$const78$EverythingPSC, thread);
            final SubLObject list_var = czer_vars.$arg_positions$.getGlobalValue();
            final SubLObject _prev_bind_0_$126 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$127 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)at_utilities.$str98$Initializing___interArgFormat_cac, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)at_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)at_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject ind_argnum = (SubLObject)at_utilities.NIL;
                    ind_argnum = csome_list_var.first();
                    while (at_utilities.NIL != csome_list_var) {
                        SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
                        SubLObject dep_argnum = (SubLObject)at_utilities.NIL;
                        dep_argnum = cdolist_list_var.first();
                        while (at_utilities.NIL != cdolist_list_var) {
                            final SubLObject inter_arg_format_pred = kb_accessors.inter_arg_format_pred(ind_argnum, dep_argnum);
                            if (at_utilities.NIL != inter_arg_format_pred) {
                                final SubLObject pred_var = inter_arg_format_pred;
                                if (at_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    final SubLObject str = (SubLObject)at_utilities.NIL;
                                    final SubLObject _prev_bind_0_$127 = utilities_macros.$progress_start_time$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$128 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$130 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$131 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                                    final SubLObject _prev_bind_4_$132 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                                    final SubLObject _prev_bind_5_$133 = utilities_macros.$progress_count$.currentBinding(thread);
                                    final SubLObject _prev_bind_6_$134 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                                    final SubLObject _prev_bind_7_$135 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                    try {
                                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                        utilities_macros.$progress_notification_count$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
                                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
                                        utilities_macros.$progress_count$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
                                        utilities_macros.$is_noting_progressP$.bind((SubLObject)at_utilities.T, thread);
                                        utilities_macros.$silent_progressP$.bind((SubLObject)((at_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : at_utilities.T), thread);
                                        utilities_macros.noting_progress_preamble(str);
                                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = (SubLObject)at_utilities.NIL;
                                        final SubLObject token_var = (SubLObject)at_utilities.NIL;
                                        while (at_utilities.NIL == done_var) {
                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                            if (at_utilities.NIL != valid) {
                                                utilities_macros.note_progress();
                                                SubLObject final_index_iterator = (SubLObject)at_utilities.NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_utilities.$kw81$GAF, (SubLObject)at_utilities.$kw75$TRUE, (SubLObject)at_utilities.NIL);
                                                    SubLObject done_var_$136 = (SubLObject)at_utilities.NIL;
                                                    final SubLObject token_var_$137 = (SubLObject)at_utilities.NIL;
                                                    while (at_utilities.NIL == done_var_$136) {
                                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$137);
                                                        final SubLObject valid_$138 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$137.eql(ass));
                                                        if (at_utilities.NIL != valid_$138) {
                                                            final SubLObject reln = assertions_high.gaf_arg1(ass);
                                                            some_inter_arg_format_assertion_somewhere_cache_add_int(reln);
                                                        }
                                                        done_var_$136 = (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL == valid_$138);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$128 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_utilities.T, thread);
                                                        final SubLObject _values = Values.getValuesAsVector();
                                                        if (at_utilities.NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                        Values.restoreValuesFromVector(_values);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$128, thread);
                                                    }
                                                }
                                            }
                                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL == valid);
                                        }
                                        utilities_macros.noting_progress_postamble();
                                    }
                                    finally {
                                        utilities_macros.$silent_progressP$.rebind(_prev_bind_7_$135, thread);
                                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_6_$134, thread);
                                        utilities_macros.$progress_count$.rebind(_prev_bind_5_$133, thread);
                                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$132, thread);
                                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$131, thread);
                                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$130, thread);
                                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$128, thread);
                                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$127, thread);
                                    }
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            dep_argnum = cdolist_list_var.first();
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)at_utilities.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        ind_argnum = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$129 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$127, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$126, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return set.set_size(at_utilities.$some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 33115L)
    public static SubLObject some_inter_arg_format_assertion_somewhereP(final SubLObject reln) {
        return set.set_memberP(reln, at_utilities.$some_inter_arg_format_assertion_somewhere_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 33260L)
    public static SubLObject some_inter_arg_format_constraint_somewhereP(final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found_oneP = (SubLObject)at_utilities.NIL;
        if (at_utilities.NIL != fort_types_interface.predicateP(reln)) {
            if (at_utilities.NIL == found_oneP) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module(at_utilities.$const82$genlPreds);
                final SubLObject deck_type = (SubLObject)((at_utilities.$kw83$DEPTH == at_utilities.$kw83$DEPTH) ? at_utilities.$kw84$STACK : at_utilities.$kw85$QUEUE);
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = (SubLObject)at_utilities.NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)at_utilities.NIL;
                        final SubLObject _prev_bind_0_$141 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((at_utilities.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((at_utilities.NIL != tv_var) ? at_utilities.$sym86$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (at_utilities.NIL != tv_var && at_utilities.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && at_utilities.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)at_utilities.$kw87$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)at_utilities.ONE_INTEGER, (SubLObject)at_utilities.$str88$_A_is_not_a__A, tv_var, (SubLObject)at_utilities.$sym89$SBHL_TRUE_TV_P, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)at_utilities.$kw90$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)at_utilities.ONE_INTEGER, (SubLObject)at_utilities.$str91$continue_anyway, (SubLObject)at_utilities.$str88$_A_is_not_a__A, tv_var, (SubLObject)at_utilities.$sym89$SBHL_TRUE_TV_P, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)at_utilities.$kw92$WARN)) {
                                    Errors.warn((SubLObject)at_utilities.$str88$_A_is_not_a__A, tv_var, (SubLObject)at_utilities.$sym89$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)at_utilities.$str93$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)at_utilities.$str91$continue_anyway, (SubLObject)at_utilities.$str88$_A_is_not_a__A, tv_var, (SubLObject)at_utilities.$sym89$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$142 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$143 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_utilities.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                if (at_utilities.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || at_utilities.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module((SubLObject)at_utilities.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$143 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$144 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$146 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_utilities.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(reln, (SubLObject)at_utilities.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(reln, sbhl_search_vars.genl_inverse_mode_p()); at_utilities.NIL != node_and_predicate_mode && at_utilities.NIL == found_oneP; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$147 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject genl_pred = node_var_$147;
                                            final SubLObject _prev_bind_0_$144 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverse_mode = predicate_mode;
                                                if (at_utilities.NIL != some_inter_arg_format_assertion_somewhereP(genl_pred)) {
                                                    found_oneP = (SubLObject)at_utilities.T;
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$145;
                                                SubLObject _prev_bind_1_$145;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$146;
                                                SubLObject iteration_state_$152;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$147;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$154;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$148;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = (SubLObject)at_utilities.NIL, rest = accessible_modules; at_utilities.NIL == found_oneP && at_utilities.NIL != rest; rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$145 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$145 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((at_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(at_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        node = function_terms.naut_to_nart(node_var_$147);
                                                        if (at_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)at_utilities.UNPROVIDED));
                                                            if (at_utilities.NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)at_utilities.UNPROVIDED));
                                                                if (at_utilities.NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); at_utilities.NIL == found_oneP && at_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (at_utilities.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$146 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$152 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); at_utilities.NIL == found_oneP && at_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$152); iteration_state_$152 = dictionary_contents.do_dictionary_contents_next(iteration_state_$152)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$152);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (at_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$147 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (at_utilities.NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)at_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); at_utilities.NIL == found_oneP && at_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (at_utilities.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && at_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)at_utilities.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)at_utilities.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                if (at_utilities.NIL == found_oneP) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = (SubLObject)at_utilities.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (at_utilities.NIL == found_oneP && at_utilities.NIL != csome_list_var) {
                                                                                                        if (at_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)at_utilities.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)at_utilities.UNPROVIDED);
                                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)at_utilities.$str94$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$147, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$152);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$146, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)at_utilities.FIVE_INTEGER, (SubLObject)at_utilities.$str95$attempting_to_bind_direction_link, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (at_utilities.NIL != obsolete.cnat_p(node, (SubLObject)at_utilities.UNPROVIDED)) {
                                                            new_list = ((at_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_utilities.UNPROVIDED)));
                                                            for (rest_$154 = (SubLObject)at_utilities.NIL, rest_$154 = new_list; at_utilities.NIL == found_oneP && at_utilities.NIL != rest_$154; rest_$154 = rest_$154.rest()) {
                                                                generating_fn = rest_$154.first();
                                                                _prev_bind_0_$148 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                    if (at_utilities.NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)at_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); at_utilities.NIL == found_oneP && at_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (at_utilities.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && at_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)at_utilities.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)at_utilities.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        if (at_utilities.NIL == found_oneP) {
                                                                            csome_list_var2 = sol2;
                                                                            node_vars_link_node4 = (SubLObject)at_utilities.NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (at_utilities.NIL == found_oneP && at_utilities.NIL != csome_list_var2) {
                                                                                if (at_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)at_utilities.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)at_utilities.UNPROVIDED);
                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)at_utilities.$str94$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$148, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$145, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$145, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$144, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$146, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$144, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$143, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)at_utilities.TWO_INTEGER, (SubLObject)at_utilities.$str96$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)at_utilities.UNPROVIDED)), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$143, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$142, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$141, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$149 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$149, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            found_oneP = some_inter_arg_format_assertion_somewhereP(reln);
        }
        return found_oneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 33742L)
    public static SubLObject reln_permits_generic_arg_variablesP(final SubLObject relation, final SubLObject arg_isa_pred) {
        return reln_constrained_to_be_collectionP(relation, arg_isa_pred, at_utilities.$const99$GenericArgTemplate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 34056L)
    public static SubLObject reln_permits_keyword_variablesP(final SubLObject relation, final SubLObject arg_isa_pred) {
        return reln_constrained_to_be_collectionP(relation, arg_isa_pred, at_utilities.$const100$KeywordVariableTemplate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 34332L)
    public static SubLObject reln_constrained_to_be_collectionP(final SubLObject relation, final SubLObject arg_isa_pred, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_utilities.NIL != forts.fort_p(arg_isa_pred)) {
            SubLObject constrained_argnum = constraint_pred_constraint_argnum(arg_isa_pred);
            if (at_utilities.NIL == constrained_argnum) {
                constrained_argnum = (SubLObject)at_utilities.TWO_INTEGER;
            }
            return genls.genl_of_any_argP(collection, relation, arg_isa_pred, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)at_utilities.ONE_INTEGER, constrained_argnum, (SubLObject)at_utilities.UNPROVIDED);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 34861L)
    public static SubLObject constraint_pred_constraint_argnum(final SubLObject pred) {
        if (at_utilities.NIL != subl_promotions.memberP(pred, czer_vars.$arg_isa_binary_preds$.getGlobalValue(), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != subl_promotions.memberP(pred, czer_vars.$arg_not_isa_binary_preds$.getGlobalValue(), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != subl_promotions.memberP(pred, czer_vars.$arg_quoted_isa_binary_preds$.getGlobalValue(), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != subl_promotions.memberP(pred, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != subl_promotions.memberP(pred, czer_vars.$arg_format_binary_preds$.getGlobalValue(), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED)) {
            return (SubLObject)at_utilities.TWO_INTEGER;
        }
        if (at_utilities.NIL != subl_promotions.memberP(pred, czer_vars.$arg_isa_ternary_preds$.getGlobalValue(), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != subl_promotions.memberP(pred, czer_vars.$arg_not_isa_ternary_preds$.getGlobalValue(), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != subl_promotions.memberP(pred, czer_vars.$arg_quoted_isa_ternary_preds$.getGlobalValue(), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != subl_promotions.memberP(pred, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) || at_utilities.NIL != subl_promotions.memberP(pred, czer_vars.$arg_format_ternary_preds$.getGlobalValue(), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED)) {
            return (SubLObject)at_utilities.THREE_INTEGER;
        }
        if (at_utilities.NIL != fort_types_interface.isa_arg_type_binary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()) || at_utilities.NIL != fort_types_interface.isa_arg_quoted_isa_binary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()) || at_utilities.NIL != fort_types_interface.isa_arg_format_binary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue())) {
            return (SubLObject)at_utilities.TWO_INTEGER;
        }
        if (at_utilities.NIL != fort_types_interface.isa_arg_type_ternary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()) || at_utilities.NIL != fort_types_interface.isa_arg_quoted_isa_ternary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue()) || at_utilities.NIL != fort_types_interface.isa_arg_format_ternary_predicateP(pred, mt_vars.$anect_mt$.getGlobalValue())) {
            return (SubLObject)at_utilities.THREE_INTEGER;
        }
        at_error((SubLObject)at_utilities.THREE_INTEGER, (SubLObject)at_utilities.$str101$got_an_arg_type_predicate___s__th, pred, mt_vars.$anect_mt$.getGlobalValue(), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 36342L)
    public static SubLObject gaf_arg_type_constraint(final SubLObject assertion) {
        final SubLObject argnum = constraint_pred_constraint_argnum(assertions_high.gaf_arg(assertion, (SubLObject)at_utilities.ZERO_INTEGER));
        if (argnum.isInteger()) {
            return assertions_high.gaf_arg(assertion, argnum);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 36698L)
    public static SubLObject gather_at_data(final SubLObject assertion, final SubLObject constraint, SubLObject type, SubLObject v_term) {
        if (type == at_utilities.UNPROVIDED) {
            type = (SubLObject)at_utilities.$kw65$ISA;
        }
        if (v_term == at_utilities.UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_utilities.NIL == at_vars.$within_at_suggestionP$.getDynamicValue(thread)) {
            gather_at_constraint(constraint, type, v_term);
            gather_at_assertion(assertion, type, v_term);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 37038L)
    public static SubLObject gather_at_data_assertion(final SubLObject assertion, SubLObject type, SubLObject v_term) {
        if (type == at_utilities.UNPROVIDED) {
            type = at_vars.$at_constraint_type$.getDynamicValue();
        }
        if (v_term == at_utilities.UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_utilities.NIL == at_vars.$within_at_suggestionP$.getDynamicValue(thread)) {
            gather_at_assertion(assertion, type, v_term);
            if (control_vars.$mapping_gather_arg$.getDynamicValue(thread).isInteger()) {
                final SubLObject constraint = assertions_high.gaf_arg(assertion, control_vars.$mapping_gather_arg$.getDynamicValue(thread));
                if (at_utilities.NIL != forts.fort_p(constraint)) {
                    gather_at_constraint(constraint, type, v_term);
                }
            }
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 37465L)
    public static SubLObject gather_at_constraint(final SubLObject constraint, SubLObject type, SubLObject v_term) {
        if (type == at_utilities.UNPROVIDED) {
            type = (SubLObject)at_utilities.$kw65$ISA;
        }
        if (v_term == at_utilities.UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_utilities.NIL != at_vars.$gather_at_constraintsP$.getDynamicValue(thread) && (at_utilities.NIL == at_vars.$at_profile_term$.getDynamicValue(thread) || v_term.equal(at_vars.$at_profile_term$.getDynamicValue(thread)))) {
            final SubLObject pcase_var = type;
            if (pcase_var.eql((SubLObject)at_utilities.$kw65$ISA)) {
                hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_isa_constraints$.getDynamicValue(thread));
            }
            else if (pcase_var.eql((SubLObject)at_utilities.$kw68$GENLS)) {
                hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_genl_constraints$.getDynamicValue(thread));
            }
            else if (pcase_var.eql((SubLObject)at_utilities.$kw102$FORMAT)) {
                hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_format_constraints$.getDynamicValue(thread));
            }
            else if (pcase_var.eql((SubLObject)at_utilities.$kw103$DIFFERENT)) {
                hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_different_constraints$.getDynamicValue(thread));
            }
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 38139L)
    public static SubLObject gather_at_assertion(final SubLObject constraint, SubLObject type, SubLObject v_term) {
        if (type == at_utilities.UNPROVIDED) {
            type = (SubLObject)at_utilities.$kw65$ISA;
        }
        if (v_term == at_utilities.UNPROVIDED) {
            v_term = at_vars.$at_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_utilities.NIL != at_vars.$gather_at_assertionsP$.getDynamicValue(thread) && (at_utilities.NIL == at_vars.$at_profile_term$.getDynamicValue(thread) || v_term.equal(at_vars.$at_profile_term$.getDynamicValue(thread)))) {
            final SubLObject pcase_var = type;
            if (pcase_var.eql((SubLObject)at_utilities.$kw65$ISA)) {
                hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_isa_assertions$.getDynamicValue(thread));
            }
            else if (pcase_var.eql((SubLObject)at_utilities.$kw68$GENLS)) {
                hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_genl_assertions$.getDynamicValue(thread));
            }
            else if (pcase_var.eql((SubLObject)at_utilities.$kw102$FORMAT)) {
                hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_format_assertions$.getDynamicValue(thread));
            }
            else if (pcase_var.eql((SubLObject)at_utilities.$kw103$DIFFERENT)) {
                hash_table_utilities.push_hash(v_term, constraint, at_vars.$at_different_constraints$.getDynamicValue(thread));
            }
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 38773L)
    public static SubLObject at_finishedP(SubLObject at_violationsP) {
        if (at_violationsP == at_utilities.UNPROVIDED) {
            at_violationsP = at_vars.$at_result$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL != at_violationsP && at_utilities.NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread) && at_utilities.NIL == at_vars.$gather_at_constraintsP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 39037L)
    public static SubLObject at_finished(SubLObject result) {
        if (result == at_utilities.UNPROVIDED) {
            result = (SubLObject)at_utilities.NIL;
        }
        if (at_utilities.NIL != result) {
            at_vars.$at_result$.setDynamicValue(result);
        }
        at_mapping_finished();
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 39168L)
    public static SubLObject at_mapping_finished() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_utilities.NIL != at_vars.$within_at_mappingP$.getDynamicValue(thread)) {
            Dynamic.sublisp_throw((SubLObject)at_utilities.$kw104$AT_MAPPING_DONE, (SubLObject)at_utilities.NIL);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 39287L)
    public static SubLObject at_handle_mal_constraint(final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        at_vars.$at_result$.setDynamicValue((SubLObject)at_utilities.T, thread);
        if (at_utilities.NIL == at_vars.$within_at_suggestionP$.getDynamicValue(thread)) {
            final SubLObject at_trace_fn = (at_utilities.NIL != at_vars.$at_break_on_failureP$.getDynamicValue(thread)) ? Symbols.symbol_function((SubLObject)at_utilities.$sym105$AT_ERROR) : Symbols.symbol_function((SubLObject)at_utilities.$sym106$AT_NOTE);
            final SubLObject at_trace_level = (SubLObject)((at_utilities.NIL != at_vars.$at_break_on_failureP$.getDynamicValue(thread)) ? at_utilities.ONE_INTEGER : at_utilities.THREE_INTEGER);
            if (at_utilities.ZERO_INTEGER.numE(at_vars.$at_argnum$.getDynamicValue(thread))) {
                Functions.funcall(at_trace_fn, at_trace_level, (SubLObject)at_utilities.$str107$__at_test_fails___s_fails__s_cons, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_pred$.getDynamicValue(thread), constraint);
            }
            else {
                Functions.funcall(at_trace_fn, new SubLObject[] { at_trace_level, at_utilities.$str108$__at_test_fails___s_fails__s_cons, at_vars.$at_arg$.getDynamicValue(thread), at_vars.$at_pred$.getDynamicValue(thread), constraint, at_vars.$at_argnum$.getDynamicValue(thread), at_vars.$at_reln$.getDynamicValue(thread) });
            }
            if (at_utilities.NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                note_at_violation(at_mal_arg_msg(constraint));
            }
        }
        if (at_utilities.NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
            at_finished((SubLObject)at_utilities.UNPROVIDED);
        }
        return at_vars.$at_result$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 40108L)
    public static SubLObject at_mal_arg_msg(final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = at_vars.$at_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)at_utilities.$kw109$IRREFLEXIVE_PREDICATE)) {
            return predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql((SubLObject)at_utilities.$kw110$ASYMMETRIC_PREDICATE)) {
            return predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql((SubLObject)at_utilities.$kw111$ANTI_SYMMETRIC_PREDICATE)) {
            return predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql((SubLObject)at_utilities.$kw112$ANTI_TRANSITIVE_PREDICATE)) {
            return predicate_isa_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql((SubLObject)at_utilities.$kw113$NEGATION_PREDS)) {
            return meta_predicate_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql((SubLObject)at_utilities.$kw114$NEGATION_INVERSES)) {
            return meta_predicate_violation_data(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        at_error((SubLObject)at_utilities.FIVE_INTEGER, (SubLObject)at_utilities.$str115$illegal_value_of__at_mode____s, at_vars.$at_mode$.getDynamicValue(thread), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 40824L)
    public static SubLObject predicate_isa_violation_data(final SubLObject col, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list((SubLObject)at_utilities.$kw116$PREDICATE_ISA_VIOLATION, at_vars.$at_reln$.getDynamicValue(thread), col, mt, at_vars.$at_predicate_violations$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 40973L)
    public static SubLObject meta_predicate_violation_data(final SubLObject meta_pred_value, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list((SubLObject)at_utilities.$kw117$META_PREDICATE_VIOLATION, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_pred$.getDynamicValue(thread), meta_pred_value, mt, at_vars.$at_predicate_violations$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 41158L)
    public static SubLObject semantic_violations() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.nreverse(Sequences.cconcatenate(wff_vars.$arity_violations$.getDynamicValue(thread), new SubLObject[] { at_vars.$at_violations$.getDynamicValue(thread), czer_vars.$semantic_violations$.getDynamicValue(thread) }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 41292L)
    public static SubLObject note_at_violationP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread) && (at_utilities.NIL == at_vars.$at_violations$.getDynamicValue(thread) || at_utilities.NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 41444L)
    public static SubLObject note_at_violation(final SubLObject note) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_utilities.NIL != wff_vars.wff_debugP()) {
            print_high.print(note, (SubLObject)at_utilities.UNPROVIDED);
        }
        if (at_utilities.NIL != note_at_violationP()) {
            at_vars.$current_at_violation$.setDynamicValue(note, thread);
            if (at_utilities.NIL == recursive_violationP(note) && at_utilities.NIL == conses_high.member(note, at_vars.$at_violations$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)at_utilities.EQUAL), Symbols.symbol_function((SubLObject)at_utilities.IDENTITY))) {
                at_vars.$at_violations$.setDynamicValue((SubLObject)ConsesLow.cons(note, at_vars.$at_violations$.getDynamicValue(thread)), thread);
            }
        }
        return at_vars.$at_violations$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 41712L)
    public static SubLObject recursive_violationP(final SubLObject note) {
        final SubLObject pcase_var = note.first();
        if (pcase_var.eql((SubLObject)at_utilities.$kw118$MAL_ARG_WRT_COL_DEFN)) {
            return Equality.eql(conses_high.fifth(note), at_utilities.$const119$CycLSentence_Assertible);
        }
        if (pcase_var.eql((SubLObject)at_utilities.$kw120$MAL_ARG_WRT_NEC_DEFN)) {
            return Equality.eql(conses_high.third(note), at_utilities.$const119$CycLSentence_Assertible);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 41940L)
    public static SubLObject reset_at_violations(SubLObject do_itP) {
        if (do_itP == at_utilities.UNPROVIDED) {
            do_itP = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_utilities.NIL != do_itP) {
            at_vars.$at_violations$.setDynamicValue((SubLObject)at_utilities.NIL, thread);
        }
        else if (at_utilities.NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
            if (at_utilities.NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                at_vars.$at_violations$.setDynamicValue((SubLObject)at_utilities.NIL, thread);
            }
        }
        return at_vars.$at_violations$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 42159L)
    public static SubLObject reset_arity_violations(SubLObject do_itP) {
        if (do_itP == at_utilities.UNPROVIDED) {
            do_itP = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_utilities.NIL != do_itP) {
            wff_vars.$arity_violations$.setDynamicValue((SubLObject)at_utilities.NIL, thread);
        }
        else if (at_utilities.NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
            if (at_utilities.NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                wff_vars.$arity_violations$.setDynamicValue((SubLObject)at_utilities.NIL, thread);
            }
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 42374L)
    public static SubLObject reset_semantic_violations(SubLObject do_itP) {
        if (do_itP == at_utilities.UNPROVIDED) {
            do_itP = (SubLObject)at_utilities.NIL;
        }
        czer_vars.$semantic_violations$.setDynamicValue((SubLObject)at_utilities.NIL);
        reset_at_violations(do_itP);
        reset_arity_violations(do_itP);
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 42552L)
    public static SubLObject reset_at_state() {
        reset_arity_violations((SubLObject)at_utilities.T);
        reset_at_violations((SubLObject)at_utilities.T);
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 42681L)
    public static SubLObject suggest_formula_fix_for_at_violation(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$within_at_suggestionP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        try {
            at_vars.$within_at_suggestionP$.bind((SubLObject)at_utilities.T, thread);
            wff_vars.$provide_wff_suggestionsP$.bind((SubLObject)at_utilities.NIL, thread);
            at_vars.$gather_at_constraintsP$.bind((SubLObject)at_utilities.NIL, thread);
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_utilities.NIL, thread);
            final SubLObject violations = at_vars.$at_violations$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$157 = wff_vars.$wff_violations$.currentBinding(thread);
            try {
                wff_vars.$wff_violations$.bind((SubLObject)at_utilities.NIL, thread);
                final SubLObject accommodating_mts = mts_accommodating_formula_wrt_types(formula);
                if (at_utilities.NIL != accommodating_mts) {
                    wff.note_wff_suggestion((SubLObject)ConsesLow.list((SubLObject)at_utilities.$kw121$CHANGE_MT, formula, mt, accommodating_mts));
                }
                SubLObject cdolist_list_var = assertion_arg_violations_among(violations);
                SubLObject assertion_arg_violation = (SubLObject)at_utilities.NIL;
                assertion_arg_violation = cdolist_list_var.first();
                while (at_utilities.NIL != cdolist_list_var) {
                    assertion_arg_violation_fix(assertion_arg_violation);
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion_arg_violation = cdolist_list_var.first();
                }
                cdolist_list_var = sef_violations_among(violations);
                SubLObject sef_violation = (SubLObject)at_utilities.NIL;
                sef_violation = cdolist_list_var.first();
                while (at_utilities.NIL != cdolist_list_var) {
                    sef_violation_fix(sef_violation);
                    cdolist_list_var = cdolist_list_var.rest();
                    sef_violation = cdolist_list_var.first();
                }
                cdolist_list_var = predicate_violations_among(violations);
                SubLObject pred_violation = (SubLObject)at_utilities.NIL;
                pred_violation = cdolist_list_var.first();
                while (at_utilities.NIL != cdolist_list_var) {
                    predicate_violation_fix(pred_violation);
                    cdolist_list_var = cdolist_list_var.rest();
                    pred_violation = cdolist_list_var.first();
                }
            }
            finally {
                wff_vars.$wff_violations$.rebind(_prev_bind_0_$157, thread);
            }
        }
        finally {
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_4, thread);
            at_vars.$gather_at_constraintsP$.rebind(_prev_bind_3, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_2, thread);
            at_vars.$within_at_suggestionP$.rebind(_prev_bind_0, thread);
        }
        return wff.wff_suggestions();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 43587L)
    public static SubLObject assertion_arg_violations_among(final SubLObject violations) {
        return list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)at_utilities.$sym122$ASSERTION_ARG_VIOLATION_), violations, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 43711L)
    public static SubLObject sef_violations_among(final SubLObject violations) {
        return list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)at_utilities.$sym123$SEF_VIOLATION_), violations, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 43817L)
    public static SubLObject predicate_violations_among(final SubLObject violations) {
        return list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)at_utilities.$sym124$PREDICATE_VIOLATION_), violations, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 43933L)
    public static SubLObject assertion_arg_violationP(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql((SubLObject)at_utilities.$kw125$MAL_ARG_WRT_IFF_DEFN)) {
            SubLObject current;
            final SubLObject datum = current = violation.rest();
            SubLObject arg = (SubLObject)at_utilities.NIL;
            SubLObject reln = (SubLObject)at_utilities.NIL;
            SubLObject argnum = (SubLObject)at_utilities.NIL;
            SubLObject col = (SubLObject)at_utilities.NIL;
            SubLObject defn = (SubLObject)at_utilities.NIL;
            SubLObject mt = (SubLObject)at_utilities.NIL;
            SubLObject data = (SubLObject)at_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list126);
            arg = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list126);
            reln = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list126);
            argnum = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list126);
            col = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list126);
            defn = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list126);
            mt = current.first();
            current = (data = current.rest());
            return (SubLObject)SubLObjectFactory.makeBoolean(at_utilities.NIL != kb_utilities.kbeq(defn, (SubLObject)at_utilities.$sym127$CYC_ASSERTION) || at_utilities.NIL != assertion_collectionP(col, mt));
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 44251L)
    public static SubLObject assertion_collectionP(final SubLObject thing, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (thing.eql(at_utilities.$const128$CycLAssertion)) {
            return (SubLObject)at_utilities.T;
        }
        SubLObject v_boolean = (SubLObject)at_utilities.NIL;
        v_boolean = genls.genlP(thing, at_utilities.$const128$CycLAssertion, mt, (SubLObject)at_utilities.UNPROVIDED);
        return v_boolean;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 44496L)
    public static SubLObject sef_violationP(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql((SubLObject)at_utilities.$kw129$MAL_ARG_WRT_ARG_FORMAT)) {
            return (SubLObject)at_utilities.T;
        }
        if (pcase_var.eql((SubLObject)at_utilities.$kw130$MAL_ARG_WRT_INTER_ARG_FORMAT)) {
            return (SubLObject)at_utilities.T;
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 44660L)
    public static SubLObject predicate_violationP(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql((SubLObject)at_utilities.$kw116$PREDICATE_ISA_VIOLATION)) {
            return (SubLObject)at_utilities.T;
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 44787L)
    public static SubLObject assertion_arg_violation_fix(final SubLObject violation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = violation.rest();
        SubLObject arg = (SubLObject)at_utilities.NIL;
        SubLObject reln = (SubLObject)at_utilities.NIL;
        SubLObject argnum = (SubLObject)at_utilities.NIL;
        SubLObject col = (SubLObject)at_utilities.NIL;
        SubLObject defn = (SubLObject)at_utilities.NIL;
        SubLObject mt = (SubLObject)at_utilities.NIL;
        SubLObject data = (SubLObject)at_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list126);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list126);
        reln = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list126);
        argnum = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list126);
        col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list126);
        defn = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list126);
        mt = current.first();
        current = (data = current.rest());
        final SubLObject formula = strip_mt_literals(arg, (SubLObject)at_utilities.UNPROVIDED);
        SubLObject assertions = (SubLObject)at_utilities.NIL;
        SubLObject candidate_mts = (SubLObject)at_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_utilities.$sym77$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_utilities.$const78$EverythingPSC, thread);
            assertions = czer_meta.find_assertions_cycl(formula, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)at_utilities.NIL;
        assertion = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            candidate_mts = (SubLObject)ConsesLow.cons(assertions_high.assertion_mt(assertion), candidate_mts);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        cdolist_list_var = candidate_mts;
        SubLObject candidate_mt = (SubLObject)at_utilities.NIL;
        candidate_mt = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            wff.note_wff_suggestion((SubLObject)ConsesLow.list((SubLObject)at_utilities.$kw131$REPLACE_TERM, arg, el_utilities.make_binary_formula(at_utilities.$const132$ist, candidate_mt, formula)));
            cdolist_list_var = cdolist_list_var.rest();
            candidate_mt = cdolist_list_var.first();
        }
        return wff.wff_suggestions();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 45371L)
    public static SubLObject strip_mt_literals(final SubLObject formula, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (at_utilities.NIL != el_utilities.mt_designating_literalP(formula) && at_utilities.NIL != fort_types_interface.mtP(el_utilities.designated_mt(formula))) {
                result = strip_mt_literals(el_utilities.designated_sentence(formula), el_utilities.designated_mt(formula));
            }
            else {
                result = formula;
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 45695L)
    public static SubLObject sef_violation_fix(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql((SubLObject)at_utilities.$kw129$MAL_ARG_WRT_ARG_FORMAT)) {
            SubLObject current;
            final SubLObject datum = current = violation.rest();
            SubLObject arg = (SubLObject)at_utilities.NIL;
            SubLObject rel = (SubLObject)at_utilities.NIL;
            SubLObject pos = (SubLObject)at_utilities.NIL;
            SubLObject format = (SubLObject)at_utilities.NIL;
            SubLObject mt = (SubLObject)at_utilities.NIL;
            SubLObject violations = (SubLObject)at_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list133);
            arg = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list133);
            rel = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list133);
            pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list133);
            format = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list133);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list133);
            violations = current.first();
            current = current.rest();
            final SubLObject via = (SubLObject)(current.isCons() ? current.first() : at_utilities.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)at_utilities.$list133);
            current = current.rest();
            if (at_utilities.NIL == current) {
                if (at_utilities.NIL != forts.fort_p(arg)) {
                    SubLObject cdolist_list_var = violations;
                    SubLObject assertion = (SubLObject)at_utilities.NIL;
                    assertion = cdolist_list_var.first();
                    while (at_utilities.NIL != cdolist_list_var) {
                        final SubLObject rival = assertions_high.gaf_arg(assertion, pos);
                        wff.note_wff_suggestion((SubLObject)ConsesLow.list((SubLObject)at_utilities.$kw134$ASSERT, (SubLObject)ConsesLow.list(at_utilities.$const135$equals, arg, rival), mt));
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)at_utilities.$list133);
            }
        }
        else if (pcase_var.eql((SubLObject)at_utilities.$kw130$MAL_ARG_WRT_INTER_ARG_FORMAT)) {
            SubLObject current;
            final SubLObject datum = current = violation.rest();
            SubLObject arg = (SubLObject)at_utilities.NIL;
            SubLObject rel = (SubLObject)at_utilities.NIL;
            SubLObject pos = (SubLObject)at_utilities.NIL;
            SubLObject format = (SubLObject)at_utilities.NIL;
            SubLObject ind_arg_isa = (SubLObject)at_utilities.NIL;
            SubLObject ind_pos = (SubLObject)at_utilities.NIL;
            SubLObject ind_arg = (SubLObject)at_utilities.NIL;
            SubLObject mt2 = (SubLObject)at_utilities.NIL;
            SubLObject violations2 = (SubLObject)at_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list136);
            arg = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list136);
            rel = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list136);
            pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list136);
            format = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list136);
            ind_arg_isa = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list136);
            ind_pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list136);
            ind_arg = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list136);
            mt2 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list136);
            violations2 = current.first();
            current = current.rest();
            final SubLObject via2 = (SubLObject)(current.isCons() ? current.first() : at_utilities.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)at_utilities.$list136);
            current = current.rest();
            if (at_utilities.NIL == current) {
                if (at_utilities.NIL != forts.fort_p(arg)) {
                    SubLObject cdolist_list_var2 = violations2;
                    SubLObject assertion2 = (SubLObject)at_utilities.NIL;
                    assertion2 = cdolist_list_var2.first();
                    while (at_utilities.NIL != cdolist_list_var2) {
                        final SubLObject rival2 = assertions_high.gaf_arg(assertion2, pos);
                        wff.note_wff_suggestion((SubLObject)ConsesLow.list((SubLObject)at_utilities.$kw134$ASSERT, (SubLObject)ConsesLow.list(at_utilities.$const135$equals, arg, rival2), mt2));
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion2 = cdolist_list_var2.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)at_utilities.$list136);
            }
        }
        return wff.wff_suggestions();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 46528L)
    public static SubLObject predicate_violation_fix(final SubLObject violation) {
        final SubLObject pcase_var = violation_type(violation);
        if (pcase_var.eql((SubLObject)at_utilities.$kw116$PREDICATE_ISA_VIOLATION)) {
            SubLObject current;
            final SubLObject datum = current = violation.rest();
            SubLObject predicate = (SubLObject)at_utilities.NIL;
            SubLObject v_isa = (SubLObject)at_utilities.NIL;
            SubLObject mt = (SubLObject)at_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list137);
            predicate = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list137);
            v_isa = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_utilities.$list137);
            mt = current.first();
            current = current.rest();
            final SubLObject violations = (SubLObject)(current.isCons() ? current.first() : at_utilities.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)at_utilities.$list137);
            current = current.rest();
            if (at_utilities.NIL == current) {
                SubLObject cdolist_list_var = violations;
                SubLObject assertion = (SubLObject)at_utilities.NIL;
                assertion = cdolist_list_var.first();
                while (at_utilities.NIL != cdolist_list_var) {
                    wff.note_wff_suggestion((SubLObject)ConsesLow.list((SubLObject)at_utilities.$kw138$UNASSERT, fi.assertion_fi_ist_formula(assertion, (SubLObject)at_utilities.UNPROVIDED)));
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)at_utilities.$list137);
            }
        }
        return wff.wff_suggestions();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 46905L)
    public static SubLObject violation_type(final SubLObject violation) {
        if (violation.isCons()) {
            return violation.first();
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 47250L)
    public static SubLObject mts_accommodating_formula_wrt_types(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid_mts = (SubLObject)at_utilities.NIL;
        SubLObject candidate_mts = (SubLObject)at_utilities.NIL;
        SubLObject cdolist_list_var = list_utilities.tree_gather(formula, Symbols.symbol_function((SubLObject)at_utilities.$sym140$CONSTANT_P), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
        SubLObject arg = (SubLObject)at_utilities.NIL;
        arg = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            candidate_mts = ConsesLow.nconc(candidate_mts, isa.isa_mts(arg), genls.genls_mts(arg));
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        candidate_mts = Sort.sort(list_utilities.remove_duplicate_forts(candidate_mts), (SubLObject)at_utilities.$sym141$_, (SubLObject)at_utilities.$sym142$SPEC_CARDINALITY);
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_utilities.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_utilities.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_utilities.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_utilities.NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind((SubLObject)at_utilities.NIL, thread);
            if (at_utilities.$mts_cutoff_for_mts_accommodating_formula_wrt_types$.getDynamicValue(thread).isInteger() && at_utilities.NIL != list_utilities.lengthG(candidate_mts, at_utilities.$mts_cutoff_for_mts_accommodating_formula_wrt_types$.getDynamicValue(thread), (SubLObject)at_utilities.UNPROVIDED)) {
                candidate_mts = list_utilities.first_n(at_utilities.$mts_cutoff_for_mts_accommodating_formula_wrt_types$.getDynamicValue(thread), candidate_mts);
            }
            SubLObject cdolist_list_var2 = candidate_mts;
            SubLObject mt = (SubLObject)at_utilities.NIL;
            mt = cdolist_list_var2.first();
            while (at_utilities.NIL != cdolist_list_var2) {
                if (at_utilities.NIL == genl_mts.any_genl_mtP(mt, valid_mts, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) && at_utilities.NIL != el_utilities.el_formulaP(formula) && at_utilities.NIL != wff.el_wffP(formula, mt, (SubLObject)at_utilities.UNPROVIDED)) {
                    valid_mts = (SubLObject)ConsesLow.cons(mt, valid_mts);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                mt = cdolist_list_var2.first();
            }
        }
        finally {
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return genl_mts.max_mts(valid_mts, (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 49726L)
    public static SubLObject nat_wf_in_some_mtP(final SubLObject cnat, SubLObject mts, SubLObject validate_expansionP) {
        if (mts == at_utilities.UNPROVIDED) {
            mts = (SubLObject)at_utilities.NIL;
        }
        if (validate_expansionP == at_utilities.UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        return list_utilities.sublisp_boolean(nat_wf_in_some_mt(cnat, mts, validate_expansionP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 50086L)
    public static SubLObject nat_wf_in_some_mt(final SubLObject cnat, SubLObject mts, SubLObject validate_expansionP) {
        if (mts == at_utilities.UNPROVIDED) {
            mts = (SubLObject)at_utilities.NIL;
        }
        if (validate_expansionP == at_utilities.UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_utilities.NIL != nart_handles.nart_p(cnat)) {
            return nat_wf_in_some_mt(narts_high.nart_hl_formula(cnat), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
        }
        if (at_utilities.NIL == el_utilities.el_formula_p(cnat)) {
            return (SubLObject)at_utilities.NIL;
        }
        if (at_utilities.NIL != validate_expansionP) {
            final SubLObject nat_expansion = wff.wff_el_expansion(cnat, at_utilities.$const78$EverythingPSC);
            SubLObject wft_mt = (SubLObject)at_utilities.NIL;
            final SubLObject _prev_bind_0 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = wff_vars.$unexpanded_formula$.currentBinding(thread);
            final SubLObject _prev_bind_3 = wff_vars.$validate_expansionsP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = wff_vars.$validating_expansionP$.currentBinding(thread);
            try {
                at_vars.$relax_arg_constraints_for_disjunctionsP$.bind((SubLObject)at_utilities.NIL, thread);
                wff_vars.$unexpanded_formula$.bind(cnat, thread);
                wff_vars.$validate_expansionsP$.bind((SubLObject)at_utilities.NIL, thread);
                wff_vars.$validating_expansionP$.bind((SubLObject)at_utilities.T, thread);
                wft_mt = nat_wf_in_some_mt(nat_expansion, mts, (SubLObject)at_utilities.NIL);
            }
            finally {
                wff_vars.$validating_expansionP$.rebind(_prev_bind_4, thread);
                wff_vars.$validate_expansionsP$.rebind(_prev_bind_3, thread);
                wff_vars.$unexpanded_formula$.rebind(_prev_bind_2, thread);
                at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0, thread);
            }
            return wft_mt;
        }
        if (at_utilities.NIL != mts) {
            SubLObject wft_mt2 = (SubLObject)at_utilities.NIL;
            if (at_utilities.NIL == wft_mt2) {
                SubLObject csome_list_var = mts;
                SubLObject mt = (SubLObject)at_utilities.NIL;
                mt = csome_list_var.first();
                while (at_utilities.NIL == wft_mt2 && at_utilities.NIL != csome_list_var) {
                    if (at_utilities.NIL != wff.el_wft_fastP(cnat, mt) && (at_utilities.NIL == wff_vars.validating_expansionP() || cnat.equal(wff_vars.unexpanded_formula()) || at_utilities.NIL != wff.el_wft_fastP(wff_vars.unexpanded_formula(), mt))) {
                        wft_mt2 = mt;
                    }
                    csome_list_var = csome_list_var.rest();
                    mt = csome_list_var.first();
                }
            }
            return wft_mt2;
        }
        final SubLObject mts_$158 = nat_wf_default_mts(cnat, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
        SubLObject wft_mt = (SubLObject)at_utilities.NIL;
        if (at_utilities.NIL == wft_mt) {
            SubLObject csome_list_var2 = mts_$158;
            SubLObject mt2 = (SubLObject)at_utilities.NIL;
            mt2 = csome_list_var2.first();
            while (at_utilities.NIL == wft_mt && at_utilities.NIL != csome_list_var2) {
                if (at_utilities.NIL != wff.el_wft_fastP(cnat, mt2) && (at_utilities.NIL == wff_vars.validating_expansionP() || cnat.equal(wff_vars.unexpanded_formula()) || at_utilities.NIL != wff.el_wft_fastP(wff_vars.unexpanded_formula(), mt2))) {
                    wft_mt = mt2;
                }
                csome_list_var2 = csome_list_var2.rest();
                mt2 = csome_list_var2.first();
            }
        }
        if (at_utilities.NIL == wft_mt) {
            final SubLObject _prev_bind_0 = at_utilities.$max_floor_mts_of_nat_exceptions$.currentBinding(thread);
            try {
                at_utilities.$max_floor_mts_of_nat_exceptions$.bind(mts_$158, thread);
                wft_mt = nat_wf_in_mts(cnat, (SubLObject)at_utilities.NIL, (SubLObject)at_utilities.NIL, (SubLObject)at_utilities.ONE_INTEGER);
            }
            finally {
                at_utilities.$max_floor_mts_of_nat_exceptions$.rebind(_prev_bind_0, thread);
            }
        }
        return wft_mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 51462L)
    public static SubLObject nat_wf_default_mts(final SubLObject cnat, SubLObject independentP, SubLObject unindexedP) {
        if (independentP == at_utilities.UNPROVIDED) {
            independentP = (SubLObject)at_utilities.NIL;
        }
        if (unindexedP == at_utilities.UNPROVIDED) {
            unindexedP = (SubLObject)at_utilities.NIL;
        }
        if (at_utilities.NIL != independentP) {
            return genl_mts.min_mts(formula_forts_isa_mts(cnat, (SubLObject)at_utilities.UNPROVIDED), (SubLObject)at_utilities.UNPROVIDED);
        }
        SubLObject mt_sets = (SubLObject)at_utilities.NIL;
        SubLObject mts = (SubLObject)at_utilities.NIL;
        SubLObject cdolist_list_var = list_utilities.remove_duplicate_forts(cycl_utilities.formula_forts(cnat, (SubLObject)at_utilities.T, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED));
        SubLObject fort = (SubLObject)at_utilities.NIL;
        fort = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            if (at_utilities.NIL == kb_indexing_datastructures.unindexed_syntax_constant_p(fort) || at_utilities.NIL != unindexedP) {
                final SubLObject isa_mts = czer_main.fort_sort_by_type_and_id(isa.isa_mts(fort));
                if (at_utilities.NIL != isa_mts) {
                    final SubLObject item_var = isa_mts;
                    if (at_utilities.NIL == conses_high.member(item_var, mt_sets, Symbols.symbol_function((SubLObject)at_utilities.EQUAL), Symbols.symbol_function((SubLObject)at_utilities.IDENTITY))) {
                        mt_sets = (SubLObject)ConsesLow.cons(item_var, mt_sets);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        }
        cdolist_list_var = list_utilities.cross_products(mt_sets);
        SubLObject mt_set = (SubLObject)at_utilities.NIL;
        mt_set = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            mts = ConsesLow.nconc(mts, genl_mts.max_floor_mts(list_utilities.remove_duplicate_forts(mt_set), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            mt_set = cdolist_list_var.first();
        }
        return genl_mts.min_mts(list_utilities.remove_duplicate_forts(mts), (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 52092L)
    public static SubLObject formula_forts_isa_mts(final SubLObject formula, SubLObject unindexedP) {
        if (unindexedP == at_utilities.UNPROVIDED) {
            unindexedP = (SubLObject)at_utilities.NIL;
        }
        SubLObject mts = (SubLObject)at_utilities.NIL;
        SubLObject cdolist_list_var = list_utilities.remove_duplicate_forts(cycl_utilities.formula_forts(formula, (SubLObject)at_utilities.T, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED));
        SubLObject fort = (SubLObject)at_utilities.NIL;
        fort = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            if (at_utilities.NIL == kb_indexing_datastructures.unindexed_syntax_constant_p(fort) || at_utilities.NIL != unindexedP) {
                mts = ConsesLow.nconc(mts, isa.isa_mts(fort));
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        }
        return list_utilities.remove_duplicate_forts(mts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 52406L)
    public static SubLObject at_mt_mt_relevantP(final SubLObject mt) {
        return mt_vars.mt_mt_relevantP(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 52479L)
    public static SubLObject mts_accommodating_nat(final SubLObject cnat, SubLObject validate_expansionP, SubLObject number) {
        if (validate_expansionP == at_utilities.UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        if (number == at_utilities.UNPROVIDED) {
            number = (SubLObject)at_utilities.NIL;
        }
        return nat_wf_in_mts(cnat, (SubLObject)at_utilities.NIL, validate_expansionP, number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 52879L)
    public static SubLObject nat_wf_in_mts(final SubLObject cnat, SubLObject mt, SubLObject validate_expansionP, SubLObject number) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (validate_expansionP == at_utilities.UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        if (number == at_utilities.UNPROVIDED) {
            number = (SubLObject)at_utilities.NIL;
        }
        return max_floor_mts_of_nat(cnat, mt, validate_expansionP, number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 53373L)
    public static SubLObject clear_cached_max_floor_mts_of_nat() {
        final SubLObject cs = at_utilities.$cached_max_floor_mts_of_nat_caching_state$.getGlobalValue();
        if (at_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 53373L)
    public static SubLObject remove_cached_max_floor_mts_of_nat(final SubLObject nat, final SubLObject mt, final SubLObject validate_expansionP, final SubLObject number) {
        return memoization_state.caching_state_remove_function_results_with_args(at_utilities.$cached_max_floor_mts_of_nat_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(nat, mt, validate_expansionP, number), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 53373L)
    public static SubLObject cached_max_floor_mts_of_nat_internal(final SubLObject nat, final SubLObject mt, final SubLObject validate_expansionP, final SubLObject number) {
        return max_floor_mts_of_nat(nat, mt, validate_expansionP, number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 53373L)
    public static SubLObject cached_max_floor_mts_of_nat(final SubLObject nat, final SubLObject mt, final SubLObject validate_expansionP, final SubLObject number) {
        SubLObject caching_state = at_utilities.$cached_max_floor_mts_of_nat_caching_state$.getGlobalValue();
        if (at_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)at_utilities.$sym143$CACHED_MAX_FLOOR_MTS_OF_NAT, (SubLObject)at_utilities.$sym144$_CACHED_MAX_FLOOR_MTS_OF_NAT_CACHING_STATE_, (SubLObject)at_utilities.NIL, (SubLObject)at_utilities.EQL, (SubLObject)at_utilities.FOUR_INTEGER, (SubLObject)at_utilities.$int145$64);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(nat, mt, validate_expansionP, number);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)at_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)at_utilities.NIL;
            collision = cdolist_list_var.first();
            while (at_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (nat.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (validate_expansionP.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (at_utilities.NIL != cached_args && at_utilities.NIL == cached_args.rest() && number.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_max_floor_mts_of_nat_internal(nat, mt, validate_expansionP, number)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(nat, mt, validate_expansionP, number));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 53545L)
    public static SubLObject fast_max_floor_mts_of_nat(final SubLObject cnat, SubLObject validate_expansionP) {
        if (validate_expansionP == at_utilities.UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_utilities.NIL != nart_handles.nart_p(cnat)) {
            return fast_max_floor_mts_of_nat(narts_high.nart_hl_formula(cnat), validate_expansionP);
        }
        final SubLObject candidate_mts = nat_wf_default_mts(cnat, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
        SubLObject mts = result_of_max_floor_mts_of_nat(cnat, candidate_mts, (SubLObject)at_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = at_utilities.$max_floor_mts_of_nat_exceptions$.currentBinding(thread);
        try {
            at_utilities.$max_floor_mts_of_nat_exceptions$.bind(candidate_mts, thread);
            if (at_utilities.NIL == mts) {
                mts = max_floor_mts_of_nat(cnat, (SubLObject)at_utilities.NIL, validate_expansionP, (SubLObject)at_utilities.UNPROVIDED);
            }
        }
        finally {
            at_utilities.$max_floor_mts_of_nat_exceptions$.rebind(_prev_bind_0, thread);
        }
        return mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 54118L)
    public static SubLObject max_floor_mts_of_nat(final SubLObject nat, SubLObject mt, SubLObject validate_expansionP, SubLObject number) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (validate_expansionP == at_utilities.UNPROVIDED) {
            validate_expansionP = wff_vars.validate_expansionsP();
        }
        if (number == at_utilities.UNPROVIDED) {
            number = (SubLObject)at_utilities.NIL;
        }
        return max_floor_mts_of_naut((at_utilities.NIL != nart_handles.nart_p(nat)) ? narts_high.nart_hl_formula(nat) : nat, mt, validate_expansionP, number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 54649L)
    public static SubLObject max_floor_mts_of_naut(final SubLObject naut, final SubLObject mt, final SubLObject validate_expansionP, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_utilities.NIL != el_utilities.el_formula_p(naut)) {
            if (at_utilities.NIL != validate_expansionP) {
                final SubLObject expansion_mt = (at_utilities.NIL != mt) ? mt : at_utilities.$const78$EverythingPSC;
                final SubLObject naut_expansion = wff.wff_el_expansion(naut, expansion_mt);
                if (at_utilities.NIL == naut_expansion || naut.equal(naut_expansion)) {
                    return max_floor_mts_of_naut(naut, mt, (SubLObject)at_utilities.NIL, number);
                }
                SubLObject candidate_mts = (SubLObject)at_utilities.NIL;
                final SubLObject _prev_bind_0 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_vars.$unexpanded_formula$.currentBinding(thread);
                final SubLObject _prev_bind_3 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_vars.$validating_expansionP$.currentBinding(thread);
                try {
                    at_vars.$relax_arg_constraints_for_disjunctionsP$.bind((SubLObject)at_utilities.NIL, thread);
                    wff_vars.$unexpanded_formula$.bind(naut, thread);
                    wff_vars.$validate_expansionsP$.bind((SubLObject)at_utilities.NIL, thread);
                    wff_vars.$validating_expansionP$.bind((SubLObject)at_utilities.T, thread);
                    candidate_mts = max_floor_mts_of_nat(naut_expansion, mt, (SubLObject)at_utilities.NIL, (SubLObject)at_utilities.UNPROVIDED);
                }
                finally {
                    wff_vars.$validating_expansionP$.rebind(_prev_bind_4, thread);
                    wff_vars.$validate_expansionsP$.rebind(_prev_bind_3, thread);
                    wff_vars.$unexpanded_formula$.rebind(_prev_bind_2, thread);
                    at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0, thread);
                }
                return result_of_max_floor_mts_of_nat(naut, candidate_mts, number);
            }
            else {
                if (at_utilities.NIL == term.closed_fn_termP(naut)) {
                    if (at_utilities.NIL == wff_vars.validating_expansionP()) {
                        return (SubLObject)at_utilities.NIL;
                    }
                    if (at_utilities.NIL == term.closed_fn_termP(wff_vars.unexpanded_formula())) {
                        return (SubLObject)at_utilities.NIL;
                    }
                }
                if (at_utilities.NIL != isa.result_isa_colP(cycl_utilities.nat_arg0(naut), at_utilities.$const146$Microtheory, mt) && at_utilities.NIL == at_mt_mt_relevantP(mt)) {
                    return max_floor_mts_of_naut(naut, mt_vars.$mt_mt$.getGlobalValue(), validate_expansionP, number);
                }
                return max_floor_mts_of_naut_int(naut, mt, number);
            }
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 55741L)
    public static SubLObject max_floor_mts_of_naut_int(final SubLObject naut, final SubLObject mt, final SubLObject number) {
        final SubLObject fn = cycl_utilities.nat_functor(naut);
        final SubLObject fn_mts = nat_function_wff_mts(fn);
        SubLObject args_mts = (SubLObject)ConsesLow.list(fn_mts);
        SubLObject candidate_mts = (at_utilities.NIL != mt) ? candidate_mts_wrt(fn_mts, mt) : fn_mts;
        if (at_utilities.NIL == fn_mts) {
            return (SubLObject)at_utilities.NIL;
        }
        SubLObject argnum = (SubLObject)at_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(naut, (SubLObject)at_utilities.$kw147$IGNORE);
        SubLObject arg = (SubLObject)at_utilities.NIL;
        arg = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            argnum = Numbers.add(argnum, (SubLObject)at_utilities.ONE_INTEGER);
            if (fn.eql(at_utilities.$const148$Kappa) && argnum.eql((SubLObject)at_utilities.ONE_INTEGER)) {
                if (at_utilities.NIL == collection_defns.cycl_var_listP(arg)) {
                    return (SubLObject)at_utilities.NIL;
                }
            }
            else {
                final SubLObject arg_mts = admitted_arg_candidate_mt_sets(arg, argnum, fn, mt);
                if (at_utilities.NIL == arg_mts) {
                    return (SubLObject)at_utilities.NIL;
                }
                args_mts = ConsesLow.append(args_mts, arg_mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2 = list_utilities.cross_products(list_utilities.fast_delete_duplicates(args_mts, Symbols.symbol_function((SubLObject)at_utilities.EQUAL), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED));
        SubLObject mt_set = (SubLObject)at_utilities.NIL;
        mt_set = cdolist_list_var2.first();
        while (at_utilities.NIL != cdolist_list_var2) {
            candidate_mts = ConsesLow.append(candidate_mts, genl_mts.max_floor_mts(mt_set, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED));
            cdolist_list_var2 = cdolist_list_var2.rest();
            mt_set = cdolist_list_var2.first();
        }
        candidate_mts = filter_excepted_nat_wff_mts(list_utilities.remove_duplicate_forts(candidate_mts));
        return result_of_max_floor_mts_of_nat(naut, candidate_mts, number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 56778L)
    public static SubLObject admitted_arg_candidate_mt_sets(SubLObject arg, final SubLObject argnum, final SubLObject reln, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg_mts = (SubLObject)at_utilities.NIL;
        if (at_utilities.NIL != nart_handles.nart_p(arg) || at_utilities.NIL != term.nautP(arg, (SubLObject)at_utilities.UNPROVIDED)) {
            SubLObject nat_wf_mts = (SubLObject)at_utilities.NIL;
            final SubLObject _prev_bind_0 = at_utilities.$max_floor_mts_of_nat_recursionP$.currentBinding(thread);
            try {
                at_utilities.$max_floor_mts_of_nat_recursionP$.bind((SubLObject)at_utilities.T, thread);
                nat_wf_mts = max_floor_mts_of_nat(arg, mt, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
            }
            finally {
                at_utilities.$max_floor_mts_of_nat_recursionP$.rebind(_prev_bind_0, thread);
            }
            if (at_utilities.NIL == nat_wf_mts) {
                return (SubLObject)at_utilities.NIL;
            }
            arg_mts = (SubLObject)ConsesLow.cons(nat_wf_mts, arg_mts);
        }
        else if (at_utilities.NIL != term.sentenceP(arg, (SubLObject)at_utilities.UNPROVIDED)) {
            final SubLObject elf_mts = nat_formula_arg_wff_mts(arg);
            if (at_utilities.NIL == elf_mts) {
                return (SubLObject)at_utilities.NIL;
            }
            arg_mts = (SubLObject)ConsesLow.cons(elf_mts, arg_mts);
        }
        if (at_utilities.NIL != function_terms.nat_formula_p(arg)) {
            final SubLObject nart = narts_high.find_nart(arg);
            if (at_utilities.NIL != nart) {
                arg = nart;
            }
        }
        SubLObject cols = (SubLObject)at_utilities.NIL;
        if (at_utilities.NIL != mt) {
            cols = kb_accessors.argn_isa_implied(reln, argnum, mt);
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_utilities.$sym77$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(at_utilities.$const78$EverythingPSC, thread);
                cols = kb_accessors.argn_isa_implied(reln, argnum, (SubLObject)at_utilities.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject cdolist_list_var = cols;
        SubLObject col = (SubLObject)at_utilities.NIL;
        col = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            if (col.eql(at_utilities.$const67$Thing)) {
                arg_mts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(mt_vars.$thing_defining_mt$.getGlobalValue()), arg_mts);
            }
            else {
                final SubLObject mts = nat_arg_wff_wrt_arg_isa_mts(arg, col);
                if (at_utilities.NIL != mts) {
                    arg_mts = (SubLObject)ConsesLow.cons(mts, arg_mts);
                }
                else if (at_utilities.NIL == at_utilities.$max_floor_mts_of_nat_exceptions$.getDynamicValue(thread) && at_utilities.NIL == at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread)) {
                    return (SubLObject)at_utilities.NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        if (at_utilities.NIL != forts.fort_p(arg) || at_utilities.NIL != term.first_order_nautP(arg)) {
            cols = (SubLObject)at_utilities.NIL;
            if (at_utilities.NIL != mt) {
                cols = kb_accessors.argn_genl(reln, argnum, mt);
            }
            else {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_utilities.$sym77$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(at_utilities.$const78$EverythingPSC, thread);
                    cols = kb_accessors.argn_genl(reln, argnum, (SubLObject)at_utilities.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cols;
            col = (SubLObject)at_utilities.NIL;
            col = cdolist_list_var.first();
            while (at_utilities.NIL != cdolist_list_var) {
                final SubLObject mts = nat_arg_wff_wrt_arg_genls_mts(arg, col);
                if (at_utilities.NIL != mts) {
                    arg_mts = (SubLObject)ConsesLow.cons(mts, arg_mts);
                }
                else if (at_utilities.NIL == at_utilities.$max_floor_mts_of_nat_exceptions$.getDynamicValue(thread) && at_utilities.NIL == at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread)) {
                    return (SubLObject)at_utilities.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            }
        }
        if (at_utilities.NIL != at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread) && at_utilities.NIL != kb_control_vars.within_forward_inferenceP() && at_utilities.NIL != wff.assertive_wff_ruleP(forward.current_forward_inference_rule())) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(at_utilities.$const149$UniversalVocabularyMt));
        }
        return arg_mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 58738L)
    public static SubLObject result_of_max_floor_mts_of_nat(final SubLObject nat, final SubLObject candidate_mts, SubLObject number) {
        if (number == at_utilities.UNPROVIDED) {
            number = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mts = (SubLObject)at_utilities.NIL;
        if (at_utilities.NIL != at_utilities.$max_floor_mts_of_nat_recursionP$.getDynamicValue(thread)) {
            return mt_vars.maximize_mts_wrt_core(candidate_mts);
        }
        SubLObject count = (SubLObject)at_utilities.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)at_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_utilities.$sym150$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
            if (at_utilities.NIL == at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread) && at_utilities.NIL == doneP) {
                SubLObject csome_list_var = candidate_mts;
                SubLObject mt = (SubLObject)at_utilities.NIL;
                mt = csome_list_var.first();
                while (at_utilities.NIL == doneP && at_utilities.NIL != csome_list_var) {
                    if (at_utilities.NIL == genl_mts.any_genl_mtP(mt, mts, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) && at_utilities.NIL != wff.el_strictly_wft_fastP(nat, mt)) {
                        mts = (SubLObject)ConsesLow.cons(mt, mts);
                        if (at_utilities.NIL != subl_promotions.positive_integer_p(number)) {
                            count = Numbers.add(count, (SubLObject)at_utilities.ONE_INTEGER);
                            doneP = Numbers.numGE(count, number);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    mt = csome_list_var.first();
                }
            }
            if (at_utilities.NIL == mts && at_utilities.NIL == wff_vars.wff_strictP() && at_utilities.NIL == doneP) {
                SubLObject csome_list_var = candidate_mts;
                SubLObject mt = (SubLObject)at_utilities.NIL;
                mt = csome_list_var.first();
                while (at_utilities.NIL == doneP && at_utilities.NIL != csome_list_var) {
                    if (at_utilities.NIL == genl_mts.any_genl_mtP(mt, mts, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) && at_utilities.NIL != wff.el_wft_fastP(nat, mt)) {
                        mts = (SubLObject)ConsesLow.cons(mt, mts);
                        if (at_utilities.NIL != subl_promotions.positive_integer_p(number)) {
                            count = Numbers.add(count, (SubLObject)at_utilities.ONE_INTEGER);
                            doneP = Numbers.numGE(count, number);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    mt = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return genl_mts.max_mts(mts, (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 59744L)
    public static SubLObject max_floor_mts_of_admitted_arg(final SubLObject arg, final SubLObject argnum, final SubLObject reln, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        final SubLObject reln_mts = relation_wff_mts(reln);
        if (at_utilities.NIL != reln_mts) {
            final SubLObject arg_mt_sets = admitted_arg_candidate_mt_sets(arg, argnum, reln, mt);
            if (at_utilities.NIL != arg_mt_sets) {
                final SubLObject mt_sets = (SubLObject)ConsesLow.cons(reln_mts, arg_mt_sets);
                SubLObject candidate_mts = (SubLObject)at_utilities.NIL;
                SubLObject cdolist_list_var = list_utilities.cross_products(Sequences.delete_duplicates(mt_sets, (SubLObject)at_utilities.EQUAL, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED));
                SubLObject mt_set = (SubLObject)at_utilities.NIL;
                mt_set = cdolist_list_var.first();
                while (at_utilities.NIL != cdolist_list_var) {
                    candidate_mts = ConsesLow.append(candidate_mts, genl_mts.max_floor_mts(mt_set, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED));
                    cdolist_list_var = cdolist_list_var.rest();
                    mt_set = cdolist_list_var.first();
                }
                candidate_mts = list_utilities.remove_duplicate_forts(candidate_mts);
                if (at_utilities.NIL != nart_handles.nart_p(arg) || at_utilities.NIL != el_utilities.possibly_naut_p(arg)) {
                    return result_of_max_floor_mts_of_nat(arg, candidate_mts, (SubLObject)at_utilities.UNPROVIDED);
                }
                return genl_mts.max_mts(candidate_mts, (SubLObject)at_utilities.UNPROVIDED);
            }
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 60727L)
    public static SubLObject max_floor_mts_of_nat_benchmark(final SubLObject n) {
        final SubLObject narts = get_random_nart_set(n);
        SubLObject time = (SubLObject)at_utilities.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        final SubLObject set_contents_var = set.do_set_internal(narts);
        SubLObject basis_object;
        SubLObject state;
        SubLObject nart;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)at_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); at_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            nart = set_contents.do_set_contents_next(basis_object, state);
            if (at_utilities.NIL != set_contents.do_set_contents_element_validP(state, nart)) {
                max_floor_mts_of_nat(nart, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
            }
        }
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return number_utilities.float_n(Numbers.divide(time, n), (SubLObject)at_utilities.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 60962L)
    public static SubLObject get_random_nart_set(final SubLObject n) {
        final SubLObject narts = set.new_set((SubLObject)at_utilities.EQL, n);
        while (n.numG(set.set_size(narts))) {
            final SubLObject nart = narts_high.random_nart((SubLObject)at_utilities.UNPROVIDED);
            if (at_utilities.NIL == set.set_memberP(nart, narts)) {
                set.set_add(nart, narts);
            }
        }
        return narts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 61187L)
    public static SubLObject max_floor_mts_of_admitted_arg_benchmark(SubLObject n) {
        if (n == at_utilities.UNPROVIDED) {
            n = (SubLObject)at_utilities.NIL;
        }
        final SubLObject support_data = get_admitted_by_supports();
        final SubLObject count = Sequences.length(support_data);
        SubLObject time = (SubLObject)at_utilities.NIL;
        SubLObject result = (SubLObject)at_utilities.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        SubLObject cdolist_list_var = n.isInteger() ? list_utilities.first_n(n, support_data) : support_data;
        SubLObject support_datum = (SubLObject)at_utilities.NIL;
        support_datum = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            final SubLObject assertion = support_datum.first();
            final SubLObject admitted_argument_gaf = conses_high.third(support_datum);
            final SubLObject arg = cycl_utilities.sentence_arg1(admitted_argument_gaf, (SubLObject)at_utilities.UNPROVIDED);
            final SubLObject argnum = cycl_utilities.sentence_arg2(admitted_argument_gaf, (SubLObject)at_utilities.UNPROVIDED);
            final SubLObject reln = cycl_utilities.sentence_arg3(admitted_argument_gaf, (SubLObject)at_utilities.UNPROVIDED);
            final SubLObject mts = max_floor_mts_of_admitted_arg(arg, argnum, reln, (SubLObject)at_utilities.UNPROVIDED);
            if (at_utilities.NIL == list_utilities.singletonP(mts) || at_utilities.NIL == genl_mts.genl_mtP(assertions_high.assertion_mt(assertion), mts.first(), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertion, admitted_argument_gaf, mts), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support_datum = cdolist_list_var.first();
        }
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        cdolist_list_var = result;
        SubLObject data = (SubLObject)at_utilities.NIL;
        data = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            PrintLow.format((SubLObject)at_utilities.T, (SubLObject)at_utilities.$str151$___S_____S_____s__, new SubLObject[] { data.first(), conses_high.second(data), conses_high.third(data) });
            cdolist_list_var = cdolist_list_var.rest();
            data = cdolist_list_var.first();
        }
        print_high.print(Sequences.length(support_data), (SubLObject)at_utilities.UNPROVIDED);
        return number_utilities.float_n(Numbers.divide(time, count), (SubLObject)at_utilities.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 62162L)
    public static SubLObject get_admitted_by_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admitted_by_supports = (SubLObject)at_utilities.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)at_utilities.$str152$mapping_Cyc_arguments;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)at_utilities.ZERO_INTEGER;
        assert at_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)at_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)at_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)at_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$159 = idx;
                if (at_utilities.NIL == id_index.id_index_objects_empty_p(idx_$159, (SubLObject)at_utilities.$kw154$SKIP)) {
                    final SubLObject idx_$160 = idx_$159;
                    if (at_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$160, (SubLObject)at_utilities.$kw154$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$160);
                        final SubLObject backwardP_var = (SubLObject)at_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject assertion;
                        SubLObject cdolist_list_var;
                        SubLObject argument;
                        SubLObject cdolist_list_var_$161;
                        SubLObject support;
                        SubLObject sentence;
                        SubLObject mt;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)at_utilities.NIL, v_iteration = (SubLObject)at_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)at_utilities.ONE_INTEGER)) {
                            a_id = ((at_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)at_utilities.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (at_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || at_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)at_utilities.$kw154$SKIP)) {
                                if (at_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)at_utilities.$kw154$SKIP;
                                }
                                assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                cdolist_list_var = assertions_high.assertion_arguments(assertion);
                                argument = (SubLObject)at_utilities.NIL;
                                argument = cdolist_list_var.first();
                                while (at_utilities.NIL != cdolist_list_var) {
                                    if (at_utilities.NIL != deduction_handles.deduction_p(argument)) {
                                        cdolist_list_var_$161 = deductions_high.deduction_supports(argument);
                                        support = (SubLObject)at_utilities.NIL;
                                        support = cdolist_list_var_$161.first();
                                        while (at_utilities.NIL != cdolist_list_var_$161) {
                                            if (at_utilities.NIL == assertion_handles.assertion_p(support) && at_utilities.NIL != arguments.hl_support_p(support)) {
                                                sentence = arguments.support_sentence(support);
                                                mt = arguments.support_mt(support);
                                                if (at_utilities.$const155$admittedArgument.eql(cycl_utilities.sentence_arg0(sentence))) {
                                                    admitted_by_supports = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertion, mt, sentence), admitted_by_supports);
                                                }
                                            }
                                            cdolist_list_var_$161 = cdolist_list_var_$161.rest();
                                            support = cdolist_list_var_$161.first();
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    argument = cdolist_list_var.first();
                                }
                                sofar = Numbers.add(sofar, (SubLObject)at_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$161 = idx_$159;
                    if (at_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$161) || at_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)at_utilities.$kw154$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$161);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$161);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$161);
                        final SubLObject v_default = (SubLObject)((at_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)at_utilities.$kw154$SKIP)) ? at_utilities.NIL : at_utilities.$kw154$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (at_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)at_utilities.$kw154$SKIP) || at_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                SubLObject cdolist_list_var2 = assertions_high.assertion_arguments(assertion2);
                                SubLObject argument2 = (SubLObject)at_utilities.NIL;
                                argument2 = cdolist_list_var2.first();
                                while (at_utilities.NIL != cdolist_list_var2) {
                                    if (at_utilities.NIL != deduction_handles.deduction_p(argument2)) {
                                        SubLObject cdolist_list_var_$162 = deductions_high.deduction_supports(argument2);
                                        SubLObject support2 = (SubLObject)at_utilities.NIL;
                                        support2 = cdolist_list_var_$162.first();
                                        while (at_utilities.NIL != cdolist_list_var_$162) {
                                            if (at_utilities.NIL == assertion_handles.assertion_p(support2) && at_utilities.NIL != arguments.hl_support_p(support2)) {
                                                final SubLObject sentence2 = arguments.support_sentence(support2);
                                                final SubLObject mt2 = arguments.support_mt(support2);
                                                if (at_utilities.$const155$admittedArgument.eql(cycl_utilities.sentence_arg0(sentence2))) {
                                                    admitted_by_supports = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertion2, mt2, sentence2), admitted_by_supports);
                                                }
                                            }
                                            cdolist_list_var_$162 = cdolist_list_var_$162.rest();
                                            support2 = cdolist_list_var_$162.first();
                                        }
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    argument2 = cdolist_list_var2.first();
                                }
                                sofar = Numbers.add(sofar, (SubLObject)at_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)at_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$164 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$164, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.delete_duplicates(admitted_by_supports, Symbols.symbol_function((SubLObject)at_utilities.EQUAL), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 62719L)
    public static SubLObject nat_formula_arg_wff_mts(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mts = (SubLObject)at_utilities.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_utilities.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_utilities.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_utilities.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_utilities.NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind((SubLObject)at_utilities.NIL, thread);
            mts = filter_excepted_nat_wff_mts(mts_accommodating_formula_wrt_types(formula));
        }
        finally {
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 63533L)
    public static SubLObject nat_function_wff_mts(final SubLObject fn) {
        return isa.max_floor_mts_of_isa_paths(fn, at_utilities.$const156$Function_Denotational, (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 63738L)
    public static SubLObject relation_wff_mts(final SubLObject reln) {
        return isa.max_floor_mts_of_isa_paths(reln, at_utilities.$const157$Relation, (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 63868L)
    public static SubLObject candidate_mts_wrt(final SubLObject candidates, final SubLObject mt) {
        SubLObject result = (SubLObject)at_utilities.NIL;
        SubLObject cdolist_list_var = candidates;
        SubLObject candidate = (SubLObject)at_utilities.NIL;
        candidate = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            result = ConsesLow.append(result, genl_mts.max_floor_mts((SubLObject)ConsesLow.list(mt, candidate), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        }
        result = list_utilities.remove_duplicate_forts(result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 64122L)
    public static SubLObject nat_arg_wff_wrt_arg_isa_mts(final SubLObject arg, final SubLObject col) {
        return isa.max_floor_mts_of_isa_paths(arg, col, (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 64302L)
    public static SubLObject nat_arg_wff_wrt_arg_genls_mts(final SubLObject arg, final SubLObject col) {
        return genls.max_floor_mts_of_genls_paths(arg, col, (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 64487L)
    public static SubLObject filter_excepted_nat_wff_mts(final SubLObject mts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_utilities.NIL != at_utilities.$max_floor_mts_of_nat_exceptions$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_utilities.NIL;
            SubLObject cdolist_list_var = mts;
            SubLObject mt = (SubLObject)at_utilities.NIL;
            mt = cdolist_list_var.first();
            while (at_utilities.NIL != cdolist_list_var) {
                if (at_utilities.NIL == subl_promotions.memberP(mt, at_utilities.$max_floor_mts_of_nat_exceptions$.getDynamicValue(thread), (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED)) {
                    result = (SubLObject)ConsesLow.cons(mt, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            }
            return result;
        }
        return mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 64742L)
    public static SubLObject at_note(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == at_utilities.UNPROVIDED) {
            arg1 = (SubLObject)at_utilities.NIL;
        }
        if (arg2 == at_utilities.UNPROVIDED) {
            arg2 = (SubLObject)at_utilities.NIL;
        }
        if (arg3 == at_utilities.UNPROVIDED) {
            arg3 = (SubLObject)at_utilities.NIL;
        }
        if (arg4 == at_utilities.UNPROVIDED) {
            arg4 = (SubLObject)at_utilities.NIL;
        }
        if (arg5 == at_utilities.UNPROVIDED) {
            arg5 = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
            PrintLow.format((SubLObject)at_utilities.T, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
            return (SubLObject)at_utilities.NIL;
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 64996L)
    public static SubLObject at_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == at_utilities.UNPROVIDED) {
            arg1 = (SubLObject)at_utilities.NIL;
        }
        if (arg2 == at_utilities.UNPROVIDED) {
            arg2 = (SubLObject)at_utilities.NIL;
        }
        if (arg3 == at_utilities.UNPROVIDED) {
            arg3 = (SubLObject)at_utilities.NIL;
        }
        if (arg4 == at_utilities.UNPROVIDED) {
            arg4 = (SubLObject)at_utilities.NIL;
        }
        if (arg5 == at_utilities.UNPROVIDED) {
            arg5 = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror((SubLObject)at_utilities.$str91$continue_anyway, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        else if (Numbers.add((SubLObject)at_utilities.TWO_INTEGER, at_vars.$at_trace_level$.getDynamicValue(thread)).numGE(level)) {
            Errors.warn(format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 65281L)
    public static SubLObject at_cerror(final SubLObject level, final SubLObject continue_str, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == at_utilities.UNPROVIDED) {
            arg1 = (SubLObject)at_utilities.NIL;
        }
        if (arg2 == at_utilities.UNPROVIDED) {
            arg2 = (SubLObject)at_utilities.NIL;
        }
        if (arg3 == at_utilities.UNPROVIDED) {
            arg3 = (SubLObject)at_utilities.NIL;
        }
        if (arg4 == at_utilities.UNPROVIDED) {
            arg4 = (SubLObject)at_utilities.NIL;
        }
        if (arg5 == at_utilities.UNPROVIDED) {
            arg5 = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror(continue_str, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        else if (Numbers.add((SubLObject)at_utilities.TWO_INTEGER, at_vars.$at_trace_level$.getDynamicValue(thread)).numGE(level)) {
            Errors.warn(format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 65575L)
    public static SubLObject at_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == at_utilities.UNPROVIDED) {
            arg1 = (SubLObject)at_utilities.NIL;
        }
        if (arg2 == at_utilities.UNPROVIDED) {
            arg2 = (SubLObject)at_utilities.NIL;
        }
        if (arg3 == at_utilities.UNPROVIDED) {
            arg3 = (SubLObject)at_utilities.NIL;
        }
        if (arg4 == at_utilities.UNPROVIDED) {
            arg4 = (SubLObject)at_utilities.NIL;
        }
        if (arg5 == at_utilities.UNPROVIDED) {
            arg5 = (SubLObject)at_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$at_trace_level$.getDynamicValue(thread).numGE(level)) {
            Functions.apply((SubLObject)at_utilities.$sym158$WARN, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
            return (SubLObject)at_utilities.NIL;
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 65763L)
    public static SubLObject min_anects(final SubLObject col, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        return genls.min_genls_of_type(col, at_utilities.$const159$AtemporalNecessarilyEssentialColl, mt, (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 66151L)
    public static SubLObject union_min_anects(final SubLObject cols, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        return genls.union_min_genls_of_type(cols, at_utilities.$const159$AtemporalNecessarilyEssentialColl, mt, (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 66469L)
    public static SubLObject relation_arg_constraint_sentences(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        SubLObject constraints = (SubLObject)at_utilities.NIL;
        SubLObject cdolist_list_var;
        SubLObject cols = cdolist_list_var = kb_accessors.argn_isa_implied(relation, argnum, mt);
        SubLObject col = (SubLObject)at_utilities.NIL;
        col = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            constraints = (SubLObject)ConsesLow.cons(el_utilities.make_ternary_formula(at_utilities.$const160$argIsa, relation, argnum, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        cols = (cdolist_list_var = kb_accessors.argn_genl(relation, argnum, mt));
        col = (SubLObject)at_utilities.NIL;
        col = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            constraints = (SubLObject)ConsesLow.cons(el_utilities.make_ternary_formula(at_utilities.$const161$argGenl, relation, argnum, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return Sequences.nreverse(constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 67133L)
    public static SubLObject variable_arity_relation_arg_constraint_sentences(final SubLObject relation, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        assert at_utilities.NIL != fort_types_interface.variable_arity_relation_p(relation) : relation;
        SubLObject constraints = (SubLObject)at_utilities.NIL;
        SubLObject cdolist_list_var;
        final SubLObject args_isa = cdolist_list_var = kb_accessors.args_isa(relation, mt);
        SubLObject col = (SubLObject)at_utilities.NIL;
        col = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(at_utilities.$const163$argsIsa, relation, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        final SubLObject args_genl = cdolist_list_var = kb_accessors.args_genl(relation, mt);
        col = (SubLObject)at_utilities.NIL;
        col = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(at_utilities.$const164$argsGenl, relation, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return Sequences.nreverse(constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 67765L)
    public static SubLObject all_relation_arg_constraint_sentences(final SubLObject relation, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        assert at_utilities.NIL != fort_types_interface.relation_p(relation) : relation;
        SubLObject constraints = (SubLObject)at_utilities.NIL;
        final SubLObject max_arity = arity.max_arity(relation);
        if (at_utilities.NIL != max_arity) {
            SubLObject end_var;
            SubLObject argnum;
            SubLObject arg_constraints;
            for (end_var = number_utilities.f_1X(max_arity), argnum = (SubLObject)at_utilities.NIL, argnum = (SubLObject)at_utilities.ONE_INTEGER; !argnum.numGE(end_var); argnum = number_utilities.f_1X(argnum)) {
                arg_constraints = relation_arg_constraint_sentences(relation, argnum, mt);
                constraints = ConsesLow.nconc(Sequences.nreverse(arg_constraints), constraints);
            }
        }
        else {
            constraints = variable_arity_relation_arg_constraint_sentences(relation, mt);
        }
        return Sequences.nreverse(constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 68438L)
    public static SubLObject all_relation_constraint_sentences(final SubLObject relation, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (at_utilities.NIL == fort_types_interface.relation_p(relation)) {
            return (SubLObject)at_utilities.NIL;
        }
        return ConsesLow.nconc(arity.relation_arity_constraint_sentences(relation), all_relation_arg_constraint_sentences(relation, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 68742L)
    public static SubLObject relation_term_arg_constraints(final SubLObject relation, final SubLObject v_term, final SubLObject argnum, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        assert at_utilities.NIL != forts.fort_p(relation) : relation;
        assert at_utilities.NIL != subl_promotions.positive_integer_p(argnum) : argnum;
        SubLObject constraints = (SubLObject)at_utilities.NIL;
        SubLObject cdolist_list_var;
        SubLObject cols = cdolist_list_var = kb_accessors.argn_isa(relation, argnum, mt);
        SubLObject col = (SubLObject)at_utilities.NIL;
        col = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            constraints = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(at_utilities.$const168$isa, v_term, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        cols = (cdolist_list_var = kb_accessors.argn_genl(relation, argnum, mt));
        col = (SubLObject)at_utilities.NIL;
        col = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            constraints = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(at_utilities.$const66$genls, v_term, col), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return Sequences.nreverse(constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 69339L)
    public static SubLObject formula_arg_constraints_cycl(final SubLObject formula, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        SubLObject constraints = (SubLObject)at_utilities.NIL;
        final SubLObject relation = cycl_utilities.formula_operator(formula);
        if (at_utilities.NIL == forts.fort_p(relation)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS(at_utilities.$const168$isa, relation, (SubLObject)at_utilities.$list169));
        }
        SubLObject argnum = (SubLObject)at_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, (SubLObject)at_utilities.$kw147$IGNORE);
        SubLObject arg = (SubLObject)at_utilities.NIL;
        arg = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            argnum = Numbers.add(argnum, (SubLObject)at_utilities.ONE_INTEGER);
            final SubLObject arg_constraints = relation_term_arg_constraints(relation, arg, argnum, mt);
            constraints = ConsesLow.nconc(Sequences.nreverse(arg_constraints), constraints);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Sequences.nreverse(constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 70079L)
    public static SubLObject formula_variable_isa_constraint_alist(final SubLObject formula, final SubLObject mt) {
        final SubLObject constraint_sentence = at_var_types.formula_variables_arg_constraints(formula, mt, (SubLObject)at_utilities.UNPROVIDED);
        final SubLObject isa_constraint_alist = constraint_sentence_isa_constraints(constraint_sentence, mt);
        return isa_constraint_alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 70584L)
    public static SubLObject constraint_sentence_isa_constraints(final SubLObject constraint_sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)at_utilities.EQL), (SubLObject)at_utilities.UNPROVIDED);
        final SubLObject conjunction = (at_utilities.NIL != el_utilities.el_conjunction_p(constraint_sentence)) ? constraint_sentence : simplifier.conjoin((SubLObject)ConsesLow.list(constraint_sentence), (SubLObject)at_utilities.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(conjunction, (SubLObject)at_utilities.$kw147$IGNORE);
        SubLObject conjunct = (SubLObject)at_utilities.NIL;
        conjunct = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            if (at_utilities.NIL != el_utilities.el_formula_with_operator_p(conjunct, at_utilities.$const168$isa)) {
                final SubLObject var = cycl_utilities.atomic_sentence_arg1(conjunct, (SubLObject)at_utilities.UNPROVIDED);
                final SubLObject col = cycl_utilities.atomic_sentence_arg2(conjunct, (SubLObject)at_utilities.UNPROVIDED);
                assert at_utilities.NIL != cycl_variables.cyc_varP(var) : var;
                dictionary_utilities.dictionary_push(dict, var, col);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        SubLObject alist = (SubLObject)at_utilities.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); at_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject cols = thread.secondMultipleValue();
            thread.resetMultipleValues();
            alist = list_utilities.alist_enter(alist, var2, genls.min_cols(cols, mt, (SubLObject)at_utilities.UNPROVIDED), (SubLObject)at_utilities.UNPROVIDED);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 71465L)
    public static SubLObject possible_followup_variable_binding_sets(final SubLObject formula, final SubLObject followup_formula, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        SubLObject result = (SubLObject)at_utilities.NIL;
        final SubLObject formula_constraints_dictionary = at_var_types.formula_variables_arg_constraints_dict(formula, mt, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
        final SubLObject followup_constraints_dictionary = at_var_types.formula_variables_arg_constraints_dict(followup_formula, mt, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
        SubLObject cur_isa_constraints = (SubLObject)at_utilities.NIL;
        SubLObject cur_genls_constraints = (SubLObject)at_utilities.NIL;
        SubLObject var_score = (SubLObject)at_utilities.NIL;
        SubLObject bindings_list = (SubLObject)at_utilities.NIL;
        SubLObject cur_followup_isa_constraints = (SubLObject)at_utilities.NIL;
        SubLObject cur_followup_genls_constraints = (SubLObject)at_utilities.NIL;
        SubLObject cur_followup_quoted_isa_constraints = (SubLObject)at_utilities.NIL;
        final SubLObject sentence_variables = el_utilities.sentence_free_variables(formula, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
        final SubLObject followup_variables = el_utilities.sentence_free_variables(followup_formula, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED);
        final SubLObject possible_bindings = dictionary.new_dictionary((SubLObject)at_utilities.EQL, Sequences.length(sentence_variables));
        SubLObject cdolist_list_var = sentence_variables;
        SubLObject var = (SubLObject)at_utilities.NIL;
        var = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            final SubLObject datum_evaluated_var = dictionary.dictionary_lookup(formula_constraints_dictionary, var, (SubLObject)at_utilities.UNPROVIDED);
            cur_isa_constraints = datum_evaluated_var.first();
            cur_genls_constraints = conses_high.cadr(datum_evaluated_var);
            SubLObject cdolist_list_var_$165 = followup_variables;
            SubLObject followup_var = (SubLObject)at_utilities.NIL;
            followup_var = cdolist_list_var_$165.first();
            while (at_utilities.NIL != cdolist_list_var_$165) {
                final SubLObject datum_evaluated_var2 = dictionary.dictionary_lookup(followup_constraints_dictionary, followup_var, (SubLObject)at_utilities.UNPROVIDED);
                cur_followup_isa_constraints = datum_evaluated_var2.first();
                cur_followup_genls_constraints = conses_high.cadr(datum_evaluated_var2);
                cur_followup_quoted_isa_constraints = conses_high.cddr(datum_evaluated_var2).first();
                if (at_utilities.NIL == disjoint_with.any_disjoint_with_anyP(cur_isa_constraints, cur_followup_isa_constraints, mt, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED) && at_utilities.NIL == disjoint_with.any_disjoint_with_anyP(cur_genls_constraints, cur_followup_genls_constraints, mt, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED)) {
                    var_score = isas_and_genls_similarity(cur_isa_constraints, cur_followup_isa_constraints, cur_genls_constraints, cur_followup_genls_constraints, mt);
                    dictionary_utilities.dictionary_push(possible_bindings, var, (SubLObject)ConsesLow.list(followup_var, var_score));
                }
                cdolist_list_var_$165 = cdolist_list_var_$165.rest();
                followup_var = cdolist_list_var_$165.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        bindings_list = (cdolist_list_var = calc_possible_followup_binding_sets(possible_bindings, (SubLObject)at_utilities.NIL, (SubLObject)at_utilities.NIL));
        SubLObject binding_set = (SubLObject)at_utilities.NIL;
        binding_set = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(similarity_for_variable_binding_set(binding_set, formula, followup_formula, mt), binding_set), result);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        }
        return Sort.sort(result, Symbols.symbol_function((SubLObject)at_utilities.$sym171$VARIABLE_BINDING_SET_ITEM_COMPARATOR), (SubLObject)at_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 74706L)
    public static SubLObject variable_binding_set_item_comparator(final SubLObject item_a, final SubLObject item_b) {
        return Functions.funcall(Symbols.symbol_function((SubLObject)at_utilities.$sym141$_), item_a.first(), item_b.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 74829L)
    public static SubLObject calc_possible_followup_binding_sets(SubLObject bindings_dict, SubLObject bindings_list, SubLObject working_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        bindings_dict = dictionary_utilities.copy_dictionary(bindings_dict);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(bindings_dict)); at_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject cur_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            dictionary.dictionary_remove(bindings_dict, var);
            SubLObject cdolist_list_var = cur_bindings;
            SubLObject cur_binding = (SubLObject)at_utilities.NIL;
            cur_binding = cdolist_list_var.first();
            while (at_utilities.NIL != cdolist_list_var) {
                cur_binding = (SubLObject)ConsesLow.cons(var, cur_binding);
                working_bindings = (SubLObject)ConsesLow.cons(cur_binding, working_bindings);
                bindings_list = calc_possible_followup_binding_sets(dictionary_utilities.copy_dictionary(bindings_dict), bindings_list, working_bindings);
                bindings_list = (SubLObject)ConsesLow.cons(working_bindings, bindings_list);
                working_bindings = working_bindings.rest();
                cdolist_list_var = cdolist_list_var.rest();
                cur_binding = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return bindings_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 75522L)
    public static SubLObject count_followup_bindings(final SubLObject variable_binding_set) {
        SubLObject bindings_list = (SubLObject)at_utilities.NIL;
        SubLObject cdolist_list_var = variable_binding_set;
        SubLObject binding = (SubLObject)at_utilities.NIL;
        binding = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            bindings_list = (SubLObject)ConsesLow.cons(conses_high.second(binding), bindings_list);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return Sequences.length(Sequences.remove_duplicates(bindings_list, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 75761L)
    public static SubLObject similarity_for_variable_binding_set(final SubLObject variable_binding_set, final SubLObject formula, final SubLObject followup_formula, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (at_utilities.NIL == variable_binding_set) {
            return (SubLObject)at_utilities.ZERO_INTEGER;
        }
        final SubLObject formula_var_count = Sequences.length(el_utilities.literal_variables(formula, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED));
        final SubLObject followup_var_count = Sequences.length(el_utilities.literal_variables(followup_formula, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED));
        final SubLObject bindings_count_for_formula = Sequences.length(variable_binding_set);
        final SubLObject bindings_count_for_followup = count_followup_bindings(variable_binding_set);
        SubLObject variable_bindings_score = (SubLObject)at_utilities.ZERO_INTEGER;
        SubLObject formula_variable_usage_score = (SubLObject)at_utilities.ZERO_INTEGER;
        SubLObject followup_variable_usage_score = (SubLObject)at_utilities.ZERO_INTEGER;
        if (formula_var_count.eql((SubLObject)at_utilities.ZERO_INTEGER)) {
            formula_variable_usage_score = (SubLObject)at_utilities.$int172$100;
        }
        else {
            formula_variable_usage_score = Numbers.multiply((SubLObject)at_utilities.$int172$100, Numbers.divide(bindings_count_for_formula, formula_var_count));
        }
        if (followup_var_count.eql((SubLObject)at_utilities.ZERO_INTEGER)) {
            followup_variable_usage_score = (SubLObject)at_utilities.$int172$100;
        }
        else {
            followup_variable_usage_score = Numbers.multiply((SubLObject)at_utilities.$int172$100, Numbers.divide(bindings_count_for_followup, formula_var_count));
        }
        SubLObject cdolist_list_var = variable_binding_set;
        SubLObject binding = (SubLObject)at_utilities.NIL;
        binding = cdolist_list_var.first();
        while (at_utilities.NIL != cdolist_list_var) {
            variable_bindings_score = Numbers.add(variable_bindings_score, conses_high.third(binding));
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        variable_bindings_score = Numbers.divide(variable_bindings_score, bindings_count_for_formula);
        return Numbers.divide(Numbers.add(variable_bindings_score, Numbers.divide(Numbers.add(formula_variable_usage_score, followup_variable_usage_score), (SubLObject)at_utilities.TWO_INTEGER)), (SubLObject)at_utilities.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 77253L)
    public static SubLObject constraint_similarity(final SubLObject constraints1, final SubLObject constraints2, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (at_utilities.NIL == constraints1 || at_utilities.NIL == constraints2) {
            return (SubLObject)at_utilities.ONE_INTEGER;
        }
        final SubLObject max_generality = Numbers.log(cardinality_estimates.generality_estimate(at_utilities.$const67$Thing), (SubLObject)at_utilities.UNPROVIDED);
        final SubLObject min_gen_constraints1 = Numbers.max((SubLObject)at_utilities.ONE_INTEGER, cardinality_estimates.generality_estimate(constraints1.first()));
        final SubLObject min_gen_constraints2 = Numbers.max((SubLObject)at_utilities.ONE_INTEGER, cardinality_estimates.generality_estimate(constraints2.first()));
        if (min_gen_constraints1.numL(min_gen_constraints2)) {
            return (SubLObject)at_utilities.ONE_INTEGER;
        }
        final SubLObject constraint_diff = Numbers.abs(Numbers.subtract(Numbers.log(min_gen_constraints1, (SubLObject)at_utilities.UNPROVIDED), Numbers.log(min_gen_constraints2, (SubLObject)at_utilities.UNPROVIDED)));
        SubLObject score = Numbers.subtract((SubLObject)at_utilities.$int172$100, Numbers.multiply(Numbers.divide(constraint_diff, max_generality), (SubLObject)at_utilities.$int172$100));
        if (constraint_diff.numL((SubLObject)at_utilities.$float173$0_01)) {
            score = (SubLObject)at_utilities.$int172$100;
        }
        return score;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 78165L)
    public static SubLObject isa_constraint_similarity(final SubLObject isas1, final SubLObject isas2, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        return constraint_similarity(isas1, isas2, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 78460L)
    public static SubLObject genls_constraint_similarity(final SubLObject genls1, final SubLObject genls2, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        return constraint_similarity(genls1, genls2, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 78767L)
    public static SubLObject isas_and_genls_similarity(final SubLObject isas1, final SubLObject isas2, final SubLObject genls1, final SubLObject genls2, final SubLObject mt) {
        if (at_utilities.NIL == isas1 && at_utilities.NIL == isas2 && at_utilities.NIL == genls1 && at_utilities.NIL == genls2) {
            return (SubLObject)at_utilities.ONE_INTEGER;
        }
        if (at_utilities.NIL == isas1 && at_utilities.NIL == isas2) {
            return genls_constraint_similarity(genls1, genls2, mt);
        }
        if (at_utilities.NIL == genls1 && at_utilities.NIL == genls2) {
            return isa_constraint_similarity(isas1, isas2, mt);
        }
        final SubLObject isa_score = isa_constraint_similarity(isas1, isas2, mt);
        final SubLObject genls_score = genls_constraint_similarity(genls1, genls2, mt);
        return Numbers.divide(Numbers.add(isa_score, genls_score), (SubLObject)at_utilities.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-utilities.lisp", position = 79528L)
    public static SubLObject more_specific_p(final SubLObject specific, final SubLObject general, SubLObject mt) {
        if (mt == at_utilities.UNPROVIDED) {
            mt = (SubLObject)at_utilities.NIL;
        }
        if (at_utilities.NIL != mt && at_utilities.NIL != isa.isaP(specific, general, mt, (SubLObject)at_utilities.UNPROVIDED)) {
            return (SubLObject)at_utilities.T;
        }
        if (at_utilities.NIL != mt && at_utilities.NIL != genls.genlsP(specific, general, mt, (SubLObject)at_utilities.UNPROVIDED)) {
            return (SubLObject)at_utilities.T;
        }
        if (at_utilities.NIL != mt && at_utilities.NIL != forts.fort_p(specific) && at_utilities.NIL != genl_predicates.genl_predicateP(specific, general, (SubLObject)at_utilities.UNPROVIDED, (SubLObject)at_utilities.UNPROVIDED)) {
            return (SubLObject)at_utilities.T;
        }
        if (at_utilities.NIL != isa.isa_in_any_mtP(specific, general)) {
            return (SubLObject)at_utilities.T;
        }
        if (at_utilities.NIL != genls.genl_in_any_mtP(specific, general)) {
            return (SubLObject)at_utilities.T;
        }
        if (at_utilities.NIL != forts.fort_p(specific) && at_utilities.NIL != genl_predicates.genl_predicate_in_any_mtP(specific, general)) {
            return (SubLObject)at_utilities.T;
        }
        if (at_utilities.NIL != genls.genl_in_any_mtP(general, at_utilities.$const174$Number_General) && specific.isNumber()) {
            return (SubLObject)at_utilities.T;
        }
        return (SubLObject)at_utilities.NIL;
    }
    
    public static SubLObject declare_at_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "arg_n_predicate", "ARG-N-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "arg_type_mt", "ARG-TYPE-MT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "find_generic_arg_by_id", "FIND-GENERIC-ARG-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "find_generic_arg_id", "FIND-GENERIC-ARG-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "store_generic_arg", "STORE-GENERIC-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "stored_generic_arg_p", "STORED-GENERIC-ARG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "get_generic_arg", "GET-GENERIC-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "generic_arg_num", "GENERIC-ARG-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "generic_argP", "GENERIC-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "inter_arg_isa_pred", "INTER-ARG-ISA-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "inter_arg_isa_inverse", "INTER-ARG-ISA-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "inter_arg_not_isa_pred", "INTER-ARG-NOT-ISA-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "inter_arg_not_isa_inverse", "INTER-ARG-NOT-ISA-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "inter_arg_genl_pred", "INTER-ARG-GENL-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "inter_arg_not_genl_pred", "INTER-ARG-NOT-GENL-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "inter_arg_isa_genl_pred", "INTER-ARG-ISA-GENL-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "inter_arg_genl_isa_pred", "INTER-ARG-GENL-ISA-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "inter_arg_genl_inverse", "INTER-ARG-GENL-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "implication_opP", "IMPLICATION-OP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "logical_opP", "LOGICAL-OP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "truth_functionP", "TRUTH-FUNCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "initialize_all_arg_type_predicate_caches", "INITIALIZE-ALL-ARG-TYPE-PREDICATE-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "clear_all_arg_type_predicate_caches", "CLEAR-ALL-ARG-TYPE-PREDICATE-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "arg_isa_binary_predP", "ARG-ISA-BINARY-PRED?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "arg_isa_ternary_predP", "ARG-ISA-TERNARY-PRED?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "arg_isa_predicateP", "ARG-ISA-PREDICATE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "arg_genl_binary_predP", "ARG-GENL-BINARY-PRED?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "arg_genl_ternary_predP", "ARG-GENL-TERNARY-PRED?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "arg_genl_predicateP", "ARG-GENL-PREDICATE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "formula_denoting_functionP", "FORMULA-DENOTING-FUNCTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "formula_functorP", "FORMULA-FUNCTOR?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "sentence_denoting_functionP", "SENTENCE-DENOTING-FUNCTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "sentence_functorP", "SENTENCE-FUNCTOR?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "argn_type_levelP", "ARGN-TYPE-LEVEL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "min_genl_preds_admitting_fort_as_arg", "MIN-GENL-PREDS-ADMITTING-FORT-AS-ARG", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "forts_admitted_as_arg", "FORTS-ADMITTED-AS-ARG", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "min_implicit_types", "MIN-IMPLICIT-TYPES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "term_requires_isa_in_relations", "TERM-REQUIRES-ISA-IN-RELATIONS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "term_requires_genl_in_relations", "TERM-REQUIRES-GENL-IN-RELATIONS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "term_requires_types_in_relations", "TERM-REQUIRES-TYPES-IN-RELATIONS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "term_requires_isa_in_clause", "TERM-REQUIRES-ISA-IN-CLAUSE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "term_requires_isa_in_relation", "TERM-REQUIRES-ISA-IN-RELATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "term_requires_isa_in_formula", "TERM-REQUIRES-ISA-IN-FORMULA", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "term_requires_genl_in_relation", "TERM-REQUIRES-GENL-IN-RELATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "get_sub_expression_for_term_position", "GET-SUB-EXPRESSION-FOR-TERM-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "term_position_requires_types_in_relation", "TERM-POSITION-REQUIRES-TYPES-IN-RELATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "term_requires_types_in_relation", "TERM-REQUIRES-TYPES-IN-RELATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "arg_requires_isa_in_relation", "ARG-REQUIRES-ISA-IN-RELATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "pred_arg_isa_requires_other_arg_isa", "PRED-ARG-ISA-REQUIRES-OTHER-ARG-ISA", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "make_el_query_literal", "MAKE-EL-QUERY-LITERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "arg_isa_applicable_gafs", "ARG-ISA-APPLICABLE-GAFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "gather_via_map_pred_index", "GATHER-VIA-MAP-PRED-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "inter_arg_isa_cache_initializedP", "INTER-ARG-ISA-CACHE-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "some_inter_arg_isa_assertion_somewhere_cache_add_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-ADD-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "some_inter_arg_isa_assertion_somewhere_cache_remove_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-REMOVE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "some_inter_arg_isa_assertion_somewhere_cache_maybe_remove_int", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "some_inter_arg_isa_assertion_somewhere_cache_add", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-ADD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "some_inter_arg_isa_assertion_somewhere_cache_maybe_remove", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "clear_some_inter_arg_isa_assertion_somewhere_cache", "CLEAR-SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "initialize_some_inter_arg_isa_assertion_somewhere_cache", "INITIALIZE-SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "some_inter_arg_isa_assertion_somewhereP", "SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "some_inter_arg_isa_constraint_somewhereP", "SOME-INTER-ARG-ISA-CONSTRAINT-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "inter_arg_format_cache_initializedP", "INTER-ARG-FORMAT-CACHE-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "some_inter_arg_format_assertion_somewhere_cache_add_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-ADD-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "some_inter_arg_format_assertion_somewhere_cache_remove_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-REMOVE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "some_inter_arg_format_assertion_somewhere_cache_maybe_remove_int", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "some_inter_arg_format_assertion_somewhere_cache_add", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-ADD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "some_inter_arg_format_assertion_somewhere_cache_maybe_remove", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE-MAYBE-REMOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "clear_some_inter_arg_format_assertion_somewhere_cache", "CLEAR-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "initialize_some_inter_arg_format_assertion_somewhere_cache", "INITIALIZE-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "some_inter_arg_format_assertion_somewhereP", "SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "some_inter_arg_format_constraint_somewhereP", "SOME-INTER-ARG-FORMAT-CONSTRAINT-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "reln_permits_generic_arg_variablesP", "RELN-PERMITS-GENERIC-ARG-VARIABLES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "reln_permits_keyword_variablesP", "RELN-PERMITS-KEYWORD-VARIABLES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "reln_constrained_to_be_collectionP", "RELN-CONSTRAINED-TO-BE-COLLECTION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "constraint_pred_constraint_argnum", "CONSTRAINT-PRED-CONSTRAINT-ARGNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "gaf_arg_type_constraint", "GAF-ARG-TYPE-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "gather_at_data", "GATHER-AT-DATA", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "gather_at_data_assertion", "GATHER-AT-DATA-ASSERTION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "gather_at_constraint", "GATHER-AT-CONSTRAINT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "gather_at_assertion", "GATHER-AT-ASSERTION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "at_finishedP", "AT-FINISHED?", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "at_finished", "AT-FINISHED", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "at_mapping_finished", "AT-MAPPING-FINISHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "at_handle_mal_constraint", "AT-HANDLE-MAL-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "at_mal_arg_msg", "AT-MAL-ARG-MSG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "predicate_isa_violation_data", "PREDICATE-ISA-VIOLATION-DATA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "meta_predicate_violation_data", "META-PREDICATE-VIOLATION-DATA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "semantic_violations", "SEMANTIC-VIOLATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "note_at_violationP", "NOTE-AT-VIOLATION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "note_at_violation", "NOTE-AT-VIOLATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "recursive_violationP", "RECURSIVE-VIOLATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "reset_at_violations", "RESET-AT-VIOLATIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "reset_arity_violations", "RESET-ARITY-VIOLATIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "reset_semantic_violations", "RESET-SEMANTIC-VIOLATIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "reset_at_state", "RESET-AT-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "suggest_formula_fix_for_at_violation", "SUGGEST-FORMULA-FIX-FOR-AT-VIOLATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "assertion_arg_violations_among", "ASSERTION-ARG-VIOLATIONS-AMONG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "sef_violations_among", "SEF-VIOLATIONS-AMONG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "predicate_violations_among", "PREDICATE-VIOLATIONS-AMONG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "assertion_arg_violationP", "ASSERTION-ARG-VIOLATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "assertion_collectionP", "ASSERTION-COLLECTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "sef_violationP", "SEF-VIOLATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "predicate_violationP", "PREDICATE-VIOLATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "assertion_arg_violation_fix", "ASSERTION-ARG-VIOLATION-FIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "strip_mt_literals", "STRIP-MT-LITERALS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "sef_violation_fix", "SEF-VIOLATION-FIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "predicate_violation_fix", "PREDICATE-VIOLATION-FIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "violation_type", "VIOLATION-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "mts_accommodating_formula_wrt_types", "MTS-ACCOMMODATING-FORMULA-WRT-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "nat_wf_in_some_mtP", "NAT-WF-IN-SOME-MT?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "nat_wf_in_some_mt", "NAT-WF-IN-SOME-MT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "nat_wf_default_mts", "NAT-WF-DEFAULT-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "formula_forts_isa_mts", "FORMULA-FORTS-ISA-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "at_mt_mt_relevantP", "AT-MT-MT-RELEVANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "mts_accommodating_nat", "MTS-ACCOMMODATING-NAT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "nat_wf_in_mts", "NAT-WF-IN-MTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "clear_cached_max_floor_mts_of_nat", "CLEAR-CACHED-MAX-FLOOR-MTS-OF-NAT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "remove_cached_max_floor_mts_of_nat", "REMOVE-CACHED-MAX-FLOOR-MTS-OF-NAT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "cached_max_floor_mts_of_nat_internal", "CACHED-MAX-FLOOR-MTS-OF-NAT-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "cached_max_floor_mts_of_nat", "CACHED-MAX-FLOOR-MTS-OF-NAT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "fast_max_floor_mts_of_nat", "FAST-MAX-FLOOR-MTS-OF-NAT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "max_floor_mts_of_nat", "MAX-FLOOR-MTS-OF-NAT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "max_floor_mts_of_naut", "MAX-FLOOR-MTS-OF-NAUT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "max_floor_mts_of_naut_int", "MAX-FLOOR-MTS-OF-NAUT-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "admitted_arg_candidate_mt_sets", "ADMITTED-ARG-CANDIDATE-MT-SETS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "result_of_max_floor_mts_of_nat", "RESULT-OF-MAX-FLOOR-MTS-OF-NAT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "max_floor_mts_of_admitted_arg", "MAX-FLOOR-MTS-OF-ADMITTED-ARG", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "max_floor_mts_of_nat_benchmark", "MAX-FLOOR-MTS-OF-NAT-BENCHMARK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "get_random_nart_set", "GET-RANDOM-NART-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "max_floor_mts_of_admitted_arg_benchmark", "MAX-FLOOR-MTS-OF-ADMITTED-ARG-BENCHMARK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "get_admitted_by_supports", "GET-ADMITTED-BY-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "nat_formula_arg_wff_mts", "NAT-FORMULA-ARG-WFF-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "nat_function_wff_mts", "NAT-FUNCTION-WFF-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "relation_wff_mts", "RELATION-WFF-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "candidate_mts_wrt", "CANDIDATE-MTS-WRT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "nat_arg_wff_wrt_arg_isa_mts", "NAT-ARG-WFF-WRT-ARG-ISA-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "nat_arg_wff_wrt_arg_genls_mts", "NAT-ARG-WFF-WRT-ARG-GENLS-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "filter_excepted_nat_wff_mts", "FILTER-EXCEPTED-NAT-WFF-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "at_note", "AT-NOTE", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "at_error", "AT-ERROR", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "at_cerror", "AT-CERROR", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "at_warn", "AT-WARN", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "min_anects", "MIN-ANECTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "union_min_anects", "UNION-MIN-ANECTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "relation_arg_constraint_sentences", "RELATION-ARG-CONSTRAINT-SENTENCES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "variable_arity_relation_arg_constraint_sentences", "VARIABLE-ARITY-RELATION-ARG-CONSTRAINT-SENTENCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "all_relation_arg_constraint_sentences", "ALL-RELATION-ARG-CONSTRAINT-SENTENCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "all_relation_constraint_sentences", "ALL-RELATION-CONSTRAINT-SENTENCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "relation_term_arg_constraints", "RELATION-TERM-ARG-CONSTRAINTS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "formula_arg_constraints_cycl", "FORMULA-ARG-CONSTRAINTS-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "formula_variable_isa_constraint_alist", "FORMULA-VARIABLE-ISA-CONSTRAINT-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "constraint_sentence_isa_constraints", "CONSTRAINT-SENTENCE-ISA-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "possible_followup_variable_binding_sets", "POSSIBLE-FOLLOWUP-VARIABLE-BINDING-SETS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "variable_binding_set_item_comparator", "VARIABLE-BINDING-SET-ITEM-COMPARATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "calc_possible_followup_binding_sets", "CALC-POSSIBLE-FOLLOWUP-BINDING-SETS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "count_followup_bindings", "COUNT-FOLLOWUP-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "similarity_for_variable_binding_set", "SIMILARITY-FOR-VARIABLE-BINDING-SET", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "constraint_similarity", "CONSTRAINT-SIMILARITY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "isa_constraint_similarity", "ISA-CONSTRAINT-SIMILARITY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "genls_constraint_similarity", "GENLS-CONSTRAINT-SIMILARITY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "isas_and_genls_similarity", "ISAS-AND-GENLS-SIMILARITY", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_utilities", "more_specific_p", "MORE-SPECIFIC-P", 2, 1, false);
        return (SubLObject)at_utilities.NIL;
    }
    
    public static SubLObject init_at_utilities_file() {
        at_utilities.$generic_arg_store$ = SubLFiles.deflexical("*GENERIC-ARG-STORE*", (SubLObject)(maybeDefault((SubLObject)at_utilities.$sym5$_GENERIC_ARG_STORE_, at_utilities.$generic_arg_store$, at_utilities.NIL)));
        at_utilities.$some_inter_arg_isa_assertion_somewhere_cache$ = SubLFiles.deflexical("*SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE*", (SubLObject)(maybeDefault((SubLObject)at_utilities.$sym76$_SOME_INTER_ARG_ISA_ASSERTION_SOMEWHERE_CACHE_, at_utilities.$some_inter_arg_isa_assertion_somewhere_cache$, at_utilities.NIL)));
        at_utilities.$some_inter_arg_format_assertion_somewhere_cache$ = SubLFiles.deflexical("*SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE*", (SubLObject)(maybeDefault((SubLObject)at_utilities.$sym97$_SOME_INTER_ARG_FORMAT_ASSERTION_SOMEWHERE_CACHE_, at_utilities.$some_inter_arg_format_assertion_somewhere_cache$, at_utilities.NIL)));
        at_utilities.$mts_cutoff_for_mts_accommodating_formula_wrt_types$ = SubLFiles.defparameter("*MTS-CUTOFF-FOR-MTS-ACCOMMODATING-FORMULA-WRT-TYPES*", (SubLObject)at_utilities.$int139$40);
        at_utilities.$max_floor_mts_of_nat_exceptions$ = SubLFiles.defparameter("*MAX-FLOOR-MTS-OF-NAT-EXCEPTIONS*", (SubLObject)at_utilities.NIL);
        at_utilities.$cached_max_floor_mts_of_nat_caching_state$ = SubLFiles.deflexical("*CACHED-MAX-FLOOR-MTS-OF-NAT-CACHING-STATE*", (SubLObject)at_utilities.NIL);
        at_utilities.$max_floor_mts_of_nat_recursionP$ = SubLFiles.defparameter("*MAX-FLOOR-MTS-OF-NAT-RECURSION?*", (SubLObject)at_utilities.NIL);
        return (SubLObject)at_utilities.NIL;
    }
    
    public static SubLObject setup_at_utilities_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)at_utilities.$sym5$_GENERIC_ARG_STORE_);
        subl_macro_promotions.declare_defglobal((SubLObject)at_utilities.$sym76$_SOME_INTER_ARG_ISA_ASSERTION_SOMEWHERE_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)at_utilities.$sym97$_SOME_INTER_ARG_FORMAT_ASSERTION_SOMEWHERE_CACHE_);
        memoization_state.note_globally_cached_function((SubLObject)at_utilities.$sym143$CACHED_MAX_FLOOR_MTS_OF_NAT);
        generic_testing.define_test_case_table_int((SubLObject)at_utilities.$sym175$ALL_RELATION_CONSTRAINT_SENTENCES, (SubLObject)ConsesLow.list(new SubLObject[] { at_utilities.$kw176$TEST, at_utilities.NIL, at_utilities.$kw177$OWNER, at_utilities.NIL, at_utilities.$kw178$CLASSES, at_utilities.NIL, at_utilities.$kw179$KB, at_utilities.$kw180$FULL, at_utilities.$kw181$WORKING_, at_utilities.T }), (SubLObject)at_utilities.$list182);
        generic_testing.define_test_case_table_int((SubLObject)at_utilities.$sym183$ALL_RELATION_ARG_CONSTRAINT_SENTENCES, (SubLObject)ConsesLow.list(new SubLObject[] { at_utilities.$kw176$TEST, at_utilities.NIL, at_utilities.$kw177$OWNER, at_utilities.NIL, at_utilities.$kw178$CLASSES, at_utilities.NIL, at_utilities.$kw179$KB, at_utilities.$kw184$TINY, at_utilities.$kw181$WORKING_, at_utilities.T }), (SubLObject)at_utilities.$list185);
        generic_testing.define_test_case_table_int((SubLObject)at_utilities.$sym186$FORMULA_ARG_CONSTRAINTS_CYCL, (SubLObject)ConsesLow.list(new SubLObject[] { at_utilities.$kw176$TEST, at_utilities.NIL, at_utilities.$kw177$OWNER, at_utilities.NIL, at_utilities.$kw178$CLASSES, at_utilities.NIL, at_utilities.$kw179$KB, at_utilities.$kw184$TINY, at_utilities.$kw181$WORKING_, at_utilities.T }), (SubLObject)at_utilities.$list187);
        sunit_external.define_test_suite((SubLObject)at_utilities.$str188$Arg_Type_Utilities_Test_Suite, (SubLObject)at_utilities.NIL, (SubLObject)at_utilities.NIL, (SubLObject)at_utilities.$list189);
        return (SubLObject)at_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_at_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_at_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_at_utilities_file();
    }
    
    static {
        me = (SubLFile)new at_utilities();
        at_utilities.$generic_arg_store$ = null;
        at_utilities.$some_inter_arg_isa_assertion_somewhere_cache$ = null;
        at_utilities.$some_inter_arg_format_assertion_somewhere_cache$ = null;
        at_utilities.$mts_cutoff_for_mts_accommodating_formula_wrt_types$ = null;
        at_utilities.$max_floor_mts_of_nat_exceptions$ = null;
        at_utilities.$cached_max_floor_mts_of_nat_caching_state$ = null;
        at_utilities.$max_floor_mts_of_nat_recursionP$ = null;
        $const0$arg1Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa"));
        $const1$arg2Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa"));
        $const2$arg3Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Isa"));
        $const3$arg4Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Isa"));
        $const4$arg5Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Isa"));
        $sym5$_GENERIC_ARG_STORE_ = SubLObjectFactory.makeSymbol("*GENERIC-ARG-STORE*");
        $sym6$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $str7$ARG = SubLObjectFactory.makeString("ARG");
        $str8$_S = SubLObjectFactory.makeString("~S");
        $const9$interArgIsa1_2 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa1-2"));
        $const10$interArgIsa1_3 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa1-3"));
        $const11$interArgIsa1_4 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa1-4"));
        $const12$interArgIsa1_5 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa1-5"));
        $str13$invalid_arg_isa_pred_index___s__s = SubLObjectFactory.makeString("invalid arg-isa-pred index: ~s-~s");
        $const14$interArgIsa2_1 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa2-1"));
        $const15$interArgIsa2_3 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa2-3"));
        $const16$interArgIsa2_4 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa2-4"));
        $const17$interArgIsa2_5 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa2-5"));
        $const18$interArgIsa3_1 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa3-1"));
        $const19$interArgIsa3_2 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa3-2"));
        $const20$interArgIsa3_4 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa3-4"));
        $const21$interArgIsa3_5 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa3-5"));
        $const22$interArgIsa4_1 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa4-1"));
        $const23$interArgIsa4_2 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa4-2"));
        $const24$interArgIsa4_3 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa4-3"));
        $const25$interArgIsa4_5 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa4-5"));
        $const26$interArgIsa5_1 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa5-1"));
        $const27$interArgIsa5_2 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa5-2"));
        $const28$interArgIsa5_3 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa5-3"));
        $const29$interArgIsa5_4 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsa5-4"));
        $list30 = ConsesLow.list((SubLObject)at_utilities.ONE_INTEGER, (SubLObject)at_utilities.TWO_INTEGER);
        $const31$interArgNotIsa1_2 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-2"));
        $const32$interArgNotIsa1_3 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-3"));
        $const33$interArgNotIsa1_4 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-4"));
        $const34$interArgNotIsa1_5 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-5"));
        $str35$invalid_arg_not_isa_pred_index___ = SubLObjectFactory.makeString("invalid arg-not-isa-pred index: ~s-~s");
        $const36$interArgNotIsa2_3 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa2-3"));
        $const37$interArgNotIsa2_4 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa2-4"));
        $const38$interArgNotIsa2_5 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa2-5"));
        $const39$interArgNotIsa3_4 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa3-4"));
        $const40$interArgNotIsa3_5 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa3-5"));
        $const41$interArgNotIsa4_5 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa4-5"));
        $const42$interArgGenl1_2 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgGenl1-2"));
        $str43$invalid_arg_genl_pred_index___s__ = SubLObjectFactory.makeString("invalid arg-genl-pred index: ~s-~s");
        $const44$interArgGenl2_1 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgGenl2-1"));
        $const45$interArgGenl2_4 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgGenl2-4"));
        $const46$interArgNotGenl1_2 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotGenl1-2"));
        $str47$invalid_arg_not_genl_pred_index__ = SubLObjectFactory.makeString("invalid arg-not-genl-pred index: ~s-~s");
        $const48$interArgIsaGenl1_2 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl1-2"));
        $str49$invalid_arg_isa_genl_pred_index__ = SubLObjectFactory.makeString("invalid arg-isa-genl-pred index: ~s-~s");
        $const50$interArgIsaGenl2_1 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl2-1"));
        $const51$interArgIsaGenl2_3 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl2-3"));
        $const52$interArgIsaGenl3_2 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl3-2"));
        $str53$invalid_arg_genl_isa_pred_index__ = SubLObjectFactory.makeString("invalid arg-genl-isa-pred index: ~s-~s");
        $const54$interArgGenlIsa2_1 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgGenlIsa2-1"));
        $const55$TruthFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TruthFunction"));
        $const56$ArgIsaBinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArgIsaBinaryPredicate"));
        $const57$ArgIsaTernaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArgIsaTernaryPredicate"));
        $const58$ArgIsaPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArgIsaPredicate"));
        $const59$ArgGenlBinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArgGenlBinaryPredicate"));
        $const60$ArgGenlTernaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArgGenlTernaryPredicate"));
        $const61$ArgGenlPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArgGenlPredicate"));
        $sym62$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $const63$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $kw64$STRONG_FORT = SubLObjectFactory.makeKeyword("STRONG-FORT");
        $kw65$ISA = SubLObjectFactory.makeKeyword("ISA");
        $const66$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const67$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $kw68$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $sym69$TREE_POSITION_P = SubLObjectFactory.makeSymbol("TREE-POSITION-P");
        $sym70$CYCL_FORMULA_ = SubLObjectFactory.makeSymbol("CYCL-FORMULA?");
        $kw71$EL_VAR = SubLObjectFactory.makeKeyword("EL-VAR");
        $sym72$RELEVANT_MT_IS_SPEC_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-SPEC-MT");
        $sym73$GATHER_VIA_MAP_PRED_INDEX = SubLObjectFactory.makeSymbol("GATHER-VIA-MAP-PRED-INDEX");
        $sym74$GATHER_ASSERTIONS = SubLObjectFactory.makeSymbol("GATHER-ASSERTIONS");
        $kw75$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym76$_SOME_INTER_ARG_ISA_ASSERTION_SOMEWHERE_CACHE_ = SubLObjectFactory.makeSymbol("*SOME-INTER-ARG-ISA-ASSERTION-SOMEWHERE-CACHE*");
        $sym77$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const78$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str79$Initializing___interArgIsa_cache = SubLObjectFactory.makeString("Initializing #$interArgIsa cache");
        $str80$cdolist = SubLObjectFactory.makeString("cdolist");
        $kw81$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const82$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw83$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw84$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw85$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym86$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw87$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str88$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym89$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw90$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str91$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw92$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str93$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str94$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str95$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str96$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym97$_SOME_INTER_ARG_FORMAT_ASSERTION_SOMEWHERE_CACHE_ = SubLObjectFactory.makeSymbol("*SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE*");
        $str98$Initializing___interArgFormat_cac = SubLObjectFactory.makeString("Initializing #$interArgFormat cache");
        $const99$GenericArgTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenericArgTemplate"));
        $const100$KeywordVariableTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KeywordVariableTemplate"));
        $str101$got_an_arg_type_predicate___s__th = SubLObjectFactory.makeString("got an arg-type predicate (~s) that's neither binary nor ternary in ~s");
        $kw102$FORMAT = SubLObjectFactory.makeKeyword("FORMAT");
        $kw103$DIFFERENT = SubLObjectFactory.makeKeyword("DIFFERENT");
        $kw104$AT_MAPPING_DONE = SubLObjectFactory.makeKeyword("AT-MAPPING-DONE");
        $sym105$AT_ERROR = SubLObjectFactory.makeSymbol("AT-ERROR");
        $sym106$AT_NOTE = SubLObjectFactory.makeSymbol("AT-NOTE");
        $str107$__at_test_fails___s_fails__s_cons = SubLObjectFactory.makeString("~%at test fails: ~s fails ~s constraint ~s");
        $str108$__at_test_fails___s_fails__s_cons = SubLObjectFactory.makeString("~%at test fails: ~s fails ~s constraint ~s for arg ~s of reln ~s");
        $kw109$IRREFLEXIVE_PREDICATE = SubLObjectFactory.makeKeyword("IRREFLEXIVE-PREDICATE");
        $kw110$ASYMMETRIC_PREDICATE = SubLObjectFactory.makeKeyword("ASYMMETRIC-PREDICATE");
        $kw111$ANTI_SYMMETRIC_PREDICATE = SubLObjectFactory.makeKeyword("ANTI-SYMMETRIC-PREDICATE");
        $kw112$ANTI_TRANSITIVE_PREDICATE = SubLObjectFactory.makeKeyword("ANTI-TRANSITIVE-PREDICATE");
        $kw113$NEGATION_PREDS = SubLObjectFactory.makeKeyword("NEGATION-PREDS");
        $kw114$NEGATION_INVERSES = SubLObjectFactory.makeKeyword("NEGATION-INVERSES");
        $str115$illegal_value_of__at_mode____s = SubLObjectFactory.makeString("illegal value of *at-mode*: ~s");
        $kw116$PREDICATE_ISA_VIOLATION = SubLObjectFactory.makeKeyword("PREDICATE-ISA-VIOLATION");
        $kw117$META_PREDICATE_VIOLATION = SubLObjectFactory.makeKeyword("META-PREDICATE-VIOLATION");
        $kw118$MAL_ARG_WRT_COL_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-COL-DEFN");
        $const119$CycLSentence_Assertible = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence-Assertible"));
        $kw120$MAL_ARG_WRT_NEC_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-NEC-DEFN");
        $kw121$CHANGE_MT = SubLObjectFactory.makeKeyword("CHANGE-MT");
        $sym122$ASSERTION_ARG_VIOLATION_ = SubLObjectFactory.makeSymbol("ASSERTION-ARG-VIOLATION?");
        $sym123$SEF_VIOLATION_ = SubLObjectFactory.makeSymbol("SEF-VIOLATION?");
        $sym124$PREDICATE_VIOLATION_ = SubLObjectFactory.makeSymbol("PREDICATE-VIOLATION?");
        $kw125$MAL_ARG_WRT_IFF_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-IFF-DEFN");
        $list126 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("ARG"), new SubLObject[] { SubLObjectFactory.makeSymbol("RELN"), SubLObjectFactory.makeSymbol("ARGNUM"), SubLObjectFactory.makeSymbol("COL"), SubLObjectFactory.makeSymbol("DEFN"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("DATA") });
        $sym127$CYC_ASSERTION = SubLObjectFactory.makeSymbol("CYC-ASSERTION");
        $const128$CycLAssertion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLAssertion"));
        $kw129$MAL_ARG_WRT_ARG_FORMAT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-FORMAT");
        $kw130$MAL_ARG_WRT_INTER_ARG_FORMAT = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-FORMAT");
        $kw131$REPLACE_TERM = SubLObjectFactory.makeKeyword("REPLACE-TERM");
        $const132$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("REL"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("VIOLATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("VIA"));
        $kw134$ASSERT = SubLObjectFactory.makeKeyword("ASSERT");
        $const135$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $list136 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ARG"), SubLObjectFactory.makeSymbol("REL"), SubLObjectFactory.makeSymbol("POS"), SubLObjectFactory.makeSymbol("FORMAT"), SubLObjectFactory.makeSymbol("IND-ARG-ISA"), SubLObjectFactory.makeSymbol("IND-POS"), SubLObjectFactory.makeSymbol("IND-ARG"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("VIOLATIONS"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("VIA") });
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ISA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("VIOLATIONS"));
        $kw138$UNASSERT = SubLObjectFactory.makeKeyword("UNASSERT");
        $int139$40 = SubLObjectFactory.makeInteger(40);
        $sym140$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym141$_ = SubLObjectFactory.makeSymbol(">");
        $sym142$SPEC_CARDINALITY = SubLObjectFactory.makeSymbol("SPEC-CARDINALITY");
        $sym143$CACHED_MAX_FLOOR_MTS_OF_NAT = SubLObjectFactory.makeSymbol("CACHED-MAX-FLOOR-MTS-OF-NAT");
        $sym144$_CACHED_MAX_FLOOR_MTS_OF_NAT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-MAX-FLOOR-MTS-OF-NAT-CACHING-STATE*");
        $int145$64 = SubLObjectFactory.makeInteger(64);
        $const146$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $kw147$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const148$Kappa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kappa"));
        $const149$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $sym150$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $str151$___S_____S_____s__ = SubLObjectFactory.makeString("~&~S~%  ~S~%  ~s~%");
        $str152$mapping_Cyc_arguments = SubLObjectFactory.makeString("mapping Cyc arguments");
        $sym153$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw154$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $const155$admittedArgument = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedArgument"));
        $const156$Function_Denotational = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $const157$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $sym158$WARN = SubLObjectFactory.makeSymbol("WARN");
        $const159$AtemporalNecessarilyEssentialColl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtemporalNecessarilyEssentialCollectionType"));
        $const160$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $const161$argGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl"));
        $sym162$VARIABLE_ARITY_RELATION_P = SubLObjectFactory.makeSymbol("VARIABLE-ARITY-RELATION-P");
        $const163$argsIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsIsa"));
        $const164$argsGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsGenl"));
        $sym165$RELATION_P = SubLObjectFactory.makeSymbol("RELATION-P");
        $sym166$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym167$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $const168$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list169 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation")));
        $sym170$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $sym171$VARIABLE_BINDING_SET_ITEM_COMPARATOR = SubLObjectFactory.makeSymbol("VARIABLE-BINDING-SET-ITEM-COMPARATOR");
        $int172$100 = SubLObjectFactory.makeInteger(100);
        $float173$0_01 = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $const174$Number_General = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Number-General"));
        $sym175$ALL_RELATION_CONSTRAINT_SENTENCES = SubLObjectFactory.makeSymbol("ALL-RELATION-CONSTRAINT-SENTENCES");
        $kw176$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw177$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw178$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw179$KB = SubLObjectFactory.makeKeyword("KB");
        $kw180$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw181$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list182 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arity")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)at_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)at_utilities.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)at_utilities.TWO_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)at_utilities.TWO_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMin")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)at_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScalarInterval"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GramsPerLiter"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMin")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GramsPerLiter")), (SubLObject)at_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMax")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GramsPerLiter")), (SubLObject)at_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GramsPerLiter")), (SubLObject)at_utilities.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumericInterval"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GramsPerLiter")), (SubLObject)at_utilities.TWO_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumericInterval"))))));
        $sym183$ALL_RELATION_ARG_CONSTRAINT_SENTENCES = SubLObjectFactory.makeSymbol("ALL-RELATION-ARG-CONSTRAINT-SENTENCES");
        $kw184$TINY = SubLObjectFactory.makeKeyword("TINY");
        $list185 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)at_utilities.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)at_utilities.TWO_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)at_utilities.TWO_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))))));
        $sym186$FORMULA_ARG_CONSTRAINTS_CYCL = SubLObjectFactory.makeSymbol("FORMULA-ARG-CONSTRAINTS-CYCL");
        $list187 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), (SubLObject)SubLObjectFactory.makeSymbol("?X"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))))));
        $str188$Arg_Type_Utilities_Test_Suite = SubLObjectFactory.makeString("Arg-Type Utilities Test Suite");
        $list189 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERIC-ARG-TEST-CASE"));
    }
}

/*

	Total time: 2381 ms
	
*/