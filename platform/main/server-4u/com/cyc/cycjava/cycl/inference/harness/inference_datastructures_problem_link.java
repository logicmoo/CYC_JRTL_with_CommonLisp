/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.bindings.apply_bindings;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types.destructibility_status_destructibleP;
import static com.cyc.cycjava.cycl.number_utilities.get_bit;
import static com.cyc.cycjava.cycl.number_utilities.set_bit;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logxor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-DATASTRUCTURES-PROBLEM-LINK
 * source file: /cyc/top/cycl/inference/harness/inference-datastructures-problem-link.lisp
 * created:     2019/07/03 17:37:38
 */
public final class inference_datastructures_problem_link extends SubLTranslatedFile implements V12 {
    /**
     * Return all the proofs for LINK.
     *
     * @unknown destructible
     */
    @LispMethod(comment = "Return all the proofs for LINK.\r\n\r\n@unknown destructible")
    public static final SubLObject problem_link_all_proofs_computed(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
            {
                SubLObject proofs = NIL;
                if (NIL != $problem_link_datastructure_stores_proofsP$.getDynamicValue(thread)) {
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_proofs(link);
                        SubLObject proof = NIL;
                        for (proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proof = cdolist_list_var.first()) {
                            if (NIL != inference_datastructures_problem.proof_has_statusP(proof, NIL)) {
                                proofs = cons(proof, proofs);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject lnk = link;
                        SubLObject problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_problem(lnk);
                        if (NIL != problem) {
                            {
                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem));
                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        SubLObject proof_list = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject cdolist_list_var = proof_list;
                                            SubLObject proof = NIL;
                                            for (proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proof = cdolist_list_var.first()) {
                                                if (lnk == inference_datastructures_proof.proof_link(proof)) {
                                                    proofs = cons(proof, proofs);
                                                }
                                            }
                                        }
                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                    }
                                } 
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                }
                return nreverse(proofs);
            }
        }
    }

    // Definitions
    /**
     * If T, when a proof is created for a link and subproofs, the proof is also added to the proofs slot of that link and used when finding link-proofs
     */
    // defparameter
    @LispMethod(comment = "If T, when a proof is created for a link and subproofs, the proof is also added to the proofs slot of that link and used when finding link-proofs\ndefparameter")
    public static final SubLSymbol $problem_link_datastructure_stores_proofsP$ = makeSymbol("*PROBLEM-LINK-DATASTRUCTURE-STORES-PROOFS?*");

    public static final SubLFile me = new inference_datastructures_problem_link();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link";


    // defconstant
    @LispMethod(comment = "defconstant\npublic static final class $problem_link_native extends SubLStructNative {\npublic SubLStructDecl getStructDecl() {\nreturn structDecl;\npublic SubLObject getField2() {\nreturn $suid;\npublic SubLObject getField3() {\nreturn $type;\npublic SubLObject getField4() {\nreturn $supported_object;\npublic SubLObject getField5() {\nreturn $supporting_mapped_problems;\npublic SubLObject getField6() {\nreturn $open_flags;\npublic SubLObject getField7() {\nreturn $data;\npublic SubLObject getField8() {\nreturn $proofs;\npublic SubLObject setField2(SubLObject value) {\nreturn $suid = value;\npublic SubLObject setField3(SubLObject value) {\nreturn $type = value;\npublic SubLObject setField4(SubLObject value) {\nreturn $supported_object = value;\npublic SubLObject setField5(SubLObject value) {\nreturn $supporting_mapped_problems = value;\npublic SubLObject setField6(SubLObject value) {\nreturn $open_flags = value;\npublic SubLObject setField7(SubLObject value) {\nreturn $data = value;\npublic SubLObject setField8(SubLObject value) {\nreturn $proofs = value;\npublic SubLObject $suid = Lisp.NIL;\npublic SubLObject $type = Lisp.NIL;\npublic SubLObject $supported_object = Lisp.NIL;\npublic SubLObject $supporting_mapped_problems = Lisp.NIL;\npublic SubLObject $open_flags = Lisp.NIL;\npublic SubLObject $data = Lisp.NIL;\npublic SubLObject $proofs = Lisp.NIL;\nprivate static final SubLStructDeclNative structDecl = makeStructDeclNative($problem_link_native.class, PROBLEM_LINK, PROBLEM_LINK_P, $list_alt3, $list_alt4, new String[]{ \"$suid\", \"$type\", \"$supported_object\", \"$supporting_mapped_problems\", \"$open_flags\", \"$data\", \"$proofs\" }, $list_alt5, $list_alt6, PRINT_PROBLEM_LINK);")
    // public static final class $problem_link_native extends SubLStructNative {
    // public SubLStructDecl getStructDecl() {
    // return structDecl;
    // public SubLObject getField2() {
    // return $suid;
    // public SubLObject getField3() {
    // return $type;
    // public SubLObject getField4() {
    // return $supported_object;
    // public SubLObject getField5() {
    // return $supporting_mapped_problems;
    // public SubLObject getField6() {
    // return $open_flags;
    // public SubLObject getField7() {
    // return $data;
    // public SubLObject getField8() {
    // return $proofs;
    // public SubLObject setField2(SubLObject value) {
    // return $suid = value;
    // public SubLObject setField3(SubLObject value) {
    // return $type = value;
    // public SubLObject setField4(SubLObject value) {
    // return $supported_object = value;
    // public SubLObject setField5(SubLObject value) {
    // return $supporting_mapped_problems = value;
    // public SubLObject setField6(SubLObject value) {
    // return $open_flags = value;
    // public SubLObject setField7(SubLObject value) {
    // return $data = value;
    // public SubLObject setField8(SubLObject value) {
    // return $proofs = value;
    // public SubLObject $suid = Lisp.NIL;
    // public SubLObject $type = Lisp.NIL;
    // public SubLObject $supported_object = Lisp.NIL;
    // public SubLObject $supporting_mapped_problems = Lisp.NIL;
    // public SubLObject $open_flags = Lisp.NIL;
    // public SubLObject $data = Lisp.NIL;
    // public SubLObject $proofs = Lisp.NIL;
    // private static final SubLStructDeclNative structDecl = makeStructDeclNative($problem_link_native.class, PROBLEM_LINK, PROBLEM_LINK_P, $list_alt3, $list_alt4, new String[]{ "$suid", "$type", "$supported_object", "$supporting_mapped_problems", "$open_flags", "$data", "$proofs" }, $list_alt5, $list_alt6, PRINT_PROBLEM_LINK);
    public static final SubLSymbol $dtp_problem_link$ = makeSymbol("*DTP-PROBLEM-LINK*");

    // defconstant
    @LispMethod(comment = "defconstant\npublic static final class $mapped_problem_native extends SubLStructNative {\npublic SubLStructDecl getStructDecl() {\nreturn structDecl;\npublic SubLObject getField2() {\nreturn $problem;\npublic SubLObject getField3() {\nreturn $variable_map;\npublic SubLObject setField2(SubLObject value) {\nreturn $problem = value;\npublic SubLObject setField3(SubLObject value) {\nreturn $variable_map = value;\npublic SubLObject $problem = Lisp.NIL;\npublic SubLObject $variable_map = Lisp.NIL;\nprivate static final SubLStructDeclNative structDecl = makeStructDeclNative($mapped_problem_native.class, MAPPED_PROBLEM, MAPPED_PROBLEM_P, $list_alt69, $list_alt70, new String[] { \"$problem\", \"$variable_map\" }, $list_alt71, $list_alt72, PRINT_MAPPED_PROBLEM);")
    // public static final class $mapped_problem_native extends SubLStructNative {
    // public SubLStructDecl getStructDecl() {
    // return structDecl;
    // public SubLObject getField2() {
    // return $problem;
    // public SubLObject getField3() {
    // return $variable_map;
    // public SubLObject setField2(SubLObject value) {
    // return $problem = value;
    // public SubLObject setField3(SubLObject value) {
    // return $variable_map = value;
    // public SubLObject $problem = Lisp.NIL;
    // public SubLObject $variable_map = Lisp.NIL;
    // private static final SubLStructDeclNative structDecl = makeStructDeclNative($mapped_problem_native.class, MAPPED_PROBLEM, MAPPED_PROBLEM_P, $list_alt69, $list_alt70, new String[] { "$problem", "$variable_map" }, $list_alt71, $list_alt72, PRINT_MAPPED_PROBLEM);
    public static final SubLSymbol $dtp_mapped_problem$ = makeSymbol("*DTP-MAPPED-PROBLEM*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol PROBLEM_LINK = makeSymbol("PROBLEM-LINK");

    private static final SubLInteger $int$213 = makeInteger(213);

    static private final SubLList $list3 = list(makeSymbol("SUID"), makeSymbol("TYPE"), makeSymbol("SUPPORTED-OBJECT"), makeSymbol("SUPPORTING-MAPPED-PROBLEMS"), makeSymbol("OPEN-FLAGS"), makeSymbol("DATA"), makeSymbol("PROOFS"), makeSymbol("MEMOIZATION-STATE"));

    static private final SubLList $list4 = list($SUID, $TYPE, makeKeyword("SUPPORTED-OBJECT"), makeKeyword("SUPPORTING-MAPPED-PROBLEMS"), makeKeyword("OPEN-FLAGS"), $DATA, makeKeyword("PROOFS"), makeKeyword("MEMOIZATION-STATE"));

    static private final SubLList $list5 = list(makeSymbol("PROB-LINK-SUID"), makeSymbol("PROB-LINK-TYPE"), makeSymbol("PROB-LINK-SUPPORTED-OBJECT"), makeSymbol("PROB-LINK-SUPPORTING-MAPPED-PROBLEMS"), makeSymbol("PROB-LINK-OPEN-FLAGS"), makeSymbol("PROB-LINK-DATA"), makeSymbol("PROB-LINK-PROOFS"), makeSymbol("PROB-LINK-MEMOIZATION-STATE"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-PROB-LINK-SUID"), makeSymbol("_CSETF-PROB-LINK-TYPE"), makeSymbol("_CSETF-PROB-LINK-SUPPORTED-OBJECT"), makeSymbol("_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS"), makeSymbol("_CSETF-PROB-LINK-OPEN-FLAGS"), makeSymbol("_CSETF-PROB-LINK-DATA"), makeSymbol("_CSETF-PROB-LINK-PROOFS"), makeSymbol("_CSETF-PROB-LINK-MEMOIZATION-STATE"));

    private static final SubLSymbol PRINT_PROBLEM_LINK = makeSymbol("PRINT-PROBLEM-LINK");

    private static final SubLSymbol PROBLEM_LINK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-LINK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROBLEM-LINK-P"));

    private static final SubLSymbol PROB_LINK_SUID = makeSymbol("PROB-LINK-SUID");

    private static final SubLSymbol _CSETF_PROB_LINK_SUID = makeSymbol("_CSETF-PROB-LINK-SUID");

    private static final SubLSymbol PROB_LINK_TYPE = makeSymbol("PROB-LINK-TYPE");

    private static final SubLSymbol _CSETF_PROB_LINK_TYPE = makeSymbol("_CSETF-PROB-LINK-TYPE");

    private static final SubLSymbol PROB_LINK_SUPPORTED_OBJECT = makeSymbol("PROB-LINK-SUPPORTED-OBJECT");

    private static final SubLSymbol _CSETF_PROB_LINK_SUPPORTED_OBJECT = makeSymbol("_CSETF-PROB-LINK-SUPPORTED-OBJECT");

    private static final SubLSymbol PROB_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("PROB-LINK-SUPPORTING-MAPPED-PROBLEMS");

    private static final SubLSymbol _CSETF_PROB_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS");

    private static final SubLSymbol PROB_LINK_OPEN_FLAGS = makeSymbol("PROB-LINK-OPEN-FLAGS");

    private static final SubLSymbol _CSETF_PROB_LINK_OPEN_FLAGS = makeSymbol("_CSETF-PROB-LINK-OPEN-FLAGS");

    private static final SubLSymbol PROB_LINK_DATA = makeSymbol("PROB-LINK-DATA");

    private static final SubLSymbol _CSETF_PROB_LINK_DATA = makeSymbol("_CSETF-PROB-LINK-DATA");

    private static final SubLSymbol PROB_LINK_PROOFS = makeSymbol("PROB-LINK-PROOFS");

    private static final SubLSymbol _CSETF_PROB_LINK_PROOFS = makeSymbol("_CSETF-PROB-LINK-PROOFS");

    private static final SubLSymbol PROB_LINK_MEMOIZATION_STATE = makeSymbol("PROB-LINK-MEMOIZATION-STATE");

    private static final SubLSymbol _CSETF_PROB_LINK_MEMOIZATION_STATE = makeSymbol("_CSETF-PROB-LINK-MEMOIZATION-STATE");

    private static final SubLSymbol $SUPPORTING_MAPPED_PROBLEMS = makeKeyword("SUPPORTING-MAPPED-PROBLEMS");

    private static final SubLString $str34$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_PROBLEM_LINK = makeSymbol("MAKE-PROBLEM-LINK");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROBLEM_LINK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROBLEM-LINK-METHOD");

    private static final SubLString $str41$_Invalid_LINK__s_ = makeString("<Invalid LINK ~s>");

    private static final SubLString $str42$__a_LINK__a__a_supporting_ = makeString("<~a LINK ~a.~a supporting ");

    private static final SubLString $str44$_a_ = makeString("~a>");

    private static final SubLString $str45$_a__a_ = makeString("~a.~a>");

    private static final SubLSymbol SXHASH_PROBLEM_LINK_METHOD = makeSymbol("SXHASH-PROBLEM-LINK-METHOD");

    private static final SubLList $list47 = list(list(makeSymbol("PROBLEM-LINK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PROBLEM_LINK_MEMOIZATION_STATE = makeSymbol("PROBLEM-LINK-MEMOIZATION-STATE");

    private static final SubLSymbol WITH_PROBLEM_LINK_MEMOIZATION_STATE = makeSymbol("WITH-PROBLEM-LINK-MEMOIZATION-STATE");

    private static final SubLSymbol PROBLEM_LINK_TYPE_P = makeSymbol("PROBLEM-LINK-TYPE-P");

    private static final SubLString $str52$Can_t_call_new_problem_link_for_a = makeString("Can't call new-problem-link for an :answer link, call new-answer-link instead");

    private static final SubLString $$$problem_link_memoization_state = makeString("problem link memoization state");

    private static final SubLSymbol PROBLEM_LINK_NUMBER_OF_SUPPORTING_PROBLEMS = makeSymbol("PROBLEM-LINK-NUMBER-OF-SUPPORTING-PROBLEMS");

    private static final SubLList $list74 = list(makeSymbol("PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-COUNT"));

    private static final SubLSymbol PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P = makeSymbol("PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P");

    private static final SubLSymbol MAPPED_PROBLEM_EQUAL = makeSymbol("MAPPED-PROBLEM-EQUAL");

    private static final SubLSymbol MAPPED_PROBLEM = makeSymbol("MAPPED-PROBLEM");

    private static final SubLInteger $int$214 = makeInteger(214);

    private static final SubLList $list83 = list(makeSymbol("PROBLEM"), makeSymbol("VARIABLE-MAP"));

    private static final SubLList $list84 = list(makeKeyword("PROBLEM"), makeKeyword("VARIABLE-MAP"));

    private static final SubLList $list85 = list(makeSymbol("MAPPED-PROB-PROBLEM"), makeSymbol("MAPPED-PROB-VARIABLE-MAP"));

    private static final SubLList $list86 = list(makeSymbol("_CSETF-MAPPED-PROB-PROBLEM"), makeSymbol("_CSETF-MAPPED-PROB-VARIABLE-MAP"));

    private static final SubLSymbol PRINT_MAPPED_PROBLEM = makeSymbol("PRINT-MAPPED-PROBLEM");

    private static final SubLSymbol MAPPED_PROBLEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MAPPED-PROBLEM-PRINT-FUNCTION-TRAMPOLINE");

    static private final SubLList $list89 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("MAPPED-PROBLEM-P"));

    private static final SubLSymbol MAPPED_PROB_PROBLEM = makeSymbol("MAPPED-PROB-PROBLEM");

    private static final SubLSymbol _CSETF_MAPPED_PROB_PROBLEM = makeSymbol("_CSETF-MAPPED-PROB-PROBLEM");

    private static final SubLSymbol MAPPED_PROB_VARIABLE_MAP = makeSymbol("MAPPED-PROB-VARIABLE-MAP");

    private static final SubLSymbol _CSETF_MAPPED_PROB_VARIABLE_MAP = makeSymbol("_CSETF-MAPPED-PROB-VARIABLE-MAP");

    private static final SubLSymbol MAKE_MAPPED_PROBLEM = makeSymbol("MAKE-MAPPED-PROBLEM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_MAPPED_PROBLEM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-MAPPED-PROBLEM-METHOD");

    private static final SubLString $str98$_MAPPED_PROBLEM__a__a_ = makeString("<MAPPED PROBLEM:~a ~a>");

    private static final SubLSymbol SXHASH_MAPPED_PROBLEM_METHOD = makeSymbol("SXHASH-MAPPED-PROBLEM-METHOD");

    private static final SubLSymbol VARIABLE_MAP_P = makeSymbol("VARIABLE-MAP-P");

    private static final SubLSymbol CLOSED_PROBLEM_P = makeSymbol("CLOSED-PROBLEM-P");

    private static final SubLList $list102 = list(list(makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), makeSymbol("LINK"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list103 = list(makeKeyword("OPEN?"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym107$PROBLEM_VAR = makeUninternedSymbol("PROBLEM-VAR");

    private static final SubLSymbol DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");

    private static final SubLSymbol MAPPED_PROBLEM_PROBLEM = makeSymbol("MAPPED-PROBLEM-PROBLEM");

    private static final SubLList $list112 = list(list(makeSymbol("VARIABLE-MAP-VAR"), makeSymbol("LINK"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym113$SUPPORTING_MAPPED_PROBLEM = makeUninternedSymbol("SUPPORTING-MAPPED-PROBLEM");

    private static final SubLSymbol DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEM_INTERPRETATIONS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-INTERPRETATIONS");

    private static final SubLSymbol MAPPED_PROBLEM_VARIABLE_MAP = makeSymbol("MAPPED-PROBLEM-VARIABLE-MAP");

    public static final SubLObject problem_link_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.print_problem_link(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject problem_link_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        inference_datastructures_problem_link.print_problem_link(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject problem_link_p_alt(SubLObject v_object) {
        return v_object.getClass() == inference_datastructures_problem_link.$problem_link_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject problem_link_p(final SubLObject v_object) {
        return v_object.getClass() == inference_datastructures_problem_link.$problem_link_native.class ? T : NIL;
    }

    public static SubLObject prob_link_suid(final SubLObject v_object) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject prob_link_type(final SubLObject v_object) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject prob_link_supported_object(final SubLObject v_object) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject prob_link_supporting_mapped_problems(final SubLObject v_object) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject prob_link_open_flags(final SubLObject v_object) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject prob_link_data(final SubLObject v_object) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject prob_link_proofs(final SubLObject v_object) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject prob_link_memoization_state(final SubLObject v_object) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject _csetf_prob_link_suid(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_prob_link_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_prob_link_supported_object(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_prob_link_supporting_mapped_problems(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_prob_link_open_flags(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_prob_link_data(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_prob_link_proofs(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_prob_link_memoization_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(v_object) : "! inference_datastructures_problem_link.problem_link_p(v_object) " + "inference_datastructures_problem_link.problem_link_p error :" + v_object;
        return v_object.setField9(value);
    }

    // 
    // public static final SubLObject prob_link_suid(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.getField2();
    // }
    // 
    // public static final SubLObject prob_link_type(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.getField3();
    // }
    // 
    // public static final SubLObject prob_link_supported_object(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.getField4();
    // }
    // 
    // public static final SubLObject prob_link_supporting_mapped_problems(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.getField5();
    // }
    // 
    // public static final SubLObject prob_link_open_flags(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.getField6();
    // }
    // 
    // public static final SubLObject prob_link_data(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.getField7();
    // }
    // 
    // public static final SubLObject prob_link_proofs(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.getField8();
    // }
    // 
    // public static final SubLObject _csetf_prob_link_suid(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.setField2(value);
    // }
    // 
    // public static final SubLObject _csetf_prob_link_type(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.setField3(value);
    // }
    // 
    // public static final SubLObject _csetf_prob_link_supported_object(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.setField4(value);
    // }
    // 
    // public static final SubLObject _csetf_prob_link_supporting_mapped_problems(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.setField5(value);
    // }
    // 
    // public static final SubLObject _csetf_prob_link_open_flags(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.setField6(value);
    // }
    // 
    // public static final SubLObject _csetf_prob_link_data(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.setField7(value);
    // }
    // 
    // public static final SubLObject _csetf_prob_link_proofs(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.setField8(value);
    // }
    @LispMethod(comment = "public static final SubLObject prob_link_suid(SubLObject v_object) {\nSubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);\nreturn v_object.getField2();\n}\npublic static final SubLObject prob_link_type(SubLObject v_object) {\nreturn v_object.getField3();\npublic static final SubLObject prob_link_supported_object(SubLObject v_object) {\nreturn v_object.getField4();\npublic static final SubLObject prob_link_supporting_mapped_problems(SubLObject v_object) {\nreturn v_object.getField5();\npublic static final SubLObject prob_link_open_flags(SubLObject v_object) {\nreturn v_object.getField6();\npublic static final SubLObject prob_link_data(SubLObject v_object) {\nreturn v_object.getField7();\npublic static final SubLObject prob_link_proofs(SubLObject v_object) {\nreturn v_object.getField8();\npublic static final SubLObject _csetf_prob_link_suid(SubLObject v_object, SubLObject value) {\nreturn v_object.setField2(value);\npublic static final SubLObject _csetf_prob_link_type(SubLObject v_object, SubLObject value) {\nreturn v_object.setField3(value);\npublic static final SubLObject _csetf_prob_link_supported_object(SubLObject v_object, SubLObject value) {\nreturn v_object.setField4(value);\npublic static final SubLObject _csetf_prob_link_supporting_mapped_problems(SubLObject v_object, SubLObject value) {\nreturn v_object.setField5(value);\npublic static final SubLObject _csetf_prob_link_open_flags(SubLObject v_object, SubLObject value) {\nreturn v_object.setField6(value);\npublic static final SubLObject _csetf_prob_link_data(SubLObject v_object, SubLObject value) {\nreturn v_object.setField7(value);\npublic static final SubLObject _csetf_prob_link_proofs(SubLObject v_object, SubLObject value) {\nreturn v_object.setField8(value);")
    public static final SubLObject make_problem_link_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new inference_datastructures_problem_link.$problem_link_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SUID)) {
                        inference_datastructures_problem_link._csetf_prob_link_suid(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TYPE)) {
                            inference_datastructures_problem_link._csetf_prob_link_type(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SUPPORTED_OBJECT)) {
                                inference_datastructures_problem_link._csetf_prob_link_supported_object(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SUPPORTING_MAPPED_PROBLEMS)) {
                                    inference_datastructures_problem_link._csetf_prob_link_supporting_mapped_problems(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($OPEN_FLAGS)) {
                                        inference_datastructures_problem_link._csetf_prob_link_open_flags(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($DATA)) {
                                            inference_datastructures_problem_link._csetf_prob_link_data(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($PROOFS)) {
                                                inference_datastructures_problem_link._csetf_prob_link_proofs(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt30$Invalid_slot__S_for_construction_, current_arg);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    // public static final SubLObject prob_link_suid(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.getField2();
    // }
    // public static final SubLObject prob_link_type(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.getField3();
    // }
    // public static final SubLObject prob_link_supported_object(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.getField4();
    // }
    // public static final SubLObject prob_link_supporting_mapped_problems(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.getField5();
    // }
    // public static final SubLObject prob_link_open_flags(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.getField6();
    // }
    // public static final SubLObject prob_link_data(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.getField7();
    // }
    // public static final SubLObject prob_link_proofs(SubLObject v_object) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.getField8();
    // }
    // public static final SubLObject _csetf_prob_link_suid(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.setField2(value);
    // }
    // public static final SubLObject _csetf_prob_link_type(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.setField3(value);
    // }
    // public static final SubLObject _csetf_prob_link_supported_object(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.setField4(value);
    // }
    // public static final SubLObject _csetf_prob_link_supporting_mapped_problems(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.setField5(value);
    // }
    // public static final SubLObject _csetf_prob_link_open_flags(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.setField6(value);
    // }
    // public static final SubLObject _csetf_prob_link_data(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.setField7(value);
    // }
    // public static final SubLObject _csetf_prob_link_proofs(SubLObject v_object, SubLObject value) {
    // SubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);
    // return v_object.setField8(value);
    // }
    @LispMethod(comment = "public static final SubLObject prob_link_suid(SubLObject v_object) {\nSubLTrampolineFile.checkType(v_object, PROBLEM_LINK_P);\nreturn v_object.getField2();\n}\npublic static final SubLObject prob_link_type(SubLObject v_object) {\nreturn v_object.getField3();\npublic static final SubLObject prob_link_supported_object(SubLObject v_object) {\nreturn v_object.getField4();\npublic static final SubLObject prob_link_supporting_mapped_problems(SubLObject v_object) {\nreturn v_object.getField5();\npublic static final SubLObject prob_link_open_flags(SubLObject v_object) {\nreturn v_object.getField6();\npublic static final SubLObject prob_link_data(SubLObject v_object) {\nreturn v_object.getField7();\npublic static final SubLObject prob_link_proofs(SubLObject v_object) {\nreturn v_object.getField8();\npublic static final SubLObject _csetf_prob_link_suid(SubLObject v_object, SubLObject value) {\nreturn v_object.setField2(value);\npublic static final SubLObject _csetf_prob_link_type(SubLObject v_object, SubLObject value) {\nreturn v_object.setField3(value);\npublic static final SubLObject _csetf_prob_link_supported_object(SubLObject v_object, SubLObject value) {\nreturn v_object.setField4(value);\npublic static final SubLObject _csetf_prob_link_supporting_mapped_problems(SubLObject v_object, SubLObject value) {\nreturn v_object.setField5(value);\npublic static final SubLObject _csetf_prob_link_open_flags(SubLObject v_object, SubLObject value) {\nreturn v_object.setField6(value);\npublic static final SubLObject _csetf_prob_link_data(SubLObject v_object, SubLObject value) {\nreturn v_object.setField7(value);\npublic static final SubLObject _csetf_prob_link_proofs(SubLObject v_object, SubLObject value) {\nreturn v_object.setField8(value);")
    public static SubLObject make_problem_link(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new inference_datastructures_problem_link.$problem_link_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUID)) {
                inference_datastructures_problem_link._csetf_prob_link_suid(v_new, current_value);
            } else
                if (pcase_var.eql($TYPE)) {
                    inference_datastructures_problem_link._csetf_prob_link_type(v_new, current_value);
                } else
                    if (pcase_var.eql($SUPPORTED_OBJECT)) {
                        inference_datastructures_problem_link._csetf_prob_link_supported_object(v_new, current_value);
                    } else
                        if (pcase_var.eql(inference_datastructures_problem_link.$SUPPORTING_MAPPED_PROBLEMS)) {
                            inference_datastructures_problem_link._csetf_prob_link_supporting_mapped_problems(v_new, current_value);
                        } else
                            if (pcase_var.eql($OPEN_FLAGS)) {
                                inference_datastructures_problem_link._csetf_prob_link_open_flags(v_new, current_value);
                            } else
                                if (pcase_var.eql($DATA)) {
                                    inference_datastructures_problem_link._csetf_prob_link_data(v_new, current_value);
                                } else
                                    if (pcase_var.eql($PROOFS)) {
                                        inference_datastructures_problem_link._csetf_prob_link_proofs(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($MEMOIZATION_STATE)) {
                                            inference_datastructures_problem_link._csetf_prob_link_memoization_state(v_new, current_value);
                                        } else {
                                            Errors.error(inference_datastructures_problem_link.$str34$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_problem_link(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, inference_datastructures_problem_link.MAKE_PROBLEM_LINK, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SUID, inference_datastructures_problem_link.prob_link_suid(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPE, inference_datastructures_problem_link.prob_link_type(obj));
        funcall(visitor_fn, obj, $SLOT, $SUPPORTED_OBJECT, inference_datastructures_problem_link.prob_link_supported_object(obj));
        funcall(visitor_fn, obj, $SLOT, inference_datastructures_problem_link.$SUPPORTING_MAPPED_PROBLEMS, inference_datastructures_problem_link.prob_link_supporting_mapped_problems(obj));
        funcall(visitor_fn, obj, $SLOT, $OPEN_FLAGS, inference_datastructures_problem_link.prob_link_open_flags(obj));
        funcall(visitor_fn, obj, $SLOT, $DATA, inference_datastructures_problem_link.prob_link_data(obj));
        funcall(visitor_fn, obj, $SLOT, $PROOFS, inference_datastructures_problem_link.prob_link_proofs(obj));
        funcall(visitor_fn, obj, $SLOT, $MEMOIZATION_STATE, inference_datastructures_problem_link.prob_link_memoization_state(obj));
        funcall(visitor_fn, obj, $END, inference_datastructures_problem_link.MAKE_PROBLEM_LINK, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_problem_link_method(final SubLObject obj, final SubLObject visitor_fn) {
        return inference_datastructures_problem_link.visit_defstruct_problem_link(obj, visitor_fn);
    }

    public static final SubLObject valid_problem_link_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_p(v_object)) && (NIL == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_invalid_p(v_object)));
    }

    public static SubLObject valid_problem_link_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && (NIL == inference_datastructures_problem_link.problem_link_invalid_p(v_object)));
    }

    public static final SubLObject problem_link_invalid_p_alt(SubLObject problem_link) {
        return eq($FREE, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_type(problem_link));
    }

    public static SubLObject problem_link_invalid_p(final SubLObject problem_link) {
        return eq($FREE, inference_datastructures_problem_link.problem_link_type(problem_link));
    }

    public static final SubLObject print_problem_link_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_invalid_p(v_object)) {
            format(stream, $str_alt32$_Invalid_LINK__s_, inference_datastructures_problem_link.prob_link_suid(v_object));
        } else {
            {
                SubLObject store_suid = inference_datastructures_problem_store.problem_store_suid(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_store(v_object));
                SubLObject type = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_type(v_object);
                format(stream, $str_alt33$__a_LINK__a__a_supporting_, new SubLObject[]{ type, store_suid, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_suid(v_object) });
                if ($ANSWER == type) {
                    format(stream, $str_alt35$_a_, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_inference(v_object));
                } else {
                    format(stream, $str_alt36$_a__a_, store_suid, inference_datastructures_problem.problem_suid(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_problem(v_object)));
                }
            }
        }
        return NIL;
    }

    public static SubLObject print_problem_link(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        if (NIL != inference_datastructures_problem_link.problem_link_invalid_p(v_object)) {
            format(stream, inference_datastructures_problem_link.$str41$_Invalid_LINK__s_, inference_datastructures_problem_link.prob_link_suid(v_object));
        } else {
            final SubLObject store_suid = inference_datastructures_problem_store.problem_store_suid(inference_datastructures_problem_link.problem_link_store(v_object));
            final SubLObject type = inference_datastructures_problem_link.problem_link_type(v_object);
            format(stream, inference_datastructures_problem_link.$str42$__a_LINK__a__a_supporting_, new SubLObject[]{ type, store_suid, inference_datastructures_problem_link.problem_link_suid(v_object) });
            if ($ANSWER == type) {
                format(stream, inference_datastructures_problem_link.$str44$_a_, inference_datastructures_problem_link.problem_link_supported_inference(v_object));
            } else {
                format(stream, inference_datastructures_problem_link.$str45$_a__a_, store_suid, inference_datastructures_problem.problem_suid(inference_datastructures_problem_link.problem_link_supported_problem(v_object)));
            }
        }
        return NIL;
    }

    public static final SubLObject sxhash_problem_link_method_alt(SubLObject v_object) {
        return inference_datastructures_problem_link.prob_link_suid(v_object);
    }

    public static SubLObject sxhash_problem_link_method(final SubLObject v_object) {
        return inference_datastructures_problem_link.prob_link_suid(v_object);
    }

    public static SubLObject with_problem_link_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_datastructures_problem_link.$list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_link = NIL;
        destructuring_bind_must_consp(current, datum, inference_datastructures_problem_link.$list47);
        problem_link = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(WITH_MEMOIZATION_STATE, list(list(inference_datastructures_problem_link.PROBLEM_LINK_MEMOIZATION_STATE, problem_link)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, inference_datastructures_problem_link.$list47);
        return NIL;
    }

    public static SubLObject problem_link_memoization_state(final SubLObject problem_link) {
        return inference_datastructures_problem_link.prob_link_memoization_state(problem_link);
    }

    /**
     * Creates a new link under SUPPORTED-PROBLEM
     */
    @LispMethod(comment = "Creates a new link under SUPPORTED-PROBLEM")
    public static final SubLObject new_problem_link_alt(SubLObject type, SubLObject supported_problem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(type, PROBLEM_LINK_TYPE_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if ($ANSWER == type) {
                    Errors.error($str_alt39$Can_t_call_new_problem_link_for_a);
                }
            }
            SubLTrampolineFile.checkType(supported_problem, PROBLEM_P);
            {
                SubLObject link = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.new_problem_link_int(supported_problem, type);
                inference_datastructures_problem.add_problem_argument_link(supported_problem, link);
                return link;
            }
        }
    }

    /**
     * Creates a new link under SUPPORTED-PROBLEM
     */
    @LispMethod(comment = "Creates a new link under SUPPORTED-PROBLEM")
    public static SubLObject new_problem_link(final SubLObject type, final SubLObject supported_problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_enumerated_types.problem_link_type_p(type) : "! inference_datastructures_enumerated_types.problem_link_type_p(type) " + ("inference_datastructures_enumerated_types.problem_link_type_p(type) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_link_type_p(type) ") + type;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($ANSWER == type)) {
            Errors.error(inference_datastructures_problem_link.$str52$Can_t_call_new_problem_link_for_a);
        }
        assert NIL != inference_datastructures_problem.problem_p(supported_problem) : "! inference_datastructures_problem.problem_p(supported_problem) " + ("inference_datastructures_problem.problem_p(supported_problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(supported_problem) ") + supported_problem;
        final SubLObject link = inference_datastructures_problem_link.new_problem_link_int(supported_problem, type);
        inference_datastructures_problem.add_problem_argument_link(supported_problem, link);
        return link;
    }

    public static final SubLObject new_problem_link_int_alt(SubLObject supported_object, SubLObject type) {
        {
            SubLObject link = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.make_problem_link(UNPROVIDED);
            inference_datastructures_problem_link._csetf_prob_link_type(link, type);
            inference_datastructures_problem_link._csetf_prob_link_supported_object(link, supported_object);
            {
                SubLObject store = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_store(link);
                SubLObject suid = inference_datastructures_problem_store.problem_store_new_link_id(store);
                inference_metrics.increment_problem_link_type_historical_counts(type);
                inference_datastructures_problem_link._csetf_prob_link_suid(link, suid);
                inference_datastructures_problem_link._csetf_prob_link_supporting_mapped_problems(link, NIL);
                inference_datastructures_problem_link._csetf_prob_link_open_flags(link, ZERO_INTEGER);
                inference_datastructures_problem_store.add_problem_store_link(store, link);
            }
            return link;
        }
    }

    public static SubLObject new_problem_link_int(final SubLObject supported_object, final SubLObject type) {
        final SubLObject link = inference_datastructures_problem_link.make_problem_link(UNPROVIDED);
        inference_datastructures_problem_link._csetf_prob_link_type(link, type);
        inference_datastructures_problem_link._csetf_prob_link_supported_object(link, supported_object);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        final SubLObject suid = inference_datastructures_problem_store.problem_store_new_link_id(store);
        inference_metrics.increment_problem_link_type_historical_counts(type);
        inference_datastructures_problem_link._csetf_prob_link_suid(link, suid);
        inference_datastructures_problem_link._csetf_prob_link_supporting_mapped_problems(link, NIL);
        inference_datastructures_problem_link._csetf_prob_link_open_flags(link, ZERO_INTEGER);
        inference_datastructures_problem_link._csetf_prob_link_memoization_state(link, memoization_state.new_memoization_state(inference_datastructures_problem_link.$$$problem_link_memoization_state, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        inference_datastructures_problem_store.add_problem_store_link(store, link);
        return link;
    }

    public static final SubLObject destroy_problem_link_alt(SubLObject link) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.valid_problem_link_p(link)) {
            {
                SubLObject type = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_type(link);
                SubLObject store = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_store(link);
                com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.note_problem_link_invalid(link);
                {
                    SubLObject pcase_var = type;
                    if (pcase_var.eql($ANSWER)) {
                        {
                            SubLObject inference = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_object(link);
                            if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                                inference_datastructures_inference.destroy_inference(inference);
                            }
                        }
                    } else {
                        if (pcase_var.eql($REMOVAL)) {
                            inference_worker_removal.destroy_removal_link(link);
                        } else {
                            if (pcase_var.eql($TRANSFORMATION)) {
                                inference_worker_transformation.destroy_transformation_link(link);
                            } else {
                                if (pcase_var.eql($RESIDUAL_TRANSFORMATION)) {
                                    inference_worker_residual_transformation.destroy_residual_transformation_link(link);
                                } else {
                                    if (pcase_var.eql($JOIN_ORDERED)) {
                                        inference_worker_join_ordered.destroy_join_ordered_link(link);
                                    } else {
                                        if (pcase_var.eql($JOIN)) {
                                            inference_worker_join.destroy_join_link(link);
                                        } else {
                                            if (pcase_var.eql($SPLIT)) {
                                                inference_worker_split.destroy_split_link(link);
                                            } else {
                                                if (pcase_var.eql($UNION)) {
                                                    inference_worker_union.destroy_union_link(link);
                                                } else {
                                                    if (pcase_var.eql($RESTRICTION)) {
                                                        inference_worker_restriction.destroy_restriction_link(link);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if ($ANSWER != type) {
                    {
                        SubLObject doomed_proofs = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_all_proofs(link);
                        SubLObject cdolist_list_var = doomed_proofs;
                        SubLObject proof = NIL;
                        for (proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proof = cdolist_list_var.first()) {
                            if (NIL != inference_datastructures_proof.valid_proof_p(proof)) {
                                inference_datastructures_proof.destroy_proof(proof);
                            }
                        }
                    }
                }
                {
                    SubLObject link_var = link;
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    SubLObject supporting_mapped_problem = NIL;
                    for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                            {
                                SubLObject supporting_problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                SubLObject variable_map = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                                if (NIL != inference_datastructures_problem.valid_problem_p(supporting_problem)) {
                                    inference_datastructures_problem.remove_problem_dependent_link(supporting_problem, link);
                                }
                            }
                        }
                    }
                }
                if ($ANSWER != type) {
                    {
                        SubLObject supported_problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_problem(link);
                        if (NIL != inference_datastructures_problem.valid_problem_p(supported_problem)) {
                            inference_datastructures_problem.remove_problem_argument_link(supported_problem, link);
                        }
                    }
                }
                inference_datastructures_problem_store.remove_problem_store_link(store, link);
            }
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.destroy_problem_link_int(link);
        }
        return NIL;
    }

    public static SubLObject destroy_problem_link(final SubLObject link) {
        if (NIL != inference_datastructures_problem_link.valid_problem_link_p(link)) {
            final SubLObject type = inference_datastructures_problem_link.problem_link_type(link);
            final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
            inference_datastructures_problem_link.note_problem_link_invalid(link);
            final SubLObject pcase_var = type;
            if (pcase_var.eql($ANSWER)) {
                final SubLObject inference = inference_datastructures_problem_link.problem_link_supported_object(link);
                if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                    inference_datastructures_inference.destroy_inference(inference);
                }
            } else
                if (pcase_var.eql($REMOVAL)) {
                    inference_worker_removal.destroy_removal_link(link);
                } else
                    if (pcase_var.eql($TRANSFORMATION)) {
                        inference_worker_transformation.destroy_transformation_link(link);
                    } else
                        if (pcase_var.eql($RESIDUAL_TRANSFORMATION)) {
                            inference_worker_residual_transformation.destroy_residual_transformation_link(link);
                        } else
                            if (pcase_var.eql($JOIN_ORDERED)) {
                                inference_worker_join_ordered.destroy_join_ordered_link(link);
                            } else
                                if (pcase_var.eql($JOIN)) {
                                    inference_worker_join.destroy_join_link(link);
                                } else
                                    if (pcase_var.eql($SPLIT)) {
                                        inference_worker_split.destroy_split_link(link);
                                    } else
                                        if (pcase_var.eql($UNION)) {
                                            inference_worker_union.destroy_union_link(link);
                                        } else
                                            if (pcase_var.eql($RESTRICTION)) {
                                                inference_worker_restriction.destroy_restriction_link(link);
                                            }








            if ($ANSWER != type) {
                SubLObject cdolist_list_var;
                final SubLObject doomed_proofs = cdolist_list_var = inference_datastructures_problem_link.problem_link_all_proofs(link);
                SubLObject proof = NIL;
                proof = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != inference_datastructures_proof.valid_proof_p(proof)) {
                        inference_datastructures_proof.destroy_proof(proof);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    proof = cdolist_list_var.first();
                } 
            }
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
            SubLObject supporting_mapped_problem = NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                    final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                    if (NIL != inference_datastructures_problem.valid_problem_p(supporting_problem)) {
                        inference_datastructures_problem.remove_problem_dependent_link(supporting_problem, link);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            } 
            if ($ANSWER != type) {
                final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if (NIL != inference_datastructures_problem.valid_problem_p(supported_problem)) {
                    inference_datastructures_problem.remove_problem_argument_link(supported_problem, link);
                }
            }
            inference_datastructures_problem_store.remove_problem_store_link(store, link);
            inference_datastructures_problem_link._csetf_prob_link_memoization_state(link, $FREE);
            return inference_datastructures_problem_link.destroy_problem_link_int(link);
        }
        return NIL;
    }

    public static final SubLObject destroy_problem_store_link_alt(SubLObject link) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.valid_problem_link_p(link)) {
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.note_problem_link_invalid(link);
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.destroy_problem_link_int(link);
        }
        return NIL;
    }

    public static SubLObject destroy_problem_store_link(final SubLObject link) {
        if (NIL != inference_datastructures_problem_link.valid_problem_link_p(link)) {
            inference_datastructures_problem_link.note_problem_link_invalid(link);
            return inference_datastructures_problem_link.destroy_problem_link_int(link);
        }
        return NIL;
    }

    public static final SubLObject destroy_problem_link_int_alt(SubLObject link) {
        inference_datastructures_problem_link._csetf_prob_link_data(link, $FREE);
        inference_datastructures_problem_link._csetf_prob_link_open_flags(link, $FREE);
        {
            SubLObject link_var = link;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject mapped_problem = NIL;
            for (mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapped_problem = cdolist_list_var.first()) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, mapped_problem)) {
                    com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.destroy_problem_link_mapped_problem(mapped_problem);
                }
            }
        }
        inference_datastructures_problem_link._csetf_prob_link_supporting_mapped_problems(link, $FREE);
        inference_datastructures_problem_link._csetf_prob_link_supported_object(link, $FREE);
        return NIL;
    }

    public static SubLObject destroy_problem_link_int(final SubLObject link) {
        inference_datastructures_problem_link._csetf_prob_link_data(link, $FREE);
        inference_datastructures_problem_link._csetf_prob_link_open_flags(link, $FREE);
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject mapped_problem = NIL;
        mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, mapped_problem)) {
                inference_datastructures_problem_link.destroy_problem_link_mapped_problem(mapped_problem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapped_problem = cdolist_list_var.first();
        } 
        inference_datastructures_problem_link._csetf_prob_link_supporting_mapped_problems(link, $FREE);
        inference_datastructures_problem_link._csetf_prob_link_supported_object(link, $FREE);
        return NIL;
    }

    public static final SubLObject note_problem_link_invalid_alt(SubLObject link) {
        inference_datastructures_problem_link._csetf_prob_link_type(link, $FREE);
        return link;
    }

    public static SubLObject note_problem_link_invalid(final SubLObject link) {
        inference_datastructures_problem_link._csetf_prob_link_type(link, $FREE);
        return link;
    }

    public static final SubLObject problem_link_suid_alt(SubLObject link) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        return inference_datastructures_problem_link.prob_link_suid(link);
    }

    public static SubLObject problem_link_suid(final SubLObject link) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        return inference_datastructures_problem_link.prob_link_suid(link);
    }

    public static final SubLObject problem_link_type_alt(SubLObject link) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        return inference_datastructures_problem_link.prob_link_type(link);
    }

    public static SubLObject problem_link_type(final SubLObject link) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        return inference_datastructures_problem_link.prob_link_type(link);
    }

    public static final SubLObject problem_link_supported_object_alt(SubLObject link) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        return inference_datastructures_problem_link.prob_link_supported_object(link);
    }

    public static SubLObject problem_link_supported_object(final SubLObject link) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        return inference_datastructures_problem_link.prob_link_supported_object(link);
    }

    public static final SubLObject problem_link_supporting_mapped_problems_alt(SubLObject link) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        return inference_datastructures_problem_link.prob_link_supporting_mapped_problems(link);
    }

    public static SubLObject problem_link_supporting_mapped_problems(final SubLObject link) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        return inference_datastructures_problem_link.prob_link_supporting_mapped_problems(link);
    }

    public static final SubLObject problem_link_open_flags_alt(SubLObject link) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        return inference_datastructures_problem_link.prob_link_open_flags(link);
    }

    public static SubLObject problem_link_open_flags(final SubLObject link) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        return inference_datastructures_problem_link.prob_link_open_flags(link);
    }

    public static final SubLObject problem_link_data_alt(SubLObject link) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        return inference_datastructures_problem_link.prob_link_data(link);
    }

    public static SubLObject problem_link_data(final SubLObject link) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        return inference_datastructures_problem_link.prob_link_data(link);
    }

    public static final SubLObject set_problem_link_open_flags_alt(SubLObject link, SubLObject flags) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        SubLTrampolineFile.checkType(flags, INTEGERP);
        inference_datastructures_problem_link._csetf_prob_link_open_flags(link, flags);
        return link;
    }

    public static SubLObject set_problem_link_open_flags(final SubLObject link, final SubLObject flags) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        assert NIL != integerp(flags) : "! integerp(flags) " + ("Types.integerp(flags) " + "CommonSymbols.NIL != Types.integerp(flags) ") + flags;
        inference_datastructures_problem_link._csetf_prob_link_open_flags(link, flags);
        return link;
    }

    public static final SubLObject set_problem_link_data_alt(SubLObject link, SubLObject data) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        inference_datastructures_problem_link._csetf_prob_link_data(link, data);
        return link;
    }

    public static SubLObject set_problem_link_data(final SubLObject link, final SubLObject data) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        inference_datastructures_problem_link._csetf_prob_link_data(link, data);
        return link;
    }

    public static final SubLObject add_problem_link_proof_alt(SubLObject link, SubLObject proof) {
        {
            SubLObject proofs = inference_datastructures_problem_link.prob_link_proofs(link);
            SubLObject item_var = proof;
            if (NIL == member(item_var, proofs, symbol_function(EQL), symbol_function(IDENTITY))) {
                proofs = cons(item_var, proofs);
            }
            inference_datastructures_problem_link._csetf_prob_link_proofs(link, proofs);
            return proofs;
        }
    }

    public static SubLObject add_problem_link_proof(final SubLObject link, final SubLObject proof) {
        SubLObject proofs = inference_datastructures_problem_link.prob_link_proofs(link);
        if (NIL == member(proof, proofs, symbol_function(EQL), symbol_function(IDENTITY))) {
            proofs = cons(proof, proofs);
        }
        inference_datastructures_problem_link._csetf_prob_link_proofs(link, proofs);
        return proofs;
    }

    public static final SubLObject remove_problem_link_proof_alt(SubLObject link, SubLObject old_proof) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.valid_problem_link_p(link)) {
            {
                SubLObject proofs = inference_datastructures_problem_link.prob_link_proofs(link);
                proofs = delete(old_proof, proofs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                inference_datastructures_problem_link._csetf_prob_link_proofs(link, proofs);
                return proofs;
            }
        }
        return NIL;
    }

    public static SubLObject remove_problem_link_proof(final SubLObject link, final SubLObject old_proof) {
        if (NIL != inference_datastructures_problem_link.valid_problem_link_p(link)) {
            SubLObject proofs = inference_datastructures_problem_link.prob_link_proofs(link);
            proofs = delete(old_proof, proofs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            inference_datastructures_problem_link._csetf_prob_link_proofs(link, proofs);
            return proofs;
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown result is destructible
     */
    @LispMethod(comment = "@unknown result is destructible")
    public static final SubLObject problem_link_supporting_problems_alt(SubLObject link) {
        {
            SubLObject problems = NIL;
            SubLObject link_var = link;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject supporting_mapped_problem = NIL;
            for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                    problems = cons(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem), problems);
                }
            }
            return nreverse(problems);
        }
    }

    /**
     *
     *
     * @unknown result is destructible
     */
    @LispMethod(comment = "@unknown result is destructible")
    public static SubLObject problem_link_supporting_problems(final SubLObject link) {
        SubLObject problems = NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                problems = cons(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem), problems);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        } 
        return nreverse(problems);
    }

    public static final SubLObject problem_link_store_alt(SubLObject link) {
        if (NIL != inference_worker_answer.answer_link_p(link)) {
            return inference_datastructures_inference.inference_problem_store(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_inference(link));
        } else {
            return inference_datastructures_problem.problem_store(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_problem(link));
        }
    }

    public static SubLObject problem_link_store(final SubLObject link) {
        if (NIL != inference_worker_answer.answer_link_p(link)) {
            return inference_datastructures_inference.inference_problem_store(inference_datastructures_problem_link.problem_link_supported_inference(link));
        }
        return inference_datastructures_problem.problem_store(inference_datastructures_problem_link.problem_link_supported_problem(link));
    }

    public static final SubLObject problem_link_has_typeP_alt(SubLObject link, SubLObject type) {
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($CONTENT)) {
                return inference_worker.content_link_p(link);
            } else {
                if (pcase_var.eql($STRUCTURAL)) {
                    return inference_worker.structural_link_p(link);
                } else {
                    if (pcase_var.eql($DISJUNCTIVE)) {
                        return inference_worker.disjunctive_link_p(link);
                    } else {
                        if (pcase_var.eql($CONJUNCTIVE)) {
                            return inference_worker.conjunctive_link_p(link);
                        } else {
                            if (pcase_var.eql($CONNECTED_CONJUNCTION)) {
                                return inference_worker.connected_conjunction_link_p(link);
                            } else {
                                if (pcase_var.eql($LOGICAL)) {
                                    return inference_worker.logical_link_p(link);
                                } else {
                                    if (pcase_var.eql($SPLIT_RESTRICTION)) {
                                        return makeBoolean((NIL != inference_worker_split.split_link_p(link)) || (NIL != inference_worker_restriction.restriction_link_p(link)));
                                    } else {
                                        if (pcase_var.eql($SIMPLIFICATION)) {
                                            return inference_worker_restriction.simplification_link_p(link);
                                        } else {
                                            if (pcase_var.eql($REMOVAL_CONJUNCTIVE)) {
                                                return inference_worker_removal.conjunctive_removal_link_p(link);
                                            } else {
                                                return eq(type, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_type(link));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject problem_link_has_typeP(final SubLObject link, final SubLObject type) {
        if (type.eql($CONTENT)) {
            return inference_worker.content_link_p(link);
        }
        if (type.eql($STRUCTURAL)) {
            return inference_worker.structural_link_p(link);
        }
        if (type.eql($DISJUNCTIVE)) {
            return inference_worker.disjunctive_link_p(link);
        }
        if (type.eql($CONJUNCTIVE)) {
            return inference_worker.conjunctive_link_p(link);
        }
        if (type.eql($CONNECTED_CONJUNCTION)) {
            return inference_worker.connected_conjunction_link_p(link);
        }
        if (type.eql($LOGICAL)) {
            return inference_worker.logical_link_p(link);
        }
        if (type.eql($SPLIT_RESTRICTION)) {
            return makeBoolean((NIL != inference_worker_split.split_link_p(link)) || (NIL != inference_worker_restriction.restriction_link_p(link)));
        }
        if (type.eql($SIMPLIFICATION)) {
            return inference_worker_restriction.simplification_link_p(link);
        }
        if (type.eql($REMOVAL_CONJUNCTIVE)) {
            return inference_worker_removal.conjunctive_removal_link_p(link);
        }
        return eq(type, inference_datastructures_problem_link.problem_link_type(link));
    }

    public static final SubLObject problem_link_supported_inference_alt(SubLObject link) {
        if (NIL != inference_worker_answer.answer_link_p(link)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_object(link);
        }
        return NIL;
    }

    public static SubLObject problem_link_supported_inference(final SubLObject link) {
        if (NIL != inference_worker_answer.answer_link_p(link)) {
            return inference_datastructures_problem_link.problem_link_supported_object(link);
        }
        return NIL;
    }

    public static final SubLObject problem_link_supported_problem_alt(SubLObject link) {
        if (NIL == inference_worker_answer.answer_link_p(link)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_object(link);
        }
        return NIL;
    }

    public static SubLObject problem_link_supported_problem(final SubLObject link) {
        if (NIL == inference_worker_answer.answer_link_p(link)) {
            return inference_datastructures_problem_link.problem_link_supported_object(link);
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a problem-link with at least one argument (child) link.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a problem-link with at least one argument (child) link.")
    public static final SubLObject problem_link_with_supporting_problem_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_p(v_object)) && (NIL != list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(v_object))));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a problem-link with at least one argument (child) link.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a problem-link with at least one argument (child) link.")
    public static SubLObject problem_link_with_supporting_problem_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && (NIL != list_utilities.sublisp_boolean(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(v_object))));
    }

    public static final SubLObject problem_link_with_single_supporting_problem_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_p(v_object)) && (NIL != list_utilities.singletonP(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(v_object))));
    }

    public static SubLObject problem_link_with_single_supporting_problem_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && (NIL != list_utilities.singletonP(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(v_object))));
    }

    public static final SubLObject problem_link_number_of_supporting_problems_alt(SubLObject link) {
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(link);
    }

    public static SubLObject problem_link_number_of_supporting_problems(final SubLObject link) {
        return inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(link);
    }

    public static final SubLObject problem_link_supporting_mapped_problem_count_alt(SubLObject link) {
        return length(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link));
    }

    public static SubLObject problem_link_supporting_mapped_problem_count(final SubLObject link) {
        return length(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link));
    }

    public static final SubLObject problem_link_first_supporting_mapped_problem_alt(SubLObject link) {
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link).first();
    }

    public static SubLObject problem_link_first_supporting_mapped_problem(final SubLObject link) {
        return inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link).first();
    }

    public static final SubLObject problem_link_sole_supporting_mapped_problem_alt(SubLObject link) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(link);
    }

    public static SubLObject problem_link_sole_supporting_mapped_problem(final SubLObject link) {
        assert NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) : "! inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) " + ("inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) ") + link;
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(link);
    }

    public static final SubLObject problem_link_sole_supporting_variable_map_alt(SubLObject link) {
        {
            SubLObject mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(link);
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
        }
    }

    public static SubLObject problem_link_sole_supporting_variable_map(final SubLObject link) {
        final SubLObject mapped_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(link);
        return inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
    }

    /**
     *
     *
     * @param LINK
    problem-link-p;
     * 		
     * @return problem-p; The first supporting problem of LINK.
     */
    @LispMethod(comment = "@param LINK\nproblem-link-p;\r\n\t\t\r\n@return problem-p; The first supporting problem of LINK.")
    public static final SubLObject problem_link_first_supporting_problem_alt(SubLObject link) {
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(link));
    }

    /**
     *
     *
     * @param LINK
    problem-link-p;
     * 		
     * @return problem-p; The first supporting problem of LINK.
     */
    @LispMethod(comment = "@param LINK\nproblem-link-p;\r\n\t\t\r\n@return problem-p; The first supporting problem of LINK.")
    public static SubLObject problem_link_first_supporting_problem(final SubLObject link) {
        return inference_datastructures_problem_link.mapped_problem_problem(inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(link));
    }

    /**
     *
     *
     * @param LINK
    problem-link-p;
     * 		
     * @return problem-p; The sole supporting problem of LINK.
     */
    @LispMethod(comment = "@param LINK\nproblem-link-p;\r\n\t\t\r\n@return problem-p; The sole supporting problem of LINK.")
    public static final SubLObject problem_link_sole_supporting_problem_alt(SubLObject link) {
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(link));
    }

    /**
     *
     *
     * @param LINK
    problem-link-p;
     * 		
     * @return problem-p; The sole supporting problem of LINK.
     */
    @LispMethod(comment = "@param LINK\nproblem-link-p;\r\n\t\t\r\n@return problem-p; The sole supporting problem of LINK.")
    public static SubLObject problem_link_sole_supporting_problem(final SubLObject link) {
        return inference_datastructures_problem_link.mapped_problem_problem(inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(link));
    }

    public static final SubLObject problem_link_find_supporting_mapped_problem_by_index_alt(SubLObject link, SubLObject index) {
        return nth(index, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link));
    }

    public static SubLObject problem_link_find_supporting_mapped_problem_by_index(final SubLObject link, final SubLObject index) {
        return nth(index, inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link));
    }

    public static final SubLObject problem_link_openP_alt(SubLObject link) {
        return makeBoolean(!com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_open_flags(link).isZero());
    }

    public static SubLObject problem_link_openP(final SubLObject link) {
        return makeBoolean(!inference_datastructures_problem_link.problem_link_open_flags(link).isZero());
    }

    public static final SubLObject problem_link_closedP_alt(SubLObject link) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_openP(link));
    }

    public static SubLObject problem_link_closedP(final SubLObject link) {
        return makeBoolean(NIL == inference_datastructures_problem_link.problem_link_openP(link));
    }

    public static final SubLObject problem_link_index_openP_alt(SubLObject link, SubLObject index) {
        {
            SubLObject flags = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_open_flags(link);
            return number_utilities.get_bit(flags, index);
        }
    }

    public static SubLObject problem_link_index_openP(final SubLObject link, final SubLObject index) {
        final SubLObject flags = inference_datastructures_problem_link.problem_link_open_flags(link);
        return get_bit(flags, index);
    }

    public static final SubLObject problem_link_supporting_mapped_problem_openP_alt(SubLObject link, SubLObject supporting_mapped_problem) {
        {
            SubLObject index = position(supporting_mapped_problem, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link), MAPPED_PROBLEM_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_index_openP(link, index);
        }
    }

    public static SubLObject problem_link_supporting_mapped_problem_openP(final SubLObject link, final SubLObject supporting_mapped_problem) {
        final SubLObject index = position(supporting_mapped_problem, inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link), inference_datastructures_problem_link.MAPPED_PROBLEM_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return inference_datastructures_problem_link.problem_link_index_openP(link, index);
    }

    public static final SubLObject problem_link_sole_supporting_mapped_problem_openP_alt(SubLObject link) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_index_openP(link, ZERO_INTEGER);
    }

    public static SubLObject problem_link_sole_supporting_mapped_problem_openP(final SubLObject link) {
        assert NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) : "! inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) " + ("inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) ") + link;
        return inference_datastructures_problem_link.problem_link_index_openP(link, ZERO_INTEGER);
    }

    /**
     *
     *
     * @return booleanp; whether LINK is open wrt SUPPORTING-MAPPED-PROBLEM.
     */
    @LispMethod(comment = "@return booleanp; whether LINK is open wrt SUPPORTING-MAPPED-PROBLEM.")
    public static final SubLObject supporting_mapped_problem_open_wrt_linkP_alt(SubLObject supporting_mapped_problem, SubLObject link) {
        {
            SubLObject link_var = link;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject candidate_supporting_mapped_problem = NIL;
            for (candidate_supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_supporting_mapped_problem = cdolist_list_var.first()) {
                if (NIL != inference_macros.do_problem_link_open_matchP(T, link_var, candidate_supporting_mapped_problem)) {
                    if (candidate_supporting_mapped_problem == supporting_mapped_problem) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether LINK is open wrt SUPPORTING-MAPPED-PROBLEM.
     */
    @LispMethod(comment = "@return booleanp; whether LINK is open wrt SUPPORTING-MAPPED-PROBLEM.")
    public static SubLObject supporting_mapped_problem_open_wrt_linkP(final SubLObject supporting_mapped_problem, final SubLObject link) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject candidate_supporting_mapped_problem = NIL;
        candidate_supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_macros.do_problem_link_open_matchP(T, link, candidate_supporting_mapped_problem)) && candidate_supporting_mapped_problem.eql(supporting_mapped_problem)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_supporting_mapped_problem = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether LINK is open wrt SUPPORTING-PROBLEM.
     */
    @LispMethod(comment = "@return booleanp; whether LINK is open wrt SUPPORTING-PROBLEM.")
    public static final SubLObject supporting_problem_open_wrt_linkP_alt(SubLObject supporting_problem, SubLObject link) {
        {
            SubLObject link_var = link;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject supporting_mapped_problem = NIL;
            for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                if (NIL != inference_macros.do_problem_link_open_matchP(T, link_var, supporting_mapped_problem)) {
                    {
                        SubLObject candidate_supporting_problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                        SubLObject variable_map = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                        if (candidate_supporting_problem == supporting_problem) {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether LINK is open wrt SUPPORTING-PROBLEM.
     */
    @LispMethod(comment = "@return booleanp; whether LINK is open wrt SUPPORTING-PROBLEM.")
    public static SubLObject supporting_problem_open_wrt_linkP(final SubLObject supporting_problem, final SubLObject link) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(T, link, supporting_mapped_problem)) {
                final SubLObject candidate_supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                if (candidate_supporting_problem.eql(supporting_problem)) {
                    return T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject problem_link_completely_openP_alt(SubLObject link) {
        {
            SubLObject link_var = link;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject supporting_mapped_problem = NIL;
            for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                    if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem)) {
                        return NIL;
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject problem_link_completely_openP(final SubLObject link) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) && (NIL == inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject problem_link_has_some_proofP_alt(SubLObject problem_link, SubLObject proof_status) {
        if (proof_status == UNPROVIDED) {
            proof_status = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(problem_link, PROBLEM_LINK_P);
            if (NIL != $problem_link_datastructure_stores_proofsP$.getDynamicValue(thread)) {
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_proofs(problem_link);
                    SubLObject proof = NIL;
                    for (proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proof = cdolist_list_var.first()) {
                        if (NIL != inference_datastructures_problem.proof_has_statusP(proof, proof_status)) {
                            return T;
                        }
                    }
                }
            } else {
                {
                    SubLObject lnk = problem_link;
                    SubLObject problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_problem(lnk);
                    if (NIL != problem) {
                        {
                            SubLObject status_var = proof_status;
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject proof_list = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject cdolist_list_var = proof_list;
                                        SubLObject proof = NIL;
                                        for (proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proof = cdolist_list_var.first()) {
                                            if (NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                                                if (lnk == inference_datastructures_proof.proof_link(proof)) {
                                                    return T;
                                                }
                                            }
                                        }
                                    }
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject problem_link_has_some_proofP(final SubLObject problem_link, SubLObject proof_status) {
        if (proof_status == UNPROVIDED) {
            proof_status = NIL;
        }
        assert NIL != inference_datastructures_problem_link.problem_link_p(problem_link) : "! inference_datastructures_problem_link.problem_link_p(problem_link) " + ("inference_datastructures_problem_link.problem_link_p(problem_link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(problem_link) ") + problem_link;
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_proofs(problem_link);
        SubLObject proof = NIL;
        proof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.proof_has_statusP(proof, proof_status)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject problem_link_goodP_alt(SubLObject link) {
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_has_some_proofP(link, $PROVEN);
    }

    public static SubLObject problem_link_goodP(final SubLObject link) {
        return inference_datastructures_problem_link.problem_link_has_some_proofP(link, $PROVEN);
    }

    public static final SubLObject problem_link_proofs_alt(SubLObject link) {
        return inference_datastructures_problem_link.prob_link_proofs(link);
    }

    public static SubLObject problem_link_proofs(final SubLObject link) {
        return inference_datastructures_problem_link.prob_link_proofs(link);
    }

    public static final SubLObject problem_link_all_proofs_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $problem_link_datastructure_stores_proofsP$.getDynamicValue(thread) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_proofs(link))) : com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_all_proofs_computed(link);
        }
    }

    public static SubLObject problem_link_all_proofs(final SubLObject link) {
        return inference_datastructures_problem_link.problem_link_proofs(link);
    }

    public static final SubLObject problem_link_proof_count_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
            {
                SubLObject count = ZERO_INTEGER;
                if (NIL != $problem_link_datastructure_stores_proofsP$.getDynamicValue(thread)) {
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_proofs(link);
                        SubLObject proof = NIL;
                        for (proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proof = cdolist_list_var.first()) {
                            if (NIL != inference_datastructures_problem.proof_has_statusP(proof, NIL)) {
                                count = add(count, ONE_INTEGER);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject lnk = link;
                        SubLObject problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_problem(lnk);
                        if (NIL != problem) {
                            {
                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem));
                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        SubLObject proof_list = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject cdolist_list_var = proof_list;
                                            SubLObject proof = NIL;
                                            for (proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proof = cdolist_list_var.first()) {
                                                if (lnk == inference_datastructures_proof.proof_link(proof)) {
                                                    count = add(count, ONE_INTEGER);
                                                }
                                            }
                                        }
                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                    }
                                } 
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject problem_link_proof_count(final SubLObject link) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_proofs(link);
        SubLObject proof = NIL;
        proof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.proof_has_statusP(proof, NIL)) {
                count = add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
        } 
        return count;
    }

    public static final SubLObject problem_link_destructibleP_alt(SubLObject link) {
        return destructibility_status_destructibleP(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_destructibility_status(link));
    }

    public static SubLObject problem_link_destructibleP(final SubLObject link) {
        return inference_datastructures_enumerated_types.destructibility_status_destructibleP(inference_datastructures_problem_link.problem_link_destructibility_status(link));
    }

    public static final SubLObject problem_link_destructibility_status_alt(SubLObject link) {
        if (NIL == inference_worker_answer.answer_link_p(link)) {
            if (NIL != inference_datastructures_problem.problem_destructibleP(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_problem(link))) {
                return $DESTRUCTIBLE;
            } else {
                {
                    SubLObject link_var = link;
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    SubLObject supporting_mapped_problem = NIL;
                    for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                            {
                                SubLObject supporting_problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                SubLObject variable_map = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                                if (NIL != inference_datastructures_problem.problem_destructibleP(supporting_problem)) {
                                    return $DESTRUCTIBLE;
                                }
                            }
                        }
                    }
                }
            }
        }
        return $INDESTRUCTIBLE;
    }

    public static SubLObject problem_link_destructibility_status(final SubLObject link) {
        if (NIL == inference_worker_answer.answer_link_p(link)) {
            if (NIL != inference_datastructures_problem.problem_destructibleP(inference_datastructures_problem_link.problem_link_supported_problem(link))) {
                return $DESTRUCTIBLE;
            }
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
            SubLObject supporting_mapped_problem = NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                    final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                    if (NIL != inference_datastructures_problem.problem_destructibleP(supporting_problem)) {
                        return $DESTRUCTIBLE;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            } 
        }
        return $INDESTRUCTIBLE;
    }

    /**
     * Adds SUPPORTING-PROBLEM to the list of problems below LINK
     */
    @LispMethod(comment = "Adds SUPPORTING-PROBLEM to the list of problems below LINK")
    public static final SubLObject add_problem_link_supporting_mapped_problem_alt(SubLObject link, SubLObject supporting_mapped_problem) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        SubLTrampolineFile.checkType(supporting_mapped_problem, MAPPED_PROBLEM_P);
        inference_datastructures_problem_link._csetf_prob_link_supporting_mapped_problems(link, cons(supporting_mapped_problem, inference_datastructures_problem_link.prob_link_supporting_mapped_problems(link)));
        return link;
    }

    @LispMethod(comment = "Adds SUPPORTING-PROBLEM to the list of problems below LINK")
    public static SubLObject add_problem_link_supporting_mapped_problem(final SubLObject link, final SubLObject supporting_mapped_problem) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) : "! inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) " + ("inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) ") + supporting_mapped_problem;
        inference_datastructures_problem_link._csetf_prob_link_supporting_mapped_problems(link, cons(supporting_mapped_problem, inference_datastructures_problem_link.prob_link_supporting_mapped_problems(link)));
        return link;
    }

    public static final SubLObject problem_link_open_all_alt(SubLObject link) {
        {
            SubLObject supporting_mapped_problem_count = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(link);
            SubLObject flags = ZERO_INTEGER;
            SubLObject index = NIL;
            for (index = ZERO_INTEGER; index.numL(supporting_mapped_problem_count); index = add(index, ONE_INTEGER)) {
                flags = number_utilities.set_bit(flags, index, T);
            }
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.set_problem_link_open_flags(link, flags);
        }
        return NIL;
    }

    public static SubLObject problem_link_open_all(final SubLObject link) {
        final SubLObject supporting_mapped_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count(link);
        SubLObject flags = ZERO_INTEGER;
        SubLObject index;
        for (index = NIL, index = ZERO_INTEGER; index.numL(supporting_mapped_problem_count); index = add(index, ONE_INTEGER)) {
            flags = set_bit(flags, index, T);
        }
        inference_datastructures_problem_link.set_problem_link_open_flags(link, flags);
        return NIL;
    }

    public static final SubLObject problem_link_open_index_alt(SubLObject link, SubLObject index) {
        {
            SubLObject flags = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_open_flags(link);
            flags = number_utilities.set_bit(flags, index, T);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.set_problem_link_open_flags(link, flags);
        }
        return NIL;
    }

    public static SubLObject problem_link_open_index(final SubLObject link, final SubLObject index) {
        SubLObject flags = inference_datastructures_problem_link.problem_link_open_flags(link);
        flags = set_bit(flags, index, T);
        inference_datastructures_problem_link.set_problem_link_open_flags(link, flags);
        return NIL;
    }

    public static final SubLObject problem_link_open_supporting_mapped_problem_alt(SubLObject link, SubLObject supporting_mapped_problem) {
        {
            SubLObject index = position(supporting_mapped_problem, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link), MAPPED_PROBLEM_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != index ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_open_index(link, index))) : NIL;
        }
    }

    public static SubLObject problem_link_open_supporting_mapped_problem(final SubLObject link, final SubLObject supporting_mapped_problem) {
        final SubLObject index = position(supporting_mapped_problem, inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link), inference_datastructures_problem_link.MAPPED_PROBLEM_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != index ? inference_datastructures_problem_link.problem_link_open_index(link, index) : NIL;
    }

    public static final SubLObject problem_link_open_sole_supporting_mapped_problem_alt(SubLObject link) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_open_index(link, ZERO_INTEGER);
    }

    public static SubLObject problem_link_open_sole_supporting_mapped_problem(final SubLObject link) {
        assert NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) : "! inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) " + ("inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) ") + link;
        return inference_datastructures_problem_link.problem_link_open_index(link, ZERO_INTEGER);
    }

    public static final SubLObject problem_link_close_index_alt(SubLObject link, SubLObject index) {
        {
            SubLObject flags = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_open_flags(link);
            flags = number_utilities.set_bit(flags, index, NIL);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.set_problem_link_open_flags(link, flags);
        }
        return NIL;
    }

    public static SubLObject problem_link_close_index(final SubLObject link, final SubLObject index) {
        SubLObject flags = inference_datastructures_problem_link.problem_link_open_flags(link);
        flags = set_bit(flags, index, NIL);
        inference_datastructures_problem_link.set_problem_link_open_flags(link, flags);
        return NIL;
    }

    public static final SubLObject problem_link_close_all_alt(SubLObject link) {
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.set_problem_link_open_flags(link, ZERO_INTEGER);
        return link;
    }

    public static SubLObject problem_link_close_all(final SubLObject link) {
        inference_datastructures_problem_link.set_problem_link_open_flags(link, ZERO_INTEGER);
        return link;
    }

    public static final SubLObject problem_link_close_supporting_mapped_problem_alt(SubLObject link, SubLObject supporting_mapped_problem) {
        {
            SubLObject index = position(supporting_mapped_problem, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link), MAPPED_PROBLEM_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_close_index(link, index);
        }
    }

    public static SubLObject problem_link_close_supporting_mapped_problem(final SubLObject link, final SubLObject supporting_mapped_problem) {
        final SubLObject index = position(supporting_mapped_problem, inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link), inference_datastructures_problem_link.MAPPED_PROBLEM_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return inference_datastructures_problem_link.problem_link_close_index(link, index);
    }

    public static final SubLObject problem_link_close_sole_supporting_mapped_problem_alt(SubLObject link) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_close_index(link, ZERO_INTEGER);
    }

    public static SubLObject problem_link_close_sole_supporting_mapped_problem(final SubLObject link) {
        assert NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) : "! inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) " + ("inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(link) ") + link;
        return inference_datastructures_problem_link.problem_link_close_index(link, ZERO_INTEGER);
    }

    /**
     * Adds a 'down' edge from LINK (above) to PROBLEM (below)
     */
    @LispMethod(comment = "Adds a \'down\' edge from LINK (above) to PROBLEM (below)")
    public static final SubLObject connect_supporting_mapped_problem_with_dependent_link_alt(SubLObject supporting_mapped_problem, SubLObject link) {
        SubLTrampolineFile.checkType(supporting_mapped_problem, MAPPED_PROBLEM_P);
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.add_problem_link_supporting_mapped_problem(link, supporting_mapped_problem);
        inference_datastructures_problem.add_problem_dependent_link(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem), link);
        return NIL;
    }

    @LispMethod(comment = "Adds a \'down\' edge from LINK (above) to PROBLEM (below)")
    public static SubLObject connect_supporting_mapped_problem_with_dependent_link(final SubLObject supporting_mapped_problem, final SubLObject link) {
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) : "! inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) " + ("inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) ") + supporting_mapped_problem;
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        inference_datastructures_problem_link.add_problem_link_supporting_mapped_problem(link, supporting_mapped_problem);
        inference_datastructures_problem.add_problem_dependent_link(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem), link);
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff LINK is a link to goal.
    The only links (except for links in the middle of being created) which
    have no supporting-mapped-problems are links to goal.
     */
    @LispMethod(comment = "@return boolean; t iff LINK is a link to goal.\r\nThe only links (except for links in the middle of being created) which\r\nhave no supporting-mapped-problems are links to goal.")
    public static final SubLObject problem_link_to_goal_p_alt(SubLObject link) {
        {
            SubLObject supporting_mapped_problems = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
            return sublisp_null(supporting_mapped_problems);
        }
    }

    /**
     *
     *
     * @return boolean; t iff LINK is a link to goal.
    The only links (except for links in the middle of being created) which
    have no supporting-mapped-problems are links to goal.
     */
    @LispMethod(comment = "@return boolean; t iff LINK is a link to goal.\r\nThe only links (except for links in the middle of being created) which\r\nhave no supporting-mapped-problems are links to goal.")
    public static SubLObject problem_link_to_goal_p(final SubLObject link) {
        final SubLObject supporting_mapped_problems = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        return sublisp_null(supporting_mapped_problems);
    }

    /**
     * Return an existing link of TYPE that supports SUPPORTED-PROBLEM and has a single supporting
     * mapped problem that matches SUPPORTING-MAPPED-PROBLEM, or nil if none.
     */
    @LispMethod(comment = "Return an existing link of TYPE that supports SUPPORTED-PROBLEM and has a single supporting\r\nmapped problem that matches SUPPORTING-MAPPED-PROBLEM, or nil if none.\nReturn an existing link of TYPE that supports SUPPORTED-PROBLEM and has a single supporting\nmapped problem that matches SUPPORTING-MAPPED-PROBLEM, or nil if none.")
    public static final SubLObject find_problem_link_of_type_between_alt(SubLObject type, SubLObject supported_problem, SubLObject supporting_mapped_problem) {
        SubLTrampolineFile.checkType(type, PROBLEM_LINK_TYPE_P);
        SubLTrampolineFile.checkType(supported_problem, PROBLEM_P);
        SubLTrampolineFile.checkType(supporting_mapped_problem, MAPPED_PROBLEM_P);
        {
            SubLObject existing_link = NIL;
            SubLObject supporting_problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
            SubLObject problem_var = supporting_problem;
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supporting_problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != existing_link) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject dependent_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_has_typeP(dependent_link, type)) {
                            {
                                SubLObject link_var = dependent_link;
                                SubLObject rest = NIL;
                                for (rest = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); !((NIL != existing_link) || (NIL == rest)); rest = rest.rest()) {
                                    {
                                        SubLObject candidate_supporting_mapped_problem = rest.first();
                                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, candidate_supporting_mapped_problem)) {
                                            if (problem_var == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(candidate_supporting_mapped_problem)) {
                                                if ((supported_problem == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_problem(dependent_link)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_equal(supporting_mapped_problem, candidate_supporting_mapped_problem))) {
                                                    existing_link = dependent_link;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return existing_link;
        }
    }

    @LispMethod(comment = "Return an existing link of TYPE that supports SUPPORTED-PROBLEM and has a single supporting\r\nmapped problem that matches SUPPORTING-MAPPED-PROBLEM, or nil if none.\nReturn an existing link of TYPE that supports SUPPORTED-PROBLEM and has a single supporting\nmapped problem that matches SUPPORTING-MAPPED-PROBLEM, or nil if none.")
    public static SubLObject find_problem_link_of_type_between(final SubLObject type, final SubLObject supported_problem, final SubLObject supporting_mapped_problem) {
        assert NIL != inference_datastructures_enumerated_types.problem_link_type_p(type) : "! inference_datastructures_enumerated_types.problem_link_type_p(type) " + ("inference_datastructures_enumerated_types.problem_link_type_p(type) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_link_type_p(type) ") + type;
        assert NIL != inference_datastructures_problem.problem_p(supported_problem) : "! inference_datastructures_problem.problem_p(supported_problem) " + ("inference_datastructures_problem.problem_p(supported_problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(supported_problem) ") + supported_problem;
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) : "! inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) " + ("inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) ") + supporting_mapped_problem;
        SubLObject existing_link = NIL;
        final SubLObject problem_var;
        final SubLObject supporting_problem = problem_var = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supporting_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        SubLObject link_var;
        SubLObject rest;
        SubLObject candidate_supporting_mapped_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == existing_link) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(dependent_link, type))) {
                link_var = dependent_link;
                for (rest = NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); (NIL == existing_link) && (NIL != rest); rest = rest.rest()) {
                    candidate_supporting_mapped_problem = rest.first();
                    if ((((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, candidate_supporting_mapped_problem)) && problem_var.eql(inference_datastructures_problem_link.mapped_problem_problem(candidate_supporting_mapped_problem))) && supported_problem.eql(inference_datastructures_problem_link.problem_link_supported_problem(dependent_link))) && (NIL != inference_datastructures_problem_link.mapped_problem_equal(supporting_mapped_problem, candidate_supporting_mapped_problem))) {
                        existing_link = dependent_link;
                    }
                }
            }
        }
        return existing_link;
    }

    /**
     *
     *
     * @return booleanp; is there a link of type LINK-TYPE between SUPPORTED-PROBLEM and SUPPORTING-PROBLEM?
     */
    @LispMethod(comment = "@return booleanp; is there a link of type LINK-TYPE between SUPPORTED-PROBLEM and SUPPORTING-PROBLEM?")
    public static final SubLObject link_of_type_betweenP_alt(SubLObject link_type, SubLObject supported_problem, SubLObject supporting_problem) {
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supporting_problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_has_typeP(link, link_type)) {
                            if (supported_problem == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_problem(link)) {
                                return T;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; is there a link of type LINK-TYPE between SUPPORTED-PROBLEM and SUPPORTING-PROBLEM?
     */
    @LispMethod(comment = "@return booleanp; is there a link of type LINK-TYPE between SUPPORTED-PROBLEM and SUPPORTING-PROBLEM?")
    public static SubLObject link_of_type_betweenP(final SubLObject link_type, final SubLObject supported_problem, final SubLObject supporting_problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supporting_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (((NIL != set_contents.do_set_contents_element_validP(state, link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, link_type))) && supported_problem.eql(inference_datastructures_problem_link.problem_link_supported_problem(link))) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject find_closed_supporting_problem_by_query_alt(SubLObject link, SubLObject query) {
        {
            SubLObject mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.find_supporting_mapped_problem_by_query_and_variable_map(link, query, NIL);
            return NIL != mapped_problem ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(mapped_problem))) : NIL;
        }
    }

    public static SubLObject find_closed_supporting_problem_by_query(final SubLObject link, final SubLObject query) {
        final SubLObject mapped_problem = inference_datastructures_problem_link.find_supporting_mapped_problem_by_query_and_variable_map(link, query, NIL);
        return NIL != mapped_problem ? inference_datastructures_problem_link.mapped_problem_problem(mapped_problem) : NIL;
    }

    /**
     *
     *
     * @unknown the supporting mapped problem of LINK which has query QUERY and is linked
    to LINK via VARIABLE-MAP, if any.  Otherwise returns NIL.
     */
    @LispMethod(comment = "@unknown the supporting mapped problem of LINK which has query QUERY and is linked\r\nto LINK via VARIABLE-MAP, if any.  Otherwise returns NIL.")
    public static final SubLObject find_supporting_mapped_problem_by_query_and_variable_map_alt(SubLObject link, SubLObject query, SubLObject variable_map) {
        {
            SubLObject link_var = link;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject mapped_problem = NIL;
            for (mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapped_problem = cdolist_list_var.first()) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, mapped_problem)) {
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_equals_specP(mapped_problem, query, variable_map)) {
                        return mapped_problem;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown the supporting mapped problem of LINK which has query QUERY and is linked
    to LINK via VARIABLE-MAP, if any.  Otherwise returns NIL.
     */
    @LispMethod(comment = "@unknown the supporting mapped problem of LINK which has query QUERY and is linked\r\nto LINK via VARIABLE-MAP, if any.  Otherwise returns NIL.")
    public static SubLObject find_supporting_mapped_problem_by_query_and_variable_map(final SubLObject link, final SubLObject query, final SubLObject variable_map) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject mapped_problem = NIL;
        mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link, mapped_problem)) && (NIL != inference_datastructures_problem_link.mapped_problem_equals_specP(mapped_problem, query, variable_map))) {
                return mapped_problem;
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapped_problem = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Returns a supporting mapped problem of LINK that is not eq to WRONG-MAPPED-PROBLEM.
     */
    @LispMethod(comment = "Returns a supporting mapped problem of LINK that is not eq to WRONG-MAPPED-PROBLEM.")
    public static final SubLObject problem_link_supporting_mapped_problem_that_isnt_alt(SubLObject link, SubLObject wrong_mapped_problem) {
        {
            SubLObject link_var = link;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject supporting_mapped_problem = NIL;
            for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                    if (supporting_mapped_problem != wrong_mapped_problem) {
                        return supporting_mapped_problem;
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Returns a supporting mapped problem of LINK that is not eq to WRONG-MAPPED-PROBLEM.")
    public static SubLObject problem_link_supporting_mapped_problem_that_isnt(final SubLObject link, final SubLObject wrong_mapped_problem) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) && (!supporting_mapped_problem.eql(wrong_mapped_problem))) {
                return supporting_mapped_problem;
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject mapped_problem_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.print_mapped_problem(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject mapped_problem_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        inference_datastructures_problem_link.print_mapped_problem(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject mapped_problem_p_alt(SubLObject v_object) {
        return v_object.getClass() == inference_datastructures_problem_link.$mapped_problem_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject mapped_problem_p(final SubLObject v_object) {
        return v_object.getClass() == inference_datastructures_problem_link.$mapped_problem_native.class ? T : NIL;
    }

    public static final SubLObject mapped_prob_problem_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MAPPED_PROBLEM_P);
        return v_object.getField2();
    }

    public static SubLObject mapped_prob_problem(final SubLObject v_object) {
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(v_object) : "! inference_datastructures_problem_link.mapped_problem_p(v_object) " + "inference_datastructures_problem_link.mapped_problem_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject mapped_prob_variable_map_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MAPPED_PROBLEM_P);
        return v_object.getField3();
    }

    public static SubLObject mapped_prob_variable_map(final SubLObject v_object) {
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(v_object) : "! inference_datastructures_problem_link.mapped_problem_p(v_object) " + "inference_datastructures_problem_link.mapped_problem_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_mapped_prob_problem_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MAPPED_PROBLEM_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_mapped_prob_problem(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(v_object) : "! inference_datastructures_problem_link.mapped_problem_p(v_object) " + "inference_datastructures_problem_link.mapped_problem_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_mapped_prob_variable_map_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MAPPED_PROBLEM_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_mapped_prob_variable_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(v_object) : "! inference_datastructures_problem_link.mapped_problem_p(v_object) " + "inference_datastructures_problem_link.mapped_problem_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_mapped_problem_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new inference_datastructures_problem_link.$mapped_problem_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($PROBLEM)) {
                        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link._csetf_mapped_prob_problem(v_new, current_value);
                    } else {
                        if (pcase_var.eql($VARIABLE_MAP)) {
                            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link._csetf_mapped_prob_variable_map(v_new, current_value);
                        } else {
                            Errors.error($str_alt30$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_mapped_problem(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new inference_datastructures_problem_link.$mapped_problem_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PROBLEM)) {
                inference_datastructures_problem_link._csetf_mapped_prob_problem(v_new, current_value);
            } else
                if (pcase_var.eql($VARIABLE_MAP)) {
                    inference_datastructures_problem_link._csetf_mapped_prob_variable_map(v_new, current_value);
                } else {
                    Errors.error(inference_datastructures_problem_link.$str34$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_mapped_problem(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, inference_datastructures_problem_link.MAKE_MAPPED_PROBLEM, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PROBLEM, inference_datastructures_problem_link.mapped_prob_problem(obj));
        funcall(visitor_fn, obj, $SLOT, $VARIABLE_MAP, inference_datastructures_problem_link.mapped_prob_variable_map(obj));
        funcall(visitor_fn, obj, $END, inference_datastructures_problem_link.MAKE_MAPPED_PROBLEM, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_mapped_problem_method(final SubLObject obj, final SubLObject visitor_fn) {
        return inference_datastructures_problem_link.visit_defstruct_mapped_problem(obj, visitor_fn);
    }

    public static final SubLObject valid_mapped_problem_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_p(v_object)) && ($FREE != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_variable_map(v_object))) && (NIL != inference_datastructures_problem.valid_problem_p(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(v_object))));
    }

    public static SubLObject valid_mapped_problem_p(final SubLObject v_object) {
        return makeBoolean(((NIL != inference_datastructures_problem_link.mapped_problem_p(v_object)) && ($FREE != inference_datastructures_problem_link.mapped_problem_variable_map(v_object))) && (NIL != inference_datastructures_problem.valid_problem_p(inference_datastructures_problem_link.mapped_problem_problem(v_object))));
    }

    public static final SubLObject mapped_problem_equal_alt(SubLObject mapped_problem1, SubLObject mapped_problem2) {
        if (mapped_problem1 == mapped_problem2) {
            return T;
        }
        {
            SubLObject problem1 = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(mapped_problem1);
            SubLObject problem2 = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(mapped_problem2);
            if (problem1 != problem2) {
                return NIL;
            }
        }
        {
            SubLObject variable_map1 = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem1);
            SubLObject variable_map2 = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem2);
            return equal(variable_map1, variable_map2);
        }
    }

    public static SubLObject mapped_problem_equal(final SubLObject mapped_problem1, final SubLObject mapped_problem2) {
        if (mapped_problem1.eql(mapped_problem2)) {
            return T;
        }
        final SubLObject problem1 = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem1);
        final SubLObject problem2 = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem2);
        if (!problem1.eql(problem2)) {
            return NIL;
        }
        final SubLObject variable_map1 = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem1);
        final SubLObject variable_map2 = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem2);
        return equal(variable_map1, variable_map2);
    }

    public static final SubLObject print_mapped_problem_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.valid_mapped_problem_p(v_object)) {
                format(stream, $str_alt81$_MAPPED_PROBLEM__a__a_, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(v_object), com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_variable_map(v_object));
            } else {
                if (NIL != $print_readably$.getDynamicValue(thread)) {
                    print_not_readable(v_object, stream);
                } else {
                    {
                        SubLObject v_object_1 = v_object;
                        SubLObject stream_2 = stream;
                        write_string($str_alt82$__, stream_2, UNPROVIDED, UNPROVIDED);
                        write_char(CHAR_greater, stream_2);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject print_mapped_problem(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_datastructures_problem_link.valid_mapped_problem_p(v_object)) {
            format(stream, inference_datastructures_problem_link.$str98$_MAPPED_PROBLEM__a__a_, inference_datastructures_problem_link.mapped_problem_problem(v_object), inference_datastructures_problem_link.mapped_problem_variable_map(v_object));
        } else
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                print_macros.print_unreadable_object_preamble(stream, v_object, NIL, NIL);
                print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
            }

        return NIL;
    }

    public static final SubLObject sxhash_mapped_problem_method_alt(SubLObject v_object) {
        return logxor(Sxhash.sxhash(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_prob_problem(v_object)), Sxhash.sxhash(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_prob_variable_map(v_object)));
    }

    public static SubLObject sxhash_mapped_problem_method(final SubLObject v_object) {
        return logxor(Sxhash.sxhash(inference_datastructures_problem_link.mapped_prob_problem(v_object)), Sxhash.sxhash(inference_datastructures_problem_link.mapped_prob_variable_map(v_object)));
    }

    public static final SubLObject closed_mapped_problem_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_p(v_object)) && (NIL != inference_datastructures_problem.closed_problem_p(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(v_object)))) && (NIL == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_variable_map(v_object)));
    }

    public static SubLObject closed_mapped_problem_p(final SubLObject v_object) {
        return makeBoolean(((NIL != inference_datastructures_problem_link.mapped_problem_p(v_object)) && (NIL != inference_datastructures_problem.closed_problem_p(inference_datastructures_problem_link.mapped_problem_problem(v_object)))) && (NIL == inference_datastructures_problem_link.mapped_problem_variable_map(v_object)));
    }

    public static final SubLObject new_mapped_problem_alt(SubLObject problem, SubLObject variable_map) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        SubLTrampolineFile.checkType(variable_map, VARIABLE_MAP_P);
        {
            SubLObject mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.make_mapped_problem(UNPROVIDED);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link._csetf_mapped_prob_problem(mapped_problem, problem);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link._csetf_mapped_prob_variable_map(mapped_problem, variable_map);
            return mapped_problem;
        }
    }

    public static SubLObject new_mapped_problem(final SubLObject problem, final SubLObject variable_map) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        assert NIL != bindings.variable_map_p(variable_map) : "! bindings.variable_map_p(variable_map) " + ("bindings.variable_map_p(variable_map) " + "CommonSymbols.NIL != bindings.variable_map_p(variable_map) ") + variable_map;
        final SubLObject mapped_problem = inference_datastructures_problem_link.make_mapped_problem(UNPROVIDED);
        inference_datastructures_problem_link._csetf_mapped_prob_problem(mapped_problem, problem);
        inference_datastructures_problem_link._csetf_mapped_prob_variable_map(mapped_problem, variable_map);
        return mapped_problem;
    }

    public static final SubLObject new_closed_mapped_problem_alt(SubLObject problem) {
        SubLTrampolineFile.checkType(problem, CLOSED_PROBLEM_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.new_mapped_problem(problem, NIL);
    }

    public static SubLObject new_closed_mapped_problem(final SubLObject problem) {
        assert NIL != inference_datastructures_problem.closed_problem_p(problem) : "! inference_datastructures_problem.closed_problem_p(problem) " + ("inference_datastructures_problem.closed_problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.closed_problem_p(problem) ") + problem;
        return inference_datastructures_problem_link.new_mapped_problem(problem, NIL);
    }

    public static final SubLObject destroy_problem_link_mapped_problem_alt(SubLObject mapped_problem) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.valid_mapped_problem_p(mapped_problem)) {
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.note_mapped_problem_invalid(mapped_problem);
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.destroy_mapped_problem_int(mapped_problem);
        }
        return NIL;
    }

    public static SubLObject destroy_problem_link_mapped_problem(final SubLObject mapped_problem) {
        if (NIL != inference_datastructures_problem_link.valid_mapped_problem_p(mapped_problem)) {
            inference_datastructures_problem_link.note_mapped_problem_invalid(mapped_problem);
            return inference_datastructures_problem_link.destroy_mapped_problem_int(mapped_problem);
        }
        return NIL;
    }

    public static final SubLObject destroy_mapped_problem_int_alt(SubLObject mapped_problem) {
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link._csetf_mapped_prob_problem(mapped_problem, $FREE);
        return NIL;
    }

    public static SubLObject destroy_mapped_problem_int(final SubLObject mapped_problem) {
        inference_datastructures_problem_link._csetf_mapped_prob_problem(mapped_problem, $FREE);
        return NIL;
    }

    public static final SubLObject note_mapped_problem_invalid_alt(SubLObject mapped_problem) {
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link._csetf_mapped_prob_variable_map(mapped_problem, $FREE);
        return mapped_problem;
    }

    public static SubLObject note_mapped_problem_invalid(final SubLObject mapped_problem) {
        inference_datastructures_problem_link._csetf_mapped_prob_variable_map(mapped_problem, $FREE);
        return mapped_problem;
    }

    public static final SubLObject mapped_problem_problem_alt(SubLObject mapped_problem) {
        SubLTrampolineFile.checkType(mapped_problem, MAPPED_PROBLEM_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_prob_problem(mapped_problem);
    }

    public static SubLObject mapped_problem_problem(final SubLObject mapped_problem) {
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(mapped_problem) : "! inference_datastructures_problem_link.mapped_problem_p(mapped_problem) " + ("inference_datastructures_problem_link.mapped_problem_p(mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(mapped_problem) ") + mapped_problem;
        return inference_datastructures_problem_link.mapped_prob_problem(mapped_problem);
    }

    /**
     * Variable maps go UP, i.e. (<supporting problem's vars> -> <supported problem's vars>)
     */
    @LispMethod(comment = "Variable maps go UP, i.e. (<supporting problem\'s vars> -> <supported problem\'s vars>)")
    public static final SubLObject mapped_problem_variable_map_alt(SubLObject mapped_problem) {
        SubLTrampolineFile.checkType(mapped_problem, MAPPED_PROBLEM_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_prob_variable_map(mapped_problem);
    }

    @LispMethod(comment = "Variable maps go UP, i.e. (<supporting problem\'s vars> -> <supported problem\'s vars>)")
    public static SubLObject mapped_problem_variable_map(final SubLObject mapped_problem) {
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(mapped_problem) : "! inference_datastructures_problem_link.mapped_problem_p(mapped_problem) " + ("inference_datastructures_problem_link.mapped_problem_p(mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(mapped_problem) ") + mapped_problem;
        return inference_datastructures_problem_link.mapped_prob_variable_map(mapped_problem);
    }

    public static final SubLObject supporting_mapped_problem_index_alt(SubLObject link, SubLObject supporting_mapped_problem) {
        {
            SubLObject index = ZERO_INTEGER;
            SubLObject link_var = link;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject candidate_supporting_mapped_problem = NIL;
            for (candidate_supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_supporting_mapped_problem = cdolist_list_var.first()) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, candidate_supporting_mapped_problem)) {
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_equal(candidate_supporting_mapped_problem, supporting_mapped_problem)) {
                        return index;
                    }
                    index = add(index, ONE_INTEGER);
                }
            }
        }
        return NIL;
    }

    public static SubLObject supporting_mapped_problem_index(final SubLObject link, final SubLObject supporting_mapped_problem) {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject candidate_supporting_mapped_problem = NIL;
        candidate_supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, candidate_supporting_mapped_problem)) {
                if (NIL != inference_datastructures_problem_link.mapped_problem_equal(candidate_supporting_mapped_problem, supporting_mapped_problem)) {
                    return index;
                }
                index = add(index, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_supporting_mapped_problem = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject find_supporting_mapped_problem_by_index_alt(SubLObject link, SubLObject index) {
        {
            SubLObject candidate_index = ZERO_INTEGER;
            SubLObject link_var = link;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
            SubLObject supporting_mapped_problem = NIL;
            for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                    if (index.numE(candidate_index)) {
                        return supporting_mapped_problem;
                    }
                    candidate_index = add(candidate_index, ONE_INTEGER);
                }
            }
        }
        return NIL;
    }

    public static SubLObject find_supporting_mapped_problem_by_index(final SubLObject link, final SubLObject index) {
        SubLObject candidate_index = ZERO_INTEGER;
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                if (index.numE(candidate_index)) {
                    return supporting_mapped_problem;
                }
                candidate_index = add(candidate_index, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Express the problem query of the problem in MAPPED-PROBLEM in terms of the
     * variable map in MAPPED-PROBLEM.
     */
    @LispMethod(comment = "Express the problem query of the problem in MAPPED-PROBLEM in terms of the\r\nvariable map in MAPPED-PROBLEM.\nExpress the problem query of the problem in MAPPED-PROBLEM in terms of the\nvariable map in MAPPED-PROBLEM.")
    public static final SubLObject mapped_problem_query_as_subquery_alt(SubLObject mapped_problem) {
        {
            SubLObject problem = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
            SubLObject variable_map = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
            SubLObject problem_query = inference_datastructures_problem.problem_query(problem);
            SubLObject subquery = apply_bindings(variable_map, problem_query);
            return subquery;
        }
    }

    @LispMethod(comment = "Express the problem query of the problem in MAPPED-PROBLEM in terms of the\r\nvariable map in MAPPED-PROBLEM.\nExpress the problem query of the problem in MAPPED-PROBLEM in terms of the\nvariable map in MAPPED-PROBLEM.")
    public static SubLObject mapped_problem_query_as_subquery(final SubLObject mapped_problem) {
        final SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
        final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
        final SubLObject problem_query = inference_datastructures_problem.problem_query(problem);
        final SubLObject subquery = bindings.apply_bindings(variable_map, problem_query);
        return subquery;
    }

    public static final SubLObject mapped_problem_equals_specP_alt(SubLObject mapped_problem, SubLObject query, SubLObject variable_map) {
        {
            SubLObject target_query = inference_datastructures_problem.problem_query(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_problem(mapped_problem));
            SubLObject target_variable_map = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
            return makeBoolean(target_query.equal(query) && target_variable_map.equal(variable_map));
        }
    }

    public static SubLObject mapped_problem_equals_specP(final SubLObject mapped_problem, final SubLObject query, final SubLObject variable_map) {
        final SubLObject target_query = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.mapped_problem_problem(mapped_problem));
        final SubLObject target_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
        return makeBoolean(target_query.equal(query) && target_variable_map.equal(variable_map));
    }

    /**
     *
     *
     * @unknown SUPPORTING-MAPPED-PROBLEM-VAR to all mapped problems of LINK whose problem is PROBLEM.
     * @see do-problem-dependent-link-interpretations
     */
    @LispMethod(comment = "@unknown SUPPORTING-MAPPED-PROBLEM-VAR to all mapped problems of LINK whose problem is PROBLEM.\r\n@see do-problem-dependent-link-interpretations")
    public static final SubLObject do_problem_link_supporting_mapped_problem_interpretations_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt88);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject supporting_mapped_problem_var = NIL;
                    SubLObject link = NIL;
                    SubLObject problem = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt88);
                    supporting_mapped_problem_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt88);
                    link = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt88);
                    problem = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt88);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt88);
                            if (NIL == member(current_3, $list_alt89, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt88);
                        }
                        {
                            SubLObject openP_tail = property_list_member($OPEN_, current);
                            SubLObject openP = (NIL != openP_tail) ? ((SubLObject) (cadr(openP_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject problem_var = $sym93$PROBLEM_VAR;
                                return list(CLET, list(list(problem_var, problem)), list(DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, list(supporting_mapped_problem_var, link, $OPEN_, openP, $DONE, done), listS(PWHEN, list(EQ, problem_var, list(MAPPED_PROBLEM_PROBLEM, supporting_mapped_problem_var)), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown SUPPORTING-MAPPED-PROBLEM-VAR to all mapped problems of LINK whose problem is PROBLEM.
     * @see do-problem-dependent-link-interpretations
     */
    @LispMethod(comment = "@unknown SUPPORTING-MAPPED-PROBLEM-VAR to all mapped problems of LINK whose problem is PROBLEM.\r\n@see do-problem-dependent-link-interpretations")
    public static SubLObject do_problem_link_supporting_mapped_problem_interpretations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_datastructures_problem_link.$list102);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_mapped_problem_var = NIL;
        SubLObject link = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, inference_datastructures_problem_link.$list102);
        supporting_mapped_problem_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_datastructures_problem_link.$list102);
        link = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_datastructures_problem_link.$list102);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, inference_datastructures_problem_link.$list102);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, inference_datastructures_problem_link.$list102);
            if (NIL == member(current_$1, inference_datastructures_problem_link.$list103, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == inference_datastructures_problem_link.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, inference_datastructures_problem_link.$list102);
        }
        final SubLObject openP_tail = property_list_member($OPEN_, current);
        final SubLObject openP = (NIL != openP_tail) ? cadr(openP_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject problem_var = inference_datastructures_problem_link.$sym107$PROBLEM_VAR;
        return list(CLET, list(list(problem_var, problem)), list(inference_datastructures_problem_link.DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, list(supporting_mapped_problem_var, link, $OPEN_, openP, $DONE, done), listS(PWHEN, list(EQ, problem_var, list(inference_datastructures_problem_link.MAPPED_PROBLEM_PROBLEM, supporting_mapped_problem_var)), append(body, NIL))));
    }

    /**
     *
     *
     * @unknown VARIABLE-MAP-VAR to all variable maps of mapped problems of LINK whose problem is PROBLEM.
     */
    @LispMethod(comment = "@unknown VARIABLE-MAP-VAR to all variable maps of mapped problems of LINK whose problem is PROBLEM.")
    public static final SubLObject do_problem_link_supporting_variable_map_interpretations_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt98);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject variable_map_var = NIL;
                    SubLObject link = NIL;
                    SubLObject problem = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt98);
                    variable_map_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt98);
                    link = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt98);
                    problem = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt98);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt98);
                            if (NIL == member(current_4, $list_alt89, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt98);
                        }
                        {
                            SubLObject openP_tail = property_list_member($OPEN_, current);
                            SubLObject openP = (NIL != openP_tail) ? ((SubLObject) (cadr(openP_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject supporting_mapped_problem = $sym99$SUPPORTING_MAPPED_PROBLEM;
                                return list(DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEM_INTERPRETATIONS, list(supporting_mapped_problem, link, problem, $OPEN_, openP, $DONE, done), listS(CLET, list(list(variable_map_var, list(MAPPED_PROBLEM_VARIABLE_MAP, supporting_mapped_problem))), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown VARIABLE-MAP-VAR to all variable maps of mapped problems of LINK whose problem is PROBLEM.
     */
    @LispMethod(comment = "@unknown VARIABLE-MAP-VAR to all variable maps of mapped problems of LINK whose problem is PROBLEM.")
    public static SubLObject do_problem_link_supporting_variable_map_interpretations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_datastructures_problem_link.$list112);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject variable_map_var = NIL;
        SubLObject link = NIL;
        SubLObject problem = NIL;
        destructuring_bind_must_consp(current, datum, inference_datastructures_problem_link.$list112);
        variable_map_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_datastructures_problem_link.$list112);
        link = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_datastructures_problem_link.$list112);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, inference_datastructures_problem_link.$list112);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, inference_datastructures_problem_link.$list112);
            if (NIL == member(current_$2, inference_datastructures_problem_link.$list103, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == inference_datastructures_problem_link.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, inference_datastructures_problem_link.$list112);
        }
        final SubLObject openP_tail = property_list_member($OPEN_, current);
        final SubLObject openP = (NIL != openP_tail) ? cadr(openP_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject supporting_mapped_problem = inference_datastructures_problem_link.$sym113$SUPPORTING_MAPPED_PROBLEM;
        return list(inference_datastructures_problem_link.DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEM_INTERPRETATIONS, list(supporting_mapped_problem, link, problem, $OPEN_, openP, $DONE, done), listS(CLET, list(list(variable_map_var, list(inference_datastructures_problem_link.MAPPED_PROBLEM_VARIABLE_MAP, supporting_mapped_problem))), append(body, NIL)));
    }

    public static final SubLObject link_has_some_sibling_linkP_alt(SubLObject link) {
        return numGE(inference_datastructures_problem.problem_argument_link_count(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.problem_link_supported_problem(link)), TWO_INTEGER);
    }

    public static SubLObject link_has_some_sibling_linkP(final SubLObject link) {
        return numGE(inference_datastructures_problem.problem_argument_link_count(inference_datastructures_problem_link.problem_link_supported_problem(link)), TWO_INTEGER);
    }

    public static final SubLObject declare_inference_datastructures_problem_link_file_alt() {
        declareFunction("problem_link_print_function_trampoline", "PROBLEM-LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("problem_link_p", "PROBLEM-LINK-P", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.$problem_link_p$UnaryFunction();
        declareFunction("prob_link_suid", "PROB-LINK-SUID", 1, 0, false);
        declareFunction("prob_link_type", "PROB-LINK-TYPE", 1, 0, false);
        declareFunction("prob_link_supported_object", "PROB-LINK-SUPPORTED-OBJECT", 1, 0, false);
        declareFunction("prob_link_supporting_mapped_problems", "PROB-LINK-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
        declareFunction("prob_link_open_flags", "PROB-LINK-OPEN-FLAGS", 1, 0, false);
        declareFunction("prob_link_data", "PROB-LINK-DATA", 1, 0, false);
        declareFunction("prob_link_proofs", "PROB-LINK-PROOFS", 1, 0, false);
        declareFunction("_csetf_prob_link_suid", "_CSETF-PROB-LINK-SUID", 2, 0, false);
        declareFunction("_csetf_prob_link_type", "_CSETF-PROB-LINK-TYPE", 2, 0, false);
        declareFunction("_csetf_prob_link_supported_object", "_CSETF-PROB-LINK-SUPPORTED-OBJECT", 2, 0, false);
        declareFunction("_csetf_prob_link_supporting_mapped_problems", "_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS", 2, 0, false);
        declareFunction("_csetf_prob_link_open_flags", "_CSETF-PROB-LINK-OPEN-FLAGS", 2, 0, false);
        declareFunction("_csetf_prob_link_data", "_CSETF-PROB-LINK-DATA", 2, 0, false);
        declareFunction("_csetf_prob_link_proofs", "_CSETF-PROB-LINK-PROOFS", 2, 0, false);
        declareFunction("make_problem_link", "MAKE-PROBLEM-LINK", 0, 1, false);
        declareFunction("valid_problem_link_p", "VALID-PROBLEM-LINK-P", 1, 0, false);
        declareFunction("problem_link_invalid_p", "PROBLEM-LINK-INVALID-P", 1, 0, false);
        declareFunction("print_problem_link", "PRINT-PROBLEM-LINK", 3, 0, false);
        declareFunction("sxhash_problem_link_method", "SXHASH-PROBLEM-LINK-METHOD", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.$sxhash_problem_link_method$UnaryFunction();
        declareFunction("new_problem_link", "NEW-PROBLEM-LINK", 2, 0, false);
        declareFunction("new_problem_link_int", "NEW-PROBLEM-LINK-INT", 2, 0, false);
        declareFunction("destroy_problem_link", "DESTROY-PROBLEM-LINK", 1, 0, false);
        declareFunction("destroy_problem_store_link", "DESTROY-PROBLEM-STORE-LINK", 1, 0, false);
        declareFunction("destroy_problem_link_int", "DESTROY-PROBLEM-LINK-INT", 1, 0, false);
        declareFunction("note_problem_link_invalid", "NOTE-PROBLEM-LINK-INVALID", 1, 0, false);
        declareFunction("problem_link_suid", "PROBLEM-LINK-SUID", 1, 0, false);
        declareFunction("problem_link_type", "PROBLEM-LINK-TYPE", 1, 0, false);
        declareFunction("problem_link_supported_object", "PROBLEM-LINK-SUPPORTED-OBJECT", 1, 0, false);
        declareFunction("problem_link_supporting_mapped_problems", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
        declareFunction("problem_link_open_flags", "PROBLEM-LINK-OPEN-FLAGS", 1, 0, false);
        declareFunction("problem_link_data", "PROBLEM-LINK-DATA", 1, 0, false);
        declareFunction("set_problem_link_open_flags", "SET-PROBLEM-LINK-OPEN-FLAGS", 2, 0, false);
        declareFunction("set_problem_link_data", "SET-PROBLEM-LINK-DATA", 2, 0, false);
        declareFunction("add_problem_link_proof", "ADD-PROBLEM-LINK-PROOF", 2, 0, false);
        declareFunction("remove_problem_link_proof", "REMOVE-PROBLEM-LINK-PROOF", 2, 0, false);
        declareFunction("problem_link_supporting_problems", "PROBLEM-LINK-SUPPORTING-PROBLEMS", 1, 0, false);
        declareFunction("problem_link_store", "PROBLEM-LINK-STORE", 1, 0, false);
        declareFunction("problem_link_has_typeP", "PROBLEM-LINK-HAS-TYPE?", 2, 0, false);
        declareFunction("problem_link_supported_inference", "PROBLEM-LINK-SUPPORTED-INFERENCE", 1, 0, false);
        declareFunction("problem_link_supported_problem", "PROBLEM-LINK-SUPPORTED-PROBLEM", 1, 0, false);
        declareFunction("problem_link_with_supporting_problem_p", "PROBLEM-LINK-WITH-SUPPORTING-PROBLEM-P", 1, 0, false);
        declareFunction("problem_link_with_single_supporting_problem_p", "PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P", 1, 0, false);
        declareFunction("problem_link_number_of_supporting_problems", "PROBLEM-LINK-NUMBER-OF-SUPPORTING-PROBLEMS", 1, 0, false);
        declareFunction("problem_link_supporting_mapped_problem_count", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_link_first_supporting_mapped_problem", "PROBLEM-LINK-FIRST-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("problem_link_sole_supporting_mapped_problem", "PROBLEM-LINK-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("problem_link_sole_supporting_variable_map", "PROBLEM-LINK-SOLE-SUPPORTING-VARIABLE-MAP", 1, 0, false);
        declareFunction("problem_link_first_supporting_problem", "PROBLEM-LINK-FIRST-SUPPORTING-PROBLEM", 1, 0, false);
        declareFunction("problem_link_sole_supporting_problem", "PROBLEM-LINK-SOLE-SUPPORTING-PROBLEM", 1, 0, false);
        declareFunction("problem_link_find_supporting_mapped_problem_by_index", "PROBLEM-LINK-FIND-SUPPORTING-MAPPED-PROBLEM-BY-INDEX", 2, 0, false);
        declareFunction("problem_link_openP", "PROBLEM-LINK-OPEN?", 1, 0, false);
        declareFunction("problem_link_closedP", "PROBLEM-LINK-CLOSED?", 1, 0, false);
        declareFunction("problem_link_index_openP", "PROBLEM-LINK-INDEX-OPEN?", 2, 0, false);
        declareFunction("problem_link_supporting_mapped_problem_openP", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-OPEN?", 2, 0, false);
        declareFunction("problem_link_sole_supporting_mapped_problem_openP", "PROBLEM-LINK-SOLE-SUPPORTING-MAPPED-PROBLEM-OPEN?", 1, 0, false);
        declareFunction("supporting_mapped_problem_open_wrt_linkP", "SUPPORTING-MAPPED-PROBLEM-OPEN-WRT-LINK?", 2, 0, false);
        declareFunction("supporting_problem_open_wrt_linkP", "SUPPORTING-PROBLEM-OPEN-WRT-LINK?", 2, 0, false);
        declareFunction("problem_link_completely_openP", "PROBLEM-LINK-COMPLETELY-OPEN?", 1, 0, false);
        declareFunction("problem_link_has_some_proofP", "PROBLEM-LINK-HAS-SOME-PROOF?", 1, 1, false);
        declareFunction("problem_link_goodP", "PROBLEM-LINK-GOOD?", 1, 0, false);
        declareFunction("problem_link_proofs", "PROBLEM-LINK-PROOFS", 1, 0, false);
        declareFunction("problem_link_all_proofs_computed", "PROBLEM-LINK-ALL-PROOFS-COMPUTED", 1, 0, false);
        declareFunction("problem_link_all_proofs", "PROBLEM-LINK-ALL-PROOFS", 1, 0, false);
        declareFunction("problem_link_proof_count", "PROBLEM-LINK-PROOF-COUNT", 1, 0, false);
        declareFunction("problem_link_destructibleP", "PROBLEM-LINK-DESTRUCTIBLE?", 1, 0, false);
        declareFunction("problem_link_destructibility_status", "PROBLEM-LINK-DESTRUCTIBILITY-STATUS", 1, 0, false);
        declareFunction("add_problem_link_supporting_mapped_problem", "ADD-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("problem_link_open_all", "PROBLEM-LINK-OPEN-ALL", 1, 0, false);
        declareFunction("problem_link_open_index", "PROBLEM-LINK-OPEN-INDEX", 2, 0, false);
        declareFunction("problem_link_open_supporting_mapped_problem", "PROBLEM-LINK-OPEN-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("problem_link_open_sole_supporting_mapped_problem", "PROBLEM-LINK-OPEN-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("problem_link_close_index", "PROBLEM-LINK-CLOSE-INDEX", 2, 0, false);
        declareFunction("problem_link_close_all", "PROBLEM-LINK-CLOSE-ALL", 1, 0, false);
        declareFunction("problem_link_close_supporting_mapped_problem", "PROBLEM-LINK-CLOSE-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("problem_link_close_sole_supporting_mapped_problem", "PROBLEM-LINK-CLOSE-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("connect_supporting_mapped_problem_with_dependent_link", "CONNECT-SUPPORTING-MAPPED-PROBLEM-WITH-DEPENDENT-LINK", 2, 0, false);
        declareFunction("problem_link_to_goal_p", "PROBLEM-LINK-TO-GOAL-P", 1, 0, false);
        declareFunction("find_problem_link_of_type_between", "FIND-PROBLEM-LINK-OF-TYPE-BETWEEN", 3, 0, false);
        declareFunction("link_of_type_betweenP", "LINK-OF-TYPE-BETWEEN?", 3, 0, false);
        declareFunction("find_closed_supporting_problem_by_query", "FIND-CLOSED-SUPPORTING-PROBLEM-BY-QUERY", 2, 0, false);
        declareFunction("find_supporting_mapped_problem_by_query_and_variable_map", "FIND-SUPPORTING-MAPPED-PROBLEM-BY-QUERY-AND-VARIABLE-MAP", 3, 0, false);
        declareFunction("problem_link_supporting_mapped_problem_that_isnt", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-THAT-ISNT", 2, 0, false);
        declareFunction("mapped_problem_print_function_trampoline", "MAPPED-PROBLEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("mapped_problem_p", "MAPPED-PROBLEM-P", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.$mapped_problem_p$UnaryFunction();
        declareFunction("mapped_prob_problem", "MAPPED-PROB-PROBLEM", 1, 0, false);
        declareFunction("mapped_prob_variable_map", "MAPPED-PROB-VARIABLE-MAP", 1, 0, false);
        declareFunction("_csetf_mapped_prob_problem", "_CSETF-MAPPED-PROB-PROBLEM", 2, 0, false);
        declareFunction("_csetf_mapped_prob_variable_map", "_CSETF-MAPPED-PROB-VARIABLE-MAP", 2, 0, false);
        declareFunction("make_mapped_problem", "MAKE-MAPPED-PROBLEM", 0, 1, false);
        declareFunction("valid_mapped_problem_p", "VALID-MAPPED-PROBLEM-P", 1, 0, false);
        declareFunction("mapped_problem_equal", "MAPPED-PROBLEM-EQUAL", 2, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link.$mapped_problem_equal$BinaryFunction();
        declareFunction("print_mapped_problem", "PRINT-MAPPED-PROBLEM", 3, 0, false);
        declareFunction("sxhash_mapped_problem_method", "SXHASH-MAPPED-PROBLEM-METHOD", 1, 0, false);
        declareFunction("closed_mapped_problem_p", "CLOSED-MAPPED-PROBLEM-P", 1, 0, false);
        declareFunction("new_mapped_problem", "NEW-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("new_closed_mapped_problem", "NEW-CLOSED-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("destroy_problem_link_mapped_problem", "DESTROY-PROBLEM-LINK-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("destroy_mapped_problem_int", "DESTROY-MAPPED-PROBLEM-INT", 1, 0, false);
        declareFunction("note_mapped_problem_invalid", "NOTE-MAPPED-PROBLEM-INVALID", 1, 0, false);
        declareFunction("mapped_problem_problem", "MAPPED-PROBLEM-PROBLEM", 1, 0, false);
        declareFunction("mapped_problem_variable_map", "MAPPED-PROBLEM-VARIABLE-MAP", 1, 0, false);
        declareFunction("supporting_mapped_problem_index", "SUPPORTING-MAPPED-PROBLEM-INDEX", 2, 0, false);
        declareFunction("find_supporting_mapped_problem_by_index", "FIND-SUPPORTING-MAPPED-PROBLEM-BY-INDEX", 2, 0, false);
        declareFunction("mapped_problem_query_as_subquery", "MAPPED-PROBLEM-QUERY-AS-SUBQUERY", 1, 0, false);
        declareFunction("mapped_problem_equals_specP", "MAPPED-PROBLEM-EQUALS-SPEC?", 3, 0, false);
        declareMacro("do_problem_link_supporting_mapped_problem_interpretations", "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-INTERPRETATIONS");
        declareMacro("do_problem_link_supporting_variable_map_interpretations", "DO-PROBLEM-LINK-SUPPORTING-VARIABLE-MAP-INTERPRETATIONS");
        declareFunction("link_has_some_sibling_linkP", "LINK-HAS-SOME-SIBLING-LINK?", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_inference_datastructures_problem_link_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("problem_link_print_function_trampoline", "PROBLEM-LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("problem_link_p", "PROBLEM-LINK-P", 1, 0, false);
            new inference_datastructures_problem_link.$problem_link_p$UnaryFunction();
            declareFunction("prob_link_suid", "PROB-LINK-SUID", 1, 0, false);
            declareFunction("prob_link_type", "PROB-LINK-TYPE", 1, 0, false);
            declareFunction("prob_link_supported_object", "PROB-LINK-SUPPORTED-OBJECT", 1, 0, false);
            declareFunction("prob_link_supporting_mapped_problems", "PROB-LINK-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
            declareFunction("prob_link_open_flags", "PROB-LINK-OPEN-FLAGS", 1, 0, false);
            declareFunction("prob_link_data", "PROB-LINK-DATA", 1, 0, false);
            declareFunction("prob_link_proofs", "PROB-LINK-PROOFS", 1, 0, false);
            declareFunction("prob_link_memoization_state", "PROB-LINK-MEMOIZATION-STATE", 1, 0, false);
            declareFunction("_csetf_prob_link_suid", "_CSETF-PROB-LINK-SUID", 2, 0, false);
            declareFunction("_csetf_prob_link_type", "_CSETF-PROB-LINK-TYPE", 2, 0, false);
            declareFunction("_csetf_prob_link_supported_object", "_CSETF-PROB-LINK-SUPPORTED-OBJECT", 2, 0, false);
            declareFunction("_csetf_prob_link_supporting_mapped_problems", "_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS", 2, 0, false);
            declareFunction("_csetf_prob_link_open_flags", "_CSETF-PROB-LINK-OPEN-FLAGS", 2, 0, false);
            declareFunction("_csetf_prob_link_data", "_CSETF-PROB-LINK-DATA", 2, 0, false);
            declareFunction("_csetf_prob_link_proofs", "_CSETF-PROB-LINK-PROOFS", 2, 0, false);
            declareFunction("_csetf_prob_link_memoization_state", "_CSETF-PROB-LINK-MEMOIZATION-STATE", 2, 0, false);
            declareFunction("make_problem_link", "MAKE-PROBLEM-LINK", 0, 1, false);
            declareFunction("visit_defstruct_problem_link", "VISIT-DEFSTRUCT-PROBLEM-LINK", 2, 0, false);
            declareFunction("visit_defstruct_object_problem_link_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-LINK-METHOD", 2, 0, false);
            declareFunction("valid_problem_link_p", "VALID-PROBLEM-LINK-P", 1, 0, false);
            declareFunction("problem_link_invalid_p", "PROBLEM-LINK-INVALID-P", 1, 0, false);
            declareFunction("print_problem_link", "PRINT-PROBLEM-LINK", 3, 0, false);
            declareFunction("sxhash_problem_link_method", "SXHASH-PROBLEM-LINK-METHOD", 1, 0, false);
            new inference_datastructures_problem_link.$sxhash_problem_link_method$UnaryFunction();
            declareMacro("with_problem_link_memoization_state", "WITH-PROBLEM-LINK-MEMOIZATION-STATE");
            declareFunction("problem_link_memoization_state", "PROBLEM-LINK-MEMOIZATION-STATE", 1, 0, false);
            declareFunction("new_problem_link", "NEW-PROBLEM-LINK", 2, 0, false);
            declareFunction("new_problem_link_int", "NEW-PROBLEM-LINK-INT", 2, 0, false);
            declareFunction("destroy_problem_link", "DESTROY-PROBLEM-LINK", 1, 0, false);
            declareFunction("destroy_problem_store_link", "DESTROY-PROBLEM-STORE-LINK", 1, 0, false);
            declareFunction("destroy_problem_link_int", "DESTROY-PROBLEM-LINK-INT", 1, 0, false);
            declareFunction("note_problem_link_invalid", "NOTE-PROBLEM-LINK-INVALID", 1, 0, false);
            declareFunction("problem_link_suid", "PROBLEM-LINK-SUID", 1, 0, false);
            declareFunction("problem_link_type", "PROBLEM-LINK-TYPE", 1, 0, false);
            declareFunction("problem_link_supported_object", "PROBLEM-LINK-SUPPORTED-OBJECT", 1, 0, false);
            declareFunction("problem_link_supporting_mapped_problems", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
            declareFunction("problem_link_open_flags", "PROBLEM-LINK-OPEN-FLAGS", 1, 0, false);
            declareFunction("problem_link_data", "PROBLEM-LINK-DATA", 1, 0, false);
            declareFunction("set_problem_link_open_flags", "SET-PROBLEM-LINK-OPEN-FLAGS", 2, 0, false);
            declareFunction("set_problem_link_data", "SET-PROBLEM-LINK-DATA", 2, 0, false);
            declareFunction("add_problem_link_proof", "ADD-PROBLEM-LINK-PROOF", 2, 0, false);
            declareFunction("remove_problem_link_proof", "REMOVE-PROBLEM-LINK-PROOF", 2, 0, false);
            declareFunction("problem_link_supporting_problems", "PROBLEM-LINK-SUPPORTING-PROBLEMS", 1, 0, false);
            declareFunction("problem_link_store", "PROBLEM-LINK-STORE", 1, 0, false);
            declareFunction("problem_link_has_typeP", "PROBLEM-LINK-HAS-TYPE?", 2, 0, false);
            declareFunction("problem_link_supported_inference", "PROBLEM-LINK-SUPPORTED-INFERENCE", 1, 0, false);
            declareFunction("problem_link_supported_problem", "PROBLEM-LINK-SUPPORTED-PROBLEM", 1, 0, false);
            declareFunction("problem_link_with_supporting_problem_p", "PROBLEM-LINK-WITH-SUPPORTING-PROBLEM-P", 1, 0, false);
            declareFunction("problem_link_with_single_supporting_problem_p", "PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P", 1, 0, false);
            declareFunction("problem_link_number_of_supporting_problems", "PROBLEM-LINK-NUMBER-OF-SUPPORTING-PROBLEMS", 1, 0, false);
            declareFunction("problem_link_supporting_mapped_problem_count", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-COUNT", 1, 0, false);
            declareFunction("problem_link_first_supporting_mapped_problem", "PROBLEM-LINK-FIRST-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
            declareFunction("problem_link_sole_supporting_mapped_problem", "PROBLEM-LINK-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
            declareFunction("problem_link_sole_supporting_variable_map", "PROBLEM-LINK-SOLE-SUPPORTING-VARIABLE-MAP", 1, 0, false);
            declareFunction("problem_link_first_supporting_problem", "PROBLEM-LINK-FIRST-SUPPORTING-PROBLEM", 1, 0, false);
            declareFunction("problem_link_sole_supporting_problem", "PROBLEM-LINK-SOLE-SUPPORTING-PROBLEM", 1, 0, false);
            declareFunction("problem_link_find_supporting_mapped_problem_by_index", "PROBLEM-LINK-FIND-SUPPORTING-MAPPED-PROBLEM-BY-INDEX", 2, 0, false);
            declareFunction("problem_link_openP", "PROBLEM-LINK-OPEN?", 1, 0, false);
            declareFunction("problem_link_closedP", "PROBLEM-LINK-CLOSED?", 1, 0, false);
            declareFunction("problem_link_index_openP", "PROBLEM-LINK-INDEX-OPEN?", 2, 0, false);
            declareFunction("problem_link_supporting_mapped_problem_openP", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-OPEN?", 2, 0, false);
            declareFunction("problem_link_sole_supporting_mapped_problem_openP", "PROBLEM-LINK-SOLE-SUPPORTING-MAPPED-PROBLEM-OPEN?", 1, 0, false);
            declareFunction("supporting_mapped_problem_open_wrt_linkP", "SUPPORTING-MAPPED-PROBLEM-OPEN-WRT-LINK?", 2, 0, false);
            declareFunction("supporting_problem_open_wrt_linkP", "SUPPORTING-PROBLEM-OPEN-WRT-LINK?", 2, 0, false);
            declareFunction("problem_link_completely_openP", "PROBLEM-LINK-COMPLETELY-OPEN?", 1, 0, false);
            declareFunction("problem_link_has_some_proofP", "PROBLEM-LINK-HAS-SOME-PROOF?", 1, 1, false);
            declareFunction("problem_link_goodP", "PROBLEM-LINK-GOOD?", 1, 0, false);
            declareFunction("problem_link_proofs", "PROBLEM-LINK-PROOFS", 1, 0, false);
            declareFunction("problem_link_all_proofs", "PROBLEM-LINK-ALL-PROOFS", 1, 0, false);
            declareFunction("problem_link_proof_count", "PROBLEM-LINK-PROOF-COUNT", 1, 0, false);
            declareFunction("problem_link_destructibleP", "PROBLEM-LINK-DESTRUCTIBLE?", 1, 0, false);
            declareFunction("problem_link_destructibility_status", "PROBLEM-LINK-DESTRUCTIBILITY-STATUS", 1, 0, false);
            declareFunction("add_problem_link_supporting_mapped_problem", "ADD-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
            declareFunction("problem_link_open_all", "PROBLEM-LINK-OPEN-ALL", 1, 0, false);
            declareFunction("problem_link_open_index", "PROBLEM-LINK-OPEN-INDEX", 2, 0, false);
            declareFunction("problem_link_open_supporting_mapped_problem", "PROBLEM-LINK-OPEN-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
            declareFunction("problem_link_open_sole_supporting_mapped_problem", "PROBLEM-LINK-OPEN-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
            declareFunction("problem_link_close_index", "PROBLEM-LINK-CLOSE-INDEX", 2, 0, false);
            declareFunction("problem_link_close_all", "PROBLEM-LINK-CLOSE-ALL", 1, 0, false);
            declareFunction("problem_link_close_supporting_mapped_problem", "PROBLEM-LINK-CLOSE-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
            declareFunction("problem_link_close_sole_supporting_mapped_problem", "PROBLEM-LINK-CLOSE-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
            declareFunction("connect_supporting_mapped_problem_with_dependent_link", "CONNECT-SUPPORTING-MAPPED-PROBLEM-WITH-DEPENDENT-LINK", 2, 0, false);
            declareFunction("problem_link_to_goal_p", "PROBLEM-LINK-TO-GOAL-P", 1, 0, false);
            declareFunction("find_problem_link_of_type_between", "FIND-PROBLEM-LINK-OF-TYPE-BETWEEN", 3, 0, false);
            declareFunction("link_of_type_betweenP", "LINK-OF-TYPE-BETWEEN?", 3, 0, false);
            declareFunction("find_closed_supporting_problem_by_query", "FIND-CLOSED-SUPPORTING-PROBLEM-BY-QUERY", 2, 0, false);
            declareFunction("find_supporting_mapped_problem_by_query_and_variable_map", "FIND-SUPPORTING-MAPPED-PROBLEM-BY-QUERY-AND-VARIABLE-MAP", 3, 0, false);
            declareFunction("problem_link_supporting_mapped_problem_that_isnt", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-THAT-ISNT", 2, 0, false);
            declareFunction("mapped_problem_print_function_trampoline", "MAPPED-PROBLEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("mapped_problem_p", "MAPPED-PROBLEM-P", 1, 0, false);
            new inference_datastructures_problem_link.$mapped_problem_p$UnaryFunction();
            declareFunction("mapped_prob_problem", "MAPPED-PROB-PROBLEM", 1, 0, false);
            declareFunction("mapped_prob_variable_map", "MAPPED-PROB-VARIABLE-MAP", 1, 0, false);
            declareFunction("_csetf_mapped_prob_problem", "_CSETF-MAPPED-PROB-PROBLEM", 2, 0, false);
            declareFunction("_csetf_mapped_prob_variable_map", "_CSETF-MAPPED-PROB-VARIABLE-MAP", 2, 0, false);
            declareFunction("make_mapped_problem", "MAKE-MAPPED-PROBLEM", 0, 1, false);
            declareFunction("visit_defstruct_mapped_problem", "VISIT-DEFSTRUCT-MAPPED-PROBLEM", 2, 0, false);
            declareFunction("visit_defstruct_object_mapped_problem_method", "VISIT-DEFSTRUCT-OBJECT-MAPPED-PROBLEM-METHOD", 2, 0, false);
            declareFunction("valid_mapped_problem_p", "VALID-MAPPED-PROBLEM-P", 1, 0, false);
            declareFunction("mapped_problem_equal", "MAPPED-PROBLEM-EQUAL", 2, 0, false);
            new inference_datastructures_problem_link.$mapped_problem_equal$BinaryFunction();
            declareFunction("print_mapped_problem", "PRINT-MAPPED-PROBLEM", 3, 0, false);
            declareFunction("sxhash_mapped_problem_method", "SXHASH-MAPPED-PROBLEM-METHOD", 1, 0, false);
            declareFunction("closed_mapped_problem_p", "CLOSED-MAPPED-PROBLEM-P", 1, 0, false);
            declareFunction("new_mapped_problem", "NEW-MAPPED-PROBLEM", 2, 0, false);
            declareFunction("new_closed_mapped_problem", "NEW-CLOSED-MAPPED-PROBLEM", 1, 0, false);
            declareFunction("destroy_problem_link_mapped_problem", "DESTROY-PROBLEM-LINK-MAPPED-PROBLEM", 1, 0, false);
            declareFunction("destroy_mapped_problem_int", "DESTROY-MAPPED-PROBLEM-INT", 1, 0, false);
            declareFunction("note_mapped_problem_invalid", "NOTE-MAPPED-PROBLEM-INVALID", 1, 0, false);
            declareFunction("mapped_problem_problem", "MAPPED-PROBLEM-PROBLEM", 1, 0, false);
            declareFunction("mapped_problem_variable_map", "MAPPED-PROBLEM-VARIABLE-MAP", 1, 0, false);
            declareFunction("supporting_mapped_problem_index", "SUPPORTING-MAPPED-PROBLEM-INDEX", 2, 0, false);
            declareFunction("find_supporting_mapped_problem_by_index", "FIND-SUPPORTING-MAPPED-PROBLEM-BY-INDEX", 2, 0, false);
            declareFunction("mapped_problem_query_as_subquery", "MAPPED-PROBLEM-QUERY-AS-SUBQUERY", 1, 0, false);
            declareFunction("mapped_problem_equals_specP", "MAPPED-PROBLEM-EQUALS-SPEC?", 3, 0, false);
            declareMacro("do_problem_link_supporting_mapped_problem_interpretations", "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-INTERPRETATIONS");
            declareMacro("do_problem_link_supporting_variable_map_interpretations", "DO-PROBLEM-LINK-SUPPORTING-VARIABLE-MAP-INTERPRETATIONS");
            declareFunction("link_has_some_sibling_linkP", "LINK-HAS-SOME-SIBLING-LINK?", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("problem_link_all_proofs_computed", "PROBLEM-LINK-ALL-PROOFS-COMPUTED", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_datastructures_problem_link_file_Previous() {
        declareFunction("problem_link_print_function_trampoline", "PROBLEM-LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("problem_link_p", "PROBLEM-LINK-P", 1, 0, false);
        new inference_datastructures_problem_link.$problem_link_p$UnaryFunction();
        declareFunction("prob_link_suid", "PROB-LINK-SUID", 1, 0, false);
        declareFunction("prob_link_type", "PROB-LINK-TYPE", 1, 0, false);
        declareFunction("prob_link_supported_object", "PROB-LINK-SUPPORTED-OBJECT", 1, 0, false);
        declareFunction("prob_link_supporting_mapped_problems", "PROB-LINK-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
        declareFunction("prob_link_open_flags", "PROB-LINK-OPEN-FLAGS", 1, 0, false);
        declareFunction("prob_link_data", "PROB-LINK-DATA", 1, 0, false);
        declareFunction("prob_link_proofs", "PROB-LINK-PROOFS", 1, 0, false);
        declareFunction("prob_link_memoization_state", "PROB-LINK-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("_csetf_prob_link_suid", "_CSETF-PROB-LINK-SUID", 2, 0, false);
        declareFunction("_csetf_prob_link_type", "_CSETF-PROB-LINK-TYPE", 2, 0, false);
        declareFunction("_csetf_prob_link_supported_object", "_CSETF-PROB-LINK-SUPPORTED-OBJECT", 2, 0, false);
        declareFunction("_csetf_prob_link_supporting_mapped_problems", "_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS", 2, 0, false);
        declareFunction("_csetf_prob_link_open_flags", "_CSETF-PROB-LINK-OPEN-FLAGS", 2, 0, false);
        declareFunction("_csetf_prob_link_data", "_CSETF-PROB-LINK-DATA", 2, 0, false);
        declareFunction("_csetf_prob_link_proofs", "_CSETF-PROB-LINK-PROOFS", 2, 0, false);
        declareFunction("_csetf_prob_link_memoization_state", "_CSETF-PROB-LINK-MEMOIZATION-STATE", 2, 0, false);
        declareFunction("make_problem_link", "MAKE-PROBLEM-LINK", 0, 1, false);
        declareFunction("visit_defstruct_problem_link", "VISIT-DEFSTRUCT-PROBLEM-LINK", 2, 0, false);
        declareFunction("visit_defstruct_object_problem_link_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-LINK-METHOD", 2, 0, false);
        declareFunction("valid_problem_link_p", "VALID-PROBLEM-LINK-P", 1, 0, false);
        declareFunction("problem_link_invalid_p", "PROBLEM-LINK-INVALID-P", 1, 0, false);
        declareFunction("print_problem_link", "PRINT-PROBLEM-LINK", 3, 0, false);
        declareFunction("sxhash_problem_link_method", "SXHASH-PROBLEM-LINK-METHOD", 1, 0, false);
        new inference_datastructures_problem_link.$sxhash_problem_link_method$UnaryFunction();
        declareMacro("with_problem_link_memoization_state", "WITH-PROBLEM-LINK-MEMOIZATION-STATE");
        declareFunction("problem_link_memoization_state", "PROBLEM-LINK-MEMOIZATION-STATE", 1, 0, false);
        declareFunction("new_problem_link", "NEW-PROBLEM-LINK", 2, 0, false);
        declareFunction("new_problem_link_int", "NEW-PROBLEM-LINK-INT", 2, 0, false);
        declareFunction("destroy_problem_link", "DESTROY-PROBLEM-LINK", 1, 0, false);
        declareFunction("destroy_problem_store_link", "DESTROY-PROBLEM-STORE-LINK", 1, 0, false);
        declareFunction("destroy_problem_link_int", "DESTROY-PROBLEM-LINK-INT", 1, 0, false);
        declareFunction("note_problem_link_invalid", "NOTE-PROBLEM-LINK-INVALID", 1, 0, false);
        declareFunction("problem_link_suid", "PROBLEM-LINK-SUID", 1, 0, false);
        declareFunction("problem_link_type", "PROBLEM-LINK-TYPE", 1, 0, false);
        declareFunction("problem_link_supported_object", "PROBLEM-LINK-SUPPORTED-OBJECT", 1, 0, false);
        declareFunction("problem_link_supporting_mapped_problems", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
        declareFunction("problem_link_open_flags", "PROBLEM-LINK-OPEN-FLAGS", 1, 0, false);
        declareFunction("problem_link_data", "PROBLEM-LINK-DATA", 1, 0, false);
        declareFunction("set_problem_link_open_flags", "SET-PROBLEM-LINK-OPEN-FLAGS", 2, 0, false);
        declareFunction("set_problem_link_data", "SET-PROBLEM-LINK-DATA", 2, 0, false);
        declareFunction("add_problem_link_proof", "ADD-PROBLEM-LINK-PROOF", 2, 0, false);
        declareFunction("remove_problem_link_proof", "REMOVE-PROBLEM-LINK-PROOF", 2, 0, false);
        declareFunction("problem_link_supporting_problems", "PROBLEM-LINK-SUPPORTING-PROBLEMS", 1, 0, false);
        declareFunction("problem_link_store", "PROBLEM-LINK-STORE", 1, 0, false);
        declareFunction("problem_link_has_typeP", "PROBLEM-LINK-HAS-TYPE?", 2, 0, false);
        declareFunction("problem_link_supported_inference", "PROBLEM-LINK-SUPPORTED-INFERENCE", 1, 0, false);
        declareFunction("problem_link_supported_problem", "PROBLEM-LINK-SUPPORTED-PROBLEM", 1, 0, false);
        declareFunction("problem_link_with_supporting_problem_p", "PROBLEM-LINK-WITH-SUPPORTING-PROBLEM-P", 1, 0, false);
        declareFunction("problem_link_with_single_supporting_problem_p", "PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P", 1, 0, false);
        declareFunction("problem_link_number_of_supporting_problems", "PROBLEM-LINK-NUMBER-OF-SUPPORTING-PROBLEMS", 1, 0, false);
        declareFunction("problem_link_supporting_mapped_problem_count", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-COUNT", 1, 0, false);
        declareFunction("problem_link_first_supporting_mapped_problem", "PROBLEM-LINK-FIRST-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("problem_link_sole_supporting_mapped_problem", "PROBLEM-LINK-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("problem_link_sole_supporting_variable_map", "PROBLEM-LINK-SOLE-SUPPORTING-VARIABLE-MAP", 1, 0, false);
        declareFunction("problem_link_first_supporting_problem", "PROBLEM-LINK-FIRST-SUPPORTING-PROBLEM", 1, 0, false);
        declareFunction("problem_link_sole_supporting_problem", "PROBLEM-LINK-SOLE-SUPPORTING-PROBLEM", 1, 0, false);
        declareFunction("problem_link_find_supporting_mapped_problem_by_index", "PROBLEM-LINK-FIND-SUPPORTING-MAPPED-PROBLEM-BY-INDEX", 2, 0, false);
        declareFunction("problem_link_openP", "PROBLEM-LINK-OPEN?", 1, 0, false);
        declareFunction("problem_link_closedP", "PROBLEM-LINK-CLOSED?", 1, 0, false);
        declareFunction("problem_link_index_openP", "PROBLEM-LINK-INDEX-OPEN?", 2, 0, false);
        declareFunction("problem_link_supporting_mapped_problem_openP", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-OPEN?", 2, 0, false);
        declareFunction("problem_link_sole_supporting_mapped_problem_openP", "PROBLEM-LINK-SOLE-SUPPORTING-MAPPED-PROBLEM-OPEN?", 1, 0, false);
        declareFunction("supporting_mapped_problem_open_wrt_linkP", "SUPPORTING-MAPPED-PROBLEM-OPEN-WRT-LINK?", 2, 0, false);
        declareFunction("supporting_problem_open_wrt_linkP", "SUPPORTING-PROBLEM-OPEN-WRT-LINK?", 2, 0, false);
        declareFunction("problem_link_completely_openP", "PROBLEM-LINK-COMPLETELY-OPEN?", 1, 0, false);
        declareFunction("problem_link_has_some_proofP", "PROBLEM-LINK-HAS-SOME-PROOF?", 1, 1, false);
        declareFunction("problem_link_goodP", "PROBLEM-LINK-GOOD?", 1, 0, false);
        declareFunction("problem_link_proofs", "PROBLEM-LINK-PROOFS", 1, 0, false);
        declareFunction("problem_link_all_proofs", "PROBLEM-LINK-ALL-PROOFS", 1, 0, false);
        declareFunction("problem_link_proof_count", "PROBLEM-LINK-PROOF-COUNT", 1, 0, false);
        declareFunction("problem_link_destructibleP", "PROBLEM-LINK-DESTRUCTIBLE?", 1, 0, false);
        declareFunction("problem_link_destructibility_status", "PROBLEM-LINK-DESTRUCTIBILITY-STATUS", 1, 0, false);
        declareFunction("add_problem_link_supporting_mapped_problem", "ADD-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("problem_link_open_all", "PROBLEM-LINK-OPEN-ALL", 1, 0, false);
        declareFunction("problem_link_open_index", "PROBLEM-LINK-OPEN-INDEX", 2, 0, false);
        declareFunction("problem_link_open_supporting_mapped_problem", "PROBLEM-LINK-OPEN-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("problem_link_open_sole_supporting_mapped_problem", "PROBLEM-LINK-OPEN-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("problem_link_close_index", "PROBLEM-LINK-CLOSE-INDEX", 2, 0, false);
        declareFunction("problem_link_close_all", "PROBLEM-LINK-CLOSE-ALL", 1, 0, false);
        declareFunction("problem_link_close_supporting_mapped_problem", "PROBLEM-LINK-CLOSE-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("problem_link_close_sole_supporting_mapped_problem", "PROBLEM-LINK-CLOSE-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("connect_supporting_mapped_problem_with_dependent_link", "CONNECT-SUPPORTING-MAPPED-PROBLEM-WITH-DEPENDENT-LINK", 2, 0, false);
        declareFunction("problem_link_to_goal_p", "PROBLEM-LINK-TO-GOAL-P", 1, 0, false);
        declareFunction("find_problem_link_of_type_between", "FIND-PROBLEM-LINK-OF-TYPE-BETWEEN", 3, 0, false);
        declareFunction("link_of_type_betweenP", "LINK-OF-TYPE-BETWEEN?", 3, 0, false);
        declareFunction("find_closed_supporting_problem_by_query", "FIND-CLOSED-SUPPORTING-PROBLEM-BY-QUERY", 2, 0, false);
        declareFunction("find_supporting_mapped_problem_by_query_and_variable_map", "FIND-SUPPORTING-MAPPED-PROBLEM-BY-QUERY-AND-VARIABLE-MAP", 3, 0, false);
        declareFunction("problem_link_supporting_mapped_problem_that_isnt", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-THAT-ISNT", 2, 0, false);
        declareFunction("mapped_problem_print_function_trampoline", "MAPPED-PROBLEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("mapped_problem_p", "MAPPED-PROBLEM-P", 1, 0, false);
        new inference_datastructures_problem_link.$mapped_problem_p$UnaryFunction();
        declareFunction("mapped_prob_problem", "MAPPED-PROB-PROBLEM", 1, 0, false);
        declareFunction("mapped_prob_variable_map", "MAPPED-PROB-VARIABLE-MAP", 1, 0, false);
        declareFunction("_csetf_mapped_prob_problem", "_CSETF-MAPPED-PROB-PROBLEM", 2, 0, false);
        declareFunction("_csetf_mapped_prob_variable_map", "_CSETF-MAPPED-PROB-VARIABLE-MAP", 2, 0, false);
        declareFunction("make_mapped_problem", "MAKE-MAPPED-PROBLEM", 0, 1, false);
        declareFunction("visit_defstruct_mapped_problem", "VISIT-DEFSTRUCT-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("visit_defstruct_object_mapped_problem_method", "VISIT-DEFSTRUCT-OBJECT-MAPPED-PROBLEM-METHOD", 2, 0, false);
        declareFunction("valid_mapped_problem_p", "VALID-MAPPED-PROBLEM-P", 1, 0, false);
        declareFunction("mapped_problem_equal", "MAPPED-PROBLEM-EQUAL", 2, 0, false);
        new inference_datastructures_problem_link.$mapped_problem_equal$BinaryFunction();
        declareFunction("print_mapped_problem", "PRINT-MAPPED-PROBLEM", 3, 0, false);
        declareFunction("sxhash_mapped_problem_method", "SXHASH-MAPPED-PROBLEM-METHOD", 1, 0, false);
        declareFunction("closed_mapped_problem_p", "CLOSED-MAPPED-PROBLEM-P", 1, 0, false);
        declareFunction("new_mapped_problem", "NEW-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("new_closed_mapped_problem", "NEW-CLOSED-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("destroy_problem_link_mapped_problem", "DESTROY-PROBLEM-LINK-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("destroy_mapped_problem_int", "DESTROY-MAPPED-PROBLEM-INT", 1, 0, false);
        declareFunction("note_mapped_problem_invalid", "NOTE-MAPPED-PROBLEM-INVALID", 1, 0, false);
        declareFunction("mapped_problem_problem", "MAPPED-PROBLEM-PROBLEM", 1, 0, false);
        declareFunction("mapped_problem_variable_map", "MAPPED-PROBLEM-VARIABLE-MAP", 1, 0, false);
        declareFunction("supporting_mapped_problem_index", "SUPPORTING-MAPPED-PROBLEM-INDEX", 2, 0, false);
        declareFunction("find_supporting_mapped_problem_by_index", "FIND-SUPPORTING-MAPPED-PROBLEM-BY-INDEX", 2, 0, false);
        declareFunction("mapped_problem_query_as_subquery", "MAPPED-PROBLEM-QUERY-AS-SUBQUERY", 1, 0, false);
        declareFunction("mapped_problem_equals_specP", "MAPPED-PROBLEM-EQUALS-SPEC?", 3, 0, false);
        declareMacro("do_problem_link_supporting_mapped_problem_interpretations", "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-INTERPRETATIONS");
        declareMacro("do_problem_link_supporting_variable_map_interpretations", "DO-PROBLEM-LINK-SUPPORTING-VARIABLE-MAP-INTERPRETATIONS");
        declareFunction("link_has_some_sibling_linkP", "LINK-HAS-SOME-SIBLING-LINK?", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt3 = list(makeSymbol("SUID"), makeSymbol("TYPE"), makeSymbol("SUPPORTED-OBJECT"), makeSymbol("SUPPORTING-MAPPED-PROBLEMS"), makeSymbol("OPEN-FLAGS"), makeSymbol("DATA"), makeSymbol("PROOFS"));

    static private final SubLList $list_alt4 = list($SUID, $TYPE, makeKeyword("SUPPORTED-OBJECT"), makeKeyword("SUPPORTING-MAPPED-PROBLEMS"), makeKeyword("OPEN-FLAGS"), $DATA, makeKeyword("PROOFS"));

    static private final SubLList $list_alt5 = list(makeSymbol("PROB-LINK-SUID"), makeSymbol("PROB-LINK-TYPE"), makeSymbol("PROB-LINK-SUPPORTED-OBJECT"), makeSymbol("PROB-LINK-SUPPORTING-MAPPED-PROBLEMS"), makeSymbol("PROB-LINK-OPEN-FLAGS"), makeSymbol("PROB-LINK-DATA"), makeSymbol("PROB-LINK-PROOFS"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-PROB-LINK-SUID"), makeSymbol("_CSETF-PROB-LINK-TYPE"), makeSymbol("_CSETF-PROB-LINK-SUPPORTED-OBJECT"), makeSymbol("_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS"), makeSymbol("_CSETF-PROB-LINK-OPEN-FLAGS"), makeSymbol("_CSETF-PROB-LINK-DATA"), makeSymbol("_CSETF-PROB-LINK-PROOFS"));

    public static final SubLObject init_inference_datastructures_problem_link_file_alt() {
        defparameter("*PROBLEM-LINK-DATASTRUCTURE-STORES-PROOFS?*", NIL);
        defconstant("*DTP-PROBLEM-LINK*", PROBLEM_LINK);
        defconstant("*DTP-MAPPED-PROBLEM*", MAPPED_PROBLEM);
        return NIL;
    }

    public static SubLObject init_inference_datastructures_problem_link_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-PROBLEM-LINK*", inference_datastructures_problem_link.PROBLEM_LINK);
            defconstant("*DTP-MAPPED-PROBLEM*", inference_datastructures_problem_link.MAPPED_PROBLEM);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*PROBLEM-LINK-DATASTRUCTURE-STORES-PROOFS?*", NIL);
        }
        return NIL;
    }

    public static SubLObject init_inference_datastructures_problem_link_file_Previous() {
        defconstant("*DTP-PROBLEM-LINK*", inference_datastructures_problem_link.PROBLEM_LINK);
        defconstant("*DTP-MAPPED-PROBLEM*", inference_datastructures_problem_link.MAPPED_PROBLEM);
        return NIL;
    }

    public static final SubLObject setup_inference_datastructures_problem_link_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_problem_link$.getGlobalValue(), symbol_function(PROBLEM_LINK_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(PROB_LINK_SUID, _CSETF_PROB_LINK_SUID);
        def_csetf(PROB_LINK_TYPE, _CSETF_PROB_LINK_TYPE);
        def_csetf(PROB_LINK_SUPPORTED_OBJECT, _CSETF_PROB_LINK_SUPPORTED_OBJECT);
        def_csetf(PROB_LINK_SUPPORTING_MAPPED_PROBLEMS, _CSETF_PROB_LINK_SUPPORTING_MAPPED_PROBLEMS);
        def_csetf(PROB_LINK_OPEN_FLAGS, _CSETF_PROB_LINK_OPEN_FLAGS);
        def_csetf(PROB_LINK_DATA, _CSETF_PROB_LINK_DATA);
        def_csetf(PROB_LINK_PROOFS, _CSETF_PROB_LINK_PROOFS);
        identity(PROBLEM_LINK);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_problem_link$.getGlobalValue(), symbol_function(SXHASH_PROBLEM_LINK_METHOD));
        define_obsolete_register(PROBLEM_LINK_NUMBER_OF_SUPPORTING_PROBLEMS, $list_alt60);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_mapped_problem$.getGlobalValue(), symbol_function(MAPPED_PROBLEM_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(MAPPED_PROB_PROBLEM, _CSETF_MAPPED_PROB_PROBLEM);
        def_csetf(MAPPED_PROB_VARIABLE_MAP, _CSETF_MAPPED_PROB_VARIABLE_MAP);
        identity(MAPPED_PROBLEM);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_mapped_problem$.getGlobalValue(), symbol_function(SXHASH_MAPPED_PROBLEM_METHOD));
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_problem_link_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_problem_link$.getGlobalValue(), symbol_function(inference_datastructures_problem_link.PROBLEM_LINK_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(inference_datastructures_problem_link.$list9);
            def_csetf(inference_datastructures_problem_link.PROB_LINK_SUID, inference_datastructures_problem_link._CSETF_PROB_LINK_SUID);
            def_csetf(inference_datastructures_problem_link.PROB_LINK_TYPE, inference_datastructures_problem_link._CSETF_PROB_LINK_TYPE);
            def_csetf(inference_datastructures_problem_link.PROB_LINK_SUPPORTED_OBJECT, inference_datastructures_problem_link._CSETF_PROB_LINK_SUPPORTED_OBJECT);
            def_csetf(inference_datastructures_problem_link.PROB_LINK_SUPPORTING_MAPPED_PROBLEMS, inference_datastructures_problem_link._CSETF_PROB_LINK_SUPPORTING_MAPPED_PROBLEMS);
            def_csetf(inference_datastructures_problem_link.PROB_LINK_OPEN_FLAGS, inference_datastructures_problem_link._CSETF_PROB_LINK_OPEN_FLAGS);
            def_csetf(inference_datastructures_problem_link.PROB_LINK_DATA, inference_datastructures_problem_link._CSETF_PROB_LINK_DATA);
            def_csetf(inference_datastructures_problem_link.PROB_LINK_PROOFS, inference_datastructures_problem_link._CSETF_PROB_LINK_PROOFS);
            def_csetf(inference_datastructures_problem_link.PROB_LINK_MEMOIZATION_STATE, inference_datastructures_problem_link._CSETF_PROB_LINK_MEMOIZATION_STATE);
            identity(inference_datastructures_problem_link.PROBLEM_LINK);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_problem_link$.getGlobalValue(), symbol_function(inference_datastructures_problem_link.VISIT_DEFSTRUCT_OBJECT_PROBLEM_LINK_METHOD));
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_problem_link$.getGlobalValue(), symbol_function(inference_datastructures_problem_link.SXHASH_PROBLEM_LINK_METHOD));
            register_macro_helper(inference_datastructures_problem_link.PROBLEM_LINK_MEMOIZATION_STATE, inference_datastructures_problem_link.WITH_PROBLEM_LINK_MEMOIZATION_STATE);
            define_obsolete_register(inference_datastructures_problem_link.PROBLEM_LINK_NUMBER_OF_SUPPORTING_PROBLEMS, inference_datastructures_problem_link.$list74);
            register_method($print_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_mapped_problem$.getGlobalValue(), symbol_function(inference_datastructures_problem_link.MAPPED_PROBLEM_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(inference_datastructures_problem_link.$list89);
            def_csetf(inference_datastructures_problem_link.MAPPED_PROB_PROBLEM, inference_datastructures_problem_link._CSETF_MAPPED_PROB_PROBLEM);
            def_csetf(inference_datastructures_problem_link.MAPPED_PROB_VARIABLE_MAP, inference_datastructures_problem_link._CSETF_MAPPED_PROB_VARIABLE_MAP);
            identity(inference_datastructures_problem_link.MAPPED_PROBLEM);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_mapped_problem$.getGlobalValue(), symbol_function(inference_datastructures_problem_link.VISIT_DEFSTRUCT_OBJECT_MAPPED_PROBLEM_METHOD));
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_mapped_problem$.getGlobalValue(), symbol_function(inference_datastructures_problem_link.SXHASH_MAPPED_PROBLEM_METHOD));
        }
        if (SubLFiles.USE_V2) {
            define_obsolete_register(PROBLEM_LINK_NUMBER_OF_SUPPORTING_PROBLEMS, $list_alt60);
        }
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_problem_link_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_problem_link$.getGlobalValue(), symbol_function(inference_datastructures_problem_link.PROBLEM_LINK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(inference_datastructures_problem_link.$list9);
        def_csetf(inference_datastructures_problem_link.PROB_LINK_SUID, inference_datastructures_problem_link._CSETF_PROB_LINK_SUID);
        def_csetf(inference_datastructures_problem_link.PROB_LINK_TYPE, inference_datastructures_problem_link._CSETF_PROB_LINK_TYPE);
        def_csetf(inference_datastructures_problem_link.PROB_LINK_SUPPORTED_OBJECT, inference_datastructures_problem_link._CSETF_PROB_LINK_SUPPORTED_OBJECT);
        def_csetf(inference_datastructures_problem_link.PROB_LINK_SUPPORTING_MAPPED_PROBLEMS, inference_datastructures_problem_link._CSETF_PROB_LINK_SUPPORTING_MAPPED_PROBLEMS);
        def_csetf(inference_datastructures_problem_link.PROB_LINK_OPEN_FLAGS, inference_datastructures_problem_link._CSETF_PROB_LINK_OPEN_FLAGS);
        def_csetf(inference_datastructures_problem_link.PROB_LINK_DATA, inference_datastructures_problem_link._CSETF_PROB_LINK_DATA);
        def_csetf(inference_datastructures_problem_link.PROB_LINK_PROOFS, inference_datastructures_problem_link._CSETF_PROB_LINK_PROOFS);
        def_csetf(inference_datastructures_problem_link.PROB_LINK_MEMOIZATION_STATE, inference_datastructures_problem_link._CSETF_PROB_LINK_MEMOIZATION_STATE);
        identity(inference_datastructures_problem_link.PROBLEM_LINK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_problem_link$.getGlobalValue(), symbol_function(inference_datastructures_problem_link.VISIT_DEFSTRUCT_OBJECT_PROBLEM_LINK_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_problem_link$.getGlobalValue(), symbol_function(inference_datastructures_problem_link.SXHASH_PROBLEM_LINK_METHOD));
        register_macro_helper(inference_datastructures_problem_link.PROBLEM_LINK_MEMOIZATION_STATE, inference_datastructures_problem_link.WITH_PROBLEM_LINK_MEMOIZATION_STATE);
        define_obsolete_register(inference_datastructures_problem_link.PROBLEM_LINK_NUMBER_OF_SUPPORTING_PROBLEMS, inference_datastructures_problem_link.$list74);
        register_method($print_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_mapped_problem$.getGlobalValue(), symbol_function(inference_datastructures_problem_link.MAPPED_PROBLEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(inference_datastructures_problem_link.$list89);
        def_csetf(inference_datastructures_problem_link.MAPPED_PROB_PROBLEM, inference_datastructures_problem_link._CSETF_MAPPED_PROB_PROBLEM);
        def_csetf(inference_datastructures_problem_link.MAPPED_PROB_VARIABLE_MAP, inference_datastructures_problem_link._CSETF_MAPPED_PROB_VARIABLE_MAP);
        identity(inference_datastructures_problem_link.MAPPED_PROBLEM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_mapped_problem$.getGlobalValue(), symbol_function(inference_datastructures_problem_link.VISIT_DEFSTRUCT_OBJECT_MAPPED_PROBLEM_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_mapped_problem$.getGlobalValue(), symbol_function(inference_datastructures_problem_link.SXHASH_MAPPED_PROBLEM_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt32$_Invalid_LINK__s_ = makeString("<Invalid LINK ~s>");

    static private final SubLString $str_alt33$__a_LINK__a__a_supporting_ = makeString("<~a LINK ~a.~a supporting ");

    static private final SubLString $str_alt35$_a_ = makeString("~a>");

    static private final SubLString $str_alt36$_a__a_ = makeString("~a.~a>");

    static private final SubLString $str_alt39$Can_t_call_new_problem_link_for_a = makeString("Can't call new-problem-link for an :answer link, call new-answer-link instead");

    static private final SubLList $list_alt60 = list(makeSymbol("PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-COUNT"));

    static private final SubLList $list_alt69 = list(makeSymbol("PROBLEM"), makeSymbol("VARIABLE-MAP"));

    static private final SubLList $list_alt70 = list(makeKeyword("PROBLEM"), makeKeyword("VARIABLE-MAP"));

    static private final SubLList $list_alt71 = list(makeSymbol("MAPPED-PROB-PROBLEM"), makeSymbol("MAPPED-PROB-VARIABLE-MAP"));

    static private final SubLList $list_alt72 = list(makeSymbol("_CSETF-MAPPED-PROB-PROBLEM"), makeSymbol("_CSETF-MAPPED-PROB-VARIABLE-MAP"));

    @Override
    public void declareFunctions() {
        inference_datastructures_problem_link.declare_inference_datastructures_problem_link_file();
    }

    @Override
    public void initializeVariables() {
        inference_datastructures_problem_link.init_inference_datastructures_problem_link_file();
    }

    @Override
    public void runTopLevelForms() {
        inference_datastructures_problem_link.setup_inference_datastructures_problem_link_file();
    }

    static {
    }

    public static final class $problem_link_native extends SubLStructNative {
        public SubLObject $suid;

        public SubLObject $type;

        public SubLObject $supported_object;

        public SubLObject $supporting_mapped_problems;

        public SubLObject $open_flags;

        public SubLObject $data;

        public SubLObject $proofs;

        public SubLObject $memoization_state;

        private static final SubLStructDeclNative structDecl;

        public $problem_link_native() {
            this.$suid = Lisp.NIL;
            this.$type = Lisp.NIL;
            this.$supported_object = Lisp.NIL;
            this.$supporting_mapped_problems = Lisp.NIL;
            this.$open_flags = Lisp.NIL;
            this.$data = Lisp.NIL;
            this.$proofs = Lisp.NIL;
            this.$memoization_state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$suid;
        }

        @Override
        public SubLObject getField3() {
            return this.$type;
        }

        @Override
        public SubLObject getField4() {
            return this.$supported_object;
        }

        @Override
        public SubLObject getField5() {
            return this.$supporting_mapped_problems;
        }

        @Override
        public SubLObject getField6() {
            return this.$open_flags;
        }

        @Override
        public SubLObject getField7() {
            return this.$data;
        }

        @Override
        public SubLObject getField8() {
            return this.$proofs;
        }

        @Override
        public SubLObject getField9() {
            return this.$memoization_state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$supported_object = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$supporting_mapped_problems = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$open_flags = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$data = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$proofs = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$memoization_state = value;
        }

        static {
            structDecl = makeStructDeclNative(inference_datastructures_problem_link.$problem_link_native.class, inference_datastructures_problem_link.PROBLEM_LINK, PROBLEM_LINK_P, inference_datastructures_problem_link.$list3, inference_datastructures_problem_link.$list4, new String[]{ "$suid", "$type", "$supported_object", "$supporting_mapped_problems", "$open_flags", "$data", "$proofs", "$memoization_state" }, inference_datastructures_problem_link.$list5, inference_datastructures_problem_link.$list6, inference_datastructures_problem_link.PRINT_PROBLEM_LINK);
        }
    }

    static private final SubLString $str_alt81$_MAPPED_PROBLEM__a__a_ = makeString("<MAPPED PROBLEM:~a ~a>");

    static private final SubLString $str_alt82$__ = makeString("#<");

    static private final SubLList $list_alt88 = list(list(makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), makeSymbol("LINK"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt89 = list(makeKeyword("OPEN?"), $DONE);

    static private final SubLSymbol $sym93$PROBLEM_VAR = makeUninternedSymbol("PROBLEM-VAR");

    static private final SubLList $list_alt98 = list(list(makeSymbol("VARIABLE-MAP-VAR"), makeSymbol("LINK"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym99$SUPPORTING_MAPPED_PROBLEM = makeUninternedSymbol("SUPPORTING-MAPPED-PROBLEM");

    public static final class $problem_link_p$UnaryFunction extends UnaryFunction {
        public $problem_link_p$UnaryFunction() {
            super(extractFunctionNamed("PROBLEM-LINK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_problem_link.problem_link_p(arg1);
        }
    }

    public static final class $sxhash_problem_link_method$UnaryFunction extends UnaryFunction {
        public $sxhash_problem_link_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-PROBLEM-LINK-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_problem_link.sxhash_problem_link_method(arg1);
        }
    }

    public static final class $mapped_problem_native extends SubLStructNative {
        public SubLObject $problem;

        public SubLObject $variable_map;

        private static final SubLStructDeclNative structDecl;

        public $mapped_problem_native() {
            this.$problem = Lisp.NIL;
            this.$variable_map = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$problem;
        }

        @Override
        public SubLObject getField3() {
            return this.$variable_map;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$problem = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$variable_map = value;
        }

        static {
            structDecl = makeStructDeclNative(inference_datastructures_problem_link.$mapped_problem_native.class, inference_datastructures_problem_link.MAPPED_PROBLEM, MAPPED_PROBLEM_P, inference_datastructures_problem_link.$list83, inference_datastructures_problem_link.$list84, new String[]{ "$problem", "$variable_map" }, inference_datastructures_problem_link.$list85, inference_datastructures_problem_link.$list86, inference_datastructures_problem_link.PRINT_MAPPED_PROBLEM);
        }
    }

    public static final class $mapped_problem_p$UnaryFunction extends UnaryFunction {
        public $mapped_problem_p$UnaryFunction() {
            super(extractFunctionNamed("MAPPED-PROBLEM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_problem_link.mapped_problem_p(arg1);
        }
    }

    public static final class $mapped_problem_equal$BinaryFunction extends BinaryFunction {
        public $mapped_problem_equal$BinaryFunction() {
            super(extractFunctionNamed("MAPPED-PROBLEM-EQUAL"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return inference_datastructures_problem_link.mapped_problem_equal(arg1, arg2);
        }
    }
}

/**
 * Total time: 410 ms
 */
