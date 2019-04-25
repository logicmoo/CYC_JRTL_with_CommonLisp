package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.el_utilities;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.leviathan;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_datastructures_problem extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem";
    public static final String myFingerPrint = "661d4c2903a9af8f683fbd01675f83c5f8edb5f42cb25891f30e37778b08c7d3";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLSymbol $dtp_problem$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 5525L)
    public static SubLSymbol $empty_clauses$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 9096L)
    private static SubLSymbol $generalized_tactic_types$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 46722L)
    public static SubLSymbol $transformation_depth_computation$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 47173L)
    public static SubLSymbol $problem_min_transformation_depth_from_signature_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 52331L)
    public static SubLSymbol $max_problem_tactics$;
    private static final SubLSymbol $sym0$PROBLEM;
    private static final SubLSymbol $sym1$PROBLEM_P;
    private static final SubLInteger $int2$212;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_PROBLEM;
    private static final SubLSymbol $sym8$PROBLEM_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$PROB_SUID;
    private static final SubLSymbol $sym11$_CSETF_PROB_SUID;
    private static final SubLSymbol $sym12$PROB_STORE;
    private static final SubLSymbol $sym13$_CSETF_PROB_STORE;
    private static final SubLSymbol $sym14$PROB_QUERY;
    private static final SubLSymbol $sym15$_CSETF_PROB_QUERY;
    private static final SubLSymbol $sym16$PROB_FREE_HL_VARS;
    private static final SubLSymbol $sym17$_CSETF_PROB_FREE_HL_VARS;
    private static final SubLSymbol $sym18$PROB_STATUS;
    private static final SubLSymbol $sym19$_CSETF_PROB_STATUS;
    private static final SubLSymbol $sym20$PROB_DEPENDENT_LINKS;
    private static final SubLSymbol $sym21$_CSETF_PROB_DEPENDENT_LINKS;
    private static final SubLSymbol $sym22$PROB_ARGUMENT_LINKS;
    private static final SubLSymbol $sym23$_CSETF_PROB_ARGUMENT_LINKS;
    private static final SubLSymbol $sym24$PROB_TACTICS;
    private static final SubLSymbol $sym25$_CSETF_PROB_TACTICS;
    private static final SubLSymbol $sym26$PROB_PROOF_BINDINGS_INDEX;
    private static final SubLSymbol $sym27$_CSETF_PROB_PROOF_BINDINGS_INDEX;
    private static final SubLSymbol $sym28$PROB_ARGUMENT_LINK_BINDINGS_INDEX;
    private static final SubLSymbol $sym29$_CSETF_PROB_ARGUMENT_LINK_BINDINGS_INDEX;
    private static final SubLSymbol $sym30$PROB_BACKCHAIN_REQUIRED;
    private static final SubLSymbol $sym31$_CSETF_PROB_BACKCHAIN_REQUIRED;
    private static final SubLSymbol $sym32$PROB_MEMOIZATION_STATE;
    private static final SubLSymbol $sym33$_CSETF_PROB_MEMOIZATION_STATE;
    private static final SubLSymbol $kw34$SUID;
    private static final SubLSymbol $kw35$STORE;
    private static final SubLSymbol $kw36$QUERY;
    private static final SubLSymbol $kw37$FREE_HL_VARS;
    private static final SubLSymbol $kw38$STATUS;
    private static final SubLSymbol $kw39$DEPENDENT_LINKS;
    private static final SubLSymbol $kw40$ARGUMENT_LINKS;
    private static final SubLSymbol $kw41$TACTICS;
    private static final SubLSymbol $kw42$PROOF_BINDINGS_INDEX;
    private static final SubLSymbol $kw43$ARGUMENT_LINK_BINDINGS_INDEX;
    private static final SubLSymbol $kw44$BACKCHAIN_REQUIRED;
    private static final SubLSymbol $kw45$MEMOIZATION_STATE;
    private static final SubLString $str46$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw47$BEGIN;
    private static final SubLSymbol $sym48$MAKE_PROBLEM;
    private static final SubLSymbol $kw49$SLOT;
    private static final SubLSymbol $kw50$END;
    private static final SubLSymbol $sym51$VISIT_DEFSTRUCT_OBJECT_PROBLEM_METHOD;
    private static final SubLSymbol $kw52$FREE;
    private static final SubLString $str53$_Invalid_PROBLEM__s_;
    private static final SubLString $str54$__a_PROBLEM__a__a__s_a_;
    private static final SubLString $str55$_free_;
    private static final SubLSymbol $sym56$VARIABLE_ID;
    private static final SubLString $str57$;
    private static final SubLSymbol $sym58$SXHASH_PROBLEM_METHOD;
    private static final SubLSymbol $sym59$PROBLEM_STORE_P;
    private static final SubLSymbol $sym60$CONTEXTUALIZED_DNF_CLAUSES_P;
    private static final SubLString $str61$Ignore_the_crazy_problems;
    private static final SubLString $str62$Crazy_amount_of_problems___a__in_;
    private static final SubLSymbol $kw63$NEW;
    private static final SubLSymbol $kw64$UNDETERMINED;
    private static final SubLString $str65$problem_memoization_state;
    private static final SubLSymbol $sym66$_EMPTY_CLAUSES_;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$WITH_MEMOIZATION_STATE;
    private static final SubLSymbol $sym69$PROBLEM_MEMOIZATION_STATE;
    private static final SubLSymbol $sym70$WITH_PROBLEM_MEMOIZATION_STATE;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLSymbol $kw73$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw74$DONE;
    private static final SubLSymbol $sym75$DO_PROBLEM_QUERY_LITERALS;
    private static final SubLSymbol $sym76$PROBLEM_QUERY;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLSymbol $kw79$COMPLETENESS;
    private static final SubLSymbol $kw80$PREFERENCE_LEVEL;
    private static final SubLSymbol $kw81$HL_MODULE;
    private static final SubLSymbol $kw82$TYPE;
    private static final SubLSymbol $kw83$PRODUCTIVITY;
    private static final SubLSymbol $sym84$DO_PROBLEM_TACTICS_TYPE_MATCH;
    private static final SubLSymbol $sym85$DO_PROBLEM_TACTICS_STATUS_MATCH;
    private static final SubLSymbol $sym86$DO_PROBLEM_TACTICS_COMPLETENESS_MATCH;
    private static final SubLSymbol $sym87$DO_PROBLEM_TACTICS_PREFERENCE_LEVEL_MATCH;
    private static final SubLSymbol $sym88$DO_PROBLEM_TACTICS_HL_MODULE_MATCH;
    private static final SubLSymbol $sym89$DO_PROBLEM_TACTICS_PRODUCTIVITY_MATCH;
    private static final SubLSymbol $sym90$DO_LIST;
    private static final SubLSymbol $sym91$PROBLEM_TACTICS;
    private static final SubLSymbol $sym92$DO_PROBLEM_TACTICS;
    private static final SubLSymbol $sym93$PWHEN;
    private static final SubLSymbol $sym94$CAND;
    private static final SubLSymbol $sym95$COMPLETENESS_P;
    private static final SubLSymbol $sym96$PREFERENCE_LEVEL_P;
    private static final SubLSymbol $sym97$PRODUCTIVITY_P;
    private static final SubLSymbol $sym98$HL_MODULE_P;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$GENERALIZED_TACTIC_TYPE_P;
    private static final SubLSymbol $kw101$NON_TRANSFORMATION;
    private static final SubLSymbol $kw102$GENERALIZED_REMOVAL;
    private static final SubLSymbol $kw103$GENERALIZED_REMOVAL_OR_REWRITE;
    private static final SubLSymbol $kw104$CONNECTED_CONJUNCTION;
    private static final SubLSymbol $kw105$CONJUNCTIVE;
    private static final SubLSymbol $kw106$DISJUNCTIVE;
    private static final SubLSymbol $kw107$LOGICAL;
    private static final SubLSymbol $kw108$LOGICAL_CONJUNCTIVE;
    private static final SubLSymbol $kw109$STRUCTURAL_CONJUNCTIVE;
    private static final SubLSymbol $kw110$META_STRUCTURAL;
    private static final SubLSymbol $kw111$CONTENT;
    private static final SubLSymbol $kw112$UNION;
    private static final SubLSymbol $kw113$SPLIT;
    private static final SubLSymbol $kw114$JOIN_ORDERED;
    private static final SubLSymbol $kw115$JOIN;
    private static final SubLSymbol $sym116$PROBLEM_ARGUMENT_LINKS;
    private static final SubLSymbol $sym117$DO_PROBLEM_ARGUMENT_LINKS;
    private static final SubLList $list118;
    private static final SubLList $list119;
    private static final SubLSymbol $sym120$DO_SET_CONTENTS;
    private static final SubLSymbol $sym121$PROBLEM_DEPENDENT_LINKS;
    private static final SubLSymbol $sym122$DO_PROBLEM_DEPENDENT_LINKS;
    private static final SubLSymbol $sym123$PROBLEM_LINK_HAS_TYPE_;
    private static final SubLList $list124;
    private static final SubLList $list125;
    private static final SubLSymbol $kw126$OPEN_;
    private static final SubLSymbol $sym127$PROBLEM_VAR;
    private static final SubLSymbol $sym128$CLET;
    private static final SubLSymbol $sym129$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS;
    private static final SubLSymbol $sym130$MAPPED_PROBLEM_PROBLEM;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$LINK;
    private static final SubLSymbol $sym133$PROBLEM_LINK_SUPPORTED_PROBLEM;
    private static final SubLList $list134;
    private static final SubLSymbol $sym135$LINK;
    private static final SubLSymbol $sym136$PROBLEM_LINK_SUPPORTED_INFERENCE;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$LINK;
    private static final SubLSymbol $sym139$DO_PROBLEM_LINK_SUPPORTING_PROBLEMS;
    private static final SubLList $list140;
    private static final SubLList $list141;
    private static final SubLSymbol $kw142$PROOF_STATUS;
    private static final SubLSymbol $sym143$PROOF_LIST;
    private static final SubLSymbol $sym144$BINDINGS;
    private static final SubLSymbol $sym145$DO_DICTIONARY_CONTENTS;
    private static final SubLSymbol $sym146$PROBLEM_PROOF_BINDINGS_INDEX;
    private static final SubLSymbol $sym147$IGNORE;
    private static final SubLSymbol $sym148$STATUS_VAR;
    private static final SubLSymbol $sym149$DO_PROBLEM_PROOFS;
    private static final SubLSymbol $sym150$PROOF_HAS_STATUS_;
    private static final SubLList $list151;
    private static final SubLSymbol $sym152$STRATEGY;
    private static final SubLSymbol $sym153$DO_PROBLEM_ACTIVE_STRATEGIES;
    private static final SubLSymbol $sym154$STRATEGY_INFERENCE;
    private static final SubLList $list155;
    private static final SubLSymbol $sym156$STORE;
    private static final SubLSymbol $sym157$PROB;
    private static final SubLSymbol $sym158$PROBLEM_STORE;
    private static final SubLSymbol $sym159$DO_PROBLEM_STORE_INFERENCES;
    private static final SubLSymbol $sym160$PROBLEM_RELEVANT_TO_INFERENCE_;
    private static final SubLList $list161;
    private static final SubLSymbol $sym162$STORE;
    private static final SubLSymbol $sym163$PROB;
    private static final SubLSymbol $sym164$DO_PROBLEM_STORE_STRATEGIES;
    private static final SubLSymbol $sym165$PROBLEM_ACTIVE_IN_STRATEGY_;
    private static final SubLList $list166;
    private static final SubLSymbol $sym167$INFERENCE;
    private static final SubLSymbol $sym168$DO_PROBLEM_RELEVANT_INFERENCES;
    private static final SubLSymbol $sym169$DO_INFERENCE_STRATEGIES;
    private static final SubLList $list170;
    private static final SubLSymbol $sym171$PROGN;
    private static final SubLList $list172;
    private static final SubLSymbol $sym173$DO_PROBLEM_RELEVANT_STRATEGIES;
    private static final SubLSymbol $kw174$SKIP;
    private static final SubLSymbol $sym175$PROBLEM_STATUS_P;
    private static final SubLString $str176$poking_good_status__s_into_proble;
    private static final SubLSymbol $kw177$NEG;
    private static final SubLList $list178;
    private static final SubLSymbol $kw179$POS;
    private static final SubLObject $const180$ist;
    private static final SubLObject $const181$InferencePSC;
    private static final SubLString $str182$The_problem__S_did_not_have_a_sin;
    private static final SubLList $list183;
    private static final SubLString $str184$Found_more_than_one__a_argument_l;
    private static final SubLString $str185$Expected__a_to_have_a__a_argument;
    private static final SubLSymbol $sym186$PROBLEM_LINK_TYPE_P;
    private static final SubLSymbol $sym187$_;
    private static final SubLSymbol $sym188$PROBLEM_SUID;
    private static final SubLString $str189$_a_had_more_than_one_dependent_li;
    private static final SubLString $str190$_a_had_no_dependent_links;
    private static final SubLSymbol $kw191$ANSWER;
    private static final SubLSymbol $kw192$TRANSFORMATION;
    private static final SubLSymbol $sym193$TACTIC_POSSIBLE_;
    private static final SubLSymbol $sym194$TACTIC_EXECUTED_;
    private static final SubLSymbol $sym195$TACTIC_DISCARDED_;
    private static final SubLSymbol $kw196$POSSIBLE;
    private static final SubLSymbol $kw197$EXECUTED;
    private static final SubLSymbol $kw198$DISCARDED;
    private static final SubLSymbol $sym199$TACTIC_STATUS_P;
    private static final SubLSymbol $sym200$STRATEGIC_CONTEXT_P;
    private static final SubLSymbol $kw201$REMOVAL;
    private static final SubLSymbol $sym202$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_;
    private static final SubLSymbol $kw203$REJECTED;
    private static final SubLSymbol $kw204$PROVEN;
    private static final SubLSymbol $kw205$INDESTRUCTIBLE;
    private static final SubLSymbol $kw206$DESTRUCTIBLE;
    private static final SubLSymbol $kw207$UNKNOWN;
    private static final SubLSymbol $kw208$COUNTERINTUITIVE;
    private static final SubLSymbol $kw209$INTUITIVE;
    private static final SubLSymbol $sym210$_EXIT;
    private static final SubLSymbol $sym211$PROBLEM_LINK_P;
    private static final SubLInteger $int212$10000;
    private static final SubLSymbol $sym213$TACTIC_P;
    private static final SubLString $str214$Tried_to_add__s_to__s__which_woul;
    private static final SubLSymbol $sym215$PROOF_P;
    private static final SubLSymbol $sym216$BINDINGS_P;
    private static final SubLSymbol $sym217$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym218$INFERENCE_P;
    private static final SubLSymbol $sym219$PROBLEM_QUERY_DEPTH_SIGNATURE_P;
    private static final SubLSymbol $sym220$_;
    private static final SubLSymbol $sym221$CDR;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject problem_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_problem(v_object, stream, (SubLObject)inference_datastructures_problem.ZERO_INTEGER);
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject problem_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $problem_native.class) ? inference_datastructures_problem.T : inference_datastructures_problem.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject prob_suid(final SubLObject v_object) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject prob_store(final SubLObject v_object) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject prob_query(final SubLObject v_object) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject prob_free_hl_vars(final SubLObject v_object) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject prob_status(final SubLObject v_object) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject prob_dependent_links(final SubLObject v_object) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject prob_argument_links(final SubLObject v_object) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject prob_tactics(final SubLObject v_object) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject prob_proof_bindings_index(final SubLObject v_object) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject prob_argument_link_bindings_index(final SubLObject v_object) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject prob_backchain_required(final SubLObject v_object) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject prob_memoization_state(final SubLObject v_object) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject _csetf_prob_suid(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject _csetf_prob_store(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject _csetf_prob_query(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject _csetf_prob_free_hl_vars(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject _csetf_prob_status(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject _csetf_prob_dependent_links(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject _csetf_prob_argument_links(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject _csetf_prob_tactics(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject _csetf_prob_proof_bindings_index(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject _csetf_prob_argument_link_bindings_index(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject _csetf_prob_backchain_required(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject _csetf_prob_memoization_state(final SubLObject v_object, final SubLObject value) {
        assert inference_datastructures_problem.NIL != problem_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject make_problem(SubLObject arglist) {
        if (arglist == inference_datastructures_problem.UNPROVIDED) {
            arglist = (SubLObject)inference_datastructures_problem.NIL;
        }
        final SubLObject v_new = (SubLObject)new $problem_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inference_datastructures_problem.NIL, next = arglist; inference_datastructures_problem.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inference_datastructures_problem.$kw34$SUID)) {
                _csetf_prob_suid(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem.$kw35$STORE)) {
                _csetf_prob_store(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem.$kw36$QUERY)) {
                _csetf_prob_query(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem.$kw37$FREE_HL_VARS)) {
                _csetf_prob_free_hl_vars(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem.$kw38$STATUS)) {
                _csetf_prob_status(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem.$kw39$DEPENDENT_LINKS)) {
                _csetf_prob_dependent_links(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem.$kw40$ARGUMENT_LINKS)) {
                _csetf_prob_argument_links(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem.$kw41$TACTICS)) {
                _csetf_prob_tactics(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem.$kw42$PROOF_BINDINGS_INDEX)) {
                _csetf_prob_proof_bindings_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem.$kw43$ARGUMENT_LINK_BINDINGS_INDEX)) {
                _csetf_prob_argument_link_bindings_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem.$kw44$BACKCHAIN_REQUIRED)) {
                _csetf_prob_backchain_required(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_datastructures_problem.$kw45$MEMOIZATION_STATE)) {
                _csetf_prob_memoization_state(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inference_datastructures_problem.$str46$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject visit_defstruct_problem(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem.$kw47$BEGIN, (SubLObject)inference_datastructures_problem.$sym48$MAKE_PROBLEM, (SubLObject)inference_datastructures_problem.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem.$kw49$SLOT, (SubLObject)inference_datastructures_problem.$kw34$SUID, prob_suid(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem.$kw49$SLOT, (SubLObject)inference_datastructures_problem.$kw35$STORE, prob_store(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem.$kw49$SLOT, (SubLObject)inference_datastructures_problem.$kw36$QUERY, prob_query(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem.$kw49$SLOT, (SubLObject)inference_datastructures_problem.$kw37$FREE_HL_VARS, prob_free_hl_vars(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem.$kw49$SLOT, (SubLObject)inference_datastructures_problem.$kw38$STATUS, prob_status(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem.$kw49$SLOT, (SubLObject)inference_datastructures_problem.$kw39$DEPENDENT_LINKS, prob_dependent_links(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem.$kw49$SLOT, (SubLObject)inference_datastructures_problem.$kw40$ARGUMENT_LINKS, prob_argument_links(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem.$kw49$SLOT, (SubLObject)inference_datastructures_problem.$kw41$TACTICS, prob_tactics(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem.$kw49$SLOT, (SubLObject)inference_datastructures_problem.$kw42$PROOF_BINDINGS_INDEX, prob_proof_bindings_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem.$kw49$SLOT, (SubLObject)inference_datastructures_problem.$kw43$ARGUMENT_LINK_BINDINGS_INDEX, prob_argument_link_bindings_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem.$kw49$SLOT, (SubLObject)inference_datastructures_problem.$kw44$BACKCHAIN_REQUIRED, prob_backchain_required(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem.$kw49$SLOT, (SubLObject)inference_datastructures_problem.$kw45$MEMOIZATION_STATE, prob_memoization_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_datastructures_problem.$kw50$END, (SubLObject)inference_datastructures_problem.$sym48$MAKE_PROBLEM, (SubLObject)inference_datastructures_problem.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1256L)
    public static SubLObject visit_defstruct_object_problem_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_problem(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 2970L)
    public static SubLObject valid_problem_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != problem_p(v_object) && inference_datastructures_problem.NIL == problem_invalid_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 3089L)
    public static SubLObject problem_invalid_p(final SubLObject problem) {
        return Equality.eq((SubLObject)inference_datastructures_problem.$kw52$FREE, problem_status(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 3215L)
    public static SubLObject print_problem(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        if (inference_datastructures_problem.NIL != problem_invalid_p(v_object)) {
            PrintLow.format(stream, (SubLObject)inference_datastructures_problem.$str53$_Invalid_PROBLEM__s_, prob_suid(v_object));
        }
        else {
            PrintLow.format(stream, (SubLObject)inference_datastructures_problem.$str54$__a_PROBLEM__a__a__s_a_, new SubLObject[] { problem_status(v_object), inference_datastructures_problem_store.problem_store_suid(problem_store(v_object)), problem_suid(v_object), problem_query(v_object), (inference_datastructures_problem.NIL != problem_free_hl_vars(v_object)) ? Sequences.cconcatenate((SubLObject)inference_datastructures_problem.$str55$_free_, format_nil.format_nil_a_no_copy(Mapping.mapcar((SubLObject)inference_datastructures_problem.$sym56$VARIABLE_ID, problem_free_hl_vars(v_object)))) : inference_datastructures_problem.$str57$ });
        }
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 3737L)
    public static SubLObject sxhash_problem_method(final SubLObject v_object) {
        return prob_suid(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 3807L)
    public static SubLObject new_problem(final SubLObject store, final SubLObject query, SubLObject free_hl_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_datastructures_problem.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        enforceType(query, inference_datastructures_problem.$sym60$CONTEXTUALIZED_DNF_CLAUSES_P);
        if (inference_datastructures_problem.NIL == inference_datastructures_problem_store.problem_identity_depends_on_free_hl_varsP(store)) {
            free_hl_vars = (SubLObject)inference_datastructures_problem.NIL;
        }
        leviathan.note_new_problem_created();
        if (inference_datastructures_problem.NIL != control_vars.$inference_debugP$.getDynamicValue(thread) && inference_datastructures_problem.NIL != inference_datastructures_problem_store.problem_store_crazy_max_problem_count_exactly_reachedP(store)) {
            Errors.cerror((SubLObject)inference_datastructures_problem.$str61$Ignore_the_crazy_problems, (SubLObject)inference_datastructures_problem.$str62$Crazy_amount_of_problems___a__in_, inference_datastructures_problem_store.problem_store_problem_count(store), store);
        }
        final SubLObject problem = make_problem((SubLObject)inference_datastructures_problem.UNPROVIDED);
        final SubLObject suid = inference_datastructures_problem_store.problem_store_new_problem_id(store);
        inference_metrics.increment_problem_historical_count();
        if (inference_datastructures_problem.NIL != inference_datastructures_problem_query.problem_query_has_single_literal_p(query)) {
            inference_metrics.increment_single_literal_problem_historical_count();
        }
        _csetf_prob_suid(problem, suid);
        _csetf_prob_store(problem, store);
        _csetf_prob_query(problem, query);
        _csetf_prob_free_hl_vars(problem, free_hl_vars);
        set_problem_status(problem, (SubLObject)inference_datastructures_problem.$kw63$NEW);
        _csetf_prob_argument_links(problem, set_contents.new_set_contents((SubLObject)inference_datastructures_problem.ZERO_INTEGER, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ)));
        _csetf_prob_dependent_links(problem, set_contents.new_set_contents((SubLObject)inference_datastructures_problem.ZERO_INTEGER, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ)));
        _csetf_prob_tactics(problem, (SubLObject)inference_datastructures_problem.NIL);
        _csetf_prob_proof_bindings_index(problem, dictionary_contents.new_dictionary_contents((SubLObject)inference_datastructures_problem.ZERO_INTEGER, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL)));
        _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.new_dictionary_contents((SubLObject)inference_datastructures_problem.ZERO_INTEGER, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL)));
        _csetf_prob_backchain_required(problem, (SubLObject)inference_datastructures_problem.$kw64$UNDETERMINED);
        _csetf_prob_memoization_state(problem, memoization_state.new_memoization_state((SubLObject)inference_datastructures_problem.$str65$problem_memoization_state, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED));
        inference_datastructures_problem_store.add_problem_store_problem(store, problem);
        inference_worker.note_problem_created(problem);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 5586L)
    public static SubLObject with_problem_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list67);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list67);
        problem = current.first();
        current = current.rest();
        if (inference_datastructures_problem.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym68$WITH_MEMOIZATION_STATE, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym69$PROBLEM_MEMOIZATION_STATE, problem)), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list67);
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 5756L)
    public static SubLObject problem_memoization_state(final SubLObject problem) {
        return prob_memoization_state(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 5932L)
    public static SubLObject do_problem_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list71);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject mt_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject sense_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list71);
        asent_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list71);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list71);
        sense_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list71);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject current_$1 = (SubLObject)inference_datastructures_problem.NIL;
        while (inference_datastructures_problem.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list71);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list71);
            if (inference_datastructures_problem.NIL == conses_high.member(current_$1, (SubLObject)inference_datastructures_problem.$list72, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_problem.T;
            }
            if (current_$1 == inference_datastructures_problem.$kw73$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_problem.NIL != bad && inference_datastructures_problem.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list71);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw74$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_problem.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_problem.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym75$DO_PROBLEM_QUERY_LITERALS, (SubLObject)ConsesLow.list(asent_var, mt_var, sense_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym76$PROBLEM_QUERY, problem), (SubLObject)inference_datastructures_problem.$kw74$DONE, done), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 6164L)
    public static SubLObject do_problem_tactics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list77);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tactic_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list77);
        tactic_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list77);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject current_$2 = (SubLObject)inference_datastructures_problem.NIL;
        while (inference_datastructures_problem.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list77);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list77);
            if (inference_datastructures_problem.NIL == conses_high.member(current_$2, (SubLObject)inference_datastructures_problem.$list78, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_problem.T;
            }
            if (current_$2 == inference_datastructures_problem.$kw73$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_problem.NIL != bad && inference_datastructures_problem.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list77);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw74$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_problem.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_problem.NIL);
        final SubLObject status_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw38$STATUS, current);
        final SubLObject status = (SubLObject)((inference_datastructures_problem.NIL != status_tail) ? conses_high.cadr(status_tail) : inference_datastructures_problem.NIL);
        final SubLObject completeness_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw79$COMPLETENESS, current);
        final SubLObject completeness = (SubLObject)((inference_datastructures_problem.NIL != completeness_tail) ? conses_high.cadr(completeness_tail) : inference_datastructures_problem.NIL);
        final SubLObject preference_level_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw80$PREFERENCE_LEVEL, current);
        final SubLObject preference_level = (SubLObject)((inference_datastructures_problem.NIL != preference_level_tail) ? conses_high.cadr(preference_level_tail) : inference_datastructures_problem.NIL);
        final SubLObject hl_module_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw81$HL_MODULE, current);
        final SubLObject hl_module = (SubLObject)((inference_datastructures_problem.NIL != hl_module_tail) ? conses_high.cadr(hl_module_tail) : inference_datastructures_problem.NIL);
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw82$TYPE, current);
        final SubLObject type = (SubLObject)((inference_datastructures_problem.NIL != type_tail) ? conses_high.cadr(type_tail) : inference_datastructures_problem.NIL);
        final SubLObject productivity_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw83$PRODUCTIVITY, current);
        final SubLObject productivity = (SubLObject)((inference_datastructures_problem.NIL != productivity_tail) ? conses_high.cadr(productivity_tail) : inference_datastructures_problem.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject filter_forms = (SubLObject)inference_datastructures_problem.NIL;
        if (inference_datastructures_problem.NIL != type) {
            filter_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym84$DO_PROBLEM_TACTICS_TYPE_MATCH, tactic_var, type), filter_forms);
        }
        if (inference_datastructures_problem.NIL != status) {
            filter_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym85$DO_PROBLEM_TACTICS_STATUS_MATCH, tactic_var, status), filter_forms);
        }
        if (inference_datastructures_problem.NIL != completeness) {
            filter_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym86$DO_PROBLEM_TACTICS_COMPLETENESS_MATCH, tactic_var, completeness), filter_forms);
        }
        if (inference_datastructures_problem.NIL != preference_level) {
            filter_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym87$DO_PROBLEM_TACTICS_PREFERENCE_LEVEL_MATCH, tactic_var, preference_level), filter_forms);
        }
        if (inference_datastructures_problem.NIL != hl_module) {
            filter_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym88$DO_PROBLEM_TACTICS_HL_MODULE_MATCH, tactic_var, hl_module), filter_forms);
        }
        if (inference_datastructures_problem.NIL != productivity) {
            filter_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym89$DO_PROBLEM_TACTICS_PRODUCTIVITY_MATCH, tactic_var, productivity), filter_forms);
        }
        filter_forms = Sequences.nreverse(filter_forms);
        if (inference_datastructures_problem.NIL == filter_forms) {
            return (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym90$DO_LIST, (SubLObject)ConsesLow.list(tactic_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym91$PROBLEM_TACTICS, problem), (SubLObject)inference_datastructures_problem.$kw74$DONE, done), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL));
        }
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym92$DO_PROBLEM_TACTICS, (SubLObject)ConsesLow.list(tactic_var, problem, (SubLObject)inference_datastructures_problem.$kw74$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym93$PWHEN, (inference_datastructures_problem.NIL != list_utilities.singletonP(filter_forms)) ? filter_forms.first() : reader.bq_cons((SubLObject)inference_datastructures_problem.$sym94$CAND, ConsesLow.append(filter_forms, (SubLObject)inference_datastructures_problem.NIL)), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 7409L)
    public static SubLObject problem_tactics(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        return prob_tactics(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 7552L)
    public static SubLObject do_problem_tactics_status_match(final SubLObject tactic, final SubLObject status_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL == status_spec || inference_datastructures_problem.NIL != inference_datastructures_tactic.tactic_has_statusP(tactic, status_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 7736L)
    public static SubLObject do_problem_tactics_completeness_match(final SubLObject tactic, final SubLObject completeness_spec) {
        if (inference_datastructures_problem.NIL == completeness_spec) {
            return (SubLObject)inference_datastructures_problem.T;
        }
        assert inference_datastructures_problem.NIL != inference_datastructures_enumerated_types.completeness_p(completeness_spec) : completeness_spec;
        return Equality.eq(completeness_spec, inference_datastructures_tactic.tactic_completeness(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 8075L)
    public static SubLObject do_problem_tactics_preference_level_match(final SubLObject tactic, final SubLObject preference_level_spec) {
        if (inference_datastructures_problem.NIL == preference_level_spec) {
            return (SubLObject)inference_datastructures_problem.T;
        }
        assert inference_datastructures_problem.NIL != preference_modules.preference_level_p(preference_level_spec) : preference_level_spec;
        return Equality.eq(preference_level_spec, inference_datastructures_tactic.tactic_preference_level(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 8435L)
    public static SubLObject do_problem_tactics_productivity_match(final SubLObject tactic, final SubLObject productivity_spec) {
        if (inference_datastructures_problem.NIL == productivity_spec) {
            return (SubLObject)inference_datastructures_problem.T;
        }
        assert inference_datastructures_problem.NIL != inference_datastructures_enumerated_types.productivity_p(productivity_spec) : productivity_spec;
        return inference_datastructures_enumerated_types.productivity_E(productivity_spec, inference_datastructures_tactic.tactic_productivity(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 8779L)
    public static SubLObject do_problem_tactics_hl_module_match(final SubLObject tactic, final SubLObject hl_module_spec) {
        if (inference_datastructures_problem.NIL == hl_module_spec) {
            return (SubLObject)inference_datastructures_problem.T;
        }
        assert inference_datastructures_problem.NIL != inference_modules.hl_module_p(hl_module_spec) : hl_module_spec;
        return Equality.eq(hl_module_spec, inference_datastructures_tactic.tactic_hl_module(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 9569L)
    public static SubLObject generalized_tactic_type_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != inference_datastructures_enumerated_types.tactic_type_p(v_object) || inference_datastructures_problem.NIL != list_utilities.member_eqP(v_object, inference_datastructures_problem.$generalized_tactic_types$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 9795L)
    public static SubLObject do_problem_tactics_type_match(final SubLObject tactic, final SubLObject type_spec) {
        return tactic_matches_type_specP(tactic, type_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 9950L)
    public static SubLObject tactic_matches_type_specP(final SubLObject tactic, final SubLObject type_spec) {
        if (inference_datastructures_problem.NIL == type_spec) {
            return (SubLObject)inference_datastructures_problem.T;
        }
        assert inference_datastructures_problem.NIL != generalized_tactic_type_p(type_spec) : type_spec;
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw101$NON_TRANSFORMATION)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL == inference_worker_transformation.transformation_tactic_p(tactic));
        }
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw102$GENERALIZED_REMOVAL)) {
            return inference_worker_removal.generalized_removal_tactic_p(tactic);
        }
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw103$GENERALIZED_REMOVAL_OR_REWRITE)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != inference_worker_removal.generalized_removal_tactic_p(tactic) || inference_datastructures_problem.NIL != inference_worker_rewrite.rewrite_tactic_p(tactic));
        }
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw104$CONNECTED_CONJUNCTION)) {
            return inference_worker.connected_conjunction_tactic_p(tactic);
        }
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw105$CONJUNCTIVE)) {
            return inference_worker.conjunctive_tactic_p(tactic);
        }
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw106$DISJUNCTIVE)) {
            return inference_worker.disjunctive_tactic_p(tactic);
        }
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw107$LOGICAL)) {
            return inference_worker.logical_tactic_p(tactic);
        }
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw108$LOGICAL_CONJUNCTIVE)) {
            return inference_worker.logical_conjunctive_tactic_p(tactic);
        }
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw109$STRUCTURAL_CONJUNCTIVE)) {
            return inference_worker.logical_conjunctive_tactic_p(tactic);
        }
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw110$META_STRUCTURAL)) {
            return inference_worker.meta_structural_tactic_p(tactic);
        }
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw111$CONTENT)) {
            return inference_worker.content_tactic_p(tactic);
        }
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw112$UNION)) {
            return inference_worker_union.union_tactic_p(tactic);
        }
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw113$SPLIT)) {
            return inference_worker_split.split_tactic_p(tactic);
        }
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw114$JOIN_ORDERED)) {
            return inference_worker_join_ordered.join_ordered_tactic_p(tactic);
        }
        if (type_spec.eql((SubLObject)inference_datastructures_problem.$kw115$JOIN)) {
            return inference_worker_join.join_tactic_p(tactic);
        }
        return Equality.eq(type_spec, inference_datastructures_tactic.tactic_type(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 11429L)
    public static SubLObject tactic_matches_any_of_type_specsP(final SubLObject tactic, final SubLObject type_specs) {
        SubLObject cdolist_list_var = type_specs;
        SubLObject type_spec = (SubLObject)inference_datastructures_problem.NIL;
        type_spec = cdolist_list_var.first();
        while (inference_datastructures_problem.NIL != cdolist_list_var) {
            if (inference_datastructures_problem.NIL != tactic_matches_type_specP(tactic, type_spec)) {
                return (SubLObject)inference_datastructures_problem.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            type_spec = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 11621L)
    public static SubLObject problem_argument_links(final SubLObject problem) {
        return prob_argument_links(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 11752L)
    public static SubLObject problem_all_argument_links(final SubLObject problem) {
        return set_contents.set_contents_element_list(prob_argument_links(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 11875L)
    public static SubLObject do_problem_dependent_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list118);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list118);
        link_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list118);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject current_$3 = (SubLObject)inference_datastructures_problem.NIL;
        while (inference_datastructures_problem.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list118);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list118);
            if (inference_datastructures_problem.NIL == conses_high.member(current_$3, (SubLObject)inference_datastructures_problem.$list119, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_problem.T;
            }
            if (current_$3 == inference_datastructures_problem.$kw73$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_problem.NIL != bad && inference_datastructures_problem.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list118);
        }
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw82$TYPE, current);
        final SubLObject type = (SubLObject)((inference_datastructures_problem.NIL != type_tail) ? conses_high.cadr(type_tail) : inference_datastructures_problem.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw74$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_problem.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_problem.NIL);
        final SubLObject body;
        current = (body = temp);
        if (inference_datastructures_problem.NIL == type) {
            return (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym120$DO_SET_CONTENTS, (SubLObject)ConsesLow.list(link_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym121$PROBLEM_DEPENDENT_LINKS, problem), (SubLObject)inference_datastructures_problem.$kw74$DONE, done), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL));
        }
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym122$DO_PROBLEM_DEPENDENT_LINKS, (SubLObject)ConsesLow.list(link_var, problem, (SubLObject)inference_datastructures_problem.$kw74$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym93$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym123$PROBLEM_LINK_HAS_TYPE_, link_var, type), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 12240L)
    public static SubLObject problem_dependent_links(final SubLObject problem) {
        return prob_dependent_links(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 12374L)
    public static SubLObject problem_all_dependent_links(final SubLObject problem) {
        return set_contents.set_contents_element_list(problem_dependent_links(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 12502L)
    public static SubLObject do_problem_dependent_link_interpretations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list124);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject mapped_problem_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list124);
        link_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list124);
        mapped_problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list124);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject current_$4 = (SubLObject)inference_datastructures_problem.NIL;
        while (inference_datastructures_problem.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list124);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list124);
            if (inference_datastructures_problem.NIL == conses_high.member(current_$4, (SubLObject)inference_datastructures_problem.$list125, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_problem.T;
            }
            if (current_$4 == inference_datastructures_problem.$kw73$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_problem.NIL != bad && inference_datastructures_problem.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list124);
        }
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw82$TYPE, current);
        final SubLObject type = (SubLObject)((inference_datastructures_problem.NIL != type_tail) ? conses_high.cadr(type_tail) : inference_datastructures_problem.NIL);
        final SubLObject openP_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw126$OPEN_, current);
        final SubLObject openP = (SubLObject)((inference_datastructures_problem.NIL != openP_tail) ? conses_high.cadr(openP_tail) : inference_datastructures_problem.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw74$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_problem.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_problem.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject problem_var = (SubLObject)inference_datastructures_problem.$sym127$PROBLEM_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym128$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(problem_var, problem)), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym122$DO_PROBLEM_DEPENDENT_LINKS, (SubLObject)ConsesLow.list(link_var, problem, (SubLObject)inference_datastructures_problem.$kw82$TYPE, type, (SubLObject)inference_datastructures_problem.$kw74$DONE, done), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym129$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, (SubLObject)ConsesLow.list(mapped_problem_var, link_var, (SubLObject)inference_datastructures_problem.$kw126$OPEN_, openP, (SubLObject)inference_datastructures_problem.$kw74$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym93$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.EQ, problem_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym130$MAPPED_PROBLEM_PROBLEM, mapped_problem_var)), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 13218L)
    public static SubLObject do_problem_supported_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list131);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supported_problem_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list131);
        supported_problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list131);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject current_$5 = (SubLObject)inference_datastructures_problem.NIL;
        while (inference_datastructures_problem.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list131);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list131);
            if (inference_datastructures_problem.NIL == conses_high.member(current_$5, (SubLObject)inference_datastructures_problem.$list72, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_problem.T;
            }
            if (current_$5 == inference_datastructures_problem.$kw73$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_problem.NIL != bad && inference_datastructures_problem.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list131);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw74$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_problem.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_problem.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject link = (SubLObject)inference_datastructures_problem.$sym132$LINK;
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym122$DO_PROBLEM_DEPENDENT_LINKS, (SubLObject)ConsesLow.list(link, problem, (SubLObject)inference_datastructures_problem.$kw74$DONE, done), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym128$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(supported_problem_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym133$PROBLEM_LINK_SUPPORTED_PROBLEM, link))), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym93$PWHEN, supported_problem_var, ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 13659L)
    public static SubLObject do_problem_supported_inferences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list134);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supported_inference_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list134);
        supported_inference_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list134);
        problem = current.first();
        current = current.rest();
        if (inference_datastructures_problem.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject link = (SubLObject)inference_datastructures_problem.$sym135$LINK;
            return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym122$DO_PROBLEM_DEPENDENT_LINKS, (SubLObject)ConsesLow.list(link, problem), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym128$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(supported_inference_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym136$PROBLEM_LINK_SUPPORTED_INFERENCE, link))), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym93$PWHEN, supported_inference_var, ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list134);
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 14031L)
    public static SubLObject do_problem_supporting_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list137);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_problem_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject variable_map_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list137);
        supporting_problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list137);
        variable_map_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list137);
        problem = current.first();
        current = current.rest();
        if (inference_datastructures_problem.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject link = (SubLObject)inference_datastructures_problem.$sym138$LINK;
            return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym117$DO_PROBLEM_ARGUMENT_LINKS, (SubLObject)ConsesLow.list(link, problem), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym139$DO_PROBLEM_LINK_SUPPORTING_PROBLEMS, (SubLObject)ConsesLow.list(supporting_problem_var, variable_map_var, link), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list137);
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 14351L)
    public static SubLObject do_problem_proofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list140);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject proof_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list140);
        proof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list140);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject current_$6 = (SubLObject)inference_datastructures_problem.NIL;
        while (inference_datastructures_problem.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list140);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list140);
            if (inference_datastructures_problem.NIL == conses_high.member(current_$6, (SubLObject)inference_datastructures_problem.$list141, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_problem.T;
            }
            if (current_$6 == inference_datastructures_problem.$kw73$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_problem.NIL != bad && inference_datastructures_problem.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list140);
        }
        final SubLObject proof_status_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw142$PROOF_STATUS, current);
        final SubLObject proof_status = (SubLObject)((inference_datastructures_problem.NIL != proof_status_tail) ? conses_high.cadr(proof_status_tail) : inference_datastructures_problem.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw74$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_problem.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_problem.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject proof_list = (SubLObject)inference_datastructures_problem.$sym143$PROOF_LIST;
        final SubLObject v_bindings = (SubLObject)inference_datastructures_problem.$sym144$BINDINGS;
        if (inference_datastructures_problem.NIL == proof_status) {
            return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym145$DO_DICTIONARY_CONTENTS, (SubLObject)ConsesLow.list(v_bindings, proof_list, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym146$PROBLEM_PROOF_BINDINGS_INDEX, problem), (SubLObject)inference_datastructures_problem.$kw74$DONE, done), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym147$IGNORE, v_bindings), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym90$DO_LIST, (SubLObject)ConsesLow.list(proof_var, proof_list, (SubLObject)inference_datastructures_problem.$kw74$DONE, done), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL)));
        }
        final SubLObject status_var = (SubLObject)inference_datastructures_problem.$sym148$STATUS_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym128$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(status_var, proof_status)), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym149$DO_PROBLEM_PROOFS, (SubLObject)ConsesLow.list(proof_var, problem, (SubLObject)inference_datastructures_problem.$kw74$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym93$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym150$PROOF_HAS_STATUS_, proof_var, status_var), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 14926L)
    public static SubLObject problem_proof_bindings_index(final SubLObject problem) {
        return prob_proof_bindings_index(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 15061L)
    public static SubLObject proof_has_statusP(final SubLObject proof, final SubLObject status) {
        if (inference_datastructures_problem.NIL == status) {
            return (SubLObject)inference_datastructures_problem.T;
        }
        return Equality.eq(status, inference_datastructures_proof.proof_status(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 15337L)
    public static SubLObject do_problem_active_inferences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list151);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list151);
        inference_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list151);
        problem = current.first();
        current = current.rest();
        if (inference_datastructures_problem.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject strategy = (SubLObject)inference_datastructures_problem.$sym152$STRATEGY;
            return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym153$DO_PROBLEM_ACTIVE_STRATEGIES, (SubLObject)ConsesLow.list(strategy, problem), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym128$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(inference_var, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym154$STRATEGY_INFERENCE, strategy))), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list151);
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 15714L)
    public static SubLObject do_problem_relevant_inferences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list155);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list155);
        inference_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list155);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject current_$7 = (SubLObject)inference_datastructures_problem.NIL;
        while (inference_datastructures_problem.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list155);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list155);
            if (inference_datastructures_problem.NIL == conses_high.member(current_$7, (SubLObject)inference_datastructures_problem.$list72, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_problem.T;
            }
            if (current_$7 == inference_datastructures_problem.$kw73$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_problem.NIL != bad && inference_datastructures_problem.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list155);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw74$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_problem.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_problem.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject store = (SubLObject)inference_datastructures_problem.$sym156$STORE;
        final SubLObject prob = (SubLObject)inference_datastructures_problem.$sym157$PROB;
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym128$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(prob, problem), (SubLObject)ConsesLow.list(store, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym158$PROBLEM_STORE, prob))), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym159$DO_PROBLEM_STORE_INFERENCES, (SubLObject)ConsesLow.list(inference_var, store, (SubLObject)inference_datastructures_problem.$kw74$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym93$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym160$PROBLEM_RELEVANT_TO_INFERENCE_, prob, inference_var), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 16196L)
    public static SubLObject do_problem_active_strategies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list161);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list161);
        strategy_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list161);
        problem = current.first();
        current = current.rest();
        if (inference_datastructures_problem.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject store = (SubLObject)inference_datastructures_problem.$sym162$STORE;
            final SubLObject prob = (SubLObject)inference_datastructures_problem.$sym163$PROB;
            return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym128$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(prob, problem), (SubLObject)ConsesLow.list(store, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym158$PROBLEM_STORE, prob))), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym164$DO_PROBLEM_STORE_STRATEGIES, (SubLObject)ConsesLow.list(strategy_var, store), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym93$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym165$PROBLEM_ACTIVE_IN_STRATEGY_, prob, strategy_var), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list161);
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 16607L)
    public static SubLObject do_problem_relevant_strategies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list166);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list166);
        strategy_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list166);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject current_$8 = (SubLObject)inference_datastructures_problem.NIL;
        while (inference_datastructures_problem.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list166);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list166);
            if (inference_datastructures_problem.NIL == conses_high.member(current_$8, (SubLObject)inference_datastructures_problem.$list72, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_problem.T;
            }
            if (current_$8 == inference_datastructures_problem.$kw73$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_problem.NIL != bad && inference_datastructures_problem.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list166);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw74$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_problem.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_problem.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject inference = (SubLObject)inference_datastructures_problem.$sym167$INFERENCE;
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym168$DO_PROBLEM_RELEVANT_INFERENCES, (SubLObject)ConsesLow.list(inference, problem, (SubLObject)inference_datastructures_problem.$kw74$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym169$DO_INFERENCE_STRATEGIES, (SubLObject)ConsesLow.list(strategy_var, inference), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 17008L)
    public static SubLObject do_problem_relevant_strategic_contexts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list170);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategic_context_var = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject problem = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list170);
        strategic_context_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list170);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject current_$9 = (SubLObject)inference_datastructures_problem.NIL;
        while (inference_datastructures_problem.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list170);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem.$list170);
            if (inference_datastructures_problem.NIL == conses_high.member(current_$9, (SubLObject)inference_datastructures_problem.$list72, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_problem.T;
            }
            if (current_$9 == inference_datastructures_problem.$kw73$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_problem.NIL != bad && inference_datastructures_problem.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list170);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem.$kw74$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_problem.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_problem.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem.$sym171$PROGN, (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym128$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(strategic_context_var, (SubLObject)inference_datastructures_problem.$list172)), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL)), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem.$sym173$DO_PROBLEM_RELEVANT_STRATEGIES, (SubLObject)ConsesLow.list(strategic_context_var, problem, (SubLObject)inference_datastructures_problem.$kw74$DONE, done), ConsesLow.append(body, (SubLObject)inference_datastructures_problem.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 17294L)
    public static SubLObject destroy_problem(final SubLObject problem) {
        if (inference_datastructures_problem.NIL != valid_problem_p(problem)) {
            note_problem_invalid(problem);
            SubLObject set_contents_var = problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, argument_link) && inference_datastructures_problem.NIL != inference_datastructures_problem_link.valid_problem_link_p(argument_link)) {
                    inference_datastructures_problem_link.destroy_problem_link(argument_link);
                }
            }
            set_contents_var = problem_dependent_links(problem);
            SubLObject dependent_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                dependent_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                    if (inference_datastructures_problem.NIL != inference_worker_restriction.restriction_link_p(dependent_link)) {
                        inference_worker_join_ordered.note_all_triggering_proofs_processed(dependent_link);
                    }
                    if (inference_datastructures_problem.NIL != inference_datastructures_problem_link.valid_problem_link_p(dependent_link)) {
                        inference_datastructures_problem_link.destroy_problem_link(dependent_link);
                    }
                }
            }
            if (inference_datastructures_problem.NIL != problem_potentially_processedP(problem)) {
                inference_datastructures_problem_store.problem_store_note_problem_unprocessed(problem_store(problem), problem);
            }
            final SubLObject store = problem_store(problem);
            inference_datastructures_problem_store.remove_problem_store_problem(store, problem);
            final SubLObject store2 = problem_store(problem);
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store2);
            if (inference_datastructures_problem.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
                final SubLObject idx_$10 = idx;
                if (inference_datastructures_problem.NIL == id_index.id_index_dense_objects_empty_p(idx_$10, (SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$10);
                    final SubLObject backwardP_var = (SubLObject)inference_datastructures_problem.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    SubLObject inference_var;
                    SubLObject set_var;
                    SubLObject set_contents_var2;
                    SubLObject basis_object2;
                    SubLObject state2;
                    SubLObject strategy;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_datastructures_problem.NIL, v_iteration = (SubLObject)inference_datastructures_problem.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_datastructures_problem.ONE_INTEGER)) {
                        id = ((inference_datastructures_problem.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_datastructures_problem.ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (inference_datastructures_problem.NIL == id_index.id_index_tombstone_p(inference) || inference_datastructures_problem.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
                            if (inference_datastructures_problem.NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = (SubLObject)inference_datastructures_problem.$kw174$SKIP;
                            }
                            if (inference_datastructures_problem.NIL != problem_relevant_to_inferenceP(problem, inference)) {
                                inference_var = inference;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var2 = set.do_set_internal(set_var);
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_datastructures_problem.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state2, strategy)) {
                                        inference_datastructures_strategy.remove_strategy_problem(strategy, problem);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$11 = idx;
                if (inference_datastructures_problem.NIL == id_index.id_index_sparse_objects_empty_p(idx_$11)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$11);
                    SubLObject id2 = (SubLObject)inference_datastructures_problem.NIL;
                    SubLObject inference2 = (SubLObject)inference_datastructures_problem.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (inference_datastructures_problem.NIL != problem_relevant_to_inferenceP(problem, inference2)) {
                                final SubLObject inference_var2 = inference2;
                                final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                final SubLObject set_contents_var3 = set.do_set_internal(set_var2);
                                SubLObject basis_object3;
                                SubLObject state3;
                                SubLObject strategy2;
                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)inference_datastructures_problem.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object3, state3);
                                    if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state3, strategy2)) {
                                        inference_datastructures_strategy.remove_strategy_problem(strategy2, problem);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            return destroy_problem_int(problem);
        }
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 18273L)
    public static SubLObject destroy_problem_store_problem(final SubLObject problem) {
        if (inference_datastructures_problem.NIL != valid_problem_p(problem)) {
            note_problem_invalid(problem);
            return destroy_problem_int(problem);
        }
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 18444L)
    public static SubLObject destroy_problem_int(final SubLObject problem) {
        dictionary_contents.clear_dictionary_contents(prob_argument_link_bindings_index(problem));
        _csetf_prob_argument_link_bindings_index(problem, (SubLObject)inference_datastructures_problem.$kw52$FREE);
        dictionary_contents.clear_dictionary_contents(prob_proof_bindings_index(problem));
        _csetf_prob_proof_bindings_index(problem, (SubLObject)inference_datastructures_problem.$kw52$FREE);
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_datastructures_problem.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_problem.NIL != cdolist_list_var) {
            inference_datastructures_tactic.destroy_problem_tactic(tactic);
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        _csetf_prob_tactics(problem, (SubLObject)inference_datastructures_problem.$kw52$FREE);
        set_contents.clear_set_contents(prob_dependent_links(problem));
        _csetf_prob_dependent_links(problem, (SubLObject)inference_datastructures_problem.$kw52$FREE);
        set_contents.clear_set_contents(prob_argument_links(problem));
        _csetf_prob_argument_links(problem, (SubLObject)inference_datastructures_problem.$kw52$FREE);
        _csetf_prob_query(problem, (SubLObject)inference_datastructures_problem.$kw52$FREE);
        _csetf_prob_free_hl_vars(problem, (SubLObject)inference_datastructures_problem.$kw52$FREE);
        _csetf_prob_store(problem, (SubLObject)inference_datastructures_problem.$kw52$FREE);
        _csetf_prob_memoization_state(problem, (SubLObject)inference_datastructures_problem.$kw52$FREE);
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 19366L)
    public static SubLObject note_problem_invalid(final SubLObject problem) {
        _csetf_prob_status(problem, (SubLObject)inference_datastructures_problem.$kw52$FREE);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 19471L)
    public static SubLObject problem_suid(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        return prob_suid(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 19587L)
    public static SubLObject problem_store(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        return prob_store(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 19693L)
    public static SubLObject problem_query(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        return prob_query(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 19799L)
    public static SubLObject problem_free_hl_vars(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        return prob_free_hl_vars(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 19919L)
    public static SubLObject problem_status(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        return prob_status(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 20027L)
    public static SubLObject problem_dwimmed_status(final SubLObject problem) {
        final SubLObject status = problem_status(problem);
        if (inference_datastructures_problem.NIL != inference_worker.problem_goodP(problem)) {
            final SubLObject dwimmed_status = inference_worker.good_version_of_problem_status(status);
            return dwimmed_status;
        }
        return status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 20305L)
    public static SubLObject set_problem_free_hl_vars(final SubLObject problem, final SubLObject free_hl_vars) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        _csetf_prob_free_hl_vars(problem, free_hl_vars);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 20684L)
    public static SubLObject set_problem_status(final SubLObject problem, final SubLObject status) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != inference_datastructures_enumerated_types.problem_status_p(status) : status;
        if (inference_datastructures_problem.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_datastructures_problem.NIL != inference_datastructures_enumerated_types.good_problem_status_p(status)) {
            Errors.error((SubLObject)inference_datastructures_problem.$str176$poking_good_status__s_into_proble, status, problem);
        }
        _csetf_prob_status(problem, status);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21115L)
    public static SubLObject problem_formula(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        return inference_czer.problem_query_formula(problem_query(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21331L)
    public static SubLObject problem_el_formula(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        return inference_czer.problem_query_el_formula(problem_query(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21531L)
    public static SubLObject closed_problem_p(final SubLObject problem) {
        return closed_problem_query_p(problem_query(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21696L)
    public static SubLObject open_problem_p(final SubLObject problem) {
        return open_problem_query_p(problem_query(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21857L)
    public static SubLObject closed_problem_query_p(final SubLObject query) {
        return el_utilities.hl_ground_tree_p(query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21941L)
    public static SubLObject open_problem_query_p(final SubLObject query) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL == el_utilities.hl_ground_tree_p(query));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 22030L)
    public static SubLObject closed_single_literal_problem_query_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != inference_datastructures_problem_query.single_literal_problem_query_p(v_object) && inference_datastructures_problem.NIL != closed_problem_query_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 22190L)
    public static SubLObject open_single_literal_problem_query_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != inference_datastructures_problem_query.single_literal_problem_query_p(v_object) && inference_datastructures_problem.NIL == closed_problem_query_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 22355L)
    public static SubLObject problem_variables(final SubLObject problem) {
        return inference_datastructures_problem_query.problem_query_variables(problem_query(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 22461L)
    public static SubLObject problem_literal_count(final SubLObject problem, SubLObject sense) {
        if (sense == inference_datastructures_problem.UNPROVIDED) {
            sense = (SubLObject)inference_datastructures_problem.NIL;
        }
        final SubLObject query = problem_query(problem);
        return problem_query_literal_count(query, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 22625L)
    public static SubLObject problem_query_literal_count(final SubLObject query, SubLObject sense) {
        if (sense == inference_datastructures_problem.UNPROVIDED) {
            sense = (SubLObject)inference_datastructures_problem.NIL;
        }
        SubLObject count = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
        SubLObject cdolist_list_var = query;
        SubLObject contextualized_clause = (SubLObject)inference_datastructures_problem.NIL;
        contextualized_clause = cdolist_list_var.first();
        while (inference_datastructures_problem.NIL != cdolist_list_var) {
            SubLObject literal_sense = (SubLObject)inference_datastructures_problem.$kw177$NEG;
            SubLObject index_var = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
            SubLObject cdolist_list_var_$12 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = (SubLObject)inference_datastructures_problem.NIL;
            contextualized_asent = cdolist_list_var_$12.first();
            while (inference_datastructures_problem.NIL != cdolist_list_var_$12) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject asent = (SubLObject)inference_datastructures_problem.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list178);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list178);
                asent = current.first();
                current = current.rest();
                if (inference_datastructures_problem.NIL == current) {
                    if (inference_datastructures_problem.NIL == sense || sense.eql(literal_sense)) {
                        count = Numbers.add(count, (SubLObject)inference_datastructures_problem.ONE_INTEGER);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list178);
                }
                index_var = Numbers.add(index_var, (SubLObject)inference_datastructures_problem.ONE_INTEGER);
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                contextualized_asent = cdolist_list_var_$12.first();
            }
            literal_sense = (SubLObject)inference_datastructures_problem.$kw179$POS;
            index_var = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
            SubLObject cdolist_list_var_$13 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = (SubLObject)inference_datastructures_problem.NIL;
            contextualized_asent = cdolist_list_var_$13.first();
            while (inference_datastructures_problem.NIL != cdolist_list_var_$13) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject asent = (SubLObject)inference_datastructures_problem.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list178);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list178);
                asent = current.first();
                current = current.rest();
                if (inference_datastructures_problem.NIL == current) {
                    if (inference_datastructures_problem.NIL == sense || sense.eql(literal_sense)) {
                        count = Numbers.add(count, (SubLObject)inference_datastructures_problem.ONE_INTEGER);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list178);
                }
                index_var = Numbers.add(index_var, (SubLObject)inference_datastructures_problem.ONE_INTEGER);
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                contextualized_asent = cdolist_list_var_$13.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 22897L)
    public static SubLObject single_literal_problem_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != problem_p(v_object) && inference_datastructures_problem.NIL != inference_datastructures_problem_query.problem_query_has_single_literal_p(problem_query(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 23188L)
    public static SubLObject single_literal_problem_predicate(final SubLObject problem) {
        return inference_datastructures_problem_query.single_literal_problem_query_predicate(problem_query(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 23442L)
    public static SubLObject single_literal_problem_atomic_sentence(final SubLObject problem) {
        return inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence(problem_query(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 23590L)
    public static SubLObject single_literal_problem_mt(final SubLObject problem) {
        return inference_datastructures_problem_query.single_literal_problem_query_mt(problem_query(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 23712L)
    public static SubLObject problem_mt(final SubLObject problem) {
        SubLObject result = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject cdolist_list_var = problem_query(problem);
        SubLObject contextualized_clause = (SubLObject)inference_datastructures_problem.NIL;
        contextualized_clause = cdolist_list_var.first();
        while (inference_datastructures_problem.NIL != cdolist_list_var) {
            SubLObject sense = (SubLObject)inference_datastructures_problem.$kw177$NEG;
            SubLObject index_var = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
            SubLObject cdolist_list_var_$14 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = (SubLObject)inference_datastructures_problem.NIL;
            contextualized_asent = cdolist_list_var_$14.first();
            while (inference_datastructures_problem.NIL != cdolist_list_var_$14) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject asent = (SubLObject)inference_datastructures_problem.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list178);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list178);
                asent = current.first();
                current = current.rest();
                if (inference_datastructures_problem.NIL == current) {
                    if (inference_datastructures_problem.NIL != result) {
                        if (!mt.equal(result)) {
                            return (SubLObject)inference_datastructures_problem.NIL;
                        }
                    }
                    else {
                        result = mt;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list178);
                }
                index_var = Numbers.add(index_var, (SubLObject)inference_datastructures_problem.ONE_INTEGER);
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                contextualized_asent = cdolist_list_var_$14.first();
            }
            sense = (SubLObject)inference_datastructures_problem.$kw179$POS;
            index_var = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
            SubLObject cdolist_list_var_$15 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = (SubLObject)inference_datastructures_problem.NIL;
            contextualized_asent = cdolist_list_var_$15.first();
            while (inference_datastructures_problem.NIL != cdolist_list_var_$15) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject asent = (SubLObject)inference_datastructures_problem.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list178);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list178);
                asent = current.first();
                current = current.rest();
                if (inference_datastructures_problem.NIL == current) {
                    if (inference_datastructures_problem.NIL != result) {
                        if (!mt.equal(result)) {
                            return (SubLObject)inference_datastructures_problem.NIL;
                        }
                    }
                    else {
                        result = mt;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list178);
                }
                index_var = Numbers.add(index_var, (SubLObject)inference_datastructures_problem.ONE_INTEGER);
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                contextualized_asent = cdolist_list_var_$15.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 24022L)
    public static SubLObject problem_mts(final SubLObject problem) {
        final SubLObject one_mt = problem_mt(problem);
        if (inference_datastructures_problem.NIL != one_mt) {
            return (SubLObject)ConsesLow.list(one_mt);
        }
        final SubLObject mt_set = set.new_set(Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL), (SubLObject)inference_datastructures_problem.UNPROVIDED);
        SubLObject cdolist_list_var = problem_query(problem);
        SubLObject contextualized_clause = (SubLObject)inference_datastructures_problem.NIL;
        contextualized_clause = cdolist_list_var.first();
        while (inference_datastructures_problem.NIL != cdolist_list_var) {
            SubLObject sense = (SubLObject)inference_datastructures_problem.$kw177$NEG;
            SubLObject index_var = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
            SubLObject cdolist_list_var_$16 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = (SubLObject)inference_datastructures_problem.NIL;
            contextualized_asent = cdolist_list_var_$16.first();
            while (inference_datastructures_problem.NIL != cdolist_list_var_$16) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject asent = (SubLObject)inference_datastructures_problem.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list178);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list178);
                asent = current.first();
                current = current.rest();
                if (inference_datastructures_problem.NIL == current) {
                    set.set_add(mt, mt_set);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list178);
                }
                index_var = Numbers.add(index_var, (SubLObject)inference_datastructures_problem.ONE_INTEGER);
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                contextualized_asent = cdolist_list_var_$16.first();
            }
            sense = (SubLObject)inference_datastructures_problem.$kw179$POS;
            index_var = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
            SubLObject cdolist_list_var_$17 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = (SubLObject)inference_datastructures_problem.NIL;
            contextualized_asent = cdolist_list_var_$17.first();
            while (inference_datastructures_problem.NIL != cdolist_list_var_$17) {
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject asent = (SubLObject)inference_datastructures_problem.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list178);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem.$list178);
                asent = current.first();
                current = current.rest();
                if (inference_datastructures_problem.NIL == current) {
                    set.set_add(mt, mt_set);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem.$list178);
                }
                index_var = Numbers.add(index_var, (SubLObject)inference_datastructures_problem.ONE_INTEGER);
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                contextualized_asent = cdolist_list_var_$17.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        return set.set_element_list(mt_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 24414L)
    public static SubLObject single_literal_problem_sense(final SubLObject problem) {
        return inference_datastructures_problem_query.single_literal_problem_query_sense(problem_query(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 24650L)
    public static SubLObject mt_asent_sense_from_single_literal_problem(final SubLObject problem) {
        return inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(problem_query(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 24904L)
    public static SubLObject single_literal_problem_with_predicate_p(final SubLObject v_object, final SubLObject predicate) {
        if (inference_datastructures_problem.NIL != single_literal_problem_p(v_object)) {
            return Equality.eql(predicate, single_literal_problem_predicate(v_object));
        }
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 25095L)
    public static SubLObject single_clause_problem_p(final SubLObject v_object) {
        if (inference_datastructures_problem.NIL != problem_p(v_object)) {
            final SubLObject query = problem_query(v_object);
            return inference_datastructures_problem_query.single_clause_problem_query_p(query);
        }
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 25271L)
    public static SubLObject conjunctive_problem_p(final SubLObject v_object) {
        return multi_literal_problem_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 25363L)
    public static SubLObject ist_problem_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != single_literal_problem_p(v_object) && (inference_datastructures_problem.$const180$ist.eql(single_literal_problem_predicate(v_object)) || (inference_datastructures_problem.NIL != utilities_macros.within_normal_forward_inferenceP() && !mt_relevance_macros.$mt$.getDynamicValue(thread).eql(inference_datastructures_problem.$const181$InferencePSC))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 25678L)
    public static SubLObject join_problem_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != conjunctive_problem_p(v_object) && inference_datastructures_problem.NIL != inference_worker_split.all_literals_connected_by_shared_varsP(problem_query(v_object).first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 25917L)
    public static SubLObject split_problem_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != conjunctive_problem_p(v_object) && inference_datastructures_problem.NIL == inference_worker_split.all_literals_connected_by_shared_varsP(problem_query(v_object).first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26167L)
    public static SubLObject multi_literal_problem_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != single_clause_problem_p(v_object) && inference_datastructures_problem.NIL == single_literal_problem_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26315L)
    public static SubLObject disjunctive_problem_p(final SubLObject v_object) {
        return multi_clause_problem_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26406L)
    public static SubLObject multi_clause_problem_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != problem_p(v_object) && inference_datastructures_problem.NIL == single_clause_problem_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26538L)
    public static SubLObject multi_clause_problem_query_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != inference_datastructures_problem_query.problem_query_p(v_object) && inference_datastructures_problem.NIL == inference_datastructures_problem_query.single_clause_problem_query_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26688L)
    public static SubLObject problem_sole_clause(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = problem_query(problem);
        if (inference_datastructures_problem.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_datastructures_problem.NIL == list_utilities.singletonP(query)) {
            Errors.error((SubLObject)inference_datastructures_problem.$str182$The_problem__S_did_not_have_a_sin, problem);
        }
        return problem_query_sole_clause(query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26997L)
    public static SubLObject problem_query_sole_clause(final SubLObject query) {
        SubLObject dnf_clause = (SubLObject)inference_datastructures_problem.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(query, query, (SubLObject)inference_datastructures_problem.$list183);
        dnf_clause = query.first();
        final SubLObject current = query.rest();
        if (inference_datastructures_problem.NIL == current) {
            return dnf_clause;
        }
        cdestructuring_bind.cdestructuring_bind_error(query, (SubLObject)inference_datastructures_problem.$list183);
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 27115L)
    public static SubLObject problem_in_equality_reasoning_domainP(final SubLObject problem) {
        final SubLObject query = problem_query(problem);
        final SubLObject store = problem_store(problem);
        final SubLObject equality_reasoning_domain = inference_datastructures_problem_store.problem_store_equality_reasoning_domain(store);
        return inference_datastructures_problem_query.problem_query_in_equality_reasoning_domainP(query, equality_reasoning_domain);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 27426L)
    public static SubLObject problem_relevant_to_some_inferenceP(final SubLObject problem) {
        return list_utilities.sublisp_boolean(first_problem_relevant_inference(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 27577L)
    public static SubLObject first_problem_relevant_inference(final SubLObject problem) {
        final SubLObject store = problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_datastructures_problem.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
            final SubLObject idx_$18 = idx;
            if (inference_datastructures_problem.NIL == id_index.id_index_dense_objects_empty_p(idx_$18, (SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$18);
                final SubLObject backwardP_var = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_datastructures_problem.NIL, v_iteration = (SubLObject)inference_datastructures_problem.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_datastructures_problem.ONE_INTEGER)) {
                    id = ((inference_datastructures_problem.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_datastructures_problem.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_datastructures_problem.NIL == id_index.id_index_tombstone_p(inference) || inference_datastructures_problem.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
                        if (inference_datastructures_problem.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_datastructures_problem.$kw174$SKIP;
                        }
                        if (inference_datastructures_problem.NIL != problem_relevant_to_inferenceP(problem, inference)) {
                            return inference;
                        }
                    }
                }
            }
            final SubLObject idx_$19 = idx;
            if (inference_datastructures_problem.NIL == id_index.id_index_sparse_objects_empty_p(idx_$19)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$19);
                SubLObject id2 = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject inference2 = (SubLObject)inference_datastructures_problem.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_datastructures_problem.NIL != problem_relevant_to_inferenceP(problem, inference2)) {
                            return inference2;
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 27715L)
    public static SubLObject problem_relevant_to_only_one_inferenceP(final SubLObject problem) {
        SubLObject inference1 = (SubLObject)inference_datastructures_problem.NIL;
        final SubLObject store = problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_datastructures_problem.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
            final SubLObject idx_$20 = idx;
            if (inference_datastructures_problem.NIL == id_index.id_index_dense_objects_empty_p(idx_$20, (SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$20);
                final SubLObject backwardP_var = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference2;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_datastructures_problem.NIL, v_iteration = (SubLObject)inference_datastructures_problem.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_datastructures_problem.ONE_INTEGER)) {
                    id = ((inference_datastructures_problem.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_datastructures_problem.ONE_INTEGER) : v_iteration);
                    inference2 = Vectors.aref(vector_var, id);
                    if (inference_datastructures_problem.NIL == id_index.id_index_tombstone_p(inference2) || inference_datastructures_problem.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
                        if (inference_datastructures_problem.NIL != id_index.id_index_tombstone_p(inference2)) {
                            inference2 = (SubLObject)inference_datastructures_problem.$kw174$SKIP;
                        }
                        if (inference_datastructures_problem.NIL != problem_relevant_to_inferenceP(problem, inference2)) {
                            if (inference_datastructures_problem.NIL != inference1) {
                                return (SubLObject)inference_datastructures_problem.NIL;
                            }
                            inference1 = inference2;
                        }
                    }
                }
            }
            final SubLObject idx_$21 = idx;
            if (inference_datastructures_problem.NIL == id_index.id_index_sparse_objects_empty_p(idx_$21)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$21);
                SubLObject id2 = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject inference3 = (SubLObject)inference_datastructures_problem.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference3 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_datastructures_problem.NIL != problem_relevant_to_inferenceP(problem, inference3)) {
                            if (inference_datastructures_problem.NIL != inference1) {
                                return (SubLObject)inference_datastructures_problem.NIL;
                            }
                            inference1 = inference3;
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return list_utilities.sublisp_boolean(inference1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 27971L)
    public static SubLObject problem_relevant_to_inferenceP(final SubLObject problem, final SubLObject inference) {
        return (SubLObject)((inference_datastructures_problem.NIL != inference_datastructures_inference.valid_inference_p(inference)) ? set.set_memberP(problem, inference_datastructures_inference.inference_relevant_problems(inference)) : inference_datastructures_problem.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 28150L)
    public static SubLObject problem_relevant_to_strategyP(final SubLObject problem, final SubLObject strategy) {
        return problem_relevant_to_inferenceP(problem, inference_datastructures_strategy.strategy_inference(strategy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 28370L)
    public static SubLObject problem_relevant_strategies(final SubLObject problem) {
        SubLObject result = (SubLObject)inference_datastructures_problem.NIL;
        final SubLObject store = problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_datastructures_problem.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
            final SubLObject idx_$22 = idx;
            if (inference_datastructures_problem.NIL == id_index.id_index_dense_objects_empty_p(idx_$22, (SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$22);
                final SubLObject backwardP_var = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_datastructures_problem.NIL, v_iteration = (SubLObject)inference_datastructures_problem.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_datastructures_problem.ONE_INTEGER)) {
                    id = ((inference_datastructures_problem.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_datastructures_problem.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_datastructures_problem.NIL == id_index.id_index_tombstone_p(inference) || inference_datastructures_problem.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
                        if (inference_datastructures_problem.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_datastructures_problem.$kw174$SKIP;
                        }
                        if (inference_datastructures_problem.NIL != problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    result = (SubLObject)ConsesLow.cons(strategy, result);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$23 = idx;
            if (inference_datastructures_problem.NIL == id_index.id_index_sparse_objects_empty_p(idx_$23)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$23);
                SubLObject id2 = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject inference2 = (SubLObject)inference_datastructures_problem.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_datastructures_problem.NIL != problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_datastructures_problem.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    result = (SubLObject)ConsesLow.cons(strategy2, result);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 28565L)
    public static SubLObject problem_active_in_some_strategyP(final SubLObject problem) {
        return list_utilities.sublisp_boolean(first_problem_active_strategy(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 28709L)
    public static SubLObject first_problem_active_strategy(final SubLObject problem) {
        final SubLObject store = problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (inference_datastructures_problem.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
            final SubLObject idx_$24 = idx;
            if (inference_datastructures_problem.NIL == id_index.id_index_dense_objects_empty_p(idx_$24, (SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$24);
                final SubLObject backwardP_var = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_datastructures_problem.NIL, v_iteration = (SubLObject)inference_datastructures_problem.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_datastructures_problem.ONE_INTEGER)) {
                    id = ((inference_datastructures_problem.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_datastructures_problem.ONE_INTEGER) : v_iteration);
                    strategy = Vectors.aref(vector_var, id);
                    if (inference_datastructures_problem.NIL == id_index.id_index_tombstone_p(strategy) || inference_datastructures_problem.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
                        if (inference_datastructures_problem.NIL != id_index.id_index_tombstone_p(strategy)) {
                            strategy = (SubLObject)inference_datastructures_problem.$kw174$SKIP;
                        }
                        if (inference_datastructures_problem.NIL != inference_datastructures_strategy.problem_active_in_strategyP(problem, strategy)) {
                            return strategy;
                        }
                    }
                }
            }
            final SubLObject idx_$25 = idx;
            if (inference_datastructures_problem.NIL == id_index.id_index_sparse_objects_empty_p(idx_$25)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$25);
                SubLObject id2 = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject strategy2 = (SubLObject)inference_datastructures_problem.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        strategy2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_datastructures_problem.NIL != inference_datastructures_strategy.problem_active_in_strategyP(problem, strategy2)) {
                            return strategy2;
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 28840L)
    public static SubLObject problem_argument_link_count(final SubLObject problem) {
        return set_contents.set_contents_size(prob_argument_links(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 29042L)
    public static SubLObject problem_argument_link_of_type_count(final SubLObject problem, final SubLObject type) {
        SubLObject count = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
        final SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, link) && inference_datastructures_problem.NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type)) {
                count = Numbers.add(count, (SubLObject)inference_datastructures_problem.ONE_INTEGER);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 29307L)
    public static SubLObject problem_has_argument_link_p(final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL == set_contents.set_contents_emptyP(prob_argument_links(problem)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 29499L)
    public static SubLObject problem_has_argument_link_of_typeP(final SubLObject problem, final SubLObject type) {
        return list_utilities.sublisp_boolean(problem_first_argument_link_of_type(problem, type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 29638L)
    public static SubLObject problem_first_argument_link_of_type(final SubLObject problem, final SubLObject type) {
        SubLObject first_link = (SubLObject)inference_datastructures_problem.NIL;
        final SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, link) && inference_datastructures_problem.NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type) && inference_datastructures_problem.NIL == first_link) {
                first_link = link;
            }
        }
        return first_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 29902L)
    public static SubLObject problem_sole_argument_link_of_type(final SubLObject problem, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_link = (SubLObject)inference_datastructures_problem.NIL;
        final SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, link) && inference_datastructures_problem.NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type)) {
                if (inference_datastructures_problem.NIL != first_link) {
                    Errors.error((SubLObject)inference_datastructures_problem.$str184$Found_more_than_one__a_argument_l, type, problem);
                }
                else {
                    first_link = link;
                }
            }
        }
        if (inference_datastructures_problem.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_datastructures_problem.NIL == first_link) {
            Errors.error((SubLObject)inference_datastructures_problem.$str185$Expected__a_to_have_a__a_argument, problem, type);
        }
        return first_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 30278L)
    public static SubLObject problem_all_argument_links_have_typeP(final SubLObject problem, final SubLObject link_type) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != inference_datastructures_enumerated_types.problem_link_type_p(link_type) : link_type;
        SubLObject failedP = (SubLObject)inference_datastructures_problem.NIL;
        final SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == failedP && inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, link) && !link_type.eql(inference_datastructures_problem_link.problem_link_type(link))) {
                failedP = (SubLObject)inference_datastructures_problem.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL == failedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 30622L)
    public static SubLObject problem_has_supporting_problem_p(final SubLObject problem) {
        final SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject argument_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            argument_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, argument_link) && inference_datastructures_problem.NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(argument_link)) {
                return (SubLObject)inference_datastructures_problem.T;
            }
        }
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 30904L)
    public static SubLObject all_problem_argument_problems(final SubLObject problem) {
        SubLObject problem_set = set_contents.new_set_contents(problem_argument_link_count(problem), Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ));
        problem_set = all_problem_argument_problems_recursive(problem, problem_set);
        return Sort.sort(set_contents.set_contents_element_list(problem_set), (SubLObject)inference_datastructures_problem.$sym187$_, (SubLObject)inference_datastructures_problem.$sym188$PROBLEM_SUID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 31211L)
    public static SubLObject all_problem_argument_problems_recursive(final SubLObject problem, SubLObject problem_set) {
        if (inference_datastructures_problem.NIL == set_contents.set_contents_memberP(problem, problem_set, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ))) {
            problem_set = set_contents.set_contents_add(problem, problem_set, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ));
            final SubLObject set_contents_var = problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            SubLObject link_var;
            SubLObject cdolist_list_var;
            SubLObject supporting_mapped_problem;
            SubLObject argument_problem;
            SubLObject variable_map;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                    link_var = link;
                    cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    supporting_mapped_problem = (SubLObject)inference_datastructures_problem.NIL;
                    supporting_mapped_problem = cdolist_list_var.first();
                    while (inference_datastructures_problem.NIL != cdolist_list_var) {
                        if (inference_datastructures_problem.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_datastructures_problem.NIL, link_var, supporting_mapped_problem)) {
                            argument_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                            variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                            problem_set = all_problem_argument_problems_recursive(argument_problem, problem_set);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        supporting_mapped_problem = cdolist_list_var.first();
                    }
                }
            }
        }
        return problem_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 31641L)
    public static SubLObject problem_dependent_link_count(final SubLObject problem) {
        return set_contents.set_contents_size(prob_dependent_links(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 31849L)
    public static SubLObject problem_sole_dependent_link(final SubLObject problem) {
        SubLObject result = (SubLObject)inference_datastructures_problem.NIL;
        final SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                if (inference_datastructures_problem.NIL != result) {
                    return Errors.error((SubLObject)inference_datastructures_problem.$str189$_a_had_more_than_one_dependent_li, problem);
                }
                result = dependent_link;
            }
        }
        if (inference_datastructures_problem.NIL != result) {
            return result;
        }
        return Errors.error((SubLObject)inference_datastructures_problem.$str190$_a_had_no_dependent_links, problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 32190L)
    public static SubLObject problem_has_dependent_link_p(final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL == set_contents.set_contents_emptyP(prob_dependent_links(problem)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 32386L)
    public static SubLObject problem_has_dependent_link_of_typeP(final SubLObject problem, final SubLObject type) {
        final SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, dependent_link) && inference_datastructures_problem.NIL != inference_datastructures_problem_link.problem_link_has_typeP(dependent_link, type)) {
                return (SubLObject)inference_datastructures_problem.T;
            }
        }
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 32576L)
    public static SubLObject problem_has_answer_link_p(final SubLObject problem) {
        return problem_has_dependent_link_of_typeP(problem, (SubLObject)inference_datastructures_problem.$kw191$ANSWER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 32694L)
    public static SubLObject problem_has_non_answer_dependent_link_p(final SubLObject problem) {
        if (inference_datastructures_problem.NIL == problem_has_dependent_link_p(problem)) {
            return (SubLObject)inference_datastructures_problem.NIL;
        }
        final SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, dependent_link) && inference_datastructures_problem.NIL == inference_worker_answer.answer_link_p(dependent_link)) {
                return (SubLObject)inference_datastructures_problem.T;
            }
        }
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 33073L)
    public static SubLObject problem_has_only_non_abducible_rule_transformation_dependent_linksP(final SubLObject problem) {
        SubLObject doneP = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject result = (SubLObject)inference_datastructures_problem.NIL;
        final SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == doneP && inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                if (inference_datastructures_problem.NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, (SubLObject)inference_datastructures_problem.$kw192$TRANSFORMATION)) {
                    if (inference_datastructures_problem.NIL != kb_accessors.non_abducible_ruleP(inference_worker_transformation.transformation_link_rule_assertion(link))) {
                        result = (SubLObject)inference_datastructures_problem.T;
                    }
                    else {
                        result = (SubLObject)inference_datastructures_problem.NIL;
                        doneP = (SubLObject)inference_datastructures_problem.T;
                    }
                }
                else {
                    doneP = (SubLObject)inference_datastructures_problem.T;
                    result = (SubLObject)inference_datastructures_problem.NIL;
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 33537L)
    public static SubLObject problem_supported_problems(final SubLObject problem) {
        SubLObject result = (SubLObject)inference_datastructures_problem.NIL;
        final SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if (inference_datastructures_problem.NIL != supported_problem) {
                    result = (SubLObject)ConsesLow.cons(supported_problem, result);
                }
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 33852L)
    public static SubLObject problem_supported_problem_count(final SubLObject problem) {
        final SubLObject result = set.new_set(Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ), (SubLObject)inference_datastructures_problem.UNPROVIDED);
        final SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if (inference_datastructures_problem.NIL != supported_problem) {
                    set.set_add(supported_problem, result);
                }
            }
        }
        return set.set_size(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 34202L)
    public static SubLObject problem_has_more_than_one_supported_problemP(final SubLObject problem) {
        SubLObject first_supported_problem = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject more_than_oneP = (SubLObject)inference_datastructures_problem.NIL;
        final SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if (inference_datastructures_problem.NIL != supported_problem) {
                    if (inference_datastructures_problem.NIL == first_supported_problem) {
                        first_supported_problem = supported_problem;
                    }
                    else if (!supported_problem.eql(first_supported_problem)) {
                        more_than_oneP = (SubLObject)inference_datastructures_problem.T;
                    }
                }
            }
        }
        return more_than_oneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 34619L)
    public static SubLObject problem_next_tactic_suid(final SubLObject problem) {
        return problem_tactic_count(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 34734L)
    public static SubLObject problem_tactic_count(final SubLObject problem) {
        final SubLObject tactics = problem_tactics(problem);
        if (inference_datastructures_problem.NIL != tactics) {
            return number_utilities.f_1X(inference_datastructures_tactic.tactic_suid(tactics.first()));
        }
        return (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 35025L)
    public static SubLObject problem_has_no_tacticsP(final SubLObject problem) {
        return Types.sublisp_null(problem_tactics(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 35120L)
    public static SubLObject problem_tactic_count_with_hl_module(final SubLObject problem, final SubLObject tactic_hl_module) {
        SubLObject count = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_datastructures_problem.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_problem.NIL != cdolist_list_var) {
            if (inference_datastructures_problem.NIL != do_problem_tactics_hl_module_match(tactic, tactic_hl_module)) {
                count = Numbers.add(count, (SubLObject)inference_datastructures_problem.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 35329L)
    public static SubLObject problem_tactic_count_with_hl_module_and_status(final SubLObject problem, final SubLObject tactic_hl_module, final SubLObject tactic_status) {
        SubLObject count = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_datastructures_problem.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_problem.NIL != cdolist_list_var) {
            if (inference_datastructures_problem.NIL != do_problem_tactics_status_match(tactic, tactic_status) && inference_datastructures_problem.NIL != do_problem_tactics_hl_module_match(tactic, tactic_hl_module)) {
                count = Numbers.add(count, (SubLObject)inference_datastructures_problem.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 35585L)
    public static SubLObject problem_possible_tactics(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        return list_utilities.remove_if_not((SubLObject)inference_datastructures_problem.$sym193$TACTIC_POSSIBLE_, problem_tactics(problem), (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 35742L)
    public static SubLObject problem_has_possible_tacticsP(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        return list_utilities.sublisp_boolean(Sequences.find_if((SubLObject)inference_datastructures_problem.$sym193$TACTIC_POSSIBLE_, problem_tactics(problem), (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 35907L)
    public static SubLObject problem_no_tactics_possibleP(final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL == problem_has_possible_tacticsP(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 36021L)
    public static SubLObject problem_executed_tactics(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        return list_utilities.remove_if_not((SubLObject)inference_datastructures_problem.$sym194$TACTIC_EXECUTED_, problem_tactics(problem), (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 36177L)
    public static SubLObject problem_discarded_tactics(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        return list_utilities.remove_if_not((SubLObject)inference_datastructures_problem.$sym195$TACTIC_DISCARDED_, problem_tactics(problem), (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 36335L)
    public static SubLObject problem_possible_tactic_count(final SubLObject problem) {
        return problem_tactic_with_status_count(problem, (SubLObject)inference_datastructures_problem.$kw196$POSSIBLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 36457L)
    public static SubLObject problem_executed_tactic_count(final SubLObject problem) {
        return problem_tactic_with_status_count(problem, (SubLObject)inference_datastructures_problem.$kw197$EXECUTED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 36578L)
    public static SubLObject problem_discarded_tactic_count(final SubLObject problem) {
        return problem_tactic_with_status_count(problem, (SubLObject)inference_datastructures_problem.$kw198$DISCARDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 36701L)
    public static SubLObject problem_tactic_of_type_with_status_count(final SubLObject problem, SubLObject type, SubLObject status) {
        if (type == inference_datastructures_problem.UNPROVIDED) {
            type = (SubLObject)inference_datastructures_problem.NIL;
        }
        if (status == inference_datastructures_problem.UNPROVIDED) {
            status = (SubLObject)inference_datastructures_problem.NIL;
        }
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        if (inference_datastructures_problem.NIL != type && !inference_datastructures_problem.assertionsDisabledInClass && inference_datastructures_problem.NIL == generalized_tactic_type_p(type)) {
            throw new AssertionError(type);
        }
        if (inference_datastructures_problem.NIL != status && !inference_datastructures_problem.assertionsDisabledInClass && inference_datastructures_problem.NIL == inference_datastructures_enumerated_types.tactic_status_p(status)) {
            throw new AssertionError(status);
        }
        SubLObject count = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_datastructures_problem.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_problem.NIL != cdolist_list_var) {
            if (inference_datastructures_problem.NIL != do_problem_tactics_type_match(tactic, type) && inference_datastructures_problem.NIL != do_problem_tactics_status_match(tactic, status)) {
                count = Numbers.add(count, (SubLObject)inference_datastructures_problem.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 37159L)
    public static SubLObject problem_tactic_with_status_count(final SubLObject problem, SubLObject status) {
        if (status == inference_datastructures_problem.UNPROVIDED) {
            status = (SubLObject)inference_datastructures_problem.NIL;
        }
        return problem_tactic_of_type_with_status_count(problem, (SubLObject)inference_datastructures_problem.NIL, status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 37397L)
    public static SubLObject problem_has_tactic_of_type_with_statusP(final SubLObject problem, final SubLObject type, SubLObject status) {
        if (status == inference_datastructures_problem.UNPROVIDED) {
            status = (SubLObject)inference_datastructures_problem.NIL;
        }
        SubLObject foundP;
        SubLObject rest;
        SubLObject tactic;
        for (foundP = (SubLObject)inference_datastructures_problem.NIL, rest = (SubLObject)inference_datastructures_problem.NIL, rest = problem_tactics(problem); inference_datastructures_problem.NIL == foundP && inference_datastructures_problem.NIL != rest; rest = rest.rest()) {
            tactic = rest.first();
            if (inference_datastructures_problem.NIL != do_problem_tactics_type_match(tactic, type) && inference_datastructures_problem.NIL != do_problem_tactics_status_match(tactic, status)) {
                foundP = (SubLObject)inference_datastructures_problem.T;
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 37634L)
    public static SubLObject problem_has_tactic_of_typeP(final SubLObject problem, final SubLObject type) {
        return problem_has_tactic_of_type_with_statusP(problem, type, (SubLObject)inference_datastructures_problem.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 37762L)
    public static SubLObject problem_has_removal_tacticsP(final SubLObject problem) {
        return problem_has_tactic_of_typeP(problem, (SubLObject)inference_datastructures_problem.$kw102$GENERALIZED_REMOVAL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 37888L)
    public static SubLObject problem_has_transformation_tacticsP(final SubLObject problem) {
        return problem_has_tactic_of_typeP(problem, (SubLObject)inference_datastructures_problem.$kw192$TRANSFORMATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 38016L)
    public static SubLObject problem_has_possible_transformation_tacticsP(final SubLObject problem) {
        return problem_has_tactic_of_type_with_statusP(problem, (SubLObject)inference_datastructures_problem.$kw192$TRANSFORMATION, (SubLObject)inference_datastructures_problem.$kw196$POSSIBLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 38175L)
    public static SubLObject problem_has_possible_removal_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        return problem_has_tactic_of_type_with_statusP(problem, (SubLObject)inference_datastructures_problem.$kw201$REMOVAL, (SubLObject)inference_datastructures_problem.$kw196$POSSIBLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 38423L)
    public static SubLObject problem_has_complete_possible_removal_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_datastructures_problem.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_problem.NIL != cdolist_list_var) {
            if (inference_datastructures_problem.NIL != do_problem_tactics_type_match(tactic, (SubLObject)inference_datastructures_problem.$kw201$REMOVAL) && inference_datastructures_problem.NIL != do_problem_tactics_status_match(tactic, (SubLObject)inference_datastructures_problem.$kw196$POSSIBLE) && inference_datastructures_problem.NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, strategic_context)) {
                return (SubLObject)inference_datastructures_problem.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 38746L)
    public static SubLObject problem_has_split_tacticsP(final SubLObject problem) {
        SubLObject foundP;
        SubLObject rest;
        SubLObject tactic;
        for (foundP = (SubLObject)inference_datastructures_problem.NIL, rest = (SubLObject)inference_datastructures_problem.NIL, rest = problem_tactics(problem); inference_datastructures_problem.NIL == foundP && inference_datastructures_problem.NIL != rest; foundP = inference_worker_split.split_tactic_p(tactic), rest = rest.rest()) {
            tactic = rest.first();
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 38944L)
    public static SubLObject problem_has_an_in_progress_tacticP(final SubLObject problem) {
        SubLObject has_oneP;
        SubLObject rest;
        SubLObject tactic;
        for (has_oneP = (SubLObject)inference_datastructures_problem.NIL, rest = (SubLObject)inference_datastructures_problem.NIL, rest = problem_tactics(problem); inference_datastructures_problem.NIL == has_oneP && inference_datastructures_problem.NIL != rest; rest = rest.rest()) {
            tactic = rest.first();
            if (inference_datastructures_problem.NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
                has_oneP = (SubLObject)inference_datastructures_problem.T;
            }
        }
        return has_oneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 39248L)
    public static SubLObject problem_has_an_in_progress_complete_removal_tacticP(final SubLObject problem, final SubLObject strategic_context) {
        SubLObject has_oneP;
        SubLObject rest;
        SubLObject tactic;
        for (has_oneP = (SubLObject)inference_datastructures_problem.NIL, rest = (SubLObject)inference_datastructures_problem.NIL, rest = problem_tactics(problem); inference_datastructures_problem.NIL == has_oneP && inference_datastructures_problem.NIL != rest; rest = rest.rest()) {
            tactic = rest.first();
            if (inference_datastructures_problem.NIL != do_problem_tactics_type_match(tactic, (SubLObject)inference_datastructures_problem.$kw201$REMOVAL) && inference_datastructures_problem.NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, strategic_context) && inference_datastructures_problem.NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
                has_oneP = (SubLObject)inference_datastructures_problem.T;
            }
        }
        return has_oneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 39584L)
    public static SubLObject any_problem_has_an_in_progress_tacticP(final SubLObject problems) {
        return list_utilities.any_in_list((SubLObject)inference_datastructures_problem.$sym202$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_, problems, (SubLObject)inference_datastructures_problem.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 39721L)
    public static SubLObject problem_has_no_logical_tacticsP(final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL == problem_has_tactic_of_typeP(problem, (SubLObject)inference_datastructures_problem.$kw107$LOGICAL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 39845L)
    public static SubLObject problem_total_removal_productivity(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        SubLObject total_productivity = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_datastructures_problem.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_problem.NIL != cdolist_list_var) {
            if (inference_datastructures_problem.NIL != do_problem_tactics_type_match(tactic, (SubLObject)inference_datastructures_problem.$kw201$REMOVAL) && inference_datastructures_problem.NIL != do_problem_tactics_status_match(tactic, (SubLObject)inference_datastructures_problem.$kw196$POSSIBLE)) {
                final SubLObject tactic_productivity = inference_datastructures_tactic.tactic_productivity(tactic);
                total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, tactic_productivity);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return total_productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 40337L)
    public static SubLObject problem_total_deductive_removal_productivity(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        SubLObject total_productivity = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_datastructures_problem.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_problem.NIL != cdolist_list_var) {
            if (inference_datastructures_problem.NIL != do_problem_tactics_type_match(tactic, (SubLObject)inference_datastructures_problem.$kw201$REMOVAL) && inference_datastructures_problem.NIL != do_problem_tactics_status_match(tactic, (SubLObject)inference_datastructures_problem.$kw196$POSSIBLE) && inference_datastructures_problem.NIL == inference_datastructures_tactic.abductive_tacticP(tactic)) {
                final SubLObject tactic_productivity = inference_datastructures_tactic.tactic_productivity(tactic);
                total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, tactic_productivity);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return total_productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 40879L)
    public static SubLObject problem_total_actual_removal_productivity(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        SubLObject total_productivity = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_datastructures_problem.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_problem.NIL != cdolist_list_var) {
            if (inference_datastructures_problem.NIL != do_problem_tactics_type_match(tactic, (SubLObject)inference_datastructures_problem.$kw201$REMOVAL) && inference_datastructures_problem.NIL == inference_datastructures_tactic.tactic_discardedP(tactic)) {
                final SubLObject tactic_productivity = inference_worker.content_tactic_actual_productivity(tactic);
                total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, tactic_productivity);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return total_productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 41427L)
    public static SubLObject problem_possible_removal_tactics(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        SubLObject tactics = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_datastructures_problem.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_problem.NIL != cdolist_list_var) {
            if (inference_datastructures_problem.NIL != do_problem_tactics_type_match(tactic, (SubLObject)inference_datastructures_problem.$kw201$REMOVAL) && inference_datastructures_problem.NIL != do_problem_tactics_status_match(tactic, (SubLObject)inference_datastructures_problem.$kw196$POSSIBLE)) {
                tactics = (SubLObject)ConsesLow.cons(tactic, tactics);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return tactics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 41669L)
    public static SubLObject problem_executed_removal_tactic_productivities(final SubLObject problem) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        SubLObject tuples = (SubLObject)inference_datastructures_problem.NIL;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_datastructures_problem.NIL;
        tactic = cdolist_list_var.first();
        while (inference_datastructures_problem.NIL != cdolist_list_var) {
            if (inference_datastructures_problem.NIL != do_problem_tactics_type_match(tactic, (SubLObject)inference_datastructures_problem.$kw201$REMOVAL) && inference_datastructures_problem.NIL != do_problem_tactics_status_match(tactic, (SubLObject)inference_datastructures_problem.$kw197$EXECUTED)) {
                final SubLObject removal_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                final SubLObject module_name = inference_modules.hl_module_name(removal_module);
                final SubLObject original_productivity = inference_datastructures_tactic.tactic_original_productivity(tactic);
                final SubLObject actual_productivity = inference_worker.content_tactic_actual_productivity(tactic);
                tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module_name, original_productivity, actual_productivity), tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 42399L)
    public static SubLObject all_problem_proofs(final SubLObject problem, SubLObject proof_status) {
        if (proof_status == inference_datastructures_problem.UNPROVIDED) {
            proof_status = (SubLObject)inference_datastructures_problem.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_proofs = (SubLObject)inference_datastructures_problem.NIL;
        final SubLObject status_var = proof_status;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(problem_proof_bindings_index(problem)); inference_datastructures_problem.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject proof_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = proof_list;
            SubLObject proof = (SubLObject)inference_datastructures_problem.NIL;
            proof = cdolist_list_var.first();
            while (inference_datastructures_problem.NIL != cdolist_list_var) {
                if (inference_datastructures_problem.NIL != proof_has_statusP(proof, status_var)) {
                    all_proofs = (SubLObject)ConsesLow.cons(proof, all_proofs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                proof = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return all_proofs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 42696L)
    public static SubLObject problem_proof_count(final SubLObject problem, SubLObject proof_status) {
        if (proof_status == inference_datastructures_problem.UNPROVIDED) {
            proof_status = (SubLObject)inference_datastructures_problem.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = problem_store(problem);
        if (inference_datastructures_problem.NIL != proof_status && inference_datastructures_problem.NIL != inference_datastructures_problem_store.problem_store_some_rejected_proofsP(store)) {
            SubLObject count = (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
            final SubLObject status_var = proof_status;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(problem_proof_bindings_index(problem)); inference_datastructures_problem.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject proof_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = proof_list;
                SubLObject proof = (SubLObject)inference_datastructures_problem.NIL;
                proof = cdolist_list_var.first();
                while (inference_datastructures_problem.NIL != cdolist_list_var) {
                    if (inference_datastructures_problem.NIL != proof_has_statusP(proof, status_var)) {
                        count = Numbers.add(count, (SubLObject)inference_datastructures_problem.ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    proof = cdolist_list_var.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            return count;
        }
        if (proof_status == inference_datastructures_problem.$kw203$REJECTED) {
            return (SubLObject)inference_datastructures_problem.ZERO_INTEGER;
        }
        return dictionary_contents.dictionary_contents_size(prob_proof_bindings_index(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 43239L)
    public static SubLObject problem_proven_proof_count(final SubLObject problem) {
        return problem_proof_count(problem, (SubLObject)inference_datastructures_problem.$kw204$PROVEN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 43342L)
    public static SubLObject problem_has_some_proofP(final SubLObject problem, SubLObject proof_status) {
        if (proof_status == inference_datastructures_problem.UNPROVIDED) {
            proof_status = (SubLObject)inference_datastructures_problem.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = problem_store(problem);
        if (inference_datastructures_problem.NIL != proof_status && inference_datastructures_problem.NIL != inference_datastructures_problem_store.problem_store_some_rejected_proofsP(store)) {
            final SubLObject status_var = proof_status;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(problem_proof_bindings_index(problem)); inference_datastructures_problem.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject proof_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = proof_list;
                SubLObject proof = (SubLObject)inference_datastructures_problem.NIL;
                proof = cdolist_list_var.first();
                while (inference_datastructures_problem.NIL != cdolist_list_var) {
                    if (inference_datastructures_problem.NIL != proof_has_statusP(proof, status_var)) {
                        return (SubLObject)inference_datastructures_problem.T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    proof = cdolist_list_var.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            return (SubLObject)inference_datastructures_problem.NIL;
        }
        if (proof_status == inference_datastructures_problem.$kw203$REJECTED) {
            return (SubLObject)inference_datastructures_problem.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL == dictionary_contents.dictionary_contents_empty_p(prob_proof_bindings_index(problem)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 43859L)
    public static SubLObject problem_has_some_proven_proofP(final SubLObject problem) {
        return problem_has_some_proofP(problem, (SubLObject)inference_datastructures_problem.$kw204$PROVEN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 43970L)
    public static SubLObject problem_has_some_rejected_proofP(final SubLObject problem) {
        return problem_has_some_proofP(problem, (SubLObject)inference_datastructures_problem.$kw203$REJECTED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 44085L)
    public static SubLObject problem_proofs_lookup(final SubLObject problem, final SubLObject v_bindings) {
        final SubLObject index = prob_proof_bindings_index(problem);
        final SubLObject proofs = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL), (SubLObject)inference_datastructures_problem.UNPROVIDED);
        return proofs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 44342L)
    public static SubLObject problem_argument_links_lookup(final SubLObject problem, final SubLObject v_bindings) {
        final SubLObject index = prob_argument_link_bindings_index(problem);
        final SubLObject links = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL), (SubLObject)inference_datastructures_problem.UNPROVIDED);
        return links;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 44654L)
    public static SubLObject problem_potentially_processedP(final SubLObject problem) {
        final SubLObject store = problem_store(problem);
        final SubLObject potentially_processed_problems = inference_datastructures_problem_store.problem_store_potentially_processed_problems(store);
        return set.set_memberP(problem, potentially_processed_problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 44933L)
    public static SubLObject note_problem_potentially_processed(final SubLObject problem) {
        return inference_datastructures_problem_store.problem_store_note_problem_potentially_processed(problem_store(problem), problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 45089L)
    public static SubLObject problem_indestructibleP(final SubLObject problem) {
        final SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(problem_store(problem));
        final SubLObject indestructible_problems = inference_datastructures_problem_store.problem_store_janitor_indestructible_problems(janitor);
        return set.set_memberP(problem, indestructible_problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 45382L)
    public static SubLObject problem_destructibleP(final SubLObject problem) {
        final SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(problem_store(problem));
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL == inference_datastructures_problem_store.problem_store_janitor_staleP(janitor) && inference_datastructures_problem.NIL == problem_indestructibleP(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 45615L)
    public static SubLObject problem_destructibility_status(final SubLObject problem) {
        if (inference_datastructures_problem.NIL != problem_indestructibleP(problem)) {
            return (SubLObject)inference_datastructures_problem.$kw205$INDESTRUCTIBLE;
        }
        if (inference_datastructures_problem.NIL != problem_destructibleP(problem)) {
            return (SubLObject)inference_datastructures_problem.$kw206$DESTRUCTIBLE;
        }
        return (SubLObject)inference_datastructures_problem.$kw207$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 45867L)
    public static SubLObject problem_min_depth(final SubLObject problem) {
        final SubLObject store = problem_store(problem);
        final SubLObject hash = inference_datastructures_problem_store.problem_store_min_depth_index(store);
        final SubLObject depth = Hashtables.gethash_without_values(problem, hash, (SubLObject)inference_datastructures_problem.$kw64$UNDETERMINED);
        return depth;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 46156L)
    public static SubLObject problem_min_proof_depth(final SubLObject problem, final SubLObject inference) {
        final SubLObject store = problem_store(problem);
        final SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_proof_depth_index(store), inference, (SubLObject)inference_datastructures_problem.UNPROVIDED);
        if (inference_datastructures_problem.NIL != hash) {
            final SubLObject depth = Hashtables.gethash_without_values(problem, hash, (SubLObject)inference_datastructures_problem.UNPROVIDED);
            if (inference_datastructures_problem.NIL != subl_promotions.non_negative_integer_p(depth)) {
                return depth;
            }
        }
        return (SubLObject)inference_datastructures_problem.$kw64$UNDETERMINED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 47424L)
    public static SubLObject problem_intuitive_min_transformation_depth(final SubLObject problem, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = inference_datastructures_problem.$transformation_depth_computation$.currentBinding(thread);
        try {
            inference_datastructures_problem.$transformation_depth_computation$.bind((SubLObject)inference_datastructures_problem.$kw209$INTUITIVE, thread);
            return problem_min_transformation_depth(problem, inference);
        }
        finally {
            inference_datastructures_problem.$transformation_depth_computation$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 47629L)
    public static SubLObject problem_min_transformation_depth(final SubLObject problem, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_datastructures_problem.NIL != inference_datastructures_problem.$problem_min_transformation_depth_from_signature_enabledP$.getDynamicValue(thread)) {
            return inference_min_transformation_depth.problem_min_transformation_depth_from_signature(problem, inference);
        }
        final SubLObject store = problem_store(problem);
        final SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_index(store), inference, (SubLObject)inference_datastructures_problem.UNPROVIDED);
        if (inference_datastructures_problem.NIL != hash) {
            final SubLObject depth = Hashtables.gethash_without_values(problem, hash, (SubLObject)inference_datastructures_problem.UNPROVIDED);
            if (inference_datastructures_problem.NIL != subl_promotions.non_negative_integer_p(depth)) {
                return depth;
            }
        }
        return (SubLObject)inference_datastructures_problem.$kw64$UNDETERMINED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 48384L)
    public static SubLObject problem_min_transformation_depth_signature(final SubLObject problem, final SubLObject inference) {
        final SubLObject store = problem_store(problem);
        final SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_signature_index(store), inference, (SubLObject)inference_datastructures_problem.UNPROVIDED);
        if (inference_datastructures_problem.NIL != hash) {
            final SubLObject depth = Hashtables.gethash_without_values(problem, hash, (SubLObject)inference_datastructures_problem.UNPROVIDED);
            if (inference_datastructures_problem.NIL != depth) {
                return depth;
            }
        }
        return (SubLObject)inference_datastructures_problem.$kw64$UNDETERMINED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 49037L)
    public static SubLObject problem_backchain_requiredP(final SubLObject problem) {
        final SubLObject cache_value = prob_backchain_required(problem);
        if (inference_datastructures_problem.NIL != Types.booleanp(cache_value)) {
            return cache_value;
        }
        final SubLObject backchain_requiredP = inference_trampolines.compute_problem_backchain_requiredP(problem);
        _csetf_prob_backchain_required(problem, backchain_requiredP);
        return backchain_requiredP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 49404L)
    public static SubLObject add_problem_argument_link(final SubLObject problem, final SubLObject argument_link) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != inference_datastructures_problem_link.problem_link_p(argument_link) : argument_link;
        _csetf_prob_argument_links(problem, set_contents.set_contents_add(argument_link, prob_argument_links(problem), Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ)));
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 49741L)
    public static SubLObject remove_problem_argument_link(final SubLObject problem, final SubLObject argument_link) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != inference_datastructures_problem_link.problem_link_p(argument_link) : argument_link;
        _csetf_prob_argument_links(problem, set_contents.set_contents_delete(argument_link, prob_argument_links(problem), Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ)));
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 50068L)
    public static SubLObject index_problem_argument_link(final SubLObject problem, final SubLObject argument_link) {
        final SubLObject index = prob_argument_link_bindings_index(problem);
        final SubLObject v_bindings = (SubLObject)((inference_datastructures_problem.NIL != inference_worker_removal.removal_link_p(argument_link)) ? inference_worker_removal.removal_link_bindings(argument_link) : ((inference_datastructures_problem.NIL != inference_worker_restriction.restriction_link_p(argument_link)) ? inference_worker_restriction.restriction_link_bindings(argument_link) : inference_datastructures_problem.NIL));
        SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL), (SubLObject)inference_datastructures_problem.UNPROVIDED);
        existing = (SubLObject)ConsesLow.cons(argument_link, existing);
        _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, existing, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL)));
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 50741L)
    public static SubLObject deindex_problem_argument_link(final SubLObject problem, final SubLObject argument_link) {
        final SubLObject index = prob_argument_link_bindings_index(problem);
        final SubLObject v_bindings = (SubLObject)((inference_datastructures_problem.NIL != inference_worker_removal.removal_link_p(argument_link)) ? inference_worker_removal.removal_link_bindings(argument_link) : ((inference_datastructures_problem.NIL != inference_worker_restriction.restriction_link_p(argument_link)) ? inference_worker_restriction.restriction_link_bindings(argument_link) : inference_datastructures_problem.NIL));
        final SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL), (SubLObject)inference_datastructures_problem.UNPROVIDED);
        final SubLObject updated = list_utilities.delete_first(argument_link, existing, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ));
        if (!existing.eql(updated)) {
            if (inference_datastructures_problem.NIL == updated) {
                _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.dictionary_contents_delete(index, v_bindings, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL)));
            }
            else {
                _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, updated, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL)));
            }
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 51515L)
    public static SubLObject add_problem_dependent_link(final SubLObject problem, final SubLObject dependent_link) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != inference_datastructures_problem_link.problem_link_p(dependent_link) : dependent_link;
        _csetf_prob_dependent_links(problem, set_contents.set_contents_add(dependent_link, prob_dependent_links(problem), Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ)));
        inference_metrics.increment_dependent_link_historical_count();
        if (inference_datastructures_problem.NIL != single_literal_problem_p(problem)) {
            inference_metrics.increment_single_literal_problem_dependent_link_historical_count();
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 51997L)
    public static SubLObject remove_problem_dependent_link(final SubLObject problem, final SubLObject dependent_link) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != inference_datastructures_problem_link.problem_link_p(dependent_link) : dependent_link;
        _csetf_prob_dependent_links(problem, set_contents.set_contents_delete(dependent_link, prob_dependent_links(problem), Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ)));
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 52665L)
    public static SubLObject add_problem_tactic(final SubLObject problem, final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != inference_datastructures_tactic.tactic_p(tactic) : tactic;
        if (inference_datastructures_problem.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !problem_tactic_count(problem).numLE(inference_datastructures_problem.$max_problem_tactics$.getGlobalValue())) {
            Errors.error((SubLObject)inference_datastructures_problem.$str214$Tried_to_add__s_to__s__which_woul, new SubLObject[] { tactic, problem, inference_datastructures_problem.$max_problem_tactics$.getGlobalValue(), problem });
        }
        _csetf_prob_tactics(problem, (SubLObject)ConsesLow.cons(tactic, prob_tactics(problem)));
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 53171L)
    public static SubLObject remove_problem_tactic(final SubLObject problem, final SubLObject tactic) {
        assert inference_datastructures_problem.NIL != inference_datastructures_tactic.tactic_p(tactic) : tactic;
        _csetf_prob_tactics(problem, Sequences.delete(tactic, prob_tactics(problem), (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED, (SubLObject)inference_datastructures_problem.UNPROVIDED));
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 53383L)
    public static SubLObject add_problem_proof(final SubLObject problem, final SubLObject proof) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        final SubLObject index = prob_proof_bindings_index(problem);
        final SubLObject v_bindings = inference_datastructures_proof.proof_bindings(proof);
        SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL), (SubLObject)inference_datastructures_problem.UNPROVIDED);
        existing = (SubLObject)ConsesLow.cons(proof, existing);
        _csetf_prob_proof_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, existing, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL)));
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 53828L)
    public static SubLObject remove_problem_proof(final SubLObject problem, final SubLObject proof) {
        final SubLObject v_bindings = inference_datastructures_proof.proof_bindings(proof);
        return remove_problem_proof_with_bindings(problem, proof, v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 54000L)
    public static SubLObject remove_problem_proof_with_bindings(final SubLObject problem, final SubLObject proof, final SubLObject v_bindings) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        assert inference_datastructures_problem.NIL != bindings.bindings_p(v_bindings) : v_bindings;
        SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject join_ordered_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link) && inference_datastructures_problem.NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, (SubLObject)inference_datastructures_problem.$kw114$JOIN_ORDERED)) {
                inference_worker_join_ordered.remove_join_ordered_link_proof_both_ways(join_ordered_link, proof, v_bindings);
            }
        }
        set_contents_var = problem_dependent_links(problem);
        SubLObject join_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_datastructures_problem.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_datastructures_problem.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            join_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_datastructures_problem.NIL != set_contents.do_set_contents_element_validP(state, join_link) && inference_datastructures_problem.NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_link, (SubLObject)inference_datastructures_problem.$kw115$JOIN)) {
                inference_worker_join.remove_join_link_proof_both_ways(join_link, proof, v_bindings);
            }
        }
        final SubLObject index = prob_proof_bindings_index(problem);
        final SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL), (SubLObject)inference_datastructures_problem.UNPROVIDED);
        final SubLObject updated = list_utilities.delete_first(proof, existing, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ));
        if (!existing.eql(updated)) {
            if (inference_datastructures_problem.NIL == updated) {
                _csetf_prob_proof_bindings_index(problem, dictionary_contents.dictionary_contents_delete(index, v_bindings, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL)));
            }
            else {
                _csetf_prob_proof_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, updated, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQUAL)));
            }
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 54943L)
    public static SubLObject set_problem_min_depth(final SubLObject problem, final SubLObject depth) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != subl_promotions.non_negative_integer_p(depth) : depth;
        final SubLObject store = problem_store(problem);
        final SubLObject hash = inference_datastructures_problem_store.problem_store_min_depth_index(store);
        Hashtables.sethash(problem, hash, depth);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 55269L)
    public static SubLObject set_problem_min_proof_depth(final SubLObject problem, final SubLObject inference, final SubLObject depth) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        assert inference_datastructures_problem.NIL != subl_promotions.non_negative_integer_p(depth) : depth;
        final SubLObject store = problem_store(problem);
        SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_proof_depth_index(store), inference, (SubLObject)inference_datastructures_problem.UNPROVIDED);
        if (inference_datastructures_problem.NIL == hash) {
            hash = Hashtables.make_hash_table((SubLObject)inference_datastructures_problem.ONE_INTEGER, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ), (SubLObject)inference_datastructures_problem.UNPROVIDED);
            dictionary.dictionary_enter(inference_datastructures_problem_store.problem_store_min_proof_depth_index(store), inference, hash);
        }
        Hashtables.sethash(problem, hash, depth);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 55861L)
    public static SubLObject set_problem_min_transformation_depth(final SubLObject problem, final SubLObject inference, final SubLObject depth) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        assert inference_datastructures_problem.NIL != subl_promotions.non_negative_integer_p(depth) : depth;
        final SubLObject store = problem_store(problem);
        SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_index(store), inference, (SubLObject)inference_datastructures_problem.UNPROVIDED);
        if (inference_datastructures_problem.NIL == hash) {
            hash = Hashtables.make_hash_table((SubLObject)inference_datastructures_problem.ONE_INTEGER, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ), (SubLObject)inference_datastructures_problem.UNPROVIDED);
            dictionary.dictionary_enter(inference_datastructures_problem_store.problem_store_min_transformation_depth_index(store), inference, hash);
        }
        Hashtables.sethash(problem, hash, depth);
        inference_datastructures_inference.inference_note_transformation_depth(inference, depth);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 56545L)
    public static SubLObject set_problem_min_transformation_depth_signature(final SubLObject problem, final SubLObject inference, final SubLObject pqds) {
        assert inference_datastructures_problem.NIL != problem_p(problem) : problem;
        assert inference_datastructures_problem.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        assert inference_datastructures_problem.NIL != inference_min_transformation_depth.problem_query_depth_signature_p(pqds) : pqds;
        final SubLObject store = problem_store(problem);
        SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_signature_index(store), inference, (SubLObject)inference_datastructures_problem.UNPROVIDED);
        if (inference_datastructures_problem.NIL == hash) {
            hash = Hashtables.make_hash_table((SubLObject)inference_datastructures_problem.ONE_INTEGER, Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ), (SubLObject)inference_datastructures_problem.UNPROVIDED);
            dictionary.dictionary_enter(inference_datastructures_problem_store.problem_store_min_transformation_depth_signature_index(store), inference, hash);
        }
        Hashtables.sethash(problem, hash, pqds);
        final SubLObject depth = inference_min_transformation_depth.min_transformation_depth_from_signature(pqds);
        inference_datastructures_inference.inference_note_transformation_depth(inference, depth);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 57387L)
    public static SubLObject set_root_problem_min_transformation_depth_signature(final SubLObject problem, final SubLObject inference) {
        final SubLObject problem_query = problem_query(problem);
        final SubLObject initial_pqds = inference_min_transformation_depth.new_initial_pqds(problem_query, (SubLObject)inference_datastructures_problem.UNPROVIDED);
        return set_problem_min_transformation_depth_signature(problem, inference, initial_pqds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 57670L)
    public static SubLObject note_problem_indestructible(final SubLObject problem) {
        if (inference_datastructures_problem.NIL == problem_indestructibleP(problem)) {
            final SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(problem_store(problem));
            inference_datastructures_problem_store.problem_store_janitor_note_problem_indestructible(janitor, problem);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 57962L)
    public static SubLObject note_problem_destructible(final SubLObject problem) {
        if (inference_datastructures_problem.NIL == problem_destructibleP(problem)) {
            final SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(problem_store(problem));
            inference_datastructures_problem_store.problem_store_janitor_note_problem_destructible(janitor, problem);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 58221L)
    public static SubLObject note_problem_min_transformation_depth_signature(final SubLObject problem, final SubLObject inference, final SubLObject new_pqds) {
        final SubLObject old_pqds = problem_min_transformation_depth_signature(problem, inference);
        final SubLObject updated_pqds = (inference_datastructures_problem.$kw64$UNDETERMINED == old_pqds) ? new_pqds : inference_min_transformation_depth.pqds_merge(old_pqds, new_pqds);
        if (!old_pqds.equal(updated_pqds)) {
            set_problem_min_transformation_depth_signature(problem, inference, updated_pqds);
            return (SubLObject)inference_datastructures_problem.T;
        }
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 58657L)
    public static SubLObject problem_tactical_provability_status(final SubLObject problem) {
        final SubLObject status = problem_dwimmed_status(problem);
        return inference_datastructures_enumerated_types.provability_status_from_problem_status(status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 58867L)
    public static SubLObject tactically_good_problem_p(final SubLObject problem) {
        return inference_worker.problem_goodP(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 58955L)
    public static SubLObject tactically_no_good_problem_p(final SubLObject problem) {
        return inference_datastructures_enumerated_types.no_good_problem_status_p(problem_status(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59074L)
    public static SubLObject tactically_neutral_problem_p(final SubLObject problem) {
        return inference_datastructures_enumerated_types.neutral_problem_status_p(problem_status(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59193L)
    public static SubLObject problem_tactical_status(final SubLObject problem) {
        final SubLObject status = problem_status(problem);
        return inference_datastructures_enumerated_types.tactical_status_from_problem_status(status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59377L)
    public static SubLObject tactically_new_problem_p(final SubLObject problem) {
        return Equality.eq((SubLObject)inference_datastructures_problem.$kw63$NEW, inference_datastructures_enumerated_types.tactical_status_from_problem_status(problem_status(problem)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59513L)
    public static SubLObject tactically_unexamined_problem_p(final SubLObject problem) {
        return inference_datastructures_enumerated_types.unexamined_problem_status_p(problem_status(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59638L)
    public static SubLObject tactically_examined_problem_p(final SubLObject problem) {
        return inference_datastructures_enumerated_types.examined_problem_status_p(problem_status(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59759L)
    public static SubLObject tactically_possible_problem_p(final SubLObject problem) {
        return inference_datastructures_enumerated_types.possible_problem_status_p(problem_status(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59880L)
    public static SubLObject tactically_pending_problem_p(final SubLObject problem) {
        return inference_datastructures_enumerated_types.pending_problem_status_p(problem_status(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59999L)
    public static SubLObject tactically_finished_problem_p(final SubLObject problem) {
        return inference_datastructures_enumerated_types.finished_problem_status_p(problem_status(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 60120L)
    public static SubLObject tactical_problem_p(final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != tactically_possible_problem_p(problem) || inference_datastructures_problem.NIL != tactically_pending_problem_p(problem) || inference_datastructures_problem.NIL != tactically_finished_problem_p(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 60313L)
    public static SubLObject tactically_potentially_possible_problem_p(final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != tactically_possible_problem_p(problem) || inference_datastructures_problem.NIL != tactically_unexamined_problem_p(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 60515L)
    public static SubLObject tactically_not_potentially_possible_problem_p(final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem.NIL != tactically_examined_problem_p(problem) || inference_datastructures_problem.NIL != tactically_pending_problem_p(problem) || inference_datastructures_problem.NIL != tactically_finished_problem_p(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 60735L)
    public static SubLObject problem_store_all_modules(final SubLObject store) {
        assert inference_datastructures_problem.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        final SubLObject module_counts = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)inference_datastructures_problem.EQ), (SubLObject)inference_datastructures_problem.UNPROVIDED);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (inference_datastructures_problem.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
            final SubLObject idx_$26 = idx;
            if (inference_datastructures_problem.NIL == id_index.id_index_dense_objects_empty_p(idx_$26, (SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$26);
                final SubLObject backwardP_var = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject cdolist_list_var;
                SubLObject tactic;
                SubLObject module;
                SubLObject module_name;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_datastructures_problem.NIL, v_iteration = (SubLObject)inference_datastructures_problem.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_datastructures_problem.ONE_INTEGER)) {
                    id = ((inference_datastructures_problem.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_datastructures_problem.ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (inference_datastructures_problem.NIL == id_index.id_index_tombstone_p(problem) || inference_datastructures_problem.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_datastructures_problem.$kw174$SKIP)) {
                        if (inference_datastructures_problem.NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = (SubLObject)inference_datastructures_problem.$kw174$SKIP;
                        }
                        cdolist_list_var = problem_tactics(problem);
                        tactic = (SubLObject)inference_datastructures_problem.NIL;
                        tactic = cdolist_list_var.first();
                        while (inference_datastructures_problem.NIL != cdolist_list_var) {
                            module = inference_datastructures_tactic.tactic_hl_module(tactic);
                            module_name = inference_modules.hl_module_name(module);
                            dictionary_utilities.dictionary_increment(module_counts, module_name, (SubLObject)inference_datastructures_problem.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            tactic = cdolist_list_var.first();
                        }
                    }
                }
            }
            final SubLObject idx_$27 = idx;
            if (inference_datastructures_problem.NIL == id_index.id_index_sparse_objects_empty_p(idx_$27)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$27);
                SubLObject id2 = (SubLObject)inference_datastructures_problem.NIL;
                SubLObject problem2 = (SubLObject)inference_datastructures_problem.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = problem_tactics(problem2);
                        SubLObject tactic2 = (SubLObject)inference_datastructures_problem.NIL;
                        tactic2 = cdolist_list_var2.first();
                        while (inference_datastructures_problem.NIL != cdolist_list_var2) {
                            final SubLObject module2 = inference_datastructures_tactic.tactic_hl_module(tactic2);
                            final SubLObject module_name2 = inference_modules.hl_module_name(module2);
                            dictionary_utilities.dictionary_increment(module_counts, module_name2, (SubLObject)inference_datastructures_problem.UNPROVIDED);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            tactic2 = cdolist_list_var2.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sort.sort(dictionary_utilities.dictionary_to_alist(module_counts), Symbols.symbol_function((SubLObject)inference_datastructures_problem.$sym220$_), Symbols.symbol_function((SubLObject)inference_datastructures_problem.$sym221$CDR));
    }
    
    public static SubLObject declare_inference_datastructures_problem_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_print_function_trampoline", "PROBLEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_p", "PROBLEM-P", 1, 0, false);
        new $problem_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "prob_suid", "PROB-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "prob_store", "PROB-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "prob_query", "PROB-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "prob_free_hl_vars", "PROB-FREE-HL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "prob_status", "PROB-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "prob_dependent_links", "PROB-DEPENDENT-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "prob_argument_links", "PROB-ARGUMENT-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "prob_tactics", "PROB-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "prob_proof_bindings_index", "PROB-PROOF-BINDINGS-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "prob_argument_link_bindings_index", "PROB-ARGUMENT-LINK-BINDINGS-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "prob_backchain_required", "PROB-BACKCHAIN-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "prob_memoization_state", "PROB-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "_csetf_prob_suid", "_CSETF-PROB-SUID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "_csetf_prob_store", "_CSETF-PROB-STORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "_csetf_prob_query", "_CSETF-PROB-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "_csetf_prob_free_hl_vars", "_CSETF-PROB-FREE-HL-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "_csetf_prob_status", "_CSETF-PROB-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "_csetf_prob_dependent_links", "_CSETF-PROB-DEPENDENT-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "_csetf_prob_argument_links", "_CSETF-PROB-ARGUMENT-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "_csetf_prob_tactics", "_CSETF-PROB-TACTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "_csetf_prob_proof_bindings_index", "_CSETF-PROB-PROOF-BINDINGS-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "_csetf_prob_argument_link_bindings_index", "_CSETF-PROB-ARGUMENT-LINK-BINDINGS-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "_csetf_prob_backchain_required", "_CSETF-PROB-BACKCHAIN-REQUIRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "_csetf_prob_memoization_state", "_CSETF-PROB-MEMOIZATION-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "make_problem", "MAKE-PROBLEM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "visit_defstruct_problem", "VISIT-DEFSTRUCT-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "visit_defstruct_object_problem_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "valid_problem_p", "VALID-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_invalid_p", "PROBLEM-INVALID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "print_problem", "PRINT-PROBLEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "sxhash_problem_method", "SXHASH-PROBLEM-METHOD", 1, 0, false);
        new $sxhash_problem_method$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "new_problem", "NEW-PROBLEM", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "with_problem_memoization_state", "WITH-PROBLEM-MEMOIZATION-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_memoization_state", "PROBLEM-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_literals", "DO-PROBLEM-LITERALS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_tactics", "DO-PROBLEM-TACTICS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_tactics", "PROBLEM-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_tactics_status_match", "DO-PROBLEM-TACTICS-STATUS-MATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_tactics_completeness_match", "DO-PROBLEM-TACTICS-COMPLETENESS-MATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_tactics_preference_level_match", "DO-PROBLEM-TACTICS-PREFERENCE-LEVEL-MATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_tactics_productivity_match", "DO-PROBLEM-TACTICS-PRODUCTIVITY-MATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_tactics_hl_module_match", "DO-PROBLEM-TACTICS-HL-MODULE-MATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "generalized_tactic_type_p", "GENERALIZED-TACTIC-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_tactics_type_match", "DO-PROBLEM-TACTICS-TYPE-MATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "tactic_matches_type_specP", "TACTIC-MATCHES-TYPE-SPEC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "tactic_matches_any_of_type_specsP", "TACTIC-MATCHES-ANY-OF-TYPE-SPECS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_argument_links", "PROBLEM-ARGUMENT-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_all_argument_links", "PROBLEM-ALL-ARGUMENT-LINKS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_dependent_links", "DO-PROBLEM-DEPENDENT-LINKS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_dependent_links", "PROBLEM-DEPENDENT-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_all_dependent_links", "PROBLEM-ALL-DEPENDENT-LINKS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_dependent_link_interpretations", "DO-PROBLEM-DEPENDENT-LINK-INTERPRETATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_supported_problems", "DO-PROBLEM-SUPPORTED-PROBLEMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_supported_inferences", "DO-PROBLEM-SUPPORTED-INFERENCES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_supporting_problems", "DO-PROBLEM-SUPPORTING-PROBLEMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_proofs", "DO-PROBLEM-PROOFS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_proof_bindings_index", "PROBLEM-PROOF-BINDINGS-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "proof_has_statusP", "PROOF-HAS-STATUS?", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_active_inferences", "DO-PROBLEM-ACTIVE-INFERENCES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_relevant_inferences", "DO-PROBLEM-RELEVANT-INFERENCES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_active_strategies", "DO-PROBLEM-ACTIVE-STRATEGIES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_relevant_strategies", "DO-PROBLEM-RELEVANT-STRATEGIES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "do_problem_relevant_strategic_contexts", "DO-PROBLEM-RELEVANT-STRATEGIC-CONTEXTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "destroy_problem", "DESTROY-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "destroy_problem_store_problem", "DESTROY-PROBLEM-STORE-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "destroy_problem_int", "DESTROY-PROBLEM-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "note_problem_invalid", "NOTE-PROBLEM-INVALID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_suid", "PROBLEM-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_store", "PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_query", "PROBLEM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_free_hl_vars", "PROBLEM-FREE-HL-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_status", "PROBLEM-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_dwimmed_status", "PROBLEM-DWIMMED-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "set_problem_free_hl_vars", "SET-PROBLEM-FREE-HL-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "set_problem_status", "SET-PROBLEM-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_formula", "PROBLEM-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_el_formula", "PROBLEM-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "closed_problem_p", "CLOSED-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "open_problem_p", "OPEN-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "closed_problem_query_p", "CLOSED-PROBLEM-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "open_problem_query_p", "OPEN-PROBLEM-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "closed_single_literal_problem_query_p", "CLOSED-SINGLE-LITERAL-PROBLEM-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "open_single_literal_problem_query_p", "OPEN-SINGLE-LITERAL-PROBLEM-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_variables", "PROBLEM-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_literal_count", "PROBLEM-LITERAL-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_query_literal_count", "PROBLEM-QUERY-LITERAL-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "single_literal_problem_p", "SINGLE-LITERAL-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "single_literal_problem_predicate", "SINGLE-LITERAL-PROBLEM-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "single_literal_problem_atomic_sentence", "SINGLE-LITERAL-PROBLEM-ATOMIC-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "single_literal_problem_mt", "SINGLE-LITERAL-PROBLEM-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_mt", "PROBLEM-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_mts", "PROBLEM-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "single_literal_problem_sense", "SINGLE-LITERAL-PROBLEM-SENSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "mt_asent_sense_from_single_literal_problem", "MT-ASENT-SENSE-FROM-SINGLE-LITERAL-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "single_literal_problem_with_predicate_p", "SINGLE-LITERAL-PROBLEM-WITH-PREDICATE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "single_clause_problem_p", "SINGLE-CLAUSE-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "conjunctive_problem_p", "CONJUNCTIVE-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "ist_problem_p", "IST-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "join_problem_p", "JOIN-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "split_problem_p", "SPLIT-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "multi_literal_problem_p", "MULTI-LITERAL-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "disjunctive_problem_p", "DISJUNCTIVE-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "multi_clause_problem_p", "MULTI-CLAUSE-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "multi_clause_problem_query_p", "MULTI-CLAUSE-PROBLEM-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_sole_clause", "PROBLEM-SOLE-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_query_sole_clause", "PROBLEM-QUERY-SOLE-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_in_equality_reasoning_domainP", "PROBLEM-IN-EQUALITY-REASONING-DOMAIN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_relevant_to_some_inferenceP", "PROBLEM-RELEVANT-TO-SOME-INFERENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "first_problem_relevant_inference", "FIRST-PROBLEM-RELEVANT-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_relevant_to_only_one_inferenceP", "PROBLEM-RELEVANT-TO-ONLY-ONE-INFERENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_relevant_to_inferenceP", "PROBLEM-RELEVANT-TO-INFERENCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_relevant_to_strategyP", "PROBLEM-RELEVANT-TO-STRATEGY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_relevant_strategies", "PROBLEM-RELEVANT-STRATEGIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_active_in_some_strategyP", "PROBLEM-ACTIVE-IN-SOME-STRATEGY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "first_problem_active_strategy", "FIRST-PROBLEM-ACTIVE-STRATEGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_argument_link_count", "PROBLEM-ARGUMENT-LINK-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_argument_link_of_type_count", "PROBLEM-ARGUMENT-LINK-OF-TYPE-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_argument_link_p", "PROBLEM-HAS-ARGUMENT-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_argument_link_of_typeP", "PROBLEM-HAS-ARGUMENT-LINK-OF-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_first_argument_link_of_type", "PROBLEM-FIRST-ARGUMENT-LINK-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_sole_argument_link_of_type", "PROBLEM-SOLE-ARGUMENT-LINK-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_all_argument_links_have_typeP", "PROBLEM-ALL-ARGUMENT-LINKS-HAVE-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_supporting_problem_p", "PROBLEM-HAS-SUPPORTING-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "all_problem_argument_problems", "ALL-PROBLEM-ARGUMENT-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "all_problem_argument_problems_recursive", "ALL-PROBLEM-ARGUMENT-PROBLEMS-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_dependent_link_count", "PROBLEM-DEPENDENT-LINK-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_sole_dependent_link", "PROBLEM-SOLE-DEPENDENT-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_dependent_link_p", "PROBLEM-HAS-DEPENDENT-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_dependent_link_of_typeP", "PROBLEM-HAS-DEPENDENT-LINK-OF-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_answer_link_p", "PROBLEM-HAS-ANSWER-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_non_answer_dependent_link_p", "PROBLEM-HAS-NON-ANSWER-DEPENDENT-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_only_non_abducible_rule_transformation_dependent_linksP", "PROBLEM-HAS-ONLY-NON-ABDUCIBLE-RULE-TRANSFORMATION-DEPENDENT-LINKS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_supported_problems", "PROBLEM-SUPPORTED-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_supported_problem_count", "PROBLEM-SUPPORTED-PROBLEM-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_more_than_one_supported_problemP", "PROBLEM-HAS-MORE-THAN-ONE-SUPPORTED-PROBLEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_next_tactic_suid", "PROBLEM-NEXT-TACTIC-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_tactic_count", "PROBLEM-TACTIC-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_no_tacticsP", "PROBLEM-HAS-NO-TACTICS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_tactic_count_with_hl_module", "PROBLEM-TACTIC-COUNT-WITH-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_tactic_count_with_hl_module_and_status", "PROBLEM-TACTIC-COUNT-WITH-HL-MODULE-AND-STATUS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_possible_tactics", "PROBLEM-POSSIBLE-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_possible_tacticsP", "PROBLEM-HAS-POSSIBLE-TACTICS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_no_tactics_possibleP", "PROBLEM-NO-TACTICS-POSSIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_executed_tactics", "PROBLEM-EXECUTED-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_discarded_tactics", "PROBLEM-DISCARDED-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_possible_tactic_count", "PROBLEM-POSSIBLE-TACTIC-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_executed_tactic_count", "PROBLEM-EXECUTED-TACTIC-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_discarded_tactic_count", "PROBLEM-DISCARDED-TACTIC-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_tactic_of_type_with_status_count", "PROBLEM-TACTIC-OF-TYPE-WITH-STATUS-COUNT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_tactic_with_status_count", "PROBLEM-TACTIC-WITH-STATUS-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_tactic_of_type_with_statusP", "PROBLEM-HAS-TACTIC-OF-TYPE-WITH-STATUS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_tactic_of_typeP", "PROBLEM-HAS-TACTIC-OF-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_removal_tacticsP", "PROBLEM-HAS-REMOVAL-TACTICS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_transformation_tacticsP", "PROBLEM-HAS-TRANSFORMATION-TACTICS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_possible_transformation_tacticsP", "PROBLEM-HAS-POSSIBLE-TRANSFORMATION-TACTICS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_possible_removal_tacticP", "PROBLEM-HAS-POSSIBLE-REMOVAL-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_complete_possible_removal_tacticP", "PROBLEM-HAS-COMPLETE-POSSIBLE-REMOVAL-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_split_tacticsP", "PROBLEM-HAS-SPLIT-TACTICS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_an_in_progress_tacticP", "PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_an_in_progress_complete_removal_tacticP", "PROBLEM-HAS-AN-IN-PROGRESS-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "any_problem_has_an_in_progress_tacticP", "ANY-PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_no_logical_tacticsP", "PROBLEM-HAS-NO-LOGICAL-TACTICS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_total_removal_productivity", "PROBLEM-TOTAL-REMOVAL-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_total_deductive_removal_productivity", "PROBLEM-TOTAL-DEDUCTIVE-REMOVAL-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_total_actual_removal_productivity", "PROBLEM-TOTAL-ACTUAL-REMOVAL-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_possible_removal_tactics", "PROBLEM-POSSIBLE-REMOVAL-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_executed_removal_tactic_productivities", "PROBLEM-EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "all_problem_proofs", "ALL-PROBLEM-PROOFS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_proof_count", "PROBLEM-PROOF-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_proven_proof_count", "PROBLEM-PROVEN-PROOF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_some_proofP", "PROBLEM-HAS-SOME-PROOF?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_some_proven_proofP", "PROBLEM-HAS-SOME-PROVEN-PROOF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_has_some_rejected_proofP", "PROBLEM-HAS-SOME-REJECTED-PROOF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_proofs_lookup", "PROBLEM-PROOFS-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_argument_links_lookup", "PROBLEM-ARGUMENT-LINKS-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_potentially_processedP", "PROBLEM-POTENTIALLY-PROCESSED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "note_problem_potentially_processed", "NOTE-PROBLEM-POTENTIALLY-PROCESSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_indestructibleP", "PROBLEM-INDESTRUCTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_destructibleP", "PROBLEM-DESTRUCTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_destructibility_status", "PROBLEM-DESTRUCTIBILITY-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_min_depth", "PROBLEM-MIN-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_min_proof_depth", "PROBLEM-MIN-PROOF-DEPTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_intuitive_min_transformation_depth", "PROBLEM-INTUITIVE-MIN-TRANSFORMATION-DEPTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_min_transformation_depth", "PROBLEM-MIN-TRANSFORMATION-DEPTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_min_transformation_depth_signature", "PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_backchain_requiredP", "PROBLEM-BACKCHAIN-REQUIRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "add_problem_argument_link", "ADD-PROBLEM-ARGUMENT-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "remove_problem_argument_link", "REMOVE-PROBLEM-ARGUMENT-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "index_problem_argument_link", "INDEX-PROBLEM-ARGUMENT-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "deindex_problem_argument_link", "DEINDEX-PROBLEM-ARGUMENT-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "add_problem_dependent_link", "ADD-PROBLEM-DEPENDENT-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "remove_problem_dependent_link", "REMOVE-PROBLEM-DEPENDENT-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "add_problem_tactic", "ADD-PROBLEM-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "remove_problem_tactic", "REMOVE-PROBLEM-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "add_problem_proof", "ADD-PROBLEM-PROOF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "remove_problem_proof", "REMOVE-PROBLEM-PROOF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "remove_problem_proof_with_bindings", "REMOVE-PROBLEM-PROOF-WITH-BINDINGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "set_problem_min_depth", "SET-PROBLEM-MIN-DEPTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "set_problem_min_proof_depth", "SET-PROBLEM-MIN-PROOF-DEPTH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "set_problem_min_transformation_depth", "SET-PROBLEM-MIN-TRANSFORMATION-DEPTH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "set_problem_min_transformation_depth_signature", "SET-PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "set_root_problem_min_transformation_depth_signature", "SET-ROOT-PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "note_problem_indestructible", "NOTE-PROBLEM-INDESTRUCTIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "note_problem_destructible", "NOTE-PROBLEM-DESTRUCTIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "note_problem_min_transformation_depth_signature", "NOTE-PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_tactical_provability_status", "PROBLEM-TACTICAL-PROVABILITY-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "tactically_good_problem_p", "TACTICALLY-GOOD-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "tactically_no_good_problem_p", "TACTICALLY-NO-GOOD-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "tactically_neutral_problem_p", "TACTICALLY-NEUTRAL-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_tactical_status", "PROBLEM-TACTICAL-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "tactically_new_problem_p", "TACTICALLY-NEW-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "tactically_unexamined_problem_p", "TACTICALLY-UNEXAMINED-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "tactically_examined_problem_p", "TACTICALLY-EXAMINED-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "tactically_possible_problem_p", "TACTICALLY-POSSIBLE-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "tactically_pending_problem_p", "TACTICALLY-PENDING-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "tactically_finished_problem_p", "TACTICALLY-FINISHED-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "tactical_problem_p", "TACTICAL-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "tactically_potentially_possible_problem_p", "TACTICALLY-POTENTIALLY-POSSIBLE-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "tactically_not_potentially_possible_problem_p", "TACTICALLY-NOT-POTENTIALLY-POSSIBLE-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem", "problem_store_all_modules", "PROBLEM-STORE-ALL-MODULES", 1, 0, false);
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    public static SubLObject init_inference_datastructures_problem_file() {
        inference_datastructures_problem.$dtp_problem$ = SubLFiles.defconstant("*DTP-PROBLEM*", (SubLObject)inference_datastructures_problem.$sym0$PROBLEM);
        inference_datastructures_problem.$empty_clauses$ = SubLFiles.deflexical("*EMPTY-CLAUSES*", (SubLObject)(maybeDefault((SubLObject)inference_datastructures_problem.$sym66$_EMPTY_CLAUSES_, inference_datastructures_problem.$empty_clauses$, ()->(ConsesLow.list(clauses.empty_clause())))));
        inference_datastructures_problem.$generalized_tactic_types$ = SubLFiles.deflexical("*GENERALIZED-TACTIC-TYPES*", (SubLObject)inference_datastructures_problem.$list99);
        inference_datastructures_problem.$transformation_depth_computation$ = SubLFiles.defvar("*TRANSFORMATION-DEPTH-COMPUTATION*", (SubLObject)inference_datastructures_problem.$kw208$COUNTERINTUITIVE);
        inference_datastructures_problem.$problem_min_transformation_depth_from_signature_enabledP$ = SubLFiles.defparameter("*PROBLEM-MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE-ENABLED?*", (SubLObject)inference_datastructures_problem.T);
        inference_datastructures_problem.$max_problem_tactics$ = SubLFiles.deflexical("*MAX-PROBLEM-TACTICS*", (SubLObject)inference_datastructures_problem.$int212$10000);
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    public static SubLObject setup_inference_datastructures_problem_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inference_datastructures_problem.$dtp_problem$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_problem.$sym8$PROBLEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inference_datastructures_problem.$list9);
        Structures.def_csetf((SubLObject)inference_datastructures_problem.$sym10$PROB_SUID, (SubLObject)inference_datastructures_problem.$sym11$_CSETF_PROB_SUID);
        Structures.def_csetf((SubLObject)inference_datastructures_problem.$sym12$PROB_STORE, (SubLObject)inference_datastructures_problem.$sym13$_CSETF_PROB_STORE);
        Structures.def_csetf((SubLObject)inference_datastructures_problem.$sym14$PROB_QUERY, (SubLObject)inference_datastructures_problem.$sym15$_CSETF_PROB_QUERY);
        Structures.def_csetf((SubLObject)inference_datastructures_problem.$sym16$PROB_FREE_HL_VARS, (SubLObject)inference_datastructures_problem.$sym17$_CSETF_PROB_FREE_HL_VARS);
        Structures.def_csetf((SubLObject)inference_datastructures_problem.$sym18$PROB_STATUS, (SubLObject)inference_datastructures_problem.$sym19$_CSETF_PROB_STATUS);
        Structures.def_csetf((SubLObject)inference_datastructures_problem.$sym20$PROB_DEPENDENT_LINKS, (SubLObject)inference_datastructures_problem.$sym21$_CSETF_PROB_DEPENDENT_LINKS);
        Structures.def_csetf((SubLObject)inference_datastructures_problem.$sym22$PROB_ARGUMENT_LINKS, (SubLObject)inference_datastructures_problem.$sym23$_CSETF_PROB_ARGUMENT_LINKS);
        Structures.def_csetf((SubLObject)inference_datastructures_problem.$sym24$PROB_TACTICS, (SubLObject)inference_datastructures_problem.$sym25$_CSETF_PROB_TACTICS);
        Structures.def_csetf((SubLObject)inference_datastructures_problem.$sym26$PROB_PROOF_BINDINGS_INDEX, (SubLObject)inference_datastructures_problem.$sym27$_CSETF_PROB_PROOF_BINDINGS_INDEX);
        Structures.def_csetf((SubLObject)inference_datastructures_problem.$sym28$PROB_ARGUMENT_LINK_BINDINGS_INDEX, (SubLObject)inference_datastructures_problem.$sym29$_CSETF_PROB_ARGUMENT_LINK_BINDINGS_INDEX);
        Structures.def_csetf((SubLObject)inference_datastructures_problem.$sym30$PROB_BACKCHAIN_REQUIRED, (SubLObject)inference_datastructures_problem.$sym31$_CSETF_PROB_BACKCHAIN_REQUIRED);
        Structures.def_csetf((SubLObject)inference_datastructures_problem.$sym32$PROB_MEMOIZATION_STATE, (SubLObject)inference_datastructures_problem.$sym33$_CSETF_PROB_MEMOIZATION_STATE);
        Equality.identity((SubLObject)inference_datastructures_problem.$sym0$PROBLEM);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_problem.$dtp_problem$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_problem.$sym51$VISIT_DEFSTRUCT_OBJECT_PROBLEM_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_datastructures_problem.$dtp_problem$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_datastructures_problem.$sym58$SXHASH_PROBLEM_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)inference_datastructures_problem.$sym66$_EMPTY_CLAUSES_);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_problem.$sym69$PROBLEM_MEMOIZATION_STATE, (SubLObject)inference_datastructures_problem.$sym70$WITH_PROBLEM_MEMOIZATION_STATE);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_problem.$sym91$PROBLEM_TACTICS, (SubLObject)inference_datastructures_problem.$sym92$DO_PROBLEM_TACTICS);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_problem.$sym85$DO_PROBLEM_TACTICS_STATUS_MATCH, (SubLObject)inference_datastructures_problem.$sym92$DO_PROBLEM_TACTICS);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_problem.$sym86$DO_PROBLEM_TACTICS_COMPLETENESS_MATCH, (SubLObject)inference_datastructures_problem.$sym92$DO_PROBLEM_TACTICS);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_problem.$sym87$DO_PROBLEM_TACTICS_PREFERENCE_LEVEL_MATCH, (SubLObject)inference_datastructures_problem.$sym92$DO_PROBLEM_TACTICS);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_problem.$sym89$DO_PROBLEM_TACTICS_PRODUCTIVITY_MATCH, (SubLObject)inference_datastructures_problem.$sym92$DO_PROBLEM_TACTICS);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_problem.$sym88$DO_PROBLEM_TACTICS_HL_MODULE_MATCH, (SubLObject)inference_datastructures_problem.$sym92$DO_PROBLEM_TACTICS);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_problem.$sym84$DO_PROBLEM_TACTICS_TYPE_MATCH, (SubLObject)inference_datastructures_problem.$sym92$DO_PROBLEM_TACTICS);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_problem.$sym116$PROBLEM_ARGUMENT_LINKS, (SubLObject)inference_datastructures_problem.$sym117$DO_PROBLEM_ARGUMENT_LINKS);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_problem.$sym121$PROBLEM_DEPENDENT_LINKS, (SubLObject)inference_datastructures_problem.$sym122$DO_PROBLEM_DEPENDENT_LINKS);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_problem.$sym146$PROBLEM_PROOF_BINDINGS_INDEX, (SubLObject)inference_datastructures_problem.$sym149$DO_PROBLEM_PROOFS);
        access_macros.register_macro_helper((SubLObject)inference_datastructures_problem.$sym150$PROOF_HAS_STATUS_, (SubLObject)inference_datastructures_problem.$sym149$DO_PROBLEM_PROOFS);
        return (SubLObject)inference_datastructures_problem.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_inference_datastructures_problem_file();
    }
    
    @Override
	public void initializeVariables() {
        init_inference_datastructures_problem_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_inference_datastructures_problem_file();
    }
    
    static {
        me = (SubLFile)new inference_datastructures_problem();
        inference_datastructures_problem.$dtp_problem$ = null;
        inference_datastructures_problem.$empty_clauses$ = null;
        inference_datastructures_problem.$generalized_tactic_types$ = null;
        inference_datastructures_problem.$transformation_depth_computation$ = null;
        inference_datastructures_problem.$problem_min_transformation_depth_from_signature_enabledP$ = null;
        inference_datastructures_problem.$max_problem_tactics$ = null;
        $sym0$PROBLEM = SubLObjectFactory.makeSymbol("PROBLEM");
        $sym1$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $int2$212 = SubLObjectFactory.makeInteger(212);
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SUID"), SubLObjectFactory.makeSymbol("STORE"), SubLObjectFactory.makeSymbol("QUERY"), SubLObjectFactory.makeSymbol("FREE-HL-VARS"), SubLObjectFactory.makeSymbol("STATUS"), SubLObjectFactory.makeSymbol("DEPENDENT-LINKS"), SubLObjectFactory.makeSymbol("ARGUMENT-LINKS"), SubLObjectFactory.makeSymbol("TACTICS"), SubLObjectFactory.makeSymbol("PROOF-BINDINGS-INDEX"), SubLObjectFactory.makeSymbol("ARGUMENT-LINK-BINDINGS-INDEX"), SubLObjectFactory.makeSymbol("BACKCHAIN-REQUIRED"), SubLObjectFactory.makeSymbol("MEMOIZATION-STATE") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SUID"), SubLObjectFactory.makeKeyword("STORE"), SubLObjectFactory.makeKeyword("QUERY"), SubLObjectFactory.makeKeyword("FREE-HL-VARS"), SubLObjectFactory.makeKeyword("STATUS"), SubLObjectFactory.makeKeyword("DEPENDENT-LINKS"), SubLObjectFactory.makeKeyword("ARGUMENT-LINKS"), SubLObjectFactory.makeKeyword("TACTICS"), SubLObjectFactory.makeKeyword("PROOF-BINDINGS-INDEX"), SubLObjectFactory.makeKeyword("ARGUMENT-LINK-BINDINGS-INDEX"), SubLObjectFactory.makeKeyword("BACKCHAIN-REQUIRED"), SubLObjectFactory.makeKeyword("MEMOIZATION-STATE") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PROB-SUID"), SubLObjectFactory.makeSymbol("PROB-STORE"), SubLObjectFactory.makeSymbol("PROB-QUERY"), SubLObjectFactory.makeSymbol("PROB-FREE-HL-VARS"), SubLObjectFactory.makeSymbol("PROB-STATUS"), SubLObjectFactory.makeSymbol("PROB-DEPENDENT-LINKS"), SubLObjectFactory.makeSymbol("PROB-ARGUMENT-LINKS"), SubLObjectFactory.makeSymbol("PROB-TACTICS"), SubLObjectFactory.makeSymbol("PROB-PROOF-BINDINGS-INDEX"), SubLObjectFactory.makeSymbol("PROB-ARGUMENT-LINK-BINDINGS-INDEX"), SubLObjectFactory.makeSymbol("PROB-BACKCHAIN-REQUIRED"), SubLObjectFactory.makeSymbol("PROB-MEMOIZATION-STATE") });
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-PROB-SUID"), SubLObjectFactory.makeSymbol("_CSETF-PROB-STORE"), SubLObjectFactory.makeSymbol("_CSETF-PROB-QUERY"), SubLObjectFactory.makeSymbol("_CSETF-PROB-FREE-HL-VARS"), SubLObjectFactory.makeSymbol("_CSETF-PROB-STATUS"), SubLObjectFactory.makeSymbol("_CSETF-PROB-DEPENDENT-LINKS"), SubLObjectFactory.makeSymbol("_CSETF-PROB-ARGUMENT-LINKS"), SubLObjectFactory.makeSymbol("_CSETF-PROB-TACTICS"), SubLObjectFactory.makeSymbol("_CSETF-PROB-PROOF-BINDINGS-INDEX"), SubLObjectFactory.makeSymbol("_CSETF-PROB-ARGUMENT-LINK-BINDINGS-INDEX"), SubLObjectFactory.makeSymbol("_CSETF-PROB-BACKCHAIN-REQUIRED"), SubLObjectFactory.makeSymbol("_CSETF-PROB-MEMOIZATION-STATE") });
        $sym7$PRINT_PROBLEM = SubLObjectFactory.makeSymbol("PRINT-PROBLEM");
        $sym8$PROBLEM_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PROBLEM-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-P"));
        $sym10$PROB_SUID = SubLObjectFactory.makeSymbol("PROB-SUID");
        $sym11$_CSETF_PROB_SUID = SubLObjectFactory.makeSymbol("_CSETF-PROB-SUID");
        $sym12$PROB_STORE = SubLObjectFactory.makeSymbol("PROB-STORE");
        $sym13$_CSETF_PROB_STORE = SubLObjectFactory.makeSymbol("_CSETF-PROB-STORE");
        $sym14$PROB_QUERY = SubLObjectFactory.makeSymbol("PROB-QUERY");
        $sym15$_CSETF_PROB_QUERY = SubLObjectFactory.makeSymbol("_CSETF-PROB-QUERY");
        $sym16$PROB_FREE_HL_VARS = SubLObjectFactory.makeSymbol("PROB-FREE-HL-VARS");
        $sym17$_CSETF_PROB_FREE_HL_VARS = SubLObjectFactory.makeSymbol("_CSETF-PROB-FREE-HL-VARS");
        $sym18$PROB_STATUS = SubLObjectFactory.makeSymbol("PROB-STATUS");
        $sym19$_CSETF_PROB_STATUS = SubLObjectFactory.makeSymbol("_CSETF-PROB-STATUS");
        $sym20$PROB_DEPENDENT_LINKS = SubLObjectFactory.makeSymbol("PROB-DEPENDENT-LINKS");
        $sym21$_CSETF_PROB_DEPENDENT_LINKS = SubLObjectFactory.makeSymbol("_CSETF-PROB-DEPENDENT-LINKS");
        $sym22$PROB_ARGUMENT_LINKS = SubLObjectFactory.makeSymbol("PROB-ARGUMENT-LINKS");
        $sym23$_CSETF_PROB_ARGUMENT_LINKS = SubLObjectFactory.makeSymbol("_CSETF-PROB-ARGUMENT-LINKS");
        $sym24$PROB_TACTICS = SubLObjectFactory.makeSymbol("PROB-TACTICS");
        $sym25$_CSETF_PROB_TACTICS = SubLObjectFactory.makeSymbol("_CSETF-PROB-TACTICS");
        $sym26$PROB_PROOF_BINDINGS_INDEX = SubLObjectFactory.makeSymbol("PROB-PROOF-BINDINGS-INDEX");
        $sym27$_CSETF_PROB_PROOF_BINDINGS_INDEX = SubLObjectFactory.makeSymbol("_CSETF-PROB-PROOF-BINDINGS-INDEX");
        $sym28$PROB_ARGUMENT_LINK_BINDINGS_INDEX = SubLObjectFactory.makeSymbol("PROB-ARGUMENT-LINK-BINDINGS-INDEX");
        $sym29$_CSETF_PROB_ARGUMENT_LINK_BINDINGS_INDEX = SubLObjectFactory.makeSymbol("_CSETF-PROB-ARGUMENT-LINK-BINDINGS-INDEX");
        $sym30$PROB_BACKCHAIN_REQUIRED = SubLObjectFactory.makeSymbol("PROB-BACKCHAIN-REQUIRED");
        $sym31$_CSETF_PROB_BACKCHAIN_REQUIRED = SubLObjectFactory.makeSymbol("_CSETF-PROB-BACKCHAIN-REQUIRED");
        $sym32$PROB_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("PROB-MEMOIZATION-STATE");
        $sym33$_CSETF_PROB_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("_CSETF-PROB-MEMOIZATION-STATE");
        $kw34$SUID = SubLObjectFactory.makeKeyword("SUID");
        $kw35$STORE = SubLObjectFactory.makeKeyword("STORE");
        $kw36$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw37$FREE_HL_VARS = SubLObjectFactory.makeKeyword("FREE-HL-VARS");
        $kw38$STATUS = SubLObjectFactory.makeKeyword("STATUS");
        $kw39$DEPENDENT_LINKS = SubLObjectFactory.makeKeyword("DEPENDENT-LINKS");
        $kw40$ARGUMENT_LINKS = SubLObjectFactory.makeKeyword("ARGUMENT-LINKS");
        $kw41$TACTICS = SubLObjectFactory.makeKeyword("TACTICS");
        $kw42$PROOF_BINDINGS_INDEX = SubLObjectFactory.makeKeyword("PROOF-BINDINGS-INDEX");
        $kw43$ARGUMENT_LINK_BINDINGS_INDEX = SubLObjectFactory.makeKeyword("ARGUMENT-LINK-BINDINGS-INDEX");
        $kw44$BACKCHAIN_REQUIRED = SubLObjectFactory.makeKeyword("BACKCHAIN-REQUIRED");
        $kw45$MEMOIZATION_STATE = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE");
        $str46$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw47$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym48$MAKE_PROBLEM = SubLObjectFactory.makeSymbol("MAKE-PROBLEM");
        $kw49$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw50$END = SubLObjectFactory.makeKeyword("END");
        $sym51$VISIT_DEFSTRUCT_OBJECT_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROBLEM-METHOD");
        $kw52$FREE = SubLObjectFactory.makeKeyword("FREE");
        $str53$_Invalid_PROBLEM__s_ = SubLObjectFactory.makeString("<Invalid PROBLEM ~s>");
        $str54$__a_PROBLEM__a__a__s_a_ = SubLObjectFactory.makeString("<~a PROBLEM ~a.~a:~s~a>");
        $str55$_free_ = SubLObjectFactory.makeString(" free=");
        $sym56$VARIABLE_ID = SubLObjectFactory.makeSymbol("VARIABLE-ID");
        $str57$ = SubLObjectFactory.makeString("");
        $sym58$SXHASH_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("SXHASH-PROBLEM-METHOD");
        $sym59$PROBLEM_STORE_P = SubLObjectFactory.makeSymbol("PROBLEM-STORE-P");
        $sym60$CONTEXTUALIZED_DNF_CLAUSES_P = SubLObjectFactory.makeSymbol("CONTEXTUALIZED-DNF-CLAUSES-P");
        $str61$Ignore_the_crazy_problems = SubLObjectFactory.makeString("Ignore the crazy problems");
        $str62$Crazy_amount_of_problems___a__in_ = SubLObjectFactory.makeString("Crazy amount of problems (~a) in store ~a");
        $kw63$NEW = SubLObjectFactory.makeKeyword("NEW");
        $kw64$UNDETERMINED = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $str65$problem_memoization_state = SubLObjectFactory.makeString("problem memoization state");
        $sym66$_EMPTY_CLAUSES_ = SubLObjectFactory.makeSymbol("*EMPTY-CLAUSES*");
        $list67 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym68$WITH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE");
        $sym69$PROBLEM_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("PROBLEM-MEMOIZATION-STATE");
        $sym70$WITH_PROBLEM_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-PROBLEM-MEMOIZATION-STATE");
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw73$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw74$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym75$DO_PROBLEM_QUERY_LITERALS = SubLObjectFactory.makeSymbol("DO-PROBLEM-QUERY-LITERALS");
        $sym76$PROBLEM_QUERY = SubLObjectFactory.makeSymbol("PROBLEM-QUERY");
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TACTIC-VAR"), SubLObjectFactory.makeSymbol("PROBLEM"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("DONE"), SubLObjectFactory.makeSymbol("STATUS"), SubLObjectFactory.makeSymbol("COMPLETENESS"), SubLObjectFactory.makeSymbol("PREFERENCE-LEVEL"), SubLObjectFactory.makeSymbol("HL-MODULE"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("PRODUCTIVITY") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("HL-MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PRODUCTIVITY"));
        $kw79$COMPLETENESS = SubLObjectFactory.makeKeyword("COMPLETENESS");
        $kw80$PREFERENCE_LEVEL = SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL");
        $kw81$HL_MODULE = SubLObjectFactory.makeKeyword("HL-MODULE");
        $kw82$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw83$PRODUCTIVITY = SubLObjectFactory.makeKeyword("PRODUCTIVITY");
        $sym84$DO_PROBLEM_TACTICS_TYPE_MATCH = SubLObjectFactory.makeSymbol("DO-PROBLEM-TACTICS-TYPE-MATCH");
        $sym85$DO_PROBLEM_TACTICS_STATUS_MATCH = SubLObjectFactory.makeSymbol("DO-PROBLEM-TACTICS-STATUS-MATCH");
        $sym86$DO_PROBLEM_TACTICS_COMPLETENESS_MATCH = SubLObjectFactory.makeSymbol("DO-PROBLEM-TACTICS-COMPLETENESS-MATCH");
        $sym87$DO_PROBLEM_TACTICS_PREFERENCE_LEVEL_MATCH = SubLObjectFactory.makeSymbol("DO-PROBLEM-TACTICS-PREFERENCE-LEVEL-MATCH");
        $sym88$DO_PROBLEM_TACTICS_HL_MODULE_MATCH = SubLObjectFactory.makeSymbol("DO-PROBLEM-TACTICS-HL-MODULE-MATCH");
        $sym89$DO_PROBLEM_TACTICS_PRODUCTIVITY_MATCH = SubLObjectFactory.makeSymbol("DO-PROBLEM-TACTICS-PRODUCTIVITY-MATCH");
        $sym90$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym91$PROBLEM_TACTICS = SubLObjectFactory.makeSymbol("PROBLEM-TACTICS");
        $sym92$DO_PROBLEM_TACTICS = SubLObjectFactory.makeSymbol("DO-PROBLEM-TACTICS");
        $sym93$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym94$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym95$COMPLETENESS_P = SubLObjectFactory.makeSymbol("COMPLETENESS-P");
        $sym96$PREFERENCE_LEVEL_P = SubLObjectFactory.makeSymbol("PREFERENCE-LEVEL-P");
        $sym97$PRODUCTIVITY_P = SubLObjectFactory.makeSymbol("PRODUCTIVITY-P");
        $sym98$HL_MODULE_P = SubLObjectFactory.makeSymbol("HL-MODULE-P");
        $list99 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NON-TRANSFORMATION"), SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL"), SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE"), SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION"), SubLObjectFactory.makeKeyword("CONJUNCTIVE"), SubLObjectFactory.makeKeyword("DISJUNCTIVE"), SubLObjectFactory.makeKeyword("LOGICAL"), SubLObjectFactory.makeKeyword("LOGICAL-CONJUNCTIVE"), SubLObjectFactory.makeKeyword("STRUCTURAL-CONJUNCTIVE"), SubLObjectFactory.makeKeyword("META-STRUCTURAL"), SubLObjectFactory.makeKeyword("CONTENT"), SubLObjectFactory.makeKeyword("UNION"), SubLObjectFactory.makeKeyword("SPLIT"), SubLObjectFactory.makeKeyword("JOIN-ORDERED"), SubLObjectFactory.makeKeyword("JOIN") });
        $sym100$GENERALIZED_TACTIC_TYPE_P = SubLObjectFactory.makeSymbol("GENERALIZED-TACTIC-TYPE-P");
        $kw101$NON_TRANSFORMATION = SubLObjectFactory.makeKeyword("NON-TRANSFORMATION");
        $kw102$GENERALIZED_REMOVAL = SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL");
        $kw103$GENERALIZED_REMOVAL_OR_REWRITE = SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE");
        $kw104$CONNECTED_CONJUNCTION = SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION");
        $kw105$CONJUNCTIVE = SubLObjectFactory.makeKeyword("CONJUNCTIVE");
        $kw106$DISJUNCTIVE = SubLObjectFactory.makeKeyword("DISJUNCTIVE");
        $kw107$LOGICAL = SubLObjectFactory.makeKeyword("LOGICAL");
        $kw108$LOGICAL_CONJUNCTIVE = SubLObjectFactory.makeKeyword("LOGICAL-CONJUNCTIVE");
        $kw109$STRUCTURAL_CONJUNCTIVE = SubLObjectFactory.makeKeyword("STRUCTURAL-CONJUNCTIVE");
        $kw110$META_STRUCTURAL = SubLObjectFactory.makeKeyword("META-STRUCTURAL");
        $kw111$CONTENT = SubLObjectFactory.makeKeyword("CONTENT");
        $kw112$UNION = SubLObjectFactory.makeKeyword("UNION");
        $kw113$SPLIT = SubLObjectFactory.makeKeyword("SPLIT");
        $kw114$JOIN_ORDERED = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $kw115$JOIN = SubLObjectFactory.makeKeyword("JOIN");
        $sym116$PROBLEM_ARGUMENT_LINKS = SubLObjectFactory.makeSymbol("PROBLEM-ARGUMENT-LINKS");
        $sym117$DO_PROBLEM_ARGUMENT_LINKS = SubLObjectFactory.makeSymbol("DO-PROBLEM-ARGUMENT-LINKS");
        $list118 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym120$DO_SET_CONTENTS = SubLObjectFactory.makeSymbol("DO-SET-CONTENTS");
        $sym121$PROBLEM_DEPENDENT_LINKS = SubLObjectFactory.makeSymbol("PROBLEM-DEPENDENT-LINKS");
        $sym122$DO_PROBLEM_DEPENDENT_LINKS = SubLObjectFactory.makeSymbol("DO-PROBLEM-DEPENDENT-LINKS");
        $sym123$PROBLEM_LINK_HAS_TYPE_ = SubLObjectFactory.makeSymbol("PROBLEM-LINK-HAS-TYPE?");
        $list124 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN?"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("OPEN?"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw126$OPEN_ = SubLObjectFactory.makeKeyword("OPEN?");
        $sym127$PROBLEM_VAR = SubLObjectFactory.makeUninternedSymbol("PROBLEM-VAR");
        $sym128$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym129$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = SubLObjectFactory.makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");
        $sym130$MAPPED_PROBLEM_PROBLEM = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-PROBLEM");
        $list131 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORTED-PROBLEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym132$LINK = SubLObjectFactory.makeUninternedSymbol("LINK");
        $sym133$PROBLEM_LINK_SUPPORTED_PROBLEM = SubLObjectFactory.makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM");
        $list134 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORTED-INFERENCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym135$LINK = SubLObjectFactory.makeUninternedSymbol("LINK");
        $sym136$PROBLEM_LINK_SUPPORTED_INFERENCE = SubLObjectFactory.makeSymbol("PROBLEM-LINK-SUPPORTED-INFERENCE");
        $list137 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORTING-PROBLEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAP-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym138$LINK = SubLObjectFactory.makeUninternedSymbol("LINK");
        $sym139$DO_PROBLEM_LINK_SUPPORTING_PROBLEMS = SubLObjectFactory.makeSymbol("DO-PROBLEM-LINK-SUPPORTING-PROBLEMS");
        $list140 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROOF-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROOF-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROOF-STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw142$PROOF_STATUS = SubLObjectFactory.makeKeyword("PROOF-STATUS");
        $sym143$PROOF_LIST = SubLObjectFactory.makeUninternedSymbol("PROOF-LIST");
        $sym144$BINDINGS = SubLObjectFactory.makeUninternedSymbol("BINDINGS");
        $sym145$DO_DICTIONARY_CONTENTS = SubLObjectFactory.makeSymbol("DO-DICTIONARY-CONTENTS");
        $sym146$PROBLEM_PROOF_BINDINGS_INDEX = SubLObjectFactory.makeSymbol("PROBLEM-PROOF-BINDINGS-INDEX");
        $sym147$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym148$STATUS_VAR = SubLObjectFactory.makeUninternedSymbol("STATUS-VAR");
        $sym149$DO_PROBLEM_PROOFS = SubLObjectFactory.makeSymbol("DO-PROBLEM-PROOFS");
        $sym150$PROOF_HAS_STATUS_ = SubLObjectFactory.makeSymbol("PROOF-HAS-STATUS?");
        $list151 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym152$STRATEGY = SubLObjectFactory.makeUninternedSymbol("STRATEGY");
        $sym153$DO_PROBLEM_ACTIVE_STRATEGIES = SubLObjectFactory.makeSymbol("DO-PROBLEM-ACTIVE-STRATEGIES");
        $sym154$STRATEGY_INFERENCE = SubLObjectFactory.makeSymbol("STRATEGY-INFERENCE");
        $list155 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym156$STORE = SubLObjectFactory.makeUninternedSymbol("STORE");
        $sym157$PROB = SubLObjectFactory.makeUninternedSymbol("PROB");
        $sym158$PROBLEM_STORE = SubLObjectFactory.makeSymbol("PROBLEM-STORE");
        $sym159$DO_PROBLEM_STORE_INFERENCES = SubLObjectFactory.makeSymbol("DO-PROBLEM-STORE-INFERENCES");
        $sym160$PROBLEM_RELEVANT_TO_INFERENCE_ = SubLObjectFactory.makeSymbol("PROBLEM-RELEVANT-TO-INFERENCE?");
        $list161 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRATEGY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym162$STORE = SubLObjectFactory.makeUninternedSymbol("STORE");
        $sym163$PROB = SubLObjectFactory.makeUninternedSymbol("PROB");
        $sym164$DO_PROBLEM_STORE_STRATEGIES = SubLObjectFactory.makeSymbol("DO-PROBLEM-STORE-STRATEGIES");
        $sym165$PROBLEM_ACTIVE_IN_STRATEGY_ = SubLObjectFactory.makeSymbol("PROBLEM-ACTIVE-IN-STRATEGY?");
        $list166 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRATEGY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym167$INFERENCE = SubLObjectFactory.makeUninternedSymbol("INFERENCE");
        $sym168$DO_PROBLEM_RELEVANT_INFERENCES = SubLObjectFactory.makeSymbol("DO-PROBLEM-RELEVANT-INFERENCES");
        $sym169$DO_INFERENCE_STRATEGIES = SubLObjectFactory.makeSymbol("DO-INFERENCE-STRATEGIES");
        $list170 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRATEGIC-CONTEXT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym171$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list172 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TACTICAL"));
        $sym173$DO_PROBLEM_RELEVANT_STRATEGIES = SubLObjectFactory.makeSymbol("DO-PROBLEM-RELEVANT-STRATEGIES");
        $kw174$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym175$PROBLEM_STATUS_P = SubLObjectFactory.makeSymbol("PROBLEM-STATUS-P");
        $str176$poking_good_status__s_into_proble = SubLObjectFactory.makeString("poking good status ~s into problem ~s");
        $kw177$NEG = SubLObjectFactory.makeKeyword("NEG");
        $list178 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $kw179$POS = SubLObjectFactory.makeKeyword("POS");
        $const180$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $const181$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $str182$The_problem__S_did_not_have_a_sin = SubLObjectFactory.makeString("The problem ~S did not have a single-clause query.");
        $list183 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DNF-CLAUSE"));
        $str184$Found_more_than_one__a_argument_l = SubLObjectFactory.makeString("Found more than one ~a argument link on ~a");
        $str185$Expected__a_to_have_a__a_argument = SubLObjectFactory.makeString("Expected ~a to have a ~a argument link");
        $sym186$PROBLEM_LINK_TYPE_P = SubLObjectFactory.makeSymbol("PROBLEM-LINK-TYPE-P");
        $sym187$_ = SubLObjectFactory.makeSymbol("<");
        $sym188$PROBLEM_SUID = SubLObjectFactory.makeSymbol("PROBLEM-SUID");
        $str189$_a_had_more_than_one_dependent_li = SubLObjectFactory.makeString("~a had more than one dependent link");
        $str190$_a_had_no_dependent_links = SubLObjectFactory.makeString("~a had no dependent links");
        $kw191$ANSWER = SubLObjectFactory.makeKeyword("ANSWER");
        $kw192$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $sym193$TACTIC_POSSIBLE_ = SubLObjectFactory.makeSymbol("TACTIC-POSSIBLE?");
        $sym194$TACTIC_EXECUTED_ = SubLObjectFactory.makeSymbol("TACTIC-EXECUTED?");
        $sym195$TACTIC_DISCARDED_ = SubLObjectFactory.makeSymbol("TACTIC-DISCARDED?");
        $kw196$POSSIBLE = SubLObjectFactory.makeKeyword("POSSIBLE");
        $kw197$EXECUTED = SubLObjectFactory.makeKeyword("EXECUTED");
        $kw198$DISCARDED = SubLObjectFactory.makeKeyword("DISCARDED");
        $sym199$TACTIC_STATUS_P = SubLObjectFactory.makeSymbol("TACTIC-STATUS-P");
        $sym200$STRATEGIC_CONTEXT_P = SubLObjectFactory.makeSymbol("STRATEGIC-CONTEXT-P");
        $kw201$REMOVAL = SubLObjectFactory.makeKeyword("REMOVAL");
        $sym202$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_ = SubLObjectFactory.makeSymbol("PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?");
        $kw203$REJECTED = SubLObjectFactory.makeKeyword("REJECTED");
        $kw204$PROVEN = SubLObjectFactory.makeKeyword("PROVEN");
        $kw205$INDESTRUCTIBLE = SubLObjectFactory.makeKeyword("INDESTRUCTIBLE");
        $kw206$DESTRUCTIBLE = SubLObjectFactory.makeKeyword("DESTRUCTIBLE");
        $kw207$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw208$COUNTERINTUITIVE = SubLObjectFactory.makeKeyword("COUNTERINTUITIVE");
        $kw209$INTUITIVE = SubLObjectFactory.makeKeyword("INTUITIVE");
        $sym210$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym211$PROBLEM_LINK_P = SubLObjectFactory.makeSymbol("PROBLEM-LINK-P");
        $int212$10000 = SubLObjectFactory.makeInteger(10000);
        $sym213$TACTIC_P = SubLObjectFactory.makeSymbol("TACTIC-P");
        $str214$Tried_to_add__s_to__s__which_woul = SubLObjectFactory.makeString("Tried to add ~s to ~s, which would result in more than ~s tactics on ~s");
        $sym215$PROOF_P = SubLObjectFactory.makeSymbol("PROOF-P");
        $sym216$BINDINGS_P = SubLObjectFactory.makeSymbol("BINDINGS-P");
        $sym217$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym218$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $sym219$PROBLEM_QUERY_DEPTH_SIGNATURE_P = SubLObjectFactory.makeSymbol("PROBLEM-QUERY-DEPTH-SIGNATURE-P");
        $sym220$_ = SubLObjectFactory.makeSymbol(">");
        $sym221$CDR = SubLObjectFactory.makeSymbol("CDR");
    }
    
    public static final class $problem_native extends SubLStructNative
    {
        public SubLObject $suid;
        public SubLObject $store;
        public SubLObject $query;
        public SubLObject $free_hl_vars;
        public SubLObject $status;
        public SubLObject $dependent_links;
        public SubLObject $argument_links;
        public SubLObject $tactics;
        public SubLObject $proof_bindings_index;
        public SubLObject $argument_link_bindings_index;
        public SubLObject $backchain_required;
        public SubLObject $memoization_state;
        private static final SubLStructDeclNative structDecl;
        
        public $problem_native() {
            this.$suid = (SubLObject)CommonSymbols.NIL;
            this.$store = (SubLObject)CommonSymbols.NIL;
            this.$query = (SubLObject)CommonSymbols.NIL;
            this.$free_hl_vars = (SubLObject)CommonSymbols.NIL;
            this.$status = (SubLObject)CommonSymbols.NIL;
            this.$dependent_links = (SubLObject)CommonSymbols.NIL;
            this.$argument_links = (SubLObject)CommonSymbols.NIL;
            this.$tactics = (SubLObject)CommonSymbols.NIL;
            this.$proof_bindings_index = (SubLObject)CommonSymbols.NIL;
            this.$argument_link_bindings_index = (SubLObject)CommonSymbols.NIL;
            this.$backchain_required = (SubLObject)CommonSymbols.NIL;
            this.$memoization_state = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$problem_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$suid;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$store;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$query;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$free_hl_vars;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$status;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$dependent_links;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$argument_links;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$tactics;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$proof_bindings_index;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$argument_link_bindings_index;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$backchain_required;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$memoization_state;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$store = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$query = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$free_hl_vars = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$status = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$dependent_links = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$argument_links = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$tactics = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$proof_bindings_index = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$argument_link_bindings_index = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$backchain_required = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$memoization_state = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$problem_native.class, inference_datastructures_problem.$sym0$PROBLEM, inference_datastructures_problem.$sym1$PROBLEM_P, inference_datastructures_problem.$list3, inference_datastructures_problem.$list4, new String[] { "$suid", "$store", "$query", "$free_hl_vars", "$status", "$dependent_links", "$argument_links", "$tactics", "$proof_bindings_index", "$argument_link_bindings_index", "$backchain_required", "$memoization_state" }, inference_datastructures_problem.$list5, inference_datastructures_problem.$list6, inference_datastructures_problem.$sym7$PRINT_PROBLEM);
        }
    }
    
    public static final class $problem_p$UnaryFunction extends UnaryFunction
    {
        public $problem_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROBLEM-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_problem.problem_p(arg1);
        }
    }
    
    public static final class $sxhash_problem_method$UnaryFunction extends UnaryFunction
    {
        public $sxhash_problem_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-PROBLEM-METHOD"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_problem.sxhash_problem_method(arg1);
        }
    }
}

/*

	Total time: 1074 ms
	 synthetic 
*/