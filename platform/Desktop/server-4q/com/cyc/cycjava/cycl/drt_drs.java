package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class drt_drs extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.drt_drs";
    public static final String myFingerPrint = "443da16cffd43e75b1b0e29d7795f869c38e45228bd60e5cb0134914bd0f8d2e";
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 1501L)
    public static SubLSymbol $drt_drs_quant_calls$;
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 8393L)
    private static SubLSymbol $drt_put_available_rms_to_top_level_drs$;
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 8544L)
    private static SubLSymbol $drt_quantproc_hint_fns$;
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 9319L)
    private static SubLSymbol $drt_introduced_var_num_isg$;
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 24866L)
    private static SubLSymbol $drt_possible_rm_coreferences_prev_drs_biases$;
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 25170L)
    private static SubLSymbol $drt_possible_rm_coreferences_max_depth$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$DRS;
    private static final SubLSymbol $sym2$OBJECT;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$PARSING_MT;
    private static final SubLSymbol $sym5$INTERACTION_MT;
    private static final SubLSymbol $sym6$COMPLEX_CONDITIONS;
    private static final SubLSymbol $sym7$SIMPLE_CONDITIONS;
    private static final SubLSymbol $sym8$CYCL_FORMULAS;
    private static final SubLSymbol $sym9$SUB_DRSS;
    private static final SubLSymbol $sym10$SUPER_DRS;
    private static final SubLSymbol $sym11$NEXT_DRS;
    private static final SubLSymbol $sym12$PREV_DRS;
    private static final SubLSymbol $sym13$PRONOMIAL_RMS;
    private static final SubLSymbol $sym14$DEFINITE_RMS;
    private static final SubLSymbol $sym15$AVAILABLE_RMS;
    private static final SubLSymbol $sym16$RMS;
    private static final SubLSymbol $sym17$AUDIENCE;
    private static final SubLSymbol $sym18$SPEAKER;
    private static final SubLSymbol $sym19$INSTANCE_COUNT;
    private static final SubLSymbol $sym20$SUBLOOP_RESERVED_INITIALIZE_DRS_CLASS;
    private static final SubLSymbol $sym21$ISOLATED_P;
    private static final SubLSymbol $sym22$INSTANCE_NUMBER;
    private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_DRS_INSTANCE;
    private static final SubLSymbol $sym24$ADD_RM;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$OUTER_CATCH_FOR_DRS_METHOD;
    private static final SubLSymbol $sym28$DRS_ADD_RM_METHOD;
    private static final SubLSymbol $sym29$ADD_AVAILABLE_RM;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$OUTER_CATCH_FOR_DRS_METHOD;
    private static final SubLSymbol $sym32$DRS_ADD_AVAILABLE_RM_METHOD;
    private static final SubLSymbol $sym33$ADD_DEFINITE_RM;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$OUTER_CATCH_FOR_DRS_METHOD;
    private static final SubLSymbol $sym36$DRS_ADD_DEFINITE_RM_METHOD;
    private static final SubLSymbol $sym37$ADD_PRONOMIAL_RM;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$OUTER_CATCH_FOR_DRS_METHOD;
    private static final SubLSymbol $sym40$DRS_ADD_PRONOMIAL_RM_METHOD;
    private static final SubLSymbol $sym41$NEW;
    private static final SubLString $str42$_______________________INITIAL_RM;
    private static final SubLString $str43$__;
    private static final SubLSymbol $sym44$FIND_RM_BY_TARGET;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$TYPE;
    private static final SubLSymbol $kw47$AVAILABLE;
    private static final SubLString $str48$_______________________INITIAL_DR;
    private static final SubLList $list49;
    private static final SubLObject $const50$EnglishLexiconMt;
    private static final SubLObject $const51$Quantifier;
    private static final SubLObject $const52$LogicalConnective;
    private static final SubLObject $const53$NLNegFn;
    private static final SubLObject $const54$explains_PropProp;
    private static final SubLSymbol $sym55$DRT_COMPLEX_FORMULA_ELEMENT;
    private static final SubLSymbol $sym56$PROCESS;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLObject $list59;
    private static final SubLString $str60$___drs_process_method__A_;
    private static final SubLString $str61$drt_process_drs__more_than_one_co;
    private static final SubLString $str62$1_a__quantifiers___;
    private static final SubLList $list63;
    private static final SubLString $str64$drt_process_drs__A__no_RM_found_f;
    private static final SubLSymbol $sym65$SCOPE;
    private static final SubLString $str66$_1________________modified_RM_;
    private static final SubLString $str67$_1_____________;
    private static final SubLString $str68$1_b__logical_connectives___;
    private static final SubLObject $const69$and;
    private static final SubLString $str70$1_c__quantproc__;
    private static final SubLString $str71$Attempting_reformulation_on_____A;
    private static final SubLSymbol $kw72$PARSING_MT;
    private static final SubLSymbol $kw73$INTERACTION_MT;
    private static final SubLString $str74$Attempting_reformulation_type__A_;
    private static final SubLString $str75$Using_reformulator_result_from__A;
    private static final SubLString $str76$failed_reformulation_on__A__new_c;
    private static final SubLString $str77$failed_reformulation_on__A__new_c;
    private static final SubLString $str78$DRT__A;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$TARGET_VAR;
    private static final SubLString $str81$___2________________modified_RM_;
    private static final SubLString $str82$_2_____________;
    private static final SubLObject $const83$forAll;
    private static final SubLString $str84$___3________________modified_RM_;
    private static final SubLString $str85$_3_____________;
    private static final SubLString $str86$1_d__subcollection_processing__;
    private static final SubLString $str87$1_e__simple_formulas__;
    private static final SubLSymbol $kw88$DEFINITE;
    private static final SubLSymbol $kw89$PRONOMIAL;
    private static final SubLSymbol $sym90$RM_P;
    private static final SubLString $str91$_______________________FINAL_DRS_;
    private static final SubLSymbol $sym92$FIND_ALL_POSSIBLE_RM_COREFERENCES;
    private static final SubLSymbol $sym93$DRS_PROCESS_METHOD;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$FIND_POSSIBLE_RM_COREFERENCES;
    private static final SubLSymbol $sym96$DRS_FIND_ALL_POSSIBLE_RM_COREFERENCES_METHOD;
    private static final SubLList $list97;
    private static final SubLList $list98;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$OUTER_CATCH_FOR_DRS_METHOD;
    private static final SubLSymbol $sym101$FORMULA;
    private static final SubLObject $const102$PronounFn;
    private static final SubLObject $const103$FirstPerson_NLAttr;
    private static final SubLObject $const104$Singular_NLAttr;
    private static final SubLObject $const105$Ungendered_NLAttr;
    private static final SubLObject $const106$SecondPerson_NLAttr;
    private static final SubLSymbol $sym107$COREFERENCE_PROBABILITY;
    private static final SubLFloat $float108$0_0;
    private static final SubLSymbol $sym109$DRS_FIND_POSSIBLE_RM_COREFERENCES_METHOD;
    private static final SubLList $list110;
    private static final SubLSymbol $sym111$ROOT_TERM;
    private static final SubLObject $const112$SubcollectionOfWithRelationToFn;
    private static final SubLObject $const113$SubcollectionOfWithRelationToType;
    private static final SubLObject $const114$SubcollectionOfWithRelationFromFn;
    private static final SubLObject $const115$SubcollectionOfWithRelationFromTy;
    private static final SubLList $list116;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$OUTER_CATCH_FOR_DRS_METHOD;
    private static final SubLSymbol $kw119$TERM;
    private static final SubLSymbol $sym120$TARGET_TERM;
    private static final SubLSymbol $kw121$VAR;
    private static final SubLSymbol $kw122$FORMULA;
    private static final SubLSymbol $kw123$ROOT;
    private static final SubLSymbol $sym124$DRS_RM_ROOT_TERM_METHOD;
    private static final SubLSymbol $sym125$MAPPED_FORMULA;
    private static final SubLSymbol $sym126$DRT_CORRESPONDING_TYPE_SUBCOL_FN_3;
    private static final SubLString $str127$find_rm_by_target___A_maps_to_mul;
    private static final SubLSymbol $sym128$DRS_FIND_RM_BY_TARGET_METHOD;
    private static final SubLObject $const129$isa;
    private static final SubLObject $const130$genls;
    private static final SubLSymbol $sym131$CONSTRUCT_CYCL;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$OUTER_CATCH_FOR_DRS_METHOD;
    private static final SubLString $str134$_______________________FINAL_CYCL;
    private static final SubLString $str135$_A__;
    private static final SubLSymbol $sym136$DRS_CONSTRUCT_CYCL_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 2527L)
    public static SubLObject drt_drs_quant_call_type(final SubLObject quant_call) {
        return quant_call.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 2667L)
    public static SubLObject drt_drs_quant_call_test(final SubLObject quant_call) {
        return conses_high.second(quant_call);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 2808L)
    public static SubLObject drt_drs_quant_call_fn(final SubLObject quant_call) {
        return conses_high.third(quant_call);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 2944L)
    public static SubLObject drt_drs_quant_call_mt(final SubLObject quant_call) {
        return conses_high.fourth(quant_call);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_parsing_mt(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.FIFTEEN_INTEGER, (SubLObject)drt_drs.$sym4$PARSING_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_parsing_mt(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.FIFTEEN_INTEGER, (SubLObject)drt_drs.$sym4$PARSING_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_interaction_mt(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.FOURTEEN_INTEGER, (SubLObject)drt_drs.$sym5$INTERACTION_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_interaction_mt(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.FOURTEEN_INTEGER, (SubLObject)drt_drs.$sym5$INTERACTION_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_complex_conditions(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.THIRTEEN_INTEGER, (SubLObject)drt_drs.$sym6$COMPLEX_CONDITIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_complex_conditions(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.THIRTEEN_INTEGER, (SubLObject)drt_drs.$sym6$COMPLEX_CONDITIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_simple_conditions(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.TWELVE_INTEGER, (SubLObject)drt_drs.$sym7$SIMPLE_CONDITIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_simple_conditions(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.TWELVE_INTEGER, (SubLObject)drt_drs.$sym7$SIMPLE_CONDITIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_cycl_formulas(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.ELEVEN_INTEGER, (SubLObject)drt_drs.$sym8$CYCL_FORMULAS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_cycl_formulas(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.ELEVEN_INTEGER, (SubLObject)drt_drs.$sym8$CYCL_FORMULAS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_sub_drss(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.TEN_INTEGER, (SubLObject)drt_drs.$sym9$SUB_DRSS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_sub_drss(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.TEN_INTEGER, (SubLObject)drt_drs.$sym9$SUB_DRSS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_super_drs(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.NINE_INTEGER, (SubLObject)drt_drs.$sym10$SUPER_DRS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_super_drs(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.NINE_INTEGER, (SubLObject)drt_drs.$sym10$SUPER_DRS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_next_drs(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.EIGHT_INTEGER, (SubLObject)drt_drs.$sym11$NEXT_DRS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_next_drs(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.EIGHT_INTEGER, (SubLObject)drt_drs.$sym11$NEXT_DRS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_prev_drs(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.SEVEN_INTEGER, (SubLObject)drt_drs.$sym12$PREV_DRS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_prev_drs(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.SEVEN_INTEGER, (SubLObject)drt_drs.$sym12$PREV_DRS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_pronomial_rms(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.SIX_INTEGER, (SubLObject)drt_drs.$sym13$PRONOMIAL_RMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_pronomial_rms(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.SIX_INTEGER, (SubLObject)drt_drs.$sym13$PRONOMIAL_RMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_definite_rms(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.FIVE_INTEGER, (SubLObject)drt_drs.$sym14$DEFINITE_RMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_definite_rms(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.FIVE_INTEGER, (SubLObject)drt_drs.$sym14$DEFINITE_RMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_available_rms(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.FOUR_INTEGER, (SubLObject)drt_drs.$sym15$AVAILABLE_RMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_available_rms(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.FOUR_INTEGER, (SubLObject)drt_drs.$sym15$AVAILABLE_RMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_rms(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.THREE_INTEGER, (SubLObject)drt_drs.$sym16$RMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_rms(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.THREE_INTEGER, (SubLObject)drt_drs.$sym16$RMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_audience(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.TWO_INTEGER, (SubLObject)drt_drs.$sym17$AUDIENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_audience(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.TWO_INTEGER, (SubLObject)drt_drs.$sym17$AUDIENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject get_drs_speaker(final SubLObject drs) {
        return classes.subloop_get_access_protected_instance_slot(drs, (SubLObject)drt_drs.ONE_INTEGER, (SubLObject)drt_drs.$sym18$SPEAKER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject set_drs_speaker(final SubLObject drs, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(drs, value, (SubLObject)drt_drs.ONE_INTEGER, (SubLObject)drt_drs.$sym18$SPEAKER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject subloop_reserved_initialize_drs_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym2$OBJECT, (SubLObject)drt_drs.$sym19$INSTANCE_COUNT, (SubLObject)drt_drs.ZERO_INTEGER);
        return (SubLObject)drt_drs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject subloop_reserved_initialize_drs_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym2$OBJECT, (SubLObject)drt_drs.$sym21$ISOLATED_P, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym2$OBJECT, (SubLObject)drt_drs.$sym22$INSTANCE_NUMBER, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym18$SPEAKER, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym17$AUDIENCE, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym16$RMS, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym15$AVAILABLE_RMS, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym14$DEFINITE_RMS, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym13$PRONOMIAL_RMS, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym12$PREV_DRS, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym11$NEXT_DRS, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym10$SUPER_DRS, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym9$SUB_DRSS, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym8$CYCL_FORMULAS, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym7$SIMPLE_CONDITIONS, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym6$COMPLEX_CONDITIONS, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym5$INTERACTION_MT, (SubLObject)drt_drs.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym4$PARSING_MT, (SubLObject)drt_drs.NIL);
        return (SubLObject)drt_drs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 3081L)
    public static SubLObject drs_p(final SubLObject drs) {
        return classes.subloop_instanceof_class(drs, (SubLObject)drt_drs.$sym1$DRS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 4882L)
    public static SubLObject drs_add_rm_method(final SubLObject self, final SubLObject new_rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_drs_method = (SubLObject)drt_drs.NIL;
        SubLObject rms = get_drs_rms(self);
        try {
            thread.throwStack.push(drt_drs.$sym27$OUTER_CATCH_FOR_DRS_METHOD);
            try {
                if (drt_drs.NIL == subl_promotions.memberP(new_rm, rms, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED)) {
                    rms = (SubLObject)ConsesLow.cons(new_rm, rms);
                }
                Dynamic.sublisp_throw((SubLObject)drt_drs.$sym27$OUTER_CATCH_FOR_DRS_METHOD, rms);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)drt_drs.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_drs_rms(self, rms);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)drt_drs.$sym27$OUTER_CATCH_FOR_DRS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_drs_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 5088L)
    public static SubLObject drs_add_available_rm_method(final SubLObject self, final SubLObject new_rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_drs_method = (SubLObject)drt_drs.NIL;
        SubLObject available_rms = get_drs_available_rms(self);
        try {
            thread.throwStack.push(drt_drs.$sym31$OUTER_CATCH_FOR_DRS_METHOD);
            try {
                if (drt_drs.NIL == subl_promotions.memberP(new_rm, available_rms, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED)) {
                    available_rms = (SubLObject)ConsesLow.cons(new_rm, available_rms);
                }
                Dynamic.sublisp_throw((SubLObject)drt_drs.$sym31$OUTER_CATCH_FOR_DRS_METHOD, available_rms);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)drt_drs.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_drs_available_rms(self, available_rms);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)drt_drs.$sym31$OUTER_CATCH_FOR_DRS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_drs_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 5262L)
    public static SubLObject drs_add_definite_rm_method(final SubLObject self, final SubLObject new_rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_drs_method = (SubLObject)drt_drs.NIL;
        SubLObject definite_rms = get_drs_definite_rms(self);
        try {
            thread.throwStack.push(drt_drs.$sym35$OUTER_CATCH_FOR_DRS_METHOD);
            try {
                if (drt_drs.NIL == subl_promotions.memberP(new_rm, definite_rms, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED)) {
                    definite_rms = (SubLObject)ConsesLow.cons(new_rm, definite_rms);
                }
                Dynamic.sublisp_throw((SubLObject)drt_drs.$sym35$OUTER_CATCH_FOR_DRS_METHOD, definite_rms);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)drt_drs.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_drs_definite_rms(self, definite_rms);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)drt_drs.$sym35$OUTER_CATCH_FOR_DRS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_drs_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 5431L)
    public static SubLObject drs_add_pronomial_rm_method(final SubLObject self, final SubLObject new_rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_drs_method = (SubLObject)drt_drs.NIL;
        SubLObject pronomial_rms = get_drs_pronomial_rms(self);
        try {
            thread.throwStack.push(drt_drs.$sym39$OUTER_CATCH_FOR_DRS_METHOD);
            try {
                if (drt_drs.NIL == subl_promotions.memberP(new_rm, pronomial_rms, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED)) {
                    pronomial_rms = (SubLObject)ConsesLow.cons(new_rm, pronomial_rms);
                }
                Dynamic.sublisp_throw((SubLObject)drt_drs.$sym39$OUTER_CATCH_FOR_DRS_METHOD, pronomial_rms);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)drt_drs.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_drs_pronomial_rms(self, pronomial_rms);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)drt_drs.$sym39$OUTER_CATCH_FOR_DRS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_drs_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 5605L)
    public static SubLObject create_drs_from_formula(SubLObject formula, final SubLObject interaction_mt, final SubLObject parsing_mt, SubLObject speaker, SubLObject audience) {
        if (speaker == drt_drs.UNPROVIDED) {
            speaker = (SubLObject)drt_drs.NIL;
        }
        if (audience == drt_drs.UNPROVIDED) {
            audience = (SubLObject)drt_drs.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject drs = methods.funcall_class_method_with_0_args((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym41$NEW);
        SubLObject rms = (SubLObject)drt_drs.NIL;
        final SubLObject rm_formulas = drt_rm.drt_find_rm_formulas(formula);
        SubLObject rm_formula_to_rm_mappings = (SubLObject)drt_drs.NIL;
        instances.set_slot(drs, (SubLObject)drt_drs.$sym5$INTERACTION_MT, interaction_mt);
        instances.set_slot(drs, (SubLObject)drt_drs.$sym4$PARSING_MT, parsing_mt);
        SubLObject cdolist_list_var = Sequences.nreverse(rm_formulas);
        SubLObject rm_formula = (SubLObject)drt_drs.NIL;
        rm_formula = cdolist_list_var.first();
        while (drt_drs.NIL != cdolist_list_var) {
            final SubLObject rm = drt_rm.create_rm_from_rm_formula(rm_formula, rm_formula_to_rm_mappings);
            rm_formula_to_rm_mappings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rm_formula, rm), rm_formula_to_rm_mappings);
            rms = (SubLObject)ConsesLow.cons(rm, rms);
            cdolist_list_var = cdolist_list_var.rest();
            rm_formula = cdolist_list_var.first();
        }
        rms = Sequences.nreverse(rms);
        if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.TWO_INTEGER)) && drt_drs.NIL != rms) {
            PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str42$_______________________INITIAL_RM);
        }
        cdolist_list_var = rms;
        SubLObject rm2 = (SubLObject)drt_drs.NIL;
        rm2 = cdolist_list_var.first();
        while (drt_drs.NIL != cdolist_list_var) {
            if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.TWO_INTEGER)) {
                object.describe_instance(rm2);
                PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str43$__);
            }
            methods.funcall_instance_method_with_1_args(drs, (SubLObject)drt_drs.$sym24$ADD_RM, rm2);
            cdolist_list_var = cdolist_list_var.rest();
            rm2 = cdolist_list_var.first();
        }
        SubLObject new_formula = (SubLObject)drt_drs.NIL;
        new_formula = reformulator_utilities_nl.reformulate_cycl_quantunify_3(formula, interaction_mt, (SubLObject)drt_drs.UNPROVIDED);
        if (drt_drs.NIL != new_formula) {
            SubLObject cdolist_list_var2 = new_formula.rest();
            SubLObject formula_arg = (SubLObject)drt_drs.NIL;
            formula_arg = cdolist_list_var2.first();
            while (drt_drs.NIL != cdolist_list_var2) {
                final SubLObject possible_avail_rms = methods.funcall_instance_method_with_2_args(drs, (SubLObject)drt_drs.$sym44$FIND_RM_BY_TARGET, formula_arg, (SubLObject)drt_drs.$list45);
                if (Sequences.length(possible_avail_rms).eql((SubLObject)drt_drs.ONE_INTEGER)) {
                    final SubLObject avail_rm = possible_avail_rms.first();
                    if (drt_drs.NIL != drt_rm.rm_p(avail_rm)) {
                        instances.set_slot(avail_rm, (SubLObject)drt_drs.$sym46$TYPE, (SubLObject)drt_drs.$kw47$AVAILABLE);
                        methods.funcall_instance_method_with_1_args(drs, (SubLObject)drt_drs.$sym29$ADD_AVAILABLE_RM, avail_rm);
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                formula_arg = cdolist_list_var2.first();
            }
            formula = new_formula;
        }
        instances.set_slot(drs, (SubLObject)drt_drs.$sym8$CYCL_FORMULAS, (SubLObject)ConsesLow.list(formula));
        instances.set_slot(drs, (SubLObject)drt_drs.$sym18$SPEAKER, speaker);
        instances.set_slot(drs, (SubLObject)drt_drs.$sym17$AUDIENCE, audience);
        instances.set_slot(drs, (SubLObject)drt_drs.$sym12$PREV_DRS, drt.drt_get_last_drs_for_speaker(speaker));
        drt.drt_set_last_drs_for_speaker(speaker, drs);
        cdolist_list_var = audience;
        SubLObject audience_member = (SubLObject)drt_drs.NIL;
        audience_member = cdolist_list_var.first();
        while (drt_drs.NIL != cdolist_list_var) {
            drt.drt_set_last_drs_for_speaker(audience_member, drs);
            cdolist_list_var = cdolist_list_var.rest();
            audience_member = cdolist_list_var.first();
        }
        drt.$drt_drs_list$.setDynamicValue((SubLObject)ConsesLow.cons(drs, drt.$drt_drs_list$.getDynamicValue(thread)), thread);
        if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.TWO_INTEGER)) {
            PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str48$_______________________INITIAL_DR);
            object.describe_instance(drs);
        }
        return drs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 8704L)
    public static SubLObject drt_quantproc_hint_fn_p(final SubLObject fort, SubLObject mt) {
        if (mt == drt_drs.UNPROVIDED) {
            mt = drt_drs.$const50$EnglishLexiconMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(fort, drt_drs.$drt_quantproc_hint_fns$.getDynamicValue(thread), (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 8882L)
    public static SubLObject drt_complex_formula_element(final SubLObject elem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(drt_drs.NIL != forts.fort_p(elem) && (drt_drs.NIL != isa.isaP(elem, drt_drs.$const51$Quantifier, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED) || drt_drs.NIL != isa.isaP(elem, drt_drs.$const52$LogicalConnective, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED) || elem.eql(drt_drs.$const53$NLNegFn) || elem.eql(drt_drs.$const54$explains_PropProp) || drt_drs.NIL != drt_quantproc_hint_fn_p(elem, (SubLObject)drt_drs.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 9159L)
    public static SubLObject drt_complex_formulaP(final SubLObject formula) {
        return list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)drt_drs.$sym55$DRT_COMPLEX_FORMULA_ELEMENT), formula, (SubLObject)drt_drs.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 9403L)
    public static SubLObject drs_process_method(final SubLObject self, SubLObject carry_possible_rm_coreferences) {
        if (carry_possible_rm_coreferences == drt_drs.UNPROVIDED) {
            carry_possible_rm_coreferences = (SubLObject)drt_drs.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject parsing_mt = get_drs_parsing_mt(self);
        final SubLObject interaction_mt = get_drs_interaction_mt(self);
        SubLObject complex_conditions = get_drs_complex_conditions(self);
        SubLObject simple_conditions = get_drs_simple_conditions(self);
        SubLObject cycl_formulas = get_drs_cycl_formulas(self);
        final SubLObject sub_drss = get_drs_sub_drss(self);
        final SubLObject super_drs = get_drs_super_drs(self);
        SubLObject pronomial_rms = get_drs_pronomial_rms(self);
        SubLObject definite_rms = get_drs_definite_rms(self);
        SubLObject available_rms = get_drs_available_rms(self);
        if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.FOUR_INTEGER)) {
            PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str60$___drs_process_method__A_, self);
            object.object_describe_instance_method(self, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED);
            PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str43$__);
        }
        SubLObject simple_formulas = (SubLObject)drt_drs.NIL;
        SubLObject complex_formulas = (SubLObject)drt_drs.NIL;
        SubLObject cdolist_list_var = cycl_formulas;
        SubLObject cycl_formula = (SubLObject)drt_drs.NIL;
        cycl_formula = cdolist_list_var.first();
        while (drt_drs.NIL != cdolist_list_var) {
            if (drt_drs.NIL != drt_complex_formulaP(cycl_formula)) {
                complex_formulas = (SubLObject)ConsesLow.cons(cycl_formula, complex_formulas);
            }
            else {
                simple_formulas = (SubLObject)ConsesLow.cons(cycl_formula, simple_formulas);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl_formula = cdolist_list_var.first();
        }
        if (drt_drs.NIL != complex_formulas) {
            if (Sequences.length(complex_formulas).numG((SubLObject)drt_drs.ONE_INTEGER) && drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.ONE_INTEGER)) {
                Errors.warn((SubLObject)drt_drs.$str61$drt_process_drs__more_than_one_co, self, complex_formulas);
            }
            final SubLObject complex_formula = complex_formulas.first();
            final SubLObject complex_formula_arg0 = cycl_utilities.formula_arg0(complex_formula);
            complex_formulas = complex_formulas.rest();
            cycl_formulas = instances.set_slot(self, (SubLObject)drt_drs.$sym8$CYCL_FORMULAS, ConsesLow.append(complex_formulas, simple_formulas));
            if (drt_drs.NIL != isa.isaP(complex_formula_arg0, drt_drs.$const51$Quantifier, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED)) {
                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.THREE_INTEGER)) && drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.ONE_INTEGER)) {
                    Errors.warn((SubLObject)drt_drs.$str62$1_a__quantifiers___);
                }
                final SubLObject target_var = cycl_utilities.formula_arg1(complex_formula, (SubLObject)drt_drs.UNPROVIDED);
                final SubLObject rm = methods.funcall_instance_method_with_2_args(self, (SubLObject)drt_drs.$sym44$FIND_RM_BY_TARGET, target_var, (SubLObject)drt_drs.$list63).first();
                if (drt_drs.NIL == rm && drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.ONE_INTEGER)) {
                    Errors.warn((SubLObject)drt_drs.$str64$drt_process_drs__A__no_RM_found_f, self, target_var, complex_formula);
                }
                if (drt_drs.NIL != rm) {
                    if (drt_drs.NIL == instances.get_slot(rm, (SubLObject)drt_drs.$sym65$SCOPE)) {
                        instances.set_slot(rm, (SubLObject)drt_drs.$sym65$SCOPE, complex_formula_arg0);
                    }
                    if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.FOUR_INTEGER)) {
                        PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str66$_1________________modified_RM_);
                        object.describe_instance(rm);
                        PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str67$_1_____________);
                    }
                }
                complex_formulas = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg2(complex_formula, (SubLObject)drt_drs.UNPROVIDED), complex_formulas);
                cycl_formulas = instances.set_slot(self, (SubLObject)drt_drs.$sym8$CYCL_FORMULAS, ConsesLow.append(complex_formulas, simple_formulas));
            }
            else if (drt_drs.NIL != isa.isaP(complex_formula_arg0, drt_drs.$const52$LogicalConnective, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED) || complex_formula_arg0.eql(drt_drs.$const53$NLNegFn) || complex_formula_arg0.eql(drt_drs.$const54$explains_PropProp)) {
                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.THREE_INTEGER)) && drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.ONE_INTEGER)) {
                    Errors.warn((SubLObject)drt_drs.$str68$1_b__logical_connectives___);
                }
                SubLObject new_complex_condition = (SubLObject)ConsesLow.list(complex_formula_arg0);
                SubLObject subdrs_list = (SubLObject)drt_drs.NIL;
                final SubLObject pcase_var = complex_formula_arg0;
                if (pcase_var.eql(drt_drs.$const69$and)) {
                    complex_formulas = ConsesLow.append(cycl_utilities.formula_args(complex_formula, (SubLObject)drt_drs.UNPROVIDED), complex_formulas);
                    cycl_formulas = instances.set_slot(self, (SubLObject)drt_drs.$sym8$CYCL_FORMULAS, ConsesLow.append(complex_formulas, simple_formulas));
                }
                else {
                    SubLObject last_new_drs = (SubLObject)drt_drs.NIL;
                    SubLObject cdolist_list_var2;
                    final SubLObject formula_args = cdolist_list_var2 = cycl_utilities.formula_args(complex_formula, (SubLObject)drt_drs.UNPROVIDED);
                    SubLObject formula_arg = (SubLObject)drt_drs.NIL;
                    formula_arg = cdolist_list_var2.first();
                    while (drt_drs.NIL != cdolist_list_var2) {
                        if (formula_arg.isCons()) {
                            final SubLObject subdrs = methods.funcall_class_method_with_0_args((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym41$NEW);
                            instances.set_slot(subdrs, (SubLObject)drt_drs.$sym5$INTERACTION_MT, interaction_mt);
                            instances.set_slot(subdrs, (SubLObject)drt_drs.$sym4$PARSING_MT, parsing_mt);
                            instances.set_slot(subdrs, (SubLObject)drt_drs.$sym8$CYCL_FORMULAS, (SubLObject)ConsesLow.list(formula_arg));
                            if (drt_drs.NIL != last_new_drs) {
                                instances.set_slot(subdrs, (SubLObject)drt_drs.$sym10$SUPER_DRS, last_new_drs);
                                instances.set_slot(last_new_drs, (SubLObject)drt_drs.$sym9$SUB_DRSS, (SubLObject)ConsesLow.list(subdrs));
                            }
                            else {
                                instances.set_slot(subdrs, (SubLObject)drt_drs.$sym10$SUPER_DRS, self);
                                instances.set_slot(self, (SubLObject)drt_drs.$sym9$SUB_DRSS, (SubLObject)ConsesLow.list(subdrs));
                            }
                            last_new_drs = subdrs;
                            new_complex_condition = (SubLObject)ConsesLow.cons(subdrs, new_complex_condition);
                            subdrs_list = (SubLObject)ConsesLow.cons(subdrs, subdrs_list);
                        }
                        else {
                            new_complex_condition = (SubLObject)ConsesLow.cons(formula_arg, new_complex_condition);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        formula_arg = cdolist_list_var2.first();
                    }
                    new_complex_condition = Sequences.nreverse(new_complex_condition);
                    complex_conditions = instances.set_slot(self, (SubLObject)drt_drs.$sym6$COMPLEX_CONDITIONS, (SubLObject)ConsesLow.cons(new_complex_condition, complex_conditions));
                    cycl_formulas = instances.set_slot(self, (SubLObject)drt_drs.$sym8$CYCL_FORMULAS, ConsesLow.append(complex_formulas, simple_formulas));
                    SubLObject possible_rm_coreferences = (SubLObject)drt_drs.NIL;
                    SubLObject cdolist_list_var3 = subdrs_list;
                    SubLObject subdrs2 = (SubLObject)drt_drs.NIL;
                    subdrs2 = cdolist_list_var3.first();
                    while (drt_drs.NIL != cdolist_list_var3) {
                        final SubLObject sub_possible_rm_coreferences = methods.funcall_instance_method_with_0_args(subdrs2, (SubLObject)drt_drs.$sym56$PROCESS);
                        if (sub_possible_rm_coreferences == drt_drs.T) {
                            return (SubLObject)drt_drs.T;
                        }
                        possible_rm_coreferences = ConsesLow.append(sub_possible_rm_coreferences, possible_rm_coreferences);
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        subdrs2 = cdolist_list_var3.first();
                    }
                    carry_possible_rm_coreferences = ConsesLow.append(carry_possible_rm_coreferences, possible_rm_coreferences);
                }
            }
            else {
                if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.THREE_INTEGER)) {
                    if (drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.ONE_INTEGER)) {
                        Errors.warn((SubLObject)drt_drs.$str70$1_c__quantproc__);
                    }
                    PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str71$Attempting_reformulation_on_____A, complex_formula);
                }
                SubLObject new_complex_formula = (SubLObject)drt_drs.NIL;
                SubLObject doneP = (SubLObject)drt_drs.NIL;
                if (drt_drs.NIL == doneP) {
                    SubLObject csome_list_var = drt_drs.$drt_drs_quant_calls$.getDynamicValue(thread);
                    SubLObject quant_call = (SubLObject)drt_drs.NIL;
                    quant_call = csome_list_var.first();
                    while (drt_drs.NIL == doneP && drt_drs.NIL != csome_list_var) {
                        final SubLObject quant_call_type = drt_drs_quant_call_type(quant_call);
                        final SubLObject quant_call_test = drt_drs_quant_call_test(quant_call);
                        final SubLObject quant_call_fn = drt_drs_quant_call_fn(quant_call);
                        final SubLObject pcase_var2;
                        SubLObject quant_call_mt = pcase_var2 = drt_drs_quant_call_mt(quant_call);
                        if (pcase_var2.eql((SubLObject)drt_drs.$kw72$PARSING_MT)) {
                            quant_call_mt = parsing_mt;
                        }
                        else if (pcase_var2.eql((SubLObject)drt_drs.$kw73$INTERACTION_MT)) {
                            quant_call_mt = interaction_mt;
                        }
                        else {
                            quant_call_mt = interaction_mt;
                        }
                        if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.THREE_INTEGER)) {
                            PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str74$Attempting_reformulation_type__A_, quant_call_type, quant_call_mt);
                        }
                        if (quant_call_test.isFunctionSpec() && drt_drs.NIL != Functions.funcall(quant_call_test, complex_formula) && quant_call_fn.isFunctionSpec()) {
                            new_complex_formula = Functions.funcall(quant_call_fn, complex_formula, quant_call_mt);
                        }
                        if (drt_drs.NIL != new_complex_formula && !new_complex_formula.equal(complex_formula)) {
                            if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.THREE_INTEGER)) {
                                PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str75$Using_reformulator_result_from__A, quant_call_type, new_complex_formula);
                            }
                            doneP = (SubLObject)drt_drs.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        quant_call = csome_list_var.first();
                    }
                }
                if (drt_drs.NIL == new_complex_formula) {
                    if (drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.ONE_INTEGER)) {
                        Errors.warn((SubLObject)drt_drs.$str76$failed_reformulation_on__A__new_c, complex_formula);
                    }
                    return (SubLObject)drt_drs.T;
                }
                if (new_complex_formula.equal(complex_formula)) {
                    if (drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.ONE_INTEGER)) {
                        Errors.warn((SubLObject)drt_drs.$str77$failed_reformulation_on__A__new_c, complex_formula);
                    }
                    return (SubLObject)drt_drs.T;
                }
                final SubLObject new_complex_formula_arg0 = cycl_utilities.formula_arg0(new_complex_formula);
                if (drt_drs.NIL != isa.isaP(new_complex_formula_arg0, drt_drs.$const51$Quantifier, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED)) {
                    SubLObject introduced_var = cycl_utilities.formula_arg1(new_complex_formula, (SubLObject)drt_drs.UNPROVIDED);
                    final SubLObject unique_var = cycl_variables.make_el_var(PrintLow.format((SubLObject)drt_drs.NIL, (SubLObject)drt_drs.$str78$DRT__A, integer_sequence_generator.integer_sequence_generator_next(drt_drs.$drt_introduced_var_num_isg$.getGlobalValue())));
                    if (drt_drs.NIL != cycl_variables.el_varP(introduced_var)) {
                        new_complex_formula = list_utilities.tree_substitute(new_complex_formula, introduced_var, unique_var);
                    }
                    complex_formulas = (SubLObject)ConsesLow.cons(new_complex_formula, complex_formulas);
                    cycl_formulas = instances.set_slot(self, (SubLObject)drt_drs.$sym8$CYCL_FORMULAS, ConsesLow.append(complex_formulas, simple_formulas));
                    introduced_var = cycl_utilities.formula_arg1(new_complex_formula, (SubLObject)drt_drs.UNPROVIDED);
                    final SubLObject subformula = cycl_utilities.formula_arg2(new_complex_formula, (SubLObject)drt_drs.UNPROVIDED);
                    final SubLObject target_terms = find_terms_for_var_in_formula(introduced_var, subformula);
                    SubLObject rm2 = (SubLObject)drt_drs.NIL;
                    SubLObject doneP2 = (SubLObject)drt_drs.NIL;
                    SubLObject done2P = (SubLObject)drt_drs.NIL;
                    if (drt_drs.NIL == doneP2) {
                        SubLObject csome_list_var2 = target_terms;
                        SubLObject target_term = (SubLObject)drt_drs.NIL;
                        target_term = csome_list_var2.first();
                        while (drt_drs.NIL == doneP2 && drt_drs.NIL != csome_list_var2) {
                            final SubLObject poss_rms = methods.funcall_instance_method_with_2_args(self, (SubLObject)drt_drs.$sym44$FIND_RM_BY_TARGET, target_term, (SubLObject)drt_drs.$list79);
                            if (drt_drs.NIL == done2P) {
                                SubLObject csome_list_var_$1 = poss_rms;
                                SubLObject poss_rm = (SubLObject)drt_drs.NIL;
                                poss_rm = csome_list_var_$1.first();
                                while (drt_drs.NIL == done2P && drt_drs.NIL != csome_list_var_$1) {
                                    if (drt_drs.NIL != drt_rm.rm_p(poss_rm) && drt_drs.NIL == instances.get_slot(poss_rm, (SubLObject)drt_drs.$sym80$TARGET_VAR)) {
                                        rm2 = poss_rm;
                                        doneP2 = (SubLObject)drt_drs.T;
                                        done2P = (SubLObject)drt_drs.T;
                                    }
                                    csome_list_var_$1 = csome_list_var_$1.rest();
                                    poss_rm = csome_list_var_$1.first();
                                }
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            target_term = csome_list_var2.first();
                        }
                    }
                    if (drt_drs.NIL != drt_rm.rm_p(rm2)) {
                        instances.set_slot(rm2, (SubLObject)drt_drs.$sym80$TARGET_VAR, introduced_var);
                        instances.set_slot(rm2, (SubLObject)drt_drs.$sym65$SCOPE, new_complex_formula_arg0);
                        if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.FOUR_INTEGER)) {
                            PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str81$___2________________modified_RM_);
                            object.describe_instance(rm2);
                            PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str82$_2_____________);
                        }
                    }
                }
                else if (drt_drs.NIL != isa.isaP(new_complex_formula_arg0, drt_drs.$const52$LogicalConnective, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED)) {
                    SubLObject introduced_var = conses_high.second(conses_high.second(new_complex_formula));
                    final SubLObject unique_var = cycl_variables.make_el_var(PrintLow.format((SubLObject)drt_drs.NIL, (SubLObject)drt_drs.$str78$DRT__A, integer_sequence_generator.integer_sequence_generator_next(drt_drs.$drt_introduced_var_num_isg$.getGlobalValue())));
                    if (drt_drs.NIL != cycl_variables.el_varP(introduced_var)) {
                        new_complex_formula = list_utilities.tree_substitute(new_complex_formula, introduced_var, unique_var);
                    }
                    complex_formulas = (SubLObject)ConsesLow.cons(new_complex_formula, complex_formulas);
                    cycl_formulas = instances.set_slot(self, (SubLObject)drt_drs.$sym8$CYCL_FORMULAS, ConsesLow.append(complex_formulas, simple_formulas));
                    introduced_var = conses_high.second(conses_high.second(new_complex_formula));
                    final SubLObject target_term2 = conses_high.third(conses_high.second(new_complex_formula));
                    final SubLObject poss_rms2 = methods.funcall_instance_method_with_2_args(self, (SubLObject)drt_drs.$sym44$FIND_RM_BY_TARGET, target_term2, (SubLObject)drt_drs.$list45);
                    SubLObject rm2 = (SubLObject)drt_drs.NIL;
                    SubLObject doneP2 = (SubLObject)drt_drs.NIL;
                    if (drt_drs.NIL == doneP2) {
                        SubLObject csome_list_var3 = poss_rms2;
                        SubLObject poss_rm2 = (SubLObject)drt_drs.NIL;
                        poss_rm2 = csome_list_var3.first();
                        while (drt_drs.NIL == doneP2 && drt_drs.NIL != csome_list_var3) {
                            if (drt_drs.NIL != drt_rm.rm_p(poss_rm2) && drt_drs.NIL == instances.get_slot(poss_rm2, (SubLObject)drt_drs.$sym80$TARGET_VAR)) {
                                rm2 = poss_rm2;
                                doneP2 = (SubLObject)drt_drs.T;
                            }
                            csome_list_var3 = csome_list_var3.rest();
                            poss_rm2 = csome_list_var3.first();
                        }
                    }
                    instances.set_slot(rm2, (SubLObject)drt_drs.$sym80$TARGET_VAR, introduced_var);
                    instances.set_slot(rm2, (SubLObject)drt_drs.$sym65$SCOPE, drt_drs.$const83$forAll);
                    if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.FOUR_INTEGER)) {
                        PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str84$___3________________modified_RM_);
                        object.describe_instance(rm2);
                        PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str85$_3_____________);
                    }
                }
                else {
                    complex_formulas = (SubLObject)ConsesLow.cons(new_complex_formula, complex_formulas);
                    cycl_formulas = instances.set_slot(self, (SubLObject)drt_drs.$sym8$CYCL_FORMULAS, ConsesLow.append(complex_formulas, simple_formulas));
                }
            }
        }
        if (drt_drs.NIL != simple_formulas) {
            if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.THREE_INTEGER)) && drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.ONE_INTEGER)) {
                Errors.warn((SubLObject)drt_drs.$str86$1_d__subcollection_processing__);
            }
            SubLObject new_simple_formulas = (SubLObject)drt_drs.NIL;
            SubLObject new_complex_formulas = complex_formulas;
            SubLObject cdolist_list_var4 = simple_formulas;
            SubLObject simple_formula = (SubLObject)drt_drs.NIL;
            simple_formula = cdolist_list_var4.first();
            while (drt_drs.NIL != cdolist_list_var4) {
                final SubLObject poss_new_formula = reformulator_utilities_nl.reformulate_cycl_subcollproc(simple_formula, interaction_mt, (SubLObject)drt_drs.UNPROVIDED);
                if (drt_drs.NIL == poss_new_formula || poss_new_formula.equal(simple_formula)) {
                    new_simple_formulas = (SubLObject)ConsesLow.cons(simple_formula, new_simple_formulas);
                }
                else {
                    new_complex_formulas = (SubLObject)ConsesLow.cons(poss_new_formula, new_complex_formulas);
                }
                cdolist_list_var4 = cdolist_list_var4.rest();
                simple_formula = cdolist_list_var4.first();
            }
            simple_formulas = new_simple_formulas;
            complex_formulas = new_complex_formulas;
            cycl_formulas = instances.set_slot(self, (SubLObject)drt_drs.$sym8$CYCL_FORMULAS, ConsesLow.append(complex_formulas, simple_formulas));
        }
        if (drt_drs.NIL != simple_formulas) {
            if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.THREE_INTEGER)) && drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.ONE_INTEGER)) {
                Errors.warn((SubLObject)drt_drs.$str87$1_e__simple_formulas__);
            }
            cdolist_list_var = simple_formulas;
            SubLObject simple_formula2 = (SubLObject)drt_drs.NIL;
            simple_formula2 = cdolist_list_var.first();
            while (drt_drs.NIL != cdolist_list_var) {
                final SubLObject simple_condition = drt_drs_map_add_rms_to_formula(self, simple_formula2);
                SubLObject cdolist_list_var_$2 = list_utilities.tree_find_all_if(Symbols.symbol_function((SubLObject)drt_drs.$sym90$RM_P), simple_condition, (SubLObject)drt_drs.UNPROVIDED);
                SubLObject rm3 = (SubLObject)drt_drs.NIL;
                rm3 = cdolist_list_var_$2.first();
                while (drt_drs.NIL != cdolist_list_var_$2) {
                    final SubLObject pcase_var3 = instances.get_slot(rm3, (SubLObject)drt_drs.$sym46$TYPE);
                    if (pcase_var3.eql((SubLObject)drt_drs.$kw88$DEFINITE)) {
                        definite_rms = methods.funcall_instance_method_with_1_args(self, (SubLObject)drt_drs.$sym33$ADD_DEFINITE_RM, rm3);
                    }
                    else if (pcase_var3.eql((SubLObject)drt_drs.$kw89$PRONOMIAL)) {
                        pronomial_rms = methods.funcall_instance_method_with_1_args(self, (SubLObject)drt_drs.$sym37$ADD_PRONOMIAL_RM, rm3);
                    }
                    else {
                        available_rms = methods.funcall_instance_method_with_1_args(self, (SubLObject)drt_drs.$sym29$ADD_AVAILABLE_RM, rm3);
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    rm3 = cdolist_list_var_$2.first();
                }
                simple_conditions = instances.set_slot(self, (SubLObject)drt_drs.$sym7$SIMPLE_CONDITIONS, (SubLObject)ConsesLow.cons(simple_condition, simple_conditions));
                cdolist_list_var = cdolist_list_var.rest();
                simple_formula2 = cdolist_list_var.first();
            }
            simple_formulas = (SubLObject)drt_drs.NIL;
            cycl_formulas = instances.set_slot(self, (SubLObject)drt_drs.$sym8$CYCL_FORMULAS, complex_formulas);
        }
        if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.TWO_INTEGER)) && drt_drs.NIL == cycl_formulas) {
            PrintLow.format((SubLObject)drt_drs.T, (SubLObject)drt_drs.$str91$_______________________FINAL_DRS_);
            object.object_describe_instance_method(self, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED);
        }
        if (drt_drs.NIL != cycl_formulas) {
            return methods.funcall_instance_method_with_1_args(self, (SubLObject)drt_drs.$sym56$PROCESS, carry_possible_rm_coreferences);
        }
        return methods.funcall_instance_method_with_0_args(self, (SubLObject)drt_drs.$sym92$FIND_ALL_POSSIBLE_RM_COREFERENCES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 23259L)
    public static SubLObject drs_find_all_possible_rm_coreferences_method(final SubLObject self) {
        final SubLObject sub_drss = get_drs_sub_drss(self);
        final SubLObject pronomial_rms = get_drs_pronomial_rms(self);
        SubLObject result = (SubLObject)drt_drs.NIL;
        if (drt_drs.NIL != sub_drss) {
            SubLObject cdolist_list_var = sub_drss;
            SubLObject sub_drs = (SubLObject)drt_drs.NIL;
            sub_drs = cdolist_list_var.first();
            while (drt_drs.NIL != cdolist_list_var) {
                result = ConsesLow.append(new SubLObject[] { methods.funcall_instance_method_with_0_args(sub_drs, (SubLObject)drt_drs.$sym92$FIND_ALL_POSSIBLE_RM_COREFERENCES) });
                cdolist_list_var = cdolist_list_var.rest();
                sub_drs = cdolist_list_var.first();
            }
        }
        if (drt_drs.NIL != pronomial_rms) {
            SubLObject cdolist_list_var = pronomial_rms;
            SubLObject pronomial_rm = (SubLObject)drt_drs.NIL;
            pronomial_rm = cdolist_list_var.first();
            while (drt_drs.NIL != cdolist_list_var) {
                final SubLObject possible_rm_coreferences = methods.funcall_instance_method_with_1_args(self, (SubLObject)drt_drs.$sym95$FIND_POSSIBLE_RM_COREFERENCES, pronomial_rm);
                if (drt_drs.NIL != possible_rm_coreferences) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pronomial_rm, possible_rm_coreferences), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pronomial_rm = cdolist_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 24279L)
    public static SubLObject possible_rm_coreference_source_rm(final SubLObject possible_rm_coreference) {
        return possible_rm_coreference.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 24478L)
    public static SubLObject possible_rm_coreference_targets(final SubLObject possible_rm_coreference) {
        return conses_high.second(possible_rm_coreference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 24594L)
    public static SubLObject possible_rm_coreference_target_rm(final SubLObject possible_rm_coreference_target) {
        return possible_rm_coreference_target.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 24725L)
    public static SubLObject possible_rm_coreference_target_probability(final SubLObject possible_rm_coreference_target) {
        return conses_high.second(possible_rm_coreference_target);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 25373L)
    public static SubLObject drs_find_possible_rm_coreferences_method(final SubLObject self, final SubLObject rm, SubLObject depth, SubLObject cutoff) {
        if (depth == drt_drs.UNPROVIDED) {
            depth = drt_drs.$drt_possible_rm_coreferences_max_depth$.getDynamicValue();
        }
        if (cutoff == drt_drs.UNPROVIDED) {
            cutoff = (SubLObject)drt_drs.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_drs_method = (SubLObject)drt_drs.NIL;
        final SubLObject super_drs = get_drs_super_drs(self);
        final SubLObject prev_drs = get_drs_prev_drs(self);
        final SubLObject definite_rms = get_drs_definite_rms(self);
        final SubLObject available_rms = get_drs_available_rms(self);
        final SubLObject audience = get_drs_audience(self);
        final SubLObject speaker = get_drs_speaker(self);
        try {
            thread.throwStack.push(drt_drs.$sym100$OUTER_CATCH_FOR_DRS_METHOD);
            try {
                SubLObject possible_rm_coreference_value_pairs = (SubLObject)drt_drs.NIL;
                final SubLObject rm_formula = instances.get_slot(rm, (SubLObject)drt_drs.$sym101$FORMULA);
                if (cycl_utilities.formula_arg0(rm_formula).eql(drt_drs.$const102$PronounFn)) {
                    if (cycl_utilities.formula_arg1(rm_formula, (SubLObject)drt_drs.UNPROVIDED).eql(drt_drs.$const103$FirstPerson_NLAttr) && cycl_utilities.formula_arg2(rm_formula, (SubLObject)drt_drs.UNPROVIDED).eql(drt_drs.$const104$Singular_NLAttr) && cycl_utilities.formula_arg3(rm_formula, (SubLObject)drt_drs.UNPROVIDED).eql(drt_drs.$const105$Ungendered_NLAttr) && drt_drs.NIL != forts.fort_p(speaker)) {
                        possible_rm_coreference_value_pairs = (SubLObject)ConsesLow.cons(reader.bq_cons(speaker, (SubLObject)drt_drs.$list97), possible_rm_coreference_value_pairs);
                    }
                    else if (cycl_utilities.formula_arg1(rm_formula, (SubLObject)drt_drs.UNPROVIDED).eql(drt_drs.$const106$SecondPerson_NLAttr) && cycl_utilities.formula_arg2(rm_formula, (SubLObject)drt_drs.UNPROVIDED).eql(drt_drs.$const104$Singular_NLAttr) && cycl_utilities.formula_arg3(rm_formula, (SubLObject)drt_drs.UNPROVIDED).eql(drt_drs.$const105$Ungendered_NLAttr)) {
                        SubLObject cdolist_list_var = audience;
                        SubLObject audience_member = (SubLObject)drt_drs.NIL;
                        audience_member = cdolist_list_var.first();
                        while (drt_drs.NIL != cdolist_list_var) {
                            possible_rm_coreference_value_pairs = (SubLObject)ConsesLow.cons(reader.bq_cons(audience_member, (SubLObject)drt_drs.$list97), possible_rm_coreference_value_pairs);
                            cdolist_list_var = cdolist_list_var.rest();
                            audience_member = cdolist_list_var.first();
                        }
                    }
                }
                SubLObject cdolist_list_var = available_rms;
                SubLObject available_rm = (SubLObject)drt_drs.NIL;
                available_rm = cdolist_list_var.first();
                while (drt_drs.NIL != cdolist_list_var) {
                    possible_rm_coreference_value_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(available_rm, methods.funcall_instance_method_with_1_args(rm, (SubLObject)drt_drs.$sym107$COREFERENCE_PROBABILITY, available_rm)), possible_rm_coreference_value_pairs);
                    cdolist_list_var = cdolist_list_var.rest();
                    available_rm = cdolist_list_var.first();
                }
                cdolist_list_var = definite_rms;
                SubLObject definite_rm = (SubLObject)drt_drs.NIL;
                definite_rm = cdolist_list_var.first();
                while (drt_drs.NIL != cdolist_list_var) {
                    possible_rm_coreference_value_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(definite_rm, methods.funcall_instance_method_with_1_args(rm, (SubLObject)drt_drs.$sym107$COREFERENCE_PROBABILITY, definite_rm)), possible_rm_coreference_value_pairs);
                    cdolist_list_var = cdolist_list_var.rest();
                    definite_rm = cdolist_list_var.first();
                }
                SubLObject back_drs = (SubLObject)drt_drs.NIL;
                if (drt_drs.NIL != super_drs) {
                    back_drs = super_drs;
                }
                else if (drt_drs.NIL != prev_drs && depth.numG((SubLObject)drt_drs.ZERO_INTEGER)) {
                    depth = Numbers.subtract(depth, (SubLObject)drt_drs.ONE_INTEGER);
                    back_drs = prev_drs;
                }
                if (drt_drs.NIL != back_drs) {
                    SubLObject cdolist_list_var2;
                    final SubLObject more_possible_rm_coreference_value_pairs = cdolist_list_var2 = methods.funcall_instance_method_with_2_args(back_drs, (SubLObject)drt_drs.$sym95$FIND_POSSIBLE_RM_COREFERENCES, rm, depth);
                    SubLObject more_possible_rm_coreference_value_pair = (SubLObject)drt_drs.NIL;
                    more_possible_rm_coreference_value_pair = cdolist_list_var2.first();
                    while (drt_drs.NIL != cdolist_list_var2) {
                        final SubLObject possible_rm = more_possible_rm_coreference_value_pair.first();
                        final SubLObject possible_rm_value = conses_high.second(more_possible_rm_coreference_value_pair);
                        SubLObject depth_bias = ConsesLow.nth(depth, drt_drs.$drt_possible_rm_coreferences_prev_drs_biases$.getDynamicValue(thread));
                        if (drt_drs.NIL == depth_bias) {
                            depth_bias = (SubLObject)drt_drs.$float108$0_0;
                        }
                        possible_rm_coreference_value_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(possible_rm, Numbers.multiply(possible_rm_value, depth_bias)), possible_rm_coreference_value_pairs);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        more_possible_rm_coreference_value_pair = cdolist_list_var2.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)drt_drs.$sym100$OUTER_CATCH_FOR_DRS_METHOD, possible_rm_coreference_value_pairs);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)drt_drs.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_drs_super_drs(self, super_drs);
                    set_drs_prev_drs(self, prev_drs);
                    set_drs_definite_rms(self, definite_rms);
                    set_drs_available_rms(self, available_rms);
                    set_drs_audience(self, audience);
                    set_drs_speaker(self, speaker);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)drt_drs.$sym100$OUTER_CATCH_FOR_DRS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_drs_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 27726L)
    public static SubLObject drt_drs_map_add_rms_to_formula(final SubLObject drs, final SubLObject formula) {
        final SubLObject poss_rm = methods.funcall_instance_method_with_2_args(drs, (SubLObject)drt_drs.$sym44$FIND_RM_BY_TARGET, formula, (SubLObject)drt_drs.$list110).first();
        if (drt_drs.NIL != drt_rm.rm_p(poss_rm)) {
            return poss_rm;
        }
        if (formula.isCons()) {
            SubLObject new_formula = (SubLObject)drt_drs.NIL;
            SubLObject cdolist_list_var = formula;
            SubLObject formula_arg = (SubLObject)drt_drs.NIL;
            formula_arg = cdolist_list_var.first();
            while (drt_drs.NIL != cdolist_list_var) {
                new_formula = (SubLObject)ConsesLow.cons(drt_drs_map_add_rms_to_formula(drs, formula_arg), new_formula);
                cdolist_list_var = cdolist_list_var.rest();
                formula_arg = cdolist_list_var.first();
            }
            return Sequences.nreverse(new_formula);
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 28302L)
    public static SubLObject drs_rm_root_term_method(final SubLObject rm) {
        return instances.get_slot(rm, (SubLObject)drt_drs.$sym111$ROOT_TERM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 28405L)
    public static SubLObject drt_corresponding_type_subcol_fn_3(final SubLObject instance_subcol_fn) {
        if (instance_subcol_fn.eql(drt_drs.$const112$SubcollectionOfWithRelationToFn)) {
            return drt_drs.$const113$SubcollectionOfWithRelationToType;
        }
        if (instance_subcol_fn.eql(drt_drs.$const114$SubcollectionOfWithRelationFromFn)) {
            return drt_drs.$const115$SubcollectionOfWithRelationFromTy;
        }
        return (SubLObject)drt_drs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 28715L)
    public static SubLObject drs_find_rm_by_target_method(final SubLObject self, final SubLObject target, final SubLObject target_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_drs_method = (SubLObject)drt_drs.NIL;
        final SubLObject cycl_formulas = get_drs_cycl_formulas(self);
        final SubLObject super_drs = get_drs_super_drs(self);
        final SubLObject rms = get_drs_rms(self);
        try {
            thread.throwStack.push(drt_drs.$sym118$OUTER_CATCH_FOR_DRS_METHOD);
            try {
                SubLObject rm_results = (SubLObject)drt_drs.NIL;
                SubLObject cdolist_list_var = rms;
                SubLObject rm = (SubLObject)drt_drs.NIL;
                rm = cdolist_list_var.first();
                while (drt_drs.NIL != cdolist_list_var) {
                    if (drt_drs.NIL != subl_promotions.memberP((SubLObject)drt_drs.$kw119$TERM, target_type, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED) && drt_drs.NIL != czer_utilities.equals_elP(target, drt_formula_construct_cycl(instances.get_slot(rm, (SubLObject)drt_drs.$sym120$TARGET_TERM)), (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED)) {
                        rm_results = (SubLObject)ConsesLow.cons(rm, rm_results);
                    }
                    if (drt_drs.NIL != subl_promotions.memberP((SubLObject)drt_drs.$kw121$VAR, target_type, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED) && target.equal(drt_formula_construct_cycl(instances.get_slot(rm, (SubLObject)drt_drs.$sym80$TARGET_VAR)))) {
                        rm_results = (SubLObject)ConsesLow.cons(rm, rm_results);
                    }
                    if (drt_drs.NIL != subl_promotions.memberP((SubLObject)drt_drs.$kw122$FORMULA, target_type, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED) && target.equal(drt_formula_construct_cycl(instances.get_slot(rm, (SubLObject)drt_drs.$sym101$FORMULA)))) {
                        rm_results = (SubLObject)ConsesLow.cons(rm, rm_results);
                    }
                    if (drt_drs.NIL != subl_promotions.memberP((SubLObject)drt_drs.$kw123$ROOT, target_type, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED) && drt_drs.NIL != czer_utilities.equals_elP(target, drt_formula_construct_cycl(instances.get_slot(rm, (SubLObject)drt_drs.$sym111$ROOT_TERM)), (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED)) {
                        rm_results = (SubLObject)ConsesLow.cons(rm, rm_results);
                    }
                    if (drt_drs.NIL == rm_results && drt_drs.NIL != conses_high.member((SubLObject)drt_drs.$kw122$FORMULA, target_type, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED) && drt_drs.NIL != conses_high.member((SubLObject)drt_drs.$kw123$ROOT, target_type, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED)) {
                        final SubLObject rm_unmapped_formula = list_utilities.tree_gather_transformations(Symbols.symbol_function((SubLObject)drt_drs.$sym124$DRS_RM_ROOT_TERM_METHOD), conses_high.copy_tree(instances.get_slot(rm, (SubLObject)drt_drs.$sym125$MAPPED_FORMULA)), Symbols.symbol_function((SubLObject)drt_drs.$sym90$RM_P), (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED);
                        if (drt_drs.NIL != czer_utilities.equals_elP(list_utilities.tree_gather_transformations(Symbols.symbol_function((SubLObject)drt_drs.$sym126$DRT_CORRESPONDING_TYPE_SUBCOL_FN_3), target, Symbols.symbol_function((SubLObject)drt_drs.$sym126$DRT_CORRESPONDING_TYPE_SUBCOL_FN_3), (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED), list_utilities.tree_gather_transformations(Symbols.symbol_function((SubLObject)drt_drs.$sym126$DRT_CORRESPONDING_TYPE_SUBCOL_FN_3), rm_unmapped_formula, Symbols.symbol_function((SubLObject)drt_drs.$sym126$DRT_CORRESPONDING_TYPE_SUBCOL_FN_3), (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED), (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED)) {
                            rm_results = (SubLObject)ConsesLow.cons(rm, rm_results);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rm = cdolist_list_var.first();
                }
                if (drt_drs.NIL == rm_results && drt_drs.NIL != super_drs) {
                    rm_results = methods.funcall_instance_method_with_2_args(super_drs, (SubLObject)drt_drs.$sym44$FIND_RM_BY_TARGET, target, target_type);
                }
                if (Sequences.length(rm_results).numG((SubLObject)drt_drs.ONE_INTEGER)) {
                    SubLObject new_rm_results = (SubLObject)drt_drs.NIL;
                    SubLObject cdolist_list_var2 = rm_results;
                    SubLObject rm_result = (SubLObject)drt_drs.NIL;
                    rm_result = cdolist_list_var2.first();
                    while (drt_drs.NIL != cdolist_list_var2) {
                        if (drt_drs.NIL == list_utilities.tree_find(instances.get_slot(rm_result, (SubLObject)drt_drs.$sym101$FORMULA), cycl_formulas, Symbols.symbol_function((SubLObject)drt_drs.EQUAL), (SubLObject)drt_drs.UNPROVIDED)) {
                            new_rm_results = (SubLObject)ConsesLow.cons(rm_result, new_rm_results);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        rm_result = cdolist_list_var2.first();
                    }
                    if (drt_drs.NIL != new_rm_results) {
                        rm_results = new_rm_results;
                    }
                    if (Sequences.length(rm_results).numG((SubLObject)drt_drs.ONE_INTEGER) && (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.FOUR_INTEGER)) && drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.ONE_INTEGER)) {
                        Errors.warn((SubLObject)drt_drs.$str127$find_rm_by_target___A_maps_to_mul, target, rm_results);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)drt_drs.$sym118$OUTER_CATCH_FOR_DRS_METHOD, rm_results);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)drt_drs.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_drs_cycl_formulas(self, cycl_formulas);
                    set_drs_super_drs(self, super_drs);
                    set_drs_rms(self, rms);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)drt_drs.$sym118$OUTER_CATCH_FOR_DRS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_drs_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 31454L)
    public static SubLObject find_terms_for_var_in_formula(final SubLObject var, final SubLObject formula) {
        SubLObject result = (SubLObject)drt_drs.NIL;
        if (drt_drs.NIL != isa.isaP(cycl_utilities.formula_arg0(formula), drt_drs.$const52$LogicalConnective, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED)) {
            SubLObject cdolist_list_var = formula;
            SubLObject subformula = (SubLObject)drt_drs.NIL;
            subformula = cdolist_list_var.first();
            while (drt_drs.NIL != cdolist_list_var) {
                result = ConsesLow.append(result, find_terms_for_var_in_formula(var, subformula));
                cdolist_list_var = cdolist_list_var.rest();
                subformula = cdolist_list_var.first();
            }
        }
        else if (formula.isCons() && drt_drs.THREE_INTEGER.eql(Sequences.length(formula))) {
            final SubLObject formula_arg0 = cycl_utilities.formula_arg0(formula);
            final SubLObject formula_arg2 = cycl_utilities.formula_arg1(formula, (SubLObject)drt_drs.UNPROVIDED);
            final SubLObject formula_arg3 = cycl_utilities.formula_arg2(formula, (SubLObject)drt_drs.UNPROVIDED);
            if ((formula_arg0.eql(drt_drs.$const129$isa) || formula_arg0.eql(drt_drs.$const130$genls)) && formula_arg2.eql(var)) {
                result = (SubLObject)ConsesLow.cons(formula_arg3, result);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 32244L)
    public static SubLObject drs_construct_cycl_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_drs_method = (SubLObject)drt_drs.NIL;
        final SubLObject interaction_mt = get_drs_interaction_mt(self);
        final SubLObject complex_conditions = get_drs_complex_conditions(self);
        final SubLObject simple_conditions = get_drs_simple_conditions(self);
        try {
            thread.throwStack.push(drt_drs.$sym133$OUTER_CATCH_FOR_DRS_METHOD);
            try {
                SubLObject result = (SubLObject)drt_drs.NIL;
                SubLObject scopes = (SubLObject)drt_drs.NIL;
                if (drt_drs.NIL != complex_conditions) {
                    SubLObject cdolist_list_var = complex_conditions;
                    SubLObject complex_condition = (SubLObject)drt_drs.NIL;
                    complex_condition = cdolist_list_var.first();
                    while (drt_drs.NIL != cdolist_list_var) {
                        final SubLObject cf_cycl = drt_complex_condition_construct_cycl(complex_condition, interaction_mt);
                        result = (SubLObject)ConsesLow.cons(cf_cycl, result);
                        cdolist_list_var = cdolist_list_var.rest();
                        complex_condition = cdolist_list_var.first();
                    }
                }
                if (drt_drs.NIL != simple_conditions) {
                    SubLObject relevant_rms = (SubLObject)drt_drs.NIL;
                    SubLObject cdolist_list_var2 = simple_conditions;
                    SubLObject simple_condition = (SubLObject)drt_drs.NIL;
                    simple_condition = cdolist_list_var2.first();
                    while (drt_drs.NIL != cdolist_list_var2) {
                        SubLObject cdolist_list_var_$3 = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)drt_drs.$sym90$RM_P), simple_condition, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED);
                        SubLObject poss_relevant_rm = (SubLObject)drt_drs.NIL;
                        poss_relevant_rm = cdolist_list_var_$3.first();
                        while (drt_drs.NIL != cdolist_list_var_$3) {
                            final SubLObject item_var = poss_relevant_rm;
                            if (drt_drs.NIL == conses_high.member(item_var, relevant_rms, Symbols.symbol_function((SubLObject)drt_drs.EQL), Symbols.symbol_function((SubLObject)drt_drs.IDENTITY))) {
                                relevant_rms = (SubLObject)ConsesLow.cons(item_var, relevant_rms);
                            }
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            poss_relevant_rm = cdolist_list_var_$3.first();
                        }
                        result = (SubLObject)ConsesLow.cons(drt_simple_condition_construct_cycl(simple_condition), result);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        simple_condition = cdolist_list_var2.first();
                    }
                    cdolist_list_var2 = relevant_rms;
                    SubLObject relevant_rm = (SubLObject)drt_drs.NIL;
                    relevant_rm = cdolist_list_var2.first();
                    while (drt_drs.NIL != cdolist_list_var2) {
                        if (drt_drs.NIL != instances.get_slot(relevant_rm, (SubLObject)drt_drs.$sym65$SCOPE) && !drt_drs.$const83$forAll.eql(instances.get_slot(relevant_rm, (SubLObject)drt_drs.$sym65$SCOPE))) {
                            scopes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(instances.get_slot(relevant_rm, (SubLObject)drt_drs.$sym65$SCOPE), instances.get_slot(relevant_rm, (SubLObject)drt_drs.$sym80$TARGET_VAR)), scopes);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        relevant_rm = cdolist_list_var2.first();
                    }
                }
                if (drt_drs.NIL != result.rest()) {
                    result = reader.bq_cons(drt_drs.$const69$and, result);
                }
                else {
                    result = result.first();
                }
                SubLObject cdolist_list_var = scopes;
                SubLObject scope = (SubLObject)drt_drs.NIL;
                scope = cdolist_list_var.first();
                while (drt_drs.NIL != cdolist_list_var) {
                    result = ConsesLow.append(scope, (SubLObject)ConsesLow.list(result));
                    cdolist_list_var = cdolist_list_var.rest();
                    scope = cdolist_list_var.first();
                }
                if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.TWO_INTEGER)) {
                    if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.TWO_INTEGER)) {
                        drt.drt_tracer_output((SubLObject)drt_drs.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)drt_drs.$str134$_______________________FINAL_CYCL));
                    }
                    if (!drt.$drt_trace_level$.getDynamicValue(thread).isNumber() || drt.$drt_trace_level$.getDynamicValue(thread).numGE((SubLObject)drt_drs.TWO_INTEGER)) {
                        drt.drt_tracer_output((SubLObject)drt_drs.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)drt_drs.$str135$_A__, result));
                    }
                }
                Dynamic.sublisp_throw((SubLObject)drt_drs.$sym133$OUTER_CATCH_FOR_DRS_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)drt_drs.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_drs_interaction_mt(self, interaction_mt);
                    set_drs_complex_conditions(self, complex_conditions);
                    set_drs_simple_conditions(self, simple_conditions);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_drs_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)drt_drs.$sym133$OUTER_CATCH_FOR_DRS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_drs_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 33644L)
    public static SubLObject drt_complex_condition_construct_cycl(final SubLObject complex_condition, SubLObject mt) {
        if (mt == drt_drs.UNPROVIDED) {
            mt = (SubLObject)drt_drs.NIL;
        }
        SubLObject cf_cycl = (SubLObject)drt_drs.NIL;
        final SubLObject cf_arg0 = cycl_utilities.formula_arg0(complex_condition);
        final SubLObject cf_drs_args = cycl_utilities.formula_args(complex_condition, (SubLObject)drt_drs.UNPROVIDED);
        cf_cycl = (SubLObject)ConsesLow.cons(cf_arg0, cf_cycl);
        SubLObject cdolist_list_var = cf_drs_args;
        SubLObject cf_drs_arg = (SubLObject)drt_drs.NIL;
        cf_drs_arg = cdolist_list_var.first();
        while (drt_drs.NIL != cdolist_list_var) {
            if (drt_drs.NIL != drs_p(cf_drs_arg)) {
                cf_cycl = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(cf_drs_arg, (SubLObject)drt_drs.$sym131$CONSTRUCT_CYCL), cf_cycl);
            }
            else {
                cf_cycl = (SubLObject)ConsesLow.cons(cf_drs_arg, cf_cycl);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cf_drs_arg = cdolist_list_var.first();
        }
        cf_cycl = Sequences.nreverse(cf_cycl);
        if (drt_drs.$const53$NLNegFn.eql(cycl_utilities.formula_arg0(cf_cycl))) {
            cf_cycl = reformulator_utilities_nl.reformulate_cycl_negproc((SubLObject)ConsesLow.list(drt_drs.$const53$NLNegFn, cycl_utilities.formula_arg1(cf_cycl, (SubLObject)drt_drs.UNPROVIDED), reformulator_hub.reformulate_cycl(cycl_utilities.formula_arg2(cf_cycl, (SubLObject)drt_drs.UNPROVIDED), mt, (SubLObject)drt_drs.UNPROVIDED)), mt, (SubLObject)drt_drs.UNPROVIDED);
        }
        return cf_cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 34612L)
    public static SubLObject drt_simple_condition_construct_cycl(final SubLObject simple_condition) {
        SubLObject sf_cycl = (SubLObject)drt_drs.NIL;
        if (simple_condition.isCons()) {
            SubLObject cdolist_list_var = simple_condition;
            SubLObject simple_condition_arg = (SubLObject)drt_drs.NIL;
            simple_condition_arg = cdolist_list_var.first();
            while (drt_drs.NIL != cdolist_list_var) {
                if (drt_drs.NIL != drt_rm.rm_p(simple_condition_arg)) {
                    sf_cycl = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(drt_rm.real_rm(simple_condition_arg), (SubLObject)drt_drs.$sym131$CONSTRUCT_CYCL), sf_cycl);
                }
                else {
                    sf_cycl = (SubLObject)ConsesLow.cons(drt_simple_condition_construct_cycl(simple_condition_arg), sf_cycl);
                }
                cdolist_list_var = cdolist_list_var.rest();
                simple_condition_arg = cdolist_list_var.first();
            }
            return Sequences.nreverse(sf_cycl);
        }
        return simple_condition;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/drt-drs.lisp", position = 35057L)
    public static SubLObject drt_formula_construct_cycl(final SubLObject root_term) {
        if (root_term.isCons()) {
            SubLObject result = (SubLObject)drt_drs.NIL;
            SubLObject cdolist_list_var = root_term;
            SubLObject root_term_arg = (SubLObject)drt_drs.NIL;
            root_term_arg = cdolist_list_var.first();
            while (drt_drs.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons(drt_formula_construct_cycl(root_term_arg), result);
                cdolist_list_var = cdolist_list_var.rest();
                root_term_arg = cdolist_list_var.first();
            }
            return Sequences.nreverse(result);
        }
        if (drt_drs.NIL != drt_rm.rm_p(root_term)) {
            return methods.funcall_instance_method_with_0_args(drt_rm.real_rm(root_term), (SubLObject)drt_drs.$sym131$CONSTRUCT_CYCL);
        }
        return root_term;
    }
    
    public static SubLObject declare_drt_drs_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drt_drs_quant_call_type", "DRT-DRS-QUANT-CALL-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drt_drs_quant_call_test", "DRT-DRS-QUANT-CALL-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drt_drs_quant_call_fn", "DRT-DRS-QUANT-CALL-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drt_drs_quant_call_mt", "DRT-DRS-QUANT-CALL-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_parsing_mt", "GET-DRS-PARSING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_parsing_mt", "SET-DRS-PARSING-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_interaction_mt", "GET-DRS-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_interaction_mt", "SET-DRS-INTERACTION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_complex_conditions", "GET-DRS-COMPLEX-CONDITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_complex_conditions", "SET-DRS-COMPLEX-CONDITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_simple_conditions", "GET-DRS-SIMPLE-CONDITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_simple_conditions", "SET-DRS-SIMPLE-CONDITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_cycl_formulas", "GET-DRS-CYCL-FORMULAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_cycl_formulas", "SET-DRS-CYCL-FORMULAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_sub_drss", "GET-DRS-SUB-DRSS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_sub_drss", "SET-DRS-SUB-DRSS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_super_drs", "GET-DRS-SUPER-DRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_super_drs", "SET-DRS-SUPER-DRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_next_drs", "GET-DRS-NEXT-DRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_next_drs", "SET-DRS-NEXT-DRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_prev_drs", "GET-DRS-PREV-DRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_prev_drs", "SET-DRS-PREV-DRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_pronomial_rms", "GET-DRS-PRONOMIAL-RMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_pronomial_rms", "SET-DRS-PRONOMIAL-RMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_definite_rms", "GET-DRS-DEFINITE-RMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_definite_rms", "SET-DRS-DEFINITE-RMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_available_rms", "GET-DRS-AVAILABLE-RMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_available_rms", "SET-DRS-AVAILABLE-RMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_rms", "GET-DRS-RMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_rms", "SET-DRS-RMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_audience", "GET-DRS-AUDIENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_audience", "SET-DRS-AUDIENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "get_drs_speaker", "GET-DRS-SPEAKER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "set_drs_speaker", "SET-DRS-SPEAKER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "subloop_reserved_initialize_drs_class", "SUBLOOP-RESERVED-INITIALIZE-DRS-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "subloop_reserved_initialize_drs_instance", "SUBLOOP-RESERVED-INITIALIZE-DRS-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drs_p", "DRS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drs_add_rm_method", "DRS-ADD-RM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drs_add_available_rm_method", "DRS-ADD-AVAILABLE-RM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drs_add_definite_rm_method", "DRS-ADD-DEFINITE-RM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drs_add_pronomial_rm_method", "DRS-ADD-PRONOMIAL-RM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "create_drs_from_formula", "CREATE-DRS-FROM-FORMULA", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drt_quantproc_hint_fn_p", "DRT-QUANTPROC-HINT-FN-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drt_complex_formula_element", "DRT-COMPLEX-FORMULA-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drt_complex_formulaP", "DRT-COMPLEX-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drs_process_method", "DRS-PROCESS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drs_find_all_possible_rm_coreferences_method", "DRS-FIND-ALL-POSSIBLE-RM-COREFERENCES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "possible_rm_coreference_source_rm", "POSSIBLE-RM-COREFERENCE-SOURCE-RM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "possible_rm_coreference_targets", "POSSIBLE-RM-COREFERENCE-TARGETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "possible_rm_coreference_target_rm", "POSSIBLE-RM-COREFERENCE-TARGET-RM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "possible_rm_coreference_target_probability", "POSSIBLE-RM-COREFERENCE-TARGET-PROBABILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drs_find_possible_rm_coreferences_method", "DRS-FIND-POSSIBLE-RM-COREFERENCES-METHOD", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drt_drs_map_add_rms_to_formula", "DRT-DRS-MAP-ADD-RMS-TO-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drs_rm_root_term_method", "DRS-RM-ROOT-TERM-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drt_corresponding_type_subcol_fn_3", "DRT-CORRESPONDING-TYPE-SUBCOL-FN-3", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drs_find_rm_by_target_method", "DRS-FIND-RM-BY-TARGET-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "find_terms_for_var_in_formula", "FIND-TERMS-FOR-VAR-IN-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drs_construct_cycl_method", "DRS-CONSTRUCT-CYCL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drt_complex_condition_construct_cycl", "DRT-COMPLEX-CONDITION-CONSTRUCT-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drt_simple_condition_construct_cycl", "DRT-SIMPLE-CONDITION-CONSTRUCT-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.drt_drs", "drt_formula_construct_cycl", "DRT-FORMULA-CONSTRUCT-CYCL", 1, 0, false);
        return (SubLObject)drt_drs.NIL;
    }
    
    public static SubLObject init_drt_drs_file() {
        drt_drs.$drt_drs_quant_calls$ = SubLFiles.defparameter("*DRT-DRS-QUANT-CALLS*", (SubLObject)drt_drs.$list0);
        drt_drs.$drt_put_available_rms_to_top_level_drs$ = SubLFiles.defparameter("*DRT-PUT-AVAILABLE-RMS-TO-TOP-LEVEL-DRS*", (SubLObject)drt_drs.NIL);
        drt_drs.$drt_quantproc_hint_fns$ = SubLFiles.defparameter("*DRT-QUANTPROC-HINT-FNS*", (SubLObject)drt_drs.$list49);
        drt_drs.$drt_introduced_var_num_isg$ = SubLFiles.deflexical("*DRT-INTRODUCED-VAR-NUM-ISG*", integer_sequence_generator.new_integer_sequence_generator((SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED, (SubLObject)drt_drs.UNPROVIDED));
        drt_drs.$drt_possible_rm_coreferences_prev_drs_biases$ = SubLFiles.defparameter("*DRT-POSSIBLE-RM-COREFERENCES-PREV-DRS-BIASES*", Sequences.nreverse((SubLObject)drt_drs.$list97));
        drt_drs.$drt_possible_rm_coreferences_max_depth$ = SubLFiles.defparameter("*DRT-POSSIBLE-RM-COREFERENCES-MAX-DEPTH*", Numbers.subtract(Sequences.length(drt_drs.$drt_possible_rm_coreferences_prev_drs_biases$.getDynamicValue()), (SubLObject)drt_drs.ONE_INTEGER));
        return (SubLObject)drt_drs.NIL;
    }
    
    public static SubLObject setup_drt_drs_file() {
        classes.subloop_new_class((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym2$OBJECT, (SubLObject)drt_drs.NIL, (SubLObject)drt_drs.NIL, (SubLObject)drt_drs.$list3);
        classes.class_set_implements_slot_listeners((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym20$SUBLOOP_RESERVED_INITIALIZE_DRS_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym23$SUBLOOP_RESERVED_INITIALIZE_DRS_INSTANCE);
        subloop_reserved_initialize_drs_class((SubLObject)drt_drs.$sym1$DRS);
        methods.methods_incorporate_instance_method((SubLObject)drt_drs.$sym24$ADD_RM, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.NIL, (SubLObject)drt_drs.$list25, (SubLObject)drt_drs.$list26);
        methods.subloop_register_instance_method((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym24$ADD_RM, (SubLObject)drt_drs.$sym28$DRS_ADD_RM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)drt_drs.$sym29$ADD_AVAILABLE_RM, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.NIL, (SubLObject)drt_drs.$list25, (SubLObject)drt_drs.$list30);
        methods.subloop_register_instance_method((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym29$ADD_AVAILABLE_RM, (SubLObject)drt_drs.$sym32$DRS_ADD_AVAILABLE_RM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)drt_drs.$sym33$ADD_DEFINITE_RM, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.NIL, (SubLObject)drt_drs.$list25, (SubLObject)drt_drs.$list34);
        methods.subloop_register_instance_method((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym33$ADD_DEFINITE_RM, (SubLObject)drt_drs.$sym36$DRS_ADD_DEFINITE_RM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)drt_drs.$sym37$ADD_PRONOMIAL_RM, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.NIL, (SubLObject)drt_drs.$list25, (SubLObject)drt_drs.$list38);
        methods.subloop_register_instance_method((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym37$ADD_PRONOMIAL_RM, (SubLObject)drt_drs.$sym40$DRS_ADD_PRONOMIAL_RM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)drt_drs.$sym56$PROCESS, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$list57, (SubLObject)drt_drs.$list58, drt_drs.$list59);
        methods.subloop_register_instance_method((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym56$PROCESS, (SubLObject)drt_drs.$sym93$DRS_PROCESS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)drt_drs.$sym92$FIND_ALL_POSSIBLE_RM_COREFERENCES, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$list57, (SubLObject)drt_drs.NIL, (SubLObject)drt_drs.$list94);
        methods.subloop_register_instance_method((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym92$FIND_ALL_POSSIBLE_RM_COREFERENCES, (SubLObject)drt_drs.$sym96$DRS_FIND_ALL_POSSIBLE_RM_COREFERENCES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)drt_drs.$sym95$FIND_POSSIBLE_RM_COREFERENCES, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.NIL, (SubLObject)drt_drs.$list98, (SubLObject)drt_drs.$list99);
        methods.subloop_register_instance_method((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym95$FIND_POSSIBLE_RM_COREFERENCES, (SubLObject)drt_drs.$sym109$DRS_FIND_POSSIBLE_RM_COREFERENCES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)drt_drs.$sym44$FIND_RM_BY_TARGET, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.NIL, (SubLObject)drt_drs.$list116, (SubLObject)drt_drs.$list117);
        methods.subloop_register_instance_method((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym44$FIND_RM_BY_TARGET, (SubLObject)drt_drs.$sym128$DRS_FIND_RM_BY_TARGET_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)drt_drs.$sym131$CONSTRUCT_CYCL, (SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.NIL, (SubLObject)drt_drs.NIL, (SubLObject)drt_drs.$list132);
        methods.subloop_register_instance_method((SubLObject)drt_drs.$sym1$DRS, (SubLObject)drt_drs.$sym131$CONSTRUCT_CYCL, (SubLObject)drt_drs.$sym136$DRS_CONSTRUCT_CYCL_METHOD);
        return (SubLObject)drt_drs.NIL;
    }
    
    private static SubLObject _constant_59_initializer() {
        return (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Processes a DRS until the cycl-formulas slot is empty and all the contents have been moved into the relevant RMs, the simple and complex conditions lists, or the this DRS itself."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER-DRS"), (SubLObject)SubLObjectFactory.makeSymbol("AVAILABLE-RMS"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-RMS"), (SubLObject)SubLObjectFactory.makeSymbol("PRONOMIAL-RMS"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-DRSS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-PROGN"), (SubLObject)drt_drs.FOUR_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)drt_drs.T, (SubLObject)SubLObjectFactory.makeString("~%(drs-process-method ~A)"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESCRIBE-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)drt_drs.T, (SubLObject)SubLObjectFactory.makeString("~%"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS"), (SubLObject)drt_drs.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"), (SubLObject)drt_drs.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-COMPLEX-FORMULA?"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS")), (SubLObject)drt_drs.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-WARN"), (SubLObject)SubLObjectFactory.makeString("drt-process-drs: more than one complex formula in drs ~A ~A~%"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA-ARG0"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG0"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA-ARG0"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quantifier"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-PROGN"), (SubLObject)drt_drs.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-WARN"), (SubLObject)SubLObjectFactory.makeString("1.a. quantifiers.~%"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-RM-BY-TARGET")), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VAR"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-WARN"), (SubLObject)SubLObjectFactory.makeString("drt-process-drs ~A: no RM found for var ~A in complex-formula ~A~%"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SCOPE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SCOPE")), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA-ARG0"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-PROGN"), (SubLObject)drt_drs.FOUR_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)drt_drs.T, (SubLObject)SubLObjectFactory.makeString("-1--------------- modified RM:")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESCRIBE-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("RM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)drt_drs.T, (SubLObject)SubLObjectFactory.makeString("-1-----------~%")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA")), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS"))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA-ARG0"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalConnective"))), (SubLObject)ConsesLow.list((SubLObject)drt_drs.EQ, (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA-ARG0"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNegFn"))), (SubLObject)ConsesLow.list((SubLObject)drt_drs.EQ, (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA-ARG0"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("explains-PropProp")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-PROGN"), (SubLObject)drt_drs.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-WARN"), (SubLObject)SubLObjectFactory.makeString("1.b. logical connectives.~%"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-CONDITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA-ARG0"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBDRS-LIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA-ARG0"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA")), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-NEW-DRS"), (SubLObject)drt_drs.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSP"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBDRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DRS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBDRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION-MT")), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION-MT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBDRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSING-MT")), (SubLObject)SubLObjectFactory.makeSymbol("PARSING-MT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBDRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-NEW-DRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBDRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER-DRS")), (SubLObject)SubLObjectFactory.makeSymbol("LAST-NEW-DRS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-NEW-DRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-DRSS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBDRS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBDRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER-DRS")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-DRSS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBDRS"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-NEW-DRS"), (SubLObject)SubLObjectFactory.makeSymbol("SUBDRS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("SUBDRS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-CONDITION")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("SUBDRS"), (SubLObject)SubLObjectFactory.makeSymbol("SUBDRS-LIST")) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-CONDITION"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-CONDITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-CONDITION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-CONDITIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-CONDITIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-CONDITIONS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-COREFERENCES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBDRS"), (SubLObject)SubLObjectFactory.makeSymbol("SUBDRS-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-POSSIBLE-RM-COREFERENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SUBDRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)drt_drs.EQ, (SubLObject)SubLObjectFactory.makeSymbol("SUB-POSSIBLE-RM-COREFERENCES"), (SubLObject)drt_drs.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)drt_drs.T)), (SubLObject)ConsesLow.list((SubLObject)drt_drs.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-COREFERENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-POSSIBLE-RM-COREFERENCES"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-COREFERENCES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-COREFERENCES")))))))), (SubLObject)ConsesLow.list((SubLObject)drt_drs.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-PROGN"), (SubLObject)drt_drs.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-WARN"), (SubLObject)SubLObjectFactory.makeString("1.c. quantproc~%")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)drt_drs.T, (SubLObject)SubLObjectFactory.makeString("Attempting reformulation on: ~%~A~%"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"), (SubLObject)drt_drs.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL"), (SubLObject)SubLObjectFactory.makeSymbol("*DRT-DRS-QUANT-CALLS*"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-DRS-QUANT-CALL-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-DRS-QUANT-CALL-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-FN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-DRS-QUANT-CALL-FN"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-DRS-QUANT-CALL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARSING-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("PARSING-MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERACTION-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION-MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION-MT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-PROGN"), (SubLObject)drt_drs.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)drt_drs.T, (SubLObject)SubLObjectFactory.makeString("Attempting reformulation type ~A, mt=~A~%"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-TEST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-FN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-FN"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-MT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)drt_drs.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-PROGN"), (SubLObject)drt_drs.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)drt_drs.T, (SubLObject)SubLObjectFactory.makeString("Using reformulator result from ~A: ~A~%"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT-CALL-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?"), (SubLObject)drt_drs.T))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-WARN"), (SubLObject)SubLObjectFactory.makeString("failed reformulation on ~A: new-complex-formula is NULL."), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)drt_drs.T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)drt_drs.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-WARN"), (SubLObject)SubLObjectFactory.makeString("failed reformulation on ~A: new-complex-formula is IDENTICAL."), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)drt_drs.T)), (SubLObject)ConsesLow.list((SubLObject)drt_drs.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA-ARG0"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG0"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA-ARG0"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quantifier"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTRODUCED-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIQUE-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-EL-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)drt_drs.NIL, (SubLObject)SubLObjectFactory.makeString("DRT-~A"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("*DRT-INTRODUCED-VAR-NUM-ISG*")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?"), (SubLObject)SubLObjectFactory.makeSymbol("INTRODUCED-VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-SUBSTITUTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("INTRODUCED-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("UNIQUE-VAR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTRODUCED-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBFORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-TERMS-FOR-VAR-IN-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("INTRODUCED-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SUBFORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)drt_drs.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE?"), (SubLObject)SubLObjectFactory.makeSymbol("DONE2?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSS-RMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-RM-BY-TARGET")), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSS-RM"), (SubLObject)SubLObjectFactory.makeSymbol("POSS-RMS"), (SubLObject)SubLObjectFactory.makeSymbol("DONE2?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RM-P"), (SubLObject)SubLObjectFactory.makeSymbol("POSS-RM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("POSS-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)SubLObjectFactory.makeSymbol("POSS-RM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?"), (SubLObject)drt_drs.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DONE2?"), (SubLObject)drt_drs.T)))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RM-P"), (SubLObject)SubLObjectFactory.makeSymbol("RM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("INTRODUCED-VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SCOPE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA-ARG0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-PROGN"), (SubLObject)drt_drs.FOUR_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)drt_drs.T, (SubLObject)SubLObjectFactory.makeString("~%-2--------------- modified RM:")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESCRIBE-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("RM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)drt_drs.T, (SubLObject)SubLObjectFactory.makeString("-2-----------~%")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA-ARG0"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalConnective"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTRODUCED-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIQUE-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-EL-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)drt_drs.NIL, (SubLObject)SubLObjectFactory.makeString("DRT-~A"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("*DRT-INTRODUCED-VAR-NUM-ISG*")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?"), (SubLObject)SubLObjectFactory.makeSymbol("INTRODUCED-VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-SUBSTITUTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("INTRODUCED-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("UNIQUE-VAR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTRODUCED-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET-TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIRD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSS-RMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-RM-BY-TARGET")), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOT"))))), (SubLObject)SubLObjectFactory.makeSymbol("RM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSS-RM"), (SubLObject)SubLObjectFactory.makeSymbol("POSS-RMS"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RM-P"), (SubLObject)SubLObjectFactory.makeSymbol("POSS-RM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("POSS-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)SubLObjectFactory.makeSymbol("POSS-RM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?"), (SubLObject)drt_drs.T)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("INTRODUCED-VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SCOPE")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-PROGN"), (SubLObject)drt_drs.FOUR_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)drt_drs.T, (SubLObject)SubLObjectFactory.makeString("~%-3--------------- modified RM:")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESCRIBE-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("RM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)drt_drs.T, (SubLObject)SubLObjectFactory.makeString("-3-----------~%"))))), (SubLObject)ConsesLow.list((SubLObject)drt_drs.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS"))))))))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-PROGN"), (SubLObject)drt_drs.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-WARN"), (SubLObject)SubLObjectFactory.makeString("1.d. subcollection processing~%"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SIMPLE-FORMULAS"), (SubLObject)drt_drs.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULAS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSS-NEW-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REFORMULATE-CYCL-SUBCOLLPROC"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION-MT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("POSS-NEW-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)drt_drs.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("POSS-NEW-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SIMPLE-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("POSS-NEW-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULAS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SIMPLE-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COMPLEX-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-PROGN"), (SubLObject)drt_drs.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-WARN"), (SubLObject)SubLObjectFactory.makeString("1.e. simple formulas~%"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-CONDITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-DRS-MAP-ADD-RMS-TO-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-FIND-ALL-IF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("RM-P")), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-CONDITION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFINITE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-RMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-DEFINITE-RM")), (SubLObject)SubLObjectFactory.makeSymbol("RM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRONOMIAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRONOMIAL-RMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-PRONOMIAL-RM")), (SubLObject)SubLObjectFactory.makeSymbol("RM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("AVAILABLE-RMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-AVAILABLE-RM")), (SubLObject)SubLObjectFactory.makeSymbol("RM")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-CONDITIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-CONDITIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-CONDITIONS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-FORMULAS"), (SubLObject)drt_drs.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS")), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-FORMULAS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-PROGN"), (SubLObject)drt_drs.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)drt_drs.T, (SubLObject)SubLObjectFactory.makeString("~%******************** FINAL DRS ********************~%")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESCRIBE-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS")), (SubLObject)SubLObjectFactory.makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-ALL-POSSIBLE-RM-COREFERENCES")))))));
    }
    
    public void declareFunctions() {
        declare_drt_drs_file();
    }
    
    public void initializeVariables() {
        init_drt_drs_file();
    }
    
    public void runTopLevelForms() {
        setup_drt_drs_file();
    }
    
    static {
        me = (SubLFile)new drt_drs();
        drt_drs.$drt_drs_quant_calls$ = null;
        drt_drs.$drt_put_available_rms_to_top_level_drs$ = null;
        drt_drs.$drt_quantproc_hint_fns$ = null;
        drt_drs.$drt_introduced_var_num_isg$ = null;
        drt_drs.$drt_possible_rm_coreferences_prev_drs_biases$ = null;
        drt_drs.$drt_possible_rm_coreferences_max_depth$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUANTPROC-3"), (SubLObject)SubLObjectFactory.makeSymbol("TRY-PROCESS-REFORMULATOR-FOR-QUANTPROC-3?"), (SubLObject)SubLObjectFactory.makeSymbol("REFORMULATE-CYCL-QUANTPROC-3"), (SubLObject)SubLObjectFactory.makeKeyword("PARSING-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VPPPROC-NONSTATE"), (SubLObject)SubLObjectFactory.makeSymbol("TRY-PROCESS-REFORMULATOR-FOR-VPPPROC-NONSTATE?"), (SubLObject)SubLObjectFactory.makeSymbol("REFORMULATE-CYCL-VPPPROC-NONSTATE"), (SubLObject)SubLObjectFactory.makeKeyword("PARSING-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VPPPROC-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("TRY-PROCESS-REFORMULATOR-FOR-VPPPROC-STATE?"), (SubLObject)SubLObjectFactory.makeSymbol("REFORMULATE-CYCL-VPPPROC-STATE"), (SubLObject)SubLObjectFactory.makeKeyword("PARSING-MT")));
        $sym1$DRS = SubLObjectFactory.makeSymbol("DRS");
        $sym2$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list3 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEAKER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUDIENCE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RMS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AVAILABLE-RMS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-RMS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRONOMIAL-RMS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREV-DRS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-DRS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPER-DRS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-DRSS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-CONDITIONS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-CONDITIONS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERACTION-MT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSING-MT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-RM"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-AVAILABLE-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-RM"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-DEFINITE-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-RM"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-PRONOMIAL-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-RM"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-RM-BY-TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TYPE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-ALL-POSSIBLE-RM-COREFERENCES"), (SubLObject)drt_drs.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-POSSIBLE-RM-COREFERENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)drt_drs.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUTOFF"), (SubLObject)drt_drs.NIL))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRUCT-CYCL"), (SubLObject)drt_drs.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym4$PARSING_MT = SubLObjectFactory.makeSymbol("PARSING-MT");
        $sym5$INTERACTION_MT = SubLObjectFactory.makeSymbol("INTERACTION-MT");
        $sym6$COMPLEX_CONDITIONS = SubLObjectFactory.makeSymbol("COMPLEX-CONDITIONS");
        $sym7$SIMPLE_CONDITIONS = SubLObjectFactory.makeSymbol("SIMPLE-CONDITIONS");
        $sym8$CYCL_FORMULAS = SubLObjectFactory.makeSymbol("CYCL-FORMULAS");
        $sym9$SUB_DRSS = SubLObjectFactory.makeSymbol("SUB-DRSS");
        $sym10$SUPER_DRS = SubLObjectFactory.makeSymbol("SUPER-DRS");
        $sym11$NEXT_DRS = SubLObjectFactory.makeSymbol("NEXT-DRS");
        $sym12$PREV_DRS = SubLObjectFactory.makeSymbol("PREV-DRS");
        $sym13$PRONOMIAL_RMS = SubLObjectFactory.makeSymbol("PRONOMIAL-RMS");
        $sym14$DEFINITE_RMS = SubLObjectFactory.makeSymbol("DEFINITE-RMS");
        $sym15$AVAILABLE_RMS = SubLObjectFactory.makeSymbol("AVAILABLE-RMS");
        $sym16$RMS = SubLObjectFactory.makeSymbol("RMS");
        $sym17$AUDIENCE = SubLObjectFactory.makeSymbol("AUDIENCE");
        $sym18$SPEAKER = SubLObjectFactory.makeSymbol("SPEAKER");
        $sym19$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym20$SUBLOOP_RESERVED_INITIALIZE_DRS_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DRS-CLASS");
        $sym21$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym22$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym23$SUBLOOP_RESERVED_INITIALIZE_DRS_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DRS-INSTANCE");
        $sym24$ADD_RM = SubLObjectFactory.makeSymbol("ADD-RM");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-RM"));
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RM"), (SubLObject)SubLObjectFactory.makeSymbol("RMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RM"), (SubLObject)SubLObjectFactory.makeSymbol("RMS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RMS")));
        $sym27$OUTER_CATCH_FOR_DRS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DRS-METHOD");
        $sym28$DRS_ADD_RM_METHOD = SubLObjectFactory.makeSymbol("DRS-ADD-RM-METHOD");
        $sym29$ADD_AVAILABLE_RM = SubLObjectFactory.makeSymbol("ADD-AVAILABLE-RM");
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RM"), (SubLObject)SubLObjectFactory.makeSymbol("AVAILABLE-RMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("AVAILABLE-RMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RM"), (SubLObject)SubLObjectFactory.makeSymbol("AVAILABLE-RMS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("AVAILABLE-RMS")));
        $sym31$OUTER_CATCH_FOR_DRS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DRS-METHOD");
        $sym32$DRS_ADD_AVAILABLE_RM_METHOD = SubLObjectFactory.makeSymbol("DRS-ADD-AVAILABLE-RM-METHOD");
        $sym33$ADD_DEFINITE_RM = SubLObjectFactory.makeSymbol("ADD-DEFINITE-RM");
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RM"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-RMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-RMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RM"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-RMS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-RMS")));
        $sym35$OUTER_CATCH_FOR_DRS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DRS-METHOD");
        $sym36$DRS_ADD_DEFINITE_RM_METHOD = SubLObjectFactory.makeSymbol("DRS-ADD-DEFINITE-RM-METHOD");
        $sym37$ADD_PRONOMIAL_RM = SubLObjectFactory.makeSymbol("ADD-PRONOMIAL-RM");
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RM"), (SubLObject)SubLObjectFactory.makeSymbol("PRONOMIAL-RMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRONOMIAL-RMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RM"), (SubLObject)SubLObjectFactory.makeSymbol("PRONOMIAL-RMS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PRONOMIAL-RMS")));
        $sym39$OUTER_CATCH_FOR_DRS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DRS-METHOD");
        $sym40$DRS_ADD_PRONOMIAL_RM_METHOD = SubLObjectFactory.makeSymbol("DRS-ADD-PRONOMIAL-RM-METHOD");
        $sym41$NEW = SubLObjectFactory.makeSymbol("NEW");
        $str42$_______________________INITIAL_RM = SubLObjectFactory.makeString("~%******************** INITIAL RMS ********************~%");
        $str43$__ = SubLObjectFactory.makeString("~%");
        $sym44$FIND_RM_BY_TARGET = SubLObjectFactory.makeSymbol("FIND-RM-BY-TARGET");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOT"));
        $sym46$TYPE = SubLObjectFactory.makeSymbol("TYPE");
        $kw47$AVAILABLE = SubLObjectFactory.makeKeyword("AVAILABLE");
        $str48$_______________________INITIAL_DR = SubLObjectFactory.makeString("~%******************** INITIAL DRS ********************~%");
        $list49 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSemFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLTagFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLDefinitenessFn-3")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn-3")));
        $const50$EnglishLexiconMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishLexiconMt"));
        $const51$Quantifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quantifier"));
        $const52$LogicalConnective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalConnective"));
        $const53$NLNegFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNegFn"));
        $const54$explains_PropProp = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("explains-PropProp"));
        $sym55$DRT_COMPLEX_FORMULA_ELEMENT = SubLObjectFactory.makeSymbol("DRT-COMPLEX-FORMULA-ELEMENT");
        $sym56$PROCESS = SubLObjectFactory.makeSymbol("PROCESS");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("READ-ONLY"));
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CARRY-POSSIBLE-RM-COREFERENCES"));
        $list59 = _constant_59_initializer();
        $str60$___drs_process_method__A_ = SubLObjectFactory.makeString("~%(drs-process-method ~A)");
        $str61$drt_process_drs__more_than_one_co = SubLObjectFactory.makeString("drt-process-drs: more than one complex formula in drs ~A ~A~%");
        $str62$1_a__quantifiers___ = SubLObjectFactory.makeString("1.a. quantifiers.~%");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VAR"));
        $str64$drt_process_drs__A__no_RM_found_f = SubLObjectFactory.makeString("drt-process-drs ~A: no RM found for var ~A in complex-formula ~A~%");
        $sym65$SCOPE = SubLObjectFactory.makeSymbol("SCOPE");
        $str66$_1________________modified_RM_ = SubLObjectFactory.makeString("-1--------------- modified RM:");
        $str67$_1_____________ = SubLObjectFactory.makeString("-1-----------~%");
        $str68$1_b__logical_connectives___ = SubLObjectFactory.makeString("1.b. logical connectives.~%");
        $const69$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $str70$1_c__quantproc__ = SubLObjectFactory.makeString("1.c. quantproc~%");
        $str71$Attempting_reformulation_on_____A = SubLObjectFactory.makeString("Attempting reformulation on: ~%~A~%");
        $kw72$PARSING_MT = SubLObjectFactory.makeKeyword("PARSING-MT");
        $kw73$INTERACTION_MT = SubLObjectFactory.makeKeyword("INTERACTION-MT");
        $str74$Attempting_reformulation_type__A_ = SubLObjectFactory.makeString("Attempting reformulation type ~A, mt=~A~%");
        $str75$Using_reformulator_result_from__A = SubLObjectFactory.makeString("Using reformulator result from ~A: ~A~%");
        $str76$failed_reformulation_on__A__new_c = SubLObjectFactory.makeString("failed reformulation on ~A: new-complex-formula is NULL.");
        $str77$failed_reformulation_on__A__new_c = SubLObjectFactory.makeString("failed reformulation on ~A: new-complex-formula is IDENTICAL.");
        $str78$DRT__A = SubLObjectFactory.makeString("DRT-~A");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA"));
        $sym80$TARGET_VAR = SubLObjectFactory.makeSymbol("TARGET-VAR");
        $str81$___2________________modified_RM_ = SubLObjectFactory.makeString("~%-2--------------- modified RM:");
        $str82$_2_____________ = SubLObjectFactory.makeString("-2-----------~%");
        $const83$forAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll"));
        $str84$___3________________modified_RM_ = SubLObjectFactory.makeString("~%-3--------------- modified RM:");
        $str85$_3_____________ = SubLObjectFactory.makeString("-3-----------~%");
        $str86$1_d__subcollection_processing__ = SubLObjectFactory.makeString("1.d. subcollection processing~%");
        $str87$1_e__simple_formulas__ = SubLObjectFactory.makeString("1.e. simple formulas~%");
        $kw88$DEFINITE = SubLObjectFactory.makeKeyword("DEFINITE");
        $kw89$PRONOMIAL = SubLObjectFactory.makeKeyword("PRONOMIAL");
        $sym90$RM_P = SubLObjectFactory.makeSymbol("RM-P");
        $str91$_______________________FINAL_DRS_ = SubLObjectFactory.makeString("~%******************** FINAL DRS ********************~%");
        $sym92$FIND_ALL_POSSIBLE_RM_COREFERENCES = SubLObjectFactory.makeSymbol("FIND-ALL-POSSIBLE-RM-COREFERENCES");
        $sym93$DRS_PROCESS_METHOD = SubLObjectFactory.makeSymbol("DRS-PROCESS-METHOD");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Returns a list of lists of the form (RM ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...)) indicating the probabiltiy of each possible RM coreference in this DRS."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-DRSS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-DRS"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-DRSS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-DRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-ALL-POSSIBLE-RM-COREFERENCES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PRONOMIAL-RMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRONOMIAL-RM"), (SubLObject)SubLObjectFactory.makeSymbol("PRONOMIAL-RMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-COREFERENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-POSSIBLE-RM-COREFERENCES")), (SubLObject)SubLObjectFactory.makeSymbol("PRONOMIAL-RM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-COREFERENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PRONOMIAL-RM"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-COREFERENCES")), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym95$FIND_POSSIBLE_RM_COREFERENCES = SubLObjectFactory.makeSymbol("FIND-POSSIBLE-RM-COREFERENCES");
        $sym96$DRS_FIND_ALL_POSSIBLE_RM_COREFERENCES_METHOD = SubLObjectFactory.makeSymbol("DRS-FIND-ALL-POSSIBLE-RM-COREFERENCES-METHOD");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(1.0));
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("*DRT-POSSIBLE-RM-COREFERENCES-MAX-DEPTH*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUTOFF"), (SubLObject)drt_drs.NIL));
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Returns a list of the form ((POSS-RM-1 PROB-1) (POSS-RM-2 PROB-2) ...) indicating the possible coreferences of the specified RM in this DRS.  If DEPTH is specified, we look to DEPTH-1 previous DRSs for possible intersentential coreferences."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("CUTOFF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"), (SubLObject)drt_drs.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RM-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)drt_drs.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG0"), (SubLObject)SubLObjectFactory.makeSymbol("RM-FORMULA")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PronounFn"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)drt_drs.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("RM-FORMULA")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstPerson-NLAttr"))), (SubLObject)ConsesLow.list((SubLObject)drt_drs.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("RM-FORMULA")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr"))), (SubLObject)ConsesLow.list((SubLObject)drt_drs.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG3"), (SubLObject)SubLObjectFactory.makeSymbol("RM-FORMULA")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ungendered-NLAttr"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-P"), (SubLObject)SubLObjectFactory.makeSymbol("SPEAKER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SPEAKER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(1.0)))), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)drt_drs.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("RM-FORMULA")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondPerson-NLAttr"))), (SubLObject)ConsesLow.list((SubLObject)drt_drs.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("RM-FORMULA")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr"))), (SubLObject)ConsesLow.list((SubLObject)drt_drs.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG3"), (SubLObject)SubLObjectFactory.makeSymbol("RM-FORMULA")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ungendered-NLAttr")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUDIENCE-MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("AUDIENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("AUDIENCE-MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeDouble(1.0)))), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AVAILABLE-RM"), (SubLObject)SubLObjectFactory.makeSymbol("AVAILABLE-RMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("AVAILABLE-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COREFERENCE-PROBABILITY")), (SubLObject)SubLObjectFactory.makeSymbol("AVAILABLE-RM"))), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-RM"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-RMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COREFERENCE-PROBABILITY")), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITE-RM"))), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BACK-DRS"), (SubLObject)drt_drs.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPER-DRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BACK-DRS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER-DRS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREV-DRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)drt_drs.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)drt_drs.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BACK-DRS"), (SubLObject)SubLObjectFactory.makeSymbol("PREV-DRS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("BACK-DRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("BACK-DRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-POSSIBLE-RM-COREFERENCES")), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIR"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIRS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-POSSIBLE-RM-COREFERENCE-VALUE-PAIR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH-BIAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("*DRT-POSSIBLE-RM-COREFERENCES-PREV-DRS-BIASES*")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH-BIAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH-BIAS"), (SubLObject)SubLObjectFactory.makeDouble(0.0))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH-BIAS"))), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-RM-COREFERENCE-VALUE-PAIRS"))));
        $sym100$OUTER_CATCH_FOR_DRS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DRS-METHOD");
        $sym101$FORMULA = SubLObjectFactory.makeSymbol("FORMULA");
        $const102$PronounFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PronounFn"));
        $const103$FirstPerson_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstPerson-NLAttr"));
        $const104$Singular_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr"));
        $const105$Ungendered_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ungendered-NLAttr"));
        $const106$SecondPerson_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondPerson-NLAttr"));
        $sym107$COREFERENCE_PROBABILITY = SubLObjectFactory.makeSymbol("COREFERENCE-PROBABILITY");
        $float108$0_0 = (SubLFloat)SubLObjectFactory.makeDouble(0.0);
        $sym109$DRS_FIND_POSSIBLE_RM_COREFERENCES_METHOD = SubLObjectFactory.makeSymbol("DRS-FIND-POSSIBLE-RM-COREFERENCES-METHOD");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("VAR"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA"));
        $sym111$ROOT_TERM = SubLObjectFactory.makeSymbol("ROOT-TERM");
        $const112$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn"));
        $const113$SubcollectionOfWithRelationToType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn"));
        $const114$SubcollectionOfWithRelationFromFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn"));
        $const115$SubcollectionOfWithRelationFromTy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromTypeFn"));
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TYPE"));
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Finds an RM by looking at the slots of the RMs in DRS.  There are 4 methods to look for RMs: by the :term or :var assigned to the RM after processing, by the initial formula the RM was created from, and the :root ('root-term') of the formula the RM was created from.  Any combination of these may be specified.  If both :formula and :root are specified, we allow matching to the RMs :mapped-formula such that contained RMs of which are replaced by those RMs :root's.  Also, there is a hack in here to ignore differences in subcollection functions (see drt-corresponding-type-subcol-fn-3 above)."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS"), (SubLObject)drt_drs.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)SubLObjectFactory.makeSymbol("RMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EQUALS-EL?"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-FORMULA-CONSTRUCT-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TERM"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)drt_drs.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-FORMULA-CONSTRUCT-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)drt_drs.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-FORMULA-CONSTRUCT-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("ROOT"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EQUALS-EL?"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-FORMULA-CONSTRUCT-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-TERM"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("ROOT"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TYPE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RM-UNMAPPED-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-GATHER-TRANSFORMATIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DRS-RM-ROOT-TERM-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MAPPED-FORMULA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("RM-P"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EQUALS-EL?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-GATHER-TRANSFORMATIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DRT-CORRESPONDING-TYPE-SUBCOL-FN-3")), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DRT-CORRESPONDING-TYPE-SUBCOL-FN-3"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-GATHER-TRANSFORMATIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DRT-CORRESPONDING-TYPE-SUBCOL-FN-3")), (SubLObject)SubLObjectFactory.makeSymbol("RM-UNMAPPED-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DRT-CORRESPONDING-TYPE-SUBCOL-FN-3")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RM"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER-DRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER-DRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-RM-BY-TARGET")), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-TYPE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS")), (SubLObject)drt_drs.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-RM-RESULTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RM-RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE-FIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-FORMULAS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)drt_drs.EQUAL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RM-RESULTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RM-RESULTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RM-RESULTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS")), (SubLObject)drt_drs.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-PROGN"), (SubLObject)drt_drs.FOUR_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-WARN"), (SubLObject)SubLObjectFactory.makeString("find-rm-by-target: ~A maps to multiple rms ~A~%"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RM-RESULTS"))));
        $sym118$OUTER_CATCH_FOR_DRS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DRS-METHOD");
        $kw119$TERM = SubLObjectFactory.makeKeyword("TERM");
        $sym120$TARGET_TERM = SubLObjectFactory.makeSymbol("TARGET-TERM");
        $kw121$VAR = SubLObjectFactory.makeKeyword("VAR");
        $kw122$FORMULA = SubLObjectFactory.makeKeyword("FORMULA");
        $kw123$ROOT = SubLObjectFactory.makeKeyword("ROOT");
        $sym124$DRS_RM_ROOT_TERM_METHOD = SubLObjectFactory.makeSymbol("DRS-RM-ROOT-TERM-METHOD");
        $sym125$MAPPED_FORMULA = SubLObjectFactory.makeSymbol("MAPPED-FORMULA");
        $sym126$DRT_CORRESPONDING_TYPE_SUBCOL_FN_3 = SubLObjectFactory.makeSymbol("DRT-CORRESPONDING-TYPE-SUBCOL-FN-3");
        $str127$find_rm_by_target___A_maps_to_mul = SubLObjectFactory.makeString("find-rm-by-target: ~A maps to multiple rms ~A~%");
        $sym128$DRS_FIND_RM_BY_TARGET_METHOD = SubLObjectFactory.makeSymbol("DRS-FIND-RM-BY-TARGET-METHOD");
        $const129$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const130$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym131$CONSTRUCT_CYCL = SubLObjectFactory.makeSymbol("CONSTRUCT-CYCL");
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Constructs the CycL output that is ready to be predicate/term strengthened, etc. (i.e. it may still contain underpecified vocab)."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)drt_drs.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCOPES"), (SubLObject)drt_drs.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-CONDITIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-CONDITIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CF-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-COMPLEX-CONDITION-CONSTRUCT-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLEX-CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("INTERACTION-MT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CF-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-CONDITIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-RMS"), (SubLObject)drt_drs.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-CONDITIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSS-RELEVANT-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-IF-NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("RM-P")), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-CONDITION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("POSS-RELEVANT-RM"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-RMS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-SIMPLE-CONDITION-CONSTRUCT-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-CONDITION")), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-RM"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-RMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SCOPE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)drt_drs.EQ, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SCOPE")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SCOPE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-RM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-VAR")))), (SubLObject)SubLObjectFactory.makeSymbol("SCOPES")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-CONS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCOPE"), (SubLObject)SubLObjectFactory.makeSymbol("SCOPES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("SCOPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-PROGN"), (SubLObject)drt_drs.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-OUT"), (SubLObject)drt_drs.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("~%******************** FINAL CYCL FORMULA ********************~%")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DRT-TRACE-OUT"), (SubLObject)drt_drs.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("~A~%"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym133$OUTER_CATCH_FOR_DRS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DRS-METHOD");
        $str134$_______________________FINAL_CYCL = SubLObjectFactory.makeString("~%******************** FINAL CYCL FORMULA ********************~%");
        $str135$_A__ = SubLObjectFactory.makeString("~A~%");
        $sym136$DRS_CONSTRUCT_CYCL_METHOD = SubLObjectFactory.makeSymbol("DRS-CONSTRUCT-CYCL-METHOD");
    }
}

/*

	Total time: 1068 ms
	
*/