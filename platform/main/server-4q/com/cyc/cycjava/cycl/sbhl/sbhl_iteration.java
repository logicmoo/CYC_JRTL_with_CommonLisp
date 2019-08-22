package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.binary_tree;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
 public final class sbhl_iteration extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_iteration();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_iteration";

    public static final String myFingerPrint = "3008f15e60c7eb93b68b385ad71952d8914e6c5c8e4ab44cd3f9919eef3d8a83";

    // defparameter
    public static final SubLSymbol $sbhl_iterator_store$ = makeSymbol("*SBHL-ITERATOR-STORE*");

    // deflexical
    private static final SubLSymbol $sbhl_iterator_store_max$ = makeSymbol("*SBHL-ITERATOR-STORE-MAX*");

    // defconstant
    public static final SubLSymbol $dtp_sbhl_iterator$ = makeSymbol("*DTP-SBHL-ITERATOR*");

    // deflexical
    private static final SubLSymbol $sbhl_null_iterator$ = makeSymbol("*SBHL-NULL-ITERATOR*");



    public static final SubLList $list1 = list(list(makeSymbol("*SBHL-ITERATOR-STORE*"), list(makeSymbol("FIF"), list(makeSymbol("WITHIN-SBHL-ITERATOR-RESOURCING?")), makeSymbol("*SBHL-ITERATOR-STORE*"), list(makeSymbol("NEW-SBHL-STACK"), makeSymbol("*SBHL-ITERATOR-STORE-MAX*")))));

    public static final SubLSymbol SBHL_ITERATOR = makeSymbol("SBHL-ITERATOR");

    public static final SubLSymbol SBHL_ITERATOR_P = makeSymbol("SBHL-ITERATOR-P");

    public static final SubLList $list4 = list(makeSymbol("STATE"), makeSymbol("DONE"), makeSymbol("NEXT"), makeSymbol("FINALIZE"));

    public static final SubLList $list5 = list(makeKeyword("STATE"), makeKeyword("DONE"), makeKeyword("NEXT"), makeKeyword("FINALIZE"));

    public static final SubLList $list6 = list(makeSymbol("SBHL-IT-STATE"), makeSymbol("SBHL-IT-DONE"), makeSymbol("SBHL-IT-NEXT"), makeSymbol("SBHL-IT-FINALIZE"));

    public static final SubLList $list7 = list(makeSymbol("_CSETF-SBHL-IT-STATE"), makeSymbol("_CSETF-SBHL-IT-DONE"), makeSymbol("_CSETF-SBHL-IT-NEXT"), makeSymbol("_CSETF-SBHL-IT-FINALIZE"));

    public static final SubLSymbol PRINT_SBHL_ITERATOR = makeSymbol("PRINT-SBHL-ITERATOR");

    public static final SubLSymbol SBHL_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list10 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SBHL-ITERATOR-P"));

    private static final SubLSymbol SBHL_IT_STATE = makeSymbol("SBHL-IT-STATE");

    private static final SubLSymbol _CSETF_SBHL_IT_STATE = makeSymbol("_CSETF-SBHL-IT-STATE");

    private static final SubLSymbol SBHL_IT_DONE = makeSymbol("SBHL-IT-DONE");

    private static final SubLSymbol _CSETF_SBHL_IT_DONE = makeSymbol("_CSETF-SBHL-IT-DONE");

    private static final SubLSymbol SBHL_IT_NEXT = makeSymbol("SBHL-IT-NEXT");

    private static final SubLSymbol _CSETF_SBHL_IT_NEXT = makeSymbol("_CSETF-SBHL-IT-NEXT");

    private static final SubLSymbol SBHL_IT_FINALIZE = makeSymbol("SBHL-IT-FINALIZE");

    private static final SubLSymbol _CSETF_SBHL_IT_FINALIZE = makeSymbol("_CSETF-SBHL-IT-FINALIZE");









    private static final SubLString $str23$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SBHL_ITERATOR = makeSymbol("MAKE-SBHL-ITERATOR");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SBHL_ITERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SBHL-ITERATOR-METHOD");

    private static final SubLString $$$_DONE = makeString(" DONE");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-DONE");

    private static final SubLSymbol SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-DONE");

    private static final SubLSymbol SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-DONE");

    private static final SubLSymbol SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-DONE");

    private static final SubLSymbol SBHL_LIST_ITERATOR_DONE = makeSymbol("SBHL-LIST-ITERATOR-DONE");

    private static final SubLSymbol SBHL_ALIST_ITERATOR_DONE = makeSymbol("SBHL-ALIST-ITERATOR-DONE");

    private static final SubLSymbol SBHL_HASH_TABLE_ITERATOR_DONE = makeSymbol("SBHL-HASH-TABLE-ITERATOR-DONE");

    private static final SubLSymbol SBHL_ITERATOR_ITERATOR_DONE = makeSymbol("SBHL-ITERATOR-ITERATOR-DONE");

    private static final SubLSymbol SBHL_AVL_TREE_ITERATOR_DONE = makeSymbol("SBHL-AVL-TREE-ITERATOR-DONE");





    private static final SubLSymbol SBHL_TIME_DATE_LINK_ITERATOR_DONE = makeSymbol("SBHL-TIME-DATE-LINK-ITERATOR-DONE");

    private static final SubLSymbol SBHL_TIME_DATE_DATE_LINK_ITERATOR_DONE = makeSymbol("SBHL-TIME-DATE-DATE-LINK-ITERATOR-DONE");

    private static final SubLSymbol SBHL_TIME_DATE_LINK_TAG_ITERATOR_DONE = makeSymbol("SBHL-TIME-DATE-LINK-TAG-ITERATOR-DONE");

    private static final SubLSymbol SBHL_TIME_DATE_MT_LINK_ITERATOR_DONE = makeSymbol("SBHL-TIME-DATE-MT-LINK-ITERATOR-DONE");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_LIST_ITERATOR_NEXT = makeSymbol("SBHL-LIST-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_ALIST_ITERATOR_NEXT = makeSymbol("SBHL-ALIST-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_HASH_TABLE_ITERATOR_NEXT = makeSymbol("SBHL-HASH-TABLE-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_ITERATOR_ITERATOR_NEXT = makeSymbol("SBHL-ITERATOR-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_AVL_TREE_ITERATOR_NEXT = makeSymbol("SBHL-AVL-TREE-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_TIME_DATE_LINK_ITERATOR_NEXT = makeSymbol("SBHL-TIME-DATE-LINK-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_TIME_DATE_DATE_LINK_ITERATOR_NEXT = makeSymbol("SBHL-TIME-DATE-DATE-LINK-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_TIME_DATE_LINK_TAG_ITERATOR_NEXT = makeSymbol("SBHL-TIME-DATE-LINK-TAG-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_TIME_DATE_MT_LINK_ITERATOR_NEXT = makeSymbol("SBHL-TIME-DATE-MT-LINK-ITERATOR-NEXT");

    private static final SubLSymbol SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE");

    private static final SubLSymbol SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-FINALIZE");

    private static final SubLSymbol SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE");

    private static final SubLSymbol SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE");

    private static final SubLSymbol SBHL_ITERATOR_ITERATOR_FINALIZE = makeSymbol("SBHL-ITERATOR-ITERATOR-FINALIZE");

    private static final SubLSymbol SBHL_TIME_DATE_LINK_ITERATOR_FINALIZE = makeSymbol("SBHL-TIME-DATE-LINK-ITERATOR-FINALIZE");

    private static final SubLSymbol SBHL_TIME_DATE_DATE_LINK_ITERATOR_FINALIZE = makeSymbol("SBHL-TIME-DATE-DATE-LINK-ITERATOR-FINALIZE");

    private static final SubLSymbol SBHL_TIME_DATE_LINK_TAG_ITERATOR_FINALIZE = makeSymbol("SBHL-TIME-DATE-LINK-TAG-ITERATOR-FINALIZE");

    private static final SubLSymbol SBHL_TIME_DATE_MT_LINK_ITERATOR_FINALIZE = makeSymbol("SBHL-TIME-DATE-MT-LINK-ITERATOR-FINALIZE");

    private static final SubLList $list67 = list(list(makeSymbol("VAR"), makeSymbol("SBHL-ITERATOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list68 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym70$ITERATOR_VAR = makeUninternedSymbol("ITERATOR-VAR");

    private static final SubLSymbol DO_SBHL_ITERATOR = makeSymbol("DO-SBHL-ITERATOR");

    private static final SubLSymbol $sym72$DONE_VAR = makeUninternedSymbol("DONE-VAR");



    private static final SubLSymbol SBHL_ITERATION_NEXT = makeSymbol("SBHL-ITERATION-NEXT");









    public static final SubLList $list79 = list(list(makeSymbol("VAR"), makeSymbol("N"), makeSymbol("SBHL-ITERATOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym80$COUNT = makeUninternedSymbol("COUNT");

    private static final SubLSymbol $sym81$NEW_DONE = makeUninternedSymbol("NEW-DONE");

    private static final SubLList $list82 = list(ZERO_INTEGER);

    private static final SubLSymbol $sym83$__ = makeSymbol(">=");





    private static final SubLList $list86 = list(T);





    public static SubLObject within_sbhl_iterator_resourcingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_datastructures.sbhl_stack_p($sbhl_iterator_store$.getDynamicValue(thread));
    }

    public static SubLObject with_sbhl_iterator_resourcing(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    public static SubLObject find_or_create_sbhl_iterator_shell() {
        final SubLObject iterator_shell = find_sbhl_iterator_shell();
        return NIL != iterator_shell ? iterator_shell : make_sbhl_iterator(UNPROVIDED);
    }

    public static SubLObject find_sbhl_iterator_shell() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != within_sbhl_iterator_resourcingP() ? sbhl_search_datastructures.sbhl_stack_pop($sbhl_iterator_store$.getDynamicValue(thread)) : NIL;
    }

    public static SubLObject release_sbhl_iterator(final SubLObject sbhl_iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != within_sbhl_iterator_resourcingP()) && ((!$sbhl_iterator_store_max$.getGlobalValue().isInteger()) || (!sbhl_search_datastructures.sbhl_stack_size($sbhl_iterator_store$.getDynamicValue(thread)).numGE($sbhl_iterator_store_max$.getGlobalValue())))) {
            sbhl_search_datastructures.sbhl_stack_push(sbhl_iterator, $sbhl_iterator_store$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject sbhl_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sbhl_iterator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sbhl_iterator_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sbhl_iterator_native.class ? T : NIL;
    }

    public static SubLObject sbhl_it_state(final SubLObject v_object) {
        assert NIL != sbhl_iterator_p(v_object) : "sbhl_iteration.sbhl_iterator_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sbhl_it_done(final SubLObject v_object) {
        assert NIL != sbhl_iterator_p(v_object) : "sbhl_iteration.sbhl_iterator_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sbhl_it_next(final SubLObject v_object) {
        assert NIL != sbhl_iterator_p(v_object) : "sbhl_iteration.sbhl_iterator_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sbhl_it_finalize(final SubLObject v_object) {
        assert NIL != sbhl_iterator_p(v_object) : "sbhl_iteration.sbhl_iterator_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_sbhl_it_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_iterator_p(v_object) : "sbhl_iteration.sbhl_iterator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sbhl_it_done(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_iterator_p(v_object) : "sbhl_iteration.sbhl_iterator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sbhl_it_next(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_iterator_p(v_object) : "sbhl_iteration.sbhl_iterator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sbhl_it_finalize(final SubLObject v_object, final SubLObject value) {
        assert NIL != sbhl_iterator_p(v_object) : "sbhl_iteration.sbhl_iterator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_sbhl_iterator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sbhl_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STATE)) {
                _csetf_sbhl_it_state(v_new, current_value);
            } else
                if (pcase_var.eql($DONE)) {
                    _csetf_sbhl_it_done(v_new, current_value);
                } else
                    if (pcase_var.eql($NEXT)) {
                        _csetf_sbhl_it_next(v_new, current_value);
                    } else
                        if (pcase_var.eql($FINALIZE)) {
                            _csetf_sbhl_it_finalize(v_new, current_value);
                        } else {
                            Errors.error($str23$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sbhl_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SBHL_ITERATOR, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STATE, sbhl_it_state(obj));
        funcall(visitor_fn, obj, $SLOT, $DONE, sbhl_it_done(obj));
        funcall(visitor_fn, obj, $SLOT, $NEXT, sbhl_it_next(obj));
        funcall(visitor_fn, obj, $SLOT, $FINALIZE, sbhl_it_finalize(obj));
        funcall(visitor_fn, obj, $END, MAKE_SBHL_ITERATOR, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sbhl_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sbhl_iterator(obj, visitor_fn);
    }

    public static SubLObject print_sbhl_iterator(final SubLObject iterator, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(iterator, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, iterator, T, T);
            if (NIL != sbhl_iteration_doneP(iterator)) {
                write_string($$$_DONE, stream, UNPROVIDED, UNPROVIDED);
            }
            print_macros.print_unreadable_object_postamble(stream, iterator, T, T);
        }
        return iterator;
    }

    public static SubLObject new_sbhl_iterator(final SubLObject state, final SubLObject done, final SubLObject next, final SubLObject finalize) {
        final SubLObject sbhl_iterator = find_or_create_sbhl_iterator_shell();
        _csetf_sbhl_it_state(sbhl_iterator, state);
        _csetf_sbhl_it_done(sbhl_iterator, done);
        _csetf_sbhl_it_next(sbhl_iterator, next);
        _csetf_sbhl_it_finalize(sbhl_iterator, finalize);
        return sbhl_iterator;
    }

    public static SubLObject sbhl_iteration_doneP(final SubLObject sbhl_iterator) {
        final SubLObject pcase_var = sbhl_it_done(sbhl_iterator);
        if (pcase_var.eql(SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_DONE)) {
            return sbhl_link_iterators.sbhl_link_node_search_state_iterator_done(sbhl_it_state(sbhl_iterator));
        }
        if (pcase_var.eql(SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_DONE)) {
            return sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_done(sbhl_it_state(sbhl_iterator));
        }
        if (pcase_var.eql(SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_DONE)) {
            return sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_done(sbhl_it_state(sbhl_iterator));
        }
        if (pcase_var.eql(SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_DONE)) {
            return sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_done(sbhl_it_state(sbhl_iterator));
        }
        if (pcase_var.eql(SBHL_LIST_ITERATOR_DONE)) {
            return sbhl_list_iterator_done(sbhl_it_state(sbhl_iterator));
        }
        if (pcase_var.eql(SBHL_ALIST_ITERATOR_DONE)) {
            return sbhl_alist_iterator_done(sbhl_it_state(sbhl_iterator));
        }
        if (pcase_var.eql(SBHL_HASH_TABLE_ITERATOR_DONE)) {
            return sbhl_hash_table_iterator_done(sbhl_it_state(sbhl_iterator));
        }
        if (pcase_var.eql(SBHL_ITERATOR_ITERATOR_DONE)) {
            return sbhl_iterator_iterator_done(sbhl_it_state(sbhl_iterator));
        }
        if (pcase_var.eql(SBHL_AVL_TREE_ITERATOR_DONE)) {
            return binary_tree.sbhl_avl_tree_iterator_done(sbhl_it_state(sbhl_iterator));
        }
        if (pcase_var.eql(TRUE)) {
            return T;
        }
        if (pcase_var.eql(FALSE)) {
            return NIL;
        }
        final SubLObject pcase_var_$1 = sbhl_it_done(sbhl_iterator);
        if (pcase_var_$1.eql(SBHL_TIME_DATE_LINK_ITERATOR_DONE)) {
            return sbhl_time_dates.sbhl_time_date_link_iterator_done(sbhl_it_state(sbhl_iterator));
        }
        if (pcase_var_$1.eql(SBHL_TIME_DATE_DATE_LINK_ITERATOR_DONE)) {
            return sbhl_time_dates.sbhl_time_date_date_link_iterator_done(sbhl_it_state(sbhl_iterator));
        }
        if (pcase_var_$1.eql(SBHL_TIME_DATE_LINK_TAG_ITERATOR_DONE)) {
            return sbhl_time_dates.sbhl_time_date_link_tag_iterator_done(sbhl_it_state(sbhl_iterator));
        }
        if (pcase_var_$1.eql(SBHL_TIME_DATE_MT_LINK_ITERATOR_DONE)) {
            return sbhl_time_dates.sbhl_time_date_mt_link_iterator_done(sbhl_it_state(sbhl_iterator));
        }
        return funcall(sbhl_it_done(sbhl_iterator), sbhl_it_state(sbhl_iterator));
    }

    public static SubLObject sbhl_iteration_next(final SubLObject sbhl_iterator) {
        SubLObject result = NIL;
        final SubLObject pcase_var = sbhl_it_next(sbhl_iterator);
        if (pcase_var.eql(SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT)) {
            result = sbhl_link_iterators.sbhl_link_node_search_state_iterator_next(sbhl_it_state(sbhl_iterator));
        } else
            if (pcase_var.eql(SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_NEXT)) {
                result = sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_next(sbhl_it_state(sbhl_iterator));
            } else
                if (pcase_var.eql(SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT)) {
                    result = sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_next(sbhl_it_state(sbhl_iterator));
                } else
                    if (pcase_var.eql(SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT)) {
                        result = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_next(sbhl_it_state(sbhl_iterator));
                    } else
                        if (pcase_var.eql(SBHL_LIST_ITERATOR_NEXT)) {
                            result = sbhl_list_iterator_next(sbhl_it_state(sbhl_iterator));
                        } else
                            if (pcase_var.eql(SBHL_ALIST_ITERATOR_NEXT)) {
                                result = sbhl_alist_iterator_next(sbhl_it_state(sbhl_iterator));
                            } else
                                if (pcase_var.eql(SBHL_HASH_TABLE_ITERATOR_NEXT)) {
                                    result = sbhl_hash_table_iterator_next(sbhl_it_state(sbhl_iterator));
                                } else
                                    if (pcase_var.eql(SBHL_ITERATOR_ITERATOR_NEXT)) {
                                        result = sbhl_iterator_iterator_next(sbhl_it_state(sbhl_iterator));
                                    } else
                                        if (pcase_var.eql(SBHL_AVL_TREE_ITERATOR_NEXT)) {
                                            result = binary_tree.sbhl_avl_tree_iterator_next(sbhl_it_state(sbhl_iterator));
                                        } else
                                            if (pcase_var.eql(FALSE)) {
                                                result = NIL;
                                            } else {
                                                final SubLObject pcase_var_$2 = sbhl_it_next(sbhl_iterator);
                                                if (pcase_var_$2.eql(SBHL_TIME_DATE_LINK_ITERATOR_NEXT)) {
                                                    result = sbhl_time_dates.sbhl_time_date_link_iterator_next(sbhl_it_state(sbhl_iterator));
                                                } else
                                                    if (pcase_var_$2.eql(SBHL_TIME_DATE_DATE_LINK_ITERATOR_NEXT)) {
                                                        result = sbhl_time_dates.sbhl_time_date_date_link_iterator_next(sbhl_it_state(sbhl_iterator));
                                                    } else
                                                        if (pcase_var_$2.eql(SBHL_TIME_DATE_LINK_TAG_ITERATOR_NEXT)) {
                                                            result = sbhl_time_dates.sbhl_time_date_link_tag_iterator_next(sbhl_it_state(sbhl_iterator));
                                                        } else
                                                            if (pcase_var_$2.eql(SBHL_TIME_DATE_MT_LINK_ITERATOR_NEXT)) {
                                                                result = sbhl_time_dates.sbhl_time_date_mt_link_iterator_next(sbhl_it_state(sbhl_iterator));
                                                            }



                                                if (NIL == result) {
                                                    result = funcall(sbhl_it_next(sbhl_iterator), sbhl_it_state(sbhl_iterator));
                                                }
                                            }









        if (NIL == result) {
            _csetf_sbhl_it_done(sbhl_iterator, TRUE);
        }
        return result;
    }

    public static SubLObject sbhl_iteration_finalize(final SubLObject sbhl_iterator) {
        SubLObject result = NIL;
        final SubLObject pcase_var = sbhl_it_finalize(sbhl_iterator);
        if (pcase_var.eql(SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE)) {
            result = sbhl_link_iterators.sbhl_link_node_search_state_iterator_finalize(sbhl_it_state(sbhl_iterator));
        } else
            if (pcase_var.eql(SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_FINALIZE)) {
                result = sbhl_link_iterators.sbhl_module_direction_link_search_state_iterator_finalize(sbhl_it_state(sbhl_iterator));
            } else
                if (pcase_var.eql(SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE)) {
                    result = sbhl_link_iterators.sbhl_module_tv_link_node_search_state_iterator_finalize(sbhl_it_state(sbhl_iterator));
                } else
                    if (pcase_var.eql(SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE)) {
                        result = sbhl_link_iterators.sbhl_module_naut_link_node_search_state_iterator_finalize(sbhl_it_state(sbhl_iterator));
                    } else
                        if (pcase_var.eql(SBHL_ITERATOR_ITERATOR_FINALIZE)) {
                            result = sbhl_iterator_iterator_finalize(sbhl_it_state(sbhl_iterator));
                        } else
                            if (pcase_var.eql(TRUE)) {
                                result = T;
                            } else {
                                SubLObject handledP = NIL;
                                handledP = T;
                                final SubLObject pcase_var_$3 = sbhl_it_finalize(sbhl_iterator);
                                if (pcase_var_$3.eql(SBHL_TIME_DATE_LINK_ITERATOR_FINALIZE)) {
                                    result = sbhl_time_dates.sbhl_time_date_link_iterator_finalize(sbhl_it_state(sbhl_iterator));
                                } else
                                    if (pcase_var_$3.eql(SBHL_TIME_DATE_DATE_LINK_ITERATOR_FINALIZE)) {
                                        result = sbhl_time_dates.sbhl_time_date_date_link_iterator_finalize(sbhl_it_state(sbhl_iterator));
                                    } else
                                        if (pcase_var_$3.eql(SBHL_TIME_DATE_LINK_TAG_ITERATOR_FINALIZE)) {
                                            result = sbhl_time_dates.sbhl_time_date_link_tag_iterator_finalize(sbhl_it_state(sbhl_iterator));
                                        } else
                                            if (pcase_var_$3.eql(SBHL_TIME_DATE_MT_LINK_ITERATOR_FINALIZE)) {
                                                result = sbhl_time_dates.sbhl_time_date_mt_link_iterator_finalize(sbhl_it_state(sbhl_iterator));
                                            } else {
                                                handledP = NIL;
                                            }



                                if (NIL == handledP) {
                                    result = funcall(sbhl_it_finalize(sbhl_iterator), sbhl_it_state(sbhl_iterator));
                                }
                            }





        release_sbhl_iterator(sbhl_iterator);
        return result;
    }

    public static SubLObject do_sbhl_iterator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject sbhl_iterator = NIL;
        destructuring_bind_must_consp(current, datum, $list67);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        sbhl_iterator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list67);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list67);
            if (NIL == member(current_$4, $list68, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list67);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (!sbhl_iterator.isSymbol()) {
            final SubLObject iterator_var = $sym70$ITERATOR_VAR;
            return list(CLET, list(list(iterator_var, sbhl_iterator)), listS(DO_SBHL_ITERATOR, list(var, iterator_var, $DONE, done), append(body, NIL)));
        }
        final SubLObject done_var = $sym72$DONE_VAR;
        return list(CLET, list(list(done_var, done)), list(UNTIL, done_var, list(CLET, list(list(var, list(SBHL_ITERATION_NEXT, sbhl_iterator))), listS(PWHEN, var, append(body, NIL)), list(CSETQ, done_var, NIL != done ? list(COR, list(NULL, var), done) : list(NULL, var)))));
    }

    public static SubLObject do_n_sbhl_iterator_objects(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject n = NIL;
        SubLObject sbhl_iterator = NIL;
        destructuring_bind_must_consp(current, datum, $list79);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        n = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        sbhl_iterator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list79);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list79);
            if (NIL == member(current_$5, $list68, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list79);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject count = $sym80$COUNT;
        final SubLObject new_done = $sym81$NEW_DONE;
        return list(CLET, list(bq_cons(count, $list82), list(new_done, list(COR, done, list($sym83$__, count, n)))), list(DO_SBHL_ITERATOR, list(var, sbhl_iterator, $DONE, new_done), bq_cons(PROGN, append(body, list(list(CINC, count), list(PWHEN, list(COR, done, list($sym83$__, count, n)), listS(CSETQ, new_done, $list86)))))));
    }

    public static SubLObject new_sbhl_null_iterator() {
        if (NIL == $sbhl_null_iterator$.getGlobalValue()) {
            $sbhl_null_iterator$.setGlobalValue(new_sbhl_iterator(NIL, TRUE, FALSE, TRUE));
        }
        return $sbhl_null_iterator$.getGlobalValue();
    }

    public static SubLObject sbhl_null_iterator_p(final SubLObject v_object) {
        return eq(v_object, $sbhl_null_iterator$.getGlobalValue());
    }

    public static SubLObject new_sbhl_list_iterator(final SubLObject list) {
        return new_sbhl_iterator(make_vector(ONE_INTEGER, list), SBHL_LIST_ITERATOR_DONE, SBHL_LIST_ITERATOR_NEXT, TRUE);
    }

    public static SubLObject sbhl_list_iterator_done(final SubLObject state) {
        return sublisp_null(aref(state, ZERO_INTEGER));
    }

    public static SubLObject sbhl_list_iterator_next(final SubLObject state) {
        final SubLObject list = aref(state, ZERO_INTEGER);
        set_aref(state, ZERO_INTEGER, list.rest());
        return list.first();
    }

    public static SubLObject new_sbhl_alist_iterator(final SubLObject alist) {
        return new_sbhl_iterator(make_vector(ONE_INTEGER, alist), SBHL_ALIST_ITERATOR_DONE, SBHL_ALIST_ITERATOR_NEXT, TRUE);
    }

    public static SubLObject sbhl_alist_iterator_done(final SubLObject state) {
        return sublisp_null(aref(state, ZERO_INTEGER));
    }

    public static SubLObject sbhl_alist_iterator_next(final SubLObject state) {
        final SubLObject alist = aref(state, ZERO_INTEGER);
        set_aref(state, ZERO_INTEGER, alist.rest());
        if (NIL != alist.first()) {
            return list(caar(alist), cdar(alist));
        }
        return NIL;
    }

    public static SubLObject new_sbhl_hash_table_iterator(final SubLObject hash_table) {
        return new_sbhl_iterator(make_sbhl_hash_table_iterator_state(hash_table), SBHL_HASH_TABLE_ITERATOR_DONE, SBHL_HASH_TABLE_ITERATOR_NEXT, TRUE);
    }

    public static SubLObject sbhl_hash_table_iterator_done(final SubLObject state) {
        return sublisp_null(aref(state, ZERO_INTEGER));
    }

    public static SubLObject sbhl_hash_table_iterator_next(final SubLObject state) {
        final SubLObject keys = aref(state, ZERO_INTEGER);
        final SubLObject key = keys.first();
        set_aref(state, ZERO_INTEGER, keys.rest());
        return NIL != key ? list(key, gethash(key, aref(state, ONE_INTEGER), UNPROVIDED)) : NIL;
    }

    public static SubLObject make_sbhl_hash_table_iterator_state(final SubLObject hash_table) {
        final SubLObject state = make_vector(TWO_INTEGER, NIL);
        set_aref(state, ZERO_INTEGER, hash_table_utilities.hash_table_keys(hash_table));
        set_aref(state, ONE_INTEGER, hash_table);
        return state;
    }

    public static SubLObject new_sbhl_dictionary_iterator(final SubLObject v_dictionary) {
        final SubLObject database = dictionary.dictionary_contents(v_dictionary);
        final SubLObject pcase_var = dictionary.dictionary_style(v_dictionary);
        if (pcase_var.eql($ALIST)) {
            return new_sbhl_alist_iterator(database);
        }
        if (pcase_var.eql($HASHTABLE)) {
            return new_sbhl_hash_table_iterator(database);
        }
        return dictionary.dictionary_style_error(v_dictionary);
    }

    public static SubLObject new_sbhl_iterator_iterator(final SubLObject iterators) {
        final SubLObject state = make_vector(ONE_INTEGER, UNPROVIDED);
        set_aref(state, ZERO_INTEGER, iterators);
        return new_sbhl_iterator(state, SBHL_ITERATOR_ITERATOR_DONE, SBHL_ITERATOR_ITERATOR_NEXT, SBHL_ITERATOR_ITERATOR_FINALIZE);
    }

    public static SubLObject sbhl_iterator_iterator_done(final SubLObject state) {
        return sublisp_null(aref(state, ZERO_INTEGER));
    }

    public static SubLObject sbhl_iterator_iterator_next(final SubLObject state) {
        SubLObject iterator = aref(state, ZERO_INTEGER).first();
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        while ((NIL == result) && (NIL == doneP)) {
            if (NIL == iterator) {
                doneP = T;
            } else
                if (NIL != sbhl_iteration_doneP(iterator)) {
                    sbhl_iteration_finalize(iterator);
                    set_aref(state, ZERO_INTEGER, aref(state, ZERO_INTEGER).rest());
                    iterator = aref(state, ZERO_INTEGER).first();
                } else {
                    result = sbhl_iteration_next(iterator);
                }

        } 
        return result;
    }

    public static SubLObject sbhl_iterator_iterator_finalize(final SubLObject state) {
        SubLObject cdolist_list_var = aref(state, ZERO_INTEGER);
        SubLObject iterator = NIL;
        iterator = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sbhl_iteration_finalize(iterator);
            cdolist_list_var = cdolist_list_var.rest();
            iterator = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject declare_sbhl_iteration_file() {
        declareFunction(me, "within_sbhl_iterator_resourcingP", "WITHIN-SBHL-ITERATOR-RESOURCING?", 0, 0, false);
        declareMacro(me, "with_sbhl_iterator_resourcing", "WITH-SBHL-ITERATOR-RESOURCING");
        declareFunction(me, "find_or_create_sbhl_iterator_shell", "FIND-OR-CREATE-SBHL-ITERATOR-SHELL", 0, 0, false);
        declareFunction(me, "find_sbhl_iterator_shell", "FIND-SBHL-ITERATOR-SHELL", 0, 0, false);
        declareFunction(me, "release_sbhl_iterator", "RELEASE-SBHL-ITERATOR", 1, 0, false);
        declareFunction(me, "sbhl_iterator_print_function_trampoline", "SBHL-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sbhl_iterator_p", "SBHL-ITERATOR-P", 1, 0, false);
        new sbhl_iteration.$sbhl_iterator_p$UnaryFunction();
        declareFunction(me, "sbhl_it_state", "SBHL-IT-STATE", 1, 0, false);
        declareFunction(me, "sbhl_it_done", "SBHL-IT-DONE", 1, 0, false);
        declareFunction(me, "sbhl_it_next", "SBHL-IT-NEXT", 1, 0, false);
        declareFunction(me, "sbhl_it_finalize", "SBHL-IT-FINALIZE", 1, 0, false);
        declareFunction(me, "_csetf_sbhl_it_state", "_CSETF-SBHL-IT-STATE", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_it_done", "_CSETF-SBHL-IT-DONE", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_it_next", "_CSETF-SBHL-IT-NEXT", 2, 0, false);
        declareFunction(me, "_csetf_sbhl_it_finalize", "_CSETF-SBHL-IT-FINALIZE", 2, 0, false);
        declareFunction(me, "make_sbhl_iterator", "MAKE-SBHL-ITERATOR", 0, 1, false);
        declareFunction(me, "visit_defstruct_sbhl_iterator", "VISIT-DEFSTRUCT-SBHL-ITERATOR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sbhl_iterator_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-ITERATOR-METHOD", 2, 0, false);
        declareFunction(me, "print_sbhl_iterator", "PRINT-SBHL-ITERATOR", 3, 0, false);
        declareFunction(me, "new_sbhl_iterator", "NEW-SBHL-ITERATOR", 4, 0, false);
        declareFunction(me, "sbhl_iteration_doneP", "SBHL-ITERATION-DONE?", 1, 0, false);
        declareFunction(me, "sbhl_iteration_next", "SBHL-ITERATION-NEXT", 1, 0, false);
        declareFunction(me, "sbhl_iteration_finalize", "SBHL-ITERATION-FINALIZE", 1, 0, false);
        declareMacro(me, "do_sbhl_iterator", "DO-SBHL-ITERATOR");
        declareMacro(me, "do_n_sbhl_iterator_objects", "DO-N-SBHL-ITERATOR-OBJECTS");
        declareFunction(me, "new_sbhl_null_iterator", "NEW-SBHL-NULL-ITERATOR", 0, 0, false);
        declareFunction(me, "sbhl_null_iterator_p", "SBHL-NULL-ITERATOR-P", 1, 0, false);
        declareFunction(me, "new_sbhl_list_iterator", "NEW-SBHL-LIST-ITERATOR", 1, 0, false);
        declareFunction(me, "sbhl_list_iterator_done", "SBHL-LIST-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "sbhl_list_iterator_next", "SBHL-LIST-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "new_sbhl_alist_iterator", "NEW-SBHL-ALIST-ITERATOR", 1, 0, false);
        declareFunction(me, "sbhl_alist_iterator_done", "SBHL-ALIST-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "sbhl_alist_iterator_next", "SBHL-ALIST-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "new_sbhl_hash_table_iterator", "NEW-SBHL-HASH-TABLE-ITERATOR", 1, 0, false);
        declareFunction(me, "sbhl_hash_table_iterator_done", "SBHL-HASH-TABLE-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "sbhl_hash_table_iterator_next", "SBHL-HASH-TABLE-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "make_sbhl_hash_table_iterator_state", "MAKE-SBHL-HASH-TABLE-ITERATOR-STATE", 1, 0, false);
        declareFunction(me, "new_sbhl_dictionary_iterator", "NEW-SBHL-DICTIONARY-ITERATOR", 1, 0, false);
        declareFunction(me, "new_sbhl_iterator_iterator", "NEW-SBHL-ITERATOR-ITERATOR", 1, 0, false);
        declareFunction(me, "sbhl_iterator_iterator_done", "SBHL-ITERATOR-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "sbhl_iterator_iterator_next", "SBHL-ITERATOR-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "sbhl_iterator_iterator_finalize", "SBHL-ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_iteration_file() {
        defparameter("*SBHL-ITERATOR-STORE*", NIL);
        deflexical("*SBHL-ITERATOR-STORE-MAX*", TEN_INTEGER);
        defconstant("*DTP-SBHL-ITERATOR*", SBHL_ITERATOR);
        deflexical("*SBHL-NULL-ITERATOR*", NIL);
        return NIL;
    }

    public static SubLObject setup_sbhl_iteration_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sbhl_iterator$.getGlobalValue(), symbol_function(SBHL_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list10);
        def_csetf(SBHL_IT_STATE, _CSETF_SBHL_IT_STATE);
        def_csetf(SBHL_IT_DONE, _CSETF_SBHL_IT_DONE);
        def_csetf(SBHL_IT_NEXT, _CSETF_SBHL_IT_NEXT);
        def_csetf(SBHL_IT_FINALIZE, _CSETF_SBHL_IT_FINALIZE);
        identity(SBHL_ITERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sbhl_iterator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SBHL_ITERATOR_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_iteration_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_iteration_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_iteration_file();
    }

    

    public static final class $sbhl_iterator_native extends SubLStructNative {
        public SubLObject $state;

        public SubLObject $done;

        public SubLObject $next;

        public SubLObject $finalize;

        private static final SubLStructDeclNative structDecl;

        private $sbhl_iterator_native() {
            this.$state = Lisp.NIL;
            this.$done = Lisp.NIL;
            this.$next = Lisp.NIL;
            this.$finalize = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$state;
        }

        @Override
        public SubLObject getField3() {
            return this.$done;
        }

        @Override
        public SubLObject getField4() {
            return this.$next;
        }

        @Override
        public SubLObject getField5() {
            return this.$finalize;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$state = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$done = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$next = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$finalize = value;
        }

        static {
            structDecl = makeStructDeclNative($sbhl_iterator_native.class, SBHL_ITERATOR, SBHL_ITERATOR_P, $list4, $list5, new String[]{ "$state", "$done", "$next", "$finalize" }, $list6, $list7, PRINT_SBHL_ITERATOR);
        }
    }

    public static final class $sbhl_iterator_p$UnaryFunction extends UnaryFunction {
        public $sbhl_iterator_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-ITERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_iterator_p(arg1);
        }
    }
}

/**
 * Total time: 194 ms
 */
