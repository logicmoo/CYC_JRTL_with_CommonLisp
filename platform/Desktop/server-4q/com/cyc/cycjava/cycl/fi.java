package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.janus;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class fi extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.fi";
    public static final String myFingerPrint = "3911f3639c2476c1d205d929241e942033b828c37246093539cc10c970c367f3";
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 2595L)
    private static SubLSymbol $fi_dispatch_table$;
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 6696L)
    public static SubLSymbol $fi_warning$;
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 7372L)
    public static SubLSymbol $fi_error$;
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 8317L)
    public static SubLSymbol $fi_last_constant$;
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 8738L)
    private static SubLSymbol $within_fi_operationP$;
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 12164L)
    public static SubLSymbol $current_fi_op$;
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 30415L)
    private static SubLSymbol $merge_fort_assertion_map$;
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 51437L)
    public static SubLSymbol $assume_assert_sentence_is_wfP$;
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 59031L)
    public static SubLSymbol $generate_precise_fi_wff_errorsP$;
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 109101L)
    public static SubLSymbol $the_date$;
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 109488L)
    public static SubLSymbol $the_second$;
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 113059L)
    private static SubLSymbol $cached_fi_canonicalize_gaf_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 113943L)
    private static SubLSymbol $assertion_fi_formula_mt_scope$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$CLET;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$_FI_WARNING_;
    private static final SubLSymbol $sym4$_FI_ERROR_;
    private static final SubLSymbol $sym5$FORMAT;
    private static final SubLString $str6$_S;
    private static final SubLSymbol $sym7$_FI_LAST_CONSTANT_;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLString $str10$Bad_function_call_____FI__s__s__s;
    private static final SubLSymbol $sym11$QUOTE;
    private static final SubLSymbol $kw12$QUEUED;
    private static final SubLSymbol $sym13$FI_CREATE;
    private static final SubLSymbol $sym14$FI_FIND_OR_CREATE;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$FI_HYPOTHESIZE;
    private static final SubLList $list18;
    private static final SubLString $str19$HYP;
    private static final SubLSymbol $kw20$GET_WARNING;
    private static final SubLSymbol $sym21$FI_GET_WARNING;
    private static final SubLString $str22$Return_a_description_of_the_warni;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$GET_ERROR;
    private static final SubLSymbol $sym25$FI_GET_ERROR;
    private static final SubLString $str26$Return_a_description_of_the_error;
    private static final SubLSymbol $kw27$FIND;
    private static final SubLSymbol $sym28$FI_FIND;
    private static final SubLList $list29;
    private static final SubLString $str30$Return_the_constant_indentified_b;
    private static final SubLList $list31;
    private static final SubLSymbol $kw32$ARG_ERROR;
    private static final SubLString $str33$Expected_a_string__got__S;
    private static final SubLSymbol $kw34$INVALID_NAME;
    private static final SubLString $str35$_S_is_not_a_valid_name_for_a_cons;
    private static final SubLSymbol $kw36$COMPLETE;
    private static final SubLSymbol $sym37$FI_COMPLETE;
    private static final SubLList $list38;
    private static final SubLString $str39$Return_a_list_of_constants_whose_;
    private static final SubLList $list40;
    private static final SubLSymbol $kw41$CREATE;
    private static final SubLList $list42;
    private static final SubLString $str43$Create_a_new_constant_with_NAME__;
    private static final SubLList $list44;
    private static final SubLSymbol $kw45$UNNAMED;
    private static final SubLSymbol $kw46$NAME_CLASH;
    private static final SubLString $str47$NAME_clash_for__S___renaming_to__;
    private static final SubLString $str48$Expected_an_external_ID__got__S;
    private static final SubLSymbol $kw49$ID_CLASH;
    private static final SubLString $str50$Already_a_constant_with_id__A;
    private static final SubLSymbol $kw51$FIND_OR_CREATE;
    private static final SubLString $str52$Return_constant_with_NAME_if_it_i;
    private static final SubLSymbol $kw53$CREATE_SKOLEM;
    private static final SubLSymbol $sym54$QUEUE_P;
    private static final SubLSymbol $sym55$TL_FUNCTION_TERM_;
    private static final SubLString $str56$Found_a_TL_term_in_skolem__a_defi;
    private static final SubLObject $const57$isa;
    private static final SubLSymbol $kw58$MONOTONIC;
    private static final SubLObject $const59$arityMin;
    private static final SubLObject $const60$arity;
    private static final SubLObject $const61$arg1Isa;
    private static final SubLObject $const62$arg2Isa;
    private static final SubLObject $const63$arg3Isa;
    private static final SubLObject $const64$arg4Isa;
    private static final SubLObject $const65$arg5Isa;
    private static final SubLObject $const66$resultIsa;
    private static final SubLObject $const67$resultIsaArg;
    private static final SubLObject $const68$CollectionDenotingFunction;
    private static final SubLList $list69;
    private static final SubLObject $const70$resultGenl;
    private static final SubLObject $const71$SubcollectionDenotingFunction;
    private static final SubLList $list72;
    private static final SubLObject $const73$resultGenlArg;
    private static final SubLString $str74$SKF__a;
    private static final SubLString $str75$0123456789;
    private static final SubLSymbol $kw76$MERGE;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$FORT_P;
    private static final SubLSymbol $sym79$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const80$EverythingPSC;
    private static final SubLObject $const81$genls;
    private static final SubLObject $const82$termOfUnit;
    private static final SubLSymbol $sym83$SKOLEM_NART_;
    private static final SubLSymbol $sym84$ASSERTION_P;
    private static final SubLSymbol $sym85$SKOLEM_TERM_;
    private static final SubLString $str86$Could_not_merge_assertion_onto_te;
    private static final SubLSymbol $sym87$CONVERT_HL_SUPPORT_TO_FI_SUPPORT;
    private static final SubLSymbol $kw88$KILL;
    private static final SubLSymbol $sym89$FI_KILL;
    private static final SubLList $list90;
    private static final SubLString $str91$Kill_FORT_and_all_its_uses_from_t;
    private static final SubLList $list92;
    private static final SubLString $str93$Constant__S_is_merely_an_empty_sh;
    private static final SubLString $str94$Cannot_kill_core_constant__a___To;
    private static final SubLSymbol $kw95$RENAME;
    private static final SubLSymbol $sym96$FI_RENAME;
    private static final SubLList $list97;
    private static final SubLString $str98$Change_name_of_CONSTANT_to_NAME__;
    private static final SubLString $str99$Expected_a_constant__got__S;
    private static final SubLSymbol $kw100$ALREADY_HAS_NAME;
    private static final SubLString $str101$Constant__S_is_already_named__A;
    private static final SubLSymbol $kw102$LOOKUP;
    private static final SubLSymbol $sym103$FI_LOOKUP;
    private static final SubLList $list104;
    private static final SubLString $str105$Returns_two_values_when_looking_u;
    private static final SubLList $list106;
    private static final SubLString $str107$Expected_a_cons__got__S;
    private static final SubLSymbol $sym108$ASSERTION_FI_FORMULA;
    private static final SubLSymbol $kw109$DEFAULT;
    private static final SubLSymbol $kw110$ASSERT;
    private static final SubLSymbol $sym111$FI_ASSERT;
    private static final SubLList $list112;
    private static final SubLString $str113$Assert_the_FORMULA_in_the_specifi;
    private static final SubLString $str114$Expected__default_or__monotonic__;
    private static final SubLString $str115$Expected_a_direction__got__S;
    private static final SubLObject $const116$True;
    private static final SubLSymbol $kw117$TAUTOLOGY;
    private static final SubLString $str118$Formula______S___in__S_was_a_taut;
    private static final SubLObject $const119$False;
    private static final SubLSymbol $kw120$CONTRADICTION;
    private static final SubLString $str121$Formula______S___in__S_was_a_cont;
    private static final SubLList $list122;
    private static final SubLSymbol $kw123$COULD_NOT_ASSERT;
    private static final SubLString $str124$Unable_to_assert_formula__S__in__;
    private static final SubLSymbol $sym125$ASSERTED_ASSERTION_;
    private static final SubLSymbol $sym126$FAST_SKOLEM_NAT_;
    private static final SubLSymbol $sym127$OPAQUE_ARG_WRT_QUOTING_NOT_COUNTING_LOGICAL_OPS_;
    private static final SubLObject $const128$skolem;
    private static final SubLString $str129$Found_a___skolem_assertion_with_m;
    private static final SubLString $str130$Found_a___skolem_assertion_with_a;
    private static final SubLSymbol $sym131$KBEQ;
    private static final SubLString $str132$Defining_assertions_for__s___s__w;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$CNF_P;
    private static final SubLSymbol $kw135$BACKWARD;
    private static final SubLSymbol $kw136$FORWARD;
    private static final SubLSymbol $kw137$FORMULA_NOT_WELL_FORMED;
    private static final SubLString $str138$Formula______S___was_not_well_for;
    private static final SubLString $str139$Formula______S___was_not_well_for;
    private static final SubLSymbol $kw140$UNINITIALIZED;
    private static final SubLSymbol $kw141$UNCHANGED;
    private static final SubLList $list142;
    private static final SubLSymbol $kw143$FLIPPED;
    private static final SubLSymbol $kw144$NEW;
    private static final SubLSymbol $kw145$REASSERT;
    private static final SubLList $list146;
    private static final SubLSymbol $kw147$ASSERTION_NOT_PRESENT;
    private static final SubLString $str148$Formula__S_in_mt__S_is_not_in_the;
    private static final SubLSymbol $kw149$DENY;
    private static final SubLSymbol $kw150$UNKNOWN;
    private static final SubLSymbol $kw151$UNASSERT;
    private static final SubLSymbol $sym152$FI_UNASSERT;
    private static final SubLString $str153$Remove_the_assertions_canonicaliz;
    private static final SubLString $str154$Sentence______S___in__S_was_a_tau;
    private static final SubLString $str155$Sentence______S___in__S_was_a_con;
    private static final SubLString $str156$Sentence__S_in_mt__S_is_not_in_th;
    private static final SubLSymbol $kw157$ASSERTION_NOT_LOCAL;
    private static final SubLString $str158$Sentence__S_in_mt__S_is_not_local;
    private static final SubLSymbol $kw159$EDIT;
    private static final SubLSymbol $sym160$FI_EDIT;
    private static final SubLList $list161;
    private static final SubLString $str162$Unassert_the_assertions_canonical;
    private static final SubLSymbol $kw163$JUSTIFY;
    private static final SubLList $list164;
    private static final SubLSymbol $sym165$ARGUMENT_TV;
    private static final SubLSymbol $kw166$ADD_ARGUMENT;
    private static final SubLString $str167$Expected_a_support__got__S;
    private static final SubLList $list168;
    private static final SubLString $str169$Expected__forward_or__backward__g;
    private static final SubLSymbol $sym170$DEDUCTION_ASSERTION;
    private static final SubLSymbol $kw171$FALSE;
    private static final SubLList $list172;
    private static final SubLSymbol $kw173$SUPPORT_MALFORMED;
    private static final SubLString $str174$Support__S_was_malformed;
    private static final SubLSymbol $kw175$TRUE;
    private static final SubLSymbol $kw176$SUPPORT_INVALID;
    private static final SubLString $str177$Support__S_is_not_currently_valid;
    private static final SubLSymbol $kw178$REMOVE_ARGUMENT;
    private static final SubLSymbol $sym179$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $kw180$BLAST;
    private static final SubLSymbol $sym181$FI_BLAST;
    private static final SubLString $str182$Remove_all_arguments_for_the_FORM;
    private static final SubLSymbol $kw183$ASK;
    private static final SubLSymbol $sym184$FI_ASK;
    private static final SubLList $list185;
    private static final SubLString $str186$Ask_for_bindings_for_free_variabl;
    private static final SubLList $list187;
    private static final SubLString $str188$Expected_a_formula__got__S;
    private static final SubLList $list189;
    private static final SubLString $str190$Expected_an_integer__got__S;
    private static final SubLObject $const191$ist;
    private static final SubLSymbol $kw192$CONTINUE_LAST_ASK;
    private static final SubLSymbol $sym193$FI_CONTINUE_LAST_ASK;
    private static final SubLList $list194;
    private static final SubLList $list195;
    private static final SubLString $str196$Continue_the_last_ask_that_was_pe;
    private static final SubLSymbol $sym197$FI_CONTINUE_LAST_ASK_INT;
    private static final SubLString $str198$fi_continue_last_ask_int_is_depre;
    private static final SubLString $str199$fi_ask_status_is_deprecated__use_;
    private static final SubLSymbol $sym200$FI_ASK_STATUS;
    private static final SubLList $list201;
    private static final SubLString $str202$Return_a_status_as_to_how_the_las;
    private static final SubLSymbol $sym203$FI_ASK_STATUS_INT;
    private static final SubLString $str204$fi_ask_status_int_is_deprecated__;
    private static final SubLSymbol $kw205$TMS_RECONSIDER_FORMULA;
    private static final SubLSymbol $sym206$FI_TMS_RECONSIDER_FORMULA;
    private static final SubLString $str207$Reconsider_all_arguments_for_FORM;
    private static final SubLSymbol $kw208$TMS_RECONSIDER_MT;
    private static final SubLSymbol $sym209$FI_TMS_RECONSIDER_MT;
    private static final SubLList $list210;
    private static final SubLString $str211$Reconsider_all_arguments_for_all_;
    private static final SubLSymbol $kw212$TMS_RECONSIDER_GAFS;
    private static final SubLSymbol $sym213$FI_TMS_RECONSIDER_GAFS;
    private static final SubLList $list214;
    private static final SubLString $str215$Reconsider_all_arguments_for_all_;
    private static final SubLString $str216$Expected_an_integer_0_5__got__S;
    private static final SubLSymbol $kw217$TMS_RECONSIDER_TERM;
    private static final SubLSymbol $sym218$FI_TMS_RECONSIDER_TERM;
    private static final SubLList $list219;
    private static final SubLString $str220$Reconsider_all_arguments_involvin;
    private static final SubLSymbol $kw221$DENOTATION;
    private static final SubLList $list222;
    private static final SubLSymbol $kw223$TIMESTAMP_CONSTANT;
    private static final SubLList $list224;
    private static final SubLList $list225;
    private static final SubLList $list226;
    private static final SubLList $list227;
    private static final SubLList $list228;
    private static final SubLList $list229;
    private static final SubLSymbol $sym230$CONSTANT_P;
    private static final SubLObject $const231$myCreator;
    private static final SubLObject $const232$myCreationTime;
    private static final SubLObject $const233$myCreationPurpose;
    private static final SubLObject $const234$myCreationSecond;
    private static final SubLSymbol $kw235$STRENGTH;
    private static final SubLSymbol $kw236$DIRECTION;
    private static final SubLObject $const237$BookkeepingMt;
    private static final SubLSymbol $kw238$TIMESTAMP_ASSERTION;
    private static final SubLList $list239;
    private static final SubLSymbol $kw240$REMOVE_TIMESTAMP;
    private static final SubLSymbol $kw241$RENAME_VARIABLES;
    private static final SubLList $list242;
    private static final SubLSymbol $kw243$GET_PARAMETER;
    private static final SubLString $str244$Expected_a_symbol__got__S;
    private static final SubLSymbol $kw245$UNBOUND;
    private static final SubLString $str246$Parameter__S_is_not_bound;
    private static final SubLSymbol $kw247$SET_PARAMETER;
    private static final SubLSymbol $kw248$EVAL;
    private static final SubLSymbol $kw249$LOCAL_EVAL;
    private static final SubLSymbol $kw250$HLMT_NOT_WELL_FORMED;
    private static final SubLString $str251$Microtheory__S____was_not_well_fo;
    private static final SubLString $str252$Expected_a_microtheory__got__S;
    private static final SubLString $str253$Expected_a_term__got__S;
    private static final SubLSymbol $sym254$CAR;
    private static final SubLSymbol $sym255$CDR;
    private static final SubLSymbol $sym256$KB_VAR_LIST_;
    private static final SubLSymbol $kw257$TRUE_MON;
    private static final SubLSymbol $kw258$TRUE_DEF;
    private static final SubLSymbol $kw259$FALSE_MON;
    private static final SubLSymbol $kw260$FALSE_DEF;
    private static final SubLSymbol $sym261$CACHED_FI_CANONICALIZE_GAF;
    private static final SubLSymbol $sym262$_CACHED_FI_CANONICALIZE_GAF_CACHING_STATE_;
    private static final SubLInteger $int263$100;
    private static final SubLList $list264;
    private static final SubLSymbol $sym265$FIRST;
    private static final SubLSymbol $sym266$VARIABLE_P;
    private static final SubLSymbol $sym267$DEFAULT_EL_VAR_FOR_HL_VAR;
    private static final SubLSymbol $sym268$ASSERTION_FI_IST_FORMULA;
    static  boolean assertionsDisabledSync = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 6256L)
    public static SubLObject reset_fi_error_state() {
        reset_fi_error();
        reset_fi_warning();
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 6407L)
    public static SubLObject with_clean_fi_error_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)fi.$sym1$CLET, (SubLObject)fi.$list2, ConsesLow.append(body, (SubLObject)fi.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 6758L)
    public static SubLObject reset_fi_warning() {
        fi.$fi_warning$.setDynamicValue((SubLObject)fi.NIL);
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 7146L)
    public static SubLObject signal_fi_warning(final SubLObject fi_warning) {
        fi.$fi_warning$.setDynamicValue(fi_warning);
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 7240L)
    public static SubLObject fi_warning_signaledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(fi.$fi_warning$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 7312L)
    public static SubLObject fi_get_warning_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return fi.$fi_warning$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 7431L)
    public static SubLObject reset_fi_error() {
        fi.$fi_error$.setDynamicValue((SubLObject)fi.NIL);
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 7676L)
    public static SubLObject signal_fi_error(final SubLObject fi_error) {
        fi.$fi_error$.setDynamicValue(fi_error);
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 7762L)
    public static SubLObject fi_error_signaledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(fi.$fi_error$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 7830L)
    public static SubLObject fi_get_error_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return fi.$fi_error$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 7886L)
    public static SubLObject fi_error_string(final SubLObject fi_error) {
        SubLObject error_string = (SubLObject)fi.NIL;
        if (conses_high.second(fi_error).isString()) {
            error_string = Functions.apply(Symbols.symbol_function((SubLObject)fi.$sym5$FORMAT), (SubLObject)fi.NIL, new SubLObject[] { conses_high.second(fi_error), conses_high.nthcdr((SubLObject)fi.TWO_INTEGER, fi_error) });
        }
        else {
            error_string = PrintLow.format((SubLObject)fi.NIL, (SubLObject)fi.$str6$_S, fi_error.first());
        }
        return error_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 8228L)
    public static SubLObject fi_get_error_string_int() {
        return fi_error_string(fi_get_error_int());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 8383L)
    public static SubLObject set_fi_last_assertions_asserted(final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        czer_vars.$fi_last_assertions_asserted$.setDynamicValue(assertions, thread);
        return czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 8587L)
    public static SubLObject push_fi_last_assertions_asserted(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        czer_vars.$fi_last_assertions_asserted$.setDynamicValue((SubLObject)ConsesLow.cons(assertion, czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread)), thread);
        return czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 8859L)
    public static SubLObject within_fi_operation(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)fi.$sym1$CLET, (SubLObject)fi.$list8, ConsesLow.append(body, (SubLObject)fi.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 8967L)
    public static SubLObject already_within_fi_operationP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return fi.$within_fi_operationP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 9048L)
    public static SubLObject fi(final SubLObject keyword, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8) {
        if (arg1 == fi.UNPROVIDED) {
            arg1 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg2 == fi.UNPROVIDED) {
            arg2 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg3 == fi.UNPROVIDED) {
            arg3 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg4 == fi.UNPROVIDED) {
            arg4 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg5 == fi.UNPROVIDED) {
            arg5 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg6 == fi.UNPROVIDED) {
            arg6 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg7 == fi.UNPROVIDED) {
            arg7 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg8 == fi.UNPROVIDED) {
            arg8 = utilities_macros.$unprovided$.getGlobalValue();
        }
        final SubLObject dispatch_info = conses_high.assoc(keyword, fi.$fi_dispatch_table$.getGlobalValue(), (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = dispatch_info.rest();
        SubLObject fun = (SubLObject)fi.NIL;
        SubLObject int_fun = (SubLObject)fi.NIL;
        SubLObject modifies_kbP = (SubLObject)fi.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list9);
        fun = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list9);
        int_fun = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list9);
        modifies_kbP = current.first();
        current = current.rest();
        if (fi.NIL == current) {
            SubLObject form_to_enqueue = (SubLObject)fi.NIL;
            SubLObject form_to_eval = (SubLObject)fi.NIL;
            if (fi.NIL != fun && fi.NIL != int_fun) {
                form_to_enqueue = fi_construct_form_to_enqueue(fun, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                form_to_eval = list_utilities.replace_nth((SubLObject)fi.ZERO_INTEGER, int_fun, form_to_enqueue);
            }
            else {
                Errors.error((SubLObject)fi.$str10$Bad_function_call_____FI__s__s__s, new SubLObject[] { keyword, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, keyword });
            }
            return fi_1(form_to_enqueue, form_to_eval, modifies_kbP);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)fi.$list9);
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 10088L)
    public static SubLObject fi_construct_form_to_enqueue(final SubLObject fun, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8) {
        if (arg1 == fi.UNPROVIDED) {
            arg1 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg2 == fi.UNPROVIDED) {
            arg2 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg3 == fi.UNPROVIDED) {
            arg3 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg4 == fi.UNPROVIDED) {
            arg4 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg5 == fi.UNPROVIDED) {
            arg5 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg6 == fi.UNPROVIDED) {
            arg6 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg7 == fi.UNPROVIDED) {
            arg7 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg8 == fi.UNPROVIDED) {
            arg8 = utilities_macros.$unprovided$.getGlobalValue();
        }
        SubLObject form_to_enqueue = (SubLObject)fi.NIL;
        if (fi.NIL != utilities_macros.unprovided_argumentP(arg1)) {
            form_to_enqueue = (SubLObject)ConsesLow.list(fun);
        }
        else if (fi.NIL != utilities_macros.unprovided_argumentP(arg2)) {
            form_to_enqueue = (SubLObject)ConsesLow.list(fun, fi_quotify(arg1));
        }
        else if (fi.NIL != utilities_macros.unprovided_argumentP(arg3)) {
            form_to_enqueue = (SubLObject)ConsesLow.list(fun, fi_quotify(arg1), fi_quotify(arg2));
        }
        else if (fi.NIL != utilities_macros.unprovided_argumentP(arg4)) {
            form_to_enqueue = (SubLObject)ConsesLow.list(fun, fi_quotify(arg1), fi_quotify(arg2), fi_quotify(arg3));
        }
        else if (fi.NIL != utilities_macros.unprovided_argumentP(arg5)) {
            form_to_enqueue = (SubLObject)ConsesLow.list(fun, fi_quotify(arg1), fi_quotify(arg2), fi_quotify(arg3), fi_quotify(arg4));
        }
        else if (fi.NIL != utilities_macros.unprovided_argumentP(arg6)) {
            form_to_enqueue = (SubLObject)ConsesLow.list(fun, fi_quotify(arg1), fi_quotify(arg2), fi_quotify(arg3), fi_quotify(arg4), fi_quotify(arg5));
        }
        else if (fi.NIL != utilities_macros.unprovided_argumentP(arg7)) {
            form_to_enqueue = (SubLObject)ConsesLow.list(fun, fi_quotify(arg1), fi_quotify(arg2), fi_quotify(arg3), fi_quotify(arg4), fi_quotify(arg5), fi_quotify(arg6));
        }
        else if (fi.NIL != utilities_macros.unprovided_argumentP(arg8)) {
            form_to_enqueue = (SubLObject)ConsesLow.list(fun, fi_quotify(arg1), fi_quotify(arg2), fi_quotify(arg3), fi_quotify(arg4), fi_quotify(arg5), fi_quotify(arg6), fi_quotify(arg7));
        }
        else {
            form_to_enqueue = (SubLObject)ConsesLow.list(new SubLObject[] { fun, fi_quotify(arg1), fi_quotify(arg2), fi_quotify(arg3), fi_quotify(arg4), fi_quotify(arg5), fi_quotify(arg6), fi_quotify(arg7), fi_quotify(arg8) });
        }
        form_to_enqueue = precanonicalizer.immediate_precanonicalizations(form_to_enqueue);
        return form_to_enqueue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 11831L)
    public static SubLObject fi_quotify(final SubLObject v_object) {
        if (v_object.isKeyword() || v_object == fi.NIL || v_object == fi.T || v_object.isNumber() || v_object.isString()) {
            return v_object;
        }
        return (SubLObject)ConsesLow.list((SubLObject)fi.$sym11$QUOTE, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 12200L)
    public static SubLObject fi_1(final SubLObject form_to_enqueue, final SubLObject form_to_eval, final SubLObject modifies_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (fi.NIL != api_control_vars.$use_local_queueP$.getDynamicValue(thread)) {
            operation_queues.add_to_local_queue(form_to_enqueue, (SubLObject)fi.T);
            return (SubLObject)fi.$kw12$QUEUED;
        }
        SubLObject ans1 = (SubLObject)fi.NIL;
        SubLObject ans2 = (SubLObject)fi.NIL;
        SubLObject ans3 = (SubLObject)fi.NIL;
        SubLObject ans4 = (SubLObject)fi.NIL;
        SubLObject encapsulated_form_to_enqueue = (SubLObject)fi.NIL;
        if (fi.NIL != modifies_kbP && fi.NIL != control_vars.$use_transcriptP$.getDynamicValue(thread)) {
            encapsulated_form_to_enqueue = canon_tl.tl_encapsulate(form_to_enqueue);
        }
        final SubLObject _prev_bind_0 = kb_control_vars.$recording_hl_transcript_operationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_control_vars.$hl_transcript_operations$.currentBinding(thread);
        final SubLObject _prev_bind_3 = fi.$current_fi_op$.currentBinding(thread);
        try {
            kb_control_vars.$recording_hl_transcript_operationsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(fi.NIL != operation_queues.$hl_transcripts_enabledP$.getDynamicValue(thread) && fi.NIL != modifies_kbP && fi.NIL != control_vars.$use_transcriptP$.getDynamicValue(thread)), thread);
            kb_control_vars.$hl_transcript_operations$.bind((SubLObject)fi.NIL, thread);
            fi.$current_fi_op$.bind((fi.NIL != fi.$current_fi_op$.getDynamicValue(thread)) ? fi.$current_fi_op$.getDynamicValue(thread) : form_to_eval.first(), thread);
            thread.resetMultipleValues();
            final SubLObject eval_ans1 = Eval.eval(form_to_eval);
            final SubLObject eval_ans2 = thread.secondMultipleValue();
            final SubLObject eval_ans3 = thread.thirdMultipleValue();
            final SubLObject eval_ans4 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            ans1 = eval_ans1;
            ans2 = eval_ans2;
            ans3 = eval_ans3;
            ans4 = eval_ans4;
            if (fi.NIL == fi_error_signaledP() && fi.NIL != modifies_kbP && fi.NIL != control_vars.$use_transcriptP$.getDynamicValue(thread) && fi.NIL != encapsulated_form_to_enqueue) {
                final SubLObject pcase_var = encapsulated_form_to_enqueue.first();
                if (pcase_var.eql((SubLObject)fi.$sym13$FI_CREATE) || pcase_var.eql((SubLObject)fi.$sym14$FI_FIND_OR_CREATE)) {
                    SubLObject current;
                    final SubLObject datum = current = encapsulated_form_to_enqueue;
                    SubLObject func = (SubLObject)fi.NIL;
                    SubLObject name = (SubLObject)fi.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list15);
                    func = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list15);
                    name = current.first();
                    current = current.rest();
                    final SubLObject external_id = (SubLObject)(current.isCons() ? current.first() : fi.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi.$list15);
                    current = current.rest();
                    if (fi.NIL == current) {
                        if (fi.NIL == external_id || external_id.equal((SubLObject)fi.$list16)) {
                            final SubLObject constant = ans1;
                            encapsulated_form_to_enqueue = (SubLObject)ConsesLow.list(func, name, constants_high.constant_external_id(constant));
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)fi.$list15);
                    }
                }
                else if (pcase_var.eql((SubLObject)fi.$sym17$FI_HYPOTHESIZE)) {
                    SubLObject current;
                    final SubLObject datum = current = encapsulated_form_to_enqueue;
                    SubLObject func = (SubLObject)fi.NIL;
                    SubLObject formula = (SubLObject)fi.NIL;
                    SubLObject mt = (SubLObject)fi.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list18);
                    func = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list18);
                    formula = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list18);
                    mt = current.first();
                    current = current.rest();
                    final SubLObject name_prefix = (SubLObject)(current.isCons() ? current.first() : fi.$str19$HYP);
                    cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi.$list18);
                    current = current.rest();
                    final SubLObject term_external_ids = (SubLObject)(current.isCons() ? current.first() : fi.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi.$list18);
                    current = current.rest();
                    if (fi.NIL == current) {
                        if (fi.NIL == term_external_ids || term_external_ids.equal((SubLObject)fi.$list16)) {
                            SubLObject v_bindings = ans1;
                            if (fi.NIL != v_bindings && fi.NIL == bindings.unification_success_token_p(v_bindings)) {
                                SubLObject cdolist_list_var;
                                v_bindings = (cdolist_list_var = conses_high.copy_tree(v_bindings));
                                SubLObject binding = (SubLObject)fi.NIL;
                                binding = cdolist_list_var.first();
                                while (fi.NIL != cdolist_list_var) {
                                    ConsesLow.rplacd(binding, constants_high.constant_external_id(binding.rest()));
                                    cdolist_list_var = cdolist_list_var.rest();
                                    binding = cdolist_list_var.first();
                                }
                                encapsulated_form_to_enqueue = (SubLObject)ConsesLow.list(func, formula, mt, name_prefix, (SubLObject)ConsesLow.list((SubLObject)fi.$sym11$QUOTE, v_bindings));
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)fi.$list18);
                    }
                }
                possibly_add_to_transcript_queues(encapsulated_form_to_enqueue);
            }
        }
        finally {
            fi.$current_fi_op$.rebind(_prev_bind_3, thread);
            kb_control_vars.$hl_transcript_operations$.rebind(_prev_bind_2, thread);
            kb_control_vars.$recording_hl_transcript_operationsP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(ans1, ans2, ans3, ans4);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 14688L)
    public static SubLObject possibly_add_to_transcript_queues(final SubLObject encapsulated_form_to_enqueue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        operation_queues.add_to_transcript_queue(encapsulated_form_to_enqueue);
        if (fi.NIL != operation_queues.$hl_transcripts_enabledP$.getDynamicValue(thread)) {
            if (fi.NIL != operation_queues.hl_transcript_formP(encapsulated_form_to_enqueue)) {
                operation_queues.add_to_hl_transcript_queue(encapsulated_form_to_enqueue);
            }
            else {
                SubLObject cdolist_list_var = Sequences.nreverse(kb_control_vars.$hl_transcript_operations$.getDynamicValue(thread));
                SubLObject hlop = (SubLObject)fi.NIL;
                hlop = cdolist_list_var.first();
                while (fi.NIL != cdolist_list_var) {
                    hlop = encapsulation.encapsulate(canon_tl.transform_hl_terms_to_tl(encapsulation.encapsulate(hlop)));
                    operation_queues.add_to_hl_transcript_queue(hlop);
                    cdolist_list_var = cdolist_list_var.rest();
                    hlop = cdolist_list_var.first();
                }
            }
            return (SubLObject)fi.T;
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 15451L)
    public static SubLObject safe_fi(final SubLObject keyword, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8) {
        if (arg1 == fi.UNPROVIDED) {
            arg1 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg2 == fi.UNPROVIDED) {
            arg2 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg3 == fi.UNPROVIDED) {
            arg3 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg4 == fi.UNPROVIDED) {
            arg4 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg5 == fi.UNPROVIDED) {
            arg5 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg6 == fi.UNPROVIDED) {
            arg6 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg7 == fi.UNPROVIDED) {
            arg7 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg8 == fi.UNPROVIDED) {
            arg8 = utilities_macros.$unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans1 = (SubLObject)fi.NIL;
        SubLObject ans2 = (SubLObject)fi.NIL;
        SubLObject ans3 = (SubLObject)fi.NIL;
        SubLObject ans4 = (SubLObject)fi.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$use_transcriptP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)fi.NIL, thread);
            control_vars.$use_transcriptP$.bind((SubLObject)fi.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject fi_ans1 = fi(keyword, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            final SubLObject fi_ans2 = thread.secondMultipleValue();
            final SubLObject fi_ans3 = thread.thirdMultipleValue();
            final SubLObject fi_ans4 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            ans1 = fi_ans1;
            ans2 = fi_ans2;
            ans3 = fi_ans3;
            ans4 = fi_ans4;
        }
        finally {
            control_vars.$use_transcriptP$.rebind(_prev_bind_2, thread);
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(ans1, ans2, ans3, ans4);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 15997L)
    public static SubLObject fi_get_warning() {
        return fi((SubLObject)fi.$kw20$GET_WARNING, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 16213L)
    public static SubLObject fi_get_error() {
        return fi((SubLObject)fi.$kw24$GET_ERROR, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 16377L)
    public static SubLObject fi_find(final SubLObject name) {
        return fi((SubLObject)fi.$kw27$FIND, name, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 16561L)
    public static SubLObject fi_find_int(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (!name.isString()) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str33$Expected_a_string__got__S, name));
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL == constant_completion_high.valid_constant_name_p(name)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw34$INVALID_NAME, (SubLObject)fi.$str35$_S_is_not_a_valid_name_for_a_cons, name));
            return (SubLObject)fi.NIL;
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject _prev_bind_0 = fi.$within_fi_operationP$.currentBinding(thread);
        try {
            fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
            final SubLObject constant = constants_high.find_constant(name);
            ans = (SubLObject)((fi.NIL != constant_handles.valid_constantP(constant, (SubLObject)fi.UNPROVIDED)) ? constant : fi.NIL);
        }
        finally {
            fi.$within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 17027L)
    public static SubLObject fi_complete(final SubLObject prefix, SubLObject case_sensitiveP) {
        if (case_sensitiveP == fi.UNPROVIDED) {
            case_sensitiveP = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw36$COMPLETE, prefix, case_sensitiveP, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 17371L)
    public static SubLObject fi_complete_int(final SubLObject prefix, SubLObject case_sensitiveP) {
        if (case_sensitiveP == fi.UNPROVIDED) {
            case_sensitiveP = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (!prefix.isString()) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str33$Expected_a_string__got__S, prefix));
            return (SubLObject)fi.NIL;
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject _prev_bind_0 = fi.$within_fi_operationP$.currentBinding(thread);
        try {
            fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
            final SubLObject constants = ans = constant_completion_high.constant_complete(prefix, case_sensitiveP, (SubLObject)fi.NIL, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
        }
        finally {
            fi.$within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 17798L)
    public static SubLObject fi_create(final SubLObject name, SubLObject external_id) {
        if (external_id == fi.UNPROVIDED) {
            external_id = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw41$CREATE, name, external_id, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 18081L)
    public static SubLObject fi_create_int(SubLObject name, SubLObject external_id) {
        if (external_id == fi.UNPROVIDED) {
            external_id = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (name != fi.$kw45$UNNAMED) {
            if (!name.isString()) {
                signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str33$Expected_a_string__got__S, name));
                return (SubLObject)fi.NIL;
            }
            if (fi.NIL == constant_completion_high.valid_constant_name_p(name)) {
                signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw34$INVALID_NAME, (SubLObject)fi.$str35$_S_is_not_a_valid_name_for_a_cons, name));
                return (SubLObject)fi.NIL;
            }
            if (fi.NIL != constant_completion_high.$require_case_insensitive_name_uniqueness$.getDynamicValue(thread)) {
                final SubLObject name_collision = constant_completion_high.constant_name_case_collision(name);
                if (fi.NIL != name_collision) {
                    final SubLObject new_name = constant_completion_high.uniquify_constant_name(name, (SubLObject)fi.UNPROVIDED);
                    signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw46$NAME_CLASH, (SubLObject)fi.$str47$NAME_clash_for__S___renaming_to__, name, new_name));
                    name = new_name;
                }
            }
        }
        if (fi.NIL != external_id && fi.NIL == constants_high.constant_external_id_p(external_id)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str48$Expected_an_external_ID__got__S, external_id));
            return (SubLObject)fi.NIL;
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject _prev_bind_0 = control_vars.$janus_within_somethingP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = fi.$within_fi_operationP$.currentBinding(thread);
        try {
            control_vars.$janus_within_somethingP$.bind((SubLObject)fi.T, thread);
            fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
            final SubLObject existing_by_name = (SubLObject)(name.isString() ? constants_high.find_constant(name) : fi.NIL);
            final SubLObject existing_by_id = (SubLObject)((fi.NIL != external_id) ? constants_high.find_constant_by_external_id(external_id) : fi.NIL);
            if (fi.NIL == existing_by_name && fi.NIL == external_id) {
                final SubLObject new_external_id = constants_high.make_constant_external_id();
                ans = constants_high.create_constant(name, new_external_id);
                fi.$fi_last_constant$.setDynamicValue(ans, thread);
            }
            else if (fi.NIL == existing_by_name && fi.NIL != external_id && fi.NIL == existing_by_id) {
                ans = constants_high.create_constant(name, external_id);
                fi.$fi_last_constant$.setDynamicValue(ans, thread);
            }
            else if (fi.NIL == existing_by_name && fi.NIL != existing_by_id) {
                ans = handle_id_clash(name, external_id);
            }
            else if (fi.NIL != existing_by_name && fi.NIL != existing_by_id && fi.NIL == kb_utilities.kbeq(existing_by_name, existing_by_id)) {
                ans = handle_id_clash(name, external_id);
            }
            else if (fi.NIL != existing_by_name && fi.NIL != existing_by_id && fi.NIL != kb_utilities.kbeq(existing_by_name, existing_by_id)) {
                ans = existing_by_name;
            }
            else if (fi.NIL != existing_by_name && fi.NIL == existing_by_id && fi.NIL != constants_high.uninstalled_constant_p(existing_by_name)) {
                final SubLObject external_id_to_install = (fi.NIL != external_id) ? external_id : constants_high.make_constant_external_id();
                ans = constants_high.create_constant(name, external_id_to_install);
                fi.$fi_last_constant$.setDynamicValue(ans, thread);
            }
            else if (fi.NIL != existing_by_name && fi.NIL == existing_by_id) {
                final SubLObject new_name2 = constant_completion_high.uniquify_constant_name(name, (SubLObject)fi.UNPROVIDED);
                ans = constants_high.create_constant(new_name2, external_id);
                fi.$fi_last_constant$.setDynamicValue(ans, thread);
                signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw46$NAME_CLASH, (SubLObject)fi.$str47$NAME_clash_for__S___renaming_to__, name, new_name2));
            }
        }
        finally {
            fi.$within_fi_operationP$.rebind(_prev_bind_2, thread);
            control_vars.$janus_within_somethingP$.rebind(_prev_bind_0, thread);
        }
        janus.janus_note_create_finished(ans);
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 22468L)
    public static SubLObject handle_id_clash(final SubLObject new_name, final SubLObject common_id) {
        signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw49$ID_CLASH, (SubLObject)fi.$str50$Already_a_constant_with_id__A, common_id));
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 22655L)
    public static SubLObject fi_find_or_create(final SubLObject name, SubLObject external_id) {
        if (external_id == fi.UNPROVIDED) {
            external_id = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw51$FIND_OR_CREATE, name, external_id, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 23059L)
    public static SubLObject fi_find_or_create_int(final SubLObject name, SubLObject external_id) {
        if (external_id == fi.UNPROVIDED) {
            external_id = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (!name.isString()) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str33$Expected_a_string__got__S, name));
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL == constant_completion_high.valid_constant_name_p(name)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw34$INVALID_NAME, (SubLObject)fi.$str35$_S_is_not_a_valid_name_for_a_cons, name));
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL != external_id && fi.NIL == constants_high.constant_external_id_p(external_id)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str48$Expected_an_external_ID__got__S, external_id));
            return (SubLObject)fi.NIL;
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject _prev_bind_0 = fi.$within_fi_operationP$.currentBinding(thread);
        try {
            fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
            ans = fi_find_int(name);
            if (fi.NIL != fi_error_signaledP()) {
                ans = (SubLObject)fi.NIL;
            }
            else if (fi.NIL == ans) {
                ans = fi_create_int(name, external_id);
            }
        }
        finally {
            fi.$within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 23847L)
    public static SubLObject fi_create_skolem(final SubLObject external_id, final SubLObject unreified_sk_term, final SubLObject mt, final SubLObject cnfs, final SubLObject arg_types) {
        return fi((SubLObject)fi.$kw53$CREATE_SKOLEM, external_id, unreified_sk_term, hlmt_czer.canonicalize_hlmt(mt), cnfs, arg_types, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 24082L)
    public static SubLObject fi_create_skolem_int(final SubLObject external_id, final SubLObject unreified_sk_term, SubLObject mt, SubLObject cnfs, SubLObject arg_types) {
        if (arg_types == fi.UNPROVIDED) {
            arg_types = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (fi.NIL == constants_high.constant_external_id_p(external_id)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str48$Expected_an_external_ID__got__S, external_id));
            return (SubLObject)fi.NIL;
        }
        mt = fi_convert_to_assert_hlmt_if_wft(mt);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        SubLObject sk_constant = (SubLObject)fi.NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert fi.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$1 = fi.$within_fi_operationP$.currentBinding(thread);
            try {
                fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
                sk_constant = fi_create_int(new_skolem_name(external_id), external_id);
                if (fi.NIL != constant_handles.constant_p(sk_constant)) {
                    SubLObject cdolist_list_var;
                    final SubLObject tl_nats = cdolist_list_var = list_utilities.tree_gather(cnfs, (SubLObject)fi.$sym55$TL_FUNCTION_TERM_, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
                    SubLObject tl_nat = (SubLObject)fi.NIL;
                    tl_nat = cdolist_list_var.first();
                    while (fi.NIL != cdolist_list_var) {
                        czer_main.canonicalize_term_assert(tl_nat, (SubLObject)fi.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        tl_nat = cdolist_list_var.first();
                    }
                    cnfs = canon_tl.transform_tl_terms_to_hl(cnfs);
                    if (fi.NIL != list_utilities.tree_find_if((SubLObject)fi.$sym55$TL_FUNCTION_TERM_, cnfs, (SubLObject)fi.UNPROVIDED)) {
                        Errors.warn((SubLObject)fi.$str56$Found_a_TL_term_in_skolem__a_defi, external_id, cnfs);
                    }
                    final SubLObject args = conses_high.second(unreified_sk_term);
                    final SubLObject seqvar = skolems.skolem_seqvar(unreified_sk_term);
                    final SubLObject arity_min = Sequences.length(args);
                    final SubLObject key = skolems.skolem_hash_key(arity_min, cnfs);
                    final SubLObject sk_defn = skolems.make_sk_defn(sk_constant, unreified_sk_term, mt, cnfs);
                    final SubLObject sk_col = skolems.skolem_collection(unreified_sk_term);
                    fi_assert_int((SubLObject)ConsesLow.list(fi.$const57$isa, sk_constant, sk_col), mt, (SubLObject)fi.$kw58$MONOTONIC, (SubLObject)fi.UNPROVIDED);
                    if (fi.NIL != seqvar) {
                        fi_assert_int((SubLObject)ConsesLow.list(fi.$const59$arityMin, sk_constant, arity_min), mt, (SubLObject)fi.$kw58$MONOTONIC, (SubLObject)fi.UNPROVIDED);
                    }
                    else {
                        fi_assert_int((SubLObject)ConsesLow.list(fi.$const60$arity, sk_constant, arity_min), mt, (SubLObject)fi.$kw58$MONOTONIC, (SubLObject)fi.UNPROVIDED);
                    }
                    fi_skolem_assert_arg_isas(sk_constant, args, arg_types, mt);
                    fi_skolem_assert_result_types(sk_constant, cnfs, mt);
                    skolems.add_skolem_defn(sk_defn, key);
                }
                else {
                    signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw49$ID_CLASH, (SubLObject)fi.$str50$Already_a_constant_with_id__A, external_id));
                }
            }
            finally {
                fi.$within_fi_operationP$.rebind(_prev_bind_0_$1, thread);
            }
            if (fi.NIL != fi_error_signaledP()) {
                sk_constant = (SubLObject)fi.NIL;
            }
            if (fi.NIL == fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
        }
        finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return sk_constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 26357L)
    public static SubLObject fi_skolem_assert_arg_isas(final SubLObject sk_constant, final SubLObject args, final SubLObject arg_types, final SubLObject mt) {
        final SubLObject arg1_isa = conses_high.assoc(args.first(), arg_types, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED).rest();
        final SubLObject arg2_isa = conses_high.assoc(conses_high.second(args), arg_types, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED).rest();
        final SubLObject arg3_isa = conses_high.assoc(conses_high.third(args), arg_types, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED).rest();
        final SubLObject arg4_isa = conses_high.assoc(conses_high.fourth(args), arg_types, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED).rest();
        final SubLObject arg5_isa = conses_high.assoc(conses_high.fifth(args), arg_types, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED).rest();
        SubLObject cdolist_list_var = arg1_isa;
        SubLObject col = (SubLObject)fi.NIL;
        col = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            fi_assert_int((SubLObject)ConsesLow.list(fi.$const61$arg1Isa, sk_constant, col), mt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        cdolist_list_var = arg2_isa;
        col = (SubLObject)fi.NIL;
        col = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            fi_assert_int((SubLObject)ConsesLow.list(fi.$const62$arg2Isa, sk_constant, col), mt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        cdolist_list_var = arg3_isa;
        col = (SubLObject)fi.NIL;
        col = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            fi_assert_int((SubLObject)ConsesLow.list(fi.$const63$arg3Isa, sk_constant, col), mt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        cdolist_list_var = arg4_isa;
        col = (SubLObject)fi.NIL;
        col = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            fi_assert_int((SubLObject)ConsesLow.list(fi.$const64$arg4Isa, sk_constant, col), mt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        cdolist_list_var = arg5_isa;
        col = (SubLObject)fi.NIL;
        col = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            fi_assert_int((SubLObject)ConsesLow.list(fi.$const65$arg5Isa, sk_constant, col), mt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 27165L)
    public static SubLObject fi_skolem_assert_result_types(final SubLObject sk_constant, final SubLObject cnfs, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result_isas = skolems.skolem_result_types_from_cnfs(skolems.sk_defn_var(), cnfs, mt, (SubLObject)fi.UNPROVIDED);
        final SubLObject result_isa_args = thread.secondMultipleValue();
        final SubLObject result_genls = thread.thirdMultipleValue();
        final SubLObject result_genl_args = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = result_isas;
        SubLObject col = (SubLObject)fi.NIL;
        col = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            fi_assert_int((SubLObject)ConsesLow.list(fi.$const66$resultIsa, sk_constant, col), mt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        cdolist_list_var = result_isa_args;
        SubLObject argnum = (SubLObject)fi.NIL;
        argnum = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            fi_assert_int((SubLObject)ConsesLow.list(fi.$const67$resultIsaArg, sk_constant, argnum), mt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            argnum = cdolist_list_var.first();
        }
        if (fi.NIL != result_genls && fi.NIL == isa.isaP(sk_constant, fi.$const68$CollectionDenotingFunction, mt, (SubLObject)fi.UNPROVIDED)) {
            fi_assert_int((SubLObject)ConsesLow.listS(fi.$const57$isa, sk_constant, (SubLObject)fi.$list69), mt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
        }
        cdolist_list_var = result_genls;
        col = (SubLObject)fi.NIL;
        col = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            fi_assert_int((SubLObject)ConsesLow.list(fi.$const70$resultGenl, sk_constant, col), mt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        if (fi.NIL != result_genl_args && fi.NIL == isa.isaP(sk_constant, fi.$const71$SubcollectionDenotingFunction, mt, (SubLObject)fi.UNPROVIDED)) {
            fi_assert_int((SubLObject)ConsesLow.listS(fi.$const57$isa, sk_constant, (SubLObject)fi.$list72), mt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
        }
        cdolist_list_var = result_genl_args;
        argnum = (SubLObject)fi.NIL;
        argnum = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            fi_assert_int((SubLObject)ConsesLow.list(fi.$const73$resultGenlArg, sk_constant, argnum), mt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            argnum = cdolist_list_var.first();
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 28152L)
    public static SubLObject new_skolem_name(final SubLObject basis) {
        if (basis.isString()) {
            return PrintLow.format((SubLObject)fi.NIL, (SubLObject)fi.$str74$SKF__a, basis);
        }
        if (basis.isInteger()) {
            return PrintLow.format((SubLObject)fi.NIL, (SubLObject)fi.$str74$SKF__a, basis);
        }
        return new_skolem_name(next_random_basis_for_skolem_name());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 28567L)
    public static SubLObject next_random_basis_for_skolem_name() {
        return new_random_basis_for_skolem_name();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 28943L)
    public static SubLObject new_random_basis_for_skolem_name() {
        final SubLObject random_string = Strings.make_string((SubLObject)fi.TEN_INTEGER, (SubLObject)Characters.CHAR_0);
        SubLObject i;
        for (i = (SubLObject)fi.NIL, i = (SubLObject)fi.ZERO_INTEGER; i.numL((SubLObject)fi.TEN_INTEGER); i = Numbers.add(i, (SubLObject)fi.ONE_INTEGER)) {
            Strings.set_char(random_string, i, Strings.sublisp_char((SubLObject)fi.$str75$0123456789, random.random((SubLObject)fi.TEN_INTEGER)));
        }
        return random_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 29160L)
    public static SubLObject fi_merge(final SubLObject kill_term, final SubLObject keep_term) {
        return fi((SubLObject)fi.$kw76$MERGE, kill_term, keep_term, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 29576L)
    public static SubLObject fi_merge_int(SubLObject kill_term, SubLObject keep_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        kill_term = fi_convert_to_fort(kill_term);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        keep_term = fi_convert_to_fort(keep_term);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL != kb_utilities.kbeq(keep_term, kill_term)) {
            signal_fi_warning((SubLObject)fi.$list77);
            return (SubLObject)fi.NIL;
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert fi.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        final SubLObject _prev_bind_2 = fi.$within_fi_operationP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = control_vars.$within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)fi.T, thread);
            control_vars.$within_assert$.bind((SubLObject)fi.NIL, thread);
            wff_utilities.$check_arg_typesP$.bind((SubLObject)fi.NIL, thread);
            at_vars.$at_check_arg_typesP$.bind((SubLObject)fi.NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind((SubLObject)fi.NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind((SubLObject)fi.NIL, thread);
            wff_utilities.$check_var_typesP$.bind((SubLObject)fi.NIL, thread);
            czer_vars.$simplify_literalP$.bind((SubLObject)fi.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)fi.NIL, thread);
            at_vars.$at_check_arg_formatP$.bind((SubLObject)fi.NIL, thread);
            wff_vars.$validate_constantsP$.bind((SubLObject)fi.NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)fi.T, thread);
            ans = merge_fort_recursive(kill_term, keep_term);
        }
        finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_14, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_13, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_12, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_11, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_10, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_9, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_8, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_7, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_5, thread);
            control_vars.$within_assert$.rebind(_prev_bind_4, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_3, thread);
            fi.$within_fi_operationP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 30484L)
    public static SubLObject merge_fort_recursive(final SubLObject kill_term, final SubLObject keep_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert fi.NIL != forts.fort_p(kill_term) : kill_term;
        assert fi.NIL != forts.fort_p(keep_term) : keep_term;
        SubLObject cdolist_list_var = czer_utilities.all_term_opaque_deductions(kill_term);
        SubLObject opaque_deduction = (SubLObject)fi.NIL;
        opaque_deduction = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            if (fi.NIL != deduction_handles.valid_deductionP(opaque_deduction, (SubLObject)fi.UNPROVIDED)) {
                final SubLObject assertion = deductions_high.deduction_assertion(opaque_deduction);
                final SubLObject cnf = assertions_high.assertion_cnf(assertion);
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                final SubLObject supports = deductions_high.deduction_supports(opaque_deduction);
                hl_storage_modules.hl_remove_deduction(cnf, mt, supports);
            }
            cdolist_list_var = cdolist_list_var.rest();
            opaque_deduction = cdolist_list_var.first();
        }
        cdolist_list_var = czer_utilities.all_term_opaque_assertions(kill_term);
        SubLObject opaque_assertion = (SubLObject)fi.NIL;
        opaque_assertion = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            if (fi.NIL != assertion_handles.valid_assertionP(opaque_assertion, (SubLObject)fi.UNPROVIDED) && fi.NIL == assertions_high.meta_assertionP(opaque_assertion)) {
                final SubLObject cnf2 = assertions_high.assertion_cnf(opaque_assertion);
                final SubLObject mt2 = assertions_high.assertion_mt(opaque_assertion);
                hl_storage_modules.hl_remove_all_arguments(cnf2, mt2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            opaque_assertion = cdolist_list_var.first();
        }
        merge_dependent_narts(kill_term, keep_term);
        merge_dependent_kb_hl_supports(kill_term, keep_term);
        final SubLObject _prev_bind_0 = fi.$merge_fort_assertion_map$.currentBinding(thread);
        try {
            fi.$merge_fort_assertion_map$.bind(make_merge_fort_assertion_map(kb_indexing.num_index(kill_term)), thread);
            SubLObject isa_assertions = (SubLObject)fi.NIL;
            SubLObject genls_assertions = (SubLObject)fi.NIL;
            SubLObject tou_assertions = (SubLObject)fi.NIL;
            SubLObject arg1_assertions = (SubLObject)fi.NIL;
            SubLObject all_term_assertions = (SubLObject)fi.NIL;
            SubLObject skolem_assertions = (SubLObject)fi.NIL;
            final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)fi.$sym79$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(fi.$const80$EverythingPSC, thread);
                isa_assertions = kb_mapping.gather_gaf_arg_index(kill_term, (SubLObject)fi.ONE_INTEGER, fi.$const57$isa, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
                genls_assertions = kb_mapping.gather_gaf_arg_index(kill_term, (SubLObject)fi.ONE_INTEGER, fi.$const81$genls, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
                tou_assertions = kb_mapping.gather_gaf_arg_index(kill_term, (SubLObject)fi.ONE_INTEGER, fi.$const82$termOfUnit, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
                arg1_assertions = kb_mapping.gather_gaf_arg_index(kill_term, (SubLObject)fi.ONE_INTEGER, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
                SubLObject cdolist_list_var2;
                all_term_assertions = (cdolist_list_var2 = kb_accessors.all_term_assertions(kill_term, (SubLObject)fi.T));
                SubLObject assertion2 = (SubLObject)fi.NIL;
                assertion2 = cdolist_list_var2.first();
                while (fi.NIL != cdolist_list_var2) {
                    if (fi.NIL != list_utilities.tree_find_if((SubLObject)fi.$sym83$SKOLEM_NART_, assertions_high.assertion_formula(assertion2), (SubLObject)fi.UNPROVIDED)) {
                        skolem_assertions = (SubLObject)ConsesLow.cons(assertion2, skolem_assertions);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    assertion2 = cdolist_list_var2.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$2, thread);
            }
            all_term_assertions = conses_high.nset_difference(all_term_assertions, arg1_assertions, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            all_term_assertions = conses_high.nset_difference(all_term_assertions, skolem_assertions, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            arg1_assertions = conses_high.nset_difference(arg1_assertions, tou_assertions, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            arg1_assertions = conses_high.nset_difference(arg1_assertions, genls_assertions, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            arg1_assertions = conses_high.nset_difference(arg1_assertions, isa_assertions, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            arg1_assertions = conses_high.nset_difference(arg1_assertions, skolem_assertions, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            SubLObject processed_el_formula_mt_pairs = (SubLObject)fi.NIL;
            final SubLObject kill_term_el_formula = (fi.NIL != nart_handles.nart_p(kill_term)) ? narts_high.nart_el_formula(kill_term) : kill_term;
            SubLObject cdolist_list_var2 = skolem_assertions;
            SubLObject assertion2 = (SubLObject)fi.NIL;
            assertion2 = cdolist_list_var2.first();
            while (fi.NIL != cdolist_list_var2) {
                thread.resetMultipleValues();
                final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion2);
                final SubLObject assertion_el_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject assertion_el_formula_mt_pair = (SubLObject)ConsesLow.list(assertion_el_formula, assertion_el_mt);
                if (fi.NIL == subl_promotions.memberP(assertion_el_formula_mt_pair, processed_el_formula_mt_pairs, Symbols.symbol_function((SubLObject)fi.EQUAL), (SubLObject)fi.UNPROVIDED) && fi.NIL != skolems.skolem_defining_assertionP(assertion2)) {
                    processed_el_formula_mt_pairs = (SubLObject)ConsesLow.cons(assertion_el_formula_mt_pair, processed_el_formula_mt_pairs);
                    final SubLObject new_formula = list_utilities.tree_substitute(assertion_el_formula, kill_term_el_formula, keep_term);
                    final SubLObject new_mt = cycl_utilities.expression_subst(keep_term, kill_term_el_formula, assertion_el_mt, Symbols.symbol_function((SubLObject)fi.EQUAL), (SubLObject)fi.UNPROVIDED);
                    final SubLObject asserted_argument = assertions_high.get_asserted_argument(assertion2);
                    substitute_asserted_argument(new_formula, new_mt, asserted_argument, assertion2);
                    add_merge_fort_assertion_mapping(new_formula, new_mt, assertion2);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                assertion2 = cdolist_list_var2.first();
            }
            SubLObject cdolist_list_var3 = isa_assertions;
            SubLObject assertion3 = (SubLObject)fi.NIL;
            assertion3 = cdolist_list_var3.first();
            while (fi.NIL != cdolist_list_var3) {
                substitute_assertion(keep_term, kill_term, assertion3, (SubLObject)fi.NIL);
                cdolist_list_var3 = cdolist_list_var3.rest();
                assertion3 = cdolist_list_var3.first();
            }
            cdolist_list_var3 = genls_assertions;
            assertion3 = (SubLObject)fi.NIL;
            assertion3 = cdolist_list_var3.first();
            while (fi.NIL != cdolist_list_var3) {
                substitute_assertion(keep_term, kill_term, assertion3, (SubLObject)fi.NIL);
                cdolist_list_var3 = cdolist_list_var3.rest();
                assertion3 = cdolist_list_var3.first();
            }
            cdolist_list_var3 = arg1_assertions;
            assertion3 = (SubLObject)fi.NIL;
            assertion3 = cdolist_list_var3.first();
            while (fi.NIL != cdolist_list_var3) {
                substitute_assertion(keep_term, kill_term, assertion3, (SubLObject)fi.NIL);
                cdolist_list_var3 = cdolist_list_var3.rest();
                assertion3 = cdolist_list_var3.first();
            }
            SubLObject max_term_order = (SubLObject)fi.ZERO_INTEGER;
            final SubLObject term_order_map = Hashtables.make_hash_table(Sequences.length(all_term_assertions), (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            cdolist_list_var2 = all_term_assertions;
            assertion2 = (SubLObject)fi.NIL;
            assertion2 = cdolist_list_var2.first();
            while (fi.NIL != cdolist_list_var2) {
                final SubLObject term_order = kb_utilities.term_order(assertion2);
                Hashtables.sethash(assertion2, term_order_map, term_order);
                if (term_order.numG(max_term_order)) {
                    max_term_order = term_order;
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                assertion2 = cdolist_list_var2.first();
            }
            SubLObject cur_term_order_1;
            SubLObject cur_term_order;
            SubLObject cdolist_list_var4;
            SubLObject assertion4;
            for (cur_term_order_1 = (SubLObject)fi.NIL, cur_term_order_1 = (SubLObject)fi.ZERO_INTEGER; cur_term_order_1.numL(max_term_order); cur_term_order_1 = Numbers.add(cur_term_order_1, (SubLObject)fi.ONE_INTEGER)) {
                cur_term_order = Numbers.add((SubLObject)fi.ONE_INTEGER, cur_term_order_1);
                cdolist_list_var4 = all_term_assertions;
                assertion4 = (SubLObject)fi.NIL;
                assertion4 = cdolist_list_var4.first();
                while (fi.NIL != cdolist_list_var4) {
                    if (cur_term_order.eql(Hashtables.gethash(assertion4, term_order_map, (SubLObject)fi.UNPROVIDED))) {
                        substitute_assertion(keep_term, kill_term, assertion4, (SubLObject)fi.NIL);
                    }
                    cdolist_list_var4 = cdolist_list_var4.rest();
                    assertion4 = cdolist_list_var4.first();
                }
            }
            cdolist_list_var3 = tou_assertions;
            assertion3 = (SubLObject)fi.NIL;
            assertion3 = cdolist_list_var3.first();
            while (fi.NIL != cdolist_list_var3) {
                substitute_termofunit_assertion(keep_term, kill_term, assertion3, (SubLObject)fi.NIL);
                cdolist_list_var3 = cdolist_list_var3.rest();
                assertion3 = cdolist_list_var3.first();
            }
        }
        finally {
            fi.$merge_fort_assertion_map$.rebind(_prev_bind_0, thread);
        }
        fi_kill_int(kill_term);
        forward.perform_forward_inference();
        return keep_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 35946L)
    public static SubLObject merge_dependent_narts(final SubLObject kill_term, final SubLObject keep_term) {
        SubLObject cdolist_list_var;
        final SubLObject kill_nats = cdolist_list_var = indexing_utilities.dependent_narts(kill_term);
        SubLObject kill_nat = (SubLObject)fi.NIL;
        kill_nat = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            if (fi.NIL == term.skolem_nartP(kill_nat)) {
                final SubLObject kill_nart_el_formula = narts_high.nart_el_formula(kill_nat);
                if (fi.NIL != kill_nart_el_formula) {
                    final SubLObject keep_nart_el_formula = conses_high.subst(keep_term, kill_term, kill_nart_el_formula, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
                    final SubLObject keep_nat = czer_main.cyc_find_or_create_nart(keep_nart_el_formula, (SubLObject)fi.UNPROVIDED);
                    if (fi.NIL != nart_handles.nart_p(keep_nat)) {
                        merge_fort_recursive(kill_nat, keep_nat);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            kill_nat = cdolist_list_var.first();
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 36676L)
    public static SubLObject merge_dependent_kb_hl_supports(final SubLObject kill_term, final SubLObject keep_term) {
        SubLObject cdolist_list_var;
        final SubLObject kb_hl_supports = cdolist_list_var = kb_hl_supports_high.find_kb_hl_supports_mentioning_term(kill_term);
        SubLObject kb_hl_support = (SubLObject)fi.NIL;
        kb_hl_support = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            final SubLObject kill_hl_support = kb_hl_supports_high.kb_hl_support_hl_support(kb_hl_support);
            final SubLObject keep_hl_support = conses_high.subst(keep_term, kill_term, kill_hl_support, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            final SubLObject justification = kb_hl_supports_high.kb_hl_support_justification(kb_hl_support);
            kb_hl_supports_high.find_or_create_kb_hl_support(keep_hl_support, justification);
            cdolist_list_var = cdolist_list_var.rest();
            kb_hl_support = cdolist_list_var.first();
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 37152L)
    public static SubLObject substitute_assertion(final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_assertion, final SubLObject remove_source_argumentsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert fi.NIL != forts.fort_p(keep_term) : keep_term;
        assert fi.NIL != forts.fort_p(kill_term) : kill_term;
        assert fi.NIL != assertion_handles.assertion_p(source_assertion) : source_assertion;
        if (fi.NIL != assertions_high.valid_assertion(source_assertion, (SubLObject)fi.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject old_el_formula = uncanonicalizer.assertion_el_formula(source_assertion);
            final SubLObject old_el_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject kill_term_el_formula = (fi.NIL != nart_handles.nart_p(kill_term)) ? narts_high.nart_el_formula(kill_term) : kill_term;
            SubLObject new_el_formula = cycl_utilities.expression_subst(keep_term, kill_term_el_formula, old_el_formula, Symbols.symbol_function((SubLObject)fi.EQUAL), (SubLObject)fi.UNPROVIDED);
            final SubLObject new_el_mt = cycl_utilities.expression_subst(keep_term, kill_term_el_formula, old_el_mt, Symbols.symbol_function((SubLObject)fi.EQUAL), (SubLObject)fi.UNPROVIDED);
            if (fi.NIL != assertion_utilities.meta_assertion_p(source_assertion) && fi.NIL != merge_fort_assertion_map_validP()) {
                final SubLObject old_hl_formula = assertion_hl_formula(source_assertion, (SubLObject)fi.UNPROVIDED);
                SubLObject cdolist_list_var = list_utilities.find_all_if((SubLObject)fi.$sym84$ASSERTION_P, old_hl_formula, (SubLObject)fi.UNPROVIDED);
                SubLObject sub_assertion = (SubLObject)fi.NIL;
                sub_assertion = cdolist_list_var.first();
                while (fi.NIL != cdolist_list_var) {
                    final SubLObject new_sub_assertion = get_merge_fort_assertion_mapping(sub_assertion);
                    if (fi.NIL != assertion_handles.assertion_p(new_sub_assertion)) {
                        final SubLObject sub_assertion_el_formula = uncanonicalizer.assertion_el_formula(sub_assertion);
                        final SubLObject new_sub_assertion_el_formula = uncanonicalizer.assertion_el_formula(new_sub_assertion);
                        new_el_formula = conses_high.subst(new_sub_assertion_el_formula, sub_assertion_el_formula, new_el_formula, Symbols.symbol_function((SubLObject)fi.EQUAL), (SubLObject)fi.UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_assertion = cdolist_list_var.first();
                }
            }
            if (fi.NIL != list_utilities.tree_find_if((SubLObject)fi.$sym85$SKOLEM_TERM_, new_el_formula, (SubLObject)fi.UNPROVIDED) || fi.NIL != list_utilities.tree_find_if((SubLObject)fi.$sym85$SKOLEM_TERM_, new_el_mt, (SubLObject)fi.UNPROVIDED)) {
                Errors.warn((SubLObject)fi.$str86$Could_not_merge_assertion_onto_te, keep_term, source_assertion);
                return (SubLObject)fi.NIL;
            }
            SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
            SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
            SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
            SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
            SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
            SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
            SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            try {
                control_vars.$within_assert$.bind((SubLObject)fi.NIL, thread);
                wff_utilities.$check_arg_typesP$.bind((SubLObject)fi.NIL, thread);
                at_vars.$at_check_arg_typesP$.bind((SubLObject)fi.NIL, thread);
                wff_utilities.$check_wff_semanticsP$.bind((SubLObject)fi.NIL, thread);
                wff_utilities.$check_wff_coherenceP$.bind((SubLObject)fi.NIL, thread);
                wff_utilities.$check_var_typesP$.bind((SubLObject)fi.NIL, thread);
                czer_vars.$simplify_literalP$.bind((SubLObject)fi.NIL, thread);
                at_vars.$at_check_relator_constraintsP$.bind((SubLObject)fi.NIL, thread);
                at_vars.$at_check_arg_formatP$.bind((SubLObject)fi.NIL, thread);
                wff_vars.$validate_constantsP$.bind((SubLObject)fi.NIL, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)fi.T, thread);
                SubLObject cdolist_list_var2 = assertions_high.assertion_arguments(source_assertion);
                SubLObject source_argument = (SubLObject)fi.NIL;
                source_argument = cdolist_list_var2.first();
                while (fi.NIL != cdolist_list_var2) {
                    if (fi.NIL != arguments.asserted_argument_p(source_argument)) {
                        substitute_asserted_argument(new_el_formula, new_el_mt, source_argument, source_assertion);
                    }
                    else if (fi.NIL != deduction_handles.deduction_p(source_argument)) {
                        substitute_deduction(new_el_formula, new_el_mt, keep_term, kill_term, source_argument, source_assertion);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    source_argument = cdolist_list_var2.first();
                }
                substitute_dependents(new_el_formula, new_el_mt, keep_term, kill_term, source_assertion);
            }
            finally {
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                control_vars.$within_assert$.rebind(_prev_bind_0, thread);
            }
            add_merge_fort_assertion_mapping(new_el_formula, new_el_mt, source_assertion);
            _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
            _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
            _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
            _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
            _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
            _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
            _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            try {
                control_vars.$within_assert$.bind((SubLObject)fi.NIL, thread);
                wff_utilities.$check_arg_typesP$.bind((SubLObject)fi.NIL, thread);
                at_vars.$at_check_arg_typesP$.bind((SubLObject)fi.NIL, thread);
                wff_utilities.$check_wff_semanticsP$.bind((SubLObject)fi.NIL, thread);
                wff_utilities.$check_wff_coherenceP$.bind((SubLObject)fi.NIL, thread);
                wff_utilities.$check_var_typesP$.bind((SubLObject)fi.NIL, thread);
                czer_vars.$simplify_literalP$.bind((SubLObject)fi.NIL, thread);
                at_vars.$at_check_relator_constraintsP$.bind((SubLObject)fi.NIL, thread);
                at_vars.$at_check_arg_formatP$.bind((SubLObject)fi.NIL, thread);
                wff_vars.$validate_constantsP$.bind((SubLObject)fi.NIL, thread);
                system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)fi.T, thread);
                if (fi.NIL != remove_source_argumentsP) {
                    SubLObject cdolist_list_var2 = assertions_high.assertion_arguments(source_assertion);
                    SubLObject source_argument = (SubLObject)fi.NIL;
                    source_argument = cdolist_list_var2.first();
                    while (fi.NIL != cdolist_list_var2) {
                        tms.tms_remove_argument(source_argument, source_assertion, (SubLObject)fi.UNPROVIDED);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        source_argument = cdolist_list_var2.first();
                    }
                }
            }
            finally {
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                control_vars.$within_assert$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 39917L)
    public static SubLObject substitute_asserted_argument(final SubLObject new_formula, final SubLObject new_mt, final SubLObject source_argument, final SubLObject source_assertion) {
        final SubLObject strength = arguments.argument_strength(source_argument);
        final SubLObject direction = assertions_high.assertion_direction(source_assertion);
        final SubLObject timestampedP = assertions_low.asserted_assertion_timestampedP(source_assertion);
        SubLObject who = (SubLObject)fi.NIL;
        SubLObject when = (SubLObject)fi.NIL;
        SubLObject why = (SubLObject)fi.NIL;
        SubLObject second = (SubLObject)fi.NIL;
        if (fi.NIL != timestampedP) {
            who = assertions_high.asserted_by(source_assertion);
            when = assertions_high.asserted_when(source_assertion);
            why = assertions_high.asserted_why(source_assertion);
            second = assertions_high.asserted_second(source_assertion);
        }
        fi_assert_int(new_formula, new_mt, strength, direction);
        if (fi.NIL != timestampedP) {
            fi_timestamp_assertion_int(who, when, why, second);
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 40642L)
    public static SubLObject substitute_deduction(final SubLObject new_formula, final SubLObject new_mt, final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_deduction, final SubLObject source_assertion) {
        if (fi.NIL != deduction_handles.valid_deduction(source_deduction, (SubLObject)fi.UNPROVIDED)) {
            final SubLObject direction = assertions_high.assertion_direction(source_assertion);
            final SubLObject old_supports = deductions_high.deduction_supports(source_deduction);
            final SubLObject new_supports = conses_high.subst(keep_term, kill_term, old_supports, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            final SubLObject new_el_supports = Mapping.mapcar(Symbols.symbol_function((SubLObject)fi.$sym87$CONVERT_HL_SUPPORT_TO_FI_SUPPORT), new_supports);
            fi_add_argument_int(new_formula, new_mt, new_el_supports, direction, (SubLObject)fi.UNPROVIDED);
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 41147L)
    public static SubLObject substitute_dependents(final SubLObject new_formula, final SubLObject new_mt, final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_assertion) {
        final SubLObject new_assertion = sentence_assertions(new_formula, new_mt).first();
        if (fi.NIL != assertion_handles.assertion_p(new_assertion)) {
            substitute_dependent_assertion(new_assertion, keep_term, kill_term, source_assertion);
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 41464L)
    public static SubLObject substitute_dependent_assertion(final SubLObject new_assertion, final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_assertion) {
        SubLObject cdolist_list_var = assertions_high.assertion_dependent_list(source_assertion);
        SubLObject dependent = (SubLObject)fi.NIL;
        dependent = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            if (fi.NIL != deduction_handles.valid_deductionP(dependent, (SubLObject)fi.UNPROVIDED)) {
                final SubLObject supported_object = deductions_high.deduction_supported_object(dependent);
                final SubLObject old_supports = deductions_high.deduction_supports(dependent);
                final SubLObject new_supports = Sequences.substitute(new_assertion, source_assertion, conses_high.subst(keep_term, kill_term, old_supports, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED), (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
                if (fi.NIL != assertion_handles.assertion_p(supported_object)) {
                    final SubLObject supported_formula = assertion_hl_formula(supported_object, (SubLObject)fi.UNPROVIDED);
                    final SubLObject supported_mt = assertions_high.assertion_mt(supported_object);
                    final SubLObject direction = assertions_high.assertion_direction(supported_object);
                    final SubLObject new_el_supports = Mapping.mapcar(Symbols.symbol_function((SubLObject)fi.$sym87$CONVERT_HL_SUPPORT_TO_FI_SUPPORT), new_supports);
                    fi_add_argument_int(supported_formula, supported_mt, new_el_supports, direction, (SubLObject)fi.UNPROVIDED);
                }
                else {
                    final SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support(supported_object);
                    kb_hl_supports_low.kb_hl_support_reset_justification(kb_hl_support, new_supports);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            dependent = cdolist_list_var.first();
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 42478L)
    public static SubLObject substitute_termofunit_assertion(final SubLObject keep_term, final SubLObject kill_term, final SubLObject source_assertion, final SubLObject remove_source_argumentsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert fi.NIL != forts.fort_p(keep_term) : keep_term;
        assert fi.NIL != forts.fort_p(kill_term) : kill_term;
        assert fi.NIL != assertion_handles.assertion_p(source_assertion) : source_assertion;
        if (fi.NIL != assertions_high.valid_assertion(source_assertion, (SubLObject)fi.UNPROVIDED)) {
            if (fi.NIL != nart_handles.nart_p(keep_term)) {
                final SubLObject new_assertion = function_terms.term_of_unit_assertion(keep_term);
                final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                try {
                    control_vars.$within_assert$.bind((SubLObject)fi.NIL, thread);
                    wff_utilities.$check_arg_typesP$.bind((SubLObject)fi.NIL, thread);
                    at_vars.$at_check_arg_typesP$.bind((SubLObject)fi.NIL, thread);
                    wff_utilities.$check_wff_semanticsP$.bind((SubLObject)fi.NIL, thread);
                    wff_utilities.$check_wff_coherenceP$.bind((SubLObject)fi.NIL, thread);
                    wff_utilities.$check_var_typesP$.bind((SubLObject)fi.NIL, thread);
                    czer_vars.$simplify_literalP$.bind((SubLObject)fi.NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind((SubLObject)fi.NIL, thread);
                    at_vars.$at_check_arg_formatP$.bind((SubLObject)fi.NIL, thread);
                    wff_vars.$validate_constantsP$.bind((SubLObject)fi.NIL, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)fi.T, thread);
                    substitute_dependent_assertion(new_assertion, keep_term, kill_term, source_assertion);
                }
                finally {
                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                    wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                    czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                    control_vars.$within_assert$.rebind(_prev_bind_0, thread);
                }
                add_merge_fort_assertion_mapping(assertions_high.assertion_formula(new_assertion), assertions_high.assertion_mt(new_assertion), source_assertion);
            }
            if (fi.NIL != remove_source_argumentsP) {
                SubLObject cdolist_list_var = assertions_high.assertion_arguments(source_assertion);
                SubLObject source_argument = (SubLObject)fi.NIL;
                source_argument = cdolist_list_var.first();
                while (fi.NIL != cdolist_list_var) {
                    tms.tms_remove_argument(source_argument, source_assertion, (SubLObject)fi.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    source_argument = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 43549L)
    public static SubLObject make_merge_fort_assertion_map(final SubLObject size) {
        return Hashtables.make_hash_table(size, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 43670L)
    public static SubLObject merge_fort_assertion_map_validP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Types.hash_table_p(fi.$merge_fort_assertion_map$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 43773L)
    public static SubLObject add_merge_fort_assertion_mapping(final SubLObject new_formula, final SubLObject new_mt, final SubLObject source_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (fi.$merge_fort_assertion_map$.getDynamicValue(thread).isHashtable()) {
            Hashtables.sethash(source_assertion, fi.$merge_fort_assertion_map$.getDynamicValue(thread), el_utilities.make_ist_sentence(new_formula, new_mt));
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 44023L)
    public static SubLObject get_merge_fort_assertion_mapping(final SubLObject source_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash(source_assertion, fi.$merge_fort_assertion_map$.getDynamicValue(thread), (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 44155L)
    public static SubLObject fi_kill(final SubLObject fort) {
        return fi((SubLObject)fi.$kw88$KILL, fort, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 44388L)
    public static SubLObject fi_kill_int(SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        fort = fi_convert_to_fort(fort);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL != constants_high.uninstalled_constant_p(fort)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str93$Constant__S_is_merely_an_empty_sh, fort));
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && fi.NIL != kb_utilities.core_union_constantP(fort)) {
            Errors.error((SubLObject)fi.$str94$Cannot_kill_core_constant__a___To, fort);
        }
        final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = fi.$within_fi_operationP$.currentBinding(thread);
        try {
            control_vars.$within_assert$.bind((SubLObject)fi.NIL, thread);
            wff_utilities.$check_arg_typesP$.bind((SubLObject)fi.NIL, thread);
            at_vars.$at_check_arg_typesP$.bind((SubLObject)fi.NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind((SubLObject)fi.NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind((SubLObject)fi.NIL, thread);
            wff_utilities.$check_var_typesP$.bind((SubLObject)fi.NIL, thread);
            czer_vars.$simplify_literalP$.bind((SubLObject)fi.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)fi.NIL, thread);
            at_vars.$at_check_arg_formatP$.bind((SubLObject)fi.NIL, thread);
            wff_vars.$validate_constantsP$.bind((SubLObject)fi.NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)fi.T, thread);
            fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
            forts.remove_fort(fort);
        }
        finally {
            fi.$within_fi_operationP$.rebind(_prev_bind_12, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
            control_vars.$within_assert$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 45074L)
    public static SubLObject fi_rename(final SubLObject constant, final SubLObject name) {
        return fi((SubLObject)fi.$kw95$RENAME, constant, name, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 45320L)
    public static SubLObject fi_rename_int(final SubLObject constant, SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (fi.NIL == constant_handles.constant_p(constant)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str99$Expected_a_constant__got__S, constant));
            return (SubLObject)fi.NIL;
        }
        if (!name.isString()) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str33$Expected_a_string__got__S, name));
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL == constant_completion_high.valid_constant_name_p(name)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw34$INVALID_NAME, (SubLObject)fi.$str35$_S_is_not_a_valid_name_for_a_cons, name));
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL != constant_completion_high.$require_case_insensitive_name_uniqueness$.getDynamicValue(thread)) {
            SubLObject name_collisions = constant_completion_high.constant_name_case_collisions(name);
            name_collisions = Sequences.delete(constant, name_collisions, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            if (fi.NIL != name_collisions) {
                final SubLObject new_name = constant_completion_high.uniquify_constant_name(name, (SubLObject)fi.UNPROVIDED);
                signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw46$NAME_CLASH, (SubLObject)fi.$str47$NAME_clash_for__S___renaming_to__, name, new_name));
                name = new_name;
            }
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject _prev_bind_0 = fi.$within_fi_operationP$.currentBinding(thread);
        try {
            fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
            if (constants_high.constant_name(constant).equal(name)) {
                signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw100$ALREADY_HAS_NAME, (SubLObject)fi.$str101$Constant__S_is_already_named__A, constant, name));
            }
            else {
                final SubLObject existing_constant = constants_high.find_constant(name);
                if (fi.NIL != constant_handles.valid_constantP(existing_constant, (SubLObject)fi.UNPROVIDED)) {
                    final SubLObject new_name2 = constant_completion_high.uniquify_constant_name(name, (SubLObject)fi.UNPROVIDED);
                    ans = constants_high.rename_constant(constant, new_name2);
                    signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw46$NAME_CLASH, (SubLObject)fi.$str47$NAME_clash_for__S___renaming_to__, name, new_name2));
                }
                else {
                    if (fi.NIL != constant_handles.constant_p(existing_constant)) {
                        constants_high.remove_constant(existing_constant);
                    }
                    ans = constants_high.rename_constant(constant, name);
                }
            }
        }
        finally {
            fi.$within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 47033L)
    public static SubLObject fi_lookup(final SubLObject formula, final SubLObject mt) {
        return fi((SubLObject)fi.$kw102$LOOKUP, formula, hlmt_czer.canonicalize_hlmt(mt), (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 47589L)
    public static SubLObject fi_lookup_int(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (fi.NIL == el_utilities.el_formula_p(formula)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str107$Expected_a_cons__got__S, formula));
            return (SubLObject)fi.NIL;
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        SubLObject assertions = (SubLObject)fi.NIL;
        SubLObject everything_thereP = (SubLObject)fi.NIL;
        final SubLObject _prev_bind_0 = fi.$within_fi_operationP$.currentBinding(thread);
        try {
            fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
            thread.resetMultipleValues();
            final SubLObject ass_ans = sentence_assertions(formula, mt);
            final SubLObject every_ans = thread.secondMultipleValue();
            final SubLObject canon_error = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            signal_fi_error(canon_error);
            assertions = ass_ans;
            everything_thereP = every_ans;
        }
        finally {
            fi.$within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(Mapping.mapcar(Symbols.symbol_function((SubLObject)fi.$sym108$ASSERTION_FI_FORMULA), assertions), everything_thereP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 48205L)
    public static SubLObject sentence_assertions_in_mt(final SubLObject sentence, final SubLObject mt, final SubLObject use_genl_mtsP) {
        if (fi.NIL != use_genl_mtsP) {
            return sentence_visible_assertions(sentence, mt);
        }
        return sentence_assertions(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 48552L)
    public static SubLObject sentence_assertions(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (fi.NIL == wff.el_wffP(sentence, mt, (SubLObject)fi.UNPROVIDED)) {
            final SubLObject error = fi_not_wff_error(sentence, mt);
            return Values.values((SubLObject)fi.NIL, (SubLObject)fi.T, error);
        }
        thread.resetMultipleValues();
        final SubLObject assertions = czer_meta.find_assertions_cycl(sentence, mt);
        final SubLObject missingP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(assertions, (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == missingP), (SubLObject)fi.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 49204L)
    public static SubLObject sentence_visible_assertions(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (fi.NIL == wff.el_wffP(sentence, mt, (SubLObject)fi.UNPROVIDED)) {
            final SubLObject error = fi_not_wff_error(sentence, mt);
            return Values.values((SubLObject)fi.NIL, (SubLObject)fi.T, error);
        }
        thread.resetMultipleValues();
        final SubLObject assertions = czer_meta.find_visible_assertions_cycl(sentence, mt);
        final SubLObject missingP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(assertions, (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == missingP), (SubLObject)fi.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 49900L)
    public static SubLObject sentence_assertions_in_any_mt(final SubLObject sentence) {
        return sentence_visible_assertions(sentence, fi.$const80$EverythingPSC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 50359L)
    public static SubLObject sentence_assertion(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject assertions = sentence_assertions(sentence, mt);
        final SubLObject all_present = thread.secondMultipleValue();
        final SubLObject canon_error = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (fi.NIL != assertions && fi.NIL != list_utilities.singletonP(assertions) && fi.NIL != all_present && fi.NIL == canon_error) {
            return assertions.first();
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 50711L)
    public static SubLObject gaf_sentence_assertion(final SubLObject gaf, final SubLObject mt) {
        final SubLObject assertion = sentence_assertion(gaf, mt);
        if (fi.NIL != assertions_high.gaf_assertionP(assertion)) {
            return assertion;
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 50972L)
    public static SubLObject fi_assert(final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == fi.UNPROVIDED) {
            strength = (SubLObject)fi.$kw109$DEFAULT;
        }
        if (direction == fi.UNPROVIDED) {
            direction = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw110$ASSERT, formula, hlmt_czer.canonicalize_hlmt(mt), strength, direction, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 51538L)
    public static SubLObject fi_assert_int(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == fi.UNPROVIDED) {
            strength = (SubLObject)fi.$kw109$DEFAULT;
        }
        if (direction == fi.UNPROVIDED) {
            direction = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (fi.NIL == el_utilities.el_formula_p(formula)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str107$Expected_a_cons__got__S, formula));
            return (SubLObject)fi.NIL;
        }
        formula = canon_tl.transform_tl_terms_to_hl(formula);
        mt = canon_tl.transform_tl_terms_to_hl(mt);
        mt = fi_convert_to_assert_hlmt_if_wft(mt);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL == enumeration_types.el_strength_p(strength)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str114$Expected__default_or__monotonic__, strength));
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL != direction && fi.NIL == enumeration_types.direction_p(direction)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str115$Expected_a_direction__got__S, direction));
            return (SubLObject)fi.NIL;
        }
        SubLObject assertions_found_or_created = (SubLObject)fi.NIL;
        SubLObject ans = (SubLObject)fi.NIL;
        SubLObject janus_deduce_specs = (SubLObject)fi.NIL;
        final SubLObject environment = utilities_macros.possibly_get_forward_inference_environment();
        assert fi.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$janus_within_somethingP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$janus_extraction_deduce_specs$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            control_vars.$janus_within_somethingP$.bind((SubLObject)fi.T, thread);
            control_vars.$janus_extraction_deduce_specs$.bind((SubLObject)fi.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject canon_versions = (fi.NIL != fi.$assume_assert_sentence_is_wfP$.getDynamicValue(thread)) ? czer_main.canonicalize_wf_assert_sentence(formula, mt) : czer_main.canonicalize_assert_sentence(formula, mt);
            final SubLObject canon_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(canon_mt);
            final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            final SubLObject _prev_bind_4 = fi.$within_fi_operationP$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
                if (fi.NIL == canon_versions) {
                    signal_fi_error(fi_not_wff_assert_error(formula, canon_mt));
                }
                else if (fi.NIL != kb_utilities.kbeq(canon_versions, fi.$const116$True)) {
                    signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw117$TAUTOLOGY, (SubLObject)fi.$str118$Formula______S___in__S_was_a_taut, formula, canon_mt));
                }
                else if (fi.NIL != kb_utilities.kbeq(canon_versions, fi.$const119$False)) {
                    signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw120$CONTRADICTION, (SubLObject)fi.$str121$Formula______S___in__S_was_a_cont, formula, canon_mt));
                }
                else {
                    set_fi_last_assertions_asserted((SubLObject)fi.NIL);
                    SubLObject cdolist_list_var = canon_versions;
                    SubLObject canon_version = (SubLObject)fi.NIL;
                    canon_version = cdolist_list_var.first();
                    while (fi.NIL != cdolist_list_var) {
                        if (fi.NIL == fi_error_signaledP()) {
                            SubLObject current;
                            final SubLObject datum = current = canon_version;
                            SubLObject cnf = (SubLObject)fi.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list122);
                            cnf = current.first();
                            current = current.rest();
                            final SubLObject variable_map = (SubLObject)(current.isCons() ? current.first() : fi.NIL);
                            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi.$list122);
                            current = current.rest();
                            final SubLObject query_free_vars = (SubLObject)(current.isCons() ? current.first() : fi.NIL);
                            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi.$list122);
                            current = current.rest();
                            if (fi.NIL == current) {
                                if (fi.NIL == direction) {
                                    direction = fi_cnf_default_direction(cnf);
                                }
                                final SubLObject assertion = hl_storage_modules.hl_assert(cnf, canon_mt, strength, direction, variable_map);
                                if (fi.NIL != assertion_handles.assertion_p(assertion)) {
                                    assertions_found_or_created = (SubLObject)ConsesLow.cons(assertion, assertions_found_or_created);
                                }
                                else if (fi.NIL == assertion) {
                                    signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw123$COULD_NOT_ASSERT, (SubLObject)fi.$str124$Unable_to_assert_formula__S__in__, formula, canon_mt));
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)fi.$list122);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        canon_version = cdolist_list_var.first();
                    }
                    assertions_found_or_created = Sequences.nreverse(assertions_found_or_created);
                }
                ans = (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
            }
            finally {
                fi.$within_fi_operationP$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$5, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$4, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$3, thread);
            }
            if (fi.NIL == fi_error_signaledP()) {
                SubLObject deductions_found_or_created = (SubLObject)fi.NIL;
                final SubLObject _prev_bind_0_$4 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                final SubLObject _prev_bind_1_$5 = kb_control_vars.$forward_inference_forbidden_rules$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_allowed_rules$.bind(hl_prototypes.hl_prototype_allowed_forward_rules(assertions_found_or_created), thread);
                    kb_control_vars.$forward_inference_forbidden_rules$.bind(hl_prototypes.hl_prototype_forbidden_forward_rules(assertions_found_or_created), thread);
                    deductions_found_or_created = forward.perform_forward_inference();
                }
                finally {
                    kb_control_vars.$forward_inference_forbidden_rules$.rebind(_prev_bind_1_$5, thread);
                    kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$4, thread);
                }
                perform_assert_post_processing(assertions_found_or_created, deductions_found_or_created);
            }
            janus_deduce_specs = control_vars.$janus_extraction_deduce_specs$.getDynamicValue(thread);
        }
        finally {
            control_vars.$janus_extraction_deduce_specs$.rebind(_prev_bind_3, thread);
            control_vars.$janus_within_somethingP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        janus.janus_note_assert_finished(formula, mt, strength, direction, janus_deduce_specs);
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 54872L)
    public static SubLObject perform_assert_post_processing(final SubLObject assertions_found_or_created, final SubLObject deductions_found_or_created) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (fi.NIL != list_utilities.every_in_list((SubLObject)fi.$sym125$ASSERTED_ASSERTION_, assertions_found_or_created, (SubLObject)fi.UNPROVIDED)) {
            SubLObject skolem_functions = (SubLObject)fi.NIL;
            SubLObject cdolist_list_var = assertions_found_or_created;
            SubLObject ass = (SubLObject)fi.NIL;
            ass = cdolist_list_var.first();
            while (fi.NIL != cdolist_list_var) {
                if (fi.NIL == function_terms.tou_assertionP(ass)) {
                    SubLObject skolem_narts = (SubLObject)fi.NIL;
                    if (fi.NIL != cycl_utilities.assertion_find_if((SubLObject)fi.$sym126$FAST_SKOLEM_NAT_, ass, (SubLObject)fi.NIL, (SubLObject)fi.UNPROVIDED)) {
                        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
                        try {
                            cycl_utilities.$opaque_arg_function$.bind((SubLObject)fi.$sym127$OPAQUE_ARG_WRT_QUOTING_NOT_COUNTING_LOGICAL_OPS_, thread);
                            skolem_narts = cycl_utilities.assertion_gather((SubLObject)fi.$sym126$FAST_SKOLEM_NAT_, ass, (SubLObject)fi.NIL, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
                        }
                        finally {
                            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (fi.NIL != skolem_narts) {
                        SubLObject cdolist_list_var_$8 = skolem_narts;
                        SubLObject skolem_nart = (SubLObject)fi.NIL;
                        skolem_nart = cdolist_list_var_$8.first();
                        while (fi.NIL != cdolist_list_var_$8) {
                            final SubLObject item_var = cycl_utilities.nat_functor(skolem_nart);
                            if (fi.NIL == conses_high.member(item_var, skolem_functions, Symbols.symbol_function((SubLObject)fi.EQL), Symbols.symbol_function((SubLObject)fi.IDENTITY))) {
                                skolem_functions = (SubLObject)ConsesLow.cons(item_var, skolem_functions);
                            }
                            cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                            skolem_nart = cdolist_list_var_$8.first();
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            }
            if (fi.NIL != skolem_functions) {
                cdolist_list_var = skolem_functions;
                SubLObject skolem_function = (SubLObject)fi.NIL;
                skolem_function = cdolist_list_var.first();
                while (fi.NIL != cdolist_list_var) {
                    perform_assert_post_processing_for_skolem(assertions_found_or_created, skolem_function);
                    cdolist_list_var = cdolist_list_var.rest();
                    skolem_function = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 56019L)
    public static SubLObject perform_assert_post_processing_for_skolem(final SubLObject defining_assertions, final SubLObject skolem_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject skolem_defining_assertions_bookkeeping_sentence = (SubLObject)ConsesLow.list(fi.$const128$skolem, skolem_function);
        final SubLObject skolem_defining_assertions_bookkeeping_assertion = czer_meta.find_assertion_cycl(skolem_defining_assertions_bookkeeping_sentence, mt_vars.$skolem_mt$.getGlobalValue());
        if (fi.NIL != skolem_defining_assertions_bookkeeping_assertion) {
            final SubLObject v_arguments = assertions_high.assertion_arguments(skolem_defining_assertions_bookkeeping_assertion);
            if (fi.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && fi.NIL == list_utilities.lengthE(v_arguments, (SubLObject)fi.ONE_INTEGER, (SubLObject)fi.UNPROVIDED)) {
                Errors.error((SubLObject)fi.$str129$Found_a___skolem_assertion_with_m, skolem_defining_assertions_bookkeeping_assertion);
            }
            final SubLObject argument = v_arguments.first();
            if (fi.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && fi.NIL == deduction_handles.deduction_p(argument)) {
                Errors.error((SubLObject)fi.$str130$Found_a___skolem_assertion_with_a, skolem_defining_assertions_bookkeeping_assertion);
            }
            final SubLObject existing_supports = deductions_high.deduction_supports(argument);
            if (fi.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && fi.NIL == conses_high.subsetp(defining_assertions, existing_supports, Symbols.symbol_function((SubLObject)fi.$sym131$KBEQ), (SubLObject)fi.UNPROVIDED)) {
                Errors.error((SubLObject)fi.$str132$Defining_assertions_for__s___s__w, skolem_function, defining_assertions, existing_supports);
            }
        }
        else {
            cyc_kernel.cyc_add_argument(skolem_defining_assertions_bookkeeping_sentence, defining_assertions, mt_vars.$skolem_mt$.getGlobalValue(), (SubLObject)fi.$list133, (SubLObject)fi.NIL);
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 57531L)
    public static SubLObject fi_perform_assert_post_processing_for_skolem(final SubLObject tl_defining_assertions, SubLObject skolem) {
        SubLObject defining_assertions = (SubLObject)fi.NIL;
        SubLObject cdolist_list_var = tl_defining_assertions;
        SubLObject tl_defining_assertion = (SubLObject)fi.NIL;
        tl_defining_assertion = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            final SubLObject found_defining_assertions = ke.find_assertions_via_tl(tl_defining_assertion, (SubLObject)fi.NIL);
            if (fi.NIL != found_defining_assertions) {
                defining_assertions = ConsesLow.append(found_defining_assertions, defining_assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tl_defining_assertion = cdolist_list_var.first();
        }
        skolem = canon_tl.transform_tl_terms_to_hl(skolem);
        perform_assert_post_processing_for_skolem(defining_assertions, skolem);
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 58227L)
    public static SubLObject fi_cnf_default_direction(final SubLObject cnf) {
        assert fi.NIL != clauses.cnf_p(cnf) : cnf;
        if (fi.NIL != clause_utilities.pos_atomic_clause_p(cnf)) {
            final SubLObject asent = clause_utilities.atomic_clause_asent(cnf);
            if (fi.NIL != el_utilities.ist_sentence_p(asent, (SubLObject)fi.UNPROVIDED)) {
                final SubLObject sub_mt = el_utilities.designated_mt(asent);
                final SubLObject subsentence = el_utilities.designated_sentence(asent);
                SubLObject cdolist_list_var;
                final SubLObject sub_cnfs = cdolist_list_var = czer_utilities.extract_el_clauses(czer_main.canonicalize_wf_assert_sentence(subsentence, sub_mt));
                SubLObject sub_cnf = (SubLObject)fi.NIL;
                sub_cnf = cdolist_list_var.first();
                while (fi.NIL != cdolist_list_var) {
                    if (fi.$kw135$BACKWARD == fi_cnf_default_direction(sub_cnf)) {
                        return (SubLObject)fi.$kw135$BACKWARD;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sub_cnf = cdolist_list_var.first();
                }
                return (SubLObject)fi.$kw136$FORWARD;
            }
        }
        if (fi.NIL != clauses.atomic_clause_p(cnf) && fi.NIL != clauses.ground_clause_p(cnf)) {
            return (SubLObject)fi.$kw136$FORWARD;
        }
        return (SubLObject)fi.$kw135$BACKWARD;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 59387L)
    public static SubLObject fi_not_wff_error(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (fi.NIL != fi.$generate_precise_fi_wff_errorsP$.getDynamicValue(thread)) {
            return (SubLObject)ConsesLow.list((SubLObject)fi.$kw137$FORMULA_NOT_WELL_FORMED, (SubLObject)fi.$str138$Formula______S___was_not_well_for, formula, wff.explanation_of_why_not_wff(formula, mt, (SubLObject)fi.UNPROVIDED));
        }
        return (SubLObject)ConsesLow.list((SubLObject)fi.$kw137$FORMULA_NOT_WELL_FORMED, (SubLObject)fi.$str139$Formula______S___was_not_well_for, formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 59769L)
    public static SubLObject fi_not_wff_assert_error(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (fi.NIL != fi.$generate_precise_fi_wff_errorsP$.getDynamicValue(thread)) {
            return (SubLObject)ConsesLow.list((SubLObject)fi.$kw137$FORMULA_NOT_WELL_FORMED, (SubLObject)fi.$str138$Formula______S___was_not_well_for, formula, wff.explanation_of_why_not_wff_assert(formula, mt, (SubLObject)fi.UNPROVIDED));
        }
        return (SubLObject)ConsesLow.list((SubLObject)fi.$kw137$FORMULA_NOT_WELL_FORMED, (SubLObject)fi.$str139$Formula______S___was_not_well_for, formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 60178L)
    public static SubLObject fi_assert_update_asserted_argument(final SubLObject assertion, final SubLObject hl_tv, final SubLObject direction, SubLObject pre_existing_assertionP) {
        if (pre_existing_assertionP == fi.UNPROVIDED) {
            pre_existing_assertionP = (SubLObject)fi.T;
        }
        final SubLObject current_direction = assertions_high.assertion_direction(assertion);
        final SubLObject existing_asserted_argument = assertions_high.get_asserted_argument(assertion);
        SubLObject truth_status = (SubLObject)fi.$kw140$UNINITIALIZED;
        SubLObject strength_status = (SubLObject)fi.$kw140$UNINITIALIZED;
        push_fi_last_assertions_asserted(assertion);
        if (fi.NIL != pre_existing_assertionP && fi.NIL != existing_asserted_argument) {
            final SubLObject existing_tv = arguments.argument_tv(existing_asserted_argument);
            if (hl_tv.eql(existing_tv)) {
                truth_status = (SubLObject)fi.$kw141$UNCHANGED;
                strength_status = (SubLObject)fi.$kw141$UNCHANGED;
                if (direction.eql(current_direction)) {
                    signal_fi_warning((SubLObject)fi.$list142);
                }
            }
            else {
                if (enumeration_types.tv_truth(existing_tv).eql(enumeration_types.tv_truth(hl_tv))) {
                    truth_status = (SubLObject)fi.$kw141$UNCHANGED;
                }
                else {
                    truth_status = (SubLObject)fi.$kw143$FLIPPED;
                }
                if (enumeration_types.tv_strength(existing_tv).eql(enumeration_types.tv_strength(hl_tv))) {
                    strength_status = (SubLObject)fi.$kw141$UNCHANGED;
                }
                else {
                    strength_status = (SubLObject)fi.$kw143$FLIPPED;
                }
                tms.tms_change_asserted_argument_tv(existing_asserted_argument, assertion, hl_tv);
            }
        }
        else {
            truth_status = (SubLObject)fi.$kw144$NEW;
            strength_status = (SubLObject)fi.$kw144$NEW;
            tms.tms_create_asserted_argument_with_tv(assertion, hl_tv, pre_existing_assertionP);
        }
        if (!direction.eql(current_direction)) {
            tms.tms_change_direction(assertion, direction);
        }
        return Values.values(assertion, truth_status, strength_status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 61808L)
    public static SubLObject hl_assert_update_asserted_argument(final SubLObject assertion, final SubLObject hl_tv, final SubLObject direction, SubLObject pre_existing_assertionP) {
        if (pre_existing_assertionP == fi.UNPROVIDED) {
            pre_existing_assertionP = (SubLObject)fi.T;
        }
        return fi_assert_update_asserted_argument(assertion, hl_tv, direction, pre_existing_assertionP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 62142L)
    public static SubLObject fi_reassert(final SubLObject formula, final SubLObject mt, final SubLObject strength, final SubLObject direction) {
        return fi((SubLObject)fi.$kw145$REASSERT, formula, hlmt_czer.canonicalize_hlmt(mt), strength, direction, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 62322L)
    public static SubLObject fi_reassert_int(final SubLObject formula, SubLObject mt, final SubLObject strength, final SubLObject direction) {
        reset_fi_error_state();
        if (fi.NIL == el_utilities.el_formula_p(formula)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str107$Expected_a_cons__got__S, formula));
            return (SubLObject)fi.NIL;
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL == enumeration_types.el_strength_p(strength)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str114$Expected__default_or__monotonic__, strength));
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL == enumeration_types.direction_p(direction)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str115$Expected_a_direction__got__S, direction));
            return (SubLObject)fi.NIL;
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject assertions = ke.find_assertions_via_tl(formula, mt);
        if (fi.NIL != assertions) {
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = (SubLObject)fi.NIL;
            assertion = cdolist_list_var.first();
            while (fi.NIL != cdolist_list_var) {
                if (fi.NIL != assertions_high.asserted_assertionP(assertion)) {
                    final SubLObject hl_tv = fi_reassert_hl_tv(assertion, strength);
                    fi_assert_update_asserted_argument(assertion, hl_tv, direction, (SubLObject)fi.UNPROVIDED);
                }
                else {
                    final SubLObject current_strength = assertions_high.assertion_strength(assertion);
                    fi_rededuce_deduction_assertion(assertion, direction);
                    if (!strength.eql(current_strength)) {
                        signal_fi_warning((SubLObject)fi.$list146);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        else {
            signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw147$ASSERTION_NOT_PRESENT, (SubLObject)fi.$str148$Formula__S_in_mt__S_is_not_in_the, formula, mt));
        }
        ans = (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
        if (fi.NIL == fi_error_signaledP()) {
            forward.perform_forward_inference();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 63832L)
    public static SubLObject fi_reassert_hl_tv(final SubLObject existing_assertion, final SubLObject new_strength) {
        return enumeration_types.tv_from_truth_strength(assertions_high.assertion_truth(existing_assertion), new_strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 64003L)
    public static SubLObject fi_rededuce_deduction_assertion(final SubLObject assertion, final SubLObject direction) {
        tms.tms_recompute_dependents(assertion);
        if (!direction.eql(assertions_high.assertion_direction(assertion))) {
            tms.tms_change_direction(assertion, direction);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 64389L)
    public static SubLObject fi_deny(final SubLObject formula, final SubLObject mt, final SubLObject direction) {
        return fi((SubLObject)fi.$kw149$DENY, formula, hlmt_czer.canonicalize_hlmt(mt), direction, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 64534L)
    public static SubLObject fi_deny_int(final SubLObject formula, SubLObject mt, SubLObject direction) {
        if (direction == fi.UNPROVIDED) {
            direction = (SubLObject)fi.NIL;
        }
        reset_fi_error_state();
        if (fi.NIL == el_utilities.el_formula_p(formula)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str107$Expected_a_cons__got__S, formula));
            return (SubLObject)fi.NIL;
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL != direction && fi.NIL == enumeration_types.direction_p(direction)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str115$Expected_a_direction__got__S, direction));
            return (SubLObject)fi.NIL;
        }
        fi_assert_int(formula, mt, (SubLObject)fi.$kw109$DEFAULT, (SubLObject)fi.$kw135$BACKWARD);
        SubLObject ans = (SubLObject)fi.NIL;
        SubLObject assertions = ke.find_assertions_via_tl(formula, mt);
        if (fi.NIL == assertions) {
            assertions = czer_meta.find_assertions_cycl(formula, mt);
        }
        if (fi.NIL != assertions) {
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = (SubLObject)fi.NIL;
            assertion = cdolist_list_var.first();
            while (fi.NIL != cdolist_list_var) {
                if (fi.NIL == direction) {
                    direction = fi_cnf_default_direction(assertions_high.assertion_cnf(assertion));
                }
                fi_assert_update_asserted_argument(assertion, (SubLObject)fi.$kw150$UNKNOWN, direction, (SubLObject)fi.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        else {
            signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw147$ASSERTION_NOT_PRESENT, (SubLObject)fi.$str148$Formula__S_in_mt__S_is_not_in_the, formula, mt));
        }
        ans = (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
        if (fi.NIL == fi_error_signaledP()) {
            forward.perform_forward_inference();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 65778L)
    public static SubLObject fi_unassert(final SubLObject formula, final SubLObject mt) {
        return fi((SubLObject)fi.$kw151$UNASSERT, formula, hlmt_czer.canonicalize_hlmt(mt), (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 66081L)
    public static SubLObject fi_unassert_int(final SubLObject sentence, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (fi.NIL == el_utilities.el_formula_p(sentence)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str107$Expected_a_cons__got__S, sentence));
            return (SubLObject)fi.NIL;
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert fi.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$9 = fi.$within_fi_operationP$.currentBinding(thread);
            try {
                fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
                SubLObject canon_versions = (SubLObject)fi.NIL;
                SubLObject deduced_argumentP = (SubLObject)fi.NIL;
                thread.resetMultipleValues();
                final SubLObject canon_versions_$10 = canonicalize_fi_unassert_sentence(sentence, mt);
                final SubLObject mt_$11 = thread.secondMultipleValue();
                final SubLObject deduced_argumentP_$12 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                canon_versions = canon_versions_$10;
                mt = mt_$11;
                deduced_argumentP = deduced_argumentP_$12;
                final SubLObject canonical_mt = fi_convert_to_assert_hlmt(mt);
                if (fi.NIL == fi_error_signaledP()) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(canonical_mt);
                    final SubLObject _prev_bind_0_$10 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (fi.NIL == deduced_argumentP || fi.NIL != canon_versions) {
                            if (fi.NIL == canon_versions) {
                                signal_fi_error(fi_not_wff_error(sentence, mt));
                            }
                            else if (fi.NIL != kb_utilities.kbeq(canon_versions, fi.$const116$True)) {
                                signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw117$TAUTOLOGY, (SubLObject)fi.$str154$Sentence______S___in__S_was_a_tau, sentence, mt));
                            }
                            else if (fi.NIL != kb_utilities.kbeq(canon_versions, fi.$const119$False)) {
                                signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw120$CONTRADICTION, (SubLObject)fi.$str155$Sentence______S___in__S_was_a_con, sentence, mt));
                            }
                            else {
                                SubLObject cdolist_list_var = canon_versions;
                                SubLObject canon_version = (SubLObject)fi.NIL;
                                canon_version = cdolist_list_var.first();
                                while (fi.NIL != cdolist_list_var) {
                                    if (fi.NIL == fi_error_signaledP()) {
                                        SubLObject current;
                                        final SubLObject datum = current = canon_version;
                                        SubLObject cnf = (SubLObject)fi.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list122);
                                        cnf = current.first();
                                        current = current.rest();
                                        final SubLObject variable_map = (SubLObject)(current.isCons() ? current.first() : fi.NIL);
                                        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi.$list122);
                                        current = current.rest();
                                        final SubLObject query_free_vars = (SubLObject)(current.isCons() ? current.first() : fi.NIL);
                                        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi.$list122);
                                        current = current.rest();
                                        if (fi.NIL == current) {
                                            if (fi.NIL == hl_storage_modules.hl_unassert(cnf, mt)) {
                                                signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw147$ASSERTION_NOT_PRESENT, (SubLObject)fi.$str156$Sentence__S_in_mt__S_is_not_in_th, sentence, mt));
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)fi.$list122);
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    canon_version = cdolist_list_var.first();
                                }
                            }
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$10, thread);
                    }
                }
                ans = (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
            }
            finally {
                fi.$within_fi_operationP$.rebind(_prev_bind_0_$9, thread);
            }
            if (fi.NIL != ans) {
                forward.perform_forward_inference();
            }
        }
        finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 67986L)
    public static SubLObject canonicalize_fi_unassert_sentence(final SubLObject sentence, final SubLObject mt) {
        return canonicalize_fi_remove_sentence(sentence, mt, (SubLObject)fi.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 68131L)
    public static SubLObject canonicalize_fi_blast_sentence(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject canon_versions = canonicalize_fi_remove_sentence(sentence, mt, (SubLObject)fi.NIL);
        final SubLObject mt_$14 = thread.secondMultipleValue();
        final SubLObject deduced_argumentP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(canon_versions, mt_$14);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 68381L)
    public static SubLObject canonicalize_fi_remove_sentence(final SubLObject sentence, SubLObject mt, final SubLObject check_for_asserted_argumentP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el_sentence = canon_tl.transform_tl_terms_to_hl(sentence);
        thread.resetMultipleValues();
        final SubLObject el_sentence_$15 = czer_utilities.unwrap_if_ist(el_sentence, mt, (SubLObject)fi.UNPROVIDED);
        final SubLObject mt_$16 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        el_sentence = el_sentence_$15;
        mt = mt_$16;
        mt = canonicalize_unassert_hlmt(mt);
        SubLObject canon_versions = (SubLObject)fi.NIL;
        SubLObject deduced_argumentP = (SubLObject)fi.NIL;
        SubLObject assertions = ke.find_assertions_via_tl(sentence, mt);
        if (fi.NIL == assertions && fi.NIL != hlmt.hlmt_p(mt)) {
            assertions = czer_meta.find_assertions_cycl(el_sentence, mt);
        }
        if (fi.NIL != assertions) {
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = (SubLObject)fi.NIL;
            assertion = cdolist_list_var.first();
            while (fi.NIL != cdolist_list_var) {
                if (fi.NIL != check_for_asserted_argumentP && fi.NIL == assertions_high.get_asserted_argument(assertion)) {
                    signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw157$ASSERTION_NOT_LOCAL, (SubLObject)fi.$str158$Sentence__S_in_mt__S_is_not_local, el_sentence, mt));
                    deduced_argumentP = (SubLObject)fi.T;
                }
                else {
                    final SubLObject cnf = assertions_high.assertion_cnf(assertion);
                    final SubLObject variable_map = (SubLObject)fi.NIL;
                    final SubLObject query_free_vars = (SubLObject)fi.NIL;
                    final SubLObject canon_version = (SubLObject)ConsesLow.list(cnf, variable_map, query_free_vars);
                    final SubLObject ass_mt = assertions_high.assertion_mt(assertion);
                    canon_versions = (SubLObject)ConsesLow.cons(canon_version, canon_versions);
                    mt = ass_mt;
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        else if (fi.NIL != hlmt.hlmt_p(mt)) {
            thread.resetMultipleValues();
            final SubLObject canon_versions_$17 = czer_main.canonicalize_unassert_sentence(el_sentence, mt);
            final SubLObject mt_$17 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canon_versions = canon_versions_$17;
            mt = mt_$17;
        }
        return Values.values(canon_versions, mt, deduced_argumentP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 69912L)
    public static SubLObject canonicalize_unassert_hlmt(SubLObject mt) {
        mt = canon_tl.tlmt_to_hlmt(mt);
        mt = narts_high.nart_substitute(mt);
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 70295L)
    public static SubLObject fi_edit(final SubLObject old_formula, final SubLObject new_formula, SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (old_mt == fi.UNPROVIDED) {
            old_mt = (SubLObject)fi.NIL;
        }
        if (new_mt == fi.UNPROVIDED) {
            new_mt = old_mt;
        }
        if (strength == fi.UNPROVIDED) {
            strength = (SubLObject)fi.$kw109$DEFAULT;
        }
        if (direction == fi.UNPROVIDED) {
            direction = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw159$EDIT, old_formula, new_formula, hlmt_czer.canonicalize_hlmt(old_mt), hlmt_czer.canonicalize_hlmt(new_mt), strength, direction, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 70945L)
    public static SubLObject fi_edit_int(final SubLObject old_formula, final SubLObject new_formula, SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (old_mt == fi.UNPROVIDED) {
            old_mt = (SubLObject)fi.NIL;
        }
        if (new_mt == fi.UNPROVIDED) {
            new_mt = old_mt;
        }
        if (strength == fi.UNPROVIDED) {
            strength = (SubLObject)fi.$kw109$DEFAULT;
        }
        if (direction == fi.UNPROVIDED) {
            direction = (SubLObject)fi.NIL;
        }
        fi_edit.new_fi_edit_int(old_formula, new_formula, old_mt, new_mt, strength, direction);
        return (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 71169L)
    public static SubLObject fi_justify(final SubLObject formula, final SubLObject mt, SubLObject fullP) {
        if (fullP == fi.UNPROVIDED) {
            fullP = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw163$JUSTIFY, formula, hlmt_czer.canonicalize_hlmt(mt), fullP, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 71585L)
    public static SubLObject fi_justify_int(final SubLObject formula, SubLObject mt, SubLObject fullP) {
        if (fullP == fi.UNPROVIDED) {
            fullP = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (fi.NIL == el_utilities.el_formula_p(formula)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str107$Expected_a_cons__got__S, formula));
            return (SubLObject)fi.NIL;
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject _prev_bind_0 = fi.$within_fi_operationP$.currentBinding(thread);
        try {
            fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
            ans = formula_justify(formula, mt, fullP);
        }
        finally {
            fi.$within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 72077L)
    public static SubLObject formula_justify(final SubLObject formula, SubLObject mt, SubLObject fullP) {
        if (fullP == fi.UNPROVIDED) {
            fullP = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)fi.NIL;
        SubLObject canon_versions = (SubLObject)fi.NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions_$19 = czer_main.canonicalize_query_sentence(formula, mt);
        final SubLObject mt_$20 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_versions = canon_versions_$19;
        mt = mt_$20;
        if (fi.NIL == canon_versions) {
            signal_fi_error(fi_not_wff_error(formula, mt));
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL != kb_utilities.kbeq(canon_versions, fi.$const116$True)) {
            signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw117$TAUTOLOGY, (SubLObject)fi.$str118$Formula______S___in__S_was_a_taut, formula, mt));
        }
        else if (fi.NIL != kb_utilities.kbeq(canon_versions, fi.$const119$False)) {
            signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw120$CONTRADICTION, (SubLObject)fi.$str121$Formula______S___in__S_was_a_cont, formula, mt));
        }
        else {
            SubLObject cdolist_list_var = canon_versions;
            SubLObject canon_version = (SubLObject)fi.NIL;
            canon_version = cdolist_list_var.first();
            while (fi.NIL != cdolist_list_var) {
                final SubLObject dnf = canon_version.first();
                final SubLObject neg_lits = clauses.neg_lits(dnf);
                final SubLObject pos_lits = clauses.pos_lits(dnf);
                SubLObject cdolist_list_var_$21 = neg_lits;
                SubLObject neg_lit = (SubLObject)fi.NIL;
                neg_lit = cdolist_list_var_$21.first();
                while (fi.NIL != cdolist_list_var_$21) {
                    neg_lit = cycl_utilities.negate(neg_lit);
                    final SubLObject justs = gaf_justify(neg_lit, mt, fullP);
                    if (fi.NIL == justs) {
                        signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw147$ASSERTION_NOT_PRESENT, (SubLObject)fi.$str148$Formula__S_in_mt__S_is_not_in_the, neg_lit, mt));
                        return (SubLObject)fi.NIL;
                    }
                    SubLObject cdolist_list_var_$22 = justs;
                    SubLObject just = (SubLObject)fi.NIL;
                    just = cdolist_list_var_$22.first();
                    while (fi.NIL != cdolist_list_var_$22) {
                        final SubLObject item_var = just;
                        if (fi.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)fi.EQUAL), Symbols.symbol_function((SubLObject)fi.IDENTITY))) {
                            result = (SubLObject)ConsesLow.cons(item_var, result);
                        }
                        cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                        just = cdolist_list_var_$22.first();
                    }
                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                    neg_lit = cdolist_list_var_$21.first();
                }
                SubLObject cdolist_list_var_$23 = pos_lits;
                SubLObject pos_lit = (SubLObject)fi.NIL;
                pos_lit = cdolist_list_var_$23.first();
                while (fi.NIL != cdolist_list_var_$23) {
                    final SubLObject justs = gaf_justify(pos_lit, mt, fullP);
                    if (fi.NIL == justs) {
                        signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw147$ASSERTION_NOT_PRESENT, (SubLObject)fi.$str148$Formula__S_in_mt__S_is_not_in_the, pos_lit, mt));
                        return (SubLObject)fi.NIL;
                    }
                    SubLObject cdolist_list_var_$24 = justs;
                    SubLObject just = (SubLObject)fi.NIL;
                    just = cdolist_list_var_$24.first();
                    while (fi.NIL != cdolist_list_var_$24) {
                        final SubLObject item_var = just;
                        if (fi.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)fi.EQUAL), Symbols.symbol_function((SubLObject)fi.IDENTITY))) {
                            result = (SubLObject)ConsesLow.cons(item_var, result);
                        }
                        cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                        just = cdolist_list_var_$24.first();
                    }
                    cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                    pos_lit = cdolist_list_var_$23.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                canon_version = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 73794L)
    public static SubLObject gaf_justify(final SubLObject formula, final SubLObject mt, final SubLObject fullP) {
        final SubLObject justs = one_step_gaf_justify(formula, mt);
        if (fi.NIL == justs) {
            return (SubLObject)fi.NIL;
        }
        if (Sequences.length(justs).numE((SubLObject)fi.ONE_INTEGER)) {
            return justs;
        }
        if (fi.NIL == fullP) {
            return justs;
        }
        SubLObject result = (SubLObject)fi.NIL;
        SubLObject cdolist_list_var = justs;
        SubLObject just = (SubLObject)fi.NIL;
        just = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = just;
            SubLObject hl_module = (SubLObject)fi.NIL;
            SubLObject just_formula = (SubLObject)fi.NIL;
            SubLObject just_mt = (SubLObject)fi.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list164);
            hl_module = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list164);
            just_formula = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list164);
            just_mt = current.first();
            current = current.rest();
            if (fi.NIL == current) {
                if (hl_module.eql(arguments.$assertion_support_module$.getGlobalValue())) {
                    final SubLObject recursive_justs = gaf_justify(just_formula, just_mt, (SubLObject)fi.T);
                    if (fi.NIL == recursive_justs) {
                        return (SubLObject)fi.NIL;
                    }
                    SubLObject cdolist_list_var_$25 = recursive_justs;
                    SubLObject recursive_just = (SubLObject)fi.NIL;
                    recursive_just = cdolist_list_var_$25.first();
                    while (fi.NIL != cdolist_list_var_$25) {
                        final SubLObject item_var = recursive_just;
                        if (fi.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)fi.EQUAL), Symbols.symbol_function((SubLObject)fi.IDENTITY))) {
                            result = (SubLObject)ConsesLow.cons(item_var, result);
                        }
                        cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                        recursive_just = cdolist_list_var_$25.first();
                    }
                }
                else {
                    final SubLObject item_var2 = just;
                    if (fi.NIL == conses_high.member(item_var2, result, Symbols.symbol_function((SubLObject)fi.EQUAL), Symbols.symbol_function((SubLObject)fi.IDENTITY))) {
                        result = (SubLObject)ConsesLow.cons(item_var2, result);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)fi.$list164);
            }
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 74464L)
    public static SubLObject one_step_gaf_justify(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)fi.NIL;
        SubLObject canon_versions = (SubLObject)fi.NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions_$26 = czer_main.canonicalize_cycl_sentence(formula, mt);
        final SubLObject mt_$27 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_versions = canon_versions_$26;
        mt = mt_$27;
        if (fi.NIL == canon_versions) {
            signal_fi_error(fi_not_wff_error(formula, mt));
            return (SubLObject)fi.NIL;
        }
        if (canon_versions.isCons()) {
            SubLObject cdolist_list_var = canon_versions;
            SubLObject canon_version = (SubLObject)fi.NIL;
            canon_version = cdolist_list_var.first();
            while (fi.NIL != cdolist_list_var) {
                if (fi.NIL == fi_error_signaledP()) {
                    thread.resetMultipleValues();
                    final SubLObject cnf = fi_canonicalize(canon_version, (SubLObject)fi.T, (SubLObject)fi.UNPROVIDED);
                    final SubLObject v_variables = thread.secondMultipleValue();
                    final SubLObject hl_tv = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject assertion = kb_indexing.find_assertion(cnf, mt);
                    if (fi.NIL == assertion) {
                        signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw147$ASSERTION_NOT_PRESENT, (SubLObject)fi.$str148$Formula__S_in_mt__S_is_not_in_the, formula, mt));
                    }
                    else {
                        final SubLObject matching_argument = Sequences.find(assertions_high.cyc_assertion_tv(assertion), assertions_high.assertion_arguments(assertion), Symbols.symbol_function((SubLObject)fi.EQL), Symbols.symbol_function((SubLObject)fi.$sym165$ARGUMENT_TV), (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
                        if (fi.NIL != matching_argument) {
                            if (fi.NIL != arguments.belief_p(matching_argument)) {
                                final SubLObject item_var = justify_support(assertion);
                                if (fi.NIL == conses_high.member(item_var, v_answer, Symbols.symbol_function((SubLObject)fi.EQUAL), Symbols.symbol_function((SubLObject)fi.IDENTITY))) {
                                    v_answer = (SubLObject)ConsesLow.cons(item_var, v_answer);
                                }
                            }
                            else {
                                SubLObject cdolist_list_var_$28 = deductions_high.deduction_supports(matching_argument);
                                SubLObject support = (SubLObject)fi.NIL;
                                support = cdolist_list_var_$28.first();
                                while (fi.NIL != cdolist_list_var_$28) {
                                    final SubLObject item_var2 = justify_support(support);
                                    if (fi.NIL == conses_high.member(item_var2, v_answer, Symbols.symbol_function((SubLObject)fi.EQUAL), Symbols.symbol_function((SubLObject)fi.IDENTITY))) {
                                        v_answer = (SubLObject)ConsesLow.cons(item_var2, v_answer);
                                    }
                                    cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                                    support = cdolist_list_var_$28.first();
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                canon_version = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 75618L)
    public static SubLObject justify_support(final SubLObject support) {
        return (SubLObject)ConsesLow.list(arguments.support_module(support), arguments.support_formula(support), arguments.support_mt(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 75753L)
    public static SubLObject fi_add_argument(final SubLObject formula, final SubLObject mt, final SubLObject supports, SubLObject direction, SubLObject verify_supportsP) {
        if (direction == fi.UNPROVIDED) {
            direction = (SubLObject)fi.NIL;
        }
        if (verify_supportsP == fi.UNPROVIDED) {
            verify_supportsP = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw166$ADD_ARGUMENT, formula, hlmt_czer.canonicalize_hlmt(mt), supports, direction, verify_supportsP, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 76287L)
    public static SubLObject fi_add_argument_int(SubLObject formula, SubLObject mt, SubLObject supports, SubLObject direction, SubLObject verify_supportsP) {
        if (direction == fi.UNPROVIDED) {
            direction = (SubLObject)fi.NIL;
        }
        if (verify_supportsP == fi.UNPROVIDED) {
            verify_supportsP = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (fi.NIL == el_utilities.el_formula_p(formula)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str107$Expected_a_cons__got__S, formula));
            return (SubLObject)fi.NIL;
        }
        if (!supports.isCons()) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str107$Expected_a_cons__got__S, supports));
            return (SubLObject)fi.NIL;
        }
        formula = canon_tl.transform_tl_terms_to_hl(formula);
        mt = canon_tl.transform_tl_terms_to_hl(mt);
        supports = canon_tl.transform_tl_terms_to_hl(supports);
        mt = fi_convert_to_assert_hlmt_if_wft(mt);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        SubLObject cdolist_list_var = supports;
        SubLObject support = (SubLObject)fi.NIL;
        support = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            if (fi.NIL == arguments.support_p(support)) {
                signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str167$Expected_a_support__got__S, support));
                return (SubLObject)fi.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        if (fi.NIL != direction && fi.NIL == conses_high.member(direction, (SubLObject)fi.$list168, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str169$Expected__forward_or__backward__g, direction));
            return (SubLObject)fi.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject v_hl_supports = fi_canonicalize_el_supports(supports, verify_supportsP);
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (fi.NIL != error) {
            signal_fi_error(error);
            return (SubLObject)fi.NIL;
        }
        supports = v_hl_supports;
        SubLObject local_deductions_found_or_created = (SubLObject)fi.NIL;
        SubLObject ans = (SubLObject)fi.NIL;
        SubLObject canon_versions = (SubLObject)fi.NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions_$29 = (fi.NIL != fi.$assume_assert_sentence_is_wfP$.getDynamicValue(thread)) ? czer_main.canonicalize_wf_assert_sentence(formula, mt) : czer_main.canonicalize_assert_sentence(formula, mt);
        final SubLObject mt_$30 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_versions = canon_versions_$29;
        mt = mt_$30;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = fi.$within_fi_operationP$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
            if (fi.NIL == canon_versions) {
                signal_fi_error(fi_not_wff_assert_error(formula, mt));
            }
            else if (fi.NIL != kb_utilities.kbeq(canon_versions, fi.$const116$True)) {
                signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw117$TAUTOLOGY, (SubLObject)fi.$str118$Formula______S___in__S_was_a_taut, formula, mt));
            }
            else if (fi.NIL != kb_utilities.kbeq(canon_versions, fi.$const119$False)) {
                signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw120$CONTRADICTION, (SubLObject)fi.$str121$Formula______S___in__S_was_a_cont, formula, mt));
            }
            else {
                SubLObject cdolist_list_var2 = canon_versions;
                SubLObject canon_version = (SubLObject)fi.NIL;
                canon_version = cdolist_list_var2.first();
                while (fi.NIL != cdolist_list_var2) {
                    if (fi.NIL == fi_error_signaledP()) {
                        SubLObject current;
                        final SubLObject datum = current = canon_version;
                        SubLObject cnf = (SubLObject)fi.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list122);
                        cnf = current.first();
                        current = current.rest();
                        final SubLObject variable_map = (SubLObject)(current.isCons() ? current.first() : fi.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi.$list122);
                        current = current.rest();
                        final SubLObject query_free_vars = (SubLObject)(current.isCons() ? current.first() : fi.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi.$list122);
                        current = current.rest();
                        if (fi.NIL == current) {
                            if (fi.NIL == direction) {
                                direction = fi_cnf_default_direction(cnf);
                            }
                            local_deductions_found_or_created = (SubLObject)ConsesLow.cons(hl_storage_modules.hl_add_deduction(cnf, mt, supports, direction, variable_map, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED), local_deductions_found_or_created);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)fi.$list122);
                        }
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    canon_version = cdolist_list_var2.first();
                }
            }
            ans = (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
        }
        finally {
            fi.$within_fi_operationP$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (fi.NIL == fi_error_signaledP()) {
            final SubLObject forward_deductions_found_or_created = forward.perform_forward_inference();
            perform_deduce_post_processing(local_deductions_found_or_created, forward_deductions_found_or_created);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 79346L)
    public static SubLObject perform_deduce_post_processing(final SubLObject local_deductions_found_or_created, final SubLObject forward_deductions_found_or_created) {
        return perform_assert_post_processing(Mapping.mapcar((SubLObject)fi.$sym170$DEDUCTION_ASSERTION, local_deductions_found_or_created), forward_deductions_found_or_created);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 79608L)
    public static SubLObject convert_hl_support_to_el_support(final SubLObject hl_support) {
        return convert_hl_support_to_fi_support(hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 79847L)
    public static SubLObject convert_hl_support_to_fi_support(final SubLObject hl_support) {
        if (fi.NIL != assertion_handles.assertion_p(hl_support)) {
            return hl_support;
        }
        final SubLObject module = arguments.support_module(hl_support);
        SubLObject formula = conses_high.copy_tree(arguments.support_formula(hl_support));
        final SubLObject mt = arguments.support_mt(hl_support);
        final SubLObject truth = arguments.support_truth(hl_support);
        final SubLObject strength = arguments.support_strength(hl_support);
        if (truth == fi.$kw171$FALSE) {
            formula = cycl_utilities.negate(formula);
        }
        final SubLObject el_support = make_el_support(module, formula, mt, strength);
        return el_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 80409L)
    public static SubLObject convert_hl_support_to_tl_support(final SubLObject hl_support) {
        final SubLObject module = arguments.support_module(hl_support);
        SubLObject formula = arguments.support_formula(hl_support);
        final SubLObject mt = arguments.support_mt(hl_support);
        final SubLObject truth = arguments.support_truth(hl_support);
        final SubLObject strength = arguments.support_strength(hl_support);
        if (fi.NIL != assertion_handles.assertion_p(hl_support)) {
            formula = canon_tl.assertion_tl_formula(hl_support);
        }
        formula = conses_high.copy_tree(formula);
        if (truth == fi.$kw171$FALSE) {
            formula = cycl_utilities.negate(formula);
        }
        final SubLObject el_support = make_el_support(module, formula, mt, strength);
        return el_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 81024L)
    public static SubLObject make_el_support(final SubLObject module, final SubLObject formula, SubLObject mt, SubLObject strength) {
        if (mt == fi.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == fi.UNPROVIDED) {
            strength = (SubLObject)fi.$kw109$DEFAULT;
        }
        return (SubLObject)ConsesLow.list(module, formula, mt, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 81179L)
    public static SubLObject fi_canonicalize_el_supports(final SubLObject el_supports, SubLObject verify_supportsP) {
        if (verify_supportsP == fi.UNPROVIDED) {
            verify_supportsP = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_hl_supports = (SubLObject)fi.NIL;
        SubLObject cdolist_list_var = el_supports;
        SubLObject el_support = (SubLObject)fi.NIL;
        el_support = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            if (fi.NIL != assertion_handles.assertion_p(el_support)) {
                v_hl_supports = (SubLObject)ConsesLow.cons(el_support, v_hl_supports);
            }
            else {
                SubLObject current;
                final SubLObject datum = current = el_support;
                SubLObject hl_module = (SubLObject)fi.NIL;
                SubLObject formula = (SubLObject)fi.NIL;
                SubLObject mt = (SubLObject)fi.NIL;
                SubLObject strength = (SubLObject)fi.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list172);
                hl_module = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list172);
                formula = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list172);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list172);
                strength = current.first();
                current = current.rest();
                if (fi.NIL == current) {
                    mt = fi_convert_to_assert_hlmt(mt);
                    if (fi.NIL != fi_error_signaledP()) {
                        return Values.values((SubLObject)fi.NIL, fi_get_error_int());
                    }
                    if (hl_module.eql(arguments.$assertion_support_module$.getGlobalValue())) {
                        thread.resetMultipleValues();
                        final SubLObject assertions = el_support_assertions(formula, mt);
                        final SubLObject all_thereP = thread.secondMultipleValue();
                        final SubLObject malformedP = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (fi.NIL != malformedP) {
                            return Values.values((SubLObject)fi.NIL, (SubLObject)ConsesLow.list((SubLObject)fi.$kw173$SUPPORT_MALFORMED, (SubLObject)fi.$str174$Support__S_was_malformed, el_support));
                        }
                        if (fi.NIL == all_thereP) {
                            return Values.values((SubLObject)fi.NIL, (SubLObject)ConsesLow.list((SubLObject)fi.$kw147$ASSERTION_NOT_PRESENT, (SubLObject)fi.$str148$Formula__S_in_mt__S_is_not_in_the, formula, mt));
                        }
                        if (fi.NIL == assertions) {
                            return Values.values((SubLObject)fi.NIL, (SubLObject)ConsesLow.list((SubLObject)fi.$kw173$SUPPORT_MALFORMED, (SubLObject)fi.$str174$Support__S_was_malformed, el_support));
                        }
                        SubLObject cdolist_list_var_$31 = assertions;
                        SubLObject assertion = (SubLObject)fi.NIL;
                        assertion = cdolist_list_var_$31.first();
                        while (fi.NIL != cdolist_list_var_$31) {
                            if (fi.NIL == assertion_handles.assertion_p(assertion)) {
                                return Values.values((SubLObject)fi.NIL, (SubLObject)ConsesLow.list((SubLObject)fi.$kw173$SUPPORT_MALFORMED, (SubLObject)fi.$str174$Support__S_was_malformed, el_support));
                            }
                            v_hl_supports = (SubLObject)ConsesLow.cons(assertion, v_hl_supports);
                            cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                            assertion = cdolist_list_var_$31.first();
                        }
                    }
                    else {
                        final SubLObject tv = enumeration_types.tv_from_truth_strength((SubLObject)fi.$kw175$TRUE, strength);
                        final SubLObject hl_support = arguments.make_hl_support(hl_module, formula, mt, tv);
                        if (fi.NIL != verify_supportsP && fi.NIL != tms.stale_support(hl_support)) {
                            return Values.values((SubLObject)fi.NIL, (SubLObject)ConsesLow.list((SubLObject)fi.$kw176$SUPPORT_INVALID, (SubLObject)fi.$str177$Support__S_is_not_currently_valid, el_support));
                        }
                        v_hl_supports = (SubLObject)ConsesLow.cons(hl_support, v_hl_supports);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)fi.$list172);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            el_support = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(v_hl_supports), (SubLObject)fi.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 82848L)
    public static SubLObject el_support_assertions(final SubLObject sentence, final SubLObject mt) {
        final SubLObject assertions = ke.find_assertions_via_tl(sentence, mt);
        if (fi.NIL != assertions) {
            return Values.values(assertions, (SubLObject)fi.T, (SubLObject)fi.NIL);
        }
        return sentence_assertions(sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 83234L)
    public static SubLObject fi_remove_argument(final SubLObject sentence, final SubLObject mt, final SubLObject supports, SubLObject verify_supportsP) {
        if (verify_supportsP == fi.UNPROVIDED) {
            verify_supportsP = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw178$REMOVE_ARGUMENT, sentence, hlmt_czer.canonicalize_hlmt(mt), supports, verify_supportsP, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 83477L)
    public static SubLObject fi_remove_argument_int(final SubLObject sentence, SubLObject mt, SubLObject supports, SubLObject verify_supportsP) {
        if (verify_supportsP == fi.UNPROVIDED) {
            verify_supportsP = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (fi.NIL == el_utilities.el_formula_p(sentence)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str107$Expected_a_cons__got__S, sentence));
            return (SubLObject)fi.NIL;
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        if (!supports.isCons()) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str107$Expected_a_cons__got__S, supports));
            return (SubLObject)fi.NIL;
        }
        SubLObject cdolist_list_var = supports;
        SubLObject support = (SubLObject)fi.NIL;
        support = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            if (fi.NIL == arguments.support_p(support)) {
                signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str167$Expected_a_support__got__S, support));
                return (SubLObject)fi.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        thread.resetMultipleValues();
        final SubLObject v_hl_supports = fi_canonicalize_el_supports(supports, verify_supportsP);
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (fi.NIL != error) {
            signal_fi_error(error);
            return (SubLObject)fi.NIL;
        }
        supports = v_hl_supports;
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert fi.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$32 = fi.$within_fi_operationP$.currentBinding(thread);
            try {
                fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
                final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)fi.$sym179$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    SubLObject canon_versions = (SubLObject)fi.NIL;
                    thread.resetMultipleValues();
                    final SubLObject canon_versions_$34 = czer_main.canonicalize_unassert_sentence(sentence, mt);
                    final SubLObject mt_$35 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    canon_versions = canon_versions_$34;
                    mt = mt_$35;
                    if (fi.NIL == canon_versions) {
                        signal_fi_error(fi_not_wff_error(sentence, mt));
                    }
                    else if (fi.NIL != kb_utilities.kbeq(canon_versions, fi.$const116$True)) {
                        signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw117$TAUTOLOGY, (SubLObject)fi.$str154$Sentence______S___in__S_was_a_tau, sentence, mt));
                    }
                    else if (fi.NIL != kb_utilities.kbeq(canon_versions, fi.$const119$False)) {
                        signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw120$CONTRADICTION, (SubLObject)fi.$str155$Sentence______S___in__S_was_a_con, sentence, mt));
                    }
                    else {
                        SubLObject cdolist_list_var2 = canon_versions;
                        SubLObject canon_version = (SubLObject)fi.NIL;
                        canon_version = cdolist_list_var2.first();
                        while (fi.NIL != cdolist_list_var2) {
                            if (fi.NIL == fi_error_signaledP()) {
                                SubLObject current;
                                final SubLObject datum = current = canon_version;
                                SubLObject cnf = (SubLObject)fi.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list122);
                                cnf = current.first();
                                current = current.rest();
                                final SubLObject variable_map = (SubLObject)(current.isCons() ? current.first() : fi.NIL);
                                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi.$list122);
                                current = current.rest();
                                final SubLObject query_free_vars = (SubLObject)(current.isCons() ? current.first() : fi.NIL);
                                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi.$list122);
                                current = current.rest();
                                if (fi.NIL == current) {
                                    hl_storage_modules.hl_remove_deduction(cnf, mt, supports);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)fi.$list122);
                                }
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            canon_version = cdolist_list_var2.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$33, thread);
                }
                ans = (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
            }
            finally {
                fi.$within_fi_operationP$.rebind(_prev_bind_0_$32, thread);
            }
            if (fi.NIL == fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
        }
        finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 85537L)
    public static SubLObject fi_blast(final SubLObject formula, final SubLObject mt) {
        return fi((SubLObject)fi.$kw180$BLAST, formula, hlmt_czer.canonicalize_hlmt(mt), (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 85949L)
    public static SubLObject fi_blast_int(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (fi.NIL == el_utilities.el_formula_p(formula)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str107$Expected_a_cons__got__S, formula));
            return (SubLObject)fi.NIL;
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert fi.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$36 = fi.$within_fi_operationP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
            try {
                fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
                czer_vars.$simplify_literalP$.bind((SubLObject)fi.NIL, thread);
                SubLObject canon_versions = (SubLObject)fi.NIL;
                thread.resetMultipleValues();
                final SubLObject canon_versions_$37 = canonicalize_fi_blast_sentence(formula, mt);
                final SubLObject mt_$38 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                canon_versions = canon_versions_$37;
                mt = mt_$38;
                final SubLObject canonical_mt = fi_convert_to_assert_hlmt(mt);
                if (fi.NIL == fi_error_signaledP()) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(canonical_mt);
                    final SubLObject _prev_bind_0_$37 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$40 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (fi.NIL == canon_versions) {
                            signal_fi_error(fi_not_wff_error(formula, mt));
                        }
                        else if (fi.NIL != kb_utilities.kbeq(canon_versions, fi.$const116$True)) {
                            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw117$TAUTOLOGY, (SubLObject)fi.$str118$Formula______S___in__S_was_a_taut, formula, mt));
                        }
                        else if (fi.NIL != kb_utilities.kbeq(canon_versions, fi.$const119$False)) {
                            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw120$CONTRADICTION, (SubLObject)fi.$str121$Formula______S___in__S_was_a_cont, formula, mt));
                        }
                        else {
                            SubLObject cdolist_list_var = canon_versions;
                            SubLObject canon_version = (SubLObject)fi.NIL;
                            canon_version = cdolist_list_var.first();
                            while (fi.NIL != cdolist_list_var) {
                                if (fi.NIL == fi_error_signaledP()) {
                                    SubLObject current;
                                    final SubLObject datum = current = canon_version;
                                    SubLObject cnf = (SubLObject)fi.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi.$list122);
                                    cnf = current.first();
                                    current = current.rest();
                                    final SubLObject variable_map = (SubLObject)(current.isCons() ? current.first() : fi.NIL);
                                    cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi.$list122);
                                    current = current.rest();
                                    final SubLObject query_free_vars = (SubLObject)(current.isCons() ? current.first() : fi.NIL);
                                    cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi.$list122);
                                    current = current.rest();
                                    if (fi.NIL == current) {
                                        hl_storage_modules.hl_remove_all_arguments(cnf, mt);
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)fi.$list122);
                                    }
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                canon_version = cdolist_list_var.first();
                            }
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$40, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$37, thread);
                    }
                }
                ans = (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
            }
            finally {
                czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
                fi.$within_fi_operationP$.rebind(_prev_bind_0_$36, thread);
            }
            if (fi.NIL == fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
        }
        finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 87432L)
    public static SubLObject fi_ask(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == fi.UNPROVIDED) {
            mt = (SubLObject)fi.NIL;
        }
        if (backchain == fi.UNPROVIDED) {
            backchain = (SubLObject)fi.NIL;
        }
        if (number == fi.UNPROVIDED) {
            number = (SubLObject)fi.NIL;
        }
        if (time == fi.UNPROVIDED) {
            time = (SubLObject)fi.NIL;
        }
        if (depth == fi.UNPROVIDED) {
            depth = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw183$ASK, formula, hlmt_czer.canonicalize_hlmt(mt), backchain, number, time, depth, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 88549L)
    public static SubLObject fi_ask_int(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == fi.UNPROVIDED) {
            mt = (SubLObject)fi.NIL;
        }
        if (backchain == fi.UNPROVIDED) {
            backchain = (SubLObject)fi.NIL;
        }
        if (number == fi.UNPROVIDED) {
            number = (SubLObject)fi.NIL;
        }
        if (time == fi.UNPROVIDED) {
            time = (SubLObject)fi.NIL;
        }
        if (depth == fi.UNPROVIDED) {
            depth = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (fi.NIL == el_utilities.el_formula_p(formula) && fi.NIL == cycl_grammar.cycl_truth_value_p(formula)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str188$Expected_a_formula__got__S, formula));
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL != fi_ask_ist_query_p(formula)) {
            SubLObject ist = (SubLObject)fi.NIL;
            SubLObject ist_mt = (SubLObject)fi.NIL;
            SubLObject ist_formula = (SubLObject)fi.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)fi.$list189);
            ist = formula.first();
            SubLObject current = formula.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)fi.$list189);
            ist_mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)fi.$list189);
            ist_formula = current.first();
            current = current.rest();
            if (fi.NIL == current) {
                return fi_ask_int(ist_formula, ist_mt, backchain, number, time, depth);
            }
            cdestructuring_bind.cdestructuring_bind_error(formula, (SubLObject)fi.$list189);
            return (SubLObject)fi.NIL;
        }
        else {
            if (fi.NIL == mt) {
                mt = mt_vars.$default_ask_mt$.getGlobalValue();
            }
            mt = fi_convert_to_ask_hlmt(mt);
            if (fi.NIL != fi_error_signaledP()) {
                return (SubLObject)fi.NIL;
            }
            if (fi.NIL != backchain && backchain != fi.T && !backchain.isInteger()) {
                signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str190$Expected_an_integer__got__S, backchain));
                return (SubLObject)fi.NIL;
            }
            if (fi.NIL != number && !number.isInteger()) {
                signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str190$Expected_an_integer__got__S, number));
                return (SubLObject)fi.NIL;
            }
            if (fi.NIL != time && !time.isInteger()) {
                signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str190$Expected_an_integer__got__S, time));
                return (SubLObject)fi.NIL;
            }
            if (fi.NIL != depth && !depth.isInteger()) {
                signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str190$Expected_an_integer__got__S, depth));
                return (SubLObject)fi.NIL;
            }
            SubLObject v_answer = (SubLObject)fi.NIL;
            SubLObject reason = (SubLObject)fi.NIL;
            final SubLObject environment = forward.get_forward_inference_environment();
            assert fi.NIL != queues.queue_p(environment) : environment;
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                final SubLObject _prev_bind_0_$41 = fi.$within_fi_operationP$.currentBinding(thread);
                try {
                    fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
                    thread.resetMultipleValues();
                    final SubLObject v_answer_$42 = fi_ask_int_new_cyc_query_trampoline(formula, mt, backchain, number, time, depth);
                    final SubLObject reason_$43 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    v_answer = v_answer_$42;
                    reason = reason_$43;
                }
                finally {
                    fi.$within_fi_operationP$.rebind(_prev_bind_0_$41, thread);
                }
                if (fi.NIL == fi_error_signaledP()) {
                    forward.perform_forward_inference();
                }
            }
            finally {
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
            }
            return Values.values(v_answer, reason);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 90382L)
    public static SubLObject fi_ask_ist_query_p(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL != el_utilities.el_formula_with_operator_p(formula, fi.$const191$ist) && Sequences.length(formula).numE((SubLObject)fi.THREE_INTEGER) && fi.NIL != forts.fort_p(conses_high.second(formula)) && conses_high.third(formula).isCons());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 90644L)
    public static SubLObject fi_ask_int_new_cyc_query_trampoline(final SubLObject sentence, final SubLObject mt, final SubLObject backchain, final SubLObject number, final SubLObject time, final SubLObject depth) {
        final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, time, depth);
        return inference_kernel.new_cyc_query(sentence, mt, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 90899L)
    public static SubLObject fi_continue_last_ask(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth, SubLObject reconsider_deep) {
        if (backchain == fi.UNPROVIDED) {
            backchain = (SubLObject)fi.NIL;
        }
        if (number == fi.UNPROVIDED) {
            number = (SubLObject)fi.NIL;
        }
        if (time == fi.UNPROVIDED) {
            time = (SubLObject)fi.NIL;
        }
        if (depth == fi.UNPROVIDED) {
            depth = (SubLObject)fi.NIL;
        }
        if (reconsider_deep == fi.UNPROVIDED) {
            reconsider_deep = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw192$CONTINUE_LAST_ASK, backchain, number, time, depth, reconsider_deep, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 92111L)
    public static SubLObject fi_continue_last_ask_int(SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth, SubLObject reconsider_deep) {
        if (backchain == fi.UNPROVIDED) {
            backchain = (SubLObject)fi.NIL;
        }
        if (number == fi.UNPROVIDED) {
            number = (SubLObject)fi.NIL;
        }
        if (time == fi.UNPROVIDED) {
            time = (SubLObject)fi.NIL;
        }
        if (depth == fi.UNPROVIDED) {
            depth = (SubLObject)fi.NIL;
        }
        if (reconsider_deep == fi.UNPROVIDED) {
            reconsider_deep = (SubLObject)fi.NIL;
        }
        Errors.error((SubLObject)fi.$str198$fi_continue_last_ask_int_is_depre);
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 92503L)
    public static SubLObject fi_ask_status() {
        Errors.error((SubLObject)fi.$str199$fi_ask_status_is_deprecated__use_);
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 93175L)
    public static SubLObject fi_ask_status_int() {
        Errors.error((SubLObject)fi.$str204$fi_ask_status_int_is_deprecated__);
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 93381L)
    public static SubLObject fi_tms_reconsider_formula(final SubLObject formula, final SubLObject mt) {
        return fi((SubLObject)fi.$kw205$TMS_RECONSIDER_FORMULA, formula, hlmt_czer.canonicalize_hlmt(mt), (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 93785L)
    public static SubLObject fi_tms_reconsider_formula_int(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (fi.NIL == el_utilities.el_formula_p(formula)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str107$Expected_a_cons__got__S, formula));
            return (SubLObject)fi.NIL;
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert fi.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$44 = fi.$within_fi_operationP$.currentBinding(thread);
            try {
                fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
                final SubLObject assertions = ke.find_assertions_via_tl(formula, mt);
                if (fi.NIL != assertions) {
                    SubLObject cdolist_list_var = assertions;
                    SubLObject assertion = (SubLObject)fi.NIL;
                    assertion = cdolist_list_var.first();
                    while (fi.NIL != cdolist_list_var) {
                        tms.tms_reconsider_assertion(assertion);
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    }
                }
                else {
                    SubLObject canon_versions = (SubLObject)fi.NIL;
                    thread.resetMultipleValues();
                    final SubLObject canon_versions_$45 = czer_main.canonicalize_cycl_sentence(formula, mt);
                    final SubLObject mt_$46 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    canon_versions = canon_versions_$45;
                    mt = mt_$46;
                    if (fi.NIL == canon_versions) {
                        signal_fi_error(fi_not_wff_error(formula, mt));
                    }
                    else if (fi.NIL == cycl_grammar.cycl_truth_value_p(canon_versions)) {
                        SubLObject cdolist_list_var2 = canon_versions;
                        SubLObject canon_version = (SubLObject)fi.NIL;
                        canon_version = cdolist_list_var2.first();
                        while (fi.NIL != cdolist_list_var2) {
                            thread.resetMultipleValues();
                            final SubLObject cnf = fi_canonicalize(canon_version, (SubLObject)fi.T, (SubLObject)fi.UNPROVIDED);
                            final SubLObject v_variables = thread.secondMultipleValue();
                            final SubLObject hl_tv = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject assertion2 = kb_indexing.find_assertion(cnf, mt);
                            if (fi.NIL == assertion2) {
                                signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw147$ASSERTION_NOT_PRESENT, (SubLObject)fi.$str148$Formula__S_in_mt__S_is_not_in_the, formula, mt));
                            }
                            else {
                                tms.tms_reconsider_assertion(assertion2);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            canon_version = cdolist_list_var2.first();
                        }
                    }
                }
                ans = (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
            }
            finally {
                fi.$within_fi_operationP$.rebind(_prev_bind_0_$44, thread);
            }
            if (fi.NIL == fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
        }
        finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 95215L)
    public static SubLObject fi_tms_reconsider_mt(final SubLObject mt) {
        return fi((SubLObject)fi.$kw208$TMS_RECONSIDER_MT, hlmt_czer.canonicalize_hlmt(mt), (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 95535L)
    public static SubLObject fi_tms_reconsider_mt_int(SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        mt = fi_convert_to_assert_hlmt(mt);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert fi.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$47 = fi.$within_fi_operationP$.currentBinding(thread);
            try {
                fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
                tms.tms_reconsider_mt(mt);
                ans = (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
            }
            finally {
                fi.$within_fi_operationP$.rebind(_prev_bind_0_$47, thread);
            }
            if (fi.NIL == fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
        }
        finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 95993L)
    public static SubLObject fi_tms_reconsider_gafs(final SubLObject v_term, SubLObject arg, SubLObject predicate, SubLObject mt) {
        if (arg == fi.UNPROVIDED) {
            arg = (SubLObject)fi.NIL;
        }
        if (predicate == fi.UNPROVIDED) {
            predicate = (SubLObject)fi.NIL;
        }
        if (mt == fi.UNPROVIDED) {
            mt = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw212$TMS_RECONSIDER_GAFS, v_term, arg, predicate, hlmt_czer.canonicalize_hlmt(mt), (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 96653L)
    public static SubLObject fi_tms_reconsider_gafs_int(SubLObject v_term, SubLObject arg, SubLObject predicate, SubLObject mt) {
        if (arg == fi.UNPROVIDED) {
            arg = (SubLObject)fi.NIL;
        }
        if (predicate == fi.UNPROVIDED) {
            predicate = (SubLObject)fi.NIL;
        }
        if (mt == fi.UNPROVIDED) {
            mt = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        v_term = fi_convert_to_fort(v_term);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL != arg && (!arg.isFixnum() || fi.NIL == enumeration_types.term_arg_p(arg))) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str216$Expected_an_integer_0_5__got__S, arg));
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL != predicate) {
            predicate = fi_convert_to_fort(predicate);
            if (fi.NIL != fi_error_signaledP()) {
                return (SubLObject)fi.NIL;
            }
        }
        if (fi.NIL != mt) {
            mt = fi_convert_to_assert_hlmt(mt);
            if (fi.NIL != fi_error_signaledP()) {
                return (SubLObject)fi.NIL;
            }
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert fi.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$48 = fi.$within_fi_operationP$.currentBinding(thread);
            try {
                fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
                if (fi.NIL == arg) {
                    tms.tms_reconsider_term_gafs(v_term, mt);
                }
                else if (arg.isZero()) {
                    tms.tms_reconsider_predicate_extent(v_term, mt);
                }
                else {
                    tms.tms_reconsider_gaf_args(v_term, arg, predicate, mt);
                }
                ans = (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
            }
            finally {
                fi.$within_fi_operationP$.rebind(_prev_bind_0_$48, thread);
            }
            if (fi.NIL == fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
        }
        finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 97685L)
    public static SubLObject fi_tms_reconsider_term(final SubLObject v_term, SubLObject mt) {
        if (mt == fi.UNPROVIDED) {
            mt = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw217$TMS_RECONSIDER_TERM, v_term, mt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 98081L)
    public static SubLObject fi_tms_reconsider_term_int(SubLObject v_term, SubLObject mt) {
        if (mt == fi.UNPROVIDED) {
            mt = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        v_term = fi_convert_to_fort(v_term);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL != mt) {
            mt = fi_convert_to_assert_hlmt(mt);
            if (fi.NIL != fi_error_signaledP()) {
                return (SubLObject)fi.NIL;
            }
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert fi.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            final SubLObject _prev_bind_0_$49 = fi.$within_fi_operationP$.currentBinding(thread);
            try {
                fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
                tms.tms_reconsider_term(v_term, mt);
                ans = (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
            }
            finally {
                fi.$within_fi_operationP$.rebind(_prev_bind_0_$49, thread);
            }
            if (fi.NIL == fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
        }
        finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 98672L)
    public static SubLObject fi_denotation(final SubLObject string) {
        return fi((SubLObject)fi.$kw221$DENOTATION, string, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 98803L)
    public static SubLObject fi_denotation_int(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (!string.isString()) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str33$Expected_a_string__got__S, string));
            return (SubLObject)fi.NIL;
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject _prev_bind_0 = fi.$within_fi_operationP$.currentBinding(thread);
        try {
            fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
            ans = lexicon_accessors.denots_of_string(string, (SubLObject)fi.$list222, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
        }
        finally {
            fi.$within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 99165L)
    public static SubLObject fi_timestamp_constant(final SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second) {
        if (why == fi.UNPROVIDED) {
            why = (SubLObject)fi.NIL;
        }
        if (second == fi.UNPROVIDED) {
            second = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw223$TIMESTAMP_CONSTANT, cyclist, time, why, second, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 99415L)
    public static SubLObject fi_timestamp_constant_int(SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second) {
        if (why == fi.UNPROVIDED) {
            why = (SubLObject)fi.NIL;
        }
        if (second == fi.UNPROVIDED) {
            second = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cyclist = canon_tl.transform_tl_terms_to_hl(cyclist);
        if (fi.NIL != why) {
            why = canon_tl.transform_tl_terms_to_hl(why);
        }
        reset_fi_error_state();
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject _prev_bind_0 = fi.$within_fi_operationP$.currentBinding(thread);
        try {
            fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
            if (fi.NIL == forts.fort_p(cyclist)) {
                signal_fi_warning((SubLObject)fi.$list224);
            }
            else if (!time.isInteger()) {
                signal_fi_warning((SubLObject)fi.$list225);
            }
            else if (fi.NIL != why && fi.NIL == constant_handles.constant_p(why)) {
                signal_fi_warning((SubLObject)fi.$list226);
            }
            else if (fi.NIL != second && fi.NIL == numeric_date_utilities.universal_second_p(second)) {
                signal_fi_warning((SubLObject)fi.$list227);
            }
            else if (fi.NIL == constant_handles.constant_p(fi.$fi_last_constant$.getDynamicValue(thread))) {
                signal_fi_warning((SubLObject)fi.$list228);
            }
            else if (fi.NIL != constant_timestampedP(fi.$fi_last_constant$.getDynamicValue(thread))) {
                signal_fi_warning((SubLObject)fi.$list229);
            }
            else {
                timestamp_constant(fi.$fi_last_constant$.getDynamicValue(thread), cyclist, time, why, second);
            }
            ans = (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
            fi.$fi_last_constant$.setDynamicValue((SubLObject)fi.NIL, thread);
            set_fi_last_assertions_asserted((SubLObject)fi.NIL);
        }
        finally {
            fi.$within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 100613L)
    public static SubLObject constant_timestampedP(final SubLObject constant) {
        assert fi.NIL != constant_handles.constant_p(constant) : constant;
        return (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL != kb_mapping_utilities.fpred_value_in_any_mt(constant, fi.$const231$myCreator, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED) || fi.NIL != kb_mapping_utilities.fpred_value_in_any_mt(constant, fi.$const232$myCreationTime, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED) || fi.NIL != kb_mapping_utilities.fpred_value_in_any_mt(constant, fi.$const233$myCreationPurpose, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED) || fi.NIL != kb_mapping_utilities.fpred_value_in_any_mt(constant, fi.$const234$myCreationSecond, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 100964L)
    public static SubLObject timestamp_constant(final SubLObject constant, final SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second) {
        if (why == fi.UNPROVIDED) {
            why = (SubLObject)fi.NIL;
        }
        if (second == fi.UNPROVIDED) {
            second = (SubLObject)fi.NIL;
        }
        final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)fi.$kw235$STRENGTH, (SubLObject)fi.$kw58$MONOTONIC, (SubLObject)fi.$kw236$DIRECTION, (SubLObject)fi.$kw135$BACKWARD);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(fi.$const231$myCreator, constant, cyclist), fi.$const237$BookkeepingMt, v_properties);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(fi.$const232$myCreationTime, constant, time), fi.$const237$BookkeepingMt, v_properties);
        if (fi.NIL != constant_handles.constant_p(why)) {
            cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(fi.$const233$myCreationPurpose, constant, why), fi.$const237$BookkeepingMt, v_properties);
        }
        if (fi.NIL != numeric_date_utilities.universal_second_p(second)) {
            cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(fi.$const234$myCreationSecond, constant, second), fi.$const237$BookkeepingMt, v_properties);
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 101549L)
    public static SubLObject untimestamp_constant(final SubLObject constant) {
        final SubLObject cyclist = kb_mapping_utilities.fpred_value_in_mt(constant, fi.$const231$myCreator, fi.$const237$BookkeepingMt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
        if (fi.NIL != cyclist) {
            fi_unassert_int((SubLObject)ConsesLow.list(fi.$const231$myCreator, constant, cyclist), fi.$const237$BookkeepingMt);
        }
        final SubLObject time = kb_mapping_utilities.fpred_value_in_mt(constant, fi.$const232$myCreationTime, fi.$const237$BookkeepingMt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
        if (fi.NIL != time) {
            fi_unassert_int((SubLObject)ConsesLow.list(fi.$const232$myCreationTime, constant, time), fi.$const237$BookkeepingMt);
        }
        final SubLObject why = kb_mapping_utilities.fpred_value_in_mt(constant, fi.$const233$myCreationPurpose, fi.$const237$BookkeepingMt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
        if (fi.NIL != why) {
            fi_unassert_int((SubLObject)ConsesLow.list(fi.$const233$myCreationPurpose, constant, why), fi.$const237$BookkeepingMt);
        }
        final SubLObject second = kb_mapping_utilities.fpred_value_in_mt(constant, fi.$const234$myCreationSecond, fi.$const237$BookkeepingMt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
        if (fi.NIL != second) {
            fi_unassert_int((SubLObject)ConsesLow.list(fi.$const234$myCreationSecond, constant, second), fi.$const237$BookkeepingMt);
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 102312L)
    public static SubLObject retimestamp_constant(final SubLObject constant, final SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second) {
        if (why == fi.UNPROVIDED) {
            why = (SubLObject)fi.NIL;
        }
        if (second == fi.UNPROVIDED) {
            second = (SubLObject)fi.NIL;
        }
        if (fi.NIL != forts.fort_p(cyclist) && time.isInteger() && (fi.NIL == why || fi.NIL != constant_handles.constant_p(why)) &&
        		 (fi.NIL == second || fi.NIL != numeric_date_utilities.universal_second_p(second))) {
            untimestamp_constant(constant);
            timestamp_constant(constant, cyclist, time, why, second);
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 102742L)
    public static SubLObject fi_timestamp_assertion(final SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second) {
        if (why == fi.UNPROVIDED) {
            why = (SubLObject)fi.NIL;
        }
        if (second == fi.UNPROVIDED) {
            second = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw238$TIMESTAMP_ASSERTION, cyclist, time, why, second, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 102948L)
    public static SubLObject fi_timestamp_assertion_int(SubLObject cyclist, final SubLObject time, SubLObject why, SubLObject second) {
        if (why == fi.UNPROVIDED) {
            why = (SubLObject)fi.NIL;
        }
        if (second == fi.UNPROVIDED) {
            second = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cyclist = canon_tl.transform_tl_terms_to_hl(cyclist);
        if (fi.NIL != why) {
            why = canon_tl.transform_tl_terms_to_hl(why);
        }
        reset_fi_error_state();
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject _prev_bind_0 = fi.$within_fi_operationP$.currentBinding(thread);
        try {
            fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
            if (fi.NIL == forts.fort_p(cyclist)) {
                signal_fi_warning((SubLObject)fi.$list224);
            }
            else if (!time.isInteger()) {
                signal_fi_warning((SubLObject)fi.$list225);
            }
            else if (fi.NIL != why && fi.NIL == constant_handles.constant_p(why)) {
                signal_fi_warning((SubLObject)fi.$list226);
            }
            else if (fi.NIL != second && fi.NIL == numeric_date_utilities.universal_second_p(second)) {
                signal_fi_warning((SubLObject)fi.$list227);
            }
            else if (!czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread).isCons()) {
                signal_fi_warning((SubLObject)fi.$list239);
            }
            else {
                SubLObject cdolist_list_var;
                final SubLObject assertions = cdolist_list_var = czer_vars.$fi_last_assertions_asserted$.getDynamicValue(thread);
                SubLObject assertion = (SubLObject)fi.NIL;
                assertion = cdolist_list_var.first();
                while (fi.NIL != cdolist_list_var) {
                    if (fi.NIL != assertions_high.asserted_assertionP(assertion)) {
                        if (fi.NIL != assertions_low.asserted_assertion_timestampedP(assertion)) {
                            signal_fi_warning((SubLObject)fi.$list229);
                        }
                        else {
                            assertions_high.timestamp_asserted_assertion(assertion, cyclist, time, why, second);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                }
            }
            ans = (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
            set_fi_last_assertions_asserted((SubLObject)fi.NIL);
        }
        finally {
            fi.$within_fi_operationP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 104267L)
    public static SubLObject fi_remove_timestamp(final SubLObject sentence, SubLObject mt) {
        if (mt == fi.UNPROVIDED) {
            mt = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw240$REMOVE_TIMESTAMP, sentence, mt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 104434L)
    public static SubLObject fi_remove_timestamp_int(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_fi_error_state();
        if (fi.NIL == el_utilities.el_formula_p(formula)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str107$Expected_a_cons__got__S, formula));
            return (SubLObject)fi.NIL;
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        SubLObject ans = (SubLObject)fi.NIL;
        final SubLObject environment = forward.get_forward_inference_environment();
        assert fi.NIL != queues.queue_p(environment) : environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        final SubLObject _prev_bind_2 = fi.$within_fi_operationP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            fi.$within_fi_operationP$.bind((SubLObject)fi.T, thread);
            final SubLObject assertions = ke.find_assertions_via_tl(formula, mt);
            if (fi.NIL != assertions) {
                SubLObject cdolist_list_var = assertions;
                SubLObject assertion = (SubLObject)fi.NIL;
                assertion = cdolist_list_var.first();
                while (fi.NIL != cdolist_list_var) {
                    assertions_high.remove_asserted_assertion_timestamp(assertion);
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                }
            }
            else {
                SubLObject canon_versions = (SubLObject)fi.NIL;
                thread.resetMultipleValues();
                final SubLObject canon_versions_$50 = czer_main.canonicalize_cycl_sentence(formula, mt);
                final SubLObject mt_$51 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                canon_versions = canon_versions_$50;
                mt = mt_$51;
                if (fi.NIL == canon_versions) {
                    signal_fi_error(fi_not_wff_error(formula, mt));
                }
                else if (fi.NIL == cycl_grammar.cycl_truth_value_p(canon_versions)) {
                    SubLObject cdolist_list_var2 = canon_versions;
                    SubLObject canon_version = (SubLObject)fi.NIL;
                    canon_version = cdolist_list_var2.first();
                    while (fi.NIL != cdolist_list_var2) {
                        thread.resetMultipleValues();
                        final SubLObject cnf = fi_canonicalize(canon_version, (SubLObject)fi.T, (SubLObject)fi.UNPROVIDED);
                        final SubLObject v_variables = thread.secondMultipleValue();
                        final SubLObject hl_tv = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject assertion2 = kb_indexing.find_assertion(cnf, mt);
                        if (fi.NIL == assertion2) {
                            signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)fi.$kw147$ASSERTION_NOT_PRESENT, (SubLObject)fi.$str148$Formula__S_in_mt__S_is_not_in_the, formula, mt));
                        }
                        else {
                            assertions_high.remove_asserted_assertion_timestamp(assertion2);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        canon_version = cdolist_list_var2.first();
                    }
                }
            }
            ans = (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
        }
        finally {
            fi.$within_fi_operationP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 105749L)
    public static SubLObject fi_rename_variables(final SubLObject sentence, final SubLObject rename_variable_alist, SubLObject mt) {
        if (mt == fi.UNPROVIDED) {
            mt = (SubLObject)fi.NIL;
        }
        return fi((SubLObject)fi.$kw241$RENAME_VARIABLES, sentence, rename_variable_alist, mt, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 106426L)
    public static SubLObject fi_rename_variables_int(SubLObject formula, final SubLObject rename_variable_alist, SubLObject mt) {
        if (mt == fi.UNPROVIDED) {
            mt = (SubLObject)fi.NIL;
        }
        reset_fi_error_state();
        if (fi.NIL == el_utilities.el_formula_p(formula)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str107$Expected_a_cons__got__S, formula));
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL != el_utilities.ist_sentence_p(formula, (SubLObject)fi.UNPROVIDED)) {
            mt = el_utilities.designated_mt(formula);
            formula = el_utilities.designated_sentence(formula);
        }
        mt = fi_convert_to_assert_hlmt(mt);
        if (fi.NIL != fi_error_signaledP()) {
            return (SubLObject)fi.NIL;
        }
        final SubLObject assertions = czer_meta.find_assertions_cycl(formula, mt);
        if (fi.NIL != assertions) {
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = (SubLObject)fi.NIL;
            assertion = cdolist_list_var.first();
            while (fi.NIL != cdolist_list_var) {
                if (fi.NIL != el_utilities.simple_variable_rename_impossibleP(assertion, rename_variable_alist)) {
                    signal_fi_error((SubLObject)fi.$list242);
                    return (SubLObject)fi.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
            cdolist_list_var = assertions;
            assertion = (SubLObject)fi.NIL;
            assertion = cdolist_list_var.first();
            while (fi.NIL != cdolist_list_var) {
                assertion_utilities.rename_assertion_variables(assertion, rename_variable_alist);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        else {
            signal_fi_warning((SubLObject)fi.$list239);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 107416L)
    public static SubLObject fi_get_parameter(final SubLObject symbol) {
        return fi((SubLObject)fi.$kw243$GET_PARAMETER, symbol, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 107548L)
    public static SubLObject fi_get_parameter_int(final SubLObject symbol) {
        reset_fi_error_state();
        if (!symbol.isSymbol()) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str244$Expected_a_symbol__got__S, symbol));
            return (SubLObject)fi.NIL;
        }
        if (fi.NIL == Symbols.boundp(symbol)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw245$UNBOUND, (SubLObject)fi.$str246$Parameter__S_is_not_bound, symbol));
            return (SubLObject)fi.NIL;
        }
        return Symbols.symbol_value(symbol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 107910L)
    public static SubLObject fi_set_parameter(final SubLObject symbol, final SubLObject value) {
        return fi((SubLObject)fi.$kw247$SET_PARAMETER, symbol, value, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 107994L)
    public static SubLObject fi_set_parameter_int(final SubLObject symbol, final SubLObject value) {
        reset_fi_error_state();
        if (!symbol.isSymbol()) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str244$Expected_a_symbol__got__S, symbol));
            return (SubLObject)fi.NIL;
        }
        Symbols.set(symbol, value);
        return (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == fi_error_signaledP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 108284L)
    public static SubLObject fi_eval(final SubLObject form) {
        return fi((SubLObject)fi.$kw248$EVAL, form, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 108531L)
    public static SubLObject fi_eval_int(final SubLObject form) {
        reset_fi_error_state();
        return Eval.eval(form);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 108605L)
    public static SubLObject fi_local_eval(final SubLObject form) {
        return fi((SubLObject)fi.$kw249$LOCAL_EVAL, form, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 108762L)
    public static SubLObject fi_local_eval_int(final SubLObject form) {
        reset_fi_error_state();
        return Eval.eval(form);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 108842L)
    public static SubLObject ke_purpose() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return api_control_vars.$ke_purpose$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 108969L)
    public static SubLObject set_ke_purpose(final SubLObject purpose) {
        if (fi.NIL != purpose && !fi.assertionsDisabledSync && fi.NIL == forts.fort_p(purpose)) {
            throw new AssertionError(purpose);
        }
        api_control_vars.$ke_purpose$.setDynamicValue(purpose);
        return purpose;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 109314L)
    public static SubLObject the_date() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (fi.$the_date$.getDynamicValue(thread).isInteger()) {
            return fi.$the_date$.getDynamicValue(thread);
        }
        return numeric_date_utilities.get_universal_date((SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 109671L)
    public static SubLObject the_second() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (fi.$the_second$.getDynamicValue(thread).isInteger()) {
            return fi.$the_second$.getDynamicValue(thread);
        }
        return numeric_date_utilities.get_universal_second((SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 109853L)
    public static SubLObject fi_convert_to_assert_hlmt_if_wft(final SubLObject el_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (fi.NIL == fi.$assume_assert_sentence_is_wfP$.getDynamicValue(thread) && fi.NIL != cycl_grammar.cycl_nat_p(el_term) && fi.NIL == wff.el_wftP(el_term, mt_vars.$mt_mt$.getGlobalValue(), (SubLObject)fi.UNPROVIDED)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw250$HLMT_NOT_WELL_FORMED, (SubLObject)fi.$str251$Microtheory__S____was_not_well_fo, el_term, wff.explanation_of_why_not_wft(el_term, mt_vars.$mt_mt$.getGlobalValue(), (SubLObject)fi.UNPROVIDED)));
            return (SubLObject)fi.NIL;
        }
        return fi_convert_to_assert_hlmt(el_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 110444L)
    public static SubLObject fi_convert_to_assert_hlmt(final SubLObject el_term) {
        final SubLObject v_hlmt = czer_main.canonicalize_assert_mt(el_term);
        if (fi.NIL == hlmt.hlmt_p(v_hlmt)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str252$Expected_a_microtheory__got__S, el_term));
            return (SubLObject)fi.NIL;
        }
        return v_hlmt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 110722L)
    public static SubLObject fi_convert_to_ask_hlmt(final SubLObject el_term) {
        final SubLObject v_hlmt = czer_main.canonicalize_ask_mt(el_term);
        if (fi.NIL == hlmt.hlmt_p(v_hlmt)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str252$Expected_a_microtheory__got__S, el_term));
            return (SubLObject)fi.NIL;
        }
        return v_hlmt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 111025L)
    public static SubLObject fi_convert_to_fort(final SubLObject el_term) {
        final SubLObject fort = fi_canonicalize_el_term(el_term);
        if (fi.NIL == forts.fort_p(fort)) {
            signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi.$kw32$ARG_ERROR, (SubLObject)fi.$str253$Expected_a_term__got__S, el_term));
            return (SubLObject)fi.NIL;
        }
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 111258L)
    public static SubLObject fi_canonicalize_el_term(SubLObject el_term) {
        el_term = canon_tl.transform_tl_terms_to_hl(el_term);
        if (fi.NIL != hlmt.fort_or_chlmt_p(el_term)) {
            return el_term;
        }
        if (fi.NIL != el_utilities.possibly_naut_p(el_term)) {
            return narts_high.find_nart(el_term);
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 111504L)
    public static SubLObject fi_canonicalize(final SubLObject canon_info, SubLObject canon_gaf, SubLObject strength) {
        if (canon_gaf == fi.UNPROVIDED) {
            canon_gaf = (SubLObject)fi.NIL;
        }
        if (strength == fi.UNPROVIDED) {
            strength = (SubLObject)fi.$kw109$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cnf = canon_info.first();
        final SubLObject v_variables = Mapping.mapcar(Symbols.symbol_function((SubLObject)fi.$sym254$CAR), conses_high.second(canon_info));
        SubLObject hl_tv = (SubLObject)fi.NIL;
        if (fi.NIL != control_vars.$within_assert$.getDynamicValue(thread) && !fi.assertionsDisabledSync && fi.NIL == kb_var_listP(Mapping.mapcar(Symbols.symbol_function((SubLObject)fi.$sym255$CDR), conses_high.second(canon_info)))) {
            throw new AssertionError(Mapping.mapcar(Symbols.symbol_function((SubLObject)fi.$sym255$CDR), conses_high.second(canon_info)));
        }
        if (fi.NIL != canon_gaf && fi.NIL != clauses.atomic_clause_p(cnf) && fi.NIL == v_variables) {
            if (fi.NIL == clauses.neg_lits(cnf)) {
                hl_tv = (SubLObject)((strength == fi.$kw58$MONOTONIC) ? fi.$kw257$TRUE_MON : fi.$kw258$TRUE_DEF);
            }
            else {
                ConsesLow.rplaca(cnf.rest(), clauses.neg_lits(cnf));
                ConsesLow.rplaca(cnf, (SubLObject)fi.NIL);
                hl_tv = (SubLObject)((strength == fi.$kw58$MONOTONIC) ? fi.$kw259$FALSE_MON : fi.$kw260$FALSE_DEF);
            }
        }
        else {
            hl_tv = (SubLObject)((strength == fi.$kw58$MONOTONIC) ? fi.$kw257$TRUE_MON : fi.$kw258$TRUE_DEF);
        }
        return Values.values(cnf, v_variables, hl_tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 112623L)
    public static SubLObject fi_canonicalize_gaf(final SubLObject formula, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_versions = (SubLObject)fi.NIL;
        thread.resetMultipleValues();
        final SubLObject canon_versions_$52 = czer_main.canonicalize_assert_sentence(formula, mt);
        final SubLObject mt_$53 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_versions = canon_versions_$52;
        mt = mt_$53;
        if (canon_versions.isCons() && Sequences.length(canon_versions).numE((SubLObject)fi.ONE_INTEGER)) {
            return fi_canonicalize(canon_versions.first(), (SubLObject)fi.T, (SubLObject)fi.UNPROVIDED);
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 113059L)
    public static SubLObject clear_cached_fi_canonicalize_gaf() {
        final SubLObject cs = fi.$cached_fi_canonicalize_gaf_caching_state$.getGlobalValue();
        if (fi.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 113059L)
    public static SubLObject remove_cached_fi_canonicalize_gaf(final SubLObject formula, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(fi.$cached_fi_canonicalize_gaf_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(formula, mt), (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 113059L)
    public static SubLObject cached_fi_canonicalize_gaf_internal(final SubLObject formula, final SubLObject mt) {
        return fi_canonicalize_gaf(formula, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 113059L)
    public static SubLObject cached_fi_canonicalize_gaf(final SubLObject formula, final SubLObject mt) {
        SubLObject caching_state = fi.$cached_fi_canonicalize_gaf_caching_state$.getGlobalValue();
        if (fi.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)fi.$sym261$CACHED_FI_CANONICALIZE_GAF, (SubLObject)fi.$sym262$_CACHED_FI_CANONICALIZE_GAF_CACHING_STATE_, (SubLObject)fi.NIL, (SubLObject)fi.EQUAL, (SubLObject)fi.TWO_INTEGER, (SubLObject)fi.$int263$100);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)fi.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)fi.NIL;
            collision = cdolist_list_var.first();
            while (fi.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (fi.NIL != cached_args && fi.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_fi_canonicalize_gaf_internal(formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(formula, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 113180L)
    public static SubLObject fi_canonicalize_literal(final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cnf = fi_canonicalize_gaf(literal, mt);
        final SubLObject v_variables = thread.secondMultipleValue();
        final SubLObject hl_tv = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject atomic_sentence = clauses.pos_lits(cnf).first();
        if (enumeration_types.tv_truth(hl_tv) == fi.$kw171$FALSE) {
            return cycl_utilities.negate(atomic_sentence);
        }
        return atomic_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 113542L)
    public static SubLObject fi_canonicalize_ask(final SubLObject canon_info) {
        SubLObject dnf = (SubLObject)fi.NIL;
        SubLObject v_variables = (SubLObject)fi.NIL;
        SubLObject free_variables = (SubLObject)fi.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(canon_info, canon_info, (SubLObject)fi.$list264);
        dnf = canon_info.first();
        SubLObject current = canon_info.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, canon_info, (SubLObject)fi.$list264);
        v_variables = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, canon_info, (SubLObject)fi.$list264);
        free_variables = current.first();
        current = current.rest();
        if (fi.NIL == current) {
            return Values.values(dnf, Mapping.mapcar(Symbols.symbol_function((SubLObject)fi.$sym265$FIRST), v_variables), free_variables);
        }
        cdestructuring_bind.cdestructuring_bind_error(canon_info, (SubLObject)fi.$list264);
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 113716L)
    public static SubLObject kb_var_listP(final SubLObject list) {
        if (list.isList()) {
            SubLObject not_kb_var_listP = (SubLObject)fi.NIL;
            if (fi.NIL == not_kb_var_listP) {
                SubLObject csome_list_var = list;
                SubLObject element = (SubLObject)fi.NIL;
                element = csome_list_var.first();
                while (fi.NIL == not_kb_var_listP && fi.NIL != csome_list_var) {
                    if (fi.NIL == variables.variable_p(element)) {
                        not_kb_var_listP = (SubLObject)fi.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    element = csome_list_var.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(fi.NIL == not_kb_var_listP);
        }
        return (SubLObject)fi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 114154L)
    public static SubLObject assertion_fi_formula(final SubLObject assertion, SubLObject substitute_varsP) {
        if (substitute_varsP == fi.UNPROVIDED) {
            substitute_varsP = (SubLObject)fi.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject scope_mt = fi.$assertion_fi_formula_mt_scope$.getDynamicValue(thread);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject formula = (SubLObject)fi.NIL;
        if (fi.NIL != scope_mt && fi.NIL == hlmt.hlmt_equal(mt, scope_mt)) {
            formula = assertions_high.assertion_ist_formula(assertion);
        }
        else {
            formula = assertions_high.assertion_formula(assertion);
        }
        formula = conses_high.copy_tree(formula);
        final SubLObject _prev_bind_0 = fi.$assertion_fi_formula_mt_scope$.currentBinding(thread);
        try {
            fi.$assertion_fi_formula_mt_scope$.bind(mt, thread);
            formula = perform_fi_substitutions(formula, (SubLObject)((fi.NIL != substitute_varsP) ? assertions_high.assertion_el_variables(assertion) : fi.NIL));
        }
        finally {
            fi.$assertion_fi_formula_mt_scope$.rebind(_prev_bind_0, thread);
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 114931L)
    public static SubLObject assertion_hl_formula(final SubLObject assertion, SubLObject substitute_varsP) {
        if (substitute_varsP == fi.UNPROVIDED) {
            substitute_varsP = (SubLObject)fi.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert fi.NIL != assertion_handles.assertion_p(assertion) : assertion;
        SubLObject formula = (SubLObject)fi.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            api_control_vars.$generate_readable_fi_results$.bind((SubLObject)fi.NIL, thread);
            formula = assertion_fi_formula(assertion, substitute_varsP);
        }
        finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0, thread);
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 115201L)
    public static SubLObject assertion_fi_ist_formula(final SubLObject assertion, SubLObject substitute_varsP) {
        if (substitute_varsP == fi.UNPROVIDED) {
            substitute_varsP = (SubLObject)fi.T;
        }
        return (SubLObject)ConsesLow.list(fi.$const191$ist, assertions_high.assertion_mt(assertion), assertion_fi_formula(assertion, substitute_varsP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 115556L)
    public static SubLObject assertion_fi_cnf(final SubLObject assertion, SubLObject substitute_varsP) {
        if (substitute_varsP == fi.UNPROVIDED) {
            substitute_varsP = (SubLObject)fi.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject cnf = conses_high.copy_tree(assertions_high.assertion_cnf(assertion));
        final SubLObject _prev_bind_0 = fi.$assertion_fi_formula_mt_scope$.currentBinding(thread);
        try {
            fi.$assertion_fi_formula_mt_scope$.bind(mt, thread);
            cnf = perform_fi_substitutions(cnf, (SubLObject)((fi.NIL != substitute_varsP) ? assertions_high.assertion_el_variables(assertion) : fi.NIL));
        }
        finally {
            fi.$assertion_fi_formula_mt_scope$.rebind(_prev_bind_0, thread);
        }
        return cnf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 115902L)
    public static SubLObject assertion_cnf_with_el_vars(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)fi.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            api_control_vars.$generate_readable_fi_results$.bind((SubLObject)fi.NIL, thread);
            result = perform_fi_substitutions(conses_high.copy_tree(assertions_high.assertion_cnf(assertion)), assertions_high.assertion_el_variables(assertion));
        }
        finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 116346L)
    public static SubLObject perform_fi_substitutions(SubLObject v_object, SubLObject symbol_variables) {
        if (symbol_variables == fi.UNPROVIDED) {
            symbol_variables = (SubLObject)fi.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = symbol_variables;
        SubLObject symbol = (SubLObject)fi.NIL;
        symbol = cdolist_list_var.first();
        while (fi.NIL != cdolist_list_var) {
            final SubLObject variable = variables.find_variable_by_id(Sequences.position(symbol, symbol_variables, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED));
            v_object = conses_high.nsubst(symbol, variable, v_object, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        }
        v_object = transform_list_utilities.ntransform(v_object, Symbols.symbol_function((SubLObject)fi.$sym266$VARIABLE_P), Symbols.symbol_function((SubLObject)fi.$sym267$DEFAULT_EL_VAR_FOR_HL_VAR), (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED, (SubLObject)fi.UNPROVIDED);
        if (fi.NIL != api_control_vars.$generate_readable_fi_results$.getDynamicValue(thread)) {
            v_object = assertion_expand(v_object);
            v_object = narts_high.nart_expand(v_object);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 117079L)
    public static SubLObject assertion_expand(SubLObject v_object) {
        if (fi.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)fi.$sym84$ASSERTION_P), v_object, (SubLObject)fi.UNPROVIDED)) {
            v_object = transform_list_utilities.transform(v_object, Symbols.symbol_function((SubLObject)fi.$sym84$ASSERTION_P), Symbols.symbol_function((SubLObject)fi.$sym108$ASSERTION_FI_FORMULA), (SubLObject)fi.UNPROVIDED);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi.lisp", position = 117251L)
    public static SubLObject assertion_ist_expand(SubLObject v_object) {
        if (fi.NIL != list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)fi.$sym84$ASSERTION_P), v_object, (SubLObject)fi.UNPROVIDED)) {
            v_object = transform_list_utilities.transform(v_object, Symbols.symbol_function((SubLObject)fi.$sym84$ASSERTION_P), Symbols.symbol_function((SubLObject)fi.$sym268$ASSERTION_FI_IST_FORMULA), (SubLObject)fi.UNPROVIDED);
        }
        return v_object;
    }
    
    public static SubLObject declare_fi_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "reset_fi_error_state", "RESET-FI-ERROR-STATE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.fi", "with_clean_fi_error_state", "WITH-CLEAN-FI-ERROR-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "reset_fi_warning", "RESET-FI-WARNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "signal_fi_warning", "SIGNAL-FI-WARNING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_warning_signaledP", "FI-WARNING-SIGNALED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_get_warning_int", "FI-GET-WARNING-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "reset_fi_error", "RESET-FI-ERROR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "signal_fi_error", "SIGNAL-FI-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_error_signaledP", "FI-ERROR-SIGNALED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_get_error_int", "FI-GET-ERROR-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_error_string", "FI-ERROR-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_get_error_string_int", "FI-GET-ERROR-STRING-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "set_fi_last_assertions_asserted", "SET-FI-LAST-ASSERTIONS-ASSERTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "push_fi_last_assertions_asserted", "PUSH-FI-LAST-ASSERTIONS-ASSERTED", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.fi", "within_fi_operation", "WITHIN-FI-OPERATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "already_within_fi_operationP", "ALREADY-WITHIN-FI-OPERATION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi", "FI", 1, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_construct_form_to_enqueue", "FI-CONSTRUCT-FORM-TO-ENQUEUE", 1, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_quotify", "FI-QUOTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_1", "FI-1", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "possibly_add_to_transcript_queues", "POSSIBLY-ADD-TO-TRANSCRIPT-QUEUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "safe_fi", "SAFE-FI", 1, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_get_warning", "FI-GET-WARNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_get_error", "FI-GET-ERROR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_find", "FI-FIND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_find_int", "FI-FIND-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_complete", "FI-COMPLETE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_complete_int", "FI-COMPLETE-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_create", "FI-CREATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_create_int", "FI-CREATE-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "handle_id_clash", "HANDLE-ID-CLASH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_find_or_create", "FI-FIND-OR-CREATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_find_or_create_int", "FI-FIND-OR-CREATE-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_create_skolem", "FI-CREATE-SKOLEM", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_create_skolem_int", "FI-CREATE-SKOLEM-INT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_skolem_assert_arg_isas", "FI-SKOLEM-ASSERT-ARG-ISAS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_skolem_assert_result_types", "FI-SKOLEM-ASSERT-RESULT-TYPES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "new_skolem_name", "NEW-SKOLEM-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "next_random_basis_for_skolem_name", "NEXT-RANDOM-BASIS-FOR-SKOLEM-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "new_random_basis_for_skolem_name", "NEW-RANDOM-BASIS-FOR-SKOLEM-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_merge", "FI-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_merge_int", "FI-MERGE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "merge_fort_recursive", "MERGE-FORT-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "merge_dependent_narts", "MERGE-DEPENDENT-NARTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "merge_dependent_kb_hl_supports", "MERGE-DEPENDENT-KB-HL-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "substitute_assertion", "SUBSTITUTE-ASSERTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "substitute_asserted_argument", "SUBSTITUTE-ASSERTED-ARGUMENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "substitute_deduction", "SUBSTITUTE-DEDUCTION", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "substitute_dependents", "SUBSTITUTE-DEPENDENTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "substitute_dependent_assertion", "SUBSTITUTE-DEPENDENT-ASSERTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "substitute_termofunit_assertion", "SUBSTITUTE-TERMOFUNIT-ASSERTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "make_merge_fort_assertion_map", "MAKE-MERGE-FORT-ASSERTION-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "merge_fort_assertion_map_validP", "MERGE-FORT-ASSERTION-MAP-VALID?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "add_merge_fort_assertion_mapping", "ADD-MERGE-FORT-ASSERTION-MAPPING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "get_merge_fort_assertion_mapping", "GET-MERGE-FORT-ASSERTION-MAPPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_kill", "FI-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_kill_int", "FI-KILL-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_rename", "FI-RENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_rename_int", "FI-RENAME-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_lookup", "FI-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_lookup_int", "FI-LOOKUP-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "sentence_assertions_in_mt", "SENTENCE-ASSERTIONS-IN-MT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "sentence_assertions", "SENTENCE-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "sentence_visible_assertions", "SENTENCE-VISIBLE-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "sentence_assertions_in_any_mt", "SENTENCE-ASSERTIONS-IN-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "sentence_assertion", "SENTENCE-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "gaf_sentence_assertion", "GAF-SENTENCE-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_assert", "FI-ASSERT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_assert_int", "FI-ASSERT-INT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "perform_assert_post_processing", "PERFORM-ASSERT-POST-PROCESSING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "perform_assert_post_processing_for_skolem", "PERFORM-ASSERT-POST-PROCESSING-FOR-SKOLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_perform_assert_post_processing_for_skolem", "FI-PERFORM-ASSERT-POST-PROCESSING-FOR-SKOLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_cnf_default_direction", "FI-CNF-DEFAULT-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_not_wff_error", "FI-NOT-WFF-ERROR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_not_wff_assert_error", "FI-NOT-WFF-ASSERT-ERROR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_assert_update_asserted_argument", "FI-ASSERT-UPDATE-ASSERTED-ARGUMENT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "hl_assert_update_asserted_argument", "HL-ASSERT-UPDATE-ASSERTED-ARGUMENT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_reassert", "FI-REASSERT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_reassert_int", "FI-REASSERT-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_reassert_hl_tv", "FI-REASSERT-HL-TV", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_rededuce_deduction_assertion", "FI-REDEDUCE-DEDUCTION-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_deny", "FI-DENY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_deny_int", "FI-DENY-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_unassert", "FI-UNASSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_unassert_int", "FI-UNASSERT-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "canonicalize_fi_unassert_sentence", "CANONICALIZE-FI-UNASSERT-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "canonicalize_fi_blast_sentence", "CANONICALIZE-FI-BLAST-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "canonicalize_fi_remove_sentence", "CANONICALIZE-FI-REMOVE-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "canonicalize_unassert_hlmt", "CANONICALIZE-UNASSERT-HLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_edit", "FI-EDIT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_edit_int", "FI-EDIT-INT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_justify", "FI-JUSTIFY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_justify_int", "FI-JUSTIFY-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "formula_justify", "FORMULA-JUSTIFY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "gaf_justify", "GAF-JUSTIFY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "one_step_gaf_justify", "ONE-STEP-GAF-JUSTIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "justify_support", "JUSTIFY-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_add_argument", "FI-ADD-ARGUMENT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_add_argument_int", "FI-ADD-ARGUMENT-INT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "perform_deduce_post_processing", "PERFORM-DEDUCE-POST-PROCESSING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "convert_hl_support_to_el_support", "CONVERT-HL-SUPPORT-TO-EL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "convert_hl_support_to_fi_support", "CONVERT-HL-SUPPORT-TO-FI-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "convert_hl_support_to_tl_support", "CONVERT-HL-SUPPORT-TO-TL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "make_el_support", "MAKE-EL-SUPPORT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_canonicalize_el_supports", "FI-CANONICALIZE-EL-SUPPORTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "el_support_assertions", "EL-SUPPORT-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_remove_argument", "FI-REMOVE-ARGUMENT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_remove_argument_int", "FI-REMOVE-ARGUMENT-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_blast", "FI-BLAST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_blast_int", "FI-BLAST-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_ask", "FI-ASK", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_ask_int", "FI-ASK-INT", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_ask_ist_query_p", "FI-ASK-IST-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_ask_int_new_cyc_query_trampoline", "FI-ASK-INT-NEW-CYC-QUERY-TRAMPOLINE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_continue_last_ask", "FI-CONTINUE-LAST-ASK", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_continue_last_ask_int", "FI-CONTINUE-LAST-ASK-INT", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_ask_status", "FI-ASK-STATUS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_ask_status_int", "FI-ASK-STATUS-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_tms_reconsider_formula", "FI-TMS-RECONSIDER-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_tms_reconsider_formula_int", "FI-TMS-RECONSIDER-FORMULA-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_tms_reconsider_mt", "FI-TMS-RECONSIDER-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_tms_reconsider_mt_int", "FI-TMS-RECONSIDER-MT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_tms_reconsider_gafs", "FI-TMS-RECONSIDER-GAFS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_tms_reconsider_gafs_int", "FI-TMS-RECONSIDER-GAFS-INT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_tms_reconsider_term", "FI-TMS-RECONSIDER-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_tms_reconsider_term_int", "FI-TMS-RECONSIDER-TERM-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_denotation", "FI-DENOTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_denotation_int", "FI-DENOTATION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_timestamp_constant", "FI-TIMESTAMP-CONSTANT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_timestamp_constant_int", "FI-TIMESTAMP-CONSTANT-INT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "constant_timestampedP", "CONSTANT-TIMESTAMPED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "timestamp_constant", "TIMESTAMP-CONSTANT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "untimestamp_constant", "UNTIMESTAMP-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "retimestamp_constant", "RETIMESTAMP-CONSTANT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_timestamp_assertion", "FI-TIMESTAMP-ASSERTION", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_timestamp_assertion_int", "FI-TIMESTAMP-ASSERTION-INT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_remove_timestamp", "FI-REMOVE-TIMESTAMP", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_remove_timestamp_int", "FI-REMOVE-TIMESTAMP-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_rename_variables", "FI-RENAME-VARIABLES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_rename_variables_int", "FI-RENAME-VARIABLES-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_get_parameter", "FI-GET-PARAMETER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_get_parameter_int", "FI-GET-PARAMETER-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_set_parameter", "FI-SET-PARAMETER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_set_parameter_int", "FI-SET-PARAMETER-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_eval", "FI-EVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_eval_int", "FI-EVAL-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_local_eval", "FI-LOCAL-EVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_local_eval_int", "FI-LOCAL-EVAL-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "ke_purpose", "KE-PURPOSE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "set_ke_purpose", "SET-KE-PURPOSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "the_date", "THE-DATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "the_second", "THE-SECOND", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_convert_to_assert_hlmt_if_wft", "FI-CONVERT-TO-ASSERT-HLMT-IF-WFT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_convert_to_assert_hlmt", "FI-CONVERT-TO-ASSERT-HLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_convert_to_ask_hlmt", "FI-CONVERT-TO-ASK-HLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_convert_to_fort", "FI-CONVERT-TO-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_canonicalize_el_term", "FI-CANONICALIZE-EL-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_canonicalize", "FI-CANONICALIZE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_canonicalize_gaf", "FI-CANONICALIZE-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "clear_cached_fi_canonicalize_gaf", "CLEAR-CACHED-FI-CANONICALIZE-GAF", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "remove_cached_fi_canonicalize_gaf", "REMOVE-CACHED-FI-CANONICALIZE-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "cached_fi_canonicalize_gaf_internal", "CACHED-FI-CANONICALIZE-GAF-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "cached_fi_canonicalize_gaf", "CACHED-FI-CANONICALIZE-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_canonicalize_literal", "FI-CANONICALIZE-LITERAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "fi_canonicalize_ask", "FI-CANONICALIZE-ASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "kb_var_listP", "KB-VAR-LIST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "assertion_fi_formula", "ASSERTION-FI-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "assertion_hl_formula", "ASSERTION-HL-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "assertion_fi_ist_formula", "ASSERTION-FI-IST-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "assertion_fi_cnf", "ASSERTION-FI-CNF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "assertion_cnf_with_el_vars", "ASSERTION-CNF-WITH-EL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "perform_fi_substitutions", "PERFORM-FI-SUBSTITUTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "assertion_expand", "ASSERTION-EXPAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi", "assertion_ist_expand", "ASSERTION-IST-EXPAND", 1, 0, false);
        return (SubLObject)fi.NIL;
    }
    
    public static SubLObject init_fi_file() {
        fi.$fi_dispatch_table$ = SubLFiles.deflexical("*FI-DISPATCH-TABLE*", (SubLObject)fi.$list0);
        fi.$fi_warning$ = SubLFiles.defparameter("*FI-WARNING*", (SubLObject)fi.NIL);
        fi.$fi_error$ = SubLFiles.defparameter("*FI-ERROR*", (SubLObject)fi.NIL);
        fi.$fi_last_constant$ = SubLFiles.defparameter("*FI-LAST-CONSTANT*", (SubLObject)fi.NIL);
        fi.$within_fi_operationP$ = SubLFiles.defparameter("*WITHIN-FI-OPERATION?*", (SubLObject)fi.NIL);
        fi.$current_fi_op$ = SubLFiles.defparameter("*CURRENT-FI-OP*", (SubLObject)fi.NIL);
        fi.$merge_fort_assertion_map$ = SubLFiles.defparameter("*MERGE-FORT-ASSERTION-MAP*", (SubLObject)fi.NIL);
        fi.$assume_assert_sentence_is_wfP$ = SubLFiles.defparameter("*ASSUME-ASSERT-SENTENCE-IS-WF?*", (SubLObject)fi.NIL);
        fi.$generate_precise_fi_wff_errorsP$ = SubLFiles.defparameter("*GENERATE-PRECISE-FI-WFF-ERRORS?*", (SubLObject)fi.T);
        fi.$the_date$ = SubLFiles.defparameter("*THE-DATE*", (SubLObject)fi.NIL);
        fi.$the_second$ = SubLFiles.defparameter("*THE-SECOND*", (SubLObject)fi.NIL);
        fi.$cached_fi_canonicalize_gaf_caching_state$ = SubLFiles.deflexical("*CACHED-FI-CANONICALIZE-GAF-CACHING-STATE*", (SubLObject)fi.NIL);
        fi.$assertion_fi_formula_mt_scope$ = SubLFiles.defparameter("*ASSERTION-FI-FORMULA-MT-SCOPE*", (SubLObject)fi.NIL);
        return (SubLObject)fi.NIL;
    }
    
    public static SubLObject setup_fi_file() {
        utilities_macros.register_html_state_variable((SubLObject)fi.$sym3$_FI_WARNING_);
        SubLObject item_var = (SubLObject)fi.$sym3$_FI_WARNING_;
        if (fi.NIL == conses_high.member(item_var, utilities_macros.$fi_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)fi.EQL), Symbols.symbol_function((SubLObject)fi.IDENTITY))) {
            utilities_macros.$fi_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$fi_state_variables$.getGlobalValue()));
        }
        utilities_macros.register_html_state_variable((SubLObject)fi.$sym4$_FI_ERROR_);
        item_var = (SubLObject)fi.$sym4$_FI_ERROR_;
        if (fi.NIL == conses_high.member(item_var, utilities_macros.$fi_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)fi.EQL), Symbols.symbol_function((SubLObject)fi.IDENTITY))) {
            utilities_macros.$fi_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$fi_state_variables$.getGlobalValue()));
        }
        utilities_macros.register_html_state_variable((SubLObject)fi.$sym7$_FI_LAST_CONSTANT_);
        item_var = (SubLObject)fi.$sym7$_FI_LAST_CONSTANT_;
        if (fi.NIL == conses_high.member(item_var, utilities_macros.$fi_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)fi.EQL), Symbols.symbol_function((SubLObject)fi.IDENTITY))) {
            utilities_macros.$fi_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$fi_state_variables$.getGlobalValue()));
        }
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym21$FI_GET_WARNING, (SubLObject)fi.NIL, (SubLObject)fi.$str22$Return_a_description_of_the_warni, (SubLObject)fi.NIL, (SubLObject)fi.$list23);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym25$FI_GET_ERROR, (SubLObject)fi.NIL, (SubLObject)fi.$str26$Return_a_description_of_the_error, (SubLObject)fi.NIL, (SubLObject)fi.$list23);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym28$FI_FIND, (SubLObject)fi.$list29, (SubLObject)fi.$str30$Return_the_constant_indentified_b, (SubLObject)fi.NIL, (SubLObject)fi.$list31);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym37$FI_COMPLETE, (SubLObject)fi.$list38, (SubLObject)fi.$str39$Return_a_list_of_constants_whose_, (SubLObject)fi.NIL, (SubLObject)fi.$list40);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym13$FI_CREATE, (SubLObject)fi.$list42, (SubLObject)fi.$str43$Create_a_new_constant_with_NAME__, (SubLObject)fi.NIL, (SubLObject)fi.$list44);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym14$FI_FIND_OR_CREATE, (SubLObject)fi.$list42, (SubLObject)fi.$str52$Return_constant_with_NAME_if_it_i, (SubLObject)fi.NIL, (SubLObject)fi.$list44);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym89$FI_KILL, (SubLObject)fi.$list90, (SubLObject)fi.$str91$Kill_FORT_and_all_its_uses_from_t, (SubLObject)fi.NIL, (SubLObject)fi.$list92);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym96$FI_RENAME, (SubLObject)fi.$list97, (SubLObject)fi.$str98$Change_name_of_CONSTANT_to_NAME__, (SubLObject)fi.NIL, (SubLObject)fi.$list31);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym103$FI_LOOKUP, (SubLObject)fi.$list104, (SubLObject)fi.$str105$Returns_two_values_when_looking_u, (SubLObject)fi.NIL, (SubLObject)fi.$list106);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym111$FI_ASSERT, (SubLObject)fi.$list112, (SubLObject)fi.$str113$Assert_the_FORMULA_in_the_specifi, (SubLObject)fi.NIL, (SubLObject)fi.$list92);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym152$FI_UNASSERT, (SubLObject)fi.$list104, (SubLObject)fi.$str153$Remove_the_assertions_canonicaliz, (SubLObject)fi.NIL, (SubLObject)fi.$list92);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym160$FI_EDIT, (SubLObject)fi.$list161, (SubLObject)fi.$str162$Unassert_the_assertions_canonical, (SubLObject)fi.NIL, (SubLObject)fi.$list92);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym181$FI_BLAST, (SubLObject)fi.$list104, (SubLObject)fi.$str182$Remove_all_arguments_for_the_FORM, (SubLObject)fi.NIL, (SubLObject)fi.$list92);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym184$FI_ASK, (SubLObject)fi.$list185, (SubLObject)fi.$str186$Ask_for_bindings_for_free_variabl, (SubLObject)fi.NIL, (SubLObject)fi.$list187);
        utilities_macros.register_obsolete_cyc_api_function((SubLObject)fi.$sym193$FI_CONTINUE_LAST_ASK, (SubLObject)fi.$list194, (SubLObject)fi.$list195, (SubLObject)fi.$str196$Continue_the_last_ask_that_was_pe, (SubLObject)fi.NIL, (SubLObject)fi.$list187);
        access_macros.define_obsolete_register((SubLObject)fi.$sym197$FI_CONTINUE_LAST_ASK_INT, (SubLObject)fi.$list194);
        utilities_macros.register_obsolete_cyc_api_function((SubLObject)fi.$sym200$FI_ASK_STATUS, (SubLObject)fi.$list201, (SubLObject)fi.NIL, (SubLObject)fi.$str202$Return_a_status_as_to_how_the_las, (SubLObject)fi.NIL, (SubLObject)fi.$list23);
        access_macros.define_obsolete_register((SubLObject)fi.$sym203$FI_ASK_STATUS_INT, (SubLObject)fi.$list201);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym206$FI_TMS_RECONSIDER_FORMULA, (SubLObject)fi.$list104, (SubLObject)fi.$str207$Reconsider_all_arguments_for_FORM, (SubLObject)fi.NIL, (SubLObject)fi.$list92);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym209$FI_TMS_RECONSIDER_MT, (SubLObject)fi.$list210, (SubLObject)fi.$str211$Reconsider_all_arguments_for_all_, (SubLObject)fi.NIL, (SubLObject)fi.$list92);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym213$FI_TMS_RECONSIDER_GAFS, (SubLObject)fi.$list214, (SubLObject)fi.$str215$Reconsider_all_arguments_for_all_, (SubLObject)fi.NIL, (SubLObject)fi.$list92);
        utilities_macros.register_cyc_api_function((SubLObject)fi.$sym218$FI_TMS_RECONSIDER_TERM, (SubLObject)fi.$list219, (SubLObject)fi.$str220$Reconsider_all_arguments_involvin, (SubLObject)fi.NIL, (SubLObject)fi.$list92);
        memoization_state.note_globally_cached_function((SubLObject)fi.$sym261$CACHED_FI_CANONICALIZE_GAF);
        return (SubLObject)fi.NIL;
    }
    
    public void declareFunctions() {
        declare_fi_file();
    }
    
    public void initializeVariables() {
        init_fi_file();
    }
    
    public void runTopLevelForms() {
        setup_fi_file();
    }
    
    static {
        me = (SubLFile)new fi();
        fi.$fi_dispatch_table$ = null;
        fi.$fi_warning$ = null;
        fi.$fi_error$ = null;
        fi.$fi_last_constant$ = null;
        fi.$within_fi_operationP$ = null;
        fi.$current_fi_op$ = null;
        fi.$merge_fort_assertion_map$ = null;
        fi.$assume_assert_sentence_is_wfP$ = null;
        fi.$generate_precise_fi_wff_errorsP$ = null;
        fi.$the_date$ = null;
        fi.$the_second$ = null;
        fi.$cached_fi_canonicalize_gaf_caching_state$ = null;
        fi.$assertion_fi_formula_mt_scope$ = null;
        $list0 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GET-WARNING"), (SubLObject)SubLObjectFactory.makeSymbol("FI-GET-WARNING"), (SubLObject)SubLObjectFactory.makeSymbol("FI-GET-WARNING-INT"), (SubLObject)fi.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GET-ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("FI-GET-ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("FI-GET-ERROR-INT"), (SubLObject)fi.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIND"), (SubLObject)SubLObjectFactory.makeSymbol("FI-FIND"), (SubLObject)SubLObjectFactory.makeSymbol("FI-FIND-INT"), (SubLObject)fi.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-COMPLETE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-COMPLETE-INT"), (SubLObject)fi.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-CREATE-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIND-OR-CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-FIND-OR-CREATE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-FIND-OR-CREATE-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CREATE-SKOLEM"), (SubLObject)SubLObjectFactory.makeSymbol("FI-CREATE-SKOLEM"), (SubLObject)SubLObjectFactory.makeSymbol("FI-CREATE-SKOLEM-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MERGE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-MERGE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-MERGE-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KILL"), (SubLObject)SubLObjectFactory.makeSymbol("FI-KILL"), (SubLObject)SubLObjectFactory.makeSymbol("FI-KILL-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RENAME"), (SubLObject)SubLObjectFactory.makeSymbol("FI-RENAME"), (SubLObject)SubLObjectFactory.makeSymbol("FI-RENAME-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("FI-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("FI-LOOKUP-INT"), (SubLObject)fi.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ASSERT-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-REASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-REASSERT-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DENY"), (SubLObject)SubLObjectFactory.makeSymbol("FI-DENY"), (SubLObject)SubLObjectFactory.makeSymbol("FI-DENY-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-UNASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-UNASSERT-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EDIT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-EDIT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-EDIT-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RENAME-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("FI-RENAME-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("FI-RENAME-VARIABLES-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("FI-JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("FI-JUSTIFY-INT"), (SubLObject)fi.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ADD-ARGUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ADD-ARGUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ADD-ARGUMENT-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVE-ARGUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-REMOVE-ARGUMENT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-REMOVE-ARGUMENT-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BLAST"), (SubLObject)SubLObjectFactory.makeSymbol("FI-BLAST"), (SubLObject)SubLObjectFactory.makeSymbol("FI-BLAST-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASK"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ASK"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ASK-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONTINUE-LAST-ASK"), (SubLObject)SubLObjectFactory.makeSymbol("FI-CONTINUE-LAST-ASK"), (SubLObject)SubLObjectFactory.makeSymbol("FI-CONTINUE-LAST-ASK-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASK-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ASK-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("FI-ASK-STATUS-INT"), (SubLObject)fi.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TMS-RECONSIDER-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-FORMULA-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TMS-RECONSIDER-MT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-MT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-MT-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TMS-RECONSIDER-GAFS"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-GAFS"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-GAFS-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TMS-RECONSIDER-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-TERM-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HYPOTHESIZE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-HYPOTHESIZE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-HYPOTHESIZE-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROVE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-PROVE"), (SubLObject)SubLObjectFactory.makeSymbol("FI-PROVE-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DENOTATION"), (SubLObject)SubLObjectFactory.makeSymbol("FI-DENOTATION"), (SubLObject)SubLObjectFactory.makeSymbol("FI-DENOTATION-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIMESTAMP-CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TIMESTAMP-CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TIMESTAMP-CONSTANT-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIMESTAMP-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TIMESTAMP-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TIMESTAMP-ASSERTION-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVE-TIMESTAMP"), (SubLObject)SubLObjectFactory.makeSymbol("FI-REMOVE-TIMESTAMP"), (SubLObject)SubLObjectFactory.makeSymbol("FI-REMOVE-TIMESTAMP-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GET-PARAMETER"), (SubLObject)SubLObjectFactory.makeSymbol("FI-GET-PARAMETER"), (SubLObject)SubLObjectFactory.makeSymbol("FI-GET-PARAMETER-INT"), (SubLObject)fi.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SET-PARAMETER"), (SubLObject)SubLObjectFactory.makeSymbol("FI-SET-PARAMETER"), (SubLObject)SubLObjectFactory.makeSymbol("FI-SET-PARAMETER-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EVAL"), (SubLObject)SubLObjectFactory.makeSymbol("FI-EVAL"), (SubLObject)SubLObjectFactory.makeSymbol("FI-EVAL-INT"), (SubLObject)fi.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCAL-EVAL"), (SubLObject)SubLObjectFactory.makeSymbol("FI-LOCAL-EVAL"), (SubLObject)SubLObjectFactory.makeSymbol("FI-LOCAL-EVAL-INT"), (SubLObject)fi.NIL) });
        $sym1$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FI-ERROR*"), (SubLObject)fi.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FI-WARNING*"), (SubLObject)fi.NIL));
        $sym3$_FI_WARNING_ = SubLObjectFactory.makeSymbol("*FI-WARNING*");
        $sym4$_FI_ERROR_ = SubLObjectFactory.makeSymbol("*FI-ERROR*");
        $sym5$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $str6$_S = SubLObjectFactory.makeString("~S");
        $sym7$_FI_LAST_CONSTANT_ = SubLObjectFactory.makeSymbol("*FI-LAST-CONSTANT*");
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-FI-OPERATION?*"), (SubLObject)fi.T));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUN"), (SubLObject)SubLObjectFactory.makeSymbol("INT-FUN"), (SubLObject)SubLObjectFactory.makeSymbol("MODIFIES-KB?"));
        $str10$Bad_function_call_____FI__s__s__s = SubLObjectFactory.makeString("Bad function call -> (FI ~s ~s ~s ~s ~s ~s ~s ~s ~s)\n~%A function for ~s is missing from *fi-dispatch-table*");
        $sym11$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $kw12$QUEUED = SubLObjectFactory.makeKeyword("QUEUED");
        $sym13$FI_CREATE = SubLObjectFactory.makeSymbol("FI-CREATE");
        $sym14$FI_FIND_OR_CREATE = SubLObjectFactory.makeSymbol("FI-FIND-OR-CREATE");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)fi.NIL);
        $sym17$FI_HYPOTHESIZE = SubLObjectFactory.makeSymbol("FI-HYPOTHESIZE");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME-PREFIX"), (SubLObject)SubLObjectFactory.makeString("HYP")), (SubLObject)SubLObjectFactory.makeSymbol("TERM-EXTERNAL-IDS"));
        $str19$HYP = SubLObjectFactory.makeString("HYP");
        $kw20$GET_WARNING = SubLObjectFactory.makeKeyword("GET-WARNING");
        $sym21$FI_GET_WARNING = SubLObjectFactory.makeSymbol("FI-GET-WARNING");
        $str22$Return_a_description_of_the_warni = SubLObjectFactory.makeString("Return a description of the warning resulting from the last FI operation.");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("ATOM")));
        $kw24$GET_ERROR = SubLObjectFactory.makeKeyword("GET-ERROR");
        $sym25$FI_GET_ERROR = SubLObjectFactory.makeSymbol("FI-GET-ERROR");
        $str26$Return_a_description_of_the_error = SubLObjectFactory.makeString("Return a description of the error resulting from the last FI operation.");
        $kw27$FIND = SubLObjectFactory.makeKeyword("FIND");
        $sym28$FI_FIND = SubLObjectFactory.makeSymbol("FI-FIND");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $str30$Return_the_constant_indentified_b = SubLObjectFactory.makeString("Return the constant indentified by the string NAME.");
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $kw32$ARG_ERROR = SubLObjectFactory.makeKeyword("ARG-ERROR");
        $str33$Expected_a_string__got__S = SubLObjectFactory.makeString("Expected a string, got ~S");
        $kw34$INVALID_NAME = SubLObjectFactory.makeKeyword("INVALID-NAME");
        $str35$_S_is_not_a_valid_name_for_a_cons = SubLObjectFactory.makeString("~S is not a valid name for a constant");
        $kw36$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $sym37$FI_COMPLETE = SubLObjectFactory.makeSymbol("FI-COMPLETE");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"));
        $str39$Return_a_list_of_constants_whose_ = SubLObjectFactory.makeString("Return a list of constants whose name begins with PREFIX. The comparison is\nperformed in a case-insensitive mode unless CASE-SENSITIVE? is non-nil.");
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $kw41$CREATE = SubLObjectFactory.makeKeyword("CREATE");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"));
        $str43$Create_a_new_constant_with_NAME__ = SubLObjectFactory.makeString("Create a new constant with NAME.\nIf EXTERNAL-ID is non-null it is used, otherwise a unique identifier is generated.");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P"));
        $kw45$UNNAMED = SubLObjectFactory.makeKeyword("UNNAMED");
        $kw46$NAME_CLASH = SubLObjectFactory.makeKeyword("NAME-CLASH");
        $str47$NAME_clash_for__S___renaming_to__ = SubLObjectFactory.makeString("NAME clash for ~S ; renaming to ~S");
        $str48$Expected_an_external_ID__got__S = SubLObjectFactory.makeString("Expected an external ID, got ~S");
        $kw49$ID_CLASH = SubLObjectFactory.makeKeyword("ID-CLASH");
        $str50$Already_a_constant_with_id__A = SubLObjectFactory.makeString("Already a constant with id ~A");
        $kw51$FIND_OR_CREATE = SubLObjectFactory.makeKeyword("FIND-OR-CREATE");
        $str52$Return_constant_with_NAME_if_it_i = SubLObjectFactory.makeString("Return constant with NAME if it is present.  \nIf not present, then create constant with NAME, using EXTERNAL-ID if given.\nIf EXTERNAL-ID is not given, generate a new one for the new constant.");
        $kw53$CREATE_SKOLEM = SubLObjectFactory.makeKeyword("CREATE-SKOLEM");
        $sym54$QUEUE_P = SubLObjectFactory.makeSymbol("QUEUE-P");
        $sym55$TL_FUNCTION_TERM_ = SubLObjectFactory.makeSymbol("TL-FUNCTION-TERM?");
        $str56$Found_a_TL_term_in_skolem__a_defi = SubLObjectFactory.makeString("Found a TL term in skolem ~a defining CNFs ~a");
        $const57$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw58$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $const59$arityMin = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMin"));
        $const60$arity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arity"));
        $const61$arg1Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa"));
        $const62$arg2Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa"));
        $const63$arg3Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Isa"));
        $const64$arg4Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Isa"));
        $const65$arg5Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Isa"));
        $const66$resultIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsa"));
        $const67$resultIsaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsaArg"));
        $const68$CollectionDenotingFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionDenotingFunction"));
        $list69 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionDenotingFunction")));
        $const70$resultGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenl"));
        $const71$SubcollectionDenotingFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionDenotingFunction"));
        $list72 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionDenotingFunction")));
        $const73$resultGenlArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenlArg"));
        $str74$SKF__a = SubLObjectFactory.makeString("SKF-~a");
        $str75$0123456789 = SubLObjectFactory.makeString("0123456789");
        $kw76$MERGE = SubLObjectFactory.makeKeyword("MERGE");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELF-MERGE"), (SubLObject)SubLObjectFactory.makeString("Merging ~S onto itself is a no-op"), (SubLObject)SubLObjectFactory.makeSymbol("KEEP-TERM"));
        $sym78$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym79$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const80$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const81$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const82$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $sym83$SKOLEM_NART_ = SubLObjectFactory.makeSymbol("SKOLEM-NART?");
        $sym84$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym85$SKOLEM_TERM_ = SubLObjectFactory.makeSymbol("SKOLEM-TERM?");
        $str86$Could_not_merge_assertion_onto_te = SubLObjectFactory.makeString("Could not merge assertion onto term ~S due to uncanonicalization problem:~%  ~S");
        $sym87$CONVERT_HL_SUPPORT_TO_FI_SUPPORT = SubLObjectFactory.makeSymbol("CONVERT-HL-SUPPORT-TO-FI-SUPPORT");
        $kw88$KILL = SubLObjectFactory.makeKeyword("KILL");
        $sym89$FI_KILL = SubLObjectFactory.makeSymbol("FI-KILL");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"));
        $str91$Kill_FORT_and_all_its_uses_from_t = SubLObjectFactory.makeString("Kill FORT and all its uses from the KB.  If FORT is a microtheory, all assertions\nin that microtheory are removed.");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $str93$Constant__S_is_merely_an_empty_sh = SubLObjectFactory.makeString("Constant ~S is merely an empty shell, not part of the Knowledge Base");
        $str94$Cannot_kill_core_constant__a___To = SubLObjectFactory.makeString("Cannot kill core constant ~a.  To kill it, first unassert that it is an instance of #$CoreUnionConstant.");
        $kw95$RENAME = SubLObjectFactory.makeKeyword("RENAME");
        $sym96$FI_RENAME = SubLObjectFactory.makeSymbol("FI-RENAME");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $str98$Change_name_of_CONSTANT_to_NAME__ = SubLObjectFactory.makeString("Change name of CONSTANT to NAME. Return the constant if no error, otherwise return NIL.");
        $str99$Expected_a_constant__got__S = SubLObjectFactory.makeString("Expected a constant, got ~S");
        $kw100$ALREADY_HAS_NAME = SubLObjectFactory.makeKeyword("ALREADY-HAS-NAME");
        $str101$Constant__S_is_already_named__A = SubLObjectFactory.makeString("Constant ~S is already named ~A");
        $kw102$LOOKUP = SubLObjectFactory.makeKeyword("LOOKUP");
        $sym103$FI_LOOKUP = SubLObjectFactory.makeSymbol("FI-LOOKUP");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str105$Returns_two_values_when_looking_u = SubLObjectFactory.makeString("Returns two values when looking up the EL FORMULA in the microtheory MT.  The\nfirst value returned is a list of HL formulas resulting from the canonicalization\nof the EL FORMULA.  The second value is T iff all the HL assertions were properly \nput into the KB.");
        $list106 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CONSP")), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $str107$Expected_a_cons__got__S = SubLObjectFactory.makeString("Expected a cons, got ~S");
        $sym108$ASSERTION_FI_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-FI-FORMULA");
        $kw109$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw110$ASSERT = SubLObjectFactory.makeKeyword("ASSERT");
        $sym111$FI_ASSERT = SubLObjectFactory.makeSymbol("FI-ASSERT");
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"));
        $str113$Assert_the_FORMULA_in_the_specifi = SubLObjectFactory.makeString("Assert the FORMULA in the specified MT.  STRENGTH is :default or :monotonic.\nDIRECTION is :forward or :backward.  GAF assertion direction defaults to :forward, and rule\nassertion direction defaults to :backward. Return T if there was no error.");
        $str114$Expected__default_or__monotonic__ = SubLObjectFactory.makeString("Expected :default or :monotonic, got ~S");
        $str115$Expected_a_direction__got__S = SubLObjectFactory.makeString("Expected a direction, got ~S");
        $const116$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $kw117$TAUTOLOGY = SubLObjectFactory.makeKeyword("TAUTOLOGY");
        $str118$Formula______S___in__S_was_a_taut = SubLObjectFactory.makeString("Formula ~%  ~S ~%in ~S was a tautology.");
        $const119$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $kw120$CONTRADICTION = SubLObjectFactory.makeKeyword("CONTRADICTION");
        $str121$Formula______S___in__S_was_a_cont = SubLObjectFactory.makeString("Formula ~%  ~S ~%in ~S was a contradiction.");
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-FREE-VARS"));
        $kw123$COULD_NOT_ASSERT = SubLObjectFactory.makeKeyword("COULD-NOT-ASSERT");
        $str124$Unable_to_assert_formula__S__in__ = SubLObjectFactory.makeString("Unable to assert formula ~S~%in ~S.");
        $sym125$ASSERTED_ASSERTION_ = SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION?");
        $sym126$FAST_SKOLEM_NAT_ = SubLObjectFactory.makeSymbol("FAST-SKOLEM-NAT?");
        $sym127$OPAQUE_ARG_WRT_QUOTING_NOT_COUNTING_LOGICAL_OPS_ = SubLObjectFactory.makeSymbol("OPAQUE-ARG-WRT-QUOTING-NOT-COUNTING-LOGICAL-OPS?");
        $const128$skolem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("skolem"));
        $str129$Found_a___skolem_assertion_with_m = SubLObjectFactory.makeString("Found a #$skolem assertion with more than one argument: ~s");
        $str130$Found_a___skolem_assertion_with_a = SubLObjectFactory.makeString("Found a #$skolem assertion with a non-deduced argument: ~s");
        $sym131$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $str132$Defining_assertions_for__s___s__w = SubLObjectFactory.makeString("Defining assertions for ~s~%~s~%were not all included in existing supports~%~s");
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"));
        $sym134$CNF_P = SubLObjectFactory.makeSymbol("CNF-P");
        $kw135$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $kw136$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $kw137$FORMULA_NOT_WELL_FORMED = SubLObjectFactory.makeKeyword("FORMULA-NOT-WELL-FORMED");
        $str138$Formula______S___was_not_well_for = SubLObjectFactory.makeString("Formula ~%  ~S ~%was not well formed because: ~%~a");
        $str139$Formula______S___was_not_well_for = SubLObjectFactory.makeString("Formula ~%  ~S ~%was not well formed");
        $kw140$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw141$UNCHANGED = SubLObjectFactory.makeKeyword("UNCHANGED");
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REDUNDANT-LOCAL-ASSERTION"));
        $kw143$FLIPPED = SubLObjectFactory.makeKeyword("FLIPPED");
        $kw144$NEW = SubLObjectFactory.makeKeyword("NEW");
        $kw145$REASSERT = SubLObjectFactory.makeKeyword("REASSERT");
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVALID-STRENGTH-CHANGE"), (SubLObject)SubLObjectFactory.makeString("Attempt to change the strength of a deduced assertion from ~S to ~S"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-STRENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("STRENGTH"));
        $kw147$ASSERTION_NOT_PRESENT = SubLObjectFactory.makeKeyword("ASSERTION-NOT-PRESENT");
        $str148$Formula__S_in_mt__S_is_not_in_the = SubLObjectFactory.makeString("Formula ~S in mt ~S is not in the KB");
        $kw149$DENY = SubLObjectFactory.makeKeyword("DENY");
        $kw150$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw151$UNASSERT = SubLObjectFactory.makeKeyword("UNASSERT");
        $sym152$FI_UNASSERT = SubLObjectFactory.makeSymbol("FI-UNASSERT");
        $str153$Remove_the_assertions_canonicaliz = SubLObjectFactory.makeString("Remove the assertions canonicalized from FORMULA in the microtheory MT.\nReturn T if the operation succeeded, otherwise return NIL.");
        $str154$Sentence______S___in__S_was_a_tau = SubLObjectFactory.makeString("Sentence ~%  ~S ~%in ~S was a tautology.");
        $str155$Sentence______S___in__S_was_a_con = SubLObjectFactory.makeString("Sentence ~%  ~S ~%in ~S was a contradiction.");
        $str156$Sentence__S_in_mt__S_is_not_in_th = SubLObjectFactory.makeString("Sentence ~S in mt ~S is not in the KB");
        $kw157$ASSERTION_NOT_LOCAL = SubLObjectFactory.makeKeyword("ASSERTION-NOT-LOCAL");
        $str158$Sentence__S_in_mt__S_is_not_local = SubLObjectFactory.makeString("Sentence ~S in mt ~S is not locally in the KB");
        $kw159$EDIT = SubLObjectFactory.makeKeyword("EDIT");
        $sym160$FI_EDIT = SubLObjectFactory.makeSymbol("FI-EDIT");
        $list161 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MT"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"));
        $str162$Unassert_the_assertions_canonical = SubLObjectFactory.makeString("Unassert the assertions canonicalized from OLD-FORMULA in the microtheory OLD-MT.\n   Assert NEW-FORMULA in the specified NEW-MT.  \n   STRENGTH is :default or :monotonic.\n   DIRECTION is :forward or :backward.  \n    GAF assertion direction defaults to :forward.\n    Rule assertion direction defaults to :backward.\n   Return T if there was no error.");
        $kw163$JUSTIFY = SubLObjectFactory.makeKeyword("JUSTIFY");
        $list164 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("JUST-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("JUST-MT"));
        $sym165$ARGUMENT_TV = SubLObjectFactory.makeSymbol("ARGUMENT-TV");
        $kw166$ADD_ARGUMENT = SubLObjectFactory.makeKeyword("ADD-ARGUMENT");
        $str167$Expected_a_support__got__S = SubLObjectFactory.makeString("Expected a support, got ~S");
        $list168 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORWARD"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD"));
        $str169$Expected__forward_or__backward__g = SubLObjectFactory.makeString("Expected :forward or :backward, got ~S");
        $sym170$DEDUCTION_ASSERTION = SubLObjectFactory.makeSymbol("DEDUCTION-ASSERTION");
        $kw171$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $list172 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("STRENGTH"));
        $kw173$SUPPORT_MALFORMED = SubLObjectFactory.makeKeyword("SUPPORT-MALFORMED");
        $str174$Support__S_was_malformed = SubLObjectFactory.makeString("Support ~S was malformed");
        $kw175$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw176$SUPPORT_INVALID = SubLObjectFactory.makeKeyword("SUPPORT-INVALID");
        $str177$Support__S_is_not_currently_valid = SubLObjectFactory.makeString("Support ~S is not currently valid");
        $kw178$REMOVE_ARGUMENT = SubLObjectFactory.makeKeyword("REMOVE-ARGUMENT");
        $sym179$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $kw180$BLAST = SubLObjectFactory.makeKeyword("BLAST");
        $sym181$FI_BLAST = SubLObjectFactory.makeSymbol("FI-BLAST");
        $str182$Remove_all_arguments_for_the_FORM = SubLObjectFactory.makeString("Remove all arguments for the FORMULA within MT, including both those \narguments resulting the direct assertion of the FORMULA, and \nthose arguments supporting the FORMULA which were derived through inference.\nReturn T if successful, otherwise return NIL.");
        $kw183$ASK = SubLObjectFactory.makeKeyword("ASK");
        $sym184$FI_ASK = SubLObjectFactory.makeSymbol("FI-ASK");
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("BACKCHAIN"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $str186$Ask_for_bindings_for_free_variabl = SubLObjectFactory.makeString("Ask for bindings for free variables which will satisfy FORMULA within MT.\nIf BACKCHAIN is NIL, no inference is performed.\nIf BACKCHAIN is an integer, then at most that many backchaining steps using rules\nare performed.\nIf BACKCHAIN is T, then inference is performed without limit on the number of\nbackchaining steps when searching for bindings.\nIf NUMBER is an integer, then at most that number of bindings are returned.\nIf TIME is an integer, then at most TIME seconds are consumed by the search for\nbindings.\nIf DEPTH is an integer, then the inference paths are limited to that number of\ntotal steps.\nReturns NIL if the operation had an error.  Otherwise returns a list of variable/\nbinding pairs.  In the case where the FORMULA has no free variables, the form\n (((T . T))) is returned indicating that the gaf is either directly asserted in the\nKB, or that it can be derived via rules in the KB.");
        $list187 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $str188$Expected_a_formula__got__S = SubLObjectFactory.makeString("Expected a formula, got ~S");
        $list189 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IST"), (SubLObject)SubLObjectFactory.makeSymbol("IST-MT"), (SubLObject)SubLObjectFactory.makeSymbol("IST-FORMULA"));
        $str190$Expected_an_integer__got__S = SubLObjectFactory.makeString("Expected an integer, got ~S");
        $const191$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $kw192$CONTINUE_LAST_ASK = SubLObjectFactory.makeKeyword("CONTINUE-LAST-ASK");
        $sym193$FI_CONTINUE_LAST_ASK = SubLObjectFactory.makeSymbol("FI-CONTINUE-LAST-ASK");
        $list194 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTINUE-INFERENCE"));
        $list195 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("BACKCHAIN"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("RECONSIDER-DEEP"));
        $str196$Continue_the_last_ask_that_was_pe = SubLObjectFactory.makeString("Continue the last ask that was performed with more resources.\nIf BACKCHAIN is NIL, no inference is performed.\nIf BACKCHAIN is an integer, then at most that many backchaining steps using rules\nare performed.\nIf BACKCHAIN is T, then inference is performed without limit on the number of\nbackchaining steps when searching for bindings.\nIf NUMBER is an integer, then at most that number of bindings are returned.\nIf TIME is an integer, then at most TIME seconds are consumed by the search for\nbindings.\nIf DEPTH is an integer, then the inference paths are limited to that number of\ntotal steps.\nReturns NIL if the operation had an error.  Otherwise returns a list of variable/\nbinding pairs.  In the case where the FORMULA has no free variables, the form\n (((T . T))) is returned indicating that the gaf is either directly asserted in the\nKB, or that it can be derived via rules in the KB.");
        $sym197$FI_CONTINUE_LAST_ASK_INT = SubLObjectFactory.makeSymbol("FI-CONTINUE-LAST-ASK-INT");
        $str198$fi_continue_last_ask_int_is_depre = SubLObjectFactory.makeString("fi-continue-last-ask-int is deprecated; use CONTINUE-INFERENCE instead.");
        $str199$fi_ask_status_is_deprecated__use_ = SubLObjectFactory.makeString("fi-ask-status is deprecated: use INFERENCE-SUSPEND-STATUS");
        $sym200$FI_ASK_STATUS = SubLObjectFactory.makeSymbol("FI-ASK-STATUS");
        $list201 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-SUSPEND-STATUS"));
        $str202$Return_a_status_as_to_how_the_las = SubLObjectFactory.makeString("Return a status as to how the last ask successfully completed regarding\nresource limits.  \n:EXHAUST if the search spaces was exhausted.\n:DEPTH if the search space was limited because some nodes were too deep.\n:NUMBER if the requested number of bindings was found without exceeding other limits.\n:TIME if the time alloted expired prior to exhausting the search space.\nReturn NIL if there was no prior successful ask.");
        $sym203$FI_ASK_STATUS_INT = SubLObjectFactory.makeSymbol("FI-ASK-STATUS-INT");
        $str204$fi_ask_status_int_is_deprecated__ = SubLObjectFactory.makeString("fi-ask-status-int is deprecated: use INFERENCE-SUSPEND-STATUS");
        $kw205$TMS_RECONSIDER_FORMULA = SubLObjectFactory.makeKeyword("TMS-RECONSIDER-FORMULA");
        $sym206$FI_TMS_RECONSIDER_FORMULA = SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-FORMULA");
        $str207$Reconsider_all_arguments_for_FORM = SubLObjectFactory.makeString("Reconsider all arguments for FORMULA within MT.  Return T if the\noperation succeeded, NIL if there was an error.");
        $kw208$TMS_RECONSIDER_MT = SubLObjectFactory.makeKeyword("TMS-RECONSIDER-MT");
        $sym209$FI_TMS_RECONSIDER_MT = SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-MT");
        $list210 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str211$Reconsider_all_arguments_for_all_ = SubLObjectFactory.makeString("Reconsider all arguments for all formulas within MT.  Return T if the\noperation succeeded, NIL if there was an error.");
        $kw212$TMS_RECONSIDER_GAFS = SubLObjectFactory.makeKeyword("TMS-RECONSIDER-GAFS");
        $sym213$FI_TMS_RECONSIDER_GAFS = SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-GAFS");
        $list214 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str215$Reconsider_all_arguments_for_all_ = SubLObjectFactory.makeString("Reconsider all arguments for all gaf formulas involving TERM.\nARG optionally constrains gafs such that the TERM occupies a specific arg position.\nPREDICATE optionally constrains gafs such that the specifed PREDICATE\noccupies the arg0 position.\nMT optionally constrains gafs such that they must be included in the specific\nmicrotheory. \nReturn T if the operation succeeded, NIL if there was an error.");
        $str216$Expected_an_integer_0_5__got__S = SubLObjectFactory.makeString("Expected an integer 0-5, got ~S");
        $kw217$TMS_RECONSIDER_TERM = SubLObjectFactory.makeKeyword("TMS-RECONSIDER-TERM");
        $sym218$FI_TMS_RECONSIDER_TERM = SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-TERM");
        $list219 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str220$Reconsider_all_arguments_involvin = SubLObjectFactory.makeString("Reconsider all arguments involving TERM.  \nIf MT is provided, then only arguments in that microtheory are reconsidered.\nReturn T if the operation succeeded, NIL if there was an error.");
        $kw221$DENOTATION = SubLObjectFactory.makeKeyword("DENOTATION");
        $list222 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABBREVS"), (SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"));
        $kw223$TIMESTAMP_CONSTANT = SubLObjectFactory.makeKeyword("TIMESTAMP-CONSTANT");
        $list224 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVALID-CYCLIST"));
        $list225 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVALID-TIME"));
        $list226 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVALID-PURPOSE"));
        $list227 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVALID-SECOND"));
        $list228 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-CONSTANT"));
        $list229 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALREADY-TIMESTAMPED"));
        $sym230$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $const231$myCreator = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreator"));
        $const232$myCreationTime = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationTime"));
        $const233$myCreationPurpose = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationPurpose"));
        $const234$myCreationSecond = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationSecond"));
        $kw235$STRENGTH = SubLObjectFactory.makeKeyword("STRENGTH");
        $kw236$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $const237$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $kw238$TIMESTAMP_ASSERTION = SubLObjectFactory.makeKeyword("TIMESTAMP-ASSERTION");
        $list239 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-ASSERTIONS"));
        $kw240$REMOVE_TIMESTAMP = SubLObjectFactory.makeKeyword("REMOVE-TIMESTAMP");
        $kw241$RENAME_VARIABLES = SubLObjectFactory.makeKeyword("RENAME-VARIABLES");
        $list242 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SIMPLE-VARIABLE-RENAME-IMPOSSIBLE"));
        $kw243$GET_PARAMETER = SubLObjectFactory.makeKeyword("GET-PARAMETER");
        $str244$Expected_a_symbol__got__S = SubLObjectFactory.makeString("Expected a symbol, got ~S");
        $kw245$UNBOUND = SubLObjectFactory.makeKeyword("UNBOUND");
        $str246$Parameter__S_is_not_bound = SubLObjectFactory.makeString("Parameter ~S is not bound");
        $kw247$SET_PARAMETER = SubLObjectFactory.makeKeyword("SET-PARAMETER");
        $kw248$EVAL = SubLObjectFactory.makeKeyword("EVAL");
        $kw249$LOCAL_EVAL = SubLObjectFactory.makeKeyword("LOCAL-EVAL");
        $kw250$HLMT_NOT_WELL_FORMED = SubLObjectFactory.makeKeyword("HLMT-NOT-WELL-FORMED");
        $str251$Microtheory__S____was_not_well_fo = SubLObjectFactory.makeString("Microtheory ~S~%  was not well formed because: ~%~S");
        $str252$Expected_a_microtheory__got__S = SubLObjectFactory.makeString("Expected a microtheory, got ~S");
        $str253$Expected_a_term__got__S = SubLObjectFactory.makeString("Expected a term, got ~S");
        $sym254$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym255$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym256$KB_VAR_LIST_ = SubLObjectFactory.makeSymbol("KB-VAR-LIST?");
        $kw257$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $kw258$TRUE_DEF = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $kw259$FALSE_MON = SubLObjectFactory.makeKeyword("FALSE-MON");
        $kw260$FALSE_DEF = SubLObjectFactory.makeKeyword("FALSE-DEF");
        $sym261$CACHED_FI_CANONICALIZE_GAF = SubLObjectFactory.makeSymbol("CACHED-FI-CANONICALIZE-GAF");
        $sym262$_CACHED_FI_CANONICALIZE_GAF_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-FI-CANONICALIZE-GAF-CACHING-STATE*");
        $int263$100 = SubLObjectFactory.makeInteger(100);
        $list264 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DNF"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("FREE-VARIABLES"));
        $sym265$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym266$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $sym267$DEFAULT_EL_VAR_FOR_HL_VAR = SubLObjectFactory.makeSymbol("DEFAULT-EL-VAR-FOR-HL-VAR");
        $sym268$ASSERTION_FI_IST_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-FI-IST-FORMULA");
    }
}

/*

	Total time: 3851 ms
	 synthetic 
*/
