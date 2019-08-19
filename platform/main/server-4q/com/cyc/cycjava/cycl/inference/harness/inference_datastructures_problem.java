package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.leviathan;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_datastructures_problem extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem";
    public static String myFingerPrint = "661d4c2903a9af8f683fbd01675f83c5f8edb5f42cb25891f30e37778b08c7d3";
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLSymbol $dtp_problem$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 5500L)
    public static SubLSymbol $empty_clauses$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 9000L)
    private static SubLSymbol $generalized_tactic_types$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 46700L)
    public static SubLSymbol $transformation_depth_computation$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 47100L)
    public static SubLSymbol $problem_min_transformation_depth_from_signature_enabledP$;
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 52300L)
    public static SubLSymbol $max_problem_tactics$;
    private static SubLSymbol $sym0$PROBLEM;
    private static SubLSymbol $sym1$PROBLEM_P;
    private static SubLInteger $int$212;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLList $list6;
    private static SubLSymbol $sym7$PRINT_PROBLEM;
    private static SubLSymbol $sym8$PROBLEM_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list9;
    private static SubLSymbol $sym10$PROB_SUID;
    private static SubLSymbol $sym11$_CSETF_PROB_SUID;
    private static SubLSymbol $sym12$PROB_STORE;
    private static SubLSymbol $sym13$_CSETF_PROB_STORE;
    private static SubLSymbol $sym14$PROB_QUERY;
    private static SubLSymbol $sym15$_CSETF_PROB_QUERY;
    private static SubLSymbol $sym16$PROB_FREE_HL_VARS;
    private static SubLSymbol $sym17$_CSETF_PROB_FREE_HL_VARS;
    private static SubLSymbol $sym18$PROB_STATUS;
    private static SubLSymbol $sym19$_CSETF_PROB_STATUS;
    private static SubLSymbol $sym20$PROB_DEPENDENT_LINKS;
    private static SubLSymbol $sym21$_CSETF_PROB_DEPENDENT_LINKS;
    private static SubLSymbol $sym22$PROB_ARGUMENT_LINKS;
    private static SubLSymbol $sym23$_CSETF_PROB_ARGUMENT_LINKS;
    private static SubLSymbol $sym24$PROB_TACTICS;
    private static SubLSymbol $sym25$_CSETF_PROB_TACTICS;
    private static SubLSymbol $sym26$PROB_PROOF_BINDINGS_INDEX;
    private static SubLSymbol $sym27$_CSETF_PROB_PROOF_BINDINGS_INDEX;
    private static SubLSymbol $sym28$PROB_ARGUMENT_LINK_BINDINGS_INDEX;
    private static SubLSymbol $sym29$_CSETF_PROB_ARGUMENT_LINK_BINDINGS_INDEX;
    private static SubLSymbol $sym30$PROB_BACKCHAIN_REQUIRED;
    private static SubLSymbol $sym31$_CSETF_PROB_BACKCHAIN_REQUIRED;
    private static SubLSymbol $sym32$PROB_MEMOIZATION_STATE;
    private static SubLSymbol $sym33$_CSETF_PROB_MEMOIZATION_STATE;
    private static SubLSymbol $SUID;
    private static SubLSymbol $STORE;
    private static SubLSymbol $QUERY;
    private static SubLSymbol $FREE_HL_VARS;
    private static SubLSymbol $STATUS;
    private static SubLSymbol $DEPENDENT_LINKS;
    private static SubLSymbol $ARGUMENT_LINKS;
    private static SubLSymbol $TACTICS;
    private static SubLSymbol $PROOF_BINDINGS_INDEX;
    private static SubLSymbol $ARGUMENT_LINK_BINDINGS_INDEX;
    private static SubLSymbol $BACKCHAIN_REQUIRED;
    private static SubLSymbol $MEMOIZATION_STATE;
    private static SubLString $str46$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym48$MAKE_PROBLEM;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym51$VISIT_DEFSTRUCT_OBJECT_PROBLEM_METHOD;
    private static SubLSymbol $FREE;
    private static SubLString $str53$_Invalid_PROBLEM__s_;
    private static SubLString $str54$__a_PROBLEM__a__a__s_a_;
    private static SubLString $str55$_free_;
    private static SubLSymbol $sym56$VARIABLE_ID;
    private static SubLString $str57$;
    private static SubLSymbol $sym58$SXHASH_PROBLEM_METHOD;
    private static SubLSymbol $sym59$PROBLEM_STORE_P;
    private static SubLSymbol $sym60$CONTEXTUALIZED_DNF_CLAUSES_P;
    private static SubLString $str61$Ignore_the_crazy_problems;
    private static SubLString $str62$Crazy_amount_of_problems___a__in_;
    private static SubLSymbol $NEW;
    private static SubLSymbol $UNDETERMINED;
    private static SubLString $str65$problem_memoization_state;
    private static SubLSymbol $sym66$_EMPTY_CLAUSES_;
    private static SubLList $list67;
    private static SubLSymbol $sym68$WITH_MEMOIZATION_STATE;
    private static SubLSymbol $sym69$PROBLEM_MEMOIZATION_STATE;
    private static SubLSymbol $sym70$WITH_PROBLEM_MEMOIZATION_STATE;
    private static SubLList $list71;
    private static SubLList $list72;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym75$DO_PROBLEM_QUERY_LITERALS;
    private static SubLSymbol $sym76$PROBLEM_QUERY;
    private static SubLList $list77;
    private static SubLList $list78;
    private static SubLSymbol $COMPLETENESS;
    private static SubLSymbol $PREFERENCE_LEVEL;
    private static SubLSymbol $HL_MODULE;
    private static SubLSymbol $TYPE;
    private static SubLSymbol $PRODUCTIVITY;
    private static SubLSymbol $sym84$DO_PROBLEM_TACTICS_TYPE_MATCH;
    private static SubLSymbol $sym85$DO_PROBLEM_TACTICS_STATUS_MATCH;
    private static SubLSymbol $sym86$DO_PROBLEM_TACTICS_COMPLETENESS_MATCH;
    private static SubLSymbol $sym87$DO_PROBLEM_TACTICS_PREFERENCE_LEVEL_MATCH;
    private static SubLSymbol $sym88$DO_PROBLEM_TACTICS_HL_MODULE_MATCH;
    private static SubLSymbol $sym89$DO_PROBLEM_TACTICS_PRODUCTIVITY_MATCH;
    private static SubLSymbol $sym90$DO_LIST;
    private static SubLSymbol $sym91$PROBLEM_TACTICS;
    private static SubLSymbol $sym92$DO_PROBLEM_TACTICS;
    private static SubLSymbol $sym93$PWHEN;
    private static SubLSymbol $sym94$CAND;
    private static SubLSymbol $sym95$COMPLETENESS_P;
    private static SubLSymbol $sym96$PREFERENCE_LEVEL_P;
    private static SubLSymbol $sym97$PRODUCTIVITY_P;
    private static SubLSymbol $sym98$HL_MODULE_P;
    private static SubLList $list99;
    private static SubLSymbol $sym100$GENERALIZED_TACTIC_TYPE_P;
    private static SubLSymbol $NON_TRANSFORMATION;
    private static SubLSymbol $GENERALIZED_REMOVAL;
    private static SubLSymbol $GENERALIZED_REMOVAL_OR_REWRITE;
    private static SubLSymbol $CONNECTED_CONJUNCTION;
    private static SubLSymbol $CONJUNCTIVE;
    private static SubLSymbol $DISJUNCTIVE;
    private static SubLSymbol $LOGICAL;
    private static SubLSymbol $LOGICAL_CONJUNCTIVE;
    private static SubLSymbol $STRUCTURAL_CONJUNCTIVE;
    private static SubLSymbol $META_STRUCTURAL;
    private static SubLSymbol $CONTENT;
    private static SubLSymbol $UNION;
    private static SubLSymbol $SPLIT;
    private static SubLSymbol $JOIN_ORDERED;
    private static SubLSymbol $JOIN;
    private static SubLSymbol $sym116$PROBLEM_ARGUMENT_LINKS;
    private static SubLSymbol $sym117$DO_PROBLEM_ARGUMENT_LINKS;
    private static SubLList $list118;
    private static SubLList $list119;
    private static SubLSymbol $sym120$DO_SET_CONTENTS;
    private static SubLSymbol $sym121$PROBLEM_DEPENDENT_LINKS;
    private static SubLSymbol $sym122$DO_PROBLEM_DEPENDENT_LINKS;
    private static SubLSymbol $sym123$PROBLEM_LINK_HAS_TYPE_;
    private static SubLList $list124;
    private static SubLList $list125;
    private static SubLSymbol $OPEN_;
    private static SubLSymbol $sym127$PROBLEM_VAR;
    private static SubLSymbol $sym128$CLET;
    private static SubLSymbol $sym129$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS;
    private static SubLSymbol $sym130$MAPPED_PROBLEM_PROBLEM;
    private static SubLList $list131;
    private static SubLSymbol $sym132$LINK;
    private static SubLSymbol $sym133$PROBLEM_LINK_SUPPORTED_PROBLEM;
    private static SubLList $list134;
    private static SubLSymbol $sym135$LINK;
    private static SubLSymbol $sym136$PROBLEM_LINK_SUPPORTED_INFERENCE;
    private static SubLList $list137;
    private static SubLSymbol $sym138$LINK;
    private static SubLSymbol $sym139$DO_PROBLEM_LINK_SUPPORTING_PROBLEMS;
    private static SubLList $list140;
    private static SubLList $list141;
    private static SubLSymbol $PROOF_STATUS;
    private static SubLSymbol $sym143$PROOF_LIST;
    private static SubLSymbol $sym144$BINDINGS;
    private static SubLSymbol $sym145$DO_DICTIONARY_CONTENTS;
    private static SubLSymbol $sym146$PROBLEM_PROOF_BINDINGS_INDEX;
    private static SubLSymbol $sym147$IGNORE;
    private static SubLSymbol $sym148$STATUS_VAR;
    private static SubLSymbol $sym149$DO_PROBLEM_PROOFS;
    private static SubLSymbol $sym150$PROOF_HAS_STATUS_;
    private static SubLList $list151;
    private static SubLSymbol $sym152$STRATEGY;
    private static SubLSymbol $sym153$DO_PROBLEM_ACTIVE_STRATEGIES;
    private static SubLSymbol $sym154$STRATEGY_INFERENCE;
    private static SubLList $list155;
    private static SubLSymbol $sym156$STORE;
    private static SubLSymbol $sym157$PROB;
    private static SubLSymbol $sym158$PROBLEM_STORE;
    private static SubLSymbol $sym159$DO_PROBLEM_STORE_INFERENCES;
    private static SubLSymbol $sym160$PROBLEM_RELEVANT_TO_INFERENCE_;
    private static SubLList $list161;
    private static SubLSymbol $sym162$STORE;
    private static SubLSymbol $sym163$PROB;
    private static SubLSymbol $sym164$DO_PROBLEM_STORE_STRATEGIES;
    private static SubLSymbol $sym165$PROBLEM_ACTIVE_IN_STRATEGY_;
    private static SubLList $list166;
    private static SubLSymbol $sym167$INFERENCE;
    private static SubLSymbol $sym168$DO_PROBLEM_RELEVANT_INFERENCES;
    private static SubLSymbol $sym169$DO_INFERENCE_STRATEGIES;
    private static SubLList $list170;
    private static SubLSymbol $sym171$PROGN;
    private static SubLList $list172;
    private static SubLSymbol $sym173$DO_PROBLEM_RELEVANT_STRATEGIES;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $sym175$PROBLEM_STATUS_P;
    private static SubLString $str176$poking_good_status__s_into_proble;
    private static SubLSymbol $NEG;
    private static SubLList $list178;
    private static SubLSymbol $POS;
    private static SubLObject $$ist;
    private static SubLObject $$InferencePSC;
    private static SubLString $str182$The_problem__S_did_not_have_a_sin;
    private static SubLList $list183;
    private static SubLString $str184$Found_more_than_one__a_argument_l;
    private static SubLString $str185$Expected__a_to_have_a__a_argument;
    private static SubLSymbol $sym186$PROBLEM_LINK_TYPE_P;
    private static SubLSymbol $sym187$_;
    private static SubLSymbol $sym188$PROBLEM_SUID;
    private static SubLString $str189$_a_had_more_than_one_dependent_li;
    private static SubLString $str190$_a_had_no_dependent_links;
    private static SubLSymbol $ANSWER;
    private static SubLSymbol $TRANSFORMATION;
    private static SubLSymbol $sym193$TACTIC_POSSIBLE_;
    private static SubLSymbol $sym194$TACTIC_EXECUTED_;
    private static SubLSymbol $sym195$TACTIC_DISCARDED_;
    private static SubLSymbol $POSSIBLE;
    private static SubLSymbol $EXECUTED;
    private static SubLSymbol $DISCARDED;
    private static SubLSymbol $sym199$TACTIC_STATUS_P;
    private static SubLSymbol $sym200$STRATEGIC_CONTEXT_P;
    private static SubLSymbol $REMOVAL;
    private static SubLSymbol $sym202$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_;
    private static SubLSymbol $REJECTED;
    private static SubLSymbol $PROVEN;
    private static SubLSymbol $INDESTRUCTIBLE;
    private static SubLSymbol $DESTRUCTIBLE;
    private static SubLSymbol $UNKNOWN;
    private static SubLSymbol $COUNTERINTUITIVE;
    private static SubLSymbol $INTUITIVE;
    private static SubLSymbol $sym210$_EXIT;
    private static SubLSymbol $sym211$PROBLEM_LINK_P;
    private static SubLInteger $int$10000;
    private static SubLSymbol $sym213$TACTIC_P;
    private static SubLString $str214$Tried_to_add__s_to__s__which_woul;
    private static SubLSymbol $sym215$PROOF_P;
    private static SubLSymbol $sym216$BINDINGS_P;
    private static SubLSymbol $sym217$NON_NEGATIVE_INTEGER_P;
    private static SubLSymbol $sym218$INFERENCE_P;
    private static SubLSymbol $sym219$PROBLEM_QUERY_DEPTH_SIGNATURE_P;
    private static SubLSymbol $sym220$_;
    private static SubLSymbol $sym221$CDR;

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject problem_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_problem(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject problem_p(SubLObject v_object) {
        return (v_object.getClass() == $problem_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject prob_suid(SubLObject v_object) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject prob_store(SubLObject v_object) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject prob_query(SubLObject v_object) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject prob_free_hl_vars(SubLObject v_object) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject prob_status(SubLObject v_object) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject prob_dependent_links(SubLObject v_object) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject prob_argument_links(SubLObject v_object) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.getField8();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject prob_tactics(SubLObject v_object) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.getField9();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject prob_proof_bindings_index(SubLObject v_object) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.getField10();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject prob_argument_link_bindings_index(SubLObject v_object) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.getField11();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject prob_backchain_required(SubLObject v_object) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.getField12();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject prob_memoization_state(SubLObject v_object) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.getField13();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject _csetf_prob_suid(SubLObject v_object, SubLObject value) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject _csetf_prob_store(SubLObject v_object, SubLObject value) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject _csetf_prob_query(SubLObject v_object, SubLObject value) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject _csetf_prob_free_hl_vars(SubLObject v_object, SubLObject value) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject _csetf_prob_status(SubLObject v_object, SubLObject value) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject _csetf_prob_dependent_links(SubLObject v_object, SubLObject value) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject _csetf_prob_argument_links(SubLObject v_object, SubLObject value) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.setField8(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject _csetf_prob_tactics(SubLObject v_object, SubLObject value) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.setField9(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject _csetf_prob_proof_bindings_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.setField10(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject _csetf_prob_argument_link_bindings_index(SubLObject v_object, SubLObject value) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.setField11(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject _csetf_prob_backchain_required(SubLObject v_object, SubLObject value) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.setField12(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject _csetf_prob_memoization_state(SubLObject v_object, SubLObject value) {
        assert NIL != problem_p(v_object) : v_object;
        return v_object.setField13(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject make_problem(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $problem_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUID)) {
                _csetf_prob_suid(v_new, current_value);
            } else if (pcase_var.eql($STORE)) {
                _csetf_prob_store(v_new, current_value);
            } else if (pcase_var.eql($QUERY)) {
                _csetf_prob_query(v_new, current_value);
            } else if (pcase_var.eql($FREE_HL_VARS)) {
                _csetf_prob_free_hl_vars(v_new, current_value);
            } else if (pcase_var.eql($STATUS)) {
                _csetf_prob_status(v_new, current_value);
            } else if (pcase_var.eql($DEPENDENT_LINKS)) {
                _csetf_prob_dependent_links(v_new, current_value);
            } else if (pcase_var.eql($ARGUMENT_LINKS)) {
                _csetf_prob_argument_links(v_new, current_value);
            } else if (pcase_var.eql($TACTICS)) {
                _csetf_prob_tactics(v_new, current_value);
            } else if (pcase_var.eql($PROOF_BINDINGS_INDEX)) {
                _csetf_prob_proof_bindings_index(v_new, current_value);
            } else if (pcase_var.eql($ARGUMENT_LINK_BINDINGS_INDEX)) {
                _csetf_prob_argument_link_bindings_index(v_new, current_value);
            } else if (pcase_var.eql($BACKCHAIN_REQUIRED)) {
                _csetf_prob_backchain_required(v_new, current_value);
            } else if (pcase_var.eql($MEMOIZATION_STATE)) {
                _csetf_prob_memoization_state(v_new, current_value);
            } else {
                Errors.error($str46$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject visit_defstruct_problem(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym48$MAKE_PROBLEM, TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $SUID, prob_suid(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $STORE, prob_store(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $QUERY, prob_query(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $FREE_HL_VARS, prob_free_hl_vars(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $STATUS, prob_status(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $DEPENDENT_LINKS, prob_dependent_links(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ARGUMENT_LINKS, prob_argument_links(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $TACTICS, prob_tactics(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $PROOF_BINDINGS_INDEX, prob_proof_bindings_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $ARGUMENT_LINK_BINDINGS_INDEX, prob_argument_link_bindings_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $BACKCHAIN_REQUIRED, prob_backchain_required(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MEMOIZATION_STATE, prob_memoization_state(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym48$MAKE_PROBLEM, TWELVE_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1200L)
    public static SubLObject visit_defstruct_object_problem_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_problem(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 2900L)
    public static SubLObject valid_problem_p(SubLObject v_object) {
        return makeBoolean(NIL != problem_p(v_object) && NIL == problem_invalid_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 3000L)
    public static SubLObject problem_invalid_p(SubLObject problem) {
        return Equality.eq($FREE, problem_status(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 3200L)
    public static SubLObject print_problem(SubLObject v_object, SubLObject stream, SubLObject depth) {
        if (NIL != problem_invalid_p(v_object)) {
            PrintLow.format(stream, $str53$_Invalid_PROBLEM__s_, prob_suid(v_object));
        } else {
            PrintLow.format(stream, $str54$__a_PROBLEM__a__a__s_a_, new SubLObject[] { problem_status(v_object), inference_datastructures_problem_store.problem_store_suid(problem_store(v_object)), problem_suid(v_object), problem_query(v_object),
                    (NIL != problem_free_hl_vars(v_object)) ? Sequences.cconcatenate($str55$_free_, format_nil.format_nil_a_no_copy(Mapping.mapcar($sym56$VARIABLE_ID, problem_free_hl_vars(v_object)))) : $str57$ });
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 3700L)
    public static SubLObject sxhash_problem_method(SubLObject v_object) {
        return prob_suid(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 3800L)
    public static SubLObject new_problem(SubLObject store, SubLObject query, SubLObject free_hl_vars) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        enforceType(query, $sym60$CONTEXTUALIZED_DNF_CLAUSES_P);
        if (NIL == inference_datastructures_problem_store.problem_identity_depends_on_free_hl_varsP(store)) {
            free_hl_vars = NIL;
        }
        leviathan.note_new_problem_created();
        if (NIL != control_vars.$inference_debugP$.getDynamicValue(thread) && NIL != inference_datastructures_problem_store.problem_store_crazy_max_problem_count_exactly_reachedP(store)) {
            Errors.cerror($str61$Ignore_the_crazy_problems, $str62$Crazy_amount_of_problems___a__in_, inference_datastructures_problem_store.problem_store_problem_count(store), store);
        }
        SubLObject problem = make_problem(UNPROVIDED);
        SubLObject suid = inference_datastructures_problem_store.problem_store_new_problem_id(store);
        inference_metrics.increment_problem_historical_count();
        if (NIL != inference_datastructures_problem_query.problem_query_has_single_literal_p(query)) {
            inference_metrics.increment_single_literal_problem_historical_count();
        }
        _csetf_prob_suid(problem, suid);
        _csetf_prob_store(problem, store);
        _csetf_prob_query(problem, query);
        _csetf_prob_free_hl_vars(problem, free_hl_vars);
        set_problem_status(problem, $NEW);
        _csetf_prob_argument_links(problem, set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQ)));
        _csetf_prob_dependent_links(problem, set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQ)));
        _csetf_prob_tactics(problem, NIL);
        _csetf_prob_proof_bindings_index(problem, dictionary_contents.new_dictionary_contents(ZERO_INTEGER, Symbols.symbol_function(EQUAL)));
        _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.new_dictionary_contents(ZERO_INTEGER, Symbols.symbol_function(EQUAL)));
        _csetf_prob_backchain_required(problem, $UNDETERMINED);
        _csetf_prob_memoization_state(problem, memoization_state.new_memoization_state($str65$problem_memoization_state, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        inference_datastructures_problem_store.add_problem_store_problem(store, problem);
        inference_worker.note_problem_created(problem);
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 5500L)
    public static SubLObject with_problem_memoization_state(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list67);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list67);
        problem = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym68$WITH_MEMOIZATION_STATE, list(list($sym69$PROBLEM_MEMOIZATION_STATE, problem)), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list67);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 5700L)
    public static SubLObject problem_memoization_state(SubLObject problem) {
        return prob_memoization_state(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 5900L)
    public static SubLObject do_problem_literals(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list71);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject sense_var = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list71);
        asent_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list71);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list71);
        sense_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list71);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list71);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list71);
            if (NIL == conses_high.member(current_$1, $list72, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list71);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym75$DO_PROBLEM_QUERY_LITERALS, list(asent_var, mt_var, sense_var, list($sym76$PROBLEM_QUERY, problem), $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 6100L)
    public static SubLObject do_problem_tactics(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list77);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject tactic_var = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list77);
        tactic_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list77);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list77);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list77);
            if (NIL == conses_high.member(current_$2, $list78, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list77);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject status_tail = cdestructuring_bind.property_list_member($STATUS, current);
        SubLObject status = (NIL != status_tail) ? conses_high.cadr(status_tail) : NIL;
        SubLObject completeness_tail = cdestructuring_bind.property_list_member($COMPLETENESS, current);
        SubLObject completeness = (NIL != completeness_tail) ? conses_high.cadr(completeness_tail) : NIL;
        SubLObject preference_level_tail = cdestructuring_bind.property_list_member($PREFERENCE_LEVEL, current);
        SubLObject preference_level = (NIL != preference_level_tail) ? conses_high.cadr(preference_level_tail) : NIL;
        SubLObject hl_module_tail = cdestructuring_bind.property_list_member($HL_MODULE, current);
        SubLObject hl_module = (NIL != hl_module_tail) ? conses_high.cadr(hl_module_tail) : NIL;
        SubLObject type_tail = cdestructuring_bind.property_list_member($TYPE, current);
        SubLObject type = (NIL != type_tail) ? conses_high.cadr(type_tail) : NIL;
        SubLObject productivity_tail = cdestructuring_bind.property_list_member($PRODUCTIVITY, current);
        SubLObject productivity = (NIL != productivity_tail) ? conses_high.cadr(productivity_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject filter_forms = NIL;
        if (NIL != type) {
            filter_forms = cons(list($sym84$DO_PROBLEM_TACTICS_TYPE_MATCH, tactic_var, type), filter_forms);
        }
        if (NIL != status) {
            filter_forms = cons(list($sym85$DO_PROBLEM_TACTICS_STATUS_MATCH, tactic_var, status), filter_forms);
        }
        if (NIL != completeness) {
            filter_forms = cons(list($sym86$DO_PROBLEM_TACTICS_COMPLETENESS_MATCH, tactic_var, completeness), filter_forms);
        }
        if (NIL != preference_level) {
            filter_forms = cons(list($sym87$DO_PROBLEM_TACTICS_PREFERENCE_LEVEL_MATCH, tactic_var, preference_level), filter_forms);
        }
        if (NIL != hl_module) {
            filter_forms = cons(list($sym88$DO_PROBLEM_TACTICS_HL_MODULE_MATCH, tactic_var, hl_module), filter_forms);
        }
        if (NIL != productivity) {
            filter_forms = cons(list($sym89$DO_PROBLEM_TACTICS_PRODUCTIVITY_MATCH, tactic_var, productivity), filter_forms);
        }
        filter_forms = Sequences.nreverse(filter_forms);
        if (NIL == filter_forms) {
            return listS($sym90$DO_LIST, list(tactic_var, list($sym91$PROBLEM_TACTICS, problem), $DONE, done), append(body, NIL));
        }
        return list($sym92$DO_PROBLEM_TACTICS, list(tactic_var, problem, $DONE, done), listS($sym93$PWHEN, (NIL != list_utilities.singletonP(filter_forms)) ? filter_forms.first() : reader.bq_cons($sym94$CAND, append(filter_forms, NIL)), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 7400L)
    public static SubLObject problem_tactics(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        return prob_tactics(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 7500L)
    public static SubLObject do_problem_tactics_status_match(SubLObject tactic, SubLObject status_spec) {
        return makeBoolean(NIL == status_spec || NIL != inference_datastructures_tactic.tactic_has_statusP(tactic, status_spec));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 7700L)
    public static SubLObject do_problem_tactics_completeness_match(SubLObject tactic, SubLObject completeness_spec) {
        if (NIL == completeness_spec) {
            return T;
        }
        assert NIL != inference_datastructures_enumerated_types.completeness_p(completeness_spec) : completeness_spec;
        return Equality.eq(completeness_spec, inference_datastructures_tactic.tactic_completeness(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 8000L)
    public static SubLObject do_problem_tactics_preference_level_match(SubLObject tactic, SubLObject preference_level_spec) {
        if (NIL == preference_level_spec) {
            return T;
        }
        assert NIL != preference_modules.preference_level_p(preference_level_spec) : preference_level_spec;
        return Equality.eq(preference_level_spec, inference_datastructures_tactic.tactic_preference_level(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 8400L)
    public static SubLObject do_problem_tactics_productivity_match(SubLObject tactic, SubLObject productivity_spec) {
        if (NIL == productivity_spec) {
            return T;
        }
        assert NIL != inference_datastructures_enumerated_types.productivity_p(productivity_spec) : productivity_spec;
        return inference_datastructures_enumerated_types.productivity_E(productivity_spec, inference_datastructures_tactic.tactic_productivity(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 8700L)
    public static SubLObject do_problem_tactics_hl_module_match(SubLObject tactic, SubLObject hl_module_spec) {
        if (NIL == hl_module_spec) {
            return T;
        }
        assert NIL != inference_modules.hl_module_p(hl_module_spec) : hl_module_spec;
        return Equality.eq(hl_module_spec, inference_datastructures_tactic.tactic_hl_module(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 9500L)
    public static SubLObject generalized_tactic_type_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_enumerated_types.tactic_type_p(v_object) || NIL != list_utilities.member_eqP(v_object, $generalized_tactic_types$.getGlobalValue()));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 9700L)
    public static SubLObject do_problem_tactics_type_match(SubLObject tactic, SubLObject type_spec) {
        return tactic_matches_type_specP(tactic, type_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 9900L)
    public static SubLObject tactic_matches_type_specP(SubLObject tactic, SubLObject type_spec) {
        if (NIL == type_spec) {
            return T;
        }
        assert NIL != generalized_tactic_type_p(type_spec) : type_spec;
        if (type_spec.eql($NON_TRANSFORMATION)) {
            return makeBoolean(NIL == inference_worker_transformation.transformation_tactic_p(tactic));
        }
        if (type_spec.eql($GENERALIZED_REMOVAL)) {
            return inference_worker_removal.generalized_removal_tactic_p(tactic);
        }
        if (type_spec.eql($GENERALIZED_REMOVAL_OR_REWRITE)) {
            return makeBoolean(NIL != inference_worker_removal.generalized_removal_tactic_p(tactic) || NIL != inference_worker_rewrite.rewrite_tactic_p(tactic));
        }
        if (type_spec.eql($CONNECTED_CONJUNCTION)) {
            return inference_worker.connected_conjunction_tactic_p(tactic);
        }
        if (type_spec.eql($CONJUNCTIVE)) {
            return inference_worker.conjunctive_tactic_p(tactic);
        }
        if (type_spec.eql($DISJUNCTIVE)) {
            return inference_worker.disjunctive_tactic_p(tactic);
        }
        if (type_spec.eql($LOGICAL)) {
            return inference_worker.logical_tactic_p(tactic);
        }
        if (type_spec.eql($LOGICAL_CONJUNCTIVE)) {
            return inference_worker.logical_conjunctive_tactic_p(tactic);
        }
        if (type_spec.eql($STRUCTURAL_CONJUNCTIVE)) {
            return inference_worker.logical_conjunctive_tactic_p(tactic);
        }
        if (type_spec.eql($META_STRUCTURAL)) {
            return inference_worker.meta_structural_tactic_p(tactic);
        }
        if (type_spec.eql($CONTENT)) {
            return inference_worker.content_tactic_p(tactic);
        }
        if (type_spec.eql($UNION)) {
            return inference_worker_union.union_tactic_p(tactic);
        }
        if (type_spec.eql($SPLIT)) {
            return inference_worker_split.split_tactic_p(tactic);
        }
        if (type_spec.eql($JOIN_ORDERED)) {
            return inference_worker_join_ordered.join_ordered_tactic_p(tactic);
        }
        if (type_spec.eql($JOIN)) {
            return inference_worker_join.join_tactic_p(tactic);
        }
        return Equality.eq(type_spec, inference_datastructures_tactic.tactic_type(tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 11400L)
    public static SubLObject tactic_matches_any_of_type_specsP(SubLObject tactic, SubLObject type_specs) {
        SubLObject cdolist_list_var = type_specs;
        SubLObject type_spec = NIL;
        type_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != tactic_matches_type_specP(tactic, type_spec)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            type_spec = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 11600L)
    public static SubLObject problem_argument_links(SubLObject problem) {
        return prob_argument_links(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 11700L)
    public static SubLObject problem_all_argument_links(SubLObject problem) {
        return set_contents.set_contents_element_list(prob_argument_links(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 11800L)
    public static SubLObject do_problem_dependent_links(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list118);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_var = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list118);
        link_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list118);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list118);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list118);
            if (NIL == conses_high.member(current_$3, $list119, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list118);
        }
        SubLObject type_tail = cdestructuring_bind.property_list_member($TYPE, current);
        SubLObject type = (NIL != type_tail) ? conses_high.cadr(type_tail) : NIL;
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        if (NIL == type) {
            return listS($sym120$DO_SET_CONTENTS, list(link_var, list($sym121$PROBLEM_DEPENDENT_LINKS, problem), $DONE, done), append(body, NIL));
        }
        return list($sym122$DO_PROBLEM_DEPENDENT_LINKS, list(link_var, problem, $DONE, done), listS($sym93$PWHEN, list($sym123$PROBLEM_LINK_HAS_TYPE_, link_var, type), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 12200L)
    public static SubLObject problem_dependent_links(SubLObject problem) {
        return prob_dependent_links(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 12300L)
    public static SubLObject problem_all_dependent_links(SubLObject problem) {
        return set_contents.set_contents_element_list(problem_dependent_links(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 12500L)
    public static SubLObject do_problem_dependent_link_interpretations(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list124);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_var = NIL;
        SubLObject mapped_problem_var = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list124);
        link_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list124);
        mapped_problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list124);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list124);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list124);
            if (NIL == conses_high.member(current_$4, $list125, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list124);
        }
        SubLObject type_tail = cdestructuring_bind.property_list_member($TYPE, current);
        SubLObject type = (NIL != type_tail) ? conses_high.cadr(type_tail) : NIL;
        SubLObject openP_tail = cdestructuring_bind.property_list_member($OPEN_, current);
        SubLObject openP = (NIL != openP_tail) ? conses_high.cadr(openP_tail) : NIL;
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject problem_var = $sym127$PROBLEM_VAR;
        return list($sym128$CLET, list(list(problem_var, problem)), list($sym122$DO_PROBLEM_DEPENDENT_LINKS, list(link_var, problem, $TYPE, type, $DONE, done),
                list($sym129$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, list(mapped_problem_var, link_var, $OPEN_, openP, $DONE, done), listS($sym93$PWHEN, list(EQ, problem_var, list($sym130$MAPPED_PROBLEM_PROBLEM, mapped_problem_var)), append(body, NIL)))));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 13200L)
    public static SubLObject do_problem_supported_problems(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list131);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject supported_problem_var = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list131);
        supported_problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list131);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list131);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list131);
            if (NIL == conses_high.member(current_$5, $list72, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list131);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject link = $sym132$LINK;
        return list($sym122$DO_PROBLEM_DEPENDENT_LINKS, list(link, problem, $DONE, done), list($sym128$CLET, list(list(supported_problem_var, list($sym133$PROBLEM_LINK_SUPPORTED_PROBLEM, link))), listS($sym93$PWHEN, supported_problem_var, append(body, NIL))));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 13600L)
    public static SubLObject do_problem_supported_inferences(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list134);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject supported_inference_var = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list134);
        supported_inference_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list134);
        problem = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject link = $sym135$LINK;
            return list($sym122$DO_PROBLEM_DEPENDENT_LINKS, list(link, problem), list($sym128$CLET, list(list(supported_inference_var, list($sym136$PROBLEM_LINK_SUPPORTED_INFERENCE, link))), listS($sym93$PWHEN, supported_inference_var, append(body, NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list134);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 14000L)
    public static SubLObject do_problem_supporting_problems(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list137);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_problem_var = NIL;
        SubLObject variable_map_var = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list137);
        supporting_problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list137);
        variable_map_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list137);
        problem = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject link = $sym138$LINK;
            return list($sym117$DO_PROBLEM_ARGUMENT_LINKS, list(link, problem), listS($sym139$DO_PROBLEM_LINK_SUPPORTING_PROBLEMS, list(supporting_problem_var, variable_map_var, link), append(body, NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list137);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 14300L)
    public static SubLObject do_problem_proofs(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list140);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject proof_var = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list140);
        proof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list140);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list140);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list140);
            if (NIL == conses_high.member(current_$6, $list141, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list140);
        }
        SubLObject proof_status_tail = cdestructuring_bind.property_list_member($PROOF_STATUS, current);
        SubLObject proof_status = (NIL != proof_status_tail) ? conses_high.cadr(proof_status_tail) : NIL;
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject proof_list = $sym143$PROOF_LIST;
        SubLObject v_bindings = $sym144$BINDINGS;
        if (NIL == proof_status) {
            return list($sym145$DO_DICTIONARY_CONTENTS, list(v_bindings, proof_list, list($sym146$PROBLEM_PROOF_BINDINGS_INDEX, problem), $DONE, done), list($sym147$IGNORE, v_bindings), listS($sym90$DO_LIST, list(proof_var, proof_list, $DONE, done), append(body, NIL)));
        }
        SubLObject status_var = $sym148$STATUS_VAR;
        return list($sym128$CLET, list(list(status_var, proof_status)), list($sym149$DO_PROBLEM_PROOFS, list(proof_var, problem, $DONE, done), listS($sym93$PWHEN, list($sym150$PROOF_HAS_STATUS_, proof_var, status_var), append(body, NIL))));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 14900L)
    public static SubLObject problem_proof_bindings_index(SubLObject problem) {
        return prob_proof_bindings_index(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 15000L)
    public static SubLObject proof_has_statusP(SubLObject proof, SubLObject status) {
        if (NIL == status) {
            return T;
        }
        return Equality.eq(status, inference_datastructures_proof.proof_status(proof));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 15300L)
    public static SubLObject do_problem_active_inferences(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list151);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_var = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list151);
        inference_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list151);
        problem = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject strategy = $sym152$STRATEGY;
            return list($sym153$DO_PROBLEM_ACTIVE_STRATEGIES, list(strategy, problem), listS($sym128$CLET, list(list(inference_var, list($sym154$STRATEGY_INFERENCE, strategy))), append(body, NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list151);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 15700L)
    public static SubLObject do_problem_relevant_inferences(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list155);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_var = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list155);
        inference_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list155);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list155);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list155);
            if (NIL == conses_high.member(current_$7, $list72, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list155);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject store = $sym156$STORE;
        SubLObject prob = $sym157$PROB;
        return list($sym128$CLET, list(list(prob, problem), list(store, list($sym158$PROBLEM_STORE, prob))),
                list($sym159$DO_PROBLEM_STORE_INFERENCES, list(inference_var, store, $DONE, done), listS($sym93$PWHEN, list($sym160$PROBLEM_RELEVANT_TO_INFERENCE_, prob, inference_var), append(body, NIL))));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 16100L)
    public static SubLObject do_problem_active_strategies(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list161);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy_var = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list161);
        strategy_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list161);
        problem = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject store = $sym162$STORE;
            SubLObject prob = $sym163$PROB;
            return list($sym128$CLET, list(list(prob, problem), list(store, list($sym158$PROBLEM_STORE, prob))), list($sym164$DO_PROBLEM_STORE_STRATEGIES, list(strategy_var, store), listS($sym93$PWHEN, list($sym165$PROBLEM_ACTIVE_IN_STRATEGY_, prob, strategy_var), append(body, NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list161);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 16600L)
    public static SubLObject do_problem_relevant_strategies(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list166);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy_var = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list166);
        strategy_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list166);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list166);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list166);
            if (NIL == conses_high.member(current_$8, $list72, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list166);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject inference = $sym167$INFERENCE;
        return list($sym168$DO_PROBLEM_RELEVANT_INFERENCES, list(inference, problem, $DONE, done), listS($sym169$DO_INFERENCE_STRATEGIES, list(strategy_var, inference), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 17000L)
    public static SubLObject do_problem_relevant_strategic_contexts(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list170);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategic_context_var = NIL;
        SubLObject problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list170);
        strategic_context_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list170);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list170);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list170);
            if (NIL == conses_high.member(current_$9, $list72, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list170);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return list($sym171$PROGN, listS($sym128$CLET, list(reader.bq_cons(strategic_context_var, $list172)), append(body, NIL)), listS($sym173$DO_PROBLEM_RELEVANT_STRATEGIES, list(strategic_context_var, problem, $DONE, done), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 17200L)
    public static SubLObject destroy_problem(SubLObject problem) {
        if (NIL != valid_problem_p(problem)) {
            note_problem_invalid(problem);
            SubLObject set_contents_var = problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, argument_link) && NIL != inference_datastructures_problem_link.valid_problem_link_p(argument_link)) {
                    inference_datastructures_problem_link.destroy_problem_link(argument_link);
                }
            }
            set_contents_var = problem_dependent_links(problem);
            SubLObject dependent_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                dependent_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                    if (NIL != inference_worker_restriction.restriction_link_p(dependent_link)) {
                        inference_worker_join_ordered.note_all_triggering_proofs_processed(dependent_link);
                    }
                    if (NIL != inference_datastructures_problem_link.valid_problem_link_p(dependent_link)) {
                        inference_datastructures_problem_link.destroy_problem_link(dependent_link);
                    }
                }
            }
            if (NIL != problem_potentially_processedP(problem)) {
                inference_datastructures_problem_store.problem_store_note_problem_unprocessed(problem_store(problem), problem);
            }
            SubLObject store = problem_store(problem);
            inference_datastructures_problem_store.remove_problem_store_problem(store, problem);
            SubLObject store2 = problem_store(problem);
            SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store2);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$10 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$10);
                    SubLObject backwardP_var = NIL;
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
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = $SKIP;
                            }
                            if (NIL != problem_relevant_to_inferenceP(problem, inference)) {
                                inference_var = inference;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var2 = set.do_set_internal(set_var);
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                        state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, strategy)) {
                                        inference_datastructures_strategy.remove_strategy_problem(strategy, problem);
                                    }
                                }
                            }
                        }
                    }
                }
                SubLObject idx_$11 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$11)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$11);
                    SubLObject id2 = NIL;
                    SubLObject inference2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (NIL != problem_relevant_to_inferenceP(problem, inference2)) {
                                SubLObject inference_var2 = inference2;
                                SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                SubLObject set_contents_var3 = set.do_set_internal(set_var2);
                                SubLObject basis_object3;
                                SubLObject state3;
                                SubLObject strategy2;
                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3,
                                        state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object3, state3);
                                    if (NIL != set_contents.do_set_contents_element_validP(state3, strategy2)) {
                                        inference_datastructures_strategy.remove_strategy_problem(strategy2, problem);
                                    }
                                }
                            }
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            return destroy_problem_int(problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 18200L)
    public static SubLObject destroy_problem_store_problem(SubLObject problem) {
        if (NIL != valid_problem_p(problem)) {
            note_problem_invalid(problem);
            return destroy_problem_int(problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 18400L)
    public static SubLObject destroy_problem_int(SubLObject problem) {
        dictionary_contents.clear_dictionary_contents(prob_argument_link_bindings_index(problem));
        _csetf_prob_argument_link_bindings_index(problem, $FREE);
        dictionary_contents.clear_dictionary_contents(prob_proof_bindings_index(problem));
        _csetf_prob_proof_bindings_index(problem, $FREE);
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_datastructures_tactic.destroy_problem_tactic(tactic);
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        _csetf_prob_tactics(problem, $FREE);
        set_contents.clear_set_contents(prob_dependent_links(problem));
        _csetf_prob_dependent_links(problem, $FREE);
        set_contents.clear_set_contents(prob_argument_links(problem));
        _csetf_prob_argument_links(problem, $FREE);
        _csetf_prob_query(problem, $FREE);
        _csetf_prob_free_hl_vars(problem, $FREE);
        _csetf_prob_store(problem, $FREE);
        _csetf_prob_memoization_state(problem, $FREE);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 19300L)
    public static SubLObject note_problem_invalid(SubLObject problem) {
        _csetf_prob_status(problem, $FREE);
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 19400L)
    public static SubLObject problem_suid(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        return prob_suid(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 19500L)
    public static SubLObject problem_store(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        return prob_store(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 19600L)
    public static SubLObject problem_query(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        return prob_query(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 19700L)
    public static SubLObject problem_free_hl_vars(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        return prob_free_hl_vars(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 19900L)
    public static SubLObject problem_status(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        return prob_status(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 20000L)
    public static SubLObject problem_dwimmed_status(SubLObject problem) {
        SubLObject status = problem_status(problem);
        if (NIL != inference_worker.problem_goodP(problem)) {
            SubLObject dwimmed_status = inference_worker.good_version_of_problem_status(status);
            return dwimmed_status;
        }
        return status;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 20300L)
    public static SubLObject set_problem_free_hl_vars(SubLObject problem, SubLObject free_hl_vars) {
        assert NIL != problem_p(problem) : problem;
        _csetf_prob_free_hl_vars(problem, free_hl_vars);
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 20600L)
    public static SubLObject set_problem_status(SubLObject problem, SubLObject status) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != problem_p(problem) : problem;
        assert NIL != inference_datastructures_enumerated_types.problem_status_p(status) : status;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL != inference_datastructures_enumerated_types.good_problem_status_p(status)) {
            Errors.error($str176$poking_good_status__s_into_proble, status, problem);
        }
        _csetf_prob_status(problem, status);
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21100L)
    public static SubLObject problem_formula(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        return inference_czer.problem_query_formula(problem_query(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21300L)
    public static SubLObject problem_el_formula(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        return inference_czer.problem_query_el_formula(problem_query(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21500L)
    public static SubLObject closed_problem_p(SubLObject problem) {
        return closed_problem_query_p(problem_query(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21600L)
    public static SubLObject open_problem_p(SubLObject problem) {
        return open_problem_query_p(problem_query(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21800L)
    public static SubLObject closed_problem_query_p(SubLObject query) {
        return el_utilities.hl_ground_tree_p(query);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21900L)
    public static SubLObject open_problem_query_p(SubLObject query) {
        return makeBoolean(NIL == el_utilities.hl_ground_tree_p(query));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 22000L)
    public static SubLObject closed_single_literal_problem_query_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_problem_query.single_literal_problem_query_p(v_object) && NIL != closed_problem_query_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 22100L)
    public static SubLObject open_single_literal_problem_query_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_problem_query.single_literal_problem_query_p(v_object) && NIL == closed_problem_query_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 22300L)
    public static SubLObject problem_variables(SubLObject problem) {
        return inference_datastructures_problem_query.problem_query_variables(problem_query(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 22400L)
    public static SubLObject problem_literal_count(SubLObject problem, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject query = problem_query(problem);
        return problem_query_literal_count(query, sense);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 22600L)
    public static SubLObject problem_query_literal_count(SubLObject query, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = query;
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject literal_sense = $NEG;
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$12 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$12.first();
            while (NIL != cdolist_list_var_$12) {
                SubLObject current;
                SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == sense || sense.eql(literal_sense)) {
                        count = Numbers.add(count, ONE_INTEGER);
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list178);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                contextualized_asent = cdolist_list_var_$12.first();
            }
            literal_sense = $POS;
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$13 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$13.first();
            while (NIL != cdolist_list_var_$13) {
                SubLObject current;
                SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == sense || sense.eql(literal_sense)) {
                        count = Numbers.add(count, ONE_INTEGER);
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list178);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                contextualized_asent = cdolist_list_var_$13.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 22800L)
    public static SubLObject single_literal_problem_p(SubLObject v_object) {
        return makeBoolean(NIL != problem_p(v_object) && NIL != inference_datastructures_problem_query.problem_query_has_single_literal_p(problem_query(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 23100L)
    public static SubLObject single_literal_problem_predicate(SubLObject problem) {
        return inference_datastructures_problem_query.single_literal_problem_query_predicate(problem_query(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 23400L)
    public static SubLObject single_literal_problem_atomic_sentence(SubLObject problem) {
        return inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence(problem_query(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 23500L)
    public static SubLObject single_literal_problem_mt(SubLObject problem) {
        return inference_datastructures_problem_query.single_literal_problem_query_mt(problem_query(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 23700L)
    public static SubLObject problem_mt(SubLObject problem) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = problem_query(problem);
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sense = $NEG;
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$14 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$14.first();
            while (NIL != cdolist_list_var_$14) {
                SubLObject current;
                SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != result) {
                        if (!mt.equal(result)) {
                            return NIL;
                        }
                    } else {
                        result = mt;
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list178);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                contextualized_asent = cdolist_list_var_$14.first();
            }
            sense = $POS;
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$15 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                SubLObject current;
                SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != result) {
                        if (!mt.equal(result)) {
                            return NIL;
                        }
                    } else {
                        result = mt;
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list178);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                contextualized_asent = cdolist_list_var_$15.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 24000L)
    public static SubLObject problem_mts(SubLObject problem) {
        SubLObject one_mt = problem_mt(problem);
        if (NIL != one_mt) {
            return list(one_mt);
        }
        SubLObject mt_set = set.new_set(Symbols.symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = problem_query(problem);
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sense = $NEG;
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$16 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$16.first();
            while (NIL != cdolist_list_var_$16) {
                SubLObject current;
                SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    set.set_add(mt, mt_set);
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list178);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                contextualized_asent = cdolist_list_var_$16.first();
            }
            sense = $POS;
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$17 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$17.first();
            while (NIL != cdolist_list_var_$17) {
                SubLObject current;
                SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list178);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    set.set_add(mt, mt_set);
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list178);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                contextualized_asent = cdolist_list_var_$17.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        return set.set_element_list(mt_set);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 24400L)
    public static SubLObject single_literal_problem_sense(SubLObject problem) {
        return inference_datastructures_problem_query.single_literal_problem_query_sense(problem_query(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 24600L)
    public static SubLObject mt_asent_sense_from_single_literal_problem(SubLObject problem) {
        return inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(problem_query(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 24900L)
    public static SubLObject single_literal_problem_with_predicate_p(SubLObject v_object, SubLObject predicate) {
        if (NIL != single_literal_problem_p(v_object)) {
            return Equality.eql(predicate, single_literal_problem_predicate(v_object));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 25000L)
    public static SubLObject single_clause_problem_p(SubLObject v_object) {
        if (NIL != problem_p(v_object)) {
            SubLObject query = problem_query(v_object);
            return inference_datastructures_problem_query.single_clause_problem_query_p(query);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 25200L)
    public static SubLObject conjunctive_problem_p(SubLObject v_object) {
        return multi_literal_problem_p(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 25300L)
    public static SubLObject ist_problem_p(SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL != single_literal_problem_p(v_object) && ($$ist.eql(single_literal_problem_predicate(v_object)) || (NIL != utilities_macros.within_normal_forward_inferenceP() && !mt_relevance_macros.$mt$.getDynamicValue(thread).eql($$InferencePSC))));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 25600L)
    public static SubLObject join_problem_p(SubLObject v_object) {
        return makeBoolean(NIL != conjunctive_problem_p(v_object) && NIL != inference_worker_split.all_literals_connected_by_shared_varsP(problem_query(v_object).first()));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 25900L)
    public static SubLObject split_problem_p(SubLObject v_object) {
        return makeBoolean(NIL != conjunctive_problem_p(v_object) && NIL == inference_worker_split.all_literals_connected_by_shared_varsP(problem_query(v_object).first()));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26100L)
    public static SubLObject multi_literal_problem_p(SubLObject v_object) {
        return makeBoolean(NIL != single_clause_problem_p(v_object) && NIL == single_literal_problem_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26300L)
    public static SubLObject disjunctive_problem_p(SubLObject v_object) {
        return multi_clause_problem_p(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26400L)
    public static SubLObject multi_clause_problem_p(SubLObject v_object) {
        return makeBoolean(NIL != problem_p(v_object) && NIL == single_clause_problem_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26500L)
    public static SubLObject multi_clause_problem_query_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_problem_query.problem_query_p(v_object) && NIL == inference_datastructures_problem_query.single_clause_problem_query_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26600L)
    public static SubLObject problem_sole_clause(SubLObject problem) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query = problem_query(problem);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == list_utilities.singletonP(query)) {
            Errors.error($str182$The_problem__S_did_not_have_a_sin, problem);
        }
        return problem_query_sole_clause(query);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26900L)
    public static SubLObject problem_query_sole_clause(SubLObject query) {
        SubLObject dnf_clause = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(query, query, $list183);
        dnf_clause = query.first();
        SubLObject current = query.rest();
        if (NIL == current) {
            return dnf_clause;
        }
        cdestructuring_bind.cdestructuring_bind_error(query, $list183);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 27100L)
    public static SubLObject problem_in_equality_reasoning_domainP(SubLObject problem) {
        SubLObject query = problem_query(problem);
        SubLObject store = problem_store(problem);
        SubLObject equality_reasoning_domain = inference_datastructures_problem_store.problem_store_equality_reasoning_domain(store);
        return inference_datastructures_problem_query.problem_query_in_equality_reasoning_domainP(query, equality_reasoning_domain);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 27400L)
    public static SubLObject problem_relevant_to_some_inferenceP(SubLObject problem) {
        return list_utilities.sublisp_boolean(first_problem_relevant_inference(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 27500L)
    public static SubLObject first_problem_relevant_inference(SubLObject problem) {
        SubLObject store = problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$18 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$18, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$18);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != problem_relevant_to_inferenceP(problem, inference)) {
                            return inference;
                        }
                    }
                }
            }
            SubLObject idx_$19 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$19)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$19);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != problem_relevant_to_inferenceP(problem, inference2)) {
                            return inference2;
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 27700L)
    public static SubLObject problem_relevant_to_only_one_inferenceP(SubLObject problem) {
        SubLObject inference1 = NIL;
        SubLObject store = problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$20 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$20, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$20);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference2;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference2 = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference2) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference2)) {
                            inference2 = $SKIP;
                        }
                        if (NIL != problem_relevant_to_inferenceP(problem, inference2)) {
                            if (NIL != inference1) {
                                return NIL;
                            }
                            inference1 = inference2;
                        }
                    }
                }
            }
            SubLObject idx_$21 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$21)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$21);
                SubLObject id2 = NIL;
                SubLObject inference3 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference3 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != problem_relevant_to_inferenceP(problem, inference3)) {
                            if (NIL != inference1) {
                                return NIL;
                            }
                            inference1 = inference3;
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return list_utilities.sublisp_boolean(inference1);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 27900L)
    public static SubLObject problem_relevant_to_inferenceP(SubLObject problem, SubLObject inference) {
        return (NIL != inference_datastructures_inference.valid_inference_p(inference)) ? set.set_memberP(problem, inference_datastructures_inference.inference_relevant_problems(inference)) : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 28100L)
    public static SubLObject problem_relevant_to_strategyP(SubLObject problem, SubLObject strategy) {
        return problem_relevant_to_inferenceP(problem, inference_datastructures_strategy.strategy_inference(strategy));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 28300L)
    public static SubLObject problem_relevant_strategies(SubLObject problem) {
        SubLObject result = NIL;
        SubLObject store = problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$22 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$22, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$22);
                SubLObject backwardP_var = NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    result = cons(strategy, result);
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$23 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$23)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$23);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != problem_relevant_to_inferenceP(problem, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    result = cons(strategy2, result);
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sequences.nreverse(result);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 28500L)
    public static SubLObject problem_active_in_some_strategyP(SubLObject problem) {
        return list_utilities.sublisp_boolean(first_problem_active_strategy(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 28700L)
    public static SubLObject first_problem_active_strategy(SubLObject problem) {
        SubLObject store = problem_store(problem);
        SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$24 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$24, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$24);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    strategy = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(strategy) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(strategy)) {
                            strategy = $SKIP;
                        }
                        if (NIL != inference_datastructures_strategy.problem_active_in_strategyP(problem, strategy)) {
                            return strategy;
                        }
                    }
                }
            }
            SubLObject idx_$25 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$25)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$25);
                SubLObject id2 = NIL;
                SubLObject strategy2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        strategy2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_strategy.problem_active_in_strategyP(problem, strategy2)) {
                            return strategy2;
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 28800L)
    public static SubLObject problem_argument_link_count(SubLObject problem) {
        return set_contents.set_contents_size(prob_argument_links(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 29000L)
    public static SubLObject problem_argument_link_of_type_count(SubLObject problem, SubLObject type) {
        SubLObject count = ZERO_INTEGER;
        SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type)) {
                count = Numbers.add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 29300L)
    public static SubLObject problem_has_argument_link_p(SubLObject problem) {
        return makeBoolean(NIL == set_contents.set_contents_emptyP(prob_argument_links(problem)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 29400L)
    public static SubLObject problem_has_argument_link_of_typeP(SubLObject problem, SubLObject type) {
        return list_utilities.sublisp_boolean(problem_first_argument_link_of_type(problem, type));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 29600L)
    public static SubLObject problem_first_argument_link_of_type(SubLObject problem, SubLObject type) {
        SubLObject first_link = NIL;
        SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type) && NIL == first_link) {
                first_link = link;
            }
        }
        return first_link;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 29900L)
    public static SubLObject problem_sole_argument_link_of_type(SubLObject problem, SubLObject type) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_link = NIL;
        SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type)) {
                if (NIL != first_link) {
                    Errors.error($str184$Found_more_than_one__a_argument_l, type, problem);
                } else {
                    first_link = link;
                }
            }
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == first_link) {
            Errors.error($str185$Expected__a_to_have_a__a_argument, problem, type);
        }
        return first_link;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 30200L)
    public static SubLObject problem_all_argument_links_have_typeP(SubLObject problem, SubLObject link_type) {
        assert NIL != problem_p(problem) : problem;
        assert NIL != inference_datastructures_enumerated_types.problem_link_type_p(link_type) : link_type;
        SubLObject failedP = NIL;
        SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == failedP
                && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link) && !link_type.eql(inference_datastructures_problem_link.problem_link_type(link))) {
                failedP = T;
            }
        }
        return makeBoolean(NIL == failedP);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 30600L)
    public static SubLObject problem_has_supporting_problem_p(SubLObject problem) {
        SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject argument_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            argument_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, argument_link) && NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(argument_link)) {
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 30900L)
    public static SubLObject all_problem_argument_problems(SubLObject problem) {
        SubLObject problem_set = set_contents.new_set_contents(problem_argument_link_count(problem), Symbols.symbol_function(EQ));
        problem_set = all_problem_argument_problems_recursive(problem, problem_set);
        return Sort.sort(set_contents.set_contents_element_list(problem_set), $sym187$_, $sym188$PROBLEM_SUID);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 31200L)
    public static SubLObject all_problem_argument_problems_recursive(SubLObject problem, SubLObject problem_set) {
        if (NIL == set_contents.set_contents_memberP(problem, problem_set, Symbols.symbol_function(EQ))) {
            problem_set = set_contents.set_contents_add(problem, problem_set, Symbols.symbol_function(EQ));
            SubLObject set_contents_var = problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            SubLObject link_var;
            SubLObject cdolist_list_var;
            SubLObject supporting_mapped_problem;
            SubLObject argument_problem;
            SubLObject variable_map;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                    link_var = link;
                    cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    supporting_mapped_problem = NIL;
                    supporting_mapped_problem = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 31600L)
    public static SubLObject problem_dependent_link_count(SubLObject problem) {
        return set_contents.set_contents_size(prob_dependent_links(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 31800L)
    public static SubLObject problem_sole_dependent_link(SubLObject problem) {
        SubLObject result = NIL;
        SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                if (NIL != result) {
                    return Errors.error($str189$_a_had_more_than_one_dependent_li, problem);
                }
                result = dependent_link;
            }
        }
        if (NIL != result) {
            return result;
        }
        return Errors.error($str190$_a_had_no_dependent_links, problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 32100L)
    public static SubLObject problem_has_dependent_link_p(SubLObject problem) {
        return makeBoolean(NIL == set_contents.set_contents_emptyP(prob_dependent_links(problem)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 32300L)
    public static SubLObject problem_has_dependent_link_of_typeP(SubLObject problem, SubLObject type) {
        SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(dependent_link, type)) {
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 32500L)
    public static SubLObject problem_has_answer_link_p(SubLObject problem) {
        return problem_has_dependent_link_of_typeP(problem, $ANSWER);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 32600L)
    public static SubLObject problem_has_non_answer_dependent_link_p(SubLObject problem) {
        if (NIL == problem_has_dependent_link_p(problem)) {
            return NIL;
        }
        SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link) && NIL == inference_worker_answer.answer_link_p(dependent_link)) {
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 33000L)
    public static SubLObject problem_has_only_non_abducible_rule_transformation_dependent_linksP(SubLObject problem) {
        SubLObject doneP = NIL;
        SubLObject result = NIL;
        SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == doneP
                && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $TRANSFORMATION)) {
                    if (NIL != kb_accessors.non_abducible_ruleP(inference_worker_transformation.transformation_link_rule_assertion(link))) {
                        result = T;
                    } else {
                        result = NIL;
                        doneP = T;
                    }
                } else {
                    doneP = T;
                    result = NIL;
                }
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 33500L)
    public static SubLObject problem_supported_problems(SubLObject problem) {
        SubLObject result = NIL;
        SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if (NIL != supported_problem) {
                    result = cons(supported_problem, result);
                }
            }
        }
        return Sequences.nreverse(result);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 33800L)
    public static SubLObject problem_supported_problem_count(SubLObject problem) {
        SubLObject result = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
        SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if (NIL != supported_problem) {
                    set.set_add(supported_problem, result);
                }
            }
        }
        return set.set_size(result);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 34200L)
    public static SubLObject problem_has_more_than_one_supported_problemP(SubLObject problem) {
        SubLObject first_supported_problem = NIL;
        SubLObject more_than_oneP = NIL;
        SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if (NIL != supported_problem) {
                    if (NIL == first_supported_problem) {
                        first_supported_problem = supported_problem;
                    } else if (!supported_problem.eql(first_supported_problem)) {
                        more_than_oneP = T;
                    }
                }
            }
        }
        return more_than_oneP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 34600L)
    public static SubLObject problem_next_tactic_suid(SubLObject problem) {
        return problem_tactic_count(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 34700L)
    public static SubLObject problem_tactic_count(SubLObject problem) {
        SubLObject tactics = problem_tactics(problem);
        if (NIL != tactics) {
            return number_utilities.f_1X(inference_datastructures_tactic.tactic_suid(tactics.first()));
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 35000L)
    public static SubLObject problem_has_no_tacticsP(SubLObject problem) {
        return Types.sublisp_null(problem_tactics(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 35100L)
    public static SubLObject problem_tactic_count_with_hl_module(SubLObject problem, SubLObject tactic_hl_module) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != do_problem_tactics_hl_module_match(tactic, tactic_hl_module)) {
                count = Numbers.add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 35300L)
    public static SubLObject problem_tactic_count_with_hl_module_and_status(SubLObject problem, SubLObject tactic_hl_module, SubLObject tactic_status) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != do_problem_tactics_status_match(tactic, tactic_status) && NIL != do_problem_tactics_hl_module_match(tactic, tactic_hl_module)) {
                count = Numbers.add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 35500L)
    public static SubLObject problem_possible_tactics(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        return list_utilities.remove_if_not($sym193$TACTIC_POSSIBLE_, problem_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 35700L)
    public static SubLObject problem_has_possible_tacticsP(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        return list_utilities.sublisp_boolean(Sequences.find_if($sym193$TACTIC_POSSIBLE_, problem_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 35900L)
    public static SubLObject problem_no_tactics_possibleP(SubLObject problem) {
        return makeBoolean(NIL == problem_has_possible_tacticsP(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 36000L)
    public static SubLObject problem_executed_tactics(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        return list_utilities.remove_if_not($sym194$TACTIC_EXECUTED_, problem_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 36100L)
    public static SubLObject problem_discarded_tactics(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        return list_utilities.remove_if_not($sym195$TACTIC_DISCARDED_, problem_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 36300L)
    public static SubLObject problem_possible_tactic_count(SubLObject problem) {
        return problem_tactic_with_status_count(problem, $POSSIBLE);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 36400L)
    public static SubLObject problem_executed_tactic_count(SubLObject problem) {
        return problem_tactic_with_status_count(problem, $EXECUTED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 36500L)
    public static SubLObject problem_discarded_tactic_count(SubLObject problem) {
        return problem_tactic_with_status_count(problem, $DISCARDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 36700L)
    public static SubLObject problem_tactic_of_type_with_status_count(SubLObject problem, SubLObject type, SubLObject status) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (status == UNPROVIDED) {
            status = NIL;
        }
        assert NIL != problem_p(problem) : problem;
        if (NIL != type && !assertionsDisabledInClass && NIL == generalized_tactic_type_p(type)) {
            throw new AssertionError(type);
        }
        if (NIL != status && !assertionsDisabledInClass && NIL == inference_datastructures_enumerated_types.tactic_status_p(status)) {
            throw new AssertionError(status);
        }
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != do_problem_tactics_type_match(tactic, type) && NIL != do_problem_tactics_status_match(tactic, status)) {
                count = Numbers.add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 37100L)
    public static SubLObject problem_tactic_with_status_count(SubLObject problem, SubLObject status) {
        if (status == UNPROVIDED) {
            status = NIL;
        }
        return problem_tactic_of_type_with_status_count(problem, NIL, status);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 37300L)
    public static SubLObject problem_has_tactic_of_type_with_statusP(SubLObject problem, SubLObject type, SubLObject status) {
        if (status == UNPROVIDED) {
            status = NIL;
        }
        SubLObject foundP;
        SubLObject rest;
        SubLObject tactic;
        for (foundP = NIL, rest = NIL, rest = problem_tactics(problem); NIL == foundP && NIL != rest; rest = rest.rest()) {
            tactic = rest.first();
            if (NIL != do_problem_tactics_type_match(tactic, type) && NIL != do_problem_tactics_status_match(tactic, status)) {
                foundP = T;
            }
        }
        return foundP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 37600L)
    public static SubLObject problem_has_tactic_of_typeP(SubLObject problem, SubLObject type) {
        return problem_has_tactic_of_type_with_statusP(problem, type, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 37700L)
    public static SubLObject problem_has_removal_tacticsP(SubLObject problem) {
        return problem_has_tactic_of_typeP(problem, $GENERALIZED_REMOVAL);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 37800L)
    public static SubLObject problem_has_transformation_tacticsP(SubLObject problem) {
        return problem_has_tactic_of_typeP(problem, $TRANSFORMATION);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 38000L)
    public static SubLObject problem_has_possible_transformation_tacticsP(SubLObject problem) {
        return problem_has_tactic_of_type_with_statusP(problem, $TRANSFORMATION, $POSSIBLE);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 38100L)
    public static SubLObject problem_has_possible_removal_tacticP(SubLObject problem, SubLObject strategic_context) {
        assert NIL != problem_p(problem) : problem;
        assert NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        return problem_has_tactic_of_type_with_statusP(problem, $REMOVAL, $POSSIBLE);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 38400L)
    public static SubLObject problem_has_complete_possible_removal_tacticP(SubLObject problem, SubLObject strategic_context) {
        assert NIL != problem_p(problem) : problem;
        assert NIL != inference_worker.strategic_context_p(strategic_context) : strategic_context;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != do_problem_tactics_type_match(tactic, $REMOVAL) && NIL != do_problem_tactics_status_match(tactic, $POSSIBLE) && NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, strategic_context)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 38700L)
    public static SubLObject problem_has_split_tacticsP(SubLObject problem) {
        SubLObject foundP;
        SubLObject rest;
        SubLObject tactic;
        for (foundP = NIL, rest = NIL, rest = problem_tactics(problem); NIL == foundP && NIL != rest; foundP = inference_worker_split.split_tactic_p(tactic), rest = rest.rest()) {
            tactic = rest.first();
        }
        return foundP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 38900L)
    public static SubLObject problem_has_an_in_progress_tacticP(SubLObject problem) {
        SubLObject has_oneP;
        SubLObject rest;
        SubLObject tactic;
        for (has_oneP = NIL, rest = NIL, rest = problem_tactics(problem); NIL == has_oneP && NIL != rest; rest = rest.rest()) {
            tactic = rest.first();
            if (NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
                has_oneP = T;
            }
        }
        return has_oneP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 39200L)
    public static SubLObject problem_has_an_in_progress_complete_removal_tacticP(SubLObject problem, SubLObject strategic_context) {
        SubLObject has_oneP;
        SubLObject rest;
        SubLObject tactic;
        for (has_oneP = NIL, rest = NIL, rest = problem_tactics(problem); NIL == has_oneP && NIL != rest; rest = rest.rest()) {
            tactic = rest.first();
            if (NIL != do_problem_tactics_type_match(tactic, $REMOVAL) && NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, strategic_context) && NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
                has_oneP = T;
            }
        }
        return has_oneP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 39500L)
    public static SubLObject any_problem_has_an_in_progress_tacticP(SubLObject problems) {
        return list_utilities.any_in_list($sym202$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_, problems, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 39700L)
    public static SubLObject problem_has_no_logical_tacticsP(SubLObject problem) {
        return makeBoolean(NIL == problem_has_tactic_of_typeP(problem, $LOGICAL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 39800L)
    public static SubLObject problem_total_removal_productivity(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        SubLObject total_productivity = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != do_problem_tactics_type_match(tactic, $REMOVAL) && NIL != do_problem_tactics_status_match(tactic, $POSSIBLE)) {
                SubLObject tactic_productivity = inference_datastructures_tactic.tactic_productivity(tactic);
                total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, tactic_productivity);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return total_productivity;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 40300L)
    public static SubLObject problem_total_deductive_removal_productivity(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        SubLObject total_productivity = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != do_problem_tactics_type_match(tactic, $REMOVAL) && NIL != do_problem_tactics_status_match(tactic, $POSSIBLE) && NIL == inference_datastructures_tactic.abductive_tacticP(tactic)) {
                SubLObject tactic_productivity = inference_datastructures_tactic.tactic_productivity(tactic);
                total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, tactic_productivity);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return total_productivity;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 40800L)
    public static SubLObject problem_total_actual_removal_productivity(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        SubLObject total_productivity = ZERO_INTEGER;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != do_problem_tactics_type_match(tactic, $REMOVAL) && NIL == inference_datastructures_tactic.tactic_discardedP(tactic)) {
                SubLObject tactic_productivity = inference_worker.content_tactic_actual_productivity(tactic);
                total_productivity = inference_datastructures_enumerated_types.productivity_X(total_productivity, tactic_productivity);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return total_productivity;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 41400L)
    public static SubLObject problem_possible_removal_tactics(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        SubLObject tactics = NIL;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != do_problem_tactics_type_match(tactic, $REMOVAL) && NIL != do_problem_tactics_status_match(tactic, $POSSIBLE)) {
                tactics = cons(tactic, tactics);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return tactics;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 41600L)
    public static SubLObject problem_executed_removal_tactic_productivities(SubLObject problem) {
        assert NIL != problem_p(problem) : problem;
        SubLObject tuples = NIL;
        SubLObject cdolist_list_var = problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != do_problem_tactics_type_match(tactic, $REMOVAL) && NIL != do_problem_tactics_status_match(tactic, $EXECUTED)) {
                SubLObject removal_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                SubLObject module_name = inference_modules.hl_module_name(removal_module);
                SubLObject original_productivity = inference_datastructures_tactic.tactic_original_productivity(tactic);
                SubLObject actual_productivity = inference_worker.content_tactic_actual_productivity(tactic);
                tuples = cons(list(module_name, original_productivity, actual_productivity), tuples);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return Sequences.nreverse(tuples);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 42300L)
    public static SubLObject all_problem_proofs(SubLObject problem, SubLObject proof_status) {
        if (proof_status == UNPROVIDED) {
            proof_status = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_proofs = NIL;
        SubLObject status_var = proof_status;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(problem_proof_bindings_index(problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject proof_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = proof_list;
            SubLObject proof = NIL;
            proof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != proof_has_statusP(proof, status_var)) {
                    all_proofs = cons(proof, all_proofs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                proof = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return all_proofs;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 42600L)
    public static SubLObject problem_proof_count(SubLObject problem, SubLObject proof_status) {
        if (proof_status == UNPROVIDED) {
            proof_status = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store = problem_store(problem);
        if (NIL != proof_status && NIL != inference_datastructures_problem_store.problem_store_some_rejected_proofsP(store)) {
            SubLObject count = ZERO_INTEGER;
            SubLObject status_var = proof_status;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(problem_proof_bindings_index(problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                SubLObject proof_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = proof_list;
                SubLObject proof = NIL;
                proof = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != proof_has_statusP(proof, status_var)) {
                        count = Numbers.add(count, ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    proof = cdolist_list_var.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            return count;
        }
        if (proof_status == $REJECTED) {
            return ZERO_INTEGER;
        }
        return dictionary_contents.dictionary_contents_size(prob_proof_bindings_index(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 43200L)
    public static SubLObject problem_proven_proof_count(SubLObject problem) {
        return problem_proof_count(problem, $PROVEN);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 43300L)
    public static SubLObject problem_has_some_proofP(SubLObject problem, SubLObject proof_status) {
        if (proof_status == UNPROVIDED) {
            proof_status = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store = problem_store(problem);
        if (NIL != proof_status && NIL != inference_datastructures_problem_store.problem_store_some_rejected_proofsP(store)) {
            SubLObject status_var = proof_status;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(problem_proof_bindings_index(problem)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                SubLObject proof_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = proof_list;
                SubLObject proof = NIL;
                proof = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != proof_has_statusP(proof, status_var)) {
                        return T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    proof = cdolist_list_var.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            return NIL;
        }
        if (proof_status == $REJECTED) {
            return NIL;
        }
        return makeBoolean(NIL == dictionary_contents.dictionary_contents_empty_p(prob_proof_bindings_index(problem)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 43800L)
    public static SubLObject problem_has_some_proven_proofP(SubLObject problem) {
        return problem_has_some_proofP(problem, $PROVEN);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 43900L)
    public static SubLObject problem_has_some_rejected_proofP(SubLObject problem) {
        return problem_has_some_proofP(problem, $REJECTED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 44000L)
    public static SubLObject problem_proofs_lookup(SubLObject problem, SubLObject v_bindings) {
        SubLObject index = prob_proof_bindings_index(problem);
        SubLObject proofs = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function(EQUAL), UNPROVIDED);
        return proofs;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 44300L)
    public static SubLObject problem_argument_links_lookup(SubLObject problem, SubLObject v_bindings) {
        SubLObject index = prob_argument_link_bindings_index(problem);
        SubLObject links = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function(EQUAL), UNPROVIDED);
        return links;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 44600L)
    public static SubLObject problem_potentially_processedP(SubLObject problem) {
        SubLObject store = problem_store(problem);
        SubLObject potentially_processed_problems = inference_datastructures_problem_store.problem_store_potentially_processed_problems(store);
        return set.set_memberP(problem, potentially_processed_problems);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 44900L)
    public static SubLObject note_problem_potentially_processed(SubLObject problem) {
        return inference_datastructures_problem_store.problem_store_note_problem_potentially_processed(problem_store(problem), problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 45000L)
    public static SubLObject problem_indestructibleP(SubLObject problem) {
        SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(problem_store(problem));
        SubLObject indestructible_problems = inference_datastructures_problem_store.problem_store_janitor_indestructible_problems(janitor);
        return set.set_memberP(problem, indestructible_problems);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 45300L)
    public static SubLObject problem_destructibleP(SubLObject problem) {
        SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(problem_store(problem));
        return makeBoolean(NIL == inference_datastructures_problem_store.problem_store_janitor_staleP(janitor) && NIL == problem_indestructibleP(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 45600L)
    public static SubLObject problem_destructibility_status(SubLObject problem) {
        if (NIL != problem_indestructibleP(problem)) {
            return $INDESTRUCTIBLE;
        }
        if (NIL != problem_destructibleP(problem)) {
            return $DESTRUCTIBLE;
        }
        return $UNKNOWN;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 45800L)
    public static SubLObject problem_min_depth(SubLObject problem) {
        SubLObject store = problem_store(problem);
        SubLObject hash = inference_datastructures_problem_store.problem_store_min_depth_index(store);
        SubLObject depth = Hashtables.gethash_without_values(problem, hash, $UNDETERMINED);
        return depth;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 46100L)
    public static SubLObject problem_min_proof_depth(SubLObject problem, SubLObject inference) {
        SubLObject store = problem_store(problem);
        SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_proof_depth_index(store), inference, UNPROVIDED);
        if (NIL != hash) {
            SubLObject depth = Hashtables.gethash_without_values(problem, hash, UNPROVIDED);
            if (NIL != subl_promotions.non_negative_integer_p(depth)) {
                return depth;
            }
        }
        return $UNDETERMINED;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 47400L)
    public static SubLObject problem_intuitive_min_transformation_depth(SubLObject problem, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = $transformation_depth_computation$.currentBinding(thread);
        try {
            $transformation_depth_computation$.bind($INTUITIVE, thread);
            return problem_min_transformation_depth(problem, inference);
        } finally {
            $transformation_depth_computation$.rebind(_prev_bind_0, thread);
        }
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 47600L)
    public static SubLObject problem_min_transformation_depth(SubLObject problem, SubLObject inference) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $problem_min_transformation_depth_from_signature_enabledP$.getDynamicValue(thread)) {
            return inference_min_transformation_depth.problem_min_transformation_depth_from_signature(problem, inference);
        }
        SubLObject store = problem_store(problem);
        SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_index(store), inference, UNPROVIDED);
        if (NIL != hash) {
            SubLObject depth = Hashtables.gethash_without_values(problem, hash, UNPROVIDED);
            if (NIL != subl_promotions.non_negative_integer_p(depth)) {
                return depth;
            }
        }
        return $UNDETERMINED;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 48300L)
    public static SubLObject problem_min_transformation_depth_signature(SubLObject problem, SubLObject inference) {
        SubLObject store = problem_store(problem);
        SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_signature_index(store), inference, UNPROVIDED);
        if (NIL != hash) {
            SubLObject depth = Hashtables.gethash_without_values(problem, hash, UNPROVIDED);
            if (NIL != depth) {
                return depth;
            }
        }
        return $UNDETERMINED;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 49000L)
    public static SubLObject problem_backchain_requiredP(SubLObject problem) {
        SubLObject cache_value = prob_backchain_required(problem);
        if (NIL != Types.booleanp(cache_value)) {
            return cache_value;
        }
        SubLObject backchain_requiredP = inference_trampolines.compute_problem_backchain_requiredP(problem);
        _csetf_prob_backchain_required(problem, backchain_requiredP);
        return backchain_requiredP;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 49400L)
    public static SubLObject add_problem_argument_link(SubLObject problem, SubLObject argument_link) {
        assert NIL != problem_p(problem) : problem;
        assert NIL != inference_datastructures_problem_link.problem_link_p(argument_link) : argument_link;
        _csetf_prob_argument_links(problem, set_contents.set_contents_add(argument_link, prob_argument_links(problem), Symbols.symbol_function(EQ)));
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 49700L)
    public static SubLObject remove_problem_argument_link(SubLObject problem, SubLObject argument_link) {
        assert NIL != problem_p(problem) : problem;
        assert NIL != inference_datastructures_problem_link.problem_link_p(argument_link) : argument_link;
        _csetf_prob_argument_links(problem, set_contents.set_contents_delete(argument_link, prob_argument_links(problem), Symbols.symbol_function(EQ)));
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 50000L)
    public static SubLObject index_problem_argument_link(SubLObject problem, SubLObject argument_link) {
        SubLObject index = prob_argument_link_bindings_index(problem);
        SubLObject v_bindings = (NIL != inference_worker_removal.removal_link_p(argument_link)) ? inference_worker_removal.removal_link_bindings(argument_link)
                : ((NIL != inference_worker_restriction.restriction_link_p(argument_link)) ? inference_worker_restriction.restriction_link_bindings(argument_link) : NIL);
        SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function(EQUAL), UNPROVIDED);
        existing = cons(argument_link, existing);
        _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, existing, Symbols.symbol_function(EQUAL)));
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 50700L)
    public static SubLObject deindex_problem_argument_link(SubLObject problem, SubLObject argument_link) {
        SubLObject index = prob_argument_link_bindings_index(problem);
        SubLObject v_bindings = (NIL != inference_worker_removal.removal_link_p(argument_link)) ? inference_worker_removal.removal_link_bindings(argument_link)
                : ((NIL != inference_worker_restriction.restriction_link_p(argument_link)) ? inference_worker_restriction.restriction_link_bindings(argument_link) : NIL);
        SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function(EQUAL), UNPROVIDED);
        SubLObject updated = list_utilities.delete_first(argument_link, existing, Symbols.symbol_function(EQ));
        if (!existing.eql(updated)) {
            if (NIL == updated) {
                _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.dictionary_contents_delete(index, v_bindings, Symbols.symbol_function(EQUAL)));
            } else {
                _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, updated, Symbols.symbol_function(EQUAL)));
            }
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 51500L)
    public static SubLObject add_problem_dependent_link(SubLObject problem, SubLObject dependent_link) {
        assert NIL != problem_p(problem) : problem;
        assert NIL != inference_datastructures_problem_link.problem_link_p(dependent_link) : dependent_link;
        _csetf_prob_dependent_links(problem, set_contents.set_contents_add(dependent_link, prob_dependent_links(problem), Symbols.symbol_function(EQ)));
        inference_metrics.increment_dependent_link_historical_count();
        if (NIL != single_literal_problem_p(problem)) {
            inference_metrics.increment_single_literal_problem_dependent_link_historical_count();
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 51900L)
    public static SubLObject remove_problem_dependent_link(SubLObject problem, SubLObject dependent_link) {
        assert NIL != problem_p(problem) : problem;
        assert NIL != inference_datastructures_problem_link.problem_link_p(dependent_link) : dependent_link;
        _csetf_prob_dependent_links(problem, set_contents.set_contents_delete(dependent_link, prob_dependent_links(problem), Symbols.symbol_function(EQ)));
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 52600L)
    public static SubLObject add_problem_tactic(SubLObject problem, SubLObject tactic) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != problem_p(problem) : problem;
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : tactic;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !problem_tactic_count(problem).numLE($max_problem_tactics$.getGlobalValue())) {
            Errors.error($str214$Tried_to_add__s_to__s__which_woul, new SubLObject[] { tactic, problem, $max_problem_tactics$.getGlobalValue(), problem });
        }
        _csetf_prob_tactics(problem, cons(tactic, prob_tactics(problem)));
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 53100L)
    public static SubLObject remove_problem_tactic(SubLObject problem, SubLObject tactic) {
        assert NIL != inference_datastructures_tactic.tactic_p(tactic) : tactic;
        _csetf_prob_tactics(problem, Sequences.delete(tactic, prob_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 53300L)
    public static SubLObject add_problem_proof(SubLObject problem, SubLObject proof) {
        assert NIL != problem_p(problem) : problem;
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        SubLObject index = prob_proof_bindings_index(problem);
        SubLObject v_bindings = inference_datastructures_proof.proof_bindings(proof);
        SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function(EQUAL), UNPROVIDED);
        existing = cons(proof, existing);
        _csetf_prob_proof_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, existing, Symbols.symbol_function(EQUAL)));
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 53800L)
    public static SubLObject remove_problem_proof(SubLObject problem, SubLObject proof) {
        SubLObject v_bindings = inference_datastructures_proof.proof_bindings(proof);
        return remove_problem_proof_with_bindings(problem, proof, v_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 54000L)
    public static SubLObject remove_problem_proof_with_bindings(SubLObject problem, SubLObject proof, SubLObject v_bindings) {
        assert NIL != problem_p(problem) : problem;
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        assert NIL != bindings.bindings_p(v_bindings) : v_bindings;
        SubLObject set_contents_var = problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject join_ordered_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)) {
                inference_worker_join_ordered.remove_join_ordered_link_proof_both_ways(join_ordered_link, proof, v_bindings);
            }
        }
        set_contents_var = problem_dependent_links(problem);
        SubLObject join_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            join_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, join_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_link, $JOIN)) {
                inference_worker_join.remove_join_link_proof_both_ways(join_link, proof, v_bindings);
            }
        }
        SubLObject index = prob_proof_bindings_index(problem);
        SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function(EQUAL), UNPROVIDED);
        SubLObject updated = list_utilities.delete_first(proof, existing, Symbols.symbol_function(EQ));
        if (!existing.eql(updated)) {
            if (NIL == updated) {
                _csetf_prob_proof_bindings_index(problem, dictionary_contents.dictionary_contents_delete(index, v_bindings, Symbols.symbol_function(EQUAL)));
            } else {
                _csetf_prob_proof_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, updated, Symbols.symbol_function(EQUAL)));
            }
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 54900L)
    public static SubLObject set_problem_min_depth(SubLObject problem, SubLObject depth) {
        assert NIL != problem_p(problem) : problem;
        assert NIL != subl_promotions.non_negative_integer_p(depth) : depth;
        SubLObject store = problem_store(problem);
        SubLObject hash = inference_datastructures_problem_store.problem_store_min_depth_index(store);
        Hashtables.sethash(problem, hash, depth);
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 55200L)
    public static SubLObject set_problem_min_proof_depth(SubLObject problem, SubLObject inference, SubLObject depth) {
        assert NIL != problem_p(problem) : problem;
        assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
        assert NIL != subl_promotions.non_negative_integer_p(depth) : depth;
        SubLObject store = problem_store(problem);
        SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_proof_depth_index(store), inference, UNPROVIDED);
        if (NIL == hash) {
            hash = Hashtables.make_hash_table(ONE_INTEGER, Symbols.symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(inference_datastructures_problem_store.problem_store_min_proof_depth_index(store), inference, hash);
        }
        Hashtables.sethash(problem, hash, depth);
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 55800L)
    public static SubLObject set_problem_min_transformation_depth(SubLObject problem, SubLObject inference, SubLObject depth) {
        assert NIL != problem_p(problem) : problem;
        assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
        assert NIL != subl_promotions.non_negative_integer_p(depth) : depth;
        SubLObject store = problem_store(problem);
        SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_index(store), inference, UNPROVIDED);
        if (NIL == hash) {
            hash = Hashtables.make_hash_table(ONE_INTEGER, Symbols.symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(inference_datastructures_problem_store.problem_store_min_transformation_depth_index(store), inference, hash);
        }
        Hashtables.sethash(problem, hash, depth);
        inference_datastructures_inference.inference_note_transformation_depth(inference, depth);
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 56500L)
    public static SubLObject set_problem_min_transformation_depth_signature(SubLObject problem, SubLObject inference, SubLObject pqds) {
        assert NIL != problem_p(problem) : problem;
        assert NIL != inference_datastructures_inference.inference_p(inference) : inference;
        assert NIL != inference_min_transformation_depth.problem_query_depth_signature_p(pqds) : pqds;
        SubLObject store = problem_store(problem);
        SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_signature_index(store), inference, UNPROVIDED);
        if (NIL == hash) {
            hash = Hashtables.make_hash_table(ONE_INTEGER, Symbols.symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(inference_datastructures_problem_store.problem_store_min_transformation_depth_signature_index(store), inference, hash);
        }
        Hashtables.sethash(problem, hash, pqds);
        SubLObject depth = inference_min_transformation_depth.min_transformation_depth_from_signature(pqds);
        inference_datastructures_inference.inference_note_transformation_depth(inference, depth);
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 57300L)
    public static SubLObject set_root_problem_min_transformation_depth_signature(SubLObject problem, SubLObject inference) {
        SubLObject problem_query = problem_query(problem);
        SubLObject initial_pqds = inference_min_transformation_depth.new_initial_pqds(problem_query, UNPROVIDED);
        return set_problem_min_transformation_depth_signature(problem, inference, initial_pqds);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 57600L)
    public static SubLObject note_problem_indestructible(SubLObject problem) {
        if (NIL == problem_indestructibleP(problem)) {
            SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(problem_store(problem));
            inference_datastructures_problem_store.problem_store_janitor_note_problem_indestructible(janitor, problem);
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 57900L)
    public static SubLObject note_problem_destructible(SubLObject problem) {
        if (NIL == problem_destructibleP(problem)) {
            SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(problem_store(problem));
            inference_datastructures_problem_store.problem_store_janitor_note_problem_destructible(janitor, problem);
        }
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 58200L)
    public static SubLObject note_problem_min_transformation_depth_signature(SubLObject problem, SubLObject inference, SubLObject new_pqds) {
        SubLObject old_pqds = problem_min_transformation_depth_signature(problem, inference);
        SubLObject updated_pqds = ($UNDETERMINED == old_pqds) ? new_pqds : inference_min_transformation_depth.pqds_merge(old_pqds, new_pqds);
        if (!old_pqds.equal(updated_pqds)) {
            set_problem_min_transformation_depth_signature(problem, inference, updated_pqds);
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 58600L)
    public static SubLObject problem_tactical_provability_status(SubLObject problem) {
        SubLObject status = problem_dwimmed_status(problem);
        return inference_datastructures_enumerated_types.provability_status_from_problem_status(status);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 58800L)
    public static SubLObject tactically_good_problem_p(SubLObject problem) {
        return inference_worker.problem_goodP(problem);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 58900L)
    public static SubLObject tactically_no_good_problem_p(SubLObject problem) {
        return inference_datastructures_enumerated_types.no_good_problem_status_p(problem_status(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59000L)
    public static SubLObject tactically_neutral_problem_p(SubLObject problem) {
        return inference_datastructures_enumerated_types.neutral_problem_status_p(problem_status(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59100L)
    public static SubLObject problem_tactical_status(SubLObject problem) {
        SubLObject status = problem_status(problem);
        return inference_datastructures_enumerated_types.tactical_status_from_problem_status(status);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59300L)
    public static SubLObject tactically_new_problem_p(SubLObject problem) {
        return Equality.eq($NEW, inference_datastructures_enumerated_types.tactical_status_from_problem_status(problem_status(problem)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59500L)
    public static SubLObject tactically_unexamined_problem_p(SubLObject problem) {
        return inference_datastructures_enumerated_types.unexamined_problem_status_p(problem_status(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59600L)
    public static SubLObject tactically_examined_problem_p(SubLObject problem) {
        return inference_datastructures_enumerated_types.examined_problem_status_p(problem_status(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59700L)
    public static SubLObject tactically_possible_problem_p(SubLObject problem) {
        return inference_datastructures_enumerated_types.possible_problem_status_p(problem_status(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59800L)
    public static SubLObject tactically_pending_problem_p(SubLObject problem) {
        return inference_datastructures_enumerated_types.pending_problem_status_p(problem_status(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 59900L)
    public static SubLObject tactically_finished_problem_p(SubLObject problem) {
        return inference_datastructures_enumerated_types.finished_problem_status_p(problem_status(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 60100L)
    public static SubLObject tactical_problem_p(SubLObject problem) {
        return makeBoolean(NIL != tactically_possible_problem_p(problem) || NIL != tactically_pending_problem_p(problem) || NIL != tactically_finished_problem_p(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 60300L)
    public static SubLObject tactically_potentially_possible_problem_p(SubLObject problem) {
        return makeBoolean(NIL != tactically_possible_problem_p(problem) || NIL != tactically_unexamined_problem_p(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 60500L)
    public static SubLObject tactically_not_potentially_possible_problem_p(SubLObject problem) {
        return makeBoolean(NIL != tactically_examined_problem_p(problem) || NIL != tactically_pending_problem_p(problem) || NIL != tactically_finished_problem_p(problem));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 60700L)
    public static SubLObject problem_store_all_modules(SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject module_counts = dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED);
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$26 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$26, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$26);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject cdolist_list_var;
                SubLObject tactic;
                SubLObject module;
                SubLObject module_name;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        cdolist_list_var = problem_tactics(problem);
                        tactic = NIL;
                        tactic = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            module = inference_datastructures_tactic.tactic_hl_module(tactic);
                            module_name = inference_modules.hl_module_name(module);
                            dictionary_utilities.dictionary_increment(module_counts, module_name, UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            tactic = cdolist_list_var.first();
                        }
                    }
                }
            }
            SubLObject idx_$27 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$27)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$27);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject cdolist_list_var2 = problem_tactics(problem2);
                        SubLObject tactic2 = NIL;
                        tactic2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject module2 = inference_datastructures_tactic.tactic_hl_module(tactic2);
                            SubLObject module_name2 = inference_modules.hl_module_name(module2);
                            dictionary_utilities.dictionary_increment(module_counts, module_name2, UNPROVIDED);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            tactic2 = cdolist_list_var2.first();
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sort.sort(dictionary_utilities.dictionary_to_alist(module_counts), Symbols.symbol_function($sym220$_), Symbols.symbol_function($sym221$CDR));
    }

    public static SubLObject declare_inference_datastructures_problem_file() {
        declareFunction(myName, "problem_print_function_trampoline", "PROBLEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "problem_p", "PROBLEM-P", 1, 0, false);
        new $problem_p$UnaryFunction();
        declareFunction(myName, "prob_suid", "PROB-SUID", 1, 0, false);
        declareFunction(myName, "prob_store", "PROB-STORE", 1, 0, false);
        declareFunction(myName, "prob_query", "PROB-QUERY", 1, 0, false);
        declareFunction(myName, "prob_free_hl_vars", "PROB-FREE-HL-VARS", 1, 0, false);
        declareFunction(myName, "prob_status", "PROB-STATUS", 1, 0, false);
        declareFunction(myName, "prob_dependent_links", "PROB-DEPENDENT-LINKS", 1, 0, false);
        declareFunction(myName, "prob_argument_links", "PROB-ARGUMENT-LINKS", 1, 0, false);
        declareFunction(myName, "prob_tactics", "PROB-TACTICS", 1, 0, false);
        declareFunction(myName, "prob_proof_bindings_index", "PROB-PROOF-BINDINGS-INDEX", 1, 0, false);
        declareFunction(myName, "prob_argument_link_bindings_index", "PROB-ARGUMENT-LINK-BINDINGS-INDEX", 1, 0, false);
        declareFunction(myName, "prob_backchain_required", "PROB-BACKCHAIN-REQUIRED", 1, 0, false);
        declareFunction(myName, "prob_memoization_state", "PROB-MEMOIZATION-STATE", 1, 0, false);
        declareFunction(myName, "_csetf_prob_suid", "_CSETF-PROB-SUID", 2, 0, false);
        declareFunction(myName, "_csetf_prob_store", "_CSETF-PROB-STORE", 2, 0, false);
        declareFunction(myName, "_csetf_prob_query", "_CSETF-PROB-QUERY", 2, 0, false);
        declareFunction(myName, "_csetf_prob_free_hl_vars", "_CSETF-PROB-FREE-HL-VARS", 2, 0, false);
        declareFunction(myName, "_csetf_prob_status", "_CSETF-PROB-STATUS", 2, 0, false);
        declareFunction(myName, "_csetf_prob_dependent_links", "_CSETF-PROB-DEPENDENT-LINKS", 2, 0, false);
        declareFunction(myName, "_csetf_prob_argument_links", "_CSETF-PROB-ARGUMENT-LINKS", 2, 0, false);
        declareFunction(myName, "_csetf_prob_tactics", "_CSETF-PROB-TACTICS", 2, 0, false);
        declareFunction(myName, "_csetf_prob_proof_bindings_index", "_CSETF-PROB-PROOF-BINDINGS-INDEX", 2, 0, false);
        declareFunction(myName, "_csetf_prob_argument_link_bindings_index", "_CSETF-PROB-ARGUMENT-LINK-BINDINGS-INDEX", 2, 0, false);
        declareFunction(myName, "_csetf_prob_backchain_required", "_CSETF-PROB-BACKCHAIN-REQUIRED", 2, 0, false);
        declareFunction(myName, "_csetf_prob_memoization_state", "_CSETF-PROB-MEMOIZATION-STATE", 2, 0, false);
        declareFunction(myName, "make_problem", "MAKE-PROBLEM", 0, 1, false);
        declareFunction(myName, "visit_defstruct_problem", "VISIT-DEFSTRUCT-PROBLEM", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_problem_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-METHOD", 2, 0, false);
        declareFunction(myName, "valid_problem_p", "VALID-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "problem_invalid_p", "PROBLEM-INVALID-P", 1, 0, false);
        declareFunction(myName, "print_problem", "PRINT-PROBLEM", 3, 0, false);
        declareFunction(myName, "sxhash_problem_method", "SXHASH-PROBLEM-METHOD", 1, 0, false);
        new $sxhash_problem_method$UnaryFunction();
        declareFunction(myName, "new_problem", "NEW-PROBLEM", 3, 0, false);
        declareMacro(me, "with_problem_memoization_state", "WITH-PROBLEM-MEMOIZATION-STATE");
        declareFunction(myName, "problem_memoization_state", "PROBLEM-MEMOIZATION-STATE", 1, 0, false);
        declareMacro(me, "do_problem_literals", "DO-PROBLEM-LITERALS");
        declareMacro(me, "do_problem_tactics", "DO-PROBLEM-TACTICS");
        declareFunction(myName, "problem_tactics", "PROBLEM-TACTICS", 1, 0, false);
        declareFunction(myName, "do_problem_tactics_status_match", "DO-PROBLEM-TACTICS-STATUS-MATCH", 2, 0, false);
        declareFunction(myName, "do_problem_tactics_completeness_match", "DO-PROBLEM-TACTICS-COMPLETENESS-MATCH", 2, 0, false);
        declareFunction(myName, "do_problem_tactics_preference_level_match", "DO-PROBLEM-TACTICS-PREFERENCE-LEVEL-MATCH", 2, 0, false);
        declareFunction(myName, "do_problem_tactics_productivity_match", "DO-PROBLEM-TACTICS-PRODUCTIVITY-MATCH", 2, 0, false);
        declareFunction(myName, "do_problem_tactics_hl_module_match", "DO-PROBLEM-TACTICS-HL-MODULE-MATCH", 2, 0, false);
        declareFunction(myName, "generalized_tactic_type_p", "GENERALIZED-TACTIC-TYPE-P", 1, 0, false);
        declareFunction(myName, "do_problem_tactics_type_match", "DO-PROBLEM-TACTICS-TYPE-MATCH", 2, 0, false);
        declareFunction(myName, "tactic_matches_type_specP", "TACTIC-MATCHES-TYPE-SPEC?", 2, 0, false);
        declareFunction(myName, "tactic_matches_any_of_type_specsP", "TACTIC-MATCHES-ANY-OF-TYPE-SPECS?", 2, 0, false);
        declareFunction(myName, "problem_argument_links", "PROBLEM-ARGUMENT-LINKS", 1, 0, false);
        declareFunction(myName, "problem_all_argument_links", "PROBLEM-ALL-ARGUMENT-LINKS", 1, 0, false);
        declareMacro(me, "do_problem_dependent_links", "DO-PROBLEM-DEPENDENT-LINKS");
        declareFunction(myName, "problem_dependent_links", "PROBLEM-DEPENDENT-LINKS", 1, 0, false);
        declareFunction(myName, "problem_all_dependent_links", "PROBLEM-ALL-DEPENDENT-LINKS", 1, 0, false);
        declareMacro(me, "do_problem_dependent_link_interpretations", "DO-PROBLEM-DEPENDENT-LINK-INTERPRETATIONS");
        declareMacro(me, "do_problem_supported_problems", "DO-PROBLEM-SUPPORTED-PROBLEMS");
        declareMacro(me, "do_problem_supported_inferences", "DO-PROBLEM-SUPPORTED-INFERENCES");
        declareMacro(me, "do_problem_supporting_problems", "DO-PROBLEM-SUPPORTING-PROBLEMS");
        declareMacro(me, "do_problem_proofs", "DO-PROBLEM-PROOFS");
        declareFunction(myName, "problem_proof_bindings_index", "PROBLEM-PROOF-BINDINGS-INDEX", 1, 0, false);
        declareFunction(myName, "proof_has_statusP", "PROOF-HAS-STATUS?", 2, 0, false);
        declareMacro(me, "do_problem_active_inferences", "DO-PROBLEM-ACTIVE-INFERENCES");
        declareMacro(me, "do_problem_relevant_inferences", "DO-PROBLEM-RELEVANT-INFERENCES");
        declareMacro(me, "do_problem_active_strategies", "DO-PROBLEM-ACTIVE-STRATEGIES");
        declareMacro(me, "do_problem_relevant_strategies", "DO-PROBLEM-RELEVANT-STRATEGIES");
        declareMacro(me, "do_problem_relevant_strategic_contexts", "DO-PROBLEM-RELEVANT-STRATEGIC-CONTEXTS");
        declareFunction(myName, "destroy_problem", "DESTROY-PROBLEM", 1, 0, false);
        declareFunction(myName, "destroy_problem_store_problem", "DESTROY-PROBLEM-STORE-PROBLEM", 1, 0, false);
        declareFunction(myName, "destroy_problem_int", "DESTROY-PROBLEM-INT", 1, 0, false);
        declareFunction(myName, "note_problem_invalid", "NOTE-PROBLEM-INVALID", 1, 0, false);
        declareFunction(myName, "problem_suid", "PROBLEM-SUID", 1, 0, false);
        declareFunction(myName, "problem_store", "PROBLEM-STORE", 1, 0, false);
        declareFunction(myName, "problem_query", "PROBLEM-QUERY", 1, 0, false);
        declareFunction(myName, "problem_free_hl_vars", "PROBLEM-FREE-HL-VARS", 1, 0, false);
        declareFunction(myName, "problem_status", "PROBLEM-STATUS", 1, 0, false);
        declareFunction(myName, "problem_dwimmed_status", "PROBLEM-DWIMMED-STATUS", 1, 0, false);
        declareFunction(myName, "set_problem_free_hl_vars", "SET-PROBLEM-FREE-HL-VARS", 2, 0, false);
        declareFunction(myName, "set_problem_status", "SET-PROBLEM-STATUS", 2, 0, false);
        declareFunction(myName, "problem_formula", "PROBLEM-FORMULA", 1, 0, false);
        declareFunction(myName, "problem_el_formula", "PROBLEM-EL-FORMULA", 1, 0, false);
        declareFunction(myName, "closed_problem_p", "CLOSED-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "open_problem_p", "OPEN-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "closed_problem_query_p", "CLOSED-PROBLEM-QUERY-P", 1, 0, false);
        declareFunction(myName, "open_problem_query_p", "OPEN-PROBLEM-QUERY-P", 1, 0, false);
        declareFunction(myName, "closed_single_literal_problem_query_p", "CLOSED-SINGLE-LITERAL-PROBLEM-QUERY-P", 1, 0, false);
        declareFunction(myName, "open_single_literal_problem_query_p", "OPEN-SINGLE-LITERAL-PROBLEM-QUERY-P", 1, 0, false);
        declareFunction(myName, "problem_variables", "PROBLEM-VARIABLES", 1, 0, false);
        declareFunction(myName, "problem_literal_count", "PROBLEM-LITERAL-COUNT", 1, 1, false);
        declareFunction(myName, "problem_query_literal_count", "PROBLEM-QUERY-LITERAL-COUNT", 1, 1, false);
        declareFunction(myName, "single_literal_problem_p", "SINGLE-LITERAL-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "single_literal_problem_predicate", "SINGLE-LITERAL-PROBLEM-PREDICATE", 1, 0, false);
        declareFunction(myName, "single_literal_problem_atomic_sentence", "SINGLE-LITERAL-PROBLEM-ATOMIC-SENTENCE", 1, 0, false);
        declareFunction(myName, "single_literal_problem_mt", "SINGLE-LITERAL-PROBLEM-MT", 1, 0, false);
        declareFunction(myName, "problem_mt", "PROBLEM-MT", 1, 0, false);
        declareFunction(myName, "problem_mts", "PROBLEM-MTS", 1, 0, false);
        declareFunction(myName, "single_literal_problem_sense", "SINGLE-LITERAL-PROBLEM-SENSE", 1, 0, false);
        declareFunction(myName, "mt_asent_sense_from_single_literal_problem", "MT-ASENT-SENSE-FROM-SINGLE-LITERAL-PROBLEM", 1, 0, false);
        declareFunction(myName, "single_literal_problem_with_predicate_p", "SINGLE-LITERAL-PROBLEM-WITH-PREDICATE-P", 2, 0, false);
        declareFunction(myName, "single_clause_problem_p", "SINGLE-CLAUSE-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "conjunctive_problem_p", "CONJUNCTIVE-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "ist_problem_p", "IST-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "join_problem_p", "JOIN-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "split_problem_p", "SPLIT-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "multi_literal_problem_p", "MULTI-LITERAL-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "disjunctive_problem_p", "DISJUNCTIVE-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "multi_clause_problem_p", "MULTI-CLAUSE-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "multi_clause_problem_query_p", "MULTI-CLAUSE-PROBLEM-QUERY-P", 1, 0, false);
        declareFunction(myName, "problem_sole_clause", "PROBLEM-SOLE-CLAUSE", 1, 0, false);
        declareFunction(myName, "problem_query_sole_clause", "PROBLEM-QUERY-SOLE-CLAUSE", 1, 0, false);
        declareFunction(myName, "problem_in_equality_reasoning_domainP", "PROBLEM-IN-EQUALITY-REASONING-DOMAIN?", 1, 0, false);
        declareFunction(myName, "problem_relevant_to_some_inferenceP", "PROBLEM-RELEVANT-TO-SOME-INFERENCE?", 1, 0, false);
        declareFunction(myName, "first_problem_relevant_inference", "FIRST-PROBLEM-RELEVANT-INFERENCE", 1, 0, false);
        declareFunction(myName, "problem_relevant_to_only_one_inferenceP", "PROBLEM-RELEVANT-TO-ONLY-ONE-INFERENCE?", 1, 0, false);
        declareFunction(myName, "problem_relevant_to_inferenceP", "PROBLEM-RELEVANT-TO-INFERENCE?", 2, 0, false);
        declareFunction(myName, "problem_relevant_to_strategyP", "PROBLEM-RELEVANT-TO-STRATEGY?", 2, 0, false);
        declareFunction(myName, "problem_relevant_strategies", "PROBLEM-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction(myName, "problem_active_in_some_strategyP", "PROBLEM-ACTIVE-IN-SOME-STRATEGY?", 1, 0, false);
        declareFunction(myName, "first_problem_active_strategy", "FIRST-PROBLEM-ACTIVE-STRATEGY", 1, 0, false);
        declareFunction(myName, "problem_argument_link_count", "PROBLEM-ARGUMENT-LINK-COUNT", 1, 0, false);
        declareFunction(myName, "problem_argument_link_of_type_count", "PROBLEM-ARGUMENT-LINK-OF-TYPE-COUNT", 2, 0, false);
        declareFunction(myName, "problem_has_argument_link_p", "PROBLEM-HAS-ARGUMENT-LINK-P", 1, 0, false);
        declareFunction(myName, "problem_has_argument_link_of_typeP", "PROBLEM-HAS-ARGUMENT-LINK-OF-TYPE?", 2, 0, false);
        declareFunction(myName, "problem_first_argument_link_of_type", "PROBLEM-FIRST-ARGUMENT-LINK-OF-TYPE", 2, 0, false);
        declareFunction(myName, "problem_sole_argument_link_of_type", "PROBLEM-SOLE-ARGUMENT-LINK-OF-TYPE", 2, 0, false);
        declareFunction(myName, "problem_all_argument_links_have_typeP", "PROBLEM-ALL-ARGUMENT-LINKS-HAVE-TYPE?", 2, 0, false);
        declareFunction(myName, "problem_has_supporting_problem_p", "PROBLEM-HAS-SUPPORTING-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "all_problem_argument_problems", "ALL-PROBLEM-ARGUMENT-PROBLEMS", 1, 0, false);
        declareFunction(myName, "all_problem_argument_problems_recursive", "ALL-PROBLEM-ARGUMENT-PROBLEMS-RECURSIVE", 2, 0, false);
        declareFunction(myName, "problem_dependent_link_count", "PROBLEM-DEPENDENT-LINK-COUNT", 1, 0, false);
        declareFunction(myName, "problem_sole_dependent_link", "PROBLEM-SOLE-DEPENDENT-LINK", 1, 0, false);
        declareFunction(myName, "problem_has_dependent_link_p", "PROBLEM-HAS-DEPENDENT-LINK-P", 1, 0, false);
        declareFunction(myName, "problem_has_dependent_link_of_typeP", "PROBLEM-HAS-DEPENDENT-LINK-OF-TYPE?", 2, 0, false);
        declareFunction(myName, "problem_has_answer_link_p", "PROBLEM-HAS-ANSWER-LINK-P", 1, 0, false);
        declareFunction(myName, "problem_has_non_answer_dependent_link_p", "PROBLEM-HAS-NON-ANSWER-DEPENDENT-LINK-P", 1, 0, false);
        declareFunction(myName, "problem_has_only_non_abducible_rule_transformation_dependent_linksP", "PROBLEM-HAS-ONLY-NON-ABDUCIBLE-RULE-TRANSFORMATION-DEPENDENT-LINKS?", 1, 0, false);
        declareFunction(myName, "problem_supported_problems", "PROBLEM-SUPPORTED-PROBLEMS", 1, 0, false);
        declareFunction(myName, "problem_supported_problem_count", "PROBLEM-SUPPORTED-PROBLEM-COUNT", 1, 0, false);
        declareFunction(myName, "problem_has_more_than_one_supported_problemP", "PROBLEM-HAS-MORE-THAN-ONE-SUPPORTED-PROBLEM?", 1, 0, false);
        declareFunction(myName, "problem_next_tactic_suid", "PROBLEM-NEXT-TACTIC-SUID", 1, 0, false);
        declareFunction(myName, "problem_tactic_count", "PROBLEM-TACTIC-COUNT", 1, 0, false);
        declareFunction(myName, "problem_has_no_tacticsP", "PROBLEM-HAS-NO-TACTICS?", 1, 0, false);
        declareFunction(myName, "problem_tactic_count_with_hl_module", "PROBLEM-TACTIC-COUNT-WITH-HL-MODULE", 2, 0, false);
        declareFunction(myName, "problem_tactic_count_with_hl_module_and_status", "PROBLEM-TACTIC-COUNT-WITH-HL-MODULE-AND-STATUS", 3, 0, false);
        declareFunction(myName, "problem_possible_tactics", "PROBLEM-POSSIBLE-TACTICS", 1, 0, false);
        declareFunction(myName, "problem_has_possible_tacticsP", "PROBLEM-HAS-POSSIBLE-TACTICS?", 1, 0, false);
        declareFunction(myName, "problem_no_tactics_possibleP", "PROBLEM-NO-TACTICS-POSSIBLE?", 1, 0, false);
        declareFunction(myName, "problem_executed_tactics", "PROBLEM-EXECUTED-TACTICS", 1, 0, false);
        declareFunction(myName, "problem_discarded_tactics", "PROBLEM-DISCARDED-TACTICS", 1, 0, false);
        declareFunction(myName, "problem_possible_tactic_count", "PROBLEM-POSSIBLE-TACTIC-COUNT", 1, 0, false);
        declareFunction(myName, "problem_executed_tactic_count", "PROBLEM-EXECUTED-TACTIC-COUNT", 1, 0, false);
        declareFunction(myName, "problem_discarded_tactic_count", "PROBLEM-DISCARDED-TACTIC-COUNT", 1, 0, false);
        declareFunction(myName, "problem_tactic_of_type_with_status_count", "PROBLEM-TACTIC-OF-TYPE-WITH-STATUS-COUNT", 1, 2, false);
        declareFunction(myName, "problem_tactic_with_status_count", "PROBLEM-TACTIC-WITH-STATUS-COUNT", 1, 1, false);
        declareFunction(myName, "problem_has_tactic_of_type_with_statusP", "PROBLEM-HAS-TACTIC-OF-TYPE-WITH-STATUS?", 2, 1, false);
        declareFunction(myName, "problem_has_tactic_of_typeP", "PROBLEM-HAS-TACTIC-OF-TYPE?", 2, 0, false);
        declareFunction(myName, "problem_has_removal_tacticsP", "PROBLEM-HAS-REMOVAL-TACTICS?", 1, 0, false);
        declareFunction(myName, "problem_has_transformation_tacticsP", "PROBLEM-HAS-TRANSFORMATION-TACTICS?", 1, 0, false);
        declareFunction(myName, "problem_has_possible_transformation_tacticsP", "PROBLEM-HAS-POSSIBLE-TRANSFORMATION-TACTICS?", 1, 0, false);
        declareFunction(myName, "problem_has_possible_removal_tacticP", "PROBLEM-HAS-POSSIBLE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction(myName, "problem_has_complete_possible_removal_tacticP", "PROBLEM-HAS-COMPLETE-POSSIBLE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction(myName, "problem_has_split_tacticsP", "PROBLEM-HAS-SPLIT-TACTICS?", 1, 0, false);
        declareFunction(myName, "problem_has_an_in_progress_tacticP", "PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?", 1, 0, false);
        declareFunction(myName, "problem_has_an_in_progress_complete_removal_tacticP", "PROBLEM-HAS-AN-IN-PROGRESS-COMPLETE-REMOVAL-TACTIC?", 2, 0, false);
        declareFunction(myName, "any_problem_has_an_in_progress_tacticP", "ANY-PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?", 1, 0, false);
        declareFunction(myName, "problem_has_no_logical_tacticsP", "PROBLEM-HAS-NO-LOGICAL-TACTICS?", 1, 0, false);
        declareFunction(myName, "problem_total_removal_productivity", "PROBLEM-TOTAL-REMOVAL-PRODUCTIVITY", 1, 0, false);
        declareFunction(myName, "problem_total_deductive_removal_productivity", "PROBLEM-TOTAL-DEDUCTIVE-REMOVAL-PRODUCTIVITY", 1, 0, false);
        declareFunction(myName, "problem_total_actual_removal_productivity", "PROBLEM-TOTAL-ACTUAL-REMOVAL-PRODUCTIVITY", 1, 0, false);
        declareFunction(myName, "problem_possible_removal_tactics", "PROBLEM-POSSIBLE-REMOVAL-TACTICS", 1, 0, false);
        declareFunction(myName, "problem_executed_removal_tactic_productivities", "PROBLEM-EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES", 1, 0, false);
        declareFunction(myName, "all_problem_proofs", "ALL-PROBLEM-PROOFS", 1, 1, false);
        declareFunction(myName, "problem_proof_count", "PROBLEM-PROOF-COUNT", 1, 1, false);
        declareFunction(myName, "problem_proven_proof_count", "PROBLEM-PROVEN-PROOF-COUNT", 1, 0, false);
        declareFunction(myName, "problem_has_some_proofP", "PROBLEM-HAS-SOME-PROOF?", 1, 1, false);
        declareFunction(myName, "problem_has_some_proven_proofP", "PROBLEM-HAS-SOME-PROVEN-PROOF?", 1, 0, false);
        declareFunction(myName, "problem_has_some_rejected_proofP", "PROBLEM-HAS-SOME-REJECTED-PROOF?", 1, 0, false);
        declareFunction(myName, "problem_proofs_lookup", "PROBLEM-PROOFS-LOOKUP", 2, 0, false);
        declareFunction(myName, "problem_argument_links_lookup", "PROBLEM-ARGUMENT-LINKS-LOOKUP", 2, 0, false);
        declareFunction(myName, "problem_potentially_processedP", "PROBLEM-POTENTIALLY-PROCESSED?", 1, 0, false);
        declareFunction(myName, "note_problem_potentially_processed", "NOTE-PROBLEM-POTENTIALLY-PROCESSED", 1, 0, false);
        declareFunction(myName, "problem_indestructibleP", "PROBLEM-INDESTRUCTIBLE?", 1, 0, false);
        declareFunction(myName, "problem_destructibleP", "PROBLEM-DESTRUCTIBLE?", 1, 0, false);
        declareFunction(myName, "problem_destructibility_status", "PROBLEM-DESTRUCTIBILITY-STATUS", 1, 0, false);
        declareFunction(myName, "problem_min_depth", "PROBLEM-MIN-DEPTH", 1, 0, false);
        declareFunction(myName, "problem_min_proof_depth", "PROBLEM-MIN-PROOF-DEPTH", 2, 0, false);
        declareFunction(myName, "problem_intuitive_min_transformation_depth", "PROBLEM-INTUITIVE-MIN-TRANSFORMATION-DEPTH", 2, 0, false);
        declareFunction(myName, "problem_min_transformation_depth", "PROBLEM-MIN-TRANSFORMATION-DEPTH", 2, 0, false);
        declareFunction(myName, "problem_min_transformation_depth_signature", "PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 2, 0, false);
        declareFunction(myName, "problem_backchain_requiredP", "PROBLEM-BACKCHAIN-REQUIRED?", 1, 0, false);
        declareFunction(myName, "add_problem_argument_link", "ADD-PROBLEM-ARGUMENT-LINK", 2, 0, false);
        declareFunction(myName, "remove_problem_argument_link", "REMOVE-PROBLEM-ARGUMENT-LINK", 2, 0, false);
        declareFunction(myName, "index_problem_argument_link", "INDEX-PROBLEM-ARGUMENT-LINK", 2, 0, false);
        declareFunction(myName, "deindex_problem_argument_link", "DEINDEX-PROBLEM-ARGUMENT-LINK", 2, 0, false);
        declareFunction(myName, "add_problem_dependent_link", "ADD-PROBLEM-DEPENDENT-LINK", 2, 0, false);
        declareFunction(myName, "remove_problem_dependent_link", "REMOVE-PROBLEM-DEPENDENT-LINK", 2, 0, false);
        declareFunction(myName, "add_problem_tactic", "ADD-PROBLEM-TACTIC", 2, 0, false);
        declareFunction(myName, "remove_problem_tactic", "REMOVE-PROBLEM-TACTIC", 2, 0, false);
        declareFunction(myName, "add_problem_proof", "ADD-PROBLEM-PROOF", 2, 0, false);
        declareFunction(myName, "remove_problem_proof", "REMOVE-PROBLEM-PROOF", 2, 0, false);
        declareFunction(myName, "remove_problem_proof_with_bindings", "REMOVE-PROBLEM-PROOF-WITH-BINDINGS", 3, 0, false);
        declareFunction(myName, "set_problem_min_depth", "SET-PROBLEM-MIN-DEPTH", 2, 0, false);
        declareFunction(myName, "set_problem_min_proof_depth", "SET-PROBLEM-MIN-PROOF-DEPTH", 3, 0, false);
        declareFunction(myName, "set_problem_min_transformation_depth", "SET-PROBLEM-MIN-TRANSFORMATION-DEPTH", 3, 0, false);
        declareFunction(myName, "set_problem_min_transformation_depth_signature", "SET-PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 3, 0, false);
        declareFunction(myName, "set_root_problem_min_transformation_depth_signature", "SET-ROOT-PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 2, 0, false);
        declareFunction(myName, "note_problem_indestructible", "NOTE-PROBLEM-INDESTRUCTIBLE", 1, 0, false);
        declareFunction(myName, "note_problem_destructible", "NOTE-PROBLEM-DESTRUCTIBLE", 1, 0, false);
        declareFunction(myName, "note_problem_min_transformation_depth_signature", "NOTE-PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 3, 0, false);
        declareFunction(myName, "problem_tactical_provability_status", "PROBLEM-TACTICAL-PROVABILITY-STATUS", 1, 0, false);
        declareFunction(myName, "tactically_good_problem_p", "TACTICALLY-GOOD-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "tactically_no_good_problem_p", "TACTICALLY-NO-GOOD-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "tactically_neutral_problem_p", "TACTICALLY-NEUTRAL-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "problem_tactical_status", "PROBLEM-TACTICAL-STATUS", 1, 0, false);
        declareFunction(myName, "tactically_new_problem_p", "TACTICALLY-NEW-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "tactically_unexamined_problem_p", "TACTICALLY-UNEXAMINED-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "tactically_examined_problem_p", "TACTICALLY-EXAMINED-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "tactically_possible_problem_p", "TACTICALLY-POSSIBLE-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "tactically_pending_problem_p", "TACTICALLY-PENDING-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "tactically_finished_problem_p", "TACTICALLY-FINISHED-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "tactical_problem_p", "TACTICAL-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "tactically_potentially_possible_problem_p", "TACTICALLY-POTENTIALLY-POSSIBLE-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "tactically_not_potentially_possible_problem_p", "TACTICALLY-NOT-POTENTIALLY-POSSIBLE-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "problem_store_all_modules", "PROBLEM-STORE-ALL-MODULES", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_datastructures_problem_file() {
        $dtp_problem$ = defconstant("*DTP-PROBLEM*", $sym0$PROBLEM);
        $empty_clauses$ = deflexical("*EMPTY-CLAUSES*", (maybeDefault($sym66$_EMPTY_CLAUSES_, $empty_clauses$, () -> (list(clauses.empty_clause())))));
        $generalized_tactic_types$ = deflexical("*GENERALIZED-TACTIC-TYPES*", $list99);
        $transformation_depth_computation$ = defvar("*TRANSFORMATION-DEPTH-COMPUTATION*", $COUNTERINTUITIVE);
        $problem_min_transformation_depth_from_signature_enabledP$ = SubLFiles.defparameter("*PROBLEM-MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE-ENABLED?*", T);
        $max_problem_tactics$ = deflexical("*MAX-PROBLEM-TACTICS*", $int$10000);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_problem_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_problem$.getGlobalValue(), Symbols.symbol_function($sym8$PROBLEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        Structures.def_csetf($sym10$PROB_SUID, $sym11$_CSETF_PROB_SUID);
        Structures.def_csetf($sym12$PROB_STORE, $sym13$_CSETF_PROB_STORE);
        Structures.def_csetf($sym14$PROB_QUERY, $sym15$_CSETF_PROB_QUERY);
        Structures.def_csetf($sym16$PROB_FREE_HL_VARS, $sym17$_CSETF_PROB_FREE_HL_VARS);
        Structures.def_csetf($sym18$PROB_STATUS, $sym19$_CSETF_PROB_STATUS);
        Structures.def_csetf($sym20$PROB_DEPENDENT_LINKS, $sym21$_CSETF_PROB_DEPENDENT_LINKS);
        Structures.def_csetf($sym22$PROB_ARGUMENT_LINKS, $sym23$_CSETF_PROB_ARGUMENT_LINKS);
        Structures.def_csetf($sym24$PROB_TACTICS, $sym25$_CSETF_PROB_TACTICS);
        Structures.def_csetf($sym26$PROB_PROOF_BINDINGS_INDEX, $sym27$_CSETF_PROB_PROOF_BINDINGS_INDEX);
        Structures.def_csetf($sym28$PROB_ARGUMENT_LINK_BINDINGS_INDEX, $sym29$_CSETF_PROB_ARGUMENT_LINK_BINDINGS_INDEX);
        Structures.def_csetf($sym30$PROB_BACKCHAIN_REQUIRED, $sym31$_CSETF_PROB_BACKCHAIN_REQUIRED);
        Structures.def_csetf($sym32$PROB_MEMOIZATION_STATE, $sym33$_CSETF_PROB_MEMOIZATION_STATE);
        Equality.identity($sym0$PROBLEM);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem$.getGlobalValue(), Symbols.symbol_function($sym51$VISIT_DEFSTRUCT_OBJECT_PROBLEM_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_problem$.getGlobalValue(), Symbols.symbol_function($sym58$SXHASH_PROBLEM_METHOD));
        subl_macro_promotions.declare_defglobal($sym66$_EMPTY_CLAUSES_);
        access_macros.register_macro_helper($sym69$PROBLEM_MEMOIZATION_STATE, $sym70$WITH_PROBLEM_MEMOIZATION_STATE);
        access_macros.register_macro_helper($sym91$PROBLEM_TACTICS, $sym92$DO_PROBLEM_TACTICS);
        access_macros.register_macro_helper($sym85$DO_PROBLEM_TACTICS_STATUS_MATCH, $sym92$DO_PROBLEM_TACTICS);
        access_macros.register_macro_helper($sym86$DO_PROBLEM_TACTICS_COMPLETENESS_MATCH, $sym92$DO_PROBLEM_TACTICS);
        access_macros.register_macro_helper($sym87$DO_PROBLEM_TACTICS_PREFERENCE_LEVEL_MATCH, $sym92$DO_PROBLEM_TACTICS);
        access_macros.register_macro_helper($sym89$DO_PROBLEM_TACTICS_PRODUCTIVITY_MATCH, $sym92$DO_PROBLEM_TACTICS);
        access_macros.register_macro_helper($sym88$DO_PROBLEM_TACTICS_HL_MODULE_MATCH, $sym92$DO_PROBLEM_TACTICS);
        access_macros.register_macro_helper($sym84$DO_PROBLEM_TACTICS_TYPE_MATCH, $sym92$DO_PROBLEM_TACTICS);
        access_macros.register_macro_helper($sym116$PROBLEM_ARGUMENT_LINKS, $sym117$DO_PROBLEM_ARGUMENT_LINKS);
        access_macros.register_macro_helper($sym121$PROBLEM_DEPENDENT_LINKS, $sym122$DO_PROBLEM_DEPENDENT_LINKS);
        access_macros.register_macro_helper($sym146$PROBLEM_PROOF_BINDINGS_INDEX, $sym149$DO_PROBLEM_PROOFS);
        access_macros.register_macro_helper($sym150$PROOF_HAS_STATUS_, $sym149$DO_PROBLEM_PROOFS);
        return NIL;
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
        me = new inference_datastructures_problem();
        $dtp_problem$ = null;
        $empty_clauses$ = null;
        $generalized_tactic_types$ = null;
        $transformation_depth_computation$ = null;
        $problem_min_transformation_depth_from_signature_enabledP$ = null;
        $max_problem_tactics$ = null;
        $sym0$PROBLEM = makeSymbol("PROBLEM");
        $sym1$PROBLEM_P = makeSymbol("PROBLEM-P");
        $int$212 = makeInteger(212);
        $list3 = list(new SubLObject[] { makeSymbol("SUID"), makeSymbol("STORE"), makeSymbol("QUERY"), makeSymbol("FREE-HL-VARS"), makeSymbol("STATUS"), makeSymbol("DEPENDENT-LINKS"), makeSymbol("ARGUMENT-LINKS"), makeSymbol("TACTICS"), makeSymbol("PROOF-BINDINGS-INDEX"),
                makeSymbol("ARGUMENT-LINK-BINDINGS-INDEX"), makeSymbol("BACKCHAIN-REQUIRED"), makeSymbol("MEMOIZATION-STATE") });
        $list4 = list(new SubLObject[] { makeKeyword("SUID"), makeKeyword("STORE"), makeKeyword("QUERY"), makeKeyword("FREE-HL-VARS"), makeKeyword("STATUS"), makeKeyword("DEPENDENT-LINKS"), makeKeyword("ARGUMENT-LINKS"), makeKeyword("TACTICS"), makeKeyword("PROOF-BINDINGS-INDEX"),
                makeKeyword("ARGUMENT-LINK-BINDINGS-INDEX"), makeKeyword("BACKCHAIN-REQUIRED"), makeKeyword("MEMOIZATION-STATE") });
        $list5 = list(new SubLObject[] { makeSymbol("PROB-SUID"), makeSymbol("PROB-STORE"), makeSymbol("PROB-QUERY"), makeSymbol("PROB-FREE-HL-VARS"), makeSymbol("PROB-STATUS"), makeSymbol("PROB-DEPENDENT-LINKS"), makeSymbol("PROB-ARGUMENT-LINKS"), makeSymbol("PROB-TACTICS"),
                makeSymbol("PROB-PROOF-BINDINGS-INDEX"), makeSymbol("PROB-ARGUMENT-LINK-BINDINGS-INDEX"), makeSymbol("PROB-BACKCHAIN-REQUIRED"), makeSymbol("PROB-MEMOIZATION-STATE") });
        $list6 = list(new SubLObject[] { makeSymbol("_CSETF-PROB-SUID"), makeSymbol("_CSETF-PROB-STORE"), makeSymbol("_CSETF-PROB-QUERY"), makeSymbol("_CSETF-PROB-FREE-HL-VARS"), makeSymbol("_CSETF-PROB-STATUS"), makeSymbol("_CSETF-PROB-DEPENDENT-LINKS"), makeSymbol("_CSETF-PROB-ARGUMENT-LINKS"),
                makeSymbol("_CSETF-PROB-TACTICS"), makeSymbol("_CSETF-PROB-PROOF-BINDINGS-INDEX"), makeSymbol("_CSETF-PROB-ARGUMENT-LINK-BINDINGS-INDEX"), makeSymbol("_CSETF-PROB-BACKCHAIN-REQUIRED"), makeSymbol("_CSETF-PROB-MEMOIZATION-STATE") });
        $sym7$PRINT_PROBLEM = makeSymbol("PRINT-PROBLEM");
        $sym8$PROBLEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROBLEM-P"));
        $sym10$PROB_SUID = makeSymbol("PROB-SUID");
        $sym11$_CSETF_PROB_SUID = makeSymbol("_CSETF-PROB-SUID");
        $sym12$PROB_STORE = makeSymbol("PROB-STORE");
        $sym13$_CSETF_PROB_STORE = makeSymbol("_CSETF-PROB-STORE");
        $sym14$PROB_QUERY = makeSymbol("PROB-QUERY");
        $sym15$_CSETF_PROB_QUERY = makeSymbol("_CSETF-PROB-QUERY");
        $sym16$PROB_FREE_HL_VARS = makeSymbol("PROB-FREE-HL-VARS");
        $sym17$_CSETF_PROB_FREE_HL_VARS = makeSymbol("_CSETF-PROB-FREE-HL-VARS");
        $sym18$PROB_STATUS = makeSymbol("PROB-STATUS");
        $sym19$_CSETF_PROB_STATUS = makeSymbol("_CSETF-PROB-STATUS");
        $sym20$PROB_DEPENDENT_LINKS = makeSymbol("PROB-DEPENDENT-LINKS");
        $sym21$_CSETF_PROB_DEPENDENT_LINKS = makeSymbol("_CSETF-PROB-DEPENDENT-LINKS");
        $sym22$PROB_ARGUMENT_LINKS = makeSymbol("PROB-ARGUMENT-LINKS");
        $sym23$_CSETF_PROB_ARGUMENT_LINKS = makeSymbol("_CSETF-PROB-ARGUMENT-LINKS");
        $sym24$PROB_TACTICS = makeSymbol("PROB-TACTICS");
        $sym25$_CSETF_PROB_TACTICS = makeSymbol("_CSETF-PROB-TACTICS");
        $sym26$PROB_PROOF_BINDINGS_INDEX = makeSymbol("PROB-PROOF-BINDINGS-INDEX");
        $sym27$_CSETF_PROB_PROOF_BINDINGS_INDEX = makeSymbol("_CSETF-PROB-PROOF-BINDINGS-INDEX");
        $sym28$PROB_ARGUMENT_LINK_BINDINGS_INDEX = makeSymbol("PROB-ARGUMENT-LINK-BINDINGS-INDEX");
        $sym29$_CSETF_PROB_ARGUMENT_LINK_BINDINGS_INDEX = makeSymbol("_CSETF-PROB-ARGUMENT-LINK-BINDINGS-INDEX");
        $sym30$PROB_BACKCHAIN_REQUIRED = makeSymbol("PROB-BACKCHAIN-REQUIRED");
        $sym31$_CSETF_PROB_BACKCHAIN_REQUIRED = makeSymbol("_CSETF-PROB-BACKCHAIN-REQUIRED");
        $sym32$PROB_MEMOIZATION_STATE = makeSymbol("PROB-MEMOIZATION-STATE");
        $sym33$_CSETF_PROB_MEMOIZATION_STATE = makeSymbol("_CSETF-PROB-MEMOIZATION-STATE");
        $SUID = makeKeyword("SUID");
        $STORE = makeKeyword("STORE");
        $QUERY = makeKeyword("QUERY");
        $FREE_HL_VARS = makeKeyword("FREE-HL-VARS");
        $STATUS = makeKeyword("STATUS");
        $DEPENDENT_LINKS = makeKeyword("DEPENDENT-LINKS");
        $ARGUMENT_LINKS = makeKeyword("ARGUMENT-LINKS");
        $TACTICS = makeKeyword("TACTICS");
        $PROOF_BINDINGS_INDEX = makeKeyword("PROOF-BINDINGS-INDEX");
        $ARGUMENT_LINK_BINDINGS_INDEX = makeKeyword("ARGUMENT-LINK-BINDINGS-INDEX");
        $BACKCHAIN_REQUIRED = makeKeyword("BACKCHAIN-REQUIRED");
        $MEMOIZATION_STATE = makeKeyword("MEMOIZATION-STATE");
        $str46$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym48$MAKE_PROBLEM = makeSymbol("MAKE-PROBLEM");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym51$VISIT_DEFSTRUCT_OBJECT_PROBLEM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROBLEM-METHOD");
        $FREE = makeKeyword("FREE");
        $str53$_Invalid_PROBLEM__s_ = makeString("<Invalid PROBLEM ~s>");
        $str54$__a_PROBLEM__a__a__s_a_ = makeString("<~a PROBLEM ~a.~a:~s~a>");
        $str55$_free_ = makeString(" free=");
        $sym56$VARIABLE_ID = makeSymbol("VARIABLE-ID");
        $str57$ = makeString("");
        $sym58$SXHASH_PROBLEM_METHOD = makeSymbol("SXHASH-PROBLEM-METHOD");
        $sym59$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
        $sym60$CONTEXTUALIZED_DNF_CLAUSES_P = makeSymbol("CONTEXTUALIZED-DNF-CLAUSES-P");
        $str61$Ignore_the_crazy_problems = makeString("Ignore the crazy problems");
        $str62$Crazy_amount_of_problems___a__in_ = makeString("Crazy amount of problems (~a) in store ~a");
        $NEW = makeKeyword("NEW");
        $UNDETERMINED = makeKeyword("UNDETERMINED");
        $str65$problem_memoization_state = makeString("problem memoization state");
        $sym66$_EMPTY_CLAUSES_ = makeSymbol("*EMPTY-CLAUSES*");
        $list67 = list(list(makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym68$WITH_MEMOIZATION_STATE = makeSymbol("WITH-MEMOIZATION-STATE");
        $sym69$PROBLEM_MEMOIZATION_STATE = makeSymbol("PROBLEM-MEMOIZATION-STATE");
        $sym70$WITH_PROBLEM_MEMOIZATION_STATE = makeSymbol("WITH-PROBLEM-MEMOIZATION-STATE");
        $list71 = list(list(makeSymbol("ASENT-VAR"), makeSymbol("MT-VAR"), makeSymbol("SENSE-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list72 = list(makeKeyword("DONE"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $DONE = makeKeyword("DONE");
        $sym75$DO_PROBLEM_QUERY_LITERALS = makeSymbol("DO-PROBLEM-QUERY-LITERALS");
        $sym76$PROBLEM_QUERY = makeSymbol("PROBLEM-QUERY");
        $list77 = list(list(new SubLObject[] { makeSymbol("TACTIC-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("STATUS"), makeSymbol("COMPLETENESS"), makeSymbol("PREFERENCE-LEVEL"), makeSymbol("HL-MODULE"), makeSymbol("TYPE"), makeSymbol("PRODUCTIVITY") }),
                makeSymbol("&BODY"), makeSymbol("BODY"));
        $list78 = list(makeKeyword("DONE"), makeKeyword("STATUS"), makeKeyword("COMPLETENESS"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("HL-MODULE"), makeKeyword("TYPE"), makeKeyword("PRODUCTIVITY"));
        $COMPLETENESS = makeKeyword("COMPLETENESS");
        $PREFERENCE_LEVEL = makeKeyword("PREFERENCE-LEVEL");
        $HL_MODULE = makeKeyword("HL-MODULE");
        $TYPE = makeKeyword("TYPE");
        $PRODUCTIVITY = makeKeyword("PRODUCTIVITY");
        $sym84$DO_PROBLEM_TACTICS_TYPE_MATCH = makeSymbol("DO-PROBLEM-TACTICS-TYPE-MATCH");
        $sym85$DO_PROBLEM_TACTICS_STATUS_MATCH = makeSymbol("DO-PROBLEM-TACTICS-STATUS-MATCH");
        $sym86$DO_PROBLEM_TACTICS_COMPLETENESS_MATCH = makeSymbol("DO-PROBLEM-TACTICS-COMPLETENESS-MATCH");
        $sym87$DO_PROBLEM_TACTICS_PREFERENCE_LEVEL_MATCH = makeSymbol("DO-PROBLEM-TACTICS-PREFERENCE-LEVEL-MATCH");
        $sym88$DO_PROBLEM_TACTICS_HL_MODULE_MATCH = makeSymbol("DO-PROBLEM-TACTICS-HL-MODULE-MATCH");
        $sym89$DO_PROBLEM_TACTICS_PRODUCTIVITY_MATCH = makeSymbol("DO-PROBLEM-TACTICS-PRODUCTIVITY-MATCH");
        $sym90$DO_LIST = makeSymbol("DO-LIST");
        $sym91$PROBLEM_TACTICS = makeSymbol("PROBLEM-TACTICS");
        $sym92$DO_PROBLEM_TACTICS = makeSymbol("DO-PROBLEM-TACTICS");
        $sym93$PWHEN = makeSymbol("PWHEN");
        $sym94$CAND = makeSymbol("CAND");
        $sym95$COMPLETENESS_P = makeSymbol("COMPLETENESS-P");
        $sym96$PREFERENCE_LEVEL_P = makeSymbol("PREFERENCE-LEVEL-P");
        $sym97$PRODUCTIVITY_P = makeSymbol("PRODUCTIVITY-P");
        $sym98$HL_MODULE_P = makeSymbol("HL-MODULE-P");
        $list99 = list(new SubLObject[] { makeKeyword("NON-TRANSFORMATION"), makeKeyword("GENERALIZED-REMOVAL"), makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE"), makeKeyword("CONNECTED-CONJUNCTION"), makeKeyword("CONJUNCTIVE"), makeKeyword("DISJUNCTIVE"), makeKeyword("LOGICAL"),
                makeKeyword("LOGICAL-CONJUNCTIVE"), makeKeyword("STRUCTURAL-CONJUNCTIVE"), makeKeyword("META-STRUCTURAL"), makeKeyword("CONTENT"), makeKeyword("UNION"), makeKeyword("SPLIT"), makeKeyword("JOIN-ORDERED"), makeKeyword("JOIN") });
        $sym100$GENERALIZED_TACTIC_TYPE_P = makeSymbol("GENERALIZED-TACTIC-TYPE-P");
        $NON_TRANSFORMATION = makeKeyword("NON-TRANSFORMATION");
        $GENERALIZED_REMOVAL = makeKeyword("GENERALIZED-REMOVAL");
        $GENERALIZED_REMOVAL_OR_REWRITE = makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE");
        $CONNECTED_CONJUNCTION = makeKeyword("CONNECTED-CONJUNCTION");
        $CONJUNCTIVE = makeKeyword("CONJUNCTIVE");
        $DISJUNCTIVE = makeKeyword("DISJUNCTIVE");
        $LOGICAL = makeKeyword("LOGICAL");
        $LOGICAL_CONJUNCTIVE = makeKeyword("LOGICAL-CONJUNCTIVE");
        $STRUCTURAL_CONJUNCTIVE = makeKeyword("STRUCTURAL-CONJUNCTIVE");
        $META_STRUCTURAL = makeKeyword("META-STRUCTURAL");
        $CONTENT = makeKeyword("CONTENT");
        $UNION = makeKeyword("UNION");
        $SPLIT = makeKeyword("SPLIT");
        $JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
        $JOIN = makeKeyword("JOIN");
        $sym116$PROBLEM_ARGUMENT_LINKS = makeSymbol("PROBLEM-ARGUMENT-LINKS");
        $sym117$DO_PROBLEM_ARGUMENT_LINKS = makeSymbol("DO-PROBLEM-ARGUMENT-LINKS");
        $list118 = list(list(makeSymbol("LINK-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list119 = list(makeKeyword("TYPE"), makeKeyword("DONE"));
        $sym120$DO_SET_CONTENTS = makeSymbol("DO-SET-CONTENTS");
        $sym121$PROBLEM_DEPENDENT_LINKS = makeSymbol("PROBLEM-DEPENDENT-LINKS");
        $sym122$DO_PROBLEM_DEPENDENT_LINKS = makeSymbol("DO-PROBLEM-DEPENDENT-LINKS");
        $sym123$PROBLEM_LINK_HAS_TYPE_ = makeSymbol("PROBLEM-LINK-HAS-TYPE?");
        $list124 = list(list(makeSymbol("LINK-VAR"), makeSymbol("MAPPED-PROBLEM-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list125 = list(makeKeyword("TYPE"), makeKeyword("OPEN?"), makeKeyword("DONE"));
        $OPEN_ = makeKeyword("OPEN?");
        $sym127$PROBLEM_VAR = makeUninternedSymbol("PROBLEM-VAR");
        $sym128$CLET = makeSymbol("CLET");
        $sym129$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");
        $sym130$MAPPED_PROBLEM_PROBLEM = makeSymbol("MAPPED-PROBLEM-PROBLEM");
        $list131 = list(list(makeSymbol("SUPPORTED-PROBLEM-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym132$LINK = makeUninternedSymbol("LINK");
        $sym133$PROBLEM_LINK_SUPPORTED_PROBLEM = makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM");
        $list134 = list(list(makeSymbol("SUPPORTED-INFERENCE-VAR"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym135$LINK = makeUninternedSymbol("LINK");
        $sym136$PROBLEM_LINK_SUPPORTED_INFERENCE = makeSymbol("PROBLEM-LINK-SUPPORTED-INFERENCE");
        $list137 = list(list(makeSymbol("SUPPORTING-PROBLEM-VAR"), makeSymbol("VARIABLE-MAP-VAR"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym138$LINK = makeUninternedSymbol("LINK");
        $sym139$DO_PROBLEM_LINK_SUPPORTING_PROBLEMS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-PROBLEMS");
        $list140 = list(list(makeSymbol("PROOF-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list141 = list(makeKeyword("PROOF-STATUS"), makeKeyword("DONE"));
        $PROOF_STATUS = makeKeyword("PROOF-STATUS");
        $sym143$PROOF_LIST = makeUninternedSymbol("PROOF-LIST");
        $sym144$BINDINGS = makeUninternedSymbol("BINDINGS");
        $sym145$DO_DICTIONARY_CONTENTS = makeSymbol("DO-DICTIONARY-CONTENTS");
        $sym146$PROBLEM_PROOF_BINDINGS_INDEX = makeSymbol("PROBLEM-PROOF-BINDINGS-INDEX");
        $sym147$IGNORE = makeSymbol("IGNORE");
        $sym148$STATUS_VAR = makeUninternedSymbol("STATUS-VAR");
        $sym149$DO_PROBLEM_PROOFS = makeSymbol("DO-PROBLEM-PROOFS");
        $sym150$PROOF_HAS_STATUS_ = makeSymbol("PROOF-HAS-STATUS?");
        $list151 = list(list(makeSymbol("INFERENCE-VAR"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym152$STRATEGY = makeUninternedSymbol("STRATEGY");
        $sym153$DO_PROBLEM_ACTIVE_STRATEGIES = makeSymbol("DO-PROBLEM-ACTIVE-STRATEGIES");
        $sym154$STRATEGY_INFERENCE = makeSymbol("STRATEGY-INFERENCE");
        $list155 = list(list(makeSymbol("INFERENCE-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym156$STORE = makeUninternedSymbol("STORE");
        $sym157$PROB = makeUninternedSymbol("PROB");
        $sym158$PROBLEM_STORE = makeSymbol("PROBLEM-STORE");
        $sym159$DO_PROBLEM_STORE_INFERENCES = makeSymbol("DO-PROBLEM-STORE-INFERENCES");
        $sym160$PROBLEM_RELEVANT_TO_INFERENCE_ = makeSymbol("PROBLEM-RELEVANT-TO-INFERENCE?");
        $list161 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym162$STORE = makeUninternedSymbol("STORE");
        $sym163$PROB = makeUninternedSymbol("PROB");
        $sym164$DO_PROBLEM_STORE_STRATEGIES = makeSymbol("DO-PROBLEM-STORE-STRATEGIES");
        $sym165$PROBLEM_ACTIVE_IN_STRATEGY_ = makeSymbol("PROBLEM-ACTIVE-IN-STRATEGY?");
        $list166 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym167$INFERENCE = makeUninternedSymbol("INFERENCE");
        $sym168$DO_PROBLEM_RELEVANT_INFERENCES = makeSymbol("DO-PROBLEM-RELEVANT-INFERENCES");
        $sym169$DO_INFERENCE_STRATEGIES = makeSymbol("DO-INFERENCE-STRATEGIES");
        $list170 = list(list(makeSymbol("STRATEGIC-CONTEXT-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym171$PROGN = makeSymbol("PROGN");
        $list172 = list(makeKeyword("TACTICAL"));
        $sym173$DO_PROBLEM_RELEVANT_STRATEGIES = makeSymbol("DO-PROBLEM-RELEVANT-STRATEGIES");
        $SKIP = makeKeyword("SKIP");
        $sym175$PROBLEM_STATUS_P = makeSymbol("PROBLEM-STATUS-P");
        $str176$poking_good_status__s_into_proble = makeString("poking good status ~s into problem ~s");
        $NEG = makeKeyword("NEG");
        $list178 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $POS = makeKeyword("POS");
        $$ist = makeConstSym(("ist"));
        $$InferencePSC = makeConstSym(("InferencePSC"));
        $str182$The_problem__S_did_not_have_a_sin = makeString("The problem ~S did not have a single-clause query.");
        $list183 = list(makeSymbol("DNF-CLAUSE"));
        $str184$Found_more_than_one__a_argument_l = makeString("Found more than one ~a argument link on ~a");
        $str185$Expected__a_to_have_a__a_argument = makeString("Expected ~a to have a ~a argument link");
        $sym186$PROBLEM_LINK_TYPE_P = makeSymbol("PROBLEM-LINK-TYPE-P");
        $sym187$_ = makeSymbol("<");
        $sym188$PROBLEM_SUID = makeSymbol("PROBLEM-SUID");
        $str189$_a_had_more_than_one_dependent_li = makeString("~a had more than one dependent link");
        $str190$_a_had_no_dependent_links = makeString("~a had no dependent links");
        $ANSWER = makeKeyword("ANSWER");
        $TRANSFORMATION = makeKeyword("TRANSFORMATION");
        $sym193$TACTIC_POSSIBLE_ = makeSymbol("TACTIC-POSSIBLE?");
        $sym194$TACTIC_EXECUTED_ = makeSymbol("TACTIC-EXECUTED?");
        $sym195$TACTIC_DISCARDED_ = makeSymbol("TACTIC-DISCARDED?");
        $POSSIBLE = makeKeyword("POSSIBLE");
        $EXECUTED = makeKeyword("EXECUTED");
        $DISCARDED = makeKeyword("DISCARDED");
        $sym199$TACTIC_STATUS_P = makeSymbol("TACTIC-STATUS-P");
        $sym200$STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");
        $REMOVAL = makeKeyword("REMOVAL");
        $sym202$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_ = makeSymbol("PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?");
        $REJECTED = makeKeyword("REJECTED");
        $PROVEN = makeKeyword("PROVEN");
        $INDESTRUCTIBLE = makeKeyword("INDESTRUCTIBLE");
        $DESTRUCTIBLE = makeKeyword("DESTRUCTIBLE");
        $UNKNOWN = makeKeyword("UNKNOWN");
        $COUNTERINTUITIVE = makeKeyword("COUNTERINTUITIVE");
        $INTUITIVE = makeKeyword("INTUITIVE");
        $sym210$_EXIT = makeSymbol("%EXIT");
        $sym211$PROBLEM_LINK_P = makeSymbol("PROBLEM-LINK-P");
        $int$10000 = makeInteger(10000);
        $sym213$TACTIC_P = makeSymbol("TACTIC-P");
        $str214$Tried_to_add__s_to__s__which_woul = makeString("Tried to add ~s to ~s, which would result in more than ~s tactics on ~s");
        $sym215$PROOF_P = makeSymbol("PROOF-P");
        $sym216$BINDINGS_P = makeSymbol("BINDINGS-P");
        $sym217$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym218$INFERENCE_P = makeSymbol("INFERENCE-P");
        $sym219$PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("PROBLEM-QUERY-DEPTH-SIGNATURE-P");
        $sym220$_ = makeSymbol(">");
        $sym221$CDR = makeSymbol("CDR");
    }

    public static class $problem_native extends SubLStructNative {
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
        private static SubLStructDeclNative structDecl;

        public $problem_native() {
            this.$suid = CommonSymbols.NIL;
            this.$store = CommonSymbols.NIL;
            this.$query = CommonSymbols.NIL;
            this.$free_hl_vars = CommonSymbols.NIL;
            this.$status = CommonSymbols.NIL;
            this.$dependent_links = CommonSymbols.NIL;
            this.$argument_links = CommonSymbols.NIL;
            this.$tactics = CommonSymbols.NIL;
            this.$proof_bindings_index = CommonSymbols.NIL;
            this.$argument_link_bindings_index = CommonSymbols.NIL;
            this.$backchain_required = CommonSymbols.NIL;
            this.$memoization_state = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $problem_native.structDecl;
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
        public SubLObject setField2(SubLObject value) {
            return this.$suid = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$store = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$query = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$free_hl_vars = value;
        }

        @Override
        public SubLObject setField6(SubLObject value) {
            return this.$status = value;
        }

        @Override
        public SubLObject setField7(SubLObject value) {
            return this.$dependent_links = value;
        }

        @Override
        public SubLObject setField8(SubLObject value) {
            return this.$argument_links = value;
        }

        @Override
        public SubLObject setField9(SubLObject value) {
            return this.$tactics = value;
        }

        @Override
        public SubLObject setField10(SubLObject value) {
            return this.$proof_bindings_index = value;
        }

        @Override
        public SubLObject setField11(SubLObject value) {
            return this.$argument_link_bindings_index = value;
        }

        @Override
        public SubLObject setField12(SubLObject value) {
            return this.$backchain_required = value;
        }

        @Override
        public SubLObject setField13(SubLObject value) {
            return this.$memoization_state = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($problem_native.class, $sym0$PROBLEM, $sym1$PROBLEM_P, $list3, $list4,
                    new String[] { "$suid", "$store", "$query", "$free_hl_vars", "$status", "$dependent_links", "$argument_links", "$tactics", "$proof_bindings_index", "$argument_link_bindings_index", "$backchain_required", "$memoization_state" }, $list5, $list6, $sym7$PRINT_PROBLEM);
        }
    }

    public static class $problem_p$UnaryFunction extends UnaryFunction {
        public $problem_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROBLEM-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return problem_p(arg1);
        }
    }

    public static class $sxhash_problem_method$UnaryFunction extends UnaryFunction {
        public $sxhash_problem_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-PROBLEM-METHOD"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return sxhash_problem_method(arg1);
        }
    }
}
/*
 *
 * Total time: 1074 ms synthetic
 */