package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.extract_dynamic_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.copy_seq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.processp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.ArrayList;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class parallelism_utilities extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new parallelism_utilities();

    public static final String myName = "com.cyc.cycjava_2.cycl.parallelism_utilities";


    // defconstant
    public static final SubLSymbol $dtp_parallel_iterator$ = makeSymbol("*DTP-PARALLEL-ITERATOR*");

    // defparameter
    public static final SubLSymbol $current_pariter$ = makeSymbol("*CURRENT-PARITER*");

    // defparameter
    public static final SubLSymbol $current_pariter_index$ = makeSymbol("*CURRENT-PARITER-INDEX*");





    private static final SubLSymbol PARALLEL_ITERATOR = makeSymbol("PARALLEL-ITERATOR");

    private static final SubLSymbol PARALLEL_ITERATOR_P = makeSymbol("PARALLEL-ITERATOR-P");

    private static final SubLList $list2 = list(new SubLObject[]{ makeSymbol("SOURCE-ITERATOR"), makeSymbol("FUNCTION"), makeSymbol("SHARED-ARGS"), makeSymbol("SVS"), makeSymbol("WIDTH"), makeSymbol("BATCH"), makeSymbol("TOTAL"), makeSymbol("SOFAR"), makeSymbol("MESSAGE"), makeSymbol("INITIALIZER"), makeSymbol("REDUCER"), makeSymbol("FINAL-RESULT"), makeSymbol("LOCK"), makeSymbol("BEGIN-SEMAPHORE"), makeSymbol("FINISH-SEMAPHORE"), makeSymbol("PROCESS-POOL"), makeSymbol("PROGRESS-INDICATOR") });

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SOURCE-ITERATOR"), makeKeyword("FUNCTION"), makeKeyword("SHARED-ARGS"), makeKeyword("SVS"), makeKeyword("WIDTH"), makeKeyword("BATCH"), makeKeyword("TOTAL"), makeKeyword("SOFAR"), makeKeyword("MESSAGE"), makeKeyword("INITIALIZER"), makeKeyword("REDUCER"), makeKeyword("FINAL-RESULT"), $LOCK, makeKeyword("BEGIN-SEMAPHORE"), makeKeyword("FINISH-SEMAPHORE"), makeKeyword("PROCESS-POOL"), makeKeyword("PROGRESS-INDICATOR") });

    private static final SubLList $list4 = list(new SubLObject[]{ makeSymbol("PARITER-SOURCE-ITERATOR"), makeSymbol("PARITER-FUNCTION"), makeSymbol("PARITER-SHARED-ARGS"), makeSymbol("PARITER-SVS"), makeSymbol("PARITER-WIDTH"), makeSymbol("PARITER-BATCH"), makeSymbol("PARITER-TOTAL"), makeSymbol("PARITER-SOFAR"), makeSymbol("PARITER-MESSAGE"), makeSymbol("PARITER-INITIALIZER"), makeSymbol("PARITER-REDUCER"), makeSymbol("PARITER-FINAL-RESULT"), makeSymbol("PARITER-LOCK"), makeSymbol("PARITER-BEGIN-SEMAPHORE"), makeSymbol("PARITER-FINISH-SEMAPHORE"), makeSymbol("PARITER-PROCESS-POOL"), makeSymbol("PARITER-PROGRESS-INDICATOR") });

    private static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-PARITER-SOURCE-ITERATOR"), makeSymbol("_CSETF-PARITER-FUNCTION"), makeSymbol("_CSETF-PARITER-SHARED-ARGS"), makeSymbol("_CSETF-PARITER-SVS"), makeSymbol("_CSETF-PARITER-WIDTH"), makeSymbol("_CSETF-PARITER-BATCH"), makeSymbol("_CSETF-PARITER-TOTAL"), makeSymbol("_CSETF-PARITER-SOFAR"), makeSymbol("_CSETF-PARITER-MESSAGE"), makeSymbol("_CSETF-PARITER-INITIALIZER"), makeSymbol("_CSETF-PARITER-REDUCER"), makeSymbol("_CSETF-PARITER-FINAL-RESULT"), makeSymbol("_CSETF-PARITER-LOCK"), makeSymbol("_CSETF-PARITER-BEGIN-SEMAPHORE"), makeSymbol("_CSETF-PARITER-FINISH-SEMAPHORE"), makeSymbol("_CSETF-PARITER-PROCESS-POOL"), makeSymbol("_CSETF-PARITER-PROGRESS-INDICATOR") });



    private static final SubLSymbol PARALLEL_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PARALLEL-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PARALLEL-ITERATOR-P"));

    private static final SubLSymbol PARITER_SOURCE_ITERATOR = makeSymbol("PARITER-SOURCE-ITERATOR");

    private static final SubLSymbol _CSETF_PARITER_SOURCE_ITERATOR = makeSymbol("_CSETF-PARITER-SOURCE-ITERATOR");

    private static final SubLSymbol PARITER_FUNCTION = makeSymbol("PARITER-FUNCTION");

    private static final SubLSymbol _CSETF_PARITER_FUNCTION = makeSymbol("_CSETF-PARITER-FUNCTION");

    private static final SubLSymbol PARITER_SHARED_ARGS = makeSymbol("PARITER-SHARED-ARGS");

    private static final SubLSymbol _CSETF_PARITER_SHARED_ARGS = makeSymbol("_CSETF-PARITER-SHARED-ARGS");

    private static final SubLSymbol PARITER_SVS = makeSymbol("PARITER-SVS");

    private static final SubLSymbol _CSETF_PARITER_SVS = makeSymbol("_CSETF-PARITER-SVS");

    private static final SubLSymbol PARITER_WIDTH = makeSymbol("PARITER-WIDTH");

    private static final SubLSymbol _CSETF_PARITER_WIDTH = makeSymbol("_CSETF-PARITER-WIDTH");

    private static final SubLSymbol PARITER_BATCH = makeSymbol("PARITER-BATCH");

    private static final SubLSymbol _CSETF_PARITER_BATCH = makeSymbol("_CSETF-PARITER-BATCH");

    private static final SubLSymbol PARITER_TOTAL = makeSymbol("PARITER-TOTAL");

    private static final SubLSymbol _CSETF_PARITER_TOTAL = makeSymbol("_CSETF-PARITER-TOTAL");

    private static final SubLSymbol PARITER_SOFAR = makeSymbol("PARITER-SOFAR");

    private static final SubLSymbol _CSETF_PARITER_SOFAR = makeSymbol("_CSETF-PARITER-SOFAR");

    private static final SubLSymbol PARITER_MESSAGE = makeSymbol("PARITER-MESSAGE");

    private static final SubLSymbol _CSETF_PARITER_MESSAGE = makeSymbol("_CSETF-PARITER-MESSAGE");

    private static final SubLSymbol PARITER_INITIALIZER = makeSymbol("PARITER-INITIALIZER");

    private static final SubLSymbol _CSETF_PARITER_INITIALIZER = makeSymbol("_CSETF-PARITER-INITIALIZER");

    private static final SubLSymbol PARITER_REDUCER = makeSymbol("PARITER-REDUCER");

    private static final SubLSymbol _CSETF_PARITER_REDUCER = makeSymbol("_CSETF-PARITER-REDUCER");

    private static final SubLSymbol PARITER_FINAL_RESULT = makeSymbol("PARITER-FINAL-RESULT");

    private static final SubLSymbol _CSETF_PARITER_FINAL_RESULT = makeSymbol("_CSETF-PARITER-FINAL-RESULT");

    private static final SubLSymbol PARITER_LOCK = makeSymbol("PARITER-LOCK");

    private static final SubLSymbol _CSETF_PARITER_LOCK = makeSymbol("_CSETF-PARITER-LOCK");

    private static final SubLSymbol PARITER_BEGIN_SEMAPHORE = makeSymbol("PARITER-BEGIN-SEMAPHORE");

    private static final SubLSymbol _CSETF_PARITER_BEGIN_SEMAPHORE = makeSymbol("_CSETF-PARITER-BEGIN-SEMAPHORE");

    private static final SubLSymbol PARITER_FINISH_SEMAPHORE = makeSymbol("PARITER-FINISH-SEMAPHORE");

    private static final SubLSymbol _CSETF_PARITER_FINISH_SEMAPHORE = makeSymbol("_CSETF-PARITER-FINISH-SEMAPHORE");

    private static final SubLSymbol PARITER_PROCESS_POOL = makeSymbol("PARITER-PROCESS-POOL");

    private static final SubLSymbol _CSETF_PARITER_PROCESS_POOL = makeSymbol("_CSETF-PARITER-PROCESS-POOL");

    private static final SubLSymbol PARITER_PROGRESS_INDICATOR = makeSymbol("PARITER-PROGRESS-INDICATOR");

    private static final SubLSymbol _CSETF_PARITER_PROGRESS_INDICATOR = makeSymbol("_CSETF-PARITER-PROGRESS-INDICATOR");

    private static final SubLSymbol $SOURCE_ITERATOR = makeKeyword("SOURCE-ITERATOR");



    private static final SubLSymbol $SHARED_ARGS = makeKeyword("SHARED-ARGS");

    private static final SubLSymbol $SVS = makeKeyword("SVS");













    private static final SubLSymbol $REDUCER = makeKeyword("REDUCER");

    private static final SubLSymbol $FINAL_RESULT = makeKeyword("FINAL-RESULT");



    private static final SubLSymbol $BEGIN_SEMAPHORE = makeKeyword("BEGIN-SEMAPHORE");

    private static final SubLSymbol $FINISH_SEMAPHORE = makeKeyword("FINISH-SEMAPHORE");

    private static final SubLSymbol $PROCESS_POOL = makeKeyword("PROCESS-POOL");

    private static final SubLSymbol $PROGRESS_INDICATOR = makeKeyword("PROGRESS-INDICATOR");

    private static final SubLString $str60$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_PARALLEL_ITERATOR = makeSymbol("MAKE-PARALLEL-ITERATOR");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PARALLEL_ITERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARALLEL-ITERATOR-METHOD");



    private static final SubLSymbol ITERATOR_P = makeSymbol("ITERATOR-P");









    private static final SubLString $$$PARITER = makeString("PARITER");

    private static final SubLString $$$PARITER_begin = makeString("PARITER begin");

    private static final SubLString $$$PARITER_finish = makeString("PARITER finish");

    private static final SubLString $$$PARITER_process_ = makeString("PARITER process ");

    private static final SubLString $str76$_ = makeString("/");

    private static final SubLSymbol PARITER_PROCESS_METHOD = makeSymbol("PARITER-PROCESS-METHOD");

    private static final SubLString $$$PARITER_progress = makeString("PARITER progress");

    private static final SubLSymbol PARITER_PROGRESS_METHOD = makeSymbol("PARITER-PROGRESS-METHOD");

    private static final SubLSymbol $HALTED = makeKeyword("HALTED");



    private static final SubLString $$$PARITER_obtaining_items = makeString("PARITER obtaining items");

    private static final SubLString $$$PARITER_reducing_final_result = makeString("PARITER reducing final result");

    private static final SubLString $$$PARITER_incrementing_sofar = makeString("PARITER incrementing sofar");





    private static final SubLSymbol $parallel_filter_method$ = makeSymbol("*PARALLEL-FILTER-METHOD*");

    private static final SubLSymbol $parallel_key_method$ = makeSymbol("*PARALLEL-KEY-METHOD*");

    private static final SubLSymbol $sym89$_ = makeSymbol("+");

    private static final SubLSymbol PARALLEL_FILTER_MATCH_COUNT = makeSymbol("PARALLEL-FILTER-MATCH-COUNT");



    private static final SubLString $$$counting_assertions_ = makeString("counting assertions ");

    private static final SubLString $str93$_way = makeString("-way");



    static final boolean assertionsDisabledSynth = true;

    public static SubLObject parallel_extract_options(final SubLObject options) {
        return copy_list(options);
    }

    public static SubLObject parallel_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject parallel_iterator_p(final SubLObject v_object) {
        return v_object.getClass() == $parallel_iterator_native.class ? T : NIL;
    }

    public static SubLObject pariter_source_iterator(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject pariter_function(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject pariter_shared_args(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject pariter_svs(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject pariter_width(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject pariter_batch(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject pariter_total(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject pariter_sofar(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject pariter_message(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject pariter_initializer(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject pariter_reducer(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject pariter_final_result(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject pariter_lock(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField14();
    }

    public static SubLObject pariter_begin_semaphore(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField15();
    }

    public static SubLObject pariter_finish_semaphore(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField16();
    }

    public static SubLObject pariter_process_pool(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField17();
    }

    public static SubLObject pariter_progress_indicator(final SubLObject v_object) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.getField18();
    }

    public static SubLObject _csetf_pariter_source_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pariter_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_pariter_shared_args(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_pariter_svs(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_pariter_width(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_pariter_batch(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_pariter_total(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_pariter_sofar(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_pariter_message(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_pariter_initializer(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_pariter_reducer(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_pariter_final_result(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_pariter_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_pariter_begin_semaphore(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_pariter_finish_semaphore(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static SubLObject _csetf_pariter_process_pool(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField17(value);
    }

    public static SubLObject _csetf_pariter_progress_indicator(final SubLObject v_object, final SubLObject value) {
        assert NIL != parallel_iterator_p(v_object) : "parallelism_utilities.parallel_iterator_p error :" + v_object;
        return v_object.setField18(value);
    }

    public static SubLObject make_parallel_iterator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $parallel_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SOURCE_ITERATOR)) {
                _csetf_pariter_source_iterator(v_new, current_value);
            } else
                if (pcase_var.eql($FUNCTION)) {
                    _csetf_pariter_function(v_new, current_value);
                } else
                    if (pcase_var.eql($SHARED_ARGS)) {
                        _csetf_pariter_shared_args(v_new, current_value);
                    } else
                        if (pcase_var.eql($SVS)) {
                            _csetf_pariter_svs(v_new, current_value);
                        } else
                            if (pcase_var.eql($WIDTH)) {
                                _csetf_pariter_width(v_new, current_value);
                            } else
                                if (pcase_var.eql($BATCH)) {
                                    _csetf_pariter_batch(v_new, current_value);
                                } else
                                    if (pcase_var.eql($TOTAL)) {
                                        _csetf_pariter_total(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($SOFAR)) {
                                            _csetf_pariter_sofar(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($MESSAGE)) {
                                                _csetf_pariter_message(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($INITIALIZER)) {
                                                    _csetf_pariter_initializer(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($REDUCER)) {
                                                        _csetf_pariter_reducer(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($FINAL_RESULT)) {
                                                            _csetf_pariter_final_result(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($LOCK)) {
                                                                _csetf_pariter_lock(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($BEGIN_SEMAPHORE)) {
                                                                    _csetf_pariter_begin_semaphore(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($FINISH_SEMAPHORE)) {
                                                                        _csetf_pariter_finish_semaphore(v_new, current_value);
                                                                    } else
                                                                        if (pcase_var.eql($PROCESS_POOL)) {
                                                                            _csetf_pariter_process_pool(v_new, current_value);
                                                                        } else
                                                                            if (pcase_var.eql($PROGRESS_INDICATOR)) {
                                                                                _csetf_pariter_progress_indicator(v_new, current_value);
                                                                            } else {
                                                                                Errors.error($str60$Invalid_slot__S_for_construction_, current_arg);
                                                                            }
















        }
        return v_new;
    }

    public static SubLObject visit_defstruct_parallel_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PARALLEL_ITERATOR, SEVENTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SOURCE_ITERATOR, pariter_source_iterator(obj));
        funcall(visitor_fn, obj, $SLOT, $FUNCTION, pariter_function(obj));
        funcall(visitor_fn, obj, $SLOT, $SHARED_ARGS, pariter_shared_args(obj));
        funcall(visitor_fn, obj, $SLOT, $SVS, pariter_svs(obj));
        funcall(visitor_fn, obj, $SLOT, $WIDTH, pariter_width(obj));
        funcall(visitor_fn, obj, $SLOT, $BATCH, pariter_batch(obj));
        funcall(visitor_fn, obj, $SLOT, $TOTAL, pariter_total(obj));
        funcall(visitor_fn, obj, $SLOT, $SOFAR, pariter_sofar(obj));
        funcall(visitor_fn, obj, $SLOT, $MESSAGE, pariter_message(obj));
        funcall(visitor_fn, obj, $SLOT, $INITIALIZER, pariter_initializer(obj));
        funcall(visitor_fn, obj, $SLOT, $REDUCER, pariter_reducer(obj));
        funcall(visitor_fn, obj, $SLOT, $FINAL_RESULT, pariter_final_result(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCK, pariter_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $BEGIN_SEMAPHORE, pariter_begin_semaphore(obj));
        funcall(visitor_fn, obj, $SLOT, $FINISH_SEMAPHORE, pariter_finish_semaphore(obj));
        funcall(visitor_fn, obj, $SLOT, $PROCESS_POOL, pariter_process_pool(obj));
        funcall(visitor_fn, obj, $SLOT, $PROGRESS_INDICATOR, pariter_progress_indicator(obj));
        funcall(visitor_fn, obj, $END, MAKE_PARALLEL_ITERATOR, SEVENTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_parallel_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_parallel_iterator(obj, visitor_fn);
    }

    public static SubLObject new_parallel_iterator(final SubLObject function, final SubLObject iterator, final SubLObject options) {
        assert NIL != function_spec_p(function) : "Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) " + function;
        assert NIL != iteration.iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
        final SubLObject shared_args_tail = property_list_member($SHARED_ARGS, options);
        final SubLObject shared_args = (NIL != shared_args_tail) ? cadr(shared_args_tail) : NIL;
        final SubLObject svs_tail = property_list_member($SVS, options);
        final SubLObject svs = (NIL != svs_tail) ? cadr(svs_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, options);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : TWO_INTEGER;
        final SubLObject total_tail = property_list_member($TOTAL, options);
        final SubLObject total = (NIL != total_tail) ? cadr(total_tail) : NIL;
        final SubLObject batch_tail = property_list_member($BATCH, options);
        SubLObject batch = (NIL != batch_tail) ? cadr(batch_tail) : ONE_INTEGER;
        final SubLObject message_tail = property_list_member($MESSAGE, options);
        final SubLObject message = (NIL != message_tail) ? cadr(message_tail) : NIL;
        final SubLObject initializer_tail = property_list_member($INITIALIZER, options);
        final SubLObject initializer = (NIL != initializer_tail) ? cadr(initializer_tail) : NIL;
        final SubLObject reducer_tail = property_list_member($REDUCER, options);
        final SubLObject reducer = (NIL != reducer_tail) ? cadr(reducer_tail) : NIL;
        assert NIL != subl_promotions.positive_integer_p(width) : "subl_promotions.positive_integer_p(width) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(width) " + width;
        if (NIL == batch) {
            assert NIL != subl_promotions.non_negative_integer_p(total) : "subl_promotions.non_negative_integer_p(total) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(total) " + total;
            batch = max(ONE_INTEGER, ceiling(integerDivide(total, width), UNPROVIDED));
        }
        assert NIL != subl_promotions.non_negative_integer_p(batch) : "subl_promotions.non_negative_integer_p(batch) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(batch) " + batch;
        if (((NIL != message) && (!assertionsDisabledSynth)) && (NIL == stringp(message))) {
            throw new AssertionError(message);
        }
        final SubLObject pariter = make_parallel_iterator(UNPROVIDED);
        _csetf_pariter_source_iterator(pariter, iterator);
        _csetf_pariter_function(pariter, function);
        _csetf_pariter_shared_args(pariter, shared_args);
        _csetf_pariter_svs(pariter, svs);
        _csetf_pariter_width(pariter, width);
        _csetf_pariter_batch(pariter, batch);
        _csetf_pariter_total(pariter, total);
        _csetf_pariter_sofar(pariter, ZERO_INTEGER);
        _csetf_pariter_message(pariter, message);
        _csetf_pariter_initializer(pariter, initializer);
        _csetf_pariter_reducer(pariter, reducer);
        _csetf_pariter_final_result(pariter, $UNINITIALIZED);
        _csetf_pariter_lock(pariter, make_lock($$$PARITER));
        _csetf_pariter_begin_semaphore(pariter, Semaphores.new_semaphore($$$PARITER_begin, ZERO_INTEGER));
        _csetf_pariter_finish_semaphore(pariter, Semaphores.new_semaphore($$$PARITER_finish, ZERO_INTEGER));
        _csetf_pariter_process_pool(pariter, make_pariter_process_pool(pariter));
        _csetf_pariter_progress_indicator(pariter, pariter_possibly_start_progress_indicator(pariter));
        return pariter;
    }

    public static SubLObject make_pariter_process_pool(final SubLObject pariter) {
        final SubLObject width = pariter_width(pariter);
        final SubLObject pool = make_vector(width, $UNINITIALIZED);
        SubLObject i;
        SubLObject name;
        SubLObject args;
        SubLObject process;
        for (i = NIL, i = ZERO_INTEGER; i.numL(width); i = add(i, ONE_INTEGER)) {
            name = cconcatenate($$$PARITER_process_, new SubLObject[]{ format_nil.format_nil_a_no_copy(i), $str76$_, format_nil.format_nil_a_no_copy(width) });
            args = list(pariter, i);
            process = subl_promotions.make_process_with_args(name, PARITER_PROCESS_METHOD, args);
            set_aref(pool, i, process);
        }
        return pool;
    }

    public static SubLObject pariter_possibly_start_progress_indicator(final SubLObject pariter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = pariter_message(pariter);
        if (message.isString()) {
            final SubLObject name = copy_seq($$$PARITER_progress);
            final SubLObject args = list(pariter, StreamsLow.$standard_output$.getDynamicValue(thread));
            final SubLObject progress_indicator = subl_promotions.make_process_with_args(name, PARITER_PROGRESS_METHOD, args);
            return progress_indicator;
        }
        return NIL;
    }

    public static SubLObject parallel_map_iterator(final SubLObject function, final SubLObject iterator, SubLObject options) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        final SubLObject pariter = new_parallel_iterator(function, iterator, options);
        SubLObject result = NIL;
        SubLObject validP = NIL;
        try {
            result = parallel_iterator_process(pariter);
            validP = T;
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                parallel_iterator_finalize(pariter);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return values(result, validP);
    }

    public static SubLObject parallel_iterator_process(final SubLObject pariter) {
        pariter_initialize_final_result(pariter);
        pariter_signal_pool_to_begin(pariter);
        pariter_wait_for_pool_to_finish(pariter);
        return pariter_final_result(pariter);
    }

    public static SubLObject parallel_iterator_finalize(final SubLObject pariter) {
        SubLObject result = NIL;
        try {
            final SubLObject iterator = pariter_source_iterator(pariter);
            iteration.iteration_finalize(iterator);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                result = pariter_possibly_halt_process_pool(pariter);
                result = pariter_possibly_halt_progress_indicator(pariter);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static SubLObject pariter_initialize_final_result(final SubLObject pariter) {
        final SubLObject final_result = pariter_initialize_batch_result(pariter);
        final SubLObject lock = pariter_lock(pariter);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_pariter_final_result(pariter, final_result);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return final_result;
    }

    public static SubLObject pariter_signal_pool_to_begin(final SubLObject pariter) {
        final SubLObject begin = pariter_begin_semaphore(pariter);
        SubLObject width;
        SubLObject i;
        for (width = pariter_width(pariter), i = NIL, i = ZERO_INTEGER; i.numL(width); i = add(i, ONE_INTEGER)) {
            Semaphores.semaphore_signal(begin);
        }
        return width;
    }

    public static SubLObject pariter_wait_for_pool_to_finish(final SubLObject pariter) {
        final SubLObject finish = pariter_finish_semaphore(pariter);
        SubLObject width;
        SubLObject i;
        for (width = pariter_width(pariter), i = NIL, i = ZERO_INTEGER; i.numL(width); i = add(i, ONE_INTEGER)) {
            Semaphores.semaphore_wait(finish);
        }
        return width;
    }

    public static SubLObject pariter_possibly_halt_process_pool(final SubLObject pariter) {
        final SubLObject process_pool = pariter_process_pool(pariter);
        SubLObject halted = ZERO_INTEGER;
        final SubLObject lock = pariter_lock(pariter);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject vector_var = process_pool;
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject index;
            SubLObject process;
            SubLObject haltedP;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                index = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                process = aref(vector_var, index);
                haltedP = pariter_possibly_halt_process(process);
                set_aref(process_pool, index, NIL != haltedP ? $HALTED : $FINISHED);
                halted = add(halted, NIL != haltedP ? ONE_INTEGER : ZERO_INTEGER);
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return halted;
    }

    public static SubLObject pariter_possibly_halt_process(final SubLObject process) {
        if (NIL != valid_process_p(process)) {
            kill_process(process);
            return T;
        }
        return NIL;
    }

    public static SubLObject pariter_possibly_halt_progress_indicator(final SubLObject pariter) {
        final SubLObject progress_indicator = pariter_progress_indicator(pariter);
        if (NIL != processp(progress_indicator)) {
            return pariter_possibly_halt_process(progress_indicator);
        }
        return NIL;
    }

    public static SubLObject current_pariter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_pariter$.getDynamicValue(thread);
    }

    public static SubLObject current_pariter_index() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_pariter_index$.getDynamicValue(thread);
    }

    public static SubLObject current_pariter_width() {
        final SubLObject pariter = current_pariter();
        if (NIL != pariter) {
            return pariter_width(pariter);
        }
        return NIL;
    }

    public static SubLObject pariter_process_method(final SubLObject pariter, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        final SubLObject _prev_bind_0 = $current_pariter$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $current_pariter_index$.currentBinding(thread);
        try {
            $current_pariter$.bind(pariter, thread);
            $current_pariter_index$.bind(index, thread);
            final SubLObject svs = pariter_svs(pariter);
            pariter_wait_to_begin(pariter);
            try {
                final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs);
                final ArrayList old_values = extract_dynamic_values(cprogv_var);
                try {
                    bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs));
                    while (NIL == pariter_doneP(pariter)) {
                        final SubLObject batch_items = pariter_obtain_batch_items(pariter);
                        final SubLObject batch_result = pariter_process_batch_items(pariter, batch_items);
                        pariter_reduce_final_result(pariter, batch_result);
                    } 
                    successP = T;
                } finally {
                    rebind_dynamic_vars(cprogv_var, old_values);
                }
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    pariter_signal_finish(pariter, successP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            $current_pariter_index$.rebind(_prev_bind_2, thread);
            $current_pariter$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }

    public static SubLObject pariter_wait_to_begin(final SubLObject pariter) {
        final SubLObject begin = pariter_begin_semaphore(pariter);
        return Semaphores.semaphore_wait(begin);
    }

    public static SubLObject pariter_doneP(final SubLObject pariter) {
        return iteration.iteration_done(pariter_source_iterator(pariter));
    }

    public static SubLObject pariter_obtain_batch_items(final SubLObject pariter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = pariter_source_iterator(pariter);
        final SubLObject lock = pariter_lock(pariter);
        final SubLObject whostate = $$$PARITER_obtaining_items;
        final SubLObject batch_size = pariter_batch(pariter);
        SubLObject batch_count = ZERO_INTEGER;
        SubLObject batch_items = NIL;
        SubLObject quit_earlyP = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            while (((NIL == quit_earlyP) && (!batch_count.numGE(batch_size))) && (NIL == iteration.iteration_done(iterator))) {
                thread.resetMultipleValues();
                final SubLObject batch_item = iteration.iteration_next(iterator);
                final SubLObject validP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != validP) {
                    batch_items = cons(batch_item, batch_items);
                    batch_count = add(batch_count, ONE_INTEGER);
                } else {
                    quit_earlyP = T;
                }
            } 
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return nreverse(batch_items);
    }

    public static SubLObject pariter_process_batch_items(final SubLObject pariter, final SubLObject batch_items) {
        final SubLObject function = pariter_function(pariter);
        final SubLObject shared_args = pariter_shared_args(pariter);
        SubLObject batch_result = pariter_initialize_batch_result(pariter);
        final SubLObject reducer = pariter_reducer(pariter);
        SubLObject cdolist_list_var = batch_items;
        SubLObject batch_item = NIL;
        batch_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_result = pariter_process_apply(function, batch_item, shared_args);
            batch_result = pariter_reduce_within_batch(reducer, batch_result, item_result);
            cdolist_list_var = cdolist_list_var.rest();
            batch_item = cdolist_list_var.first();
        } 
        pariter_increment_sofar(pariter, length(batch_items));
        return batch_result;
    }

    public static SubLObject pariter_reduce_final_result(final SubLObject pariter, final SubLObject batch_result) {
        final SubLObject reducer = pariter_reducer(pariter);
        if (NIL != reducer) {
            final SubLObject lock = pariter_lock(pariter);
            final SubLObject whostate = $$$PARITER_reducing_final_result;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                SubLObject final_result = pariter_final_result(pariter);
                final_result = funcall(reducer, final_result, batch_result);
                _csetf_pariter_final_result(pariter, final_result);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject pariter_signal_finish(final SubLObject pariter, final SubLObject successP) {
        return Semaphores.semaphore_signal(pariter_finish_semaphore(pariter));
    }

    public static SubLObject pariter_initialize_batch_result(final SubLObject pariter) {
        final SubLObject initializer = pariter_initializer(pariter);
        SubLObject batch_result = NIL;
        if (NIL != initializer) {
            if (initializer.isFunctionSpec()) {
                batch_result = funcall(initializer);
            } else
                if (NIL != list_utilities.self_evaluating_form_p(initializer)) {
                    batch_result = initializer;
                } else {
                    batch_result = eval_in_api.cyc_api_eval(initializer);
                }

        }
        return batch_result;
    }

    public static SubLObject pariter_process_apply(final SubLObject function, final SubLObject batch_item, SubLObject shared_args) {
        if (shared_args == UNPROVIDED) {
            shared_args = NIL;
        }
        if (NIL != shared_args) {
            return apply(function, batch_item, shared_args);
        }
        return funcall(function, batch_item);
    }

    public static SubLObject pariter_reduce_within_batch(final SubLObject reducer, final SubLObject batch_result, final SubLObject item_result) {
        if (NIL != reducer) {
            return funcall(reducer, batch_result, item_result);
        }
        return NIL;
    }

    public static SubLObject pariter_increment_sofar(final SubLObject pariter, final SubLObject delta) {
        final SubLObject lock = pariter_lock(pariter);
        final SubLObject whostate = $$$PARITER_incrementing_sofar;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_pariter_sofar(pariter, add(pariter_sofar(pariter), delta));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return delta;
    }

    public static SubLObject pariter_progress_method(final SubLObject pariter, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = pariter_message(pariter);
        SubLTrampolineFile.enforceType(message, STRINGP);
        if (NIL != pariter_total(pariter)) {
            final SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
            try {
                StreamsLow.$standard_output$.bind(stream, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message);
                    while (NIL == pariter_doneP(pariter)) {
                        sleep(ONE_INTEGER);
                        note_percent_progress(pariter_sofar(pariter), pariter_total(pariter));
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                StreamsLow.$standard_output$.rebind(_prev_bind_0, thread);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject parallel_map_assertions(final SubLObject function, SubLObject options) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        return parallel_map_iterator(function, assertion_handles.new_assertions_iterator(), options);
    }

    public static SubLObject parallel_map_deductions(final SubLObject function, SubLObject options) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        return parallel_map_iterator(function, deduction_handles.new_deductions_iterator(), options);
    }

    public static SubLObject parallel_mapc(final SubLObject function, final SubLObject list, SubLObject options) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        final SubLObject total = length(list);
        final SubLObject overrides = list($TOTAL, total, $REDUCER, NIL, $INITIALIZER, NIL);
        final SubLObject updated_options = list_utilities.merge_plist(options, overrides);
        final SubLObject iterator = iteration.new_list_iterator(list);
        parallel_map_iterator(function, iterator, updated_options);
        return list;
    }

    public static SubLObject parallel_count_if(final SubLObject test, final SubLObject seq, SubLObject options) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        final SubLObject current;
        final SubLObject datum = current = options;
        final SubLObject key_tail = property_list_member($KEY, current);
        final SubLObject key = (NIL != key_tail) ? cadr(key_tail) : IDENTITY;
        final SubLObject start_tail = property_list_member($START, current);
        final SubLObject start = (NIL != start_tail) ? cadr(start_tail) : ZERO_INTEGER;
        final SubLObject end_tail = property_list_member($END, current);
        final SubLObject end = (NIL != end_tail) ? cadr(end_tail) : NIL;
        final SubLObject svs_tail = property_list_member($SVS, current);
        final SubLObject svs = (NIL != svs_tail) ? cadr(svs_tail) : NIL;
        final SubLObject source_iterator = iteration.new_sequence_iterator(seq, start, end);
        final SubLObject source_svs = (NIL != svs) ? special_variable_state.copy_special_variable_state(svs) : NIL;
        final SubLObject override_svs = special_variable_state.new_special_variable_state_from_alist(list(bq_cons($parallel_filter_method$, test), bq_cons($parallel_key_method$, key)));
        final SubLObject extended_svs = (NIL != source_svs) ? special_variable_state.nmerge_special_variable_state(source_svs, override_svs) : override_svs;
        final SubLObject source_options = parallel_extract_options(options);
        final SubLObject override_options = list($SVS, extended_svs, $TOTAL, length(seq), $INITIALIZER, ZERO_INTEGER, $REDUCER, $sym89$_);
        final SubLObject parallel_options = list_utilities.merge_plist(source_options, override_options);
        final SubLObject result = parallel_map_iterator(PARALLEL_FILTER_MATCH_COUNT, source_iterator, parallel_options);
        return result;
    }

    public static SubLObject parallel_filter_match_count(final SubLObject item) {
        return enumeration_types.boolean_to_match_count(parallel_filter_matchP(item));
    }

    public static SubLObject parallel_filter_matchP(SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        item = funcall($parallel_key_method$.getDynamicValue(thread), item);
        return funcall($parallel_filter_method$.getDynamicValue(thread), item);
    }

    public static SubLObject test_parallel_count_assertions(SubLObject width, SubLObject batch) {
        if (width == UNPROVIDED) {
            width = TWO_INTEGER;
        }
        if (batch == UNPROVIDED) {
            batch = $int$1000;
        }
        final SubLObject options = list(new SubLObject[]{ $WIDTH, width, $SVS, NIL, $BATCH, batch, $TOTAL, assertion_handles.assertion_count(), $REDUCER, $sym89$_, $INITIALIZER, ZERO_INTEGER, $MESSAGE, cconcatenate($$$counting_assertions_, new SubLObject[]{ format_nil.format_nil_a_no_copy(width), $str93$_way }) });
        final SubLObject result = parallel_map_assertions(ONE, options);
        return result;
    }

    public static SubLObject declare_parallelism_utilities_file() {
        declareFunction("parallel_extract_options", "PARALLEL-EXTRACT-OPTIONS", 1, 0, false);
        declareFunction("parallel_iterator_print_function_trampoline", "PARALLEL-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("parallel_iterator_p", "PARALLEL-ITERATOR-P", 1, 0, false);
        new parallelism_utilities.$parallel_iterator_p$UnaryFunction();
        declareFunction("pariter_source_iterator", "PARITER-SOURCE-ITERATOR", 1, 0, false);
        declareFunction("pariter_function", "PARITER-FUNCTION", 1, 0, false);
        declareFunction("pariter_shared_args", "PARITER-SHARED-ARGS", 1, 0, false);
        declareFunction("pariter_svs", "PARITER-SVS", 1, 0, false);
        declareFunction("pariter_width", "PARITER-WIDTH", 1, 0, false);
        declareFunction("pariter_batch", "PARITER-BATCH", 1, 0, false);
        declareFunction("pariter_total", "PARITER-TOTAL", 1, 0, false);
        declareFunction("pariter_sofar", "PARITER-SOFAR", 1, 0, false);
        declareFunction("pariter_message", "PARITER-MESSAGE", 1, 0, false);
        declareFunction("pariter_initializer", "PARITER-INITIALIZER", 1, 0, false);
        declareFunction("pariter_reducer", "PARITER-REDUCER", 1, 0, false);
        declareFunction("pariter_final_result", "PARITER-FINAL-RESULT", 1, 0, false);
        declareFunction("pariter_lock", "PARITER-LOCK", 1, 0, false);
        declareFunction("pariter_begin_semaphore", "PARITER-BEGIN-SEMAPHORE", 1, 0, false);
        declareFunction("pariter_finish_semaphore", "PARITER-FINISH-SEMAPHORE", 1, 0, false);
        declareFunction("pariter_process_pool", "PARITER-PROCESS-POOL", 1, 0, false);
        declareFunction("pariter_progress_indicator", "PARITER-PROGRESS-INDICATOR", 1, 0, false);
        declareFunction("_csetf_pariter_source_iterator", "_CSETF-PARITER-SOURCE-ITERATOR", 2, 0, false);
        declareFunction("_csetf_pariter_function", "_CSETF-PARITER-FUNCTION", 2, 0, false);
        declareFunction("_csetf_pariter_shared_args", "_CSETF-PARITER-SHARED-ARGS", 2, 0, false);
        declareFunction("_csetf_pariter_svs", "_CSETF-PARITER-SVS", 2, 0, false);
        declareFunction("_csetf_pariter_width", "_CSETF-PARITER-WIDTH", 2, 0, false);
        declareFunction("_csetf_pariter_batch", "_CSETF-PARITER-BATCH", 2, 0, false);
        declareFunction("_csetf_pariter_total", "_CSETF-PARITER-TOTAL", 2, 0, false);
        declareFunction("_csetf_pariter_sofar", "_CSETF-PARITER-SOFAR", 2, 0, false);
        declareFunction("_csetf_pariter_message", "_CSETF-PARITER-MESSAGE", 2, 0, false);
        declareFunction("_csetf_pariter_initializer", "_CSETF-PARITER-INITIALIZER", 2, 0, false);
        declareFunction("_csetf_pariter_reducer", "_CSETF-PARITER-REDUCER", 2, 0, false);
        declareFunction("_csetf_pariter_final_result", "_CSETF-PARITER-FINAL-RESULT", 2, 0, false);
        declareFunction("_csetf_pariter_lock", "_CSETF-PARITER-LOCK", 2, 0, false);
        declareFunction("_csetf_pariter_begin_semaphore", "_CSETF-PARITER-BEGIN-SEMAPHORE", 2, 0, false);
        declareFunction("_csetf_pariter_finish_semaphore", "_CSETF-PARITER-FINISH-SEMAPHORE", 2, 0, false);
        declareFunction("_csetf_pariter_process_pool", "_CSETF-PARITER-PROCESS-POOL", 2, 0, false);
        declareFunction("_csetf_pariter_progress_indicator", "_CSETF-PARITER-PROGRESS-INDICATOR", 2, 0, false);
        declareFunction("make_parallel_iterator", "MAKE-PARALLEL-ITERATOR", 0, 1, false);
        declareFunction("visit_defstruct_parallel_iterator", "VISIT-DEFSTRUCT-PARALLEL-ITERATOR", 2, 0, false);
        declareFunction("visit_defstruct_object_parallel_iterator_method", "VISIT-DEFSTRUCT-OBJECT-PARALLEL-ITERATOR-METHOD", 2, 0, false);
        declareFunction("new_parallel_iterator", "NEW-PARALLEL-ITERATOR", 3, 0, false);
        declareFunction("make_pariter_process_pool", "MAKE-PARITER-PROCESS-POOL", 1, 0, false);
        declareFunction("pariter_possibly_start_progress_indicator", "PARITER-POSSIBLY-START-PROGRESS-INDICATOR", 1, 0, false);
        declareFunction("parallel_map_iterator", "PARALLEL-MAP-ITERATOR", 2, 1, false);
        declareFunction("parallel_iterator_process", "PARALLEL-ITERATOR-PROCESS", 1, 0, false);
        declareFunction("parallel_iterator_finalize", "PARALLEL-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("pariter_initialize_final_result", "PARITER-INITIALIZE-FINAL-RESULT", 1, 0, false);
        declareFunction("pariter_signal_pool_to_begin", "PARITER-SIGNAL-POOL-TO-BEGIN", 1, 0, false);
        declareFunction("pariter_wait_for_pool_to_finish", "PARITER-WAIT-FOR-POOL-TO-FINISH", 1, 0, false);
        declareFunction("pariter_possibly_halt_process_pool", "PARITER-POSSIBLY-HALT-PROCESS-POOL", 1, 0, false);
        declareFunction("pariter_possibly_halt_process", "PARITER-POSSIBLY-HALT-PROCESS", 1, 0, false);
        declareFunction("pariter_possibly_halt_progress_indicator", "PARITER-POSSIBLY-HALT-PROGRESS-INDICATOR", 1, 0, false);
        declareFunction("current_pariter", "CURRENT-PARITER", 0, 0, false);
        declareFunction("current_pariter_index", "CURRENT-PARITER-INDEX", 0, 0, false);
        declareFunction("current_pariter_width", "CURRENT-PARITER-WIDTH", 0, 0, false);
        declareFunction("pariter_process_method", "PARITER-PROCESS-METHOD", 2, 0, false);
        declareFunction("pariter_wait_to_begin", "PARITER-WAIT-TO-BEGIN", 1, 0, false);
        declareFunction("pariter_doneP", "PARITER-DONE?", 1, 0, false);
        declareFunction("pariter_obtain_batch_items", "PARITER-OBTAIN-BATCH-ITEMS", 1, 0, false);
        declareFunction("pariter_process_batch_items", "PARITER-PROCESS-BATCH-ITEMS", 2, 0, false);
        declareFunction("pariter_reduce_final_result", "PARITER-REDUCE-FINAL-RESULT", 2, 0, false);
        declareFunction("pariter_signal_finish", "PARITER-SIGNAL-FINISH", 2, 0, false);
        declareFunction("pariter_initialize_batch_result", "PARITER-INITIALIZE-BATCH-RESULT", 1, 0, false);
        declareFunction("pariter_process_apply", "PARITER-PROCESS-APPLY", 2, 1, false);
        declareFunction("pariter_reduce_within_batch", "PARITER-REDUCE-WITHIN-BATCH", 3, 0, false);
        declareFunction("pariter_increment_sofar", "PARITER-INCREMENT-SOFAR", 2, 0, false);
        declareFunction("pariter_progress_method", "PARITER-PROGRESS-METHOD", 2, 0, false);
        declareFunction("parallel_map_assertions", "PARALLEL-MAP-ASSERTIONS", 1, 1, false);
        declareFunction("parallel_map_deductions", "PARALLEL-MAP-DEDUCTIONS", 1, 1, false);
        declareFunction("parallel_mapc", "PARALLEL-MAPC", 2, 1, false);
        declareFunction("parallel_count_if", "PARALLEL-COUNT-IF", 2, 1, false);
        declareFunction("parallel_filter_match_count", "PARALLEL-FILTER-MATCH-COUNT", 1, 0, false);
        declareFunction("parallel_filter_matchP", "PARALLEL-FILTER-MATCH?", 1, 0, false);
        declareFunction("test_parallel_count_assertions", "TEST-PARALLEL-COUNT-ASSERTIONS", 0, 2, false);
        return NIL;
    }

    public static SubLObject init_parallelism_utilities_file() {
        defconstant("*DTP-PARALLEL-ITERATOR*", PARALLEL_ITERATOR);
        defparameter("*CURRENT-PARITER*", $UNINITIALIZED);
        defparameter("*CURRENT-PARITER-INDEX*", $UNINITIALIZED);
        defparameter("*PARALLEL-FILTER-METHOD*", $UNINITIALIZED);
        defparameter("*PARALLEL-KEY-METHOD*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_parallelism_utilities_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_parallel_iterator$.getGlobalValue(), symbol_function(PARALLEL_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(PARITER_SOURCE_ITERATOR, _CSETF_PARITER_SOURCE_ITERATOR);
        def_csetf(PARITER_FUNCTION, _CSETF_PARITER_FUNCTION);
        def_csetf(PARITER_SHARED_ARGS, _CSETF_PARITER_SHARED_ARGS);
        def_csetf(PARITER_SVS, _CSETF_PARITER_SVS);
        def_csetf(PARITER_WIDTH, _CSETF_PARITER_WIDTH);
        def_csetf(PARITER_BATCH, _CSETF_PARITER_BATCH);
        def_csetf(PARITER_TOTAL, _CSETF_PARITER_TOTAL);
        def_csetf(PARITER_SOFAR, _CSETF_PARITER_SOFAR);
        def_csetf(PARITER_MESSAGE, _CSETF_PARITER_MESSAGE);
        def_csetf(PARITER_INITIALIZER, _CSETF_PARITER_INITIALIZER);
        def_csetf(PARITER_REDUCER, _CSETF_PARITER_REDUCER);
        def_csetf(PARITER_FINAL_RESULT, _CSETF_PARITER_FINAL_RESULT);
        def_csetf(PARITER_LOCK, _CSETF_PARITER_LOCK);
        def_csetf(PARITER_BEGIN_SEMAPHORE, _CSETF_PARITER_BEGIN_SEMAPHORE);
        def_csetf(PARITER_FINISH_SEMAPHORE, _CSETF_PARITER_FINISH_SEMAPHORE);
        def_csetf(PARITER_PROCESS_POOL, _CSETF_PARITER_PROCESS_POOL);
        def_csetf(PARITER_PROGRESS_INDICATOR, _CSETF_PARITER_PROGRESS_INDICATOR);
        identity(PARALLEL_ITERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_parallel_iterator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PARALLEL_ITERATOR_METHOD));
        note_funcall_helper_function(PARITER_PROCESS_METHOD);
        note_funcall_helper_function(PARITER_PROGRESS_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_parallelism_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_parallelism_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_parallelism_utilities_file();
    }

    

    public static final class $parallel_iterator_native extends SubLStructNative {
        public SubLObject $source_iterator;

        public SubLObject $function;

        public SubLObject $shared_args;

        public SubLObject $svs;

        public SubLObject $width;

        public SubLObject $batch;

        public SubLObject $total;

        public SubLObject $sofar;

        public SubLObject $message;

        public SubLObject $initializer;

        public SubLObject $reducer;

        public SubLObject $final_result;

        public SubLObject $lock;

        public SubLObject $begin_semaphore;

        public SubLObject $finish_semaphore;

        public SubLObject $process_pool;

        public SubLObject $progress_indicator;

        private static final SubLStructDeclNative structDecl;

        private $parallel_iterator_native() {
            this.$source_iterator = Lisp.NIL;
            this.$function = Lisp.NIL;
            this.$shared_args = Lisp.NIL;
            this.$svs = Lisp.NIL;
            this.$width = Lisp.NIL;
            this.$batch = Lisp.NIL;
            this.$total = Lisp.NIL;
            this.$sofar = Lisp.NIL;
            this.$message = Lisp.NIL;
            this.$initializer = Lisp.NIL;
            this.$reducer = Lisp.NIL;
            this.$final_result = Lisp.NIL;
            this.$lock = Lisp.NIL;
            this.$begin_semaphore = Lisp.NIL;
            this.$finish_semaphore = Lisp.NIL;
            this.$process_pool = Lisp.NIL;
            this.$progress_indicator = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$source_iterator;
        }

        @Override
        public SubLObject getField3() {
            return this.$function;
        }

        @Override
        public SubLObject getField4() {
            return this.$shared_args;
        }

        @Override
        public SubLObject getField5() {
            return this.$svs;
        }

        @Override
        public SubLObject getField6() {
            return this.$width;
        }

        @Override
        public SubLObject getField7() {
            return this.$batch;
        }

        @Override
        public SubLObject getField8() {
            return this.$total;
        }

        @Override
        public SubLObject getField9() {
            return this.$sofar;
        }

        @Override
        public SubLObject getField10() {
            return this.$message;
        }

        @Override
        public SubLObject getField11() {
            return this.$initializer;
        }

        @Override
        public SubLObject getField12() {
            return this.$reducer;
        }

        @Override
        public SubLObject getField13() {
            return this.$final_result;
        }

        @Override
        public SubLObject getField14() {
            return this.$lock;
        }

        @Override
        public SubLObject getField15() {
            return this.$begin_semaphore;
        }

        @Override
        public SubLObject getField16() {
            return this.$finish_semaphore;
        }

        @Override
        public SubLObject getField17() {
            return this.$process_pool;
        }

        @Override
        public SubLObject getField18() {
            return this.$progress_indicator;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$source_iterator = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$function = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$shared_args = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$svs = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$width = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$batch = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$total = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$sofar = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$message = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$initializer = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$reducer = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$final_result = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return this.$begin_semaphore = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return this.$finish_semaphore = value;
        }

        @Override
        public SubLObject setField17(final SubLObject value) {
            return this.$process_pool = value;
        }

        @Override
        public SubLObject setField18(final SubLObject value) {
            return this.$progress_indicator = value;
        }

        static {
            structDecl = makeStructDeclNative($parallel_iterator_native.class, PARALLEL_ITERATOR, PARALLEL_ITERATOR_P, $list2, $list3, new String[]{ "$source_iterator", "$function", "$shared_args", "$svs", "$width", "$batch", "$total", "$sofar", "$message", "$initializer", "$reducer", "$final_result", "$lock", "$begin_semaphore", "$finish_semaphore", "$process_pool", "$progress_indicator" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $parallel_iterator_p$UnaryFunction extends UnaryFunction {
        public $parallel_iterator_p$UnaryFunction() {
            super(extractFunctionNamed("PARALLEL-ITERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return parallel_iterator_p(arg1);
        }
    }
}

/**
 * Total time: 286 ms synthetic
 */
