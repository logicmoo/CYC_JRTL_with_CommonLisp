package com.cyc.cycjava.cycl.cyc_testing;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.possibly_sentence_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
 public final class evaluatable_relation_tests extends SubLTranslatedFile {
    public static final SubLFile me = new evaluatable_relation_tests();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests";

    public static final String myFingerPrint = "24c6dcb3126cd8f1d8f2aa14b5332c829e5850b53b1f9b6ebfefd53442236cf0";

    // defconstant
    public static final SubLSymbol $dtp_evaluatable_relation_test$ = makeSymbol("*DTP-EVALUATABLE-RELATION-TEST*");



    // Internal Constants
    public static final SubLSymbol EVALUATABLE_RELATION_TEST = makeSymbol("EVALUATABLE-RELATION-TEST");

    public static final SubLSymbol EVALUATABLE_RELATION_TEST_P = makeSymbol("EVALUATABLE-RELATION-TEST-P");

    public static final SubLList $list2 = list(makeSymbol("RELATION"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("KB"), makeSymbol("OWNER"));

    public static final SubLList $list3 = list(makeKeyword("RELATION"), makeKeyword("ID"), makeKeyword("SENTENCE"), makeKeyword("KB"), makeKeyword("OWNER"));

    public static final SubLList $list4 = list(makeSymbol("ERT-RELATION"), makeSymbol("ERT-ID"), makeSymbol("ERT-SENTENCE"), makeSymbol("ERT-KB"), makeSymbol("ERT-OWNER"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-ERT-RELATION"), makeSymbol("_CSETF-ERT-ID"), makeSymbol("_CSETF-ERT-SENTENCE"), makeSymbol("_CSETF-ERT-KB"), makeSymbol("_CSETF-ERT-OWNER"));



    public static final SubLSymbol EVALUATABLE_RELATION_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EVALUATABLE-RELATION-TEST-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("EVALUATABLE-RELATION-TEST-P"));

    private static final SubLSymbol ERT_RELATION = makeSymbol("ERT-RELATION");

    private static final SubLSymbol _CSETF_ERT_RELATION = makeSymbol("_CSETF-ERT-RELATION");

    private static final SubLSymbol ERT_ID = makeSymbol("ERT-ID");

    private static final SubLSymbol _CSETF_ERT_ID = makeSymbol("_CSETF-ERT-ID");

    private static final SubLSymbol ERT_SENTENCE = makeSymbol("ERT-SENTENCE");

    private static final SubLSymbol _CSETF_ERT_SENTENCE = makeSymbol("_CSETF-ERT-SENTENCE");

    private static final SubLSymbol ERT_KB = makeSymbol("ERT-KB");

    private static final SubLSymbol _CSETF_ERT_KB = makeSymbol("_CSETF-ERT-KB");

    private static final SubLSymbol ERT_OWNER = makeSymbol("ERT-OWNER");

    private static final SubLSymbol _CSETF_ERT_OWNER = makeSymbol("_CSETF-ERT-OWNER");











    private static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_EVALUATABLE_RELATION_TEST = makeSymbol("MAKE-EVALUATABLE-RELATION-TEST");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_EVALUATABLE_RELATION_TEST_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-EVALUATABLE-RELATION-TEST-METHOD");

    private static final SubLSymbol $evaluatable_relation_tests$ = makeSymbol("*EVALUATABLE-RELATION-TESTS*");





    private static final SubLSymbol $sym33$_ = makeSymbol("<");

    private static final SubLString $str34$ = makeString("");

    private static final SubLSymbol $sym35$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    public static final SubLList $list36 = list(makeSymbol("FUNCTION"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("&KEY"), list(makeSymbol("KB"), makeKeyword("FULL")), makeSymbol("OWNER"));

    public static final SubLList $list37 = list(makeKeyword("KB"), makeKeyword("OWNER"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol DEFINE_EVALUATABLE_RELATION_TEST_INT = makeSymbol("DEFINE-EVALUATABLE-RELATION-TEST-INT");

    private static final SubLSymbol DEFINE_EVALUATABLE_FUNCTION_TEST = makeSymbol("DEFINE-EVALUATABLE-FUNCTION-TEST");

    private static final SubLList $list42 = list(makeSymbol("FUNCTION"), makeSymbol("ID"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list43 = list(makeSymbol("PREDICATE"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("&KEY"), list(makeSymbol("KB"), makeKeyword("FULL")), makeSymbol("OWNER"));

    private static final SubLSymbol DEFINE_EVALUATABLE_PREDICATE_TEST = makeSymbol("DEFINE-EVALUATABLE-PREDICATE-TEST");

    public static final SubLList $list45 = list(makeSymbol("PREDICATE"), makeSymbol("ID"), makeSymbol("&BODY"), makeSymbol("BODY"));







    private static final SubLSymbol INFERENCE_TEST_OWNER_P = makeSymbol("INFERENCE-TEST-OWNER-P");

    private static final SubLList $list50 = list(makeSymbol("FUNCTION"), makeSymbol("ID"), makeSymbol("EXPRESSION"), makeSymbol("&KEY"), list(makeSymbol("RESULT"), makeKeyword("DONT-CARE")), list(makeSymbol("KB"), makeKeyword("FULL")), makeSymbol("MT"), makeSymbol("OWNER"));

    public static final SubLList $list51 = list(makeKeyword("RESULT"), makeKeyword("KB"), makeKeyword("MT"), makeKeyword("OWNER"));







    private static final SubLSymbol DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_INT = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-INT");

    private static final SubLSymbol DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST");

    private static final SubLList $list57 = list(makeSymbol("FUNCTION"), makeSymbol("START-ID"), makeSymbol("&KEY"), list(makeSymbol("MT"), reader_make_constant_shell(makeString("InferencePSC"))), list(makeSymbol("KB"), makeKeyword("FULL")), makeSymbol("TESTS"), makeSymbol("OWNER"), list(makeSymbol("WORKING?"), T));

    public static final SubLList $list58 = list(makeKeyword("MT"), makeKeyword("KB"), makeKeyword("TESTS"), makeKeyword("OWNER"), makeKeyword("WORKING?"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));





    private static final SubLSymbol DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK_INT = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK-INT");

    private static final SubLSymbol DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK");

    private static final SubLList $list64 = list(makeSymbol("FUNCTION"), makeSymbol("START-ID"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLObject $$trueSubL = reader_make_constant_shell(makeString("trueSubL"));

    private static final SubLObject $$SubLQuoteFn = reader_make_constant_shell(makeString("SubLQuoteFn"));



    private static final SubLSymbol $sym69$EL_WFF_ = makeSymbol("EL-WFF?");



    private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));

    private static final SubLSymbol $sym72$_RESULT = makeSymbol("?RESULT");



    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    public static final SubLList $list77 = list(makeSymbol("EXPRESSION"), makeSymbol("&OPTIONAL"), list(makeSymbol("RESULT"), makeKeyword("DONT-CARE")));

    private static final SubLList $list78 = list(makeSymbol("PREDICATE"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("&KEY"), list(makeSymbol("RESULT"), makeKeyword("DONT-CARE")), makeSymbol("MT"), list(makeSymbol("KB"), makeKeyword("FULL")), makeSymbol("OWNER"));

    private static final SubLList $list79 = list(makeKeyword("RESULT"), makeKeyword("MT"), makeKeyword("KB"), makeKeyword("OWNER"));

    private static final SubLSymbol DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_INT = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-INT");

    private static final SubLSymbol DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST");

    private static final SubLList $list82 = list(makeSymbol("PREDICATE"), makeSymbol("START-ID"), makeSymbol("&KEY"), list(makeSymbol("MT"), reader_make_constant_shell(makeString("InferencePSC"))), list(makeSymbol("KB"), makeKeyword("FULL")), makeSymbol("OWNER"), makeSymbol("TESTS"));

    public static final SubLList $list83 = list(makeKeyword("MT"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("TESTS"));

    private static final SubLSymbol DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK_INT = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK-INT");

    private static final SubLSymbol DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK");

    private static final SubLList $list86 = list(makeSymbol("PREDICATE"), makeSymbol("START-ID"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));



    private static final SubLList $list89 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("RESULT"), makeKeyword("TRUE")));





    private static final SubLSymbol CYC_TEST_OUTPUT_FORMAT_P = makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");











    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");





    private static final SubLSymbol $kw102$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");



    private static final SubLSymbol $kw104$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLSymbol $kw105$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    private static final SubLString $str106$___ERT__S__S____ = makeString("~&:ERT ~S ~S -> ");



    private static final SubLString $str108$Unknown_output_format__A = makeString("Unknown output format ~A");

    private static final SubLString $str109$_ERT__S____3f___ = makeString(":ERT ~S (~,3f)~%");

    public static SubLObject evaluatable_relation_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject evaluatable_relation_test_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$evaluatable_relation_test_native.class ? T : NIL;
    }

    public static SubLObject ert_relation(final SubLObject v_object) {
        assert NIL != evaluatable_relation_test_p(v_object) : "evaluatable_relation_tests.evaluatable_relation_test_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject ert_id(final SubLObject v_object) {
        assert NIL != evaluatable_relation_test_p(v_object) : "evaluatable_relation_tests.evaluatable_relation_test_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject ert_sentence(final SubLObject v_object) {
        assert NIL != evaluatable_relation_test_p(v_object) : "evaluatable_relation_tests.evaluatable_relation_test_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject ert_kb(final SubLObject v_object) {
        assert NIL != evaluatable_relation_test_p(v_object) : "evaluatable_relation_tests.evaluatable_relation_test_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject ert_owner(final SubLObject v_object) {
        assert NIL != evaluatable_relation_test_p(v_object) : "evaluatable_relation_tests.evaluatable_relation_test_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_ert_relation(final SubLObject v_object, final SubLObject value) {
        assert NIL != evaluatable_relation_test_p(v_object) : "evaluatable_relation_tests.evaluatable_relation_test_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ert_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != evaluatable_relation_test_p(v_object) : "evaluatable_relation_tests.evaluatable_relation_test_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ert_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != evaluatable_relation_test_p(v_object) : "evaluatable_relation_tests.evaluatable_relation_test_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ert_kb(final SubLObject v_object, final SubLObject value) {
        assert NIL != evaluatable_relation_test_p(v_object) : "evaluatable_relation_tests.evaluatable_relation_test_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ert_owner(final SubLObject v_object, final SubLObject value) {
        assert NIL != evaluatable_relation_test_p(v_object) : "evaluatable_relation_tests.evaluatable_relation_test_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_evaluatable_relation_test(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $evaluatable_relation_test_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($RELATION)) {
                _csetf_ert_relation(v_new, current_value);
            } else
                if (pcase_var.eql($ID)) {
                    _csetf_ert_id(v_new, current_value);
                } else
                    if (pcase_var.eql($SENTENCE)) {
                        _csetf_ert_sentence(v_new, current_value);
                    } else
                        if (pcase_var.eql($KB)) {
                            _csetf_ert_kb(v_new, current_value);
                        } else
                            if (pcase_var.eql($OWNER)) {
                                _csetf_ert_owner(v_new, current_value);
                            } else {
                                Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_evaluatable_relation_test(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_EVALUATABLE_RELATION_TEST, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $RELATION, ert_relation(obj));
        funcall(visitor_fn, obj, $SLOT, $ID, ert_id(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE, ert_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $KB, ert_kb(obj));
        funcall(visitor_fn, obj, $SLOT, $OWNER, ert_owner(obj));
        funcall(visitor_fn, obj, $END, MAKE_EVALUATABLE_RELATION_TEST, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_evaluatable_relation_test_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_evaluatable_relation_test(obj, visitor_fn);
    }

    public static SubLObject clear_evaluatable_relation_tests() {
        clrhash($evaluatable_relation_tests$.getGlobalValue());
        return NIL;
    }

    public static SubLObject evaluatable_relations_with_evaluatable_relation_tests() {
        SubLObject relations = hash_table_utilities.hash_table_keys($evaluatable_relation_tests$.getGlobalValue());
        relations = kb_utilities.sort_terms(relations, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return relations;
    }

    public static SubLObject evaluatable_relation_tests(final SubLObject relation) {
        assert NIL != forts.fort_p(relation) : "forts.fort_p(relation) " + "CommonSymbols.NIL != forts.fort_p(relation) " + relation;
        SubLObject tests = copy_list(gethash(relation, $evaluatable_relation_tests$.getGlobalValue(), UNPROVIDED));
        tests = Sort.sort(tests, symbol_function($sym33$_), symbol_function(ERT_ID));
        return tests;
    }

    public static SubLObject some_evaluatable_relation_testsP(final SubLObject relation) {
        assert NIL != forts.fort_p(relation) : "forts.fort_p(relation) " + "CommonSymbols.NIL != forts.fort_p(relation) " + relation;
        return list_utilities.sublisp_boolean(gethash(relation, $evaluatable_relation_tests$.getGlobalValue(), UNPROVIDED));
    }

    public static SubLObject evaluatable_relation_test_name(final SubLObject ert) {
        return list(ert_relation(ert), ert_id(ert));
    }

    public static SubLObject evaluatable_relation_test_id(final SubLObject ert) {
        return ert_id(ert);
    }

    public static SubLObject evaluatable_relation_test_owner(final SubLObject ert) {
        return ert_owner(ert);
    }

    public static SubLObject evaluatable_relation_test_comment(final SubLObject ert) {
        return $str34$;
    }

    public static SubLObject evaluatable_relation_test_relation(final SubLObject ert) {
        return ert_relation(ert);
    }

    public static SubLObject evaluatable_relation_test_sentence(final SubLObject ert) {
        return ert_sentence(ert);
    }

    public static SubLObject evaluatable_relation_test_kb(final SubLObject ert) {
        return ert_kb(ert);
    }

    public static SubLObject evaluatable_relation_test_workingP(final SubLObject ert) {
        return T;
    }

    public static SubLObject evaluatable_relation_test_mentions_invalid_constantP(final SubLObject ert) {
        return makeBoolean((NIL != list_utilities.tree_find_if($sym35$INVALID_CONSTANT_, evaluatable_relation_test_relation(ert), UNPROVIDED)) || (NIL != list_utilities.tree_find_if($sym35$INVALID_CONSTANT_, evaluatable_relation_test_sentence(ert), UNPROVIDED)));
    }

    public static SubLObject evaluatable_relation_test_invalid_constants(final SubLObject ert) {
        return remove_duplicates(append(cycl_utilities.expression_gather(evaluatable_relation_test_relation(ert), $sym35$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), cycl_utilities.expression_gather(evaluatable_relation_test_sentence(ert), $sym35$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject evaluatable_relation_test_count(final SubLObject relation) {
        return length(gethash(relation, $evaluatable_relation_tests$.getGlobalValue(), UNPROVIDED));
    }

    public static SubLObject total_evaluatable_relation_test_count() {
        SubLObject total = ZERO_INTEGER;
        SubLObject relation = NIL;
        SubLObject tests = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($evaluatable_relation_tests$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                relation = getEntryKey(cdohash_entry);
                tests = getEntryValue(cdohash_entry);
                total = add(total, length(tests));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }

    public static SubLObject define_evaluatable_function_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = NIL;
        SubLObject id = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        sentence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list36);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list36);
            if (NIL == member(current_$1, $list37, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list36);
        }
        final SubLObject kb_tail = property_list_member($KB, current);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : $FULL;
        final SubLObject owner_tail = property_list_member($OWNER, current);
        final SubLObject owner = (NIL != owner_tail) ? cadr(owner_tail) : NIL;
        return list(DEFINE_EVALUATABLE_RELATION_TEST_INT, function, id, sentence, kb, owner);
    }

    public static SubLObject define_evaluatable_predicate_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = NIL;
        SubLObject id = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list43);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        sentence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list43);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list43);
            if (NIL == member(current_$2, $list37, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list43);
        }
        final SubLObject kb_tail = property_list_member($KB, current);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : $FULL;
        final SubLObject owner_tail = property_list_member($OWNER, current);
        final SubLObject owner = (NIL != owner_tail) ? cadr(owner_tail) : NIL;
        return list(DEFINE_EVALUATABLE_RELATION_TEST_INT, predicate, id, sentence, kb, owner);
    }

    public static SubLObject define_evaluatable_relation_test_int(final SubLObject relation, final SubLObject id, final SubLObject sentence, final SubLObject kb, final SubLObject owner) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(relation) : "forts.fort_p(relation) " + "CommonSymbols.NIL != forts.fort_p(relation) " + relation;
        assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
        assert NIL != possibly_sentence_p(sentence) : "el_utilities.possibly_sentence_p(sentence) " + "CommonSymbols.NIL != el_utilities.possibly_sentence_p(sentence) " + sentence;
        assert NIL != cyc_testing.cyc_test_kb_p(kb) : "cyc_testing.cyc_test_kb_p(kb) " + "CommonSymbols.NIL != cyc_testing.cyc_test_kb_p(kb) " + kb;
        assert NIL != inference_testing.inference_test_owner_p(owner) : "inference_testing.inference_test_owner_p(owner) " + "CommonSymbols.NIL != inference_testing.inference_test_owner_p(owner) " + owner;
        final SubLObject test = make_evaluatable_relation_test(list(new SubLObject[]{ $RELATION, relation, $ID, id, $SENTENCE, sentence, $KB, kb, $OWNER, owner }));
        SubLObject existing_tests = gethash(relation, $evaluatable_relation_tests$.getGlobalValue(), UNPROVIDED);
        existing_tests = delete(id, existing_tests, symbol_function(EQL), symbol_function(ERT_ID), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        existing_tests = cons(test, existing_tests);
        sethash(relation, $evaluatable_relation_tests$.getGlobalValue(), existing_tests);
        cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), test);
        return test;
    }

    public static SubLObject define_simple_evaluatable_function_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = NIL;
        SubLObject id = NIL;
        SubLObject expression = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        expression = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list50);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list50);
            if (NIL == member(current_$3, $list51, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list50);
        }
        final SubLObject result_tail = property_list_member($RESULT, current);
        final SubLObject result = (NIL != result_tail) ? cadr(result_tail) : $DONT_CARE;
        final SubLObject kb_tail = property_list_member($KB, current);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : $FULL;
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : NIL;
        final SubLObject owner_tail = property_list_member($OWNER, current);
        final SubLObject owner = (NIL != owner_tail) ? cadr(owner_tail) : NIL;
        return list(DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_INT, function, id, mt, result, expression, kb, owner);
    }

    public static SubLObject define_simple_evaluatable_function_test_block(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = NIL;
        SubLObject start_id = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        start_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list57);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list57);
            if (NIL == member(current_$4, $list58, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list57);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : $$InferencePSC;
        final SubLObject kb_tail = property_list_member($KB, current);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : $FULL;
        final SubLObject tests_tail = property_list_member($TESTS, current);
        final SubLObject tests = (NIL != tests_tail) ? cadr(tests_tail) : NIL;
        final SubLObject owner_tail = property_list_member($OWNER, current);
        final SubLObject owner = (NIL != owner_tail) ? cadr(owner_tail) : NIL;
        final SubLObject workingP_tail = property_list_member($WORKING_, current);
        final SubLObject workingP = (NIL != workingP_tail) ? cadr(workingP_tail) : T;
        return list(DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK_INT, function, start_id, mt, tests, workingP, kb, owner);
    }

    public static SubLObject define_simple_evaluatable_function_test_int(final SubLObject function, final SubLObject id, final SubLObject mt, final SubLObject result, final SubLObject expression, final SubLObject kb, final SubLObject owner) {
        SubLObject sentence = NIL;
        if (result.eql($ILL_FORMED)) {
            sentence = list($$trueSubL, list($$SubLQuoteFn, list(CNOT, list($sym69$EL_WFF_, list(QUOTE, list($$evaluate, $sym72$_RESULT, expression)), list(QUOTE, mt)))));
        } else
            if (result.eql($UNEVALUATABLE)) {
                sentence = list($$unknownSentence, list($$thereExists, $sym72$_RESULT, list($$evaluate, $sym72$_RESULT, expression)));
            } else
                if (result.eql($DONT_CARE)) {
                    sentence = list($$evaluate, $sym72$_RESULT, expression);
                } else {
                    sentence = list($$evaluate, result, expression);
                }


        if (NIL != mt) {
            sentence = list($$ist, mt, sentence);
        }
        return define_evaluatable_relation_test_int(function, id, sentence, kb, owner);
    }

    public static SubLObject define_simple_evaluatable_function_test_block_int(final SubLObject function, final SubLObject start_id, final SubLObject mt, final SubLObject test_specs, final SubLObject workingP, final SubLObject kb, final SubLObject owner) {
        assert NIL != forts.fort_p(function) : "forts.fort_p(function) " + "CommonSymbols.NIL != forts.fort_p(function) " + function;
        assert NIL != integerp(start_id) : "Types.integerp(start_id) " + "CommonSymbols.NIL != Types.integerp(start_id) " + start_id;
        if (NIL != workingP) {
            SubLObject list_var = NIL;
            SubLObject test_spec = NIL;
            SubLObject id_offset = NIL;
            list_var = test_specs;
            test_spec = list_var.first();
            for (id_offset = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , test_spec = list_var.first() , id_offset = add(ONE_INTEGER, id_offset)) {
                final SubLObject id = add(start_id, id_offset);
                SubLObject current;
                final SubLObject datum = current = test_spec;
                SubLObject expression = NIL;
                destructuring_bind_must_consp(current, datum, $list77);
                expression = current.first();
                current = current.rest();
                final SubLObject result = (current.isCons()) ? current.first() : $DONT_CARE;
                destructuring_bind_must_listp(current, datum, $list77);
                current = current.rest();
                if (NIL == current) {
                    define_simple_evaluatable_function_test_int(function, id, mt, result, expression, kb, owner);
                } else {
                    cdestructuring_bind_error(datum, $list77);
                }
            }
        }
        return NIL;
    }

    public static SubLObject define_simple_evaluatable_predicate_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = NIL;
        SubLObject id = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list78);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        sentence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list78);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list78);
            if (NIL == member(current_$5, $list79, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list78);
        }
        final SubLObject result_tail = property_list_member($RESULT, current);
        final SubLObject result = (NIL != result_tail) ? cadr(result_tail) : $DONT_CARE;
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : NIL;
        final SubLObject kb_tail = property_list_member($KB, current);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : $FULL;
        final SubLObject owner_tail = property_list_member($OWNER, current);
        final SubLObject owner = (NIL != owner_tail) ? cadr(owner_tail) : NIL;
        return list(DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_INT, predicate, id, mt, result, sentence, kb, owner);
    }

    public static SubLObject define_simple_evaluatable_predicate_test_block(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = NIL;
        SubLObject start_id = NIL;
        destructuring_bind_must_consp(current, datum, $list82);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list82);
        start_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list82);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list82);
            if (NIL == member(current_$6, $list83, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list82);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : $$InferencePSC;
        final SubLObject kb_tail = property_list_member($KB, current);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : $FULL;
        final SubLObject owner_tail = property_list_member($OWNER, current);
        final SubLObject owner = (NIL != owner_tail) ? cadr(owner_tail) : NIL;
        final SubLObject tests_tail = property_list_member($TESTS, current);
        final SubLObject tests = (NIL != tests_tail) ? cadr(tests_tail) : NIL;
        return list(DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK_INT, predicate, start_id, mt, kb, owner, tests);
    }

    public static SubLObject define_simple_evaluatable_predicate_test_int(final SubLObject predicate, final SubLObject id, final SubLObject mt, final SubLObject result, SubLObject sentence, final SubLObject kb, final SubLObject owner) {
        SubLObject query_sentence = NIL;
        if (result.eql($ILL_FORMED)) {
            sentence = list($$trueSubL, list($$SubLQuoteFn, list(CNOT, list($sym69$EL_WFF_, list(QUOTE, sentence), list(QUOTE, mt)))));
        } else
            if (result.eql($UNEVALUATABLE)) {
                query_sentence = list($$and, list($$unknownSentence, sentence), list($$unknownSentence, cycl_utilities.negate(sentence)));
            } else
                if (result.eql($FALSE)) {
                    query_sentence = cycl_utilities.negate(sentence);
                } else {
                    query_sentence = sentence;
                }


        if (NIL != mt) {
            query_sentence = list($$ist, mt, query_sentence);
        }
        return define_evaluatable_relation_test_int(predicate, id, query_sentence, kb, owner);
    }

    public static SubLObject define_simple_evaluatable_predicate_test_block_int(final SubLObject predicate, final SubLObject start_id, final SubLObject mt, final SubLObject kb, final SubLObject owner, final SubLObject test_specs) {
        assert NIL != forts.fort_p(predicate) : "forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) " + predicate;
        assert NIL != integerp(start_id) : "Types.integerp(start_id) " + "CommonSymbols.NIL != Types.integerp(start_id) " + start_id;
        SubLObject list_var = NIL;
        SubLObject test_spec = NIL;
        SubLObject id_offset = NIL;
        list_var = test_specs;
        test_spec = list_var.first();
        for (id_offset = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , test_spec = list_var.first() , id_offset = add(ONE_INTEGER, id_offset)) {
            final SubLObject id = add(start_id, id_offset);
            SubLObject current;
            final SubLObject datum = current = test_spec;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list89);
            sentence = current.first();
            current = current.rest();
            final SubLObject result = (current.isCons()) ? current.first() : $TRUE;
            destructuring_bind_must_listp(current, datum, $list89);
            current = current.rest();
            if (NIL == current) {
                define_simple_evaluatable_predicate_test_int(predicate, id, mt, result, sentence, kb, owner);
            } else {
                cdestructuring_bind_error(datum, $list89);
            }
        }
        return NIL;
    }

    public static SubLObject run_all_evaluatable_relation_tests(SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        return cyc_testing.run_all_loaded_cyc_tests(stream, $TERSE, NIL, output_format, run_tiny_kb_tests_in_full_kbP, NIL, return_test_runsP, $ERT, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject run_evaluatable_relation_tests(final SubLObject relation, SubLObject output_format, SubLObject stream, SubLObject browsableP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        assert NIL != forts.fort_p(relation) : "forts.fort_p(relation) " + "CommonSymbols.NIL != forts.fort_p(relation) " + relation;
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        SubLObject test_runs = NIL;
        SubLObject cdolist_list_var = evaluatable_relation_tests(relation);
        SubLObject ert = NIL;
        ert = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject test_run = run_evaluatable_relation_test(ert, output_format, stream, browsableP);
            test_runs = cons(test_run, test_runs);
            cdolist_list_var = cdolist_list_var.rest();
            ert = cdolist_list_var.first();
        } 
        return test_runs;
    }

    public static SubLObject run_evaluatable_relation_test_number(final SubLObject relation, final SubLObject id, SubLObject output_format, SubLObject stream, SubLObject browsableP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        assert NIL != forts.fort_p(relation) : "forts.fort_p(relation) " + "CommonSymbols.NIL != forts.fort_p(relation) " + relation;
        assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
        SubLObject cdolist_list_var = evaluatable_relation_tests(relation);
        SubLObject ert = NIL;
        ert = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (id.numE(ert_id(ert))) {
                return run_evaluatable_relation_test(ert, output_format, stream, browsableP);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ert = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject run_evaluatable_relation_test_number_browsable(final SubLObject relation, final SubLObject id, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_evaluatable_relation_test_number(relation, id, output_format, stream, T);
    }

    public static SubLObject run_evaluatable_relation_test(final SubLObject ert, SubLObject output_format, SubLObject stream, SubLObject browsableP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != evaluatable_relation_test_p(ert) : "evaluatable_relation_tests.evaluatable_relation_test_p(ert) " + "CommonSymbols.NIL != evaluatable_relation_tests.evaluatable_relation_test_p(ert) " + ert;
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        final SubLObject name = evaluatable_relation_test_name(ert);
        SubLObject time = NIL;
        SubLObject result = NIL;
        if (NIL == run_evaluatable_relation_testP(ert)) {
            result = $NOT_RUN;
        } else
            if (NIL != evaluatable_relation_test_mentions_invalid_constantP(ert)) {
                result = $INVALID;
            } else {
                final SubLObject sentence = ert_sentence(ert);
                final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                try {
                    $print_pretty$.bind(NIL, thread);
                    print_evaluatable_relation_test_preamble(ert, output_format, stream);
                    thread.resetMultipleValues();
                    final SubLObject result_$7 = run_evaluatable_relation_test_query(sentence, browsableP);
                    final SubLObject time_$8 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$7;
                    time = time_$8;
                    print_evaluatable_relation_test_result(ert, result, time, output_format, stream);
                } finally {
                    $print_pretty$.rebind(_prev_bind_0, thread);
                }
            }

        final SubLObject test_run = cyc_testing.new_cyc_test_run($ERT, name, result, time);
        return test_run;
    }

    public static SubLObject run_evaluatable_relation_testP(final SubLObject ert) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_kb = ert_kb(ert);
        if (NIL == inference_testing.kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject run_evaluatable_relation_test_query(final SubLObject sentence, final SubLObject browsableP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = $ERROR;
        SubLObject time = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject result = evaluatable_relation_test_query_inference(sentence, $$InferencePSC);
                    final SubLObject inference = thread.secondMultipleValue();
                    final SubLObject inference_time = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    time = inference_time;
                    if (NIL == result) {
                        v_answer = $FAILURE;
                    } else {
                        v_answer = $SUCCESS;
                    }
                    if (NIL == browsableP) {
                        inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return values(v_answer, time);
    }

    public static SubLObject evaluatable_relation_test_query_inference(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence_$9 = czer_utilities.unwrap_if_ist(sentence, mt, UNPROVIDED);
        final SubLObject mt_$10 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$9;
        mt = mt_$10;
        final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p(sentence);
        final SubLObject v_properties = list($kw102$CACHE_INFERENCE_RESULTS_, NIL, $BROWSABLE_, T, $kw104$CONDITIONAL_SENTENCE_, conditionalP, $kw105$NEW_TERMS_ALLOWED_, T);
        SubLObject time = NIL;
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        final SubLObject time_var = get_internal_real_time();
        thread.resetMultipleValues();
        final SubLObject result_$11 = inference_kernel.new_cyc_query(sentence, mt, v_properties);
        final SubLObject halt_reason_$12 = thread.secondMultipleValue();
        final SubLObject inference_$13 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        result = result_$11;
        halt_reason = halt_reason_$12;
        inference = inference_$13;
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return values(result, inference, time);
    }

    public static SubLObject print_evaluatable_relation_test_preamble(final SubLObject ert, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql($STANDARD)) {
            final SubLObject relation = ert_relation(ert);
            final SubLObject id = ert_id(ert);
            format(stream, $str106$___ERT__S__S____, relation, id);
            force_output(stream);
        } else
            if (!output_format.eql($POST_BUILD)) {
                format(stream, $str108$Unknown_output_format__A, output_format);
            }

        return NIL;
    }

    public static SubLObject print_evaluatable_relation_test_result(final SubLObject ert, final SubLObject result, final SubLObject time, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql($STANDARD)) {
            format(stream, $str109$_ERT__S____3f___, result, time);
            force_output(stream);
        } else
            if (output_format.eql($POST_BUILD)) {
                final SubLObject relation = ert_relation(ert);
                final SubLObject id = ert_id(ert);
                final SubLObject owner = ert_owner(ert);
                cyc_testing.print_post_build_test_summary(stream, result, relation, id, time, owner);
            } else {
                format(stream, $str108$Unknown_output_format__A, output_format);
            }

        return NIL;
    }

    public static SubLObject declare_evaluatable_relation_tests_file() {
        declareFunction(me, "evaluatable_relation_test_print_function_trampoline", "EVALUATABLE-RELATION-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "evaluatable_relation_test_p", "EVALUATABLE-RELATION-TEST-P", 1, 0, false);
        new evaluatable_relation_tests.$evaluatable_relation_test_p$UnaryFunction();
        declareFunction(me, "ert_relation", "ERT-RELATION", 1, 0, false);
        declareFunction(me, "ert_id", "ERT-ID", 1, 0, false);
        new evaluatable_relation_tests.$ert_id$UnaryFunction();
        declareFunction(me, "ert_sentence", "ERT-SENTENCE", 1, 0, false);
        declareFunction(me, "ert_kb", "ERT-KB", 1, 0, false);
        declareFunction(me, "ert_owner", "ERT-OWNER", 1, 0, false);
        declareFunction(me, "_csetf_ert_relation", "_CSETF-ERT-RELATION", 2, 0, false);
        declareFunction(me, "_csetf_ert_id", "_CSETF-ERT-ID", 2, 0, false);
        declareFunction(me, "_csetf_ert_sentence", "_CSETF-ERT-SENTENCE", 2, 0, false);
        declareFunction(me, "_csetf_ert_kb", "_CSETF-ERT-KB", 2, 0, false);
        declareFunction(me, "_csetf_ert_owner", "_CSETF-ERT-OWNER", 2, 0, false);
        declareFunction(me, "make_evaluatable_relation_test", "MAKE-EVALUATABLE-RELATION-TEST", 0, 1, false);
        declareFunction(me, "visit_defstruct_evaluatable_relation_test", "VISIT-DEFSTRUCT-EVALUATABLE-RELATION-TEST", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_evaluatable_relation_test_method", "VISIT-DEFSTRUCT-OBJECT-EVALUATABLE-RELATION-TEST-METHOD", 2, 0, false);
        declareFunction(me, "clear_evaluatable_relation_tests", "CLEAR-EVALUATABLE-RELATION-TESTS", 0, 0, false);
        declareFunction(me, "evaluatable_relations_with_evaluatable_relation_tests", "EVALUATABLE-RELATIONS-WITH-EVALUATABLE-RELATION-TESTS", 0, 0, false);
        declareFunction(me, "evaluatable_relation_tests", "EVALUATABLE-RELATION-TESTS", 1, 0, false);
        declareFunction(me, "some_evaluatable_relation_testsP", "SOME-EVALUATABLE-RELATION-TESTS?", 1, 0, false);
        declareFunction(me, "evaluatable_relation_test_name", "EVALUATABLE-RELATION-TEST-NAME", 1, 0, false);
        declareFunction(me, "evaluatable_relation_test_id", "EVALUATABLE-RELATION-TEST-ID", 1, 0, false);
        declareFunction(me, "evaluatable_relation_test_owner", "EVALUATABLE-RELATION-TEST-OWNER", 1, 0, false);
        declareFunction(me, "evaluatable_relation_test_comment", "EVALUATABLE-RELATION-TEST-COMMENT", 1, 0, false);
        declareFunction(me, "evaluatable_relation_test_relation", "EVALUATABLE-RELATION-TEST-RELATION", 1, 0, false);
        declareFunction(me, "evaluatable_relation_test_sentence", "EVALUATABLE-RELATION-TEST-SENTENCE", 1, 0, false);
        declareFunction(me, "evaluatable_relation_test_kb", "EVALUATABLE-RELATION-TEST-KB", 1, 0, false);
        declareFunction(me, "evaluatable_relation_test_workingP", "EVALUATABLE-RELATION-TEST-WORKING?", 1, 0, false);
        declareFunction(me, "evaluatable_relation_test_mentions_invalid_constantP", "EVALUATABLE-RELATION-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        declareFunction(me, "evaluatable_relation_test_invalid_constants", "EVALUATABLE-RELATION-TEST-INVALID-CONSTANTS", 1, 0, false);
        declareFunction(me, "evaluatable_relation_test_count", "EVALUATABLE-RELATION-TEST-COUNT", 1, 0, false);
        declareFunction(me, "total_evaluatable_relation_test_count", "TOTAL-EVALUATABLE-RELATION-TEST-COUNT", 0, 0, false);
        declareMacro(me, "define_evaluatable_function_test", "DEFINE-EVALUATABLE-FUNCTION-TEST");
        declareMacro(me, "define_evaluatable_predicate_test", "DEFINE-EVALUATABLE-PREDICATE-TEST");
        declareFunction(me, "define_evaluatable_relation_test_int", "DEFINE-EVALUATABLE-RELATION-TEST-INT", 5, 0, false);
        declareMacro(me, "define_simple_evaluatable_function_test", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST");
        declareMacro(me, "define_simple_evaluatable_function_test_block", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK");
        declareFunction(me, "define_simple_evaluatable_function_test_int", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-INT", 7, 0, false);
        declareFunction(me, "define_simple_evaluatable_function_test_block_int", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK-INT", 7, 0, false);
        declareMacro(me, "define_simple_evaluatable_predicate_test", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST");
        declareMacro(me, "define_simple_evaluatable_predicate_test_block", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK");
        declareFunction(me, "define_simple_evaluatable_predicate_test_int", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-INT", 7, 0, false);
        declareFunction(me, "define_simple_evaluatable_predicate_test_block_int", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK-INT", 6, 0, false);
        declareFunction(me, "run_all_evaluatable_relation_tests", "RUN-ALL-EVALUATABLE-RELATION-TESTS", 0, 4, false);
        declareFunction(me, "run_evaluatable_relation_tests", "RUN-EVALUATABLE-RELATION-TESTS", 1, 3, false);
        declareFunction(me, "run_evaluatable_relation_test_number", "RUN-EVALUATABLE-RELATION-TEST-NUMBER", 2, 3, false);
        declareFunction(me, "run_evaluatable_relation_test_number_browsable", "RUN-EVALUATABLE-RELATION-TEST-NUMBER-BROWSABLE", 2, 2, false);
        declareFunction(me, "run_evaluatable_relation_test", "RUN-EVALUATABLE-RELATION-TEST", 1, 3, false);
        declareFunction(me, "run_evaluatable_relation_testP", "RUN-EVALUATABLE-RELATION-TEST?", 1, 0, false);
        declareFunction(me, "run_evaluatable_relation_test_query", "RUN-EVALUATABLE-RELATION-TEST-QUERY", 2, 0, false);
        declareFunction(me, "evaluatable_relation_test_query_inference", "EVALUATABLE-RELATION-TEST-QUERY-INFERENCE", 1, 1, false);
        declareFunction(me, "print_evaluatable_relation_test_preamble", "PRINT-EVALUATABLE-RELATION-TEST-PREAMBLE", 3, 0, false);
        declareFunction(me, "print_evaluatable_relation_test_result", "PRINT-EVALUATABLE-RELATION-TEST-RESULT", 5, 0, false);
        return NIL;
    }

    public static SubLObject init_evaluatable_relation_tests_file() {
        defconstant("*DTP-EVALUATABLE-RELATION-TEST*", EVALUATABLE_RELATION_TEST);
        deflexical("*EVALUATABLE-RELATION-TESTS*", SubLTrampolineFile.maybeDefault($evaluatable_relation_tests$, $evaluatable_relation_tests$, () -> make_hash_table($int$100, UNPROVIDED, UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_evaluatable_relation_tests_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_evaluatable_relation_test$.getGlobalValue(), symbol_function(EVALUATABLE_RELATION_TEST_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(ERT_RELATION, _CSETF_ERT_RELATION);
        def_csetf(ERT_ID, _CSETF_ERT_ID);
        def_csetf(ERT_SENTENCE, _CSETF_ERT_SENTENCE);
        def_csetf(ERT_KB, _CSETF_ERT_KB);
        def_csetf(ERT_OWNER, _CSETF_ERT_OWNER);
        identity(EVALUATABLE_RELATION_TEST);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_evaluatable_relation_test$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_EVALUATABLE_RELATION_TEST_METHOD));
        declare_defglobal($evaluatable_relation_tests$);
        meta_macros.declare_indention_pattern(DEFINE_EVALUATABLE_FUNCTION_TEST, $list42);
        meta_macros.declare_indention_pattern(DEFINE_EVALUATABLE_PREDICATE_TEST, $list45);
        meta_macros.declare_indention_pattern(DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST, $list42);
        meta_macros.declare_indention_pattern(DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK, $list64);
        register_macro_helper(DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_INT, DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST);
        register_macro_helper(DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK_INT, DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK);
        meta_macros.declare_indention_pattern(DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST, $list45);
        meta_macros.declare_indention_pattern(DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK, $list86);
        register_macro_helper(DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_INT, DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST);
        register_macro_helper(DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK_INT, DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_evaluatable_relation_tests_file();
    }

    @Override
    public void initializeVariables() {
        init_evaluatable_relation_tests_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_evaluatable_relation_tests_file();
    }

    

    public static final class $evaluatable_relation_test_native extends SubLStructNative {
        public SubLObject $relation;

        public SubLObject $id;

        public SubLObject $sentence;

        public SubLObject $kb;

        public SubLObject $owner;

        private static final SubLStructDeclNative structDecl;

        private $evaluatable_relation_test_native() {
            this.$relation = Lisp.NIL;
            this.$id = Lisp.NIL;
            this.$sentence = Lisp.NIL;
            this.$kb = Lisp.NIL;
            this.$owner = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$relation;
        }

        @Override
        public SubLObject getField3() {
            return this.$id;
        }

        @Override
        public SubLObject getField4() {
            return this.$sentence;
        }

        @Override
        public SubLObject getField5() {
            return this.$kb;
        }

        @Override
        public SubLObject getField6() {
            return this.$owner;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$relation = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$sentence = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$kb = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$owner = value;
        }

        static {
            structDecl = makeStructDeclNative($evaluatable_relation_test_native.class, EVALUATABLE_RELATION_TEST, EVALUATABLE_RELATION_TEST_P, $list2, $list3, new String[]{ "$relation", "$id", "$sentence", "$kb", "$owner" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $evaluatable_relation_test_p$UnaryFunction extends UnaryFunction {
        public $evaluatable_relation_test_p$UnaryFunction() {
            super(extractFunctionNamed("EVALUATABLE-RELATION-TEST-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return evaluatable_relation_test_p(arg1);
        }
    }

    public static final class $ert_id$UnaryFunction extends UnaryFunction {
        public $ert_id$UnaryFunction() {
            super(extractFunctionNamed("ERT-ID"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ert_id(arg1);
        }
    }
}

/**
 * Total time: 300 ms
 */
