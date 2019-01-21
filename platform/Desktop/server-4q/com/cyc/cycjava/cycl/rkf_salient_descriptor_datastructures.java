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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_salient_descriptor_datastructures extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures";
    public static final String myFingerPrint = "43a066196bbb16ac0144746d8e253122a677a8f4cd3019b6935b6a5f9b3029ec";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLSymbol $dtp_rkf_salient_descriptor_prompter$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLSymbol $dtp_rkf_salient_descriptor_prompt$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLSymbol $dtp_rkf_sd_rule_info_score$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
    public static SubLSymbol $dtp_rkf_sd_example$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13763L)
    private static SubLSymbol $rkf_sd_example_types$;
    private static final SubLSymbol $sym0$RKF_SALIENT_DESCRIPTOR_PROMPTER;
    private static final SubLSymbol $sym1$RKF_SALIENT_DESCRIPTOR_PROMPTER_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_RKF_SD_PROMPTER;
    private static final SubLSymbol $sym7$RKF_SALIENT_DESCRIPTOR_PROMPTER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$RKF_SD_PROMPTER_SEED_TERM;
    private static final SubLSymbol $sym10$_CSETF_RKF_SD_PROMPTER_SEED_TERM;
    private static final SubLSymbol $sym11$RKF_SD_PROMPTER_MT;
    private static final SubLSymbol $sym12$_CSETF_RKF_SD_PROMPTER_MT;
    private static final SubLSymbol $sym13$RKF_SD_PROMPTER_USED_PROMPTS;
    private static final SubLSymbol $sym14$_CSETF_RKF_SD_PROMPTER_USED_PROMPTS;
    private static final SubLSymbol $sym15$RKF_SD_PROMPTER_UNUSED_PROMPTS;
    private static final SubLSymbol $sym16$_CSETF_RKF_SD_PROMPTER_UNUSED_PROMPTS;
    private static final SubLSymbol $sym17$RKF_SD_PROMPTER_TACTICS;
    private static final SubLSymbol $sym18$_CSETF_RKF_SD_PROMPTER_TACTICS;
    private static final SubLSymbol $sym19$RKF_SD_PROMPTER_ISG;
    private static final SubLSymbol $sym20$_CSETF_RKF_SD_PROMPTER_ISG;
    private static final SubLSymbol $sym21$RKF_SD_PROMPTER_PLIST;
    private static final SubLSymbol $sym22$_CSETF_RKF_SD_PROMPTER_PLIST;
    private static final SubLSymbol $kw23$SEED_TERM;
    private static final SubLSymbol $kw24$MT;
    private static final SubLSymbol $kw25$USED_PROMPTS;
    private static final SubLSymbol $kw26$UNUSED_PROMPTS;
    private static final SubLSymbol $kw27$TACTICS;
    private static final SubLSymbol $kw28$ISG;
    private static final SubLSymbol $kw29$PLIST;
    private static final SubLString $str30$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw31$BEGIN;
    private static final SubLSymbol $sym32$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPTER;
    private static final SubLSymbol $kw33$SLOT;
    private static final SubLSymbol $kw34$END;
    private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPTER_METHOD;
    private static final SubLString $str36$_RKF_SD_PROMPTER__S__S___D_prompt;
    private static final SubLSymbol $kw37$MEMOIZATION_STATE;
    private static final SubLString $str38$Salient_Descriptor_Prompter_Lock;
    private static final SubLSymbol $kw39$LOCK;
    private static final SubLSymbol $kw40$UNKNOWN;
    private static final SubLSymbol $kw41$NOT_FOUND;
    private static final SubLSymbol $sym42$RKF_SALIENT_DESCRIPTOR_PROMPT;
    private static final SubLSymbol $sym43$RKF_SALIENT_DESCRIPTOR_PROMPT_P;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$PRINT_RKF_SD_PROMPT;
    private static final SubLSymbol $sym49$RKF_SALIENT_DESCRIPTOR_PROMPT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$RKF_SD_PROMPT_ID;
    private static final SubLSymbol $sym52$_CSETF_RKF_SD_PROMPT_ID;
    private static final SubLSymbol $sym53$RKF_SD_PROMPT_SUBPROMPTS;
    private static final SubLSymbol $sym54$_CSETF_RKF_SD_PROMPT_SUBPROMPTS;
    private static final SubLSymbol $sym55$RKF_SD_PROMPT_FORMULA;
    private static final SubLSymbol $sym56$_CSETF_RKF_SD_PROMPT_FORMULA;
    private static final SubLSymbol $sym57$RKF_SD_PROMPT_JUSTIFICATION;
    private static final SubLSymbol $sym58$_CSETF_RKF_SD_PROMPT_JUSTIFICATION;
    private static final SubLSymbol $sym59$RKF_SD_PROMPT_DEDUCIBLE_CNFS;
    private static final SubLSymbol $sym60$_CSETF_RKF_SD_PROMPT_DEDUCIBLE_CNFS;
    private static final SubLSymbol $sym61$RKF_SD_PROMPT_EXAMPLES;
    private static final SubLSymbol $sym62$_CSETF_RKF_SD_PROMPT_EXAMPLES;
    private static final SubLSymbol $sym63$RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE;
    private static final SubLSymbol $sym64$_CSETF_RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE;
    private static final SubLSymbol $sym65$RKF_SD_PROMPT_PROMPTER;
    private static final SubLSymbol $sym66$_CSETF_RKF_SD_PROMPT_PROMPTER;
    private static final SubLSymbol $sym67$RKF_SD_PROMPT_TACTIC;
    private static final SubLSymbol $sym68$_CSETF_RKF_SD_PROMPT_TACTIC;
    private static final SubLSymbol $kw69$ID;
    private static final SubLSymbol $kw70$SUBPROMPTS;
    private static final SubLSymbol $kw71$FORMULA;
    private static final SubLSymbol $kw72$JUSTIFICATION;
    private static final SubLSymbol $kw73$DEDUCIBLE_CNFS;
    private static final SubLSymbol $kw74$EXAMPLES;
    private static final SubLSymbol $kw75$SALIENT_PROPERTY_SENTENCE;
    private static final SubLSymbol $kw76$PROMPTER;
    private static final SubLSymbol $kw77$TACTIC;
    private static final SubLSymbol $sym78$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPT;
    private static final SubLSymbol $sym79$VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPT_METHOD;
    private static final SubLString $str80$_RKF_SD_PROMPT_Subprompts___S_;
    private static final SubLString $str81$Formula___S_;
    private static final SubLString $str82$Deducible_CNFs___S_;
    private static final SubLSymbol $kw83$CHOICE;
    private static final SubLSymbol $kw84$SPECIFY;
    private static final SubLSymbol $kw85$CONFIRM;
    private static final SubLSymbol $sym86$RKF_SD_RULE_INFO_SCORE;
    private static final SubLSymbol $sym87$RKF_SD_RULE_INFO_SCORE_P;
    private static final SubLList $list88;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$PRINT_RKF_SD_RULE_INFO_SCORE;
    private static final SubLSymbol $sym93$RKF_SD_RULE_INFO_SCORE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_;
    private static final SubLSymbol $sym96$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_;
    private static final SubLSymbol $sym97$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_;
    private static final SubLSymbol $sym98$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_;
    private static final SubLSymbol $sym99$RKF_SD_RULE_INFO_SCORE_VAR_COUNT;
    private static final SubLSymbol $sym100$_CSETF_RKF_SD_RULE_INFO_SCORE_VAR_COUNT;
    private static final SubLSymbol $sym101$RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT;
    private static final SubLSymbol $sym102$_CSETF_RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT;
    private static final SubLSymbol $sym103$RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT;
    private static final SubLSymbol $sym104$_CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT;
    private static final SubLSymbol $sym105$RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE;
    private static final SubLSymbol $sym106$_CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE;
    private static final SubLSymbol $sym107$RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE;
    private static final SubLSymbol $sym108$_CSETF_RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE;
    private static final SubLSymbol $sym109$RKF_SD_RULE_INFO_SCORE_PLIST;
    private static final SubLSymbol $sym110$_CSETF_RKF_SD_RULE_INFO_SCORE_PLIST;
    private static final SubLSymbol $kw111$SEED_TERM_IN_POS_LITS_;
    private static final SubLSymbol $kw112$SEED_TERM_IN_NEG_LITS_;
    private static final SubLSymbol $kw113$VAR_COUNT;
    private static final SubLSymbol $kw114$NEG_LIT_COUNT;
    private static final SubLSymbol $kw115$POS_LIT_COUNT;
    private static final SubLSymbol $kw116$POS_LIT_QUALITY_SCORE;
    private static final SubLSymbol $kw117$MT_GENERALITY_SCORE;
    private static final SubLSymbol $sym118$MAKE_RKF_SD_RULE_INFO_SCORE;
    private static final SubLSymbol $sym119$VISIT_DEFSTRUCT_OBJECT_RKF_SD_RULE_INFO_SCORE_METHOD;
    private static final SubLString $str120$_RKF_SD_SCORE;
    private static final SubLString $str121$_neg__S;
    private static final SubLString $str122$_pos__S;
    private static final SubLString $str123$_vars__S;
    private static final SubLString $str124$_nlc__S;
    private static final SubLString $str125$_plc__S;
    private static final SubLString $str126$_plq__S;
    private static final SubLString $str127$_mtg__S;
    private static final SubLString $str128$_;
    private static final SubLSymbol $sym129$RKF_SD_EXAMPLE;
    private static final SubLSymbol $sym130$RKF_SD_EXAMPLE_P;
    private static final SubLList $list131;
    private static final SubLList $list132;
    private static final SubLList $list133;
    private static final SubLList $list134;
    private static final SubLSymbol $sym135$PRINT_RKF_SD_EXAMPLE;
    private static final SubLSymbol $sym136$RKF_SD_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$RKF_SD_EXAMPLE_TYPE;
    private static final SubLSymbol $sym139$_CSETF_RKF_SD_EXAMPLE_TYPE;
    private static final SubLSymbol $sym140$RKF_SD_EXAMPLE_TERM;
    private static final SubLSymbol $sym141$_CSETF_RKF_SD_EXAMPLE_TERM;
    private static final SubLSymbol $sym142$RKF_SD_EXAMPLE_SUPPORTS;
    private static final SubLSymbol $sym143$_CSETF_RKF_SD_EXAMPLE_SUPPORTS;
    private static final SubLSymbol $sym144$RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG;
    private static final SubLSymbol $sym145$_CSETF_RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG;
    private static final SubLSymbol $kw146$TYPE;
    private static final SubLSymbol $kw147$TERM;
    private static final SubLSymbol $kw148$SUPPORTS;
    private static final SubLSymbol $kw149$FOCUS_TERM_ANALOG;
    private static final SubLSymbol $sym150$MAKE_RKF_SD_EXAMPLE;
    private static final SubLSymbol $sym151$VISIT_DEFSTRUCT_OBJECT_RKF_SD_EXAMPLE_METHOD;
    private static final SubLList $list152;
    private static final SubLSymbol $sym153$RKF_SD_EXAMPLE_TYPE_P;
    private static final SubLList $list154;
    private static final SubLSymbol $sym155$CLET;
    private static final SubLString $str156$_RKF_SD__A_EXAMPLE__S;
    private static final SubLSymbol $kw157$PRECEDENT;
    private static final SubLString $str158$__S;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject rkf_salient_descriptor_prompter_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rkf_sd_prompter(v_object, stream, (SubLObject)rkf_salient_descriptor_datastructures.ZERO_INTEGER);
        return (SubLObject)rkf_salient_descriptor_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject rkf_salient_descriptor_prompter_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rkf_salient_descriptor_prompter_native.class) ? rkf_salient_descriptor_datastructures.T : rkf_salient_descriptor_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject rkf_sd_prompter_seed_term(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompter_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject rkf_sd_prompter_mt(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompter_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject rkf_sd_prompter_used_prompts(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompter_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject rkf_sd_prompter_unused_prompts(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompter_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject rkf_sd_prompter_tactics(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompter_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject rkf_sd_prompter_isg(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompter_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject rkf_sd_prompter_plist(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompter_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject _csetf_rkf_sd_prompter_seed_term(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompter_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject _csetf_rkf_sd_prompter_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompter_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject _csetf_rkf_sd_prompter_used_prompts(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompter_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject _csetf_rkf_sd_prompter_unused_prompts(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompter_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject _csetf_rkf_sd_prompter_tactics(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompter_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject _csetf_rkf_sd_prompter_isg(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompter_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject _csetf_rkf_sd_prompter_plist(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompter_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject make_rkf_salient_descriptor_prompter(SubLObject arglist) {
        if (arglist == rkf_salient_descriptor_datastructures.UNPROVIDED) {
            arglist = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rkf_salient_descriptor_prompter_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_salient_descriptor_datastructures.NIL, next = arglist; rkf_salient_descriptor_datastructures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw23$SEED_TERM)) {
                _csetf_rkf_sd_prompter_seed_term(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw24$MT)) {
                _csetf_rkf_sd_prompter_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw25$USED_PROMPTS)) {
                _csetf_rkf_sd_prompter_used_prompts(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw26$UNUSED_PROMPTS)) {
                _csetf_rkf_sd_prompter_unused_prompts(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw27$TACTICS)) {
                _csetf_rkf_sd_prompter_tactics(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw28$ISG)) {
                _csetf_rkf_sd_prompter_isg(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw29$PLIST)) {
                _csetf_rkf_sd_prompter_plist(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_salient_descriptor_datastructures.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject visit_defstruct_rkf_salient_descriptor_prompter(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw31$BEGIN, (SubLObject)rkf_salient_descriptor_datastructures.$sym32$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPTER, (SubLObject)rkf_salient_descriptor_datastructures.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw23$SEED_TERM, rkf_sd_prompter_seed_term(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw24$MT, rkf_sd_prompter_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw25$USED_PROMPTS, rkf_sd_prompter_used_prompts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw26$UNUSED_PROMPTS, rkf_sd_prompter_unused_prompts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw27$TACTICS, rkf_sd_prompter_tactics(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw28$ISG, rkf_sd_prompter_isg(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw29$PLIST, rkf_sd_prompter_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw34$END, (SubLObject)rkf_salient_descriptor_datastructures.$sym32$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPTER, (SubLObject)rkf_salient_descriptor_datastructures.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1068L)
    public static SubLObject visit_defstruct_object_rkf_salient_descriptor_prompter_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rkf_salient_descriptor_prompter(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1331L)
    public static SubLObject print_rkf_sd_prompter(final SubLObject prompter, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)rkf_salient_descriptor_datastructures.$str36$_RKF_SD_PROMPTER__S__S___D_prompt, new SubLObject[] { rkf_sd_prompter_seed_term(prompter), rkf_sd_prompter_mt(prompter), set.set_size(rkf_sd_prompter_unused_prompts(prompter)) });
        return prompter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 1616L)
    public static SubLObject new_rkf_salient_descriptor_prompter(final SubLObject seed_term, final SubLObject mt) {
        final SubLObject seed_term_type = rkf_salient_descriptor_prompter.rkf_sd_prompter_compute_seed_term_type(seed_term);
        final SubLObject tactics = rkf_salient_descriptor_prompter.rkf_sd_prompter_tactics_for_seed_term_type(seed_term_type);
        final SubLObject prompter = make_rkf_salient_descriptor_prompter((SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_datastructures.$kw23$SEED_TERM, seed_term, (SubLObject)rkf_salient_descriptor_datastructures.$kw24$MT, mt));
        if (rkf_salient_descriptor_datastructures.NIL != tactics) {
            _csetf_rkf_sd_prompter_tactics(prompter, tactics);
        }
        _csetf_rkf_sd_prompter_used_prompts(prompter, set.new_set((SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED, (SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED));
        _csetf_rkf_sd_prompter_unused_prompts(prompter, set.new_set((SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED, (SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED));
        _csetf_rkf_sd_prompter_isg(prompter, integer_sequence_generator.new_integer_sequence_generator((SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED, (SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED, (SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED));
        rkf_salient_descriptor_prompter_set(prompter, (SubLObject)rkf_salient_descriptor_datastructures.$kw37$MEMOIZATION_STATE, memoization_state.new_memoization_state((SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED, (SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED, (SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED, (SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED));
        final SubLObject lock = Locks.make_lock((SubLObject)rkf_salient_descriptor_datastructures.$str38$Salient_Descriptor_Prompter_Lock);
        rkf_salient_descriptor_prompter_set(prompter, (SubLObject)rkf_salient_descriptor_datastructures.$kw39$LOCK, lock);
        return prompter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 2457L)
    public static SubLObject rkf_salient_descriptor_prompter_lookup(final SubLObject prompter, final SubLObject property, SubLObject v_default) {
        if (v_default == rkf_salient_descriptor_datastructures.UNPROVIDED) {
            v_default = (SubLObject)rkf_salient_descriptor_datastructures.$kw40$UNKNOWN;
        }
        SubLObject ans = conses_high.getf(rkf_sd_prompter_plist(prompter), property, (SubLObject)rkf_salient_descriptor_datastructures.$kw41$NOT_FOUND);
        if (rkf_salient_descriptor_datastructures.$kw41$NOT_FOUND == ans) {
            rkf_salient_descriptor_prompter_set(prompter, property, v_default);
            ans = v_default;
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 2781L)
    public static SubLObject rkf_salient_descriptor_prompter_set(final SubLObject prompter, final SubLObject property, final SubLObject value) {
        _csetf_rkf_sd_prompter_plist(prompter, conses_high.putf(rkf_sd_prompter_plist(prompter), property, value));
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 2974L)
    public static SubLObject rkf_salient_descriptor_prompter_clear(final SubLObject prompter, final SubLObject property) {
        return rkf_salient_descriptor_prompter_set(prompter, property, (SubLObject)rkf_salient_descriptor_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 3117L)
    public static SubLObject rkf_salient_descriptor_prompter_unused_prompts(final SubLObject prompter) {
        final SubLObject prompts = rkf_sd_prompter_unused_prompts(prompter);
        return (rkf_salient_descriptor_datastructures.NIL != set.set_p(prompts)) ? prompts : set.new_set((SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED, (SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject rkf_salient_descriptor_prompt_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rkf_sd_prompt(v_object, stream, (SubLObject)rkf_salient_descriptor_datastructures.ZERO_INTEGER);
        return (SubLObject)rkf_salient_descriptor_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject rkf_salient_descriptor_prompt_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rkf_salient_descriptor_prompt_native.class) ? rkf_salient_descriptor_datastructures.T : rkf_salient_descriptor_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject rkf_sd_prompt_id(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject rkf_sd_prompt_subprompts(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject rkf_sd_prompt_formula(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject rkf_sd_prompt_justification(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject rkf_sd_prompt_deducible_cnfs(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject rkf_sd_prompt_examples(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject rkf_sd_prompt_salient_property_sentence(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject rkf_sd_prompt_prompter(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject rkf_sd_prompt_tactic(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject _csetf_rkf_sd_prompt_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject _csetf_rkf_sd_prompt_subprompts(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject _csetf_rkf_sd_prompt_formula(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject _csetf_rkf_sd_prompt_justification(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject _csetf_rkf_sd_prompt_deducible_cnfs(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject _csetf_rkf_sd_prompt_examples(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject _csetf_rkf_sd_prompt_salient_property_sentence(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject _csetf_rkf_sd_prompt_prompter(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject _csetf_rkf_sd_prompt_tactic(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_salient_descriptor_prompt_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject make_rkf_salient_descriptor_prompt(SubLObject arglist) {
        if (arglist == rkf_salient_descriptor_datastructures.UNPROVIDED) {
            arglist = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rkf_salient_descriptor_prompt_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_salient_descriptor_datastructures.NIL, next = arglist; rkf_salient_descriptor_datastructures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw69$ID)) {
                _csetf_rkf_sd_prompt_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw70$SUBPROMPTS)) {
                _csetf_rkf_sd_prompt_subprompts(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw71$FORMULA)) {
                _csetf_rkf_sd_prompt_formula(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw72$JUSTIFICATION)) {
                _csetf_rkf_sd_prompt_justification(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw73$DEDUCIBLE_CNFS)) {
                _csetf_rkf_sd_prompt_deducible_cnfs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw74$EXAMPLES)) {
                _csetf_rkf_sd_prompt_examples(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw75$SALIENT_PROPERTY_SENTENCE)) {
                _csetf_rkf_sd_prompt_salient_property_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw76$PROMPTER)) {
                _csetf_rkf_sd_prompt_prompter(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw77$TACTIC)) {
                _csetf_rkf_sd_prompt_tactic(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_salient_descriptor_datastructures.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject visit_defstruct_rkf_salient_descriptor_prompt(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw31$BEGIN, (SubLObject)rkf_salient_descriptor_datastructures.$sym78$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPT, (SubLObject)rkf_salient_descriptor_datastructures.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw69$ID, rkf_sd_prompt_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw70$SUBPROMPTS, rkf_sd_prompt_subprompts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw71$FORMULA, rkf_sd_prompt_formula(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw72$JUSTIFICATION, rkf_sd_prompt_justification(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw73$DEDUCIBLE_CNFS, rkf_sd_prompt_deducible_cnfs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw74$EXAMPLES, rkf_sd_prompt_examples(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw75$SALIENT_PROPERTY_SENTENCE, rkf_sd_prompt_salient_property_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw76$PROMPTER, rkf_sd_prompt_prompter(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw77$TACTIC, rkf_sd_prompt_tactic(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw34$END, (SubLObject)rkf_salient_descriptor_datastructures.$sym78$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPT, (SubLObject)rkf_salient_descriptor_datastructures.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 6866L)
    public static SubLObject visit_defstruct_object_rkf_salient_descriptor_prompt_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rkf_salient_descriptor_prompt(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 7199L)
    public static SubLObject print_rkf_sd_prompt(final SubLObject prompt, final SubLObject stream, final SubLObject depth) {
        final SubLObject subprompts = rkf_sd_prompt_subprompts(prompt);
        final SubLObject formula = rkf_sd_prompt_formula(prompt);
        final SubLObject deducible_cnfs = rkf_sd_prompt_deducible_cnfs(prompt);
        PrintLow.format(stream, (SubLObject)rkf_salient_descriptor_datastructures.$str80$_RKF_SD_PROMPT_Subprompts___S_, subprompts);
        if (rkf_salient_descriptor_datastructures.NIL == subprompts) {
            PrintLow.format(stream, (SubLObject)rkf_salient_descriptor_datastructures.$str81$Formula___S_, formula);
        }
        PrintLow.format(stream, (SubLObject)rkf_salient_descriptor_datastructures.$str82$Deducible_CNFs___S_, deducible_cnfs);
        return prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 7641L)
    public static SubLObject new_rkf_sd_prompt() {
        return make_rkf_salient_descriptor_prompt((SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 7727L)
    public static SubLObject rkf_sd_prompt_set_formula(final SubLObject prompt, final SubLObject formula) {
        _csetf_rkf_sd_prompt_formula(prompt, formula);
        return prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 7854L)
    public static SubLObject rkf_sd_prompt_set_tactic(final SubLObject prompt, final SubLObject tactic) {
        _csetf_rkf_sd_prompt_tactic(prompt, tactic);
        return prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 7977L)
    public static SubLObject rkf_sd_prompt_set_justification(final SubLObject prompt, final SubLObject justification) {
        _csetf_rkf_sd_prompt_justification(prompt, justification);
        return prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 8128L)
    public static SubLObject rkf_sd_prompt_set_salient_property_sentence(final SubLObject prompt, final SubLObject sentence) {
        _csetf_rkf_sd_prompt_salient_property_sentence(prompt, sentence);
        return prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 8293L)
    public static SubLObject rkf_sd_prompt_set_subprompts(final SubLObject prompt, final SubLObject subprompts) {
        _csetf_rkf_sd_prompt_subprompts(prompt, subprompts);
        return prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 8432L)
    public static SubLObject rkf_sd_prompt_set_id(final SubLObject prompt, final SubLObject id) {
        _csetf_rkf_sd_prompt_id(prompt, id);
        return prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 8539L)
    public static SubLObject rkf_sd_prompt_set_prompter(final SubLObject prompt, final SubLObject prompter) {
        _csetf_rkf_sd_prompt_prompter(prompt, prompter);
        return prompt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 8670L)
    public static SubLObject rkf_salient_descriptor_prompt_id(final SubLObject prompt) {
        return rkf_sd_prompt_id(prompt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 8803L)
    public static SubLObject rkf_salient_descriptor_prompt_formula(final SubLObject prompt) {
        return rkf_sd_prompt_formula(prompt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 8969L)
    public static SubLObject rkf_salient_descriptor_prompt_choices(final SubLObject prompt) {
        SubLObject choices = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        if (rkf_salient_descriptor_datastructures.$kw83$CHOICE == rkf_salient_descriptor_prompt_type(prompt)) {
            final SubLObject subprompts = rkf_sd_prompt_subprompts(prompt);
            final SubLObject subprompt = subprompts.first();
            choices = conses_high.third(subprompt);
        }
        return choices;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 9348L)
    public static SubLObject rkf_salient_descriptor_prompt_term_count(final SubLObject prompt) {
        SubLObject count = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        final SubLObject pcase_var = rkf_salient_descriptor_prompt_type(prompt);
        if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw84$SPECIFY) || pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw85$CONFIRM)) {
            final SubLObject subprompts = rkf_sd_prompt_subprompts(prompt);
            count = Sequences.length(subprompts);
        }
        else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw83$CHOICE)) {
            return (SubLObject)rkf_salient_descriptor_datastructures.ONE_INTEGER;
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 9742L)
    public static SubLObject rkf_salient_descriptor_prompt_type(final SubLObject prompt) {
        final SubLObject subprompts = rkf_sd_prompt_subprompts(prompt);
        final SubLObject subprompt = subprompts.first();
        return rkf_salient_descriptor.rkf_salient_descriptor_subprompt_type(subprompt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 9975L)
    public static SubLObject rkf_salient_descriptor_prompt_prompter(final SubLObject prompt) {
        return rkf_sd_prompt_prompter(prompt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 10151L)
    public static SubLObject rkf_salient_descriptor_prompt_justification(final SubLObject prompt) {
        return rkf_sd_prompt_justification(prompt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 10314L)
    public static SubLObject rkf_salient_descriptor_prompt_subprompts(final SubLObject prompt) {
        rkf_salient_descriptor_prompter.rkf_sd_prompt_maybe_compute_subprompts(prompt);
        return rkf_sd_prompt_subprompts(prompt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 10544L)
    public static SubLObject rkf_salient_descriptor_prompt_salient_property_sentence(final SubLObject prompt) {
        return rkf_sd_prompt_salient_property_sentence(prompt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 10759L)
    public static SubLObject rkf_salient_descriptor_prompt_deducible_cnfs(final SubLObject prompt) {
        return rkf_sd_prompt_deducible_cnfs(prompt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject rkf_sd_rule_info_score_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rkf_sd_rule_info_score(v_object, stream, (SubLObject)rkf_salient_descriptor_datastructures.ZERO_INTEGER);
        return (SubLObject)rkf_salient_descriptor_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject rkf_sd_rule_info_score_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rkf_sd_rule_info_score_native.class) ? rkf_salient_descriptor_datastructures.T : rkf_salient_descriptor_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject rkf_sd_rule_info_score_seed_term_in_pos_litsP(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject rkf_sd_rule_info_score_seed_term_in_neg_litsP(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject rkf_sd_rule_info_score_var_count(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject rkf_sd_rule_info_score_neg_lit_count(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject rkf_sd_rule_info_score_pos_lit_count(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject rkf_sd_rule_info_score_pos_lit_quality_score(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject rkf_sd_rule_info_score_mt_generality_score(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject rkf_sd_rule_info_score_plist(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject _csetf_rkf_sd_rule_info_score_seed_term_in_pos_litsP(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject _csetf_rkf_sd_rule_info_score_seed_term_in_neg_litsP(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject _csetf_rkf_sd_rule_info_score_var_count(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject _csetf_rkf_sd_rule_info_score_neg_lit_count(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject _csetf_rkf_sd_rule_info_score_pos_lit_count(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject _csetf_rkf_sd_rule_info_score_pos_lit_quality_score(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject _csetf_rkf_sd_rule_info_score_mt_generality_score(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject _csetf_rkf_sd_rule_info_score_plist(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_rule_info_score_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject make_rkf_sd_rule_info_score(SubLObject arglist) {
        if (arglist == rkf_salient_descriptor_datastructures.UNPROVIDED) {
            arglist = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rkf_sd_rule_info_score_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_salient_descriptor_datastructures.NIL, next = arglist; rkf_salient_descriptor_datastructures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw111$SEED_TERM_IN_POS_LITS_)) {
                _csetf_rkf_sd_rule_info_score_seed_term_in_pos_litsP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw112$SEED_TERM_IN_NEG_LITS_)) {
                _csetf_rkf_sd_rule_info_score_seed_term_in_neg_litsP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw113$VAR_COUNT)) {
                _csetf_rkf_sd_rule_info_score_var_count(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw114$NEG_LIT_COUNT)) {
                _csetf_rkf_sd_rule_info_score_neg_lit_count(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw115$POS_LIT_COUNT)) {
                _csetf_rkf_sd_rule_info_score_pos_lit_count(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw116$POS_LIT_QUALITY_SCORE)) {
                _csetf_rkf_sd_rule_info_score_pos_lit_quality_score(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw117$MT_GENERALITY_SCORE)) {
                _csetf_rkf_sd_rule_info_score_mt_generality_score(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw29$PLIST)) {
                _csetf_rkf_sd_rule_info_score_plist(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_salient_descriptor_datastructures.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject visit_defstruct_rkf_sd_rule_info_score(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw31$BEGIN, (SubLObject)rkf_salient_descriptor_datastructures.$sym118$MAKE_RKF_SD_RULE_INFO_SCORE, (SubLObject)rkf_salient_descriptor_datastructures.EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw111$SEED_TERM_IN_POS_LITS_, rkf_sd_rule_info_score_seed_term_in_pos_litsP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw112$SEED_TERM_IN_NEG_LITS_, rkf_sd_rule_info_score_seed_term_in_neg_litsP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw113$VAR_COUNT, rkf_sd_rule_info_score_var_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw114$NEG_LIT_COUNT, rkf_sd_rule_info_score_neg_lit_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw115$POS_LIT_COUNT, rkf_sd_rule_info_score_pos_lit_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw116$POS_LIT_QUALITY_SCORE, rkf_sd_rule_info_score_pos_lit_quality_score(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw117$MT_GENERALITY_SCORE, rkf_sd_rule_info_score_mt_generality_score(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw29$PLIST, rkf_sd_rule_info_score_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw34$END, (SubLObject)rkf_salient_descriptor_datastructures.$sym118$MAKE_RKF_SD_RULE_INFO_SCORE, (SubLObject)rkf_salient_descriptor_datastructures.EIGHT_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12469L)
    public static SubLObject visit_defstruct_object_rkf_sd_rule_info_score_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rkf_sd_rule_info_score(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12839L)
    public static SubLObject new_rkf_sd_rule_info_score() {
        return make_rkf_sd_rule_info_score((SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 12927L)
    public static SubLObject print_rkf_sd_rule_info_score(final SubLObject score, SubLObject stream, SubLObject depth) {
        if (stream == rkf_salient_descriptor_datastructures.UNPROVIDED) {
            stream = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        }
        if (depth == rkf_salient_descriptor_datastructures.UNPROVIDED) {
            depth = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        }
        print_high.princ((SubLObject)rkf_salient_descriptor_datastructures.$str120$_RKF_SD_SCORE, stream);
        PrintLow.format(stream, (SubLObject)rkf_salient_descriptor_datastructures.$str121$_neg__S, rkf_sd_rule_info_score_seed_term_in_neg_litsP(score));
        PrintLow.format(stream, (SubLObject)rkf_salient_descriptor_datastructures.$str122$_pos__S, rkf_sd_rule_info_score_seed_term_in_pos_litsP(score));
        PrintLow.format(stream, (SubLObject)rkf_salient_descriptor_datastructures.$str123$_vars__S, rkf_sd_rule_info_score_var_count(score));
        PrintLow.format(stream, (SubLObject)rkf_salient_descriptor_datastructures.$str124$_nlc__S, rkf_sd_rule_info_score_neg_lit_count(score));
        PrintLow.format(stream, (SubLObject)rkf_salient_descriptor_datastructures.$str125$_plc__S, rkf_sd_rule_info_score_pos_lit_count(score));
        PrintLow.format(stream, (SubLObject)rkf_salient_descriptor_datastructures.$str126$_plq__S, rkf_sd_rule_info_score_pos_lit_quality_score(score));
        PrintLow.format(stream, (SubLObject)rkf_salient_descriptor_datastructures.$str127$_mtg__S, rkf_sd_rule_info_score_mt_generality_score(score));
        print_high.princ((SubLObject)rkf_salient_descriptor_datastructures.$str128$_, stream);
        return score;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
    public static SubLObject rkf_sd_example_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rkf_sd_example(v_object, stream, (SubLObject)rkf_salient_descriptor_datastructures.ZERO_INTEGER);
        return (SubLObject)rkf_salient_descriptor_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
    public static SubLObject rkf_sd_example_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rkf_sd_example_native.class) ? rkf_salient_descriptor_datastructures.T : rkf_salient_descriptor_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
    public static SubLObject rkf_sd_example_type(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_example_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
    public static SubLObject rkf_sd_example_term(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_example_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
    public static SubLObject rkf_sd_example_supports(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_example_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
    public static SubLObject rkf_sd_example_focus_term_analog(final SubLObject v_object) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_example_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
    public static SubLObject _csetf_rkf_sd_example_type(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_example_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
    public static SubLObject _csetf_rkf_sd_example_term(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_example_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
    public static SubLObject _csetf_rkf_sd_example_supports(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_example_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
    public static SubLObject _csetf_rkf_sd_example_focus_term_analog(final SubLObject v_object, final SubLObject value) {
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_example_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
    public static SubLObject make_rkf_sd_example(SubLObject arglist) {
        if (arglist == rkf_salient_descriptor_datastructures.UNPROVIDED) {
            arglist = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rkf_sd_example_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_salient_descriptor_datastructures.NIL, next = arglist; rkf_salient_descriptor_datastructures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw146$TYPE)) {
                _csetf_rkf_sd_example_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw147$TERM)) {
                _csetf_rkf_sd_example_term(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw148$SUPPORTS)) {
                _csetf_rkf_sd_example_supports(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_salient_descriptor_datastructures.$kw149$FOCUS_TERM_ANALOG)) {
                _csetf_rkf_sd_example_focus_term_analog(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_salient_descriptor_datastructures.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
    public static SubLObject visit_defstruct_rkf_sd_example(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw31$BEGIN, (SubLObject)rkf_salient_descriptor_datastructures.$sym150$MAKE_RKF_SD_EXAMPLE, (SubLObject)rkf_salient_descriptor_datastructures.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw146$TYPE, rkf_sd_example_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw147$TERM, rkf_sd_example_term(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw148$SUPPORTS, rkf_sd_example_supports(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw33$SLOT, (SubLObject)rkf_salient_descriptor_datastructures.$kw149$FOCUS_TERM_ANALOG, rkf_sd_example_focus_term_analog(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_salient_descriptor_datastructures.$kw34$END, (SubLObject)rkf_salient_descriptor_datastructures.$sym150$MAKE_RKF_SD_EXAMPLE, (SubLObject)rkf_salient_descriptor_datastructures.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13631L)
    public static SubLObject visit_defstruct_object_rkf_sd_example_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rkf_sd_example(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13843L)
    public static SubLObject rkf_sd_example_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, rkf_salient_descriptor_datastructures.$rkf_sd_example_types$.getGlobalValue(), (SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED, (SubLObject)rkf_salient_descriptor_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 13938L)
    public static SubLObject new_rkf_sd_example(SubLObject type, SubLObject v_term, SubLObject supports, SubLObject focus_term_analog) {
        if (type == rkf_salient_descriptor_datastructures.UNPROVIDED) {
            type = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        }
        if (v_term == rkf_salient_descriptor_datastructures.UNPROVIDED) {
            v_term = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        }
        if (supports == rkf_salient_descriptor_datastructures.UNPROVIDED) {
            supports = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        }
        if (focus_term_analog == rkf_salient_descriptor_datastructures.UNPROVIDED) {
            focus_term_analog = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        }
        assert rkf_salient_descriptor_datastructures.NIL != rkf_sd_example_type_p(type) : type;
        return make_rkf_sd_example((SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_datastructures.$kw146$TYPE, type, (SubLObject)rkf_salient_descriptor_datastructures.$kw147$TERM, v_term, (SubLObject)rkf_salient_descriptor_datastructures.$kw148$SUPPORTS, supports, (SubLObject)rkf_salient_descriptor_datastructures.$kw149$FOCUS_TERM_ANALOG, focus_term_analog));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 14201L)
    public static SubLObject destructure_rkf_sd_example(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_datastructures.$list154);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject type = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        SubLObject v_term = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        SubLObject supports = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        SubLObject focus_term_analog = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_datastructures.$list154);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_datastructures.$list154);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_datastructures.$list154);
        supports = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_datastructures.$list154);
        focus_term_analog = current.first();
        current = current.rest();
        if (rkf_salient_descriptor_datastructures.NIL == current) {
            current = temp;
            SubLObject example = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_salient_descriptor_datastructures.$list154);
            example = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)rkf_salient_descriptor_datastructures.$sym155$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(type, (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_datastructures.$sym138$RKF_SD_EXAMPLE_TYPE, example)), (SubLObject)ConsesLow.list(v_term, (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_datastructures.$sym140$RKF_SD_EXAMPLE_TERM, example)), (SubLObject)ConsesLow.list(supports, (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_datastructures.$sym142$RKF_SD_EXAMPLE_SUPPORTS, example)), (SubLObject)ConsesLow.list(focus_term_analog, (SubLObject)ConsesLow.list((SubLObject)rkf_salient_descriptor_datastructures.$sym144$RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG, example))), ConsesLow.append(body, (SubLObject)rkf_salient_descriptor_datastructures.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_salient_descriptor_datastructures.$list154);
        return (SubLObject)rkf_salient_descriptor_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 14552L)
    public static SubLObject print_rkf_sd_example(final SubLObject example, SubLObject stream, SubLObject depth) {
        if (stream == rkf_salient_descriptor_datastructures.UNPROVIDED) {
            stream = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        }
        if (depth == rkf_salient_descriptor_datastructures.UNPROVIDED) {
            depth = (SubLObject)rkf_salient_descriptor_datastructures.NIL;
        }
        final SubLObject type = rkf_sd_example_type(example);
        final SubLObject v_term = rkf_sd_example_term(example);
        final SubLObject supports = rkf_sd_example_supports(example);
        final SubLObject focus_term_analog = rkf_sd_example_focus_term_analog(example);
        PrintLow.format(stream, (SubLObject)rkf_salient_descriptor_datastructures.$str156$_RKF_SD__A_EXAMPLE__S, type, v_term);
        if (rkf_salient_descriptor_datastructures.$kw157$PRECEDENT == type) {
            PrintLow.format(stream, (SubLObject)rkf_salient_descriptor_datastructures.$str158$__S, focus_term_analog);
        }
        print_high.princ((SubLObject)rkf_salient_descriptor_datastructures.$str128$_, stream);
        return example;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-salient-descriptor-datastructures.lisp", position = 14913L)
    public static SubLObject rkf_sd_precedent_example_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_salient_descriptor_datastructures.NIL != rkf_sd_example_p(v_object) && rkf_sd_example_type(v_object) == rkf_salient_descriptor_datastructures.$kw157$PRECEDENT);
    }
    
    public static SubLObject declare_rkf_salient_descriptor_datastructures_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompter_print_function_trampoline", "RKF-SALIENT-DESCRIPTOR-PROMPTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompter_p", "RKF-SALIENT-DESCRIPTOR-PROMPTER-P", 1, 0, false);
        new $rkf_salient_descriptor_prompter_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompter_seed_term", "RKF-SD-PROMPTER-SEED-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompter_mt", "RKF-SD-PROMPTER-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompter_used_prompts", "RKF-SD-PROMPTER-USED-PROMPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompter_unused_prompts", "RKF-SD-PROMPTER-UNUSED-PROMPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompter_tactics", "RKF-SD-PROMPTER-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompter_isg", "RKF-SD-PROMPTER-ISG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompter_plist", "RKF-SD-PROMPTER-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompter_seed_term", "_CSETF-RKF-SD-PROMPTER-SEED-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompter_mt", "_CSETF-RKF-SD-PROMPTER-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompter_used_prompts", "_CSETF-RKF-SD-PROMPTER-USED-PROMPTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompter_unused_prompts", "_CSETF-RKF-SD-PROMPTER-UNUSED-PROMPTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompter_tactics", "_CSETF-RKF-SD-PROMPTER-TACTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompter_isg", "_CSETF-RKF-SD-PROMPTER-ISG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompter_plist", "_CSETF-RKF-SD-PROMPTER-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "make_rkf_salient_descriptor_prompter", "MAKE-RKF-SALIENT-DESCRIPTOR-PROMPTER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "visit_defstruct_rkf_salient_descriptor_prompter", "VISIT-DEFSTRUCT-RKF-SALIENT-DESCRIPTOR-PROMPTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "visit_defstruct_object_rkf_salient_descriptor_prompter_method", "VISIT-DEFSTRUCT-OBJECT-RKF-SALIENT-DESCRIPTOR-PROMPTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "print_rkf_sd_prompter", "PRINT-RKF-SD-PROMPTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "new_rkf_salient_descriptor_prompter", "NEW-RKF-SALIENT-DESCRIPTOR-PROMPTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompter_lookup", "RKF-SALIENT-DESCRIPTOR-PROMPTER-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompter_set", "RKF-SALIENT-DESCRIPTOR-PROMPTER-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompter_clear", "RKF-SALIENT-DESCRIPTOR-PROMPTER-CLEAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompter_unused_prompts", "RKF-SALIENT-DESCRIPTOR-PROMPTER-UNUSED-PROMPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompt_print_function_trampoline", "RKF-SALIENT-DESCRIPTOR-PROMPT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompt_p", "RKF-SALIENT-DESCRIPTOR-PROMPT-P", 1, 0, false);
        new $rkf_salient_descriptor_prompt_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_id", "RKF-SD-PROMPT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_subprompts", "RKF-SD-PROMPT-SUBPROMPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_formula", "RKF-SD-PROMPT-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_justification", "RKF-SD-PROMPT-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_deducible_cnfs", "RKF-SD-PROMPT-DEDUCIBLE-CNFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_examples", "RKF-SD-PROMPT-EXAMPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_salient_property_sentence", "RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_prompter", "RKF-SD-PROMPT-PROMPTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_tactic", "RKF-SD-PROMPT-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompt_id", "_CSETF-RKF-SD-PROMPT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompt_subprompts", "_CSETF-RKF-SD-PROMPT-SUBPROMPTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompt_formula", "_CSETF-RKF-SD-PROMPT-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompt_justification", "_CSETF-RKF-SD-PROMPT-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompt_deducible_cnfs", "_CSETF-RKF-SD-PROMPT-DEDUCIBLE-CNFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompt_examples", "_CSETF-RKF-SD-PROMPT-EXAMPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompt_salient_property_sentence", "_CSETF-RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompt_prompter", "_CSETF-RKF-SD-PROMPT-PROMPTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_prompt_tactic", "_CSETF-RKF-SD-PROMPT-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "make_rkf_salient_descriptor_prompt", "MAKE-RKF-SALIENT-DESCRIPTOR-PROMPT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "visit_defstruct_rkf_salient_descriptor_prompt", "VISIT-DEFSTRUCT-RKF-SALIENT-DESCRIPTOR-PROMPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "visit_defstruct_object_rkf_salient_descriptor_prompt_method", "VISIT-DEFSTRUCT-OBJECT-RKF-SALIENT-DESCRIPTOR-PROMPT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "print_rkf_sd_prompt", "PRINT-RKF-SD-PROMPT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "new_rkf_sd_prompt", "NEW-RKF-SD-PROMPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_set_formula", "RKF-SD-PROMPT-SET-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_set_tactic", "RKF-SD-PROMPT-SET-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_set_justification", "RKF-SD-PROMPT-SET-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_set_salient_property_sentence", "RKF-SD-PROMPT-SET-SALIENT-PROPERTY-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_set_subprompts", "RKF-SD-PROMPT-SET-SUBPROMPTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_set_id", "RKF-SD-PROMPT-SET-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_prompt_set_prompter", "RKF-SD-PROMPT-SET-PROMPTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompt_id", "RKF-SALIENT-DESCRIPTOR-PROMPT-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompt_formula", "RKF-SALIENT-DESCRIPTOR-PROMPT-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompt_choices", "RKF-SALIENT-DESCRIPTOR-PROMPT-CHOICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompt_term_count", "RKF-SALIENT-DESCRIPTOR-PROMPT-TERM-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompt_type", "RKF-SALIENT-DESCRIPTOR-PROMPT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompt_prompter", "RKF-SALIENT-DESCRIPTOR-PROMPT-PROMPTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompt_justification", "RKF-SALIENT-DESCRIPTOR-PROMPT-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompt_subprompts", "RKF-SALIENT-DESCRIPTOR-PROMPT-SUBPROMPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompt_salient_property_sentence", "RKF-SALIENT-DESCRIPTOR-PROMPT-SALIENT-PROPERTY-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_salient_descriptor_prompt_deducible_cnfs", "RKF-SALIENT-DESCRIPTOR-PROMPT-DEDUCIBLE-CNFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_rule_info_score_print_function_trampoline", "RKF-SD-RULE-INFO-SCORE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_rule_info_score_p", "RKF-SD-RULE-INFO-SCORE-P", 1, 0, false);
        new $rkf_sd_rule_info_score_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_rule_info_score_seed_term_in_pos_litsP", "RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_rule_info_score_seed_term_in_neg_litsP", "RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_rule_info_score_var_count", "RKF-SD-RULE-INFO-SCORE-VAR-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_rule_info_score_neg_lit_count", "RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_rule_info_score_pos_lit_count", "RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_rule_info_score_pos_lit_quality_score", "RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_rule_info_score_mt_generality_score", "RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_rule_info_score_plist", "RKF-SD-RULE-INFO-SCORE-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_rule_info_score_seed_term_in_pos_litsP", "_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_rule_info_score_seed_term_in_neg_litsP", "_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_rule_info_score_var_count", "_CSETF-RKF-SD-RULE-INFO-SCORE-VAR-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_rule_info_score_neg_lit_count", "_CSETF-RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_rule_info_score_pos_lit_count", "_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_rule_info_score_pos_lit_quality_score", "_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_rule_info_score_mt_generality_score", "_CSETF-RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_rule_info_score_plist", "_CSETF-RKF-SD-RULE-INFO-SCORE-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "make_rkf_sd_rule_info_score", "MAKE-RKF-SD-RULE-INFO-SCORE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "visit_defstruct_rkf_sd_rule_info_score", "VISIT-DEFSTRUCT-RKF-SD-RULE-INFO-SCORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "visit_defstruct_object_rkf_sd_rule_info_score_method", "VISIT-DEFSTRUCT-OBJECT-RKF-SD-RULE-INFO-SCORE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "new_rkf_sd_rule_info_score", "NEW-RKF-SD-RULE-INFO-SCORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "print_rkf_sd_rule_info_score", "PRINT-RKF-SD-RULE-INFO-SCORE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_example_print_function_trampoline", "RKF-SD-EXAMPLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_example_p", "RKF-SD-EXAMPLE-P", 1, 0, false);
        new $rkf_sd_example_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_example_type", "RKF-SD-EXAMPLE-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_example_term", "RKF-SD-EXAMPLE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_example_supports", "RKF-SD-EXAMPLE-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_example_focus_term_analog", "RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_example_type", "_CSETF-RKF-SD-EXAMPLE-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_example_term", "_CSETF-RKF-SD-EXAMPLE-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_example_supports", "_CSETF-RKF-SD-EXAMPLE-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "_csetf_rkf_sd_example_focus_term_analog", "_CSETF-RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "make_rkf_sd_example", "MAKE-RKF-SD-EXAMPLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "visit_defstruct_rkf_sd_example", "VISIT-DEFSTRUCT-RKF-SD-EXAMPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "visit_defstruct_object_rkf_sd_example_method", "VISIT-DEFSTRUCT-OBJECT-RKF-SD-EXAMPLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_example_type_p", "RKF-SD-EXAMPLE-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "new_rkf_sd_example", "NEW-RKF-SD-EXAMPLE", 0, 4, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "destructure_rkf_sd_example", "DESTRUCTURE-RKF-SD-EXAMPLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "print_rkf_sd_example", "PRINT-RKF-SD-EXAMPLE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_salient_descriptor_datastructures", "rkf_sd_precedent_example_p", "RKF-SD-PRECEDENT-EXAMPLE-P", 1, 0, false);
        return (SubLObject)rkf_salient_descriptor_datastructures.NIL;
    }
    
    public static SubLObject init_rkf_salient_descriptor_datastructures_file() {
        rkf_salient_descriptor_datastructures.$dtp_rkf_salient_descriptor_prompter$ = SubLFiles.defconstant("*DTP-RKF-SALIENT-DESCRIPTOR-PROMPTER*", (SubLObject)rkf_salient_descriptor_datastructures.$sym0$RKF_SALIENT_DESCRIPTOR_PROMPTER);
        rkf_salient_descriptor_datastructures.$dtp_rkf_salient_descriptor_prompt$ = SubLFiles.defconstant("*DTP-RKF-SALIENT-DESCRIPTOR-PROMPT*", (SubLObject)rkf_salient_descriptor_datastructures.$sym42$RKF_SALIENT_DESCRIPTOR_PROMPT);
        rkf_salient_descriptor_datastructures.$dtp_rkf_sd_rule_info_score$ = SubLFiles.defconstant("*DTP-RKF-SD-RULE-INFO-SCORE*", (SubLObject)rkf_salient_descriptor_datastructures.$sym86$RKF_SD_RULE_INFO_SCORE);
        rkf_salient_descriptor_datastructures.$dtp_rkf_sd_example$ = SubLFiles.defconstant("*DTP-RKF-SD-EXAMPLE*", (SubLObject)rkf_salient_descriptor_datastructures.$sym129$RKF_SD_EXAMPLE);
        rkf_salient_descriptor_datastructures.$rkf_sd_example_types$ = SubLFiles.defconstant("*RKF-SD-EXAMPLE-TYPES*", (SubLObject)rkf_salient_descriptor_datastructures.$list152);
        return (SubLObject)rkf_salient_descriptor_datastructures.NIL;
    }
    
    public static SubLObject setup_rkf_salient_descriptor_datastructures_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_salient_descriptor_datastructures.$dtp_rkf_salient_descriptor_prompter$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_salient_descriptor_datastructures.$sym7$RKF_SALIENT_DESCRIPTOR_PROMPTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_salient_descriptor_datastructures.$list8);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym9$RKF_SD_PROMPTER_SEED_TERM, (SubLObject)rkf_salient_descriptor_datastructures.$sym10$_CSETF_RKF_SD_PROMPTER_SEED_TERM);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym11$RKF_SD_PROMPTER_MT, (SubLObject)rkf_salient_descriptor_datastructures.$sym12$_CSETF_RKF_SD_PROMPTER_MT);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym13$RKF_SD_PROMPTER_USED_PROMPTS, (SubLObject)rkf_salient_descriptor_datastructures.$sym14$_CSETF_RKF_SD_PROMPTER_USED_PROMPTS);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym15$RKF_SD_PROMPTER_UNUSED_PROMPTS, (SubLObject)rkf_salient_descriptor_datastructures.$sym16$_CSETF_RKF_SD_PROMPTER_UNUSED_PROMPTS);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym17$RKF_SD_PROMPTER_TACTICS, (SubLObject)rkf_salient_descriptor_datastructures.$sym18$_CSETF_RKF_SD_PROMPTER_TACTICS);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym19$RKF_SD_PROMPTER_ISG, (SubLObject)rkf_salient_descriptor_datastructures.$sym20$_CSETF_RKF_SD_PROMPTER_ISG);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym21$RKF_SD_PROMPTER_PLIST, (SubLObject)rkf_salient_descriptor_datastructures.$sym22$_CSETF_RKF_SD_PROMPTER_PLIST);
        Equality.identity((SubLObject)rkf_salient_descriptor_datastructures.$sym0$RKF_SALIENT_DESCRIPTOR_PROMPTER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_salient_descriptor_datastructures.$dtp_rkf_salient_descriptor_prompter$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_salient_descriptor_datastructures.$sym35$VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPTER_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_salient_descriptor_datastructures.$dtp_rkf_salient_descriptor_prompt$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_salient_descriptor_datastructures.$sym49$RKF_SALIENT_DESCRIPTOR_PROMPT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_salient_descriptor_datastructures.$list50);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym51$RKF_SD_PROMPT_ID, (SubLObject)rkf_salient_descriptor_datastructures.$sym52$_CSETF_RKF_SD_PROMPT_ID);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym53$RKF_SD_PROMPT_SUBPROMPTS, (SubLObject)rkf_salient_descriptor_datastructures.$sym54$_CSETF_RKF_SD_PROMPT_SUBPROMPTS);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym55$RKF_SD_PROMPT_FORMULA, (SubLObject)rkf_salient_descriptor_datastructures.$sym56$_CSETF_RKF_SD_PROMPT_FORMULA);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym57$RKF_SD_PROMPT_JUSTIFICATION, (SubLObject)rkf_salient_descriptor_datastructures.$sym58$_CSETF_RKF_SD_PROMPT_JUSTIFICATION);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym59$RKF_SD_PROMPT_DEDUCIBLE_CNFS, (SubLObject)rkf_salient_descriptor_datastructures.$sym60$_CSETF_RKF_SD_PROMPT_DEDUCIBLE_CNFS);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym61$RKF_SD_PROMPT_EXAMPLES, (SubLObject)rkf_salient_descriptor_datastructures.$sym62$_CSETF_RKF_SD_PROMPT_EXAMPLES);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym63$RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE, (SubLObject)rkf_salient_descriptor_datastructures.$sym64$_CSETF_RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym65$RKF_SD_PROMPT_PROMPTER, (SubLObject)rkf_salient_descriptor_datastructures.$sym66$_CSETF_RKF_SD_PROMPT_PROMPTER);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym67$RKF_SD_PROMPT_TACTIC, (SubLObject)rkf_salient_descriptor_datastructures.$sym68$_CSETF_RKF_SD_PROMPT_TACTIC);
        Equality.identity((SubLObject)rkf_salient_descriptor_datastructures.$sym42$RKF_SALIENT_DESCRIPTOR_PROMPT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_salient_descriptor_datastructures.$dtp_rkf_salient_descriptor_prompt$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_salient_descriptor_datastructures.$sym79$VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_salient_descriptor_datastructures.$dtp_rkf_sd_rule_info_score$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_salient_descriptor_datastructures.$sym93$RKF_SD_RULE_INFO_SCORE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_salient_descriptor_datastructures.$list94);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym95$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_, (SubLObject)rkf_salient_descriptor_datastructures.$sym96$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym97$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_, (SubLObject)rkf_salient_descriptor_datastructures.$sym98$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym99$RKF_SD_RULE_INFO_SCORE_VAR_COUNT, (SubLObject)rkf_salient_descriptor_datastructures.$sym100$_CSETF_RKF_SD_RULE_INFO_SCORE_VAR_COUNT);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym101$RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT, (SubLObject)rkf_salient_descriptor_datastructures.$sym102$_CSETF_RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym103$RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT, (SubLObject)rkf_salient_descriptor_datastructures.$sym104$_CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym105$RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE, (SubLObject)rkf_salient_descriptor_datastructures.$sym106$_CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym107$RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE, (SubLObject)rkf_salient_descriptor_datastructures.$sym108$_CSETF_RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym109$RKF_SD_RULE_INFO_SCORE_PLIST, (SubLObject)rkf_salient_descriptor_datastructures.$sym110$_CSETF_RKF_SD_RULE_INFO_SCORE_PLIST);
        Equality.identity((SubLObject)rkf_salient_descriptor_datastructures.$sym86$RKF_SD_RULE_INFO_SCORE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_salient_descriptor_datastructures.$dtp_rkf_sd_rule_info_score$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_salient_descriptor_datastructures.$sym119$VISIT_DEFSTRUCT_OBJECT_RKF_SD_RULE_INFO_SCORE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_salient_descriptor_datastructures.$dtp_rkf_sd_example$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_salient_descriptor_datastructures.$sym136$RKF_SD_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_salient_descriptor_datastructures.$list137);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym138$RKF_SD_EXAMPLE_TYPE, (SubLObject)rkf_salient_descriptor_datastructures.$sym139$_CSETF_RKF_SD_EXAMPLE_TYPE);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym140$RKF_SD_EXAMPLE_TERM, (SubLObject)rkf_salient_descriptor_datastructures.$sym141$_CSETF_RKF_SD_EXAMPLE_TERM);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym142$RKF_SD_EXAMPLE_SUPPORTS, (SubLObject)rkf_salient_descriptor_datastructures.$sym143$_CSETF_RKF_SD_EXAMPLE_SUPPORTS);
        Structures.def_csetf((SubLObject)rkf_salient_descriptor_datastructures.$sym144$RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG, (SubLObject)rkf_salient_descriptor_datastructures.$sym145$_CSETF_RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG);
        Equality.identity((SubLObject)rkf_salient_descriptor_datastructures.$sym129$RKF_SD_EXAMPLE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_salient_descriptor_datastructures.$dtp_rkf_sd_example$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_salient_descriptor_datastructures.$sym151$VISIT_DEFSTRUCT_OBJECT_RKF_SD_EXAMPLE_METHOD));
        return (SubLObject)rkf_salient_descriptor_datastructures.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_salient_descriptor_datastructures_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_salient_descriptor_datastructures_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_salient_descriptor_datastructures_file();
    }
    
    static {
        me = (SubLFile)new rkf_salient_descriptor_datastructures();
        rkf_salient_descriptor_datastructures.$dtp_rkf_salient_descriptor_prompter$ = null;
        rkf_salient_descriptor_datastructures.$dtp_rkf_salient_descriptor_prompt$ = null;
        rkf_salient_descriptor_datastructures.$dtp_rkf_sd_rule_info_score$ = null;
        rkf_salient_descriptor_datastructures.$dtp_rkf_sd_example$ = null;
        rkf_salient_descriptor_datastructures.$rkf_sd_example_types$ = null;
        $sym0$RKF_SALIENT_DESCRIPTOR_PROMPTER = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER");
        $sym1$RKF_SALIENT_DESCRIPTOR_PROMPTER_P = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEED-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("USED-PROMPTS"), (SubLObject)SubLObjectFactory.makeSymbol("UNUSED-PROMPTS"), (SubLObject)SubLObjectFactory.makeSymbol("TACTICS"), (SubLObject)SubLObjectFactory.makeSymbol("ISG"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SEED-TERM"), (SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("USED-PROMPTS"), (SubLObject)SubLObjectFactory.makeKeyword("UNUSED-PROMPTS"), (SubLObject)SubLObjectFactory.makeKeyword("TACTICS"), (SubLObject)SubLObjectFactory.makeKeyword("ISG"), (SubLObject)SubLObjectFactory.makeKeyword("PLIST"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-SEED-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-MT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-USED-PROMPTS"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-UNUSED-PROMPTS"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-TACTICS"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-ISG"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-PLIST"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPTER-SEED-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPTER-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPTER-USED-PROMPTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPTER-UNUSED-PROMPTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPTER-TACTICS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPTER-ISG"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPTER-PLIST"));
        $sym6$PRINT_RKF_SD_PROMPTER = SubLObjectFactory.makeSymbol("PRINT-RKF-SD-PROMPTER");
        $sym7$RKF_SALIENT_DESCRIPTOR_PROMPTER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER-P"));
        $sym9$RKF_SD_PROMPTER_SEED_TERM = SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-SEED-TERM");
        $sym10$_CSETF_RKF_SD_PROMPTER_SEED_TERM = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPTER-SEED-TERM");
        $sym11$RKF_SD_PROMPTER_MT = SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-MT");
        $sym12$_CSETF_RKF_SD_PROMPTER_MT = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPTER-MT");
        $sym13$RKF_SD_PROMPTER_USED_PROMPTS = SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-USED-PROMPTS");
        $sym14$_CSETF_RKF_SD_PROMPTER_USED_PROMPTS = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPTER-USED-PROMPTS");
        $sym15$RKF_SD_PROMPTER_UNUSED_PROMPTS = SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-UNUSED-PROMPTS");
        $sym16$_CSETF_RKF_SD_PROMPTER_UNUSED_PROMPTS = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPTER-UNUSED-PROMPTS");
        $sym17$RKF_SD_PROMPTER_TACTICS = SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-TACTICS");
        $sym18$_CSETF_RKF_SD_PROMPTER_TACTICS = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPTER-TACTICS");
        $sym19$RKF_SD_PROMPTER_ISG = SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-ISG");
        $sym20$_CSETF_RKF_SD_PROMPTER_ISG = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPTER-ISG");
        $sym21$RKF_SD_PROMPTER_PLIST = SubLObjectFactory.makeSymbol("RKF-SD-PROMPTER-PLIST");
        $sym22$_CSETF_RKF_SD_PROMPTER_PLIST = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPTER-PLIST");
        $kw23$SEED_TERM = SubLObjectFactory.makeKeyword("SEED-TERM");
        $kw24$MT = SubLObjectFactory.makeKeyword("MT");
        $kw25$USED_PROMPTS = SubLObjectFactory.makeKeyword("USED-PROMPTS");
        $kw26$UNUSED_PROMPTS = SubLObjectFactory.makeKeyword("UNUSED-PROMPTS");
        $kw27$TACTICS = SubLObjectFactory.makeKeyword("TACTICS");
        $kw28$ISG = SubLObjectFactory.makeKeyword("ISG");
        $kw29$PLIST = SubLObjectFactory.makeKeyword("PLIST");
        $str30$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw31$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym32$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPTER = SubLObjectFactory.makeSymbol("MAKE-RKF-SALIENT-DESCRIPTOR-PROMPTER");
        $kw33$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw34$END = SubLObjectFactory.makeKeyword("END");
        $sym35$VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPTER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RKF-SALIENT-DESCRIPTOR-PROMPTER-METHOD");
        $str36$_RKF_SD_PROMPTER__S__S___D_prompt = SubLObjectFactory.makeString("<RKF-SD-PROMPTER ~S ~S (~D prompts)>");
        $kw37$MEMOIZATION_STATE = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE");
        $str38$Salient_Descriptor_Prompter_Lock = SubLObjectFactory.makeString("Salient Descriptor Prompter Lock");
        $kw39$LOCK = SubLObjectFactory.makeKeyword("LOCK");
        $kw40$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw41$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $sym42$RKF_SALIENT_DESCRIPTOR_PROMPT = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPT");
        $sym43$RKF_SALIENT_DESCRIPTOR_PROMPT_P = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPT-P");
        $list44 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("SUBPROMPTS"), SubLObjectFactory.makeSymbol("FORMULA"), SubLObjectFactory.makeSymbol("JUSTIFICATION"), SubLObjectFactory.makeSymbol("DEDUCIBLE-CNFS"), SubLObjectFactory.makeSymbol("EXAMPLES"), SubLObjectFactory.makeSymbol("SALIENT-PROPERTY-SENTENCE"), SubLObjectFactory.makeSymbol("PROMPTER"), SubLObjectFactory.makeSymbol("TACTIC") });
        $list45 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("SUBPROMPTS"), SubLObjectFactory.makeKeyword("FORMULA"), SubLObjectFactory.makeKeyword("JUSTIFICATION"), SubLObjectFactory.makeKeyword("DEDUCIBLE-CNFS"), SubLObjectFactory.makeKeyword("EXAMPLES"), SubLObjectFactory.makeKeyword("SALIENT-PROPERTY-SENTENCE"), SubLObjectFactory.makeKeyword("PROMPTER"), SubLObjectFactory.makeKeyword("TACTIC") });
        $list46 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-ID"), SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-SUBPROMPTS"), SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-FORMULA"), SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-JUSTIFICATION"), SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-DEDUCIBLE-CNFS"), SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-EXAMPLES"), SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE"), SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-PROMPTER"), SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-TACTIC") });
        $list47 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-ID"), SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-SUBPROMPTS"), SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-FORMULA"), SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-JUSTIFICATION"), SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-DEDUCIBLE-CNFS"), SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-EXAMPLES"), SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE"), SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-PROMPTER"), SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-TACTIC") });
        $sym48$PRINT_RKF_SD_PROMPT = SubLObjectFactory.makeSymbol("PRINT-RKF-SD-PROMPT");
        $sym49$RKF_SALIENT_DESCRIPTOR_PROMPT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPT-PRINT-FUNCTION-TRAMPOLINE");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPT-P"));
        $sym51$RKF_SD_PROMPT_ID = SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-ID");
        $sym52$_CSETF_RKF_SD_PROMPT_ID = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-ID");
        $sym53$RKF_SD_PROMPT_SUBPROMPTS = SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-SUBPROMPTS");
        $sym54$_CSETF_RKF_SD_PROMPT_SUBPROMPTS = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-SUBPROMPTS");
        $sym55$RKF_SD_PROMPT_FORMULA = SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-FORMULA");
        $sym56$_CSETF_RKF_SD_PROMPT_FORMULA = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-FORMULA");
        $sym57$RKF_SD_PROMPT_JUSTIFICATION = SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-JUSTIFICATION");
        $sym58$_CSETF_RKF_SD_PROMPT_JUSTIFICATION = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-JUSTIFICATION");
        $sym59$RKF_SD_PROMPT_DEDUCIBLE_CNFS = SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-DEDUCIBLE-CNFS");
        $sym60$_CSETF_RKF_SD_PROMPT_DEDUCIBLE_CNFS = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-DEDUCIBLE-CNFS");
        $sym61$RKF_SD_PROMPT_EXAMPLES = SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-EXAMPLES");
        $sym62$_CSETF_RKF_SD_PROMPT_EXAMPLES = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-EXAMPLES");
        $sym63$RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE = SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE");
        $sym64$_CSETF_RKF_SD_PROMPT_SALIENT_PROPERTY_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-SALIENT-PROPERTY-SENTENCE");
        $sym65$RKF_SD_PROMPT_PROMPTER = SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-PROMPTER");
        $sym66$_CSETF_RKF_SD_PROMPT_PROMPTER = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-PROMPTER");
        $sym67$RKF_SD_PROMPT_TACTIC = SubLObjectFactory.makeSymbol("RKF-SD-PROMPT-TACTIC");
        $sym68$_CSETF_RKF_SD_PROMPT_TACTIC = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-PROMPT-TACTIC");
        $kw69$ID = SubLObjectFactory.makeKeyword("ID");
        $kw70$SUBPROMPTS = SubLObjectFactory.makeKeyword("SUBPROMPTS");
        $kw71$FORMULA = SubLObjectFactory.makeKeyword("FORMULA");
        $kw72$JUSTIFICATION = SubLObjectFactory.makeKeyword("JUSTIFICATION");
        $kw73$DEDUCIBLE_CNFS = SubLObjectFactory.makeKeyword("DEDUCIBLE-CNFS");
        $kw74$EXAMPLES = SubLObjectFactory.makeKeyword("EXAMPLES");
        $kw75$SALIENT_PROPERTY_SENTENCE = SubLObjectFactory.makeKeyword("SALIENT-PROPERTY-SENTENCE");
        $kw76$PROMPTER = SubLObjectFactory.makeKeyword("PROMPTER");
        $kw77$TACTIC = SubLObjectFactory.makeKeyword("TACTIC");
        $sym78$MAKE_RKF_SALIENT_DESCRIPTOR_PROMPT = SubLObjectFactory.makeSymbol("MAKE-RKF-SALIENT-DESCRIPTOR-PROMPT");
        $sym79$VISIT_DEFSTRUCT_OBJECT_RKF_SALIENT_DESCRIPTOR_PROMPT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RKF-SALIENT-DESCRIPTOR-PROMPT-METHOD");
        $str80$_RKF_SD_PROMPT_Subprompts___S_ = SubLObjectFactory.makeString("<RKF-SD-PROMPT Subprompts: ~S ");
        $str81$Formula___S_ = SubLObjectFactory.makeString("Formula: ~S ");
        $str82$Deducible_CNFs___S_ = SubLObjectFactory.makeString("Deducible CNFs: ~S>");
        $kw83$CHOICE = SubLObjectFactory.makeKeyword("CHOICE");
        $kw84$SPECIFY = SubLObjectFactory.makeKeyword("SPECIFY");
        $kw85$CONFIRM = SubLObjectFactory.makeKeyword("CONFIRM");
        $sym86$RKF_SD_RULE_INFO_SCORE = SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE");
        $sym87$RKF_SD_RULE_INFO_SCORE_P = SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-P");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEED-TERM-IN-POS-LITS?"), (SubLObject)SubLObjectFactory.makeSymbol("SEED-TERM-IN-NEG-LITS?"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("NEG-LIT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LIT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LIT-QUALITY-SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("MT-GENERALITY-SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"));
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SEED-TERM-IN-POS-LITS?"), (SubLObject)SubLObjectFactory.makeKeyword("SEED-TERM-IN-NEG-LITS?"), (SubLObject)SubLObjectFactory.makeKeyword("VAR-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("NEG-LIT-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("POS-LIT-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("POS-LIT-QUALITY-SCORE"), (SubLObject)SubLObjectFactory.makeKeyword("MT-GENERALITY-SCORE"), (SubLObject)SubLObjectFactory.makeKeyword("PLIST"));
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-VAR-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-PLIST"));
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-VAR-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-PLIST"));
        $sym92$PRINT_RKF_SD_RULE_INFO_SCORE = SubLObjectFactory.makeSymbol("PRINT-RKF-SD-RULE-INFO-SCORE");
        $sym93$RKF_SD_RULE_INFO_SCORE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-PRINT-FUNCTION-TRAMPOLINE");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-P"));
        $sym95$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_ = SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?");
        $sym96$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_POS_LITS_ = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-POS-LITS?");
        $sym97$RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_ = SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?");
        $sym98$_CSETF_RKF_SD_RULE_INFO_SCORE_SEED_TERM_IN_NEG_LITS_ = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-SEED-TERM-IN-NEG-LITS?");
        $sym99$RKF_SD_RULE_INFO_SCORE_VAR_COUNT = SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-VAR-COUNT");
        $sym100$_CSETF_RKF_SD_RULE_INFO_SCORE_VAR_COUNT = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-VAR-COUNT");
        $sym101$RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT = SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT");
        $sym102$_CSETF_RKF_SD_RULE_INFO_SCORE_NEG_LIT_COUNT = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-NEG-LIT-COUNT");
        $sym103$RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT = SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT");
        $sym104$_CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_COUNT = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-COUNT");
        $sym105$RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE = SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE");
        $sym106$_CSETF_RKF_SD_RULE_INFO_SCORE_POS_LIT_QUALITY_SCORE = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-POS-LIT-QUALITY-SCORE");
        $sym107$RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE = SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE");
        $sym108$_CSETF_RKF_SD_RULE_INFO_SCORE_MT_GENERALITY_SCORE = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-MT-GENERALITY-SCORE");
        $sym109$RKF_SD_RULE_INFO_SCORE_PLIST = SubLObjectFactory.makeSymbol("RKF-SD-RULE-INFO-SCORE-PLIST");
        $sym110$_CSETF_RKF_SD_RULE_INFO_SCORE_PLIST = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-RULE-INFO-SCORE-PLIST");
        $kw111$SEED_TERM_IN_POS_LITS_ = SubLObjectFactory.makeKeyword("SEED-TERM-IN-POS-LITS?");
        $kw112$SEED_TERM_IN_NEG_LITS_ = SubLObjectFactory.makeKeyword("SEED-TERM-IN-NEG-LITS?");
        $kw113$VAR_COUNT = SubLObjectFactory.makeKeyword("VAR-COUNT");
        $kw114$NEG_LIT_COUNT = SubLObjectFactory.makeKeyword("NEG-LIT-COUNT");
        $kw115$POS_LIT_COUNT = SubLObjectFactory.makeKeyword("POS-LIT-COUNT");
        $kw116$POS_LIT_QUALITY_SCORE = SubLObjectFactory.makeKeyword("POS-LIT-QUALITY-SCORE");
        $kw117$MT_GENERALITY_SCORE = SubLObjectFactory.makeKeyword("MT-GENERALITY-SCORE");
        $sym118$MAKE_RKF_SD_RULE_INFO_SCORE = SubLObjectFactory.makeSymbol("MAKE-RKF-SD-RULE-INFO-SCORE");
        $sym119$VISIT_DEFSTRUCT_OBJECT_RKF_SD_RULE_INFO_SCORE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RKF-SD-RULE-INFO-SCORE-METHOD");
        $str120$_RKF_SD_SCORE = SubLObjectFactory.makeString("<RKF-SD-SCORE");
        $str121$_neg__S = SubLObjectFactory.makeString(" neg:~S");
        $str122$_pos__S = SubLObjectFactory.makeString(" pos:~S");
        $str123$_vars__S = SubLObjectFactory.makeString(" vars:~S");
        $str124$_nlc__S = SubLObjectFactory.makeString(" nlc:~S");
        $str125$_plc__S = SubLObjectFactory.makeString(" plc:~S");
        $str126$_plq__S = SubLObjectFactory.makeString(" plq:~S");
        $str127$_mtg__S = SubLObjectFactory.makeString(" mtg:~S");
        $str128$_ = SubLObjectFactory.makeString(">");
        $sym129$RKF_SD_EXAMPLE = SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLE");
        $sym130$RKF_SD_EXAMPLE_P = SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLE-P");
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TERM-ANALOG"));
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("FOCUS-TERM-ANALOG"));
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLE-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLE-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG"));
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-EXAMPLE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-EXAMPLE-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-EXAMPLE-SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG"));
        $sym135$PRINT_RKF_SD_EXAMPLE = SubLObjectFactory.makeSymbol("PRINT-RKF-SD-EXAMPLE");
        $sym136$RKF_SD_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLE-PRINT-FUNCTION-TRAMPOLINE");
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLE-P"));
        $sym138$RKF_SD_EXAMPLE_TYPE = SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLE-TYPE");
        $sym139$_CSETF_RKF_SD_EXAMPLE_TYPE = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-EXAMPLE-TYPE");
        $sym140$RKF_SD_EXAMPLE_TERM = SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLE-TERM");
        $sym141$_CSETF_RKF_SD_EXAMPLE_TERM = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-EXAMPLE-TERM");
        $sym142$RKF_SD_EXAMPLE_SUPPORTS = SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLE-SUPPORTS");
        $sym143$_CSETF_RKF_SD_EXAMPLE_SUPPORTS = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-EXAMPLE-SUPPORTS");
        $sym144$RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG = SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG");
        $sym145$_CSETF_RKF_SD_EXAMPLE_FOCUS_TERM_ANALOG = SubLObjectFactory.makeSymbol("_CSETF-RKF-SD-EXAMPLE-FOCUS-TERM-ANALOG");
        $kw146$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw147$TERM = SubLObjectFactory.makeKeyword("TERM");
        $kw148$SUPPORTS = SubLObjectFactory.makeKeyword("SUPPORTS");
        $kw149$FOCUS_TERM_ANALOG = SubLObjectFactory.makeKeyword("FOCUS-TERM-ANALOG");
        $sym150$MAKE_RKF_SD_EXAMPLE = SubLObjectFactory.makeSymbol("MAKE-RKF-SD-EXAMPLE");
        $sym151$VISIT_DEFSTRUCT_OBJECT_RKF_SD_EXAMPLE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RKF-SD-EXAMPLE-METHOD");
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRECEDENT"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINT-MATCHER"));
        $sym153$RKF_SD_EXAMPLE_TYPE_P = SubLObjectFactory.makeSymbol("RKF-SD-EXAMPLE-TYPE-P");
        $list154 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TERM-ANALOG")), (SubLObject)SubLObjectFactory.makeSymbol("EXAMPLE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym155$CLET = SubLObjectFactory.makeSymbol("CLET");
        $str156$_RKF_SD__A_EXAMPLE__S = SubLObjectFactory.makeString("<RKF-SD-~A-EXAMPLE ~S");
        $kw157$PRECEDENT = SubLObjectFactory.makeKeyword("PRECEDENT");
        $str158$__S = SubLObjectFactory.makeString(" ~S");
    }
    
    public static final class $rkf_salient_descriptor_prompter_native extends SubLStructNative
    {
        public SubLObject $seed_term;
        public SubLObject $mt;
        public SubLObject $used_prompts;
        public SubLObject $unused_prompts;
        public SubLObject $tactics;
        public SubLObject $isg;
        public SubLObject $plist;
        private static final SubLStructDeclNative structDecl;
        
        public $rkf_salient_descriptor_prompter_native() {
            this.$seed_term = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$used_prompts = (SubLObject)CommonSymbols.NIL;
            this.$unused_prompts = (SubLObject)CommonSymbols.NIL;
            this.$tactics = (SubLObject)CommonSymbols.NIL;
            this.$isg = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rkf_salient_descriptor_prompter_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$seed_term;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$mt;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$used_prompts;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$unused_prompts;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$tactics;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$isg;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$plist;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$seed_term = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$mt = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$used_prompts = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$unused_prompts = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$tactics = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$isg = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rkf_salient_descriptor_prompter_native.class, rkf_salient_descriptor_datastructures.$sym0$RKF_SALIENT_DESCRIPTOR_PROMPTER, rkf_salient_descriptor_datastructures.$sym1$RKF_SALIENT_DESCRIPTOR_PROMPTER_P, rkf_salient_descriptor_datastructures.$list2, rkf_salient_descriptor_datastructures.$list3, new String[] { "$seed_term", "$mt", "$used_prompts", "$unused_prompts", "$tactics", "$isg", "$plist" }, rkf_salient_descriptor_datastructures.$list4, rkf_salient_descriptor_datastructures.$list5, rkf_salient_descriptor_datastructures.$sym6$PRINT_RKF_SD_PROMPTER);
        }
    }
    
    public static final class $rkf_salient_descriptor_prompter_p$UnaryFunction extends UnaryFunction
    {
        public $rkf_salient_descriptor_prompter_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RKF-SALIENT-DESCRIPTOR-PROMPTER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompter_p(arg1);
        }
    }
    
    public static final class $rkf_salient_descriptor_prompt_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $subprompts;
        public SubLObject $formula;
        public SubLObject $justification;
        public SubLObject $deducible_cnfs;
        public SubLObject $examples;
        public SubLObject $salient_property_sentence;
        public SubLObject $prompter;
        public SubLObject $tactic;
        private static final SubLStructDeclNative structDecl;
        
        public $rkf_salient_descriptor_prompt_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$subprompts = (SubLObject)CommonSymbols.NIL;
            this.$formula = (SubLObject)CommonSymbols.NIL;
            this.$justification = (SubLObject)CommonSymbols.NIL;
            this.$deducible_cnfs = (SubLObject)CommonSymbols.NIL;
            this.$examples = (SubLObject)CommonSymbols.NIL;
            this.$salient_property_sentence = (SubLObject)CommonSymbols.NIL;
            this.$prompter = (SubLObject)CommonSymbols.NIL;
            this.$tactic = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rkf_salient_descriptor_prompt_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$subprompts;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$formula;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$justification;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$deducible_cnfs;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$examples;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$salient_property_sentence;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$prompter;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$tactic;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$subprompts = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$formula = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$justification = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$deducible_cnfs = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$examples = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$salient_property_sentence = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$prompter = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$tactic = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rkf_salient_descriptor_prompt_native.class, rkf_salient_descriptor_datastructures.$sym42$RKF_SALIENT_DESCRIPTOR_PROMPT, rkf_salient_descriptor_datastructures.$sym43$RKF_SALIENT_DESCRIPTOR_PROMPT_P, rkf_salient_descriptor_datastructures.$list44, rkf_salient_descriptor_datastructures.$list45, new String[] { "$id", "$subprompts", "$formula", "$justification", "$deducible_cnfs", "$examples", "$salient_property_sentence", "$prompter", "$tactic" }, rkf_salient_descriptor_datastructures.$list46, rkf_salient_descriptor_datastructures.$list47, rkf_salient_descriptor_datastructures.$sym48$PRINT_RKF_SD_PROMPT);
        }
    }
    
    public static final class $rkf_salient_descriptor_prompt_p$UnaryFunction extends UnaryFunction
    {
        public $rkf_salient_descriptor_prompt_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RKF-SALIENT-DESCRIPTOR-PROMPT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_salient_descriptor_datastructures.rkf_salient_descriptor_prompt_p(arg1);
        }
    }
    
    public static final class $rkf_sd_rule_info_score_native extends SubLStructNative
    {
        public SubLObject $seed_term_in_pos_litsP;
        public SubLObject $seed_term_in_neg_litsP;
        public SubLObject $var_count;
        public SubLObject $neg_lit_count;
        public SubLObject $pos_lit_count;
        public SubLObject $pos_lit_quality_score;
        public SubLObject $mt_generality_score;
        public SubLObject $plist;
        private static final SubLStructDeclNative structDecl;
        
        public $rkf_sd_rule_info_score_native() {
            this.$seed_term_in_pos_litsP = (SubLObject)CommonSymbols.NIL;
            this.$seed_term_in_neg_litsP = (SubLObject)CommonSymbols.NIL;
            this.$var_count = (SubLObject)CommonSymbols.NIL;
            this.$neg_lit_count = (SubLObject)CommonSymbols.NIL;
            this.$pos_lit_count = (SubLObject)CommonSymbols.NIL;
            this.$pos_lit_quality_score = (SubLObject)CommonSymbols.NIL;
            this.$mt_generality_score = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rkf_sd_rule_info_score_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$seed_term_in_pos_litsP;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$seed_term_in_neg_litsP;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$var_count;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$neg_lit_count;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$pos_lit_count;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$pos_lit_quality_score;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$mt_generality_score;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$plist;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$seed_term_in_pos_litsP = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$seed_term_in_neg_litsP = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$var_count = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$neg_lit_count = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$pos_lit_count = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$pos_lit_quality_score = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$mt_generality_score = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rkf_sd_rule_info_score_native.class, rkf_salient_descriptor_datastructures.$sym86$RKF_SD_RULE_INFO_SCORE, rkf_salient_descriptor_datastructures.$sym87$RKF_SD_RULE_INFO_SCORE_P, rkf_salient_descriptor_datastructures.$list88, rkf_salient_descriptor_datastructures.$list89, new String[] { "$seed_term_in_pos_litsP", "$seed_term_in_neg_litsP", "$var_count", "$neg_lit_count", "$pos_lit_count", "$pos_lit_quality_score", "$mt_generality_score", "$plist" }, rkf_salient_descriptor_datastructures.$list90, rkf_salient_descriptor_datastructures.$list91, rkf_salient_descriptor_datastructures.$sym92$PRINT_RKF_SD_RULE_INFO_SCORE);
        }
    }
    
    public static final class $rkf_sd_rule_info_score_p$UnaryFunction extends UnaryFunction
    {
        public $rkf_sd_rule_info_score_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RKF-SD-RULE-INFO-SCORE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_salient_descriptor_datastructures.rkf_sd_rule_info_score_p(arg1);
        }
    }
    
    public static final class $rkf_sd_example_native extends SubLStructNative
    {
        public SubLObject $type;
        public SubLObject $term;
        public SubLObject $supports;
        public SubLObject $focus_term_analog;
        private static final SubLStructDeclNative structDecl;
        
        public $rkf_sd_example_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$term = (SubLObject)CommonSymbols.NIL;
            this.$supports = (SubLObject)CommonSymbols.NIL;
            this.$focus_term_analog = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rkf_sd_example_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$type;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$term;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$supports;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$focus_term_analog;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$term = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$supports = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$focus_term_analog = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rkf_sd_example_native.class, rkf_salient_descriptor_datastructures.$sym129$RKF_SD_EXAMPLE, rkf_salient_descriptor_datastructures.$sym130$RKF_SD_EXAMPLE_P, rkf_salient_descriptor_datastructures.$list131, rkf_salient_descriptor_datastructures.$list132, new String[] { "$type", "$term", "$supports", "$focus_term_analog" }, rkf_salient_descriptor_datastructures.$list133, rkf_salient_descriptor_datastructures.$list134, rkf_salient_descriptor_datastructures.$sym135$PRINT_RKF_SD_EXAMPLE);
        }
    }
    
    public static final class $rkf_sd_example_p$UnaryFunction extends UnaryFunction
    {
        public $rkf_sd_example_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RKF-SD-EXAMPLE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_salient_descriptor_datastructures.rkf_sd_example_p(arg1);
        }
    }
}

/*

	Total time: 295 ms
	
*/