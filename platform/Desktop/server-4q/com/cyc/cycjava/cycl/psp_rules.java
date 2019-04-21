package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class psp_rules extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.psp_rules";
    public static final String myFingerPrint = "51ac9eadd0ee15bd9a92503f9ab276f9adc213a54045420746ce0e6e34b2e1f8";
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLSymbol $dtp_phrase_structure_parser_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2639L)
    private static SubLSymbol $psp_rules$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 7292L)
    private static SubLSymbol $psp_rule_fort_weights$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 8190L)
    public static SubLSymbol $psp_rule_arity_weight$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 10983L)
    private static SubLSymbol $psp_traced_rules$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 16247L)
    private static SubLSymbol $psp_syntactic_constraint_types$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 16927L)
    private static SubLSymbol $psp_semantic_constraint_types$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 17483L)
    private static SubLSymbol $psp_cycl_fails_constraintP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 19573L)
    private static SubLSymbol $psp_phrase_types_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 23540L)
    private static SubLSymbol $psp_sub_categories_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24592L)
    private static SubLSymbol $psp_sub_pos_preds_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24946L)
    private static SubLSymbol $psp_frame_type_instances_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25245L)
    private static SubLSymbol $psp_rewrite_caching_state$;
    private static final SubLSymbol $sym0$PHRASE_STRUCTURE_PARSER_RULE;
    private static final SubLSymbol $sym1$PHRASE_STRUCTURE_PARSER_RULE_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PPRINT_PSP_RULE;
    private static final SubLSymbol $sym7$PHRASE_STRUCTURE_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$PSP_RULE_FORT;
    private static final SubLSymbol $sym10$_CSETF_PSP_RULE_FORT;
    private static final SubLSymbol $sym11$PSP_RULE_ARITY;
    private static final SubLSymbol $sym12$_CSETF_PSP_RULE_ARITY;
    private static final SubLSymbol $sym13$PSP_RULE_CATEGORY;
    private static final SubLSymbol $sym14$_CSETF_PSP_RULE_CATEGORY;
    private static final SubLSymbol $sym15$PSP_RULE_HEAD;
    private static final SubLSymbol $sym16$_CSETF_PSP_RULE_HEAD;
    private static final SubLSymbol $sym17$PSP_RULE_CONSTRAINTS;
    private static final SubLSymbol $sym18$_CSETF_PSP_RULE_CONSTRAINTS;
    private static final SubLSymbol $sym19$PSP_RULE_SEMX;
    private static final SubLSymbol $sym20$_CSETF_PSP_RULE_SEMX;
    private static final SubLSymbol $sym21$PSP_RULE_WEIGHT;
    private static final SubLSymbol $sym22$_CSETF_PSP_RULE_WEIGHT;
    private static final SubLSymbol $kw23$FORT;
    private static final SubLSymbol $kw24$ARITY;
    private static final SubLSymbol $kw25$CATEGORY;
    private static final SubLSymbol $kw26$HEAD;
    private static final SubLSymbol $kw27$CONSTRAINTS;
    private static final SubLSymbol $kw28$SEMX;
    private static final SubLSymbol $kw29$WEIGHT;
    private static final SubLString $str30$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw31$BEGIN;
    private static final SubLSymbol $sym32$MAKE_PHRASE_STRUCTURE_PARSER_RULE;
    private static final SubLSymbol $kw33$SLOT;
    private static final SubLSymbol $kw34$END;
    private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_RULE_METHOD;
    private static final SubLString $str36$__PSP_RULE___S_;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$CDESTRUCTURING_BIND;
    private static final SubLInteger $int39$128;
    private static final SubLSymbol $sym40$ADD_PHRASE_STRUCTURE_RULE;
    private static final SubLSymbol $sym41$REMOVE_PHRASE_STRUCTURE_RULE;
    private static final SubLObject $const42$PhraseStructureRule;
    private static final SubLObject $const43$isa;
    private static final SubLSymbol $kw44$BREADTH;
    private static final SubLSymbol $kw45$QUEUE;
    private static final SubLSymbol $kw46$STACK;
    private static final SubLSymbol $sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw48$ERROR;
    private static final SubLString $str49$_A_is_not_a__A;
    private static final SubLSymbol $sym50$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw51$CERROR;
    private static final SubLString $str52$continue_anyway;
    private static final SubLSymbol $kw53$WARN;
    private static final SubLString $str54$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str55$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str56$attempting_to_bind_direction_link;
    private static final SubLList $list57;
    private static final SubLString $str58$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $kw59$INITIALIZED;
    private static final SubLObject $const60$psRuleArity;
    private static final SubLObject $const61$psRuleCategory;
    private static final SubLObject $const62$psRuleSyntacticHeadDtr;
    private static final SubLObject $const63$psRuleConstraint;
    private static final SubLList $list64;
    private static final SubLSymbol $kw65$STORED;
    private static final SubLSymbol $sym66$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const67$EverythingPSC;
    private static final SubLObject $const68$psRuleSemanticsFromDtr;
    private static final SubLSymbol $kw69$IDENTITY;
    private static final SubLSymbol $kw70$TEMPLATE;
    private static final SubLObject $const71$psRuleTemplateDtr;
    private static final SubLSymbol $kw72$INSTANCE;
    private static final SubLObject $const73$PSBindingFn;
    private static final SubLSymbol $kw74$TYPE;
    private static final SubLObject $const75$PSBindingFn_TypeLevel;
    private static final SubLObject $const76$psRuleTemplateBindings;
    private static final SubLSymbol $kw77$NONE;
    private static final SubLObject $const78$PSRule_NounNounCompound;
    private static final SubLFloat $float79$0_5;
    private static final SubLObject $const80$PSRule_NameNounCompound;
    private static final SubLObject $const81$PSRule_AdjectiveNameCompound;
    private static final SubLObject $const82$PSRule_NameNameNounCompound;
    private static final SubLSymbol $sym83$PSP_RULE_FORT_WEIGHTS;
    private static final SubLString $str84$psRuleWeight;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLList $list87;
    private static final SubLFloat $float88$0_95;
    private static final SubLSymbol $kw89$INFINITE_RECURSION_RULE;
    private static final SubLList $list90;
    private static final SubLObject $const91$ConstituentTypeConstraintFn;
    private static final SubLObject $const92$POSPredConstraintFn;
    private static final SubLSymbol $kw93$FRAME;
    private static final SubLSymbol $kw94$STUB;
    private static final SubLSymbol $sym95$_PSP_TRACED_RULES_;
    private static final SubLSymbol $sym96$FORT_P;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$PWHEN;
    private static final SubLSymbol $sym99$PSP_TRACED_RULE_;
    private static final SubLSymbol $sym100$DO_PSP_TRACE_REPORT;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$FORMAT;
    private static final SubLString $str103$___S___meets_the_first_dtr_constr;
    private static final SubLSymbol $sym104$PSP_SEMANTIC_CONSTRAINT_;
    private static final SubLString $str105$___S____A_constraint__S___;
    private static final SubLString $str106$failed;
    private static final SubLString $str107$met;
    private static final SubLSymbol $kw108$LIST;
    private static final SubLSymbol $kw109$UNKNOWN;
    private static final SubLString $str110$___S___failed_constraint__S___S;
    private static final SubLSymbol $sym111$_PSP_SYNTACTIC_CONSTRAINT_TYPES_;
    private static final SubLObject $const112$PhraseStructureConstraint_Syntact;
    private static final SubLObject $const113$resultIsa;
    private static final SubLSymbol $sym114$_PSP_SEMANTIC_CONSTRAINT_TYPES_;
    private static final SubLObject $const115$PhraseStructureConstraint_Semanti;
    private static final SubLSymbol $sym116$PSP_CYCL_FAILS_CONSTRAINT_;
    private static final SubLList $list117;
    private static final SubLObject $const118$PSRuleIsaConstraintFn;
    private static final SubLObject $const119$PSRuleGenlsConstraintFn;
    private static final SubLSymbol $sym120$_PSP_CYCL_FAILS_CONSTRAINT__CACHING_STATE_;
    private static final SubLInteger $int121$256;
    private static final SubLSymbol $kw122$GAP;
    private static final SubLObject $const123$PrepositionalPhrase;
    private static final SubLObject $const124$DetNbarAgrConstraintFn;
    private static final SubLSymbol $sym125$PSP_PHRASE_TYPES;
    private static final SubLObject $const126$NLPhrase;
    private static final SubLSymbol $sym127$_PSP_PHRASE_TYPES_CACHING_STATE_;
    private static final SubLSymbol $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_;
    private static final SubLObject $const129$Preposition;
    private static final SubLList $list130;
    private static final SubLList $list131;
    private static final SubLObject $const132$Number_SP;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$GENL_POS_PRED_;
    private static final SubLSymbol $sym135$PSP_SUB_CATEGORIES;
    private static final SubLInteger $int136$32;
    private static final SubLSymbol $sym137$_PSP_SUB_CATEGORIES_CACHING_STATE_;
    private static final SubLSymbol $sym138$PSP_SUB_POS_PREDS;
    private static final SubLInteger $int139$64;
    private static final SubLSymbol $sym140$_PSP_SUB_POS_PREDS_CACHING_STATE_;
    private static final SubLSymbol $sym141$PSP_FRAME_TYPE_INSTANCES;
    private static final SubLSymbol $sym142$_PSP_FRAME_TYPE_INSTANCES_CACHING_STATE_;
    private static final SubLSymbol $sym143$PSP_REWRITE;
    private static final SubLObject $const144$rewriteOf;
    private static final SubLSymbol $sym145$_PSP_REWRITE_CACHING_STATE_;
    private static final SubLSymbol $sym146$PSP_ISA_;
    private static final SubLSymbol $sym147$PSP_GENL_;
    private static final SubLList $list148;
    private static final SubLSymbol $sym149$PSP_SPEC_CONST_CONSTRAINT_;
    private static final SubLSymbol $kw150$PASSIVE_WITH_BY;
    private static final SubLList $list151;
    private static final SubLObject $const152$NounPhrase;
    private static final SubLObject $const153$subcatFrameDependentConstraint;
    private static final SubLList $list154;
    private static final SubLObject $const155$PPCompFrameFn;
    private static final SubLObject $const156$TransitivePPFrameType;
    private static final SubLObject $const157$SubcollectionOfWithRelationToFn;
    private static final SubLObject $const158$NLWordForm;
    private static final SubLObject $const159$lexemeOfWordForm;
    private static final SubLObject $const160$DitransitivePPFrameType;
    private static final SubLList $list161;
    private static final SubLList $list162;
    private static final SubLSymbol $sym163$PSP_PARSE_TREE_FOR_EDGE;
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject phrase_structure_parser_rule_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_psp_rule(v_object, stream, (SubLObject)psp_rules.ZERO_INTEGER);
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject phrase_structure_parser_rule_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $phrase_structure_parser_rule_native.class) ? psp_rules.T : psp_rules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject psp_rule_fort(final SubLObject v_object) {
        assert psp_rules.NIL != phrase_structure_parser_rule_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject psp_rule_arity(final SubLObject v_object) {
        assert psp_rules.NIL != phrase_structure_parser_rule_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject psp_rule_category(final SubLObject v_object) {
        assert psp_rules.NIL != phrase_structure_parser_rule_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject psp_rule_head(final SubLObject v_object) {
        assert psp_rules.NIL != phrase_structure_parser_rule_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject psp_rule_constraints(final SubLObject v_object) {
        assert psp_rules.NIL != phrase_structure_parser_rule_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject psp_rule_semx(final SubLObject v_object) {
        assert psp_rules.NIL != phrase_structure_parser_rule_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject psp_rule_weight(final SubLObject v_object) {
        assert psp_rules.NIL != phrase_structure_parser_rule_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject _csetf_psp_rule_fort(final SubLObject v_object, final SubLObject value) {
        assert psp_rules.NIL != phrase_structure_parser_rule_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject _csetf_psp_rule_arity(final SubLObject v_object, final SubLObject value) {
        assert psp_rules.NIL != phrase_structure_parser_rule_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject _csetf_psp_rule_category(final SubLObject v_object, final SubLObject value) {
        assert psp_rules.NIL != phrase_structure_parser_rule_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject _csetf_psp_rule_head(final SubLObject v_object, final SubLObject value) {
        assert psp_rules.NIL != phrase_structure_parser_rule_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject _csetf_psp_rule_constraints(final SubLObject v_object, final SubLObject value) {
        assert psp_rules.NIL != phrase_structure_parser_rule_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject _csetf_psp_rule_semx(final SubLObject v_object, final SubLObject value) {
        assert psp_rules.NIL != phrase_structure_parser_rule_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject _csetf_psp_rule_weight(final SubLObject v_object, final SubLObject value) {
        assert psp_rules.NIL != phrase_structure_parser_rule_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject make_phrase_structure_parser_rule(SubLObject arglist) {
        if (arglist == psp_rules.UNPROVIDED) {
            arglist = (SubLObject)psp_rules.NIL;
        }
        final SubLObject v_new = (SubLObject)new $phrase_structure_parser_rule_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)psp_rules.NIL, next = arglist; psp_rules.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)psp_rules.$kw23$FORT)) {
                _csetf_psp_rule_fort(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_rules.$kw24$ARITY)) {
                _csetf_psp_rule_arity(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_rules.$kw25$CATEGORY)) {
                _csetf_psp_rule_category(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_rules.$kw26$HEAD)) {
                _csetf_psp_rule_head(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_rules.$kw27$CONSTRAINTS)) {
                _csetf_psp_rule_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_rules.$kw28$SEMX)) {
                _csetf_psp_rule_semx(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_rules.$kw29$WEIGHT)) {
                _csetf_psp_rule_weight(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)psp_rules.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject visit_defstruct_phrase_structure_parser_rule(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_rules.$kw31$BEGIN, (SubLObject)psp_rules.$sym32$MAKE_PHRASE_STRUCTURE_PARSER_RULE, (SubLObject)psp_rules.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_rules.$kw33$SLOT, (SubLObject)psp_rules.$kw23$FORT, psp_rule_fort(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_rules.$kw33$SLOT, (SubLObject)psp_rules.$kw24$ARITY, psp_rule_arity(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_rules.$kw33$SLOT, (SubLObject)psp_rules.$kw25$CATEGORY, psp_rule_category(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_rules.$kw33$SLOT, (SubLObject)psp_rules.$kw26$HEAD, psp_rule_head(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_rules.$kw33$SLOT, (SubLObject)psp_rules.$kw27$CONSTRAINTS, psp_rule_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_rules.$kw33$SLOT, (SubLObject)psp_rules.$kw28$SEMX, psp_rule_semx(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_rules.$kw33$SLOT, (SubLObject)psp_rules.$kw29$WEIGHT, psp_rule_weight(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_rules.$kw34$END, (SubLObject)psp_rules.$sym32$MAKE_PHRASE_STRUCTURE_PARSER_RULE, (SubLObject)psp_rules.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 848L)
    public static SubLObject visit_defstruct_object_phrase_structure_parser_rule_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_phrase_structure_parser_rule(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 1312L)
    public static SubLObject pprint_psp_rule(final SubLObject psp_rule, SubLObject stream, SubLObject depth) {
        if (stream == psp_rules.UNPROVIDED) {
            stream = (SubLObject)psp_rules.NIL;
        }
        if (depth == psp_rules.UNPROVIDED) {
            depth = (SubLObject)psp_rules.NIL;
        }
        PrintLow.format(stream, (SubLObject)psp_rules.$str36$__PSP_RULE___S_, psp_rule_fort(psp_rule));
        return psp_rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 1476L)
    public static SubLObject new_psp_rule(SubLObject fort, SubLObject v_arity, SubLObject category, SubLObject head, SubLObject constraints, SubLObject semx, SubLObject weight) {
        if (fort == psp_rules.UNPROVIDED) {
            fort = (SubLObject)psp_rules.NIL;
        }
        if (v_arity == psp_rules.UNPROVIDED) {
            v_arity = (SubLObject)psp_rules.NIL;
        }
        if (category == psp_rules.UNPROVIDED) {
            category = (SubLObject)psp_rules.NIL;
        }
        if (head == psp_rules.UNPROVIDED) {
            head = (SubLObject)psp_rules.NIL;
        }
        if (constraints == psp_rules.UNPROVIDED) {
            constraints = psp_new_constraints();
        }
        if (semx == psp_rules.UNPROVIDED) {
            semx = (SubLObject)psp_rules.NIL;
        }
        if (weight == psp_rules.UNPROVIDED) {
            weight = (SubLObject)psp_rules.NIL;
        }
        final SubLObject rule = make_phrase_structure_parser_rule((SubLObject)psp_rules.UNPROVIDED);
        _csetf_psp_rule_arity(rule, v_arity);
        _csetf_psp_rule_fort(rule, fort);
        _csetf_psp_rule_category(rule, category);
        _csetf_psp_rule_head(rule, head);
        _csetf_psp_rule_constraints(rule, constraints);
        _csetf_psp_rule_semx(rule, semx);
        _csetf_psp_rule_weight(rule, weight);
        return rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 1966L)
    public static SubLObject psp_new_constraints() {
        return dictionary.new_dictionary(Symbols.symbol_function((SubLObject)psp_rules.EQL), (SubLObject)psp_rules.EIGHT_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2040L)
    public static SubLObject psp_constraints_on_dtr(final SubLObject dtr_num, final SubLObject constraints) {
        return dictionary.dictionary_lookup_without_values(constraints, dtr_num, (SubLObject)psp_rules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2166L)
    public static SubLObject psp_new_constraint(final SubLObject type, final SubLObject target) {
        return (SubLObject)ConsesLow.list(type, target);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2244L)
    public static SubLObject psp_constraint_type(final SubLObject constraint) {
        return constraint.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2322L)
    public static SubLObject psp_constraint_target(final SubLObject constraint) {
        return conses_high.second(constraint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2403L)
    public static SubLObject psp_destructure_constraint(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject type = (SubLObject)psp_rules.NIL;
        SubLObject target = (SubLObject)psp_rules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list37);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list37);
        target = current.first();
        current = current.rest();
        if (psp_rules.NIL == current) {
            current = temp;
            SubLObject constraint = (SubLObject)psp_rules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list37);
            constraint = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)psp_rules.$sym38$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(type, target), constraint, ConsesLow.append(body, (SubLObject)psp_rules.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_rules.$list37);
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2840L)
    public static SubLObject psp_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return psp_rules.$psp_rules$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 2893L)
    public static SubLObject clear_psp_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        psp_semantics.psp_semx_clear_handlers();
        psp_main.clear_psp_caches();
        clear_psp_rules_caches();
        return set.clear_set(psp_rules.$psp_rules$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 3118L)
    public static SubLObject add_phrase_structure_rule(final SubLObject argument, final SubLObject assertion) {
        clear_psp_rules();
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 3317L)
    public static SubLObject remove_phrase_structure_rule(final SubLObject argument, final SubLObject assertion) {
        clear_psp_rules();
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 3523L)
    public static SubLObject initialize_psp_rules(SubLObject mt) {
        if (mt == psp_rules.UNPROVIDED) {
            mt = parsing_vars.$psp_rule_lookup_mt$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_psp_rules();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject node_var = psp_rules.$const42$PhraseStructureRule;
                    final SubLObject _prev_bind_0_$2 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(psp_rules.$const43$isa), thread);
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            SubLObject node_var_$4 = node_var;
                            final SubLObject deck_type = (SubLObject)psp_rules.$kw46$STACK;
                            final SubLObject recur_deck = deck.create_deck(deck_type);
                            final SubLObject _prev_bind_0_$3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject tv_var = (SubLObject)psp_rules.NIL;
                                    final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind((psp_rules.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((psp_rules.NIL != tv_var) ? psp_rules.$sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                        if (psp_rules.NIL != tv_var && psp_rules.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && psp_rules.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var.eql((SubLObject)psp_rules.$kw48$ERROR)) {
                                                sbhl_paranoia.sbhl_error((SubLObject)psp_rules.ONE_INTEGER, (SubLObject)psp_rules.$str49$_A_is_not_a__A, tv_var, (SubLObject)psp_rules.$sym50$SBHL_TRUE_TV_P, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
                                            }
                                            else if (pcase_var.eql((SubLObject)psp_rules.$kw51$CERROR)) {
                                                sbhl_paranoia.sbhl_cerror((SubLObject)psp_rules.ONE_INTEGER, (SubLObject)psp_rules.$str52$continue_anyway, (SubLObject)psp_rules.$str49$_A_is_not_a__A, tv_var, (SubLObject)psp_rules.$sym50$SBHL_TRUE_TV_P, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
                                            }
                                            else if (pcase_var.eql((SubLObject)psp_rules.$kw53$WARN)) {
                                                Errors.warn((SubLObject)psp_rules.$str49$_A_is_not_a__A, tv_var, (SubLObject)psp_rules.$sym50$SBHL_TRUE_TV_P);
                                            }
                                            else {
                                                Errors.warn((SubLObject)psp_rules.$str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror((SubLObject)psp_rules.$str52$continue_anyway, (SubLObject)psp_rules.$str49$_A_is_not_a__A, tv_var, (SubLObject)psp_rules.$sym50$SBHL_TRUE_TV_P);
                                            }
                                        }
                                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(psp_rules.$const43$isa)), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(psp_rules.$const43$isa))), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(psp_rules.$const43$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)psp_rules.NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(psp_rules.$const43$isa)), thread);
                                            if (psp_rules.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || psp_rules.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)psp_rules.UNPROVIDED))) {
                                                final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$6 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(psp_rules.$const43$isa))), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)psp_rules.NIL, thread);
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$4, (SubLObject)psp_rules.UNPROVIDED);
                                                    while (psp_rules.NIL != node_var_$4) {
                                                        final SubLObject tt_node_var = node_var_$4;
                                                        SubLObject cdolist_list_var;
                                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(psp_rules.$const43$isa));
                                                        SubLObject module_var = (SubLObject)psp_rules.NIL;
                                                        module_var = cdolist_list_var.first();
                                                        while (psp_rules.NIL != cdolist_list_var) {
                                                            final SubLObject _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((psp_rules.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(psp_rules.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                if (psp_rules.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)psp_rules.UNPROVIDED));
                                                                    if (psp_rules.NIL != d_link) {
                                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(psp_rules.$const43$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)psp_rules.UNPROVIDED));
                                                                        if (psp_rules.NIL != mt_links) {
                                                                            SubLObject iteration_state;
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); psp_rules.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject mt_$16 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (psp_rules.NIL != mt_relevance_macros.relevant_mtP(mt_$16)) {
                                                                                    final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$16, thread);
                                                                                        SubLObject iteration_state_$18;
                                                                                        for (iteration_state_$18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); psp_rules.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$18); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next(iteration_state_$18)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$18);
                                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (psp_rules.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    final SubLObject sol = link_nodes;
                                                                                                    if (psp_rules.NIL != set.set_p(sol)) {
                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                        SubLObject basis_object;
                                                                                                        SubLObject state_$20;
                                                                                                        SubLObject rule_fort;
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$20 = (SubLObject)psp_rules.NIL, state_$20 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); psp_rules.NIL == set_contents.do_set_contents_doneP(basis_object, state_$20); state_$20 = set_contents.do_set_contents_update_state(state_$20)) {
                                                                                                            rule_fort = set_contents.do_set_contents_next(basis_object, state_$20);
                                                                                                            if (psp_rules.NIL != set_contents.do_set_contents_element_validP(state_$20, rule_fort) && psp_rules.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (psp_rules.NIL != forts.fort_p(rule_fort)) {
                                                                                                                    store_one_psp_rule_fort(rule_fort);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject rule_fort2 = (SubLObject)psp_rules.NIL;
                                                                                                        rule_fort2 = csome_list_var.first();
                                                                                                        while (psp_rules.NIL != csome_list_var) {
                                                                                                            if (psp_rules.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (psp_rules.NIL != forts.fort_p(rule_fort2)) {
                                                                                                                    store_one_psp_rule_fort(rule_fort2);
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            rule_fort2 = csome_list_var.first();
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)psp_rules.$str55$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$9, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$18);
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$8, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    }
                                                                    else {
                                                                        sbhl_paranoia.sbhl_error((SubLObject)psp_rules.FIVE_INTEGER, (SubLObject)psp_rules.$str56$attempting_to_bind_direction_link, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
                                                                    }
                                                                    if (psp_rules.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)psp_rules.UNPROVIDED))) {
                                                                        SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                        SubLObject instance_tuple = (SubLObject)psp_rules.NIL;
                                                                        instance_tuple = csome_list_var2.first();
                                                                        while (psp_rules.NIL != csome_list_var2) {
                                                                            SubLObject current;
                                                                            final SubLObject datum = current = instance_tuple;
                                                                            SubLObject link_node = (SubLObject)psp_rules.NIL;
                                                                            SubLObject mt_$17 = (SubLObject)psp_rules.NIL;
                                                                            SubLObject tv2 = (SubLObject)psp_rules.NIL;
                                                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list57);
                                                                            link_node = current.first();
                                                                            current = current.rest();
                                                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list57);
                                                                            mt_$17 = current.first();
                                                                            current = current.rest();
                                                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list57);
                                                                            tv2 = current.first();
                                                                            current = current.rest();
                                                                            if (psp_rules.NIL == current) {
                                                                                if (psp_rules.NIL != mt_relevance_macros.relevant_mtP(mt_$17)) {
                                                                                    final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$17, thread);
                                                                                        if (psp_rules.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol;
                                                                                                final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                                if (psp_rules.NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject rule_fort;
                                                                                                    SubLObject state_$21;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$21 = (SubLObject)psp_rules.NIL, state_$21 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); psp_rules.NIL == set_contents.do_set_contents_doneP(basis_object, state_$21); state_$21 = set_contents.do_set_contents_update_state(state_$21)) {
                                                                                                        rule_fort = set_contents.do_set_contents_next(basis_object, state_$21);
                                                                                                        if (psp_rules.NIL != set_contents.do_set_contents_element_validP(state_$21, rule_fort) && psp_rules.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (psp_rules.NIL != forts.fort_p(rule_fort)) {
                                                                                                                store_one_psp_rule_fort(rule_fort);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    SubLObject csome_list_var_$25 = sol;
                                                                                                    SubLObject rule_fort2 = (SubLObject)psp_rules.NIL;
                                                                                                    rule_fort2 = csome_list_var_$25.first();
                                                                                                    while (psp_rules.NIL != csome_list_var_$25) {
                                                                                                        if (psp_rules.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (psp_rules.NIL != forts.fort_p(rule_fort2)) {
                                                                                                                store_one_psp_rule_fort(rule_fort2);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var_$25 = csome_list_var_$25.rest();
                                                                                                        rule_fort2 = csome_list_var_$25.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)psp_rules.$str55$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$11, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$10, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_rules.$list57);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            instance_tuple = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                }
                                                                else if (psp_rules.NIL != obsolete.cnat_p(node, (SubLObject)psp_rules.UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$26;
                                                                    final SubLObject new_list = cdolist_list_var_$26 = ((psp_rules.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(psp_rules.$const43$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)psp_rules.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(psp_rules.$const43$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)psp_rules.UNPROVIDED)));
                                                                    SubLObject generating_fn = (SubLObject)psp_rules.NIL;
                                                                    generating_fn = cdolist_list_var_$26.first();
                                                                    while (psp_rules.NIL != cdolist_list_var_$26) {
                                                                        final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                            if (psp_rules.NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state_$22;
                                                                                SubLObject rule_fort3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state_$22 = (SubLObject)psp_rules.NIL, state_$22 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); psp_rules.NIL == set_contents.do_set_contents_doneP(basis_object2, state_$22); state_$22 = set_contents.do_set_contents_update_state(state_$22)) {
                                                                                    rule_fort3 = set_contents.do_set_contents_next(basis_object2, state_$22);
                                                                                    if (psp_rules.NIL != set_contents.do_set_contents_element_validP(state_$22, rule_fort3) && psp_rules.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (psp_rules.NIL != forts.fort_p(rule_fort3)) {
                                                                                            store_one_psp_rule_fort(rule_fort3);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject rule_fort4 = (SubLObject)psp_rules.NIL;
                                                                                rule_fort4 = csome_list_var3.first();
                                                                                while (psp_rules.NIL != csome_list_var3) {
                                                                                    if (psp_rules.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (psp_rules.NIL != forts.fort_p(rule_fort4)) {
                                                                                            store_one_psp_rule_fort(rule_fort4);
                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    rule_fort4 = csome_list_var3.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)psp_rules.$str55$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$12, thread);
                                                                        }
                                                                        cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                                                                        generating_fn = cdolist_list_var_$26.first();
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$7, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$7, thread);
                                                            }
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            module_var = cdolist_list_var.first();
                                                        }
                                                        SubLObject cdolist_list_var2;
                                                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(psp_rules.$const43$isa)));
                                                        SubLObject module_var2 = (SubLObject)psp_rules.NIL;
                                                        module_var2 = cdolist_list_var2.first();
                                                        while (psp_rules.NIL != cdolist_list_var2) {
                                                            final SubLObject _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((psp_rules.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(psp_rules.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                final SubLObject node2 = function_terms.naut_to_nart(node_var_$4);
                                                                if (psp_rules.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                    final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)psp_rules.UNPROVIDED));
                                                                    if (psp_rules.NIL != d_link2) {
                                                                        final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)psp_rules.UNPROVIDED));
                                                                        if (psp_rules.NIL != mt_links2) {
                                                                            SubLObject iteration_state2;
                                                                            for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); psp_rules.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject mt_$18 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                                final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (psp_rules.NIL != mt_relevance_macros.relevant_mtP(mt_$18)) {
                                                                                    final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$18, thread);
                                                                                        SubLObject iteration_state_$19;
                                                                                        for (iteration_state_$19 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); psp_rules.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$19); iteration_state_$19 = dictionary_contents.do_dictionary_contents_next(iteration_state_$19)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$19);
                                                                                            final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (psp_rules.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                    final SubLObject sol3 = link_nodes4;
                                                                                                    if (psp_rules.NIL != set.set_p(sol3)) {
                                                                                                        final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                        SubLObject basis_object3;
                                                                                                        SubLObject state_$23;
                                                                                                        SubLObject node_vars_link_node;
                                                                                                        for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state_$23 = (SubLObject)psp_rules.NIL, state_$23 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); psp_rules.NIL == set_contents.do_set_contents_doneP(basis_object3, state_$23); state_$23 = set_contents.do_set_contents_update_state(state_$23)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state_$23);
                                                                                                            if (psp_rules.NIL != set_contents.do_set_contents_element_validP(state_$23, node_vars_link_node) && psp_rules.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)psp_rules.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)psp_rules.UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (sol3.isList()) {
                                                                                                        SubLObject csome_list_var4 = sol3;
                                                                                                        SubLObject node_vars_link_node2 = (SubLObject)psp_rules.NIL;
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                        while (psp_rules.NIL != csome_list_var4) {
                                                                                                            if (psp_rules.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)psp_rules.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)psp_rules.UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)psp_rules.$str55$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$15, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$19);
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$14, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                        }
                                                                    }
                                                                    else {
                                                                        sbhl_paranoia.sbhl_error((SubLObject)psp_rules.FIVE_INTEGER, (SubLObject)psp_rules.$str56$attempting_to_bind_direction_link, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
                                                                    }
                                                                }
                                                                else if (psp_rules.NIL != obsolete.cnat_p(node2, (SubLObject)psp_rules.UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$27;
                                                                    final SubLObject new_list2 = cdolist_list_var_$27 = ((psp_rules.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)psp_rules.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)psp_rules.UNPROVIDED)));
                                                                    SubLObject generating_fn2 = (SubLObject)psp_rules.NIL;
                                                                    generating_fn2 = cdolist_list_var_$27.first();
                                                                    while (psp_rules.NIL != cdolist_list_var_$27) {
                                                                        final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            final SubLObject sol4;
                                                                            final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                            if (psp_rules.NIL != set.set_p(sol4)) {
                                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                SubLObject basis_object4;
                                                                                SubLObject state_$24;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state_$24 = (SubLObject)psp_rules.NIL, state_$24 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); psp_rules.NIL == set_contents.do_set_contents_doneP(basis_object4, state_$24); state_$24 = set_contents.do_set_contents_update_state(state_$24)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state_$24);
                                                                                    if (psp_rules.NIL != set_contents.do_set_contents_element_validP(state_$24, node_vars_link_node3) && psp_rules.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)psp_rules.UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)psp_rules.UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (sol4.isList()) {
                                                                                SubLObject csome_list_var5 = sol4;
                                                                                SubLObject node_vars_link_node4 = (SubLObject)psp_rules.NIL;
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                                while (psp_rules.NIL != csome_list_var5) {
                                                                                    if (psp_rules.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)psp_rules.UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)psp_rules.UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var5 = csome_list_var5.rest();
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)psp_rules.$str55$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$16, thread);
                                                                        }
                                                                        cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                                                                        generating_fn2 = cdolist_list_var_$27.first();
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$8, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$13, thread);
                                                            }
                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                            module_var2 = cdolist_list_var2.first();
                                                        }
                                                        node_var_$4 = deck.deck_pop(recur_deck);
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$11, thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$6, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$6, thread);
                                                }
                                            }
                                            else {
                                                sbhl_paranoia.sbhl_warn((SubLObject)psp_rules.TWO_INTEGER, (SubLObject)psp_rules.$str58$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)psp_rules.UNPROVIDED)), (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$10, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$5, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$4, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)psp_rules.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)psp_rules.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$3, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)psp_rules.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return psp_rules.$psp_rules$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 3907L)
    public static SubLObject psp_check_initializations() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (psp_rules.NIL == set.non_empty_set_p(psp_rules.$psp_rules$.getDynamicValue(thread))) {
            initialize_psp_rules((SubLObject)psp_rules.UNPROVIDED);
        }
        return (SubLObject)psp_rules.$kw59$INITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 4042L)
    public static SubLObject store_one_psp_rule_fort(final SubLObject rule_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject v_arity = kb_mapping_utilities.fpred_value(rule_fort, psp_rules.$const60$psRuleArity, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
            final SubLObject category = kb_mapping_utilities.fpred_value(rule_fort, psp_rules.$const61$psRuleCategory, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
            final SubLObject head = kb_mapping_utilities.fpred_value(rule_fort, psp_rules.$const62$psRuleSyntacticHeadDtr, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
            final SubLObject weight = psp_rule_fort_weight_factor(rule_fort, v_arity);
            final SubLObject raw_constraints = kb_mapping_utilities.pred_values(rule_fort, psp_rules.$const63$psRuleConstraint, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
            final SubLObject constraints = psp_new_constraints();
            final SubLObject semx = psp_get_semx_for_rule_fort(rule_fort);
            if (psp_rules.NIL == category) {}
            if (psp_rules.NIL == head) {}
            if (psp_rules.NIL != raw_constraints) {
                SubLObject cdolist_list_var = raw_constraints;
                SubLObject constraint = (SubLObject)psp_rules.NIL;
                constraint = cdolist_list_var.first();
                while (psp_rules.NIL != cdolist_list_var) {
                    if (psp_rules.NIL != psp_valid_raw_constraintP(constraint)) {
                        SubLObject current;
                        final SubLObject datum = current = psp_parse_constraint(constraint);
                        SubLObject c_type = (SubLObject)psp_rules.NIL;
                        SubLObject dtr = (SubLObject)psp_rules.NIL;
                        SubLObject target = (SubLObject)psp_rules.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list64);
                        c_type = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list64);
                        dtr = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list64);
                        target = current.first();
                        current = current.rest();
                        if (psp_rules.NIL == current) {
                            dictionary_utilities.dictionary_push(constraints, dtr, psp_new_constraint(c_type, target));
                            if (psp_rules.NIL != psp_frame_specific_raw_constraintP(constraint)) {
                                dictionary_utilities.dictionary_push(constraints, dtr, psp_frame_constraint_from_raw_constraint(constraint));
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_rules.$list64);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    constraint = cdolist_list_var.first();
                }
            }
            if (psp_rules.NIL != category && psp_rules.NIL != head && psp_rules.NIL != raw_constraints) {
                final SubLObject new_rule = add_psp_rule(rule_fort, v_arity, category, head, constraints, semx, weight);
                psp_add_derivable_rules(new_rule);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)psp_rules.$kw65$STORED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 5549L)
    public static SubLObject psp_valid_raw_constraintP(final SubLObject constraint) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_rules.NIL != nart_handles.valid_nartP(constraint, (SubLObject)psp_rules.UNPROVIDED) && psp_rules.NIL != el_utilities.formula_arityE(narts_high.nart_hl_formula(constraint), (SubLObject)psp_rules.TWO_INTEGER, (SubLObject)psp_rules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 5701L)
    public static SubLObject psp_get_semx_for_rule_fort(final SubLObject rule_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject type = (SubLObject)psp_rules.NIL;
        SubLObject head_dtr_num = (SubLObject)psp_rules.NIL;
        SubLObject binding_expressions = (SubLObject)psp_rules.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)psp_rules.$sym66$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(psp_rules.$const67$EverythingPSC, thread);
            final SubLObject identity_arg = kb_mapping_utilities.fpred_value(rule_fort, psp_rules.$const68$psRuleSemanticsFromDtr, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
            if (psp_rules.NIL != identity_arg) {
                type = (SubLObject)psp_rules.$kw69$IDENTITY;
                head_dtr_num = identity_arg;
            }
            else {
                binding_expressions = psp_binding_expressions_for_rule_fort(rule_fort);
                type = (SubLObject)psp_rules.$kw70$TEMPLATE;
                head_dtr_num = kb_mapping_utilities.fpred_value(rule_fort, psp_rules.$const71$psRuleTemplateDtr, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ConsesLow.listS(type, head_dtr_num, binding_expressions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 6373L)
    public static SubLObject psp_binding_expressions_for_rule_fort(final SubLObject rule_fort) {
        SubLObject binding_expressions = (SubLObject)psp_rules.NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(rule_fort, psp_rules.$const76$psRuleTemplateBindings, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
        SubLObject nat = (SubLObject)psp_rules.NIL;
        nat = cdolist_list_var.first();
        while (psp_rules.NIL != cdolist_list_var) {
            binding_expressions = (SubLObject)ConsesLow.cons(conses_high.subst((SubLObject)psp_rules.$kw72$INSTANCE, psp_rules.$const73$PSBindingFn, conses_high.subst((SubLObject)psp_rules.$kw74$TYPE, psp_rules.$const75$PSBindingFn_TypeLevel, nat, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED), (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED), binding_expressions);
            cdolist_list_var = cdolist_list_var.rest();
            nat = cdolist_list_var.first();
        }
        return binding_expressions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 6769L)
    public static SubLObject psp_rule_fort_weight_factor(final SubLObject rule_fort, SubLObject v_arity) {
        if (v_arity == psp_rules.UNPROVIDED) {
            v_arity = (SubLObject)psp_rules.NIL;
        }
        final SubLObject explicit_weight_factor = psp_explicit_weight_factor_for_rule_fort(rule_fort);
        return (psp_rules.NIL != psp_chart.psp_weight_p(explicit_weight_factor)) ? explicit_weight_factor : psp_rule_weight_factor_from_arity(v_arity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 7117L)
    public static SubLObject psp_explicit_weight_factor_for_rule_fort(final SubLObject rule_fort) {
        return list_utilities.alist_lookup(psp_rule_fort_weights(), rule_fort, Symbols.symbol_function((SubLObject)psp_rules.EQL), (SubLObject)psp_rules.$kw77$NONE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 7654L)
    public static SubLObject psp_rule_fort_weights_internal() {
        final SubLObject weight_pred = constants_high.find_constant((SubLObject)psp_rules.$str84$psRuleWeight);
        if (psp_rules.NIL != constant_handles.valid_constantP(weight_pred, (SubLObject)psp_rules.UNPROVIDED)) {
            final SubLObject raw_alist = ask_utilities.ask_template((SubLObject)psp_rules.$list85, reader.bq_cons(weight_pred, (SubLObject)psp_rules.$list86), parsing_vars.$psp_rule_lookup_mt$.getGlobalValue(), (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
            SubLObject adjusted_alist = (SubLObject)psp_rules.NIL;
            SubLObject cdolist_list_var = raw_alist;
            SubLObject cons = (SubLObject)psp_rules.NIL;
            cons = cdolist_list_var.first();
            while (psp_rules.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject rule = (SubLObject)psp_rules.NIL;
                SubLObject raw_weight = (SubLObject)psp_rules.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list87);
                rule = current.first();
                current = (raw_weight = current.rest());
                adjusted_alist = list_utilities.alist_enter(adjusted_alist, rule, parsing_utilities.psp_weight_from_float(raw_weight), (SubLObject)psp_rules.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
            return adjusted_alist;
        }
        return psp_rules.$psp_rule_fort_weights$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 7654L)
    public static SubLObject psp_rule_fort_weights() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)psp_rules.NIL;
        if (psp_rules.NIL == v_memoization_state) {
            return psp_rule_fort_weights_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)psp_rules.$sym83$PSP_RULE_FORT_WEIGHTS, (SubLObject)psp_rules.UNPROVIDED);
        if (psp_rules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)psp_rules.$sym83$PSP_RULE_FORT_WEIGHTS, (SubLObject)psp_rules.ZERO_INTEGER, (SubLObject)psp_rules.NIL, (SubLObject)psp_rules.EQL, (SubLObject)psp_rules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)psp_rules.$sym83$PSP_RULE_FORT_WEIGHTS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)psp_rules.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_rule_fort_weights_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)psp_rules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 8267L)
    public static SubLObject psp_rule_weight_factor_from_arity(final SubLObject rule_arity) {
        if (psp_rules.NIL != subl_promotions.positive_integer_p(rule_arity) && rule_arity.numG((SubLObject)psp_rules.ONE_INTEGER)) {
            final SubLObject extra_dtr_count = number_utilities.f_1_(rule_arity);
            return psp_chart.psp_weight_compose((SubLObject)ConsesLow.make_list(extra_dtr_count, psp_rules.$psp_rule_arity_weight$.getGlobalValue()));
        }
        return parsing_vars.$psp_max_weight$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 8630L)
    public static SubLObject add_psp_rule(final SubLObject rule_fort, final SubLObject v_arity, final SubLObject category, final SubLObject head, final SubLObject constraints, final SubLObject semx, final SubLObject weight) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((psp_rules.NIL == v_arity || v_arity.eql((SubLObject)psp_rules.ONE_INTEGER)) && psp_rules.NIL != psp_category_meets_constraintsP(category, constraints)) {
            return (SubLObject)psp_rules.$kw89$INFINITE_RECURSION_RULE;
        }
        final SubLObject new_rule = new_psp_rule(rule_fort, v_arity, category, head, constraints, semx, weight);
        set.set_add(new_rule, psp_rules.$psp_rules$.getDynamicValue(thread));
        return new_rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 9190L)
    public static SubLObject psp_rule_struct_for_rule_fort(final SubLObject rule_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)psp_rules.NIL;
        final SubLObject set_contents_var = set.do_set_internal(psp_rules.$psp_rules$.getDynamicValue(thread));
        SubLObject basis_object;
        SubLObject state;
        SubLObject rule_struct;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)psp_rules.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); psp_rules.NIL == ans && psp_rules.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            rule_struct = set_contents.do_set_contents_next(basis_object, state);
            if (psp_rules.NIL != set_contents.do_set_contents_element_validP(state, rule_struct) && rule_fort.eql(psp_rule_fort(rule_struct))) {
                ans = rule_struct;
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 9419L)
    public static SubLObject psp_category_meets_constraintsP(final SubLObject category, final SubLObject constraints) {
        SubLObject failP = (SubLObject)psp_rules.NIL;
        if (psp_rules.NIL == failP) {
            SubLObject csome_list_var = psp_constraints_on_dtr((SubLObject)psp_rules.ONE_INTEGER, constraints);
            SubLObject constraint = (SubLObject)psp_rules.NIL;
            constraint = csome_list_var.first();
            while (psp_rules.NIL == failP && psp_rules.NIL != csome_list_var) {
                SubLObject current;
                final SubLObject datum = current = constraint;
                SubLObject type = (SubLObject)psp_rules.NIL;
                SubLObject target = (SubLObject)psp_rules.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list90);
                type = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list90);
                target = current.first();
                current = current.rest();
                if (psp_rules.NIL == current) {
                    if (type.eql(psp_rules.$const91$ConstituentTypeConstraintFn) && psp_rules.NIL == psp_constraint_target_includesP(target, category, (SubLObject)psp_rules.UNPROVIDED)) {
                        failP = (SubLObject)psp_rules.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_rules.$list90);
                }
                csome_list_var = csome_list_var.rest();
                constraint = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_rules.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 9812L)
    public static SubLObject psp_parse_constraint(final SubLObject constraint) {
        SubLObject current;
        final SubLObject datum = current = function_terms.nart_to_naut(constraint);
        SubLObject c_type = (SubLObject)psp_rules.NIL;
        SubLObject dtr = (SubLObject)psp_rules.NIL;
        SubLObject target = (SubLObject)psp_rules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list64);
        c_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list64);
        dtr = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list64);
        target = current.first();
        current = current.rest();
        if (psp_rules.NIL == current) {
            final SubLObject pcase_var = c_type;
            if (pcase_var.eql(psp_rules.$const91$ConstituentTypeConstraintFn)) {
                target = psp_sub_categories(target);
            }
            else if (pcase_var.eql(psp_rules.$const92$POSPredConstraintFn)) {
                target = psp_sub_pos_preds(target, (SubLObject)psp_rules.UNPROVIDED);
            }
            return (SubLObject)ConsesLow.list(c_type, dtr, target);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_rules.$list64);
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 10232L)
    public static SubLObject psp_frame_specific_raw_constraintP(final SubLObject constraint) {
        SubLObject current;
        final SubLObject datum = current = function_terms.nart_to_naut(constraint);
        SubLObject c_type = (SubLObject)psp_rules.NIL;
        SubLObject dtr = (SubLObject)psp_rules.NIL;
        SubLObject target = (SubLObject)psp_rules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list64);
        c_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list64);
        dtr = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list64);
        target = current.first();
        current = current.rest();
        if (psp_rules.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(c_type.eql(psp_rules.$const91$ConstituentTypeConstraintFn) && psp_rules.NIL != psp_frame_specific_constituent_typeP(target));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_rules.$list64);
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 10562L)
    public static SubLObject psp_frame_constraint_from_raw_constraint(final SubLObject constraint) {
        final SubLObject target = cycl_utilities.nat_arg2(constraint, (SubLObject)psp_rules.UNPROVIDED);
        final SubLObject target_frame_type = psp_frame_type_from_constituent_type(target);
        final SubLObject target_set = psp_frame_type_instances(target_frame_type, (SubLObject)psp_rules.UNPROVIDED);
        return psp_new_constraint((SubLObject)psp_rules.$kw93$FRAME, target_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 10851L)
    public static SubLObject psp_add_derivable_rules(final SubLObject new_rule) {
        return (SubLObject)psp_rules.$kw94$STUB;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 11101L)
    public static SubLObject psp_trace(final SubLObject rule_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert psp_rules.NIL != forts.fort_p(rule_fort) : rule_fort;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (psp_rules.NIL != isa.isaP(rule_fort, psp_rules.$const42$PhraseStructureRule, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED) && psp_rules.NIL == conses_high.member(rule_fort, psp_rules.$psp_traced_rules$.getGlobalValue(), Symbols.symbol_function((SubLObject)psp_rules.EQL), Symbols.symbol_function((SubLObject)psp_rules.IDENTITY))) {
                psp_rules.$psp_traced_rules$.setGlobalValue((SubLObject)ConsesLow.cons(rule_fort, psp_rules.$psp_traced_rules$.getGlobalValue()));
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return psp_rules.$psp_traced_rules$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 11349L)
    public static SubLObject psp_untrace(SubLObject rule_fort) {
        if (rule_fort == psp_rules.UNPROVIDED) {
            rule_fort = (SubLObject)psp_rules.NIL;
        }
        psp_rules.$psp_traced_rules$.setGlobalValue((SubLObject)((psp_rules.NIL != rule_fort) ? Sequences.remove(rule_fort, psp_rules.$psp_traced_rules$.getGlobalValue(), (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED) : psp_rules.NIL));
        return psp_rules.$psp_traced_rules$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 11515L)
    public static SubLObject psp_traced_ruleP(final SubLObject rule_fort) {
        return subl_promotions.memberP(rule_fort, psp_rules.$psp_traced_rules$.getGlobalValue(), (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 11611L)
    public static SubLObject psp_trace_report(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject rule_fort = (SubLObject)psp_rules.NIL;
        SubLObject format_str = (SubLObject)psp_rules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list97);
        rule_fort = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list97);
        format_str = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)psp_rules.$sym98$PWHEN, (SubLObject)ConsesLow.list((SubLObject)psp_rules.$sym99$PSP_TRACED_RULE_, rule_fort), (SubLObject)ConsesLow.listS((SubLObject)psp_rules.$sym100$DO_PSP_TRACE_REPORT, format_str, ConsesLow.append(args, (SubLObject)psp_rules.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 11831L)
    public static SubLObject do_psp_trace_report(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_str = (SubLObject)psp_rules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list101);
        format_str = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)psp_rules.$sym102$FORMAT, (SubLObject)psp_rules.T, format_str, ConsesLow.append(args, (SubLObject)psp_rules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 12000L)
    public static SubLObject psp_rules_starting_with_edge(final SubLObject edge, SubLObject root_category) {
        if (root_category == psp_rules.UNPROVIDED) {
            root_category = (SubLObject)psp_rules.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = (SubLObject)psp_rules.NIL;
        final SubLObject edge_left_index = interval_span.interval_span_start(psp_chart.get_psp_edge_span(edge));
        final SubLObject set_contents_var = set.do_set_internal(psp_rules.$psp_rules$.getDynamicValue(thread));
        SubLObject basis_object;
        SubLObject state;
        SubLObject rule;
        SubLObject dtr1_constraints;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)psp_rules.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); psp_rules.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            rule = set_contents.do_set_contents_next(basis_object, state);
            if (psp_rules.NIL != set_contents.do_set_contents_element_validP(state, rule)) {
                dtr1_constraints = psp_constraints_on_dtr((SubLObject)psp_rules.ONE_INTEGER, psp_rule_constraints(rule));
                if (psp_rules.NIL != psp_rule_could_start_at_indexP(rule, edge_left_index) && (psp_rules.NIL == root_category || psp_rules.NIL != psp_valid_constituent_typeP(psp_rule_category(rule), root_category)) && psp_rules.NIL != psp_edge_meets_syntax_constraintsP(edge, dtr1_constraints, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED)) {
                    rules = (SubLObject)ConsesLow.cons(rule, rules);
                    if (psp_rules.NIL != psp_traced_ruleP(psp_rule_fort(rule))) {
                        PrintLow.format((SubLObject)psp_rules.T, (SubLObject)psp_rules.$str103$___S___meets_the_first_dtr_constr, new SubLObject[] { edge, psp_rule_fort(rule), psp_chart.get_psp_edge_frame(edge) });
                    }
                }
            }
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 12954L)
    public static SubLObject psp_rule_could_start_at_indexP(final SubLObject rule, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject chart_end_index = (psp_rules.NIL != parsing_vars.$psp_chart_end_index$.getDynamicValue(thread)) ? parsing_vars.$psp_chart_end_index$.getDynamicValue(thread) : psp_chart.psp_chart_length(parsing_vars.$psp_chart$.getDynamicValue(thread));
        final SubLObject known_arity = psp_rule_arity(rule);
        final SubLObject rule_min_arity = (SubLObject)((psp_rules.NIL != known_arity) ? known_arity : psp_rules.ONE_INTEGER);
        SubLObject minimal_end_index = Numbers.add(index, rule_min_arity);
        if (psp_rules.NIL != psp_chart.psp_gap_allowedP()) {
            minimal_end_index = Numbers.subtract(minimal_end_index, (SubLObject)psp_rules.ONE_INTEGER);
        }
        return Numbers.numGE(chart_end_index, minimal_end_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 13420L)
    public static SubLObject psp_filter_cycls(final SubLObject dtr_cycls, final SubLObject dtr_num, final SubLObject rule, final SubLObject edge) {
        SubLObject filtered_cycls = (SubLObject)psp_rules.NIL;
        final SubLObject constraint_table = psp_rule_constraints(rule);
        final SubLObject constraints = list_utilities.remove_if_not((SubLObject)psp_rules.$sym104$PSP_SEMANTIC_CONSTRAINT_, psp_constraints_on_dtr(dtr_num, constraint_table), (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
        SubLObject cdolist_list_var = dtr_cycls;
        SubLObject cycl = (SubLObject)psp_rules.NIL;
        cycl = cdolist_list_var.first();
        while (psp_rules.NIL != cdolist_list_var) {
            SubLObject failP = (SubLObject)psp_rules.NIL;
            if (psp_rules.NIL == failP) {
                SubLObject csome_list_var = constraints;
                SubLObject constraint = (SubLObject)psp_rules.NIL;
                constraint = csome_list_var.first();
                while (psp_rules.NIL == failP && psp_rules.NIL != csome_list_var) {
                    constraint = psp_cyclify_targets(constraint, edge);
                    failP = psp_cycl_fails_constraintP(cycl, constraint);
                    if (psp_rules.NIL != psp_traced_ruleP(psp_chart.psp_edge_rule_fort(edge))) {
                        PrintLow.format((SubLObject)psp_rules.T, (SubLObject)psp_rules.$str105$___S____A_constraint__S___, new SubLObject[] { cycl, (psp_rules.NIL != failP) ? psp_rules.$str106$failed : psp_rules.$str107$met, constraint });
                    }
                    csome_list_var = csome_list_var.rest();
                    constraint = csome_list_var.first();
                }
            }
            if (psp_rules.NIL == failP) {
                filtered_cycls = (SubLObject)ConsesLow.cons(cycl, filtered_cycls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        }
        return filtered_cycls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 14255L)
    public static SubLObject psp_cyclify_targets(SubLObject constraint, final SubLObject edge) {
        SubLObject current;
        final SubLObject datum = current = constraint;
        SubLObject type = (SubLObject)psp_rules.NIL;
        SubLObject target = (SubLObject)psp_rules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list90);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list90);
        target = current.first();
        current = current.rest();
        if (psp_rules.NIL == current) {
            if (target.isInteger()) {
                final SubLObject target_dtr = psp_chart.psp_edge_nth_dtr(target, edge);
                final SubLObject target_cycls = psp_semantics.psp_cycls_to_cycls(psp_semantics.psp_semantics_for_edge(target_dtr, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED));
                constraint = (SubLObject)ConsesLow.list(type, reader.bq_cons((SubLObject)psp_rules.$kw108$LIST, target_cycls));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_rules.$list90);
        }
        return constraint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 14708L)
    public static SubLObject psp_edge_passes_semantic_constraintsP(final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_struct = psp_chart.psp_edge_rule_struct(edge);
        final SubLObject constraint_table = psp_rule_constraints(rule_struct);
        final SubLObject dtrs = psp_chart.psp_edge_dtrs(edge);
        SubLObject failP = (SubLObject)psp_rules.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(constraint_table)); psp_rules.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject dtr_num = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject constraints = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (psp_rules.NIL == failP) {
                SubLObject csome_list_var = constraints;
                SubLObject constraint = (SubLObject)psp_rules.NIL;
                constraint = csome_list_var.first();
                while (psp_rules.NIL == failP && psp_rules.NIL != csome_list_var) {
                    if (psp_rules.NIL != psp_semantic_constraintP(constraint) && psp_rules.NIL != psp_edge_fails_constraintP(ConsesLow.nth(number_utilities.f_1_(dtr_num), dtrs), constraint, dtrs)) {
                        failP = (SubLObject)psp_rules.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    constraint = csome_list_var.first();
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_rules.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 15223L)
    public static SubLObject psp_edge_meets_syntax_constraintsP(final SubLObject edge, final SubLObject constraints, SubLObject mother, SubLObject traced_rule_fort) {
        if (mother == psp_rules.UNPROVIDED) {
            mother = (SubLObject)psp_rules.NIL;
        }
        if (traced_rule_fort == psp_rules.UNPROVIDED) {
            traced_rule_fort = (SubLObject)psp_rules.NIL;
        }
        if (constraints.eql((SubLObject)psp_rules.$kw109$UNKNOWN)) {
            return (SubLObject)psp_rules.T;
        }
        SubLObject failP = (SubLObject)psp_rules.NIL;
        if (psp_rules.NIL == failP) {
            SubLObject csome_list_var = constraints;
            SubLObject constraint = (SubLObject)psp_rules.NIL;
            constraint = csome_list_var.first();
            while (psp_rules.NIL == failP && psp_rules.NIL != csome_list_var) {
                if (psp_rules.NIL != psp_syntactic_constraintP(constraint) && psp_rules.NIL != psp_edge_fails_constraintP(edge, constraint, mother)) {
                    failP = (SubLObject)psp_rules.T;
                    if (psp_rules.NIL != traced_rule_fort) {
                        final SubLObject target = psp_constraint_target(constraint);
                        PrintLow.format((SubLObject)psp_rules.T, (SubLObject)psp_rules.$str110$___S___failed_constraint__S___S, new SubLObject[] { edge, psp_constraint_type(constraint), (psp_rules.NIL != set.set_p(target)) ? set.set_element_list(target) : target });
                    }
                }
                csome_list_var = csome_list_var.rest();
                constraint = csome_list_var.first();
            }
        }
        return Types.sublisp_null(failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 16092L)
    public static SubLObject psp_syntactic_constraintP(final SubLObject constraint) {
        return psp_syntactic_constraint_typeP(psp_constraint_type(constraint));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 16305L)
    public static SubLObject clear_psp_syntactic_constraint_types() {
        psp_rules.$psp_syntactic_constraint_types$.setGlobalValue((SubLObject)psp_rules.NIL);
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 16422L)
    public static SubLObject psp_syntactic_constraint_typeP(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (psp_rules.NIL == psp_rules.$psp_syntactic_constraint_types$.getGlobalValue()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                psp_rules.$psp_syntactic_constraint_types$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)psp_rules.$kw93$FRAME, kb_mapping_utilities.pred_values(psp_rules.$const112$PhraseStructureConstraint_Syntact, psp_rules.$const113$resultIsa, (SubLObject)psp_rules.TWO_INTEGER, (SubLObject)psp_rules.ONE_INTEGER, (SubLObject)psp_rules.UNPROVIDED)));
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return subl_promotions.memberP(type, psp_rules.$psp_syntactic_constraint_types$.getGlobalValue(), (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 16774L)
    public static SubLObject psp_semantic_constraintP(final SubLObject constraint) {
        return psp_semantic_constraint_typeP(psp_constraint_type(constraint));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 16984L)
    public static SubLObject clear_psp_semantic_constraint_types() {
        psp_rules.$psp_semantic_constraint_types$.setGlobalValue((SubLObject)psp_rules.NIL);
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 17099L)
    public static SubLObject psp_semantic_constraint_typeP(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (psp_rules.NIL == psp_rules.$psp_semantic_constraint_types$.getGlobalValue()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                psp_rules.$psp_semantic_constraint_types$.setGlobalValue(kb_mapping_utilities.pred_values(psp_rules.$const115$PhraseStructureConstraint_Semanti, psp_rules.$const113$resultIsa, (SubLObject)psp_rules.TWO_INTEGER, (SubLObject)psp_rules.ONE_INTEGER, (SubLObject)psp_rules.UNPROVIDED));
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return subl_promotions.memberP(type, psp_rules.$psp_semantic_constraint_types$.getGlobalValue(), (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 17483L)
    public static SubLObject clear_psp_cycl_fails_constraintP() {
        final SubLObject cs = psp_rules.$psp_cycl_fails_constraintP_caching_state$.getGlobalValue();
        if (psp_rules.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 17483L)
    public static SubLObject remove_psp_cycl_fails_constraintP(final SubLObject psp_cycl, final SubLObject constraint) {
        return memoization_state.caching_state_remove_function_results_with_args(psp_rules.$psp_cycl_fails_constraintP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(psp_cycl, constraint), (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 17483L)
    public static SubLObject psp_cycl_fails_constraintP_internal(final SubLObject psp_cycl, final SubLObject constraint) {
        SubLObject cycl = psp_semantics.psp_cycl_cycl(psp_cycl);
        SubLObject failP = (SubLObject)psp_rules.T;
        SubLObject c_type = (SubLObject)psp_rules.NIL;
        SubLObject target = (SubLObject)psp_rules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(constraint, constraint, (SubLObject)psp_rules.$list117);
        c_type = constraint.first();
        SubLObject current = constraint.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, constraint, (SubLObject)psp_rules.$list117);
        target = current.first();
        current = current.rest();
        if (psp_rules.NIL == current) {
            if (target.isList() && target.first() == psp_rules.$kw108$LIST) {
                SubLObject succeedP = (SubLObject)psp_rules.NIL;
                if (psp_rules.NIL == succeedP) {
                    SubLObject csome_list_var = target.rest();
                    SubLObject item = (SubLObject)psp_rules.NIL;
                    item = csome_list_var.first();
                    while (psp_rules.NIL == succeedP && psp_rules.NIL != csome_list_var) {
                        if (psp_rules.NIL == psp_cycl_fails_constraintP(cycl, (SubLObject)ConsesLow.list(c_type, item))) {
                            succeedP = (SubLObject)psp_rules.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        item = csome_list_var.first();
                    }
                }
                failP = (SubLObject)SubLObjectFactory.makeBoolean(psp_rules.NIL == succeedP);
            }
            else {
                cycl = parsing_utilities.strip_nl_tags(cycl, (SubLObject)psp_rules.UNPROVIDED);
                target = parsing_utilities.strip_nl_tags(target, (SubLObject)psp_rules.UNPROVIDED);
                final SubLObject pcase_var = c_type;
                if (pcase_var.eql(psp_rules.$const118$PSRuleIsaConstraintFn)) {
                    failP = (SubLObject)SubLObjectFactory.makeBoolean(psp_rules.NIL == psp_isaP(cycl, target));
                }
                else if (pcase_var.eql(psp_rules.$const119$PSRuleGenlsConstraintFn)) {
                    failP = (SubLObject)SubLObjectFactory.makeBoolean(psp_rules.NIL == psp_genlP(cycl, target));
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(constraint, (SubLObject)psp_rules.$list117);
        }
        return failP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 17483L)
    public static SubLObject psp_cycl_fails_constraintP(final SubLObject psp_cycl, final SubLObject constraint) {
        SubLObject caching_state = psp_rules.$psp_cycl_fails_constraintP_caching_state$.getGlobalValue();
        if (psp_rules.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_rules.$sym116$PSP_CYCL_FAILS_CONSTRAINT_, (SubLObject)psp_rules.$sym120$_PSP_CYCL_FAILS_CONSTRAINT__CACHING_STATE_, (SubLObject)psp_rules.NIL, (SubLObject)psp_rules.EQUAL, (SubLObject)psp_rules.TWO_INTEGER, (SubLObject)psp_rules.$int121$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(psp_cycl, constraint);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)psp_rules.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)psp_rules.NIL;
            collision = cdolist_list_var.first();
            while (psp_rules.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (psp_cycl.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (psp_rules.NIL != cached_args && psp_rules.NIL == cached_args.rest() && constraint.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_cycl_fails_constraintP_internal(psp_cycl, constraint)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(psp_cycl, constraint));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 18222L)
    public static SubLObject psp_edge_fails_constraintP(final SubLObject edge, final SubLObject constraint, final SubLObject mother) {
        final SubLObject edge_is_gapP = Equality.eq(edge, (SubLObject)psp_rules.$kw122$GAP);
        if (psp_rules.NIL != edge_is_gapP && psp_rules.NIL == psp_chart.psp_gap_allowedP()) {
            return (SubLObject)psp_rules.T;
        }
        SubLObject c_type = (SubLObject)psp_rules.NIL;
        SubLObject target = (SubLObject)psp_rules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(constraint, constraint, (SubLObject)psp_rules.$list117);
        c_type = constraint.first();
        SubLObject current = constraint.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, constraint, (SubLObject)psp_rules.$list117);
        target = current.first();
        current = current.rest();
        if (psp_rules.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(constraint, (SubLObject)psp_rules.$list117);
            return (SubLObject)psp_rules.NIL;
        }
        final SubLObject pcase_var = c_type;
        if (pcase_var.eql(psp_rules.$const91$ConstituentTypeConstraintFn)) {
            if (psp_rules.NIL != psp_lexeme_constraintP(target)) {
                return psp_edge_fails_lexeme_constraintP(edge, target);
            }
            final SubLObject edge_cat = (psp_rules.NIL != edge_is_gapP) ? psp_chart.psp_allowed_gap_category() : psp_chart.get_psp_edge_category(edge);
            if (psp_rules.NIL != psp_chart.psp_pp_gap_allowedP() && psp_rules.NIL != psp_constraint_target_includesP(target, psp_rules.$const123$PrepositionalPhrase, (SubLObject)psp_rules.UNPROVIDED)) {
                return (SubLObject)psp_rules.NIL;
            }
            if (psp_rules.NIL != psp_constraint_target_includesP(target, edge_cat, (SubLObject)psp_rules.UNPROVIDED)) {
                return (SubLObject)psp_rules.NIL;
            }
            return (SubLObject)psp_rules.T;
        }
        else {
            if (pcase_var.eql(psp_rules.$const124$DetNbarAgrConstraintFn)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(psp_rules.NIL != edge_is_gapP || psp_rules.NIL == psp_det_nbar_agreeP(edge, target, mother));
            }
            if (pcase_var.eql(psp_rules.$const92$POSPredConstraintFn)) {
                final SubLObject failsP = (SubLObject)SubLObjectFactory.makeBoolean(psp_rules.NIL == edge_is_gapP && psp_rules.NIL == psp_constraint_target_includesP(target, psp_chart.get_psp_edge_pos_pred(edge), (SubLObject)psp_rules.UNPROVIDED));
                return failsP;
            }
            if (!pcase_var.eql((SubLObject)psp_rules.$kw93$FRAME)) {
                return (SubLObject)psp_rules.T;
            }
            if (psp_rules.NIL != edge_is_gapP) {
                return (SubLObject)psp_rules.NIL;
            }
            final SubLObject lexical_head_dtr = psp_chart.psp_edge_lexical_head_dtr(edge);
            final SubLObject edge_frame = (SubLObject)((psp_rules.NIL != lexical_head_dtr) ? psp_chart.get_psp_edge_frame(lexical_head_dtr) : psp_rules.NIL);
            return (SubLObject)SubLObjectFactory.makeBoolean(psp_rules.NIL == psp_constraint_target_includesP(target, edge_frame, (SubLObject)psp_rules.UNPROVIDED));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 19573L)
    public static SubLObject clear_psp_phrase_types() {
        final SubLObject cs = psp_rules.$psp_phrase_types_caching_state$.getGlobalValue();
        if (psp_rules.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 19573L)
    public static SubLObject remove_psp_phrase_types(SubLObject mt) {
        if (mt == psp_rules.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_rules.UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args(psp_rules.$psp_phrase_types_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mt), (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 19573L)
    public static SubLObject psp_phrase_types_internal(final SubLObject mt) {
        return genls.all_specs(psp_rules.$const126$NLPhrase, mt, (SubLObject)psp_rules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 19573L)
    public static SubLObject psp_phrase_types(SubLObject mt) {
        if (mt == psp_rules.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_rules.UNPROVIDED);
        }
        SubLObject caching_state = psp_rules.$psp_phrase_types_caching_state$.getGlobalValue();
        if (psp_rules.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_rules.$sym125$PSP_PHRASE_TYPES, (SubLObject)psp_rules.$sym127$_PSP_PHRASE_TYPES_CACHING_STATE_, (SubLObject)psp_rules.NIL, (SubLObject)psp_rules.EQUAL, (SubLObject)psp_rules.ONE_INTEGER, (SubLObject)psp_rules.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_phrase_types_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)psp_rules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 19702L)
    public static SubLObject psp_constraints_require_phraseP_internal(final SubLObject constraints) {
        SubLObject ans = (SubLObject)psp_rules.NIL;
        if (psp_rules.NIL == ans) {
            SubLObject csome_list_var = constraints;
            SubLObject constraint = (SubLObject)psp_rules.NIL;
            constraint = csome_list_var.first();
            while (psp_rules.NIL == ans && psp_rules.NIL != csome_list_var) {
                SubLObject current;
                final SubLObject datum = current = constraint;
                SubLObject c_type = (SubLObject)psp_rules.NIL;
                SubLObject target = (SubLObject)psp_rules.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list117);
                c_type = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list117);
                target = current.first();
                current = current.rest();
                if (psp_rules.NIL == current) {
                    if (c_type.eql(psp_rules.$const91$ConstituentTypeConstraintFn) && psp_rules.NIL == ans) {
                        SubLObject csome_list_var_$42;
                        SubLObject phrase_type;
                        for (csome_list_var_$42 = psp_phrase_types((SubLObject)psp_rules.UNPROVIDED), phrase_type = (SubLObject)psp_rules.NIL, phrase_type = csome_list_var_$42.first(); psp_rules.NIL == ans && psp_rules.NIL != csome_list_var_$42; ans = set.set_memberP(phrase_type, target), csome_list_var_$42 = csome_list_var_$42.rest(), phrase_type = csome_list_var_$42.first()) {}
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_rules.$list117);
                }
                csome_list_var = csome_list_var.rest();
                constraint = csome_list_var.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 19702L)
    public static SubLObject psp_constraints_require_phraseP(final SubLObject constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)psp_rules.NIL;
        if (psp_rules.NIL == v_memoization_state) {
            return psp_constraints_require_phraseP_internal(constraints);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)psp_rules.$sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_, (SubLObject)psp_rules.UNPROVIDED);
        if (psp_rules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)psp_rules.$sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_, (SubLObject)psp_rules.ONE_INTEGER, (SubLObject)psp_rules.NIL, (SubLObject)psp_rules.EQUAL, (SubLObject)psp_rules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)psp_rules.$sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, constraints, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_constraints_require_phraseP_internal(constraints)));
            memoization_state.caching_state_put(caching_state, constraints, results, (SubLObject)psp_rules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 20072L)
    public static SubLObject psp_edge_fails_lexeme_constraintP(final SubLObject edge, final SubLObject target) {
        final SubLObject target_wu = cycl_utilities.nat_arg3(set.set_element_list(target).first(), (SubLObject)psp_rules.UNPROVIDED);
        if (psp_rules.NIL != psp_chart.psp_pp_gap_allowedP()) {
            final SubLObject gap_string = psp_chart.psp_pp_gap_string();
            SubLObject csome_list_var = lexicon_accessors.words_of_stringXspeech_part(gap_string, psp_rules.$const129$Preposition, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
            SubLObject wu = (SubLObject)psp_rules.NIL;
            wu = csome_list_var.first();
            while (psp_rules.NIL != csome_list_var) {
                if (wu.equal(target_wu)) {
                    return (SubLObject)psp_rules.NIL;
                }
                csome_list_var = csome_list_var.rest();
                wu = csome_list_var.first();
            }
            return (SubLObject)psp_rules.T;
        }
        if (edge == psp_rules.$kw122$GAP) {
            return (SubLObject)psp_rules.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_rules.NIL == psp_edge_has_wuP(edge, target_wu));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 20505L)
    public static SubLObject psp_lexeme_constraintP(final SubLObject target) {
        SubLObject successP = (SubLObject)psp_rules.NIL;
        final SubLObject set_contents_var = set.do_set_internal(target);
        SubLObject basis_object;
        SubLObject state;
        SubLObject target_cycl;
        SubLObject failP;
        SubLObject arg;
        SubLObject arg_$43;
        SubLObject target_arg;
        SubLObject target_arg_$44;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)psp_rules.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); psp_rules.NIL == successP && psp_rules.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            target_cycl = set_contents.do_set_contents_next(basis_object, state);
            if (psp_rules.NIL != set_contents.do_set_contents_element_validP(state, target_cycl) && psp_rules.NIL != el_utilities.possibly_naut_p(target_cycl)) {
                failP = (SubLObject)psp_rules.NIL;
                if (psp_rules.NIL == failP) {
                    arg = (SubLObject)psp_rules.NIL;
                    arg_$43 = (SubLObject)psp_rules.NIL;
                    target_arg = (SubLObject)psp_rules.NIL;
                    target_arg_$44 = (SubLObject)psp_rules.NIL;
                    arg = target_cycl;
                    arg_$43 = arg.first();
                    target_arg = (SubLObject)psp_rules.$list130;
                    target_arg_$44 = target_arg.first();
                    while (psp_rules.NIL == failP && (psp_rules.NIL != target_arg || psp_rules.NIL != arg)) {
                        if (psp_rules.NIL != target_arg_$44) {
                            if (!arg_$43.eql(target_arg_$44)) {
                                failP = (SubLObject)psp_rules.T;
                            }
                        }
                        arg = arg.rest();
                        arg_$43 = arg.first();
                        target_arg = target_arg.rest();
                        target_arg_$44 = target_arg.first();
                    }
                }
                successP = (SubLObject)SubLObjectFactory.makeBoolean(psp_rules.NIL == failP);
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 21065L)
    public static SubLObject psp_frame_specific_constituent_typeP(final SubLObject target_element) {
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_rules.NIL != el_utilities.possibly_nat_p(target_element) && psp_rules.NIL != conses_high.member(cycl_utilities.nat_functor(target_element), (SubLObject)psp_rules.$list131, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 21358L)
    public static SubLObject psp_frame_type_from_constituent_type(final SubLObject constituent_type) {
        return cycl_utilities.nat_arg2(constituent_type, (SubLObject)psp_rules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 21468L)
    public static SubLObject psp_constraint_target_includesP(final SubLObject target_set, final SubLObject item, SubLObject key) {
        if (key == psp_rules.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)psp_rules.IDENTITY);
        }
        if (key.eql(Symbols.symbol_function((SubLObject)psp_rules.IDENTITY))) {
            return set.set_memberP(item, target_set);
        }
        final SubLObject test_fn = set.set_test(target_set);
        final SubLObject set_contents_var = set.do_set_internal(target_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject target_element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)psp_rules.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); psp_rules.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            target_element = set_contents.do_set_contents_next(basis_object, state);
            if (psp_rules.NIL != set_contents.do_set_contents_element_validP(state, target_element) && psp_rules.NIL != Functions.funcall(test_fn, item, Functions.funcall(key, target_element))) {
                return (SubLObject)psp_rules.T;
            }
        }
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 21925L)
    public static SubLObject psp_edge_has_wuP(final SubLObject edge, final SubLObject wu) {
        return Equality.eq(psp_chart.get_psp_edge_wu(edge), wu);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 22009L)
    public static SubLObject psp_det_nbar_agreeP(final SubLObject nbar_edge, final SubLObject target, final SubLObject mother) {
        final SubLObject nbar_pos_pred = psp_chart.get_psp_edge_pos_pred(nbar_edge);
        final SubLObject old_dtrs = (SubLObject)((psp_rules.NIL != mother) ? psp_chart.psp_edge_dtrs(mother) : psp_rules.NIL);
        final SubLObject detp_edge = ConsesLow.nth(number_utilities.f_1_(target), old_dtrs);
        final SubLObject det_edge = psp_chart.psp_edge_lexical_head_dtr(detp_edge);
        final SubLObject det_string = psp_chart.get_psp_edge_string(det_edge);
        SubLObject ok_preds = lexicon_accessors.agr_of_det_string(det_string);
        if (psp_rules.NIL != lexicon_vars.name_string_predP(nbar_pos_pred)) {
            SubLObject csome_list_var = psp_semantics.psp_semantics_for_edge(nbar_edge, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
            SubLObject denot = (SubLObject)psp_rules.NIL;
            denot = csome_list_var.first();
            while (psp_rules.NIL != csome_list_var) {
                if (psp_rules.NIL != rbp_wff.npp_collectionP(parsing_utilities.strip_nl_tags(denot, (SubLObject)psp_rules.UNPROVIDED))) {
                    return (SubLObject)psp_rules.T;
                }
                csome_list_var = csome_list_var.rest();
                denot = csome_list_var.first();
            }
            return (SubLObject)psp_rules.NIL;
        }
        if (psp_rules.NIL == ok_preds) {
            if (psp_rules.NIL != psp_semantics.psp_genl_posP(psp_chart.get_psp_edge_category(det_edge), psp_rules.$const132$Number_SP, (SubLObject)psp_rules.UNPROVIDED)) {
                final SubLObject denots = psp_semantics.psp_semantics_for_edge(det_edge, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
                if (psp_rules.NIL == ok_preds) {
                    SubLObject csome_list_var2 = denots;
                    SubLObject denot2 = (SubLObject)psp_rules.NIL;
                    denot2 = csome_list_var2.first();
                    while (psp_rules.NIL == ok_preds && psp_rules.NIL != csome_list_var2) {
                        final SubLObject denot_cycl = psp_semantics.psp_cycl_cycl(denot2);
                        if (psp_rules.NIL != parsing_utilities.determiner_number_denotP(denot_cycl)) {
                            ok_preds = parsing_utilities.agr_preds_for_number(denot_cycl);
                        }
                        csome_list_var2 = csome_list_var2.rest();
                        denot2 = csome_list_var2.first();
                    }
                }
            }
            else {
                ok_preds = (SubLObject)psp_rules.$list133;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(psp_rules.NIL != forts.fort_p(nbar_pos_pred) && psp_rules.NIL != conses_high.member(nbar_pos_pred, ok_preds, (SubLObject)psp_rules.$sym134$GENL_POS_PRED_, (SubLObject)psp_rules.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 23359L)
    public static SubLObject psp_valid_constituent_typeP(final SubLObject type, final SubLObject target) {
        return set.set_memberP(psp_rewrite(type), psp_sub_categories(target));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 23540L)
    public static SubLObject clear_psp_sub_categories() {
        final SubLObject cs = psp_rules.$psp_sub_categories_caching_state$.getGlobalValue();
        if (psp_rules.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 23540L)
    public static SubLObject remove_psp_sub_categories(final SubLObject target) {
        return memoization_state.caching_state_remove_function_results_with_args(psp_rules.$psp_sub_categories_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(target), (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 23540L)
    public static SubLObject psp_sub_categories_internal(final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject core_type = psp_simplify_if_frame_specific_type(target);
        final SubLObject category = psp_rewrite(core_type);
        final SubLObject ans = set.new_set(Symbols.symbol_function((SubLObject)psp_rules.EQUAL), (SubLObject)psp_rules.$int136$32);
        if (psp_rules.NIL != forts.fort_p(category)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)psp_rules.$sym66$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(psp_rules.$const67$EverythingPSC, thread);
                SubLObject cdolist_list_var = genls.all_specs(category, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
                SubLObject spec = (SubLObject)psp_rules.NIL;
                spec = cdolist_list_var.first();
                while (psp_rules.NIL != cdolist_list_var) {
                    spec = psp_simplify_if_frame_specific_type(spec);
                    set.set_add(spec, ans);
                    if (psp_rules.NIL != nart_handles.nart_p(spec)) {
                        set.set_add(function_terms.nart_to_naut(spec), ans);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    spec = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        set.set_add(target, ans);
        if (psp_rules.NIL != el_utilities.possibly_naut_p(core_type)) {
            final SubLObject nart = function_terms.naut_to_nart(core_type);
            if (psp_rules.NIL != nart_handles.nart_p(nart)) {
                set.set_add(nart, ans);
            }
        }
        if (psp_rules.NIL != el_utilities.possibly_naut_p(target)) {
            final SubLObject nart = function_terms.naut_to_nart(target);
            if (psp_rules.NIL != nart_handles.nart_p(nart)) {
                set.set_add(nart, ans);
            }
        }
        if (psp_rules.NIL != nart_handles.nart_p(target)) {
            set.set_add(function_terms.nart_to_naut(target), ans);
        }
        set.set_add(core_type, ans);
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 23540L)
    public static SubLObject psp_sub_categories(final SubLObject target) {
        SubLObject caching_state = psp_rules.$psp_sub_categories_caching_state$.getGlobalValue();
        if (psp_rules.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_rules.$sym135$PSP_SUB_CATEGORIES, (SubLObject)psp_rules.$sym137$_PSP_SUB_CATEGORIES_CACHING_STATE_, (SubLObject)psp_rules.NIL, (SubLObject)psp_rules.EQUAL, (SubLObject)psp_rules.ONE_INTEGER, (SubLObject)psp_rules.$int39$128);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, target, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_sub_categories_internal(target)));
            memoization_state.caching_state_put(caching_state, target, results, (SubLObject)psp_rules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24398L)
    public static SubLObject psp_simplify_if_frame_specific_type(final SubLObject type) {
        return (psp_rules.NIL != psp_frame_specific_constituent_typeP(type)) ? cycl_utilities.nat_arg1(type, (SubLObject)psp_rules.UNPROVIDED) : type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24592L)
    public static SubLObject clear_psp_sub_pos_preds() {
        final SubLObject cs = psp_rules.$psp_sub_pos_preds_caching_state$.getGlobalValue();
        if (psp_rules.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24592L)
    public static SubLObject remove_psp_sub_pos_preds(final SubLObject target, SubLObject mt) {
        if (mt == psp_rules.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_rules.UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args(psp_rules.$psp_sub_pos_preds_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(target, mt), (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24592L)
    public static SubLObject psp_sub_pos_preds_internal(final SubLObject target, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = set.new_set(Symbols.symbol_function((SubLObject)psp_rules.EQ), (SubLObject)psp_rules.$int139$64);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = genl_predicates.all_spec_predicates(target, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
            SubLObject spec_pred = (SubLObject)psp_rules.NIL;
            spec_pred = cdolist_list_var.first();
            while (psp_rules.NIL != cdolist_list_var) {
                set.set_add(spec_pred, ans);
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24592L)
    public static SubLObject psp_sub_pos_preds(final SubLObject target, SubLObject mt) {
        if (mt == psp_rules.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_rules.UNPROVIDED);
        }
        SubLObject caching_state = psp_rules.$psp_sub_pos_preds_caching_state$.getGlobalValue();
        if (psp_rules.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_rules.$sym138$PSP_SUB_POS_PREDS, (SubLObject)psp_rules.$sym140$_PSP_SUB_POS_PREDS_CACHING_STATE_, (SubLObject)psp_rules.NIL, (SubLObject)psp_rules.EQUAL, (SubLObject)psp_rules.TWO_INTEGER, (SubLObject)psp_rules.$int39$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(target, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)psp_rules.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)psp_rules.NIL;
            collision = cdolist_list_var.first();
            while (psp_rules.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (target.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (psp_rules.NIL != cached_args && psp_rules.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_sub_pos_preds_internal(target, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(target, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24946L)
    public static SubLObject clear_psp_frame_type_instances() {
        final SubLObject cs = psp_rules.$psp_frame_type_instances_caching_state$.getGlobalValue();
        if (psp_rules.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24946L)
    public static SubLObject remove_psp_frame_type_instances(final SubLObject target, SubLObject mt) {
        if (mt == psp_rules.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_rules.UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args(psp_rules.$psp_frame_type_instances_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(target, mt), (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24946L)
    public static SubLObject psp_frame_type_instances_internal(final SubLObject target, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = set.new_set(Symbols.symbol_function((SubLObject)psp_rules.EQUAL), (SubLObject)psp_rules.$int139$64);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = isa.all_fort_instances(target, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
            SubLObject frame = (SubLObject)psp_rules.NIL;
            frame = cdolist_list_var.first();
            while (psp_rules.NIL != cdolist_list_var) {
                set.set_add(frame, ans);
                cdolist_list_var = cdolist_list_var.rest();
                frame = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 24946L)
    public static SubLObject psp_frame_type_instances(final SubLObject target, SubLObject mt) {
        if (mt == psp_rules.UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_rules.UNPROVIDED);
        }
        SubLObject caching_state = psp_rules.$psp_frame_type_instances_caching_state$.getGlobalValue();
        if (psp_rules.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_rules.$sym141$PSP_FRAME_TYPE_INSTANCES, (SubLObject)psp_rules.$sym142$_PSP_FRAME_TYPE_INSTANCES_CACHING_STATE_, (SubLObject)psp_rules.NIL, (SubLObject)psp_rules.EQUAL, (SubLObject)psp_rules.TWO_INTEGER, (SubLObject)psp_rules.$int39$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(target, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)psp_rules.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)psp_rules.NIL;
            collision = cdolist_list_var.first();
            while (psp_rules.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (target.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (psp_rules.NIL != cached_args && psp_rules.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_frame_type_instances_internal(target, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(target, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25245L)
    public static SubLObject clear_psp_rewrite() {
        final SubLObject cs = psp_rules.$psp_rewrite_caching_state$.getGlobalValue();
        if (psp_rules.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25245L)
    public static SubLObject remove_psp_rewrite(final SubLObject obj) {
        return memoization_state.caching_state_remove_function_results_with_args(psp_rules.$psp_rewrite_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(obj), (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25245L)
    public static SubLObject psp_rewrite_internal(SubLObject obj) {
        if (psp_rules.NIL != term.nautP(obj, (SubLObject)psp_rules.UNPROVIDED)) {
            final SubLObject nart = narts_high.find_nart(obj);
            obj = ((psp_rules.NIL != nart) ? nart : obj);
        }
        if (psp_rules.NIL == nart_handles.nart_p(obj)) {
            return obj;
        }
        final SubLObject rewrite = kb_mapping_utilities.fpred_value_in_any_mt(obj, psp_rules.$const144$rewriteOf, (SubLObject)psp_rules.TWO_INTEGER, (SubLObject)psp_rules.ONE_INTEGER, (SubLObject)psp_rules.UNPROVIDED);
        return (psp_rules.NIL != rewrite) ? rewrite : obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25245L)
    public static SubLObject psp_rewrite(final SubLObject obj) {
        SubLObject caching_state = psp_rules.$psp_rewrite_caching_state$.getGlobalValue();
        if (psp_rules.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)psp_rules.$sym143$PSP_REWRITE, (SubLObject)psp_rules.$sym145$_PSP_REWRITE_CACHING_STATE_, (SubLObject)psp_rules.NIL, (SubLObject)psp_rules.EQUAL, (SubLObject)psp_rules.ONE_INTEGER, (SubLObject)psp_rules.$int121$256);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_rewrite_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, (SubLObject)psp_rules.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25582L)
    public static SubLObject psp_isaP_internal(final SubLObject obj, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)psp_rules.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)psp_rules.$sym66$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(psp_rules.$const67$EverythingPSC, thread);
            ans = at_defns.quick_quiet_has_typeP(parsing_utilities.strip_nl_tags(obj, (SubLObject)psp_rules.UNPROVIDED), col, (SubLObject)psp_rules.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25582L)
    public static SubLObject psp_isaP(final SubLObject obj, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)psp_rules.NIL;
        if (psp_rules.NIL == v_memoization_state) {
            return psp_isaP_internal(obj, col);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)psp_rules.$sym146$PSP_ISA_, (SubLObject)psp_rules.UNPROVIDED);
        if (psp_rules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)psp_rules.$sym146$PSP_ISA_, (SubLObject)psp_rules.TWO_INTEGER, (SubLObject)psp_rules.NIL, (SubLObject)psp_rules.EQUAL, (SubLObject)psp_rules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)psp_rules.$sym146$PSP_ISA_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(obj, col);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)psp_rules.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)psp_rules.NIL;
            collision = cdolist_list_var.first();
            while (psp_rules.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (obj.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (psp_rules.NIL != cached_args && psp_rules.NIL == cached_args.rest() && col.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_isaP_internal(obj, col)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(obj, col));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25785L)
    public static SubLObject psp_genlP_internal(final SubLObject type1, final SubLObject type2) {
        return rbp_wff.npp_genlP(type1, type2, (SubLObject)psp_rules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25785L)
    public static SubLObject psp_genlP(final SubLObject type1, final SubLObject type2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)psp_rules.NIL;
        if (psp_rules.NIL == v_memoization_state) {
            return psp_genlP_internal(type1, type2);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)psp_rules.$sym147$PSP_GENL_, (SubLObject)psp_rules.UNPROVIDED);
        if (psp_rules.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)psp_rules.$sym147$PSP_GENL_, (SubLObject)psp_rules.TWO_INTEGER, (SubLObject)psp_rules.NIL, (SubLObject)psp_rules.EQUAL, (SubLObject)psp_rules.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)psp_rules.$sym147$PSP_GENL_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(type1, type2);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)psp_rules.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)psp_rules.NIL;
            collision = cdolist_list_var.first();
            while (psp_rules.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (type1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (psp_rules.NIL != cached_args && psp_rules.NIL == cached_args.rest() && type2.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(psp_genlP_internal(type1, type2)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(type1, type2));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 25877L)
    public static SubLObject psp_rule_new_dtr_constraints(final SubLObject rule, final SubLObject frame) {
        if (psp_rules.NIL != psp_rule_arity(rule)) {
            SubLObject new_dtr_constraint_stack = (SubLObject)psp_rules.NIL;
            SubLObject cdotimes_end_var;
            SubLObject n;
            for (cdotimes_end_var = psp_rule_arity(rule), n = (SubLObject)psp_rules.NIL, n = (SubLObject)psp_rules.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)psp_rules.ONE_INTEGER)) {
                if (!n.isZero()) {
                    new_dtr_constraint_stack = (SubLObject)ConsesLow.cons(psp_constraints_on_dtr(number_utilities.f_1X(n), psp_rule_constraints(rule)), new_dtr_constraint_stack);
                }
            }
            return Sequences.reverse(new_dtr_constraint_stack);
        }
        return (SubLObject)((psp_rules.NIL != frame) ? psp_new_dtr_constraints_from_frame(frame) : psp_rules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 26607L)
    public static SubLObject psp_new_dtr_constraints_from_frame(final SubLObject frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (frame == psp_rules.$kw109$UNKNOWN) {
            return (SubLObject)psp_rules.$kw109$UNKNOWN;
        }
        final SubLObject active_frame = (psp_rules.NIL != psp_chart.psp_passive_frameP(frame)) ? psp_chart.psp_active_frame(frame) : frame;
        SubLObject ndc_stack = (SubLObject)psp_rules.NIL;
        final SubLObject v_arity = lexicon_accessors.subcat_frame_arity(active_frame);
        SubLObject ndc_alist = (SubLObject)psp_rules.NIL;
        if (v_arity.isInteger()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt((SubLObject)psp_rules.UNPROVIDED));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var;
                final SubLObject constraints = cdolist_list_var = psp_constraints_for_frame(active_frame);
                SubLObject active_constraint = (SubLObject)psp_rules.NIL;
                active_constraint = cdolist_list_var.first();
                while (psp_rules.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = active_constraint;
                    SubLObject n = (SubLObject)psp_rules.NIL;
                    SubLObject target = (SubLObject)psp_rules.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list148);
                    n = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)psp_rules.$list148);
                    target = current.first();
                    current = current.rest();
                    if (psp_rules.NIL == current) {
                        SubLObject constraint = (SubLObject)psp_rules.NIL;
                        SubLObject existing = conses_high.assoc(n, ndc_alist, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
                        if (psp_rules.NIL != lexicon_accessors.speech_part_predP(target, (SubLObject)psp_rules.UNPROVIDED)) {
                            constraint = psp_new_constraint(psp_rules.$const92$POSPredConstraintFn, psp_sub_pos_preds(target, (SubLObject)psp_rules.UNPROVIDED));
                        }
                        else {
                            constraint = psp_new_constraint(psp_rules.$const91$ConstituentTypeConstraintFn, psp_sub_categories(target));
                        }
                        ndc_alist = Sequences.delete(existing, ndc_alist, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
                        if (psp_rules.NIL != existing) {
                            if (psp_rules.NIL == subl_promotions.memberP(constraint, existing.rest(), (SubLObject)psp_rules.$sym149$PSP_SPEC_CONST_CONSTRAINT_, (SubLObject)psp_rules.UNPROVIDED)) {
                                ConsesLow.rplacd(existing, (SubLObject)ConsesLow.cons(constraint, existing.rest()));
                            }
                        }
                        else {
                            existing = (SubLObject)ConsesLow.cons(n, (SubLObject)ConsesLow.list(constraint));
                        }
                        ndc_alist = (SubLObject)ConsesLow.cons(existing, ndc_alist);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)psp_rules.$list148);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    active_constraint = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            SubLObject n2;
            for (n2 = (SubLObject)psp_rules.NIL, n2 = (SubLObject)psp_rules.ZERO_INTEGER; n2.numL(v_arity); n2 = Numbers.add(n2, (SubLObject)psp_rules.ONE_INTEGER)) {
                if (psp_rules.NIL == psp_passivized_dtrP(n2, frame)) {
                    ndc_stack = (SubLObject)ConsesLow.cons(conses_high.assoc(number_utilities.f_1X(n2), ndc_alist, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED).rest(), ndc_stack);
                }
            }
        }
        if (psp_rules.NIL != psp_chart.psp_passive_frameP(frame) && frame.first() == psp_rules.$kw150$PASSIVE_WITH_BY) {
            ndc_stack = psp_add_by_phrase_constraints(ndc_stack);
        }
        return Sequences.reverse(ndc_stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 28120L)
    public static SubLObject psp_add_by_phrase_constraints(SubLObject stack) {
        stack = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(psp_rules.$const91$ConstituentTypeConstraintFn, psp_sub_categories((SubLObject)psp_rules.$list151))), stack);
        stack = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(psp_rules.$const91$ConstituentTypeConstraintFn, psp_sub_categories(psp_rules.$const152$NounPhrase))), stack);
        return stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 28444L)
    public static SubLObject psp_passivized_dtrP(final SubLObject n, final SubLObject frame) {
        if (!n.isInteger() || !n.numL((SubLObject)psp_rules.TWO_INTEGER) || psp_rules.NIL == psp_chart.psp_passive_frameP(frame)) {
            return (SubLObject)psp_rules.NIL;
        }
        final SubLObject active_frame = psp_chart.psp_active_frame(frame);
        final SubLObject dtr_num = psp_chart.psp_passivized_dtr_num(active_frame, (SubLObject)psp_rules.UNPROVIDED);
        return (SubLObject)(dtr_num.isInteger() ? Numbers.numE(n, Numbers.subtract(dtr_num, (SubLObject)psp_rules.TWO_INTEGER)) : psp_rules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 28911L)
    public static SubLObject psp_constraints_for_frame(final SubLObject frame) {
        SubLObject pairs = kb_mapping_utilities.pred_value_tuples(frame, psp_rules.$const153$subcatFrameDependentConstraint, (SubLObject)psp_rules.ONE_INTEGER, (SubLObject)psp_rules.$list154, (SubLObject)psp_rules.UNPROVIDED);
        if (psp_rules.NIL != nart_handles.nart_p(frame) && cycl_utilities.nat_function(frame).eql(psp_rules.$const155$PPCompFrameFn)) {
            final SubLObject wu = cycl_utilities.nat_arg2(frame, (SubLObject)psp_rules.UNPROVIDED);
            final SubLObject pcase_var = cycl_utilities.nat_arg1(frame, (SubLObject)psp_rules.UNPROVIDED);
            if (pcase_var.eql(psp_rules.$const156$TransitivePPFrameType)) {
                pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)psp_rules.ONE_INTEGER, (SubLObject)ConsesLow.list(psp_rules.$const157$SubcollectionOfWithRelationToFn, psp_rules.$const158$NLWordForm, psp_rules.$const159$lexemeOfWordForm, wu)), pairs);
            }
            else if (pcase_var.eql(psp_rules.$const160$DitransitivePPFrameType)) {
                pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)psp_rules.TWO_INTEGER, (SubLObject)ConsesLow.list(psp_rules.$const157$SubcollectionOfWithRelationToFn, psp_rules.$const158$NLWordForm, psp_rules.$const159$lexemeOfWordForm, wu)), pairs);
            }
        }
        return pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 29568L)
    public static SubLObject psp_spec_const_constraintP(final SubLObject c1, final SubLObject c2) {
        SubLObject c1_type = (SubLObject)psp_rules.NIL;
        SubLObject c1_target = (SubLObject)psp_rules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(c1, c1, (SubLObject)psp_rules.$list161);
        c1_type = c1.first();
        SubLObject current = c1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, c1, (SubLObject)psp_rules.$list161);
        c1_target = current.first();
        current = current.rest();
        if (psp_rules.NIL == current) {
            SubLObject c2_type = (SubLObject)psp_rules.NIL;
            SubLObject c2_target = (SubLObject)psp_rules.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(c2, c2, (SubLObject)psp_rules.$list162);
            c2_type = c2.first();
            SubLObject current_$46 = c2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$46, c2, (SubLObject)psp_rules.$list162);
            c2_target = current_$46.first();
            current_$46 = current_$46.rest();
            if (psp_rules.NIL == current_$46) {
                return (SubLObject)SubLObjectFactory.makeBoolean(c1_type.eql(c2_type) && psp_rules.NIL != set_utilities.set_subsetP(c1_target, c2_target));
            }
            cdestructuring_bind.cdestructuring_bind_error(c2, (SubLObject)psp_rules.$list162);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(c1, (SubLObject)psp_rules.$list161);
        }
        return (SubLObject)psp_rules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 29851L)
    public static SubLObject psp_find_dtr_frame_type(final SubLObject rule, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject frame_type = (SubLObject)psp_rules.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject rule_fort = psp_rule_fort(rule);
            final SubLObject raw_constraints = kb_mapping_utilities.pred_values(rule_fort, psp_rules.$const63$psRuleConstraint, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED, (SubLObject)psp_rules.UNPROVIDED);
            if (psp_rules.NIL == frame_type) {
                SubLObject csome_list_var = raw_constraints;
                SubLObject constraint = (SubLObject)psp_rules.NIL;
                constraint = csome_list_var.first();
                while (psp_rules.NIL == frame_type && psp_rules.NIL != csome_list_var) {
                    if (cycl_utilities.nat_arg1(constraint, (SubLObject)psp_rules.UNPROVIDED).eql(n) && psp_rules.NIL != psp_frame_specific_raw_constraintP(constraint)) {
                        frame_type = psp_frame_type_from_constituent_type(cycl_utilities.nat_arg2(constraint, (SubLObject)psp_rules.UNPROVIDED));
                    }
                    csome_list_var = csome_list_var.rest();
                    constraint = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return frame_type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 35782L)
    public static SubLObject psp_parse_tree_for_edge(final SubLObject edge) {
        if (psp_rules.NIL != psp_chart.psp_phrasal_edgeP(edge)) {
            return (SubLObject)ConsesLow.cons(psp_chart.psp_edge_rule_fort(edge), Mapping.mapcar((SubLObject)psp_rules.$sym163$PSP_PARSE_TREE_FOR_EDGE, psp_chart.psp_edge_dtrs(edge)));
        }
        return (SubLObject)ConsesLow.list(psp_chart.get_psp_edge_category(edge), psp_chart.get_psp_edge_string(edge));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-rules.lisp", position = 36162L)
    public static SubLObject clear_psp_rules_caches() {
        clear_psp_cycl_fails_constraintP();
        clear_psp_sub_categories();
        clear_psp_sub_pos_preds();
        clear_psp_phrase_types();
        clear_psp_rewrite();
        clear_psp_syntactic_constraint_types();
        clear_psp_semantic_constraint_types();
        return (SubLObject)psp_rules.NIL;
    }
    
    public static SubLObject declare_psp_rules_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "phrase_structure_parser_rule_print_function_trampoline", "PHRASE-STRUCTURE-PARSER-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "phrase_structure_parser_rule_p", "PHRASE-STRUCTURE-PARSER-RULE-P", 1, 0, false);
        new $phrase_structure_parser_rule_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rule_fort", "PSP-RULE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rule_arity", "PSP-RULE-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rule_category", "PSP-RULE-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rule_head", "PSP-RULE-HEAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rule_constraints", "PSP-RULE-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rule_semx", "PSP-RULE-SEMX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rule_weight", "PSP-RULE-WEIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "_csetf_psp_rule_fort", "_CSETF-PSP-RULE-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "_csetf_psp_rule_arity", "_CSETF-PSP-RULE-ARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "_csetf_psp_rule_category", "_CSETF-PSP-RULE-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "_csetf_psp_rule_head", "_CSETF-PSP-RULE-HEAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "_csetf_psp_rule_constraints", "_CSETF-PSP-RULE-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "_csetf_psp_rule_semx", "_CSETF-PSP-RULE-SEMX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "_csetf_psp_rule_weight", "_CSETF-PSP-RULE-WEIGHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "make_phrase_structure_parser_rule", "MAKE-PHRASE-STRUCTURE-PARSER-RULE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "visit_defstruct_phrase_structure_parser_rule", "VISIT-DEFSTRUCT-PHRASE-STRUCTURE-PARSER-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "visit_defstruct_object_phrase_structure_parser_rule_method", "VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-RULE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "pprint_psp_rule", "PPRINT-PSP-RULE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "new_psp_rule", "NEW-PSP-RULE", 0, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_new_constraints", "PSP-NEW-CONSTRAINTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_constraints_on_dtr", "PSP-CONSTRAINTS-ON-DTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_new_constraint", "PSP-NEW-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_constraint_type", "PSP-CONSTRAINT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_constraint_target", "PSP-CONSTRAINT-TARGET", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.psp_rules", "psp_destructure_constraint", "PSP-DESTRUCTURE-CONSTRAINT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rules", "PSP-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "clear_psp_rules", "CLEAR-PSP-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "add_phrase_structure_rule", "ADD-PHRASE-STRUCTURE-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "remove_phrase_structure_rule", "REMOVE-PHRASE-STRUCTURE-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "initialize_psp_rules", "INITIALIZE-PSP-RULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_check_initializations", "PSP-CHECK-INITIALIZATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "store_one_psp_rule_fort", "STORE-ONE-PSP-RULE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_valid_raw_constraintP", "PSP-VALID-RAW-CONSTRAINT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_get_semx_for_rule_fort", "PSP-GET-SEMX-FOR-RULE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_binding_expressions_for_rule_fort", "PSP-BINDING-EXPRESSIONS-FOR-RULE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rule_fort_weight_factor", "PSP-RULE-FORT-WEIGHT-FACTOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_explicit_weight_factor_for_rule_fort", "PSP-EXPLICIT-WEIGHT-FACTOR-FOR-RULE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rule_fort_weights_internal", "PSP-RULE-FORT-WEIGHTS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rule_fort_weights", "PSP-RULE-FORT-WEIGHTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rule_weight_factor_from_arity", "PSP-RULE-WEIGHT-FACTOR-FROM-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "add_psp_rule", "ADD-PSP-RULE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rule_struct_for_rule_fort", "PSP-RULE-STRUCT-FOR-RULE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_category_meets_constraintsP", "PSP-CATEGORY-MEETS-CONSTRAINTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_parse_constraint", "PSP-PARSE-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_frame_specific_raw_constraintP", "PSP-FRAME-SPECIFIC-RAW-CONSTRAINT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_frame_constraint_from_raw_constraint", "PSP-FRAME-CONSTRAINT-FROM-RAW-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_add_derivable_rules", "PSP-ADD-DERIVABLE-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_trace", "PSP-TRACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_untrace", "PSP-UNTRACE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_traced_ruleP", "PSP-TRACED-RULE?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.psp_rules", "psp_trace_report", "PSP-TRACE-REPORT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.psp_rules", "do_psp_trace_report", "DO-PSP-TRACE-REPORT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rules_starting_with_edge", "PSP-RULES-STARTING-WITH-EDGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rule_could_start_at_indexP", "PSP-RULE-COULD-START-AT-INDEX?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_filter_cycls", "PSP-FILTER-CYCLS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_cyclify_targets", "PSP-CYCLIFY-TARGETS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_edge_passes_semantic_constraintsP", "PSP-EDGE-PASSES-SEMANTIC-CONSTRAINTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_edge_meets_syntax_constraintsP", "PSP-EDGE-MEETS-SYNTAX-CONSTRAINTS?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_syntactic_constraintP", "PSP-SYNTACTIC-CONSTRAINT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "clear_psp_syntactic_constraint_types", "CLEAR-PSP-SYNTACTIC-CONSTRAINT-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_syntactic_constraint_typeP", "PSP-SYNTACTIC-CONSTRAINT-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_semantic_constraintP", "PSP-SEMANTIC-CONSTRAINT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "clear_psp_semantic_constraint_types", "CLEAR-PSP-SEMANTIC-CONSTRAINT-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_semantic_constraint_typeP", "PSP-SEMANTIC-CONSTRAINT-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "clear_psp_cycl_fails_constraintP", "CLEAR-PSP-CYCL-FAILS-CONSTRAINT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "remove_psp_cycl_fails_constraintP", "REMOVE-PSP-CYCL-FAILS-CONSTRAINT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_cycl_fails_constraintP_internal", "PSP-CYCL-FAILS-CONSTRAINT?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_cycl_fails_constraintP", "PSP-CYCL-FAILS-CONSTRAINT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_edge_fails_constraintP", "PSP-EDGE-FAILS-CONSTRAINT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "clear_psp_phrase_types", "CLEAR-PSP-PHRASE-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "remove_psp_phrase_types", "REMOVE-PSP-PHRASE-TYPES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_phrase_types_internal", "PSP-PHRASE-TYPES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_phrase_types", "PSP-PHRASE-TYPES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_constraints_require_phraseP_internal", "PSP-CONSTRAINTS-REQUIRE-PHRASE?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_constraints_require_phraseP", "PSP-CONSTRAINTS-REQUIRE-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_edge_fails_lexeme_constraintP", "PSP-EDGE-FAILS-LEXEME-CONSTRAINT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_lexeme_constraintP", "PSP-LEXEME-CONSTRAINT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_frame_specific_constituent_typeP", "PSP-FRAME-SPECIFIC-CONSTITUENT-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_frame_type_from_constituent_type", "PSP-FRAME-TYPE-FROM-CONSTITUENT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_constraint_target_includesP", "PSP-CONSTRAINT-TARGET-INCLUDES?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_edge_has_wuP", "PSP-EDGE-HAS-WU?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_det_nbar_agreeP", "PSP-DET-NBAR-AGREE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_valid_constituent_typeP", "PSP-VALID-CONSTITUENT-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "clear_psp_sub_categories", "CLEAR-PSP-SUB-CATEGORIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "remove_psp_sub_categories", "REMOVE-PSP-SUB-CATEGORIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_sub_categories_internal", "PSP-SUB-CATEGORIES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_sub_categories", "PSP-SUB-CATEGORIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_simplify_if_frame_specific_type", "PSP-SIMPLIFY-IF-FRAME-SPECIFIC-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "clear_psp_sub_pos_preds", "CLEAR-PSP-SUB-POS-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "remove_psp_sub_pos_preds", "REMOVE-PSP-SUB-POS-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_sub_pos_preds_internal", "PSP-SUB-POS-PREDS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_sub_pos_preds", "PSP-SUB-POS-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "clear_psp_frame_type_instances", "CLEAR-PSP-FRAME-TYPE-INSTANCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "remove_psp_frame_type_instances", "REMOVE-PSP-FRAME-TYPE-INSTANCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_frame_type_instances_internal", "PSP-FRAME-TYPE-INSTANCES-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_frame_type_instances", "PSP-FRAME-TYPE-INSTANCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "clear_psp_rewrite", "CLEAR-PSP-REWRITE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "remove_psp_rewrite", "REMOVE-PSP-REWRITE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rewrite_internal", "PSP-REWRITE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rewrite", "PSP-REWRITE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_isaP_internal", "PSP-ISA?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_isaP", "PSP-ISA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_genlP_internal", "PSP-GENL?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_genlP", "PSP-GENL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_rule_new_dtr_constraints", "PSP-RULE-NEW-DTR-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_new_dtr_constraints_from_frame", "PSP-NEW-DTR-CONSTRAINTS-FROM-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_add_by_phrase_constraints", "PSP-ADD-BY-PHRASE-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_passivized_dtrP", "PSP-PASSIVIZED-DTR?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_constraints_for_frame", "PSP-CONSTRAINTS-FOR-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_spec_const_constraintP", "PSP-SPEC-CONST-CONSTRAINT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_find_dtr_frame_type", "PSP-FIND-DTR-FRAME-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "psp_parse_tree_for_edge", "PSP-PARSE-TREE-FOR-EDGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_rules", "clear_psp_rules_caches", "CLEAR-PSP-RULES-CACHES", 0, 0, false);
        return (SubLObject)psp_rules.NIL;
    }
    
    public static SubLObject init_psp_rules_file() {
        psp_rules.$dtp_phrase_structure_parser_rule$ = SubLFiles.defconstant("*DTP-PHRASE-STRUCTURE-PARSER-RULE*", (SubLObject)psp_rules.$sym0$PHRASE_STRUCTURE_PARSER_RULE);
        psp_rules.$psp_rules$ = SubLFiles.defparameter("*PSP-RULES*", set.new_set(Symbols.symbol_function((SubLObject)psp_rules.EQUALP), (SubLObject)psp_rules.$int39$128));
        psp_rules.$psp_rule_fort_weights$ = SubLFiles.deflexical("*PSP-RULE-FORT-WEIGHTS*", (SubLObject)ConsesLow.list(reader.bq_cons(psp_rules.$const78$PSRule_NounNounCompound, parsing_utilities.psp_weight_from_float((SubLObject)psp_rules.$float79$0_5)), reader.bq_cons(psp_rules.$const80$PSRule_NameNounCompound, parsing_utilities.psp_weight_from_float((SubLObject)psp_rules.$float79$0_5)), reader.bq_cons(psp_rules.$const81$PSRule_AdjectiveNameCompound, parsing_utilities.psp_weight_from_float((SubLObject)psp_rules.$float79$0_5)), reader.bq_cons(psp_rules.$const82$PSRule_NameNameNounCompound, parsing_utilities.psp_weight_from_float((SubLObject)psp_rules.$float79$0_5))));
        psp_rules.$psp_rule_arity_weight$ = SubLFiles.defconstant("*PSP-RULE-ARITY-WEIGHT*", parsing_utilities.psp_weight_from_float((SubLObject)psp_rules.$float88$0_95));
        psp_rules.$psp_traced_rules$ = SubLFiles.deflexical("*PSP-TRACED-RULES*", (SubLObject)(maybeDefault((SubLObject)psp_rules.$sym95$_PSP_TRACED_RULES_, psp_rules.$psp_traced_rules$, psp_rules.NIL)));
        psp_rules.$psp_syntactic_constraint_types$ = SubLFiles.deflexical("*PSP-SYNTACTIC-CONSTRAINT-TYPES*", (SubLObject)(maybeDefault((SubLObject)psp_rules.$sym111$_PSP_SYNTACTIC_CONSTRAINT_TYPES_, psp_rules.$psp_syntactic_constraint_types$, psp_rules.NIL)));
        psp_rules.$psp_semantic_constraint_types$ = SubLFiles.deflexical("*PSP-SEMANTIC-CONSTRAINT-TYPES*", (SubLObject)(maybeDefault((SubLObject)psp_rules.$sym114$_PSP_SEMANTIC_CONSTRAINT_TYPES_, psp_rules.$psp_semantic_constraint_types$, psp_rules.NIL)));
        psp_rules.$psp_cycl_fails_constraintP_caching_state$ = SubLFiles.deflexical("*PSP-CYCL-FAILS-CONSTRAINT?-CACHING-STATE*", (SubLObject)psp_rules.NIL);
        psp_rules.$psp_phrase_types_caching_state$ = SubLFiles.deflexical("*PSP-PHRASE-TYPES-CACHING-STATE*", (SubLObject)psp_rules.NIL);
        psp_rules.$psp_sub_categories_caching_state$ = SubLFiles.deflexical("*PSP-SUB-CATEGORIES-CACHING-STATE*", (SubLObject)psp_rules.NIL);
        psp_rules.$psp_sub_pos_preds_caching_state$ = SubLFiles.deflexical("*PSP-SUB-POS-PREDS-CACHING-STATE*", (SubLObject)psp_rules.NIL);
        psp_rules.$psp_frame_type_instances_caching_state$ = SubLFiles.deflexical("*PSP-FRAME-TYPE-INSTANCES-CACHING-STATE*", (SubLObject)psp_rules.NIL);
        psp_rules.$psp_rewrite_caching_state$ = SubLFiles.deflexical("*PSP-REWRITE-CACHING-STATE*", (SubLObject)psp_rules.NIL);
        return (SubLObject)psp_rules.NIL;
    }
    
    public static SubLObject setup_psp_rules_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), psp_rules.$dtp_phrase_structure_parser_rule$.getGlobalValue(), Symbols.symbol_function((SubLObject)psp_rules.$sym7$PHRASE_STRUCTURE_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)psp_rules.$list8);
        Structures.def_csetf((SubLObject)psp_rules.$sym9$PSP_RULE_FORT, (SubLObject)psp_rules.$sym10$_CSETF_PSP_RULE_FORT);
        Structures.def_csetf((SubLObject)psp_rules.$sym11$PSP_RULE_ARITY, (SubLObject)psp_rules.$sym12$_CSETF_PSP_RULE_ARITY);
        Structures.def_csetf((SubLObject)psp_rules.$sym13$PSP_RULE_CATEGORY, (SubLObject)psp_rules.$sym14$_CSETF_PSP_RULE_CATEGORY);
        Structures.def_csetf((SubLObject)psp_rules.$sym15$PSP_RULE_HEAD, (SubLObject)psp_rules.$sym16$_CSETF_PSP_RULE_HEAD);
        Structures.def_csetf((SubLObject)psp_rules.$sym17$PSP_RULE_CONSTRAINTS, (SubLObject)psp_rules.$sym18$_CSETF_PSP_RULE_CONSTRAINTS);
        Structures.def_csetf((SubLObject)psp_rules.$sym19$PSP_RULE_SEMX, (SubLObject)psp_rules.$sym20$_CSETF_PSP_RULE_SEMX);
        Structures.def_csetf((SubLObject)psp_rules.$sym21$PSP_RULE_WEIGHT, (SubLObject)psp_rules.$sym22$_CSETF_PSP_RULE_WEIGHT);
        Equality.identity((SubLObject)psp_rules.$sym0$PHRASE_STRUCTURE_PARSER_RULE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), psp_rules.$dtp_phrase_structure_parser_rule$.getGlobalValue(), Symbols.symbol_function((SubLObject)psp_rules.$sym35$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_RULE_METHOD));
        utilities_macros.register_kb_function((SubLObject)psp_rules.$sym40$ADD_PHRASE_STRUCTURE_RULE);
        utilities_macros.register_kb_function((SubLObject)psp_rules.$sym41$REMOVE_PHRASE_STRUCTURE_RULE);
        memoization_state.note_memoized_function((SubLObject)psp_rules.$sym83$PSP_RULE_FORT_WEIGHTS);
        subl_macro_promotions.declare_defglobal((SubLObject)psp_rules.$sym95$_PSP_TRACED_RULES_);
        subl_macro_promotions.declare_defglobal((SubLObject)psp_rules.$sym111$_PSP_SYNTACTIC_CONSTRAINT_TYPES_);
        subl_macro_promotions.declare_defglobal((SubLObject)psp_rules.$sym114$_PSP_SEMANTIC_CONSTRAINT_TYPES_);
        memoization_state.note_globally_cached_function((SubLObject)psp_rules.$sym116$PSP_CYCL_FAILS_CONSTRAINT_);
        memoization_state.note_globally_cached_function((SubLObject)psp_rules.$sym125$PSP_PHRASE_TYPES);
        memoization_state.note_memoized_function((SubLObject)psp_rules.$sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_);
        memoization_state.note_globally_cached_function((SubLObject)psp_rules.$sym135$PSP_SUB_CATEGORIES);
        memoization_state.note_globally_cached_function((SubLObject)psp_rules.$sym138$PSP_SUB_POS_PREDS);
        memoization_state.note_globally_cached_function((SubLObject)psp_rules.$sym141$PSP_FRAME_TYPE_INSTANCES);
        memoization_state.note_globally_cached_function((SubLObject)psp_rules.$sym143$PSP_REWRITE);
        memoization_state.note_memoized_function((SubLObject)psp_rules.$sym146$PSP_ISA_);
        memoization_state.note_memoized_function((SubLObject)psp_rules.$sym147$PSP_GENL_);
        return (SubLObject)psp_rules.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_psp_rules_file();
    }
    
    @Override
	public void initializeVariables() {
        init_psp_rules_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_psp_rules_file();
    }
    
    static {
        me = (SubLFile)new psp_rules();
        psp_rules.$dtp_phrase_structure_parser_rule$ = null;
        psp_rules.$psp_rules$ = null;
        psp_rules.$psp_rule_fort_weights$ = null;
        psp_rules.$psp_rule_arity_weight$ = null;
        psp_rules.$psp_traced_rules$ = null;
        psp_rules.$psp_syntactic_constraint_types$ = null;
        psp_rules.$psp_semantic_constraint_types$ = null;
        psp_rules.$psp_cycl_fails_constraintP_caching_state$ = null;
        psp_rules.$psp_phrase_types_caching_state$ = null;
        psp_rules.$psp_sub_categories_caching_state$ = null;
        psp_rules.$psp_sub_pos_preds_caching_state$ = null;
        psp_rules.$psp_frame_type_instances_caching_state$ = null;
        psp_rules.$psp_rewrite_caching_state$ = null;
        $sym0$PHRASE_STRUCTURE_PARSER_RULE = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-RULE");
        $sym1$PHRASE_STRUCTURE_PARSER_RULE_P = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-RULE-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("ARITY"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeSymbol("SEMX"), (SubLObject)SubLObjectFactory.makeSymbol("WEIGHT"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ARITY"), (SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), (SubLObject)SubLObjectFactory.makeKeyword("HEAD"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeKeyword("SEMX"), (SubLObject)SubLObjectFactory.makeKeyword("WEIGHT"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PSP-RULE-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("PSP-RULE-ARITY"), (SubLObject)SubLObjectFactory.makeSymbol("PSP-RULE-CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("PSP-RULE-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("PSP-RULE-CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeSymbol("PSP-RULE-SEMX"), (SubLObject)SubLObjectFactory.makeSymbol("PSP-RULE-WEIGHT"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PSP-RULE-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PSP-RULE-ARITY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PSP-RULE-CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PSP-RULE-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PSP-RULE-CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PSP-RULE-SEMX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PSP-RULE-WEIGHT"));
        $sym6$PPRINT_PSP_RULE = SubLObjectFactory.makeSymbol("PPRINT-PSP-RULE");
        $sym7$PHRASE_STRUCTURE_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-RULE-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-RULE-P"));
        $sym9$PSP_RULE_FORT = SubLObjectFactory.makeSymbol("PSP-RULE-FORT");
        $sym10$_CSETF_PSP_RULE_FORT = SubLObjectFactory.makeSymbol("_CSETF-PSP-RULE-FORT");
        $sym11$PSP_RULE_ARITY = SubLObjectFactory.makeSymbol("PSP-RULE-ARITY");
        $sym12$_CSETF_PSP_RULE_ARITY = SubLObjectFactory.makeSymbol("_CSETF-PSP-RULE-ARITY");
        $sym13$PSP_RULE_CATEGORY = SubLObjectFactory.makeSymbol("PSP-RULE-CATEGORY");
        $sym14$_CSETF_PSP_RULE_CATEGORY = SubLObjectFactory.makeSymbol("_CSETF-PSP-RULE-CATEGORY");
        $sym15$PSP_RULE_HEAD = SubLObjectFactory.makeSymbol("PSP-RULE-HEAD");
        $sym16$_CSETF_PSP_RULE_HEAD = SubLObjectFactory.makeSymbol("_CSETF-PSP-RULE-HEAD");
        $sym17$PSP_RULE_CONSTRAINTS = SubLObjectFactory.makeSymbol("PSP-RULE-CONSTRAINTS");
        $sym18$_CSETF_PSP_RULE_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-PSP-RULE-CONSTRAINTS");
        $sym19$PSP_RULE_SEMX = SubLObjectFactory.makeSymbol("PSP-RULE-SEMX");
        $sym20$_CSETF_PSP_RULE_SEMX = SubLObjectFactory.makeSymbol("_CSETF-PSP-RULE-SEMX");
        $sym21$PSP_RULE_WEIGHT = SubLObjectFactory.makeSymbol("PSP-RULE-WEIGHT");
        $sym22$_CSETF_PSP_RULE_WEIGHT = SubLObjectFactory.makeSymbol("_CSETF-PSP-RULE-WEIGHT");
        $kw23$FORT = SubLObjectFactory.makeKeyword("FORT");
        $kw24$ARITY = SubLObjectFactory.makeKeyword("ARITY");
        $kw25$CATEGORY = SubLObjectFactory.makeKeyword("CATEGORY");
        $kw26$HEAD = SubLObjectFactory.makeKeyword("HEAD");
        $kw27$CONSTRAINTS = SubLObjectFactory.makeKeyword("CONSTRAINTS");
        $kw28$SEMX = SubLObjectFactory.makeKeyword("SEMX");
        $kw29$WEIGHT = SubLObjectFactory.makeKeyword("WEIGHT");
        $str30$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw31$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym32$MAKE_PHRASE_STRUCTURE_PARSER_RULE = SubLObjectFactory.makeSymbol("MAKE-PHRASE-STRUCTURE-PARSER-RULE");
        $kw33$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw34$END = SubLObjectFactory.makeKeyword("END");
        $sym35$VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_RULE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-RULE-METHOD");
        $str36$__PSP_RULE___S_ = SubLObjectFactory.makeString("#<PSP-RULE: ~S>");
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET")), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym38$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $int39$128 = SubLObjectFactory.makeInteger(128);
        $sym40$ADD_PHRASE_STRUCTURE_RULE = SubLObjectFactory.makeSymbol("ADD-PHRASE-STRUCTURE-RULE");
        $sym41$REMOVE_PHRASE_STRUCTURE_RULE = SubLObjectFactory.makeSymbol("REMOVE-PHRASE-STRUCTURE-RULE");
        $const42$PhraseStructureRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseStructureRule"));
        $const43$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw44$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw45$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw46$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw48$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str49$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym50$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw51$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str52$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw53$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str54$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str55$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str56$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str58$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $kw59$INITIALIZED = SubLObjectFactory.makeKeyword("INITIALIZED");
        $const60$psRuleArity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("psRuleArity"));
        $const61$psRuleCategory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("psRuleCategory"));
        $const62$psRuleSyntacticHeadDtr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("psRuleSyntacticHeadDtr"));
        $const63$psRuleConstraint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("psRuleConstraint"));
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("C-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DTR"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"));
        $kw65$STORED = SubLObjectFactory.makeKeyword("STORED");
        $sym66$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const67$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const68$psRuleSemanticsFromDtr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("psRuleSemanticsFromDtr"));
        $kw69$IDENTITY = SubLObjectFactory.makeKeyword("IDENTITY");
        $kw70$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $const71$psRuleTemplateDtr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("psRuleTemplateDtr"));
        $kw72$INSTANCE = SubLObjectFactory.makeKeyword("INSTANCE");
        $const73$PSBindingFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PSBindingFn"));
        $kw74$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $const75$PSBindingFn_TypeLevel = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PSBindingFn-TypeLevel"));
        $const76$psRuleTemplateBindings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("psRuleTemplateBindings"));
        $kw77$NONE = SubLObjectFactory.makeKeyword("NONE");
        $const78$PSRule_NounNounCompound = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PSRule-NounNounCompound"));
        $float79$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $const80$PSRule_NameNounCompound = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PSRule-NameNounCompound"));
        $const81$PSRule_AdjectiveNameCompound = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PSRule-AdjectiveNameCompound"));
        $const82$PSRule_NameNameNounCompound = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PSRule-NameNameNounCompound"));
        $sym83$PSP_RULE_FORT_WEIGHTS = SubLObjectFactory.makeSymbol("PSP-RULE-FORT-WEIGHTS");
        $str84$psRuleWeight = SubLObjectFactory.makeString("psRuleWeight");
        $list85 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?RULE"), (SubLObject)SubLObjectFactory.makeSymbol("?WEIGHT"));
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?RULE"), (SubLObject)SubLObjectFactory.makeSymbol("?WEIGHT"));
        $list87 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-WEIGHT"));
        $float88$0_95 = (SubLFloat)SubLObjectFactory.makeDouble(0.95);
        $kw89$INFINITE_RECURSION_RULE = SubLObjectFactory.makeKeyword("INFINITE-RECURSION-RULE");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"));
        $const91$ConstituentTypeConstraintFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConstituentTypeConstraintFn"));
        $const92$POSPredConstraintFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("POSPredConstraintFn"));
        $kw93$FRAME = SubLObjectFactory.makeKeyword("FRAME");
        $kw94$STUB = SubLObjectFactory.makeKeyword("STUB");
        $sym95$_PSP_TRACED_RULES_ = SubLObjectFactory.makeSymbol("*PSP-TRACED-RULES*");
        $sym96$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym98$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym99$PSP_TRACED_RULE_ = SubLObjectFactory.makeSymbol("PSP-TRACED-RULE?");
        $sym100$DO_PSP_TRACE_REPORT = SubLObjectFactory.makeSymbol("DO-PSP-TRACE-REPORT");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym102$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $str103$___S___meets_the_first_dtr_constr = SubLObjectFactory.makeString("~&~S~% meets the first-dtr constraints of ~S. Frame = ~S");
        $sym104$PSP_SEMANTIC_CONSTRAINT_ = SubLObjectFactory.makeSymbol("PSP-SEMANTIC-CONSTRAINT?");
        $str105$___S____A_constraint__S___ = SubLObjectFactory.makeString("~&~S~% ~A constraint ~S.~%");
        $str106$failed = SubLObjectFactory.makeString("failed");
        $str107$met = SubLObjectFactory.makeString("met");
        $kw108$LIST = SubLObjectFactory.makeKeyword("LIST");
        $kw109$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str110$___S___failed_constraint__S___S = SubLObjectFactory.makeString("~&~S~% failed constraint ~S: ~S");
        $sym111$_PSP_SYNTACTIC_CONSTRAINT_TYPES_ = SubLObjectFactory.makeSymbol("*PSP-SYNTACTIC-CONSTRAINT-TYPES*");
        $const112$PhraseStructureConstraint_Syntact = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseStructureConstraint-Syntactic"));
        $const113$resultIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsa"));
        $sym114$_PSP_SEMANTIC_CONSTRAINT_TYPES_ = SubLObjectFactory.makeSymbol("*PSP-SEMANTIC-CONSTRAINT-TYPES*");
        $const115$PhraseStructureConstraint_Semanti = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseStructureConstraint-Semantic"));
        $sym116$PSP_CYCL_FAILS_CONSTRAINT_ = SubLObjectFactory.makeSymbol("PSP-CYCL-FAILS-CONSTRAINT?");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("C-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"));
        $const118$PSRuleIsaConstraintFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PSRuleIsaConstraintFn"));
        $const119$PSRuleGenlsConstraintFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PSRuleGenlsConstraintFn"));
        $sym120$_PSP_CYCL_FAILS_CONSTRAINT__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PSP-CYCL-FAILS-CONSTRAINT?-CACHING-STATE*");
        $int121$256 = SubLObjectFactory.makeInteger(256);
        $kw122$GAP = SubLObjectFactory.makeKeyword("GAP");
        $const123$PrepositionalPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrepositionalPhrase"));
        $const124$DetNbarAgrConstraintFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DetNbarAgrConstraintFn"));
        $sym125$PSP_PHRASE_TYPES = SubLObjectFactory.makeSymbol("PSP-PHRASE-TYPES");
        $const126$NLPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPhrase"));
        $sym127$_PSP_PHRASE_TYPES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PSP-PHRASE-TYPES-CACHING-STATE*");
        $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_ = SubLObjectFactory.makeSymbol("PSP-CONSTRAINTS-REQUIRE-PHRASE?");
        $const129$Preposition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition"));
        $list130 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLWordForm")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lexemeOfWordForm")));
        $list131 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPhraseWithFrameFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLWordFormWithFrameFn")));
        $const132$Number_SP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Number-SP"));
        $list133 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings")));
        $sym134$GENL_POS_PRED_ = SubLObjectFactory.makeSymbol("GENL-POS-PRED?");
        $sym135$PSP_SUB_CATEGORIES = SubLObjectFactory.makeSymbol("PSP-SUB-CATEGORIES");
        $int136$32 = SubLObjectFactory.makeInteger(32);
        $sym137$_PSP_SUB_CATEGORIES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PSP-SUB-CATEGORIES-CACHING-STATE*");
        $sym138$PSP_SUB_POS_PREDS = SubLObjectFactory.makeSymbol("PSP-SUB-POS-PREDS");
        $int139$64 = SubLObjectFactory.makeInteger(64);
        $sym140$_PSP_SUB_POS_PREDS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PSP-SUB-POS-PREDS-CACHING-STATE*");
        $sym141$PSP_FRAME_TYPE_INSTANCES = SubLObjectFactory.makeSymbol("PSP-FRAME-TYPE-INSTANCES");
        $sym142$_PSP_FRAME_TYPE_INSTANCES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PSP-FRAME-TYPE-INSTANCES-CACHING-STATE*");
        $sym143$PSP_REWRITE = SubLObjectFactory.makeSymbol("PSP-REWRITE");
        $const144$rewriteOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $sym145$_PSP_REWRITE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PSP-REWRITE-CACHING-STATE*");
        $sym146$PSP_ISA_ = SubLObjectFactory.makeSymbol("PSP-ISA?");
        $sym147$PSP_GENL_ = SubLObjectFactory.makeSymbol("PSP-GENL?");
        $list148 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"));
        $sym149$PSP_SPEC_CONST_CONSTRAINT_ = SubLObjectFactory.makeSymbol("PSP-SPEC-CONST-CONSTRAINT?");
        $kw150$PASSIVE_WITH_BY = SubLObjectFactory.makeKeyword("PASSIVE-WITH-BY");
        $list151 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLWordForm")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lexemeOfWordForm")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("By-TheWord")));
        $const152$NounPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $const153$subcatFrameDependentConstraint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subcatFrameDependentConstraint"));
        $list154 = ConsesLow.list((SubLObject)psp_rules.TWO_INTEGER, (SubLObject)psp_rules.THREE_INTEGER);
        $const155$PPCompFrameFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PPCompFrameFn"));
        $const156$TransitivePPFrameType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitivePPFrameType"));
        $const157$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn"));
        $const158$NLWordForm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLWordForm"));
        $const159$lexemeOfWordForm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lexemeOfWordForm"));
        $const160$DitransitivePPFrameType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DitransitivePPFrameType"));
        $list161 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("C1-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("C1-TARGET"));
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("C2-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("C2-TARGET"));
        $sym163$PSP_PARSE_TREE_FOR_EDGE = SubLObjectFactory.makeSymbol("PSP-PARSE-TREE-FOR-EDGE");
    }
    
    public static final class $phrase_structure_parser_rule_native extends SubLStructNative
    {
        public SubLObject $fort;
        public SubLObject $arity;
        public SubLObject $category;
        public SubLObject $head;
        public SubLObject $constraints;
        public SubLObject $semx;
        public SubLObject $weight;
        private static final SubLStructDeclNative structDecl;
        
        public $phrase_structure_parser_rule_native() {
            this.$fort = (SubLObject)CommonSymbols.NIL;
            this.$arity = (SubLObject)CommonSymbols.NIL;
            this.$category = (SubLObject)CommonSymbols.NIL;
            this.$head = (SubLObject)CommonSymbols.NIL;
            this.$constraints = (SubLObject)CommonSymbols.NIL;
            this.$semx = (SubLObject)CommonSymbols.NIL;
            this.$weight = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$phrase_structure_parser_rule_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$fort;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$arity;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$category;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$head;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$constraints;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$semx;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$weight;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$fort = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$arity = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$category = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$head = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$constraints = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$semx = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$weight = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$phrase_structure_parser_rule_native.class, psp_rules.$sym0$PHRASE_STRUCTURE_PARSER_RULE, psp_rules.$sym1$PHRASE_STRUCTURE_PARSER_RULE_P, psp_rules.$list2, psp_rules.$list3, new String[] { "$fort", "$arity", "$category", "$head", "$constraints", "$semx", "$weight" }, psp_rules.$list4, psp_rules.$list5, psp_rules.$sym6$PPRINT_PSP_RULE);
        }
    }
    
    public static final class $phrase_structure_parser_rule_p$UnaryFunction extends UnaryFunction
    {
        public $phrase_structure_parser_rule_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PHRASE-STRUCTURE-PARSER-RULE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return psp_rules.phrase_structure_parser_rule_p(arg1);
        }
    }
}

/*

	Total time: 1561 ms
	
*/