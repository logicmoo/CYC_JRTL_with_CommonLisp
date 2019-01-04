package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
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

public final class proof_view_populator extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.proof_view_populator";
    public static final String myFingerPrint = "4d433c700ffe0cbcd697daacabd8f499919d4ab2361812c527b26c2a553de4ee";
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1063L)
    public static SubLSymbol $dtp_proof_view_populator$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 3506L)
    private static SubLSymbol $proof_view_allow_unlimited_duplicationP$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 3607L)
    private static SubLSymbol $proof_view_duplicate_entry_max$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 3893L)
    private static SubLSymbol $suspend_generality_sorting_of_proof_view_entriesP$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 3973L)
    public static SubLSymbol $suspend_auto_sorting_of_proof_view_entriesP$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 4115L)
    private static SubLSymbol $proof_view_populator$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 9917L)
    private static SubLSymbol $proof_view_special_sections$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 9991L)
    private static SubLSymbol $proof_view_special_section_terms$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 14173L)
    private static SubLSymbol $proof_conclusion_proof_view_counts$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 28841L)
    private static SubLSymbol $proof_view_track_fnsP$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 34269L)
    private static SubLSymbol $proof_scores$;
    private static final SubLSymbol $sym0$PROOF_VIEW_POPULATOR;
    private static final SubLSymbol $sym1$PROOF_VIEW_POPULATOR_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_PROOF_VIEW_POPULATOR;
    private static final SubLSymbol $sym7$PROOF_VIEW_POPULATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$PVP_PROOF_VIEW;
    private static final SubLSymbol $sym10$_CSETF_PVP_PROOF_VIEW;
    private static final SubLSymbol $sym11$PVP_WORKER_SEMAPHORE;
    private static final SubLSymbol $sym12$_CSETF_PVP_WORKER_SEMAPHORE;
    private static final SubLSymbol $sym13$PVP_MASTER_SEMAPHORE;
    private static final SubLSymbol $sym14$_CSETF_PVP_MASTER_SEMAPHORE;
    private static final SubLSymbol $sym15$PVP_PROCESS;
    private static final SubLSymbol $sym16$_CSETF_PVP_PROCESS;
    private static final SubLSymbol $kw17$PROOF_VIEW;
    private static final SubLSymbol $kw18$WORKER_SEMAPHORE;
    private static final SubLSymbol $kw19$MASTER_SEMAPHORE;
    private static final SubLSymbol $kw20$PROCESS;
    private static final SubLString $str21$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw22$BEGIN;
    private static final SubLSymbol $sym23$MAKE_PROOF_VIEW_POPULATOR;
    private static final SubLSymbol $kw24$SLOT;
    private static final SubLSymbol $kw25$END;
    private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_POPULATOR_METHOD;
    private static final SubLString $str27$_PROOF_VIEW_POPULATOR_;
    private static final SubLString $str28$PVP_Worker_Semaphore;
    private static final SubLString $str29$PVP_Master_Semaphore;
    private static final SubLSymbol $sym30$SXHASH_PROOF_VIEW_POPULATOR_METHOD;
    private static final SubLSymbol $kw31$DONE;
    private static final SubLString $str32$proof;
    private static final SubLString $str33$Proof_View_Populator;
    private static final SubLSymbol $sym34$PROOF_VIEW_POPULATE;
    private static final SubLSymbol $sym35$PROOF_VIEW_P;
    private static final SubLSymbol $sym36$HLMT_P;
    private static final SubLSymbol $sym37$STRINGP;
    private static final SubLSymbol $kw38$JUSTIFICATION_ROOT;
    private static final SubLString $str39$;
    private static final SubLSymbol $kw40$NO_JUSTIFICATION;
    private static final SubLString $str41$IGNORE;
    private static final SubLSymbol $sym42$UNIVERSAL_TIME_P;
    private static final SubLSymbol $kw43$POPULATED_UNIVERSAL_TIME;
    private static final SubLSymbol $kw44$ERROR_OUTPUT;
    private static final SubLSymbol $kw45$SOURCES_ROOT;
    private static final SubLSymbol $sym46$_;
    private static final SubLSymbol $sym47$PPH_SOURCE_CITATION_ID;
    private static final SubLSymbol $kw48$SOURCE_CITATION;
    private static final SubLSymbol $kw49$FN;
    private static final SubLSymbol $sym50$PROOF_VIEW_MAYBE_ADD_SOURCE_CITATIONS;
    private static final SubLSymbol $sym51$RULE_ASSERTION_;
    private static final SubLSymbol $sym52$PROOF_VIEW_ENTRY_GET_OBJECT;
    private static final SubLSymbol $sym53$PROOF_VIEW_RULE_SUITABLE_FOR_RULES_SECTION_;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$PROGN;
    private static final SubLSymbol $sym56$DEFINE_PRIVATE_FUNCALL;
    private static final SubLSymbol $sym57$NOTE_PROOF_VIEW_SPECIAL_SECTION_POPULATOR;
    private static final SubLSymbol $sym58$QUOTE;
    private static final SubLSymbol $sym59$_PROOF_VIEW_SPECIAL_SECTIONS_;
    private static final SubLSymbol $sym60$_PROOF_VIEW_SPECIAL_SECTION_TERMS_;
    private static final SubLString $str61$Can_t_use__S_to_generate__S_secti;
    private static final SubLSymbol $kw62$SPECIAL_SECTION_ROOTS;
    private static final SubLSymbol $kw63$SPECIAL_SECTIONS;
    private static final SubLString $str64$Nothing_interesting_available_;
    private static final SubLSymbol $kw65$EMPTY_JUSTIFICATION;
    private static final SubLSymbol $sym66$PROOF_VIEW_MAYBE_ADD_JUSTIFICATION_SECTION;
    private static final SubLString $str67$__Done_adding_justification_secti;
    private static final SubLSymbol $sym68$_PROOF_CONCLUSION_PROOF_VIEW_COUNTS_;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$CLET;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$CPUSH_ALL;
    private static final SubLList $list73;
    private static final SubLSymbol $sym74$VALID_PROOF_VIEW_P;
    private static final SubLSymbol $sym75$PROOF_VIEW_ENTRY_P;
    private static final SubLString $str76$__Adding__S___under__S__;
    private static final SubLSymbol $sym77$FAST_REIFIED_SKOLEM_;
    private static final SubLString $str78$Relocated___S;
    private static final SubLSymbol $kw79$RELOCATED;
    private static final SubLSymbol $kw80$TRIVIAL;
    private static final SubLString $str81$Trivial;
    private static final SubLSymbol $kw82$QUERY_PRAGMA;
    private static final SubLString $str83$Has_entry_already_;
    private static final SubLSymbol $kw84$DUPLICATE;
    private static final SubLSymbol $kw85$ALREADY_HANDLED;
    private static final SubLSymbol $kw86$IRRELEVANT;
    private static final SubLString $str87$Proof_has_isomorphic_support___A;
    private static final SubLSymbol $kw88$SUPPRESSED;
    private static final SubLString $str89$Constructing_default_proof_view_f;
    private static final SubLSymbol $sym90$ASSERTION_P;
    private static final SubLSymbol $sym91$EL_SENTENCE_P;
    private static final SubLSymbol $sym92$CONSTRUCT_DEFAULT_PROOF_VIEW;
    private static final SubLSymbol $kw93$PROOF;
    private static final SubLString $str94$Adding_sub_entries_under__S;
    private static final SubLString $str95$Couldn_t_add_entry_for_support___;
    private static final SubLSymbol $kw96$IGNORE;
    private static final SubLSymbol $sym97$VARIABLE_BINDING_VALUE;
    private static final SubLSymbol $sym98$EL_VAR_;
    private static final SubLSymbol $sym99$ANYTHING_TOKEN;
    private static final SubLSymbol $sym100$PROOF_LITERALS_TO_SUPPRESS;
    private static final SubLSymbol $sym101$_EXIT;
    private static final SubLSymbol $kw102$ALREADY_HANDLED_PROOFS;
    private static final SubLSymbol $kw103$USED_RULES_ROOT;
    private static final SubLString $str104$Query_;
    private static final SubLSymbol $kw105$QUERY_SENTENCE;
    private static final SubLSymbol $sym106$PROOF_VIEW_ADD_QUERY_AND_ANSWER_SECTION;
    private static final SubLSymbol $kw107$QUERY_ROOT;
    private static final SubLString $str108$Answer_;
    private static final SubLSymbol $sym109$EL_TERM_P;
    private static final SubLSymbol $sym110$CONSTRUCT_PROOF_VIEW_ANSWER_ENTRY;
    private static final SubLSymbol $kw111$FN_SECTION;
    private static final SubLSymbol $sym112$NULL_BINDINGS;
    private static final SubLSymbol $sym113$ONE_BINDING;
    private static final SubLSymbol $sym114$ATOMIC_QUERY_SENTENCE;
    private static final SubLSymbol $kw115$BINDINGS;
    private static final SubLSymbol $sym116$DEFAULT;
    private static final SubLSymbol $kw117$ID;
    private static final SubLSymbol $kw118$OBJECT;
    private static final SubLSymbol $sym119$SYMBOLP;
    private static final SubLSymbol $sym120$PROPERTY_LIST_P;
    private static final SubLString $str121$_S_already_exists___S_time__P__in;
    private static final SubLString $str122$__Added__S___for__S___under__S__;
    private static final SubLSymbol $sym123$VALID_PROOF_VIEW_ENTRY_P;
    private static final SubLSymbol $kw124$EXPAND_INITIALLY_;
    private static final SubLSymbol $kw125$SECTION_ROOT;
    private static final SubLSymbol $sym126$PROOF_VIEW_ADD_SECTION_ROOT;
    private static final SubLSymbol $sym127$KEYWORDP;
    private static final SubLSymbol $kw128$RULE_USED;
    private static final SubLSymbol $sym129$PROOF_VIEW_ADD_RULE_USED;
    private static final SubLSymbol $kw130$RULES_USED;
    private static final SubLSymbol $kw131$LINEAR_ROOT;
    private static final SubLString $str132$__Inference_entities___S__;
    private static final SubLSymbol $sym133$FORT_P;
    private static final SubLString $str134$___D_Entry_FORTs___S___S;
    private static final SubLString $str135$__Found_preferred_FORT__S__;
    private static final SubLSymbol $sym136$PROOF_VIEW_ENTRY_GET_PROOF_SUID;
    private static final SubLSymbol $sym137$_;
    private static final SubLSymbol $sym138$PROOF_VIEW_ENTRY_GET_SCORE;
    private static final SubLSymbol $sym139$SUPPORT_P;
    private static final SubLSymbol $sym140$PROOF_VIEW_ADD_FACT_USED;
    private static final SubLSymbol $kw141$FACTS_USED;
    private static final SubLString $str142$Failed_to_store__S_on__S;
    private static final SubLSymbol $kw143$SKSI;
    private static final SubLSymbol $kw144$GIS;
    private static final SubLString $str145$Cycorp_ArcMap_GIS_KS;
    private static final SubLSymbol $sym146$_KS;
    private static final SubLObject $const147$contentMt;
    private static final SubLObject $const148$InferencePSC;
    private static final SubLObject $const149$Saffron_KS;
    private static final SubLList $list150;
    private static final SubLSymbol $sym151$HYPOTHESIS;
    private static final SubLSymbol $sym152$TERM;
    private static final SubLSymbol $sym153$PROOF_VIEW_SITUATION_CONSTITUENTS_PROOF_HYPOTHESIS_AND_TERMS;
    private static final SubLSymbol $kw154$REMOVAL_SAFFRON_CONJUNCTION_069;
    private static final SubLObject $const155$substring;
    private static final SubLObject $const156$situationConstituentWithTypeAndDe;
    private static final SubLObject $const157$situationConstituentWithType;
    private static final SubLObject $const158$situationConstituentWithDesc;
    private static final SubLList $list159;
    private static final SubLString $str160$Source_Text_;
    private static final SubLSymbol $kw161$EXTERNAL_SENTENCE;
    private static final SubLString $str162$Title_;
    private static final SubLString $str163$Date_;
    private static final SubLString $str164$Author_;
    private static final SubLString $str165$Publisher_;
    private static final SubLString $str166$Couldn_t_find_source_document_;
    private static final SubLSymbol $kw167$NO_SOURCE_DOCUMENT;
    private static final SubLSymbol $kw168$PARENT_ID;
    private static final SubLSymbol $kw169$OBJECT_TYPE;
    private static final SubLSymbol $kw170$ROOT;
    private static final SubLSymbol $kw171$LABEL;
    private static final SubLString $str172$Root;
    private static final SubLString $str173$Initial_ID_in__S_is__S__should_be;
    private static final SubLSymbol $sym174$_SENTENCE;
    private static final SubLObject $const175$and;
    private static final SubLList $list176;
    private static final SubLObject $const177$sourceOfTerm;
    private static final SubLList $list178;
    private static final SubLString $str179$Already_have_entry_for__S;
    private static final SubLSymbol $sym180$PROOF_VIEW_ADD_SUPPORT_TREE;
    private static final SubLSymbol $sym181$NON_DEDUCED_ASSERTION;
    private static final SubLSymbol $sym182$CIRCULAR_ASSERTION;
    private static final SubLSymbol $sym183$CIRCULAR_SUPPORT;
    private static final SubLString $str184$__Skipping_over_trivial_symmetric;
    private static final SubLSymbol $sym185$NORMAL_SUPPORT;
    private static final SubLSymbol $kw186$ABDUCED_SUPPORT;
    private static final SubLSymbol $sym187$ABDUCED_SUPPORT;
    private static final SubLSymbol $kw188$UNSUPPORTED_SUPPORT;
    private static final SubLSymbol $sym189$UNSUPPORTED_SUPPORT;
    private static final SubLString $str190$unknown_support_type_for__A;
    private static final SubLString $str191$Already_shown___S;
    private static final SubLString $str192$Circularity_in_meta_supports__Alr;
    private static final SubLList $list193;
    private static final SubLString $str194$Not_proof_view_worthy___S;
    private static final SubLSymbol $sym195$CYCL_TERM_P;
    private static final SubLSymbol $kw196$SOURCES;
    private static final SubLSymbol $sym197$ENTITY_MENTIONS_PROOF_POSSIBLE_;
    private static final SubLSymbol $sym198$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const199$EverythingPSC;
    private static final SubLObject $const200$hypothesizedFormula;
    private static final SubLObject $const201$hypothesizedFormulaStrengthenedTo;
    private static final SubLSymbol $sym202$PROOF_VIEW_ENTITY_MENTIONS_PROOF_HYPOTHESES_AND_TERMS;
    private static final SubLSymbol $sym203$SKSI_SUPPORTED_EXTERNAL_TERM_;
    private static final SubLSymbol $kw204$ENTITY_MENTION;
    private static final SubLSymbol $sym205$PROOF_VIEW_ADD_ENTITY_MENTION_ENTRIES;
    private static final SubLSymbol $sym206$SOURCE_TEXT;
    private static final SubLSymbol $kw207$HAS_ABDUCED_SUPPORT_;
    private static final SubLSymbol $sym208$_HYPOTHESIS;
    private static final SubLSymbol $sym209$_ENTITY_MENTION;
    private static final SubLList $list210;
    private static final SubLObject $const211$dependsOnEMHyp;
    private static final SubLList $list212;
    private static final SubLList $list213;
    private static final SubLSymbol $sym214$_PUBLISHER;
    private static final SubLObject $const215$publisherOfWork;
    private static final SubLList $list216;
    private static final SubLSymbol $sym217$_DATE;
    private static final SubLObject $const218$dateOfPublication_CW;
    private static final SubLList $list219;
    private static final SubLSymbol $sym220$_AUTHOR;
    private static final SubLObject $const221$authorOfLiteraryWork_CW;
    private static final SubLList $list222;
    private static final SubLSymbol $sym223$_TITLE;
    private static final SubLObject $const224$titleOfWork;
    private static final SubLList $list225;
    private static final SubLSymbol $sym226$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym227$PROOF_VIEW_ENTRY_;
    private static final SubLSymbol $sym228$PROOF_VIEW_ENTRY_MORE_GENERAL_;
    private static final SubLString $str229$Sort_by_specificity_changed_order;
    private static final SubLString $str230$Sort_by_causality_changed_order__;
    private static final SubLSymbol $kw231$CHILDREN;
    private static final SubLSymbol $kw232$CAUSE;
    private static final SubLSymbol $sym233$CAUSE_ARG_NUM_OF_PRED;
    private static final SubLSymbol $sym234$_ARG;
    private static final SubLObject $const235$causeArg;
    private static final SubLList $list236;
    private static final SubLList $list237;
    private static final SubLSymbol $kw238$EFFECT;
    private static final SubLSymbol $sym239$EFFECT_ARG_NUM_OF_PRED;
    private static final SubLObject $const240$effectArg;
    private static final SubLSymbol $kw241$USED_SUPPORTS;
    private static final SubLSymbol $sym242$PPH_SUPPORT_EL_SENTENCE;
    private static final SubLString $str243$Given_;
    private static final SubLSymbol $kw244$GIVEN;
    private static final SubLSymbol $kw245$ASSERTION_BOOKKEEPING;
    private static final SubLString $str246$Pragmatics_;
    private static final SubLSymbol $kw247$PRAGMATICS;
    private static final SubLSymbol $sym248$INTEGER_SEQUENCE_GENERATOR_P;
    private static final SubLSymbol $kw249$SOURCE_ISG;
    private static final SubLSymbol $kw250$SOURCE_INDEX;
    private static final SubLSymbol $kw251$CIRCULAR_SUPPORT;
    private static final SubLString $str252$Trivially__;
    private static final SubLSymbol $sym253$EL_FORMULA_P;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1063L)
    public static SubLObject proof_view_populator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_proof_view_populator(v_object, stream, (SubLObject)proof_view_populator.ZERO_INTEGER);
        return (SubLObject)proof_view_populator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1063L)
    public static SubLObject proof_view_populator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $proof_view_populator_native.class) ? proof_view_populator.T : proof_view_populator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1063L)
    public static SubLObject pvp_proof_view(final SubLObject v_object) {
        assert proof_view_populator.NIL != proof_view_populator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1063L)
    public static SubLObject pvp_worker_semaphore(final SubLObject v_object) {
        assert proof_view_populator.NIL != proof_view_populator_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1063L)
    public static SubLObject pvp_master_semaphore(final SubLObject v_object) {
        assert proof_view_populator.NIL != proof_view_populator_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1063L)
    public static SubLObject pvp_process(final SubLObject v_object) {
        assert proof_view_populator.NIL != proof_view_populator_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1063L)
    public static SubLObject _csetf_pvp_proof_view(final SubLObject v_object, final SubLObject value) {
        assert proof_view_populator.NIL != proof_view_populator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1063L)
    public static SubLObject _csetf_pvp_worker_semaphore(final SubLObject v_object, final SubLObject value) {
        assert proof_view_populator.NIL != proof_view_populator_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1063L)
    public static SubLObject _csetf_pvp_master_semaphore(final SubLObject v_object, final SubLObject value) {
        assert proof_view_populator.NIL != proof_view_populator_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1063L)
    public static SubLObject _csetf_pvp_process(final SubLObject v_object, final SubLObject value) {
        assert proof_view_populator.NIL != proof_view_populator_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1063L)
    public static SubLObject make_proof_view_populator(SubLObject arglist) {
        if (arglist == proof_view_populator.UNPROVIDED) {
            arglist = (SubLObject)proof_view_populator.NIL;
        }
        final SubLObject v_new = (SubLObject)new $proof_view_populator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)proof_view_populator.NIL, next = arglist; proof_view_populator.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)proof_view_populator.$kw17$PROOF_VIEW)) {
                _csetf_pvp_proof_view(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)proof_view_populator.$kw18$WORKER_SEMAPHORE)) {
                _csetf_pvp_worker_semaphore(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)proof_view_populator.$kw19$MASTER_SEMAPHORE)) {
                _csetf_pvp_master_semaphore(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)proof_view_populator.$kw20$PROCESS)) {
                _csetf_pvp_process(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)proof_view_populator.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1063L)
    public static SubLObject visit_defstruct_proof_view_populator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)proof_view_populator.$kw22$BEGIN, (SubLObject)proof_view_populator.$sym23$MAKE_PROOF_VIEW_POPULATOR, (SubLObject)proof_view_populator.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)proof_view_populator.$kw24$SLOT, (SubLObject)proof_view_populator.$kw17$PROOF_VIEW, pvp_proof_view(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)proof_view_populator.$kw24$SLOT, (SubLObject)proof_view_populator.$kw18$WORKER_SEMAPHORE, pvp_worker_semaphore(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)proof_view_populator.$kw24$SLOT, (SubLObject)proof_view_populator.$kw19$MASTER_SEMAPHORE, pvp_master_semaphore(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)proof_view_populator.$kw24$SLOT, (SubLObject)proof_view_populator.$kw20$PROCESS, pvp_process(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)proof_view_populator.$kw25$END, (SubLObject)proof_view_populator.$sym23$MAKE_PROOF_VIEW_POPULATOR, (SubLObject)proof_view_populator.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1063L)
    public static SubLObject visit_defstruct_object_proof_view_populator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_proof_view_populator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1444L)
    public static SubLObject print_proof_view_populator(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)proof_view_populator.$str27$_PROOF_VIEW_POPULATOR_);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1602L)
    public static SubLObject new_proof_view_populator(final SubLObject v_proof_view) {
        final SubLObject populator = make_proof_view_populator((SubLObject)proof_view_populator.UNPROVIDED);
        _csetf_pvp_proof_view(populator, v_proof_view);
        _csetf_pvp_worker_semaphore(populator, Semaphores.new_semaphore((SubLObject)proof_view_populator.$str28$PVP_Worker_Semaphore, (SubLObject)proof_view_populator.ZERO_INTEGER));
        _csetf_pvp_master_semaphore(populator, Semaphores.new_semaphore((SubLObject)proof_view_populator.$str29$PVP_Master_Semaphore, (SubLObject)proof_view_populator.ZERO_INTEGER));
        return populator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 1968L)
    public static SubLObject proof_view_populator_proof_view(final SubLObject populator) {
        assert proof_view_populator.NIL != proof_view_populator_p(populator) : populator;
        return pvp_proof_view(populator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 2125L)
    public static SubLObject proof_view_populator_worker_semaphore(final SubLObject populator) {
        assert proof_view_populator.NIL != proof_view_populator_p(populator) : populator;
        return pvp_worker_semaphore(populator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 2282L)
    public static SubLObject proof_view_populator_master_semaphore(final SubLObject populator) {
        assert proof_view_populator.NIL != proof_view_populator_p(populator) : populator;
        return pvp_master_semaphore(populator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 2439L)
    public static SubLObject proof_view_populator_process(final SubLObject populator) {
        assert proof_view_populator.NIL != proof_view_populator_p(populator) : populator;
        return pvp_process(populator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 2578L)
    public static SubLObject sxhash_proof_view_populator_method(final SubLObject v_object) {
        return sxhash_proof_view_populator(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 2698L)
    public static SubLObject sxhash_proof_view_populator(final SubLObject populator) {
        return Sxhash.sxhash(pvp_proof_view(populator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 2812L)
    public static SubLObject proof_view_populator_doneP(final SubLObject populator) {
        return Equality.eql((SubLObject)proof_view_populator.$kw31$DONE, proof_view_populator_process(populator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 2943L)
    public static SubLObject proof_view_populator_do_one_step(final SubLObject populator) {
        if (proof_view_populator.NIL == proof_view_populator_doneP(populator)) {
            Semaphores.semaphore_signal(proof_view_populator_worker_semaphore(populator));
            Semaphores.semaphore_wait(proof_view_populator_master_semaphore(populator));
        }
        return list_utilities.last_one(proof_view.proof_view_get_entries(proof_view_populator_proof_view(populator)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 3288L)
    public static SubLObject proof_view_populator_note_done(final SubLObject populator) {
        _csetf_pvp_process(populator, (SubLObject)proof_view_populator.$kw31$DONE);
        Semaphores.semaphore_signal(proof_view_populator_master_semaphore(populator));
        return pvp_process(populator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 4178L)
    public static SubLObject proof_view_launch_stepwise_populator(final SubLObject v_proof_view, SubLObject mt, SubLObject proof_index_string) {
        if (mt == proof_view_populator.UNPROVIDED) {
            mt = pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(proof_view.proof_view_get_answer(v_proof_view)));
        }
        if (proof_index_string == proof_view_populator.UNPROVIDED) {
            proof_index_string = (SubLObject)proof_view_populator.$str32$proof;
        }
        final SubLObject populator = new_proof_view_populator(v_proof_view);
        _csetf_pvp_process(populator, process_utilities.make_cyc_server_process_with_args((SubLObject)proof_view_populator.$str33$Proof_View_Populator, (SubLObject)proof_view_populator.$sym34$PROOF_VIEW_POPULATE, (SubLObject)ConsesLow.list(v_proof_view, mt, proof_index_string, populator)));
        return populator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 4727L)
    public static SubLObject proof_view_populate(final SubLObject v_proof_view, SubLObject mt, SubLObject proof_index_string, SubLObject populator) {
        if (mt == proof_view_populator.UNPROVIDED) {
            mt = pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(proof_view.proof_view_get_answer(v_proof_view)));
        }
        if (proof_index_string == proof_view_populator.UNPROVIDED) {
            proof_index_string = (SubLObject)proof_view_populator.$str32$proof;
        }
        if (populator == proof_view_populator.UNPROVIDED) {
            populator = proof_view_populator.$proof_view_populator$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert proof_view_populator.NIL != proof_view.proof_view_p(v_proof_view) : v_proof_view;
        assert proof_view_populator.NIL != hlmt.hlmt_p(mt) : mt;
        assert proof_view_populator.NIL != Types.stringp(proof_index_string) : proof_index_string;
        final SubLObject _prev_bind_0 = proof_view_populator.$proof_view_populator$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_5 = proof_view.$proof_view_debugP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_irrelevant_warnP$.currentBinding(thread);
        try {
            proof_view_populator.$proof_view_populator$.bind(populator, thread);
            pph_vars.$pph_domain_mt$.bind(proof_view.proof_view_get_domain_mt(v_proof_view), thread);
            pph_vars.$pph_language_mt$.bind(proof_view.proof_view_get_language_mt(v_proof_view), thread);
            pph_vars.$pph_addressee$.bind(proof_view.proof_view_get_addressee(v_proof_view), thread);
            proof_view.$proof_view_debugP$.bind((SubLObject)SubLObjectFactory.makeBoolean(proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread) || proof_view_populator.NIL != proof_view.proof_view_get_enable_debugP(v_proof_view)), thread);
            pph_vars.$pph_irrelevant_warnP$.bind((SubLObject)SubLObjectFactory.makeBoolean(proof_view_populator.NIL != pph_vars.$pph_irrelevant_warnP$.getDynamicValue(thread) || proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)), thread);
            SubLObject error_output = (SubLObject)proof_view_populator.NIL;
            maybe_pause_proof_view_population((SubLObject)proof_view_populator.UNPROVIDED);
            SubLObject error_output_stream = (SubLObject)proof_view_populator.NIL;
            try {
                error_output_stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_0_$1 = StreamsLow.$error_output$.currentBinding(thread);
                try {
                    StreamsLow.$error_output$.bind(streams_high.make_broadcast_stream((SubLObject)ConsesLow.list(StreamsLow.$error_output$.getDynamicValue(thread), error_output_stream)), thread);
                    proof_view.proof_view_set_addressee(v_proof_view, pph_vars.$pph_addressee$.getDynamicValue(thread));
                    proof_view_add_query_and_answer_section(v_proof_view, mt);
                    if (proof_view_populator.NIL != proof_view_summary.proof_view_get_include_summary_sectionP(v_proof_view)) {
                        proof_view_summary.proof_view_add_inference_proof_summary_root(v_proof_view);
                    }
                    if (proof_view_populator.NIL != proof_view.proof_view_get_include_rules_sectionP(v_proof_view)) {
                        proof_view_add_inference_proof_used_rules_root(v_proof_view);
                    }
                    proof_view_maybe_add_justification_section(v_proof_view, mt, proof_index_string);
                    proof_view_add_special_sections(v_proof_view);
                    if (proof_view_populator.NIL != proof_view_summary.proof_view_get_include_summary_sectionP(v_proof_view)) {
                        proof_view_summary.proof_view_flesh_out_inference_proof_summary(v_proof_view, mt);
                    }
                    proof_view_maybe_flesh_out_rules_section(v_proof_view, mt);
                    proof_view_summary.proof_view_maybe_remove_inference_proof_summary_root(v_proof_view);
                    if (proof_view_populator.NIL == proof_view.proof_view_get_include_justification_sectionP(v_proof_view) && proof_view_populator.NIL != proof_view.proof_view_has_justification_sectionP(v_proof_view)) {
                        proof_view_remove_entry(v_proof_view, proof_view_get_justification_root_entry(v_proof_view));
                        proof_view_rem_property(v_proof_view, (SubLObject)proof_view_populator.$kw38$JUSTIFICATION_ROOT);
                    }
                    proof_view_maybe_add_source_citations(v_proof_view);
                    final SubLObject summary_root = proof_view_summary.proof_view_get_summary_root(v_proof_view);
                    if (proof_view_populator.NIL != summary_root && proof_view_populator.NIL == proof_view.proof_view_entry_get_children(summary_root) && proof_view_populator.NIL == proof_view.proof_view_has_justification_sectionP(v_proof_view) && proof_view_populator.NIL == proof_view_linear.proof_view_has_linear_sectionP(v_proof_view)) {
                        proof_view_note_no_justification(v_proof_view, summary_root);
                    }
                }
                finally {
                    StreamsLow.$error_output$.rebind(_prev_bind_0_$1, thread);
                }
                error_output = streams_high.get_output_stream_string(error_output_stream);
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)proof_view_populator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(error_output_stream, (SubLObject)proof_view_populator.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
            proof_view_set_error_output(v_proof_view, error_output);
        }
        finally {
            pph_vars.$pph_irrelevant_warnP$.rebind(_prev_bind_6, thread);
            proof_view.$proof_view_debugP$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_language_mt$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            proof_view_populator.$proof_view_populator$.rebind(_prev_bind_0, thread);
        }
        proof_view_set_populated_universal_time(v_proof_view, (SubLObject)proof_view_populator.UNPROVIDED);
        if (proof_view_populator.NIL != misc_utilities.initialized_p(populator)) {
            proof_view_populator_note_done(populator);
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 7326L)
    public static SubLObject proof_view_note_no_justification(final SubLObject v_proof_view, final SubLObject parent) {
        proof_view_entry_note_expand_initially(parent);
        return proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str39$, parent, (SubLObject)proof_view_populator.$kw40$NO_JUSTIFICATION, (SubLObject)proof_view_populator.$str41$IGNORE, (SubLObject)proof_view_populator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 7530L)
    public static SubLObject proof_view_set_populated_universal_time(final SubLObject v_proof_view, SubLObject universal_time) {
        if (universal_time == proof_view_populator.UNPROVIDED) {
            universal_time = Time.get_universal_time();
        }
        assert proof_view_populator.NIL != numeric_date_utilities.universal_time_p(universal_time) : universal_time;
        return proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_populator.$kw43$POPULATED_UNIVERSAL_TIME, universal_time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 7782L)
    public static SubLObject proof_view_set_error_output(final SubLObject v_proof_view, final SubLObject error_output) {
        return proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_populator.$kw44$ERROR_OUTPUT, error_output);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 7926L)
    public static SubLObject proof_view_maybe_add_source_citations(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source_index = proof_view.proof_view_get_source_index(v_proof_view);
        if (proof_view_populator.NIL != dictionary.dictionary_p(source_index) && proof_view_populator.NIL == dictionary.dictionary_empty_p(source_index)) {
            final SubLObject root_entry = proof_view_add_section_root(v_proof_view, proof_view.$proof_view_sources_label$.getDynamicValue(thread));
            SubLObject source_citations = (SubLObject)proof_view_populator.NIL;
            proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_populator.$kw45$SOURCES_ROOT, root_entry);
            proof_view_entry_note_expand_initially(root_entry);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source_index)); proof_view_populator.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject source = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject citation = thread.secondMultipleValue();
                thread.resetMultipleValues();
                source_citations = (SubLObject)ConsesLow.cons(citation, source_citations);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            SubLObject cdolist_list_var;
            source_citations = (cdolist_list_var = Sort.sort(source_citations, Symbols.symbol_function((SubLObject)proof_view_populator.$sym46$_), (SubLObject)proof_view_populator.$sym47$PPH_SOURCE_CITATION_ID));
            SubLObject citation2 = (SubLObject)proof_view_populator.NIL;
            citation2 = cdolist_list_var.first();
            while (proof_view_populator.NIL != cdolist_list_var) {
                proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str39$, root_entry, (SubLObject)proof_view_populator.$kw48$SOURCE_CITATION, citation2, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym50$PROOF_VIEW_MAYBE_ADD_SOURCE_CITATIONS));
                cdolist_list_var = cdolist_list_var.rest();
                citation2 = cdolist_list_var.first();
            }
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 8812L)
    public static SubLObject proof_view_maybe_flesh_out_rules_section(final SubLObject v_proof_view, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (proof_view_populator.NIL != proof_view.proof_view_get_include_rules_sectionP(v_proof_view)) {
            SubLObject rules = list_utilities.remove_if_not((SubLObject)proof_view_populator.$sym51$RULE_ASSERTION_, Mapping.mapcar((SubLObject)proof_view_populator.$sym52$PROOF_VIEW_ENTRY_GET_OBJECT, proof_view_summary.proof_view_get_proof_summary_items(v_proof_view)), (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
            final SubLObject minimum_worth_showing = (SubLObject)proof_view_populator.ONE_INTEGER;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                rules = list_utilities.remove_if_not((SubLObject)proof_view_populator.$sym53$PROOF_VIEW_RULE_SUITABLE_FOR_RULES_SECTION_, rules, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            final SubLObject rules_used_section_root = proof_view.proof_view_get_used_rules_root(v_proof_view);
            if (proof_view_populator.NIL != list_utilities.lengthGE(rules, minimum_worth_showing, (SubLObject)proof_view_populator.UNPROVIDED)) {
                SubLObject cdolist_list_var = rules;
                SubLObject item = (SubLObject)proof_view_populator.NIL;
                item = cdolist_list_var.first();
                while (proof_view_populator.NIL != cdolist_list_var) {
                    proof_view_add_rule_used(v_proof_view, rules_used_section_root, item, mt);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
            }
            else {
                proof_view_remove_entry(v_proof_view, rules_used_section_root);
            }
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 9591L)
    public static SubLObject define_proof_view_special_section_populator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)proof_view_populator.NIL;
        SubLObject arglist = (SubLObject)proof_view_populator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)proof_view_populator.$list54);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)proof_view_populator.$list54);
        arglist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)proof_view_populator.$list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject section_key = (SubLObject)proof_view_populator.NIL;
        SubLObject include_by_defaultP = (SubLObject)proof_view_populator.NIL;
        SubLObject cyc_term = (SubLObject)proof_view_populator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)proof_view_populator.$list54);
        section_key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)proof_view_populator.$list54);
        include_by_defaultP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)proof_view_populator.$list54);
        cyc_term = current.first();
        current = current.rest();
        if (proof_view_populator.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$sym55$PROGN, (SubLObject)ConsesLow.listS((SubLObject)proof_view_populator.$sym56$DEFINE_PRIVATE_FUNCALL, name, arglist, ConsesLow.append(body, (SubLObject)proof_view_populator.NIL)), (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$sym57$NOTE_PROOF_VIEW_SPECIAL_SECTION_POPULATOR, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$sym58$QUOTE, name), section_key, include_by_defaultP, cyc_term));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)proof_view_populator.$list54);
        return (SubLObject)proof_view_populator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 10070L)
    public static SubLObject proof_view_add_special_sections(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_var = proof_view_special_sections_to_include(v_proof_view);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject section_key;
        SubLObject fn;
        SubLObject section_root;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)proof_view_populator.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); proof_view_populator.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            section_key = set_contents.do_set_contents_next(basis_object, state);
            if (proof_view_populator.NIL != set_contents.do_set_contents_element_validP(state, section_key)) {
                fn = dictionary.dictionary_lookup_without_values(proof_view_populator.$proof_view_special_sections$.getGlobalValue(), section_key, (SubLObject)proof_view_populator.UNPROVIDED).first();
                if (fn.isFunctionSpec()) {
                    section_root = Functions.funcall(fn, v_proof_view);
                    proof_view_note_special_section_root(v_proof_view, section_key, section_root);
                }
                else if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    Errors.warn((SubLObject)proof_view_populator.$str61$Can_t_use__S_to_generate__S_secti, fn, section_key);
                }
            }
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 10572L)
    public static SubLObject proof_view_note_special_section_root(final SubLObject v_proof_view, final SubLObject section_key, final SubLObject section_root) {
        return dictionary.dictionary_enter(proof_view_get_special_section_roots(v_proof_view), section_key, section_root);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 10771L)
    public static SubLObject proof_view_get_special_section_roots(final SubLObject v_proof_view) {
        SubLObject roots = proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_populator.$kw62$SPECIAL_SECTION_ROOTS, misc_utilities.uninitialized());
        if (proof_view_populator.NIL == misc_utilities.initialized_p(roots)) {
            roots = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)proof_view_populator.EQL), (SubLObject)proof_view_populator.UNPROVIDED);
            proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_populator.$kw62$SPECIAL_SECTION_ROOTS, roots);
        }
        return roots;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 11103L)
    public static SubLObject proof_view_get_special_section_root(final SubLObject v_proof_view, final SubLObject section_key) {
        return dictionary.dictionary_lookup_without_values(proof_view_get_special_section_roots(v_proof_view), section_key, (SubLObject)proof_view_populator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 11295L)
    public static SubLObject proof_view_special_sections_to_include(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sections = proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_populator.$kw63$SPECIAL_SECTIONS, misc_utilities.uninitialized());
        if (proof_view_populator.NIL != misc_utilities.uninitialized_p(sections)) {
            sections = set.new_set(Symbols.symbol_function((SubLObject)proof_view_populator.EQL), (SubLObject)proof_view_populator.UNPROVIDED);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(proof_view_populator.$proof_view_special_sections$.getGlobalValue())); proof_view_populator.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject section_key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject data = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (proof_view_populator.NIL != data.rest()) {
                    set.set_add(section_key, sections);
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_populator.$kw63$SPECIAL_SECTIONS, sections);
        }
        return sections;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 11786L)
    public static SubLObject proof_view_set_include_special_sectionP(final SubLObject v_proof_view, final SubLObject section_id, final SubLObject includeP) {
        final SubLObject section_key = proof_view_section_key_from_id(section_id);
        final SubLObject sections = proof_view_special_sections_to_include(v_proof_view);
        return (proof_view_populator.NIL != includeP) ? set.set_add(section_key, sections) : set.set_remove(section_key, sections);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 12100L)
    public static SubLObject proof_view_section_key_from_id(final SubLObject section_id) {
        if (section_id.isKeyword()) {
            return section_id;
        }
        return dictionary.dictionary_lookup(proof_view_populator.$proof_view_special_section_terms$.getGlobalValue(), section_id, (SubLObject)proof_view_populator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 12301L)
    public static SubLObject note_proof_view_special_section_populator(final SubLObject name, final SubLObject section_key, final SubLObject include_by_defaultP, final SubLObject cyc_term) {
        dictionary.dictionary_enter(proof_view_populator.$proof_view_special_sections$.getGlobalValue(), section_key, (SubLObject)ConsesLow.cons(name, include_by_defaultP));
        return dictionary.dictionary_enter(proof_view_populator.$proof_view_special_section_terms$.getGlobalValue(), cyc_term, section_key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 12589L)
    public static SubLObject proof_view_maybe_add_justification_section(final SubLObject v_proof_view, final SubLObject mt, final SubLObject proof_index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (proof_view_populator.NIL != proof_view.proof_view_get_include_justification_sectionP(v_proof_view) || proof_view_populator.NIL != proof_view_summary.proof_view_get_include_summary_sectionP(v_proof_view) || proof_view_populator.NIL != proof_view_linear.proof_view_get_include_linear_sectionP(v_proof_view) || proof_view_populator.NIL != set.non_empty_set_p(proof_view_special_sections_to_include(v_proof_view))) {
            final SubLObject proof = proof_view.proof_view_get_proof(v_proof_view);
            final SubLObject inference_answer = proof_view.proof_view_get_answer(v_proof_view);
            final SubLObject justification_section_root = proof_view_add_section_root(v_proof_view, proof_view.$proof_view_justification_label$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = pph_vars.$pph_non_explanatory_proofs$.currentBinding(thread);
            try {
                pph_vars.$pph_non_explanatory_proofs$.bind(inference_worker.proof_non_explanatory_subproofs(proof), thread);
                final SubLObject pph_relevance_safe_list = pph_relevance_safe_list_for_justification(inference_answer);
                proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_populator.$kw38$JUSTIFICATION_ROOT, justification_section_root);
                construct_inference_proof_view_int(proof, inference_answer, mt, proof_index_string, v_proof_view, justification_section_root, pph_relevance_safe_list);
                proof_view_entry_note_expand_initially(justification_section_root);
                if (proof_view_populator.NIL == list_utilities.sublisp_boolean(proof_view.proof_view_entry_get_children(justification_section_root))) {
                    if (proof_view_populator.NIL != proof_view_summary.proof_view_has_summary_sectionP(v_proof_view)) {
                        proof_view_remove_entry(v_proof_view, justification_section_root);
                    }
                    else {
                        proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str64$Nothing_interesting_available_, justification_section_root, (SubLObject)proof_view_populator.$kw65$EMPTY_JUSTIFICATION, (SubLObject)proof_view_populator.NIL, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym66$PROOF_VIEW_MAYBE_ADD_JUSTIFICATION_SECTION));
                    }
                }
            }
            finally {
                pph_vars.$pph_non_explanatory_proofs$.rebind(_prev_bind_0, thread);
            }
        }
        if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            format_nil.force_format((SubLObject)proof_view_populator.T, (SubLObject)proof_view_populator.$str67$__Done_adding_justification_secti, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 14256L)
    public static SubLObject note_constructing_proof_view_for_conclusion(final SubLObject proof_conclusion) {
        dictionary_utilities.dictionary_increment(proof_view_populator.$proof_conclusion_proof_view_counts$.getGlobalValue(), proof_conclusion, (SubLObject)proof_view_populator.UNPROVIDED);
        return dictionary.dictionary_lookup_without_values(proof_view_populator.$proof_conclusion_proof_view_counts$.getGlobalValue(), proof_conclusion, (SubLObject)proof_view_populator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 14512L)
    public static SubLObject tracking_proof_view_literals_to_suppress(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)proof_view_populator.$list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject new_lits = (SubLObject)proof_view_populator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)proof_view_populator.$list69);
        new_lits = current.first();
        current = current.rest();
        if (proof_view_populator.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)proof_view_populator.$sym70$CLET, (SubLObject)proof_view_populator.$list71, (SubLObject)ConsesLow.listS((SubLObject)proof_view_populator.$sym72$CPUSH_ALL, new_lits, (SubLObject)proof_view_populator.$list73), ConsesLow.append(body, (SubLObject)proof_view_populator.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)proof_view_populator.$list69);
        return (SubLObject)proof_view_populator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 14817L)
    public static SubLObject construct_inference_proof_view_int(final SubLObject proof, final SubLObject inference_answer, final SubLObject mt, final SubLObject proof_index_string, final SubLObject v_proof_view, SubLObject parent_proof_view_entry, SubLObject pph_relevance_safe_list) {
        if (parent_proof_view_entry == proof_view_populator.UNPROVIDED) {
            parent_proof_view_entry = (SubLObject)proof_view_populator.NIL;
        }
        if (pph_relevance_safe_list == proof_view_populator.UNPROVIDED) {
            pph_relevance_safe_list = (SubLObject)proof_view_populator.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert proof_view_populator.NIL != proof_view.valid_proof_view_p(v_proof_view) : v_proof_view;
        if (proof_view_populator.NIL != parent_proof_view_entry && !proof_view_populator.assertionsDisabledInClass && proof_view_populator.NIL == proof_view.proof_view_entry_p(parent_proof_view_entry)) {
            throw new AssertionError(parent_proof_view_entry);
        }
        parent_proof_view_entry = proof_view_residual.maybe_reconsider_parent_proof_view_entry(parent_proof_view_entry, proof);
        final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion(proof, mt);
        final SubLObject traceP = (SubLObject)proof_view_populator.NIL;
        SubLObject suppressP = (SubLObject)proof_view_populator.NIL;
        SubLObject suppression_reason = (SubLObject)proof_view_populator.NIL;
        final SubLObject _prev_bind_0 = proof_view.$proof_view_literals_to_suppress$.currentBinding(thread);
        try {
            proof_view.$proof_view_literals_to_suppress$.bind((SubLObject)((proof_view_populator.NIL != misc_utilities.initialized_p(proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread))) ? proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread) : proof_view_populator.NIL), thread);
            final SubLObject items_var = proof_view_proof_literals_to_suppress(proof, v_proof_view);
            if (items_var.isVector()) {
                final SubLObject vector_var = items_var;
                final SubLObject backwardP_var = (SubLObject)proof_view_populator.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)proof_view_populator.NIL, v_iteration = (SubLObject)proof_view_populator.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)proof_view_populator.ONE_INTEGER)) {
                    element_num = ((proof_view_populator.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)proof_view_populator.ONE_INTEGER) : v_iteration);
                    item = Vectors.aref(vector_var, element_num);
                    proof_view.$proof_view_literals_to_suppress$.setDynamicValue((SubLObject)ConsesLow.cons(item, proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread)), thread);
                }
            }
            else {
                SubLObject cdolist_list_var = items_var;
                SubLObject item2 = (SubLObject)proof_view_populator.NIL;
                item2 = cdolist_list_var.first();
                while (proof_view_populator.NIL != cdolist_list_var) {
                    proof_view.$proof_view_literals_to_suppress$.setDynamicValue((SubLObject)ConsesLow.cons(item2, proof_view.$proof_view_literals_to_suppress$.getDynamicValue(thread)), thread);
                    cdolist_list_var = cdolist_list_var.rest();
                    item2 = cdolist_list_var.first();
                }
            }
            note_constructing_proof_view_for_conclusion(proof_conclusion);
            if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)proof_view_populator.T, (SubLObject)proof_view_populator.$str76$__Adding__S___under__S__, proof, parent_proof_view_entry, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
            }
            if (proof_view_populator.NIL == pph_proof.formula_too_complex_for_proof_paraphraseP(proof_conclusion, (SubLObject)proof_view_populator.UNPROVIDED)) {
                SubLObject cdolist_list_var = cycl_utilities.expression_gather(proof_conclusion, (SubLObject)proof_view_populator.$sym77$FAST_REIFIED_SKOLEM_, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
                SubLObject skolem = (SubLObject)proof_view_populator.NIL;
                skolem = cdolist_list_var.first();
                while (proof_view_populator.NIL != cdolist_list_var) {
                    final SubLObject item_var = skolem;
                    if (proof_view_populator.NIL == conses_high.member(item_var, pph_relevance_safe_list, Symbols.symbol_function((SubLObject)proof_view_populator.EQL), Symbols.symbol_function((SubLObject)proof_view_populator.IDENTITY))) {
                        pph_relevance_safe_list = (SubLObject)ConsesLow.cons(item_var, pph_relevance_safe_list);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    skolem = cdolist_list_var.first();
                }
            }
            if (proof_view_populator.NIL != proof_view_residual.proof_view_proof_relocated_p(proof)) {
                if (proof_view_populator.NIL != traceP) {
                    Errors.sublisp_break((SubLObject)proof_view_populator.$str78$Relocated___S, new SubLObject[] { proof_conclusion });
                }
                suppressP = (SubLObject)proof_view_populator.T;
                suppression_reason = (SubLObject)proof_view_populator.$kw79$RELOCATED;
            }
            else if (proof_view_populator.NIL != proof_view_trivial_proofP(proof, mt)) {
                proof_view.proof_view_note_filtered_item(v_proof_view, proof_conclusion, (SubLObject)proof_view_populator.$kw80$TRIVIAL);
                if (proof_view_populator.NIL != traceP) {
                    Errors.sublisp_break((SubLObject)proof_view_populator.$str81$Trivial, proof_view_populator.EMPTY_SUBL_OBJECT_ARRAY);
                }
                suppressP = (SubLObject)proof_view_populator.T;
                suppression_reason = (SubLObject)proof_view_populator.$kw80$TRIVIAL;
            }
            else if (proof_view_populator.NIL != proof_conclusion_for_query_pragmaP(proof_conclusion, inference_answer)) {
                proof_view.proof_view_note_filtered_item(v_proof_view, proof_conclusion, (SubLObject)proof_view_populator.$kw82$QUERY_PRAGMA);
                suppressP = (SubLObject)proof_view_populator.T;
                suppression_reason = (SubLObject)proof_view_populator.$kw82$QUERY_PRAGMA;
            }
            else if (proof_view_populator.NIL != proof_view.proof_view_has_entry_for_objectP(v_proof_view, proof_conclusion, parent_proof_view_entry)) {
                if (proof_view_populator.NIL != traceP) {
                    Errors.sublisp_break((SubLObject)proof_view_populator.$str83$Has_entry_already_, proof_view_populator.EMPTY_SUBL_OBJECT_ARRAY);
                }
                suppressP = (SubLObject)proof_view_populator.T;
                suppression_reason = (SubLObject)proof_view_populator.$kw84$DUPLICATE;
            }
            else if (proof_view_populator.NIL != parent_proof_view_entry && proof_view_populator.NIL != proof_view_residual.proof_view_conjunctive_removal_proof_p(proof, mt)) {
                SubLObject cdolist_list_var2;
                final SubLObject supports = cdolist_list_var2 = pph_proof.pph_sub_isomorphic_assertions_into_supports(pph_proof.pph_displayworthy_supports(proof, (SubLObject)proof_view_populator.NIL, mt, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED));
                SubLObject support = (SubLObject)proof_view_populator.NIL;
                support = cdolist_list_var2.first();
                while (proof_view_populator.NIL != cdolist_list_var2) {
                    final SubLObject support_entry = proof_view_add_support_tree(v_proof_view, support, parent_proof_view_entry, mt, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
                    if (proof_view_populator.NIL != support_entry) {
                        proof_view.proof_view_entry_set_proof(support_entry, proof);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    support = cdolist_list_var2.first();
                }
                proof_view_note_already_handled(v_proof_view, proof);
            }
            else if (proof_view_populator.NIL != proof_view_situation_constituents_proof_p(proof)) {
                proof_view_add_entries_for_situation_constituents_proof(v_proof_view, proof, parent_proof_view_entry, mt);
            }
            else if (proof_view_populator.NIL != proof_view_entity_mentions_proofP(proof, mt)) {
                proof_view_add_entity_mention_entries(v_proof_view, proof, parent_proof_view_entry, mt);
            }
            else if (proof_view_populator.NIL != inference_worker.structural_proof_p(proof)) {
                SubLObject list_var = (SubLObject)proof_view_populator.NIL;
                SubLObject subproof = (SubLObject)proof_view_populator.NIL;
                SubLObject i = (SubLObject)proof_view_populator.NIL;
                list_var = pph_proof.pph_proof_subproofs(proof);
                subproof = list_var.first();
                for (i = (SubLObject)proof_view_populator.ZERO_INTEGER; proof_view_populator.NIL != list_var; list_var = list_var.rest(), subproof = list_var.first(), i = Numbers.add((SubLObject)proof_view_populator.ONE_INTEGER, i)) {
                    construct_inference_proof_view_int(subproof, inference_answer, mt, proof_index_string, v_proof_view, parent_proof_view_entry, pph_relevance_safe_list);
                }
            }
            else if (proof_view_populator.NIL != proof_view_proof_already_handledP(v_proof_view, proof)) {
                suppressP = (SubLObject)proof_view_populator.T;
                suppression_reason = (SubLObject)proof_view_populator.$kw85$ALREADY_HANDLED;
            }
            else if (proof_view_populator.NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
                proof_view_residual.proof_view_add_entries_for_residual_transformation_proof(v_proof_view, proof, parent_proof_view_entry, mt, inference_answer, proof_index_string, pph_relevance_safe_list);
            }
            else if (proof_view_populator.NIL != pph_proof.pph_irrelevant_formulaP(proof_conclusion, pph_relevance_safe_list, (SubLObject)proof_view_populator.UNPROVIDED)) {
                proof_view.proof_view_note_filtered_item(v_proof_view, proof_conclusion, (SubLObject)proof_view_populator.$kw86$IRRELEVANT);
                suppressP = (SubLObject)proof_view_populator.T;
                suppression_reason = (SubLObject)proof_view_populator.$kw86$IRRELEVANT;
            }
            else if (proof_view_populator.NIL != pph_proof.pph_proof_wX_isomorphic_support_p(proof)) {
                final SubLObject isomorphic_support = pph_proof.pph_sub_isomorphic_assertions_into_supports(inference_datastructures_proof.proof_supports(proof)).first();
                if (proof_view_populator.NIL != traceP) {
                    PrintLow.format((SubLObject)proof_view_populator.T, (SubLObject)proof_view_populator.$str87$Proof_has_isomorphic_support___A, isomorphic_support);
                }
                if (proof_view_populator.NIL != pph_proof.pph_irrelevant_supportP(isomorphic_support, pph_relevance_safe_list, (SubLObject)proof_view_populator.UNPROVIDED)) {
                    proof_view.proof_view_note_filtered_item(v_proof_view, isomorphic_support, (SubLObject)proof_view_populator.$kw86$IRRELEVANT);
                }
                else {
                    final SubLObject support_entry2 = proof_view_add_support_tree(v_proof_view, isomorphic_support, parent_proof_view_entry, mt, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
                    if (proof_view_populator.NIL != support_entry2) {
                        proof_view.proof_view_entry_set_proof(support_entry2, proof);
                    }
                }
            }
            else if (proof_view_populator.NIL != proof_view.suppress_proof_view_literalP(proof_view.proof_view_fact_sentence(proof_conclusion))) {
                suppressP = (SubLObject)proof_view_populator.T;
                suppression_reason = (SubLObject)proof_view_populator.$kw88$SUPPRESSED;
            }
            else {
                construct_default_proof_view(proof, inference_answer, v_proof_view, parent_proof_view_entry, mt, proof_index_string, traceP, pph_relevance_safe_list);
            }
        }
        finally {
            proof_view.$proof_view_literals_to_suppress$.rebind(_prev_bind_0, thread);
        }
        if (proof_view_populator.NIL != suppressP) {
            proof_view.proof_view_note_filtered_item(v_proof_view, proof_conclusion, suppression_reason);
        }
        return (proof_view_populator.NIL != parent_proof_view_entry) ? proof_view.proof_view_entry_get_children(parent_proof_view_entry) : proof_view.proof_view_get_root_entry(v_proof_view);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 19552L)
    public static SubLObject construct_default_proof_view(final SubLObject proof, final SubLObject inference_answer, final SubLObject v_proof_view, final SubLObject parent_proof_view_entry, final SubLObject mt, final SubLObject proof_index_string, SubLObject traceP, SubLObject pph_relevance_safe_list) {
        if (traceP == proof_view_populator.UNPROVIDED) {
            traceP = (SubLObject)proof_view_populator.NIL;
        }
        if (pph_relevance_safe_list == proof_view_populator.UNPROVIDED) {
            pph_relevance_safe_list = (SubLObject)proof_view_populator.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (proof_view_populator.NIL != traceP && proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)proof_view_populator.$str89$Constructing_default_proof_view_f, proof);
        }
        final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion(proof, mt);
        final SubLObject object_type = (SubLObject)((proof_view_populator.NIL != assertion_handles.assertion_p(proof_conclusion)) ? proof_view_populator.$sym90$ASSERTION_P : proof_view_populator.$sym91$EL_SENTENCE_P);
        final SubLObject supports = pph_proof.pph_sub_isomorphic_assertions_into_supports(pph_proof.pph_displayworthy_supports(proof, (SubLObject)proof_view_populator.NIL, mt, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED));
        final SubLObject subproofs = pph_proof.pph_proof_subproofs(proof);
        final SubLObject label = (proof_view_populator.NIL != supports || proof_view_populator.NIL != subproofs) ? proof_view.$proof_view_inferred_label$.getDynamicValue(thread) : proof_view.$proof_view_opaque_label$.getDynamicValue(thread);
        final SubLObject subentry_parent_entry = (proof_view_populator.NIL != proof_view.proof_view_has_entry_for_objectP(v_proof_view, proof_conclusion, parent_proof_view_entry)) ? parent_proof_view_entry : proof_view_add_new_entry(v_proof_view, label, parent_proof_view_entry, object_type, proof_conclusion, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym92$CONSTRUCT_DEFAULT_PROOF_VIEW, (SubLObject)proof_view_populator.$kw93$PROOF, proof));
        if (proof_view_populator.NIL != traceP && proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)proof_view_populator.$str94$Adding_sub_entries_under__S, subentry_parent_entry);
        }
        SubLObject cdolist_list_var = supports;
        SubLObject support = (SubLObject)proof_view_populator.NIL;
        support = cdolist_list_var.first();
        while (proof_view_populator.NIL != cdolist_list_var) {
            final SubLObject support_entry = proof_view_add_support_tree(v_proof_view, support, subentry_parent_entry, mt, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
            if (proof_view_populator.NIL != support_entry) {
                proof_view.proof_view_entry_set_proof(support_entry, proof);
            }
            else if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_populator.$str95$Couldn_t_add_entry_for_support___, support);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        SubLObject list_var = (SubLObject)proof_view_populator.NIL;
        SubLObject subproof = (SubLObject)proof_view_populator.NIL;
        SubLObject i = (SubLObject)proof_view_populator.NIL;
        list_var = subproofs;
        subproof = list_var.first();
        for (i = (SubLObject)proof_view_populator.ZERO_INTEGER; proof_view_populator.NIL != list_var; list_var = list_var.rest(), subproof = list_var.first(), i = Numbers.add((SubLObject)proof_view_populator.ONE_INTEGER, i)) {
            final SubLObject index_string = Sequences.cconcatenate(proof_index_string, print_high.princ_to_string(i));
            construct_inference_proof_view_int(subproof, inference_answer, mt, index_string, v_proof_view, subentry_parent_entry, pph_relevance_safe_list);
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 21277L)
    public static SubLObject proof_view_trivial_proofP(final SubLObject proof, final SubLObject mt) {
        if (proof_view_populator.NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
            return (SubLObject)proof_view_populator.NIL;
        }
        if (proof_view_populator.NIL != trivial_proof_conclusionP(proof, mt)) {
            return (SubLObject)proof_view_populator.T;
        }
        return (SubLObject)proof_view_populator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 21556L)
    public static SubLObject trivial_proof_conclusionP(final SubLObject proof, final SubLObject mt) {
        final SubLObject conclusion = pph_proof.pph_proof_conclusion(proof, mt);
        SubLObject trivialP = pph_proof.pph_trivial_sentenceP(conclusion, (SubLObject)proof_view_populator.UNPROVIDED);
        if (proof_view_populator.NIL != assertion_handles.assertion_p(conclusion) && proof_view_populator.NIL == assertions_high.asserted_assertionP(conclusion)) {
            final SubLObject args = cycl_utilities.formula_args(conclusion, (SubLObject)proof_view_populator.$kw96$IGNORE);
            SubLObject rest;
            SubLObject assertion_arg;
            SubLObject nart;
            SubLObject okP;
            SubLObject args_$3;
            SubLObject rest_$4;
            SubLObject other_assertion_arg;
            for (rest = (SubLObject)proof_view_populator.NIL, rest = args; proof_view_populator.NIL == trivialP && proof_view_populator.NIL != rest; rest = rest.rest()) {
                assertion_arg = rest.first();
                if (proof_view_populator.NIL != nart_handles.nart_p(assertion_arg)) {
                    nart = assertion_arg;
                    okP = proof_binds_some_variable_to_valueP(proof, nart, (SubLObject)proof_view_populator.UNPROVIDED);
                    args_$3 = cycl_utilities.formula_args(conclusion, (SubLObject)proof_view_populator.$kw96$IGNORE);
                    for (rest_$4 = (SubLObject)proof_view_populator.NIL, rest_$4 = args_$3; proof_view_populator.NIL == okP && proof_view_populator.NIL != rest_$4; rest_$4 = rest_$4.rest()) {
                        other_assertion_arg = rest_$4.first();
                        if (!other_assertion_arg.eql(nart) && proof_view_populator.NIL == subl_promotions.memberP(other_assertion_arg, cycl_utilities.nat_args(nart, (SubLObject)proof_view_populator.UNPROVIDED), Symbols.symbol_function((SubLObject)proof_view_populator.EQL), (SubLObject)proof_view_populator.UNPROVIDED)) {
                            okP = (SubLObject)proof_view_populator.T;
                        }
                    }
                    trivialP = (SubLObject)SubLObjectFactory.makeBoolean(proof_view_populator.NIL == okP);
                }
            }
        }
        return trivialP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 22389L)
    public static SubLObject proof_binds_some_variable_to_valueP(final SubLObject proof, final SubLObject value, SubLObject seen) {
        if (seen == proof_view_populator.UNPROVIDED) {
            seen = set.new_set((SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
        }
        if (proof_view_populator.NIL == set.set_memberP(proof, seen)) {
            set.set_add(proof, seen);
            if (proof_view_populator.NIL != subl_promotions.memberP(value, inference_datastructures_proof.proof_bindings(proof), (SubLObject)proof_view_populator.EQUAL, (SubLObject)proof_view_populator.$sym97$VARIABLE_BINDING_VALUE)) {
                return (SubLObject)proof_view_populator.T;
            }
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_dependent_proofs(proof, (SubLObject)proof_view_populator.UNPROVIDED);
            SubLObject dependent_proof = (SubLObject)proof_view_populator.NIL;
            dependent_proof = cdolist_list_var.first();
            while (proof_view_populator.NIL != cdolist_list_var) {
                if (proof_view_populator.NIL != proof_binds_some_variable_to_valueP(dependent_proof, value, seen)) {
                    return (SubLObject)proof_view_populator.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                dependent_proof = cdolist_list_var.first();
            }
        }
        return (SubLObject)proof_view_populator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 22806L)
    public static SubLObject proof_conclusion_for_query_pragmaP(final SubLObject proof_conclusion, final SubLObject inference_answer) {
        if (proof_view_populator.NIL != el_utilities.el_formula_p(proof_conclusion)) {
            final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
            final SubLObject pragma = inference_datastructures_inference.inference_input_non_explanatory_el_query(inference);
            SubLObject cdolist_list_var;
            final SubLObject pragma_conjuncts = cdolist_list_var = (SubLObject)((proof_view_populator.NIL != pragma) ? ((proof_view_populator.NIL != el_utilities.el_conjunction_p(pragma)) ? cycl_utilities.formula_args(pragma, (SubLObject)proof_view_populator.UNPROVIDED) : ConsesLow.list(pragma)) : proof_view_populator.NIL);
            SubLObject pragma_conjunct = (SubLObject)proof_view_populator.NIL;
            pragma_conjunct = cdolist_list_var.first();
            while (proof_view_populator.NIL != cdolist_list_var) {
                final SubLObject pattern = cycl_utilities.expression_transform(pragma_conjunct, (SubLObject)proof_view_populator.$sym98$EL_VAR_, (SubLObject)proof_view_populator.$sym99$ANYTHING_TOKEN, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
                if (proof_view_populator.NIL != formula_pattern_match.formula_matches_pattern(proof_conclusion, pattern)) {
                    return (SubLObject)proof_view_populator.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                pragma_conjunct = cdolist_list_var.first();
            }
        }
        return (SubLObject)proof_view_populator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 23430L)
    public static SubLObject proof_view_proof_literals_to_suppress(final SubLObject proof, final SubLObject v_proof_view) {
        return proof_literals_to_suppress(proof, proof_view.proof_view_get_addressee(v_proof_view));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 23588L)
    public static SubLObject proof_literals_to_suppress_internal(final SubLObject proof, SubLObject addressee) {
        if (addressee == proof_view_populator.UNPROVIDED) {
            addressee = pph_vars.$pph_addressee$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_addressee$.currentBinding(thread);
        try {
            pph_vars.$pph_addressee$.bind(addressee, thread);
            SubLObject lits = (SubLObject)proof_view_populator.NIL;
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_supports(proof);
            SubLObject support = (SubLObject)proof_view_populator.NIL;
            support = cdolist_list_var.first();
            while (proof_view_populator.NIL != cdolist_list_var) {
                SubLObject literals_to_suppress = (SubLObject)((proof_view_populator.NIL != assertions_high.rule_assertionP(support)) ? pph_proof.pph_rule_literals_to_suppress(support, (SubLObject)proof_view_populator.UNPROVIDED) : proof_view_populator.NIL);
                if (proof_view_populator.NIL != literals_to_suppress) {
                    final SubLObject rule = support;
                    final SubLObject rule_bindings = (SubLObject)((proof_view_populator.NIL != inference_worker_transformation.transformation_proof_p(proof)) ? inference_worker_transformation.transformation_proof_rule_bindings(proof) : ((proof_view_populator.NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) ? inference_worker_residual_transformation.residual_transformation_proof_rule_bindings(proof) : proof_view_populator.NIL));
                    final SubLObject variable_map = inference_worker_transformation.rule_assertion_variable_map(rule);
                    final SubLObject rule_el_bindings = bindings.transfer_variable_map_to_bindings_backwards_filtered(variable_map, rule_bindings);
                    if (proof_view_populator.NIL != rule_el_bindings) {
                        literals_to_suppress = bindings.apply_bindings(rule_el_bindings, literals_to_suppress);
                    }
                    final SubLObject items_var = literals_to_suppress;
                    if (items_var.isVector()) {
                        final SubLObject vector_var = items_var;
                        final SubLObject backwardP_var = (SubLObject)proof_view_populator.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject item;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)proof_view_populator.NIL, v_iteration = (SubLObject)proof_view_populator.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)proof_view_populator.ONE_INTEGER)) {
                            element_num = ((proof_view_populator.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)proof_view_populator.ONE_INTEGER) : v_iteration);
                            item = Vectors.aref(vector_var, element_num);
                            lits = (SubLObject)ConsesLow.cons(item, lits);
                        }
                    }
                    else {
                        SubLObject cdolist_list_var_$5 = items_var;
                        SubLObject item2 = (SubLObject)proof_view_populator.NIL;
                        item2 = cdolist_list_var_$5.first();
                        while (proof_view_populator.NIL != cdolist_list_var_$5) {
                            lits = (SubLObject)ConsesLow.cons(item2, lits);
                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                            item2 = cdolist_list_var_$5.first();
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
            return lits;
        }
        finally {
            pph_vars.$pph_addressee$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 23588L)
    public static SubLObject proof_literals_to_suppress(final SubLObject proof, SubLObject addressee) {
        if (addressee == proof_view_populator.UNPROVIDED) {
            addressee = pph_vars.$pph_addressee$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)proof_view_populator.NIL;
        if (proof_view_populator.NIL == v_memoization_state) {
            return proof_literals_to_suppress_internal(proof, addressee);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)proof_view_populator.$sym100$PROOF_LITERALS_TO_SUPPRESS, (SubLObject)proof_view_populator.UNPROVIDED);
        if (proof_view_populator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)proof_view_populator.$sym100$PROOF_LITERALS_TO_SUPPRESS, (SubLObject)proof_view_populator.TWO_INTEGER, (SubLObject)proof_view_populator.NIL, (SubLObject)proof_view_populator.EQUAL, (SubLObject)proof_view_populator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)proof_view_populator.$sym100$PROOF_LITERALS_TO_SUPPRESS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(proof, addressee);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)proof_view_populator.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)proof_view_populator.NIL;
            collision = cdolist_list_var.first();
            while (proof_view_populator.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (proof.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (proof_view_populator.NIL != cached_args && proof_view_populator.NIL == cached_args.rest() && addressee.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(proof_literals_to_suppress_internal(proof, addressee)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(proof, addressee));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 24568L)
    public static SubLObject proof_view_proof_already_handledP(final SubLObject v_proof_view, final SubLObject proof) {
        final SubLObject already_handled = proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_populator.$kw102$ALREADY_HANDLED_PROOFS, (SubLObject)proof_view_populator.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(proof_view_populator.NIL != set.set_p(already_handled) && proof_view_populator.NIL != set.set_memberP(proof, already_handled));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 24808L)
    public static SubLObject proof_view_note_already_handled(final SubLObject v_proof_view, final SubLObject proof) {
        SubLObject already_handled = proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_populator.$kw102$ALREADY_HANDLED_PROOFS, (SubLObject)proof_view_populator.UNPROVIDED);
        if (proof_view_populator.NIL == set.set_p(already_handled)) {
            already_handled = set.new_set(Symbols.symbol_function((SubLObject)proof_view_populator.EQL), (SubLObject)proof_view_populator.UNPROVIDED);
            proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_populator.$kw102$ALREADY_HANDLED_PROOFS, already_handled);
        }
        set.set_add(proof, already_handled);
        return already_handled;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 25198L)
    public static SubLObject pph_relevance_safe_list_for_justification(final SubLObject inference_answer) {
        return (SubLObject)ConsesLow.cons(inference_datastructures_inference.inference_el_query(inference_datastructures_inference.inference_answer_inference(inference_answer)), inference_answer_binding_targets(inference_answer));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 25541L)
    public static SubLObject inference_answer_binding_targets(final SubLObject inference_answer) {
        return list_utilities.alist_values(inference_datastructures_inference.inference_answer_bindings(inference_answer));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 25999L)
    public static SubLObject proof_view_add_inference_proof_used_rules_root(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject root = proof_view_add_section_root(v_proof_view, proof_view.$proof_view_rules_used_label$.getDynamicValue(thread));
        proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_populator.$kw103$USED_RULES_ROOT, root);
        return root;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 26244L)
    public static SubLObject proof_view_add_query_and_answer_section(final SubLObject v_proof_view, final SubLObject mt) {
        final SubLObject inference_answer = proof_view.proof_view_get_answer(v_proof_view);
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
        final SubLObject input_query_sentence = inference_datastructures_inference.inference_input_el_query(inference);
        final SubLObject query_sentence = (proof_view_populator.NIL != el_utilities.ist_sentence_p(input_query_sentence, (SubLObject)proof_view_populator.UNPROVIDED)) ? cycl_utilities.formula_arg2(input_query_sentence, (SubLObject)proof_view_populator.UNPROVIDED) : input_query_sentence;
        final SubLObject query_entry = proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str104$Query_, (SubLObject)proof_view_populator.NIL, (SubLObject)proof_view_populator.$kw105$QUERY_SENTENCE, query_sentence, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym106$PROOF_VIEW_ADD_QUERY_AND_ANSWER_SECTION));
        proof_view_entry_note_expand_initially(query_entry);
        proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_populator.$kw107$QUERY_ROOT, query_entry);
        final SubLObject answer_entry = construct_proof_view_answer_entry(v_proof_view, mt, query_entry);
        proof_view_entry_note_expand_initially(answer_entry);
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 27103L)
    public static SubLObject construct_proof_view_answer_entry(final SubLObject v_proof_view, final SubLObject mt, final SubLObject query_entry) {
        final SubLObject inference_answer = proof_view.proof_view_get_answer(v_proof_view);
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(inference_answer);
        final SubLObject input_query_sentence = inference_datastructures_inference.inference_input_el_query(inference);
        final SubLObject query_sentence = (proof_view_populator.NIL != el_utilities.ist_sentence_p(input_query_sentence, (SubLObject)proof_view_populator.UNPROVIDED)) ? cycl_utilities.formula_arg2(input_query_sentence, (SubLObject)proof_view_populator.UNPROVIDED) : input_query_sentence;
        final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings(inference_answer);
        final SubLObject answer_label = (SubLObject)proof_view_populator.$str108$Answer_;
        if (proof_view_populator.NIL == v_bindings) {
            final SubLObject value = proof_view.proof_view_closed_query_success_value();
            return proof_view_add_new_entry(v_proof_view, answer_label, query_entry, (SubLObject)proof_view_populator.$sym109$EL_TERM_P, value, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym110$CONSTRUCT_PROOF_VIEW_ANSWER_ENTRY, (SubLObject)proof_view_populator.$kw111$FN_SECTION, (SubLObject)proof_view_populator.$sym112$NULL_BINDINGS));
        }
        if (proof_view_populator.NIL != list_utilities.singletonP(v_bindings)) {
            final SubLObject binding = v_bindings.first();
            final SubLObject value2 = bindings.variable_binding_value(binding);
            if (proof_view_populator.NIL != cycl_grammar.cycl_expression_p(value2)) {
                return proof_view_add_new_entry(v_proof_view, answer_label, query_entry, (SubLObject)proof_view_populator.$sym109$EL_TERM_P, value2, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym110$CONSTRUCT_PROOF_VIEW_ANSWER_ENTRY, (SubLObject)proof_view_populator.$kw111$FN_SECTION, (SubLObject)proof_view_populator.$sym113$ONE_BINDING));
            }
        }
        if (proof_view_populator.NIL != el_utilities.atomic_sentenceP(query_sentence)) {
            final SubLObject proof = proof_view.proof_view_get_proof(v_proof_view);
            final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion(proof, mt);
            final SubLObject type = (SubLObject)((proof_view_populator.NIL != assertion_handles.assertion_p(proof_conclusion)) ? proof_view_populator.$sym90$ASSERTION_P : proof_view_populator.$sym91$EL_SENTENCE_P);
            return proof_view_add_new_entry(v_proof_view, answer_label, query_entry, type, proof_conclusion, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym110$CONSTRUCT_PROOF_VIEW_ANSWER_ENTRY, (SubLObject)proof_view_populator.$kw111$FN_SECTION, (SubLObject)proof_view_populator.$sym114$ATOMIC_QUERY_SENTENCE));
        }
        return proof_view_add_new_entry(v_proof_view, answer_label, query_entry, (SubLObject)proof_view_populator.$kw115$BINDINGS, v_bindings, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym110$CONSTRUCT_PROOF_VIEW_ANSWER_ENTRY, (SubLObject)proof_view_populator.$kw111$FN_SECTION, (SubLObject)proof_view_populator.$sym116$DEFAULT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 28891L)
    public static SubLObject new_proof_view_entry(final SubLObject v_proof_view, final SubLObject v_object) {
        final SubLObject v_id_index = proof_view.proof_view_get_id_index(v_proof_view);
        final SubLObject id = get_new_proof_view_entry_id(v_proof_view);
        final SubLObject entry = proof_view.make_proof_view_entry((SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw117$ID, id, (SubLObject)proof_view_populator.$kw118$OBJECT, v_object, (SubLObject)proof_view_populator.$kw17$PROOF_VIEW, v_proof_view));
        id_index.id_index_enter(v_id_index, id, entry);
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 29216L)
    public static SubLObject proof_view_add_new_entry(final SubLObject v_proof_view, final SubLObject label, SubLObject parent_proof_view_entry, final SubLObject object_type, final SubLObject v_object, SubLObject v_properties) {
        if (v_properties == proof_view_populator.UNPROVIDED) {
            v_properties = (SubLObject)proof_view_populator.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert proof_view_populator.NIL != proof_view.valid_proof_view_p(v_proof_view) : v_proof_view;
        assert proof_view_populator.NIL != Types.stringp(label) : label;
        if (proof_view_populator.NIL == parent_proof_view_entry) {
            parent_proof_view_entry = proof_view.proof_view_get_root_entry(v_proof_view);
        }
        assert proof_view_populator.NIL != proof_view.proof_view_entry_p(parent_proof_view_entry) : parent_proof_view_entry;
        assert proof_view_populator.NIL != Types.symbolp(object_type) : object_type;
        assert proof_view_populator.NIL != list_utilities.property_list_p(v_properties) : v_properties;
        v_properties = conses_high.copy_list(v_properties);
        if (proof_view_populator.NIL == proof_view_populator.$proof_view_track_fnsP$.getDynamicValue(thread)) {
            v_properties = conses_high.remf(conses_high.remf(v_properties, (SubLObject)proof_view_populator.$kw111$FN_SECTION), (SubLObject)proof_view_populator.$kw49$FN);
        }
        if (proof_view_populator.NIL == proof_view_populator.$proof_view_allow_unlimited_duplicationP$.getDynamicValue(thread)) {
            final SubLObject existing_count = proof_view.proof_view_count_entries_with_values(v_proof_view, label, parent_proof_view_entry, object_type, v_object, v_properties);
            if (existing_count.numG(proof_view_populator.$proof_view_duplicate_entry_max$.getDynamicValue(thread))) {
                Errors.error((SubLObject)proof_view_populator.$str121$_S_already_exists___S_time__P__in, v_object, existing_count, v_proof_view);
            }
        }
        final SubLObject parent_id = (SubLObject)((proof_view_populator.NIL != proof_view.proof_view_entry_p(parent_proof_view_entry)) ? proof_view.proof_view_entry_int_id(parent_proof_view_entry) : proof_view_populator.NIL);
        final SubLObject proof_view_entry = new_proof_view_entry(v_proof_view, v_object);
        proof_view.proof_view_entry_set_parent_id(proof_view_entry, parent_id);
        proof_view.proof_view_entry_set_label(proof_view_entry, label);
        proof_view.proof_view_entry_set_object_type(proof_view_entry, object_type);
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)proof_view_populator.NIL, remainder = v_properties; proof_view_populator.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            proof_view.proof_view_entry_set_property(proof_view_entry, property, value);
        }
        if (proof_view_populator.NIL != proof_view.proof_view_entry_p(parent_proof_view_entry)) {
            final SubLObject new_children = list_utilities.add_to_end(proof_view_entry, proof_view.proof_view_entry_get_children(parent_proof_view_entry));
            proof_view_entry_set_children(parent_proof_view_entry, new_children);
        }
        if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            format_nil.force_format((SubLObject)proof_view_populator.T, (SubLObject)proof_view_populator.$str122$__Added__S___for__S___under__S__, proof_view_entry, v_object, parent_proof_view_entry, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
        }
        maybe_pause_proof_view_population(proof_view_entry);
        return proof_view_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 31193L)
    public static SubLObject maybe_pause_proof_view_population(SubLObject new_object) {
        if (new_object == proof_view_populator.UNPROVIDED) {
            new_object = (SubLObject)proof_view_populator.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (proof_view_populator.NIL != misc_utilities.initialized_p(proof_view_populator.$proof_view_populator$.getDynamicValue(thread))) {
            Semaphores.semaphore_signal(proof_view_populator_master_semaphore(proof_view_populator.$proof_view_populator$.getDynamicValue(thread)));
            Semaphores.semaphore_wait(proof_view_populator_worker_semaphore(proof_view_populator.$proof_view_populator$.getDynamicValue(thread)));
        }
        return proof_view_populator.$proof_view_populator$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 31540L)
    public static SubLObject proof_view_entry_note_expand_initially(final SubLObject proof_view_entry) {
        assert proof_view_populator.NIL != proof_view.valid_proof_view_entry_p(proof_view_entry) : proof_view_entry;
        return proof_view.proof_view_entry_set_property(proof_view_entry, (SubLObject)proof_view_populator.$kw124$EXPAND_INITIALLY_, (SubLObject)proof_view_populator.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 31832L)
    public static SubLObject proof_view_add_section_root(final SubLObject v_proof_view, final SubLObject label) {
        assert proof_view_populator.NIL != proof_view.valid_proof_view_p(v_proof_view) : v_proof_view;
        assert proof_view_populator.NIL != Types.stringp(label) : label;
        final SubLObject section_root = proof_view_add_new_entry(v_proof_view, label, (SubLObject)proof_view_populator.NIL, (SubLObject)proof_view_populator.$kw125$SECTION_ROOT, (SubLObject)proof_view_populator.NIL, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym126$PROOF_VIEW_ADD_SECTION_ROOT));
        return section_root;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 32208L)
    public static SubLObject proof_view_rem_property(final SubLObject v_proof_view, final SubLObject property) {
        assert proof_view_populator.NIL != proof_view.proof_view_p(v_proof_view) : v_proof_view;
        assert proof_view_populator.NIL != Types.keywordp(property) : property;
        return conses_high.remf(proof_view.proof_view_int_properties(v_proof_view), property);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 32409L)
    public static SubLObject proof_view_remove_entry(final SubLObject v_proof_view, final SubLObject proof_view_entry) {
        final SubLObject v_id_index = proof_view.proof_view_get_id_index(v_proof_view);
        final SubLObject id = proof_view.proof_view_entry_get_id(proof_view_entry);
        final SubLObject parent_entry_id = proof_view.proof_view_entry_get_parent_id(proof_view_entry);
        final SubLObject parent_entry = proof_view.find_proof_view_entry_by_id(v_proof_view, parent_entry_id);
        SubLObject siblings = proof_view.proof_view_entry_get_children(parent_entry);
        siblings = Sequences.delete(proof_view_entry, siblings, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
        proof_view_entry_set_children(parent_entry, siblings);
        id_index.id_index_remove(v_id_index, id);
        proof_view._csetf_proof_view_entry_int_proof_view(proof_view_entry, v_proof_view);
        return proof_view_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 33041L)
    public static SubLObject proof_view_add_rule_used(final SubLObject v_proof_view, final SubLObject rules_used_section_root, final SubLObject used_rule, final SubLObject inference_mt) {
        final SubLObject rule_entry = proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str39$, rules_used_section_root, (SubLObject)proof_view_populator.$kw128$RULE_USED, used_rule, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym129$PROOF_VIEW_ADD_RULE_USED));
        SubLObject rules_used = proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_populator.$kw130$RULES_USED, (SubLObject)proof_view_populator.UNPROVIDED);
        rules_used = (SubLObject)ConsesLow.cons(used_rule, rules_used);
        proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_populator.$kw130$RULES_USED, rules_used);
        return rule_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 33508L)
    public static SubLObject proof_view_get_justification_root_entry(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject root_entry = proof_view.proof_view_get_root_entry(v_proof_view);
        SubLObject cdolist_list_var = proof_view.proof_view_entry_get_children(root_entry);
        SubLObject child_entry = (SubLObject)proof_view_populator.NIL;
        child_entry = cdolist_list_var.first();
        while (proof_view_populator.NIL != cdolist_list_var) {
            if (proof_view.proof_view_entry_get_label(child_entry).equal(proof_view.$proof_view_justification_label$.getDynamicValue(thread))) {
                return child_entry;
            }
            cdolist_list_var = cdolist_list_var.rest();
            child_entry = cdolist_list_var.first();
        }
        return proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_populator.$kw38$JUSTIFICATION_ROOT, (SubLObject)proof_view_populator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 33899L)
    public static SubLObject proof_view_get_linear_root_entry(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject root_entry = proof_view.proof_view_get_root_entry(v_proof_view);
        SubLObject cdolist_list_var = proof_view.proof_view_entry_get_children(root_entry);
        SubLObject child_entry = (SubLObject)proof_view_populator.NIL;
        child_entry = cdolist_list_var.first();
        while (proof_view_populator.NIL != cdolist_list_var) {
            if (proof_view.proof_view_entry_get_label(child_entry).equal(proof_view.$proof_view_linear_label$.getDynamicValue(thread))) {
                return child_entry;
            }
            cdolist_list_var = cdolist_list_var.rest();
            child_entry = cdolist_list_var.first();
        }
        return proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_populator.$kw131$LINEAR_ROOT, (SubLObject)proof_view_populator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 34324L)
    public static SubLObject proof_view_sort_entries_to_maximize_coherence(final SubLObject v_proof_view, final SubLObject mt, final SubLObject entries) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_entities = proof_view.entities_in_bindings(inference_datastructures_inference.inference_answer_bindings(proof_view.proof_view_get_answer(v_proof_view)), mt);
        final SubLObject _prev_bind_0 = proof_view_populator.$proof_scores$.currentBinding(thread);
        try {
            proof_view_populator.$proof_scores$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)proof_view_populator.EQL), (SubLObject)proof_view_populator.UNPROVIDED), thread);
            if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)proof_view_populator.T, (SubLObject)proof_view_populator.$str132$__Inference_entities___S__, inference_entities, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
            }
            SubLObject cdolist_list_var = entries;
            SubLObject entry = (SubLObject)proof_view_populator.NIL;
            entry = cdolist_list_var.first();
            while (proof_view_populator.NIL != cdolist_list_var) {
                final SubLObject proof = proof_view.proof_view_entry_get_proof(entry, (SubLObject)proof_view_populator.T);
                final SubLObject v_forts = (SubLObject)((proof_view_populator.NIL != proof) ? cycl_utilities.expression_gather((proof_view_populator.NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) ? proof_view_residual.pph_residual_transformation_proof_conclusion(proof, mt) : pph_proof.pph_proof_conclusion(proof, mt), (SubLObject)proof_view_populator.$sym133$FORT_P, (SubLObject)proof_view_populator.T, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED) : proof_view_populator.NIL);
                if (proof_view_populator.NIL == dictionary_utilities.dictionary_has_keyP(proof_view_populator.$proof_scores$.getDynamicValue(thread), proof)) {
                    if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                        format_nil.force_format((SubLObject)proof_view_populator.T, (SubLObject)proof_view_populator.$str134$___D_Entry_FORTs___S___S, proof_view.proof_view_entry_get_id(entry), v_forts, proof_view.proof_view_entry_get_object(entry), (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
                    }
                    SubLObject cdolist_list_var_$6 = v_forts;
                    SubLObject fort = (SubLObject)proof_view_populator.NIL;
                    fort = cdolist_list_var_$6.first();
                    while (proof_view_populator.NIL != cdolist_list_var_$6) {
                        if (proof_view_populator.NIL != subl_promotions.memberP(fort, inference_entities, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED)) {
                            if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                                format_nil.force_format((SubLObject)proof_view_populator.T, (SubLObject)proof_view_populator.$str135$__Found_preferred_FORT__S__, fort, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
                            }
                            dictionary_utilities.dictionary_increment(proof_view_populator.$proof_scores$.getDynamicValue(thread), proof, (SubLObject)proof_view_populator.UNPROVIDED);
                        }
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        fort = cdolist_list_var_$6.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
            return Sort.stable_sort(Sort.sort(entries, Symbols.symbol_function((SubLObject)proof_view_populator.$sym46$_), (SubLObject)proof_view_populator.$sym136$PROOF_VIEW_ENTRY_GET_PROOF_SUID), Symbols.symbol_function((SubLObject)proof_view_populator.$sym137$_), (SubLObject)proof_view_populator.$sym138$PROOF_VIEW_ENTRY_GET_SCORE);
        }
        finally {
            proof_view_populator.$proof_scores$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 35450L)
    public static SubLObject proof_view_entry_get_proof_suid(final SubLObject entry) {
        final SubLObject proof = proof_view.proof_view_entry_get_proof(entry, (SubLObject)proof_view_populator.T);
        return (SubLObject)((proof_view_populator.NIL != proof) ? inference_datastructures_proof.proof_suid(proof) : proof_view_populator.MINUS_ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 35608L)
    public static SubLObject proof_view_entry_get_score(final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proof = proof_view.proof_view_entry_get_proof(entry, (SubLObject)proof_view_populator.T);
        return dictionary.dictionary_lookup_without_values(proof_view_populator.$proof_scores$.getDynamicValue(thread), proof, (SubLObject)proof_view_populator.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 35785L)
    public static SubLObject proof_view_add_fact_used(final SubLObject v_proof_view, final SubLObject facts_used_section_root, final SubLObject used_fact, final SubLObject inference_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fact_entry = proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str39$, facts_used_section_root, (SubLObject)((proof_view_populator.NIL != arguments.support_p(used_fact)) ? ((proof_view_populator.NIL != assertion_handles.assertion_p(used_fact)) ? proof_view_populator.$sym90$ASSERTION_P : proof_view_populator.$sym139$SUPPORT_P) : proof_view_populator.$sym91$EL_SENTENCE_P), used_fact, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym140$PROOF_VIEW_ADD_FACT_USED));
        SubLObject facts_used = proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_populator.$kw141$FACTS_USED, (SubLObject)proof_view_populator.UNPROVIDED);
        proof_view_entry_note_expand_initially(fact_entry);
        facts_used = (SubLObject)ConsesLow.cons(used_fact, facts_used);
        proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_populator.$kw141$FACTS_USED, facts_used);
        if (proof_view_populator.NIL == subl_promotions.memberP(used_fact, proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_populator.$kw141$FACTS_USED, (SubLObject)proof_view_populator.UNPROVIDED), Symbols.symbol_function((SubLObject)proof_view_populator.EQUAL), (SubLObject)proof_view_populator.UNPROVIDED)) {
            Errors.sublisp_break((SubLObject)proof_view_populator.$str142$Failed_to_store__S_on__S, new SubLObject[] { used_fact, v_proof_view });
        }
        if (proof_view_populator.NIL != assertion_handles.assertion_p(used_fact)) {
            thread.resetMultipleValues();
            final SubLObject mt = pph_proof.pph_assert_info(used_fact);
            SubLObject v_sources = thread.secondMultipleValue();
            final SubLObject strengthenedP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = sources.assertion_corroborating_sources(used_fact, inference_mt);
            SubLObject corroborating_source = (SubLObject)proof_view_populator.NIL;
            corroborating_source = cdolist_list_var.first();
            while (proof_view_populator.NIL != cdolist_list_var) {
                final SubLObject item_var = corroborating_source;
                if (proof_view_populator.NIL == conses_high.member(item_var, v_sources, Symbols.symbol_function((SubLObject)proof_view_populator.EQUAL), Symbols.symbol_function((SubLObject)proof_view_populator.IDENTITY))) {
                    v_sources = (SubLObject)ConsesLow.cons(item_var, v_sources);
                }
                cdolist_list_var = cdolist_list_var.rest();
                corroborating_source = cdolist_list_var.first();
            }
            cdolist_list_var = v_sources;
            SubLObject source = (SubLObject)proof_view_populator.NIL;
            source = cdolist_list_var.first();
            while (proof_view_populator.NIL != cdolist_list_var) {
                proof_view_note_source(v_proof_view, fact_entry, source, strengthenedP);
                cdolist_list_var = cdolist_list_var.rest();
                source = cdolist_list_var.first();
            }
        }
        else if (proof_view_populator.NIL != proof_view.proof_view_external_support_p(used_fact)) {
            final SubLObject ks = proof_view_knowledge_source_for_hl_support(used_fact);
            if (proof_view_populator.NIL != ks) {
                proof_view_note_source(v_proof_view, fact_entry, ks, (SubLObject)proof_view_populator.UNPROVIDED);
            }
        }
        return fact_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 37166L)
    public static SubLObject proof_view_note_source(final SubLObject v_proof_view, final SubLObject entry, SubLObject source, SubLObject strengthenedP) {
        if (strengthenedP == proof_view_populator.UNPROVIDED) {
            strengthenedP = (SubLObject)proof_view_populator.NIL;
        }
        if (proof_view_populator.NIL != proof_view.proof_view_entry_get_include_sourcesP(entry) && proof_view_populator.NIL != proof_view.proof_view_valid_source_p(source)) {
            proof_view_entry_add_source(entry, source, strengthenedP);
            proof_view_possibly_register_source(v_proof_view, source, strengthenedP);
        }
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 37556L)
    public static SubLObject proof_view_add_external_source_entry(final SubLObject v_proof_view, final SubLObject support, final SubLObject support_entry) {
        final SubLObject ks = proof_view_knowledge_source_for_hl_support(support);
        if (proof_view_populator.NIL != cycl_grammar.cycl_denotational_term_p(ks)) {
            proof_view_note_source(v_proof_view, support_entry, ks, (SubLObject)proof_view_populator.UNPROVIDED);
            proof_view_maybe_add_document_display_entry(v_proof_view, support, support_entry, ks);
        }
        return ks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 37917L)
    public static SubLObject proof_view_knowledge_source_for_hl_support(final SubLObject hl_support) {
        final SubLObject pcase_var = arguments.support_module(hl_support);
        if (pcase_var.eql((SubLObject)proof_view_populator.$kw143$SKSI)) {
            return sources.sksi_support_sources(hl_support).first();
        }
        if (pcase_var.eql((SubLObject)proof_view_populator.$kw144$GIS)) {
            final SubLObject ks = constants_high.find_constant((SubLObject)proof_view_populator.$str145$Cycorp_ArcMap_GIS_KS);
            if (proof_view_populator.NIL != constant_handles.valid_constantP(ks, (SubLObject)proof_view_populator.UNPROVIDED)) {
                return ks;
            }
        }
        return (SubLObject)proof_view_populator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 38255L)
    public static SubLObject proof_view_knowledge_source_for_mt(final SubLObject mt) {
        return ask_utilities.ask_variable((SubLObject)proof_view_populator.$sym146$_KS, (SubLObject)ConsesLow.list(proof_view_populator.$const147$contentMt, (SubLObject)proof_view_populator.$sym146$_KS, mt), proof_view_populator.$const148$InferencePSC, (SubLObject)proof_view_populator.ZERO_INTEGER, (SubLObject)proof_view_populator.ONE_INTEGER, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 38391L)
    public static SubLObject proof_view_maybe_add_document_display_entry(final SubLObject v_proof_view, final SubLObject support, final SubLObject support_entry, final SubLObject ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ks.eql(proof_view_populator.$const149$Saffron_KS)) {
            thread.resetMultipleValues();
            final SubLObject successP = formula_pattern_match.formula_matches_pattern(arguments.support_sentence(support), (SubLObject)proof_view_populator.$list150);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (proof_view_populator.NIL != successP) {
                final SubLObject hypothesis = list_utilities.alist_lookup(v_bindings, (SubLObject)proof_view_populator.$sym151$HYPOTHESIS, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
                final SubLObject v_term = list_utilities.alist_lookup(v_bindings, (SubLObject)proof_view_populator.$sym152$TERM, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
                final SubLObject mt = arguments.support_mt(support);
                proof_view_add_external_sentence_entries(v_proof_view, support_entry, hypothesis, (SubLObject)ConsesLow.list(v_term), mt);
            }
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 39094L)
    public static SubLObject proof_view_situation_constituents_proof_p(final SubLObject proof) {
        return list_utilities.sublisp_boolean(proof_view_situation_constituents_proof_hypothesis_and_terms(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 39249L)
    public static SubLObject proof_view_situation_constituents_proof_hypothesis_and_terms_internal(final SubLObject proof) {
        final SubLObject hl_module = inference_modules.find_hl_module_by_name((SubLObject)proof_view_populator.$kw154$REMOVAL_SAFFRON_CONJUNCTION_069);
        SubLObject terms = (SubLObject)proof_view_populator.NIL;
        SubLObject hypothesis = (SubLObject)proof_view_populator.NIL;
        SubLObject failP = (SubLObject)proof_view_populator.NIL;
        if (proof_view_populator.NIL != inference_modules.hl_module_p(hl_module) && proof_view_populator.NIL == failP) {
            SubLObject csome_list_var = pph_proof.pph_proof_subproofs(proof);
            SubLObject subproof = (SubLObject)proof_view_populator.NIL;
            subproof = csome_list_var.first();
            while (proof_view_populator.NIL == failP && proof_view_populator.NIL != csome_list_var) {
                if (proof_view_populator.NIL == inference_worker.content_proof_p(subproof) || !hl_module.eql(inference_worker.content_proof_hl_module(subproof))) {
                    failP = (SubLObject)proof_view_populator.T;
                }
                if (proof_view_populator.NIL == failP) {
                    SubLObject csome_list_var_$7 = inference_datastructures_proof.proof_supports(subproof);
                    SubLObject support = (SubLObject)proof_view_populator.NIL;
                    support = csome_list_var_$7.first();
                    while (proof_view_populator.NIL == failP && proof_view_populator.NIL != csome_list_var_$7) {
                        final SubLObject pcase_var = arguments.support_sentence_operator(support);
                        if (!pcase_var.eql(proof_view_populator.$const155$substring)) {
                            if (pcase_var.eql(proof_view_populator.$const156$situationConstituentWithTypeAndDe) || pcase_var.eql(proof_view_populator.$const157$situationConstituentWithType) || pcase_var.eql(proof_view_populator.$const158$situationConstituentWithDesc)) {
                                SubLObject current;
                                final SubLObject datum = current = cycl_utilities.atomic_sentence_args(arguments.support_sentence(support), (SubLObject)proof_view_populator.UNPROVIDED);
                                SubLObject this_hypothesis = (SubLObject)proof_view_populator.NIL;
                                SubLObject this_term = (SubLObject)proof_view_populator.NIL;
                                SubLObject arg2 = (SubLObject)proof_view_populator.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)proof_view_populator.$list159);
                                this_hypothesis = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)proof_view_populator.$list159);
                                this_term = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)proof_view_populator.$list159);
                                arg2 = current.first();
                                current = current.rest();
                                final SubLObject arg3 = (SubLObject)(current.isCons() ? current.first() : proof_view_populator.NIL);
                                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)proof_view_populator.$list159);
                                current = current.rest();
                                if (proof_view_populator.NIL == current) {
                                    if (proof_view_populator.NIL == hypothesis || hypothesis.equal(this_hypothesis)) {
                                        hypothesis = this_hypothesis;
                                    }
                                    else {
                                        failP = (SubLObject)proof_view_populator.T;
                                    }
                                    final SubLObject item_var = this_term;
                                    if (proof_view_populator.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)proof_view_populator.EQUAL), Symbols.symbol_function((SubLObject)proof_view_populator.IDENTITY))) {
                                        terms = (SubLObject)ConsesLow.cons(item_var, terms);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)proof_view_populator.$list159);
                                }
                            }
                        }
                        csome_list_var_$7 = csome_list_var_$7.rest();
                        support = csome_list_var_$7.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                subproof = csome_list_var.first();
            }
        }
        if (proof_view_populator.NIL != failP) {
            hypothesis = (SubLObject)proof_view_populator.NIL;
            terms = (SubLObject)proof_view_populator.NIL;
        }
        return Values.values(hypothesis, Sequences.nreverse(terms));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 39249L)
    public static SubLObject proof_view_situation_constituents_proof_hypothesis_and_terms(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)proof_view_populator.NIL;
        if (proof_view_populator.NIL == v_memoization_state) {
            return proof_view_situation_constituents_proof_hypothesis_and_terms_internal(proof);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)proof_view_populator.$sym153$PROOF_VIEW_SITUATION_CONSTITUENTS_PROOF_HYPOTHESIS_AND_TERMS, (SubLObject)proof_view_populator.UNPROVIDED);
        if (proof_view_populator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)proof_view_populator.$sym153$PROOF_VIEW_SITUATION_CONSTITUENTS_PROOF_HYPOTHESIS_AND_TERMS, (SubLObject)proof_view_populator.ONE_INTEGER, (SubLObject)proof_view_populator.NIL, (SubLObject)proof_view_populator.EQ, (SubLObject)proof_view_populator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)proof_view_populator.$sym153$PROOF_VIEW_SITUATION_CONSTITUENTS_PROOF_HYPOTHESIS_AND_TERMS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, proof, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(proof_view_situation_constituents_proof_hypothesis_and_terms_internal(proof)));
            memoization_state.caching_state_put(caching_state, proof, results, (SubLObject)proof_view_populator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 40418L)
    public static SubLObject proof_view_add_entries_for_situation_constituents_proof(final SubLObject v_proof_view, final SubLObject proof, final SubLObject parent_entry, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject hypothesis = proof_view_situation_constituents_proof_hypothesis_and_terms(proof);
        final SubLObject terms = thread.secondMultipleValue();
        thread.resetMultipleValues();
        proof_view_add_external_sentence_entries(v_proof_view, parent_entry, hypothesis, terms, mt);
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 40773L)
    public static SubLObject proof_view_add_external_sentence_entries(final SubLObject v_proof_view, final SubLObject parent_entry, final SubLObject hypothesis, final SubLObject terms, final SubLObject mt) {
        SubLObject addedP = (SubLObject)proof_view_populator.NIL;
        SubLObject cdolist_list_var = proof_view_get_sentences_for_hypothesis(hypothesis, mt);
        SubLObject sentence = (SubLObject)proof_view_populator.NIL;
        sentence = cdolist_list_var.first();
        while (proof_view_populator.NIL != cdolist_list_var) {
            if (proof_view_populator.NIL != sentence) {
                final SubLObject source_sentence_entry = proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str160$Source_Text_, parent_entry, (SubLObject)proof_view_populator.$kw161$EXTERNAL_SENTENCE, (SubLObject)ConsesLow.list(sentence, terms, mt), (SubLObject)proof_view_populator.UNPROVIDED);
                final SubLObject v_document = proof_view.proof_view_get_document_for_hypothesis(hypothesis, mt);
                final SubLObject ks = proof_view_knowledge_source_for_mt(mt);
                addedP = (SubLObject)proof_view_populator.T;
                if (proof_view_populator.NIL != v_document) {
                    final SubLObject publisher = proof_view_get_publisher_for_document(v_document, mt);
                    final SubLObject title = proof_view_get_title_for_document(v_document, mt);
                    final SubLObject date = proof_view_get_date_for_document(v_document, mt);
                    final SubLObject author = proof_view_get_author_for_document(v_document, mt);
                    if (proof_view_populator.NIL != title) {
                        proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str162$Title_, source_sentence_entry, (SubLObject)proof_view_populator.$sym109$EL_TERM_P, title, (SubLObject)proof_view_populator.UNPROVIDED);
                    }
                    if (proof_view_populator.NIL != date) {
                        proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str163$Date_, source_sentence_entry, (SubLObject)proof_view_populator.$sym109$EL_TERM_P, date, (SubLObject)proof_view_populator.UNPROVIDED);
                    }
                    if (proof_view_populator.NIL != author) {
                        proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str164$Author_, source_sentence_entry, (SubLObject)proof_view_populator.$sym109$EL_TERM_P, author, (SubLObject)proof_view_populator.UNPROVIDED);
                    }
                    if (proof_view_populator.NIL != publisher) {
                        proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str165$Publisher_, source_sentence_entry, (SubLObject)proof_view_populator.$sym109$EL_TERM_P, publisher, (SubLObject)proof_view_populator.UNPROVIDED);
                    }
                }
                proof_view_note_source(v_proof_view, source_sentence_entry, ks, (SubLObject)proof_view_populator.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        if (proof_view_populator.NIL == addedP) {
            proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str166$Couldn_t_find_source_document_, parent_entry, (SubLObject)proof_view_populator.$kw167$NO_SOURCE_DOCUMENT, (SubLObject)proof_view_populator.NIL, (SubLObject)proof_view_populator.UNPROVIDED);
            proof_view_entry_note_expand_initially(parent_entry);
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 42543L)
    public static SubLObject proof_view_add_root_entry(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert proof_view_populator.NIL != proof_view.valid_proof_view_p(v_proof_view) : v_proof_view;
        final SubLObject id = get_new_proof_view_entry_id(v_proof_view);
        final SubLObject parent_id = (SubLObject)proof_view_populator.NIL;
        final SubLObject root_entry = proof_view.make_proof_view_entry((SubLObject)ConsesLow.list(new SubLObject[] { proof_view_populator.$kw117$ID, id, proof_view_populator.$kw168$PARENT_ID, parent_id, proof_view_populator.$kw17$PROOF_VIEW, v_proof_view, proof_view_populator.$kw169$OBJECT_TYPE, proof_view_populator.$kw170$ROOT, proof_view_populator.$kw171$LABEL, proof_view_populator.$str172$Root }));
        final SubLObject v_id_index = proof_view.proof_view_get_id_index(v_proof_view);
        proof_view_entry_note_expand_initially(root_entry);
        if (proof_view_populator.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !id.eql(proof_view.$proof_view_root_entry_id$.getGlobalValue())) {
            Errors.error((SubLObject)proof_view_populator.$str173$Initial_ID_in__S_is__S__should_be, v_proof_view, id, proof_view.$proof_view_root_entry_id$.getGlobalValue());
        }
        id_index.id_index_enter(v_id_index, id, root_entry);
        return root_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 43189L)
    public static SubLObject proof_view_get_sentences_for_hypothesis(final SubLObject hypothesis, final SubLObject mt) {
        return pph_utilities.pph_ask_variable_new((SubLObject)proof_view_populator.$sym174$_SENTENCE, (SubLObject)ConsesLow.list(proof_view_populator.$const175$and, (SubLObject)proof_view_populator.$list176, (SubLObject)ConsesLow.listS(proof_view_populator.$const177$sourceOfTerm, hypothesis, (SubLObject)proof_view_populator.$list178)), mt, (SubLObject)proof_view_populator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 43415L)
    public static SubLObject proof_view_add_support_tree(final SubLObject v_proof_view, final SubLObject support, final SubLObject parent_proof_view_entry, final SubLObject inference_mt, SubLObject current_depth, SubLObject seen_supports) {
        if (current_depth == proof_view_populator.UNPROVIDED) {
            current_depth = (SubLObject)proof_view_populator.ZERO_INTEGER;
        }
        if (seen_supports == proof_view_populator.UNPROVIDED) {
            seen_supports = set.new_set(Symbols.symbol_function((SubLObject)proof_view_populator.EQUAL), (SubLObject)proof_view_populator.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert proof_view_populator.NIL != proof_view.valid_proof_view_p(v_proof_view) : v_proof_view;
        assert proof_view_populator.NIL != arguments.support_p(support) : support;
        if (proof_view_populator.NIL != parent_proof_view_entry && !proof_view_populator.assertionsDisabledInClass && proof_view_populator.NIL == proof_view.proof_view_entry_p(parent_proof_view_entry)) {
            throw new AssertionError(parent_proof_view_entry);
        }
        final SubLObject _prev_bind_0 = proof_view_populator.$suspend_generality_sorting_of_proof_view_entriesP$.currentBinding(thread);
        try {
            proof_view_populator.$suspend_generality_sorting_of_proof_view_entriesP$.bind((SubLObject)proof_view_populator.T, thread);
            final SubLObject circularP = (SubLObject)SubLObjectFactory.makeBoolean(proof_view_populator.NIL == set.set_add(support, seen_supports));
            SubLObject support_entry = (SubLObject)proof_view_populator.NIL;
            if (proof_view_populator.NIL != proof_view.proof_view_has_entry_for_objectP(v_proof_view, support, parent_proof_view_entry)) {
                if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    Errors.warn((SubLObject)proof_view_populator.$str179$Already_have_entry_for__S, support);
                }
            }
            else if (proof_view_populator.NIL == proof_view.suppress_proof_supportP(support)) {
                if (proof_view_populator.NIL != assertion_handles.assertion_p(support) && proof_view_populator.NIL == assertions_high.deduced_assertionP(support)) {
                    support_entry = proof_view_add_new_entry(v_proof_view, proof_view.$proof_view_asserted_label$.getDynamicValue(thread), parent_proof_view_entry, (SubLObject)proof_view_populator.$sym90$ASSERTION_P, support, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym180$PROOF_VIEW_ADD_SUPPORT_TREE, (SubLObject)proof_view_populator.$kw111$FN_SECTION, (SubLObject)proof_view_populator.$sym181$NON_DEDUCED_ASSERTION));
                    proof_view_add_assert_info_entries(v_proof_view, support, support_entry, inference_mt);
                }
                else if (proof_view_populator.NIL != assertion_handles.assertion_p(support) && proof_view_populator.NIL != circularP) {
                    support_entry = proof_view_add_new_entry(v_proof_view, proof_view.$proof_view_asserted_label$.getDynamicValue(thread), parent_proof_view_entry, (SubLObject)proof_view_populator.$sym90$ASSERTION_P, support, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym180$PROOF_VIEW_ADD_SUPPORT_TREE, (SubLObject)proof_view_populator.$kw111$FN_SECTION, (SubLObject)proof_view_populator.$sym182$CIRCULAR_ASSERTION));
                    proof_view_add_circular_support_entry(v_proof_view, support, support_entry, inference_mt);
                }
                else if (proof_view_populator.NIL != arguments.support_p(support) && proof_view_populator.NIL != circularP) {
                    support_entry = proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str39$, parent_proof_view_entry, (SubLObject)proof_view_populator.$sym139$SUPPORT_P, support, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym180$PROOF_VIEW_ADD_SUPPORT_TREE, (SubLObject)proof_view_populator.$kw111$FN_SECTION, (SubLObject)proof_view_populator.$sym183$CIRCULAR_SUPPORT));
                    proof_view_add_circular_support_entry(v_proof_view, support, support_entry, inference_mt);
                }
                else if (proof_view_populator.NIL != arguments.support_p(support)) {
                    final SubLObject meta_supports = pph_check_meta_supports_for_circularity(pph_proof.pph_sort_meta_supports(pph_proof.pph_sub_isomorphic_assertions_into_supports(pph_proof.pph_meta_supports_to_show(support, v_proof_view, inference_mt))), seen_supports);
                    final SubLObject label = (proof_view_populator.NIL != meta_supports) ? proof_view.$proof_view_inferred_label$.getDynamicValue(thread) : proof_view.$proof_view_opaque_label$.getDynamicValue(thread);
                    final SubLObject object_type = (SubLObject)((proof_view_populator.NIL != assertion_handles.assertion_p(support)) ? proof_view_populator.$sym90$ASSERTION_P : proof_view_populator.$sym139$SUPPORT_P);
                    final SubLObject support_sentence = arguments.support_sentence(support);
                    final SubLObject parent_object = proof_view.proof_view_entry_get_object(parent_proof_view_entry);
                    final SubLObject parent_sentence = (SubLObject)((proof_view_populator.NIL != cycl_grammar.cycl_sentence_p(parent_object)) ? proof_view_summary.proof_view_summary_item_sentence(parent_object) : proof_view_populator.NIL);
                    if (proof_view_populator.NIL != el_utilities.formula_arityE(support_sentence, (SubLObject)proof_view_populator.TWO_INTEGER, (SubLObject)proof_view_populator.UNPROVIDED) && proof_view_populator.NIL != el_utilities.formula_arityE(parent_sentence, (SubLObject)proof_view_populator.TWO_INTEGER, (SubLObject)proof_view_populator.UNPROVIDED) && cycl_utilities.formula_arg0(support_sentence).equal(cycl_utilities.formula_arg0(parent_sentence)) && cycl_utilities.formula_arg1(support_sentence, (SubLObject)proof_view_populator.UNPROVIDED).equal(cycl_utilities.formula_arg2(parent_sentence, (SubLObject)proof_view_populator.UNPROVIDED)) && cycl_utilities.formula_arg2(support_sentence, (SubLObject)proof_view_populator.UNPROVIDED).equal(cycl_utilities.formula_arg1(parent_sentence, (SubLObject)proof_view_populator.UNPROVIDED))) {
                        if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                            format_nil.force_format((SubLObject)proof_view_populator.T, (SubLObject)proof_view_populator.$str184$__Skipping_over_trivial_symmetric, support_sentence, parent_sentence, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
                        }
                        support_entry = parent_proof_view_entry;
                    }
                    else {
                        support_entry = proof_view_add_new_entry(v_proof_view, label, parent_proof_view_entry, object_type, support, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym180$PROOF_VIEW_ADD_SUPPORT_TREE, (SubLObject)proof_view_populator.$kw111$FN_SECTION, (SubLObject)proof_view_populator.$sym185$NORMAL_SUPPORT));
                    }
                    if (proof_view_populator.NIL != meta_supports) {
                        SubLObject cdolist_list_var = meta_supports;
                        SubLObject sub_support = (SubLObject)proof_view_populator.NIL;
                        sub_support = cdolist_list_var.first();
                        while (proof_view_populator.NIL != cdolist_list_var) {
                            proof_view_add_support_tree(v_proof_view, sub_support, support_entry, inference_mt, number_utilities.f_1X(current_depth), seen_supports);
                            cdolist_list_var = cdolist_list_var.rest();
                            sub_support = cdolist_list_var.first();
                        }
                    }
                    else if (proof_view_populator.NIL != proof_view.proof_view_external_support_p(support)) {
                        proof_view_add_external_source_entry(v_proof_view, support, support_entry);
                    }
                    else if (proof_view_populator.NIL != abduction.abduction_support_p(support)) {
                        proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str39$, support_entry, (SubLObject)proof_view_populator.$kw186$ABDUCED_SUPPORT, support, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym180$PROOF_VIEW_ADD_SUPPORT_TREE, (SubLObject)proof_view_populator.$kw111$FN_SECTION, (SubLObject)proof_view_populator.$sym187$ABDUCED_SUPPORT));
                        proof_view_entry_note_abduced_support(support_entry, support);
                    }
                    else if (proof_view_populator.NIL == proof_view.proof_view_get_suppress_assertion_bookkeepingP(v_proof_view)) {
                        if (proof_view_populator.NIL != assertion_handles.assertion_p(support)) {
                            proof_view_add_assert_info_entries(v_proof_view, support, support_entry, inference_mt);
                        }
                        else {
                            proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str39$, support_entry, (SubLObject)proof_view_populator.$kw188$UNSUPPORTED_SUPPORT, support, (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym180$PROOF_VIEW_ADD_SUPPORT_TREE, (SubLObject)proof_view_populator.$kw111$FN_SECTION, (SubLObject)proof_view_populator.$sym189$UNSUPPORTED_SUPPORT));
                        }
                    }
                }
                else if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    Errors.warn((SubLObject)proof_view_populator.$str190$unknown_support_type_for__A, support);
                }
            }
            proof_view_maybe_add_used_support(v_proof_view, support, current_depth, circularP);
            if (proof_view_populator.NIL != subl_promotions.memberP(support, proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_populator.$kw141$FACTS_USED, (SubLObject)proof_view_populator.UNPROVIDED), Symbols.symbol_function((SubLObject)proof_view_populator.EQUAL), (SubLObject)proof_view_populator.UNPROVIDED) && proof_view_populator.NIL == proof_view.proof_view_entry_get_children(support_entry)) {
                if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    Errors.warn((SubLObject)proof_view_populator.$str191$Already_shown___S, support);
                }
                proof_view_remove_entry(v_proof_view, support_entry);
            }
            return support_entry;
        }
        finally {
            proof_view_populator.$suspend_generality_sorting_of_proof_view_entriesP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 48144L)
    public static SubLObject pph_check_meta_supports_for_circularity(final SubLObject meta_supports, final SubLObject seen_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = meta_supports;
        SubLObject sub_support = (SubLObject)proof_view_populator.NIL;
        sub_support = cdolist_list_var.first();
        while (proof_view_populator.NIL != cdolist_list_var) {
            if (proof_view_populator.NIL != set.set_memberP(sub_support, seen_supports)) {
                if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    Errors.warn((SubLObject)proof_view_populator.$str192$Circularity_in_meta_supports__Alr, sub_support);
                }
                return (SubLObject)proof_view_populator.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_support = cdolist_list_var.first();
        }
        return meta_supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 48449L)
    public static SubLObject proof_view_maybe_add_used_support(final SubLObject v_proof_view, final SubLObject support, final SubLObject current_depth, final SubLObject circularP) {
        if (proof_view_populator.NIL != proof_view_add_used_supportP(v_proof_view, support, current_depth, circularP)) {
            if (proof_view_populator.NIL != el_utilities.groundP(arguments.support_sentence(support), (SubLObject)proof_view_populator.UNPROVIDED) && proof_view_populator.NIL != el_utilities.atomic_sentenceP(arguments.support_sentence(support))) {
                proof_view_add_used_support(v_proof_view, support);
            }
            else if (proof_view_populator.NIL != proof_view.proof_view_get_include_rules_sectionP(v_proof_view) && proof_view_populator.NIL != assertions_high.rule_assertionP(support)) {
                proof_view_add_used_support(v_proof_view, support);
            }
        }
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 48980L)
    public static SubLObject proof_view_add_used_supportP(final SubLObject v_proof_view, final SubLObject support, final SubLObject current_depth, final SubLObject circularP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((proof_view_populator.NIL != pph_vars.$pph_proof_show_facts_usedP$.getDynamicValue(thread) || proof_view_populator.NIL != proof_view.proof_view_get_include_rules_sectionP(v_proof_view)) && (proof_view_populator.NIL == proof_view_depth_exceeds_cutoffP(current_depth) || (proof_view_populator.NIL != proof_view.proof_view_get_include_rules_sectionP(v_proof_view) && proof_view_populator.NIL != assertions_high.rule_assertionP(support)) || (proof_view_populator.NIL != assertion_handles.assertion_p(support) && proof_view_populator.NIL != sources.assertion_sourcedP(support)) || proof_view_populator.NIL != abduction.abduction_support_p(support)) && (proof_view_populator.NIL != abduction.abduction_support_p(support) || (proof_view_populator.NIL != arguments.support_p(support) && proof_view_populator.NIL != conses_high.member(arguments.support_module(support), (SubLObject)proof_view_populator.$list193, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED)) || (proof_view_populator.NIL != assertion_handles.assertion_p(support) && (proof_view_populator.NIL != assertions_high.asserted_assertionP(support) || proof_view_populator.NIL != circularP || proof_view_populator.NIL != derived_assertion_proof_view_worthyP(support, v_proof_view, current_depth, circularP)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 49735L)
    public static SubLObject derived_assertion_proof_view_worthyP(final SubLObject assertion, final SubLObject v_proof_view, final SubLObject current_depth, final SubLObject circularP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_proof_show_facts_depth_cutoff$.currentBinding(thread);
        try {
            pph_vars.$pph_proof_show_facts_depth_cutoff$.bind((SubLObject)proof_view_populator.TEN_INTEGER, thread);
            if (proof_view_populator.NIL != proof_view_depth_exceeds_cutoffP(current_depth)) {
                if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    Errors.warn((SubLObject)proof_view_populator.$str194$Not_proof_view_worthy___S, assertion);
                }
                return (SubLObject)proof_view_populator.NIL;
            }
        }
        finally {
            pph_vars.$pph_proof_show_facts_depth_cutoff$.rebind(_prev_bind_0, thread);
        }
        final SubLObject meta_supports = pph_proof.pph_sub_isomorphic_assertions_into_supports(pph_proof.pph_meta_supports(assertion));
        SubLObject display_worthy_meta_support = (SubLObject)proof_view_populator.NIL;
        if (proof_view_populator.NIL == display_worthy_meta_support) {
            SubLObject csome_list_var = meta_supports;
            SubLObject meta_support = (SubLObject)proof_view_populator.NIL;
            meta_support = csome_list_var.first();
            while (proof_view_populator.NIL == display_worthy_meta_support && proof_view_populator.NIL != csome_list_var) {
                if (proof_view_populator.NIL != proof_view_add_used_supportP(v_proof_view, meta_support, number_utilities.f_1X(current_depth), circularP)) {
                    display_worthy_meta_support = meta_support;
                }
                csome_list_var = csome_list_var.rest();
                meta_support = csome_list_var.first();
            }
        }
        return Types.sublisp_null(display_worthy_meta_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 50499L)
    public static SubLObject proof_view_depth_exceeds_cutoffP(final SubLObject current_depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_vars.$pph_proof_show_facts_depth_cutoff$.getDynamicValue(thread).isInteger() && current_depth.numG(pph_vars.$pph_proof_show_facts_depth_cutoff$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 50688L)
    public static SubLObject proof_view_entry_add_source(final SubLObject proof_view_entry, SubLObject source, final SubLObject strengthenedP) {
        assert proof_view_populator.NIL != cycl_grammar.cycl_term_p(source) : source;
        final SubLObject existing = proof_view.proof_view_entry_get_property(proof_view_entry, (SubLObject)proof_view_populator.$kw196$SOURCES, (SubLObject)proof_view_populator.UNPROVIDED);
        if (proof_view_populator.NIL == subl_promotions.memberP(source, existing, Symbols.symbol_function((SubLObject)proof_view_populator.EQUAL), (SubLObject)proof_view_populator.UNPROVIDED)) {
            proof_view.proof_view_entry_set_property(proof_view_entry, (SubLObject)proof_view_populator.$kw196$SOURCES, (SubLObject)ConsesLow.cons(source, existing));
        }
        return proof_view_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 51088L)
    public static SubLObject proof_view_entity_mentions_proofP(final SubLObject proof, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(proof_view_populator.NIL != entity_mentions_proof_possibleP() && proof_view_populator.NIL != list_utilities.non_empty_list_p(proof_view_entity_mentions_proof_hypotheses_and_terms(proof, mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 51290L)
    public static SubLObject entity_mentions_proof_possibleP_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)proof_view_populator.$sym198$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(proof_view_populator.$const199$EverythingPSC, thread);
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing.num_predicate_extent_index(proof_view_populator.$const200$hypothesizedFormula, (SubLObject)proof_view_populator.UNPROVIDED).isPositive() || kb_indexing.num_predicate_extent_index(proof_view_populator.$const201$hypothesizedFormulaStrengthenedTo, (SubLObject)proof_view_populator.UNPROVIDED).isPositive());
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 51290L)
    public static SubLObject entity_mentions_proof_possibleP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)proof_view_populator.NIL;
        if (proof_view_populator.NIL == v_memoization_state) {
            return entity_mentions_proof_possibleP_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)proof_view_populator.$sym197$ENTITY_MENTIONS_PROOF_POSSIBLE_, (SubLObject)proof_view_populator.UNPROVIDED);
        if (proof_view_populator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)proof_view_populator.$sym197$ENTITY_MENTIONS_PROOF_POSSIBLE_, (SubLObject)proof_view_populator.ZERO_INTEGER, (SubLObject)proof_view_populator.NIL, (SubLObject)proof_view_populator.EQL, (SubLObject)proof_view_populator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)proof_view_populator.$sym197$ENTITY_MENTIONS_PROOF_POSSIBLE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)proof_view_populator.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(entity_mentions_proof_possibleP_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)proof_view_populator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 51537L)
    public static SubLObject proof_view_entity_mentions_proof_hypotheses_and_terms_internal(final SubLObject proof, final SubLObject mt) {
        final SubLObject proven_sentence = pph_proof.pph_proof_el_formula(proof, mt);
        final SubLObject terms = cycl_utilities.expression_gather(proven_sentence, (SubLObject)proof_view_populator.$sym203$SKSI_SUPPORTED_EXTERNAL_TERM_, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
        final SubLObject hypotheses = (SubLObject)((proof_view_populator.NIL != terms) ? proof_view_get_hypotheses_for_sentence(proven_sentence, mt) : proof_view_populator.NIL);
        return Values.values(hypotheses, Sequences.nreverse(terms));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 51537L)
    public static SubLObject proof_view_entity_mentions_proof_hypotheses_and_terms(final SubLObject proof, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)proof_view_populator.NIL;
        if (proof_view_populator.NIL == v_memoization_state) {
            return proof_view_entity_mentions_proof_hypotheses_and_terms_internal(proof, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)proof_view_populator.$sym202$PROOF_VIEW_ENTITY_MENTIONS_PROOF_HYPOTHESES_AND_TERMS, (SubLObject)proof_view_populator.UNPROVIDED);
        if (proof_view_populator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)proof_view_populator.$sym202$PROOF_VIEW_ENTITY_MENTIONS_PROOF_HYPOTHESES_AND_TERMS, (SubLObject)proof_view_populator.TWO_INTEGER, (SubLObject)proof_view_populator.NIL, (SubLObject)proof_view_populator.EQUAL, (SubLObject)proof_view_populator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)proof_view_populator.$sym202$PROOF_VIEW_ENTITY_MENTIONS_PROOF_HYPOTHESES_AND_TERMS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(proof, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)proof_view_populator.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)proof_view_populator.NIL;
            collision = cdolist_list_var.first();
            while (proof_view_populator.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (proof.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (proof_view_populator.NIL != cached_args && proof_view_populator.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(proof_view_entity_mentions_proof_hypotheses_and_terms_internal(proof, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(proof, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 51941L)
    public static SubLObject proof_view_add_entity_mention_entries(final SubLObject v_proof_view, final SubLObject proof, final SubLObject parent_entry, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject hypotheses = proof_view_entity_mentions_proof_hypotheses_and_terms(proof, mt);
        final SubLObject terms = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject addedP = (SubLObject)proof_view_populator.NIL;
        SubLObject cdolist_list_var = hypotheses;
        SubLObject hypothesis = (SubLObject)proof_view_populator.NIL;
        hypothesis = cdolist_list_var.first();
        while (proof_view_populator.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8 = proof_view_get_entity_mentions_for_hypothesis(hypothesis, mt);
            SubLObject entity_mention = (SubLObject)proof_view_populator.NIL;
            entity_mention = cdolist_list_var_$8.first();
            while (proof_view_populator.NIL != cdolist_list_var_$8) {
                final SubLObject v_document = proof_view.proof_view_get_document_for_hypothesis(hypothesis, mt);
                if (proof_view_populator.NIL != v_document) {
                    final SubLObject source_entity_mention_entry = proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str160$Source_Text_, parent_entry, (SubLObject)proof_view_populator.$kw204$ENTITY_MENTION, (SubLObject)ConsesLow.list(v_document, entity_mention, terms, mt), (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw49$FN, (SubLObject)proof_view_populator.$sym205$PROOF_VIEW_ADD_ENTITY_MENTION_ENTRIES, (SubLObject)proof_view_populator.$kw111$FN_SECTION, (SubLObject)proof_view_populator.$sym206$SOURCE_TEXT));
                    final SubLObject ks = proof_view_knowledge_source_for_mt(mt);
                    addedP = (SubLObject)proof_view_populator.T;
                    final SubLObject publisher = proof_view_get_publisher_for_document(v_document, mt);
                    final SubLObject title = proof_view_get_title_for_document(v_document, mt);
                    final SubLObject date = proof_view_get_date_for_document(v_document, mt);
                    final SubLObject author = proof_view_get_author_for_document(v_document, mt);
                    if (proof_view_populator.NIL != title) {
                        proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str162$Title_, source_entity_mention_entry, (SubLObject)proof_view_populator.$sym109$EL_TERM_P, title, (SubLObject)proof_view_populator.UNPROVIDED);
                    }
                    if (proof_view_populator.NIL != date) {
                        proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str163$Date_, source_entity_mention_entry, (SubLObject)proof_view_populator.$sym109$EL_TERM_P, date, (SubLObject)proof_view_populator.UNPROVIDED);
                    }
                    if (proof_view_populator.NIL != author) {
                        proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str164$Author_, source_entity_mention_entry, (SubLObject)proof_view_populator.$sym109$EL_TERM_P, author, (SubLObject)proof_view_populator.UNPROVIDED);
                    }
                    if (proof_view_populator.NIL != publisher) {
                        proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str165$Publisher_, source_entity_mention_entry, (SubLObject)proof_view_populator.$sym109$EL_TERM_P, publisher, (SubLObject)proof_view_populator.UNPROVIDED);
                    }
                    if (proof_view_populator.NIL != ks) {
                        proof_view_note_source(v_proof_view, source_entity_mention_entry, ks, (SubLObject)proof_view_populator.UNPROVIDED);
                    }
                }
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                entity_mention = cdolist_list_var_$8.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            hypothesis = cdolist_list_var.first();
        }
        if (proof_view_populator.NIL == addedP) {
            proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str166$Couldn_t_find_source_document_, parent_entry, (SubLObject)proof_view_populator.$kw167$NO_SOURCE_DOCUMENT, (SubLObject)proof_view_populator.NIL, (SubLObject)proof_view_populator.UNPROVIDED);
            proof_view_entry_note_expand_initially(parent_entry);
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 54032L)
    public static SubLObject proof_view_entry_note_abduced_support(final SubLObject proof_view_entry, final SubLObject support) {
        proof_view.proof_view_entry_set_property(proof_view_entry, (SubLObject)proof_view_populator.$kw207$HAS_ABDUCED_SUPPORT_, support);
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(proof_view_entry);
        final SubLObject parent_id = proof_view.proof_view_entry_get_parent_id(proof_view_entry);
        final SubLObject parent = (SubLObject)(parent_id.isInteger() ? proof_view.find_proof_view_entry_by_id(v_proof_view, parent_id) : proof_view_populator.NIL);
        if (proof_view_populator.NIL != parent) {
            proof_view_entry_note_abduced_support(parent, support);
        }
        return proof_view_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 54629L)
    public static SubLObject proof_view_get_hypotheses_for_sentence(final SubLObject sentence, final SubLObject mt) {
        return pph_utilities.pph_ask_variable_new((SubLObject)proof_view_populator.$sym208$_HYPOTHESIS, (SubLObject)ConsesLow.list(proof_view_populator.$const200$hypothesizedFormula, (SubLObject)proof_view_populator.$sym208$_HYPOTHESIS, sentence), mt, (SubLObject)proof_view_populator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 54838L)
    public static SubLObject proof_view_get_entity_mentions_for_hypothesis(final SubLObject hypothesis, final SubLObject mt) {
        return pph_utilities.pph_ask_variable_new((SubLObject)proof_view_populator.$sym209$_ENTITY_MENTION, (SubLObject)ConsesLow.list(proof_view_populator.$const175$and, (SubLObject)proof_view_populator.$list210, (SubLObject)ConsesLow.listS(proof_view_populator.$const211$dependsOnEMHyp, hypothesis, (SubLObject)proof_view_populator.$list212)), mt, (SubLObject)proof_view_populator.$list213);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 55237L)
    public static SubLObject proof_view_get_publisher_for_document(final SubLObject v_document, final SubLObject mt) {
        return pph_utilities.pph_ask_variable_new((SubLObject)proof_view_populator.$sym214$_PUBLISHER, (SubLObject)ConsesLow.list(proof_view_populator.$const215$publisherOfWork, (SubLObject)proof_view_populator.$sym214$_PUBLISHER, v_document), (SubLObject)proof_view_populator.$list216, (SubLObject)proof_view_populator.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 55456L)
    public static SubLObject proof_view_get_date_for_document(final SubLObject v_document, final SubLObject mt) {
        return pph_utilities.pph_ask_variable_new((SubLObject)proof_view_populator.$sym217$_DATE, (SubLObject)ConsesLow.listS(proof_view_populator.$const218$dateOfPublication_CW, v_document, (SubLObject)proof_view_populator.$list219), (SubLObject)proof_view_populator.$list216, (SubLObject)proof_view_populator.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 55665L)
    public static SubLObject proof_view_get_author_for_document(final SubLObject v_document, final SubLObject mt) {
        return pph_utilities.pph_ask_variable_new((SubLObject)proof_view_populator.$sym220$_AUTHOR, (SubLObject)ConsesLow.listS(proof_view_populator.$const221$authorOfLiteraryWork_CW, v_document, (SubLObject)proof_view_populator.$list222), (SubLObject)proof_view_populator.$list216, (SubLObject)proof_view_populator.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 55883L)
    public static SubLObject proof_view_get_title_for_document(final SubLObject v_document, final SubLObject mt) {
        return pph_utilities.pph_ask_variable_new((SubLObject)proof_view_populator.$sym223$_TITLE, (SubLObject)ConsesLow.listS(proof_view_populator.$const224$titleOfWork, v_document, (SubLObject)proof_view_populator.$list225), (SubLObject)proof_view_populator.$list216, (SubLObject)proof_view_populator.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 56086L)
    public static SubLObject proof_view_entry_remove_label(final SubLObject proof_view_entry) {
        assert proof_view_populator.NIL != proof_view.proof_view_entry_p(proof_view_entry) : proof_view_entry;
        return proof_view.proof_view_entry_set_label(proof_view_entry, (SubLObject)proof_view_populator.$str39$);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 56263L)
    public static SubLObject proof_view_entry_set_children(final SubLObject proof_view_entry, SubLObject children) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var = children;
        assert proof_view_populator.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)proof_view_populator.NIL;
        elem = cdolist_list_var.first();
        while (proof_view_populator.NIL != cdolist_list_var) {
            assert proof_view_populator.NIL != proof_view.proof_view_entry_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        children = Sort.sort(children, (SubLObject)proof_view_populator.$sym227$PROOF_VIEW_ENTRY_, (SubLObject)proof_view_populator.UNPROVIDED);
        SubLObject pre_sorted = conses_high.copy_list(children);
        if (proof_view_populator.NIL == proof_view_populator.$suspend_auto_sorting_of_proof_view_entriesP$.getDynamicValue(thread)) {
            if (proof_view_populator.NIL == proof_view_populator.$suspend_generality_sorting_of_proof_view_entriesP$.getDynamicValue(thread)) {
                final SubLObject justification_root_entry = proof_view_get_justification_root_entry(proof_view.proof_view_entry_get_proof_view(proof_view_entry));
                if (proof_view_populator.NIL != justification_root_entry && proof_view_populator.NIL != proof_view.proof_view_entry_has_ancestorP(proof_view_entry, justification_root_entry, (SubLObject)proof_view_populator.UNPROVIDED)) {
                    children = Sort.stable_sort(children, (SubLObject)proof_view_populator.$sym228$PROOF_VIEW_ENTRY_MORE_GENERAL_, (SubLObject)proof_view_populator.UNPROVIDED);
                }
                if (!pre_sorted.equal(children)) {
                    if (proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                        Errors.warn((SubLObject)proof_view_populator.$str229$Sort_by_specificity_changed_order, pre_sorted, children);
                    }
                    pre_sorted = conses_high.copy_list(children);
                }
            }
            children = link_proof_view_causal_chains(children);
            if (!pre_sorted.equal(children) && proof_view_populator.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_populator.$str230$Sort_by_causality_changed_order__, pre_sorted, children);
            }
        }
        return proof_view_entry_set_children_low(proof_view_entry, children);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 57489L)
    public static SubLObject proof_view_entry_set_children_low(final SubLObject proof_view_entry, final SubLObject children) {
        return proof_view.proof_view_entry_set_property(proof_view_entry, (SubLObject)proof_view_populator.$kw231$CHILDREN, children);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 57645L)
    public static SubLObject link_proof_view_causal_chains(final SubLObject entries) {
        SubLObject chains = (SubLObject)proof_view_populator.NIL;
        SubLObject reordered = (SubLObject)proof_view_populator.NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = (SubLObject)proof_view_populator.NIL;
        entry = cdolist_list_var.first();
        while (proof_view_populator.NIL != cdolist_list_var) {
            chains = add_proof_view_entry_to_causal_chains(entry, chains);
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        cdolist_list_var = chains;
        SubLObject chain = (SubLObject)proof_view_populator.NIL;
        chain = cdolist_list_var.first();
        while (proof_view_populator.NIL != cdolist_list_var) {
            if (proof_view_populator.NIL != list_utilities.lengthG(chain, (SubLObject)proof_view_populator.ONE_INTEGER, (SubLObject)proof_view_populator.UNPROVIDED)) {
                SubLObject cdolist_list_var_$9 = chain;
                SubLObject entry2 = (SubLObject)proof_view_populator.NIL;
                entry2 = cdolist_list_var_$9.first();
                while (proof_view_populator.NIL != cdolist_list_var_$9) {
                    final SubLObject item_var = entry2;
                    if (proof_view_populator.NIL == conses_high.member(item_var, reordered, Symbols.symbol_function((SubLObject)proof_view_populator.EQL), Symbols.symbol_function((SubLObject)proof_view_populator.IDENTITY))) {
                        reordered = (SubLObject)ConsesLow.cons(item_var, reordered);
                    }
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    entry2 = cdolist_list_var_$9.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            chain = cdolist_list_var.first();
        }
        if (proof_view_populator.NIL != list_utilities.empty_list_p(reordered)) {
            return entries;
        }
        cdolist_list_var = entries;
        entry = (SubLObject)proof_view_populator.NIL;
        entry = cdolist_list_var.first();
        while (proof_view_populator.NIL != cdolist_list_var) {
            final SubLObject item_var2 = entry;
            if (proof_view_populator.NIL == conses_high.member(item_var2, reordered, Symbols.symbol_function((SubLObject)proof_view_populator.EQL), Symbols.symbol_function((SubLObject)proof_view_populator.IDENTITY))) {
                reordered = (SubLObject)ConsesLow.cons(item_var2, reordered);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return Sequences.nreverse(reordered);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 58114L)
    public static SubLObject add_proof_view_entry_to_causal_chains(final SubLObject entry, final SubLObject chains) {
        final SubLObject cause = proof_view_entry_get_cause(entry);
        final SubLObject effect = proof_view_entry_get_effect(entry);
        if (proof_view_populator.NIL == cause || proof_view_populator.NIL == effect) {
            return chains;
        }
        SubLObject list_var = (SubLObject)proof_view_populator.NIL;
        SubLObject chain = (SubLObject)proof_view_populator.NIL;
        SubLObject i = (SubLObject)proof_view_populator.NIL;
        list_var = chains;
        chain = list_var.first();
        for (i = (SubLObject)proof_view_populator.ZERO_INTEGER; proof_view_populator.NIL != list_var; list_var = list_var.rest(), chain = list_var.first(), i = Numbers.add((SubLObject)proof_view_populator.ONE_INTEGER, i)) {
            if (effect.equal(proof_view_entry_get_cause(chain.first()))) {
                final SubLObject new_chain = (SubLObject)ConsesLow.cons(entry, chain);
                return list_utilities.replace_nth(i, new_chain, chains);
            }
            if (cause.equal(proof_view_entry_get_effect(list_utilities.last_one(chain)))) {
                final SubLObject new_chain = list_utilities.add_to_end(entry, chain);
                return list_utilities.replace_nth(i, new_chain, chains);
            }
        }
        return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(entry), chains);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 58733L)
    public static SubLObject proof_view_entry_get_cause(final SubLObject entry) {
        final SubLObject cause = proof_view.proof_view_entry_get_property(entry, (SubLObject)proof_view_populator.$kw232$CAUSE, misc_utilities.uninitialized());
        if (proof_view_populator.NIL != misc_utilities.initialized_p(cause)) {
            return cause;
        }
        return initialize_proof_view_entry_cause(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 58970L)
    public static SubLObject initialize_proof_view_entry_cause(final SubLObject entry) {
        final SubLObject v_object = proof_view.proof_view_entry_get_object(entry);
        SubLObject cause = (SubLObject)proof_view_populator.NIL;
        if (proof_view_populator.NIL != arguments.support_p(v_object) || proof_view_populator.NIL != cycl_grammar.cycl_formulaic_sentence_p(v_object)) {
            final SubLObject sentence = proof_view.proof_view_fact_sentence(v_object);
            final SubLObject pred = cycl_utilities.formula_arg0(sentence);
            final SubLObject cause_arg_num = cause_arg_num_of_pred(pred);
            cause = (SubLObject)((proof_view_populator.NIL != cause_arg_num) ? cycl_utilities.formula_arg(sentence, cause_arg_num, (SubLObject)proof_view_populator.UNPROVIDED) : proof_view_populator.NIL);
        }
        proof_view.proof_view_entry_set_property(entry, (SubLObject)proof_view_populator.$kw232$CAUSE, cause);
        return cause;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 59472L)
    public static SubLObject cause_arg_num_of_pred_internal(final SubLObject pred) {
        return ask_utilities.query_variable((SubLObject)proof_view_populator.$sym234$_ARG, (SubLObject)ConsesLow.listS(proof_view_populator.$const235$causeArg, pred, (SubLObject)proof_view_populator.$list236), proof_view_populator.$const148$InferencePSC, (SubLObject)proof_view_populator.$list237).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 59472L)
    public static SubLObject cause_arg_num_of_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)proof_view_populator.NIL;
        if (proof_view_populator.NIL == v_memoization_state) {
            return cause_arg_num_of_pred_internal(pred);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)proof_view_populator.$sym233$CAUSE_ARG_NUM_OF_PRED, (SubLObject)proof_view_populator.UNPROVIDED);
        if (proof_view_populator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)proof_view_populator.$sym233$CAUSE_ARG_NUM_OF_PRED, (SubLObject)proof_view_populator.ONE_INTEGER, (SubLObject)proof_view_populator.NIL, (SubLObject)proof_view_populator.EQUAL, (SubLObject)proof_view_populator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)proof_view_populator.$sym233$CAUSE_ARG_NUM_OF_PRED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cause_arg_num_of_pred_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)proof_view_populator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 59676L)
    public static SubLObject proof_view_entry_get_effect(final SubLObject entry) {
        final SubLObject effect = proof_view.proof_view_entry_get_property(entry, (SubLObject)proof_view_populator.$kw238$EFFECT, misc_utilities.uninitialized());
        if (proof_view_populator.NIL != misc_utilities.initialized_p(effect)) {
            return effect;
        }
        return initialize_proof_view_entry_effect(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 59919L)
    public static SubLObject initialize_proof_view_entry_effect(final SubLObject entry) {
        final SubLObject v_object = proof_view.proof_view_entry_get_object(entry);
        SubLObject effect = (SubLObject)proof_view_populator.NIL;
        if (proof_view_populator.NIL != arguments.support_p(v_object) || proof_view_populator.NIL != cycl_grammar.cycl_formulaic_sentence_p(v_object)) {
            final SubLObject sentence = proof_view.proof_view_fact_sentence(v_object);
            final SubLObject pred = cycl_utilities.formula_arg0(sentence);
            final SubLObject effect_arg_num = effect_arg_num_of_pred(pred);
            effect = (SubLObject)((proof_view_populator.NIL != effect_arg_num) ? cycl_utilities.formula_arg(sentence, effect_arg_num, (SubLObject)proof_view_populator.UNPROVIDED) : proof_view_populator.NIL);
        }
        proof_view.proof_view_entry_set_property(entry, (SubLObject)proof_view_populator.$kw238$EFFECT, effect);
        return effect;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 60431L)
    public static SubLObject effect_arg_num_of_pred_internal(final SubLObject pred) {
        return ask_utilities.query_variable((SubLObject)proof_view_populator.$sym234$_ARG, (SubLObject)ConsesLow.listS(proof_view_populator.$const240$effectArg, pred, (SubLObject)proof_view_populator.$list236), proof_view_populator.$const148$InferencePSC, (SubLObject)proof_view_populator.$list237).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 60431L)
    public static SubLObject effect_arg_num_of_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)proof_view_populator.NIL;
        if (proof_view_populator.NIL == v_memoization_state) {
            return effect_arg_num_of_pred_internal(pred);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)proof_view_populator.$sym239$EFFECT_ARG_NUM_OF_PRED, (SubLObject)proof_view_populator.UNPROVIDED);
        if (proof_view_populator.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)proof_view_populator.$sym239$EFFECT_ARG_NUM_OF_PRED, (SubLObject)proof_view_populator.ONE_INTEGER, (SubLObject)proof_view_populator.NIL, (SubLObject)proof_view_populator.EQUAL, (SubLObject)proof_view_populator.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)proof_view_populator.$sym239$EFFECT_ARG_NUM_OF_PRED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(effect_arg_num_of_pred_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)proof_view_populator.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 60637L)
    public static SubLObject get_new_proof_view_entry_id(final SubLObject v_proof_view) {
        final SubLObject v_id_index = proof_view.proof_view_get_id_index(v_proof_view);
        return id_index.id_index_reserve(v_id_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 60793L)
    public static SubLObject proof_view_add_used_support(final SubLObject v_proof_view, final SubLObject used_support) {
        final SubLObject existing = proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_populator.$kw241$USED_SUPPORTS, (SubLObject)proof_view_populator.UNPROVIDED);
        if (proof_view_populator.NIL == subl_promotions.memberP(pph_proof.pph_support_el_sentence(used_support), existing, Symbols.symbol_function((SubLObject)proof_view_populator.EQUAL), Symbols.symbol_function((SubLObject)proof_view_populator.$sym242$PPH_SUPPORT_EL_SENTENCE))) {
            proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_populator.$kw241$USED_SUPPORTS, list_utilities.add_to_end(used_support, existing));
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 61180L)
    public static SubLObject proof_view_add_assert_info_entries(final SubLObject v_proof_view, final SubLObject assertion, final SubLObject assertion_entry, final SubLObject inference_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt = pph_proof.pph_assert_info(assertion);
        SubLObject v_sources = thread.secondMultipleValue();
        final SubLObject strengthenedP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = sources.assertion_corroborating_sources(assertion, inference_mt);
        SubLObject corroborating_source = (SubLObject)proof_view_populator.NIL;
        corroborating_source = cdolist_list_var.first();
        while (proof_view_populator.NIL != cdolist_list_var) {
            final SubLObject item_var = corroborating_source;
            if (proof_view_populator.NIL == conses_high.member(item_var, v_sources, Symbols.symbol_function((SubLObject)proof_view_populator.EQUAL), Symbols.symbol_function((SubLObject)proof_view_populator.IDENTITY))) {
                v_sources = (SubLObject)ConsesLow.cons(item_var, v_sources);
            }
            cdolist_list_var = cdolist_list_var.rest();
            corroborating_source = cdolist_list_var.first();
        }
        final SubLObject givenP = proof_view.proof_view_assertion_givenP(v_proof_view, assertion);
        if (proof_view_populator.NIL != v_sources) {
            SubLObject cdolist_list_var2 = v_sources;
            SubLObject source = (SubLObject)proof_view_populator.NIL;
            source = cdolist_list_var2.first();
            while (proof_view_populator.NIL != cdolist_list_var2) {
                proof_view_note_source(v_proof_view, assertion_entry, source, strengthenedP);
                cdolist_list_var2 = cdolist_list_var2.rest();
                source = cdolist_list_var2.first();
            }
        }
        else if (proof_view_populator.NIL != givenP && proof_view_populator.NIL == proof_view.proof_view_get_suppress_assertion_bookkeepingP(v_proof_view)) {
            proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str243$Given_, assertion_entry, (SubLObject)proof_view_populator.$kw244$GIVEN, mt, (SubLObject)proof_view_populator.UNPROVIDED);
        }
        if (proof_view_populator.NIL == givenP && proof_view_populator.NIL != assertions_high.asserted_assertionP(assertion) && proof_view_populator.NIL == proof_view.proof_view_get_suppress_assertion_bookkeepingP(v_proof_view)) {
            proof_view_add_new_entry(v_proof_view, proof_view.$proof_view_assertion_bookkeeping_label$.getDynamicValue(thread), assertion_entry, (SubLObject)proof_view_populator.$kw245$ASSERTION_BOOKKEEPING, assertion, (SubLObject)proof_view_populator.UNPROVIDED);
        }
        if (proof_view_populator.NIL != assertions_high.rule_assertionP(assertion) && proof_view_populator.NIL != inference_worker_transformation.rule_assertion_has_some_pragmatic_requirementP(assertion, proof_view_populator.$const148$InferencePSC)) {
            proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str246$Pragmatics_, assertion_entry, (SubLObject)proof_view_populator.$kw247$PRAGMATICS, (SubLObject)proof_view_populator.NIL, (SubLObject)proof_view_populator.UNPROVIDED);
        }
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 62503L)
    public static SubLObject suppress_proof_view_section_with_rootP(final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject label = proof_view.proof_view_entry_get_label(entry);
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(entry);
        if (label.equal(proof_view.$proof_view_justification_label$.getDynamicValue(thread))) {
            return (SubLObject)SubLObjectFactory.makeBoolean(proof_view_populator.NIL == proof_view.proof_view_get_include_justification_sectionP(v_proof_view));
        }
        if (label.equal(proof_view.$proof_view_facts_used_label$.getDynamicValue(thread))) {
            return (SubLObject)SubLObjectFactory.makeBoolean(proof_view_populator.NIL == proof_view_summary.proof_view_get_include_summary_sectionP(v_proof_view));
        }
        if (label.equal(proof_view.$proof_view_linear_label$.getDynamicValue(thread))) {
            return (SubLObject)SubLObjectFactory.makeBoolean(proof_view_populator.NIL == proof_view_linear.proof_view_get_include_linear_sectionP(v_proof_view));
        }
        return (SubLObject)proof_view_populator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 63090L)
    public static SubLObject proof_view_possibly_register_source(final SubLObject v_proof_view, SubLObject source, SubLObject strengthenedP) {
        if (strengthenedP == proof_view_populator.UNPROVIDED) {
            strengthenedP = (SubLObject)proof_view_populator.NIL;
        }
        if (proof_view_populator.NIL != proof_view.proof_view_valid_source_p(source)) {
            SubLObject id = proof_view.proof_view_get_source_id(v_proof_view, source);
            if (proof_view_populator.NIL == subl_promotions.positive_integer_p(id)) {
                SubLObject source_index = proof_view.proof_view_get_source_index(v_proof_view);
                SubLObject source_isg = proof_view.proof_view_get_source_isg(v_proof_view);
                if (proof_view_populator.NIL == dictionary.dictionary_p(source_index)) {
                    source_index = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)proof_view_populator.EQUAL), (SubLObject)proof_view_populator.UNPROVIDED);
                    source_isg = integer_sequence_generator.new_integer_sequence_generator((SubLObject)proof_view_populator.ONE_INTEGER, (SubLObject)proof_view_populator.UNPROVIDED, (SubLObject)proof_view_populator.UNPROVIDED);
                    proof_view_set_source_index(v_proof_view, source_index);
                    proof_view_set_source_isg(v_proof_view, source_isg);
                }
                id = integer_sequence_generator.integer_sequence_generator_next(source_isg);
                final SubLObject citation = pph_html.new_pph_source_citation(source, id, strengthenedP);
                dictionary.dictionary_enter(source_index, source, citation);
            }
        }
        return source;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 64059L)
    public static SubLObject proof_view_set_source_isg(final SubLObject v_proof_view, final SubLObject isg) {
        assert proof_view_populator.NIL != integer_sequence_generator.integer_sequence_generator_p(isg) : isg;
        return proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_populator.$kw249$SOURCE_ISG, isg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 64231L)
    public static SubLObject proof_view_set_source_index(final SubLObject v_proof_view, final SubLObject source_index) {
        return proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_populator.$kw250$SOURCE_INDEX, source_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 64375L)
    public static SubLObject proof_view_add_circular_support_entry(final SubLObject v_proof_view, final SubLObject support, final SubLObject parent_entry, final SubLObject inference_mt) {
        return proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str39$, parent_entry, (SubLObject)proof_view_populator.$kw251$CIRCULAR_SUPPORT, (SubLObject)proof_view_populator.NIL, (SubLObject)proof_view_populator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-populator.lisp", position = 64698L)
    public static SubLObject add_trivial_proof_view_entry(final SubLObject v_proof_view, final SubLObject proof, final SubLObject mt, final SubLObject parent_proof_view_entry) {
        final SubLObject parent_proof_view_entry_id = proof_view.proof_view_entry_get_id(parent_proof_view_entry);
        return proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_populator.$str252$Trivially__, parent_proof_view_entry_id, (SubLObject)proof_view_populator.$sym253$EL_FORMULA_P, pph_proof.pph_proof_el_formula(proof, mt), (SubLObject)ConsesLow.list((SubLObject)proof_view_populator.$kw93$PROOF, proof));
    }
    
    public static SubLObject declare_proof_view_populator_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_populator_print_function_trampoline", "PROOF-VIEW-POPULATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_populator_p", "PROOF-VIEW-POPULATOR-P", 1, 0, false);
        new $proof_view_populator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "pvp_proof_view", "PVP-PROOF-VIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "pvp_worker_semaphore", "PVP-WORKER-SEMAPHORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "pvp_master_semaphore", "PVP-MASTER-SEMAPHORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "pvp_process", "PVP-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "_csetf_pvp_proof_view", "_CSETF-PVP-PROOF-VIEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "_csetf_pvp_worker_semaphore", "_CSETF-PVP-WORKER-SEMAPHORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "_csetf_pvp_master_semaphore", "_CSETF-PVP-MASTER-SEMAPHORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "_csetf_pvp_process", "_CSETF-PVP-PROCESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "make_proof_view_populator", "MAKE-PROOF-VIEW-POPULATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "visit_defstruct_proof_view_populator", "VISIT-DEFSTRUCT-PROOF-VIEW-POPULATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "visit_defstruct_object_proof_view_populator_method", "VISIT-DEFSTRUCT-OBJECT-PROOF-VIEW-POPULATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "print_proof_view_populator", "PRINT-PROOF-VIEW-POPULATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "new_proof_view_populator", "NEW-PROOF-VIEW-POPULATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_populator_proof_view", "PROOF-VIEW-POPULATOR-PROOF-VIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_populator_worker_semaphore", "PROOF-VIEW-POPULATOR-WORKER-SEMAPHORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_populator_master_semaphore", "PROOF-VIEW-POPULATOR-MASTER-SEMAPHORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_populator_process", "PROOF-VIEW-POPULATOR-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "sxhash_proof_view_populator_method", "SXHASH-PROOF-VIEW-POPULATOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "sxhash_proof_view_populator", "SXHASH-PROOF-VIEW-POPULATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_populator_doneP", "PROOF-VIEW-POPULATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_populator_do_one_step", "PROOF-VIEW-POPULATOR-DO-ONE-STEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_populator_note_done", "PROOF-VIEW-POPULATOR-NOTE-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_launch_stepwise_populator", "PROOF-VIEW-LAUNCH-STEPWISE-POPULATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_populate", "PROOF-VIEW-POPULATE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_note_no_justification", "PROOF-VIEW-NOTE-NO-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_set_populated_universal_time", "PROOF-VIEW-SET-POPULATED-UNIVERSAL-TIME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_set_error_output", "PROOF-VIEW-SET-ERROR-OUTPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_maybe_add_source_citations", "PROOF-VIEW-MAYBE-ADD-SOURCE-CITATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_maybe_flesh_out_rules_section", "PROOF-VIEW-MAYBE-FLESH-OUT-RULES-SECTION", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.proof_view_populator", "define_proof_view_special_section_populator", "DEFINE-PROOF-VIEW-SPECIAL-SECTION-POPULATOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_special_sections", "PROOF-VIEW-ADD-SPECIAL-SECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_note_special_section_root", "PROOF-VIEW-NOTE-SPECIAL-SECTION-ROOT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_get_special_section_roots", "PROOF-VIEW-GET-SPECIAL-SECTION-ROOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_get_special_section_root", "PROOF-VIEW-GET-SPECIAL-SECTION-ROOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_special_sections_to_include", "PROOF-VIEW-SPECIAL-SECTIONS-TO-INCLUDE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_set_include_special_sectionP", "PROOF-VIEW-SET-INCLUDE-SPECIAL-SECTION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_section_key_from_id", "PROOF-VIEW-SECTION-KEY-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "note_proof_view_special_section_populator", "NOTE-PROOF-VIEW-SPECIAL-SECTION-POPULATOR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_maybe_add_justification_section", "PROOF-VIEW-MAYBE-ADD-JUSTIFICATION-SECTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "note_constructing_proof_view_for_conclusion", "NOTE-CONSTRUCTING-PROOF-VIEW-FOR-CONCLUSION", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.proof_view_populator", "tracking_proof_view_literals_to_suppress", "TRACKING-PROOF-VIEW-LITERALS-TO-SUPPRESS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "construct_inference_proof_view_int", "CONSTRUCT-INFERENCE-PROOF-VIEW-INT", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "construct_default_proof_view", "CONSTRUCT-DEFAULT-PROOF-VIEW", 6, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_trivial_proofP", "PROOF-VIEW-TRIVIAL-PROOF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "trivial_proof_conclusionP", "TRIVIAL-PROOF-CONCLUSION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_binds_some_variable_to_valueP", "PROOF-BINDS-SOME-VARIABLE-TO-VALUE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_conclusion_for_query_pragmaP", "PROOF-CONCLUSION-FOR-QUERY-PRAGMA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_proof_literals_to_suppress", "PROOF-VIEW-PROOF-LITERALS-TO-SUPPRESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_literals_to_suppress_internal", "PROOF-LITERALS-TO-SUPPRESS-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_literals_to_suppress", "PROOF-LITERALS-TO-SUPPRESS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_proof_already_handledP", "PROOF-VIEW-PROOF-ALREADY-HANDLED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_note_already_handled", "PROOF-VIEW-NOTE-ALREADY-HANDLED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "pph_relevance_safe_list_for_justification", "PPH-RELEVANCE-SAFE-LIST-FOR-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "inference_answer_binding_targets", "INFERENCE-ANSWER-BINDING-TARGETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_inference_proof_used_rules_root", "PROOF-VIEW-ADD-INFERENCE-PROOF-USED-RULES-ROOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_query_and_answer_section", "PROOF-VIEW-ADD-QUERY-AND-ANSWER-SECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "construct_proof_view_answer_entry", "CONSTRUCT-PROOF-VIEW-ANSWER-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "new_proof_view_entry", "NEW-PROOF-VIEW-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_new_entry", "PROOF-VIEW-ADD-NEW-ENTRY", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "maybe_pause_proof_view_population", "MAYBE-PAUSE-PROOF-VIEW-POPULATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_entry_note_expand_initially", "PROOF-VIEW-ENTRY-NOTE-EXPAND-INITIALLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_section_root", "PROOF-VIEW-ADD-SECTION-ROOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_rem_property", "PROOF-VIEW-REM-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_remove_entry", "PROOF-VIEW-REMOVE-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_rule_used", "PROOF-VIEW-ADD-RULE-USED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_get_justification_root_entry", "PROOF-VIEW-GET-JUSTIFICATION-ROOT-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_get_linear_root_entry", "PROOF-VIEW-GET-LINEAR-ROOT-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_sort_entries_to_maximize_coherence", "PROOF-VIEW-SORT-ENTRIES-TO-MAXIMIZE-COHERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_entry_get_proof_suid", "PROOF-VIEW-ENTRY-GET-PROOF-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_entry_get_score", "PROOF-VIEW-ENTRY-GET-SCORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_fact_used", "PROOF-VIEW-ADD-FACT-USED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_note_source", "PROOF-VIEW-NOTE-SOURCE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_external_source_entry", "PROOF-VIEW-ADD-EXTERNAL-SOURCE-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_knowledge_source_for_hl_support", "PROOF-VIEW-KNOWLEDGE-SOURCE-FOR-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_knowledge_source_for_mt", "PROOF-VIEW-KNOWLEDGE-SOURCE-FOR-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_maybe_add_document_display_entry", "PROOF-VIEW-MAYBE-ADD-DOCUMENT-DISPLAY-ENTRY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_situation_constituents_proof_p", "PROOF-VIEW-SITUATION-CONSTITUENTS-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_situation_constituents_proof_hypothesis_and_terms_internal", "PROOF-VIEW-SITUATION-CONSTITUENTS-PROOF-HYPOTHESIS-AND-TERMS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_situation_constituents_proof_hypothesis_and_terms", "PROOF-VIEW-SITUATION-CONSTITUENTS-PROOF-HYPOTHESIS-AND-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_entries_for_situation_constituents_proof", "PROOF-VIEW-ADD-ENTRIES-FOR-SITUATION-CONSTITUENTS-PROOF", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_external_sentence_entries", "PROOF-VIEW-ADD-EXTERNAL-SENTENCE-ENTRIES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_root_entry", "PROOF-VIEW-ADD-ROOT-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_get_sentences_for_hypothesis", "PROOF-VIEW-GET-SENTENCES-FOR-HYPOTHESIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_support_tree", "PROOF-VIEW-ADD-SUPPORT-TREE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "pph_check_meta_supports_for_circularity", "PPH-CHECK-META-SUPPORTS-FOR-CIRCULARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_maybe_add_used_support", "PROOF-VIEW-MAYBE-ADD-USED-SUPPORT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_used_supportP", "PROOF-VIEW-ADD-USED-SUPPORT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "derived_assertion_proof_view_worthyP", "DERIVED-ASSERTION-PROOF-VIEW-WORTHY?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_depth_exceeds_cutoffP", "PROOF-VIEW-DEPTH-EXCEEDS-CUTOFF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_entry_add_source", "PROOF-VIEW-ENTRY-ADD-SOURCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_entity_mentions_proofP", "PROOF-VIEW-ENTITY-MENTIONS-PROOF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "entity_mentions_proof_possibleP_internal", "ENTITY-MENTIONS-PROOF-POSSIBLE?-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "entity_mentions_proof_possibleP", "ENTITY-MENTIONS-PROOF-POSSIBLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_entity_mentions_proof_hypotheses_and_terms_internal", "PROOF-VIEW-ENTITY-MENTIONS-PROOF-HYPOTHESES-AND-TERMS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_entity_mentions_proof_hypotheses_and_terms", "PROOF-VIEW-ENTITY-MENTIONS-PROOF-HYPOTHESES-AND-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_entity_mention_entries", "PROOF-VIEW-ADD-ENTITY-MENTION-ENTRIES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_entry_note_abduced_support", "PROOF-VIEW-ENTRY-NOTE-ABDUCED-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_get_hypotheses_for_sentence", "PROOF-VIEW-GET-HYPOTHESES-FOR-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_get_entity_mentions_for_hypothesis", "PROOF-VIEW-GET-ENTITY-MENTIONS-FOR-HYPOTHESIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_get_publisher_for_document", "PROOF-VIEW-GET-PUBLISHER-FOR-DOCUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_get_date_for_document", "PROOF-VIEW-GET-DATE-FOR-DOCUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_get_author_for_document", "PROOF-VIEW-GET-AUTHOR-FOR-DOCUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_get_title_for_document", "PROOF-VIEW-GET-TITLE-FOR-DOCUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_entry_remove_label", "PROOF-VIEW-ENTRY-REMOVE-LABEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_entry_set_children", "PROOF-VIEW-ENTRY-SET-CHILDREN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_entry_set_children_low", "PROOF-VIEW-ENTRY-SET-CHILDREN-LOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "link_proof_view_causal_chains", "LINK-PROOF-VIEW-CAUSAL-CHAINS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "add_proof_view_entry_to_causal_chains", "ADD-PROOF-VIEW-ENTRY-TO-CAUSAL-CHAINS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_entry_get_cause", "PROOF-VIEW-ENTRY-GET-CAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "initialize_proof_view_entry_cause", "INITIALIZE-PROOF-VIEW-ENTRY-CAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "cause_arg_num_of_pred_internal", "CAUSE-ARG-NUM-OF-PRED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "cause_arg_num_of_pred", "CAUSE-ARG-NUM-OF-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_entry_get_effect", "PROOF-VIEW-ENTRY-GET-EFFECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "initialize_proof_view_entry_effect", "INITIALIZE-PROOF-VIEW-ENTRY-EFFECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "effect_arg_num_of_pred_internal", "EFFECT-ARG-NUM-OF-PRED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "effect_arg_num_of_pred", "EFFECT-ARG-NUM-OF-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "get_new_proof_view_entry_id", "GET-NEW-PROOF-VIEW-ENTRY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_used_support", "PROOF-VIEW-ADD-USED-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_assert_info_entries", "PROOF-VIEW-ADD-ASSERT-INFO-ENTRIES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "suppress_proof_view_section_with_rootP", "SUPPRESS-PROOF-VIEW-SECTION-WITH-ROOT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_possibly_register_source", "PROOF-VIEW-POSSIBLY-REGISTER-SOURCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_set_source_isg", "PROOF-VIEW-SET-SOURCE-ISG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_set_source_index", "PROOF-VIEW-SET-SOURCE-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "proof_view_add_circular_support_entry", "PROOF-VIEW-ADD-CIRCULAR-SUPPORT-ENTRY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_populator", "add_trivial_proof_view_entry", "ADD-TRIVIAL-PROOF-VIEW-ENTRY", 4, 0, false);
        return (SubLObject)proof_view_populator.NIL;
    }
    
    public static SubLObject init_proof_view_populator_file() {
        proof_view_populator.$dtp_proof_view_populator$ = SubLFiles.defconstant("*DTP-PROOF-VIEW-POPULATOR*", (SubLObject)proof_view_populator.$sym0$PROOF_VIEW_POPULATOR);
        proof_view_populator.$proof_view_allow_unlimited_duplicationP$ = SubLFiles.defparameter("*PROOF-VIEW-ALLOW-UNLIMITED-DUPLICATION?*", (SubLObject)proof_view_populator.NIL);
        proof_view_populator.$proof_view_duplicate_entry_max$ = SubLFiles.defparameter("*PROOF-VIEW-DUPLICATE-ENTRY-MAX*", (SubLObject)proof_view_populator.FIVE_INTEGER);
        proof_view_populator.$suspend_generality_sorting_of_proof_view_entriesP$ = SubLFiles.defparameter("*SUSPEND-GENERALITY-SORTING-OF-PROOF-VIEW-ENTRIES?*", (SubLObject)proof_view_populator.NIL);
        proof_view_populator.$suspend_auto_sorting_of_proof_view_entriesP$ = SubLFiles.defparameter("*SUSPEND-AUTO-SORTING-OF-PROOF-VIEW-ENTRIES?*", (SubLObject)proof_view_populator.NIL);
        proof_view_populator.$proof_view_populator$ = SubLFiles.defparameter("*PROOF-VIEW-POPULATOR*", misc_utilities.uninitialized());
        proof_view_populator.$proof_view_special_sections$ = SubLFiles.deflexical("*PROOF-VIEW-SPECIAL-SECTIONS*", (proof_view_populator.NIL != Symbols.boundp((SubLObject)proof_view_populator.$sym59$_PROOF_VIEW_SPECIAL_SECTIONS_)) ? proof_view_populator.$proof_view_special_sections$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)proof_view_populator.EQL), (SubLObject)proof_view_populator.UNPROVIDED));
        proof_view_populator.$proof_view_special_section_terms$ = SubLFiles.deflexical("*PROOF-VIEW-SPECIAL-SECTION-TERMS*", (proof_view_populator.NIL != Symbols.boundp((SubLObject)proof_view_populator.$sym60$_PROOF_VIEW_SPECIAL_SECTION_TERMS_)) ? proof_view_populator.$proof_view_special_section_terms$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)proof_view_populator.EQL), (SubLObject)proof_view_populator.UNPROVIDED));
        proof_view_populator.$proof_conclusion_proof_view_counts$ = SubLFiles.deflexical("*PROOF-CONCLUSION-PROOF-VIEW-COUNTS*", (proof_view_populator.NIL != Symbols.boundp((SubLObject)proof_view_populator.$sym68$_PROOF_CONCLUSION_PROOF_VIEW_COUNTS_)) ? proof_view_populator.$proof_conclusion_proof_view_counts$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)proof_view_populator.EQUAL), (SubLObject)proof_view_populator.UNPROVIDED));
        proof_view_populator.$proof_view_track_fnsP$ = SubLFiles.defparameter("*PROOF-VIEW-TRACK-FNS?*", (SubLObject)proof_view_populator.T);
        proof_view_populator.$proof_scores$ = SubLFiles.defparameter("*PROOF-SCORES*", misc_utilities.uninitialized());
        return (SubLObject)proof_view_populator.NIL;
    }
    
    public static SubLObject setup_proof_view_populator_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), proof_view_populator.$dtp_proof_view_populator$.getGlobalValue(), Symbols.symbol_function((SubLObject)proof_view_populator.$sym7$PROOF_VIEW_POPULATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)proof_view_populator.$list8);
        Structures.def_csetf((SubLObject)proof_view_populator.$sym9$PVP_PROOF_VIEW, (SubLObject)proof_view_populator.$sym10$_CSETF_PVP_PROOF_VIEW);
        Structures.def_csetf((SubLObject)proof_view_populator.$sym11$PVP_WORKER_SEMAPHORE, (SubLObject)proof_view_populator.$sym12$_CSETF_PVP_WORKER_SEMAPHORE);
        Structures.def_csetf((SubLObject)proof_view_populator.$sym13$PVP_MASTER_SEMAPHORE, (SubLObject)proof_view_populator.$sym14$_CSETF_PVP_MASTER_SEMAPHORE);
        Structures.def_csetf((SubLObject)proof_view_populator.$sym15$PVP_PROCESS, (SubLObject)proof_view_populator.$sym16$_CSETF_PVP_PROCESS);
        Equality.identity((SubLObject)proof_view_populator.$sym0$PROOF_VIEW_POPULATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), proof_view_populator.$dtp_proof_view_populator$.getGlobalValue(), Symbols.symbol_function((SubLObject)proof_view_populator.$sym26$VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_POPULATOR_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)proof_view_populator.$sym6$PRINT_PROOF_VIEW_POPULATOR);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), proof_view_populator.$dtp_proof_view_populator$.getGlobalValue(), Symbols.symbol_function((SubLObject)proof_view_populator.$sym30$SXHASH_PROOF_VIEW_POPULATOR_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)proof_view_populator.$sym59$_PROOF_VIEW_SPECIAL_SECTIONS_);
        subl_macro_promotions.declare_defglobal((SubLObject)proof_view_populator.$sym60$_PROOF_VIEW_SPECIAL_SECTION_TERMS_);
        subl_macro_promotions.declare_defglobal((SubLObject)proof_view_populator.$sym68$_PROOF_CONCLUSION_PROOF_VIEW_COUNTS_);
        memoization_state.note_memoized_function((SubLObject)proof_view_populator.$sym100$PROOF_LITERALS_TO_SUPPRESS);
        memoization_state.note_memoized_function((SubLObject)proof_view_populator.$sym153$PROOF_VIEW_SITUATION_CONSTITUENTS_PROOF_HYPOTHESIS_AND_TERMS);
        memoization_state.note_memoized_function((SubLObject)proof_view_populator.$sym197$ENTITY_MENTIONS_PROOF_POSSIBLE_);
        memoization_state.note_memoized_function((SubLObject)proof_view_populator.$sym202$PROOF_VIEW_ENTITY_MENTIONS_PROOF_HYPOTHESES_AND_TERMS);
        memoization_state.note_memoized_function((SubLObject)proof_view_populator.$sym233$CAUSE_ARG_NUM_OF_PRED);
        memoization_state.note_memoized_function((SubLObject)proof_view_populator.$sym239$EFFECT_ARG_NUM_OF_PRED);
        return (SubLObject)proof_view_populator.NIL;
    }
    
    public void declareFunctions() {
        declare_proof_view_populator_file();
    }
    
    public void initializeVariables() {
        init_proof_view_populator_file();
    }
    
    public void runTopLevelForms() {
        setup_proof_view_populator_file();
    }
    
    static {
        me = (SubLFile)new proof_view_populator();
        proof_view_populator.$dtp_proof_view_populator$ = null;
        proof_view_populator.$proof_view_allow_unlimited_duplicationP$ = null;
        proof_view_populator.$proof_view_duplicate_entry_max$ = null;
        proof_view_populator.$suspend_generality_sorting_of_proof_view_entriesP$ = null;
        proof_view_populator.$suspend_auto_sorting_of_proof_view_entriesP$ = null;
        proof_view_populator.$proof_view_populator$ = null;
        proof_view_populator.$proof_view_special_sections$ = null;
        proof_view_populator.$proof_view_special_section_terms$ = null;
        proof_view_populator.$proof_conclusion_proof_view_counts$ = null;
        proof_view_populator.$proof_view_track_fnsP$ = null;
        proof_view_populator.$proof_scores$ = null;
        $sym0$PROOF_VIEW_POPULATOR = SubLObjectFactory.makeSymbol("PROOF-VIEW-POPULATOR");
        $sym1$PROOF_VIEW_POPULATOR_P = SubLObjectFactory.makeSymbol("PROOF-VIEW-POPULATOR-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROOF-VIEW"), (SubLObject)SubLObjectFactory.makeSymbol("WORKER-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("MASTER-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROOF-VIEW"), (SubLObject)SubLObjectFactory.makeKeyword("WORKER-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeKeyword("MASTER-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeKeyword("PROCESS"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PVP-PROOF-VIEW"), (SubLObject)SubLObjectFactory.makeSymbol("PVP-WORKER-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("PVP-MASTER-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("PVP-PROCESS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PVP-PROOF-VIEW"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PVP-WORKER-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PVP-MASTER-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PVP-PROCESS"));
        $sym6$PRINT_PROOF_VIEW_POPULATOR = SubLObjectFactory.makeSymbol("PRINT-PROOF-VIEW-POPULATOR");
        $sym7$PROOF_VIEW_POPULATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PROOF-VIEW-POPULATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PROOF-VIEW-POPULATOR-P"));
        $sym9$PVP_PROOF_VIEW = SubLObjectFactory.makeSymbol("PVP-PROOF-VIEW");
        $sym10$_CSETF_PVP_PROOF_VIEW = SubLObjectFactory.makeSymbol("_CSETF-PVP-PROOF-VIEW");
        $sym11$PVP_WORKER_SEMAPHORE = SubLObjectFactory.makeSymbol("PVP-WORKER-SEMAPHORE");
        $sym12$_CSETF_PVP_WORKER_SEMAPHORE = SubLObjectFactory.makeSymbol("_CSETF-PVP-WORKER-SEMAPHORE");
        $sym13$PVP_MASTER_SEMAPHORE = SubLObjectFactory.makeSymbol("PVP-MASTER-SEMAPHORE");
        $sym14$_CSETF_PVP_MASTER_SEMAPHORE = SubLObjectFactory.makeSymbol("_CSETF-PVP-MASTER-SEMAPHORE");
        $sym15$PVP_PROCESS = SubLObjectFactory.makeSymbol("PVP-PROCESS");
        $sym16$_CSETF_PVP_PROCESS = SubLObjectFactory.makeSymbol("_CSETF-PVP-PROCESS");
        $kw17$PROOF_VIEW = SubLObjectFactory.makeKeyword("PROOF-VIEW");
        $kw18$WORKER_SEMAPHORE = SubLObjectFactory.makeKeyword("WORKER-SEMAPHORE");
        $kw19$MASTER_SEMAPHORE = SubLObjectFactory.makeKeyword("MASTER-SEMAPHORE");
        $kw20$PROCESS = SubLObjectFactory.makeKeyword("PROCESS");
        $str21$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw22$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym23$MAKE_PROOF_VIEW_POPULATOR = SubLObjectFactory.makeSymbol("MAKE-PROOF-VIEW-POPULATOR");
        $kw24$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw25$END = SubLObjectFactory.makeKeyword("END");
        $sym26$VISIT_DEFSTRUCT_OBJECT_PROOF_VIEW_POPULATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROOF-VIEW-POPULATOR-METHOD");
        $str27$_PROOF_VIEW_POPULATOR_ = SubLObjectFactory.makeString("<PROOF-VIEW-POPULATOR>");
        $str28$PVP_Worker_Semaphore = SubLObjectFactory.makeString("PVP Worker Semaphore");
        $str29$PVP_Master_Semaphore = SubLObjectFactory.makeString("PVP Master Semaphore");
        $sym30$SXHASH_PROOF_VIEW_POPULATOR_METHOD = SubLObjectFactory.makeSymbol("SXHASH-PROOF-VIEW-POPULATOR-METHOD");
        $kw31$DONE = SubLObjectFactory.makeKeyword("DONE");
        $str32$proof = SubLObjectFactory.makeString("proof");
        $str33$Proof_View_Populator = SubLObjectFactory.makeString("Proof-View Populator");
        $sym34$PROOF_VIEW_POPULATE = SubLObjectFactory.makeSymbol("PROOF-VIEW-POPULATE");
        $sym35$PROOF_VIEW_P = SubLObjectFactory.makeSymbol("PROOF-VIEW-P");
        $sym36$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym37$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw38$JUSTIFICATION_ROOT = SubLObjectFactory.makeKeyword("JUSTIFICATION-ROOT");
        $str39$ = SubLObjectFactory.makeString("");
        $kw40$NO_JUSTIFICATION = SubLObjectFactory.makeKeyword("NO-JUSTIFICATION");
        $str41$IGNORE = SubLObjectFactory.makeString("IGNORE");
        $sym42$UNIVERSAL_TIME_P = SubLObjectFactory.makeSymbol("UNIVERSAL-TIME-P");
        $kw43$POPULATED_UNIVERSAL_TIME = SubLObjectFactory.makeKeyword("POPULATED-UNIVERSAL-TIME");
        $kw44$ERROR_OUTPUT = SubLObjectFactory.makeKeyword("ERROR-OUTPUT");
        $kw45$SOURCES_ROOT = SubLObjectFactory.makeKeyword("SOURCES-ROOT");
        $sym46$_ = SubLObjectFactory.makeSymbol("<");
        $sym47$PPH_SOURCE_CITATION_ID = SubLObjectFactory.makeSymbol("PPH-SOURCE-CITATION-ID");
        $kw48$SOURCE_CITATION = SubLObjectFactory.makeKeyword("SOURCE-CITATION");
        $kw49$FN = SubLObjectFactory.makeKeyword("FN");
        $sym50$PROOF_VIEW_MAYBE_ADD_SOURCE_CITATIONS = SubLObjectFactory.makeSymbol("PROOF-VIEW-MAYBE-ADD-SOURCE-CITATIONS");
        $sym51$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $sym52$PROOF_VIEW_ENTRY_GET_OBJECT = SubLObjectFactory.makeSymbol("PROOF-VIEW-ENTRY-GET-OBJECT");
        $sym53$PROOF_VIEW_RULE_SUITABLE_FOR_RULES_SECTION_ = SubLObjectFactory.makeSymbol("PROOF-VIEW-RULE-SUITABLE-FOR-RULES-SECTION?");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECTION-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INCLUDE-BY-DEFAULT?"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TERM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym55$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym56$DEFINE_PRIVATE_FUNCALL = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE-FUNCALL");
        $sym57$NOTE_PROOF_VIEW_SPECIAL_SECTION_POPULATOR = SubLObjectFactory.makeSymbol("NOTE-PROOF-VIEW-SPECIAL-SECTION-POPULATOR");
        $sym58$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym59$_PROOF_VIEW_SPECIAL_SECTIONS_ = SubLObjectFactory.makeSymbol("*PROOF-VIEW-SPECIAL-SECTIONS*");
        $sym60$_PROOF_VIEW_SPECIAL_SECTION_TERMS_ = SubLObjectFactory.makeSymbol("*PROOF-VIEW-SPECIAL-SECTION-TERMS*");
        $str61$Can_t_use__S_to_generate__S_secti = SubLObjectFactory.makeString("Can't use ~S to generate ~S section.");
        $kw62$SPECIAL_SECTION_ROOTS = SubLObjectFactory.makeKeyword("SPECIAL-SECTION-ROOTS");
        $kw63$SPECIAL_SECTIONS = SubLObjectFactory.makeKeyword("SPECIAL-SECTIONS");
        $str64$Nothing_interesting_available_ = SubLObjectFactory.makeString("Nothing interesting available.");
        $kw65$EMPTY_JUSTIFICATION = SubLObjectFactory.makeKeyword("EMPTY-JUSTIFICATION");
        $sym66$PROOF_VIEW_MAYBE_ADD_JUSTIFICATION_SECTION = SubLObjectFactory.makeSymbol("PROOF-VIEW-MAYBE-ADD-JUSTIFICATION-SECTION");
        $str67$__Done_adding_justification_secti = SubLObjectFactory.makeString("~&Done adding justification section.~%");
        $sym68$_PROOF_CONCLUSION_PROOF_VIEW_COUNTS_ = SubLObjectFactory.makeSymbol("*PROOF-CONCLUSION-PROOF-VIEW-COUNTS*");
        $list69 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LITS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym70$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PROOF-VIEW-LITERALS-TO-SUPPRESS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZED-P"), (SubLObject)SubLObjectFactory.makeSymbol("*PROOF-VIEW-LITERALS-TO-SUPPRESS*")), (SubLObject)SubLObjectFactory.makeSymbol("*PROOF-VIEW-LITERALS-TO-SUPPRESS*"), (SubLObject)proof_view_populator.NIL)));
        $sym72$CPUSH_ALL = SubLObjectFactory.makeSymbol("CPUSH-ALL");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PROOF-VIEW-LITERALS-TO-SUPPRESS*"));
        $sym74$VALID_PROOF_VIEW_P = SubLObjectFactory.makeSymbol("VALID-PROOF-VIEW-P");
        $sym75$PROOF_VIEW_ENTRY_P = SubLObjectFactory.makeSymbol("PROOF-VIEW-ENTRY-P");
        $str76$__Adding__S___under__S__ = SubLObjectFactory.makeString("~&Adding ~S~% under ~S~%");
        $sym77$FAST_REIFIED_SKOLEM_ = SubLObjectFactory.makeSymbol("FAST-REIFIED-SKOLEM?");
        $str78$Relocated___S = SubLObjectFactory.makeString("Relocated: ~S");
        $kw79$RELOCATED = SubLObjectFactory.makeKeyword("RELOCATED");
        $kw80$TRIVIAL = SubLObjectFactory.makeKeyword("TRIVIAL");
        $str81$Trivial = SubLObjectFactory.makeString("Trivial");
        $kw82$QUERY_PRAGMA = SubLObjectFactory.makeKeyword("QUERY-PRAGMA");
        $str83$Has_entry_already_ = SubLObjectFactory.makeString("Has entry already.");
        $kw84$DUPLICATE = SubLObjectFactory.makeKeyword("DUPLICATE");
        $kw85$ALREADY_HANDLED = SubLObjectFactory.makeKeyword("ALREADY-HANDLED");
        $kw86$IRRELEVANT = SubLObjectFactory.makeKeyword("IRRELEVANT");
        $str87$Proof_has_isomorphic_support___A = SubLObjectFactory.makeString("Proof has isomorphic support: ~A");
        $kw88$SUPPRESSED = SubLObjectFactory.makeKeyword("SUPPRESSED");
        $str89$Constructing_default_proof_view_f = SubLObjectFactory.makeString("Constructing default proof view for ~S");
        $sym90$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym91$EL_SENTENCE_P = SubLObjectFactory.makeSymbol("EL-SENTENCE-P");
        $sym92$CONSTRUCT_DEFAULT_PROOF_VIEW = SubLObjectFactory.makeSymbol("CONSTRUCT-DEFAULT-PROOF-VIEW");
        $kw93$PROOF = SubLObjectFactory.makeKeyword("PROOF");
        $str94$Adding_sub_entries_under__S = SubLObjectFactory.makeString("Adding sub-entries under ~S");
        $str95$Couldn_t_add_entry_for_support___ = SubLObjectFactory.makeString("Couldn't add entry for support:~% ~S");
        $kw96$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym97$VARIABLE_BINDING_VALUE = SubLObjectFactory.makeSymbol("VARIABLE-BINDING-VALUE");
        $sym98$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym99$ANYTHING_TOKEN = SubLObjectFactory.makeSymbol("ANYTHING-TOKEN");
        $sym100$PROOF_LITERALS_TO_SUPPRESS = SubLObjectFactory.makeSymbol("PROOF-LITERALS-TO-SUPPRESS");
        $sym101$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw102$ALREADY_HANDLED_PROOFS = SubLObjectFactory.makeKeyword("ALREADY-HANDLED-PROOFS");
        $kw103$USED_RULES_ROOT = SubLObjectFactory.makeKeyword("USED-RULES-ROOT");
        $str104$Query_ = SubLObjectFactory.makeString("Query:");
        $kw105$QUERY_SENTENCE = SubLObjectFactory.makeKeyword("QUERY-SENTENCE");
        $sym106$PROOF_VIEW_ADD_QUERY_AND_ANSWER_SECTION = SubLObjectFactory.makeSymbol("PROOF-VIEW-ADD-QUERY-AND-ANSWER-SECTION");
        $kw107$QUERY_ROOT = SubLObjectFactory.makeKeyword("QUERY-ROOT");
        $str108$Answer_ = SubLObjectFactory.makeString("Answer:");
        $sym109$EL_TERM_P = SubLObjectFactory.makeSymbol("EL-TERM-P");
        $sym110$CONSTRUCT_PROOF_VIEW_ANSWER_ENTRY = SubLObjectFactory.makeSymbol("CONSTRUCT-PROOF-VIEW-ANSWER-ENTRY");
        $kw111$FN_SECTION = SubLObjectFactory.makeKeyword("FN-SECTION");
        $sym112$NULL_BINDINGS = SubLObjectFactory.makeSymbol("NULL-BINDINGS");
        $sym113$ONE_BINDING = SubLObjectFactory.makeSymbol("ONE-BINDING");
        $sym114$ATOMIC_QUERY_SENTENCE = SubLObjectFactory.makeSymbol("ATOMIC-QUERY-SENTENCE");
        $kw115$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $sym116$DEFAULT = SubLObjectFactory.makeSymbol("DEFAULT");
        $kw117$ID = SubLObjectFactory.makeKeyword("ID");
        $kw118$OBJECT = SubLObjectFactory.makeKeyword("OBJECT");
        $sym119$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym120$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $str121$_S_already_exists___S_time__P__in = SubLObjectFactory.makeString("~S already exists (~S time~:P) in ~S");
        $str122$__Added__S___for__S___under__S__ = SubLObjectFactory.makeString("~&Added ~S~% for ~S~% under ~S~%");
        $sym123$VALID_PROOF_VIEW_ENTRY_P = SubLObjectFactory.makeSymbol("VALID-PROOF-VIEW-ENTRY-P");
        $kw124$EXPAND_INITIALLY_ = SubLObjectFactory.makeKeyword("EXPAND-INITIALLY?");
        $kw125$SECTION_ROOT = SubLObjectFactory.makeKeyword("SECTION-ROOT");
        $sym126$PROOF_VIEW_ADD_SECTION_ROOT = SubLObjectFactory.makeSymbol("PROOF-VIEW-ADD-SECTION-ROOT");
        $sym127$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $kw128$RULE_USED = SubLObjectFactory.makeKeyword("RULE-USED");
        $sym129$PROOF_VIEW_ADD_RULE_USED = SubLObjectFactory.makeSymbol("PROOF-VIEW-ADD-RULE-USED");
        $kw130$RULES_USED = SubLObjectFactory.makeKeyword("RULES-USED");
        $kw131$LINEAR_ROOT = SubLObjectFactory.makeKeyword("LINEAR-ROOT");
        $str132$__Inference_entities___S__ = SubLObjectFactory.makeString("~&Inference entities: ~S~%");
        $sym133$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str134$___D_Entry_FORTs___S___S = SubLObjectFactory.makeString("~&~D Entry FORTs: ~S~%~S");
        $str135$__Found_preferred_FORT__S__ = SubLObjectFactory.makeString("~&Found preferred FORT ~S~%");
        $sym136$PROOF_VIEW_ENTRY_GET_PROOF_SUID = SubLObjectFactory.makeSymbol("PROOF-VIEW-ENTRY-GET-PROOF-SUID");
        $sym137$_ = SubLObjectFactory.makeSymbol(">");
        $sym138$PROOF_VIEW_ENTRY_GET_SCORE = SubLObjectFactory.makeSymbol("PROOF-VIEW-ENTRY-GET-SCORE");
        $sym139$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $sym140$PROOF_VIEW_ADD_FACT_USED = SubLObjectFactory.makeSymbol("PROOF-VIEW-ADD-FACT-USED");
        $kw141$FACTS_USED = SubLObjectFactory.makeKeyword("FACTS-USED");
        $str142$Failed_to_store__S_on__S = SubLObjectFactory.makeString("Failed to store ~S on ~S");
        $kw143$SKSI = SubLObjectFactory.makeKeyword("SKSI");
        $kw144$GIS = SubLObjectFactory.makeKeyword("GIS");
        $str145$Cycorp_ArcMap_GIS_KS = SubLObjectFactory.makeString("Cycorp-ArcMap-GIS-KS");
        $sym146$_KS = SubLObjectFactory.makeSymbol("?KS");
        $const147$contentMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("contentMt"));
        $const148$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $const149$Saffron_KS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Saffron-KS"));
        $list150 = ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("situationConstituentWithTypeAndDesc")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("situationConstituentWithType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("situationConstituentWithDesc"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("HYPOTHESIS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym151$HYPOTHESIS = SubLObjectFactory.makeSymbol("HYPOTHESIS");
        $sym152$TERM = SubLObjectFactory.makeSymbol("TERM");
        $sym153$PROOF_VIEW_SITUATION_CONSTITUENTS_PROOF_HYPOTHESIS_AND_TERMS = SubLObjectFactory.makeSymbol("PROOF-VIEW-SITUATION-CONSTITUENTS-PROOF-HYPOTHESIS-AND-TERMS");
        $kw154$REMOVAL_SAFFRON_CONJUNCTION_069 = SubLObjectFactory.makeKeyword("REMOVAL-SAFFRON-CONJUNCTION-069");
        $const155$substring = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("substring"));
        $const156$situationConstituentWithTypeAndDe = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("situationConstituentWithTypeAndDesc"));
        $const157$situationConstituentWithType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("situationConstituentWithType"));
        $const158$situationConstituentWithDesc = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("situationConstituentWithDesc"));
        $list159 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIS-HYPOTHESIS"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ARG3"));
        $str160$Source_Text_ = SubLObjectFactory.makeString("Source Text:");
        $kw161$EXTERNAL_SENTENCE = SubLObjectFactory.makeKeyword("EXTERNAL-SENTENCE");
        $str162$Title_ = SubLObjectFactory.makeString("Title:");
        $str163$Date_ = SubLObjectFactory.makeString("Date:");
        $str164$Author_ = SubLObjectFactory.makeString("Author:");
        $str165$Publisher_ = SubLObjectFactory.makeString("Publisher:");
        $str166$Couldn_t_find_source_document_ = SubLObjectFactory.makeString("Couldn't find source document.");
        $kw167$NO_SOURCE_DOCUMENT = SubLObjectFactory.makeKeyword("NO-SOURCE-DOCUMENT");
        $kw168$PARENT_ID = SubLObjectFactory.makeKeyword("PARENT-ID");
        $kw169$OBJECT_TYPE = SubLObjectFactory.makeKeyword("OBJECT-TYPE");
        $kw170$ROOT = SubLObjectFactory.makeKeyword("ROOT");
        $kw171$LABEL = SubLObjectFactory.makeKeyword("LABEL");
        $str172$Root = SubLObjectFactory.makeString("Root");
        $str173$Initial_ID_in__S_is__S__should_be = SubLObjectFactory.makeString("Initial ID in ~S is ~S; should be 0.");
        $sym174$_SENTENCE = SubLObjectFactory.makeSymbol("?SENTENCE");
        $const175$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list176 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?SENTENCE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSentence")));
        $const177$sourceOfTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sourceOfTerm"));
        $list178 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SENTENCE"));
        $str179$Already_have_entry_for__S = SubLObjectFactory.makeString("Already have entry for ~S");
        $sym180$PROOF_VIEW_ADD_SUPPORT_TREE = SubLObjectFactory.makeSymbol("PROOF-VIEW-ADD-SUPPORT-TREE");
        $sym181$NON_DEDUCED_ASSERTION = SubLObjectFactory.makeSymbol("NON-DEDUCED-ASSERTION");
        $sym182$CIRCULAR_ASSERTION = SubLObjectFactory.makeSymbol("CIRCULAR-ASSERTION");
        $sym183$CIRCULAR_SUPPORT = SubLObjectFactory.makeSymbol("CIRCULAR-SUPPORT");
        $str184$__Skipping_over_trivial_symmetric = SubLObjectFactory.makeString("~&Skipping over trivial symmetric sentence ~S~% supporting ~S~%");
        $sym185$NORMAL_SUPPORT = SubLObjectFactory.makeSymbol("NORMAL-SUPPORT");
        $kw186$ABDUCED_SUPPORT = SubLObjectFactory.makeKeyword("ABDUCED-SUPPORT");
        $sym187$ABDUCED_SUPPORT = SubLObjectFactory.makeSymbol("ABDUCED-SUPPORT");
        $kw188$UNSUPPORTED_SUPPORT = SubLObjectFactory.makeKeyword("UNSUPPORTED-SUPPORT");
        $sym189$UNSUPPORTED_SUPPORT = SubLObjectFactory.makeSymbol("UNSUPPORTED-SUPPORT");
        $str190$unknown_support_type_for__A = SubLObjectFactory.makeString("unknown support type for ~A");
        $str191$Already_shown___S = SubLObjectFactory.makeString("Already shown: ~S");
        $str192$Circularity_in_meta_supports__Alr = SubLObjectFactory.makeString("Circularity in meta-supports. Already seen~% ~S~%");
        $list193 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENLS"));
        $str194$Not_proof_view_worthy___S = SubLObjectFactory.makeString("Not proof-view worthy: ~S");
        $sym195$CYCL_TERM_P = SubLObjectFactory.makeSymbol("CYCL-TERM-P");
        $kw196$SOURCES = SubLObjectFactory.makeKeyword("SOURCES");
        $sym197$ENTITY_MENTIONS_PROOF_POSSIBLE_ = SubLObjectFactory.makeSymbol("ENTITY-MENTIONS-PROOF-POSSIBLE?");
        $sym198$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const199$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const200$hypothesizedFormula = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hypothesizedFormula"));
        $const201$hypothesizedFormulaStrengthenedTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hypothesizedFormulaStrengthenedTo"));
        $sym202$PROOF_VIEW_ENTITY_MENTIONS_PROOF_HYPOTHESES_AND_TERMS = SubLObjectFactory.makeSymbol("PROOF-VIEW-ENTITY-MENTIONS-PROOF-HYPOTHESES-AND-TERMS");
        $sym203$SKSI_SUPPORTED_EXTERNAL_TERM_ = SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-EXTERNAL-TERM?");
        $kw204$ENTITY_MENTION = SubLObjectFactory.makeKeyword("ENTITY-MENTION");
        $sym205$PROOF_VIEW_ADD_ENTITY_MENTION_ENTRIES = SubLObjectFactory.makeSymbol("PROOF-VIEW-ADD-ENTITY-MENTION-ENTRIES");
        $sym206$SOURCE_TEXT = SubLObjectFactory.makeSymbol("SOURCE-TEXT");
        $kw207$HAS_ABDUCED_SUPPORT_ = SubLObjectFactory.makeKeyword("HAS-ABDUCED-SUPPORT?");
        $sym208$_HYPOTHESIS = SubLObjectFactory.makeSymbol("?HYPOTHESIS");
        $sym209$_ENTITY_MENTION = SubLObjectFactory.makeSymbol("?ENTITY-MENTION");
        $list210 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mentionForMentionHypothesis")), (SubLObject)SubLObjectFactory.makeSymbol("?ENTITY-MENTION-HYPOTHESIS"), (SubLObject)SubLObjectFactory.makeSymbol("?ENTITY-MENTION"));
        $const211$dependsOnEMHyp = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dependsOnEMHyp"));
        $list212 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ENTITY-MENTION-HYPOTHESIS"));
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)proof_view_populator.ONE_INTEGER);
        $sym214$_PUBLISHER = SubLObjectFactory.makeSymbol("?PUBLISHER");
        $const215$publisherOfWork = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("publisherOfWork"));
        $list216 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContentMtFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BBN-KS")));
        $sym217$_DATE = SubLObjectFactory.makeSymbol("?DATE");
        $const218$dateOfPublication_CW = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfPublication-CW"));
        $list219 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DATE"));
        $sym220$_AUTHOR = SubLObjectFactory.makeSymbol("?AUTHOR");
        $const221$authorOfLiteraryWork_CW = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("authorOfLiteraryWork-CW"));
        $list222 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?AUTHOR"));
        $sym223$_TITLE = SubLObjectFactory.makeSymbol("?TITLE");
        $const224$titleOfWork = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("titleOfWork"));
        $list225 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TITLE"));
        $sym226$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym227$PROOF_VIEW_ENTRY_ = SubLObjectFactory.makeSymbol("PROOF-VIEW-ENTRY<");
        $sym228$PROOF_VIEW_ENTRY_MORE_GENERAL_ = SubLObjectFactory.makeSymbol("PROOF-VIEW-ENTRY-MORE-GENERAL?");
        $str229$Sort_by_specificity_changed_order = SubLObjectFactory.makeString("Sort by specificity changed order~% from ~S~%   to ~S~%");
        $str230$Sort_by_causality_changed_order__ = SubLObjectFactory.makeString("Sort by causality changed order~% from ~S~%   to ~S~%");
        $kw231$CHILDREN = SubLObjectFactory.makeKeyword("CHILDREN");
        $kw232$CAUSE = SubLObjectFactory.makeKeyword("CAUSE");
        $sym233$CAUSE_ARG_NUM_OF_PRED = SubLObjectFactory.makeSymbol("CAUSE-ARG-NUM-OF-PRED");
        $sym234$_ARG = SubLObjectFactory.makeSymbol("?ARG");
        $const235$causeArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("causeArg"));
        $list236 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ARG"));
        $list237 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)proof_view_populator.ONE_INTEGER);
        $kw238$EFFECT = SubLObjectFactory.makeKeyword("EFFECT");
        $sym239$EFFECT_ARG_NUM_OF_PRED = SubLObjectFactory.makeSymbol("EFFECT-ARG-NUM-OF-PRED");
        $const240$effectArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("effectArg"));
        $kw241$USED_SUPPORTS = SubLObjectFactory.makeKeyword("USED-SUPPORTS");
        $sym242$PPH_SUPPORT_EL_SENTENCE = SubLObjectFactory.makeSymbol("PPH-SUPPORT-EL-SENTENCE");
        $str243$Given_ = SubLObjectFactory.makeString("Given:");
        $kw244$GIVEN = SubLObjectFactory.makeKeyword("GIVEN");
        $kw245$ASSERTION_BOOKKEEPING = SubLObjectFactory.makeKeyword("ASSERTION-BOOKKEEPING");
        $str246$Pragmatics_ = SubLObjectFactory.makeString("Pragmatics:");
        $kw247$PRAGMATICS = SubLObjectFactory.makeKeyword("PRAGMATICS");
        $sym248$INTEGER_SEQUENCE_GENERATOR_P = SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR-P");
        $kw249$SOURCE_ISG = SubLObjectFactory.makeKeyword("SOURCE-ISG");
        $kw250$SOURCE_INDEX = SubLObjectFactory.makeKeyword("SOURCE-INDEX");
        $kw251$CIRCULAR_SUPPORT = SubLObjectFactory.makeKeyword("CIRCULAR-SUPPORT");
        $str252$Trivially__ = SubLObjectFactory.makeString("Trivially: ");
        $sym253$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
    }
    
    public static final class $proof_view_populator_native extends SubLStructNative
    {
        public SubLObject $proof_view;
        public SubLObject $worker_semaphore;
        public SubLObject $master_semaphore;
        public SubLObject $process;
        private static final SubLStructDeclNative structDecl;
        
        public $proof_view_populator_native() {
            this.$proof_view = (SubLObject)CommonSymbols.NIL;
            this.$worker_semaphore = (SubLObject)CommonSymbols.NIL;
            this.$master_semaphore = (SubLObject)CommonSymbols.NIL;
            this.$process = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$proof_view_populator_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$proof_view;
        }
        
        public SubLObject getField3() {
            return this.$worker_semaphore;
        }
        
        public SubLObject getField4() {
            return this.$master_semaphore;
        }
        
        public SubLObject getField5() {
            return this.$process;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$proof_view = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$worker_semaphore = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$master_semaphore = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$process = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$proof_view_populator_native.class, proof_view_populator.$sym0$PROOF_VIEW_POPULATOR, proof_view_populator.$sym1$PROOF_VIEW_POPULATOR_P, proof_view_populator.$list2, proof_view_populator.$list3, new String[] { "$proof_view", "$worker_semaphore", "$master_semaphore", "$process" }, proof_view_populator.$list4, proof_view_populator.$list5, proof_view_populator.$sym6$PRINT_PROOF_VIEW_POPULATOR);
        }
    }
    
    public static final class $proof_view_populator_p$UnaryFunction extends UnaryFunction
    {
        public $proof_view_populator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROOF-VIEW-POPULATOR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return proof_view_populator.proof_view_populator_p(arg1);
        }
    }
}

/*

	Total time: 773 ms
	 synthetic 
*/