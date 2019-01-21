package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class evaluatable_relation_tests extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests";
    public static final String myFingerPrint = "24c6dcb3126cd8f1d8f2aa14b5332c829e5850b53b1f9b6ebfefd53442236cf0";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLSymbol $dtp_evaluatable_relation_test$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2660L)
    private static SubLSymbol $evaluatable_relation_tests$;
    private static final SubLSymbol $sym0$EVALUATABLE_RELATION_TEST;
    private static final SubLSymbol $sym1$EVALUATABLE_RELATION_TEST_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$EVALUATABLE_RELATION_TEST_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$ERT_RELATION;
    private static final SubLSymbol $sym10$_CSETF_ERT_RELATION;
    private static final SubLSymbol $sym11$ERT_ID;
    private static final SubLSymbol $sym12$_CSETF_ERT_ID;
    private static final SubLSymbol $sym13$ERT_SENTENCE;
    private static final SubLSymbol $sym14$_CSETF_ERT_SENTENCE;
    private static final SubLSymbol $sym15$ERT_KB;
    private static final SubLSymbol $sym16$_CSETF_ERT_KB;
    private static final SubLSymbol $sym17$ERT_OWNER;
    private static final SubLSymbol $sym18$_CSETF_ERT_OWNER;
    private static final SubLSymbol $kw19$RELATION;
    private static final SubLSymbol $kw20$ID;
    private static final SubLSymbol $kw21$SENTENCE;
    private static final SubLSymbol $kw22$KB;
    private static final SubLSymbol $kw23$OWNER;
    private static final SubLString $str24$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw25$BEGIN;
    private static final SubLSymbol $sym26$MAKE_EVALUATABLE_RELATION_TEST;
    private static final SubLSymbol $kw27$SLOT;
    private static final SubLSymbol $kw28$END;
    private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_EVALUATABLE_RELATION_TEST_METHOD;
    private static final SubLSymbol $sym30$_EVALUATABLE_RELATION_TESTS_;
    private static final SubLInteger $int31$100;
    private static final SubLSymbol $sym32$FORT_P;
    private static final SubLSymbol $sym33$_;
    private static final SubLString $str34$;
    private static final SubLSymbol $sym35$INVALID_CONSTANT_;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $kw38$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw39$FULL;
    private static final SubLSymbol $sym40$DEFINE_EVALUATABLE_RELATION_TEST_INT;
    private static final SubLSymbol $sym41$DEFINE_EVALUATABLE_FUNCTION_TEST;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$DEFINE_EVALUATABLE_PREDICATE_TEST;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$INTEGERP;
    private static final SubLSymbol $sym47$POSSIBLY_SENTENCE_P;
    private static final SubLSymbol $sym48$CYC_TEST_KB_P;
    private static final SubLSymbol $sym49$INFERENCE_TEST_OWNER_P;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLSymbol $kw52$RESULT;
    private static final SubLSymbol $kw53$DONT_CARE;
    private static final SubLSymbol $kw54$MT;
    private static final SubLSymbol $sym55$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_INT;
    private static final SubLSymbol $sym56$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLObject $const59$InferencePSC;
    private static final SubLSymbol $kw60$TESTS;
    private static final SubLSymbol $kw61$WORKING_;
    private static final SubLSymbol $sym62$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK_INT;
    private static final SubLSymbol $sym63$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK;
    private static final SubLList $list64;
    private static final SubLSymbol $kw65$ILL_FORMED;
    private static final SubLObject $const66$trueSubL;
    private static final SubLObject $const67$SubLQuoteFn;
    private static final SubLSymbol $sym68$CNOT;
    private static final SubLSymbol $sym69$EL_WFF_;
    private static final SubLSymbol $sym70$QUOTE;
    private static final SubLObject $const71$evaluate;
    private static final SubLSymbol $sym72$_RESULT;
    private static final SubLSymbol $kw73$UNEVALUATABLE;
    private static final SubLObject $const74$unknownSentence;
    private static final SubLObject $const75$thereExists;
    private static final SubLObject $const76$ist;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_INT;
    private static final SubLSymbol $sym81$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST;
    private static final SubLList $list82;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK_INT;
    private static final SubLSymbol $sym85$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK;
    private static final SubLList $list86;
    private static final SubLObject $const87$and;
    private static final SubLSymbol $kw88$FALSE;
    private static final SubLList $list89;
    private static final SubLSymbol $kw90$TRUE;
    private static final SubLSymbol $kw91$STANDARD;
    private static final SubLSymbol $sym92$CYC_TEST_OUTPUT_FORMAT_P;
    private static final SubLSymbol $kw93$TERSE;
    private static final SubLSymbol $kw94$ERT;
    private static final SubLSymbol $kw95$NOT_RUN;
    private static final SubLSymbol $kw96$INVALID;
    private static final SubLSymbol $kw97$ERROR;
    private static final SubLSymbol $kw98$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym99$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw100$FAILURE;
    private static final SubLSymbol $kw101$SUCCESS;
    private static final SubLSymbol $kw102$CACHE_INFERENCE_RESULTS_;
    private static final SubLSymbol $kw103$BROWSABLE_;
    private static final SubLSymbol $kw104$CONDITIONAL_SENTENCE_;
    private static final SubLSymbol $kw105$NEW_TERMS_ALLOWED_;
    private static final SubLString $str106$___ERT__S__S____;
    private static final SubLSymbol $kw107$POST_BUILD;
    private static final SubLString $str108$Unknown_output_format__A;
    private static final SubLString $str109$_ERT__S____3f___;
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject evaluatable_relation_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)evaluatable_relation_tests.ZERO_INTEGER);
        return (SubLObject)evaluatable_relation_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject evaluatable_relation_test_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $evaluatable_relation_test_native.class) ? evaluatable_relation_tests.T : evaluatable_relation_tests.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject ert_relation(final SubLObject v_object) {
        assert evaluatable_relation_tests.NIL != evaluatable_relation_test_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject ert_id(final SubLObject v_object) {
        assert evaluatable_relation_tests.NIL != evaluatable_relation_test_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject ert_sentence(final SubLObject v_object) {
        assert evaluatable_relation_tests.NIL != evaluatable_relation_test_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject ert_kb(final SubLObject v_object) {
        assert evaluatable_relation_tests.NIL != evaluatable_relation_test_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject ert_owner(final SubLObject v_object) {
        assert evaluatable_relation_tests.NIL != evaluatable_relation_test_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject _csetf_ert_relation(final SubLObject v_object, final SubLObject value) {
        assert evaluatable_relation_tests.NIL != evaluatable_relation_test_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject _csetf_ert_id(final SubLObject v_object, final SubLObject value) {
        assert evaluatable_relation_tests.NIL != evaluatable_relation_test_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject _csetf_ert_sentence(final SubLObject v_object, final SubLObject value) {
        assert evaluatable_relation_tests.NIL != evaluatable_relation_test_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject _csetf_ert_kb(final SubLObject v_object, final SubLObject value) {
        assert evaluatable_relation_tests.NIL != evaluatable_relation_test_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject _csetf_ert_owner(final SubLObject v_object, final SubLObject value) {
        assert evaluatable_relation_tests.NIL != evaluatable_relation_test_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject make_evaluatable_relation_test(SubLObject arglist) {
        if (arglist == evaluatable_relation_tests.UNPROVIDED) {
            arglist = (SubLObject)evaluatable_relation_tests.NIL;
        }
        final SubLObject v_new = (SubLObject)new $evaluatable_relation_test_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)evaluatable_relation_tests.NIL, next = arglist; evaluatable_relation_tests.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)evaluatable_relation_tests.$kw19$RELATION)) {
                _csetf_ert_relation(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)evaluatable_relation_tests.$kw20$ID)) {
                _csetf_ert_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)evaluatable_relation_tests.$kw21$SENTENCE)) {
                _csetf_ert_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)evaluatable_relation_tests.$kw22$KB)) {
                _csetf_ert_kb(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)evaluatable_relation_tests.$kw23$OWNER)) {
                _csetf_ert_owner(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)evaluatable_relation_tests.$str24$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject visit_defstruct_evaluatable_relation_test(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)evaluatable_relation_tests.$kw25$BEGIN, (SubLObject)evaluatable_relation_tests.$sym26$MAKE_EVALUATABLE_RELATION_TEST, (SubLObject)evaluatable_relation_tests.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)evaluatable_relation_tests.$kw27$SLOT, (SubLObject)evaluatable_relation_tests.$kw19$RELATION, ert_relation(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)evaluatable_relation_tests.$kw27$SLOT, (SubLObject)evaluatable_relation_tests.$kw20$ID, ert_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)evaluatable_relation_tests.$kw27$SLOT, (SubLObject)evaluatable_relation_tests.$kw21$SENTENCE, ert_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)evaluatable_relation_tests.$kw27$SLOT, (SubLObject)evaluatable_relation_tests.$kw22$KB, ert_kb(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)evaluatable_relation_tests.$kw27$SLOT, (SubLObject)evaluatable_relation_tests.$kw23$OWNER, ert_owner(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)evaluatable_relation_tests.$kw28$END, (SubLObject)evaluatable_relation_tests.$sym26$MAKE_EVALUATABLE_RELATION_TEST, (SubLObject)evaluatable_relation_tests.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2410L)
    public static SubLObject visit_defstruct_object_evaluatable_relation_test_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_evaluatable_relation_test(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2740L)
    public static SubLObject clear_evaluatable_relation_tests() {
        Hashtables.clrhash(evaluatable_relation_tests.$evaluatable_relation_tests$.getGlobalValue());
        return (SubLObject)evaluatable_relation_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2846L)
    public static SubLObject evaluatable_relations_with_evaluatable_relation_tests() {
        SubLObject relations = hash_table_utilities.hash_table_keys(evaluatable_relation_tests.$evaluatable_relation_tests$.getGlobalValue());
        relations = kb_utilities.sort_terms(relations, (SubLObject)evaluatable_relation_tests.NIL, (SubLObject)evaluatable_relation_tests.NIL, (SubLObject)evaluatable_relation_tests.T, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED);
        return relations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 3159L)
    public static SubLObject evaluatable_relation_tests(final SubLObject relation) {
        assert evaluatable_relation_tests.NIL != forts.fort_p(relation) : relation;
        SubLObject tests = conses_high.copy_list(Hashtables.gethash(relation, evaluatable_relation_tests.$evaluatable_relation_tests$.getGlobalValue(), (SubLObject)evaluatable_relation_tests.UNPROVIDED));
        tests = Sort.sort(tests, Symbols.symbol_function((SubLObject)evaluatable_relation_tests.$sym33$_), Symbols.symbol_function((SubLObject)evaluatable_relation_tests.$sym11$ERT_ID));
        return tests;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 3462L)
    public static SubLObject some_evaluatable_relation_testsP(final SubLObject relation) {
        assert evaluatable_relation_tests.NIL != forts.fort_p(relation) : relation;
        return list_utilities.sublisp_boolean(Hashtables.gethash(relation, evaluatable_relation_tests.$evaluatable_relation_tests$.getGlobalValue(), (SubLObject)evaluatable_relation_tests.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 3695L)
    public static SubLObject evaluatable_relation_test_name(final SubLObject ert) {
        return (SubLObject)ConsesLow.list(ert_relation(ert), ert_id(ert));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 3799L)
    public static SubLObject evaluatable_relation_test_id(final SubLObject ert) {
        return ert_id(ert);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 3875L)
    public static SubLObject evaluatable_relation_test_owner(final SubLObject ert) {
        return ert_owner(ert);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 3957L)
    public static SubLObject evaluatable_relation_test_comment(final SubLObject ert) {
        return (SubLObject)evaluatable_relation_tests.$str34$;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 4067L)
    public static SubLObject evaluatable_relation_test_relation(final SubLObject ert) {
        return ert_relation(ert);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 4155L)
    public static SubLObject evaluatable_relation_test_sentence(final SubLObject ert) {
        return ert_sentence(ert);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 4243L)
    public static SubLObject evaluatable_relation_test_kb(final SubLObject ert) {
        return ert_kb(ert);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 4319L)
    public static SubLObject evaluatable_relation_test_workingP(final SubLObject ert) {
        return (SubLObject)evaluatable_relation_tests.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 4430L)
    public static SubLObject evaluatable_relation_test_mentions_invalid_constantP(final SubLObject ert) {
        return (SubLObject)SubLObjectFactory.makeBoolean(evaluatable_relation_tests.NIL != list_utilities.tree_find_if((SubLObject)evaluatable_relation_tests.$sym35$INVALID_CONSTANT_, evaluatable_relation_test_relation(ert), (SubLObject)evaluatable_relation_tests.UNPROVIDED) || evaluatable_relation_tests.NIL != list_utilities.tree_find_if((SubLObject)evaluatable_relation_tests.$sym35$INVALID_CONSTANT_, evaluatable_relation_test_sentence(ert), (SubLObject)evaluatable_relation_tests.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 4678L)
    public static SubLObject evaluatable_relation_test_invalid_constants(final SubLObject ert) {
        return Sequences.remove_duplicates(ConsesLow.append(cycl_utilities.expression_gather(evaluatable_relation_test_relation(ert), (SubLObject)evaluatable_relation_tests.$sym35$INVALID_CONSTANT_, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED), cycl_utilities.expression_gather(evaluatable_relation_test_sentence(ert), (SubLObject)evaluatable_relation_tests.$sym35$INVALID_CONSTANT_, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED)), (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 4951L)
    public static SubLObject evaluatable_relation_test_count(final SubLObject relation) {
        return Sequences.length(Hashtables.gethash(relation, evaluatable_relation_tests.$evaluatable_relation_tests$.getGlobalValue(), (SubLObject)evaluatable_relation_tests.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 5153L)
    public static SubLObject total_evaluatable_relation_test_count() {
        SubLObject total = (SubLObject)evaluatable_relation_tests.ZERO_INTEGER;
        SubLObject relation = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject tests = (SubLObject)evaluatable_relation_tests.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(evaluatable_relation_tests.$evaluatable_relation_tests$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                relation = Hashtables.getEntryKey(cdohash_entry);
                tests = Hashtables.getEntryValue(cdohash_entry);
                total = Numbers.add(total, Sequences.length(tests));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 5425L)
    public static SubLObject define_evaluatable_function_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject id = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject sentence = (SubLObject)evaluatable_relation_tests.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list36);
        function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list36);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list36);
        sentence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject current_$1 = (SubLObject)evaluatable_relation_tests.NIL;
        while (evaluatable_relation_tests.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluatable_relation_tests.$list36);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluatable_relation_tests.$list36);
            if (evaluatable_relation_tests.NIL == conses_high.member(current_$1, (SubLObject)evaluatable_relation_tests.$list37, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED)) {
                bad = (SubLObject)evaluatable_relation_tests.T;
            }
            if (current_$1 == evaluatable_relation_tests.$kw38$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (evaluatable_relation_tests.NIL != bad && evaluatable_relation_tests.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)evaluatable_relation_tests.$list36);
        }
        final SubLObject kb_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw22$KB, current);
        final SubLObject kb = (SubLObject)((evaluatable_relation_tests.NIL != kb_tail) ? conses_high.cadr(kb_tail) : evaluatable_relation_tests.$kw39$FULL);
        final SubLObject owner_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw23$OWNER, current);
        final SubLObject owner = (SubLObject)((evaluatable_relation_tests.NIL != owner_tail) ? conses_high.cadr(owner_tail) : evaluatable_relation_tests.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$sym40$DEFINE_EVALUATABLE_RELATION_TEST_INT, function, id, sentence, kb, owner);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 5960L)
    public static SubLObject define_evaluatable_predicate_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject id = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject sentence = (SubLObject)evaluatable_relation_tests.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list43);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list43);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list43);
        sentence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject current_$2 = (SubLObject)evaluatable_relation_tests.NIL;
        while (evaluatable_relation_tests.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluatable_relation_tests.$list43);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluatable_relation_tests.$list43);
            if (evaluatable_relation_tests.NIL == conses_high.member(current_$2, (SubLObject)evaluatable_relation_tests.$list37, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED)) {
                bad = (SubLObject)evaluatable_relation_tests.T;
            }
            if (current_$2 == evaluatable_relation_tests.$kw38$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (evaluatable_relation_tests.NIL != bad && evaluatable_relation_tests.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)evaluatable_relation_tests.$list43);
        }
        final SubLObject kb_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw22$KB, current);
        final SubLObject kb = (SubLObject)((evaluatable_relation_tests.NIL != kb_tail) ? conses_high.cadr(kb_tail) : evaluatable_relation_tests.$kw39$FULL);
        final SubLObject owner_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw23$OWNER, current);
        final SubLObject owner = (SubLObject)((evaluatable_relation_tests.NIL != owner_tail) ? conses_high.cadr(owner_tail) : evaluatable_relation_tests.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$sym40$DEFINE_EVALUATABLE_RELATION_TEST_INT, predicate, id, sentence, kb, owner);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 6411L)
    public static SubLObject define_evaluatable_relation_test_int(final SubLObject relation, final SubLObject id, final SubLObject sentence, final SubLObject kb, final SubLObject owner) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert evaluatable_relation_tests.NIL != forts.fort_p(relation) : relation;
        assert evaluatable_relation_tests.NIL != Types.integerp(id) : id;
        assert evaluatable_relation_tests.NIL != el_utilities.possibly_sentence_p(sentence) : sentence;
        assert evaluatable_relation_tests.NIL != cyc_testing.cyc_test_kb_p(kb) : kb;
        assert evaluatable_relation_tests.NIL != inference_testing.inference_test_owner_p(owner) : owner;
        final SubLObject test = make_evaluatable_relation_test((SubLObject)ConsesLow.list(new SubLObject[] { evaluatable_relation_tests.$kw19$RELATION, relation, evaluatable_relation_tests.$kw20$ID, id, evaluatable_relation_tests.$kw21$SENTENCE, sentence, evaluatable_relation_tests.$kw22$KB, kb, evaluatable_relation_tests.$kw23$OWNER, owner }));
        SubLObject existing_tests = Hashtables.gethash(relation, evaluatable_relation_tests.$evaluatable_relation_tests$.getGlobalValue(), (SubLObject)evaluatable_relation_tests.UNPROVIDED);
        existing_tests = Sequences.delete(id, existing_tests, Symbols.symbol_function((SubLObject)evaluatable_relation_tests.EQL), Symbols.symbol_function((SubLObject)evaluatable_relation_tests.$sym11$ERT_ID), (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED);
        existing_tests = (SubLObject)ConsesLow.cons(test, existing_tests);
        Hashtables.sethash(relation, evaluatable_relation_tests.$evaluatable_relation_tests$.getGlobalValue(), existing_tests);
        cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), test);
        return test;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 7307L)
    public static SubLObject define_simple_evaluatable_function_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject id = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject expression = (SubLObject)evaluatable_relation_tests.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list50);
        function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list50);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list50);
        expression = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject current_$3 = (SubLObject)evaluatable_relation_tests.NIL;
        while (evaluatable_relation_tests.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluatable_relation_tests.$list50);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluatable_relation_tests.$list50);
            if (evaluatable_relation_tests.NIL == conses_high.member(current_$3, (SubLObject)evaluatable_relation_tests.$list51, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED)) {
                bad = (SubLObject)evaluatable_relation_tests.T;
            }
            if (current_$3 == evaluatable_relation_tests.$kw38$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (evaluatable_relation_tests.NIL != bad && evaluatable_relation_tests.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)evaluatable_relation_tests.$list50);
        }
        final SubLObject result_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw52$RESULT, current);
        final SubLObject result = (SubLObject)((evaluatable_relation_tests.NIL != result_tail) ? conses_high.cadr(result_tail) : evaluatable_relation_tests.$kw53$DONT_CARE);
        final SubLObject kb_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw22$KB, current);
        final SubLObject kb = (SubLObject)((evaluatable_relation_tests.NIL != kb_tail) ? conses_high.cadr(kb_tail) : evaluatable_relation_tests.$kw39$FULL);
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw54$MT, current);
        final SubLObject mt = (SubLObject)((evaluatable_relation_tests.NIL != mt_tail) ? conses_high.cadr(mt_tail) : evaluatable_relation_tests.NIL);
        final SubLObject owner_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw23$OWNER, current);
        final SubLObject owner = (SubLObject)((evaluatable_relation_tests.NIL != owner_tail) ? conses_high.cadr(owner_tail) : evaluatable_relation_tests.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$sym55$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_INT, function, id, mt, result, expression, kb, owner);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 8216L)
    public static SubLObject define_simple_evaluatable_function_test_block(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject start_id = (SubLObject)evaluatable_relation_tests.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list57);
        function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list57);
        start_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject current_$4 = (SubLObject)evaluatable_relation_tests.NIL;
        while (evaluatable_relation_tests.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluatable_relation_tests.$list57);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluatable_relation_tests.$list57);
            if (evaluatable_relation_tests.NIL == conses_high.member(current_$4, (SubLObject)evaluatable_relation_tests.$list58, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED)) {
                bad = (SubLObject)evaluatable_relation_tests.T;
            }
            if (current_$4 == evaluatable_relation_tests.$kw38$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (evaluatable_relation_tests.NIL != bad && evaluatable_relation_tests.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)evaluatable_relation_tests.$list57);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw54$MT, current);
        final SubLObject mt = (evaluatable_relation_tests.NIL != mt_tail) ? conses_high.cadr(mt_tail) : evaluatable_relation_tests.$const59$InferencePSC;
        final SubLObject kb_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw22$KB, current);
        final SubLObject kb = (SubLObject)((evaluatable_relation_tests.NIL != kb_tail) ? conses_high.cadr(kb_tail) : evaluatable_relation_tests.$kw39$FULL);
        final SubLObject tests_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw60$TESTS, current);
        final SubLObject tests = (SubLObject)((evaluatable_relation_tests.NIL != tests_tail) ? conses_high.cadr(tests_tail) : evaluatable_relation_tests.NIL);
        final SubLObject owner_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw23$OWNER, current);
        final SubLObject owner = (SubLObject)((evaluatable_relation_tests.NIL != owner_tail) ? conses_high.cadr(owner_tail) : evaluatable_relation_tests.NIL);
        final SubLObject workingP_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw61$WORKING_, current);
        final SubLObject workingP = (SubLObject)((evaluatable_relation_tests.NIL != workingP_tail) ? conses_high.cadr(workingP_tail) : evaluatable_relation_tests.T);
        return (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$sym62$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK_INT, function, start_id, mt, tests, workingP, kb, owner);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 9120L)
    public static SubLObject define_simple_evaluatable_function_test_int(final SubLObject function, final SubLObject id, final SubLObject mt, final SubLObject result, final SubLObject expression, final SubLObject kb, final SubLObject owner) {
        SubLObject sentence = (SubLObject)evaluatable_relation_tests.NIL;
        if (result.eql((SubLObject)evaluatable_relation_tests.$kw65$ILL_FORMED)) {
            sentence = (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const66$trueSubL, (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const67$SubLQuoteFn, (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$sym68$CNOT, (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$sym69$EL_WFF_, (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$sym70$QUOTE, (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const71$evaluate, (SubLObject)evaluatable_relation_tests.$sym72$_RESULT, expression)), (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$sym70$QUOTE, mt)))));
        }
        else if (result.eql((SubLObject)evaluatable_relation_tests.$kw73$UNEVALUATABLE)) {
            sentence = (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const74$unknownSentence, (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const75$thereExists, (SubLObject)evaluatable_relation_tests.$sym72$_RESULT, (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const71$evaluate, (SubLObject)evaluatable_relation_tests.$sym72$_RESULT, expression)));
        }
        else if (result.eql((SubLObject)evaluatable_relation_tests.$kw53$DONT_CARE)) {
            sentence = (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const71$evaluate, (SubLObject)evaluatable_relation_tests.$sym72$_RESULT, expression);
        }
        else {
            sentence = (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const71$evaluate, result, expression);
        }
        if (evaluatable_relation_tests.NIL != mt) {
            sentence = (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const76$ist, mt, sentence);
        }
        return define_evaluatable_relation_test_int(function, id, sentence, kb, owner);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 10016L)
    public static SubLObject define_simple_evaluatable_function_test_block_int(final SubLObject function, final SubLObject start_id, final SubLObject mt, final SubLObject test_specs, final SubLObject workingP, final SubLObject kb, final SubLObject owner) {
        assert evaluatable_relation_tests.NIL != forts.fort_p(function) : function;
        assert evaluatable_relation_tests.NIL != Types.integerp(start_id) : start_id;
        if (evaluatable_relation_tests.NIL != workingP) {
            SubLObject list_var = (SubLObject)evaluatable_relation_tests.NIL;
            SubLObject test_spec = (SubLObject)evaluatable_relation_tests.NIL;
            SubLObject id_offset = (SubLObject)evaluatable_relation_tests.NIL;
            list_var = test_specs;
            test_spec = list_var.first();
            for (id_offset = (SubLObject)evaluatable_relation_tests.ZERO_INTEGER; evaluatable_relation_tests.NIL != list_var; list_var = list_var.rest(), test_spec = list_var.first(), id_offset = Numbers.add((SubLObject)evaluatable_relation_tests.ONE_INTEGER, id_offset)) {
                final SubLObject id = Numbers.add(start_id, id_offset);
                SubLObject current;
                final SubLObject datum = current = test_spec;
                SubLObject expression = (SubLObject)evaluatable_relation_tests.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list77);
                expression = current.first();
                current = current.rest();
                final SubLObject result = (SubLObject)(current.isCons() ? current.first() : evaluatable_relation_tests.$kw53$DONT_CARE);
                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)evaluatable_relation_tests.$list77);
                current = current.rest();
                if (evaluatable_relation_tests.NIL == current) {
                    define_simple_evaluatable_function_test_int(function, id, mt, result, expression, kb, owner);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)evaluatable_relation_tests.$list77);
                }
            }
        }
        return (SubLObject)evaluatable_relation_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 10585L)
    public static SubLObject define_simple_evaluatable_predicate_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject id = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject sentence = (SubLObject)evaluatable_relation_tests.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list78);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list78);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list78);
        sentence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject current_$5 = (SubLObject)evaluatable_relation_tests.NIL;
        while (evaluatable_relation_tests.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluatable_relation_tests.$list78);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluatable_relation_tests.$list78);
            if (evaluatable_relation_tests.NIL == conses_high.member(current_$5, (SubLObject)evaluatable_relation_tests.$list79, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED)) {
                bad = (SubLObject)evaluatable_relation_tests.T;
            }
            if (current_$5 == evaluatable_relation_tests.$kw38$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (evaluatable_relation_tests.NIL != bad && evaluatable_relation_tests.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)evaluatable_relation_tests.$list78);
        }
        final SubLObject result_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw52$RESULT, current);
        final SubLObject result = (SubLObject)((evaluatable_relation_tests.NIL != result_tail) ? conses_high.cadr(result_tail) : evaluatable_relation_tests.$kw53$DONT_CARE);
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw54$MT, current);
        final SubLObject mt = (SubLObject)((evaluatable_relation_tests.NIL != mt_tail) ? conses_high.cadr(mt_tail) : evaluatable_relation_tests.NIL);
        final SubLObject kb_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw22$KB, current);
        final SubLObject kb = (SubLObject)((evaluatable_relation_tests.NIL != kb_tail) ? conses_high.cadr(kb_tail) : evaluatable_relation_tests.$kw39$FULL);
        final SubLObject owner_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw23$OWNER, current);
        final SubLObject owner = (SubLObject)((evaluatable_relation_tests.NIL != owner_tail) ? conses_high.cadr(owner_tail) : evaluatable_relation_tests.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$sym80$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_INT, predicate, id, mt, result, sentence, kb, owner);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 11430L)
    public static SubLObject define_simple_evaluatable_predicate_test_block(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject predicate = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject start_id = (SubLObject)evaluatable_relation_tests.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list82);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list82);
        start_id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject current_$6 = (SubLObject)evaluatable_relation_tests.NIL;
        while (evaluatable_relation_tests.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluatable_relation_tests.$list82);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)evaluatable_relation_tests.$list82);
            if (evaluatable_relation_tests.NIL == conses_high.member(current_$6, (SubLObject)evaluatable_relation_tests.$list83, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED)) {
                bad = (SubLObject)evaluatable_relation_tests.T;
            }
            if (current_$6 == evaluatable_relation_tests.$kw38$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (evaluatable_relation_tests.NIL != bad && evaluatable_relation_tests.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)evaluatable_relation_tests.$list82);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw54$MT, current);
        final SubLObject mt = (evaluatable_relation_tests.NIL != mt_tail) ? conses_high.cadr(mt_tail) : evaluatable_relation_tests.$const59$InferencePSC;
        final SubLObject kb_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw22$KB, current);
        final SubLObject kb = (SubLObject)((evaluatable_relation_tests.NIL != kb_tail) ? conses_high.cadr(kb_tail) : evaluatable_relation_tests.$kw39$FULL);
        final SubLObject owner_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw23$OWNER, current);
        final SubLObject owner = (SubLObject)((evaluatable_relation_tests.NIL != owner_tail) ? conses_high.cadr(owner_tail) : evaluatable_relation_tests.NIL);
        final SubLObject tests_tail = cdestructuring_bind.property_list_member((SubLObject)evaluatable_relation_tests.$kw60$TESTS, current);
        final SubLObject tests = (SubLObject)((evaluatable_relation_tests.NIL != tests_tail) ? conses_high.cadr(tests_tail) : evaluatable_relation_tests.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$sym84$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK_INT, predicate, start_id, mt, kb, owner, tests);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 12241L)
    public static SubLObject define_simple_evaluatable_predicate_test_int(final SubLObject predicate, final SubLObject id, final SubLObject mt, final SubLObject result, SubLObject sentence, final SubLObject kb, final SubLObject owner) {
        SubLObject query_sentence = (SubLObject)evaluatable_relation_tests.NIL;
        if (result.eql((SubLObject)evaluatable_relation_tests.$kw65$ILL_FORMED)) {
            sentence = (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const66$trueSubL, (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const67$SubLQuoteFn, (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$sym68$CNOT, (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$sym69$EL_WFF_, (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$sym70$QUOTE, sentence), (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$sym70$QUOTE, mt)))));
        }
        else if (result.eql((SubLObject)evaluatable_relation_tests.$kw73$UNEVALUATABLE)) {
            query_sentence = (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const87$and, (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const74$unknownSentence, sentence), (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const74$unknownSentence, cycl_utilities.negate(sentence)));
        }
        else if (result.eql((SubLObject)evaluatable_relation_tests.$kw88$FALSE)) {
            query_sentence = cycl_utilities.negate(sentence);
        }
        else {
            query_sentence = sentence;
        }
        if (evaluatable_relation_tests.NIL != mt) {
            query_sentence = (SubLObject)ConsesLow.list(evaluatable_relation_tests.$const76$ist, mt, query_sentence);
        }
        return define_evaluatable_relation_test_int(predicate, id, query_sentence, kb, owner);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 13016L)
    public static SubLObject define_simple_evaluatable_predicate_test_block_int(final SubLObject predicate, final SubLObject start_id, final SubLObject mt, final SubLObject kb, final SubLObject owner, final SubLObject test_specs) {
        assert evaluatable_relation_tests.NIL != forts.fort_p(predicate) : predicate;
        assert evaluatable_relation_tests.NIL != Types.integerp(start_id) : start_id;
        SubLObject list_var = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject test_spec = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject id_offset = (SubLObject)evaluatable_relation_tests.NIL;
        list_var = test_specs;
        test_spec = list_var.first();
        for (id_offset = (SubLObject)evaluatable_relation_tests.ZERO_INTEGER; evaluatable_relation_tests.NIL != list_var; list_var = list_var.rest(), test_spec = list_var.first(), id_offset = Numbers.add((SubLObject)evaluatable_relation_tests.ONE_INTEGER, id_offset)) {
            final SubLObject id = Numbers.add(start_id, id_offset);
            SubLObject current;
            final SubLObject datum = current = test_spec;
            SubLObject sentence = (SubLObject)evaluatable_relation_tests.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)evaluatable_relation_tests.$list89);
            sentence = current.first();
            current = current.rest();
            final SubLObject result = (SubLObject)(current.isCons() ? current.first() : evaluatable_relation_tests.$kw90$TRUE);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)evaluatable_relation_tests.$list89);
            current = current.rest();
            if (evaluatable_relation_tests.NIL == current) {
                define_simple_evaluatable_predicate_test_int(predicate, id, mt, result, sentence, kb, owner);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)evaluatable_relation_tests.$list89);
            }
        }
        return (SubLObject)evaluatable_relation_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 13551L)
    public static SubLObject run_all_evaluatable_relation_tests(SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
        if (output_format == evaluatable_relation_tests.UNPROVIDED) {
            output_format = (SubLObject)evaluatable_relation_tests.$kw91$STANDARD;
        }
        if (stream == evaluatable_relation_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (run_tiny_kb_tests_in_full_kbP == evaluatable_relation_tests.UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (return_test_runsP == evaluatable_relation_tests.UNPROVIDED) {
            return_test_runsP = (SubLObject)evaluatable_relation_tests.NIL;
        }
        assert evaluatable_relation_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        return cyc_testing.run_all_loaded_cyc_tests(stream, (SubLObject)evaluatable_relation_tests.$kw93$TERSE, (SubLObject)evaluatable_relation_tests.NIL, output_format, run_tiny_kb_tests_in_full_kbP, (SubLObject)evaluatable_relation_tests.NIL, return_test_runsP, (SubLObject)evaluatable_relation_tests.$kw94$ERT, (SubLObject)evaluatable_relation_tests.NIL, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 14544L)
    public static SubLObject run_evaluatable_relation_tests(final SubLObject relation, SubLObject output_format, SubLObject stream, SubLObject browsableP) {
        if (output_format == evaluatable_relation_tests.UNPROVIDED) {
            output_format = (SubLObject)evaluatable_relation_tests.$kw91$STANDARD;
        }
        if (stream == evaluatable_relation_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == evaluatable_relation_tests.UNPROVIDED) {
            browsableP = (SubLObject)evaluatable_relation_tests.NIL;
        }
        assert evaluatable_relation_tests.NIL != forts.fort_p(relation) : relation;
        assert evaluatable_relation_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        SubLObject test_runs = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject cdolist_list_var = evaluatable_relation_tests(relation);
        SubLObject ert = (SubLObject)evaluatable_relation_tests.NIL;
        ert = cdolist_list_var.first();
        while (evaluatable_relation_tests.NIL != cdolist_list_var) {
            final SubLObject test_run = run_evaluatable_relation_test(ert, output_format, stream, browsableP);
            test_runs = (SubLObject)ConsesLow.cons(test_run, test_runs);
            cdolist_list_var = cdolist_list_var.rest();
            ert = cdolist_list_var.first();
        }
        return test_runs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 15376L)
    public static SubLObject run_evaluatable_relation_test_number(final SubLObject relation, final SubLObject id, SubLObject output_format, SubLObject stream, SubLObject browsableP) {
        if (output_format == evaluatable_relation_tests.UNPROVIDED) {
            output_format = (SubLObject)evaluatable_relation_tests.$kw91$STANDARD;
        }
        if (stream == evaluatable_relation_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == evaluatable_relation_tests.UNPROVIDED) {
            browsableP = (SubLObject)evaluatable_relation_tests.NIL;
        }
        assert evaluatable_relation_tests.NIL != forts.fort_p(relation) : relation;
        assert evaluatable_relation_tests.NIL != Types.integerp(id) : id;
        SubLObject cdolist_list_var = evaluatable_relation_tests(relation);
        SubLObject ert = (SubLObject)evaluatable_relation_tests.NIL;
        ert = cdolist_list_var.first();
        while (evaluatable_relation_tests.NIL != cdolist_list_var) {
            if (id.numE(ert_id(ert))) {
                return run_evaluatable_relation_test(ert, output_format, stream, browsableP);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ert = cdolist_list_var.first();
        }
        return (SubLObject)evaluatable_relation_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 16137L)
    public static SubLObject run_evaluatable_relation_test_number_browsable(final SubLObject relation, final SubLObject id, SubLObject output_format, SubLObject stream) {
        if (output_format == evaluatable_relation_tests.UNPROVIDED) {
            output_format = (SubLObject)evaluatable_relation_tests.$kw91$STANDARD;
        }
        if (stream == evaluatable_relation_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_evaluatable_relation_test_number(relation, id, output_format, stream, (SubLObject)evaluatable_relation_tests.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 16360L)
    public static SubLObject run_evaluatable_relation_test(final SubLObject ert, SubLObject output_format, SubLObject stream, SubLObject browsableP) {
        if (output_format == evaluatable_relation_tests.UNPROVIDED) {
            output_format = (SubLObject)evaluatable_relation_tests.$kw91$STANDARD;
        }
        if (stream == evaluatable_relation_tests.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == evaluatable_relation_tests.UNPROVIDED) {
            browsableP = (SubLObject)evaluatable_relation_tests.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert evaluatable_relation_tests.NIL != evaluatable_relation_test_p(ert) : ert;
        assert evaluatable_relation_tests.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        final SubLObject name = evaluatable_relation_test_name(ert);
        SubLObject time = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject result = (SubLObject)evaluatable_relation_tests.NIL;
        if (evaluatable_relation_tests.NIL == run_evaluatable_relation_testP(ert)) {
            result = (SubLObject)evaluatable_relation_tests.$kw95$NOT_RUN;
        }
        else if (evaluatable_relation_tests.NIL != evaluatable_relation_test_mentions_invalid_constantP(ert)) {
            result = (SubLObject)evaluatable_relation_tests.$kw96$INVALID;
        }
        else {
            final SubLObject sentence = ert_sentence(ert);
            final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
            try {
                print_high.$print_pretty$.bind((SubLObject)evaluatable_relation_tests.NIL, thread);
                print_evaluatable_relation_test_preamble(ert, output_format, stream);
                thread.resetMultipleValues();
                final SubLObject result_$7 = run_evaluatable_relation_test_query(sentence, browsableP);
                final SubLObject time_$8 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$7;
                time = time_$8;
                print_evaluatable_relation_test_result(ert, result, time, output_format, stream);
            }
            finally {
                print_high.$print_pretty$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject test_run = cyc_testing.new_cyc_test_run((SubLObject)evaluatable_relation_tests.$kw94$ERT, name, result, time);
        return test_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 17671L)
    public static SubLObject run_evaluatable_relation_testP(final SubLObject ert) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_kb = ert_kb(ert);
        if (evaluatable_relation_tests.NIL == inference_testing.kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
            return (SubLObject)evaluatable_relation_tests.NIL;
        }
        return (SubLObject)evaluatable_relation_tests.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 18070L)
    public static SubLObject run_evaluatable_relation_test_query(final SubLObject sentence, final SubLObject browsableP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)evaluatable_relation_tests.$kw97$ERROR;
        SubLObject time = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject ignore_errors_tag = (SubLObject)evaluatable_relation_tests.NIL;
        try {
            thread.throwStack.push(evaluatable_relation_tests.$kw98$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)evaluatable_relation_tests.$sym99$IGNORE_ERRORS_HANDLER), thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject result = evaluatable_relation_test_query_inference(sentence, evaluatable_relation_tests.$const59$InferencePSC);
                    final SubLObject inference = thread.secondMultipleValue();
                    final SubLObject inference_time = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    time = inference_time;
                    if (evaluatable_relation_tests.NIL == result) {
                        v_answer = (SubLObject)evaluatable_relation_tests.$kw100$FAILURE;
                    }
                    else {
                        v_answer = (SubLObject)evaluatable_relation_tests.$kw101$SUCCESS;
                    }
                    if (evaluatable_relation_tests.NIL == browsableP) {
                        inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)evaluatable_relation_tests.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)evaluatable_relation_tests.$kw98$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(v_answer, time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 18582L)
    public static SubLObject evaluatable_relation_test_query_inference(SubLObject sentence, SubLObject mt) {
        if (mt == evaluatable_relation_tests.UNPROVIDED) {
            mt = (SubLObject)evaluatable_relation_tests.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence_$9 = czer_utilities.unwrap_if_ist(sentence, mt, (SubLObject)evaluatable_relation_tests.UNPROVIDED);
        final SubLObject mt_$10 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$9;
        mt = mt_$10;
        final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p(sentence);
        final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)evaluatable_relation_tests.$kw102$CACHE_INFERENCE_RESULTS_, (SubLObject)evaluatable_relation_tests.NIL, (SubLObject)evaluatable_relation_tests.$kw103$BROWSABLE_, (SubLObject)evaluatable_relation_tests.T, (SubLObject)evaluatable_relation_tests.$kw104$CONDITIONAL_SENTENCE_, conditionalP, (SubLObject)evaluatable_relation_tests.$kw105$NEW_TERMS_ALLOWED_, (SubLObject)evaluatable_relation_tests.T);
        SubLObject time = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject result = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject halt_reason = (SubLObject)evaluatable_relation_tests.NIL;
        SubLObject inference = (SubLObject)evaluatable_relation_tests.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        thread.resetMultipleValues();
        final SubLObject result_$11 = inference_kernel.new_cyc_query(sentence, mt, v_properties);
        final SubLObject halt_reason_$12 = thread.secondMultipleValue();
        final SubLObject inference_$13 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        result = result_$11;
        halt_reason = halt_reason_$12;
        inference = inference_$13;
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return Values.values(result, inference, time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 19180L)
    public static SubLObject print_evaluatable_relation_test_preamble(final SubLObject ert, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql((SubLObject)evaluatable_relation_tests.$kw91$STANDARD)) {
            final SubLObject relation = ert_relation(ert);
            final SubLObject id = ert_id(ert);
            PrintLow.format(stream, (SubLObject)evaluatable_relation_tests.$str106$___ERT__S__S____, relation, id);
            streams_high.force_output(stream);
        }
        else if (!output_format.eql((SubLObject)evaluatable_relation_tests.$kw107$POST_BUILD)) {
            PrintLow.format(stream, (SubLObject)evaluatable_relation_tests.$str108$Unknown_output_format__A, output_format);
        }
        return (SubLObject)evaluatable_relation_tests.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 19575L)
    public static SubLObject print_evaluatable_relation_test_result(final SubLObject ert, final SubLObject result, final SubLObject time, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql((SubLObject)evaluatable_relation_tests.$kw91$STANDARD)) {
            PrintLow.format(stream, (SubLObject)evaluatable_relation_tests.$str109$_ERT__S____3f___, result, time);
            streams_high.force_output(stream);
        }
        else if (output_format.eql((SubLObject)evaluatable_relation_tests.$kw107$POST_BUILD)) {
            final SubLObject relation = ert_relation(ert);
            final SubLObject id = ert_id(ert);
            final SubLObject owner = ert_owner(ert);
            cyc_testing.print_post_build_test_summary(stream, result, relation, id, time, owner);
        }
        else {
            PrintLow.format(stream, (SubLObject)evaluatable_relation_tests.$str108$Unknown_output_format__A, output_format);
        }
        return (SubLObject)evaluatable_relation_tests.NIL;
    }
    
    public static SubLObject declare_evaluatable_relation_tests_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_test_print_function_trampoline", "EVALUATABLE-RELATION-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_test_p", "EVALUATABLE-RELATION-TEST-P", 1, 0, false);
        new $evaluatable_relation_test_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "ert_relation", "ERT-RELATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "ert_id", "ERT-ID", 1, 0, false);
        new $ert_id$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "ert_sentence", "ERT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "ert_kb", "ERT-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "ert_owner", "ERT-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "_csetf_ert_relation", "_CSETF-ERT-RELATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "_csetf_ert_id", "_CSETF-ERT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "_csetf_ert_sentence", "_CSETF-ERT-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "_csetf_ert_kb", "_CSETF-ERT-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "_csetf_ert_owner", "_CSETF-ERT-OWNER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "make_evaluatable_relation_test", "MAKE-EVALUATABLE-RELATION-TEST", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "visit_defstruct_evaluatable_relation_test", "VISIT-DEFSTRUCT-EVALUATABLE-RELATION-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "visit_defstruct_object_evaluatable_relation_test_method", "VISIT-DEFSTRUCT-OBJECT-EVALUATABLE-RELATION-TEST-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "clear_evaluatable_relation_tests", "CLEAR-EVALUATABLE-RELATION-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relations_with_evaluatable_relation_tests", "EVALUATABLE-RELATIONS-WITH-EVALUATABLE-RELATION-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_tests", "EVALUATABLE-RELATION-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "some_evaluatable_relation_testsP", "SOME-EVALUATABLE-RELATION-TESTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_test_name", "EVALUATABLE-RELATION-TEST-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_test_id", "EVALUATABLE-RELATION-TEST-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_test_owner", "EVALUATABLE-RELATION-TEST-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_test_comment", "EVALUATABLE-RELATION-TEST-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_test_relation", "EVALUATABLE-RELATION-TEST-RELATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_test_sentence", "EVALUATABLE-RELATION-TEST-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_test_kb", "EVALUATABLE-RELATION-TEST-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_test_workingP", "EVALUATABLE-RELATION-TEST-WORKING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_test_mentions_invalid_constantP", "EVALUATABLE-RELATION-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_test_invalid_constants", "EVALUATABLE-RELATION-TEST-INVALID-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_test_count", "EVALUATABLE-RELATION-TEST-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "total_evaluatable_relation_test_count", "TOTAL-EVALUATABLE-RELATION-TEST-COUNT", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "define_evaluatable_function_test", "DEFINE-EVALUATABLE-FUNCTION-TEST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "define_evaluatable_predicate_test", "DEFINE-EVALUATABLE-PREDICATE-TEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "define_evaluatable_relation_test_int", "DEFINE-EVALUATABLE-RELATION-TEST-INT", 5, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "define_simple_evaluatable_function_test", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "define_simple_evaluatable_function_test_block", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "define_simple_evaluatable_function_test_int", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "define_simple_evaluatable_function_test_block_int", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK-INT", 7, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "define_simple_evaluatable_predicate_test", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "define_simple_evaluatable_predicate_test_block", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "define_simple_evaluatable_predicate_test_int", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "define_simple_evaluatable_predicate_test_block_int", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "run_all_evaluatable_relation_tests", "RUN-ALL-EVALUATABLE-RELATION-TESTS", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "run_evaluatable_relation_tests", "RUN-EVALUATABLE-RELATION-TESTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "run_evaluatable_relation_test_number", "RUN-EVALUATABLE-RELATION-TEST-NUMBER", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "run_evaluatable_relation_test_number_browsable", "RUN-EVALUATABLE-RELATION-TEST-NUMBER-BROWSABLE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "run_evaluatable_relation_test", "RUN-EVALUATABLE-RELATION-TEST", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "run_evaluatable_relation_testP", "RUN-EVALUATABLE-RELATION-TEST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "run_evaluatable_relation_test_query", "RUN-EVALUATABLE-RELATION-TEST-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "evaluatable_relation_test_query_inference", "EVALUATABLE-RELATION-TEST-QUERY-INFERENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "print_evaluatable_relation_test_preamble", "PRINT-EVALUATABLE-RELATION-TEST-PREAMBLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.evaluatable_relation_tests", "print_evaluatable_relation_test_result", "PRINT-EVALUATABLE-RELATION-TEST-RESULT", 5, 0, false);
        return (SubLObject)evaluatable_relation_tests.NIL;
    }
    
    public static SubLObject init_evaluatable_relation_tests_file() {
        evaluatable_relation_tests.$dtp_evaluatable_relation_test$ = SubLFiles.defconstant("*DTP-EVALUATABLE-RELATION-TEST*", (SubLObject)evaluatable_relation_tests.$sym0$EVALUATABLE_RELATION_TEST);
        evaluatable_relation_tests.$evaluatable_relation_tests$ = SubLFiles.deflexical("*EVALUATABLE-RELATION-TESTS*", (evaluatable_relation_tests.NIL != Symbols.boundp((SubLObject)evaluatable_relation_tests.$sym30$_EVALUATABLE_RELATION_TESTS_)) ? evaluatable_relation_tests.$evaluatable_relation_tests$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)evaluatable_relation_tests.$int31$100, (SubLObject)evaluatable_relation_tests.UNPROVIDED, (SubLObject)evaluatable_relation_tests.UNPROVIDED));
        return (SubLObject)evaluatable_relation_tests.NIL;
    }
    
    public static SubLObject setup_evaluatable_relation_tests_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), evaluatable_relation_tests.$dtp_evaluatable_relation_test$.getGlobalValue(), Symbols.symbol_function((SubLObject)evaluatable_relation_tests.$sym7$EVALUATABLE_RELATION_TEST_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)evaluatable_relation_tests.$list8);
        Structures.def_csetf((SubLObject)evaluatable_relation_tests.$sym9$ERT_RELATION, (SubLObject)evaluatable_relation_tests.$sym10$_CSETF_ERT_RELATION);
        Structures.def_csetf((SubLObject)evaluatable_relation_tests.$sym11$ERT_ID, (SubLObject)evaluatable_relation_tests.$sym12$_CSETF_ERT_ID);
        Structures.def_csetf((SubLObject)evaluatable_relation_tests.$sym13$ERT_SENTENCE, (SubLObject)evaluatable_relation_tests.$sym14$_CSETF_ERT_SENTENCE);
        Structures.def_csetf((SubLObject)evaluatable_relation_tests.$sym15$ERT_KB, (SubLObject)evaluatable_relation_tests.$sym16$_CSETF_ERT_KB);
        Structures.def_csetf((SubLObject)evaluatable_relation_tests.$sym17$ERT_OWNER, (SubLObject)evaluatable_relation_tests.$sym18$_CSETF_ERT_OWNER);
        Equality.identity((SubLObject)evaluatable_relation_tests.$sym0$EVALUATABLE_RELATION_TEST);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), evaluatable_relation_tests.$dtp_evaluatable_relation_test$.getGlobalValue(), Symbols.symbol_function((SubLObject)evaluatable_relation_tests.$sym29$VISIT_DEFSTRUCT_OBJECT_EVALUATABLE_RELATION_TEST_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)evaluatable_relation_tests.$sym30$_EVALUATABLE_RELATION_TESTS_);
        meta_macros.declare_indention_pattern((SubLObject)evaluatable_relation_tests.$sym41$DEFINE_EVALUATABLE_FUNCTION_TEST, (SubLObject)evaluatable_relation_tests.$list42);
        meta_macros.declare_indention_pattern((SubLObject)evaluatable_relation_tests.$sym44$DEFINE_EVALUATABLE_PREDICATE_TEST, (SubLObject)evaluatable_relation_tests.$list45);
        meta_macros.declare_indention_pattern((SubLObject)evaluatable_relation_tests.$sym56$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST, (SubLObject)evaluatable_relation_tests.$list42);
        meta_macros.declare_indention_pattern((SubLObject)evaluatable_relation_tests.$sym63$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK, (SubLObject)evaluatable_relation_tests.$list64);
        access_macros.register_macro_helper((SubLObject)evaluatable_relation_tests.$sym55$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_INT, (SubLObject)evaluatable_relation_tests.$sym56$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST);
        access_macros.register_macro_helper((SubLObject)evaluatable_relation_tests.$sym62$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK_INT, (SubLObject)evaluatable_relation_tests.$sym63$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK);
        meta_macros.declare_indention_pattern((SubLObject)evaluatable_relation_tests.$sym81$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST, (SubLObject)evaluatable_relation_tests.$list45);
        meta_macros.declare_indention_pattern((SubLObject)evaluatable_relation_tests.$sym85$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK, (SubLObject)evaluatable_relation_tests.$list86);
        access_macros.register_macro_helper((SubLObject)evaluatable_relation_tests.$sym80$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_INT, (SubLObject)evaluatable_relation_tests.$sym81$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST);
        access_macros.register_macro_helper((SubLObject)evaluatable_relation_tests.$sym84$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK_INT, (SubLObject)evaluatable_relation_tests.$sym85$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK);
        return (SubLObject)evaluatable_relation_tests.NIL;
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
    
    static {
        me = (SubLFile)new evaluatable_relation_tests();
        evaluatable_relation_tests.$dtp_evaluatable_relation_test$ = null;
        evaluatable_relation_tests.$evaluatable_relation_tests$ = null;
        $sym0$EVALUATABLE_RELATION_TEST = SubLObjectFactory.makeSymbol("EVALUATABLE-RELATION-TEST");
        $sym1$EVALUATABLE_RELATION_TEST_P = SubLObjectFactory.makeSymbol("EVALUATABLE-RELATION-TEST-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("KB"), (SubLObject)SubLObjectFactory.makeSymbol("OWNER"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RELATION"), (SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERT-RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("ERT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("ERT-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("ERT-KB"), (SubLObject)SubLObjectFactory.makeSymbol("ERT-OWNER"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ERT-RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ERT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ERT-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ERT-KB"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ERT-OWNER"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$EVALUATABLE_RELATION_TEST_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("EVALUATABLE-RELATION-TEST-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("EVALUATABLE-RELATION-TEST-P"));
        $sym9$ERT_RELATION = SubLObjectFactory.makeSymbol("ERT-RELATION");
        $sym10$_CSETF_ERT_RELATION = SubLObjectFactory.makeSymbol("_CSETF-ERT-RELATION");
        $sym11$ERT_ID = SubLObjectFactory.makeSymbol("ERT-ID");
        $sym12$_CSETF_ERT_ID = SubLObjectFactory.makeSymbol("_CSETF-ERT-ID");
        $sym13$ERT_SENTENCE = SubLObjectFactory.makeSymbol("ERT-SENTENCE");
        $sym14$_CSETF_ERT_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-ERT-SENTENCE");
        $sym15$ERT_KB = SubLObjectFactory.makeSymbol("ERT-KB");
        $sym16$_CSETF_ERT_KB = SubLObjectFactory.makeSymbol("_CSETF-ERT-KB");
        $sym17$ERT_OWNER = SubLObjectFactory.makeSymbol("ERT-OWNER");
        $sym18$_CSETF_ERT_OWNER = SubLObjectFactory.makeSymbol("_CSETF-ERT-OWNER");
        $kw19$RELATION = SubLObjectFactory.makeKeyword("RELATION");
        $kw20$ID = SubLObjectFactory.makeKeyword("ID");
        $kw21$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw22$KB = SubLObjectFactory.makeKeyword("KB");
        $kw23$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $str24$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw25$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym26$MAKE_EVALUATABLE_RELATION_TEST = SubLObjectFactory.makeSymbol("MAKE-EVALUATABLE-RELATION-TEST");
        $kw27$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw28$END = SubLObjectFactory.makeKeyword("END");
        $sym29$VISIT_DEFSTRUCT_OBJECT_EVALUATABLE_RELATION_TEST_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-EVALUATABLE-RELATION-TEST-METHOD");
        $sym30$_EVALUATABLE_RELATION_TESTS_ = SubLObjectFactory.makeSymbol("*EVALUATABLE-RELATION-TESTS*");
        $int31$100 = SubLObjectFactory.makeInteger(100);
        $sym32$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym33$_ = SubLObjectFactory.makeSymbol("<");
        $str34$ = SubLObjectFactory.makeString("");
        $sym35$INVALID_CONSTANT_ = SubLObjectFactory.makeSymbol("INVALID-CONSTANT?");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB"), (SubLObject)SubLObjectFactory.makeKeyword("FULL")), (SubLObject)SubLObjectFactory.makeSymbol("OWNER"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"));
        $kw38$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw39$FULL = SubLObjectFactory.makeKeyword("FULL");
        $sym40$DEFINE_EVALUATABLE_RELATION_TEST_INT = SubLObjectFactory.makeSymbol("DEFINE-EVALUATABLE-RELATION-TEST-INT");
        $sym41$DEFINE_EVALUATABLE_FUNCTION_TEST = SubLObjectFactory.makeSymbol("DEFINE-EVALUATABLE-FUNCTION-TEST");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB"), (SubLObject)SubLObjectFactory.makeKeyword("FULL")), (SubLObject)SubLObjectFactory.makeSymbol("OWNER"));
        $sym44$DEFINE_EVALUATABLE_PREDICATE_TEST = SubLObjectFactory.makeSymbol("DEFINE-EVALUATABLE-PREDICATE-TEST");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym46$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym47$POSSIBLY_SENTENCE_P = SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-P");
        $sym48$CYC_TEST_KB_P = SubLObjectFactory.makeSymbol("CYC-TEST-KB-P");
        $sym49$INFERENCE_TEST_OWNER_P = SubLObjectFactory.makeSymbol("INFERENCE-TEST-OWNER-P");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("DONT-CARE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB"), (SubLObject)SubLObjectFactory.makeKeyword("FULL")), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("OWNER"));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"));
        $kw52$RESULT = SubLObjectFactory.makeKeyword("RESULT");
        $kw53$DONT_CARE = SubLObjectFactory.makeKeyword("DONT-CARE");
        $kw54$MT = SubLObjectFactory.makeKeyword("MT");
        $sym55$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_INT = SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-INT");
        $sym56$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST = SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("START-ID"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB"), (SubLObject)SubLObjectFactory.makeKeyword("FULL")), (SubLObject)SubLObjectFactory.makeSymbol("TESTS"), (SubLObject)SubLObjectFactory.makeSymbol("OWNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORKING?"), (SubLObject)evaluatable_relation_tests.T));
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("TESTS"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"), (SubLObject)SubLObjectFactory.makeKeyword("WORKING?"));
        $const59$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw60$TESTS = SubLObjectFactory.makeKeyword("TESTS");
        $kw61$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $sym62$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK_INT = SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK-INT");
        $sym63$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK = SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("START-ID"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw65$ILL_FORMED = SubLObjectFactory.makeKeyword("ILL-FORMED");
        $const66$trueSubL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSubL"));
        $const67$SubLQuoteFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $sym68$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym69$EL_WFF_ = SubLObjectFactory.makeSymbol("EL-WFF?");
        $sym70$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $const71$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $sym72$_RESULT = SubLObjectFactory.makeSymbol("?RESULT");
        $kw73$UNEVALUATABLE = SubLObjectFactory.makeKeyword("UNEVALUATABLE");
        $const74$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $const75$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $const76$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("DONT-CARE")));
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("DONT-CARE")), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB"), (SubLObject)SubLObjectFactory.makeKeyword("FULL")), (SubLObject)SubLObjectFactory.makeSymbol("OWNER"));
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"));
        $sym80$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_INT = SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-INT");
        $sym81$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST = SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("START-ID"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB"), (SubLObject)SubLObjectFactory.makeKeyword("FULL")), (SubLObject)SubLObjectFactory.makeSymbol("OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("TESTS"));
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"), (SubLObject)SubLObjectFactory.makeKeyword("TESTS"));
        $sym84$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK_INT = SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK-INT");
        $sym85$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK = SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("START-ID"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $const87$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $kw88$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $kw90$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw91$STANDARD = SubLObjectFactory.makeKeyword("STANDARD");
        $sym92$CYC_TEST_OUTPUT_FORMAT_P = SubLObjectFactory.makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");
        $kw93$TERSE = SubLObjectFactory.makeKeyword("TERSE");
        $kw94$ERT = SubLObjectFactory.makeKeyword("ERT");
        $kw95$NOT_RUN = SubLObjectFactory.makeKeyword("NOT-RUN");
        $kw96$INVALID = SubLObjectFactory.makeKeyword("INVALID");
        $kw97$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $kw98$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym99$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw100$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $kw101$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $kw102$CACHE_INFERENCE_RESULTS_ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $kw103$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $kw104$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $kw105$NEW_TERMS_ALLOWED_ = SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?");
        $str106$___ERT__S__S____ = SubLObjectFactory.makeString("~&:ERT ~S ~S -> ");
        $kw107$POST_BUILD = SubLObjectFactory.makeKeyword("POST-BUILD");
        $str108$Unknown_output_format__A = SubLObjectFactory.makeString("Unknown output format ~A");
        $str109$_ERT__S____3f___ = SubLObjectFactory.makeString(":ERT ~S (~,3f)~%");
    }
    
    public static final class $evaluatable_relation_test_native extends SubLStructNative
    {
        public SubLObject $relation;
        public SubLObject $id;
        public SubLObject $sentence;
        public SubLObject $kb;
        public SubLObject $owner;
        private static final SubLStructDeclNative structDecl;
        
        public $evaluatable_relation_test_native() {
            this.$relation = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$kb = (SubLObject)CommonSymbols.NIL;
            this.$owner = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$evaluatable_relation_test_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$evaluatable_relation_test_native.class, evaluatable_relation_tests.$sym0$EVALUATABLE_RELATION_TEST, evaluatable_relation_tests.$sym1$EVALUATABLE_RELATION_TEST_P, evaluatable_relation_tests.$list2, evaluatable_relation_tests.$list3, new String[] { "$relation", "$id", "$sentence", "$kb", "$owner" }, evaluatable_relation_tests.$list4, evaluatable_relation_tests.$list5, evaluatable_relation_tests.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $evaluatable_relation_test_p$UnaryFunction extends UnaryFunction
    {
        public $evaluatable_relation_test_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EVALUATABLE-RELATION-TEST-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return evaluatable_relation_tests.evaluatable_relation_test_p(arg1);
        }
    }
    
    public static final class $ert_id$UnaryFunction extends UnaryFunction
    {
        public $ert_id$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ERT-ID"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return evaluatable_relation_tests.ert_id(arg1);
        }
    }
}

/*

	Total time: 300 ms
	
*/