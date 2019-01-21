package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.reformulator_hub;
import com.cyc.cycjava.cycl.psp_main;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sanity_checker extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.sanity_checker";
    public static final String myFingerPrint = "3d57d79ef335aa0dc516f83c9c7da25a37caad135271772735a98db0b2192535";
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 1151L)
    private static SubLSymbol $sanity_checker$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 1190L)
    private static SubLSymbol $piquant_sanity_checkers$;
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 14951L)
    private static SubLSymbol $scalar_checker_backchain$;
    private static final SubLSymbol $sym0$SANITY_CHECKER;
    private static final SubLSymbol $sym1$STRINGP;
    private static final SubLSymbol $sym2$PIQUANT_SANITY_CHECKER;
    private static final SubLSymbol $sym3$SHOW_DEBUG_INFO;
    private static final SubLSymbol $sym4$CHECK;
    private static final SubLSymbol $sym5$LISTP;
    private static final SubLSymbol $sym6$CHECK_CYC_INTERPRETATIONS;
    private static final SubLSymbol $sym7$BOOLEAN;
    private static final SubLSymbol $sym8$PROPOSED_VALUE;
    private static final SubLSymbol $sym9$OBJECT;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$SCRATCHPAD;
    private static final SubLSymbol $sym12$CACHE;
    private static final SubLSymbol $sym13$INSTANCE_COUNT;
    private static final SubLSymbol $sym14$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_CLASS;
    private static final SubLSymbol $sym15$ISOLATED_P;
    private static final SubLSymbol $sym16$INSTANCE_NUMBER;
    private static final SubLSymbol $sym17$FUDGE_FACTOR;
    private static final SubLSymbol $sym18$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_INSTANCE;
    private static final SubLSymbol $sym19$INITIALIZE;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD;
    private static final SubLSymbol $sym23$SANITY_CHECKER_INITIALIZE_METHOD;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD;
    private static final SubLSymbol $sym26$SANITY_CHECKER_SHOW_DEBUG_INFO_METHOD;
    private static final SubLSymbol $sym27$HIDE_DEBUG_INFO;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD;
    private static final SubLSymbol $sym30$SANITY_CHECKER_HIDE_DEBUG_INFO_METHOD;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD;
    private static final SubLSymbol $sym35$SANITY_CHECKER_SCRATCHPAD;
    private static final SubLSymbol $sym36$SET_PREDICATE;
    private static final SubLSymbol $sym37$SET_FOCUS;
    private static final SubLSymbol $sym38$SET_ANSWER;
    private static final SubLSymbol $sym39$COMPUTE_DEGENERATE_DIAGNOSIS;
    private static final SubLSymbol $sym40$DEGENERATE_DIAGNOSIS;
    private static final SubLSymbol $sym41$INITIALIZE_CHECKERS;
    private static final SubLSymbol $sym42$DIAGNOSE;
    private static final SubLSymbol $sym43$OUTPUT_DIAGNOSES;
    private static final SubLString $str44$___S;
    private static final SubLSymbol $sym45$PLISTIFY;
    private static final SubLSymbol $sym46$SANITY_CHECKER_CHECK_METHOD;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD;
    private static final SubLSymbol $sym50$CYC_FOCUSES;
    private static final SubLSymbol $sym51$SET_CYC_ANSWERS;
    private static final SubLSymbol $sym52$SANITY_CHECKER_CHECK_CYC_INTERPRETATIONS_METHOD;
    private static final SubLSymbol $sym53$CHECK_LISTIFIED;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD;
    private static final SubLSymbol $sym56$SET_PIQUANT_FOCUS;
    private static final SubLSymbol $sym57$SET_PIQUANT_ANSWER;
    private static final SubLSymbol $sym58$SANITY_CHECKER_CHECK_LISTIFIED_METHOD;
    private static final SubLSymbol $sym59$NUMBERP;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_CLASS;
    private static final SubLSymbol $sym62$SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_INSTANCE;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD;
    private static final SubLSymbol $sym66$SET_PIQUANT_PREDICATE;
    private static final SubLSymbol $sym67$PIQUANT_SANITY_CHECKER_CHECK_METHOD;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD;
    private static final SubLSymbol $sym70$PIQUANT_SANITY_CHECKER_CHECK_LISTIFIED_METHOD;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$CHECKERS_POOL;
    private static final SubLSymbol $sym73$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_CLASS;
    private static final SubLSymbol $sym74$PREDICATE;
    private static final SubLSymbol $sym75$FOCUS;
    private static final SubLSymbol $sym76$ANSWER;
    private static final SubLSymbol $sym77$CYC_ANSWERS;
    private static final SubLSymbol $sym78$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_INSTANCE;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
    private static final SubLSymbol $sym81$DIAGNOSIS;
    private static final SubLSymbol $sym82$SANITY_CHECKER_SCRATCHPAD_OUTPUT_DIAGNOSES_METHOD;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$SANITY_CHECKER_SCRATCHPAD_INITIALIZE_METHOD;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
    private static final SubLSymbol $sym88$SANITY_CHECKER_SCRATCHPAD_SET_FOCUS_METHOD;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
    private static final SubLString $str92$__;
    private static final SubLSymbol $sym93$GURUQA_OBJECT;
    private static final SubLSymbol $sym94$GURUQA_PARSE_PRECISE;
    private static final SubLSymbol $sym95$DENOTATIONS;
    private static final SubLSymbol $sym96$SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_FOCUS_METHOD;
    private static final SubLList $list97;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
    private static final SubLObject $const100$BinaryPredicate;
    private static final SubLString $str101$___S_is_not_a_binary_predicate_;
    private static final SubLSymbol $sym102$SANITY_CHECKER_SCRATCHPAD_SET_PREDICATE_METHOD;
    private static final SubLList $list103;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
    private static final SubLSymbol $sym106$SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_PREDICATE_METHOD;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
    private static final SubLSymbol $sym109$COMPUTE_CYC_ANSWERS;
    private static final SubLSymbol $sym110$SANITY_CHECKER_SCRATCHPAD_SET_ANSWER_METHOD;
    private static final SubLList $list111;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
    private static final SubLObject $const114$Unity;
    private static final SubLSymbol $sym115$SANITY_CHECKER_SCRATCHPAD_SET_CYC_ANSWERS_METHOD;
    private static final SubLList $list116;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
    private static final SubLSymbol $sym119$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const120$EverythingPSC;
    private static final SubLSymbol $sym121$SANITY_CHECKER_SCRATCHPAD_COMPUTE_CYC_ANSWERS_METHOD;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
    private static final SubLSymbol $sym124$SANITY_CHECKER_DIAGNOSIS;
    private static final SubLInteger $int125$100;
    private static final SubLSymbol $sym126$FAILURE_CODE;
    private static final SubLSymbol $sym127$SANITY_CHECKER_SCRATCHPAD_COMPUTE_DEGENERATE_DIAGNOSIS_METHOD;
    private static final SubLList $list128;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
    private static final SubLObject $const131$arg1Isa;
    private static final SubLObject $const132$arg2Isa;
    private static final SubLSymbol $sym133$SCALAR_CHECKER;
    private static final SubLSymbol $sym134$ARG1;
    private static final SubLSymbol $sym135$ARG2;
    private static final SubLInteger $int136$1000;
    private static final SubLSymbol $sym137$SANITY_CHECKER_SCRATCHPAD_INITIALIZE_CHECKERS_METHOD;
    private static final SubLList $list138;
    private static final SubLSymbol $sym139$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD;
    private static final SubLSymbol $sym140$COMPUTE_RANGE;
    private static final SubLSymbol $sym141$SANITY_CHECKER_SCRATCHPAD_DIAGNOSE_METHOD;
    private static final SubLSymbol $sym142$INTEGERP;
    private static final SubLList $list143;
    private static final SubLSymbol $sym144$ARG2RANGE;
    private static final SubLSymbol $sym145$SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_CLASS;
    private static final SubLSymbol $sym146$BACKCHAIN;
    private static final SubLSymbol $sym147$SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_INSTANCE;
    private static final SubLList $list148;
    private static final SubLSymbol $sym149$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD;
    private static final SubLSymbol $sym150$SCALAR_CHECKER_INITIALIZE_METHOD;
    private static final SubLList $list151;
    private static final SubLSymbol $sym152$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$_RANGE;
    private static final SubLSymbol $sym155$SCALAR_RANGE;
    private static final SubLSymbol $sym156$FILL;
    private static final SubLSymbol $sym157$EMPTY_P;
    private static final SubLSymbol $sym158$MERGE;
    private static final SubLSymbol $sym159$FUDGE;
    private static final SubLSymbol $sym160$SCALAR_CHECKER_COMPUTE_RANGE_METHOD;
    private static final SubLObject $const161$Collection;
    private static final SubLObject $const162$SomeFn;
    private static final SubLList $list163;
    private static final SubLSymbol $sym164$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD;
    private static final SubLSymbol $sym165$GET_MIN;
    private static final SubLSymbol $sym166$GET_MAX;
    private static final SubLSymbol $sym167$LISTIFY;
    private static final SubLSymbol $sym168$PROPOSED_ARG;
    private static final SubLObject $const169$lessThan;
    private static final SubLObject $const170$greaterThan;
    private static final SubLObject $const171$quantitySubsumes;
    private static final SubLSymbol $sym172$COMPLETE;
    private static final SubLSymbol $sym173$ANSWER_KNOWN;
    private static final SubLObject $const174$and;
    private static final SubLSymbol $sym175$JUSTIFICATION;
    private static final SubLString $str176$No_information_available;
    private static final SubLSymbol $sym177$SCALAR_CHECKER_DIAGNOSE_METHOD;
    private static final SubLList $list178;
    private static final SubLSymbol $sym179$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_CLASS;
    private static final SubLSymbol $sym180$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_INSTANCE;
    private static final SubLList $list181;
    private static final SubLSymbol $sym182$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD;
    private static final SubLSymbol $sym183$SANITY_CHECKER_DIAGNOSIS_INITIALIZE_METHOD;
    private static final SubLList $list184;
    private static final SubLSymbol $sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD;
    private static final SubLSymbol $sym186$SANITY_CHECKER_DIAGNOSIS_BOOLEAN_METHOD;
    private static final SubLList $list187;
    private static final SubLSymbol $sym188$POINT_INFO;
    private static final SubLSymbol $sym189$MAX;
    private static final SubLSymbol $sym190$MIN;
    private static final SubLSymbol $sym191$UNIT;
    private static final SubLSymbol $sym192$SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_CLASS;
    private static final SubLSymbol $sym193$SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_INSTANCE;
    private static final SubLSymbol $sym194$PRINT;
    private static final SubLList $list195;
    private static final SubLList $list196;
    private static final SubLSymbol $sym197$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLSymbol $sym198$SCALAR_RANGE_PRINT_METHOD;
    private static final SubLList $list199;
    private static final SubLSymbol $sym200$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLSymbol $sym201$SCALAR_RANGE_INITIALIZE_METHOD;
    private static final SubLList $list202;
    private static final SubLSymbol $sym203$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLSymbol $sym204$SCALAR_RANGE_EMPTY_P_METHOD;
    private static final SubLList $list205;
    private static final SubLList $list206;
    private static final SubLSymbol $sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLObject $const208$isa;
    private static final SubLList $list209;
    private static final SubLObject $const210$BaseKB;
    private static final SubLObject $const211$UnitOfMeasure;
    private static final SubLSymbol $sym212$SCALAR_RANGE_FILL_METHOD;
    private static final SubLSymbol $sym213$GET_UNIT;
    private static final SubLList $list214;
    private static final SubLSymbol $sym215$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLSymbol $sym216$SCALAR_RANGE_GET_UNIT_METHOD;
    private static final SubLList $list217;
    private static final SubLSymbol $sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLSymbol $sym219$SCALAR_RANGE_GET_MIN_METHOD;
    private static final SubLSymbol $sym220$GET_MIN_VALUE;
    private static final SubLList $list221;
    private static final SubLSymbol $sym222$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLSymbol $sym223$SCALAR_RANGE_GET_MIN_VALUE_METHOD;
    private static final SubLList $list224;
    private static final SubLSymbol $sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLSymbol $sym226$SCALAR_RANGE_GET_MAX_METHOD;
    private static final SubLSymbol $sym227$GET_MAX_VALUE;
    private static final SubLList $list228;
    private static final SubLSymbol $sym229$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLSymbol $sym230$SCALAR_RANGE_GET_MAX_VALUE_METHOD;
    private static final SubLList $list231;
    private static final SubLSymbol $sym232$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLSymbol $sym233$SCALAR_RANGE_LISTIFY_METHOD;
    private static final SubLList $list234;
    private static final SubLSymbol $sym235$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLSymbol $sym236$SCALAR_RANGE_FUDGE_METHOD;
    private static final SubLSymbol $sym237$CONVERTIBLE_P;
    private static final SubLList $list238;
    private static final SubLList $list239;
    private static final SubLSymbol $sym240$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLSymbol $sym241$SCALAR_RANGE_P;
    private static final SubLList $list242;
    private static final SubLList $list243;
    private static final SubLSymbol $sym244$SCALAR_RANGE_CONVERTIBLE_P_METHOD;
    private static final SubLList $list245;
    private static final SubLSymbol $sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLSymbol $sym247$MERGE_LOOSE;
    private static final SubLSymbol $sym248$MERGE_STRICT;
    private static final SubLSymbol $sym249$SCALAR_RANGE_MERGE_METHOD;
    private static final SubLList $list250;
    private static final SubLSymbol $sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLObject $const252$lessThanOrEqualTo;
    private static final SubLSymbol $sym253$SCALAR_RANGE_MERGE_LOOSE_METHOD;
    private static final SubLList $list254;
    private static final SubLSymbol $sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD;
    private static final SubLString $str256$__Inconsistent_ranges___S__S;
    private static final SubLSymbol $sym257$SCALAR_RANGE_MERGE_STRICT_METHOD;
    private static final SubLObject $const258$age;
    private static final SubLObject $const259$numberOfInhabitants;
    private static final SubLObject $const260$YearsDuration;
    private static final SubLObject $const261$NumericalQuant_NLAttrFn;
    private static final SubLObject $const262$HomoSapiens;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 1263L)
    public static SubLObject get_sanity_checker() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sanity_checker.NIL == sanity_checker.$sanity_checker$.getDynamicValue(thread)) {
            sanity_checker.$sanity_checker$.setDynamicValue(object.new_class_instance((SubLObject)sanity_checker.$sym0$SANITY_CHECKER), thread);
        }
        return sanity_checker.$sanity_checker$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 1423L)
    public static SubLObject get_piquant_sanity_checker(final SubLObject guid_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sanity_checker.NIL != Types.stringp(guid_string) : guid_string;
        if (!sanity_checker.$piquant_sanity_checkers$.getDynamicValue(thread).isHashtable()) {
            sanity_checker.$piquant_sanity_checkers$.setDynamicValue(Hashtables.make_hash_table((SubLObject)sanity_checker.EIGHT_INTEGER, Symbols.symbol_function((SubLObject)sanity_checker.EQUALP), (SubLObject)sanity_checker.UNPROVIDED), thread);
        }
        SubLObject checker = Hashtables.gethash(guid_string, sanity_checker.$piquant_sanity_checkers$.getDynamicValue(thread), (SubLObject)sanity_checker.UNPROVIDED);
        if (sanity_checker.NIL == checker) {
            checker = object.new_class_instance((SubLObject)sanity_checker.$sym2$PIQUANT_SANITY_CHECKER);
            methods.funcall_instance_method_with_0_args(checker, (SubLObject)sanity_checker.$sym3$SHOW_DEBUG_INFO);
            Hashtables.sethash(guid_string, sanity_checker.$piquant_sanity_checkers$.getDynamicValue(thread), checker);
        }
        return checker;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 1913L)
    public static SubLObject sanity_check(final SubLObject cyc_predicate, final SubLObject focus, final SubLObject v_answer) {
        return methods.funcall_instance_method_with_3_args(get_sanity_checker(), (SubLObject)sanity_checker.$sym4$CHECK, cyc_predicate, focus, v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2041L)
    public static SubLObject cyc_sanity_check(final SubLObject cyc_predicate, final SubLObject cyc_focuses, final SubLObject cyc_answers) {
        assert sanity_checker.NIL != Types.listp(cyc_focuses) : cyc_focuses;
        assert sanity_checker.NIL != Types.listp(cyc_focuses) : cyc_focuses;
        return methods.funcall_instance_method_with_3_args(get_sanity_checker(), (SubLObject)sanity_checker.$sym6$CHECK_CYC_INTERPRETATIONS, cyc_predicate, cyc_focuses, cyc_answers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2281L)
    public static SubLObject cyc_sanity_filter(final SubLObject cyc_predicate, final SubLObject cyc_focuses, final SubLObject cyc_answers) {
        assert sanity_checker.NIL != Types.listp(cyc_focuses) : cyc_focuses;
        assert sanity_checker.NIL != Types.listp(cyc_focuses) : cyc_focuses;
        final SubLObject diagnoses = cyc_sanity_check(cyc_predicate, cyc_focuses, cyc_answers);
        SubLObject sane_answers = (SubLObject)sanity_checker.NIL;
        SubLObject cdolist_list_var = diagnoses;
        SubLObject diagnosis = (SubLObject)sanity_checker.NIL;
        diagnosis = cdolist_list_var.first();
        while (sanity_checker.NIL != cdolist_list_var) {
            if (sanity_checker.NIL != methods.funcall_instance_method_with_0_args(diagnosis, (SubLObject)sanity_checker.$sym7$BOOLEAN)) {
                sane_answers = (SubLObject)ConsesLow.cons(instances.get_slot(diagnosis, (SubLObject)sanity_checker.$sym8$PROPOSED_VALUE), sane_answers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            diagnosis = cdolist_list_var.first();
        }
        return sane_answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
    public static SubLObject get_sanity_checker_show_debug_info(final SubLObject v_sanity_checker) {
        return classes.subloop_get_access_protected_instance_slot(v_sanity_checker, (SubLObject)sanity_checker.FOUR_INTEGER, (SubLObject)sanity_checker.$sym3$SHOW_DEBUG_INFO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
    public static SubLObject set_sanity_checker_show_debug_info(final SubLObject v_sanity_checker, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_sanity_checker, value, (SubLObject)sanity_checker.FOUR_INTEGER, (SubLObject)sanity_checker.$sym3$SHOW_DEBUG_INFO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
    public static SubLObject get_sanity_checker_fudge_factor(final SubLObject v_sanity_checker) {
        return classes.subloop_get_instance_slot(v_sanity_checker, (SubLObject)sanity_checker.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
    public static SubLObject set_sanity_checker_fudge_factor(final SubLObject v_sanity_checker, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_sanity_checker, value, (SubLObject)sanity_checker.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
    public static SubLObject get_sanity_checker_scratchpad(final SubLObject v_sanity_checker) {
        return classes.subloop_get_access_protected_instance_slot(v_sanity_checker, (SubLObject)sanity_checker.TWO_INTEGER, (SubLObject)sanity_checker.$sym11$SCRATCHPAD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
    public static SubLObject set_sanity_checker_scratchpad(final SubLObject v_sanity_checker, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_sanity_checker, value, (SubLObject)sanity_checker.TWO_INTEGER, (SubLObject)sanity_checker.$sym11$SCRATCHPAD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
    public static SubLObject get_sanity_checker_cache(final SubLObject v_sanity_checker) {
        return classes.subloop_get_access_protected_instance_slot(v_sanity_checker, (SubLObject)sanity_checker.ONE_INTEGER, (SubLObject)sanity_checker.$sym12$CACHE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
    public static SubLObject set_sanity_checker_cache(final SubLObject v_sanity_checker, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_sanity_checker, value, (SubLObject)sanity_checker.ONE_INTEGER, (SubLObject)sanity_checker.$sym12$CACHE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
    public static SubLObject subloop_reserved_initialize_sanity_checker_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym13$INSTANCE_COUNT, (SubLObject)sanity_checker.ZERO_INTEGER);
        return (SubLObject)sanity_checker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
    public static SubLObject subloop_reserved_initialize_sanity_checker_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym15$ISOLATED_P, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym16$INSTANCE_NUMBER, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym12$CACHE, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym11$SCRATCHPAD, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym17$FUDGE_FACTOR, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym3$SHOW_DEBUG_INFO, (SubLObject)sanity_checker.NIL);
        return (SubLObject)sanity_checker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 2679L)
    public static SubLObject sanity_checker_p(final SubLObject v_sanity_checker) {
        return classes.subloop_instanceof_class(v_sanity_checker, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 3292L)
    public static SubLObject sanity_checker_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_method = (SubLObject)sanity_checker.NIL;
        SubLObject fudge_factor = get_sanity_checker_fudge_factor(self);
        try {
            thread.throwStack.push(sanity_checker.$sym22$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
            try {
                object.object_initialize_method(self);
                fudge_factor = (SubLObject)sanity_checker.ZERO_INTEGER;
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym22$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_fudge_factor(self, fudge_factor);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym22$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 3416L)
    public static SubLObject sanity_checker_show_debug_info_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_method = (SubLObject)sanity_checker.NIL;
        SubLObject show_debug_info = get_sanity_checker_show_debug_info(self);
        try {
            thread.throwStack.push(sanity_checker.$sym25$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
            try {
                show_debug_info = (SubLObject)sanity_checker.T;
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym25$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_show_debug_info(self, show_debug_info);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym25$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 3525L)
    public static SubLObject sanity_checker_hide_debug_info_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_method = (SubLObject)sanity_checker.NIL;
        SubLObject show_debug_info = get_sanity_checker_show_debug_info(self);
        try {
            thread.throwStack.push(sanity_checker.$sym29$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
            try {
                show_debug_info = (SubLObject)sanity_checker.NIL;
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym29$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_show_debug_info(self, show_debug_info);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym29$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 3636L)
    public static SubLObject sanity_checker_check_method(final SubLObject self, final SubLObject predicate, final SubLObject focus, final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_method = (SubLObject)sanity_checker.NIL;
        final SubLObject show_debug_info = get_sanity_checker_show_debug_info(self);
        final SubLObject fudge_factor = get_sanity_checker_fudge_factor(self);
        SubLObject scratchpad = get_sanity_checker_scratchpad(self);
        try {
            thread.throwStack.push(sanity_checker.$sym34$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
            try {
                scratchpad = object.new_class_instance((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD);
                methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym36$SET_PREDICATE, predicate);
                methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym37$SET_FOCUS, focus);
                methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym38$SET_ANSWER, v_answer);
                methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym39$COMPUTE_DEGENERATE_DIAGNOSIS);
                if (sanity_checker.NIL == instances.get_slot(scratchpad, (SubLObject)sanity_checker.$sym40$DEGENERATE_DIAGNOSIS)) {
                    methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym41$INITIALIZE_CHECKERS, fudge_factor);
                    methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym42$DIAGNOSE);
                }
                final SubLObject result = methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym43$OUTPUT_DIAGNOSES);
                if (sanity_checker.NIL != show_debug_info) {
                    SubLObject cdolist_list_var = result;
                    SubLObject item = (SubLObject)sanity_checker.NIL;
                    item = cdolist_list_var.first();
                    while (sanity_checker.NIL != cdolist_list_var) {
                        PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)sanity_checker.$str44$___S, methods.funcall_instance_method_with_0_args(item, (SubLObject)sanity_checker.$sym45$PLISTIFY));
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym34$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_show_debug_info(self, show_debug_info);
                    set_sanity_checker_fudge_factor(self, fudge_factor);
                    set_sanity_checker_scratchpad(self, scratchpad);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym34$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 4439L)
    public static SubLObject sanity_checker_check_cyc_interpretations_method(final SubLObject self, final SubLObject predicate, final SubLObject cyc_interpretations, final SubLObject cyc_answers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_method = (SubLObject)sanity_checker.NIL;
        final SubLObject show_debug_info = get_sanity_checker_show_debug_info(self);
        final SubLObject fudge_factor = get_sanity_checker_fudge_factor(self);
        SubLObject scratchpad = get_sanity_checker_scratchpad(self);
        try {
            thread.throwStack.push(sanity_checker.$sym49$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
            try {
                scratchpad = object.new_class_instance((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD);
                methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym36$SET_PREDICATE, predicate);
                instances.set_slot(scratchpad, (SubLObject)sanity_checker.$sym50$CYC_FOCUSES, cyc_interpretations);
                methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym51$SET_CYC_ANSWERS, cyc_answers);
                methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym39$COMPUTE_DEGENERATE_DIAGNOSIS);
                if (sanity_checker.NIL == instances.get_slot(scratchpad, (SubLObject)sanity_checker.$sym40$DEGENERATE_DIAGNOSIS)) {
                    methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym41$INITIALIZE_CHECKERS, fudge_factor);
                    methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym42$DIAGNOSE);
                }
                final SubLObject result = methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym43$OUTPUT_DIAGNOSES);
                if (sanity_checker.NIL != show_debug_info) {
                    SubLObject cdolist_list_var = result;
                    SubLObject item = (SubLObject)sanity_checker.NIL;
                    item = cdolist_list_var.first();
                    while (sanity_checker.NIL != cdolist_list_var) {
                        PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)sanity_checker.$str44$___S, methods.funcall_instance_method_with_0_args(item, (SubLObject)sanity_checker.$sym45$PLISTIFY));
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym49$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_show_debug_info(self, show_debug_info);
                    set_sanity_checker_fudge_factor(self, fudge_factor);
                    set_sanity_checker_scratchpad(self, scratchpad);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym49$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 5292L)
    public static SubLObject sanity_checker_check_listified_method(final SubLObject self, final SubLObject predicate, final SubLObject focus, final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_method = (SubLObject)sanity_checker.NIL;
        final SubLObject show_debug_info = get_sanity_checker_show_debug_info(self);
        final SubLObject fudge_factor = get_sanity_checker_fudge_factor(self);
        SubLObject scratchpad = get_sanity_checker_scratchpad(self);
        try {
            thread.throwStack.push(sanity_checker.$sym55$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
            try {
                scratchpad = object.new_class_instance((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD);
                methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym36$SET_PREDICATE, predicate);
                methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym56$SET_PIQUANT_FOCUS, focus);
                methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym57$SET_PIQUANT_ANSWER, v_answer);
                methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym39$COMPUTE_DEGENERATE_DIAGNOSIS);
                if (sanity_checker.NIL == instances.get_slot(scratchpad, (SubLObject)sanity_checker.$sym40$DEGENERATE_DIAGNOSIS)) {
                    methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym41$INITIALIZE_CHECKERS, fudge_factor);
                    methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym42$DIAGNOSE);
                }
                final SubLObject result = methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym43$OUTPUT_DIAGNOSES);
                SubLObject listified_result = (SubLObject)sanity_checker.NIL;
                SubLObject cdolist_list_var = result;
                SubLObject item = (SubLObject)sanity_checker.NIL;
                item = cdolist_list_var.first();
                while (sanity_checker.NIL != cdolist_list_var) {
                    listified_result = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(item, (SubLObject)sanity_checker.$sym45$PLISTIFY), listified_result);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
                if (sanity_checker.NIL != show_debug_info) {
                    cdolist_list_var = listified_result;
                    item = (SubLObject)sanity_checker.NIL;
                    item = cdolist_list_var.first();
                    while (sanity_checker.NIL != cdolist_list_var) {
                        PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)sanity_checker.$str44$___S, item);
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym55$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD, listified_result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_show_debug_info(self, show_debug_info);
                    set_sanity_checker_fudge_factor(self, fudge_factor);
                    set_sanity_checker_scratchpad(self, scratchpad);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym55$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 6224L)
    public static SubLObject piquant_sanity_check(final SubLObject pred_string, final SubLObject focus_string, final SubLObject answer_string, final SubLObject guid_string, SubLObject fudge_factor) {
        if (fudge_factor == sanity_checker.UNPROVIDED) {
            fudge_factor = (SubLObject)sanity_checker.NIL;
        }
        assert sanity_checker.NIL != Types.stringp(guid_string) : guid_string;
        if (sanity_checker.NIL != fudge_factor && !sanity_checker.assertionsDisabledInClass && sanity_checker.NIL == Types.numberp(fudge_factor)) {
            throw new AssertionError(fudge_factor);
        }
        if (sanity_checker.NIL != fudge_factor) {
            instances.set_slot(get_piquant_sanity_checker(guid_string), (SubLObject)sanity_checker.$sym17$FUDGE_FACTOR, fudge_factor);
        }
        return methods.funcall_instance_method_with_3_args(get_piquant_sanity_checker(guid_string), (SubLObject)sanity_checker.$sym53$CHECK_LISTIFIED, pred_string, focus_string, answer_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 6762L)
    public static SubLObject subloop_reserved_initialize_piquant_sanity_checker_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym13$INSTANCE_COUNT, (SubLObject)sanity_checker.ZERO_INTEGER);
        return (SubLObject)sanity_checker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 6762L)
    public static SubLObject subloop_reserved_initialize_piquant_sanity_checker_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym15$ISOLATED_P, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym16$INSTANCE_NUMBER, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym12$CACHE, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym11$SCRATCHPAD, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym17$FUDGE_FACTOR, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym3$SHOW_DEBUG_INFO, (SubLObject)sanity_checker.NIL);
        return (SubLObject)sanity_checker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 6762L)
    public static SubLObject piquant_sanity_checker_p(final SubLObject piquant_sanity_checker) {
        return classes.subloop_instanceof_class(piquant_sanity_checker, (SubLObject)sanity_checker.$sym2$PIQUANT_SANITY_CHECKER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 6987L)
    public static SubLObject piquant_sanity_checker_check_method(final SubLObject self, final SubLObject piquant_predicate, final SubLObject piquant_focus, final SubLObject piquant_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_piquant_sanity_checker_method = (SubLObject)sanity_checker.NIL;
        final SubLObject show_debug_info = get_sanity_checker_show_debug_info(self);
        final SubLObject fudge_factor = get_sanity_checker_fudge_factor(self);
        SubLObject scratchpad = get_sanity_checker_scratchpad(self);
        try {
            thread.throwStack.push(sanity_checker.$sym65$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD);
            try {
                scratchpad = object.new_class_instance((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD);
                methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym66$SET_PIQUANT_PREDICATE, piquant_predicate);
                methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym56$SET_PIQUANT_FOCUS, piquant_focus);
                methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym38$SET_ANSWER, piquant_answer);
                methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym39$COMPUTE_DEGENERATE_DIAGNOSIS);
                if (sanity_checker.NIL == instances.get_slot(scratchpad, (SubLObject)sanity_checker.$sym40$DEGENERATE_DIAGNOSIS)) {
                    methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym41$INITIALIZE_CHECKERS, fudge_factor);
                    methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym42$DIAGNOSE);
                }
                final SubLObject result = methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym43$OUTPUT_DIAGNOSES);
                if (sanity_checker.NIL != show_debug_info) {
                    SubLObject cdolist_list_var = result;
                    SubLObject item = (SubLObject)sanity_checker.NIL;
                    item = cdolist_list_var.first();
                    while (sanity_checker.NIL != cdolist_list_var) {
                        PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)sanity_checker.$str44$___S, methods.funcall_instance_method_with_0_args(item, (SubLObject)sanity_checker.$sym45$PLISTIFY));
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym65$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_show_debug_info(self, show_debug_info);
                    set_sanity_checker_fudge_factor(self, fudge_factor);
                    set_sanity_checker_scratchpad(self, scratchpad);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_piquant_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym65$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_piquant_sanity_checker_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 7862L)
    public static SubLObject piquant_sanity_checker_check_listified_method(final SubLObject self, final SubLObject piquant_predicate, final SubLObject piquant_focus, final SubLObject piquant_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_piquant_sanity_checker_method = (SubLObject)sanity_checker.NIL;
        final SubLObject show_debug_info = get_sanity_checker_show_debug_info(self);
        final SubLObject fudge_factor = get_sanity_checker_fudge_factor(self);
        SubLObject scratchpad = get_sanity_checker_scratchpad(self);
        try {
            thread.throwStack.push(sanity_checker.$sym69$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD);
            try {
                scratchpad = object.new_class_instance((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD);
                methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym66$SET_PIQUANT_PREDICATE, piquant_predicate);
                methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym56$SET_PIQUANT_FOCUS, piquant_focus);
                methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym38$SET_ANSWER, piquant_answer);
                methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym39$COMPUTE_DEGENERATE_DIAGNOSIS);
                if (sanity_checker.NIL == instances.get_slot(scratchpad, (SubLObject)sanity_checker.$sym40$DEGENERATE_DIAGNOSIS)) {
                    methods.funcall_instance_method_with_1_args(scratchpad, (SubLObject)sanity_checker.$sym41$INITIALIZE_CHECKERS, fudge_factor);
                    methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym42$DIAGNOSE);
                }
                final SubLObject result = methods.funcall_instance_method_with_0_args(scratchpad, (SubLObject)sanity_checker.$sym43$OUTPUT_DIAGNOSES);
                SubLObject listified_result = (SubLObject)sanity_checker.NIL;
                SubLObject cdolist_list_var = result;
                SubLObject item = (SubLObject)sanity_checker.NIL;
                item = cdolist_list_var.first();
                while (sanity_checker.NIL != cdolist_list_var) {
                    listified_result = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(item, (SubLObject)sanity_checker.$sym45$PLISTIFY), listified_result);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
                if (sanity_checker.NIL != show_debug_info) {
                    cdolist_list_var = listified_result;
                    item = (SubLObject)sanity_checker.NIL;
                    item = cdolist_list_var.first();
                    while (sanity_checker.NIL != cdolist_list_var) {
                        PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)sanity_checker.$str44$___S, item);
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym69$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD, listified_result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_show_debug_info(self, show_debug_info);
                    set_sanity_checker_fudge_factor(self, fudge_factor);
                    set_sanity_checker_scratchpad(self, scratchpad);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_piquant_sanity_checker_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym69$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_piquant_sanity_checker_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject get_sanity_checker_scratchpad_degenerate_diagnosis(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_get_access_protected_instance_slot(sanity_checker_scratchpad, (SubLObject)sanity_checker.SEVEN_INTEGER, (SubLObject)sanity_checker.$sym40$DEGENERATE_DIAGNOSIS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject set_sanity_checker_scratchpad_degenerate_diagnosis(final SubLObject sanity_checker_scratchpad, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sanity_checker_scratchpad, value, (SubLObject)sanity_checker.SEVEN_INTEGER, (SubLObject)sanity_checker.$sym40$DEGENERATE_DIAGNOSIS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject get_sanity_checker_scratchpad_checkers_pool(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_get_access_protected_instance_slot(sanity_checker_scratchpad, (SubLObject)sanity_checker.SIX_INTEGER, (SubLObject)sanity_checker.$sym72$CHECKERS_POOL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject set_sanity_checker_scratchpad_checkers_pool(final SubLObject sanity_checker_scratchpad, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sanity_checker_scratchpad, value, (SubLObject)sanity_checker.SIX_INTEGER, (SubLObject)sanity_checker.$sym72$CHECKERS_POOL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject get_sanity_checker_scratchpad_cyc_answers(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_get_instance_slot(sanity_checker_scratchpad, (SubLObject)sanity_checker.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject set_sanity_checker_scratchpad_cyc_answers(final SubLObject sanity_checker_scratchpad, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_scratchpad, value, (SubLObject)sanity_checker.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject get_sanity_checker_scratchpad_answer(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_get_instance_slot(sanity_checker_scratchpad, (SubLObject)sanity_checker.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject set_sanity_checker_scratchpad_answer(final SubLObject sanity_checker_scratchpad, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_scratchpad, value, (SubLObject)sanity_checker.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject get_sanity_checker_scratchpad_cyc_focuses(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_get_instance_slot(sanity_checker_scratchpad, (SubLObject)sanity_checker.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject set_sanity_checker_scratchpad_cyc_focuses(final SubLObject sanity_checker_scratchpad, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_scratchpad, value, (SubLObject)sanity_checker.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject get_sanity_checker_scratchpad_focus(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_get_instance_slot(sanity_checker_scratchpad, (SubLObject)sanity_checker.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject set_sanity_checker_scratchpad_focus(final SubLObject sanity_checker_scratchpad, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_scratchpad, value, (SubLObject)sanity_checker.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject get_sanity_checker_scratchpad_predicate(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_get_instance_slot(sanity_checker_scratchpad, (SubLObject)sanity_checker.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject set_sanity_checker_scratchpad_predicate(final SubLObject sanity_checker_scratchpad, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_scratchpad, value, (SubLObject)sanity_checker.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject subloop_reserved_initialize_sanity_checker_scratchpad_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym13$INSTANCE_COUNT, (SubLObject)sanity_checker.ZERO_INTEGER);
        return (SubLObject)sanity_checker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject subloop_reserved_initialize_sanity_checker_scratchpad_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym15$ISOLATED_P, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym16$INSTANCE_NUMBER, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym74$PREDICATE, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym75$FOCUS, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym50$CYC_FOCUSES, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym76$ANSWER, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym77$CYC_ANSWERS, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym72$CHECKERS_POOL, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym40$DEGENERATE_DIAGNOSIS, (SubLObject)sanity_checker.NIL);
        return (SubLObject)sanity_checker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 8850L)
    public static SubLObject sanity_checker_scratchpad_p(final SubLObject sanity_checker_scratchpad) {
        return classes.subloop_instanceof_class(sanity_checker_scratchpad, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 9862L)
    public static SubLObject sanity_checker_scratchpad_output_diagnoses_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = (SubLObject)sanity_checker.NIL;
        final SubLObject degenerate_diagnosis = get_sanity_checker_scratchpad_degenerate_diagnosis(self);
        final SubLObject checkers_pool = get_sanity_checker_scratchpad_checkers_pool(self);
        try {
            thread.throwStack.push(sanity_checker.$sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                if (sanity_checker.NIL != degenerate_diagnosis) {
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, (SubLObject)ConsesLow.list(degenerate_diagnosis));
                }
                else {
                    SubLObject diagnoses = (SubLObject)sanity_checker.NIL;
                    SubLObject cdolist_list_var = checkers_pool;
                    SubLObject checker = (SubLObject)sanity_checker.NIL;
                    checker = cdolist_list_var.first();
                    while (sanity_checker.NIL != cdolist_list_var) {
                        diagnoses = (SubLObject)ConsesLow.cons(instances.get_slot(checker, (SubLObject)sanity_checker.$sym81$DIAGNOSIS), diagnoses);
                        cdolist_list_var = cdolist_list_var.rest();
                        checker = cdolist_list_var.first();
                    }
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, diagnoses);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_scratchpad_degenerate_diagnosis(self, degenerate_diagnosis);
                    set_sanity_checker_scratchpad_checkers_pool(self, checkers_pool);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 10143L)
    public static SubLObject sanity_checker_scratchpad_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 10254L)
    public static SubLObject sanity_checker_scratchpad_set_focus_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = (SubLObject)sanity_checker.NIL;
        SubLObject cyc_focuses = get_sanity_checker_scratchpad_cyc_focuses(self);
        SubLObject focus = get_sanity_checker_scratchpad_focus(self);
        try {
            thread.throwStack.push(sanity_checker.$sym87$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                assert sanity_checker.NIL != Types.stringp(string) : string;
                focus = string;
                SubLObject cdolist_list_var = psp_main.ps_get_cycls_for_np(string, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED);
                SubLObject denot = (SubLObject)sanity_checker.NIL;
                denot = cdolist_list_var.first();
                while (sanity_checker.NIL != cdolist_list_var) {
                    final SubLObject reformulated = reformulator_hub.reformulate_cycl(denot, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED);
                    if (sanity_checker.NIL != reformulated) {
                        final SubLObject item_var = reformulated;
                        if (sanity_checker.NIL == conses_high.member(item_var, cyc_focuses, Symbols.symbol_function((SubLObject)sanity_checker.EQUAL), Symbols.symbol_function((SubLObject)sanity_checker.IDENTITY))) {
                            cyc_focuses = (SubLObject)ConsesLow.cons(item_var, cyc_focuses);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    denot = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym87$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_scratchpad_cyc_focuses(self, cyc_focuses);
                    set_sanity_checker_scratchpad_focus(self, focus);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym87$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 10571L)
    public static SubLObject sanity_checker_scratchpad_set_piquant_focus_method(final SubLObject self, final SubLObject focus_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = (SubLObject)sanity_checker.NIL;
        SubLObject cyc_focuses = get_sanity_checker_scratchpad_cyc_focuses(self);
        SubLObject focus = get_sanity_checker_scratchpad_focus(self);
        try {
            thread.throwStack.push(sanity_checker.$sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                assert sanity_checker.NIL != Types.stringp(focus_string) : focus_string;
                final SubLObject denotations = (SubLObject)((sanity_checker.NIL != string_utilities.starts_with(focus_string, (SubLObject)sanity_checker.$str92$__)) ? ConsesLow.list(constants_high.find_constant(string_utilities.pre_remove(focus_string, (SubLObject)sanity_checker.$str92$__, (SubLObject)sanity_checker.UNPROVIDED))) : sanity_checker.NIL);
                if (sanity_checker.NIL != denotations) {
                    focus = focus_string;
                    cyc_focuses = denotations;
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
                }
                final SubLObject guruqa_object = methods.funcall_class_method_with_1_args((SubLObject)sanity_checker.$sym93$GURUQA_OBJECT, (SubLObject)sanity_checker.$sym94$GURUQA_PARSE_PRECISE, focus_string);
                if (sanity_checker.NIL != (focus = guruqa_object)) {
                    cyc_focuses = methods.funcall_instance_method_with_0_args(guruqa_object, (SubLObject)sanity_checker.$sym95$DENOTATIONS);
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_scratchpad_cyc_focuses(self, cyc_focuses);
                    set_sanity_checker_scratchpad_focus(self, focus);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 11158L)
    public static SubLObject sanity_checker_scratchpad_set_predicate_method(final SubLObject self, final SubLObject cyc_predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = (SubLObject)sanity_checker.NIL;
        SubLObject predicate = get_sanity_checker_scratchpad_predicate(self);
        try {
            thread.throwStack.push(sanity_checker.$sym99$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                if (sanity_checker.NIL != isa.isa_in_any_mtP(cyc_predicate, sanity_checker.$const100$BinaryPredicate)) {
                    predicate = cyc_predicate;
                }
                else {
                    Errors.warn((SubLObject)sanity_checker.$str101$___S_is_not_a_binary_predicate_, cyc_predicate);
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym99$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_scratchpad_predicate(self, predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym99$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 11418L)
    public static SubLObject sanity_checker_scratchpad_set_piquant_predicate_method(final SubLObject self, final SubLObject piquant_predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = (SubLObject)sanity_checker.NIL;
        SubLObject predicate = get_sanity_checker_scratchpad_predicate(self);
        try {
            thread.throwStack.push(sanity_checker.$sym105$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                final SubLObject cyc_predicate = constants_high.find_constant(piquant_predicate);
                if (sanity_checker.NIL != isa.isa_in_any_mtP(cyc_predicate, sanity_checker.$const100$BinaryPredicate)) {
                    predicate = cyc_predicate;
                }
                else {
                    Errors.warn((SubLObject)sanity_checker.$str101$___S_is_not_a_binary_predicate_, piquant_predicate);
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym105$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_scratchpad_predicate(self, predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym105$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 11749L)
    public static SubLObject sanity_checker_scratchpad_set_answer_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = (SubLObject)sanity_checker.NIL;
        SubLObject v_answer = get_sanity_checker_scratchpad_answer(self);
        try {
            thread.throwStack.push(sanity_checker.$sym108$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                assert sanity_checker.NIL != Types.stringp(string) : string;
                v_answer = string;
                methods.funcall_instance_method_with_1_args(self, (SubLObject)sanity_checker.$sym109$COMPUTE_CYC_ANSWERS, string);
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym108$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_scratchpad_answer(self, v_answer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym108$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 11956L)
    public static SubLObject sanity_checker_scratchpad_set_cyc_answers_method(final SubLObject self, final SubLObject cyc_candidate_answers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = (SubLObject)sanity_checker.NIL;
        SubLObject cyc_answers = get_sanity_checker_scratchpad_cyc_answers(self);
        final SubLObject v_answer = get_sanity_checker_scratchpad_answer(self);
        try {
            thread.throwStack.push(sanity_checker.$sym113$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                SubLObject cdolist_list_var = cyc_candidate_answers;
                SubLObject v_answer_$1 = (SubLObject)sanity_checker.NIL;
                v_answer_$1 = cdolist_list_var.first();
                while (sanity_checker.NIL != cdolist_list_var) {
                    if (sanity_checker.NIL != term.el_fort_p(v_answer_$1)) {
                        cyc_answers = (SubLObject)ConsesLow.cons(v_answer_$1, cyc_answers);
                    }
                    else if (v_answer_$1.isNumber()) {
                        cyc_answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sanity_checker.$const114$Unity, v_answer_$1), cyc_answers);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer_$1 = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym113$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_scratchpad_cyc_answers(self, cyc_answers);
                    set_sanity_checker_scratchpad_answer(self, v_answer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym113$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 12240L)
    public static SubLObject sanity_checker_scratchpad_compute_cyc_answers_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = (SubLObject)sanity_checker.NIL;
        SubLObject cyc_answers = get_sanity_checker_scratchpad_cyc_answers(self);
        try {
            thread.throwStack.push(sanity_checker.$sym118$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                final SubLObject all_denots = psp_main.ps_get_cycls_for_np(string, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED);
                SubLObject good_denots = (SubLObject)sanity_checker.NIL;
                SubLObject cdolist_list_var = all_denots;
                SubLObject denot = (SubLObject)sanity_checker.NIL;
                denot = cdolist_list_var.first();
                while (sanity_checker.NIL != cdolist_list_var) {
                    if (sanity_checker.NIL != term.el_fort_p(denot)) {
                        final SubLObject reformulated = reformulator_hub.reformulate_cycl(denot, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED);
                        SubLObject wft = (SubLObject)sanity_checker.NIL;
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sanity_checker.$sym119$RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind(sanity_checker.$const120$EverythingPSC, thread);
                            wft = wff.el_wftP(denot, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED);
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                        if (sanity_checker.NIL != wft) {
                            final SubLObject item_var = reformulated;
                            if (sanity_checker.NIL == conses_high.member(item_var, good_denots, Symbols.symbol_function((SubLObject)sanity_checker.EQUAL), Symbols.symbol_function((SubLObject)sanity_checker.IDENTITY))) {
                                good_denots = (SubLObject)ConsesLow.cons(item_var, good_denots);
                            }
                        }
                    }
                    else if (denot.isNumber()) {
                        good_denots = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sanity_checker.$const114$Unity, denot), good_denots);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    denot = cdolist_list_var.first();
                }
                cyc_answers = good_denots;
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym118$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_scratchpad_cyc_answers(self, cyc_answers);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym118$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 12792L)
    public static SubLObject sanity_checker_scratchpad_compute_degenerate_diagnosis_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = (SubLObject)sanity_checker.NIL;
        SubLObject degenerate_diagnosis = get_sanity_checker_scratchpad_degenerate_diagnosis(self);
        final SubLObject cyc_answers = get_sanity_checker_scratchpad_cyc_answers(self);
        final SubLObject cyc_focuses = get_sanity_checker_scratchpad_cyc_focuses(self);
        final SubLObject predicate = get_sanity_checker_scratchpad_predicate(self);
        try {
            thread.throwStack.push(sanity_checker.$sym123$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                final SubLObject diagnosis = object.new_class_instance((SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS);
                SubLObject basis = (SubLObject)sanity_checker.ZERO_INTEGER;
                if (sanity_checker.NIL == predicate) {
                    basis = Numbers.add(basis, (SubLObject)sanity_checker.$int125$100);
                }
                if (sanity_checker.NIL == cyc_focuses) {
                    basis = Numbers.add(basis, (SubLObject)sanity_checker.TEN_INTEGER);
                }
                if (sanity_checker.NIL == cyc_answers) {
                    basis = Numbers.add(basis, (SubLObject)sanity_checker.ONE_INTEGER);
                }
                if (basis.numG((SubLObject)sanity_checker.ZERO_INTEGER)) {
                    instances.set_slot(diagnosis, (SubLObject)sanity_checker.$sym126$FAILURE_CODE, basis);
                    degenerate_diagnosis = diagnosis;
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym123$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_scratchpad_degenerate_diagnosis(self, degenerate_diagnosis);
                    set_sanity_checker_scratchpad_cyc_answers(self, cyc_answers);
                    set_sanity_checker_scratchpad_cyc_focuses(self, cyc_focuses);
                    set_sanity_checker_scratchpad_predicate(self, predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym123$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 13224L)
    public static SubLObject sanity_checker_scratchpad_initialize_checkers_method(final SubLObject self, final SubLObject fudge_factor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = (SubLObject)sanity_checker.NIL;
        SubLObject degenerate_diagnosis = get_sanity_checker_scratchpad_degenerate_diagnosis(self);
        SubLObject checkers_pool = get_sanity_checker_scratchpad_checkers_pool(self);
        final SubLObject cyc_answers = get_sanity_checker_scratchpad_cyc_answers(self);
        final SubLObject cyc_focuses = get_sanity_checker_scratchpad_cyc_focuses(self);
        final SubLObject predicate = get_sanity_checker_scratchpad_predicate(self);
        try {
            thread.throwStack.push(sanity_checker.$sym130$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                final SubLObject pred_arg1_set = kb_mapping_utilities.pred_values_in_any_mt(predicate, sanity_checker.$const131$arg1Isa, (SubLObject)sanity_checker.ONE_INTEGER, (SubLObject)sanity_checker.TWO_INTEGER, (SubLObject)sanity_checker.UNPROVIDED);
                final SubLObject pred_arg2_set = kb_mapping_utilities.pred_values_in_any_mt(predicate, sanity_checker.$const132$arg2Isa, (SubLObject)sanity_checker.ONE_INTEGER, (SubLObject)sanity_checker.TWO_INTEGER, (SubLObject)sanity_checker.UNPROVIDED);
                SubLObject good_arg1s = (SubLObject)sanity_checker.NIL;
                SubLObject good_arg2s = (SubLObject)sanity_checker.NIL;
                SubLObject cdolist_list_var = cyc_focuses;
                SubLObject arg = (SubLObject)sanity_checker.NIL;
                arg = cdolist_list_var.first();
                while (sanity_checker.NIL != cdolist_list_var) {
                    SubLObject fail = (SubLObject)sanity_checker.NIL;
                    if (sanity_checker.NIL == fail) {
                        SubLObject csome_list_var = pred_arg1_set;
                        SubLObject arg2 = (SubLObject)sanity_checker.NIL;
                        arg2 = csome_list_var.first();
                        while (sanity_checker.NIL == fail && sanity_checker.NIL != csome_list_var) {
                            if (sanity_checker.NIL == isa.isa_in_any_mtP(arg, arg2) && sanity_checker.NIL == genls.genl_in_any_mtP(arg, arg2)) {
                                fail = (SubLObject)sanity_checker.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            arg2 = csome_list_var.first();
                        }
                    }
                    if (sanity_checker.NIL == fail) {
                        final SubLObject item_var = arg;
                        if (sanity_checker.NIL == conses_high.member(item_var, good_arg1s, Symbols.symbol_function((SubLObject)sanity_checker.EQUAL), Symbols.symbol_function((SubLObject)sanity_checker.IDENTITY))) {
                            good_arg1s = (SubLObject)ConsesLow.cons(item_var, good_arg1s);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
                cdolist_list_var = cyc_answers;
                arg = (SubLObject)sanity_checker.NIL;
                arg = cdolist_list_var.first();
                while (sanity_checker.NIL != cdolist_list_var) {
                    SubLObject fail = (SubLObject)sanity_checker.NIL;
                    SubLObject cast = (SubLObject)sanity_checker.NIL;
                    if (sanity_checker.NIL == fail) {
                        SubLObject csome_list_var2 = pred_arg2_set;
                        SubLObject arg3 = (SubLObject)sanity_checker.NIL;
                        arg3 = csome_list_var2.first();
                        while (sanity_checker.NIL == fail && sanity_checker.NIL != csome_list_var2) {
                            cast = heuristically_cast_unity(predicate, arg);
                            if (sanity_checker.NIL != term.el_fort_p(cast)) {
                                fail = (SubLObject)SubLObjectFactory.makeBoolean(sanity_checker.NIL == isa.isa_in_any_mtP(cast, arg3) && sanity_checker.NIL == genls.genl_in_any_mtP(arg, arg3));
                            }
                            else {
                                fail = (SubLObject)SubLObjectFactory.makeBoolean(!cast.isNumber() || !cast.isPositive());
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            arg3 = csome_list_var2.first();
                        }
                    }
                    if (sanity_checker.NIL == fail) {
                        final SubLObject item_var2 = cast;
                        if (sanity_checker.NIL == conses_high.member(item_var2, good_arg2s, Symbols.symbol_function((SubLObject)sanity_checker.EQUAL), Symbols.symbol_function((SubLObject)sanity_checker.IDENTITY))) {
                            good_arg2s = (SubLObject)ConsesLow.cons(item_var2, good_arg2s);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
                cdolist_list_var = good_arg1s;
                SubLObject good_arg1 = (SubLObject)sanity_checker.NIL;
                good_arg1 = cdolist_list_var.first();
                while (sanity_checker.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$2 = good_arg2s;
                    SubLObject good_arg2 = (SubLObject)sanity_checker.NIL;
                    good_arg2 = cdolist_list_var_$2.first();
                    while (sanity_checker.NIL != cdolist_list_var_$2) {
                        final SubLObject checker = object.new_class_instance((SubLObject)sanity_checker.$sym133$SCALAR_CHECKER);
                        instances.set_slot(checker, (SubLObject)sanity_checker.$sym17$FUDGE_FACTOR, fudge_factor);
                        instances.set_slot(checker, (SubLObject)sanity_checker.$sym74$PREDICATE, predicate);
                        instances.set_slot(checker, (SubLObject)sanity_checker.$sym134$ARG1, good_arg1);
                        instances.set_slot(checker, (SubLObject)sanity_checker.$sym135$ARG2, good_arg2);
                        checkers_pool = (SubLObject)ConsesLow.cons(checker, checkers_pool);
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        good_arg2 = cdolist_list_var_$2.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    good_arg1 = cdolist_list_var.first();
                }
                if (sanity_checker.NIL == checkers_pool) {
                    final SubLObject diagnosis = object.new_class_instance((SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS);
                    instances.set_slot(diagnosis, (SubLObject)sanity_checker.$sym126$FAILURE_CODE, (SubLObject)sanity_checker.$int136$1000);
                    degenerate_diagnosis = diagnosis;
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym130$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_scratchpad_degenerate_diagnosis(self, degenerate_diagnosis);
                    set_sanity_checker_scratchpad_checkers_pool(self, checkers_pool);
                    set_sanity_checker_scratchpad_cyc_answers(self, cyc_answers);
                    set_sanity_checker_scratchpad_cyc_focuses(self, cyc_focuses);
                    set_sanity_checker_scratchpad_predicate(self, predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym130$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 14730L)
    public static SubLObject sanity_checker_scratchpad_diagnose_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_scratchpad_method = (SubLObject)sanity_checker.NIL;
        final SubLObject checkers_pool = get_sanity_checker_scratchpad_checkers_pool(self);
        try {
            thread.throwStack.push(sanity_checker.$sym139$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
            try {
                SubLObject cdolist_list_var = checkers_pool;
                SubLObject checker = (SubLObject)sanity_checker.NIL;
                checker = cdolist_list_var.first();
                while (sanity_checker.NIL != cdolist_list_var) {
                    methods.funcall_instance_method_with_0_args(checker, (SubLObject)sanity_checker.$sym140$COMPUTE_RANGE);
                    methods.funcall_instance_method_with_0_args(checker, (SubLObject)sanity_checker.$sym42$DIAGNOSE);
                    cdolist_list_var = cdolist_list_var.rest();
                    checker = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym139$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_scratchpad_checkers_pool(self, checkers_pool);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_scratchpad_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym139$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_scratchpad_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15072L)
    public static SubLObject set_scalar_checker_backchain_parameter(final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sanity_checker.NIL != Types.integerp(number) : number;
        if (!sanity_checker.ZERO_INTEGER.numG(number)) {
            sanity_checker.$scalar_checker_backchain$.setDynamicValue(number, thread);
        }
        return sanity_checker.$scalar_checker_backchain$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject get_scalar_checker_arg2range(final SubLObject scalar_checker) {
        return classes.subloop_get_access_protected_instance_slot(scalar_checker, (SubLObject)sanity_checker.SEVEN_INTEGER, (SubLObject)sanity_checker.$sym144$ARG2RANGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject set_scalar_checker_arg2range(final SubLObject scalar_checker, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(scalar_checker, value, (SubLObject)sanity_checker.SEVEN_INTEGER, (SubLObject)sanity_checker.$sym144$ARG2RANGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject get_scalar_checker_arg2(final SubLObject scalar_checker) {
        return classes.subloop_get_instance_slot(scalar_checker, (SubLObject)sanity_checker.SIX_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject set_scalar_checker_arg2(final SubLObject scalar_checker, final SubLObject value) {
        return classes.subloop_set_instance_slot(scalar_checker, value, (SubLObject)sanity_checker.SIX_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject get_scalar_checker_arg1(final SubLObject scalar_checker) {
        return classes.subloop_get_instance_slot(scalar_checker, (SubLObject)sanity_checker.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject set_scalar_checker_arg1(final SubLObject scalar_checker, final SubLObject value) {
        return classes.subloop_set_instance_slot(scalar_checker, value, (SubLObject)sanity_checker.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject get_scalar_checker_backchain(final SubLObject scalar_checker) {
        return classes.subloop_get_instance_slot(scalar_checker, (SubLObject)sanity_checker.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject set_scalar_checker_backchain(final SubLObject scalar_checker, final SubLObject value) {
        return classes.subloop_set_instance_slot(scalar_checker, value, (SubLObject)sanity_checker.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject get_scalar_checker_diagnosis(final SubLObject scalar_checker) {
        return classes.subloop_get_instance_slot(scalar_checker, (SubLObject)sanity_checker.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject set_scalar_checker_diagnosis(final SubLObject scalar_checker, final SubLObject value) {
        return classes.subloop_set_instance_slot(scalar_checker, value, (SubLObject)sanity_checker.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject get_scalar_checker_predicate(final SubLObject scalar_checker) {
        return classes.subloop_get_instance_slot(scalar_checker, (SubLObject)sanity_checker.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject set_scalar_checker_predicate(final SubLObject scalar_checker, final SubLObject value) {
        return classes.subloop_set_instance_slot(scalar_checker, value, (SubLObject)sanity_checker.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject get_scalar_checker_fudge_factor(final SubLObject scalar_checker) {
        return classes.subloop_get_instance_slot(scalar_checker, (SubLObject)sanity_checker.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject set_scalar_checker_fudge_factor(final SubLObject scalar_checker, final SubLObject value) {
        return classes.subloop_set_instance_slot(scalar_checker, value, (SubLObject)sanity_checker.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject subloop_reserved_initialize_scalar_checker_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym13$INSTANCE_COUNT, (SubLObject)sanity_checker.ZERO_INTEGER);
        return (SubLObject)sanity_checker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject subloop_reserved_initialize_scalar_checker_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym15$ISOLATED_P, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym16$INSTANCE_NUMBER, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$sym17$FUDGE_FACTOR, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$sym74$PREDICATE, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$sym81$DIAGNOSIS, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$sym146$BACKCHAIN, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$sym134$ARG1, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$sym135$ARG2, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$sym144$ARG2RANGE, (SubLObject)sanity_checker.NIL);
        return (SubLObject)sanity_checker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15270L)
    public static SubLObject scalar_checker_p(final SubLObject scalar_checker) {
        return classes.subloop_instanceof_class(scalar_checker, (SubLObject)sanity_checker.$sym133$SCALAR_CHECKER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15635L)
    public static SubLObject scalar_checker_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_checker_method = (SubLObject)sanity_checker.NIL;
        SubLObject backchain = get_scalar_checker_backchain(self);
        try {
            thread.throwStack.push(sanity_checker.$sym149$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD);
            try {
                object.object_initialize_method(self);
                backchain = sanity_checker.$scalar_checker_backchain$.getDynamicValue(thread);
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym149$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_checker_backchain(self, backchain);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_checker_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym149$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_checker_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 15781L)
    public static SubLObject scalar_checker_compute_range_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_checker_method = (SubLObject)sanity_checker.NIL;
        SubLObject arg2range = get_scalar_checker_arg2range(self);
        final SubLObject arg1 = get_scalar_checker_arg1(self);
        final SubLObject backchain = get_scalar_checker_backchain(self);
        final SubLObject predicate = get_scalar_checker_predicate(self);
        final SubLObject fudge_factor = get_scalar_checker_fudge_factor(self);
        try {
            thread.throwStack.push(sanity_checker.$sym152$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD);
            try {
                final SubLObject arg2 = typeshift_argument(arg1);
                final SubLObject query = (SubLObject)ConsesLow.listS(predicate, arg2, (SubLObject)sanity_checker.$list153);
                SubLObject to_merge;
                final SubLObject answers = to_merge = ask_utilities.ask_template((SubLObject)sanity_checker.$sym154$_RANGE, query, sanity_checker.$const120$EverythingPSC, backchain, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED);
                SubLObject range = (SubLObject)sanity_checker.NIL;
                if (sanity_checker.NIL == range) {
                    SubLObject csome_list_var = answers;
                    SubLObject v_answer = (SubLObject)sanity_checker.NIL;
                    v_answer = csome_list_var.first();
                    while (sanity_checker.NIL == range && sanity_checker.NIL != csome_list_var) {
                        final SubLObject candidate_range = object.new_class_instance((SubLObject)sanity_checker.$sym155$SCALAR_RANGE);
                        methods.funcall_instance_method_with_1_args(candidate_range, (SubLObject)sanity_checker.$sym156$FILL, v_answer);
                        to_merge = to_merge.rest();
                        if (sanity_checker.NIL == methods.funcall_instance_method_with_0_args(candidate_range, (SubLObject)sanity_checker.$sym157$EMPTY_P)) {
                            range = candidate_range;
                        }
                        csome_list_var = csome_list_var.rest();
                        v_answer = csome_list_var.first();
                    }
                }
                SubLObject cdolist_list_var = to_merge;
                SubLObject v_answer = (SubLObject)sanity_checker.NIL;
                v_answer = cdolist_list_var.first();
                while (sanity_checker.NIL != cdolist_list_var) {
                    if (sanity_checker.NIL != range) {
                        final SubLObject new_range = object.new_class_instance((SubLObject)sanity_checker.$sym155$SCALAR_RANGE);
                        methods.funcall_instance_method_with_1_args(new_range, (SubLObject)sanity_checker.$sym156$FILL, v_answer);
                        if (sanity_checker.NIL == methods.funcall_instance_method_with_0_args(new_range, (SubLObject)sanity_checker.$sym157$EMPTY_P)) {
                            range = methods.funcall_instance_method_with_1_args(range, (SubLObject)sanity_checker.$sym158$MERGE, new_range);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                }
                if (sanity_checker.NIL != range) {
                    methods.funcall_instance_method_with_1_args(range, (SubLObject)sanity_checker.$sym159$FUDGE, fudge_factor);
                    arg2range = range;
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym152$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_checker_arg2range(self, arg2range);
                    set_scalar_checker_arg1(self, arg1);
                    set_scalar_checker_backchain(self, backchain);
                    set_scalar_checker_predicate(self, predicate);
                    set_scalar_checker_fudge_factor(self, fudge_factor);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_checker_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym152$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_checker_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 16598L)
    public static SubLObject typeshift_argument(final SubLObject arg) {
        if (sanity_checker.NIL != isa.isa_in_any_mtP(arg, sanity_checker.$const161$Collection)) {
            return (SubLObject)ConsesLow.list(sanity_checker.$const162$SomeFn, arg);
        }
        return arg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 16735L)
    public static SubLObject scalar_checker_diagnose_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_checker_method = (SubLObject)sanity_checker.NIL;
        final SubLObject arg2range = get_scalar_checker_arg2range(self);
        final SubLObject arg2 = get_scalar_checker_arg2(self);
        final SubLObject arg3 = get_scalar_checker_arg1(self);
        SubLObject diagnosis = get_scalar_checker_diagnosis(self);
        final SubLObject predicate = get_scalar_checker_predicate(self);
        try {
            thread.throwStack.push(sanity_checker.$sym164$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD);
            try {
                final SubLObject diagn = object.new_class_instance((SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS);
                final SubLObject cast = heuristically_cast_unity(predicate, arg2);
                final SubLObject arg2min = (SubLObject)((sanity_checker.NIL != arg2range) ? methods.funcall_instance_method_with_0_args(arg2range, (SubLObject)sanity_checker.$sym165$GET_MIN) : sanity_checker.NIL);
                final SubLObject arg2max = (SubLObject)((sanity_checker.NIL != arg2range) ? methods.funcall_instance_method_with_0_args(arg2range, (SubLObject)sanity_checker.$sym166$GET_MAX) : sanity_checker.NIL);
                final SubLObject range = (SubLObject)((sanity_checker.NIL != arg2range) ? methods.funcall_instance_method_with_0_args(arg2range, (SubLObject)sanity_checker.$sym167$LISTIFY) : sanity_checker.NIL);
                SubLObject cycl_explanation = (SubLObject)sanity_checker.NIL;
                instances.set_slot(diagn, (SubLObject)sanity_checker.$sym74$PREDICATE, predicate);
                instances.set_slot(diagn, (SubLObject)sanity_checker.$sym168$PROPOSED_ARG, arg3);
                instances.set_slot(diagn, (SubLObject)sanity_checker.$sym8$PROPOSED_VALUE, arg2);
                if (sanity_checker.NIL != arg2min && sanity_checker.NIL != arg2max) {
                    final SubLObject negative_test_min = (SubLObject)ConsesLow.list(sanity_checker.$const169$lessThan, cast, arg2min);
                    final SubLObject negative_test_max = (SubLObject)ConsesLow.list(sanity_checker.$const170$greaterThan, cast, arg2max);
                    final SubLObject positive_test = (SubLObject)ConsesLow.list(sanity_checker.$const171$quantitySubsumes, range, cast);
                    if (sanity_checker.NIL != inference_kernel.new_cyc_query(negative_test_min, sanity_checker.$const120$EverythingPSC, (SubLObject)sanity_checker.UNPROVIDED)) {
                        instances.set_slot(diagn, (SubLObject)sanity_checker.$sym172$COMPLETE, (SubLObject)sanity_checker.ONE_INTEGER);
                        instances.set_slot(diagn, (SubLObject)sanity_checker.$sym173$ANSWER_KNOWN, (SubLObject)sanity_checker.ONE_INTEGER);
                        instances.set_slot(diagn, (SubLObject)sanity_checker.$sym76$ANSWER, (SubLObject)sanity_checker.ZERO_INTEGER);
                        cycl_explanation = (SubLObject)ConsesLow.list(sanity_checker.$const174$and, (SubLObject)ConsesLow.list(predicate, arg3, range), negative_test_min);
                    }
                    else if (sanity_checker.NIL != inference_kernel.new_cyc_query(negative_test_max, sanity_checker.$const120$EverythingPSC, (SubLObject)sanity_checker.UNPROVIDED)) {
                        instances.set_slot(diagn, (SubLObject)sanity_checker.$sym172$COMPLETE, (SubLObject)sanity_checker.ONE_INTEGER);
                        instances.set_slot(diagn, (SubLObject)sanity_checker.$sym173$ANSWER_KNOWN, (SubLObject)sanity_checker.ONE_INTEGER);
                        instances.set_slot(diagn, (SubLObject)sanity_checker.$sym76$ANSWER, (SubLObject)sanity_checker.ZERO_INTEGER);
                        cycl_explanation = (SubLObject)ConsesLow.list(sanity_checker.$const174$and, (SubLObject)ConsesLow.list(predicate, arg3, range), negative_test_max);
                    }
                    else if (sanity_checker.NIL != inference_kernel.new_cyc_query(positive_test, sanity_checker.$const120$EverythingPSC, (SubLObject)sanity_checker.UNPROVIDED)) {
                        instances.set_slot(diagn, (SubLObject)sanity_checker.$sym172$COMPLETE, (SubLObject)sanity_checker.ONE_INTEGER);
                        instances.set_slot(diagn, (SubLObject)sanity_checker.$sym173$ANSWER_KNOWN, (SubLObject)sanity_checker.ONE_INTEGER);
                        instances.set_slot(diagn, (SubLObject)sanity_checker.$sym76$ANSWER, (SubLObject)sanity_checker.ONE_INTEGER);
                        cycl_explanation = (SubLObject)ConsesLow.list(sanity_checker.$const174$and, (SubLObject)ConsesLow.list(predicate, arg3, range), positive_test);
                    }
                    instances.set_slot(diagn, (SubLObject)sanity_checker.$sym175$JUSTIFICATION, pph_main.generate_phrase(cycl_explanation, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED));
                }
                else {
                    instances.set_slot(diagn, (SubLObject)sanity_checker.$sym172$COMPLETE, (SubLObject)sanity_checker.ONE_INTEGER);
                    instances.set_slot(diagn, (SubLObject)sanity_checker.$sym173$ANSWER_KNOWN, (SubLObject)sanity_checker.ZERO_INTEGER);
                    instances.set_slot(diagn, (SubLObject)sanity_checker.$sym76$ANSWER, (SubLObject)sanity_checker.ZERO_INTEGER);
                    instances.set_slot(diagn, (SubLObject)sanity_checker.$sym175$JUSTIFICATION, (SubLObject)sanity_checker.$str176$No_information_available);
                }
                diagnosis = diagn;
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym164$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_checker_arg2range(self, arg2range);
                    set_scalar_checker_arg2(self, arg2);
                    set_scalar_checker_arg1(self, arg3);
                    set_scalar_checker_diagnosis(self, diagnosis);
                    set_scalar_checker_predicate(self, predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_checker_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym164$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_checker_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject get_sanity_checker_diagnosis_predicate(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, (SubLObject)sanity_checker.EIGHT_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject set_sanity_checker_diagnosis_predicate(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, (SubLObject)sanity_checker.EIGHT_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject get_sanity_checker_diagnosis_proposed_arg(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, (SubLObject)sanity_checker.SEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject set_sanity_checker_diagnosis_proposed_arg(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, (SubLObject)sanity_checker.SEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject get_sanity_checker_diagnosis_proposed_value(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, (SubLObject)sanity_checker.SIX_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject set_sanity_checker_diagnosis_proposed_value(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, (SubLObject)sanity_checker.SIX_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject get_sanity_checker_diagnosis_justification(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, (SubLObject)sanity_checker.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject set_sanity_checker_diagnosis_justification(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, (SubLObject)sanity_checker.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject get_sanity_checker_diagnosis_answer(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, (SubLObject)sanity_checker.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject set_sanity_checker_diagnosis_answer(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, (SubLObject)sanity_checker.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject get_sanity_checker_diagnosis_answer_known(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, (SubLObject)sanity_checker.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject set_sanity_checker_diagnosis_answer_known(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, (SubLObject)sanity_checker.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject get_sanity_checker_diagnosis_complete(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, (SubLObject)sanity_checker.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject set_sanity_checker_diagnosis_complete(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, (SubLObject)sanity_checker.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject get_sanity_checker_diagnosis_failure_code(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_get_instance_slot(sanity_checker_diagnosis, (SubLObject)sanity_checker.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject set_sanity_checker_diagnosis_failure_code(final SubLObject sanity_checker_diagnosis, final SubLObject value) {
        return classes.subloop_set_instance_slot(sanity_checker_diagnosis, value, (SubLObject)sanity_checker.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject subloop_reserved_initialize_sanity_checker_diagnosis_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym13$INSTANCE_COUNT, (SubLObject)sanity_checker.ZERO_INTEGER);
        return (SubLObject)sanity_checker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject subloop_reserved_initialize_sanity_checker_diagnosis_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym15$ISOLATED_P, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym16$INSTANCE_NUMBER, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$sym126$FAILURE_CODE, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$sym172$COMPLETE, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$sym173$ANSWER_KNOWN, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$sym76$ANSWER, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$sym175$JUSTIFICATION, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$sym8$PROPOSED_VALUE, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$sym168$PROPOSED_ARG, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$sym74$PREDICATE, (SubLObject)sanity_checker.NIL);
        return (SubLObject)sanity_checker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 18500L)
    public static SubLObject sanity_checker_diagnosis_p(final SubLObject sanity_checker_diagnosis) {
        return classes.subloop_instanceof_class(sanity_checker_diagnosis, (SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19191L)
    public static SubLObject sanity_checker_diagnosis_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_diagnosis_method = (SubLObject)sanity_checker.NIL;
        SubLObject failure_code = get_sanity_checker_diagnosis_failure_code(self);
        try {
            thread.throwStack.push(sanity_checker.$sym182$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD);
            try {
                object.object_initialize_method(self);
                failure_code = (SubLObject)sanity_checker.ZERO_INTEGER;
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym182$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_diagnosis_failure_code(self, failure_code);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_diagnosis_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym182$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_diagnosis_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19325L)
    public static SubLObject sanity_checker_diagnosis_boolean_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sanity_checker_diagnosis_method = (SubLObject)sanity_checker.NIL;
        final SubLObject v_answer = get_sanity_checker_diagnosis_answer(self);
        try {
            thread.throwStack.push(sanity_checker.$sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD);
            try {
                if (!v_answer.isInteger()) {
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD, (SubLObject)sanity_checker.NIL);
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD, Numbers.numG(v_answer, (SubLObject)sanity_checker.ZERO_INTEGER));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_sanity_checker_diagnosis_answer(self, v_answer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sanity_checker_diagnosis_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sanity_checker_diagnosis_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
    public static SubLObject get_scalar_range_point_info(final SubLObject scalar_range) {
        return classes.subloop_get_access_protected_instance_slot(scalar_range, (SubLObject)sanity_checker.FOUR_INTEGER, (SubLObject)sanity_checker.$sym188$POINT_INFO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
    public static SubLObject set_scalar_range_point_info(final SubLObject scalar_range, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(scalar_range, value, (SubLObject)sanity_checker.FOUR_INTEGER, (SubLObject)sanity_checker.$sym188$POINT_INFO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
    public static SubLObject get_scalar_range_max(final SubLObject scalar_range) {
        return classes.subloop_get_access_protected_instance_slot(scalar_range, (SubLObject)sanity_checker.THREE_INTEGER, (SubLObject)sanity_checker.$sym189$MAX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
    public static SubLObject set_scalar_range_max(final SubLObject scalar_range, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(scalar_range, value, (SubLObject)sanity_checker.THREE_INTEGER, (SubLObject)sanity_checker.$sym189$MAX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
    public static SubLObject get_scalar_range_min(final SubLObject scalar_range) {
        return classes.subloop_get_access_protected_instance_slot(scalar_range, (SubLObject)sanity_checker.TWO_INTEGER, (SubLObject)sanity_checker.$sym190$MIN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
    public static SubLObject set_scalar_range_min(final SubLObject scalar_range, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(scalar_range, value, (SubLObject)sanity_checker.TWO_INTEGER, (SubLObject)sanity_checker.$sym190$MIN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
    public static SubLObject get_scalar_range_unit(final SubLObject scalar_range) {
        return classes.subloop_get_access_protected_instance_slot(scalar_range, (SubLObject)sanity_checker.ONE_INTEGER, (SubLObject)sanity_checker.$sym191$UNIT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
    public static SubLObject set_scalar_range_unit(final SubLObject scalar_range, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(scalar_range, value, (SubLObject)sanity_checker.ONE_INTEGER, (SubLObject)sanity_checker.$sym191$UNIT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
    public static SubLObject subloop_reserved_initialize_scalar_range_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym13$INSTANCE_COUNT, (SubLObject)sanity_checker.ZERO_INTEGER);
        return (SubLObject)sanity_checker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
    public static SubLObject subloop_reserved_initialize_scalar_range_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym15$ISOLATED_P, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.$sym16$INSTANCE_NUMBER, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym191$UNIT, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym190$MIN, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym189$MAX, (SubLObject)sanity_checker.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym188$POINT_INFO, (SubLObject)sanity_checker.NIL);
        return (SubLObject)sanity_checker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 19551L)
    public static SubLObject scalar_range_p(final SubLObject scalar_range) {
        return classes.subloop_instanceof_class(scalar_range, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 20741L)
    public static SubLObject scalar_range_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        final SubLObject point_info = get_scalar_range_point_info(self);
        final SubLObject max = get_scalar_range_max(self);
        final SubLObject min = get_scalar_range_min(self);
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push(sanity_checker.$sym197$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                print_high.princ((SubLObject)ConsesLow.list(unit, min, max, point_info), stream);
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym197$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_point_info(self, point_info);
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym197$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 20939L)
    public static SubLObject scalar_range_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        SubLObject max = get_scalar_range_max(self);
        SubLObject min = get_scalar_range_min(self);
        SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push(sanity_checker.$sym200$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                object.object_initialize_method(self);
                unit = sanity_checker.$const114$Unity;
                min = (SubLObject)sanity_checker.ZERO_INTEGER;
                max = (SubLObject)sanity_checker.ZERO_INTEGER;
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym200$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym200$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 21091L)
    public static SubLObject scalar_range_empty_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        final SubLObject max = get_scalar_range_max(self);
        final SubLObject min = get_scalar_range_min(self);
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push(sanity_checker.$sym203$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym203$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(unit.eql(sanity_checker.$const114$Unity) && min.numE((SubLObject)sanity_checker.ZERO_INTEGER) && max.numE((SubLObject)sanity_checker.ZERO_INTEGER)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym203$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 21202L)
    public static SubLObject scalar_range_fill_method(final SubLObject self, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        SubLObject point_info = get_scalar_range_point_info(self);
        SubLObject max = get_scalar_range_max(self);
        SubLObject min = get_scalar_range_min(self);
        SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push(sanity_checker.$sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                if (sanity_checker.NIL == inference_kernel.new_cyc_query((SubLObject)ConsesLow.listS(sanity_checker.$const208$isa, value, (SubLObject)sanity_checker.$list209), sanity_checker.$const210$BaseKB, (SubLObject)sanity_checker.UNPROVIDED)) {
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self);
                }
                if (value.isNumber()) {
                    min = value;
                    max = value;
                    point_info = (SubLObject)sanity_checker.T;
                }
                else if (value.isCons()) {
                    final SubLObject value_unit = value.first();
                    final SubLObject value_min = conses_high.second(value);
                    final SubLObject value_max = conses_high.third(value);
                    SubLObject new_unit = (SubLObject)sanity_checker.NIL;
                    SubLObject new_min = (SubLObject)sanity_checker.NIL;
                    SubLObject new_max = (SubLObject)sanity_checker.NIL;
                    if (sanity_checker.NIL != isa.isaP(value_unit, sanity_checker.$const211$UnitOfMeasure, (SubLObject)sanity_checker.UNPROVIDED, (SubLObject)sanity_checker.UNPROVIDED)) {
                        new_unit = value_unit;
                    }
                    if (value_min.isNumber()) {
                        new_min = value_min;
                    }
                    if (value_max.isNumber()) {
                        new_max = value_max;
                    }
                    else {
                        new_max = new_min;
                    }
                    if (sanity_checker.NIL != new_unit && sanity_checker.NIL != new_min && sanity_checker.NIL != new_max) {
                        unit = new_unit;
                        min = new_min;
                        max = new_max;
                    }
                    if (new_min.eql(new_max)) {
                        point_info = (SubLObject)sanity_checker.T;
                    }
                }
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_point_info(self, point_info);
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 21997L)
    public static SubLObject scalar_range_get_unit_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push(sanity_checker.$sym215$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym215$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, unit);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_unit(self, unit);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym215$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 22068L)
    public static SubLObject scalar_range_get_min_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        final SubLObject min = get_scalar_range_min(self);
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push(sanity_checker.$sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                if (sanity_checker.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)sanity_checker.$sym157$EMPTY_P)) {
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, (SubLObject)sanity_checker.NIL);
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, (SubLObject)ConsesLow.list(unit, min));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 22199L)
    public static SubLObject scalar_range_get_min_value_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        final SubLObject min = get_scalar_range_min(self);
        try {
            thread.throwStack.push(sanity_checker.$sym222$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym222$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, min);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_min(self, min);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym222$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 22274L)
    public static SubLObject scalar_range_get_max_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        final SubLObject max = get_scalar_range_max(self);
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push(sanity_checker.$sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                if (sanity_checker.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)sanity_checker.$sym157$EMPTY_P)) {
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, (SubLObject)sanity_checker.NIL);
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, (SubLObject)ConsesLow.list(unit, max));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_max(self, max);
                    set_scalar_range_unit(self, unit);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 22405L)
    public static SubLObject scalar_range_get_max_value_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        final SubLObject max = get_scalar_range_max(self);
        try {
            thread.throwStack.push(sanity_checker.$sym229$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym229$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, max);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_max(self, max);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym229$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 22480L)
    public static SubLObject scalar_range_listify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        final SubLObject max = get_scalar_range_max(self);
        final SubLObject min = get_scalar_range_min(self);
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push(sanity_checker.$sym232$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym232$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, (SubLObject)ConsesLow.list(unit, min, max));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym232$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 22566L)
    public static SubLObject scalar_range_fudge_method(final SubLObject self, final SubLObject fudge_factor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        SubLObject max = get_scalar_range_max(self);
        SubLObject min = get_scalar_range_min(self);
        try {
            thread.throwStack.push(sanity_checker.$sym235$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                assert sanity_checker.NIL != Types.numberp(fudge_factor) : fudge_factor;
                min = Numbers.subtract(min, Numbers.multiply(min, fudge_factor));
                max = Numbers.add(max, Numbers.multiply(max, fudge_factor));
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym235$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym235$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 22768L)
    public static SubLObject scalar_range_convertible_p_method(final SubLObject self, final SubLObject other_range) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push(sanity_checker.$sym240$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                assert sanity_checker.NIL != scalar_range_p(other_range) : other_range;
                final SubLObject other_unit = methods.funcall_instance_method_with_0_args(other_range, (SubLObject)sanity_checker.$sym213$GET_UNIT);
                final SubLObject query = (SubLObject)ConsesLow.listS(sanity_checker.$const174$and, (SubLObject)ConsesLow.listS(sanity_checker.$const208$isa, unit, (SubLObject)sanity_checker.$list242), (SubLObject)ConsesLow.listS(sanity_checker.$const208$isa, other_unit, (SubLObject)sanity_checker.$list242), (SubLObject)sanity_checker.$list243);
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym240$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, inference_kernel.new_cyc_query(query, sanity_checker.$const120$EverythingPSC, (SubLObject)sanity_checker.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_unit(self, unit);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym240$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 23090L)
    public static SubLObject scalar_range_merge_method(final SubLObject self, final SubLObject other_range) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        final SubLObject point_info = get_scalar_range_point_info(self);
        try {
            thread.throwStack.push(sanity_checker.$sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                if (sanity_checker.NIL == methods.funcall_instance_method_with_1_args(self, (SubLObject)sanity_checker.$sym237$CONVERTIBLE_P, other_range)) {
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, (SubLObject)sanity_checker.NIL);
                }
                final SubLObject other_point = instances.get_slot(other_range, (SubLObject)sanity_checker.$sym188$POINT_INFO);
                if (sanity_checker.NIL != point_info && sanity_checker.NIL != other_point) {
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, methods.funcall_instance_method_with_1_args(self, (SubLObject)sanity_checker.$sym247$MERGE_LOOSE, other_range));
                }
                else if (sanity_checker.NIL != point_info) {
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, self);
                }
                else if (sanity_checker.NIL != other_point) {
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, other_range);
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, methods.funcall_instance_method_with_1_args(self, (SubLObject)sanity_checker.$sym248$MERGE_STRICT, other_range));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_point_info(self, point_info);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 23779L)
    public static SubLObject scalar_range_merge_loose_method(final SubLObject self, final SubLObject other_range) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        final SubLObject max = get_scalar_range_max(self);
        final SubLObject min = get_scalar_range_min(self);
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push(sanity_checker.$sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                if (sanity_checker.NIL == methods.funcall_instance_method_with_1_args(self, (SubLObject)sanity_checker.$sym237$CONVERTIBLE_P, other_range)) {
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, (SubLObject)sanity_checker.NIL);
                }
                final SubLObject merged = object.new_class_instance((SubLObject)sanity_checker.$sym155$SCALAR_RANGE);
                final SubLObject this_min = methods.funcall_instance_method_with_0_args(self, (SubLObject)sanity_checker.$sym165$GET_MIN);
                final SubLObject other_min = methods.funcall_instance_method_with_0_args(other_range, (SubLObject)sanity_checker.$sym165$GET_MIN);
                final SubLObject this_max = methods.funcall_instance_method_with_0_args(self, (SubLObject)sanity_checker.$sym166$GET_MAX);
                final SubLObject other_max = methods.funcall_instance_method_with_0_args(other_range, (SubLObject)sanity_checker.$sym166$GET_MAX);
                final SubLObject min_test = inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(sanity_checker.$const252$lessThanOrEqualTo, this_min, other_min), sanity_checker.$const120$EverythingPSC, (SubLObject)sanity_checker.UNPROVIDED);
                final SubLObject max_test = inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(sanity_checker.$const252$lessThanOrEqualTo, other_max, this_max), sanity_checker.$const120$EverythingPSC, (SubLObject)sanity_checker.UNPROVIDED);
                final SubLObject other_unit = methods.funcall_instance_method_with_0_args(other_range, (SubLObject)sanity_checker.$sym213$GET_UNIT);
                final SubLObject new_min = (sanity_checker.NIL != min_test) ? min : quantities.convert_to_units(unit, other_unit, methods.funcall_instance_method_with_0_args(other_range, (SubLObject)sanity_checker.$sym220$GET_MIN_VALUE), (SubLObject)sanity_checker.UNPROVIDED);
                final SubLObject new_max = (sanity_checker.NIL != max_test) ? max : quantities.convert_to_units(unit, other_unit, methods.funcall_instance_method_with_0_args(other_range, (SubLObject)sanity_checker.$sym227$GET_MAX_VALUE), (SubLObject)sanity_checker.UNPROVIDED);
                methods.funcall_instance_method_with_1_args(merged, (SubLObject)sanity_checker.$sym156$FILL, (SubLObject)ConsesLow.list(unit, new_min, new_max));
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, merged);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 24602L)
    public static SubLObject scalar_range_merge_strict_method(final SubLObject self, final SubLObject other_range) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scalar_range_method = (SubLObject)sanity_checker.NIL;
        final SubLObject max = get_scalar_range_max(self);
        final SubLObject min = get_scalar_range_min(self);
        final SubLObject unit = get_scalar_range_unit(self);
        try {
            thread.throwStack.push(sanity_checker.$sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
            try {
                if (sanity_checker.NIL == methods.funcall_instance_method_with_1_args(self, (SubLObject)sanity_checker.$sym237$CONVERTIBLE_P, other_range)) {
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, (SubLObject)sanity_checker.NIL);
                }
                final SubLObject this_min = methods.funcall_instance_method_with_0_args(self, (SubLObject)sanity_checker.$sym165$GET_MIN);
                final SubLObject other_min = methods.funcall_instance_method_with_0_args(other_range, (SubLObject)sanity_checker.$sym165$GET_MIN);
                final SubLObject this_max = methods.funcall_instance_method_with_0_args(self, (SubLObject)sanity_checker.$sym166$GET_MAX);
                final SubLObject other_max = methods.funcall_instance_method_with_0_args(other_range, (SubLObject)sanity_checker.$sym166$GET_MAX);
                if (sanity_checker.NIL != inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(sanity_checker.$const169$lessThan, this_max, other_min), sanity_checker.$const120$EverythingPSC, (SubLObject)sanity_checker.UNPROVIDED)) {
                    Errors.warn((SubLObject)sanity_checker.$str256$__Inconsistent_ranges___S__S, self, other_range);
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, (SubLObject)sanity_checker.NIL);
                }
                if (sanity_checker.NIL != inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(sanity_checker.$const169$lessThan, other_max, this_min), sanity_checker.$const120$EverythingPSC, (SubLObject)sanity_checker.UNPROVIDED)) {
                    Errors.warn((SubLObject)sanity_checker.$str256$__Inconsistent_ranges___S__S, self, other_range);
                    Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, (SubLObject)sanity_checker.NIL);
                }
                final SubLObject other_unit = methods.funcall_instance_method_with_0_args(other_range, (SubLObject)sanity_checker.$sym213$GET_UNIT);
                final SubLObject new_max = (sanity_checker.NIL != inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(sanity_checker.$const169$lessThan, other_max, this_max), sanity_checker.$const120$EverythingPSC, (SubLObject)sanity_checker.UNPROVIDED)) ? quantities.convert_to_units(unit, other_unit, methods.funcall_instance_method_with_0_args(other_range, (SubLObject)sanity_checker.$sym227$GET_MAX_VALUE), (SubLObject)sanity_checker.UNPROVIDED) : max;
                final SubLObject new_min = (sanity_checker.NIL != inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(sanity_checker.$const169$lessThan, other_min, this_min), sanity_checker.$const120$EverythingPSC, (SubLObject)sanity_checker.UNPROVIDED)) ? min : quantities.convert_to_units(unit, other_unit, methods.funcall_instance_method_with_0_args(other_range, (SubLObject)sanity_checker.$sym220$GET_MIN_VALUE), (SubLObject)sanity_checker.UNPROVIDED);
                final SubLObject merged = object.new_class_instance((SubLObject)sanity_checker.$sym155$SCALAR_RANGE);
                methods.funcall_instance_method_with_1_args(merged, (SubLObject)sanity_checker.$sym156$FILL, (SubLObject)ConsesLow.list(unit, new_min, new_max));
                Dynamic.sublisp_throw((SubLObject)sanity_checker.$sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD, merged);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sanity_checker.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_scalar_range_max(self, max);
                    set_scalar_range_min(self, min);
                    set_scalar_range_unit(self, unit);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_scalar_range_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)sanity_checker.$sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scalar_range_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 25708L)
    public static SubLObject heuristically_cast_unity(final SubLObject predicate, final SubLObject unity_term) {
        if (predicate.eql(sanity_checker.$const258$age)) {
            return cast_age(unity_term);
        }
        if (predicate.eql(sanity_checker.$const259$numberOfInhabitants)) {
            return cast_population(unity_term);
        }
        return unity_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 26100L)
    public static SubLObject cast_age(final SubLObject unity_term) {
        if (!unity_term.isCons()) {
            return unity_term;
        }
        final SubLObject old_unit = unity_term.first();
        final SubLObject old_min = conses_high.second(unity_term);
        final SubLObject old_max = conses_high.third(unity_term);
        if (!sanity_checker.$const114$Unity.eql(old_unit)) {
            return unity_term;
        }
        if (sanity_checker.NIL != old_max) {
            return (SubLObject)ConsesLow.list(sanity_checker.$const260$YearsDuration, old_min, old_max);
        }
        return (SubLObject)ConsesLow.list(sanity_checker.$const260$YearsDuration, old_min);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/sanity-checker.lisp", position = 26450L)
    public static SubLObject cast_population(final SubLObject unity_term) {
        if (!unity_term.isCons()) {
            return unity_term;
        }
        if (sanity_checker.$const114$Unity.eql(unity_term.first())) {
            return conses_high.second(unity_term);
        }
        final SubLObject quant = conses_high.second(unity_term);
        final SubLObject quant_fn = (SubLObject)(quant.isCons() ? quant.first() : sanity_checker.NIL);
        final SubLObject quant_head = (SubLObject)(quant.isCons() ? conses_high.second(quant) : sanity_checker.NIL);
        final SubLObject head = conses_high.third(unity_term);
        final SubLObject head_head = (SubLObject)(head.isCons() ? conses_high.third(head) : sanity_checker.NIL);
        if (!sanity_checker.$const261$NumericalQuant_NLAttrFn.eql(quant_fn)) {
            return unity_term;
        }
        if (sanity_checker.NIL == term.el_fort_p(head_head)) {
            return unity_term;
        }
        if (sanity_checker.NIL == genls.genl_in_any_mtP(head_head, sanity_checker.$const262$HomoSapiens)) {
            return unity_term;
        }
        return quant_head;
    }
    
    public static SubLObject declare_sanity_checker_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker", "GET-SANITY-CHECKER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_piquant_sanity_checker", "GET-PIQUANT-SANITY-CHECKER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_check", "SANITY-CHECK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "cyc_sanity_check", "CYC-SANITY-CHECK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "cyc_sanity_filter", "CYC-SANITY-FILTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_show_debug_info", "GET-SANITY-CHECKER-SHOW-DEBUG-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_show_debug_info", "SET-SANITY-CHECKER-SHOW-DEBUG-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_fudge_factor", "GET-SANITY-CHECKER-FUDGE-FACTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_fudge_factor", "SET-SANITY-CHECKER-FUDGE-FACTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_scratchpad", "GET-SANITY-CHECKER-SCRATCHPAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_scratchpad", "SET-SANITY-CHECKER-SCRATCHPAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_cache", "GET-SANITY-CHECKER-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_cache", "SET-SANITY-CHECKER-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "subloop_reserved_initialize_sanity_checker_class", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "subloop_reserved_initialize_sanity_checker_instance", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_p", "SANITY-CHECKER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_initialize_method", "SANITY-CHECKER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_show_debug_info_method", "SANITY-CHECKER-SHOW-DEBUG-INFO-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_hide_debug_info_method", "SANITY-CHECKER-HIDE-DEBUG-INFO-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_check_method", "SANITY-CHECKER-CHECK-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_check_cyc_interpretations_method", "SANITY-CHECKER-CHECK-CYC-INTERPRETATIONS-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_check_listified_method", "SANITY-CHECKER-CHECK-LISTIFIED-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "piquant_sanity_check", "PIQUANT-SANITY-CHECK", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "subloop_reserved_initialize_piquant_sanity_checker_class", "SUBLOOP-RESERVED-INITIALIZE-PIQUANT-SANITY-CHECKER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "subloop_reserved_initialize_piquant_sanity_checker_instance", "SUBLOOP-RESERVED-INITIALIZE-PIQUANT-SANITY-CHECKER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "piquant_sanity_checker_p", "PIQUANT-SANITY-CHECKER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "piquant_sanity_checker_check_method", "PIQUANT-SANITY-CHECKER-CHECK-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "piquant_sanity_checker_check_listified_method", "PIQUANT-SANITY-CHECKER-CHECK-LISTIFIED-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_scratchpad_degenerate_diagnosis", "GET-SANITY-CHECKER-SCRATCHPAD-DEGENERATE-DIAGNOSIS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_scratchpad_degenerate_diagnosis", "SET-SANITY-CHECKER-SCRATCHPAD-DEGENERATE-DIAGNOSIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_scratchpad_checkers_pool", "GET-SANITY-CHECKER-SCRATCHPAD-CHECKERS-POOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_scratchpad_checkers_pool", "SET-SANITY-CHECKER-SCRATCHPAD-CHECKERS-POOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_scratchpad_cyc_answers", "GET-SANITY-CHECKER-SCRATCHPAD-CYC-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_scratchpad_cyc_answers", "SET-SANITY-CHECKER-SCRATCHPAD-CYC-ANSWERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_scratchpad_answer", "GET-SANITY-CHECKER-SCRATCHPAD-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_scratchpad_answer", "SET-SANITY-CHECKER-SCRATCHPAD-ANSWER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_scratchpad_cyc_focuses", "GET-SANITY-CHECKER-SCRATCHPAD-CYC-FOCUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_scratchpad_cyc_focuses", "SET-SANITY-CHECKER-SCRATCHPAD-CYC-FOCUSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_scratchpad_focus", "GET-SANITY-CHECKER-SCRATCHPAD-FOCUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_scratchpad_focus", "SET-SANITY-CHECKER-SCRATCHPAD-FOCUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_scratchpad_predicate", "GET-SANITY-CHECKER-SCRATCHPAD-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_scratchpad_predicate", "SET-SANITY-CHECKER-SCRATCHPAD-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "subloop_reserved_initialize_sanity_checker_scratchpad_class", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-SCRATCHPAD-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "subloop_reserved_initialize_sanity_checker_scratchpad_instance", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-SCRATCHPAD-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_scratchpad_p", "SANITY-CHECKER-SCRATCHPAD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_scratchpad_output_diagnoses_method", "SANITY-CHECKER-SCRATCHPAD-OUTPUT-DIAGNOSES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_scratchpad_initialize_method", "SANITY-CHECKER-SCRATCHPAD-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_scratchpad_set_focus_method", "SANITY-CHECKER-SCRATCHPAD-SET-FOCUS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_scratchpad_set_piquant_focus_method", "SANITY-CHECKER-SCRATCHPAD-SET-PIQUANT-FOCUS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_scratchpad_set_predicate_method", "SANITY-CHECKER-SCRATCHPAD-SET-PREDICATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_scratchpad_set_piquant_predicate_method", "SANITY-CHECKER-SCRATCHPAD-SET-PIQUANT-PREDICATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_scratchpad_set_answer_method", "SANITY-CHECKER-SCRATCHPAD-SET-ANSWER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_scratchpad_set_cyc_answers_method", "SANITY-CHECKER-SCRATCHPAD-SET-CYC-ANSWERS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_scratchpad_compute_cyc_answers_method", "SANITY-CHECKER-SCRATCHPAD-COMPUTE-CYC-ANSWERS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_scratchpad_compute_degenerate_diagnosis_method", "SANITY-CHECKER-SCRATCHPAD-COMPUTE-DEGENERATE-DIAGNOSIS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_scratchpad_initialize_checkers_method", "SANITY-CHECKER-SCRATCHPAD-INITIALIZE-CHECKERS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_scratchpad_diagnose_method", "SANITY-CHECKER-SCRATCHPAD-DIAGNOSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_scalar_checker_backchain_parameter", "SET-SCALAR-CHECKER-BACKCHAIN-PARAMETER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_scalar_checker_arg2range", "GET-SCALAR-CHECKER-ARG2RANGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_scalar_checker_arg2range", "SET-SCALAR-CHECKER-ARG2RANGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_scalar_checker_arg2", "GET-SCALAR-CHECKER-ARG2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_scalar_checker_arg2", "SET-SCALAR-CHECKER-ARG2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_scalar_checker_arg1", "GET-SCALAR-CHECKER-ARG1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_scalar_checker_arg1", "SET-SCALAR-CHECKER-ARG1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_scalar_checker_backchain", "GET-SCALAR-CHECKER-BACKCHAIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_scalar_checker_backchain", "SET-SCALAR-CHECKER-BACKCHAIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_scalar_checker_diagnosis", "GET-SCALAR-CHECKER-DIAGNOSIS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_scalar_checker_diagnosis", "SET-SCALAR-CHECKER-DIAGNOSIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_scalar_checker_predicate", "GET-SCALAR-CHECKER-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_scalar_checker_predicate", "SET-SCALAR-CHECKER-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_scalar_checker_fudge_factor", "GET-SCALAR-CHECKER-FUDGE-FACTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_scalar_checker_fudge_factor", "SET-SCALAR-CHECKER-FUDGE-FACTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "subloop_reserved_initialize_scalar_checker_class", "SUBLOOP-RESERVED-INITIALIZE-SCALAR-CHECKER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "subloop_reserved_initialize_scalar_checker_instance", "SUBLOOP-RESERVED-INITIALIZE-SCALAR-CHECKER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_checker_p", "SCALAR-CHECKER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_checker_initialize_method", "SCALAR-CHECKER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_checker_compute_range_method", "SCALAR-CHECKER-COMPUTE-RANGE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "typeshift_argument", "TYPESHIFT-ARGUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_checker_diagnose_method", "SCALAR-CHECKER-DIAGNOSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_diagnosis_predicate", "GET-SANITY-CHECKER-DIAGNOSIS-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_diagnosis_predicate", "SET-SANITY-CHECKER-DIAGNOSIS-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_diagnosis_proposed_arg", "GET-SANITY-CHECKER-DIAGNOSIS-PROPOSED-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_diagnosis_proposed_arg", "SET-SANITY-CHECKER-DIAGNOSIS-PROPOSED-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_diagnosis_proposed_value", "GET-SANITY-CHECKER-DIAGNOSIS-PROPOSED-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_diagnosis_proposed_value", "SET-SANITY-CHECKER-DIAGNOSIS-PROPOSED-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_diagnosis_justification", "GET-SANITY-CHECKER-DIAGNOSIS-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_diagnosis_justification", "SET-SANITY-CHECKER-DIAGNOSIS-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_diagnosis_answer", "GET-SANITY-CHECKER-DIAGNOSIS-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_diagnosis_answer", "SET-SANITY-CHECKER-DIAGNOSIS-ANSWER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_diagnosis_answer_known", "GET-SANITY-CHECKER-DIAGNOSIS-ANSWER-KNOWN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_diagnosis_answer_known", "SET-SANITY-CHECKER-DIAGNOSIS-ANSWER-KNOWN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_diagnosis_complete", "GET-SANITY-CHECKER-DIAGNOSIS-COMPLETE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_diagnosis_complete", "SET-SANITY-CHECKER-DIAGNOSIS-COMPLETE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_sanity_checker_diagnosis_failure_code", "GET-SANITY-CHECKER-DIAGNOSIS-FAILURE-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_sanity_checker_diagnosis_failure_code", "SET-SANITY-CHECKER-DIAGNOSIS-FAILURE-CODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "subloop_reserved_initialize_sanity_checker_diagnosis_class", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-DIAGNOSIS-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "subloop_reserved_initialize_sanity_checker_diagnosis_instance", "SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-DIAGNOSIS-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_diagnosis_p", "SANITY-CHECKER-DIAGNOSIS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_diagnosis_initialize_method", "SANITY-CHECKER-DIAGNOSIS-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "sanity_checker_diagnosis_boolean_method", "SANITY-CHECKER-DIAGNOSIS-BOOLEAN-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_scalar_range_point_info", "GET-SCALAR-RANGE-POINT-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_scalar_range_point_info", "SET-SCALAR-RANGE-POINT-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_scalar_range_max", "GET-SCALAR-RANGE-MAX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_scalar_range_max", "SET-SCALAR-RANGE-MAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_scalar_range_min", "GET-SCALAR-RANGE-MIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_scalar_range_min", "SET-SCALAR-RANGE-MIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "get_scalar_range_unit", "GET-SCALAR-RANGE-UNIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "set_scalar_range_unit", "SET-SCALAR-RANGE-UNIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "subloop_reserved_initialize_scalar_range_class", "SUBLOOP-RESERVED-INITIALIZE-SCALAR-RANGE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "subloop_reserved_initialize_scalar_range_instance", "SUBLOOP-RESERVED-INITIALIZE-SCALAR-RANGE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_p", "SCALAR-RANGE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_print_method", "SCALAR-RANGE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_initialize_method", "SCALAR-RANGE-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_empty_p_method", "SCALAR-RANGE-EMPTY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_fill_method", "SCALAR-RANGE-FILL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_get_unit_method", "SCALAR-RANGE-GET-UNIT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_get_min_method", "SCALAR-RANGE-GET-MIN-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_get_min_value_method", "SCALAR-RANGE-GET-MIN-VALUE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_get_max_method", "SCALAR-RANGE-GET-MAX-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_get_max_value_method", "SCALAR-RANGE-GET-MAX-VALUE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_listify_method", "SCALAR-RANGE-LISTIFY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_fudge_method", "SCALAR-RANGE-FUDGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_convertible_p_method", "SCALAR-RANGE-CONVERTIBLE-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_merge_method", "SCALAR-RANGE-MERGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_merge_loose_method", "SCALAR-RANGE-MERGE-LOOSE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "scalar_range_merge_strict_method", "SCALAR-RANGE-MERGE-STRICT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "heuristically_cast_unity", "HEURISTICALLY-CAST-UNITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "cast_age", "CAST-AGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.sanity_checker", "cast_population", "CAST-POPULATION", 1, 0, false);
        return (SubLObject)sanity_checker.NIL;
    }
    
    public static SubLObject init_sanity_checker_file() {
        sanity_checker.$sanity_checker$ = SubLFiles.defvar("*SANITY-CHECKER*", (SubLObject)sanity_checker.NIL);
        sanity_checker.$piquant_sanity_checkers$ = SubLFiles.defvar("*PIQUANT-SANITY-CHECKERS*", Hashtables.make_hash_table((SubLObject)sanity_checker.EIGHT_INTEGER, Symbols.symbol_function((SubLObject)sanity_checker.EQUALP), (SubLObject)sanity_checker.UNPROVIDED));
        sanity_checker.$scalar_checker_backchain$ = SubLFiles.defvar("*SCALAR-CHECKER-BACKCHAIN*", (SubLObject)sanity_checker.ONE_INTEGER);
        return (SubLObject)sanity_checker.NIL;
    }
    
    public static SubLObject setup_sanity_checker_file() {
        classes.subloop_new_class((SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list10);
        classes.class_set_implements_slot_listeners((SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym14$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym18$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_INSTANCE);
        subloop_reserved_initialize_sanity_checker_class((SubLObject)sanity_checker.$sym0$SANITY_CHECKER);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym19$INITIALIZE, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$list20, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list21);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym19$INITIALIZE, (SubLObject)sanity_checker.$sym23$SANITY_CHECKER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym3$SHOW_DEBUG_INFO, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$list20, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list24);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym3$SHOW_DEBUG_INFO, (SubLObject)sanity_checker.$sym26$SANITY_CHECKER_SHOW_DEBUG_INFO_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym27$HIDE_DEBUG_INFO, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$list20, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list28);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym27$HIDE_DEBUG_INFO, (SubLObject)sanity_checker.$sym30$SANITY_CHECKER_HIDE_DEBUG_INFO_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym4$CHECK, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list32, (SubLObject)sanity_checker.$list33);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym4$CHECK, (SubLObject)sanity_checker.$sym46$SANITY_CHECKER_CHECK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym6$CHECK_CYC_INTERPRETATIONS, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list47, (SubLObject)sanity_checker.$list48);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym6$CHECK_CYC_INTERPRETATIONS, (SubLObject)sanity_checker.$sym52$SANITY_CHECKER_CHECK_CYC_INTERPRETATIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym53$CHECK_LISTIFIED, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list32, (SubLObject)sanity_checker.$list54);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.$sym53$CHECK_LISTIFIED, (SubLObject)sanity_checker.$sym58$SANITY_CHECKER_CHECK_LISTIFIED_METHOD);
        classes.subloop_new_class((SubLObject)sanity_checker.$sym2$PIQUANT_SANITY_CHECKER, (SubLObject)sanity_checker.$sym0$SANITY_CHECKER, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list60);
        classes.class_set_implements_slot_listeners((SubLObject)sanity_checker.$sym2$PIQUANT_SANITY_CHECKER, (SubLObject)sanity_checker.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)sanity_checker.$sym2$PIQUANT_SANITY_CHECKER, (SubLObject)sanity_checker.$sym61$SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)sanity_checker.$sym2$PIQUANT_SANITY_CHECKER, (SubLObject)sanity_checker.$sym62$SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_INSTANCE);
        subloop_reserved_initialize_piquant_sanity_checker_class((SubLObject)sanity_checker.$sym2$PIQUANT_SANITY_CHECKER);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym4$CHECK, (SubLObject)sanity_checker.$sym2$PIQUANT_SANITY_CHECKER, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list63, (SubLObject)sanity_checker.$list64);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym2$PIQUANT_SANITY_CHECKER, (SubLObject)sanity_checker.$sym4$CHECK, (SubLObject)sanity_checker.$sym67$PIQUANT_SANITY_CHECKER_CHECK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym53$CHECK_LISTIFIED, (SubLObject)sanity_checker.$sym2$PIQUANT_SANITY_CHECKER, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list63, (SubLObject)sanity_checker.$list68);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym2$PIQUANT_SANITY_CHECKER, (SubLObject)sanity_checker.$sym53$CHECK_LISTIFIED, (SubLObject)sanity_checker.$sym70$PIQUANT_SANITY_CHECKER_CHECK_LISTIFIED_METHOD);
        classes.subloop_new_class((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list71);
        classes.class_set_implements_slot_listeners((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym73$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym78$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_INSTANCE);
        subloop_reserved_initialize_sanity_checker_scratchpad_class((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym43$OUTPUT_DIAGNOSES, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list79);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym43$OUTPUT_DIAGNOSES, (SubLObject)sanity_checker.$sym82$SANITY_CHECKER_SCRATCHPAD_OUTPUT_DIAGNOSES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym19$INITIALIZE, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$list20, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list83);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym19$INITIALIZE, (SubLObject)sanity_checker.$sym84$SANITY_CHECKER_SCRATCHPAD_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym37$SET_FOCUS, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list85, (SubLObject)sanity_checker.$list86);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym37$SET_FOCUS, (SubLObject)sanity_checker.$sym88$SANITY_CHECKER_SCRATCHPAD_SET_FOCUS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym56$SET_PIQUANT_FOCUS, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list89, (SubLObject)sanity_checker.$list90);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym56$SET_PIQUANT_FOCUS, (SubLObject)sanity_checker.$sym96$SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_FOCUS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym36$SET_PREDICATE, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list97, (SubLObject)sanity_checker.$list98);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym36$SET_PREDICATE, (SubLObject)sanity_checker.$sym102$SANITY_CHECKER_SCRATCHPAD_SET_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym66$SET_PIQUANT_PREDICATE, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list103, (SubLObject)sanity_checker.$list104);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym66$SET_PIQUANT_PREDICATE, (SubLObject)sanity_checker.$sym106$SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym38$SET_ANSWER, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list85, (SubLObject)sanity_checker.$list107);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym38$SET_ANSWER, (SubLObject)sanity_checker.$sym110$SANITY_CHECKER_SCRATCHPAD_SET_ANSWER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym51$SET_CYC_ANSWERS, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list111, (SubLObject)sanity_checker.$list112);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym51$SET_CYC_ANSWERS, (SubLObject)sanity_checker.$sym115$SANITY_CHECKER_SCRATCHPAD_SET_CYC_ANSWERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym109$COMPUTE_CYC_ANSWERS, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$list116, (SubLObject)sanity_checker.$list85, (SubLObject)sanity_checker.$list117);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym109$COMPUTE_CYC_ANSWERS, (SubLObject)sanity_checker.$sym121$SANITY_CHECKER_SCRATCHPAD_COMPUTE_CYC_ANSWERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym39$COMPUTE_DEGENERATE_DIAGNOSIS, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$list116, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list122);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym39$COMPUTE_DEGENERATE_DIAGNOSIS, (SubLObject)sanity_checker.$sym127$SANITY_CHECKER_SCRATCHPAD_COMPUTE_DEGENERATE_DIAGNOSIS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym41$INITIALIZE_CHECKERS, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list128, (SubLObject)sanity_checker.$list129);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym41$INITIALIZE_CHECKERS, (SubLObject)sanity_checker.$sym137$SANITY_CHECKER_SCRATCHPAD_INITIALIZE_CHECKERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym42$DIAGNOSE, (SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list138);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym35$SANITY_CHECKER_SCRATCHPAD, (SubLObject)sanity_checker.$sym42$DIAGNOSE, (SubLObject)sanity_checker.$sym141$SANITY_CHECKER_SCRATCHPAD_DIAGNOSE_METHOD);
        classes.subloop_new_class((SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list143);
        classes.class_set_implements_slot_listeners((SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$sym145$SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$sym147$SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_INSTANCE);
        subloop_reserved_initialize_scalar_checker_class((SubLObject)sanity_checker.$sym133$SCALAR_CHECKER);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym19$INITIALIZE, (SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$list20, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list148);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$sym19$INITIALIZE, (SubLObject)sanity_checker.$sym150$SCALAR_CHECKER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym140$COMPUTE_RANGE, (SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list151);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$sym140$COMPUTE_RANGE, (SubLObject)sanity_checker.$sym160$SCALAR_CHECKER_COMPUTE_RANGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym42$DIAGNOSE, (SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list163);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym133$SCALAR_CHECKER, (SubLObject)sanity_checker.$sym42$DIAGNOSE, (SubLObject)sanity_checker.$sym177$SCALAR_CHECKER_DIAGNOSE_METHOD);
        classes.subloop_new_class((SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list178);
        classes.class_set_implements_slot_listeners((SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$sym179$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$sym180$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_INSTANCE);
        subloop_reserved_initialize_sanity_checker_diagnosis_class((SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym19$INITIALIZE, (SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$list20, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list181);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$sym19$INITIALIZE, (SubLObject)sanity_checker.$sym183$SANITY_CHECKER_DIAGNOSIS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym7$BOOLEAN, (SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$list20, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list184);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym124$SANITY_CHECKER_DIAGNOSIS, (SubLObject)sanity_checker.$sym7$BOOLEAN, (SubLObject)sanity_checker.$sym186$SANITY_CHECKER_DIAGNOSIS_BOOLEAN_METHOD);
        classes.subloop_new_class((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym9$OBJECT, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list187);
        classes.class_set_implements_slot_listeners((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym192$SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym193$SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_INSTANCE);
        subloop_reserved_initialize_scalar_range_class((SubLObject)sanity_checker.$sym155$SCALAR_RANGE);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym194$PRINT, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list20, (SubLObject)sanity_checker.$list195, (SubLObject)sanity_checker.$list196);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym194$PRINT, (SubLObject)sanity_checker.$sym198$SCALAR_RANGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym19$INITIALIZE, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list20, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list199);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym19$INITIALIZE, (SubLObject)sanity_checker.$sym201$SCALAR_RANGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym157$EMPTY_P, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list202);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym157$EMPTY_P, (SubLObject)sanity_checker.$sym204$SCALAR_RANGE_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym156$FILL, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list205, (SubLObject)sanity_checker.$list206);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym156$FILL, (SubLObject)sanity_checker.$sym212$SCALAR_RANGE_FILL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym213$GET_UNIT, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list214);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym213$GET_UNIT, (SubLObject)sanity_checker.$sym216$SCALAR_RANGE_GET_UNIT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym165$GET_MIN, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list217);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym165$GET_MIN, (SubLObject)sanity_checker.$sym219$SCALAR_RANGE_GET_MIN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym220$GET_MIN_VALUE, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list221);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym220$GET_MIN_VALUE, (SubLObject)sanity_checker.$sym223$SCALAR_RANGE_GET_MIN_VALUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym166$GET_MAX, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list224);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym166$GET_MAX, (SubLObject)sanity_checker.$sym226$SCALAR_RANGE_GET_MAX_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym227$GET_MAX_VALUE, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list228);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym227$GET_MAX_VALUE, (SubLObject)sanity_checker.$sym230$SCALAR_RANGE_GET_MAX_VALUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym167$LISTIFY, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.NIL, (SubLObject)sanity_checker.$list231);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym167$LISTIFY, (SubLObject)sanity_checker.$sym233$SCALAR_RANGE_LISTIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym159$FUDGE, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list128, (SubLObject)sanity_checker.$list234);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym159$FUDGE, (SubLObject)sanity_checker.$sym236$SCALAR_RANGE_FUDGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym237$CONVERTIBLE_P, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list238, (SubLObject)sanity_checker.$list239);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym237$CONVERTIBLE_P, (SubLObject)sanity_checker.$sym244$SCALAR_RANGE_CONVERTIBLE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym158$MERGE, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list238, (SubLObject)sanity_checker.$list245);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym158$MERGE, (SubLObject)sanity_checker.$sym249$SCALAR_RANGE_MERGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym247$MERGE_LOOSE, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list238, (SubLObject)sanity_checker.$list250);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym247$MERGE_LOOSE, (SubLObject)sanity_checker.$sym253$SCALAR_RANGE_MERGE_LOOSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)sanity_checker.$sym248$MERGE_STRICT, (SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$list31, (SubLObject)sanity_checker.$list238, (SubLObject)sanity_checker.$list254);
        methods.subloop_register_instance_method((SubLObject)sanity_checker.$sym155$SCALAR_RANGE, (SubLObject)sanity_checker.$sym248$MERGE_STRICT, (SubLObject)sanity_checker.$sym257$SCALAR_RANGE_MERGE_STRICT_METHOD);
        return (SubLObject)sanity_checker.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sanity_checker_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sanity_checker_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sanity_checker_file();
    }
    
    static {
        me = (SubLFile)new sanity_checker();
        sanity_checker.$sanity_checker$ = null;
        sanity_checker.$piquant_sanity_checkers$ = null;
        sanity_checker.$scalar_checker_backchain$ = null;
        $sym0$SANITY_CHECKER = SubLObjectFactory.makeSymbol("SANITY-CHECKER");
        $sym1$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym2$PIQUANT_SANITY_CHECKER = SubLObjectFactory.makeSymbol("PIQUANT-SANITY-CHECKER");
        $sym3$SHOW_DEBUG_INFO = SubLObjectFactory.makeSymbol("SHOW-DEBUG-INFO");
        $sym4$CHECK = SubLObjectFactory.makeSymbol("CHECK");
        $sym5$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym6$CHECK_CYC_INTERPRETATIONS = SubLObjectFactory.makeSymbol("CHECK-CYC-INTERPRETATIONS");
        $sym7$BOOLEAN = SubLObjectFactory.makeSymbol("BOOLEAN");
        $sym8$PROPOSED_VALUE = SubLObjectFactory.makeSymbol("PROPOSED-VALUE");
        $sym9$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOW-DEBUG-INFO"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CHECK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CHECK-LISTIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym11$SCRATCHPAD = SubLObjectFactory.makeSymbol("SCRATCHPAD");
        $sym12$CACHE = SubLObjectFactory.makeSymbol("CACHE");
        $sym13$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym14$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-CLASS");
        $sym15$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym16$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym17$FUDGE_FACTOR = SubLObjectFactory.makeSymbol("FUDGE-FACTOR");
        $sym18$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-INSTANCE");
        $sym19$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR"), (SubLObject)sanity_checker.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym22$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-METHOD");
        $sym23$SANITY_CHECKER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-INITIALIZE-METHOD");
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SHOW-DEBUG-INFO"), (SubLObject)sanity_checker.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym25$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-METHOD");
        $sym26$SANITY_CHECKER_SHOW_DEBUG_INFO_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-SHOW-DEBUG-INFO-METHOD");
        $sym27$HIDE_DEBUG_INFO = SubLObjectFactory.makeSymbol("HIDE-DEBUG-INFO");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SHOW-DEBUG-INFO"), (SubLObject)sanity_checker.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym29$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-METHOD");
        $sym30$SANITY_CHECKER_HIDE_DEBUG_INFO_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-HIDE-DEBUG-INFO-METHOD");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"));
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PREDICATE")), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-FOCUS")), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ANSWER")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-DEGENERATE-DIAGNOSIS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEGENERATE-DIAGNOSIS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-CHECKERS")), (SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-DIAGNOSES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOW-DEBUG-INFO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"), (SubLObject)SubLObjectFactory.makeString("~%~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLISTIFY")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym34$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-METHOD");
        $sym35$SANITY_CHECKER_SCRATCHPAD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD");
        $sym36$SET_PREDICATE = SubLObjectFactory.makeSymbol("SET-PREDICATE");
        $sym37$SET_FOCUS = SubLObjectFactory.makeSymbol("SET-FOCUS");
        $sym38$SET_ANSWER = SubLObjectFactory.makeSymbol("SET-ANSWER");
        $sym39$COMPUTE_DEGENERATE_DIAGNOSIS = SubLObjectFactory.makeSymbol("COMPUTE-DEGENERATE-DIAGNOSIS");
        $sym40$DEGENERATE_DIAGNOSIS = SubLObjectFactory.makeSymbol("DEGENERATE-DIAGNOSIS");
        $sym41$INITIALIZE_CHECKERS = SubLObjectFactory.makeSymbol("INITIALIZE-CHECKERS");
        $sym42$DIAGNOSE = SubLObjectFactory.makeSymbol("DIAGNOSE");
        $sym43$OUTPUT_DIAGNOSES = SubLObjectFactory.makeSymbol("OUTPUT-DIAGNOSES");
        $str44$___S = SubLObjectFactory.makeString("~%~S");
        $sym45$PLISTIFY = SubLObjectFactory.makeSymbol("PLISTIFY");
        $sym46$SANITY_CHECKER_CHECK_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-CHECK-METHOD");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-INTERPRETATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-ANSWERS"));
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PREDICATE")), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-FOCUSES")), (SubLObject)SubLObjectFactory.makeSymbol("CYC-INTERPRETATIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CYC-ANSWERS")), (SubLObject)SubLObjectFactory.makeSymbol("CYC-ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-DEGENERATE-DIAGNOSIS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEGENERATE-DIAGNOSIS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-CHECKERS")), (SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-DIAGNOSES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOW-DEBUG-INFO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"), (SubLObject)SubLObjectFactory.makeString("~%~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLISTIFY")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym49$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-METHOD");
        $sym50$CYC_FOCUSES = SubLObjectFactory.makeSymbol("CYC-FOCUSES");
        $sym51$SET_CYC_ANSWERS = SubLObjectFactory.makeSymbol("SET-CYC-ANSWERS");
        $sym52$SANITY_CHECKER_CHECK_CYC_INTERPRETATIONS_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-CHECK-CYC-INTERPRETATIONS-METHOD");
        $sym53$CHECK_LISTIFIED = SubLObjectFactory.makeSymbol("CHECK-LISTIFIED");
        $list54 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PREDICATE")), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PIQUANT-FOCUS")), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PIQUANT-ANSWER")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-DEGENERATE-DIAGNOSIS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEGENERATE-DIAGNOSIS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-CHECKERS")), (SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-DIAGNOSES")))), (SubLObject)SubLObjectFactory.makeSymbol("LISTIFIED-RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLISTIFY"))), (SubLObject)SubLObjectFactory.makeSymbol("LISTIFIED-RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOW-DEBUG-INFO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("LISTIFIED-RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"), (SubLObject)SubLObjectFactory.makeString("~%~S"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LISTIFIED-RESULT"))));
        $sym55$OUTER_CATCH_FOR_SANITY_CHECKER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-METHOD");
        $sym56$SET_PIQUANT_FOCUS = SubLObjectFactory.makeSymbol("SET-PIQUANT-FOCUS");
        $sym57$SET_PIQUANT_ANSWER = SubLObjectFactory.makeSymbol("SET-PIQUANT-ANSWER");
        $sym58$SANITY_CHECKER_CHECK_LISTIFIED_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-CHECK-LISTIFIED-METHOD");
        $sym59$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CHECK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-FOCUS"), (SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-ANSWER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CHECK-LISTIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym61$SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PIQUANT-SANITY-CHECKER-CLASS");
        $sym62$SUBLOOP_RESERVED_INITIALIZE_PIQUANT_SANITY_CHECKER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PIQUANT-SANITY-CHECKER-INSTANCE");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-FOCUS"), (SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-ANSWER"));
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PIQUANT-PREDICATE")), (SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PIQUANT-FOCUS")), (SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-FOCUS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ANSWER")), (SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-DEGENERATE-DIAGNOSIS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEGENERATE-DIAGNOSIS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-CHECKERS")), (SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-DIAGNOSES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOW-DEBUG-INFO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"), (SubLObject)SubLObjectFactory.makeString("~%~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLISTIFY")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym65$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PIQUANT-SANITY-CHECKER-METHOD");
        $sym66$SET_PIQUANT_PREDICATE = SubLObjectFactory.makeSymbol("SET-PIQUANT-PREDICATE");
        $sym67$PIQUANT_SANITY_CHECKER_CHECK_METHOD = SubLObjectFactory.makeSymbol("PIQUANT-SANITY-CHECKER-CHECK-METHOD");
        $list68 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PIQUANT-PREDICATE")), (SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PIQUANT-FOCUS")), (SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-FOCUS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ANSWER")), (SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-DEGENERATE-DIAGNOSIS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEGENERATE-DIAGNOSIS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-CHECKERS")), (SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SCRATCHPAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-DIAGNOSES")))), (SubLObject)SubLObjectFactory.makeSymbol("LISTIFIED-RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLISTIFY"))), (SubLObject)SubLObjectFactory.makeSymbol("LISTIFIED-RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOW-DEBUG-INFO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("LISTIFIED-RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"), (SubLObject)SubLObjectFactory.makeString("~%~S"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LISTIFIED-RESULT"))));
        $sym69$OUTER_CATCH_FOR_PIQUANT_SANITY_CHECKER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PIQUANT-SANITY-CHECKER-METHOD");
        $sym70$PIQUANT_SANITY_CHECKER_CHECK_LISTIFIED_METHOD = SubLObjectFactory.makeSymbol("PIQUANT-SANITY-CHECKER-CHECK-LISTIFIED-METHOD");
        $list71 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-FOCUSES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-ANSWERS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECKERS-POOL"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEGENERATE-DIAGNOSIS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-CHECKERS"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-FOCUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PIQUANT-FOCUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PIQUANT-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-DEGENERATE-DIAGNOSIS"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSE"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-DIAGNOSES"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym72$CHECKERS_POOL = SubLObjectFactory.makeSymbol("CHECKERS-POOL");
        $sym73$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-SCRATCHPAD-CLASS");
        $sym74$PREDICATE = SubLObjectFactory.makeSymbol("PREDICATE");
        $sym75$FOCUS = SubLObjectFactory.makeSymbol("FOCUS");
        $sym76$ANSWER = SubLObjectFactory.makeSymbol("ANSWER");
        $sym77$CYC_ANSWERS = SubLObjectFactory.makeSymbol("CYC-ANSWERS");
        $sym78$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_SCRATCHPAD_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-SCRATCHPAD-INSTANCE");
        $list79 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("DEGENERATE-DIAGNOSIS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("DEGENERATE-DIAGNOSIS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECKER"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKERS-POOL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSIS"))), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSES")))));
        $sym80$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");
        $sym81$DIAGNOSIS = SubLObjectFactory.makeSymbol("DIAGNOSIS");
        $sym82$SANITY_CHECKER_SCRATCHPAD_OUTPUT_DIAGNOSES_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD-OUTPUT-DIAGNOSES-METHOD");
        $list83 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym84$SANITY_CHECKER_SCRATCHPAD_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD-INITIALIZE-METHOD");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $list86 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PS-GET-CYCLS-FOR-NP"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REFORMULATED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REFORMULATE-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("REFORMULATED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("REFORMULATED"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-FOCUSES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)sanity_checker.EQUAL))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym87$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");
        $sym88$SANITY_CHECKER_SCRATCHPAD_SET_FOCUS_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD-SET-FOCUS-METHOD");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCUS-STRING"));
        $list90 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOTATIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STARTS-WITH"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-STRING"), (SubLObject)SubLObjectFactory.makeString("#$")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-CONSTANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRE-REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-STRING"), (SubLObject)SubLObjectFactory.makeString("#$"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("DENOTATIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-FOCUSES"), (SubLObject)SubLObjectFactory.makeSymbol("DENOTATIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GURUQA-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GURUQA-OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GURUQA-PARSE-PRECISE")), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)SubLObjectFactory.makeSymbol("GURUQA-OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("GURUQA-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-FOCUSES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GURUQA-OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DENOTATIONS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym91$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");
        $str92$__ = SubLObjectFactory.makeString("#$");
        $sym93$GURUQA_OBJECT = SubLObjectFactory.makeSymbol("GURUQA-OBJECT");
        $sym94$GURUQA_PARSE_PRECISE = SubLObjectFactory.makeSymbol("GURUQA-PARSE-PRECISE");
        $sym95$DENOTATIONS = SubLObjectFactory.makeSymbol("DENOTATIONS");
        $sym96$SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_FOCUS_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD-SET-PIQUANT-FOCUS-METHOD");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-PREDICATE"));
        $list98 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-IN-ANY-MT?"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("~%~S is not a binary predicate."), (SubLObject)SubLObjectFactory.makeSymbol("CYC-PREDICATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym99$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");
        $const100$BinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"));
        $str101$___S_is_not_a_binary_predicate_ = SubLObjectFactory.makeString("~%~S is not a binary predicate.");
        $sym102$SANITY_CHECKER_SCRATCHPAD_SET_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD-SET-PREDICATE-METHOD");
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-PREDICATE"));
        $list104 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-PREDICATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-IN-ANY-MT?"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("~%~S is not a binary predicate."), (SubLObject)SubLObjectFactory.makeSymbol("PIQUANT-PREDICATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym105$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");
        $sym106$SANITY_CHECKER_SCRATCHPAD_SET_PIQUANT_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD-SET-PIQUANT-PREDICATE-METHOD");
        $list107 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-CYC-ANSWERS")), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym108$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");
        $sym109$COMPUTE_CYC_ANSWERS = SubLObjectFactory.makeSymbol("COMPUTE-CYC-ANSWERS");
        $sym110$SANITY_CHECKER_SCRATCHPAD_SET_ANSWER_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD-SET-ANSWER-METHOD");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-CANDIDATE-ANSWERS"));
        $list112 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-CANDIDATE-ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)SubLObjectFactory.makeSymbol("CYC-ANSWERS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym113$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");
        $const114$Unity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity"));
        $sym115$SANITY_CHECKER_SCRATCHPAD_SET_CYC_ANSWERS_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD-SET-CYC-ANSWERS-METHOD");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list117 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-DENOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PS-GET-CYCLS-FOR-NP"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("GOOD-DENOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-DENOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REFORMULATED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REFORMULATE-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"))), (SubLObject)SubLObjectFactory.makeSymbol("WFT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("WFT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-WFT?"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("WFT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("REFORMULATED"), (SubLObject)SubLObjectFactory.makeSymbol("GOOD-DENOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)sanity_checker.EQUAL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity")), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), (SubLObject)SubLObjectFactory.makeSymbol("GOOD-DENOTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-ANSWERS"), (SubLObject)SubLObjectFactory.makeSymbol("GOOD-DENOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym118$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");
        $sym119$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const120$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym121$SANITY_CHECKER_SCRATCHPAD_COMPUTE_CYC_ANSWERS_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD-COMPUTE-CYC-ANSWERS-METHOD");
        $list122 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSIS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SANITY-CHECKER-DIAGNOSIS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASIS"), (SubLObject)sanity_checker.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("BASIS"), (SubLObject)SubLObjectFactory.makeInteger(100))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-FOCUSES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("BASIS"), (SubLObject)sanity_checker.TEN_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("BASIS"), (SubLObject)sanity_checker.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("BASIS"), (SubLObject)sanity_checker.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSIS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FAILURE-CODE")), (SubLObject)SubLObjectFactory.makeSymbol("BASIS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DEGENERATE-DIAGNOSIS"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSIS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym123$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");
        $sym124$SANITY_CHECKER_DIAGNOSIS = SubLObjectFactory.makeSymbol("SANITY-CHECKER-DIAGNOSIS");
        $int125$100 = SubLObjectFactory.makeInteger(100);
        $sym126$FAILURE_CODE = SubLObjectFactory.makeSymbol("FAILURE-CODE");
        $sym127$SANITY_CHECKER_SCRATCHPAD_COMPUTE_DEGENERATE_DIAGNOSIS_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD-COMPUTE-DEGENERATE-DIAGNOSIS-METHOD");
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR"));
        $list129 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED-ARG1-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED-VALUES-IN-ANY-MT"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa")), (SubLObject)sanity_checker.ONE_INTEGER, (SubLObject)sanity_checker.TWO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED-ARG2-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED-VALUES-IN-ANY-MT"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa")), (SubLObject)sanity_checker.ONE_INTEGER, (SubLObject)sanity_checker.TWO_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("GOOD-ARG1S"), (SubLObject)SubLObjectFactory.makeSymbol("GOOD-ARG2S")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-FOCUSES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-ARG1-SET"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-IN-ANY-MT?"), (SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-IN-ANY-MT?"), (SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)sanity_checker.T))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("GOOD-ARG1S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)sanity_checker.EQUAL))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)SubLObjectFactory.makeSymbol("CAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-ARG2-SET"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CAST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEURISTICALLY-CAST-UNITY"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P"), (SubLObject)SubLObjectFactory.makeSymbol("CAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-IN-ANY-MT?"), (SubLObject)SubLObjectFactory.makeSymbol("CAST"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-IN-ANY-MT?"), (SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("CAST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLUSP"), (SubLObject)SubLObjectFactory.makeSymbol("CAST"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("CAST"), (SubLObject)SubLObjectFactory.makeSymbol("GOOD-ARG2S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)sanity_checker.EQUAL))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOOD-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("GOOD-ARG1S")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOOD-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("GOOD-ARG2S")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECKER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-CHECKER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR")), (SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1")), (SubLObject)SubLObjectFactory.makeSymbol("GOOD-ARG1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2")), (SubLObject)SubLObjectFactory.makeSymbol("GOOD-ARG2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKER"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKERS-POOL"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKERS-POOL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSIS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SANITY-CHECKER-DIAGNOSIS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSIS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FAILURE-CODE")), (SubLObject)SubLObjectFactory.makeInteger(1000)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DEGENERATE-DIAGNOSIS"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSIS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym130$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");
        $const131$arg1Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa"));
        $const132$arg2Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa"));
        $sym133$SCALAR_CHECKER = SubLObjectFactory.makeSymbol("SCALAR-CHECKER");
        $sym134$ARG1 = SubLObjectFactory.makeSymbol("ARG1");
        $sym135$ARG2 = SubLObjectFactory.makeSymbol("ARG2");
        $int136$1000 = SubLObjectFactory.makeInteger(1000);
        $sym137$SANITY_CHECKER_SCRATCHPAD_INITIALIZE_CHECKERS_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD-INITIALIZE-CHECKERS-METHOD");
        $list138 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECKER"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKERS-POOL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-RANGE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym139$OUTER_CATCH_FOR_SANITY_CHECKER_SCRATCHPAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-SCRATCHPAD-METHOD");
        $sym140$COMPUTE_RANGE = SubLObjectFactory.makeSymbol("COMPUTE-RANGE");
        $sym141$SANITY_CHECKER_SCRATCHPAD_DIAGNOSE_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-SCRATCHPAD-DIAGNOSE-METHOD");
        $sym142$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $list143 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSIS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BACKCHAIN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG2RANGE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-RANGE"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym144$ARG2RANGE = SubLObjectFactory.makeSymbol("ARG2RANGE");
        $sym145$SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SCALAR-CHECKER-CLASS");
        $sym146$BACKCHAIN = SubLObjectFactory.makeSymbol("BACKCHAIN");
        $sym147$SUBLOOP_RESERVED_INITIALIZE_SCALAR_CHECKER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SCALAR-CHECKER-INSTANCE");
        $list148 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BACKCHAIN"), (SubLObject)SubLObjectFactory.makeSymbol("*SCALAR-CHECKER-BACKCHAIN*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym149$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-CHECKER-METHOD");
        $sym150$SCALAR_CHECKER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SCALAR-CHECKER-INITIALIZE-METHOD");
        $list151 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPESHIFT-ARGUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?RANGE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASK-TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("?RANGE")), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")), (SubLObject)SubLObjectFactory.makeSymbol("BACKCHAIN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TO-MERGE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)SubLObjectFactory.makeSymbol("RANGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)SubLObjectFactory.makeSymbol("RANGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-RANGE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FILL")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TO-MERGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TO-MERGE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RANGE"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-RANGE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("TO-MERGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-RANGE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FILL")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MERGE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-RANGE"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FUDGE")), (SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2RANGE"), (SubLObject)SubLObjectFactory.makeSymbol("RANGE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym152$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-CHECKER-METHOD");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?RANGE"));
        $sym154$_RANGE = SubLObjectFactory.makeSymbol("?RANGE");
        $sym155$SCALAR_RANGE = SubLObjectFactory.makeSymbol("SCALAR-RANGE");
        $sym156$FILL = SubLObjectFactory.makeSymbol("FILL");
        $sym157$EMPTY_P = SubLObjectFactory.makeSymbol("EMPTY-P");
        $sym158$MERGE = SubLObjectFactory.makeSymbol("MERGE");
        $sym159$FUDGE = SubLObjectFactory.makeSymbol("FUDGE");
        $sym160$SCALAR_CHECKER_COMPUTE_RANGE_METHOD = SubLObjectFactory.makeSymbol("SCALAR-CHECKER-COMPUTE-RANGE-METHOD");
        $const161$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $const162$SomeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $list163 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SANITY-CHECKER-DIAGNOSIS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEURISTICALLY-CAST-UNITY"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG2MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MIN"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG2MAX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MAX"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LISTIFY"))))), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-EXPLANATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROPOSED-ARG")), (SubLObject)SubLObjectFactory.makeSymbol("ARG1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROPOSED-VALUE")), (SubLObject)SubLObjectFactory.makeSymbol("ARG2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2MIN"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2MAX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-TEST-MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThan")), (SubLObject)SubLObjectFactory.makeSymbol("CAST"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2MIN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-TEST-MAX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan")), (SubLObject)SubLObjectFactory.makeSymbol("CAST"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2MAX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantitySubsumes")), (SubLObject)SubLObjectFactory.makeSymbol("RANGE"), (SubLObject)SubLObjectFactory.makeSymbol("CAST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYC-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-TEST-MIN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETE")), (SubLObject)sanity_checker.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-KNOWN")), (SubLObject)sanity_checker.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)sanity_checker.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-EXPLANATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("RANGE")), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-TEST-MIN")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYC-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-TEST-MAX"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETE")), (SubLObject)sanity_checker.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-KNOWN")), (SubLObject)sanity_checker.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)sanity_checker.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-EXPLANATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("RANGE")), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-TEST-MAX")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYC-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-TEST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETE")), (SubLObject)sanity_checker.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-KNOWN")), (SubLObject)sanity_checker.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)sanity_checker.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-EXPLANATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("RANGE")), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-TEST")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-PHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-EXPLANATION")))), (SubLObject)ConsesLow.list((SubLObject)sanity_checker.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETE")), (SubLObject)sanity_checker.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-KNOWN")), (SubLObject)sanity_checker.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)sanity_checker.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION")), (SubLObject)SubLObjectFactory.makeString("No information available")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGNOSIS"), (SubLObject)SubLObjectFactory.makeSymbol("DIAGN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym164$OUTER_CATCH_FOR_SCALAR_CHECKER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-CHECKER-METHOD");
        $sym165$GET_MIN = SubLObjectFactory.makeSymbol("GET-MIN");
        $sym166$GET_MAX = SubLObjectFactory.makeSymbol("GET-MAX");
        $sym167$LISTIFY = SubLObjectFactory.makeSymbol("LISTIFY");
        $sym168$PROPOSED_ARG = SubLObjectFactory.makeSymbol("PROPOSED-ARG");
        $const169$lessThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThan"));
        $const170$greaterThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan"));
        $const171$quantitySubsumes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantitySubsumes"));
        $sym172$COMPLETE = SubLObjectFactory.makeSymbol("COMPLETE");
        $sym173$ANSWER_KNOWN = SubLObjectFactory.makeSymbol("ANSWER-KNOWN");
        $const174$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $sym175$JUSTIFICATION = SubLObjectFactory.makeSymbol("JUSTIFICATION");
        $str176$No_information_available = SubLObjectFactory.makeString("No information available");
        $sym177$SCALAR_CHECKER_DIAGNOSE_METHOD = SubLObjectFactory.makeSymbol("SCALAR-CHECKER-DIAGNOSE-METHOD");
        $list178 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FAILURE-CODE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("ESSENTIAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLETE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("ESSENTIAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER-KNOWN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("ESSENTIAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("ESSENTIAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("ESSENTIAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPOSED-VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("ESSENTIAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPOSED-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("ESSENTIAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("ESSENTIAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym179$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-DIAGNOSIS-CLASS");
        $sym180$SUBLOOP_RESERVED_INITIALIZE_SANITY_CHECKER_DIAGNOSIS_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SANITY-CHECKER-DIAGNOSIS-INSTANCE");
        $list181 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FAILURE-CODE"), (SubLObject)sanity_checker.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym182$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-DIAGNOSIS-METHOD");
        $sym183$SANITY_CHECKER_DIAGNOSIS_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-DIAGNOSIS-INITIALIZE-METHOD");
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A yes-or-no answer as to whether the diagnosis is favorable (T) or\n   unfavorable (NIL)."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)sanity_checker.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)sanity_checker.ZERO_INTEGER)));
        $sym185$OUTER_CATCH_FOR_SANITY_CHECKER_DIAGNOSIS_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SANITY-CHECKER-DIAGNOSIS-METHOD");
        $sym186$SANITY_CHECKER_DIAGNOSIS_BOOLEAN_METHOD = SubLObjectFactory.makeSymbol("SANITY-CHECKER-DIAGNOSIS-BOOLEAN-METHOD");
        $list187 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POINT-INFO"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FILL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-UNIT"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MIN"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MAX"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MIN-VALUE"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MAX-VALUE"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LISTIFY"), (SubLObject)sanity_checker.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MERGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MERGE-LOOSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MERGE-STRICT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FUDGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym188$POINT_INFO = SubLObjectFactory.makeSymbol("POINT-INFO");
        $sym189$MAX = SubLObjectFactory.makeSymbol("MAX");
        $sym190$MIN = SubLObjectFactory.makeSymbol("MIN");
        $sym191$UNIT = SubLObjectFactory.makeSymbol("UNIT");
        $sym192$SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SCALAR-RANGE-CLASS");
        $sym193$SUBLOOP_RESERVED_INITIALIZE_SCALAR_RANGE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SCALAR-RANGE-INSTANCE");
        $sym194$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list195 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list196 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints SCALAR-RANGE to STREAM, ignoring depth"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)SubLObjectFactory.makeSymbol("POINT-INFO")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym197$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $sym198$SCALAR_RANGE_PRINT_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-PRINT-METHOD");
        $list199 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)sanity_checker.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)sanity_checker.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym200$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $sym201$SCALAR_RANGE_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-INITIALIZE-METHOD");
        $list202 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)sanity_checker.EQL, (SubLObject)SubLObjectFactory.makeSymbol("UNIT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)sanity_checker.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)sanity_checker.ZERO_INTEGER))));
        $sym203$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $sym204$SCALAR_RANGE_EMPTY_P_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-EMPTY-P-METHOD");
        $list205 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list206 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYC-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonNegativeScalarInterval"))))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("POINT-INFO"), (SubLObject)sanity_checker.T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSP"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE-UNIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE-MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE-MAX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIRD"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"))), (SubLObject)SubLObjectFactory.makeSymbol("NEW-UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MIN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MAX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-UNIT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-UNIT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-MIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MIN"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-MIN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-MAX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MAX"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-MAX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MAX"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MIN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MIN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MAX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-UNIT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MAX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)sanity_checker.EQ, (SubLObject)SubLObjectFactory.makeSymbol("NEW-MIN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MAX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("POINT-INFO"), (SubLObject)sanity_checker.T))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym207$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $const208$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list209 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonNegativeScalarInterval")));
        $const210$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $const211$UnitOfMeasure = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfMeasure"));
        $sym212$SCALAR_RANGE_FILL_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-FILL-METHOD");
        $sym213$GET_UNIT = SubLObjectFactory.makeSymbol("GET-UNIT");
        $list214 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT")));
        $sym215$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $sym216$SCALAR_RANGE_GET_UNIT_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-GET-UNIT-METHOD");
        $list217 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)sanity_checker.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("MIN")))));
        $sym218$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $sym219$SCALAR_RANGE_GET_MIN_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-GET-MIN-METHOD");
        $sym220$GET_MIN_VALUE = SubLObjectFactory.makeSymbol("GET-MIN-VALUE");
        $list221 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MIN")));
        $sym222$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $sym223$SCALAR_RANGE_GET_MIN_VALUE_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-GET-MIN-VALUE-METHOD");
        $list224 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)sanity_checker.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("MAX")))));
        $sym225$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $sym226$SCALAR_RANGE_GET_MAX_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-GET-MAX-METHOD");
        $sym227$GET_MAX_VALUE = SubLObjectFactory.makeSymbol("GET-MAX-VALUE");
        $list228 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MAX")));
        $sym229$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $sym230$SCALAR_RANGE_GET_MAX_VALUE_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-GET-MAX-VALUE-METHOD");
        $list231 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"))));
        $sym232$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $sym233$SCALAR_RANGE_LISTIFY_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-LISTIFY-METHOD");
        $list234 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)SubLObjectFactory.makeSymbol("FUDGE-FACTOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym235$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $sym236$SCALAR_RANGE_FUDGE_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-FUDGE-METHOD");
        $sym237$CONVERTIBLE_P = SubLObjectFactory.makeSymbol("CONVERTIBLE-P");
        $list238 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"));
        $list239 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-RANGE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-UNIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-UNIT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TYPE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-UNIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TYPE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InterconvertibleUnitType")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYC-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))))));
        $sym240$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $sym241$SCALAR_RANGE_P = SubLObjectFactory.makeSymbol("SCALAR-RANGE-P");
        $list242 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TYPE"));
        $list243 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InterconvertibleUnitType"))));
        $sym244$SCALAR_RANGE_CONVERTIBLE_P_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-CONVERTIBLE-P-METHOD");
        $list245 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CONVERTIBLE-P")), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)sanity_checker.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-POINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("POINT-INFO"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("POINT-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-POINT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MERGE-LOOSE")), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POINT-INFO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-POINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"))), (SubLObject)ConsesLow.list((SubLObject)sanity_checker.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MERGE-STRICT")), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE")))))));
        $sym246$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $sym247$MERGE_LOOSE = SubLObjectFactory.makeSymbol("MERGE-LOOSE");
        $sym248$MERGE_STRICT = SubLObjectFactory.makeSymbol("MERGE-STRICT");
        $sym249$SCALAR_RANGE_MERGE_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-MERGE-METHOD");
        $list250 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CONVERTIBLE-P")), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)sanity_checker.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MERGED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-RANGE")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIS-MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MIN")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MIN")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIS-MAX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MAX")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-MAX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MAX")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYC-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThanOrEqualTo")), (SubLObject)SubLObjectFactory.makeSymbol("THIS-MIN"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-MIN")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYC-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThanOrEqualTo")), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-MAX"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-MAX")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-UNIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-UNIT")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("MIN-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONVERT-TO-UNITS"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-UNIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MIN-VALUE")))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MAX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONVERT-TO-UNITS"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-UNIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MAX-VALUE")))))) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MERGED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FILL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MIN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MAX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MERGED"))));
        $sym251$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $const252$lessThanOrEqualTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThanOrEqualTo"));
        $sym253$SCALAR_RANGE_MERGE_LOOSE_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-MERGE-LOOSE-METHOD");
        $list254 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CONVERTIBLE-P")), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)sanity_checker.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIS-MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MIN")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MIN")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIS-MAX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MAX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-MAX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MAX"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYC-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThan")), (SubLObject)SubLObjectFactory.makeSymbol("THIS-MAX"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-MIN")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("~%Inconsistent ranges: ~S ~S"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)sanity_checker.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYC-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThan")), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-MAX"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-MIN")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("~%Inconsistent ranges: ~S ~S"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)sanity_checker.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-UNIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-UNIT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MAX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYC-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThan")), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-MAX"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-MAX")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONVERT-TO-UNITS"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-UNIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MAX-VALUE")))), (SubLObject)SubLObjectFactory.makeSymbol("MAX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYC-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThan")), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-MIN"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-MIN")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), (SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONVERT-TO-UNITS"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-UNIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-RANGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MIN-VALUE")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MERGED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SCALAR-RANGE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MERGED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FILL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MIN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MAX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MERGED")))));
        $sym255$OUTER_CATCH_FOR_SCALAR_RANGE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SCALAR-RANGE-METHOD");
        $str256$__Inconsistent_ranges___S__S = SubLObjectFactory.makeString("~%Inconsistent ranges: ~S ~S");
        $sym257$SCALAR_RANGE_MERGE_STRICT_METHOD = SubLObjectFactory.makeSymbol("SCALAR-RANGE-MERGE-STRICT-METHOD");
        $const258$age = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("age"));
        $const259$numberOfInhabitants = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numberOfInhabitants"));
        $const260$YearsDuration = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearsDuration"));
        $const261$NumericalQuant_NLAttrFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumericalQuant-NLAttrFn"));
        $const262$HomoSapiens = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HomoSapiens"));
    }
}

/*

	Total time: 1400 ms
	 synthetic 
*/